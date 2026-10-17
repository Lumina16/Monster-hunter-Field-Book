# Architecture

The deliverable is one offline HTML file. It has no backend, user account service or build-time network dependency.

| Path | Purpose |
| --- | --- |
| `src/template.html` | Document shell and insertion markers |
| `src/styles.css` | Complete app styling, responsive rules, fonts and animation rules |
| `src/app.js` | Runtime UI, navigation, databases, local preferences and interactions |
| `data/manifest.json` | Ordered map of top-level guide data |
| `data/**/*.json` | Frozen, editable guide records and source credits |
| `assets/embedded/<sha256>/*.txt` | Original data-URI media, divided into bounded ordered chunks |
| `build.py` | Offline assembly with asset checksum validation |
| `qa/` | Current package regression checks |

The builder expands `$include`, `$concat` and `$embedded` references, serialises guide data, and inserts it with the runtime and styles into the template. Embedded-asset hashes refer to the full original data-URI string, not only its decoded binary payload. Media chunks are text to preserve exact embedded bytes across distribution.

Data remains separate from the runtime so future ports can reuse the records and assets. The current JavaScript includes successive feature layers from development; this recovery retains that behaviour rather than rewriting it during publication.

The pre-fix recovery build matched the saved completed HTML exactly: SHA-256 `d4deb6eec9c9da70dfc3bf1fd689ab37c3205757f425e6439a8bea1f0e2f7aaf`. The release includes the subsequent Settings collapse/spacing fixes.

Browser storage retains preferences and progress. Music-library storage uses browser facilities where available. The app includes backup and restore controls; it does not synchronise personal data to a server.
