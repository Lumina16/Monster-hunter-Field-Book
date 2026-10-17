# Native Android milestone journey

Each installable milestone receives its own `android-v…` tag, APK asset and release notes. HTML releases use their separate version line.

## 0.1.0 — Native foundation

First Kotlin/Android Views implementation of the approved launch, Overview, search, Settings and navigation foundation. Offline data and artwork are derived from the frozen completed HTML source. The APK does not use a WebView.

Full catalogue interfaces are clearly labelled previews. Physical Android 7/16 testing, 90–100% visual comparison, audio interruption behaviour and frame-time measurements remain device-verification tasks; compile/API targeting alone cannot establish those results.

Verification: eight tests passed, including Android API 24/36 framework checks and an API 28 native Skia render review. Lint: zero errors, 19 warnings (mainly drawing allocations and programmatic View constructors). The database contains 10,125 records; integrity and referenced-image checks passed. APK v2 signing and ZIP alignment verify.

APK SHA-256: `5c07e0474f33a5d396ba83e055dd641fd7045d235e5e6c2b35d9f350c3d88fe4`. Full evidence is recorded in `ANDROID_0.1.0_VERIFICATION.json`. These are framework/render tests, not physical-device performance or audio tests.

## Planned journey

The sequence can change based on test feedback; these are not completed releases.

| Milestone | Focus |
| --- | --- |
| 0.2 | Bestiary and complete monster profiles; responsive list/detail layouts |
| 0.3 | Weapons, database details and interactive family trees |
| 0.4 | Equipment, skills, decorations/slots and Item Libraries |
| 0.5 | Locales, layered maps, bases and field-note compendium |
| 0.6 | Speedrun stages, unlocking effects and progress persistence |
| 0.7 | Complete preference coverage, accessibility and polish |
| 0.9 | Real-device compatibility/performance and release-candidate fixes |
| 1.0 | Completed native application; prepare Google Play distribution |
