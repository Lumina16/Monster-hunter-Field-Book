#!/usr/bin/env python3
"""Derive the native offline search catalogue and assets from the HTML source."""
import argparse, base64, hashlib, io, json, math, os, re, sqlite3, struct, subprocess, sys, wave
from pathlib import Path
from PIL import Image

ROOT = Path(__file__).resolve().parents[2]
parser = argparse.ArgumentParser()
parser.add_argument('--output', type=Path, required=True)
args = parser.parse_args()
out = args.output
out.mkdir(parents=True, exist_ok=True)
html = ROOT / 'Hunter_Field_Guide_World_Iceborne.html'
if not html.exists(): subprocess.run([sys.executable, str(ROOT/'build.py')], check=True)
document = html.read_text()
data = json.loads(re.search(r'<script type="application/json" id="guide-data">(.*?)</script>', document, re.S)[1])

def write_uri(uri, target):
    if not isinstance(uri, str) or not uri.startswith('data:'): return ''
    header, payload = uri.split(',', 1)
    target.parent.mkdir(parents=True, exist_ok=True)
    target.write_bytes(base64.b64decode(payload) if ';base64' in header else payload.encode())
    return target.relative_to(out).as_posix()

def render_svg_png(raw, target, size=128):
    target.parent.mkdir(parents=True, exist_ok=True)
    try:
        import cairosvg
        cairosvg.svg2png(bytestring=raw, write_to=str(target), output_width=size, output_height=size)
    except (ModuleNotFoundError, OSError):
        node = os.environ.get('CODEX_PRIMARY_RUNTIME_NODE', 'node')
        javascript = f"const sharp=require(require.resolve('sharp',{{paths:[process.env.CODEX_PRIMARY_RUNTIME_NODE_MODULES||process.cwd()]}}));let data=[];process.stdin.on('data',x=>data.push(x));process.stdin.on('end',()=>sharp(Buffer.concat(data)).resize({size},{size}).png().toFile(process.argv[1]).catch(e=>{{console.error(e.message);process.exit(1)}}));"
        subprocess.run([node, '-e', javascript, str(target)], input=raw, check=True, stderr=subprocess.PIPE)

reference_artwork = {
    key: write_uri(uri, out / f'art/reference/{key}.webp')
    for key, uri in data.get('assets', {}).items()
}

for edition in ['world', 'iceborne']:
    info = data['editions'][edition]
    for role, key in [('hero', 'background'), ('logo', 'logo')]:
        write_uri(data['assets'][info[key]], out / f'art/{edition}-{role}.webp')
    write_uri(data['music'][edition]['data'], out / f'music/{edition}.mp3')

# Native Android uses actual TTF files rather than CSS font data URLs.
from fontTools.ttLib import TTFont
from fontTools.varLib.instancer import instantiateVariableFont
css = (ROOT / 'src/styles.css').read_text()
fonts = re.findall(r'@font-face\{(.*?)\}', css, re.S)
font_folder = out / 'fonts'
font_folder.mkdir(exist_ok=True)
for i, rule in enumerate(fonts):
    match = re.search(r'url\([\"\']?(data:[^)\"\']+)', rule)
    if not match: continue
    raw = base64.b64decode(match[1].split(',', 1)[1])
    if 'HunterDisplay' in rule:
        for weight, filename in [(400, 'title.ttf'), (700, 'title-bold.ttf')]:
            font = TTFont(io.BytesIO(raw)); font.flavor = None
            if 'fvar' in font:
                instantiateVariableFont(font, {'wght': weight}, inplace=True)
            font.save(font_folder / filename)
    else:
        font = TTFont(io.BytesIO(raw)); font.flavor = None
        font.save(font_folder / ('body.ttf' if i == 0 else 'body-bold.ttf'))

font_assets = {
    'body': 'fonts/body.ttf',
    'bodyBold': 'fonts/body-bold.ttf',
    'title': 'fonts/title.ttf',
    'titleBold': 'fonts/title-bold.ttf',
}

