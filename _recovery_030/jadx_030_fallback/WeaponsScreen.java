package com.lumina.monsterhunterfieldbook;

/* compiled from: WeaponsScreen.kt */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0011H\u0002J(\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011H\u0014J\b\u0010\"\u001a\u00020\u001dH\u0002J\b\u0010#\u001a\u00020\u001dH\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0014H\u0002J\u0006\u0010'\u001a\u00020\u0005J\b\u0010(\u001a\u00020\u001dH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00180\u0017j\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0018`\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/WeaponsScreen;", "Landroid/widget/ScrollView;", "a", "Lcom/lumina/monsterhunterfieldbook/MainActivity;", "restored", "Lorg/json/JSONObject;", "<init>", "(Lcom/lumina/monsterhunterfieldbook/MainActivity;Lorg/json/JSONObject;)V", "page", "Landroid/widget/LinearLayout;", "chips", "grid", "token", "Ljava/util/concurrent/atomic/AtomicInteger;", "kind", "", "position", "", "guides", "", "Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "columns", "chipViews", "Ljava/util/LinkedHashMap;", "Landroid/widget/TextView;", "Lkotlin/collections/LinkedHashMap;", "columnCount", "width", "onSizeChanged", "", "w", "h", "oldw", "oldh", "syncChips", "renderCards", "card", "Landroid/view/View;", "record", "snapshot", "onDetachedFromWindow", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WeaponsScreen extends android.widget.ScrollView {
    private final com.lumina.monsterhunterfieldbook.MainActivity a;
    private final java.util.LinkedHashMap<java.lang.String, android.widget.TextView> chipViews;
    private final android.widget.LinearLayout chips;
    private int columns;
    private final android.widget.LinearLayout grid;
    private java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> guides;
    private java.lang.String kind;
    private final android.widget.LinearLayout page;
    private int position;
    private final java.util.concurrent.atomic.AtomicInteger token;

    public static /* synthetic */ kotlin.Unit $r8$lambda$NDW05CHrjMMXuSdQjfDCROZ75Qg(com.lumina.monsterhunterfieldbook.WeaponsScreen r0, com.lumina.monsterhunterfieldbook.FieldRecord r1, android.widget.FrameLayout r2, com.lumina.monsterhunterfieldbook.GlyphView r3) {
            kotlin.Unit r0 = card$lambda$4(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PXDcBn5mgi4CPBvrPWXa8z7t3WE(com.lumina.monsterhunterfieldbook.WeaponsScreen r0, java.lang.String r1) {
            kotlin.Unit r0 = syncChips$lambda$0$0(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Vu9TEh1XEsjhg6a7CaYhgfV6yRI(com.lumina.monsterhunterfieldbook.WeaponsScreen r0, java.lang.String r1) {
            kotlin.Unit r0 = card$lambda$6(r0, r1)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$c5Y2AE5xol30aPwv234YZm_l9ks(com.lumina.monsterhunterfieldbook.WeaponsScreen r0, int r1) {
            _init_$lambda$4(r0, r1)
            return
    }

    public WeaponsScreen(com.lumina.monsterhunterfieldbook.MainActivity r18, org.json.JSONObject r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "a"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            r3 = r1
            android.content.Context r3 = (android.content.Context) r3
            r0.<init>(r3)
            r0.a = r1
            android.widget.LinearLayout r8 = r1.column()
            r0.page = r8
            android.widget.LinearLayout r3 = r1.row()
            r0.chips = r3
            android.widget.LinearLayout r3 = r1.column()
            r0.grid = r3
            java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
            r3.<init>()
            r0.token = r3
            java.lang.String r9 = "all"
            if (r2 == 0) goto L38
            java.lang.String r3 = "kind"
            java.lang.String r3 = r2.optString(r3, r9)
            if (r3 != 0) goto L39
        L38:
            r3 = r9
        L39:
            r0.kind = r3
            r10 = 0
            if (r2 == 0) goto L45
            java.lang.String r3 = "scroll"
            int r2 = r2.optInt(r3, r10)
            goto L46
        L45:
            r2 = r10
        L46:
            r0.position = r2
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            r0.guides = r2
            android.content.res.Resources r2 = r1.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.screenWidthDp
            int r2 = r0.columnCount(r2)
            r0.columns = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r0.chipViews = r2
            r0.setFillViewport(r10)
            r0.setHorizontalScrollBarEnabled(r10)
            r2 = r8
            android.view.View r2 = (android.view.View) r2
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r11 = -1
            r12 = -2
            r3.<init>(r11, r12)
            android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
            r0.addView(r2, r3)
            android.content.res.Resources r2 = r1.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.screenWidthDp
            float r2 = (float) r2
            r3 = 1028443341(0x3d4ccccd, float:0.05)
            float r2 = r2 * r3
            int r2 = kotlin.math.MathKt.roundToInt(r2)
            r3 = 52
            r13 = 16
            int r2 = kotlin.ranges.RangesKt.coerceIn(r2, r13, r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r1.dp(r3)
            android.content.res.Resources r4 = r1.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.screenWidthDp
            r14 = 780(0x30c, float:1.093E-42)
            if (r4 > r14) goto Lb0
            r4 = 19
            goto Lb2
        Lb0:
            r4 = 30
        Lb2:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r1.dp(r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r1.dp(r2)
            r5 = 28
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r1.dp(r5)
            r8.setPadding(r3, r4, r2, r5)
            java.lang.String r2 = r1.getCurrentEdition()
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toUpperCase(r3)
            java.lang.String r3 = "toUpperCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r3 = " / WEAPON HANDBOOK"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            int r5 = r1.getAccent()
            r6 = 4
            r7 = 0
            r3 = 1091567616(0x41100000, float:9.0)
            r4 = 0
            android.widget.TextView r2 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r1, r2, r3, r4, r5, r6, r7)
            r3 = 1041194025(0x3e0f5c29, float:0.14)
            r2.setLetterSpacing(r3)
            android.view.View r2 = (android.view.View) r2
            r8.addView(r2)
            r2 = 9
            r1.gap(r8, r2)
            android.content.res.Resources r2 = r1.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.screenWidthDp
            if (r2 > r14) goto L123
            r2 = 1104674816(0x41d80000, float:27.0)
            goto L125
        L123:
            r2 = 1105723392(0x41e80000, float:29.0)
        L125:
            r3 = r2
            r6 = 8
            r7 = 0
            java.lang.String r2 = "Find your hunting rhythm."
            r4 = 1
            r5 = 0
            android.widget.TextView r2 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r1, r2, r3, r4, r5, r6, r7)
            android.view.View r2 = (android.view.View) r2
            r8.addView(r2)
            r2 = 8
            r1.gap(r8, r2)
            int r5 = r1.getMuted()
            r6 = 4
            java.lang.String r2 = "All fourteen weapon types. Learn a reliable loop, understand the tradeoffs, and choose skills that support how you actually hunt."
            r3 = 1095761920(0x41500000, float:13.0)
            r4 = 0
            android.widget.TextView r2 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r1, r2, r3, r4, r5, r6, r7)
            android.view.View r2 = (android.view.View) r2
            r8.addView(r2)
            r2 = 18
            r1.gap(r8, r2)
            r1 = 3
            kotlin.Pair[] r1 = new kotlin.Pair[r1]
            java.lang.String r3 = "All 14 weapons"
            kotlin.Pair r3 = kotlin.TuplesKt.to(r9, r3)
            r1[r10] = r3
            java.lang.String r3 = "melee"
            java.lang.String r4 = "Melee"
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r4)
            r4 = 1
            r1[r4] = r3
            java.lang.String r3 = "ranged"
            java.lang.String r5 = "Ranged"
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r5)
            r5 = 2
            r1[r5] = r3
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L17e:
            boolean r3 = r1.hasNext()
            r6 = 1093664768(0x41300000, float:11.0)
            if (r3 == 0) goto L23a
            java.lang.Object r3 = r1.next()
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r7 = r3.component1()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r3 = r3.component2()
            java.lang.String r3 = (java.lang.String) r3
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r0.a
            com.lumina.monsterhunterfieldbook.WeaponsScreen$$ExternalSyntheticLambda1 r9 = new com.lumina.monsterhunterfieldbook.WeaponsScreen$$ExternalSyntheticLambda1
            r9.<init>(r0, r7)
            android.widget.TextView r3 = r8.button(r3, r9)
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r0.a
            com.lumina.monsterhunterfieldbook.NativePrefs r8 = r8.getPrefs()
            java.lang.String r9 = "font"
            r10 = 100
            int r8 = r8.number(r9, r10)
            float r8 = (float) r8
            float r8 = r8 * r6
            r6 = 1120403456(0x42c80000, float:100.0)
            float r8 = r8 / r6
            r3.setTextSize(r8)
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r0.a
            r8 = 40
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            java.lang.Number r9 = (java.lang.Number) r9
            int r6 = r6.dp(r9)
            r3.setMinHeight(r6)
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r0.a
            r9 = 12
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            java.lang.Number r10 = (java.lang.Number) r10
            int r6 = r6.dp(r10)
            com.lumina.monsterhunterfieldbook.MainActivity r10 = r0.a
            r14 = 7
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            java.lang.Number r15 = (java.lang.Number) r15
            int r10 = r10.dp(r15)
            com.lumina.monsterhunterfieldbook.MainActivity r15 = r0.a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r15.dp(r9)
            com.lumina.monsterhunterfieldbook.MainActivity r15 = r0.a
            java.lang.Integer r16 = java.lang.Integer.valueOf(r14)
            r18 = r5
            r5 = r16
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r15.dp(r5)
            r3.setPadding(r6, r10, r9, r5)
            java.util.LinkedHashMap<java.lang.String, android.widget.TextView> r5 = r0.chipViews
            java.util.Map r5 = (java.util.Map) r5
            r5.put(r7, r3)
            android.widget.LinearLayout r5 = r0.chips
            android.view.View r3 = (android.view.View) r3
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r7 = r0.a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Number r8 = (java.lang.Number) r8
            int r7 = r7.dp(r8)
            r6.<init>(r12, r7)
            com.lumina.monsterhunterfieldbook.MainActivity r7 = r0.a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)
            java.lang.Number r8 = (java.lang.Number) r8
            int r7 = r7.dp(r8)
            r6.setMarginEnd(r7)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            android.view.ViewGroup$LayoutParams r6 = (android.view.ViewGroup.LayoutParams) r6
            r5.addView(r3, r6)
            r5 = r18
            goto L17e
        L23a:
            r18 = r5
            android.widget.LinearLayout r1 = r0.page
            android.widget.LinearLayout r3 = r0.chips
            android.view.View r3 = (android.view.View) r3
            r1.addView(r3)
            r0.syncChips()
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            android.widget.LinearLayout r3 = r0.page
            r1.gap(r3, r2)
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            android.widget.LinearLayout r1 = r1.column()
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            int r3 = r2.getAccent()
            r5 = 6
            int r3 = com.lumina.monsterhunterfieldbook.FieldViewsKt.alphaColour(r3, r5)
            r5 = 0
            android.graphics.drawable.GradientDrawable r2 = r2.surface(r3, r4, r5)
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            r1.setBackground(r2)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            java.lang.Number r3 = (java.lang.Number) r3
            int r2 = r2.dp(r3)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            r4 = 14
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Number r5 = (java.lang.Number) r5
            int r3 = r3.dp(r5)
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r0.a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            java.lang.Number r7 = (java.lang.Number) r7
            int r5 = r5.dp(r7)
            com.lumina.monsterhunterfieldbook.MainActivity r7 = r0.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r7.dp(r4)
            r1.setPadding(r2, r3, r5, r4)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            boolean r3 = r2.isIce()
            if (r3 == 0) goto L2aa
            java.lang.String r3 = "Iceborne additions included."
            goto L2ac
        L2aa:
            java.lang.String r3 = "The World foundation."
        L2ac:
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            int r4 = r4.getMuted()
            android.widget.TextView r2 = r2.textBold(r3, r6, r4)
            android.view.View r2 = (android.view.View) r2
            r1.addView(r2)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            boolean r2 = r3.isIce()
            if (r2 == 0) goto L2c6
            java.lang.String r2 = "Each guide separates the World foundation from the expansion’s new moves and example sequences."
            goto L2c8
        L2c6:
            java.lang.String r2 = "These guides focus on base-game moves. Switch to Iceborne for Clutch Claw integrations and expansion moves."
        L2c8:
            r4 = r2
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            int r7 = r2.getMuted()
            r8 = 4
            r9 = 0
            r5 = 1093664768(0x41300000, float:11.0)
            r6 = 0
            android.widget.TextView r2 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r3, r4, r5, r6, r7, r8, r9)
            android.view.View r2 = (android.view.View) r2
            r1.addView(r2)
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            android.content.Context r3 = (android.content.Context) r3
            r2.<init>(r3)
            android.view.View r1 = (android.view.View) r1
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r11, r12)
            android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
            r2.addView(r1, r3)
            android.view.View r1 = new android.view.View
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            android.content.Context r3 = (android.content.Context) r3
            r1.<init>(r3)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            int r3 = r3.getAccent()
            r1.setBackgroundColor(r3)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r18)
            java.lang.Number r5 = (java.lang.Number) r5
            int r4 = r4.dp(r5)
            r3.<init>(r4, r11)
            android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
            r2.addView(r1, r3)
            android.widget.LinearLayout r1 = r0.page
            android.view.View r2 = (android.view.View) r2
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r11, r12)
            android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
            r1.addView(r2, r3)
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            android.widget.LinearLayout r2 = r0.page
            r3 = 25
            r1.gap(r2, r3)
            android.widget.LinearLayout r1 = r0.page
            android.widget.LinearLayout r2 = r0.grid
            android.view.View r2 = (android.view.View) r2
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r11, r12)
            android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
            r1.addView(r2, r3)
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            android.widget.LinearLayout r2 = r0.page
            r3 = 20
            r1.gap(r2, r3)
            android.widget.LinearLayout r1 = r0.page
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            int r6 = r2.getMuted()
            r7 = 4
            r8 = 0
            java.lang.String r3 = "Learning curve describes resource and execution demands, not a damage ranking. Move names are platform-neutral; use the in-game control list for your device."
            r4 = 1092616192(0x41200000, float:10.0)
            r5 = 0
            android.widget.TextView r2 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r2, r3, r4, r5, r6, r7, r8)
            android.view.View r2 = (android.view.View) r2
            r1.addView(r2)
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            com.lumina.monsterhunterfieldbook.Catalogue r1 = r1.getCatalogue()
            boolean r1 = r1.getReady()
            if (r1 == 0) goto L387
            java.util.concurrent.atomic.AtomicInteger r1 = r0.token
            int r1 = r1.incrementAndGet()
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            com.lumina.monsterhunterfieldbook.Catalogue r2 = r2.getCatalogue()
            java.util.concurrent.ExecutorService r2 = r2.getExecutor()
            com.lumina.monsterhunterfieldbook.WeaponsScreen$$ExternalSyntheticLambda2 r3 = new com.lumina.monsterhunterfieldbook.WeaponsScreen$$ExternalSyntheticLambda2
            r3.<init>(r0, r1)
            r2.execute(r3)
            return
        L387:
            android.widget.LinearLayout r1 = r0.grid
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            int r6 = r2.getMuted()
            r7 = 4
            r8 = 0
            java.lang.String r3 = "Preparing offline catalogue…"
            r4 = 1095761920(0x41500000, float:13.0)
            r5 = 0
            android.widget.TextView r2 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r2, r3, r4, r5, r6, r7, r8)
            android.view.View r2 = (android.view.View) r2
            r1.addView(r2)
            return
    }

    public /* synthetic */ WeaponsScreen(com.lumina.monsterhunterfieldbook.MainActivity r1, org.json.JSONObject r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }

    private static final void _init_$lambda$4(com.lumina.monsterhunterfieldbook.WeaponsScreen r12, int r13) {
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r12.a
            com.lumina.monsterhunterfieldbook.Catalogue r0 = r0.getCatalogue()
            com.lumina.monsterhunterfieldbook.LibraryFilter r1 = new com.lumina.monsterhunterfieldbook.LibraryFilter
            r10 = 126(0x7e, float:1.77E-43)
            r11 = 0
            java.lang.String r2 = "Weapon Guides"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r9 = "source"
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r2 = 0
            r3 = 20
            com.lumina.monsterhunterfieldbook.LibraryPage r0 = r0.browse(r1, r2, r3)
            java.util.List r0 = r0.getRecords()
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r12.a
            com.lumina.monsterhunterfieldbook.WeaponsScreen$$ExternalSyntheticLambda3 r2 = new com.lumina.monsterhunterfieldbook.WeaponsScreen$$ExternalSyntheticLambda3
            r2.<init>(r13, r12, r0)
            r1.runOnUiThread(r2)
            return
    }

    private final android.view.View card(com.lumina.monsterhunterfieldbook.FieldRecord r27) {
            r26 = this;
            r0 = r26
            org.json.JSONObject r1 = r27.data()
            java.lang.String r2 = "id"
            java.lang.String r2 = r1.optString(r2)
            android.widget.FrameLayout r3 = new android.widget.FrameLayout
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            android.content.Context r4 = (android.content.Context) r4
            r3.<init>(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "weapon-card:"
            r4.<init>(r5)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.setTag(r4)
            java.lang.String r4 = r27.getName()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Open "
            r5.<init>(r6)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.setContentDescription(r4)
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r0.a
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            r8 = 1077936128(0x40400000, float:3.0)
            android.graphics.drawable.GradientDrawable r4 = com.lumina.monsterhunterfieldbook.MainActivity.surface$default(r5, r6, r7, r8, r9, r10)
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4
            r3.setBackground(r4)
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            android.widget.LinearLayout r4 = r4.column()
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r0.a
            r6 = r4
            android.view.View r6 = (android.view.View) r6
            com.lumina.monsterhunterfieldbook.NativePrefs r7 = r5.getPrefs()
            java.lang.String r8 = "density"
            java.lang.String r9 = "compact"
            java.lang.String r7 = r7.text(r8, r9)
            java.lang.String r8 = "comfortable"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r8)
            r8 = 17
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            if (r7 == 0) goto L78
            r7 = 22
            goto L79
        L78:
            r7 = r8
        L79:
            r5.pad(r6, r7)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r7 = -1
            r10 = -2
            r5.<init>(r7, r10)
            android.view.ViewGroup$LayoutParams r5 = (android.view.ViewGroup.LayoutParams) r5
            r3.addView(r6, r5)
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r0.a
            android.widget.LinearLayout r5 = r5.row()
            r6 = 16
            r5.setGravity(r6)
            android.widget.FrameLayout r6 = new android.widget.FrameLayout
            com.lumina.monsterhunterfieldbook.MainActivity r11 = r0.a
            android.content.Context r11 = (android.content.Context) r11
            r6.<init>(r11)
            android.graphics.drawable.GradientDrawable r11 = new android.graphics.drawable.GradientDrawable
            r11.<init>()
            r12 = 1
            r11.setShape(r12)
            com.lumina.monsterhunterfieldbook.MainActivity r13 = r0.a
            int r13 = r13.getAccent()
            r14 = 10
            int r13 = com.lumina.monsterhunterfieldbook.FieldViewsKt.alphaColour(r13, r14)
            r11.setColor(r13)
            com.lumina.monsterhunterfieldbook.MainActivity r13 = r0.a
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            java.lang.Number r15 = (java.lang.Number) r15
            int r13 = r13.dp(r15)
            com.lumina.monsterhunterfieldbook.MainActivity r15 = r0.a
            int r15 = r15.getAccent()
            r7 = 64
            int r7 = com.lumina.monsterhunterfieldbook.FieldViewsKt.alphaColour(r15, r7)
            r11.setStroke(r13, r7)
            android.graphics.drawable.Drawable r11 = (android.graphics.drawable.Drawable) r11
            r6.setBackground(r11)
            android.widget.ImageView r7 = new android.widget.ImageView
            com.lumina.monsterhunterfieldbook.MainActivity r11 = r0.a
            android.content.Context r11 = (android.content.Context) r11
            r7.<init>(r11)
            android.widget.ImageView$ScaleType r11 = android.widget.ImageView.ScaleType.FIT_CENTER
            r7.setScaleType(r11)
            java.lang.String r11 = r27.getName()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.StringBuilder r11 = r13.append(r11)
            java.lang.String r13 = " icon"
            java.lang.StringBuilder r11 = r11.append(r13)
            java.lang.String r11 = r11.toString()
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            r7.setContentDescription(r11)
            r11 = r7
            android.view.View r11 = (android.view.View) r11
            android.widget.FrameLayout$LayoutParams r13 = new android.widget.FrameLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r15 = r0.a
            r16 = 38
            java.lang.Integer r17 = java.lang.Integer.valueOf(r16)
            r18 = r12
            r12 = r17
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r15.dp(r12)
            com.lumina.monsterhunterfieldbook.MainActivity r15 = r0.a
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)
            r14 = r16
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r15.dp(r14)
            r13.<init>(r12, r14, r8)
            android.view.ViewGroup$LayoutParams r13 = (android.view.ViewGroup.LayoutParams) r13
            r6.addView(r11, r13)
            com.lumina.monsterhunterfieldbook.MainActivity r11 = r0.a
            java.lang.String r12 = r27.getImage()
            r11.assetImage(r12, r7)
            android.view.View r6 = (android.view.View) r6
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r11 = r0.a
            r12 = 53
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            java.lang.Number r13 = (java.lang.Number) r13
            int r11 = r11.dp(r13)
            com.lumina.monsterhunterfieldbook.MainActivity r13 = r0.a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r13.dp(r12)
            r7.<init>(r11, r12)
            android.view.ViewGroup$LayoutParams r7 = (android.view.ViewGroup.LayoutParams) r7
            r5.addView(r6, r7)
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r0.a
            android.widget.LinearLayout r6 = r6.column()
            com.lumina.monsterhunterfieldbook.MainActivity r7 = r0.a
            r11 = 13
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Number r11 = (java.lang.Number) r11
            int r7 = r7.dp(r11)
            com.lumina.monsterhunterfieldbook.MainActivity r11 = r0.a
            r12 = 21
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Number r12 = (java.lang.Number) r12
            int r11 = r11.dp(r12)
            r12 = 0
            r6.setPadding(r7, r12, r11, r12)
            r7 = 3
            java.lang.String[] r11 = new java.lang.String[r7]
            java.lang.String r13 = "bow"
            r11[r12] = r13
            java.lang.String r13 = "light-bowgun"
            r11[r18] = r13
            java.lang.String r13 = "heavy-bowgun"
            r14 = 2
            r11[r14] = r13
            java.util.Set r11 = kotlin.collections.SetsKt.setOf(r11)
            boolean r11 = r11.contains(r2)
            com.lumina.monsterhunterfieldbook.MainActivity r13 = r0.a
            if (r11 == 0) goto L19f
            java.lang.String r11 = "RANGED DISCIPLINE"
            goto L1a1
        L19f:
            java.lang.String r11 = "MELEE DISCIPLINE"
        L1a1:
            r20 = r11
            int r23 = r13.getMuted()
            r24 = 4
            r25 = 0
            r21 = 1091567616(0x41100000, float:9.0)
            r22 = 0
            r19 = r13
            android.widget.TextView r11 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r19, r20, r21, r22, r23, r24, r25)
            r13 = 1034147594(0x3da3d70a, float:0.08)
            r11.setLetterSpacing(r13)
            android.view.View r11 = (android.view.View) r11
            r6.addView(r11)
            com.lumina.monsterhunterfieldbook.MainActivity r11 = r0.a
            java.lang.String r20 = r27.getName()
            r24 = 8
            r21 = 1102053376(0x41b00000, float:22.0)
            r22 = 1
            r23 = 0
            r19 = r11
            android.widget.TextView r11 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r19, r20, r21, r22, r23, r24, r25)
            android.view.View r11 = (android.view.View) r11
            r6.addView(r11)
            android.view.View r6 = (android.view.View) r6
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r13 = 1065353216(0x3f800000, float:1.0)
            r11.<init>(r12, r10, r13)
            android.view.ViewGroup$LayoutParams r11 = (android.view.ViewGroup.LayoutParams) r11
            r5.addView(r6, r11)
            android.view.View r5 = (android.view.View) r5
            r4.addView(r5)
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r0.a
            r6 = 10
            r5.gap(r4, r6)
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r0.a
            java.lang.String r6 = "short"
            java.lang.String r6 = r1.optString(r6)
            java.lang.String r11 = "optString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r11)
            r24 = 12
            r21 = 1095761920(0x41500000, float:13.0)
            r22 = 0
            r19 = r5
            r20 = r6
            android.widget.TextView r5 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r19, r20, r21, r22, r23, r24, r25)
            android.view.View r5 = (android.view.View) r5
            r4.addView(r5)
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r0.a
            r6 = 12
            r5.gap(r4, r6)
            com.lumina.monsterhunterfieldbook.WeaponPillFlow r5 = new com.lumina.monsterhunterfieldbook.WeaponPillFlow
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r0.a
            r13 = r6
            android.content.Context r13 = (android.content.Context) r13
            r15 = 8
            java.lang.Integer r16 = java.lang.Integer.valueOf(r15)
            r17 = r7
            r7 = r16
            java.lang.Number r7 = (java.lang.Number) r7
            int r6 = r6.dp(r7)
            r5.<init>(r13, r6)
            java.lang.String[] r6 = new java.lang.String[r14]
            java.lang.String r7 = "complexity"
            java.lang.String r7 = r1.optString(r7)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.StringBuilder r7 = r13.append(r7)
            java.lang.String r13 = " learning curve"
            java.lang.StringBuilder r7 = r7.append(r13)
            java.lang.String r7 = r7.toString()
            r6[r12] = r7
            java.lang.String r7 = "role"
            java.lang.String r1 = r1.optString(r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r11)
            r7 = 8226(0x2022, float:1.1527E-41)
            r11 = 0
            java.lang.String r1 = kotlin.text.StringsKt.substringBefore$default(r1, r7, r11, r14, r11)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.CharSequence r1 = kotlin.text.StringsKt.trim(r1)
            java.lang.String r1 = r1.toString()
            r6[r18] = r1
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r6)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L277:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L2ed
            java.lang.Object r6 = r1.next()
            r20 = r6
            java.lang.String r20 = (java.lang.String) r20
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r0.a
            int r23 = r6.getMuted()
            r24 = 4
            r25 = 0
            r21 = 1092616192(0x41200000, float:10.0)
            r22 = 0
            r19 = r6
            android.widget.TextView r6 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r19, r20, r21, r22, r23, r24, r25)
            com.lumina.monsterhunterfieldbook.MainActivity r7 = r0.a
            r11 = 1073741824(0x40000000, float:2.0)
            r13 = r18
            android.graphics.drawable.GradientDrawable r7 = r7.surface(r12, r13, r11)
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            r6.setBackground(r7)
            com.lumina.monsterhunterfieldbook.MainActivity r7 = r0.a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r15)
            java.lang.Number r11 = (java.lang.Number) r11
            int r7 = r7.dp(r11)
            com.lumina.monsterhunterfieldbook.MainActivity r11 = r0.a
            java.lang.Integer r14 = java.lang.Integer.valueOf(r17)
            java.lang.Number r14 = (java.lang.Number) r14
            int r11 = r11.dp(r14)
            com.lumina.monsterhunterfieldbook.MainActivity r14 = r0.a
            java.lang.Integer r16 = java.lang.Integer.valueOf(r15)
            r12 = r16
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r14.dp(r12)
            com.lumina.monsterhunterfieldbook.MainActivity r14 = r0.a
            java.lang.Integer r16 = java.lang.Integer.valueOf(r17)
            r13 = r16
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r14.dp(r13)
            r6.setPadding(r7, r11, r12, r13)
            android.view.View r6 = (android.view.View) r6
            android.view.ViewGroup$LayoutParams r7 = new android.view.ViewGroup$LayoutParams
            r7.<init>(r10, r10)
            r5.addView(r6, r7)
            r12 = 0
            r18 = 1
            goto L277
        L2ed:
            android.view.View r5 = (android.view.View) r5
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r6 = -1
            r1.<init>(r6, r10)
            android.view.ViewGroup$LayoutParams r1 = (android.view.ViewGroup.LayoutParams) r1
            r4.addView(r5, r1)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            android.content.Context r4 = (android.content.Context) r4
            r1.<init>(r4)
            com.lumina.monsterhunterfieldbook.GlyphView r4 = new com.lumina.monsterhunterfieldbook.GlyphView
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r0.a
            r6 = r5
            android.content.Context r6 = (android.content.Context) r6
            java.lang.String r7 = r27.getId()
            boolean r5 = r5.isBookmarked(r7)
            if (r5 == 0) goto L31b
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r0.a
            int r5 = r5.getAccent()
            goto L321
        L31b:
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r0.a
            int r5 = r5.getMuted()
        L321:
            java.lang.String r7 = "bookmark"
            r4.<init>(r6, r7, r5)
            r5 = r4
            android.view.View r5 = (android.view.View) r5
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r7 = r0.a
            r10 = r9
            java.lang.Number r10 = (java.lang.Number) r10
            int r7 = r7.dp(r10)
            com.lumina.monsterhunterfieldbook.MainActivity r10 = r0.a
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r10.dp(r9)
            r6.<init>(r7, r9, r8)
            android.view.ViewGroup$LayoutParams r6 = (android.view.ViewGroup.LayoutParams) r6
            r1.addView(r5, r6)
            java.lang.String r5 = r27.getName()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Bookmark "
            r6.<init>(r7)
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r5 = r5.toString()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r1.setContentDescription(r5)
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r0.a
            java.lang.String r6 = r27.getId()
            boolean r5 = r5.isBookmarked(r6)
            r1.setSelected(r5)
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r0.a
            r6 = r1
            android.view.View r6 = (android.view.View) r6
            com.lumina.monsterhunterfieldbook.WeaponsScreen$$ExternalSyntheticLambda5 r7 = new com.lumina.monsterhunterfieldbook.WeaponsScreen$$ExternalSyntheticLambda5
            r8 = r27
            r7.<init>(r0, r8, r1, r4)
            r5.touch(r6, r7)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            r5 = 36
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Number r7 = (java.lang.Number) r7
            int r4 = r4.dp(r7)
            com.lumina.monsterhunterfieldbook.MainActivity r7 = r0.a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r7.dp(r5)
            r7 = 8388661(0x800035, float:1.1755018E-38)
            r1.<init>(r4, r5, r7)
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            r5 = 5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r4 = r4.dp(r5)
            r1.topMargin = r4
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            r5 = 4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r4 = r4.dp(r5)
            r1.setMarginEnd(r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            android.view.ViewGroup$LayoutParams r1 = (android.view.ViewGroup.LayoutParams) r1
            r3.addView(r6, r1)
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            android.view.View r3 = (android.view.View) r3
            com.lumina.monsterhunterfieldbook.WeaponsScreen$$ExternalSyntheticLambda6 r4 = new com.lumina.monsterhunterfieldbook.WeaponsScreen$$ExternalSyntheticLambda6
            r4.<init>(r0, r2)
            r1.touch(r3, r4)
            return r3
    }

    private static final kotlin.Unit card$lambda$4(com.lumina.monsterhunterfieldbook.WeaponsScreen r2, com.lumina.monsterhunterfieldbook.FieldRecord r3, android.widget.FrameLayout r4, com.lumina.monsterhunterfieldbook.GlyphView r5) {
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r2.a
            java.lang.String r1 = r3.getId()
            r0.toggleBookmark(r1)
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r2.a
            java.lang.String r3 = r3.getId()
            boolean r3 = r0.isBookmarked(r3)
            r4.setSelected(r3)
            boolean r3 = r4.isSelected()
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r2.a
            if (r3 == 0) goto L23
            int r2 = r2.getAccent()
            goto L27
        L23:
            int r2 = r2.getMuted()
        L27:
            r5.setColour(r2)
            r5.invalidate()
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    private static final kotlin.Unit card$lambda$6(com.lumina.monsterhunterfieldbook.WeaponsScreen r6, java.lang.String r7) {
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r6.a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r1 = r7
            com.lumina.monsterhunterfieldbook.MainActivity.openWeapon$default(r0, r1, r2, r3, r4, r5)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
    }

    private final int columnCount(int r2) {
            r1 = this;
            r0 = 1150(0x47e, float:1.611E-42)
            if (r2 <= r0) goto L6
            r2 = 3
            return r2
        L6:
            r0 = 480(0x1e0, float:6.73E-43)
            if (r2 <= r0) goto Lc
            r2 = 2
            return r2
        Lc:
            r2 = 1
            return r2
    }

    static final kotlin.Unit lambda$1$0(com.lumina.monsterhunterfieldbook.WeaponsScreen r0, java.lang.String r1) {
            r0.kind = r1
            r0.syncChips()
            r0.renderCards()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    static final void lambda$4$0(int r1, com.lumina.monsterhunterfieldbook.WeaponsScreen r2, java.util.List r3) {
            java.util.concurrent.atomic.AtomicInteger r0 = r2.token
            int r0 = r0.get()
            if (r1 != r0) goto L15
            r2.guides = r3
            r2.renderCards()
            com.lumina.monsterhunterfieldbook.WeaponsScreen$$ExternalSyntheticLambda4 r1 = new com.lumina.monsterhunterfieldbook.WeaponsScreen$$ExternalSyntheticLambda4
            r1.<init>(r2)
            r2.post(r1)
        L15:
            return
    }

    static final void lambda$4$0$0(com.lumina.monsterhunterfieldbook.WeaponsScreen r2) {
            r0 = 0
            int r1 = r2.position
            r2.scrollTo(r0, r1)
            return
    }

    private final void renderCards() {
            r13 = this;
            android.widget.LinearLayout r0 = r13.grid
            r0.removeAllViews()
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r0 = r13.guides
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r2 = r0.hasNext()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L5d
            java.lang.Object r2 = r0.next()
            r5 = r2
            com.lumina.monsterhunterfieldbook.FieldRecord r5 = (com.lumina.monsterhunterfieldbook.FieldRecord) r5
            r6 = 3
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.String r7 = "bow"
            r6[r4] = r7
            java.lang.String r4 = "light-bowgun"
            r6[r3] = r4
            r3 = 2
            java.lang.String r4 = "heavy-bowgun"
            r6[r3] = r4
            java.util.Set r3 = kotlin.collections.SetsKt.setOf(r6)
            org.json.JSONObject r4 = r5.data()
            java.lang.String r5 = "id"
            java.lang.String r4 = r4.optString(r5)
            boolean r3 = r3.contains(r4)
            java.lang.String r4 = r13.kind
            java.lang.String r5 = "all"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r4 != 0) goto L59
            java.lang.String r4 = r13.kind
            java.lang.String r5 = "ranged"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r4 != r3) goto L14
        L59:
            r1.add(r2)
            goto L14
        L5d:
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            int r0 = r13.columns
            java.util.List r0 = kotlin.collections.CollectionsKt.chunked(r1, r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L6d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L119
            java.lang.Object r1 = r0.next()
            java.util.List r1 = (java.util.List) r1
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r13.a
            android.widget.LinearLayout r2 = r2.row()
            r5 = 48
            r2.setGravity(r5)
            r5 = r1
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            r6 = r4
        L8c:
            boolean r7 = r5.hasNext()
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = -2
            r10 = 14
            if (r7 == 0) goto Lc7
            java.lang.Object r7 = r5.next()
            int r11 = r6 + 1
            if (r6 >= 0) goto La2
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        La2:
            com.lumina.monsterhunterfieldbook.FieldRecord r7 = (com.lumina.monsterhunterfieldbook.FieldRecord) r7
            android.view.View r7 = r13.card(r7)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r12.<init>(r4, r9, r8)
            if (r6 <= 0) goto Lbe
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r13.a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            java.lang.Number r8 = (java.lang.Number) r8
            int r6 = r6.dp(r8)
            r12.setMarginStart(r6)
        Lbe:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            android.view.ViewGroup$LayoutParams r12 = (android.view.ViewGroup.LayoutParams) r12
            r2.addView(r7, r12)
            r6 = r11
            goto L8c
        Lc7:
            int r5 = r13.columns
            int r1 = r1.size()
            int r5 = r5 - r1
            r1 = r4
        Lcf:
            if (r1 >= r5) goto Lf8
            android.view.View r6 = new android.view.View
            com.lumina.monsterhunterfieldbook.MainActivity r7 = r13.a
            android.content.Context r7 = (android.content.Context) r7
            r6.<init>(r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r7.<init>(r4, r3, r8)
            com.lumina.monsterhunterfieldbook.MainActivity r11 = r13.a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            java.lang.Number r12 = (java.lang.Number) r12
            int r11 = r11.dp(r12)
            r7.setMarginStart(r11)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            android.view.ViewGroup$LayoutParams r7 = (android.view.ViewGroup.LayoutParams) r7
            r2.addView(r6, r7)
            int r1 = r1 + 1
            goto Lcf
        Lf8:
            android.widget.LinearLayout r1 = r13.grid
            android.view.View r2 = (android.view.View) r2
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r6 = -1
            r5.<init>(r6, r9)
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r13.a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            java.lang.Number r7 = (java.lang.Number) r7
            int r6 = r6.dp(r7)
            r5.bottomMargin = r6
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            android.view.ViewGroup$LayoutParams r5 = (android.view.ViewGroup.LayoutParams) r5
            r1.addView(r2, r5)
            goto L6d
        L119:
            return
    }

    private final void syncChips() {
            r7 = this;
            java.util.LinkedHashMap<java.lang.String, android.widget.TextView> r0 = r7.chipViews
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r3 = r7.kind
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r3 == 0) goto L33
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r7.a
            int r3 = r3.getAccent()
            goto L39
        L33:
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r7.a
            int r3 = r3.getMuted()
        L39:
            r1.setTextColor(r3)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r7.a
            java.lang.String r4 = r7.kind
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            if (r4 == 0) goto L53
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r7.a
            int r4 = r4.getAccent()
            r5 = 18
            int r4 = com.lumina.monsterhunterfieldbook.FieldViewsKt.alphaColour(r4, r5)
            goto L54
        L53:
            r4 = 0
        L54:
            r5 = 1
            r6 = 1073741824(0x40000000, float:2.0)
            android.graphics.drawable.GradientDrawable r3 = r3.surface(r4, r5, r6)
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
            r1.setBackground(r3)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r7.a
            android.view.View r1 = (android.view.View) r1
            com.lumina.monsterhunterfieldbook.WeaponsScreen$$ExternalSyntheticLambda0 r4 = new com.lumina.monsterhunterfieldbook.WeaponsScreen$$ExternalSyntheticLambda0
            r4.<init>(r7, r2)
            r3.touch(r1, r4)
            goto Lc
        L6d:
            return
    }

    private static final kotlin.Unit syncChips$lambda$0$0(com.lumina.monsterhunterfieldbook.WeaponsScreen r0, java.lang.String r1) {
            r0.kind = r1
            r0.syncChips()
            r0.renderCards()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.token
            r0.incrementAndGet()
            super.onDetachedFromWindow()
            return
    }

    @Override // android.widget.ScrollView, android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            float r1 = (float) r1
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 / r2
            int r1 = kotlin.math.MathKt.roundToInt(r1)
            int r1 = r0.columnCount(r1)
            int r2 = r0.columns
            if (r1 == r2) goto L22
            r0.columns = r1
            r0.renderCards()
        L22:
            return
    }

    public final org.json.JSONObject snapshot() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "kind"
            java.lang.String r2 = r3.kind
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "scroll"
            int r2 = r3.getScrollY()
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "put(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }
}
