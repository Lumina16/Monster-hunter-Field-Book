#!/usr/bin/env python3
"""Derive the native offline search catalogue and assets from the HTML source."""
import argparse, base64, hashlib, io, json, math, re, sqlite3, struct, subprocess, sys, wave
from pathlib import Path

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

for edition in ['world','iceborne']:
    info = data['editions'][edition]
    for role, key in [('hero','background'), ('logo','logo')]:
        write_uri(data['assets'][info[key]], out/f'art/{edition}-{role}.webp')
    write_uri(data['music'][edition]['data'], out/f'music/{edition}.mp3')

# Native Android uses actual TTF files rather than CSS font data URLs.
from fontTools.ttLib import TTFont
css = (ROOT/'src/styles.css').read_text()
fonts = re.findall(r'@font-face\{(.*?)\}', css, re.S)
for i, rule in enumerate(fonts):
    match = re.search(r'url\([\"\']?(data:[^)\"\']+)', rule)
    if not match: continue
    raw = base64.b64decode(match[1].split(',',1)[1])
    font = TTFont(io.BytesIO(raw)); font.flavor = None
    if 'fvar' in font:
        from fontTools.varLib.instancer import instantiateVariableFont
        instantiateVariableFont(font,{axis.axisTag:axis.defaultValue for axis in font['fvar'].axes},inplace=True)
    folder = out/'fonts'; folder.mkdir(exist_ok=True)
    target=folder/('title.ttf' if 'HunterDisplay' in rule else 'body.ttf')
    if 'HunterDisplay' in rule or i==0:font.save(target)
(out/'credits.json').write_text(json.dumps({'fontLicense':data.get('fontLicense'),'sources':data.get('catalogueSources'),'databaseSources':data['database'].get('sources'),'databaseLicense':data['database'].get('license'),'iconLicense':data['visuals'].get('hdSource'),'visualSources':data['visuals'].get('sources')},ensure_ascii=False))

dbpath = out/'catalogue.db'
if dbpath.exists(): dbpath.unlink()
db = sqlite3.connect(dbpath)
db.executescript('CREATE TABLE records(id TEXT PRIMARY KEY,kind TEXT,name TEXT,game TEXT,summary TEXT,image TEXT,payload TEXT); CREATE VIRTUAL TABLE names USING fts4(id,name,summary,tokenize=unicode61); CREATE INDEX record_kind ON records(kind);')
seen = set()
icon_cache = {}
def icon_image(key):
    if not key:return ''
    if key in icon_cache:return icon_cache[key]
    asset=data['visuals']['assets'].get(key,{})
    uri=asset.get('image','')
    if not uri:return ''
    target=out/f'art/icons/{key}.png';target.parent.mkdir(parents=True,exist_ok=True)
    raw=base64.b64decode(uri.split(',',1)[1])
    if 'svg' in uri[:70]:
        import cairosvg
        cairosvg.svg2png(bytestring=raw,write_to=str(target),output_width=128,output_height=128)
    else:target.write_bytes(raw)
    icon_cache[key]=target.relative_to(out).as_posix();return icon_cache[key]

def record_icon(kind,record):
    visual=data['visuals'];rarity=str(record.get('rarity',1));category=record.get('category','')
    if kind=='Weapons':return icon_image(visual['hdWeapons'].get(record.get('type'),{}).get(rarity))
    if category=='armours':return icon_image(visual['hdArmour'].get('armour-'+record.get('type','head'),{}).get(rarity))
    if category=='charms':return icon_image(visual['hdArmour'].get('charm',{}).get(rarity))
    return icon_image(visual['itemNames'].get(record.get('name')) or visual['categories'].get(record.get('category','')))
def clean(value):
    if isinstance(value,str) and value.startswith('data:'):return ''
    if isinstance(value,list):return [clean(v) for v in value]
    if isinstance(value,dict):return {k:clean(v) for k,v in value.items()}
    return value
def add(kind, record, index=0, image=''):
    name = record.get('name') or record.get('title')
    if not name:return
    key = kind+':'+str(record.get('category',''))+':'+str(record.get('id', index))+':'+name
    if key in seen:return
    seen.add(key)
    image=image or record_icon(kind,record)
    game = record.get('game','both')
    summary = str(record.get('description') or record.get('summary') or record.get('class') or record.get('type') or record.get('category') or '')
    if kind=='Weapons': summary=' · '.join(filter(None,[record.get('type','').replace('-',' ').title(),'Rarity '+str(record.get('rarity','')), 'Attack '+str(record.get('attack',''))]+[e.get('type','')+' '+str(e.get('value','')) for e in record.get('elements',[])]))
    db.execute('INSERT INTO records VALUES (?,?,?,?,?,?,?)',(key,kind,name,game,summary[:600],image,json.dumps(clean(record),ensure_ascii=False,separators=(',',':'))))
    def keywords(value):
        if isinstance(value,list):return ' '.join(keywords(v) for v in value)
        if isinstance(value,dict):return ' '.join(str(v) if k in ['name','type','family','setName'] else keywords(v) for k,v in value.items())
        return ''
    db.execute('INSERT INTO names VALUES (?,?,?)',(key,name,summary[:600]+' '+keywords(record)))

for i, monster in enumerate(data['monsters']):
    image = write_uri(monster.get('image'),out/f'art/monsters/{monster["id"]}.webp')
    combined = dict(monster);combined['database']=data['database']['monsters'].get(monster['id'],{})
    add('Monsters',combined,i,image)
for key,kind in [('weapons','Weapons'),('items','Items'),('quests','Quests')]:
    for i, record in enumerate(data['database'][key]): add(kind,record,i)
for i, record in enumerate(data['database']['recipes']):
    summary=('Elder Melder' if record.get('method')!='craft' else 'Crafting')+' · '+', '.join(v.get('name','') for v in record.get('ingredients',[]))
    add('Recipes',dict(record,description=summary),i)
for key,records in data['catalogues'].items():
    for i, record in enumerate(records):
        add('Equipment' if key not in ['smallMonsters','endemicLife'] else 'Creatures',dict(record,category=key),i)
for key,kind in [('guides','Field Notes'),('locales','Locales')]:
    for i,record in enumerate(data[key]):add(kind,record,i)
db.commit();db.execute('VACUUM');db.close()

# A short original crystal chime, generated locally; media stream controls volume.
rate=44100;duration=2.4
with wave.open(str(out/'music/formation.wav'),'wb') as wav:
    wav.setparams((1,2,rate,0,'NONE','not compressed'))
    for i in range(int(rate*duration)):
        t=i/rate;value=0
        for start,freq in [(0,523.25),(.19,783.99),(.4,1046.5),(.65,1567.98),(.95,2093)]:
            u=t-start
            if u>=0:value += math.sin(2*math.pi*freq*u)*math.exp(-u*4)*min(1,u*80)*.16
        wav.writeframesraw(struct.pack('<h',max(-32767,min(32767,int(value*21000)))))
(out/'manifest.json').write_text(json.dumps({'records':len(seen),'sourceSha256':hashlib.sha256(html.read_bytes()).hexdigest(),'version':'0.1.0','editions':data['editions']},ensure_ascii=False,indent=2))
print(f'Native assets: {len(seen)} searchable records; {sum(p.stat().st_size for p in out.rglob("*") if p.is_file()):,} bytes')