(out / 'credits.json').write_text(json.dumps({
    'fontLicense': data.get('fontLicense'),
    'sources': data.get('catalogueSources'),
    'databaseSources': data['database'].get('sources'),
    'databaseLicense': data['database'].get('license'),
    'iconLicense': data['visuals'].get('hdSource'),
    'visualSources': data['visuals'].get('sources'),
}, ensure_ascii=False))

dbpath = out / 'catalogue.next.db'
for obsolete in out.glob('catalogue*.db*'):
    obsolete.unlink()
db = sqlite3.connect(dbpath)
db.execute('PRAGMA journal_mode=OFF')
db.executescript('CREATE TABLE records(id TEXT PRIMARY KEY,kind TEXT,name TEXT,game TEXT,summary TEXT,image TEXT,payload TEXT); CREATE VIRTUAL TABLE names USING fts4(id,name,summary,tokenize=unicode61); CREATE INDEX record_kind ON records(kind); ALTER TABLE records ADD COLUMN raw_id TEXT; ALTER TABLE records ADD COLUMN category TEXT; ALTER TABLE records ADD COLUMN rarity INTEGER; ALTER TABLE records ADD COLUMN rank TEXT; ALTER TABLE records ADD COLUMN equipment_type TEXT; ALTER TABLE records ADD COLUMN ordinal INTEGER; ALTER TABLE records ADD COLUMN attack REAL; CREATE INDEX record_filter ON records(kind,category,game); CREATE INDEX record_raw_id ON records(raw_id); CREATE TABLE links(source TEXT,target TEXT,label TEXT,PRIMARY KEY(source,target,label)); CREATE INDEX link_target ON links(target);')

seen = set()
icon_cache = {}
def icon_image(key):
    if not key: return ''
    if key in icon_cache: return icon_cache[key]
    asset = data['visuals']['assets'].get(key, {})
    uri = asset.get('image', '')
    if not uri: return ''
    raw = base64.b64decode(uri.split(',', 1)[1])
    if 'svg' in uri[:70]:
        svg_target = out / f'art/icons/{key}.svg'
        svg_target.parent.mkdir(parents=True, exist_ok=True)
        svg_target.write_bytes(raw)
        target = out / f'art/icons/{key}.png'
        render_svg_png(raw, target, 128)
    else:
        ext = 'webp' if 'webp' in uri[:70] else 'png'
        target = out / f'art/icons/{key}.{ext}'
        target.parent.mkdir(parents=True, exist_ok=True)
        target.write_bytes(raw)
    icon_cache[key] = target.relative_to(out).as_posix()
    return icon_cache[key]

game_icons = {key: icon_image(key) for key in data['visuals']['assets']}

catalogue_glyph_cache = {}
def catalogue_glyph_image(key):
    if not key: return ''
    if key in catalogue_glyph_cache: return catalogue_glyph_cache[key]
    uri = data.get('catalogueIcons', {}).get(key, '')
    if not uri: return ''
    raw = base64.b64decode(uri.split(',', 1)[1])
    if 'svg' in uri[:70]:
        svg_target = out / f'art/catalogue/{key}.svg'
        svg_target.parent.mkdir(parents=True, exist_ok=True)
        svg_target.write_bytes(raw)
        target = out / f'art/catalogue/{key}.png'
        render_svg_png(raw, target, 128)
    else:
        ext = 'webp' if 'webp' in uri[:70] else 'png'
        target = out / f'art/catalogue/{key}.{ext}'
        target.parent.mkdir(parents=True, exist_ok=True)
        target.write_bytes(raw)
    catalogue_glyph_cache[key] = target.relative_to(out).as_posix()
    return catalogue_glyph_cache[key]

catalogue_glyphs = {key: catalogue_glyph_image(key) for key in data.get('catalogueIcons', {})}

