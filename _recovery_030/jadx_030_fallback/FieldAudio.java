package com.lumina.monsterhunterfieldbook;

/* compiled from: FieldAudio.kt */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'J\u0006\u0010)\u001a\u00020*J\u0010\u0010+\u001a\n -*\u0004\u0018\u00010,0,H\u0002J\b\u0010.\u001a\u00020\u0013H\u0002J\u0006\u0010/\u001a\u00020*J\u000e\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020\u0011J\u000e\u00102\u001a\u00020*2\u0006\u00103\u001a\u00020\u0011J\b\u00104\u001a\u00020*H\u0002J\u0018\u00105\u001a\u00020*2\u0006\u00103\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u0013H\u0002J\b\u00107\u001a\u00020*H\u0002J\u0006\u00108\u001a\u00020*J\u000e\u00109\u001a\u00020*2\u0006\u0010:\u001a\u00020!J\u000e\u0010;\u001a\u00020*2\u0006\u0010<\u001a\u00020!J\u0016\u0010=\u001a\u00020*2\u0006\u00103\u001a\u00020\u00112\u0006\u0010<\u001a\u00020!J\u000e\u0010>\u001a\u00020*2\u0006\u00103\u001a\u00020\u0011J\u0006\u0010?\u001a\u00020*J\u0006\u0010@\u001a\u00020*J\b\u0010A\u001a\u00020*H\u0002J\u0006\u0010B\u001a\u00020*J\u0006\u0010C\u001a\u00020*J\u0010\u0010D\u001a\u00020*2\u0006\u0010E\u001a\u00020!H\u0016J\u0006\u0010F\u001a\u00020*R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b%\u0010#¨\u0006G"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/FieldAudio;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "context", "Landroid/content/Context;", "prefs", "Lcom/lumina/monsterhunterfieldbook/NativePrefs;", "<init>", "(Landroid/content/Context;Lcom/lumina/monsterhunterfieldbook/NativePrefs;)V", "manager", "Landroid/media/AudioManager;", "player", "Landroid/media/MediaPlayer;", "retiring", "intro", "fade", "Landroid/animation/ValueAnimator;", "edition", "", "foreground", "", "introductionDone", "focused", "prepared", "selected", "handler", "Landroid/os/Handler;", "trackId", "getTrackId", "()Ljava/lang/String;", "playing", "getPlaying", "()Z", "position", "", "getPosition", "()I", "duration", "getDuration", "tracks", "", "Lcom/lumina/monsterhunterfieldbook/MusicTrack;", "formation", "", "attributes", "Landroid/media/AudioAttributes;", "kotlin.jvm.PlatformType", "focus", "introductionFinished", "play", "next", "select", "id", "rememberPosition", "choose", "force", "crossfade", "toggle", "seek", "milliseconds", "advance", "delta", "move", "remove", "restoreBuiltins", "updateVolume", "pausePlayers", "resume", "pause", "onAudioFocusChange", "change", "release", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FieldAudio implements android.media.AudioManager.OnAudioFocusChangeListener {
    private final android.content.Context context;
    private java.lang.String edition;
    private android.animation.ValueAnimator fade;
    private boolean focused;
    private boolean foreground;
    private final android.os.Handler handler;
    private android.media.MediaPlayer intro;
    private boolean introductionDone;
    private final android.media.AudioManager manager;
    private android.media.MediaPlayer player;
    private final com.lumina.monsterhunterfieldbook.NativePrefs prefs;
    private boolean prepared;
    private android.media.MediaPlayer retiring;
    private java.lang.String selected;

    /* renamed from: $r8$lambda$0CI2-WKZdN9-K9RZOQvmUusC6I8, reason: not valid java name */
    public static /* synthetic */ void m6$r8$lambda$0CI2WKZdN9K9RZOQvmUusC6I8(android.animation.ValueAnimator r0, com.lumina.monsterhunterfieldbook.FieldAudio r1, float r2, android.animation.ValueAnimator r3) {
            crossfade$lambda$0$0(r0, r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$Z4K1fZBNG7co5AlXchKh9EE55cA(com.lumina.monsterhunterfieldbook.FieldAudio r0, java.lang.String r1, android.media.MediaPlayer r2) {
            choose$lambda$1$1(r0, r1, r2)
            return
    }

    /* renamed from: $r8$lambda$_p1W9lQudPfdzhQdi-HoVJ4FcFE, reason: not valid java name */
    public static /* synthetic */ void m7$r8$lambda$_p1W9lQudPfdzhQdiHoVJ4FcFE(int r0, com.lumina.monsterhunterfieldbook.FieldAudio r1) {
            onAudioFocusChange$lambda$0(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$oVf588d4WOjsxRjw984hjJqQC0g(com.lumina.monsterhunterfieldbook.FieldAudio r0, android.media.MediaPlayer r1) {
            formation$lambda$0$0$1(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$vnuQqQK94Ec5wnwVac4l5UL_wkU(com.lumina.monsterhunterfieldbook.FieldAudio r0, android.media.MediaPlayer r1) {
            choose$lambda$1$2(r0, r1)
            return
    }

    /* renamed from: $r8$lambda$zZ60vHDkHXgp2-cvNukoOLCwEsY, reason: not valid java name */
    public static /* synthetic */ boolean m8$r8$lambda$zZ60vHDkHXgp2cvNukoOLCwEsY(com.lumina.monsterhunterfieldbook.FieldAudio r0, android.media.MediaPlayer r1, int r2, int r3) {
            boolean r0 = choose$lambda$1$3(r0, r1, r2, r3)
            return r0
    }

    public FieldAudio(android.content.Context r2, com.lumina.monsterhunterfieldbook.NativePrefs r3) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "prefs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.context = r2
            r1.prefs = r3
            java.lang.String r3 = "audio"
            java.lang.Object r2 = r2.getSystemService(r3)
            java.lang.String r3 = "null cannot be cast to non-null type android.media.AudioManager"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)
            android.media.AudioManager r2 = (android.media.AudioManager) r2
            r1.manager = r2
            java.lang.String r2 = "world"
            r1.edition = r2
            java.lang.String r2 = ""
            r1.selected = r2
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            r1.handler = r2
            return
    }

    private final android.media.AudioAttributes attributes() {
            r2 = this;
            android.media.AudioAttributes$Builder r0 = new android.media.AudioAttributes$Builder
            r0.<init>()
            r1 = 1
            android.media.AudioAttributes$Builder r0 = r0.setUsage(r1)
            r1 = 2
            android.media.AudioAttributes$Builder r0 = r0.setContentType(r1)
            android.media.AudioAttributes r0 = r0.build()
            return r0
    }

    private final void choose(java.lang.String r10, boolean r11) {
            r9 = this;
            java.util.List r0 = r9.tracks()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            r3 = r1
            com.lumina.monsterhunterfieldbook.MusicTrack r3 = (com.lumina.monsterhunterfieldbook.MusicTrack) r3
            java.lang.String r3 = r3.getId()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r10)
            if (r3 == 0) goto La
            goto L24
        L23:
            r1 = r2
        L24:
            com.lumina.monsterhunterfieldbook.MusicTrack r1 = (com.lumina.monsterhunterfieldbook.MusicTrack) r1
            if (r1 != 0) goto L2a
            goto L101
        L2a:
            if (r11 != 0) goto L3a
            java.lang.String r11 = r9.selected
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r11)
            if (r11 == 0) goto L3a
            android.media.MediaPlayer r11 = r9.player
            if (r11 == 0) goto L3a
            goto L101
        L3a:
            r9.rememberPosition()
            android.animation.ValueAnimator r11 = r9.fade
            if (r11 == 0) goto L44
            r11.cancel()
        L44:
            android.media.MediaPlayer r11 = r9.retiring
            if (r11 == 0) goto L4b
            r11.release()
        L4b:
            android.media.MediaPlayer r11 = r9.player
            r9.retiring = r11
            r9.player = r2
            r11 = 0
            r9.prepared = r11
            r9.selected = r10
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r9.prefs
            java.lang.String r3 = "musicTrack"
            r0.set(r3, r10)
            boolean r0 = r9.foreground
            if (r0 == 0) goto L101
            boolean r0 = r9.introductionDone
            if (r0 == 0) goto L101
            boolean r0 = r9.focus()
            if (r0 != 0) goto L6d
            goto L101
        L6d:
            android.media.MediaPlayer r3 = new android.media.MediaPlayer
            r3.<init>()
            r9.player = r3
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> Le4
            r0 = r9
            com.lumina.monsterhunterfieldbook.FieldAudio r0 = (com.lumina.monsterhunterfieldbook.FieldAudio) r0     // Catch: java.lang.Throwable -> Le4
            android.media.AudioAttributes r0 = r9.attributes()     // Catch: java.lang.Throwable -> Le4
            r3.setAudioAttributes(r0)     // Catch: java.lang.Throwable -> Le4
            boolean r0 = r1.getBuiltin()     // Catch: java.lang.Throwable -> Le4
            if (r0 == 0) goto Lb7
            android.content.Context r0 = r9.context     // Catch: java.lang.Throwable -> Le4
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch: java.lang.Throwable -> Le4
            java.lang.String r1 = r1.getPath()     // Catch: java.lang.Throwable -> Le4
            android.content.res.AssetFileDescriptor r0 = r0.openFd(r1)     // Catch: java.lang.Throwable -> Le4
            r1 = r0
            java.io.Closeable r1 = (java.io.Closeable) r1     // Catch: java.lang.Throwable -> Le4
            r0 = r1
            android.content.res.AssetFileDescriptor r0 = (android.content.res.AssetFileDescriptor) r0     // Catch: java.lang.Throwable -> Laf
            java.io.FileDescriptor r4 = r0.getFileDescriptor()     // Catch: java.lang.Throwable -> Laf
            long r5 = r0.getStartOffset()     // Catch: java.lang.Throwable -> Laf
            long r7 = r0.getLength()     // Catch: java.lang.Throwable -> Laf
            r3.setDataSource(r4, r5, r7)     // Catch: java.lang.Throwable -> Laf
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Laf
            kotlin.io.CloseableKt.closeFinally(r1, r2)     // Catch: java.lang.Throwable -> Le4
            goto Lbe
        Laf:
            r0 = move-exception
            r10 = r0
            throw r10     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r1, r10)     // Catch: java.lang.Throwable -> Le4
            throw r0     // Catch: java.lang.Throwable -> Le4
        Lb7:
            java.lang.String r0 = r1.getPath()     // Catch: java.lang.Throwable -> Le4
            r3.setDataSource(r0)     // Catch: java.lang.Throwable -> Le4
        Lbe:
            r0 = 0
            r3.setVolume(r0, r0)     // Catch: java.lang.Throwable -> Le4
            com.lumina.monsterhunterfieldbook.FieldAudio$$ExternalSyntheticLambda1 r0 = new com.lumina.monsterhunterfieldbook.FieldAudio$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> Le4
            r0.<init>(r9, r10)     // Catch: java.lang.Throwable -> Le4
            r3.setOnPreparedListener(r0)     // Catch: java.lang.Throwable -> Le4
            com.lumina.monsterhunterfieldbook.FieldAudio$$ExternalSyntheticLambda2 r10 = new com.lumina.monsterhunterfieldbook.FieldAudio$$ExternalSyntheticLambda2     // Catch: java.lang.Throwable -> Le4
            r10.<init>(r9)     // Catch: java.lang.Throwable -> Le4
            r3.setOnCompletionListener(r10)     // Catch: java.lang.Throwable -> Le4
            com.lumina.monsterhunterfieldbook.FieldAudio$$ExternalSyntheticLambda3 r10 = new com.lumina.monsterhunterfieldbook.FieldAudio$$ExternalSyntheticLambda3     // Catch: java.lang.Throwable -> Le4
            r10.<init>(r9)     // Catch: java.lang.Throwable -> Le4
            r3.setOnErrorListener(r10)     // Catch: java.lang.Throwable -> Le4
            r3.prepareAsync()     // Catch: java.lang.Throwable -> Le4
            kotlin.Unit r10 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Le4
            java.lang.Object r10 = kotlin.Result.m79constructorimpl(r10)     // Catch: java.lang.Throwable -> Le4
            goto Lf0
        Le4:
            r0 = move-exception
            r10 = r0
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r10 = kotlin.ResultKt.createFailure(r10)
            java.lang.Object r10 = kotlin.Result.m79constructorimpl(r10)
        Lf0:
            java.lang.Throwable r10 = kotlin.Result.m82exceptionOrNullimpl(r10)
            if (r10 == 0) goto L101
            android.media.MediaPlayer r10 = r9.player
            if (r10 != r3) goto Lfe
            r9.prepared = r11
            r9.player = r2
        Lfe:
            r3.release()
        L101:
            return
    }

    private static final void choose$lambda$1$1(com.lumina.monsterhunterfieldbook.FieldAudio r8, java.lang.String r9, android.media.MediaPlayer r10) {
            android.media.MediaPlayer r0 = r8.player
            if (r0 == r10) goto L6
            goto L89
        L6:
            r0 = 1
            r8.prepared = r0
            com.lumina.monsterhunterfieldbook.NativePrefs r1 = r8.prefs
            java.lang.String r2 = "musicMode"
            java.lang.String r3 = "library"
            java.lang.String r1 = r1.text(r2, r3)
            java.lang.String r2 = "one"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            r10.setLooping(r1)
            com.lumina.monsterhunterfieldbook.NativePrefs r1 = r8.prefs
            java.lang.String r2 = "rememberMusicPosition"
            r3 = 0
            r4 = 2
            r5 = 0
            boolean r1 = com.lumina.monsterhunterfieldbook.NativePrefs.flag$default(r1, r2, r3, r4, r5)
            if (r1 == 0) goto L67
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L3f
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3f
            com.lumina.monsterhunterfieldbook.NativePrefs r2 = r8.prefs     // Catch: java.lang.Throwable -> L3f
            java.lang.String r6 = "musicPositions"
            java.lang.String r7 = "{}"
            java.lang.String r2 = r2.text(r6, r7)     // Catch: java.lang.Throwable -> L3f
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r1 = kotlin.Result.m79constructorimpl(r1)     // Catch: java.lang.Throwable -> L3f
            goto L4a
        L3f:
            r1 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m79constructorimpl(r1)
        L4a:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            boolean r6 = kotlin.Result.m85isFailureimpl(r1)
            if (r6 == 0) goto L56
            r1 = r2
        L56:
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            int r9 = r1.optInt(r9, r3)
            if (r0 > r9) goto L67
            int r0 = r10.getDuration()
            if (r9 >= r0) goto L67
            r10.seekTo(r9)
        L67:
            boolean r9 = r8.foreground
            if (r9 == 0) goto L89
            boolean r9 = r8.introductionDone
            if (r9 == 0) goto L89
            com.lumina.monsterhunterfieldbook.NativePrefs r9 = r8.prefs
            java.lang.String r0 = "musicEnabled"
            boolean r9 = com.lumina.monsterhunterfieldbook.NativePrefs.flag$default(r9, r0, r3, r4, r5)
            if (r9 == 0) goto L89
            com.lumina.monsterhunterfieldbook.NativePrefs r9 = r8.prefs
            java.lang.String r0 = "musicPaused"
            boolean r9 = r9.flag(r0, r3)
            if (r9 != 0) goto L89
            r10.start()
            r8.crossfade()
        L89:
            return
    }

    private static final void choose$lambda$1$2(com.lumina.monsterhunterfieldbook.FieldAudio r0, android.media.MediaPlayer r1) {
            r1 = 1
            r0.advance(r1)
            return
    }

    private static final boolean choose$lambda$1$3(com.lumina.monsterhunterfieldbook.FieldAudio r0, android.media.MediaPlayer r1, int r2, int r3) {
            android.media.MediaPlayer r2 = r0.player
            if (r2 != r1) goto La
            r2 = 0
            r0.prepared = r2
            r2 = 0
            r0.player = r2
        La:
            r1.release()
            r0 = 1
            return r0
    }

    private final void crossfade() {
            r4 = this;
            android.animation.ValueAnimator r0 = r4.fade
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r4.prefs
            java.lang.String r1 = "volume"
            r2 = 25
            int r0 = r0.number(r1, r2)
            r1 = 0
            r2 = 100
            int r0 = kotlin.ranges.RangesKt.coerceIn(r0, r1, r2)
            float r0 = (float) r0
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r1
            r1 = 2
            float[] r1 = new float[r1]
            r1 = {x003a: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            r2 = 1200(0x4b0, double:5.93E-321)
            r1.setDuration(r2)
            com.lumina.monsterhunterfieldbook.FieldAudio$$ExternalSyntheticLambda5 r2 = new com.lumina.monsterhunterfieldbook.FieldAudio$$ExternalSyntheticLambda5
            r2.<init>(r1, r4, r0)
            r1.addUpdateListener(r2)
            r1.start()
            r4.fade = r1
            return
    }

    private static final void crossfade$lambda$0$0(android.animation.ValueAnimator r2, com.lumina.monsterhunterfieldbook.FieldAudio r3, float r4, android.animation.ValueAnimator r5) {
            java.lang.String r2 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            java.lang.Object r2 = r5.getAnimatedValue()
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Float"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r5)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r5 = 0
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L33
            android.media.MediaPlayer r0 = r3.player     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L20
            float r1 = r4 * r2
            r0.setVolume(r1, r1)     // Catch: java.lang.Throwable -> L33
        L20:
            android.media.MediaPlayer r0 = r3.retiring     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L2e
            r1 = 1
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L33
            float r1 = r1 - r2
            float r4 = r4 * r1
            r0.setVolume(r4, r4)     // Catch: java.lang.Throwable -> L33
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L33
            goto L2f
        L2e:
            r4 = r5
        L2f:
            kotlin.Result.m79constructorimpl(r4)     // Catch: java.lang.Throwable -> L33
            goto L3d
        L33:
            r4 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)
            kotlin.Result.m79constructorimpl(r4)
        L3d:
            r4 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L4c
            android.media.MediaPlayer r2 = r3.retiring
            if (r2 == 0) goto L4a
            r2.release()
        L4a:
            r3.retiring = r5
        L4c:
            return
    }

    private final boolean focus() {
            r4 = this;
            boolean r0 = r4.focused
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            android.media.AudioManager r0 = r4.manager
            r2 = r4
            android.media.AudioManager$OnAudioFocusChangeListener r2 = (android.media.AudioManager.OnAudioFocusChangeListener) r2
            r3 = 3
            int r0 = r0.requestAudioFocus(r2, r3, r1)
            if (r0 != r1) goto L13
            goto L14
        L13:
            r1 = 0
        L14:
            r4.focused = r1
            return r1
    }

    private static final void formation$lambda$0$0$1(com.lumina.monsterhunterfieldbook.FieldAudio r0, android.media.MediaPlayer r1) {
            r1.release()
            r1 = 0
            r0.intro = r1
            return
    }

    private static final void onAudioFocusChange$lambda$0(int r1, com.lumina.monsterhunterfieldbook.FieldAudio r2) {
            r0 = -3
            if (r1 == r0) goto L45
            r0 = -2
            if (r1 == r0) goto L3e
            r0 = -1
            if (r1 == r0) goto L3e
            r0 = 1
            if (r1 == r0) goto Ld
            goto L65
        Ld:
            r2.focused = r0
            boolean r1 = r2.foreground
            if (r1 == 0) goto L65
            boolean r1 = r2.introductionDone
            if (r1 == 0) goto L1d
            java.lang.String r1 = r2.edition
            r2.play(r1)
            return
        L1d:
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2f
            android.media.MediaPlayer r1 = r2.intro     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L29
            r1.start()     // Catch: java.lang.Throwable -> L2f
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2f
            goto L2a
        L29:
            r1 = 0
        L2a:
            java.lang.Object r1 = kotlin.Result.m79constructorimpl(r1)     // Catch: java.lang.Throwable -> L2f
            goto L3a
        L2f:
            r1 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m79constructorimpl(r1)
        L3a:
            kotlin.Result.m78boximpl(r1)
            goto L65
        L3e:
            r1 = 0
            r2.focused = r1
            r2.pausePlayers()
            return
        L45:
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L5b
            boolean r1 = r2.prepared     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L55
            android.media.MediaPlayer r1 = r2.player     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L55
            r2 = 1025758986(0x3d23d70a, float:0.04)
            r1.setVolume(r2, r2)     // Catch: java.lang.Throwable -> L5b
        L55:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5b
            kotlin.Result.m79constructorimpl(r1)     // Catch: java.lang.Throwable -> L5b
            return
        L5b:
            r1 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            kotlin.Result.m79constructorimpl(r1)
        L65:
            return
    }

    private final void pausePlayers() {
            r3 = this;
            r3.rememberPosition()
            android.animation.ValueAnimator r0 = r3.fade
            if (r0 == 0) goto La
            r0.cancel()
        La:
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L20
            r0 = r3
            com.lumina.monsterhunterfieldbook.FieldAudio r0 = (com.lumina.monsterhunterfieldbook.FieldAudio) r0     // Catch: java.lang.Throwable -> L20
            boolean r0 = r3.prepared     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L1a
            android.media.MediaPlayer r0 = r3.player     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L1a
            r0.pause()     // Catch: java.lang.Throwable -> L20
        L1a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L20
            kotlin.Result.m79constructorimpl(r0)     // Catch: java.lang.Throwable -> L20
            goto L2a
        L20:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            kotlin.Result.m79constructorimpl(r0)
        L2a:
            r0 = 0
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L3f
            r1 = r3
            com.lumina.monsterhunterfieldbook.FieldAudio r1 = (com.lumina.monsterhunterfieldbook.FieldAudio) r1     // Catch: java.lang.Throwable -> L3f
            android.media.MediaPlayer r1 = r3.retiring     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L3a
            r1.release()     // Catch: java.lang.Throwable -> L3f
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3f
            goto L3b
        L3a:
            r1 = r0
        L3b:
            kotlin.Result.m79constructorimpl(r1)     // Catch: java.lang.Throwable -> L3f
            goto L49
        L3f:
            r1 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            kotlin.Result.m79constructorimpl(r1)
        L49:
            r3.retiring = r0
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L5d
            r1 = r3
            com.lumina.monsterhunterfieldbook.FieldAudio r1 = (com.lumina.monsterhunterfieldbook.FieldAudio) r1     // Catch: java.lang.Throwable -> L5d
            android.media.MediaPlayer r1 = r3.intro     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L59
            r1.pause()     // Catch: java.lang.Throwable -> L5d
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5d
        L59:
            kotlin.Result.m79constructorimpl(r0)     // Catch: java.lang.Throwable -> L5d
            goto L67
        L5d:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            kotlin.Result.m79constructorimpl(r0)
        L67:
            return
    }

    private final void rememberPosition() {
            r4 = this;
            java.lang.String r0 = "musicPositions"
            boolean r1 = r4.prepared
            if (r1 == 0) goto L58
            java.lang.String r1 = r4.selected
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = kotlin.text.StringsKt.isBlank(r1)
            if (r1 == 0) goto L11
            goto L58
        L11:
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L28
            r1 = r4
            com.lumina.monsterhunterfieldbook.FieldAudio r1 = (com.lumina.monsterhunterfieldbook.FieldAudio) r1     // Catch: java.lang.Throwable -> L28
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L28
            com.lumina.monsterhunterfieldbook.NativePrefs r2 = r4.prefs     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "{}"
            java.lang.String r2 = r2.text(r0, r3)     // Catch: java.lang.Throwable -> L28
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L28
            java.lang.Object r1 = kotlin.Result.m79constructorimpl(r1)     // Catch: java.lang.Throwable -> L28
            goto L33
        L28:
            r1 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m79constructorimpl(r1)
        L33:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            boolean r3 = kotlin.Result.m85isFailureimpl(r1)
            if (r3 == 0) goto L3f
            r1 = r2
        L3f:
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            java.lang.String r2 = r4.selected
            int r3 = r4.getPosition()
            r1.put(r2, r3)
            com.lumina.monsterhunterfieldbook.NativePrefs r2 = r4.prefs
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            r2.set(r0, r1)
        L58:
            return
    }

    public final void advance(int r8) {
            r7 = this;
            java.util.List r0 = r7.tracks()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lb
            return
        Lb:
            r1 = 0
            if (r8 >= 0) goto L1a
            int r2 = r7.getPosition()
            r3 = 3000(0xbb8, float:4.204E-42)
            if (r2 <= r3) goto L1a
            r7.seek(r1)
            return
        L1a:
            java.util.Iterator r2 = r0.iterator()
            r3 = r1
        L1f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L3b
            java.lang.Object r4 = r2.next()
            com.lumina.monsterhunterfieldbook.MusicTrack r4 = (com.lumina.monsterhunterfieldbook.MusicTrack) r4
            java.lang.String r4 = r4.getId()
            java.lang.String r5 = r7.selected
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r4 == 0) goto L38
            goto L3c
        L38:
            int r3 = r3 + 1
            goto L1f
        L3b:
            r3 = -1
        L3c:
            int r2 = kotlin.ranges.RangesKt.coerceAtLeast(r3, r1)
            com.lumina.monsterhunterfieldbook.NativePrefs r3 = r7.prefs
            java.lang.String r4 = "musicMode"
            java.lang.String r5 = "library"
            java.lang.String r3 = r3.text(r4, r5)
            java.lang.String r4 = "shuffle"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            r4 = 1
            if (r3 == 0) goto L97
            int r3 = r0.size()
            if (r3 <= r4) goto L97
            r8 = r0
            java.util.Collection r8 = (java.util.Collection) r8
            kotlin.ranges.IntRange r8 = kotlin.collections.CollectionsKt.getIndices(r8)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r8 = r8.iterator()
        L6d:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L84
            java.lang.Object r5 = r8.next()
            r6 = r5
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 == r2) goto L6d
            r3.add(r5)
            goto L6d
        L84:
            java.util.List r3 = (java.util.List) r3
            java.util.Collection r3 = (java.util.Collection) r3
            kotlin.random.Random$Default r8 = kotlin.random.Random.Default
            kotlin.random.Random r8 = (kotlin.random.Random) r8
            java.lang.Object r8 = kotlin.collections.CollectionsKt.random(r3, r8)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            goto La3
        L97:
            int r2 = r2 + r8
            int r8 = r0.size()
            int r2 = r2 + r8
            int r8 = r0.size()
            int r8 = r2 % r8
        La3:
            com.lumina.monsterhunterfieldbook.NativePrefs r2 = r7.prefs
            java.lang.String r3 = "followTheme"
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            r2.set(r3, r5)
            com.lumina.monsterhunterfieldbook.NativePrefs r2 = r7.prefs
            java.lang.String r3 = "musicPaused"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.set(r3, r1)
            java.lang.Object r8 = r0.get(r8)
            com.lumina.monsterhunterfieldbook.MusicTrack r8 = (com.lumina.monsterhunterfieldbook.MusicTrack) r8
            java.lang.String r8 = r8.getId()
            r7.choose(r8, r4)
            return
    }

    public final void formation() {
            r9 = this;
            boolean r0 = r9.foreground
            if (r0 == 0) goto L7b
            boolean r0 = r9.focus()
            if (r0 != 0) goto Lb
            goto L7b
        Lb:
            r1 = 0
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L64
            r0 = r9
            com.lumina.monsterhunterfieldbook.FieldAudio r0 = (com.lumina.monsterhunterfieldbook.FieldAudio) r0     // Catch: java.lang.Throwable -> L64
            android.media.MediaPlayer r2 = new android.media.MediaPlayer     // Catch: java.lang.Throwable -> L64
            r2.<init>()     // Catch: java.lang.Throwable -> L64
            android.media.AudioAttributes r0 = r9.attributes()     // Catch: java.lang.Throwable -> L64
            r2.setAudioAttributes(r0)     // Catch: java.lang.Throwable -> L64
            android.content.Context r0 = r9.context     // Catch: java.lang.Throwable -> L64
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch: java.lang.Throwable -> L64
            java.lang.String r3 = "music/formation.wav"
            android.content.res.AssetFileDescriptor r0 = r0.openFd(r3)     // Catch: java.lang.Throwable -> L64
            r8 = r0
            java.io.Closeable r8 = (java.io.Closeable) r8     // Catch: java.lang.Throwable -> L64
            r0 = r8
            android.content.res.AssetFileDescriptor r0 = (android.content.res.AssetFileDescriptor) r0     // Catch: java.lang.Throwable -> L5c
            java.io.FileDescriptor r3 = r0.getFileDescriptor()     // Catch: java.lang.Throwable -> L5c
            long r4 = r0.getStartOffset()     // Catch: java.lang.Throwable -> L5c
            long r6 = r0.getLength()     // Catch: java.lang.Throwable -> L5c
            r2.setDataSource(r3, r4, r6)     // Catch: java.lang.Throwable -> L5c
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5c
            kotlin.io.CloseableKt.closeFinally(r8, r1)     // Catch: java.lang.Throwable -> L64
            r2.prepare()     // Catch: java.lang.Throwable -> L64
            r0 = 1059481190(0x3f266666, float:0.65)
            r2.setVolume(r0, r0)     // Catch: java.lang.Throwable -> L64
            com.lumina.monsterhunterfieldbook.FieldAudio$$ExternalSyntheticLambda0 r0 = new com.lumina.monsterhunterfieldbook.FieldAudio$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L64
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L64
            r2.setOnCompletionListener(r0)     // Catch: java.lang.Throwable -> L64
            r2.start()     // Catch: java.lang.Throwable -> L64
            java.lang.Object r0 = kotlin.Result.m79constructorimpl(r2)     // Catch: java.lang.Throwable -> L64
            goto L6f
        L5c:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch: java.lang.Throwable -> L5f
        L5f:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r8, r2)     // Catch: java.lang.Throwable -> L64
            throw r0     // Catch: java.lang.Throwable -> L64
        L64:
            r0 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m79constructorimpl(r0)
        L6f:
            boolean r2 = kotlin.Result.m85isFailureimpl(r0)
            if (r2 == 0) goto L76
            goto L77
        L76:
            r1 = r0
        L77:
            android.media.MediaPlayer r1 = (android.media.MediaPlayer) r1
            r9.intro = r1
        L7b:
            return
    }

    public final int getDuration() {
            r3 = this;
            boolean r0 = r3.prepared
            r1 = 0
            if (r0 == 0) goto L3a
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L1d
            r0 = r3
            com.lumina.monsterhunterfieldbook.FieldAudio r0 = (com.lumina.monsterhunterfieldbook.FieldAudio) r0     // Catch: java.lang.Throwable -> L1d
            android.media.MediaPlayer r0 = r3.player     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L13
            int r0 = r0.getDuration()     // Catch: java.lang.Throwable -> L1d
            goto L14
        L13:
            r0 = r1
        L14:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r0 = kotlin.Result.m79constructorimpl(r0)     // Catch: java.lang.Throwable -> L1d
            goto L28
        L1d:
            r0 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m79constructorimpl(r0)
        L28:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r2 = kotlin.Result.m85isFailureimpl(r0)
            if (r2 == 0) goto L33
            r0 = r1
        L33:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
        L3a:
            return r1
    }

    public final boolean getPlaying() {
            r5 = this;
            boolean r0 = r5.prepared
            r1 = 0
            if (r0 == 0) goto L40
            r0 = 1
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L21
            r2 = r5
            com.lumina.monsterhunterfieldbook.FieldAudio r2 = (com.lumina.monsterhunterfieldbook.FieldAudio) r2     // Catch: java.lang.Throwable -> L21
            android.media.MediaPlayer r2 = r5.player     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L17
            boolean r2 = r2.isPlaying()     // Catch: java.lang.Throwable -> L21
            if (r2 != r0) goto L17
            r2 = r0
            goto L18
        L17:
            r2 = r1
        L18:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L21
            java.lang.Object r2 = kotlin.Result.m79constructorimpl(r2)     // Catch: java.lang.Throwable -> L21
            goto L2c
        L21:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r2 = kotlin.Result.m79constructorimpl(r2)
        L2c:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            boolean r4 = kotlin.Result.m85isFailureimpl(r2)
            if (r4 == 0) goto L37
            r2 = r3
        L37:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L40
            r1 = r0
        L40:
            return r1
    }

    public final int getPosition() {
            r3 = this;
            boolean r0 = r3.prepared
            r1 = 0
            if (r0 == 0) goto L3a
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L1d
            r0 = r3
            com.lumina.monsterhunterfieldbook.FieldAudio r0 = (com.lumina.monsterhunterfieldbook.FieldAudio) r0     // Catch: java.lang.Throwable -> L1d
            android.media.MediaPlayer r0 = r3.player     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L13
            int r0 = r0.getCurrentPosition()     // Catch: java.lang.Throwable -> L1d
            goto L14
        L13:
            r0 = r1
        L14:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r0 = kotlin.Result.m79constructorimpl(r0)     // Catch: java.lang.Throwable -> L1d
            goto L28
        L1d:
            r0 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m79constructorimpl(r0)
        L28:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r2 = kotlin.Result.m85isFailureimpl(r0)
            if (r2 == 0) goto L33
            r0 = r1
        L33:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
        L3a:
            return r1
    }

    public final java.lang.String getTrackId() {
            r1 = this;
            java.lang.String r0 = r1.selected
            return r0
    }

    public final void introductionFinished() {
            r1 = this;
            r0 = 1
            r1.introductionDone = r0
            java.lang.String r0 = r1.edition
            r1.play(r0)
            return
    }

    public final void move(java.lang.String r4, int r5) {
            r3 = this;
            java.lang.String r0 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.List r0 = r3.tracks()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r2)
            r1.<init>(r2)
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r0.next()
            com.lumina.monsterhunterfieldbook.MusicTrack r2 = (com.lumina.monsterhunterfieldbook.MusicTrack) r2
            java.lang.String r2 = r2.getId()
            r1.add(r2)
            goto L1c
        L30:
            java.util.List r1 = (java.util.List) r1
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.List r0 = kotlin.collections.CollectionsKt.toMutableList(r1)
            int r4 = r0.indexOf(r4)
            if (r4 >= 0) goto L3f
            return
        L3f:
            int r5 = r5 + r4
            r1 = 0
            int r2 = kotlin.collections.CollectionsKt.getLastIndex(r0)
            int r5 = kotlin.ranges.RangesKt.coerceIn(r5, r1, r2)
            java.lang.Object r4 = r0.remove(r4)
            r0.add(r5, r4)
            com.lumina.monsterhunterfieldbook.NativePrefs r4 = r3.prefs
            org.json.JSONArray r5 = new org.json.JSONArray
            java.util.Collection r0 = (java.util.Collection) r0
            r5.<init>(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            java.lang.String r0 = "trackOrder"
            r4.set(r0, r5)
            return
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int r3) {
            r2 = this;
            android.os.Handler r0 = r2.handler
            com.lumina.monsterhunterfieldbook.FieldAudio$$ExternalSyntheticLambda4 r1 = new com.lumina.monsterhunterfieldbook.FieldAudio$$ExternalSyntheticLambda4
            r1.<init>(r3, r2)
            r0.post(r1)
            return
    }

    public final void pause() {
            r3 = this;
            r0 = 0
            r3.foreground = r0
            r3.pausePlayers()
            android.media.AudioManager r1 = r3.manager
            r2 = r3
            android.media.AudioManager$OnAudioFocusChangeListener r2 = (android.media.AudioManager.OnAudioFocusChangeListener) r2
            r1.abandonAudioFocus(r2)
            r3.focused = r0
            return
    }

    public final void play(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "next"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r6.edition = r7
            boolean r0 = r6.foreground
            if (r0 == 0) goto Lb6
            boolean r0 = r6.introductionDone
            if (r0 == 0) goto Lb6
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r6.prefs
            java.lang.String r1 = "musicEnabled"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r0 = com.lumina.monsterhunterfieldbook.NativePrefs.flag$default(r0, r1, r2, r3, r4)
            if (r0 == 0) goto Lb6
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r6.prefs
            java.lang.String r1 = "musicPaused"
            boolean r0 = r0.flag(r1, r2)
            if (r0 == 0) goto L28
            goto Lb6
        L28:
            boolean r0 = r6.focus()
            if (r0 != 0) goto L2f
            return
        L2f:
            java.util.List r0 = r6.tracks()
            com.lumina.monsterhunterfieldbook.NativePrefs r1 = r6.prefs
            java.lang.String r5 = "followTheme"
            boolean r1 = com.lumina.monsterhunterfieldbook.NativePrefs.flag$default(r1, r5, r2, r3, r4)
            if (r1 == 0) goto L3e
            goto L54
        L3e:
            com.lumina.monsterhunterfieldbook.NativePrefs r1 = r6.prefs
            java.lang.String r3 = r6.selected
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r5 = kotlin.text.StringsKt.isBlank(r3)
            if (r5 == 0) goto L4b
            goto L4c
        L4b:
            r7 = r3
        L4c:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r3 = "musicTrack"
            java.lang.String r7 = r1.text(r3, r7)
        L54:
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L5b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L73
            java.lang.Object r3 = r1.next()
            r5 = r3
            com.lumina.monsterhunterfieldbook.MusicTrack r5 = (com.lumina.monsterhunterfieldbook.MusicTrack) r5
            java.lang.String r5 = r5.getId()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r7)
            if (r5 == 0) goto L5b
            r4 = r3
        L73:
            com.lumina.monsterhunterfieldbook.MusicTrack r4 = (com.lumina.monsterhunterfieldbook.MusicTrack) r4
            if (r4 != 0) goto L7e
            java.lang.Object r7 = kotlin.collections.CollectionsKt.firstOrNull(r0)
            r4 = r7
            com.lumina.monsterhunterfieldbook.MusicTrack r4 = (com.lumina.monsterhunterfieldbook.MusicTrack) r4
        L7e:
            if (r4 != 0) goto L84
            r6.pausePlayers()
            return
        L84:
            java.lang.String r7 = r6.selected
            java.lang.String r0 = r4.getId()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r0)
            if (r7 == 0) goto Lae
            android.media.MediaPlayer r7 = r6.player
            if (r7 != 0) goto L95
            goto Lae
        L95:
            boolean r7 = r6.prepared
            if (r7 == 0) goto Laa
            boolean r7 = r6.getPlaying()
            if (r7 != 0) goto Laa
            android.media.MediaPlayer r7 = r6.player
            if (r7 == 0) goto La6
            r7.start()
        La6:
            r6.crossfade()
            return
        Laa:
            r6.updateVolume()
            return
        Lae:
            java.lang.String r7 = r4.getId()
            r6.choose(r7, r2)
            return
        Lb6:
            r6.pausePlayers()
            return
    }

    public final void release() {
            r2 = this;
            r2.pause()
            android.media.MediaPlayer r0 = r2.intro
            if (r0 == 0) goto La
            r0.release()
        La:
            android.media.MediaPlayer r0 = r2.player
            if (r0 == 0) goto L11
            r0.release()
        L11:
            r0 = 0
            r2.intro = r0
            r2.player = r0
            android.os.Handler r1 = r2.handler
            r1.removeCallbacksAndMessages(r0)
            return
    }

    public final void remove(java.lang.String r13) {
            r12 = this;
            java.lang.String r0 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.util.List r1 = r12.tracks()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L28
            java.lang.Object r2 = r1.next()
            r4 = r2
            com.lumina.monsterhunterfieldbook.MusicTrack r4 = (com.lumina.monsterhunterfieldbook.MusicTrack) r4
            java.lang.String r4 = r4.getId()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r13)
            if (r4 == 0) goto Lf
            goto L29
        L28:
            r2 = r3
        L29:
            com.lumina.monsterhunterfieldbook.MusicTrack r2 = (com.lumina.monsterhunterfieldbook.MusicTrack) r2
            if (r2 != 0) goto L2f
            goto Lb8
        L2f:
            boolean r1 = r2.getBuiltin()
            java.lang.String r4 = "toString(...)"
            r5 = 0
            java.lang.String r6 = "[]"
            if (r1 == 0) goto L57
            org.json.JSONArray r0 = new org.json.JSONArray
            com.lumina.monsterhunterfieldbook.NativePrefs r1 = r12.prefs
            java.lang.String r2 = "hiddenTracks"
            java.lang.String r1 = r1.text(r2, r6)
            r0.<init>(r1)
            r0.put(r13)
            com.lumina.monsterhunterfieldbook.NativePrefs r1 = r12.prefs
            java.lang.String r0 = r0.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            r1.set(r2, r0)
            goto L9c
        L57:
            org.json.JSONArray r1 = new org.json.JSONArray
            com.lumina.monsterhunterfieldbook.NativePrefs r7 = r12.prefs
            java.lang.String r8 = "tracks"
            java.lang.String r6 = r7.text(r8, r6)
            r1.<init>(r6)
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            int r7 = r1.length()
            r9 = r5
        L6e:
            if (r9 >= r7) goto L84
            org.json.JSONObject r10 = r1.getJSONObject(r9)
            java.lang.String r11 = r10.optString(r0)
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r13)
            if (r11 != 0) goto L81
            r6.put(r10)
        L81:
            int r9 = r9 + 1
            goto L6e
        L84:
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r12.prefs
            java.lang.String r1 = r6.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            r0.set(r8, r1)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r2.getPath()
            r0.<init>(r1)
            r0.delete()
        L9c:
            java.lang.String r0 = r12.selected
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r13)
            if (r13 == 0) goto Lb8
            android.media.MediaPlayer r13 = r12.player
            if (r13 == 0) goto Lab
            r13.release()
        Lab:
            r12.player = r3
            r12.prepared = r5
            java.lang.String r13 = ""
            r12.selected = r13
            java.lang.String r13 = r12.edition
            r12.play(r13)
        Lb8:
            return
    }

    public final void restoreBuiltins() {
            r3 = this;
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r3.prefs
            java.lang.String r1 = "hiddenTracks"
            java.lang.String r2 = "[]"
            r0.set(r1, r2)
            java.lang.String r0 = r3.edition
            r3.play(r0)
            return
    }

    public final void resume() {
            r2 = this;
            r0 = 1
            r2.foreground = r0
            boolean r0 = r2.introductionDone
            if (r0 == 0) goto Ld
            java.lang.String r0 = r2.edition
            r2.play(r0)
            return
        Ld:
            android.media.MediaPlayer r0 = r2.intro
            if (r0 == 0) goto L35
            boolean r0 = r2.focus()
            if (r0 == 0) goto L35
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2b
            r0 = r2
            com.lumina.monsterhunterfieldbook.FieldAudio r0 = (com.lumina.monsterhunterfieldbook.FieldAudio) r0     // Catch: java.lang.Throwable -> L2b
            android.media.MediaPlayer r0 = r2.intro     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L26
            r0.start()     // Catch: java.lang.Throwable -> L2b
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2b
            goto L27
        L26:
            r0 = 0
        L27:
            kotlin.Result.m79constructorimpl(r0)     // Catch: java.lang.Throwable -> L2b
            return
        L2b:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            kotlin.Result.m79constructorimpl(r0)
        L35:
            return
    }

    public final void seek(int r4) {
            r3 = this;
            boolean r0 = r3.prepared
            if (r0 == 0) goto L2c
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L22
            r0 = r3
            com.lumina.monsterhunterfieldbook.FieldAudio r0 = (com.lumina.monsterhunterfieldbook.FieldAudio) r0     // Catch: java.lang.Throwable -> L22
            android.media.MediaPlayer r0 = r3.player     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L19
            int r1 = r3.getDuration()     // Catch: java.lang.Throwable -> L22
            r2 = 0
            int r4 = kotlin.ranges.RangesKt.coerceIn(r4, r2, r1)     // Catch: java.lang.Throwable -> L22
            r0.seekTo(r4)     // Catch: java.lang.Throwable -> L22
        L19:
            r3.rememberPosition()     // Catch: java.lang.Throwable -> L22
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L22
            kotlin.Result.m79constructorimpl(r4)     // Catch: java.lang.Throwable -> L22
            return
        L22:
            r4 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)
            kotlin.Result.m79constructorimpl(r4)
        L2c:
            return
    }

    public final void select(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r4.prefs
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "followTheme"
            r0.set(r2, r1)
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r4.prefs
            java.lang.String r2 = "musicTrack"
            r0.set(r2, r5)
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r4.prefs
            java.lang.String r2 = "musicPaused"
            r0.set(r2, r1)
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r4.prefs
            r1 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.String r3 = "musicEnabled"
            r0.set(r3, r2)
            r4.choose(r5, r1)
            return
    }

    public final void toggle() {
            r4 = this;
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r4.prefs
            r1 = 0
            java.lang.String r2 = "musicPaused"
            boolean r0 = r0.flag(r2, r1)
            r1 = r0 ^ 1
            com.lumina.monsterhunterfieldbook.NativePrefs r3 = r4.prefs
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r3.set(r2, r1)
            if (r0 != 0) goto L1a
            r4.pausePlayers()
            return
        L1a:
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r4.prefs
            java.lang.String r1 = "musicEnabled"
            r2 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.set(r1, r2)
            java.lang.String r0 = r4.edition
            r4.play(r0)
            return
    }

    public final java.util.List<com.lumina.monsterhunterfieldbook.MusicTrack> tracks() {
            r15 = this;
            java.lang.String r0 = "[]"
            r1 = 2
            com.lumina.monsterhunterfieldbook.MusicTrack[] r1 = new com.lumina.monsterhunterfieldbook.MusicTrack[r1]
            com.lumina.monsterhunterfieldbook.MusicTrack r2 = new com.lumina.monsterhunterfieldbook.MusicTrack
            java.lang.String r3 = "world"
            java.lang.String r4 = "Stars at Our Backs"
            java.lang.String r5 = "music/world.mp3"
            r6 = 1
            r2.<init>(r3, r4, r5, r6)
            r3 = 0
            r1[r3] = r2
            com.lumina.monsterhunterfieldbook.MusicTrack r2 = new com.lumina.monsterhunterfieldbook.MusicTrack
            java.lang.String r4 = "Nay! The Honor is All Ours"
            java.lang.String r5 = "music/iceborne.mp3"
            java.lang.String r7 = "iceborne"
            r2.<init>(r7, r4, r5, r6)
            r1[r6] = r2
            java.util.List r1 = kotlin.collections.CollectionsKt.mutableListOf(r1)
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L3c
            r2 = r15
            com.lumina.monsterhunterfieldbook.FieldAudio r2 = (com.lumina.monsterhunterfieldbook.FieldAudio) r2     // Catch: java.lang.Throwable -> L3c
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L3c
            com.lumina.monsterhunterfieldbook.NativePrefs r4 = r15.prefs     // Catch: java.lang.Throwable -> L3c
            java.lang.String r5 = "tracks"
            java.lang.String r4 = r4.text(r5, r0)     // Catch: java.lang.Throwable -> L3c
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = kotlin.Result.m79constructorimpl(r2)     // Catch: java.lang.Throwable -> L3c
            goto L47
        L3c:
            r2 = move-exception
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r2 = kotlin.Result.m79constructorimpl(r2)
        L47:
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            boolean r5 = kotlin.Result.m85isFailureimpl(r2)
            if (r5 == 0) goto L53
            r2 = r4
        L53:
            org.json.JSONArray r2 = (org.json.JSONArray) r2
            int r4 = r2.length()
            r5 = r3
        L5a:
            if (r5 >= r4) goto Ldd
            org.json.JSONObject r6 = r2.getJSONObject(r5)
            java.lang.String r7 = "file"
            java.lang.String r7 = r6.optString(r7)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            r8 = r7
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            kotlin.text.Regex r9 = new kotlin.text.Regex
            java.lang.String r10 = "custom-[a-f0-9-]+\\.audio"
            r9.<init>(r10)
            boolean r8 = r9.matches(r8)
            if (r8 == 0) goto Ld9
            java.io.File r8 = new java.io.File
            android.content.Context r9 = r15.context
            java.io.File r9 = r9.getFilesDir()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "music/"
            r10.<init>(r11)
            java.lang.StringBuilder r10 = r10.append(r7)
            java.lang.String r10 = r10.toString()
            r8.<init>(r9, r10)
            boolean r8 = r8.exists()
            if (r8 == 0) goto Ld9
            r8 = r1
            java.util.Collection r8 = (java.util.Collection) r8
            com.lumina.monsterhunterfieldbook.MusicTrack r9 = new com.lumina.monsterhunterfieldbook.MusicTrack
            java.lang.String r10 = "id"
            java.lang.String r10 = r6.getString(r10)
            java.lang.String r12 = "getString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r12)
            java.lang.String r13 = "title"
            java.lang.String r6 = r6.getString(r13)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r12)
            java.io.File r12 = new java.io.File
            android.content.Context r13 = r15.context
            java.io.File r13 = r13.getFilesDir()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r11)
            java.lang.StringBuilder r7 = r14.append(r7)
            java.lang.String r7 = r7.toString()
            r12.<init>(r13, r7)
            java.lang.String r7 = r12.getPath()
            java.lang.String r11 = "getPath(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r11)
            r9.<init>(r10, r6, r7, r3)
            r8.add(r9)
        Ld9:
            int r5 = r5 + 1
            goto L5a
        Ldd:
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> Lf4
            r2 = r15
            com.lumina.monsterhunterfieldbook.FieldAudio r2 = (com.lumina.monsterhunterfieldbook.FieldAudio) r2     // Catch: java.lang.Throwable -> Lf4
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Lf4
            com.lumina.monsterhunterfieldbook.NativePrefs r4 = r15.prefs     // Catch: java.lang.Throwable -> Lf4
            java.lang.String r5 = "hiddenTracks"
            java.lang.String r4 = r4.text(r5, r0)     // Catch: java.lang.Throwable -> Lf4
            r2.<init>(r4)     // Catch: java.lang.Throwable -> Lf4
            java.lang.Object r2 = kotlin.Result.m79constructorimpl(r2)     // Catch: java.lang.Throwable -> Lf4
            goto Lff
        Lf4:
            r2 = move-exception
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r2 = kotlin.Result.m79constructorimpl(r2)
        Lff:
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            boolean r5 = kotlin.Result.m85isFailureimpl(r2)
            if (r5 == 0) goto L10b
            r2 = r4
        L10b:
            org.json.JSONArray r2 = (org.json.JSONArray) r2
            int r4 = r2.length()
            kotlin.ranges.IntRange r4 = kotlin.ranges.RangesKt.until(r3, r4)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r7 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r4, r6)
            r5.<init>(r7)
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.Iterator r4 = r4.iterator()
        L128:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L13d
            r7 = r4
            kotlin.collections.IntIterator r7 = (kotlin.collections.IntIterator) r7
            int r7 = r7.nextInt()
            java.lang.String r7 = r2.getString(r7)
            r5.add(r7)
            goto L128
        L13d:
            java.util.List r5 = (java.util.List) r5
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L156
            r2 = r15
            com.lumina.monsterhunterfieldbook.FieldAudio r2 = (com.lumina.monsterhunterfieldbook.FieldAudio) r2     // Catch: java.lang.Throwable -> L156
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L156
            com.lumina.monsterhunterfieldbook.NativePrefs r4 = r15.prefs     // Catch: java.lang.Throwable -> L156
            java.lang.String r7 = "trackOrder"
            java.lang.String r0 = r4.text(r7, r0)     // Catch: java.lang.Throwable -> L156
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L156
            java.lang.Object r0 = kotlin.Result.m79constructorimpl(r2)     // Catch: java.lang.Throwable -> L156
            goto L161
        L156:
            r0 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m79constructorimpl(r0)
        L161:
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            boolean r4 = kotlin.Result.m85isFailureimpl(r0)
            if (r4 == 0) goto L16d
            r0 = r2
        L16d:
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            int r2 = r0.length()
            kotlin.ranges.IntRange r2 = kotlin.ranges.RangesKt.until(r3, r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r6)
            r3.<init>(r4)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r2 = r2.iterator()
        L188:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L19d
            r4 = r2
            kotlin.collections.IntIterator r4 = (kotlin.collections.IntIterator) r4
            int r4 = r4.nextInt()
            java.lang.String r4 = r0.getString(r4)
            r3.add(r4)
            goto L188
        L19d:
            java.util.List r3 = (java.util.List) r3
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r1 = r1.iterator()
        L1ac:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1c7
            java.lang.Object r2 = r1.next()
            r4 = r2
            com.lumina.monsterhunterfieldbook.MusicTrack r4 = (com.lumina.monsterhunterfieldbook.MusicTrack) r4
            java.lang.String r4 = r4.getId()
            boolean r4 = r5.contains(r4)
            if (r4 != 0) goto L1ac
            r0.add(r2)
            goto L1ac
        L1c7:
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            com.lumina.monsterhunterfieldbook.FieldAudio$tracks$$inlined$sortedBy$1 r1 = new com.lumina.monsterhunterfieldbook.FieldAudio$tracks$$inlined$sortedBy$1
            r1.<init>(r3)
            java.util.Comparator r1 = (java.util.Comparator) r1
            java.util.List r0 = kotlin.collections.CollectionsKt.sortedWith(r0, r1)
            return r0
    }

    public final void updateVolume() {
            r4 = this;
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r4.prefs
            java.lang.String r1 = "volume"
            r2 = 25
            int r0 = r0.number(r1, r2)
            r1 = 0
            r2 = 100
            int r0 = kotlin.ranges.RangesKt.coerceIn(r0, r1, r2)
            float r0 = (float) r0
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r1
            boolean r1 = r4.prepared
            if (r1 == 0) goto L4c
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L42
            r1 = r4
            com.lumina.monsterhunterfieldbook.FieldAudio r1 = (com.lumina.monsterhunterfieldbook.FieldAudio) r1     // Catch: java.lang.Throwable -> L42
            android.media.MediaPlayer r1 = r4.player     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L25
            r1.setVolume(r0, r0)     // Catch: java.lang.Throwable -> L42
        L25:
            android.media.MediaPlayer r0 = r4.player     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L3c
            com.lumina.monsterhunterfieldbook.NativePrefs r1 = r4.prefs     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "musicMode"
            java.lang.String r3 = "library"
            java.lang.String r1 = r1.text(r2, r3)     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "one"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)     // Catch: java.lang.Throwable -> L42
            r0.setLooping(r1)     // Catch: java.lang.Throwable -> L42
        L3c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L42
            kotlin.Result.m79constructorimpl(r0)     // Catch: java.lang.Throwable -> L42
            return
        L42:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            kotlin.Result.m79constructorimpl(r0)
        L4c:
            return
    }
}
