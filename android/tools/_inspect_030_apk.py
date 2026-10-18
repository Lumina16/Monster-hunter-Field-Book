#!/usr/bin/env python3
"""Inspect 0.2.0 and 0.3.0-review APKs to recover 0.3.0 sources and asset pipeline changes."""
import hashlib, json, os, shutil, sqlite3, subprocess, zipfile
from pathlib import Path

ROOT = Path(__file__).resolve().parents[2]
OUT = ROOT / "_recovery_030"
OUT.mkdir(parents=True, exist_ok=True)

apk020 = Path("/tmp/release_020/Monster_Hunter_Field_Book_0.2.0.apk")
apk030 = Path("/tmp/release_030/Monster_Hunter_Field_Book_0.3.0_review.apk")
notes030 = Path("/tmp/release_030/Monster_Hunter_Field_Book_0.3.0_Review_Notes.md")

if notes030.exists():
    shutil.copy2(notes030, OUT / "Monster_Hunter_Field_Book_0.3.0_Review_Notes.md")

dir020 = Path("/tmp/unpacked_020")
dir030 = Path("/tmp/unpacked_030")
with zipfile.ZipFile(apk020) as z:
    z.extractall(dir020)
with zipfile.ZipFile(apk030) as z:
    z.extractall(dir030)

def sha256_file(p: Path) -> str:
    return hashlib.sha256(p.read_bytes()).hexdigest()

# 1. Compare all files in assets/
assets020 = {
    p.relative_to(dir020 / "assets").as_posix(): (p.stat().st_size, sha256_file(p))
    for p in (dir020 / "assets").rglob("*") if p.is_file()
}
assets030 = {
    p.relative_to(dir030 / "assets").as_posix(): (p.stat().st_size, sha256_file(p))
    for p in (dir030 / "assets").rglob("*") if p.is_file()
}

added_assets = {k: assets030[k] for k in sorted(set(assets030) - set(assets020))}
removed_assets = {k: assets020[k] for k in sorted(set(assets020) - set(assets030))}
modified_assets = {
    k: {"old": assets020[k], "new": assets030[k]}
    for k in sorted(set(assets020) & set(assets030))
    if assets020[k][1] != assets030[k][1]
}

(OUT / "assets_diff_summary.json").write_text(json.dumps({
    "total_020": len(assets020),
    "total_030": len(assets030),
    "added_count": len(added_assets),
    "removed_count": len(removed_assets),
    "modified_count": len(modified_assets),
    "added": added_assets,
    "removed": removed_assets,
    "modified": modified_assets,
}, indent=2))

# Copy small JSON files from 0.3.0 assets and 0.2.0 assets
for fname in ["manifest.json", "credits.json", "library.json"]:
    p3 = dir030 / "assets" / fname
    p2 = dir020 / "assets" / fname
    if p3.exists() and p3.stat().st_size < 5_000_000:
        shutil.copy2(p3, OUT / f"030_{fname}")
    if p2.exists() and p2.stat().st_size < 5_000_000:
        shutil.copy2(p2, OUT / f"020_{fname}")

# 2. Compare catalogue.db in detail
db2 = sqlite3.connect(str(dir020 / "assets/catalogue.db"))
db3 = sqlite3.connect(str(dir030 / "assets/catalogue.db"))

schema2 = db2.execute("SELECT type, name, sql FROM sqlite_master ORDER BY type, name").fetchall()
schema3 = db3.execute("SELECT type, name, sql FROM sqlite_master ORDER BY type, name").fetchall()

kinds2 = dict(db2.execute("SELECT kind, COUNT(*) FROM records GROUP BY kind").fetchall())
kinds3 = dict(db3.execute("SELECT kind, COUNT(*) FROM records GROUP BY kind").fetchall())

cols2 = [r[1] for r in db2.execute("PRAGMA table_info(records)").fetchall()]
cols3 = [r[1] for r in db3.execute("PRAGMA table_info(records)").fetchall()]

# Check row differences by kind
rows2 = {r[0]: r for r in db2.execute("SELECT * FROM records").fetchall()}
rows3 = {r[0]: r for r in db3.execute("SELECT * FROM records").fetchall()}

added_ids = sorted(set(rows3) - set(rows2))
removed_ids = sorted(set(rows2) - set(rows3))
changed_by_kind = {}
sample_changes = {}

for k in sorted(set(rows2) & set(rows3)):
    r2 = dict(zip(cols2, rows2[k]))
    r3 = dict(zip(cols3, rows3[k]))
    if r2 != r3:
        kind = r3.get("kind", "?")
        changed_by_kind[kind] = changed_by_kind.get(kind, 0) + 1
        if kind not in sample_changes or len(sample_changes[kind]) < 5:
            diff_fields = {}
            for col in sorted(set(cols2) | set(cols3)):
                v2 = r2.get(col)
                v3 = r3.get(col)
                if v2 != v3:
                    if col == "payload":
                        try:
                            p2_obj = json.loads(v2) if v2 else {}
                            p3_obj = json.loads(v3) if v3 else {}
                            p_diff = {
                                pk: {"old": p2_obj.get(pk), "new": p3_obj.get(pk)}
                                for pk in sorted(set(p2_obj) | set(p3_obj))
                                if p2_obj.get(pk) != p3_obj.get(pk)
                            }
                            diff_fields["payload_diff"] = p_diff
                        except Exception as e:
                            diff_fields["payload_err"] = str(e)
                    else:
                        diff_fields[col] = {"old": v2, "new": v3}
            sample_changes.setdefault(kind, []).append({"id": k, "diffs": diff_fields})

links2 = set(db2.execute("SELECT source, target, label FROM links").fetchall())
links3 = set(db3.execute("SELECT source, target, label FROM links").fetchall())
added_links = sorted(links3 - links2)
removed_links = sorted(links2 - links3)

from collections import Counter
added_link_labels = Counter(l[2] for l in added_links)
removed_link_labels = Counter(l[2] for l in removed_links)

(OUT / "db_diff_summary.json").write_text(json.dumps({
    "schema_020": schema2,
    "schema_030": schema3,
    "cols_020": cols2,
    "cols_030": cols3,
    "kinds_020": kinds2,
    "kinds_030": kinds3,
    "added_record_ids": added_ids[:50],
    "removed_record_ids": removed_ids[:50],
    "changed_by_kind": changed_by_kind,
    "sample_changes": sample_changes,
    "links_020_count": len(links2),
    "links_030_count": len(links3),
    "added_link_labels": dict(added_link_labels),
    "removed_link_labels": dict(removed_link_labels),
    "sample_added_links": added_links[:30],
    "sample_removed_links": removed_links[:30],
}, indent=2, ensure_ascii=False))

print("Inspection script completed successfully.")