tinted_glyph_cache = {}
def tinted_catalogue_glyph(key, tint):
    base_rel = catalogue_glyph_image(key)
    if not base_rel: return ''
    hex_code = 'd9b77a' if not tint or tint == 'accent' else tint.lstrip('#')
    cache_key = (key, hex_code)
    if cache_key in tinted_glyph_cache: return tinted_glyph_cache[cache_key]
    target = out / f'art/catalogue/{key}-{hex_code}.png'
    target.parent.mkdir(parents=True, exist_ok=True)
    img = Image.open(out / base_rel).convert('RGBA')
    r, g, b = int(hex_code[0:2], 16), int(hex_code[2:4], 16), int(hex_code[4:6], 16)
    tinted = Image.new('RGBA', img.size, (r, g, b, 255))
    tinted.putalpha(img.getchannel('A'))
    tinted.save(target, format='PNG')
    tinted_glyph_cache[cache_key] = target.relative_to(out).as_posix()
    return tinted_glyph_cache[cache_key]

def clean(value):
    # Keep every embedded image available to native profiles, maps and legends.
    if isinstance(value, str) and value.startswith('data:'):
        digest = hashlib.sha256(value.encode()).hexdigest()
        mime = value.split(';', 1)[0].split(':', 1)[1]
        ext = {'image/svg+xml': 'svg', 'image/png': 'png', 'image/jpeg': 'jpg', 'image/webp': 'webp', 'image/gif': 'gif'}.get(mime, 'bin')
        return write_uri(value, out / f'art/media/{digest}.{ext}')
    if isinstance(value, list): return [clean(v) for v in value]
    if isinstance(value, dict): return {k: clean(v) for k, v in value.items()}
    return value

item_visual_by_name = {
    str(name).casefold().strip(): key
    for name, key in data['visuals'].get('itemNames', {}).items()
}
item_category_by_name = {
    str(item.get('name') or '').casefold().strip(): str(item.get('category') or '')
    for item in data['database'].get('items', [])
    if item.get('name')
}

catalogue_record_visuals = {}
def resolve_catalogue_visual(record_key, collection, record):
    if record_key in catalogue_record_visuals:
        return catalogue_record_visuals[record_key]
    visual = data['visuals']
    part_raw = record.get('type') or record.get('part') or 'head'
    part = {'arms': 'arm', 'legs': 'leg'}.get(part_raw, part_raw)
    hd_key = f'armour-{part}' if collection == 'armours' else ('armour-set' if collection == 'armourSets' else ('charm' if collection == 'charms' else None))
    rarity = str(max(1, min(12, int(record.get('rarity') or 1))))
    vector = visual.get('hdArmour', {}).get(hd_key, {}).get(rarity) if hd_key else None
    if vector:
        entry = {'mode': 'image', 'image': icon_image(vector), 'sourceKey': vector}
    elif record.get('image'):
        entry = {'mode': 'image', 'image': clean(record['image'])}
    else:
        keys = {
            'armourSets': 'armour-set',
            'decorations': 'decoration-' + str(record.get('slot') or record.get('slotLevel') or 1),
            'skills': 'skill',
            'charms': 'charm',
            'kinsects': 'kinsect',
            'palicoEquipment': 'palico',
            'palicoGadgets': 'palico',
            'tools': 'mantle',
            'canteen': 'canteen',
            'foodSkills': 'canteen',
            'smallMonsters': 'small-monster',
            'endemicLife': 'endemic',
        }
        gkey = f'armour-{part}' if collection == 'armours' else ('booster' if collection == 'tools' and record.get('kind') == 'booster' else keys.get(collection, 'item'))
        tint = visual.get('rarityColours', {}).get(str(record.get('rarity')), '') or 'accent'
        entry = {'mode': 'glyph', 'image': tinted_catalogue_glyph(gkey, tint), 'glyphKey': gkey, 'tint': tint}
    catalogue_record_visuals[record_key] = entry
    return entry

