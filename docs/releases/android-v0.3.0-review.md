# Monster Hunter Field Book — 0.3.0-review

This is the first correction build for **shared assets and Weapons**. It is a native Kotlin APK, signed to update the installed v0.2.0 test app. The rest of the app still needs its own HTML restoration batches. This build is not a claim of 100% whole-app similarity.

## Restored in this batch

- Weapons starts with the original fourteen illustrated handbook cards, source order, descriptions, All / Melee / Ranged controls and independent bookmarks.
- Each type opens its integrated Guide / Database / Family Tree flow. Guide content preserves its original groups, World foundation and Iceborne additions.
- Database browsing includes the original four filters, token matching, sorting, batches of forty, meaningful zero statistics, sharpness, slots, attributes, forging/upgrading paths, materials and costs.
- Family Tree uses the real connected parent graph, original family/branch order and geometry, source zoom scale, pan/pinch/reset, floating materials and Info-to-Database return.
- Iceborne includes the relevant World weapons and upgrade ancestors. Weapon search, saved entries and related links use the same integrated profile.
- Back, rotation and Activity recreation preserve the tested query/filter/selection, list limit and tree family/zoom/pan context.
- Original handbook images, equipment glyph mappings, rarity icons, armour arm/leg aliases, locale covers and regular/bold font files are exported. Missing images no longer silently use the snowflake trademark.
- Render review caught and corrected an oversized sharpness bar and incorrectly opaque gold surfaces.

## Verification

| Check | Result |
| --- | --- |
| Automated tests | 35 passed, 0 failed or skipped |
| Android framework matrix | API 24 and API 36; Skia review frames on API 28 |
| Frozen records / nested values compared | 10,174 / 528,819 |
| Weapons / typed parent links | 3,544 / 2,754 |
| Required image assignments | 9,547; none missing |
| Packaged record image paths checked | 1,034 |
| Lint | 0 errors; 55 nonblocking warnings |
| APK | Version code 3; minimum Android 7.0; target API 36 |
| Package/signature | Native, no WebView or HTML runtime; no requested permissions; APK v2/v3 and ZIP alignment verified |

The signature matches v0.2.0. Install this APK as an update; uninstalling is unnecessary. It uses a development certificate, as the previous test build did.

## Still unfinished

- This is a section-by-section restoration. Bestiary, Equipment, Locales/maps, Item Libraries, Field Notes, Speedrun and Settings still contain earlier generic layouts and need their own fidelity passes.
- Material and compatible-decoration links reach the intended data, but their destination layouts are still the earlier native readers/lists.
- The shared header, trademark navigation movement, exact typography/spacing, visual settings and decorative/touch effects are not yet fully identical to the HTML.
- Weapon content-transition blur currently works through the native effect on Android 12 onward. Matching blur on Android 7–11 remains unfinished; those versions retain the fade/scale/timing.
- Framework tests and rendered frames do not establish physical-device performance, gesture feel or audio-interruption behaviour on the iQOO/tablets.

## Suggested review route

1. Open Weapons in World and compare the fourteen cards, labels, images and bookmarks with the HTML.
2. Open Great Sword, then Guide, Database and Family Tree. Try search, filters, Show more, a selected record and its Forge/Upgrade material links.
3. Switch to Iceborne and confirm World ancestors remain in the tree. Select a node, open Info and use Back to return to the same family/viewport.
4. Rotate while a query or tree selection is open, then check that the context remains.

GitHub publication is held for your review. No new release has been published.

APK size: 100.3 MiB.

SHA-256: `83c9586246a2a3ff21c5f9b489b55a6b1b2e9c917a1f598b6cfbe9f202cc8f36`

Reference HTML SHA-256: `9d719eba5e65a62b70201ff7ddc08940105087547bee7f5e09153073ed3d4515`.
