# Monster Hunter Field Book — native Android

**Milestone 0.1.0: native foundation.** Kotlin and Android Views/Canvas; no WebView.

Download the test APK from the `android-v0.1.0` GitHub prerelease. The completed HTML guide remains available separately as `v1.0.0`.

## Working foundation

- Fullscreen native Overview with complete World/Iceborne artwork and original embedded fonts.
- Fixed cold-launch snowflake formation, original generated crystal chime, fade-out and Overview reveal.
- The original snowflake/hexagonal emblem paths, 180° flip and downward navigation-menu reveal.
- Offline cross-game SQLite search with instant updates, categories, exact-name priority, partial names, typo fallback, related records and local history.
- Searchable records and clearly labelled summary previews; bookmarks stay on-device.
- Native Settings with collapsed groups, spacing, typography, themes, colour wheels, gradients, saved looks, transition/touch controls, layout/startup/exit choices and music preferences.
- Native MediaPlayer tracks with fades, theme crossfades, lifecycle pause/resume and audio-focus handling.
- Portrait/landscape support; orientation changes retain overlays and typed search. Tablet Settings can use a centred panel or categories beside controls; narrow screens fall back to compact layout.

## Preview boundaries

Bestiary, weapon trees, equipment libraries, maps, Speedrun and field-note screens are **not full ports yet**. Navigation shows labelled preview sections. Search opens labelled record summaries, not a completed profile interface.

Catalogue sorting/reading-group preferences and some ambient-effect controls are retained as preview preferences for later milestones. The test does not yet establish 90–100% visual equivalence or device performance. This release is intended for feedback on the foundation.

## Build

Requirements: JDK 21 for the complete Android 7/16 framework test matrix (JDK 17 can build the APK), Android SDK platform 36 and build tools 35.0.0, Python 3.10+, and the Python dependencies below. Bytecode targets Java 17. Set `ANDROID_HOME` or your own untracked `local.properties`.

```sh
python3 -m pip install -r android/requirements.txt
cd android
./gradlew assembleDebug testDebugUnitTest
```

The asset task derives the local SQLite database, images/icons, fonts and supplied tracks from the repository's frozen HTML source. It invokes the offline HTML builder if the generated HTML is absent. Asset generation makes no network requests. Gradle/Python dependency installation needs internet on a new development machine.

The APK is at `app/build/outputs/apk/debug/app-debug.apk`. Generated assets, build folders, machine paths and signing keys are excluded from Git.

To build an update compatible with the first test APK, restore the privately retained test-signing backup and pass `-PfieldBookSigningStore=/absolute/path/debug.keystore`. A fresh machine's automatically generated debug certificate will differ. This development key must not be used for production/Google Play signing and is never uploaded to the public repository.

## Platform and testing

- Minimum Android 7.0 / API 24; compile and target API 36.
- No internet, account, microphone, location or storage permission is needed for the bundled content.
- No background playback service. Music pauses when the Activity is paused.
- Test APK uses a development certificate, not production/Google Play signing.
- See milestone release notes and `docs/ANDROID_CHANGELOG.md` for actual verification results and limitations.

The app is an unofficial fan project. Included game media belongs to Capcom and the respective rights holders. The native Credits screen preserves data/font/icon attribution; original source metadata remains in the repository.