def record_icon(key, kind, record, category=''):
    visual = data['visuals']
    rarity = str(max(1, min(12, int(record.get('rarity') or 1))))
    if kind == 'Weapons':
        return icon_image(visual['hdWeapons'].get(record.get('type'), {}).get(rarity))
    if kind in ('Equipment', 'Creatures'):
        return resolve_catalogue_visual(key, category, record)['image']
    if kind == 'Locales':
        return reference_artwork.get(f'locale-{record.get("id")}', '')
    if kind == 'Weapon Guides':
        return reference_artwork.get(f'weapon-{record.get("id")}', '')
    if kind in ('Items', 'Recipes'):
        name_key = str(record.get('name') or '').casefold().strip()
        item_cat = item_category_by_name.get(name_key) or str(record.get('category') or '')
        return icon_image(item_visual_by_name.get(name_key) or visual['categories'].get(item_cat) or visual.get('defaultItem'))
    return ''

all_records = []
assigned_images = {}
def add(kind, record, index=0, image='', collection=''):
    name = record.get('name') or record.get('title')
    if not name: return
    category = collection or str(record.get('category', ''))
    key = kind + ':' + category + ':' + str(record.get('id', index)) + ':' + name
    if key in seen: return
    seen.add(key)
    if record.get('iconKey') in data['visuals']['assets']:
        image = image or icon_image(record['iconKey'])
    if kind in ('Equipment', 'Creatures', 'Locales', 'Weapon Guides'):
        image = image or record_icon(key, kind, record, category)
    else:
        image = image or clean(record.get('image', '')) or record_icon(key, kind, record, category)
    game = record.get('game', 'both')
    summary = str(record.get('description') or record.get('summary') or record.get('class') or record.get('type') or record.get('category') or '')
    if kind == 'Weapons':
        summary = ' · '.join(filter(None, [record.get('type', '').replace('-', ' ').title(), 'Rarity ' + str(record.get('rarity', '')), 'Attack ' + str(record.get('attack', ''))] + [e.get('type', '') + ' ' + str(e.get('value', '')) for e in record.get('elements', [])]))
    payload = clean(record)
    db.execute('INSERT INTO records VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)', (key, kind, name, game, summary[:600], image, json.dumps(payload, ensure_ascii=False, separators=(',', ':')), str(record.get('id', index)), category, record.get('rarity', 0), str(record.get('rank') or ''), str(record.get('type') or ''), len(all_records), record.get('attack', 0)))
    all_records.append((key, kind, payload))
    assigned_images[key] = image
    def keywords(value):
        if isinstance(value, list): return ' '.join(keywords(v) for v in value)
        if isinstance(value, dict): return ' '.join(str(v) if k in ['name', 'type', 'family', 'setName'] else keywords(v) for k, v in value.items())
        return ''
    db.execute('INSERT INTO names VALUES (?,?,?)', (key, name, summary[:600] + ' ' + keywords(record)))

for i, monster in enumerate(data['monsters']):
    image = write_uri(monster.get('image'), out / f'art/monsters/{monster["id"]}.webp')
    combined = dict(monster); combined['database'] = data['database']['monsters'].get(monster['id'], {})
    add('Monsters', combined, i, image)
for key, kind in [('weapons', 'Weapons'), ('items', 'Items'), ('quests', 'Quests')]:
    for i, record in enumerate(data['database'][key]): add(kind, record, i)
for i, record in enumerate(data['database']['recipes']):
    summary = ('Elder Melder' if record.get('method') != 'craft' else 'Crafting') + ' · ' + ', '.join(v.get('name', '') for v in record.get('ingredients', []))
    add('Recipes', dict(record, description=summary), i)
for key, records in data['catalogues'].items():
    for i, record in enumerate(records):
        add('Equipment' if key not in ['smallMonsters', 'endemicLife'] else 'Creatures', record, i, collection=key)
