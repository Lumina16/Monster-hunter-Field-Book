# Native Android milestone journey

Each installable milestone receives its own `android-v…` tag, APK asset and release notes. HTML releases use their separate version line.

## 0.1.0 — Native foundation

First Kotlin/Android Views implementation of the approved launch, Overview, search, Settings and navigation foundation. Offline data and artwork are derived from the frozen completed HTML source. The APK does not use a WebView.

Full catalogue interfaces are clearly labelled previews. Physical Android 7/16 testing, 90–100% visual comparison, audio interruption behaviour and frame-time measurements remain device-verification tasks; compile/API targeting alone cannot establish those results.

Verification: eight tests passed, including Android API 24/36 framework checks and an API 28 native Skia render review. Lint: zero errors, 19 warnings (mainly drawing allocations and programmatic View constructors). The database contains 10,125 records; integrity and referenced-image checks passed. APK v2 signing and ZIP alignment verify.

APK SHA-256: `5c07e0474f33a5d396ba83e055dd641fd7045d235e5e6c2b35d9f350c3d88fe4`. Full evidence is recorded in `ANDROID_0.1.0_VERIFICATION.json`. These are framework/render tests, not physical-device performance or audio tests.

## 0.2.0 — Offline libraries & progress

The development order is now **content and working functions first, visual matching last**, following device feedback on 0.1.0. The source record payloads are fully retained and accessible through native libraries and expandable profiles.

Added paged browsing, exact-count Bestiary grids, per-collection filters/sorts, weapon family trees, linked materials/equipment/quests, maps with zoom/floors/layers, field notes and handbooks, campaign goals, camp checklists and staged World/Iceborne Speedrun progress with gating and reset undo.

Settings now connect native backups, scoped resets, the interactive rarity/slot/effect legend, per-collection default sorting and imported offline music controls. Existing native bookmarks/settings remain in app storage. The retained test certificate is used for the downloadable update; no private key is published.

Data comparison: all 10,174 records, 528,819 nested values and 296 embedded media references match the frozen HTML. Database integrity passes and all link targets exist. All 22 native checks passed, including the API 24/36 matrix. Lint has zero errors and 46 warnings, mostly English UI strings, drawing allocations and programmatic View constructors. The retained development certificate verifies with APK v2/v3, and all uncompressed ZIP entries are aligned to 4 bytes. Full evidence is in `ANDROID_0.2.0_VERIFICATION.json`.

APK: `Monster_Hunter_Field_Book_0.2.0.apk` (101,972,285 bytes). SHA-256: `bdba4e9a2be08a5ed343a9239b7ae8d9279a1d9848f8f4c370efa96151e7f703`.

The source contains 71 large monsters, 120 creatures, 3,544 weapons, 3,610 equipment entries, 1,778 items, 403 recipes, 522 quests, 7 locales, 6 map/base directories, 70 field notes, 14 weapon handbooks, 8 build templates and 21 preparation notes. Counts refer to the supplied reference, not a claim of newly researched game coverage.

The UI is deliberately functional at this stage. Exact visual matching, decorative motion, device performance and audio interruption checks remain future work.

## 0.3.0-review — Weapons Restoration

First section-by-section restoration batch covering **shared assets and Weapons**:

- Restored the fourteen illustrated Weapon Handbook discipline cards with All / Melee / Ranged filtering, edition notice strip and independent bookmarks.
- Added the integrated `WeaponProfilePanel` (`Guide`, `Database`, `Family Tree`) with World/Iceborne move loops, four database filters, token matching, sorting, batches of forty, single-screen detail transitions, sharpness bars, slots, attributes and forge/upgrade materials.
- Rebuilt `WeaponTreePanel` and `WeaponTreeLayout` with connected parent graphs, family selection, pan/pinch/reset zoom, floating materials dock and `Info` -> `Database` -> `Back to tree` navigation.
- Exported all 926 game icons, 24 catalogue glyphs with rarity-tinted variants, 36 reference artwork assets, and regular/bold TTF font instances (`body.ttf`, `body-bold.ttf`, `title.ttf`, `title-bold.ttf`). All 9,547 required record image assignments resolve without silent snowflake fallbacks.

Verification: 35 automated tests passed across API 24/36 plus API 28 Skia render checks; 0 lint errors; 10,174 records, 528,819 nested values and 133,702 links verified. APK: `Monster_Hunter_Field_Book_0.3.0_review.apk` (`83c9586246a2a3ff21c5f9b489b55a6b1b2e9c917a1f598b6cfbe9f202cc8f36`).

## Remaining journey

| Milestone | Focus |
| --- | --- |
| 0.3 | User testing and functional parity fixes across the new libraries |
| 0.4 | Responsive reading and settings refinements; accessibility and large-library performance |
| 0.5–0.8 | HTML visual matching, trademark panel movement, effects and animation polish |
| 0.9 | Real-device compatibility/performance and release-candidate fixes |
| 1.0 | Completed native application; prepare Google Play distribution |
