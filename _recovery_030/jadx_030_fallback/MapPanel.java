package com.lumina.monsterhunterfieldbook;

/* compiled from: MapPanel.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/MapPanel;", "Landroid/widget/LinearLayout;", "a", "Lcom/lumina/monsterhunterfieldbook/MainActivity;", "maps", "Lorg/json/JSONArray;", "stateKey", "", "<init>", "(Lcom/lumina/monsterhunterfieldbook/MainActivity;Lorg/json/JSONArray;Ljava/lang/String;)V", "canvas", "Lcom/lumina/monsterhunterfieldbook/ZoomMapView;", "caption", "Landroid/widget/TextView;", "baseToggle", "Landroid/widget/CheckBox;", "floorToggle", "generation", "", "index", "load", "", "save", "onDetachedFromWindow", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MapPanel extends android.widget.LinearLayout {
    private final com.lumina.monsterhunterfieldbook.MainActivity a;
    private final android.widget.CheckBox baseToggle;
    private final com.lumina.monsterhunterfieldbook.ZoomMapView canvas;
    private final android.widget.TextView caption;
    private final android.widget.CheckBox floorToggle;
    private int generation;
    private int index;
    private final org.json.JSONArray maps;
    private final java.lang.String stateKey;


    public static /* synthetic */ kotlin.Unit $r8$lambda$0S5NH_rHUQSLlVAEmJwNYsK4n88(int r0, com.lumina.monsterhunterfieldbook.MapPanel r1, boolean r2, android.graphics.Bitmap r3) {
            kotlin.Unit r0 = load$set$lambda$2(r0, r1, r2, r3)
            return r0
    }

    /* renamed from: $r8$lambda$ArnuolYJX-NPppQel85h5tE_rG0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m32$r8$lambda$ArnuolYJXNPppQel85h5tE_rG0(com.lumina.monsterhunterfieldbook.MapPanel r0) {
            kotlin.Unit r0 = _init_$lambda$1(r0)
            return r0
    }

    /* renamed from: $r8$lambda$FM2yFpExEnY3ri9GpOQFIz-F_kY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m33$r8$lambda$FM2yFpExEnY3ri9GpOQFIzF_kY(com.lumina.monsterhunterfieldbook.MapPanel r0) {
            kotlin.Unit r0 = _init_$lambda$6(r0)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HRj6yJUaJNagIhuxZiRRJl8EJt4(com.lumina.monsterhunterfieldbook.MapPanel r0) {
            kotlin.Unit r0 = _init_$lambda$3(r0)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Xw2MWczmmQAEeISDt2dAHxe14pk(com.lumina.monsterhunterfieldbook.MapPanel r0) {
            kotlin.Unit r0 = _init_$lambda$2(r0)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$g_5EtmZZXHsdnpV69a5k3PfxPZk(com.lumina.monsterhunterfieldbook.MapPanel r0, android.widget.CompoundButton r1, boolean r2) {
            _init_$lambda$4(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$trExWrlQ7GIiKu6Lu84eRQoZJuQ(com.lumina.monsterhunterfieldbook.MapPanel r0, android.widget.CompoundButton r1, boolean r2) {
            _init_$lambda$5(r0, r1, r2)
            return
    }

    public MapPanel(com.lumina.monsterhunterfieldbook.MainActivity r10, org.json.JSONArray r11, java.lang.String r12) {
            r9 = this;
            java.lang.String r0 = "a"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "maps"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "stateKey"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = r10
            android.content.Context r0 = (android.content.Context) r0
            r9.<init>(r0)
            r9.a = r10
            r9.maps = r11
            r9.stateKey = r12
            com.lumina.monsterhunterfieldbook.ZoomMapView r0 = new com.lumina.monsterhunterfieldbook.ZoomMapView
            r1 = r10
            android.content.Context r1 = (android.content.Context) r1
            r0.<init>(r1)
            r9.canvas = r0
            int r6 = r10.getMuted()
            r7 = 4
            r8 = 0
            java.lang.String r3 = ""
            r4 = 1093664768(0x41300000, float:11.0)
            r5 = 0
            r2 = r10
            android.widget.TextView r10 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r2, r3, r4, r5, r6, r7, r8)
            r9.caption = r10
            android.widget.CheckBox r10 = new android.widget.CheckBox
            r0 = r2
            android.content.Context r0 = (android.content.Context) r0
            r10.<init>(r0)
            java.lang.String r0 = "Background"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.setText(r0)
            r0 = 1
            r10.setChecked(r0)
            r9.baseToggle = r10
            android.widget.CheckBox r10 = new android.widget.CheckBox
            r1 = r2
            android.content.Context r1 = (android.content.Context) r1
            r10.<init>(r1)
            java.lang.String r1 = "Map layer"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r10.setText(r1)
            r10.setChecked(r0)
            r9.floorToggle = r10
            com.lumina.monsterhunterfieldbook.NativePrefs r10 = r2.getPrefs()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "mapFloor:"
            r1.<init>(r3)
            java.lang.StringBuilder r12 = r1.append(r12)
            java.lang.String r12 = r12.toString()
            r1 = 0
            int r10 = r10.number(r12, r1)
            int r12 = r11.length()
            int r12 = r12 - r0
            int r12 = java.lang.Math.max(r1, r12)
            int r10 = kotlin.ranges.RangesKt.coerceIn(r10, r1, r12)
            r9.index = r10
            r9.setOrientation(r0)
            android.widget.Spinner r10 = new android.widget.Spinner
            r12 = r2
            android.content.Context r12 = (android.content.Context) r12
            r10.<init>(r12)
            java.lang.String r12 = "Map floor"
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r10.setContentDescription(r12)
            r12 = r2
            android.content.Context r12 = (android.content.Context) r12
            int r11 = r11.length()
            kotlin.ranges.IntRange r11 = kotlin.ranges.RangesKt.until(r1, r11)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r11, r2)
            r0.<init>(r2)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r11 = r11.iterator()
        Lb7:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto Le0
            r2 = r11
            kotlin.collections.IntIterator r2 = (kotlin.collections.IntIterator) r2
            int r2 = r2.nextInt()
            org.json.JSONArray r3 = r9.maps
            org.json.JSONObject r3 = r3.getJSONObject(r2)
            org.json.JSONArray r4 = r9.maps
            org.json.JSONObject r2 = r4.getJSONObject(r2)
            java.lang.String r4 = "name"
            java.lang.String r2 = r2.optString(r4)
            java.lang.String r4 = "title"
            java.lang.String r2 = r3.optString(r4, r2)
            r0.add(r2)
            goto Lb7
        Le0:
            java.util.List r0 = (java.util.List) r0
            android.widget.ArrayAdapter r11 = new android.widget.ArrayAdapter
            r2 = 17367049(0x1090009, float:2.516295E-38)
            r11.<init>(r12, r2, r0)
            android.widget.SpinnerAdapter r11 = (android.widget.SpinnerAdapter) r11
            r10.setAdapter(r11)
            int r11 = r9.index
            r10.setSelection(r11)
            r11 = r10
            android.view.View r11 = (android.view.View) r11
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r9.a
            r2 = 48
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r0 = r0.dp(r2)
            r2 = -1
            r12.<init>(r2, r0)
            android.view.ViewGroup$LayoutParams r12 = (android.view.ViewGroup.LayoutParams) r12
            r9.addView(r11, r12)
            com.lumina.monsterhunterfieldbook.MainActivity r11 = r9.a
            android.widget.LinearLayout r11 = r11.row()
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r9.a
            com.lumina.monsterhunterfieldbook.MapPanel$$ExternalSyntheticLambda0 r0 = new com.lumina.monsterhunterfieldbook.MapPanel$$ExternalSyntheticLambda0
            r0.<init>(r9)
            java.lang.String r3 = "−"
            android.widget.TextView r12 = r12.button(r3, r0)
            android.view.View r12 = (android.view.View) r12
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r3 = -2
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r3, r4)
            android.view.ViewGroup$LayoutParams r0 = (android.view.ViewGroup.LayoutParams) r0
            r11.addView(r12, r0)
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r9.a
            com.lumina.monsterhunterfieldbook.MapPanel$$ExternalSyntheticLambda1 r0 = new com.lumina.monsterhunterfieldbook.MapPanel$$ExternalSyntheticLambda1
            r0.<init>(r9)
            java.lang.String r5 = "Reset"
            android.widget.TextView r12 = r12.button(r5, r0)
            android.view.View r12 = (android.view.View) r12
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r1, r3, r4)
            android.view.ViewGroup$LayoutParams r0 = (android.view.ViewGroup.LayoutParams) r0
            r11.addView(r12, r0)
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r9.a
            com.lumina.monsterhunterfieldbook.MapPanel$$ExternalSyntheticLambda2 r0 = new com.lumina.monsterhunterfieldbook.MapPanel$$ExternalSyntheticLambda2
            r0.<init>(r9)
            java.lang.String r5 = "+"
            android.widget.TextView r12 = r12.button(r5, r0)
            android.view.View r12 = (android.view.View) r12
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r1, r3, r4)
            android.view.ViewGroup$LayoutParams r0 = (android.view.ViewGroup.LayoutParams) r0
            r11.addView(r12, r0)
            android.view.View r11 = (android.view.View) r11
            r9.addView(r11)
            com.lumina.monsterhunterfieldbook.MainActivity r11 = r9.a
            android.widget.LinearLayout r11 = r11.row()
            android.widget.CheckBox r12 = r9.baseToggle
            android.view.View r12 = (android.view.View) r12
            r11.addView(r12)
            android.widget.CheckBox r12 = r9.floorToggle
            android.view.View r12 = (android.view.View) r12
            r11.addView(r12)
            android.view.View r11 = (android.view.View) r11
            r9.addView(r11)
            android.widget.CheckBox r11 = r9.baseToggle
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r9.a
            int r12 = r12.getInk()
            r11.setTextColor(r12)
            android.widget.CheckBox r11 = r9.floorToggle
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r9.a
            int r12 = r12.getInk()
            r11.setTextColor(r12)
            android.widget.CheckBox r11 = r9.baseToggle
            com.lumina.monsterhunterfieldbook.MapPanel$$ExternalSyntheticLambda3 r12 = new com.lumina.monsterhunterfieldbook.MapPanel$$ExternalSyntheticLambda3
            r12.<init>(r9)
            r11.setOnCheckedChangeListener(r12)
            android.widget.CheckBox r11 = r9.floorToggle
            com.lumina.monsterhunterfieldbook.MapPanel$$ExternalSyntheticLambda4 r12 = new com.lumina.monsterhunterfieldbook.MapPanel$$ExternalSyntheticLambda4
            r12.<init>(r9)
            r11.setOnCheckedChangeListener(r12)
            com.lumina.monsterhunterfieldbook.ZoomMapView r11 = r9.canvas
            com.lumina.monsterhunterfieldbook.MapPanel$$ExternalSyntheticLambda5 r12 = new com.lumina.monsterhunterfieldbook.MapPanel$$ExternalSyntheticLambda5
            r12.<init>(r9)
            r11.setOnChange(r12)
            com.lumina.monsterhunterfieldbook.ZoomMapView r11 = r9.canvas
            android.view.View r11 = (android.view.View) r11
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r12.<init>(r2, r1, r4)
            android.view.ViewGroup$LayoutParams r12 = (android.view.ViewGroup.LayoutParams) r12
            r9.addView(r11, r12)
            android.widget.TextView r11 = r9.caption
            android.view.View r11 = (android.view.View) r11
            r9.addView(r11)
            com.lumina.monsterhunterfieldbook.MapPanel$8 r11 = new com.lumina.monsterhunterfieldbook.MapPanel$8
            r11.<init>(r9)
            android.widget.AdapterView$OnItemSelectedListener r11 = (android.widget.AdapterView.OnItemSelectedListener) r11
            r10.setOnItemSelectedListener(r11)
            r9.load()
            return
    }

    private static final kotlin.Unit _init_$lambda$1(com.lumina.monsterhunterfieldbook.MapPanel r1) {
            com.lumina.monsterhunterfieldbook.ZoomMapView r1 = r1.canvas
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            r1.zoom(r0)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    private static final kotlin.Unit _init_$lambda$2(com.lumina.monsterhunterfieldbook.MapPanel r1) {
            com.lumina.monsterhunterfieldbook.ZoomMapView r0 = r1.canvas
            r0.reset()
            r1.save()
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    private static final kotlin.Unit _init_$lambda$3(com.lumina.monsterhunterfieldbook.MapPanel r1) {
            com.lumina.monsterhunterfieldbook.ZoomMapView r1 = r1.canvas
            r0 = 1067450368(0x3fa00000, float:1.25)
            r1.zoom(r0)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    private static final void _init_$lambda$4(com.lumina.monsterhunterfieldbook.MapPanel r1, android.widget.CompoundButton r2, boolean r3) {
            java.lang.String r0 = "<unused var>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            com.lumina.monsterhunterfieldbook.ZoomMapView r2 = r1.canvas
            r2.setShowBase(r3)
            com.lumina.monsterhunterfieldbook.ZoomMapView r2 = r1.canvas
            r2.invalidate()
            r1.save()
            return
    }

    private static final void _init_$lambda$5(com.lumina.monsterhunterfieldbook.MapPanel r1, android.widget.CompoundButton r2, boolean r3) {
            java.lang.String r0 = "<unused var>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            com.lumina.monsterhunterfieldbook.ZoomMapView r2 = r1.canvas
            r2.setShowOverlay(r3)
            com.lumina.monsterhunterfieldbook.ZoomMapView r2 = r1.canvas
            r2.invalidate()
            r1.save()
            return
    }

    private static final kotlin.Unit _init_$lambda$6(com.lumina.monsterhunterfieldbook.MapPanel r0) {
            r0.save()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    public static final /* synthetic */ com.lumina.monsterhunterfieldbook.MainActivity access$getA$p(com.lumina.monsterhunterfieldbook.MapPanel r0) {
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r0.a
            return r0
    }

    public static final /* synthetic */ java.lang.String access$getStateKey$p(com.lumina.monsterhunterfieldbook.MapPanel r0) {
            java.lang.String r0 = r0.stateKey
            return r0
    }

    public static final /* synthetic */ void access$load(com.lumina.monsterhunterfieldbook.MapPanel r0) {
            r0.load()
            return
    }

    public static final /* synthetic */ void access$setIndex$p(com.lumina.monsterhunterfieldbook.MapPanel r0, int r1) {
            r0.index = r1
            return
    }

    private final void load() {
            r10 = this;
            java.lang.String r0 = "mapView:"
            org.json.JSONArray r1 = r10.maps
            int r1 = r1.length()
            if (r1 != 0) goto Lb
            return
        Lb:
            org.json.JSONArray r1 = r10.maps
            int r2 = r10.index
            org.json.JSONObject r1 = r1.getJSONObject(r2)
            int r2 = r10.generation
            r3 = 1
            int r2 = r2 + r3
            r10.generation = r2
            android.widget.TextView r4 = r10.caption
            java.lang.String r5 = "description"
            java.lang.String r5 = r1.optString(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.setText(r5)
            com.lumina.monsterhunterfieldbook.ZoomMapView r4 = r10.canvas
            r5 = 0
            r4.setOverlay(r5)
            com.lumina.monsterhunterfieldbook.ZoomMapView r4 = r10.canvas
            r4.setBase(r5)
            com.lumina.monsterhunterfieldbook.ZoomMapView r4 = r10.canvas
            r4.reset()
            kotlin.Result$Companion r4 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L6c
            r4 = r10
            com.lumina.monsterhunterfieldbook.MapPanel r4 = (com.lumina.monsterhunterfieldbook.MapPanel) r4     // Catch: java.lang.Throwable -> L6c
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6c
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r10.a     // Catch: java.lang.Throwable -> L6c
            com.lumina.monsterhunterfieldbook.NativePrefs r6 = r6.getPrefs()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r7 = r10.stateKey     // Catch: java.lang.Throwable -> L6c
            int r8 = r10.index     // Catch: java.lang.Throwable -> L6c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L6c
            java.lang.StringBuilder r0 = r9.append(r7)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r7 = ":"
            java.lang.StringBuilder r0 = r0.append(r7)     // Catch: java.lang.Throwable -> L6c
            java.lang.StringBuilder r0 = r0.append(r8)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r7 = "{}"
            java.lang.String r0 = r6.text(r0, r7)     // Catch: java.lang.Throwable -> L6c
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r0 = kotlin.Result.m79constructorimpl(r4)     // Catch: java.lang.Throwable -> L6c
            goto L77
        L6c:
            r0 = move-exception
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m79constructorimpl(r0)
        L77:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            boolean r6 = kotlin.Result.m85isFailureimpl(r0)
            if (r6 == 0) goto L83
            r0 = r4
        L83:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            com.lumina.monsterhunterfieldbook.ZoomMapView r4 = r10.canvas
            r4.restore(r0)
            android.widget.CheckBox r0 = r10.baseToggle
            com.lumina.monsterhunterfieldbook.ZoomMapView r4 = r10.canvas
            boolean r4 = r4.getShowBase()
            r0.setChecked(r4)
            android.widget.CheckBox r0 = r10.floorToggle
            com.lumina.monsterhunterfieldbook.ZoomMapView r4 = r10.canvas
            boolean r4 = r4.getShowOverlay()
            r0.setChecked(r4)
            java.lang.String r0 = "backgroundImage"
            java.lang.String r0 = r1.optString(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r4 = kotlin.text.StringsKt.isBlank(r0)
            if (r4 == 0) goto Lb4
            java.lang.String r0 = "background"
            java.lang.String r0 = r1.optString(r0)
        Lb4:
            java.lang.String r0 = (java.lang.String) r0
            android.widget.CheckBox r4 = r10.baseToggle
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.String r6 = "art/"
            r7 = 2
            r8 = 0
            boolean r5 = kotlin.text.StringsKt.startsWith$default(r0, r6, r8, r7, r5)
            if (r5 == 0) goto Lc7
            r5 = r8
            goto Lc9
        Lc7:
            r5 = 8
        Lc9:
            r4.setVisibility(r5)
            load$set(r10, r2, r0, r3)
            java.lang.String r0 = "image"
            java.lang.String r0 = r1.optString(r0)
            java.lang.String r3 = "optString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            load$set(r10, r2, r0, r8)
            com.lumina.monsterhunterfieldbook.ZoomMapView r0 = r10.canvas
            java.lang.String r2 = "title"
            java.lang.String r3 = "Map"
            java.lang.String r1 = r1.optString(r2, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = ". Pinch to zoom; drag to pan. Zoom controls are above."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setContentDescription(r1)
            return
    }

    private static final void load$set(com.lumina.monsterhunterfieldbook.MapPanel r4, int r5, java.lang.String r6, boolean r7) {
            r0 = 2
            r1 = 0
            java.lang.String r2 = "art/"
            r3 = 0
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r6, r2, r3, r0, r1)
            if (r0 != 0) goto Lc
            return
        Lc:
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r4.a
            com.lumina.monsterhunterfieldbook.MapPanel$$ExternalSyntheticLambda6 r1 = new com.lumina.monsterhunterfieldbook.MapPanel$$ExternalSyntheticLambda6
            r1.<init>(r5, r4, r7)
            r0.loadBitmap(r6, r1)
            return
    }

    private static final kotlin.Unit load$set$lambda$2(int r1, com.lumina.monsterhunterfieldbook.MapPanel r2, boolean r3, android.graphics.Bitmap r4) {
            int r0 = r2.generation
            if (r1 != r0) goto L14
            com.lumina.monsterhunterfieldbook.ZoomMapView r1 = r2.canvas
            if (r3 == 0) goto Lc
            r1.setBase(r4)
            goto Lf
        Lc:
            r1.setOverlay(r4)
        Lf:
            com.lumina.monsterhunterfieldbook.ZoomMapView r1 = r2.canvas
            r1.invalidate()
        L14:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    private final void save() {
            r5 = this;
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r5.a
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r0.getPrefs()
            java.lang.String r1 = r5.stateKey
            int r2 = r5.index
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "mapView:"
            r3.<init>(r4)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r3 = ":"
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.lumina.monsterhunterfieldbook.ZoomMapView r2 = r5.canvas
            org.json.JSONObject r2 = r2.snapshot()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r0.set(r1, r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            r1.save()
            int r0 = r1.generation
            int r0 = r0 + 1
            r1.generation = r0
            super.onDetachedFromWindow()
            return
    }
}
