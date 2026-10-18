package com.lumina.monsterhunterfieldbook;

/* compiled from: ProgressScreen.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/ProgressScreen;", "Landroid/widget/ScrollView;", "a", "Lcom/lumina/monsterhunterfieldbook/MainActivity;", "<init>", "(Lcom/lumina/monsterhunterfieldbook/MainActivity;)V", "body", "Landroid/widget/LinearLayout;", "game", "", "stages", "Lorg/json/JSONArray;", "kotlin.jvm.PlatformType", "state", "Lorg/json/JSONObject;", "groups", "", "Lcom/lumina/monsterhunterfieldbook/ReadingGroup;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProgressScreen extends android.widget.ScrollView {
    private final com.lumina.monsterhunterfieldbook.MainActivity a;
    private final android.widget.LinearLayout body;
    private final java.lang.String game;
    private final java.util.List<com.lumina.monsterhunterfieldbook.ReadingGroup> groups;
    private final org.json.JSONArray stages;
    private final org.json.JSONObject state;

    /* renamed from: $r8$lambda$2t3osO-b0yW8G4aVDjd8y6w6MAY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m35$r8$lambda$2t3osOb0yW8G4aVDjd8y6w6MAY(com.lumina.monsterhunterfieldbook.ProgressScreen r0, org.json.JSONArray r1, android.widget.LinearLayout r2) {
            kotlin.Unit r0 = _init_$lambda$8(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DMBxPqBasyI3jMWK7OlGFa2uMOU(com.lumina.monsterhunterfieldbook.ProgressScreen r0, org.json.JSONObject r1) {
            kotlin.Unit r0 = _init_$lambda$7(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RgByvBI4aAvAY_fI4K9nkEem6PE(com.lumina.monsterhunterfieldbook.ProgressScreen r0) {
            kotlin.Unit r0 = _init_$lambda$4(r0)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UO0hKYQfYUBfo3tsF0LMhYCFUl0(com.lumina.monsterhunterfieldbook.ProgressScreen r0) {
            kotlin.Unit r0 = _init_$lambda$5(r0)
            return r0
    }

    /* renamed from: $r8$lambda$X-SqwvyuMC796xhiCn-OqjcfIJ0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m36$r8$lambda$XSqwvyuMC796xhiCnOqjcfIJ0(com.lumina.monsterhunterfieldbook.ProgressScreen r0, org.json.JSONObject r1, android.widget.LinearLayout r2) {
            kotlin.Unit r0 = _init_$lambda$2(r0, r1, r2)
            return r0
    }

    public ProgressScreen(com.lumina.monsterhunterfieldbook.MainActivity r23) {
            r22 = this;
            r1 = r22
            r2 = r23
            java.lang.String r0 = "a"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = r2
            android.content.Context r0 = (android.content.Context) r0
            r1.<init>(r0)
            r1.a = r2
            android.widget.LinearLayout r0 = r2.column()
            r1.body = r0
            java.lang.String r3 = r2.getCurrentEdition()
            r1.game = r3
            org.json.JSONObject r4 = r2.getLibraryData()
            java.lang.String r5 = "speedrun"
            org.json.JSONObject r4 = r4.getJSONObject(r5)
            org.json.JSONArray r9 = r4.getJSONArray(r3)
            r1.stages = r9
            com.lumina.monsterhunterfieldbook.RouteProgress r4 = com.lumina.monsterhunterfieldbook.RouteProgress.INSTANCE
            com.lumina.monsterhunterfieldbook.NativePrefs r5 = r2.getPrefs()
            org.json.JSONObject r4 = r4.state(r5, r3)
            r1.state = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r4 = (java.util.List) r4
            r1.groups = r4
            r4 = r0
            android.view.View r4 = (android.view.View) r4
            r5 = 14
            r2.pad(r4, r5)
            r4 = r0
            android.view.View r4 = (android.view.View) r4
            r1.addView(r4)
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toUpperCase(r4)
            java.lang.String r10 = "toUpperCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Speedrun · "
            r4.<init>(r5)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            r7 = 8
            r8 = 0
            r4 = 1104674816(0x41d80000, float:27.0)
            r5 = 1
            r6 = 0
            android.widget.TextView r3 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r2, r3, r4, r5, r6, r7, r8)
            android.view.View r3 = (android.view.View) r3
            r0.addView(r3)
            r3 = 0
            r4 = 2
            r5 = 0
            com.lumina.monsterhunterfieldbook.MainActivity.gap$default(r2, r0, r3, r4, r5)
            int r0 = r9.length()
            kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until(r3, r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r2 = r3
        L8f:
            boolean r6 = r0.hasNext()
            java.lang.String r7 = "tasks"
            if (r6 == 0) goto Lae
            r6 = r0
            kotlin.collections.IntIterator r6 = (kotlin.collections.IntIterator) r6
            int r6 = r6.nextInt()
            org.json.JSONArray r8 = r1.stages
            org.json.JSONObject r6 = r8.getJSONObject(r6)
            org.json.JSONArray r6 = r6.getJSONArray(r7)
            int r6 = r6.length()
            int r2 = r2 + r6
            goto L8f
        Lae:
            org.json.JSONArray r0 = r1.stages
            int r0 = r0.length()
            kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until(r3, r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r6 = r3
        Lbf:
            boolean r8 = r0.hasNext()
            java.lang.String r9 = "id"
            if (r8 == 0) goto L11d
            r8 = r0
            kotlin.collections.IntIterator r8 = (kotlin.collections.IntIterator) r8
            int r8 = r8.nextInt()
            org.json.JSONArray r11 = r1.stages
            org.json.JSONObject r8 = r11.getJSONObject(r8)
            org.json.JSONArray r8 = r8.getJSONArray(r7)
            int r11 = r8.length()
            kotlin.ranges.IntRange r11 = kotlin.ranges.RangesKt.until(r3, r11)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            boolean r12 = r11 instanceof java.util.Collection
            if (r12 == 0) goto Lf1
            r12 = r11
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto Lf1
            r12 = r3
            goto L11b
        Lf1:
            java.util.Iterator r11 = r11.iterator()
            r12 = r3
        Lf6:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L11b
            r13 = r11
            kotlin.collections.IntIterator r13 = (kotlin.collections.IntIterator) r13
            int r13 = r13.nextInt()
            org.json.JSONObject r14 = r1.state
            org.json.JSONObject r13 = r8.getJSONObject(r13)
            java.lang.String r13 = r13.getString(r9)
            boolean r13 = r14.optBoolean(r13)
            if (r13 == 0) goto Lf6
            int r12 = r12 + 1
            if (r12 >= 0) goto Lf6
            kotlin.collections.CollectionsKt.throwCountOverflow()
            goto Lf6
        L11b:
            int r6 = r6 + r12
            goto Lbf
        L11d:
            android.widget.LinearLayout r0 = r1.body
            com.lumina.monsterhunterfieldbook.MainActivity r11 = r1.a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.StringBuilder r8 = r8.append(r6)
            java.lang.String r12 = " / "
            java.lang.StringBuilder r8 = r8.append(r12)
            java.lang.StringBuilder r8 = r8.append(r2)
            java.lang.String r12 = " requirements"
            java.lang.StringBuilder r8 = r8.append(r12)
            java.lang.String r12 = r8.toString()
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r1.a
            int r15 = r8.getAccent()
            r16 = 4
            r17 = 0
            r13 = 1096810496(0x41600000, float:14.0)
            r14 = 0
            android.widget.TextView r8 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r11, r12, r13, r14, r15, r16, r17)
            android.view.View r8 = (android.view.View) r8
            r0.addView(r8)
            android.widget.ProgressBar r0 = new android.widget.ProgressBar
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r1.a
            android.content.Context r8 = (android.content.Context) r8
            r11 = 16842872(0x1010078, float:2.3693894E-38)
            r0.<init>(r8, r5, r11)
            r0.setMax(r2)
            r0.setProgress(r6)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.StringBuilder r6 = r8.append(r6)
            java.lang.String r8 = " of "
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.StringBuilder r2 = r6.append(r2)
            java.lang.String r6 = " story requirements completed"
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setContentDescription(r2)
            android.widget.LinearLayout r2 = r1.body
            android.view.View r0 = (android.view.View) r0
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r1.a
            r11 = 12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            java.lang.Number r12 = (java.lang.Number) r12
            int r8 = r8.dp(r12)
            r12 = -1
            r6.<init>(r12, r8)
            android.view.ViewGroup$LayoutParams r6 = (android.view.ViewGroup.LayoutParams) r6
            r2.addView(r0, r6)
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r1.a
            android.widget.LinearLayout r2 = r1.body
            com.lumina.monsterhunterfieldbook.MainActivity.gap$default(r0, r2, r3, r4, r5)
            com.lumina.monsterhunterfieldbook.RouteProgress r0 = com.lumina.monsterhunterfieldbook.RouteProgress.INSTANCE
            org.json.JSONArray r2 = r1.stages
            java.lang.String r6 = "stages"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r6)
            org.json.JSONObject r8 = r1.state
            int r0 = r0.visible(r2, r8)
            r2 = r3
        L1bc:
            if (r2 >= r0) goto L256
            org.json.JSONArray r13 = r1.stages
            org.json.JSONObject r13 = r13.getJSONObject(r2)
            com.lumina.monsterhunterfieldbook.RouteProgress r14 = com.lumina.monsterhunterfieldbook.RouteProgress.INSTANCE
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13)
            org.json.JSONObject r15 = r1.state
            boolean r14 = r14.complete(r13, r15)
            com.lumina.monsterhunterfieldbook.ReadingGroup r15 = new com.lumina.monsterhunterfieldbook.ReadingGroup
            r23 = r11
            com.lumina.monsterhunterfieldbook.MainActivity r11 = r1.a
            java.lang.String r3 = r1.game
            java.lang.String r4 = r13.getString(r9)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "route:"
            r5.<init>(r8)
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r5 = ":"
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r17 = r3.toString()
            int r2 = r2 + 1
            java.lang.String r3 = "title"
            java.lang.String r3 = r13.getString(r3)
            if (r14 == 0) goto L201
            java.lang.String r4 = " · complete"
            goto L203
        L201:
            java.lang.String r4 = ""
        L203:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r8 = ". "
            java.lang.StringBuilder r5 = r5.append(r8)
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r18 = r3.toString()
            java.util.List<com.lumina.monsterhunterfieldbook.ReadingGroup> r3 = r1.groups
            r20 = r14 ^ 1
            com.lumina.monsterhunterfieldbook.ProgressScreen$$ExternalSyntheticLambda0 r4 = new com.lumina.monsterhunterfieldbook.ProgressScreen$$ExternalSyntheticLambda0
            r4.<init>(r1, r13)
            r19 = r3
            r21 = r4
            r16 = r11
            r15.<init>(r16, r17, r18, r19, r20, r21)
            android.widget.LinearLayout r3 = r1.body
            android.view.View r15 = (android.view.View) r15
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r4.<init>(r12, r5)
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r1.a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r23)
            java.lang.Number r8 = (java.lang.Number) r8
            int r5 = r5.dp(r8)
            r4.bottomMargin = r5
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            android.view.ViewGroup$LayoutParams r4 = (android.view.ViewGroup.LayoutParams) r4
            r3.addView(r15, r4)
            r11 = r23
            r3 = 0
            r4 = 2
            r5 = 0
            goto L1bc
        L256:
            com.lumina.monsterhunterfieldbook.RouteProgress r0 = com.lumina.monsterhunterfieldbook.RouteProgress.INSTANCE
            org.json.JSONArray r2 = r1.stages
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r6)
            org.json.JSONObject r3 = r1.state
            boolean r0 = r0.completeAll(r2, r3)
            if (r0 == 0) goto L2c2
            android.widget.LinearLayout r0 = r1.body
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r1.a
            java.lang.String r3 = r1.game
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toUpperCase(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r4 = " STORY COMPLETE"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r1.a
            int r4 = r4.getAccent()
            r5 = 1098907648(0x41800000, float:16.0)
            r6 = 1
            android.widget.TextView r2 = r2.text(r3, r5, r6, r4)
            android.view.View r2 = (android.view.View) r2
            r0.addView(r2)
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r1.a
            android.widget.LinearLayout r2 = r1.body
            r3 = 0
            r4 = 2
            r5 = 0
            com.lumina.monsterhunterfieldbook.MainActivity.gap$default(r0, r2, r3, r4, r5)
            java.lang.String r0 = r1.game
            java.lang.String r2 = "world"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r0 == 0) goto L2dd
            android.widget.LinearLayout r0 = r1.body
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r1.a
            com.lumina.monsterhunterfieldbook.ProgressScreen$$ExternalSyntheticLambda1 r3 = new com.lumina.monsterhunterfieldbook.ProgressScreen$$ExternalSyntheticLambda1
            r3.<init>(r1)
            java.lang.String r4 = "Continue to Iceborne"
            android.widget.TextView r2 = r2.button(r4, r3)
            android.view.View r2 = (android.view.View) r2
            r0.addView(r2)
            goto L2dd
        L2c2:
            android.widget.LinearLayout r0 = r1.body
            com.lumina.monsterhunterfieldbook.MainActivity r13 = r1.a
            int r17 = r13.getMuted()
            r18 = 4
            r19 = 0
            java.lang.String r14 = "Complete the current stage to reveal the next requirements."
            r15 = 1094713344(0x41400000, float:12.0)
            r16 = 0
            android.widget.TextView r2 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r13, r14, r15, r16, r17, r18, r19)
            android.view.View r2 = (android.view.View) r2
            r0.addView(r2)
        L2dd:
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r1.a
            android.widget.LinearLayout r2 = r1.body
            r3 = 0
            r4 = 2
            r5 = 0
            com.lumina.monsterhunterfieldbook.MainActivity.gap$default(r0, r2, r3, r4, r5)
            android.widget.LinearLayout r0 = r1.body
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r1.a
            com.lumina.monsterhunterfieldbook.ProgressScreen$$ExternalSyntheticLambda2 r3 = new com.lumina.monsterhunterfieldbook.ProgressScreen$$ExternalSyntheticLambda2
            r3.<init>(r1)
            java.lang.String r4 = "Reset this route"
            android.widget.TextView r2 = r2.button(r4, r3)
            android.view.View r2 = (android.view.View) r2
            r0.addView(r2)
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L318
            r0 = r1
            com.lumina.monsterhunterfieldbook.ProgressScreen r0 = (com.lumina.monsterhunterfieldbook.ProgressScreen) r0     // Catch: java.lang.Throwable -> L318
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L318
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r1.a     // Catch: java.lang.Throwable -> L318
            com.lumina.monsterhunterfieldbook.NativePrefs r2 = r2.getPrefs()     // Catch: java.lang.Throwable -> L318
            java.lang.String r3 = "speedUndo"
            java.lang.String r4 = "{}"
            java.lang.String r2 = r2.text(r3, r4)     // Catch: java.lang.Throwable -> L318
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L318
            java.lang.Object r0 = kotlin.Result.m79constructorimpl(r0)     // Catch: java.lang.Throwable -> L318
            goto L323
        L318:
            r0 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m79constructorimpl(r0)
        L323:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            boolean r3 = kotlin.Result.m85isFailureimpl(r0)
            if (r3 == 0) goto L32f
            r0 = r2
        L32f:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.lang.String r2 = "game"
            java.lang.String r2 = r0.optString(r2)
            java.lang.String r3 = r1.game
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 == 0) goto L359
            boolean r2 = r0.has(r7)
            if (r2 == 0) goto L359
            android.widget.LinearLayout r2 = r1.body
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r1.a
            com.lumina.monsterhunterfieldbook.ProgressScreen$$ExternalSyntheticLambda3 r4 = new com.lumina.monsterhunterfieldbook.ProgressScreen$$ExternalSyntheticLambda3
            r4.<init>(r1, r0)
            java.lang.String r0 = "Undo route reset"
            android.widget.TextView r0 = r3.button(r0, r4)
            android.view.View r0 = (android.view.View) r0
            r2.addView(r0)
        L359:
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r1.a
            android.widget.LinearLayout r2 = r1.body
            r3 = 18
            r0.gap(r2, r3)
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r1.a
            org.json.JSONObject r0 = r0.getLibraryData()
            java.lang.String r2 = "progress"
            org.json.JSONObject r0 = r0.getJSONObject(r2)
            java.lang.String r2 = r1.game
            org.json.JSONArray r0 = r0.getJSONArray(r2)
            android.widget.LinearLayout r2 = r1.body
            com.lumina.monsterhunterfieldbook.ReadingGroup r3 = new com.lumina.monsterhunterfieldbook.ReadingGroup
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r1.a
            java.lang.String r5 = r1.game
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "campaign:"
            r6.<init>(r7)
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r5 = r5.toString()
            java.util.List<com.lumina.monsterhunterfieldbook.ReadingGroup> r7 = r1.groups
            com.lumina.monsterhunterfieldbook.ProgressScreen$$ExternalSyntheticLambda4 r9 = new com.lumina.monsterhunterfieldbook.ProgressScreen$$ExternalSyntheticLambda4
            r9.<init>(r1, r0)
            r10 = 16
            r11 = 0
            java.lang.String r6 = "Campaign guidance & general goals"
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            android.view.View r3 = (android.view.View) r3
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r0.<init>(r12, r5)
            android.view.ViewGroup$LayoutParams r0 = (android.view.ViewGroup.LayoutParams) r0
            r2.addView(r3, r0)
            return
    }

    private static final kotlin.Unit _init_$lambda$2(com.lumina.monsterhunterfieldbook.ProgressScreen r12, org.json.JSONObject r13, android.widget.LinearLayout r14) {
            java.lang.String r0 = "inner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r12.a
            java.lang.String r0 = "rank"
            java.lang.String r2 = r13.optString(r0)
            java.lang.String r0 = "optString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r12.a
            int r5 = r0.getMuted()
            r6 = 4
            r7 = 0
            r3 = 1093664768(0x41300000, float:11.0)
            r4 = 0
            android.widget.TextView r0 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r1, r2, r3, r4, r5, r6, r7)
            android.view.View r0 = (android.view.View) r0
            r14.addView(r0)
            java.lang.String r0 = "tasks"
            org.json.JSONArray r0 = r13.getJSONArray(r0)
            int r1 = r0.length()
            r2 = 0
            r3 = r2
        L32:
            if (r3 >= r1) goto Ld0
            org.json.JSONObject r4 = r0.getJSONObject(r3)
            java.lang.String r5 = "id"
            java.lang.String r5 = r4.getString(r5)
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r12.a
            android.widget.LinearLayout r6 = r6.row()
            android.widget.CheckBox r7 = new android.widget.CheckBox
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r12.a
            android.content.Context r8 = (android.content.Context) r8
            r7.<init>(r8)
            java.lang.String r8 = "name"
            java.lang.String r8 = r4.getString(r8)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r7.setText(r8)
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r12.a
            int r8 = r8.getInk()
            r7.setTextColor(r8)
            org.json.JSONObject r8 = r12.state
            boolean r8 = r8.optBoolean(r5)
            r7.setChecked(r8)
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r12.a
            r9 = 48
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Number r9 = (java.lang.Number) r9
            int r8 = r8.dp(r9)
            r7.setMinHeight(r8)
            r8 = r7
            android.view.View r8 = (android.view.View) r8
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r10 = -2
            r11 = 1065353216(0x3f800000, float:1.0)
            r9.<init>(r2, r10, r11)
            android.view.ViewGroup$LayoutParams r9 = (android.view.ViewGroup.LayoutParams) r9
            r6.addView(r8, r9)
            java.lang.String r8 = "questId"
            java.lang.String r8 = r4.optString(r8)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r9 = kotlin.text.StringsKt.isBlank(r8)
            if (r9 == 0) goto L9f
            java.lang.String r8 = "monsterId"
            java.lang.String r8 = r4.optString(r8)
        L9f:
            java.lang.String r8 = (java.lang.String) r8
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
            r4 = r8
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = kotlin.text.StringsKt.isBlank(r4)
            if (r4 != 0) goto Lbf
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r12.a
            com.lumina.monsterhunterfieldbook.ProgressScreen$$ExternalSyntheticLambda6 r9 = new com.lumina.monsterhunterfieldbook.ProgressScreen$$ExternalSyntheticLambda6
            r9.<init>(r12, r8)
            java.lang.String r8 = "Info"
            android.widget.TextView r4 = r4.button(r8, r9)
            android.view.View r4 = (android.view.View) r4
            r6.addView(r4)
        Lbf:
            com.lumina.monsterhunterfieldbook.ProgressScreen$$ExternalSyntheticLambda7 r4 = new com.lumina.monsterhunterfieldbook.ProgressScreen$$ExternalSyntheticLambda7
            r4.<init>(r12, r5)
            r7.setOnCheckedChangeListener(r4)
            android.view.View r6 = (android.view.View) r6
            r14.addView(r6)
            int r3 = r3 + 1
            goto L32
        Ld0:
            java.lang.String r0 = "tips"
            org.json.JSONArray r13 = r13.optJSONArray(r0)
            if (r13 != 0) goto Ldd
            org.json.JSONArray r13 = new org.json.JSONArray
            r13.<init>()
        Ldd:
            int r0 = r13.length()
        Le1:
            if (r2 >= r0) goto L10f
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r12.a
            java.lang.String r1 = r13.getString(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "• "
            r4.<init>(r5)
            java.lang.StringBuilder r1 = r4.append(r1)
            java.lang.String r4 = r1.toString()
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r12.a
            int r7 = r1.getMuted()
            r8 = 4
            r9 = 0
            r5 = 1095761920(0x41500000, float:13.0)
            r6 = 0
            android.widget.TextView r1 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r3, r4, r5, r6, r7, r8, r9)
            android.view.View r1 = (android.view.View) r1
            r14.addView(r1)
            int r2 = r2 + 1
            goto Le1
        L10f:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
    }

    private static final kotlin.Unit _init_$lambda$4(com.lumina.monsterhunterfieldbook.ProgressScreen r1) {
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r1.a
            java.lang.String r0 = "iceborne"
            r1.switchEdition(r0)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    private static final kotlin.Unit _init_$lambda$5(com.lumina.monsterhunterfieldbook.ProgressScreen r4) {
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r4.a
            android.content.Context r1 = (android.content.Context) r1
            r0.<init>(r1)
            java.lang.String r1 = r4.game
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toUpperCase(r2)
            java.lang.String r2 = "toUpperCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Reset "
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = " route?"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            java.lang.String r1 = "Clears this campaign’s checked requirements. Other campaign progress is kept. Undo is available until the next task change."
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            java.lang.String r1 = "Keep"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            java.lang.String r1 = "Reset"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            com.lumina.monsterhunterfieldbook.ProgressScreen$$ExternalSyntheticLambda5 r2 = new com.lumina.monsterhunterfieldbook.ProgressScreen$$ExternalSyntheticLambda5
            r2.<init>(r4)
            android.app.AlertDialog$Builder r4 = r0.setPositiveButton(r1, r2)
            r4.show()
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
    }

    private static final kotlin.Unit _init_$lambda$7(com.lumina.monsterhunterfieldbook.ProgressScreen r4, org.json.JSONObject r5) {
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r4.a
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r0.getPrefs()
            java.lang.String r1 = r4.game
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "progress:"
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "tasks"
            org.json.JSONObject r5 = r5.getJSONObject(r2)
            java.lang.String r5 = r5.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            r0.set(r1, r5)
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r4.a
            com.lumina.monsterhunterfieldbook.NativePrefs r5 = r5.getPrefs()
            org.json.JSONObject r5 = r5.getValues()
            java.lang.String r0 = "speedUndo"
            r5.remove(r0)
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r4.a
            com.lumina.monsterhunterfieldbook.NativePrefs r5 = r5.getPrefs()
            r5.save()
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r4.a
            r4.refreshCurrentSection()
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
    }

    private static final kotlin.Unit _init_$lambda$8(com.lumina.monsterhunterfieldbook.ProgressScreen r13, org.json.JSONArray r14, android.widget.LinearLayout r15) {
            java.lang.String r0 = "goals:"
            java.lang.String r1 = "inner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2e
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2e
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r13.a     // Catch: java.lang.Throwable -> L2e
            com.lumina.monsterhunterfieldbook.NativePrefs r2 = r2.getPrefs()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = r13.game     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r0 = r4.append(r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = "{}"
            java.lang.String r0 = r2.text(r0, r3)     // Catch: java.lang.Throwable -> L2e
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = kotlin.Result.m79constructorimpl(r1)     // Catch: java.lang.Throwable -> L2e
            goto L39
        L2e:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m79constructorimpl(r0)
        L39:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            boolean r2 = kotlin.Result.m85isFailureimpl(r0)
            if (r2 == 0) goto L45
            r0 = r1
        L45:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            int r1 = r14.length()
            r2 = 0
            r3 = r2
        L4d:
            if (r3 >= r1) goto Lf3
            org.json.JSONObject r4 = r14.getJSONObject(r3)
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r13.a
            java.lang.String r6 = "title"
            java.lang.String r6 = r4.getString(r6)
            java.lang.String r7 = "getString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r10 = 8
            r11 = 0
            r7 = 1099431936(0x41880000, float:17.0)
            r8 = 1
            r9 = 0
            android.widget.TextView r5 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r5, r6, r7, r8, r9, r10, r11)
            android.view.View r5 = (android.view.View) r5
            r15.addView(r5)
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r13.a
            java.lang.String r5 = "text"
            java.lang.String r7 = r4.optString(r5)
            java.lang.String r5 = "optString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            r11 = 12
            r12 = 0
            r8 = 1096810496(0x41600000, float:14.0)
            r10 = 0
            android.widget.TextView r5 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r6, r7, r8, r9, r10, r11, r12)
            android.view.View r5 = (android.view.View) r5
            r15.addView(r5)
            java.lang.String r5 = "tasks"
            org.json.JSONArray r5 = r4.getJSONArray(r5)
            int r6 = r5.length()
            r7 = r2
        L97:
            if (r7 >= r6) goto Le8
            java.lang.String r8 = "id"
            java.lang.String r8 = r4.getString(r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.StringBuilder r8 = r9.append(r8)
            java.lang.String r9 = ":"
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r7)
            java.lang.String r8 = r8.toString()
            android.widget.CheckBox r9 = new android.widget.CheckBox
            com.lumina.monsterhunterfieldbook.MainActivity r10 = r13.a
            android.content.Context r10 = (android.content.Context) r10
            r9.<init>(r10)
            java.lang.String r10 = r5.getString(r7)
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            r9.setText(r10)
            com.lumina.monsterhunterfieldbook.MainActivity r10 = r13.a
            int r10 = r10.getInk()
            r9.setTextColor(r10)
            boolean r10 = r0.optBoolean(r8)
            r9.setChecked(r10)
            com.lumina.monsterhunterfieldbook.ProgressScreen$$ExternalSyntheticLambda8 r10 = new com.lumina.monsterhunterfieldbook.ProgressScreen$$ExternalSyntheticLambda8
            r10.<init>(r0, r8, r13)
            r9.setOnCheckedChangeListener(r10)
            android.view.View r9 = (android.view.View) r9
            r15.addView(r9)
            int r7 = r7 + 1
            goto L97
        Le8:
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r13.a
            r5 = 14
            r4.gap(r15, r5)
            int r3 = r3 + 1
            goto L4d
        Lf3:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
    }

    static final kotlin.Unit lambda$2$1(com.lumina.monsterhunterfieldbook.ProgressScreen r2, java.lang.String r3) {
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r2.a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            r0 = 0
            r1 = 2
            com.lumina.monsterhunterfieldbook.MainActivity.openReference$default(r2, r3, r0, r1, r0)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    static final void lambda$2$2(com.lumina.monsterhunterfieldbook.ProgressScreen r1, java.lang.String r2, android.widget.CompoundButton r3, boolean r4) {
            java.lang.String r0 = "<unused var>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            org.json.JSONObject r3 = r1.state
            r3.put(r2, r4)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r1.a
            com.lumina.monsterhunterfieldbook.NativePrefs r2 = r2.getPrefs()
            java.lang.String r3 = r1.game
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "progress:"
            r4.<init>(r0)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            org.json.JSONObject r4 = r1.state
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            r2.set(r3, r4)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r1.a
            com.lumina.monsterhunterfieldbook.NativePrefs r2 = r2.getPrefs()
            org.json.JSONObject r2 = r2.getValues()
            java.lang.String r3 = "speedUndo"
            r2.remove(r3)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r1.a
            com.lumina.monsterhunterfieldbook.NativePrefs r2 = r2.getPrefs()
            r2.save()
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r1.a
            r1.refreshCurrentSection()
            return
    }

    static final void lambda$5$0(com.lumina.monsterhunterfieldbook.ProgressScreen r2, android.content.DialogInterface r3, int r4) {
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r2.a
            com.lumina.monsterhunterfieldbook.NativePrefs r3 = r3.getPrefs()
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r0 = "game"
            java.lang.String r1 = r2.game
            org.json.JSONObject r4 = r4.put(r0, r1)
            java.lang.String r0 = "tasks"
            org.json.JSONObject r1 = r2.state
            org.json.JSONObject r4 = r4.put(r0, r1)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            java.lang.String r0 = "speedUndo"
            r3.set(r0, r4)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r2.a
            com.lumina.monsterhunterfieldbook.NativePrefs r3 = r3.getPrefs()
            java.lang.String r4 = r2.game
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "progress:"
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "{}"
            r3.set(r4, r0)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r2.a
            r2.refreshCurrentSection()
            return
    }

    static final void lambda$8$1$0(org.json.JSONObject r1, java.lang.String r2, com.lumina.monsterhunterfieldbook.ProgressScreen r3, android.widget.CompoundButton r4, boolean r5) {
            java.lang.String r0 = "<unused var>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.put(r2, r5)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r3.a
            com.lumina.monsterhunterfieldbook.NativePrefs r2 = r2.getPrefs()
            java.lang.String r3 = r3.game
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "goals:"
            r4.<init>(r5)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            r2.set(r3, r1)
            return
    }
}
