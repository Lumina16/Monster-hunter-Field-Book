# Monster Hunter Field Book — native Android

Kotlin with Android Views/Canvas and a bundled read-only SQLite catalogue. No WebView, account or content download is required. Android 7.0/API 24 onward; compile and target API 36.

## 0.3.0-review — Shared assets & Weapons restoration

This milestone restores the complete HTML Weapons experience (`WeaponsScreen`, `WeaponProfilePanel`, `WeaponTreePanel`, `WeaponTreeLayout`, `WeaponModel`) and exports the full shared icon, glyph, reference artwork and regular/bold font sets (`9,547` required record image assignments verified). Other sections remain scheduled for subsequent restoration batches.

## 0.2.0 — Offline libraries & progress

This milestone replaces the section and record-summary previews with native libraries and a complete reader for the frozen reference data. Visual matching remains a later milestone.

- 10,174 records across monsters, weapons, equipment, items, recipes, quests, locales, maps, creatures, field notes, handbooks and build/preparation notes.
- Paged libraries, remembered collection filters, sorting, exact 1–6-column Bestiary grids, and compact list/detail panes on wide screens.
- Source-record profiles: hitzones, ailments, breaks, rewards, materials, forging/upgrading costs, sharpness, equipment skills/slots, unlocks and nested notes. Empty and zero-value monster statistics are hidden in the reader; source data is retained intact.
- Linked materials, recipes, equipment, monsters, locales and quests; native weapon family trees.
- Offline maps with floor selection, layers, pan, pinch/double-tap zoom, zoom buttons and remembered view state. Base facility directories are available where the reference has no verified map image.
- Staged World/Iceborne Speedrun requirements, saved campaign goals, reset/undo and camp checklists. Iceborne Speedrun remains locked until every required World task is checked, without erasing saved Iceborne progress if World is reset.
- Bookmarks, global search, history and per-collection defaults; settings groups open collapsed. Native backup/restore and checkbox-confirmed selective/full settings resets preserve their stated scopes.
- An interactive equipment-rarity/decoration-slot/effect legend. Offline imported music, playback/seek controls, repeat/shuffle, ordering, removal and restoring bundled tracks.
- Existing fullscreen Overview, snowflake introduction, navigation emblem, original artwork/fonts, colour wheels, themes, saved looks, orientation handling and foreground music lifecycle.

## Current boundaries

This is a functional development build, not the final visual port. The reader uses a general native presentation of the full source records. Matching HTML layout, the exact panel movement, decorative particles, artwork motion and advanced blur remain visual work; their preview preferences are labelled in Settings. The native reader does not create statistics, maps or recipes absent from the reference. External videos and credit/reference links open online.

Native backups do not import HTML progress or embed imported audio files. The app starts fresh from the HTML edition; updates signed with the same retained development key preserve native app data.

## Build and checks

Requirements: JDK 21 for the complete Android 7/16 framework test matrix (JDK 17 can build the APK), Android SDK platform 36/build tools 35.0.0, Python 3.10+, and the pinned Python dependencies. Bytecode targets Java 17. Set `ANDROID_HOME` or an untracked `local.properties`.

```sh
python3 -m pip install -r android/requirements.txt
cd android
./gradlew assembleDebug testDebugUnitTest lintDebug
python3 tools/validate_native.py --assets app/build/generated/nativeAssets
```

The asset task derives SQLite, media, fonts, music, checklists and legend data from the frozen source. It builds the reference HTML when absent. Generation and source comparison make no network requests; dependency installation requires internet on a new build machine.

Debug APK: `app/build/outputs/apk/debug/app-debug.apk`. `assembleRelease` produces an unsigned release APK. Generated assets/build folders, machine paths and keys are excluded from Git. The read-only pull-request workflow produces unsigned build/test artifacts; signing stays outside GitHub Actions.

For an update compatible with the first test APK, restore the privately retained signing backup and pass `-PfieldBookSigningStore=/absolute/path/debug.keystore` when building the debug variant. A new machine's generated debug certificate differs. Use a separate production signing strategy for Google Play.

The data validator compares all 10,174 source records, 528,819 nested values and 296 embedded media references, and checks database integrity, image paths and link targets. Native regression tests cover API 24 and 36. Actual results for each APK belong in its release notes and verification file; framework tests do not establish physical-device performance or audio-interruption behaviour.

No internet, location, microphone or broad storage permission is required. File import/export uses Android's document picker. There is no background playback service. Music pauses outside the Activity.

Unofficial fan project. Game material belongs to Capcom and the respective rights holders. Original attribution is retained in the source data and native Credits screen.
