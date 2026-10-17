#!/usr/bin/env python3
"""Build the offline guide from the recovered, editable runtime source."""
import argparse
import hashlib
import json
from pathlib import Path

ROOT = Path(__file__).resolve().parent

def build(output):
    cache = {}
    def hydrate(value):
        if isinstance(value, dict) and set(value) == {'$include'}:
            path = (ROOT / 'data' / value['$include']).resolve()
            if not path.is_relative_to((ROOT / 'data').resolve()):
                raise ValueError('Data include escapes data directory')
            return hydrate(json.loads(path.read_text()))
        if isinstance(value, dict) and set(value) == {'$concat'}:
            return [item for part in value['$concat'] for item in hydrate(part)]
        if isinstance(value, dict) and set(value) == {'$embedded'}:
            digest = value['$embedded']
            if len(digest) != 64 or any(c not in '0123456789abcdef' for c in digest):
                raise ValueError('Invalid embedded asset digest')
            if digest not in cache:
                chunks = sorted((ROOT / 'assets/embedded' / digest).glob('*.txt'))
                if not chunks:
                    raise ValueError(f'Missing embedded asset: {digest}')
                text = ''.join(path.read_text() for path in chunks)
                if hashlib.sha256(text.encode()).hexdigest() != digest:
                    raise ValueError(f'Embedded asset checksum mismatch: {digest}')
                cache[digest] = text
            return cache[digest]
        if isinstance(value, dict):
            return {k: hydrate(v) for k, v in value.items()}
        if isinstance(value, list):
            return [hydrate(v) for v in value]
        return value

    manifest = json.loads((ROOT / 'data/manifest.json').read_text())
    data = {key: hydrate(json.loads((ROOT / 'data' / name).read_text())) for key, name in manifest.items()}
    replacements = {
        '@@STYLES@@': (ROOT / 'src/styles.css').read_text(),
        '@@DATA@@': json.dumps(data, ensure_ascii=False, separators=(',', ':')).replace('<', '\\u003c'),
        '@@APP@@': (ROOT / 'src/app.js').read_text(),
    }
    html = (ROOT / 'src/template.html').read_text()
    for marker, content in replacements.items():
        if html.count(marker) != 1:
            raise ValueError(f'Expected exactly one {marker} marker')
        html = html.replace(marker, content, 1)
    output.parent.mkdir(parents=True, exist_ok=True)
    output.write_text(html)
    print(f'{output.name}: {output.stat().st_size:,} bytes; SHA-256 {hashlib.sha256(output.read_bytes()).hexdigest()}')

if __name__ == '__main__':
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--output', type=Path, default=ROOT / 'Hunter_Field_Guide_World_Iceborne.html')
    build(parser.parse_args().output)
