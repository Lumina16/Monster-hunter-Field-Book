# Android 0.2.0 — Offline Libraries & Progress

Download `Monster_Hunter_Field_Book_0.2.0.apk` from this release's Assets (97.2 MiB). Android 7.0/API 24 onward; target/compile API 36. Uses the retained development signing key for native app updates. This is a test milestone with a functional interface; the visual matching pass comes later.

## From previews to working libraries

- All 10,174 frozen reference records are accessible through native libraries and full expandable profiles, rather than summary previews.
- 71 large monsters, 120 creatures, 3,544 weapons, 3,610 equipment entries, 1,778 items, 403 recipes and 522 quests.
- 7 locales, 6 map/base directories, 70 field notes, 14 weapon handbooks, 8 build templates and 21 preparation notes.
- Paged browsing, saved collection filters, default sorting, exact manual Bestiary columns, and list/detail panes on wide screens.
- Complete source statistics, hitzones, breaks, ailments, drops/rewards, forging/upgrading materials and costs, equipment skills/slots, unlocks, descriptions and source credits. Empty and zero-value monster fields are hidden without discarding source data.
- Native weapon family trees and links between materials, recipes, equipment, monsters, quests and locales.
- Offline map floors/layers with pan, pinch/double-tap zoom, zoom/reset buttons and retained map state. Base facility directories preserve the reference's documented map gaps.
- World/Iceborne Speedrun stages, campaign goals, saved checklists, route-reset undo and World-completion gating. Relocking Iceborne keeps its saved progress.
- Native backup/restore, reviewed selective reset and checkbox-confirmed Reset All Settings. The full settings reset preserves bookmarks, progress, camp checks, music files, history and saved looks.
- Interactive rarity/slot/effect legend and offline music import, play/pause/seek, repeat/shuffle, queue ordering, removal and restoring bundled tracks.
- Existing Overview, snowflake opening, search, history/bookmarks, themes/colour wheels, saved visual presets, fullscreen navigation, orientation state and foreground music handling are retained.

## Validation

- 22 tests passed; Android API 24 and 36 framework coverage, plus the existing API 28 render test.
- Exhaustive source comparison: 10,174 records, 528,819 nested values and 296 embedded media references. Database integrity passes; all 133,586 link targets exist.
- Lint: zero errors, 46 warnings, mainly UI string localisation, drawing allocations and programmatic View constructors.
- APK package/version verified: `com.lumina.monsterhunterfieldbook`, version code 2 / version 0.2.0. Minimum API 24, target API 36, no requested permissions, no WebView type in DEX.
- APK v2/v3 signature and uncompressed-entry ZIP alignment verified. The private signing key is excluded from GitHub.

The signed APK is 101,972,285 bytes. SHA-256:

`bdba4e9a2be08a5ed343a9239b7ae8d9279a1d9848f8f4c370efa96151e7f703`

## Remaining work

The 90–100% HTML visual match, exact trademark panel movement and decorative particle/blur/artwork-motion effects remain for the visual phase. Their preview preferences are labelled. The record reader currently uses a general native layout. The native build preserves the supplied data; it does not invent information absent from that reference.

This APK has not been physically tested on the iQOO. Device testing should now focus on the new libraries, linked profiles, landscape/tablet layouts, imported audio and file-picker backup/restore. Framework tests do not establish device frame times or audio interruption behaviour. External videos and reference links still require internet access. HTML backups are not imported, and native backups do not bundle imported audio files.

The next milestone follows functional feedback and fixes before visual polish. The repository also includes a Flow opening prompt under `docs/branding/`.

Unofficial fan project. Monster Hunter material belongs to Capcom and the respective rights holders. Original data, font and icon credits are retained.
