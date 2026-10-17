# Monster hunter Field Book

An offline, unofficial field guide for **Monster Hunter: World and Iceborne**.

Native Android development is tracked separately under [`android/`](android/README.md). See the [approved requirements](docs/ANDROID_REQUIREMENTS.md) and [milestone journey](docs/ANDROID_CHANGELOG.md). The HTML edition below remains the completed reference; native test releases use `android-v…` tags and clearly identify unfinished screens.

## Use the app

Download `Hunter_Field_Guide_World_Iceborne.html` from this repository's **Releases** page, then open it in a modern browser. The single file includes the guide, frozen databases, images, icons, fonts and supplied music. External references and linked videos require internet access.

The app saves preferences, bookmarks and story progress in the browser. Use Settings → Backup & reset to export your data before switching browsers or devices. Local-file storage behaviour varies between browsers.

## What's included

- Bestiary with monster profiles, hitzones, ailments, rewards, filters and configurable card grids.
- Weapons, interactive family trees, linked materials and decoration-slot information.
- Armour, decorations, skills, charms, Kinsects, Palico equipment/gadgets, mantles/boosters, canteen ingredients and food skills.
- Small monsters, endemic life, gathering resources and crafting/melding recipes.
- Locales, layered maps, world/base maps and facility directories.
- Field-note compendium, preparation checklists and staged World/Iceborne story routes.
- Global search, bookmarks, navigation history and a music library.
- Organised Settings: themes and colour wheels, saved visual presets, typography/spacing, card density, icon size, gradients, transitions, touch effects, performance controls, grid size, startup behaviour, sorting and backups/resets.

See [features](docs/FEATURES.md), [development history](docs/DEVELOPMENT_HISTORY.md), [architecture](docs/ARCHITECTURE.md) and [validation](docs/VALIDATION.md).

## Build

Requires Python **3.10+**; the builder uses only the standard library.

```sh
python3 build.py
```

This writes `Hunter_Field_Guide_World_Iceborne.html`. No downloads are needed for the build. Generated HTML is distributed as a release asset rather than committed alongside the source.

```sh
node --check src/app.js
npm ci
npm test
```

Node.js **22+** is used for the DOM regression check. `npm ci` downloads the development test dependency; it is not needed to build or use the app.

## Source and rights

This source package was recovered from the completed saved HTML after an interrupted upload lost the temporary original build workspace. It contains the complete runtime source and embedded data/media, with a new reproducible builder. It does **not** claim to preserve the earlier research/extraction tools or their original file organisation.

Monster Hunter names, game data, artwork, maps and audio belong to Capcom and their respective rights holders. This is a fan project, not an official Capcom product. Source references are preserved inside the app and under `data/`. See [third-party notices](THIRD_PARTY_NOTICES.md) and [licensing](LICENSE.md).