for key, kind in [('guides', 'Field Notes'), ('locales', 'Locales')]:
    for i, record in enumerate(data[key]): add(kind, record, i)
for key, kind in [('weapons', 'Weapon Guides'), ('builds', 'Builds'), ('items', 'Preparation'), ('atlasMaps', 'Maps'), ('baseDirectories', 'Maps')]:
    for i, record in enumerate(data[key]): add(kind, record, i)

# Resolve explicit IDs and named materials/skills to native records. Keep reverse
# links so a material can show recipes, rewards and equipment that use it.
from collections import defaultdict
def norm_name(value):
    return str(value or '').replace('’', "'").casefold().strip()

by_id = defaultdict(list); by_name = defaultdict(list)
for key, kind, record in all_records:
    by_id[str(record.get('id', ''))].append((key, kind))
    by_name[norm_name(record.get('name') or record.get('title') or '')].append((key, kind))
links = set()
def add_link(source, target, label):
    if source != target: links.add((source, target, label))
def walk_links(source, value, field='', root=False):
    if isinstance(value, dict):
        for key, v in value.items():
            if key in ('source', 'sources', 'image', 'thumbnail', 'artUrl', 'artSource', 'url', 'path'): continue
            if key in ('name', 'item', 'monster', 'locale') and isinstance(v, str) and not (root and key == 'name'):
                allowed = {'item': ('Items',), 'monster': ('Monsters',), 'locale': ('Locales',)}.get(key)
                for target, kind in by_name.get(norm_name(v), []):
                    if (allowed and kind in allowed) or (not allowed and kind not in ('Recipes', 'Preparation')):
                        add_link(source, target, 'Referenced records'); add_link(target, source, 'Used in / related')
            elif key in ('parent', 'previous', 'setId', 'questId', 'monsterId', 'itemId', 'baseId', 'upgradeId', 'localeId', 'id') and isinstance(v, (str, int)) and not (root and key == 'id'):
                for target, kind in by_id.get(str(v), []):
                    label = {'parent': 'Previous upgrade', 'previous': 'Previous upgrade', 'setId': 'Armour set', 'questId': 'Quest', 'monsterId': 'Monster', 'baseId': 'Base tool', 'upgradeId': 'Next upgrade', 'localeId': 'Locale'}.get(key, 'Referenced records')
                    add_link(source, target, label)
                    add_link(target, source, 'Upgrades to' if key in ('parent', 'previous') else 'Used in / related')
            walk_links(source, v, key)
    elif isinstance(value, list):
        for v in value:
            if isinstance(v, str):
                matches = by_id.get(v, []) if field in ('pieces', 'questIds') else by_name.get(norm_name(v), [])
                for target, kind in matches:
                    if kind not in ('Recipes', 'Preparation'):
                        add_link(source, target, 'Referenced records'); add_link(target, source, 'Used in / related')
            else: walk_links(source, v, field)
for key, kind, record in all_records: walk_links(key, record, root=True)
for key, kind, record in all_records:
    if kind == 'Recipes':
        for target, target_kind in by_name.get(norm_name(record.get('name', '')), []):
            if target_kind == 'Items': add_link(target, key, 'Recipes'); add_link(key, target, 'Result item')
db.executemany('INSERT OR IGNORE INTO links VALUES (?,?,?)', sorted(links))
db.commit(); db.execute('VACUUM')
assert db.execute('PRAGMA integrity_check').fetchone()[0] == 'ok'
db.close(); dbpath.replace(out / 'catalogue.db')

