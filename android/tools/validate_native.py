#!/usr/bin/env python3
"""Check native content against the frozen HTML, including every nested value."""
import argparse, base64, hashlib, json, re, sqlite3
from pathlib import Path

ROOT = Path(__file__).resolve().parents[2]
parser = argparse.ArgumentParser()
parser.add_argument('--assets', type=Path, required=True)
args = parser.parse_args()
assets = args.assets.resolve()
source = (ROOT/'Hunter_Field_Guide_World_Iceborne.html').read_text()
data = json.loads(re.search(r'<script type="application/json" id="guide-data">(.*?)</script>',source,re.S)[1])
db = sqlite3.connect(f'file:{assets/"catalogue.db"}?mode=ro', uri=True)
assert db.execute('PRAGMA integrity_check').fetchone()[0] == 'ok'
manifest = json.loads((assets/'manifest.json').read_text())
actual = {(kind, category, raw_id, name): json.loads(payload) for kind,category,raw_id,name,payload in db.execute('SELECT kind,category,raw_id,name,payload FROM records')}
checked_values = 0
checked_media = set()

def equal(expected, native, context):
    global checked_values
    checked_values += 1
    if isinstance(expected, dict):
        assert isinstance(native,dict), context
        for key,value in expected.items():
            assert key in native, f'{context}: missing {key}'
            equal(value,native[key],f'{context}.{key}')
    elif isinstance(expected,list):
        assert isinstance(native,list) and len(expected)==len(native), context
        for i,value in enumerate(expected): equal(value,native[i],f'{context}[{i}]')
    elif isinstance(expected,str) and expected.startswith('data:'):
        assert isinstance(native,str) and native.startswith('art/'), context
        path=assets/native
        assert path.is_file(), f'{context}: missing media {native}'
        if native not in checked_media:
            header, encoded=expected.split(',',1)
            raw=base64.b64decode(encoded) if ';base64' in header else encoded.encode()
            assert path.read_bytes()==raw, f'{context}: modified embedded media'
            checked_media.add(native)
    else:
        assert expected == native, f'{context}: {expected!r} != {native!r}'

expected_count = 0
def collection(kind,records,category=None):
    global expected_count
    for index,record in enumerate(records):
        expected_count+=1
        name=record.get('name') or record.get('title')
        identity=(kind,category if category is not None else str(record.get('category','')),str(record.get('id',index)),name)
        assert identity in actual, f'Missing native record: {identity}'
        equal(record,actual[identity],name)

collection('Monsters',[dict(m,database=data['database']['monsters'].get(m['id'],{})) for m in data['monsters']])
for key,kind in [('weapons','Weapons'),('items','Items'),('quests','Quests'),('recipes','Recipes')]: collection(kind,data['database'][key])
for category,records in data['catalogues'].items(): collection('Creatures' if category in ('smallMonsters','endemicLife') else 'Equipment',records,category)
for key,kind in [('guides','Field Notes'),('locales','Locales'),('weapons','Weapon Guides'),('builds','Builds'),('items','Preparation'),('atlasMaps','Maps'),('baseDirectories','Maps')]: collection(kind,data[key])
assert expected_count == len(actual) == manifest['records'], (expected_count,len(actual),manifest['records'])

record_image_paths = set()
required_kinds = {'Monsters', 'Weapons', 'Items', 'Recipes', 'Equipment', 'Creatures', 'Locales', 'Weapon Guides'}
required_image_count = 0
for kind, image, payload in db.execute('SELECT kind,image,payload FROM records'):
    if kind in required_kinds:
        assert image and (assets/image).is_file(), f'Missing required image for {kind}: {image}'
        required_image_count += 1
    if image:
        assert (assets/image).is_file(), image
        record_image_paths.add(image)
    def paths(value):
        if isinstance(value,dict):
            for item in value.values(): paths(item)
        elif isinstance(value,list):
            for item in value: paths(item)
        elif isinstance(value,str) and value.startswith('art/'): assert (assets/value).is_file(),value
    paths(json.loads(payload))

library=json.loads((assets/'library.json').read_text())
for key in ('speedrun','progress','checklist','catalogueCoverage','catalogueSources','referenceNames'): equal(data[key],library[key],key)
assert set(library['rarityColours']) == set(map(str,range(1,13)))
assert set(library['legendSlots']) == {'1','2','3','4'}
for path in library['legend'].values(): assert (assets/path).is_file(),path
for path in library['legendSlots'].values(): assert (assets/path).is_file(),path
native_visuals = library['nativeVisuals']
assert len(native_visuals['weaponTypes']) == 14
for wtype in native_visuals['weaponTypes'].values():
    assert (assets/wtype['handbookImage']).is_file(), wtype['handbookImage']
    assert set(wtype['rarityIcons']) == set(map(str, range(1, 13)))
    for path in wtype['rarityIcons'].values(): assert (assets/path).is_file(), path
for group in ('catalogueGlyphs', 'gameIcons', 'effects', 'slots', 'fonts', 'localeArtwork', 'referenceArtwork'):
    for path in native_visuals[group].values(): assert (assets/path).is_file(), path
for entry in native_visuals['catalogueRecords'].values():
    assert (assets/entry['image']).is_file(), entry['image']
audit = library['assetAudit']
assert audit['requiredAssignments'] == required_image_count == 9547
assert audit['missingAssignments'] == []
weapon_parent_links = db.execute("SELECT COUNT(*) FROM links WHERE source LIKE 'Weapons:%' AND label='Previous upgrade'").fetchone()[0]
assert weapon_parent_links == 2754
orphans=db.execute('SELECT COUNT(*) FROM links l LEFT JOIN records a ON a.id=l.source LEFT JOIN records b ON b.id=l.target WHERE a.id IS NULL OR b.id IS NULL').fetchone()[0]
assert orphans==0
for filename in ('world.mp3','iceborne.mp3','formation.wav'): assert (assets/'music'/filename).stat().st_size>1000
counts=dict(db.execute('SELECT kind,COUNT(*) FROM records GROUP BY kind'))
report={'version':manifest['version'],'records':expected_count,'kinds':counts,'nestedValuesCompared':checked_values,'embeddedMediaCompared':len(checked_media),'requiredImageAssignments':required_image_count,'packagedRecordImagePathsChecked':len(record_image_paths),'weaponParentLinks':weapon_parent_links,'links':db.execute('SELECT COUNT(*) FROM links').fetchone()[0],'orphanLinks':orphans,'sourceSha256':hashlib.sha256((ROOT/'Hunter_Field_Guide_World_Iceborne.html').read_bytes()).hexdigest(),'integrity':'ok'}
target=assets.parents[1]/'reports'/'native-validation.json'
target.parent.mkdir(parents=True,exist_ok=True);target.write_text(json.dumps(report,indent=2)+'\n')
print(json.dumps(report,indent=2))
