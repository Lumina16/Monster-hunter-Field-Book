# Approved native Android requirements

## Identity and devices

- Name: Monster Hunter Field Book.
- Primary physical test device: iQOO Neo 10 Global, 16 GB RAM, Android 16 / OriginOS 6 (user supplied).
- Support phones and tablets, portrait and landscape, Android 7.0 onward.
- Native Kotlin implementation; keep the current visual identity as close as possible, with a 90–100% similarity goal that must be assessed visually on devices.
- The snowflake emblem, its 3D movement and the main navigation panel are trademark features. Keep original large gold touch feedback.
- No import from the HTML app; native app starts fresh. English initially.
- Downloadable APK milestones first; Google Play only after the complete app is ready.

## Launch, navigation and audio

- Short 3D snowflake-forming introduction with sound on every fresh launch. No extra intro-settings/skip requirement.
- Chime follows media volume; Overview fades in afterward and music fades in after the chime.
- Overview shows complete artwork, not cropped art.
- Overview is the default start; Settings may choose last section.
- Keep the 3D panel as primary navigation. Optional quick access can be explored later.
- Fullscreen, hidden system bars. Back closes the active overlay, then navigates back. Default exit confirmation, configurable.
- Outside taps close overlays. Closing search must preserve Overview rather than reload it.
- Music pauses when minimised and automatically resumes when returning. Resume after temporary interruptions when Android allows. Crossfade World/Iceborne tracks.

## Search

- Current overlay presentation, keyboard opens immediately, results update while typing.
- Search both games by default; category filters, game badges and useful previews.
- Exact names first, then partial names and spelling tolerance.
- Recent history enabled by default, individual removal and clear control.
- Related recipes/materials/equipment where supported by actual catalogue data.
- Returning from a record preserves the query, result list and scroll position.

## Layout and settings

- Tablets use list/detail layouts where practical; landscape phones use a compact equivalent.
- Rotation retains open panels, typed searches and position.
- Tablet Settings defaults to centred, with optional two-column layout. Narrow screens automatically become compact without discarding the selected preference.
- Settings changes apply immediately; groups start collapsed on a new Settings visit.
- Preserve themes, colour wheels, spacing, visual presets and existing effect controls. Explore more animations after the foundation.
- Manual Bestiary column count remains exact, even six across on a small phone. Use compact labels instead of reducing the chosen count.
- Bundle data and media together in app updates. No initial content download.

## First milestone

Prioritise launch/Overview, global search, Settings and 3D navigation. Remaining sections should show clearly labelled previews, not pretend to be finished.

## Revised development order after 0.1 device testing

The user confirmed that the APK runs on the iQOO, then chose content and all working functions before visual matching. Migrate every available reference record, complete native libraries/profiles and cross-links, then progression, maps, preferences and music. Test functionality and repair missing content before the 90–100% visual pass. Each milestone retains a GitHub tag, APK and honest release notes.
