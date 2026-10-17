# Validation

## Current publication package

- The recovered source reproduced the saved completed app byte-for-byte before the two Settings fixes.
- `build.py` verifies SHA-256 for every recovered embedded asset while reconstructing the offline file.
- `node --check src/app.js` checks JavaScript syntax.
- `npm test` loads the full built app in jsdom and checks Settings opening, reopening, all grouped settings categories, manual expansion and matching Gradients spacing. It also rejects unexpected runtime errors.
- A fresh archive of only tracked source is rebuilt to check that ignored/generated files are not build dependencies.

jsdom checks DOM behaviour and computed CSS rules; it does not prove actual phone rendering, GPU animation smoothness or Android performance. The DOM fixture trims inert encoded-media payloads to bound test memory; the real release retains them, and the builder verifies their checksums. Music playback and device-specific local-file persistence require real-browser/device testing.

## Earlier completed-app checks

The preceding workspace recorded 290 interaction assertions and three data/asset validators passing. Those original harnesses were lost with the interrupted temporary workspace, so they are historical results, not tests shipped or rerun in this recovery package. The app's data, media, styling and runtime were recovered from the saved validated version.

Release checksums identify the exact downloadable build. See `BUILD_MANIFEST.json` for current output details.
