package com.lumina.monsterhunterfieldbook;

/* compiled from: BackupController.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J \u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0006\u0010\u001c\u001a\u00020\u0011J\u0006\u0010\u001d\u001a\u00020\u0011J\u0006\u0010\u001e\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/BackupController;", "", "a", "Lcom/lumina/monsterhunterfieldbook/MainActivity;", "<init>", "(Lcom/lumina/monsterhunterfieldbook/MainActivity;)V", "executor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "pendingExport", "", "appearance", "", "motion", "browsing", "personal", "export", "", "importBackup", "onResult", "request", "", "result", "data", "Landroid/content/Intent;", "confirmImport", "values", "Lorg/json/JSONObject;", "resetAllSettings", "selectiveReset", "release", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BackupController {
    private final com.lumina.monsterhunterfieldbook.MainActivity a;
    private final java.util.Set<java.lang.String> appearance;
    private final java.util.Set<java.lang.String> browsing;
    private final java.util.concurrent.ExecutorService executor;
    private final java.util.Set<java.lang.String> motion;
    private java.lang.String pendingExport;
    private final java.util.Set<java.lang.String> personal;

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$6RcCG4ffmkpXhGWsqCvfQxQvAMY(java.lang.String[] r0, int r1) {
            java.lang.CharSequence r0 = selectiveReset$lambda$1$1(r0, r1)
            return r0
    }

    /* renamed from: $r8$lambda$Fy03wK-dpApt8C_PRibFg3hxNrc, reason: not valid java name */
    public static /* synthetic */ void m0$r8$lambda$Fy03wKdpApt8C_PRibFg3hxNrc(android.app.AlertDialog r0, android.widget.CompoundButton r1, boolean r2) {
            resetAllSettings$lambda$2(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$SNH6ukstW0hP6cd3Mb8H9SBJLoE(boolean[] r0, android.content.DialogInterface r1, int r2, boolean r3) {
            selectiveReset$lambda$0(r0, r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$XW_EqDobWBh4PYjINAmUPrpLe7Q(com.lumina.monsterhunterfieldbook.BackupController r0, int r1, android.net.Uri r2) {
            onResult$lambda$0(r0, r1, r2)
            return
    }

    /* renamed from: $r8$lambda$YbHkk4-k-yKLqdIyor10_D-4RIw, reason: not valid java name */
    public static /* synthetic */ void m1$r8$lambda$YbHkk4kyKLqdIyor10_D4RIw(com.lumina.monsterhunterfieldbook.BackupController r0, org.json.JSONObject r1, android.content.DialogInterface r2, int r3) {
            confirmImport$lambda$1(r0, r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$YzQxyXyB27ieXYR2tOU7AvdXDho(android.widget.CheckBox r0, com.lumina.monsterhunterfieldbook.BackupController r1, android.content.DialogInterface r2, int r3) {
            resetAllSettings$lambda$1(r0, r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$dDXkdUy5OlCCLRyyc9f648Fpayo(com.lumina.monsterhunterfieldbook.BackupController r0, java.util.List r1, android.content.DialogInterface r2, int r3) {
            selectiveReset$lambda$1$2(r0, r1, r2, r3)
            return
    }

    /* renamed from: $r8$lambda$dNkoDx89kUzTv8q-AEZc4d7wQKQ, reason: not valid java name */
    public static /* synthetic */ boolean m2$r8$lambda$dNkoDx89kUzTv8qAEZc4d7wQKQ(java.util.List r0, com.lumina.monsterhunterfieldbook.BackupController r1, java.lang.String r2) {
            boolean r0 = selectiveReset$lambda$1$2$0(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$oaNXtApCWb153WMxIFZAmsoDOTY(boolean[] r0, com.lumina.monsterhunterfieldbook.BackupController r1, java.lang.String[] r2, android.content.DialogInterface r3, int r4) {
            selectiveReset$lambda$1(r0, r1, r2, r3, r4)
            return
    }

    /* renamed from: $r8$lambda$s_mm1-D3waOsupm6BgSwJp7opNQ, reason: not valid java name */
    public static /* synthetic */ void m3$r8$lambda$s_mm1D3waOsupm6BgSwJp7opNQ(com.lumina.monsterhunterfieldbook.BackupController r0, java.lang.Object r1) {
            onResult$lambda$0$1(r0, r1)
            return
    }

    public BackupController(com.lumina.monsterhunterfieldbook.MainActivity r15) {
            r14 = this;
            java.lang.String r0 = "a"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r14.<init>()
            r14.a = r15
            java.util.concurrent.ExecutorService r15 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r14.executor = r15
            java.lang.String r15 = ""
            r14.pendingExport = r15
            r15 = 13
            java.lang.String[] r15 = new java.lang.String[r15]
            java.lang.String r0 = "font"
            r1 = 0
            r15[r1] = r0
            java.lang.String r0 = "lineSpacing"
            r2 = 1
            r15[r2] = r0
            java.lang.String r0 = "letterSpacing"
            r3 = 2
            r15[r3] = r0
            java.lang.String r0 = "wordSpacing"
            r4 = 3
            r15[r4] = r0
            java.lang.String r0 = "density"
            r5 = 4
            r15[r5] = r0
            java.lang.String r0 = "iconSize"
            r6 = 5
            r15[r6] = r0
            java.lang.String r0 = "theme"
            r7 = 6
            r15[r7] = r0
            java.lang.String r0 = "customBg"
            r8 = 7
            r15[r8] = r0
            java.lang.String r0 = "customAccent"
            r9 = 8
            r15[r9] = r0
            java.lang.String r0 = "customInk"
            r10 = 9
            r15[r10] = r0
            java.lang.String r0 = "gradients"
            r11 = 10
            r15[r11] = r0
            java.lang.String r0 = "gradientStrength"
            r12 = 11
            r15[r12] = r0
            r0 = 12
            java.lang.String r13 = "gradientAngle"
            r15[r0] = r13
            java.util.Set r15 = kotlin.collections.SetsKt.setOf(r15)
            r14.appearance = r15
            java.lang.String[] r15 = new java.lang.String[r10]
            java.lang.String r0 = "animations"
            r15[r1] = r0
            java.lang.String r0 = "speed"
            r15[r2] = r0
            java.lang.String r0 = "transition"
            r15[r3] = r0
            java.lang.String r0 = "touch"
            r15[r4] = r0
            java.lang.String r0 = "glow"
            r15[r5] = r0
            java.lang.String r0 = "particles"
            r15[r6] = r0
            java.lang.String r0 = "blur"
            r15[r7] = r0
            java.lang.String r0 = "imageMotion"
            r15[r8] = r0
            java.lang.String r0 = "performance"
            r15[r9] = r0
            java.util.Set r15 = kotlin.collections.SetsKt.setOf(r15)
            r14.motion = r15
            java.lang.String[] r15 = new java.lang.String[r12]
            java.lang.String r0 = "startup"
            r15[r1] = r0
            java.lang.String r0 = "lastSection"
            r15[r2] = r0
            java.lang.String r0 = "settingsLayout"
            r15[r3] = r0
            java.lang.String r0 = "confirmExit"
            r15[r4] = r0
            java.lang.String r0 = "rememberScroll"
            r15[r5] = r0
            java.lang.String r0 = "singleGroup"
            r15[r6] = r0
            java.lang.String r0 = "rememberGroups"
            r15[r7] = r0
            java.lang.String r0 = "searchHistory"
            r15[r8] = r0
            java.lang.String r0 = "readingGroups"
            r15[r9] = r0
            java.lang.String r0 = "columns"
            r15[r10] = r0
            java.lang.String r0 = "rows"
            r15[r11] = r0
            java.util.Set r15 = kotlin.collections.SetsKt.setOf(r15)
            r14.browsing = r15
            java.lang.String[] r15 = new java.lang.String[r10]
            java.lang.String r0 = "bookmarks"
            r15[r1] = r0
            java.lang.String r0 = "recent"
            r15[r2] = r0
            java.lang.String r0 = "visualProfiles"
            r15[r3] = r0
            java.lang.String r0 = "campChecks"
            r15[r4] = r0
            java.lang.String r0 = "tracks"
            r15[r5] = r0
            java.lang.String r0 = "musicPositions"
            r15[r6] = r0
            java.lang.String r0 = "edition"
            r15[r7] = r0
            java.lang.String r0 = "trackOrder"
            r15[r8] = r0
            java.lang.String r0 = "hiddenTracks"
            r15[r9] = r0
            java.util.Set r15 = kotlin.collections.SetsKt.setOf(r15)
            r14.personal = r15
            return
    }

    private final void confirmImport(org.json.JSONObject r5) {
            r4 = this;
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L1f
            r0 = r4
            com.lumina.monsterhunterfieldbook.BackupController r0 = (com.lumina.monsterhunterfieldbook.BackupController) r0     // Catch: java.lang.Throwable -> L1f
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "bookmarks"
            java.lang.String r2 = "[]"
            java.lang.String r1 = r5.optString(r1, r2)     // Catch: java.lang.Throwable -> L1f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1f
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L1f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = kotlin.Result.m79constructorimpl(r0)     // Catch: java.lang.Throwable -> L1f
            goto L2a
        L1f:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m79constructorimpl(r0)
        L2a:
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r2 = kotlin.Result.m85isFailureimpl(r0)
            if (r2 == 0) goto L36
            r0 = r1
        L36:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r4.a
            android.content.Context r2 = (android.content.Context) r2
            r1.<init>(r2)
            java.lang.String r2 = "Restore native backup?"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            android.app.AlertDialog$Builder r1 = r1.setTitle(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Restores settings, filters, "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = " bookmarks and saved progress from this file. Imported music files stay on this device."
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            android.app.AlertDialog$Builder r0 = r1.setMessage(r0)
            java.lang.String r1 = "Cancel"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            java.lang.String r1 = "Restore"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            com.lumina.monsterhunterfieldbook.BackupController$$ExternalSyntheticLambda1 r2 = new com.lumina.monsterhunterfieldbook.BackupController$$ExternalSyntheticLambda1
            r2.<init>(r4, r5)
            android.app.AlertDialog$Builder r5 = r0.setPositiveButton(r1, r2)
            r5.show()
            return
    }

    private static final void confirmImport$lambda$1(com.lumina.monsterhunterfieldbook.BackupController r1, org.json.JSONObject r2, android.content.DialogInterface r3, int r4) {
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = 0
            java.lang.String r0 = "tracks"
            r3[r4] = r0
            r4 = 1
            java.lang.String r0 = "trackOrder"
            r3[r4] = r0
            r4 = 2
            java.lang.String r0 = "hiddenTracks"
            r3[r4] = r0
            java.util.List r3 = kotlin.collections.CollectionsKt.listOf(r3)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L1c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r1.a
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r0.getPrefs()
            org.json.JSONObject r0 = r0.getValues()
            boolean r0 = r0.has(r4)
            if (r0 == 0) goto L1c
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r1.a
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r0.getPrefs()
            org.json.JSONObject r0 = r0.getValues()
            java.lang.Object r0 = r0.get(r4)
            r2.put(r4, r0)
            goto L1c
        L4a:
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r1.a
            com.lumina.monsterhunterfieldbook.NativePrefs r3 = r3.getPrefs()
            r3.applySnapshot(r2)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r1.a
            r2.reloadStoredState()
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r1.a
            java.lang.String r3 = "reset"
            r2.afterPreference(r3)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r1.a
            r2.rebuildSettings()
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r1.a
            java.lang.String r2 = "Backup restored."
            r1.toast(r2)
            return
    }

    private static final void onResult$lambda$0(com.lumina.monsterhunterfieldbook.BackupController r7, int r8, android.net.Uri r9) {
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L9e
            r0 = 701(0x2bd, float:9.82E-43)
            r1 = 8192(0x2000, float:1.148E-41)
            r2 = 0
            if (r8 != r0) goto L45
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r7.a     // Catch: java.lang.Throwable -> L9e
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r0 = "wt"
            java.io.OutputStream r8 = r8.openOutputStream(r9, r0)     // Catch: java.lang.Throwable -> L9e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)     // Catch: java.lang.Throwable -> L9e
            java.nio.charset.Charset r9 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.Throwable -> L9e
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L9e
            r0.<init>(r8, r9)     // Catch: java.lang.Throwable -> L9e
            java.io.Writer r0 = (java.io.Writer) r0     // Catch: java.lang.Throwable -> L9e
            boolean r8 = r0 instanceof java.io.BufferedWriter     // Catch: java.lang.Throwable -> L9e
            if (r8 == 0) goto L28
            java.io.BufferedWriter r0 = (java.io.BufferedWriter) r0     // Catch: java.lang.Throwable -> L9e
            goto L2e
        L28:
            java.io.BufferedWriter r8 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L9e
            r8.<init>(r0, r1)     // Catch: java.lang.Throwable -> L9e
            r0 = r8
        L2e:
            java.io.Closeable r0 = (java.io.Closeable) r0     // Catch: java.lang.Throwable -> L9e
            r8 = r0
            java.io.BufferedWriter r8 = (java.io.BufferedWriter) r8     // Catch: java.lang.Throwable -> L3e
            java.lang.String r9 = r7.pendingExport     // Catch: java.lang.Throwable -> L3e
            r8.write(r9)     // Catch: java.lang.Throwable -> L3e
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3e
            kotlin.io.CloseableKt.closeFinally(r0, r2)     // Catch: java.lang.Throwable -> L9e
            goto L92
        L3e:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> L40
        L40:
            r9 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r8)     // Catch: java.lang.Throwable -> L9e
            throw r9     // Catch: java.lang.Throwable -> L9e
        L45:
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r7.a     // Catch: java.lang.Throwable -> L9e
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L9e
            java.io.InputStream r8 = r8.openInputStream(r9)     // Catch: java.lang.Throwable -> L9e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)     // Catch: java.lang.Throwable -> L9e
            java.io.Closeable r8 = (java.io.Closeable) r8     // Catch: java.lang.Throwable -> L9e
            r9 = r8
            java.io.InputStream r9 = (java.io.InputStream) r9     // Catch: java.lang.Throwable -> L97
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L97
            r0.<init>()     // Catch: java.lang.Throwable -> L97
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L97
            r3 = 0
            r4 = r3
        L60:
            int r5 = r9.read(r1)     // Catch: java.lang.Throwable -> L97
            if (r5 < 0) goto L7b
            int r4 = r4 + r5
            r6 = 2097152(0x200000, float:2.938736E-39)
            if (r4 > r6) goto L6f
            r0.write(r1, r3, r5)     // Catch: java.lang.Throwable -> L97
            goto L60
        L6f:
            java.lang.String r9 = "Backup is too large."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L97
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L97
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L97
            throw r0     // Catch: java.lang.Throwable -> L97
        L7b:
            byte[] r9 = r0.toByteArray()     // Catch: java.lang.Throwable -> L97
            kotlin.io.CloseableKt.closeFinally(r8, r2)     // Catch: java.lang.Throwable -> L9e
            com.lumina.monsterhunterfieldbook.NativeBackup r8 = com.lumina.monsterhunterfieldbook.NativeBackup.INSTANCE     // Catch: java.lang.Throwable -> L9e
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L9e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)     // Catch: java.lang.Throwable -> L9e
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.Throwable -> L9e
            r0.<init>(r9, r1)     // Catch: java.lang.Throwable -> L9e
            org.json.JSONObject r2 = r8.decode(r0)     // Catch: java.lang.Throwable -> L9e
        L92:
            java.lang.Object r8 = kotlin.Result.m79constructorimpl(r2)     // Catch: java.lang.Throwable -> L9e
            goto La9
        L97:
            r9 = move-exception
            throw r9     // Catch: java.lang.Throwable -> L99
        L99:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r8, r9)     // Catch: java.lang.Throwable -> L9e
            throw r0     // Catch: java.lang.Throwable -> L9e
        L9e:
            r8 = move-exception
            kotlin.Result$Companion r9 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.m79constructorimpl(r8)
        La9:
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r7.a
            com.lumina.monsterhunterfieldbook.BackupController$$ExternalSyntheticLambda0 r0 = new com.lumina.monsterhunterfieldbook.BackupController$$ExternalSyntheticLambda0
            r0.<init>(r7, r8)
            r9.runOnUiThread(r0)
            return
    }

    private static final void onResult$lambda$0$1(com.lumina.monsterhunterfieldbook.BackupController r2, java.lang.Object r3) {
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r2.a
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L38
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r2.a
            boolean r0 = r0.isDestroyed()
            if (r0 != 0) goto L38
            java.lang.Throwable r0 = kotlin.Result.m82exceptionOrNullimpl(r3)
            if (r0 == 0) goto L23
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r2.a
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L20
            java.lang.String r0 = "Could not read or write that file."
        L20:
            r1.toast(r0)
        L23:
            boolean r0 = kotlin.Result.m86isSuccessimpl(r3)
            if (r0 == 0) goto L38
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            if (r3 != 0) goto L35
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r2.a
            java.lang.String r3 = "Backup exported."
            r2.toast(r3)
            return
        L35:
            r2.confirmImport(r3)
        L38:
            return
    }

    private static final void resetAllSettings$lambda$1(android.widget.CheckBox r4, com.lumina.monsterhunterfieldbook.BackupController r5, android.content.DialogInterface r6, int r7) {
            boolean r4 = r4.isChecked()
            if (r4 != 0) goto L7
            return
        L7:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r5.a
            com.lumina.monsterhunterfieldbook.NativePrefs r6 = r6.getPrefs()
            org.json.JSONObject r6 = r6.getValues()
            java.util.Iterator r6 = r6.keys()
            java.lang.String r7 = "keys(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
        L1f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L5b
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            java.util.Set<java.lang.String> r0 = r5.personal
            boolean r0 = r0.contains(r7)
            if (r0 != 0) goto L49
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            java.lang.String r0 = "progress:"
            r1 = 0
            r2 = 2
            r3 = 0
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r7, r0, r1, r2, r3)
            if (r0 != 0) goto L49
            java.lang.String r0 = "goals:"
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r7, r0, r1, r2, r3)
            if (r0 == 0) goto L1f
        L49:
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r5.a
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r0.getPrefs()
            org.json.JSONObject r0 = r0.getValues()
            java.lang.Object r0 = r0.get(r7)
            r4.put(r7, r0)
            goto L1f
        L5b:
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r5.a
            com.lumina.monsterhunterfieldbook.NativePrefs r6 = r6.getPrefs()
            r6.applySnapshot(r4)
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r5.a
            r4.reloadStoredState()
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r5.a
            java.lang.String r6 = "reset"
            r4.afterPreference(r6)
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r5.a
            r4.rebuildSettings()
            return
    }

    private static final void resetAllSettings$lambda$2(android.app.AlertDialog r1, android.widget.CompoundButton r2, boolean r3) {
            java.lang.String r0 = "<unused var>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r2 = -1
            android.widget.Button r1 = r1.getButton(r2)
            r1.setEnabled(r3)
            return
    }

    private static final void selectiveReset$lambda$0(boolean[] r0, android.content.DialogInterface r1, int r2, boolean r3) {
            r0[r2] = r3
            return
    }

    private static final void selectiveReset$lambda$1(boolean[] r9, com.lumina.monsterhunterfieldbook.BackupController r10, java.lang.String[] r11, android.content.DialogInterface r12, int r13) {
            kotlin.ranges.IntRange r12 = kotlin.collections.ArraysKt.getIndices(r9)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Collection r13 = (java.util.Collection) r13
            java.util.Iterator r12 = r12.iterator()
        L11:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r12.next()
            r1 = r0
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            boolean r1 = r9[r1]
            if (r1 == 0) goto L11
            r13.add(r0)
            goto L11
        L2a:
            java.util.List r13 = (java.util.List) r13
            boolean r9 = r13.isEmpty()
            if (r9 == 0) goto L3a
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r10.a
            java.lang.String r10 = "Nothing selected."
            r9.toast(r10)
            return
        L3a:
            android.app.AlertDialog$Builder r9 = new android.app.AlertDialog$Builder
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r10.a
            android.content.Context r12 = (android.content.Context) r12
            r9.<init>(r12)
            java.lang.String r12 = "Confirm selected reset"
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            android.app.AlertDialog$Builder r9 = r9.setTitle(r12)
            r0 = r13
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.String r12 = "\n"
            r1 = r12
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            com.lumina.monsterhunterfieldbook.BackupController$$ExternalSyntheticLambda2 r6 = new com.lumina.monsterhunterfieldbook.BackupController$$ExternalSyntheticLambda2
            r6.<init>(r11)
            r7 = 30
            r8 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            java.lang.String r11 = kotlin.collections.CollectionsKt.joinToString$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            android.app.AlertDialog$Builder r9 = r9.setMessage(r11)
            java.lang.String r11 = "Keep"
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            r12 = 0
            android.app.AlertDialog$Builder r9 = r9.setNegativeButton(r11, r12)
            java.lang.String r11 = "Reset"
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            com.lumina.monsterhunterfieldbook.BackupController$$ExternalSyntheticLambda3 r12 = new com.lumina.monsterhunterfieldbook.BackupController$$ExternalSyntheticLambda3
            r12.<init>(r10, r13)
            android.app.AlertDialog$Builder r9 = r9.setPositiveButton(r11, r12)
            r9.show()
            return
    }

    private static final java.lang.CharSequence selectiveReset$lambda$1$1(java.lang.String[] r0, int r1) {
            r0 = r0[r1]
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            return r0
    }

    private static final void selectiveReset$lambda$1$2(com.lumina.monsterhunterfieldbook.BackupController r0, java.util.List r1, android.content.DialogInterface r2, int r3) {
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            com.lumina.monsterhunterfieldbook.NativePrefs r2 = r2.getPrefs()
            org.json.JSONObject r2 = r2.getValues()
            java.util.Iterator r2 = r2.keys()
            java.lang.String r3 = "keys(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            kotlin.sequences.Sequence r2 = kotlin.sequences.SequencesKt.asSequence(r2)
            com.lumina.monsterhunterfieldbook.BackupController$$ExternalSyntheticLambda5 r3 = new com.lumina.monsterhunterfieldbook.BackupController$$ExternalSyntheticLambda5
            r3.<init>(r1, r0)
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.filter(r2, r3)
            java.util.List r1 = kotlin.sequences.SequencesKt.toList(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L2a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            com.lumina.monsterhunterfieldbook.NativePrefs r3 = r3.getPrefs()
            org.json.JSONObject r3 = r3.getValues()
            r3.remove(r2)
            goto L2a
        L44:
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            com.lumina.monsterhunterfieldbook.NativePrefs r1 = r1.getPrefs()
            r1.save()
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            r1.reloadStoredState()
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            java.lang.String r2 = "reset"
            r1.afterPreference(r2)
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            r1.rebuildSettings()
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r0.a
            java.lang.String r1 = "Selected data reset."
            r0.toast(r1)
            return
    }

    private static final boolean selectiveReset$lambda$1$2$0(java.util.List r9, com.lumina.monsterhunterfieldbook.BackupController r10, java.lang.String r11) {
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            boolean r0 = r9 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L11
            r0 = r9
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            return r1
        L11:
            java.util.Iterator r9 = r9.iterator()
        L15:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L105
            java.lang.Object r0 = r9.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 6
            r6 = 0
            r7 = 2
            r8 = 1
            switch(r0) {
                case 0: goto Lfc;
                case 1: goto Lf9;
                case 2: goto Le1;
                case 3: goto L99;
                case 4: goto L91;
                case 5: goto L69;
                case 6: goto L61;
                case 7: goto L5e;
                default: goto L2f;
            }
        L2f:
            r0 = 8
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r6 = "musicEnabled"
            r0[r1] = r6
            java.lang.String r6 = "musicPaused"
            r0[r8] = r6
            java.lang.String r6 = "followTheme"
            r0[r7] = r6
            java.lang.String r6 = "volume"
            r0[r4] = r6
            java.lang.String r4 = "musicMode"
            r0[r3] = r4
            java.lang.String r3 = "musicTrack"
            r0[r2] = r3
            java.lang.String r2 = "musicPositions"
            r0[r5] = r2
            r2 = 7
            java.lang.String r3 = "rememberMusicPosition"
            r0[r2] = r3
            java.util.Set r0 = kotlin.collections.SetsKt.setOf(r0)
            boolean r0 = r0.contains(r11)
            goto L102
        L5e:
            java.lang.String r0 = "visualProfiles"
            goto L63
        L61:
            java.lang.String r0 = "recent"
        L63:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r0)
            goto L102
        L69:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            java.lang.String r0 = "progress:"
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r11, r0, r1, r7, r6)
            if (r0 != 0) goto Lf7
            java.lang.String r0 = "goals:"
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r11, r0, r1, r7, r6)
            if (r0 != 0) goto Lf7
            java.lang.String[] r0 = new java.lang.String[r7]
            java.lang.String r2 = "campChecks"
            r0[r1] = r2
            java.lang.String r2 = "speedUndo"
            r0[r8] = r2
            java.util.Set r0 = kotlin.collections.SetsKt.setOf(r0)
            boolean r0 = r0.contains(r11)
            if (r0 == 0) goto Lf5
            goto Lf7
        L91:
            java.lang.String r0 = "bookmarks"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r0)
            goto L102
        L99:
            java.lang.String[] r0 = new java.lang.String[r5]
            java.lang.String r5 = "filter:"
            r0[r1] = r5
            java.lang.String r5 = "position:"
            r0[r8] = r5
            java.lang.String r5 = "recordPosition:"
            r0[r7] = r5
            java.lang.String r5 = "mapFloor:"
            r0[r4] = r5
            java.lang.String r4 = "mapView:"
            r0[r3] = r4
            java.lang.String r3 = "collection:"
            r0[r2] = r3
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto Lc7
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Lc7
            goto Lf5
        Lc7:
            java.util.Iterator r0 = r0.iterator()
        Lcb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lf5
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            boolean r2 = kotlin.text.StringsKt.startsWith$default(r11, r2, r1, r7, r6)
            if (r2 == 0) goto Lcb
            goto Lf7
        Le1:
            java.util.Set<java.lang.String> r0 = r10.browsing
            boolean r0 = r0.contains(r11)
            if (r0 != 0) goto Lf7
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            java.lang.String r0 = "sort:"
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r11, r0, r1, r7, r6)
            if (r0 == 0) goto Lf5
            goto Lf7
        Lf5:
            r0 = r1
            goto L102
        Lf7:
            r0 = r8
            goto L102
        Lf9:
            java.util.Set<java.lang.String> r0 = r10.motion
            goto Lfe
        Lfc:
            java.util.Set<java.lang.String> r0 = r10.appearance
        Lfe:
            boolean r0 = r0.contains(r11)
        L102:
            if (r0 == 0) goto L15
            return r8
        L105:
            return r1
    }

    public final void export() {
            r3 = this;
            com.lumina.monsterhunterfieldbook.NativeBackup r0 = com.lumina.monsterhunterfieldbook.NativeBackup.INSTANCE
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r3.a
            com.lumina.monsterhunterfieldbook.NativePrefs r1 = r1.getPrefs()
            org.json.JSONObject r1 = r1.snapshot()
            java.lang.String r0 = r0.encode(r1)
            r3.pendingExport = r0
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.CREATE_DOCUMENT"
            r0.<init>(r1)
            java.lang.String r1 = "android.intent.category.OPENABLE"
            android.content.Intent r0 = r0.addCategory(r1)
            java.lang.String r1 = "application/json"
            android.content.Intent r0 = r0.setType(r1)
            java.lang.String r1 = "android.intent.extra.TITLE"
            java.lang.String r2 = "Monster_Hunter_Field_Book_Backup.json"
            android.content.Intent r0 = r0.putExtra(r1, r2)
            java.lang.String r1 = "putExtra(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L45
            r1 = r3
            com.lumina.monsterhunterfieldbook.BackupController r1 = (com.lumina.monsterhunterfieldbook.BackupController) r1     // Catch: java.lang.Throwable -> L45
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r3.a     // Catch: java.lang.Throwable -> L45
            r2 = 701(0x2bd, float:9.82E-43)
            r1.startActivityForResult(r0, r2)     // Catch: java.lang.Throwable -> L45
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L45
            java.lang.Object r0 = kotlin.Result.m79constructorimpl(r0)     // Catch: java.lang.Throwable -> L45
            goto L50
        L45:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m79constructorimpl(r0)
        L50:
            java.lang.Throwable r0 = kotlin.Result.m82exceptionOrNullimpl(r0)
            if (r0 == 0) goto L5d
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r3.a
            java.lang.String r1 = "No file picker is available."
            r0.toast(r1)
        L5d:
            return
    }

    public final void importBackup() {
            r6 = this;
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L39
            r0 = r6
            com.lumina.monsterhunterfieldbook.BackupController r0 = (com.lumina.monsterhunterfieldbook.BackupController) r0     // Catch: java.lang.Throwable -> L39
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r6.a     // Catch: java.lang.Throwable -> L39
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "android.intent.action.OPEN_DOCUMENT"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "android.intent.category.OPENABLE"
            android.content.Intent r1 = r1.addCategory(r2)     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "*/*"
            android.content.Intent r1 = r1.setType(r2)     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "android.intent.extra.MIME_TYPES"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = "application/json"
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = "text/plain"
            r5 = 1
            r3[r5] = r4     // Catch: java.lang.Throwable -> L39
            android.content.Intent r1 = r1.putExtra(r2, r3)     // Catch: java.lang.Throwable -> L39
            r2 = 702(0x2be, float:9.84E-43)
            r0.startActivityForResult(r1, r2)     // Catch: java.lang.Throwable -> L39
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L39
            java.lang.Object r0 = kotlin.Result.m79constructorimpl(r0)     // Catch: java.lang.Throwable -> L39
            goto L44
        L39:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m79constructorimpl(r0)
        L44:
            java.lang.Throwable r0 = kotlin.Result.m82exceptionOrNullimpl(r0)
            if (r0 == 0) goto L51
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r6.a
            java.lang.String r1 = "No file picker is available."
            r0.toast(r1)
        L51:
            return
    }

    public final void onResult(int r3, int r4, android.content.Intent r5) {
            r2 = this;
            r0 = -1
            if (r4 == r0) goto L4
            goto L45
        L4:
            if (r5 == 0) goto L45
            android.net.Uri r4 = r5.getData()
            if (r4 != 0) goto Ld
            goto L45
        Ld:
            r5 = 703(0x2bf, float:9.85E-43)
            if (r3 != r5) goto L17
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r2.a
            r3.importMusic(r4)
            return
        L17:
            r5 = 2
            java.lang.Integer[] r5 = new java.lang.Integer[r5]
            r0 = 701(0x2bd, float:9.82E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 0
            r5[r1] = r0
            r0 = 702(0x2be, float:9.84E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 1
            r5[r1] = r0
            java.util.List r5 = kotlin.collections.CollectionsKt.listOf(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            boolean r5 = r5.contains(r0)
            if (r5 != 0) goto L3b
            goto L45
        L3b:
            java.util.concurrent.ExecutorService r5 = r2.executor
            com.lumina.monsterhunterfieldbook.BackupController$$ExternalSyntheticLambda4 r0 = new com.lumina.monsterhunterfieldbook.BackupController$$ExternalSyntheticLambda4
            r0.<init>(r2, r3, r4)
            r5.execute(r0)
        L45:
            return
    }

    public final void release() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.executor
            r0.shutdownNow()
            return
    }

    public final void resetAllSettings() {
            r11 = this;
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r11.a
            android.widget.LinearLayout r0 = r0.column()
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r11.a
            r2 = r0
            android.view.View r2 = (android.view.View) r2
            r3 = 18
            r1.pad(r2, r3)
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r11.a
            r9 = 12
            r10 = 0
            java.lang.String r5 = "Bookmarks, campaign progress, checklists, music files, history and saved looks are kept."
            r6 = 1096810496(0x41600000, float:14.0)
            r7 = 0
            r8 = 0
            android.widget.TextView r1 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r4, r5, r6, r7, r8, r9, r10)
            android.view.View r1 = (android.view.View) r1
            r0.addView(r1)
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r11.a
            r3 = 0
            r4 = 2
            r5 = 0
            com.lumina.monsterhunterfieldbook.MainActivity.gap$default(r1, r0, r3, r4, r5)
            android.widget.CheckBox r1 = new android.widget.CheckBox
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r11.a
            android.content.Context r4 = (android.content.Context) r4
            r1.<init>(r4)
            java.lang.String r4 = "Reset appearance, effects, browsing and music settings"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r1.setText(r4)
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r11.a
            int r4 = r4.getInk()
            r1.setTextColor(r4)
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r11.a
            r6 = 50
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            int r4 = r4.dp(r6)
            r1.setMinHeight(r4)
            r4 = r1
            android.view.View r4 = (android.view.View) r4
            r0.addView(r4)
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r11.a
            android.content.Context r4 = (android.content.Context) r4
            r0.<init>(r4)
            java.lang.String r4 = "Reset All Settings"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            android.app.AlertDialog$Builder r0 = r0.setTitle(r4)
            android.app.AlertDialog$Builder r0 = r0.setView(r2)
            java.lang.String r2 = "Cancel"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r2, r5)
            java.lang.String r2 = "Reset"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            com.lumina.monsterhunterfieldbook.BackupController$$ExternalSyntheticLambda6 r4 = new com.lumina.monsterhunterfieldbook.BackupController$$ExternalSyntheticLambda6
            r4.<init>(r1, r11)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r2, r4)
            android.app.AlertDialog r0 = r0.create()
            r0.show()
            r2 = -1
            android.widget.Button r2 = r0.getButton(r2)
            r2.setEnabled(r3)
            com.lumina.monsterhunterfieldbook.BackupController$$ExternalSyntheticLambda7 r2 = new com.lumina.monsterhunterfieldbook.BackupController$$ExternalSyntheticLambda7
            r2.<init>(r0)
            r1.setOnCheckedChangeListener(r2)
            return
    }

    public final void selectiveReset() {
            r5 = this;
            r0 = 9
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            java.lang.String r3 = "Appearance"
            r1[r2] = r3
            r2 = 1
            java.lang.String r3 = "Motion & effects"
            r1[r2] = r3
            r2 = 2
            java.lang.String r3 = "Browsing options"
            r1[r2] = r3
            r2 = 3
            java.lang.String r3 = "Saved filters & positions"
            r1[r2] = r3
            r2 = 4
            java.lang.String r3 = "Bookmarks"
            r1[r2] = r3
            r2 = 5
            java.lang.String r3 = "Speedrun & checklists"
            r1[r2] = r3
            r2 = 6
            java.lang.String r3 = "Search history"
            r1[r2] = r3
            r2 = 7
            java.lang.String r3 = "Saved visual presets"
            r1[r2] = r3
            r2 = 8
            java.lang.String r3 = "Music settings"
            r1[r2] = r3
            boolean[] r0 = new boolean[r0]
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r5.a
            android.content.Context r3 = (android.content.Context) r3
            r2.<init>(r3)
            java.lang.String r3 = "Choose what to reset"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            android.app.AlertDialog$Builder r2 = r2.setTitle(r3)
            r3 = r1
            java.lang.CharSequence[] r3 = (java.lang.CharSequence[]) r3
            com.lumina.monsterhunterfieldbook.BackupController$$ExternalSyntheticLambda8 r4 = new com.lumina.monsterhunterfieldbook.BackupController$$ExternalSyntheticLambda8
            r4.<init>(r0)
            android.app.AlertDialog$Builder r2 = r2.setMultiChoiceItems(r3, r0, r4)
            java.lang.String r3 = "Cancel"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r4 = 0
            android.app.AlertDialog$Builder r2 = r2.setNegativeButton(r3, r4)
            java.lang.String r3 = "Review"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            com.lumina.monsterhunterfieldbook.BackupController$$ExternalSyntheticLambda9 r4 = new com.lumina.monsterhunterfieldbook.BackupController$$ExternalSyntheticLambda9
            r4.<init>(r0, r5, r1)
            android.app.AlertDialog$Builder r0 = r2.setPositiveButton(r3, r4)
            r0.show()
            return
    }
}
