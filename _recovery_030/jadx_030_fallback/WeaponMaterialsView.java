package com.lumina.monsterhunterfieldbook;

/* compiled from: WeaponProfilePanel.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0018\u001a\u00020\rH\u0002J\u0018\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/WeaponMaterialsView;", "Landroid/widget/LinearLayout;", "a", "Lcom/lumina/monsterhunterfieldbook/MainActivity;", "record", "Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "state", "Lorg/json/JSONObject;", "compact", "", "onSelect", "Lkotlin/Function1;", "", "", "onInfo", "<init>", "(Lcom/lumina/monsterhunterfieldbook/MainActivity;Lcom/lumina/monsterhunterfieldbook/FieldRecord;Lorg/json/JSONObject;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getRecord", "()Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "getState", "()Lorg/json/JSONObject;", "getCompact", "()Z", "data", "render", "stat", "label", "value", "Landroid/view/View;", "sharpness", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WeaponMaterialsView extends android.widget.LinearLayout {
    private final com.lumina.monsterhunterfieldbook.MainActivity a;
    private final boolean compact;
    private final org.json.JSONObject data;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onInfo;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onSelect;
    private final com.lumina.monsterhunterfieldbook.FieldRecord record;
    private final org.json.JSONObject state;

    public static /* synthetic */ java.lang.Object $r8$lambda$6Xc6gS39csQQLftM1RdLfalDhdc(java.lang.Object r0, java.lang.String r1) {
            java.lang.Object r0 = sharpness$lambda$1(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7eGhppsOt2gNlSteHWVu10LqQVQ(java.lang.String r0) {
            kotlin.Unit r0 = _init_$lambda$0(r0)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PPMr7VkIoEdcWceiFD4ECAjQFd8(com.lumina.monsterhunterfieldbook.WeaponMaterialsView r0, java.lang.String r1) {
            kotlin.Unit r0 = render$lambda$9$0(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Pcn1iV4NfevmGZvUG5tahZ6Y1os(com.lumina.monsterhunterfieldbook.WeaponMaterialsView r0) {
            kotlin.Unit r0 = render$lambda$20(r0)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YniiBTcQmTWdLWq1RyAUXKyoTq4(com.lumina.monsterhunterfieldbook.WeaponMaterialsView r0, java.lang.String r1, org.json.JSONObject r2) {
            kotlin.Unit r0 = render$lambda$13(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$a_YaJW4kZo6vF2CodoX4IapwDbU(com.lumina.monsterhunterfieldbook.WeaponMaterialsView r0, android.widget.FrameLayout r1, com.lumina.monsterhunterfieldbook.GlyphView r2) {
            kotlin.Unit r0 = render$lambda$1(r0, r1, r2)
            return r0
    }

    /* renamed from: $r8$lambda$inD9gg-lPI5hHBr0a8i4WYfQk5M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m61$r8$lambda$inD9gglPI5hHBr0a8i4WYfQk5M(com.lumina.monsterhunterfieldbook.WeaponMaterialsView r0, int r1) {
            kotlin.Unit r0 = render$lambda$4$2(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pN4jHcpXMadFdp40y1AAB6XNFG4(com.lumina.monsterhunterfieldbook.WeaponMaterialsView r0, java.lang.String r1) {
            kotlin.Unit r0 = render$lambda$10(r0, r1)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$thggjijss5hpebDgI0zmno6SB54(com.lumina.monsterhunterfieldbook.WeaponMaterialsView r0, java.lang.String r1, android.widget.ImageView r2) {
            render$lambda$14(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$xyhlf2NUfMK_YV1mF327ZKiwIiM(com.lumina.monsterhunterfieldbook.WeaponMaterialsView r0, com.lumina.monsterhunterfieldbook.FieldRecord r1, android.widget.ImageView r2) {
            render$lambda$14$1(r0, r1, r2)
            return
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$yHFSONs4QoKJTnKoDK2xaZseIyY(java.lang.Object r0, int r1) {
            java.lang.CharSequence r0 = render$lambda$17(r0, r1)
            return r0
    }

    public WeaponMaterialsView(com.lumina.monsterhunterfieldbook.MainActivity r2, com.lumina.monsterhunterfieldbook.FieldRecord r3, org.json.JSONObject r4, boolean r5, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r6, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r7) {
            r1 = this;
            java.lang.String r0 = "a"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "record"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "onSelect"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "onInfo"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = r2
            android.content.Context r0 = (android.content.Context) r0
            r1.<init>(r0)
            r1.a = r2
            r1.record = r3
            r1.state = r4
            r1.compact = r5
            r1.onSelect = r6
            r1.onInfo = r7
            com.lumina.monsterhunterfieldbook.WeaponModel r2 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            org.json.JSONObject r2 = r2.data(r3)
            r1.data = r2
            r2 = 1
            r1.setOrientation(r2)
            r1.render()
            return
    }

    public /* synthetic */ WeaponMaterialsView(com.lumina.monsterhunterfieldbook.MainActivity r8, com.lumina.monsterhunterfieldbook.FieldRecord r9, org.json.JSONObject r10, boolean r11, kotlin.jvm.functions.Function1 r12, kotlin.jvm.functions.Function1 r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
            r7 = this;
            r15 = r14 & 8
            if (r15 == 0) goto L5
            r11 = 0
        L5:
            r4 = r11
            r11 = r14 & 32
            if (r11 == 0) goto Lf
            com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda1 r13 = new com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda1
            r13.<init>()
        Lf:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    private static final kotlin.Unit _init_$lambda$0(java.lang.String r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    private final void render() {
            r35 = this;
            r0 = r35
            r0.removeAllViews()
            boolean r1 = r0.compact
            java.lang.String r2 = ""
            r3 = 4
            r4 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 7
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 24
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r11 = 1065353216(0x3f800000, float:1.0)
            r13 = -2
            r14 = 0
            if (r1 != 0) goto L52f
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            android.widget.LinearLayout r1 = r1.row()
            r15 = 48
            r1.setGravity(r15)
            com.lumina.monsterhunterfieldbook.WeaponModel r15 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            r16 = 1
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r0.a
            r17 = 2
            com.lumina.monsterhunterfieldbook.FieldRecord r9 = r0.record
            r10 = 36
            android.widget.ImageView r8 = r15.icon(r8, r9, r10)
            android.view.View r8 = (android.view.View) r8
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r10 = r0.a
            r15 = 40
            java.lang.Integer r19 = java.lang.Integer.valueOf(r15)
            r20 = r15
            r15 = r19
            java.lang.Number r15 = (java.lang.Number) r15
            int r10 = r10.dp(r15)
            com.lumina.monsterhunterfieldbook.MainActivity r15 = r0.a
            r19 = 44
            java.lang.Integer r19 = java.lang.Integer.valueOf(r19)
            r12 = r19
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r15.dp(r12)
            r9.<init>(r10, r12)
            android.view.ViewGroup$LayoutParams r9 = (android.view.ViewGroup.LayoutParams) r9
            r1.addView(r8, r9)
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r0.a
            com.lumina.monsterhunterfieldbook.FieldRecord r9 = r0.record
            java.lang.String r22 = r9.getName()
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r0.a
            boolean r9 = r9.getWide()
            if (r9 == 0) goto L7d
            r9 = 1104674816(0x41d80000, float:27.0)
            goto L7f
        L7d:
            r9 = 1103626240(0x41c80000, float:25.0)
        L7f:
            r23 = r9
            r26 = 8
            r27 = 0
            r24 = 1
            r25 = 0
            r21 = r8
            android.widget.TextView r8 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r21, r22, r23, r24, r25, r26, r27)
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r0.a
            r10 = 12
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Number r10 = (java.lang.Number) r10
            int r9 = r9.dp(r10)
            com.lumina.monsterhunterfieldbook.MainActivity r10 = r0.a
            r12 = r4
            java.lang.Number r12 = (java.lang.Number) r12
            int r10 = r10.dp(r12)
            r8.setPadding(r9, r14, r10, r14)
            android.view.View r8 = (android.view.View) r8
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r9.<init>(r14, r13, r11)
            android.view.ViewGroup$LayoutParams r9 = (android.view.ViewGroup.LayoutParams) r9
            r1.addView(r8, r9)
            android.widget.FrameLayout r8 = new android.widget.FrameLayout
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r0.a
            android.content.Context r9 = (android.content.Context) r9
            r8.<init>(r9)
            com.lumina.monsterhunterfieldbook.GlyphView r9 = new com.lumina.monsterhunterfieldbook.GlyphView
            com.lumina.monsterhunterfieldbook.MainActivity r10 = r0.a
            r12 = r10
            android.content.Context r12 = (android.content.Context) r12
            com.lumina.monsterhunterfieldbook.FieldRecord r15 = r0.record
            java.lang.String r15 = r15.getId()
            boolean r10 = r10.isBookmarked(r15)
            if (r10 == 0) goto Ld8
            com.lumina.monsterhunterfieldbook.MainActivity r10 = r0.a
            int r10 = r10.getAccent()
            goto Lde
        Ld8:
            com.lumina.monsterhunterfieldbook.MainActivity r10 = r0.a
            int r10 = r10.getMuted()
        Lde:
            java.lang.String r15 = "bookmark"
            r9.<init>(r12, r15, r10)
            r10 = r9
            android.view.View r10 = (android.view.View) r10
            android.widget.FrameLayout$LayoutParams r12 = new android.widget.FrameLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r15 = r0.a
            r19 = 21
            java.lang.Integer r19 = java.lang.Integer.valueOf(r19)
            r13 = r19
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r15.dp(r13)
            com.lumina.monsterhunterfieldbook.MainActivity r15 = r0.a
            r19 = 21
            java.lang.Integer r19 = java.lang.Integer.valueOf(r19)
            r11 = r19
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r15.dp(r11)
            r15 = 17
            r12.<init>(r13, r11, r15)
            android.view.ViewGroup$LayoutParams r12 = (android.view.ViewGroup.LayoutParams) r12
            r8.addView(r10, r12)
            com.lumina.monsterhunterfieldbook.MainActivity r10 = r0.a
            r11 = r8
            android.view.View r11 = (android.view.View) r11
            com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda3 r12 = new com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda3
            r12.<init>(r0, r8, r9)
            r10.touch(r11, r12)
            render$sync(r0, r8, r9)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r0.a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r20)
            java.lang.Number r10 = (java.lang.Number) r10
            int r9 = r9.dp(r10)
            com.lumina.monsterhunterfieldbook.MainActivity r10 = r0.a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r20)
            java.lang.Number r12 = (java.lang.Number) r12
            int r10 = r10.dp(r12)
            r8.<init>(r9, r10)
            android.view.ViewGroup$LayoutParams r8 = (android.view.ViewGroup.LayoutParams) r8
            r1.addView(r11, r8)
            android.view.View r1 = (android.view.View) r1
            r0.addView(r1)
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            r8 = r0
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r1.gap(r8, r6)
            android.widget.GridLayout r1 = new android.widget.GridLayout
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r0.a
            android.content.Context r8 = (android.content.Context) r8
            r1.<init>(r8)
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r0.a
            android.content.res.Resources r8 = r8.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            int r8 = r8.screenWidthDp
            r9 = 650(0x28a, float:9.11E-43)
            if (r8 < r9) goto L16c
            r8 = r3
            goto L16e
        L16c:
            r8 = r17
        L16e:
            r1.setColumnCount(r8)
            kotlin.Pair[] r8 = new kotlin.Pair[r3]
            com.lumina.monsterhunterfieldbook.WeaponModel r9 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            org.json.JSONObject r10 = r0.data
            java.lang.String r11 = "attack"
            java.lang.Object r10 = r10.opt(r11)
            java.lang.String r9 = r9.shown(r10)
            java.lang.String r10 = "Attack"
            kotlin.Pair r9 = kotlin.TuplesKt.to(r10, r9)
            r8[r14] = r9
            com.lumina.monsterhunterfieldbook.WeaponModel r9 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            org.json.JSONObject r10 = r0.data
            java.lang.String r11 = "affinity"
            java.lang.Object r10 = r10.opt(r11)
            java.lang.String r9 = r9.shown(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.StringBuilder r9 = r10.append(r9)
            java.lang.String r10 = "%"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "Affinity"
            kotlin.Pair r9 = kotlin.TuplesKt.to(r10, r9)
            r8[r16] = r9
            com.lumina.monsterhunterfieldbook.WeaponModel r9 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            org.json.JSONObject r10 = r0.data
            java.lang.String r11 = "rarity"
            java.lang.Object r10 = r10.opt(r11)
            java.lang.String r9 = r9.shown(r10)
            java.lang.String r10 = "Rarity"
            kotlin.Pair r9 = kotlin.TuplesKt.to(r10, r9)
            r8[r17] = r9
            com.lumina.monsterhunterfieldbook.WeaponModel r9 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            org.json.JSONObject r10 = r0.data
            java.lang.String r11 = "defense"
            java.lang.Object r10 = r10.opt(r11)
            if (r10 != 0) goto L1d8
            java.lang.Integer r10 = java.lang.Integer.valueOf(r14)
        L1d8:
            java.lang.String r9 = r9.shown(r10)
            java.lang.String r10 = "Defense"
            kotlin.Pair r9 = kotlin.TuplesKt.to(r10, r9)
            r10 = 3
            r8[r10] = r9
            java.util.List r8 = kotlin.collections.CollectionsKt.listOf(r8)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            r9 = r14
        L1f0:
            boolean r10 = r8.hasNext()
            r11 = 22
            if (r10 == 0) goto L278
            java.lang.Object r10 = r8.next()
            int r12 = r9 + 1
            if (r9 >= 0) goto L203
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L203:
            kotlin.Pair r10 = (kotlin.Pair) r10
            java.lang.Object r13 = r10.component1()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r10 = r10.component2()
            r24 = r10
            java.lang.String r24 = (java.lang.String) r24
            com.lumina.monsterhunterfieldbook.MainActivity r10 = r0.a
            r28 = 12
            r29 = 0
            r25 = 1097859072(0x41700000, float:15.0)
            r26 = 0
            r27 = 0
            r23 = r10
            android.widget.TextView r10 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r23, r24, r25, r26, r27, r28, r29)
            android.view.View r10 = (android.view.View) r10
            android.widget.LinearLayout r10 = r0.stat(r13, r10)
            android.view.View r10 = (android.view.View) r10
            android.widget.GridLayout$LayoutParams r13 = new android.widget.GridLayout$LayoutParams
            r13.<init>()
            r13.width = r14
            int r15 = r1.getColumnCount()
            int r15 = r9 % r15
            r19 = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            android.widget.GridLayout$Spec r15 = android.widget.GridLayout.spec(r15, r3)
            r13.columnSpec = r15
            int r3 = r1.getColumnCount()
            int r9 = r9 / r3
            android.widget.GridLayout$Spec r3 = android.widget.GridLayout.spec(r9)
            r13.rowSpec = r3
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            r9 = 18
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Number r9 = (java.lang.Number) r9
            int r3 = r3.dp(r9)
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r0.a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Number r11 = (java.lang.Number) r11
            int r9 = r9.dp(r11)
            r13.setMargins(r14, r14, r3, r9)
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            android.view.ViewGroup$LayoutParams r13 = (android.view.ViewGroup.LayoutParams) r13
            r1.addView(r10, r13)
            r9 = r12
            r3 = r19
            goto L1f0
        L278:
            r19 = r3
            android.view.View r1 = (android.view.View) r1
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r8 = -1
            r9 = -2
            r3.<init>(r8, r9)
            android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
            r0.addView(r1, r3)
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            com.lumina.monsterhunterfieldbook.FieldRecord r3 = r0.record
            int r8 = r1.getInk()
            r9 = 1097859072(0x41700000, float:15.0)
            android.view.ViewGroup r1 = com.lumina.monsterhunterfieldbook.WeaponProfilePanelKt.access$weaponElements(r1, r3, r9, r8)
            android.view.View r1 = (android.view.View) r1
            java.lang.String r3 = "Element / status"
            android.widget.LinearLayout r1 = r0.stat(r3, r1)
            android.view.View r1 = (android.view.View) r1
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r8 = -1
            r10 = -2
            r3.<init>(r8, r10)
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r0.a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            java.lang.Number r10 = (java.lang.Number) r10
            int r8 = r8.dp(r10)
            r3.bottomMargin = r8
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
            r0.addView(r1, r3)
            com.lumina.monsterhunterfieldbook.WeaponModel r1 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            com.lumina.monsterhunterfieldbook.FieldRecord r3 = r0.record
            java.util.List r1 = r1.slots(r3)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            android.widget.LinearLayout r3 = r3.row()
            r8 = 48
            r3.setGravity(r8)
            boolean r8 = r1.isEmpty()
            if (r8 == 0) goto L2f4
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            int r27 = r1.getMuted()
            r28 = 4
            r29 = 0
            java.lang.String r24 = "None"
            r25 = 1097859072(0x41700000, float:15.0)
            r26 = 0
            r23 = r1
            android.widget.TextView r1 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r23, r24, r25, r26, r27, r28, r29)
            android.view.View r1 = (android.view.View) r1
            r3.addView(r1)
        L2f0:
            r18 = r11
            goto L451
        L2f4:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L2fa:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L2f0
            java.lang.Object r8 = r1.next()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            com.lumina.monsterhunterfieldbook.MainActivity r10 = r0.a
            android.widget.LinearLayout r10 = r10.row()
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r0.a
            r13 = 6
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Number r13 = (java.lang.Number) r13
            int r12 = r12.dp(r13)
            com.lumina.monsterhunterfieldbook.MainActivity r13 = r0.a
            r15 = 5
            java.lang.Integer r18 = java.lang.Integer.valueOf(r15)
            r9 = r18
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r13.dp(r9)
            com.lumina.monsterhunterfieldbook.MainActivity r13 = r0.a
            r18 = r11
            r11 = r4
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r13.dp(r11)
            com.lumina.monsterhunterfieldbook.MainActivity r13 = r0.a
            java.lang.Integer r24 = java.lang.Integer.valueOf(r15)
            r25 = r15
            r15 = r24
            java.lang.Number r15 = (java.lang.Number) r15
            int r13 = r13.dp(r15)
            r10.setPadding(r12, r9, r11, r13)
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r0.a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r20)
            java.lang.Number r11 = (java.lang.Number) r11
            int r9 = r9.dp(r11)
            r10.setMinimumHeight(r9)
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r0.a
            r30 = 6
            r31 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r26 = r9
            android.graphics.drawable.GradientDrawable r9 = com.lumina.monsterhunterfieldbook.MainActivity.surface$default(r26, r27, r28, r29, r30, r31)
            android.graphics.drawable.Drawable r9 = (android.graphics.drawable.Drawable) r9
            r10.setBackground(r9)
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r0.a
            org.json.JSONObject r9 = r9.getLibraryData()
            java.lang.String r11 = "nativeVisuals"
            org.json.JSONObject r9 = r9.optJSONObject(r11)
            if (r9 == 0) goto L38f
            java.lang.String r11 = "slots"
            org.json.JSONObject r9 = r9.optJSONObject(r11)
            if (r9 == 0) goto L38f
            java.lang.String r11 = java.lang.String.valueOf(r8)
            java.lang.String r9 = r9.optString(r11)
            goto L390
        L38f:
            r9 = 0
        L390:
            if (r9 != 0) goto L393
            r9 = r2
        L393:
            r11 = r9
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            boolean r11 = kotlin.text.StringsKt.isBlank(r11)
            if (r11 != 0) goto L3da
            android.widget.ImageView r11 = new android.widget.ImageView
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r0.a
            android.content.Context r12 = (android.content.Context) r12
            r11.<init>(r12)
            android.widget.ImageView$ScaleType r12 = android.widget.ImageView.ScaleType.FIT_CENTER
            r11.setScaleType(r12)
            r12 = r11
            android.view.View r12 = (android.view.View) r12
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r15 = r0.a
            r24 = 20
            java.lang.Integer r24 = java.lang.Integer.valueOf(r24)
            r6 = r24
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r15.dp(r6)
            com.lumina.monsterhunterfieldbook.MainActivity r15 = r0.a
            java.lang.Integer r24 = java.lang.Integer.valueOf(r18)
            r14 = r24
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r15.dp(r14)
            r13.<init>(r6, r14)
            android.view.ViewGroup$LayoutParams r13 = (android.view.ViewGroup.LayoutParams) r13
            r10.addView(r12, r13)
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r0.a
            r6.assetImage(r9, r11)
        L3da:
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r0.a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "Lv "
            r9.<init>(r11)
            java.lang.StringBuilder r9 = r9.append(r8)
            java.lang.String r29 = r9.toString()
            r33 = 12
            r34 = 0
            r30 = 1094713344(0x41400000, float:12.0)
            r31 = 0
            r32 = 0
            r28 = r6
            android.widget.TextView r6 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r28, r29, r30, r31, r32, r33, r34)
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r0.a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r25)
            java.lang.Number r11 = (java.lang.Number) r11
            int r9 = r9.dp(r11)
            r11 = 0
            r6.setPadding(r9, r11, r11, r11)
            android.view.View r6 = (android.view.View) r6
            r10.addView(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r9 = "Find decorations fitting slot level "
            r6.<init>(r9)
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r10.setContentDescription(r6)
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r0.a
            android.view.View r10 = (android.view.View) r10
            com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda4 r9 = new com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda4
            r9.<init>(r0, r8)
            r6.touch(r10, r9)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r9 = -2
            r6.<init>(r9, r9)
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r0.a
            r9 = r5
            java.lang.Number r9 = (java.lang.Number) r9
            int r8 = r8.dp(r9)
            r6.rightMargin = r8
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            android.view.ViewGroup$LayoutParams r6 = (android.view.ViewGroup.LayoutParams) r6
            r3.addView(r10, r6)
            r11 = r18
            r6 = 24
            r9 = 1097859072(0x41700000, float:15.0)
            r14 = 0
            goto L2fa
        L451:
            java.lang.String r1 = "Slots"
            android.view.View r3 = (android.view.View) r3
            android.widget.LinearLayout r1 = r0.stat(r1, r3)
            android.view.View r1 = (android.view.View) r1
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r8 = -1
            r9 = -2
            r3.<init>(r8, r9)
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r0.a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r18)
            java.lang.Number r8 = (java.lang.Number) r8
            int r6 = r6.dp(r8)
            r3.bottomMargin = r6
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
            r0.addView(r1, r3)
            android.view.View r1 = r0.sharpness()
            if (r1 == 0) goto L4a5
            java.lang.String r3 = "Sharpness"
            android.widget.LinearLayout r1 = r0.stat(r3, r1)
            android.view.View r1 = (android.view.View) r1
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r8 = -1
            r9 = -2
            r3.<init>(r8, r9)
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r0.a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r18)
            java.lang.Number r8 = (java.lang.Number) r8
            int r6 = r6.dp(r8)
            r3.bottomMargin = r6
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
            r0.addView(r1, r3)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L4a5:
            org.json.JSONObject r1 = r0.data
            java.lang.String r3 = "attributes"
            org.json.JSONObject r1 = r1.optJSONObject(r3)
            if (r1 == 0) goto L52c
            java.util.Iterator r3 = r1.keys()
            java.lang.String r6 = "keys(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r6)
        L4b8:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L528
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r8 = r1.opt(r6)
            if (r8 == 0) goto L4b8
            java.lang.Object r9 = org.json.JSONObject.NULL
            if (r8 == r9) goto L4b8
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r2)
            if (r9 != 0) goto L4b8
            r27 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r27)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r9)
            if (r9 != 0) goto L4b8
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            kotlin.text.Regex r9 = new kotlin.text.Regex
            java.lang.String r10 = "([A-Z])"
            r9.<init>(r10)
            java.lang.String r10 = " $1"
            java.lang.String r6 = r9.replace(r6, r10)
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r0.a
            java.lang.String r10 = r8.toString()
            r14 = 12
            r15 = 0
            r11 = 1097859072(0x41700000, float:15.0)
            r12 = 0
            r13 = 0
            android.widget.TextView r8 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r9, r10, r11, r12, r13, r14, r15)
            android.view.View r8 = (android.view.View) r8
            android.widget.LinearLayout r6 = r0.stat(r6, r8)
            android.view.View r6 = (android.view.View) r6
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r9 = -1
            r10 = -2
            r8.<init>(r9, r10)
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r0.a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r18)
            java.lang.Number r10 = (java.lang.Number) r10
            int r9 = r9.dp(r10)
            r8.bottomMargin = r9
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            android.view.ViewGroup$LayoutParams r8 = (android.view.ViewGroup.LayoutParams) r8
            r0.addView(r6, r8)
            goto L4b8
        L528:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L52c:
            r1 = r17
            goto L534
        L52f:
            r19 = r3
            r16 = 1
            r1 = 2
        L534:
            java.lang.String[] r3 = new java.lang.String[r1]
            java.lang.String r1 = "forge"
            r27 = 0
            r3[r27] = r1
            java.lang.String r6 = "upgrade"
            r3[r16] = r6
            java.util.List r3 = kotlin.collections.CollectionsKt.listOf(r3)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.Iterator r3 = r3.iterator()
        L551:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L56a
            java.lang.Object r9 = r3.next()
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            org.json.JSONObject r11 = r0.data
            org.json.JSONObject r10 = r11.optJSONObject(r10)
            if (r10 == 0) goto L551
            r8.add(r9)
            goto L551
        L56a:
            java.util.List r8 = (java.util.List) r8
            r3 = r8
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            r10 = 16
            if (r3 != 0) goto L923
            org.json.JSONObject r3 = r0.state
            java.lang.String r11 = "path"
            java.lang.String r3 = r3.optString(r11)
            boolean r3 = r8.contains(r3)
            if (r3 != 0) goto L593
            org.json.JSONObject r3 = r0.state
            boolean r12 = r8.contains(r6)
            if (r12 == 0) goto L58f
            r12 = r6
            goto L590
        L58f:
            r12 = r1
        L590:
            r3.put(r11, r12)
        L593:
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            android.widget.LinearLayout r3 = r3.row()
            java.lang.String r12 = "Crafting path"
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r3.setContentDescription(r12)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L5a6:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L639
            java.lang.Object r12 = r8.next()
            java.lang.String r12 = (java.lang.String) r12
            org.json.JSONObject r13 = r0.state
            java.lang.String r13 = r13.optString(r11)
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual(r13, r12)
            com.lumina.monsterhunterfieldbook.MainActivity r14 = r0.a
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual(r12, r1)
            if (r15 == 0) goto L5c7
            java.lang.String r15 = "Forge"
            goto L5c9
        L5c7:
            java.lang.String r15 = "Upgrade"
        L5c9:
            com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda5 r9 = new com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda5
            r9.<init>(r0, r12)
            android.widget.TextView r9 = r14.button(r15, r9)
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r0.a
            if (r13 == 0) goto L5e3
            int r14 = r12.getAccent()
            r15 = 24
            int r14 = com.lumina.monsterhunterfieldbook.FieldViewsKt.alphaColour(r14, r15)
            r29 = r14
            goto L5e7
        L5e3:
            r15 = 24
            r29 = 0
        L5e7:
            r32 = 6
            r33 = 0
            r30 = 0
            r31 = 0
            r28 = r12
            android.graphics.drawable.GradientDrawable r12 = com.lumina.monsterhunterfieldbook.MainActivity.surface$default(r28, r29, r30, r31, r32, r33)
            android.graphics.drawable.Drawable r12 = (android.graphics.drawable.Drawable) r12
            r9.setBackground(r12)
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r0.a
            if (r13 == 0) goto L603
            int r12 = r12.getAccent()
            goto L607
        L603:
            int r12 = r12.getMuted()
        L607:
            r9.setTextColor(r12)
            r9.setSelected(r13)
            android.view.View r9 = (android.view.View) r9
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r13 = r0.a
            r14 = 44
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Number r14 = (java.lang.Number) r14
            int r13 = r13.dp(r14)
            r14 = 1065353216(0x3f800000, float:1.0)
            r15 = 0
            r12.<init>(r15, r13, r14)
            com.lumina.monsterhunterfieldbook.MainActivity r13 = r0.a
            r14 = r5
            java.lang.Number r14 = (java.lang.Number) r14
            int r13 = r13.dp(r14)
            r12.rightMargin = r13
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            android.view.ViewGroup$LayoutParams r12 = (android.view.ViewGroup.LayoutParams) r12
            r3.addView(r9, r12)
            goto L5a6
        L639:
            android.view.View r3 = (android.view.View) r3
            r0.addView(r3)
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            r3 = r0
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r1.gap(r3, r10)
            org.json.JSONObject r1 = r0.state
            java.lang.String r1 = r1.optString(r11)
            org.json.JSONObject r8 = r0.data
            org.json.JSONObject r8 = r8.getJSONObject(r1)
            boolean r9 = r0.compact
            if (r9 != 0) goto L6e3
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r1 == 0) goto L6e3
            com.lumina.monsterhunterfieldbook.WeaponModel r1 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            com.lumina.monsterhunterfieldbook.FieldRecord r6 = r0.record
            java.lang.String r1 = r1.parent(r6)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = kotlin.text.StringsKt.isBlank(r1)
            if (r1 != 0) goto L6e3
            com.lumina.monsterhunterfieldbook.WeaponModel r1 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            com.lumina.monsterhunterfieldbook.FieldRecord r6 = r0.record
            java.lang.String r1 = r1.parent(r6)
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r0.a
            android.widget.LinearLayout r6 = r6.row()
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r0.a
            int r32 = r9.getMuted()
            r33 = 4
            r34 = 0
            java.lang.String r29 = "From "
            r30 = 1094713344(0x41400000, float:12.0)
            r31 = 0
            r28 = r9
            android.widget.TextView r9 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r28, r29, r30, r31, r32, r33, r34)
            android.view.View r9 = (android.view.View) r9
            r6.addView(r9)
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r0.a
            com.lumina.monsterhunterfieldbook.WeaponModel r11 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            com.lumina.monsterhunterfieldbook.FieldRecord r11 = r11.record(r1)
            if (r11 == 0) goto L6a9
            java.lang.String r11 = r11.getName()
            if (r11 != 0) goto L6a6
            goto L6a9
        L6a6:
            r29 = r11
            goto L6ab
        L6a9:
            r29 = r1
        L6ab:
            com.lumina.monsterhunterfieldbook.MainActivity r11 = r0.a
            int r32 = r11.getAccent()
            r33 = 4
            r34 = 0
            r30 = 1094713344(0x41400000, float:12.0)
            r31 = 0
            r28 = r9
            android.widget.TextView r9 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r28, r29, r30, r31, r32, r33, r34)
            com.lumina.monsterhunterfieldbook.MainActivity r11 = r0.a
            android.view.View r9 = (android.view.View) r9
            com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda6 r12 = new com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda6
            r12.<init>(r0, r1)
            r11.touch(r9, r12)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r11 = -2
            r14 = 1065353216(0x3f800000, float:1.0)
            r15 = 0
            r1.<init>(r15, r11, r14)
            android.view.ViewGroup$LayoutParams r1 = (android.view.ViewGroup.LayoutParams) r1
            r6.addView(r9, r1)
            android.view.View r6 = (android.view.View) r6
            r0.addView(r6)
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            r1.gap(r3, r10)
        L6e3:
            java.lang.String r1 = "materials"
            org.json.JSONArray r1 = r8.optJSONArray(r1)
            if (r1 == 0) goto L8b2
            int r6 = r1.length()
            if (r6 != 0) goto L6f3
            goto L8b2
        L6f3:
            int r6 = r1.length()
            r11 = 0
        L6f8:
            if (r11 >= r6) goto L8cd
            org.json.JSONObject r9 = r1.optJSONObject(r11)
            if (r9 != 0) goto L70a
            r20 = r1
            r24 = r2
            r22 = r4
            r4 = -1
            r10 = -2
            goto L8a6
        L70a:
            java.lang.String r12 = "name"
            java.lang.String r29 = r9.optString(r12)
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r0.a
            android.widget.LinearLayout r12 = r12.row()
            r12.setGravity(r10)
            com.lumina.monsterhunterfieldbook.MainActivity r13 = r0.a
            r14 = r5
            java.lang.Number r14 = (java.lang.Number) r14
            int r13 = r13.dp(r14)
            com.lumina.monsterhunterfieldbook.MainActivity r14 = r0.a
            r15 = r5
            java.lang.Number r15 = (java.lang.Number) r15
            int r14 = r14.dp(r15)
            r15 = 0
            r12.setPadding(r15, r13, r15, r14)
            android.widget.ImageView r13 = new android.widget.ImageView
            com.lumina.monsterhunterfieldbook.MainActivity r14 = r0.a
            android.content.Context r14 = (android.content.Context) r14
            r13.<init>(r14)
            android.widget.ImageView$ScaleType r14 = android.widget.ImageView.ScaleType.FIT_CENTER
            r13.setScaleType(r14)
            r14 = 2
            r13.setImportantForAccessibility(r14)
            r15 = r13
            android.view.View r15 = (android.view.View) r15
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r10 = r0.a
            r20 = r1
            r1 = r7
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r10.dp(r1)
            com.lumina.monsterhunterfieldbook.MainActivity r10 = r0.a
            r24 = r2
            r2 = r7
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r10.dp(r2)
            r14.<init>(r1, r2)
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            r2 = r4
            java.lang.Number r2 = (java.lang.Number) r2
            int r1 = r1.dp(r2)
            r14.rightMargin = r1
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            android.view.ViewGroup$LayoutParams r14 = (android.view.ViewGroup.LayoutParams) r14
            r12.addView(r15, r14)
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r29)
            boolean r2 = r0.compact
            if (r2 == 0) goto L77d
            r30 = 1096810496(0x41600000, float:14.0)
            goto L77f
        L77d:
            r30 = 1097859072(0x41700000, float:15.0)
        L77f:
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            int r32 = r2.getAccent()
            r33 = 4
            r34 = 0
            r31 = 0
            r28 = r1
            android.widget.TextView r1 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r28, r29, r30, r31, r32, r33, r34)
            r2 = r29
            android.view.View r1 = (android.view.View) r1
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r22 = r4
            r4 = 0
            r14 = 1065353216(0x3f800000, float:1.0)
            r15 = -2
            r10.<init>(r4, r15, r14)
            android.view.ViewGroup$LayoutParams r10 = (android.view.ViewGroup.LayoutParams) r10
            r12.addView(r1, r10)
            java.lang.String r1 = "quantity"
            boolean r4 = r9.has(r1)
            if (r4 == 0) goto L7e4
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            com.lumina.monsterhunterfieldbook.WeaponModel r10 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            java.lang.Object r15 = r9.opt(r1)
            java.lang.String r10 = r10.shown(r15)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r14 = " ×"
            r15.<init>(r14)
            java.lang.StringBuilder r10 = r15.append(r10)
            java.lang.String r29 = r10.toString()
            boolean r10 = r0.compact
            if (r10 == 0) goto L7cf
            r30 = 1096810496(0x41600000, float:14.0)
            goto L7d1
        L7cf:
            r30 = 1097859072(0x41700000, float:15.0)
        L7d1:
            r33 = 12
            r34 = 0
            r31 = 0
            r32 = 0
            r28 = r4
            android.widget.TextView r4 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r28, r29, r30, r31, r32, r33, r34)
            android.view.View r4 = (android.view.View) r4
            r12.addView(r4)
        L7e4:
            boolean r4 = r9.has(r1)
            if (r4 == 0) goto L804
            com.lumina.monsterhunterfieldbook.WeaponModel r4 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            java.lang.Object r1 = r9.opt(r1)
            java.lang.String r1 = r4.shown(r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r10 = ", quantity "
            r4.<init>(r10)
            java.lang.StringBuilder r1 = r4.append(r1)
            java.lang.String r1 = r1.toString()
            goto L806
        L804:
            r1 = r24
        L806:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.StringBuilder r1 = r4.append(r1)
            java.lang.String r1 = r1.toString()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r12.setContentDescription(r1)
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            android.view.View r12 = (android.view.View) r12
            com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda7 r4 = new com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda7
            r4.<init>(r0, r2, r9)
            r1.touch(r12, r4)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r10 = -2
            r1.<init>(r4, r10)
            android.view.ViewGroup$LayoutParams r1 = (android.view.ViewGroup.LayoutParams) r1
            r0.addView(r12, r1)
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            com.lumina.monsterhunterfieldbook.Catalogue r1 = r1.getCatalogue()
            java.util.concurrent.ExecutorService r1 = r1.getExecutor()
            com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda8 r12 = new com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda8
            r12.<init>(r0, r2, r13)
            r1.execute(r12)
            java.lang.String r1 = "points"
            boolean r1 = r9.has(r1)
            if (r1 == 0) goto L8a6
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            com.lumina.monsterhunterfieldbook.WeaponModel r2 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            java.lang.String r12 = "points"
            java.lang.Object r9 = r9.opt(r12)
            java.lang.String r2 = r2.shown(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.StringBuilder r2 = r9.append(r2)
            java.lang.String r9 = " pts each"
            java.lang.StringBuilder r2 = r2.append(r9)
            java.lang.String r29 = r2.toString()
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            int r32 = r2.getMuted()
            r33 = 4
            r34 = 0
            r30 = 1092616192(0x41200000, float:10.0)
            r31 = 0
            r28 = r1
            android.widget.TextView r1 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r28, r29, r30, r31, r32, r33, r34)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            r9 = 32
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Number r9 = (java.lang.Number) r9
            int r2 = r2.dp(r9)
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r0.a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r19)
            java.lang.Number r12 = (java.lang.Number) r12
            int r9 = r9.dp(r12)
            r15 = 0
            r1.setPadding(r2, r15, r15, r9)
            android.view.View r1 = (android.view.View) r1
            r0.addView(r1)
        L8a6:
            int r11 = r11 + 1
            r1 = r20
            r4 = r22
            r2 = r24
            r10 = 16
            goto L6f8
        L8b2:
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            int r32 = r1.getMuted()
            r33 = 4
            r34 = 0
            java.lang.String r29 = "—"
            r30 = 1097859072(0x41700000, float:15.0)
            r31 = 0
            r28 = r1
            android.widget.TextView r1 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r28, r29, r30, r31, r32, r33, r34)
            android.view.View r1 = (android.view.View) r1
            r0.addView(r1)
        L8cd:
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            r2 = 14
            r1.gap(r3, r2)
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r0.a
            java.lang.String r1 = "zenny"
            boolean r2 = r8.has(r1)
            if (r2 == 0) goto L902
            boolean r2 = r8.isNull(r1)
            if (r2 != 0) goto L902
            com.lumina.monsterhunterfieldbook.WeaponModel r2 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            java.lang.Object r1 = r8.opt(r1)
            java.lang.String r1 = r2.number(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = " z"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L904
        L902:
            java.lang.String r1 = "Price not supplied"
        L904:
            r10 = r1
            boolean r1 = r0.compact
            if (r1 == 0) goto L90d
            r1 = 1098907648(0x41800000, float:16.0)
            r11 = r1
            goto L90f
        L90d:
            r11 = 1097859072(0x41700000, float:15.0)
        L90f:
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            int r13 = r1.getMuted()
            r14 = 4
            r15 = 0
            r12 = 0
            android.widget.TextView r1 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r9, r10, r11, r12, r13, r14, r15)
            android.view.View r1 = (android.view.View) r1
            r0.addView(r1)
            goto L9a9
        L923:
            org.json.JSONObject r1 = r0.data
            java.lang.String r2 = "obtain"
            java.lang.Object r1 = r1.opt(r2)
            boolean r2 = r1 instanceof org.json.JSONArray
            if (r2 == 0) goto L955
            r2 = r1
            org.json.JSONArray r2 = (org.json.JSONArray) r2
            int r2 = r2.length()
            r15 = 0
            kotlin.ranges.IntRange r2 = kotlin.ranges.RangesKt.until(r15, r2)
            r3 = r2
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.lang.String r2 = "\n"
            r4 = r2
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda9 r9 = new com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda9
            r9.<init>(r1)
            r10 = 30
            r11 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r1 = kotlin.collections.CollectionsKt.joinToString$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L953:
            r3 = r1
            goto L972
        L955:
            boolean r2 = r1 instanceof org.json.JSONObject
            if (r2 == 0) goto L968
            java.lang.String r1 = render$description(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r2 = kotlin.text.StringsKt.isBlank(r1)
            if (r2 == 0) goto L96c
            java.lang.String r1 = "Quest or appraisal reward"
            goto L96c
        L968:
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L96f
        L96c:
            java.lang.String r1 = (java.lang.String) r1
            goto L953
        L96f:
            java.lang.String r1 = "Quest or appraisal reward"
            goto L953
        L972:
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            boolean r1 = r0.compact
            if (r1 == 0) goto L97b
            r4 = 1096810496(0x41600000, float:14.0)
            goto L97d
        L97b:
            r4 = 1097859072(0x41700000, float:15.0)
        L97d:
            r7 = 12
            r8 = 0
            r5 = 0
            r6 = 0
            android.widget.TextView r1 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r2, r3, r4, r5, r6, r7, r8)
            boolean r2 = r0.compact
            if (r2 != 0) goto L9a4
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            r7 = 7
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.graphics.drawable.GradientDrawable r2 = com.lumina.monsterhunterfieldbook.MainActivity.surface$default(r3, r4, r5, r6, r7, r8)
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            r1.setBackground(r2)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            r3 = r1
            android.view.View r3 = (android.view.View) r3
            r4 = 16
            r2.pad(r3, r4)
        L9a4:
            android.view.View r1 = (android.view.View) r1
            r0.addView(r1)
        L9a9:
            boolean r1 = r0.compact
            if (r1 == 0) goto L9fd
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            r2 = r0
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r3 = 12
            r1.gap(r2, r3)
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            android.widget.LinearLayout r1 = r1.row()
            r2 = 8388613(0x800005, float:1.175495E-38)
            r1.setGravity(r2)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda10 r3 = new com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda10
            r3.<init>(r0)
            java.lang.String r4 = "Info"
            android.widget.TextView r2 = r2.button(r4, r3)
            android.view.View r2 = (android.view.View) r2
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            r5 = 88
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r4 = r4.dp(r5)
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r0.a
            r6 = 42
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            int r5 = r5.dp(r6)
            r3.<init>(r4, r5)
            android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
            r1.addView(r2, r3)
            android.view.View r1 = (android.view.View) r1
            r0.addView(r1)
        L9fd:
            return
    }

    private static final java.lang.String render$description(java.lang.Object r2) {
            boolean r0 = r2 instanceof org.json.JSONObject
            if (r0 == 0) goto L32
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            java.lang.String r0 = "description"
            java.lang.String r0 = r2.optString(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r1 = kotlin.text.StringsKt.isBlank(r0)
            if (r1 == 0) goto L2a
            java.lang.String r0 = "method"
            java.lang.String r0 = r2.optString(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r1 = kotlin.text.StringsKt.isBlank(r0)
            if (r1 == 0) goto L28
            java.lang.String r0 = "name"
            java.lang.String r0 = r2.optString(r0)
        L28:
            java.lang.String r0 = (java.lang.String) r0
        L2a:
            java.lang.String r2 = "ifBlank(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L32:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L39
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L39:
            java.lang.String r2 = ""
            return r2
    }

    private static final kotlin.Unit render$lambda$1(com.lumina.monsterhunterfieldbook.WeaponMaterialsView r2, android.widget.FrameLayout r3, com.lumina.monsterhunterfieldbook.GlyphView r4) {
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r2.a
            com.lumina.monsterhunterfieldbook.FieldRecord r1 = r2.record
            java.lang.String r1 = r1.getId()
            r0.toggleBookmark(r1)
            render$sync(r2, r3, r4)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    private static final kotlin.Unit render$lambda$10(com.lumina.monsterhunterfieldbook.WeaponMaterialsView r0, java.lang.String r1) {
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r0 = r0.onSelect
            r0.invoke(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    private static final kotlin.Unit render$lambda$13(com.lumina.monsterhunterfieldbook.WeaponMaterialsView r1, java.lang.String r2, org.json.JSONObject r3) {
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r1.a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.lang.String r0 = "id"
            java.lang.String r3 = r3.optString(r0)
            java.lang.String r0 = "optString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            r1.showWeaponItem(r2, r3)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    private static final void render$lambda$14(com.lumina.monsterhunterfieldbook.WeaponMaterialsView r5, java.lang.String r6, android.widget.ImageView r7) {
            r0 = 0
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L39
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r5.a     // Catch: java.lang.Throwable -> L39
            com.lumina.monsterhunterfieldbook.Catalogue r1 = r1.getCatalogue()     // Catch: java.lang.Throwable -> L39
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "Items"
            java.util.List r1 = r1.reference(r6, r2)     // Catch: java.lang.Throwable -> L39
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L39
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L39
        L18:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L39
            r3 = r2
            com.lumina.monsterhunterfieldbook.FieldRecord r3 = (com.lumina.monsterhunterfieldbook.FieldRecord) r3     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L39
            r4 = 1
            boolean r3 = kotlin.text.StringsKt.equals(r3, r6, r4)     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L18
            goto L32
        L31:
            r2 = r0
        L32:
            com.lumina.monsterhunterfieldbook.FieldRecord r2 = (com.lumina.monsterhunterfieldbook.FieldRecord) r2     // Catch: java.lang.Throwable -> L39
            java.lang.Object r6 = kotlin.Result.m79constructorimpl(r2)     // Catch: java.lang.Throwable -> L39
            goto L44
        L39:
            r6 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r6 = kotlin.ResultKt.createFailure(r6)
            java.lang.Object r6 = kotlin.Result.m79constructorimpl(r6)
        L44:
            boolean r1 = kotlin.Result.m85isFailureimpl(r6)
            if (r1 == 0) goto L4b
            goto L4c
        L4b:
            r0 = r6
        L4c:
            com.lumina.monsterhunterfieldbook.FieldRecord r0 = (com.lumina.monsterhunterfieldbook.FieldRecord) r0
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r5.a
            com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda0 r1 = new com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda0
            r1.<init>(r5, r0, r7)
            r6.runOnUiThread(r1)
            return
    }

    private static final void render$lambda$14$1(com.lumina.monsterhunterfieldbook.WeaponMaterialsView r2, com.lumina.monsterhunterfieldbook.FieldRecord r3, android.widget.ImageView r4) {
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r2.a
            boolean r0 = r0.isDestroyed()
            if (r0 != 0) goto L31
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r2.a
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L31
            boolean r0 = r2.isAttachedToWindow()
            if (r0 == 0) goto L31
            if (r3 == 0) goto L31
            java.lang.String r0 = r3.getImage()
            if (r0 == 0) goto L31
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            r1 = 1
            r0 = r0 ^ r1
            if (r0 != r1) goto L31
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r2.a
            java.lang.String r3 = r3.getImage()
            r2.assetImage(r3, r4)
        L31:
            return
    }

    private static final java.lang.CharSequence render$lambda$17(java.lang.Object r0, int r1) {
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            java.lang.Object r0 = r0.opt(r1)
            java.lang.String r0 = render$description(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            return r0
    }

    private static final kotlin.Unit render$lambda$20(com.lumina.monsterhunterfieldbook.WeaponMaterialsView r2) {
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r0 = r2.onInfo
            com.lumina.monsterhunterfieldbook.WeaponModel r1 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            com.lumina.monsterhunterfieldbook.FieldRecord r2 = r2.record
            java.lang.String r2 = r1.rawId(r2)
            java.lang.String r1 = "rawId(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            r0.invoke(r2)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    private static final kotlin.Unit render$lambda$4$2(com.lumina.monsterhunterfieldbook.WeaponMaterialsView r0, int r1) {
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r0.a
            r0.showCompatibleDecorations(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    private static final kotlin.Unit render$lambda$9$0(com.lumina.monsterhunterfieldbook.WeaponMaterialsView r2, java.lang.String r3) {
            org.json.JSONObject r0 = r2.state
            java.lang.String r1 = "path"
            r0.put(r1, r3)
            r2.render()
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    private static final void render$sync(com.lumina.monsterhunterfieldbook.WeaponMaterialsView r2, android.widget.FrameLayout r3, com.lumina.monsterhunterfieldbook.GlyphView r4) {
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r2.a
            com.lumina.monsterhunterfieldbook.FieldRecord r1 = r2.record
            java.lang.String r1 = r1.getId()
            boolean r0 = r0.isBookmarked(r1)
            if (r0 == 0) goto L11
            java.lang.String r1 = "Remove saved entry"
            goto L13
        L11:
            java.lang.String r1 = "Save entry"
        L13:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r3.setContentDescription(r1)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r2.a
            if (r0 == 0) goto L21
            int r2 = r2.getAccent()
            goto L25
        L21:
            int r2 = r2.getMuted()
        L25:
            r4.setColour(r2)
            r4.invalidate()
            r3.setSelected(r0)
            return
    }

    private final android.view.View sharpness() {
            r14 = this;
            org.json.JSONObject r0 = r14.data
            java.lang.String r1 = "sharpness"
            java.lang.Object r0 = r0.opt(r1)
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            boolean r2 = r0 instanceof org.json.JSONArray
            r3 = 10
            if (r2 == 0) goto L46
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            int r2 = r0.length()
            r4 = 0
            kotlin.ranges.IntRange r2 = kotlin.ranges.RangesKt.until(r4, r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r3)
            r4.<init>(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r2 = r2.iterator()
        L2e:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L43
            r5 = r2
            kotlin.collections.IntIterator r5 = (kotlin.collections.IntIterator) r5
            int r5 = r5.nextInt()
            java.lang.Object r5 = r0.opt(r5)
            r4.add(r5)
            goto L2e
        L43:
            java.util.List r4 = (java.util.List) r4
            goto L67
        L46:
            boolean r2 = r0 instanceof org.json.JSONObject
            if (r2 == 0) goto L101
            r2 = r0
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            java.util.Iterator r2 = r2.keys()
            java.lang.String r4 = "keys(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            kotlin.sequences.Sequence r2 = kotlin.sequences.SequencesKt.asSequence(r2)
            com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda2 r4 = new com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda2
            r4.<init>(r0)
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.map(r2, r4)
            java.util.List r4 = kotlin.sequences.SequencesKt.toList(r0)
        L67:
            r5 = r4
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L78
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L78
            goto L8b
        L78:
            java.util.Iterator r0 = r5.iterator()
        L7c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L8b
            java.lang.Object r2 = r0.next()
            boolean r2 = r2 instanceof java.lang.Number
            if (r2 != 0) goto L7c
            return r1
        L8b:
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r14.a
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r5, r3)
            r1.<init>(r2)
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r2 = r5.iterator()
        L9c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lb9
            java.lang.Object r3 = r2.next()
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Number"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r4)
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r1.add(r3)
            goto L9c
        Lb9:
            java.util.List r1 = (java.util.List) r1
            com.lumina.monsterhunterfieldbook.WeaponSharpnessView r2 = new com.lumina.monsterhunterfieldbook.WeaponSharpnessView
            r2.<init>(r0, r1)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r14.a
            r3 = 12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r1 = r1.dp(r3)
            r3 = -1
            r0.<init>(r3, r1)
            android.view.ViewGroup$LayoutParams r0 = (android.view.ViewGroup.LayoutParams) r0
            r2.setLayoutParams(r0)
            java.lang.String r0 = " / "
            r6 = r0
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r12 = 62
            r13 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r0 = kotlin.collections.CollectionsKt.joinToString$default(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Sharpness: "
            r1.<init>(r3)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.setContentDescription(r0)
            android.view.View r2 = (android.view.View) r2
            return r2
        L101:
            return r1
    }

    private static final java.lang.Object sharpness$lambda$1(java.lang.Object r0, java.lang.String r1) {
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.lang.Object r0 = r0.opt(r1)
            return r0
    }

    private final android.widget.LinearLayout stat(java.lang.String r9, android.view.View r10) {
            r8 = this;
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r8.a
            android.widget.LinearLayout r0 = r0.column()
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r8.a
            int r5 = r1.getMuted()
            r6 = 4
            r7 = 0
            r3 = 1094713344(0x41400000, float:12.0)
            r4 = 0
            r2 = r9
            android.widget.TextView r9 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r1, r2, r3, r4, r5, r6, r7)
            android.view.View r9 = (android.view.View) r9
            r0.addView(r9)
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r8.a
            r1 = 7
            r9.gap(r0, r1)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            android.view.ViewGroup$LayoutParams r1 = r10.getLayoutParams()
            if (r1 == 0) goto L2c
            int r1 = r1.height
            goto L2d
        L2c:
            r1 = -2
        L2d:
            r2 = -1
            r9.<init>(r2, r1)
            android.view.ViewGroup$LayoutParams r9 = (android.view.ViewGroup.LayoutParams) r9
            r0.addView(r10, r9)
            return r0
    }

    public final boolean getCompact() {
            r1 = this;
            boolean r0 = r1.compact
            return r0
    }

    public final com.lumina.monsterhunterfieldbook.FieldRecord getRecord() {
            r1 = this;
            com.lumina.monsterhunterfieldbook.FieldRecord r0 = r1.record
            return r0
    }

    public final org.json.JSONObject getState() {
            r1 = this;
            org.json.JSONObject r0 = r1.state
            return r0
    }
}