slot_icons = {str(level): tinted_catalogue_glyph(f'slot-{level}', 'accent') for level in range(1, 5)}
weapon_types = {
    w['id']: {
        'typeId': w['id'],
        'handbookImage': reference_artwork[f'weapon-{w["id"]}'],
        'rarityIcons': {
            str(rarity): icon_image(data['visuals']['hdWeapons'][w['id']][str(rarity)])
            for rarity in range(1, 13)
        },
    }
    for w in data['weapons']
}
locale_artwork = {
    loc['id']: reference_artwork[f'locale-{loc["id"]}']
    for loc in data['locales']
}
required_kinds = {'Monsters', 'Weapons', 'Items', 'Recipes', 'Equipment', 'Creatures', 'Locales', 'Weapon Guides'}
required_records = [key for key, kind, _ in all_records if kind in required_kinds]
missing_assignments = [key for key in required_records if not assigned_images.get(key) or not (out / assigned_images[key]).is_file()]
assert not missing_assignments, f'Missing required record images: {missing_assignments[:10]}'

metadata = {key: clean(data[key]) for key in ['speedrun', 'progress', 'checklist', 'catalogueCoverage', 'catalogueSources', 'referenceNames']}
metadata['rarityColours'] = data['visuals']['rarityColours']
metadata['effectNames'] = {v: k for k, v in data['visuals']['effects'].items()}
metadata['legend'] = {key: icon_image(key) for key in data['visuals']['assets'] if key.startswith(('status-', 'element-', 'gem-', 'slot-', 'weapon-type-', 'armour-', 'hd-gem', 'hd-armour'))}
metadata['legendEquipment'] = {family: {rarity: icon_image(key) for rarity, key in values.items()} for family, values in data['visuals']['hdArmour'].items()}
metadata['legendSlots'] = slot_icons
metadata['weaponTypeIds'] = {w['id']: w['id'] for w in data['weapons']}
metadata['nativeVisuals'] = {
    'weaponTypes': weapon_types,
    'catalogueGlyphs': catalogue_glyphs,
    'gameIcons': game_icons,
    'catalogueRecords': catalogue_record_visuals,
    'effects': {name: icon_image(key) for name, key in data['visuals']['effects'].items()},
    'slots': slot_icons,
    'fonts': font_assets,
    'localeArtwork': locale_artwork,
    'referenceArtwork': reference_artwork,
}
metadata['assetAudit'] = {
    'requiredAssignments': len(required_records),
    'missingAssignments': missing_assignments,
    'fonts': font_assets,
    'handbookArt': len(weapon_types),
    'catalogueGlyphs': len(catalogue_glyphs),
    'source': 'Final weaponVisual/catalogueVisual/itemVisual/weaponSigil functions in src/app.js',
}
(out / 'library.json').write_text(json.dumps(metadata, ensure_ascii=False, separators=(',', ':')))

# A short original crystal chime, generated locally; media stream controls volume.
rate = 44100; duration = 2.4
with wave.open(str(out / 'music/formation.wav'), 'wb') as wav:
    wav.setparams((1, 2, rate, 0, 'NONE', 'not compressed'))
    for i in range(int(rate * duration)):
        t = i / rate; value = 0
        for start, freq in [(0, 523.25), (.19, 783.99), (.4, 1046.5), (.65, 1567.98), (.95, 2093)]:
            u = t - start
            if u >= 0: value += math.sin(2 * math.pi * freq * u) * math.exp(-u * 4) * min(1, u * 80) * .16
        wav.writeframesraw(struct.pack('<h', max(-32767, min(32767, int(value * 21000)))))
(out / 'manifest.json').write_text(json.dumps({
    'records': len(seen),
    'sourceSha256': hashlib.sha256(html.read_bytes()).hexdigest(),
    'version': '0.3.0-review',
    'links': len(links),
    'kinds': {kind: sum(1 for r in all_records if r[1] == kind) for kind in sorted(set(r[1] for r in all_records))},
    'editions': data['editions'],
}, ensure_ascii=False, indent=2))
print(f'Native assets: {len(seen)} searchable records; {sum(p.stat().st_size for p in out.rglob("*") if p.is_file()):,} bytes')
