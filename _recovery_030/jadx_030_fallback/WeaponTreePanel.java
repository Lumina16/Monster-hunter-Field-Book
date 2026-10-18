package com.lumina.monsterhunterfieldbook;

/* compiled from: WeaponTreePanel.kt */
@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0004789:B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010(\u001a\u00020\bJ\u0006\u0010)\u001a\u00020\u0012J\b\u0010*\u001a\u00020\bH\u0002J\u0010\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u0012H\u0002J\b\u0010-\u001a\u00020\u000bH\u0002J\b\u0010.\u001a\u00020\fH\u0002J\b\u0010/\u001a\u00020\fH\u0002J\u0006\u00100\u001a\u00020\fJ\u0006\u00101\u001a\u00020\u0014J\u0010\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\u0006H\u0002J\u0010\u00104\u001a\u00020\f2\u0006\u00105\u001a\u00020\u0014H\u0002J\u0010\u00106\u001a\u00020\f2\u0006\u00105\u001a\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00060\u001cR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u00060 R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&0%X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/WeaponTreePanel;", "Landroid/widget/LinearLayout;", "a", "Lcom/lumina/monsterhunterfieldbook/MainActivity;", "records", "", "Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "state", "Lorg/json/JSONObject;", "onInfo", "Lkotlin/Function1;", "", "", "<init>", "(Lcom/lumina/monsterhunterfieldbook/MainActivity;Ljava/util/List;Lorg/json/JSONObject;Lkotlin/jvm/functions/Function1;)V", "getState", "()Lorg/json/JSONObject;", "density", "", "compact", "", "shell", "Landroid/widget/FrameLayout;", "familySelector", "Landroid/widget/Spinner;", "zoomLabel", "Landroid/widget/TextView;", "materialHost", "Lcom/lumina/monsterhunterfieldbook/WeaponTreePanel$MaterialHost;", "graph", "Lcom/lumina/monsterhunterfieldbook/WeaponTreeLayout$Graph;", "viewport", "Lcom/lumina/monsterhunterfieldbook/WeaponTreePanel$TreeViewport;", "materialVersion", "", "selectorReady", "pendingIcons", "", "", "Landroid/widget/ImageView;", "snapshot", "logicalZoom", "treeState", "units", "value", "selectedId", "writeGraphState", "bindFamilies", "resetViewport", "closeMaterials", "select", "record", "showMaterials", "animate", "hideMaterials", "TreeGesture", "MaterialHost", "TreeViewport", "TreeDrawing", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WeaponTreePanel extends android.widget.LinearLayout {
    private final com.lumina.monsterhunterfieldbook.MainActivity a;
    private final boolean compact;
    private final float density;
    private final android.widget.Spinner familySelector;
    private com.lumina.monsterhunterfieldbook.WeaponTreeLayout.Graph graph;
    private final com.lumina.monsterhunterfieldbook.WeaponTreePanel.MaterialHost materialHost;
    private int materialVersion;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onInfo;
    private final java.util.Map<java.lang.String, java.util.List<android.widget.ImageView>> pendingIcons;
    private final java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> records;
    private boolean selectorReady;
    private final android.widget.FrameLayout shell;
    private final org.json.JSONObject state;
    private final com.lumina.monsterhunterfieldbook.WeaponTreePanel.TreeViewport viewport;
    private final android.widget.TextView zoomLabel;

    /* compiled from: WeaponTreePanel.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/WeaponTreePanel$MaterialHost;", "Landroid/widget/LinearLayout;", "<init>", "(Lcom/lumina/monsterhunterfieldbook/WeaponTreePanel;)V", "onMeasure", "", "widthMeasureSpec", "", "heightMeasureSpec", "dispatchTouchEvent", "", "event", "Landroid/view/MotionEvent;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private final class MaterialHost extends android.widget.LinearLayout {
        final /* synthetic */ com.lumina.monsterhunterfieldbook.WeaponTreePanel this$0;

        public MaterialHost(com.lumina.monsterhunterfieldbook.WeaponTreePanel r6) {
                r5 = this;
                r5.this$0 = r6
                com.lumina.monsterhunterfieldbook.MainActivity r0 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r6)
                android.content.Context r0 = (android.content.Context) r0
                r5.<init>(r0)
                r0 = 1
                r5.setOrientation(r0)
                com.lumina.monsterhunterfieldbook.MainActivity r1 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r6)
                r2 = 7
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.Number r2 = (java.lang.Number) r2
                int r1 = r1.dp(r2)
                float r1 = (float) r1
                r5.setElevation(r1)
                r5.setClipToOutline(r0)
                com.lumina.monsterhunterfieldbook.MainActivity r1 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r6)
                com.lumina.monsterhunterfieldbook.MainActivity r2 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r6)
                int r2 = r2.getPanel()
                r3 = 0
                r4 = 1084227584(0x40a00000, float:5.0)
                android.graphics.drawable.GradientDrawable r1 = r1.surface(r2, r3, r4)
                com.lumina.monsterhunterfieldbook.MainActivity r2 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r6)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
                java.lang.Number r3 = (java.lang.Number) r3
                int r2 = r2.dp(r3)
                com.lumina.monsterhunterfieldbook.MainActivity r6 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r6)
                int r6 = r6.getAccent()
                r3 = 102(0x66, float:1.43E-43)
                int r6 = com.lumina.monsterhunterfieldbook.FieldViewsKt.alphaColour(r6, r3)
                r1.setStroke(r2, r6)
                android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
                r5.setBackground(r1)
                r5.setAccessibilityLiveRegion(r0)
                return
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(android.view.MotionEvent r2) {
                r1 = this;
                java.lang.String r0 = "event"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                boolean r0 = r1.isEnabled()
                if (r0 != 0) goto Ld
                r2 = 1
                return r2
            Ld:
                boolean r2 = super.dispatchTouchEvent(r2)
                return r2
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int r2, int r3) {
                r1 = this;
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r0 = r1.this$0
                android.widget.FrameLayout r0 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getShell$p(r0)
                int r0 = r0.getHeight()
                if (r0 <= 0) goto L17
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r3 = r1.this$0
                android.widget.FrameLayout r3 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getShell$p(r3)
                int r3 = r3.getHeight()
                goto L1b
            L17:
                int r3 = android.view.View.MeasureSpec.getSize(r3)
            L1b:
                float r3 = (float) r3
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r0 = r1.this$0
                boolean r0 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getCompact$p(r0)
                if (r0 == 0) goto L28
                r0 = 1057971241(0x3f0f5c29, float:0.56)
                goto L2b
            L28:
                r0 = 1057300152(0x3f051eb8, float:0.52)
            L2b:
                float r3 = r3 * r0
                int r3 = kotlin.math.MathKt.roundToInt(r3)
                r0 = 0
                int r3 = kotlin.ranges.RangesKt.coerceAtLeast(r3, r0)
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
                super.onMeasure(r2, r3)
                return
        }
    }

    /* compiled from: WeaponTreePanel.kt */
    @kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000f\u001a\u00020\u0010J0\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006H\u0002J\u0006\u0010\u0019\u001a\u00020\u0010J\u0018\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0016H\u0014J0\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u0016H\u0014J\u0010\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020&H\u0014R-\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/WeaponTreePanel$TreeDrawing;", "Landroid/view/ViewGroup;", "<init>", "(Lcom/lumina/monsterhunterfieldbook/WeaponTreePanel;)V", "nodes", "Ljava/util/LinkedHashMap;", "", "Landroid/view/View;", "Lkotlin/collections/LinkedHashMap;", "getNodes", "()Ljava/util/LinkedHashMap;", "edgePaint", "Landroid/graphics/Paint;", "path", "Landroid/graphics/Path;", "populate", "", "addIcon", "parent", "Landroid/widget/LinearLayout;", "asset", "width", "", "height", "label", "updateSelection", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "left", "top", "right", "bottom", "onDraw", "canvas", "Landroid/graphics/Canvas;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private final class TreeDrawing extends android.view.ViewGroup {
        private final android.graphics.Paint edgePaint;
        private final java.util.LinkedHashMap<java.lang.String, android.view.View> nodes;
        private final android.graphics.Path path;
        final /* synthetic */ com.lumina.monsterhunterfieldbook.WeaponTreePanel this$0;

        public static /* synthetic */ kotlin.Unit $r8$lambda$3FfsMu_siEXVf_1qBIIPoCkPfPw(com.lumina.monsterhunterfieldbook.WeaponTreePanel r0, java.lang.String r1, android.graphics.Bitmap r2) {
                kotlin.Unit r0 = addIcon$lambda$3(r0, r1, r2)
                return r0
        }

        public static /* synthetic */ void $r8$lambda$5sPSYbi1Eg5qybllaALDM8wyfYM(com.lumina.monsterhunterfieldbook.WeaponTreePanel r0, com.lumina.monsterhunterfieldbook.FieldRecord r1, android.view.View r2) {
                populate$lambda$0$1$0(r0, r1, r2)
                return
        }

        public TreeDrawing(com.lumina.monsterhunterfieldbook.WeaponTreePanel r4) {
                r3 = this;
                r3.this$0 = r4
                com.lumina.monsterhunterfieldbook.MainActivity r0 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r4)
                android.content.Context r0 = (android.content.Context) r0
                r3.<init>(r0)
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                r3.nodes = r0
                android.graphics.Paint r0 = new android.graphics.Paint
                r1 = 1
                r0.<init>(r1)
                com.lumina.monsterhunterfieldbook.MainActivity r1 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r4)
                int r1 = r1.getAccent()
                r2 = 102(0x66, float:1.43E-43)
                int r1 = com.lumina.monsterhunterfieldbook.FieldViewsKt.alphaColour(r1, r2)
                r0.setColor(r1)
                r1 = 1069547520(0x3fc00000, float:1.5)
                float r4 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$units(r4, r1)
                r0.setStrokeWidth(r4)
                android.graphics.Paint$Style r4 = android.graphics.Paint.Style.STROKE
                r0.setStyle(r4)
                r3.edgePaint = r0
                android.graphics.Path r4 = new android.graphics.Path
                r4.<init>()
                r3.path = r4
                r4 = 0
                r3.setWillNotDraw(r4)
                r3.setClipChildren(r4)
                r4 = 2
                r3.setImportantForAccessibility(r4)
                return
        }

        private final void addIcon(android.widget.LinearLayout r4, java.lang.String r5, int r6, int r7, java.lang.String r8) {
                r3 = this;
                android.widget.ImageView r0 = new android.widget.ImageView
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r1 = r3.this$0
                com.lumina.monsterhunterfieldbook.MainActivity r1 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r1)
                android.content.Context r1 = (android.content.Context) r1
                r0.<init>(r1)
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER
                r0.setScaleType(r1)
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                r0.setContentDescription(r8)
                r0.setTag(r5)
                r8 = r0
                android.view.View r8 = (android.view.View) r8
                android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r2 = r3.this$0
                com.lumina.monsterhunterfieldbook.MainActivity r2 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r2)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r2.dp(r6)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r2 = r3.this$0
                com.lumina.monsterhunterfieldbook.MainActivity r2 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r2)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r2.dp(r7)
                r1.<init>(r6, r7)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r6 = r3.this$0
                int r7 = r4.getChildCount()
                if (r7 <= 0) goto L5d
                com.lumina.monsterhunterfieldbook.MainActivity r6 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r6)
                r7 = 8
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                java.lang.Number r7 = (java.lang.Number) r7
                int r6 = r6.dp(r7)
                r1.setMarginStart(r6)
            L5d:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                android.view.ViewGroup$LayoutParams r1 = (android.view.ViewGroup.LayoutParams) r1
                r4.addView(r8, r1)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r4 = r3.this$0
                java.util.Map r4 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getPendingIcons$p(r4)
                java.lang.Object r6 = r4.get(r5)
                if (r6 != 0) goto L7a
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.List r6 = (java.util.List) r6
                r4.put(r5, r6)
            L7a:
                java.util.List r6 = (java.util.List) r6
                r6.add(r0)
                int r4 = r6.size()
                r6 = 1
                if (r4 != r6) goto L96
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r4 = r3.this$0
                com.lumina.monsterhunterfieldbook.MainActivity r4 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r4)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r6 = r3.this$0
                com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeDrawing$$ExternalSyntheticLambda0 r7 = new com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeDrawing$$ExternalSyntheticLambda0
                r7.<init>(r6, r5)
                r4.loadBitmap(r5, r7)
            L96:
                return
        }

        private static final kotlin.Unit addIcon$lambda$3(com.lumina.monsterhunterfieldbook.WeaponTreePanel r2, java.lang.String r3, android.graphics.Bitmap r4) {
                java.util.Map r2 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getPendingIcons$p(r2)
                java.lang.Object r2 = r2.remove(r3)
                java.util.List r2 = (java.util.List) r2
                if (r2 == 0) goto L2e
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.util.Iterator r2 = r2.iterator()
            L12:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L2e
                java.lang.Object r0 = r2.next()
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                if (r4 == 0) goto L12
                java.lang.Object r1 = r0.getTag()
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                if (r1 == 0) goto L12
                r0.setImageBitmap(r4)
                goto L12
            L2e:
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                return r2
        }

        private static final void populate$lambda$0$1$0(com.lumina.monsterhunterfieldbook.WeaponTreePanel r0, com.lumina.monsterhunterfieldbook.FieldRecord r1, android.view.View r2) {
                com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$select(r0, r1)
                return
        }

        public final java.util.LinkedHashMap<java.lang.String, android.view.View> getNodes() {
                r1 = this;
                java.util.LinkedHashMap<java.lang.String, android.view.View> r0 = r1.nodes
                return r0
        }

        @Override // android.view.View
        protected void onDraw(android.graphics.Canvas r10) {
                r9 = this;
                java.lang.String r0 = "canvas"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                super.onDraw(r10)
                android.graphics.Path r0 = r9.path
                r0.rewind()
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r0 = r9.this$0
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r0 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getGraph$p(r0)
                java.util.List r0 = r0.getRecords()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r1 = r9.this$0
                java.util.Iterator r0 = r0.iterator()
            L1f:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto Lbc
                java.lang.Object r2 = r0.next()
                com.lumina.monsterhunterfieldbook.FieldRecord r2 = (com.lumina.monsterhunterfieldbook.FieldRecord) r2
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r3 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getGraph$p(r1)
                java.util.Map r3 = r3.getPositions()
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout r4 = com.lumina.monsterhunterfieldbook.WeaponTreeLayout.INSTANCE
                java.lang.String r4 = r4.parentId(r2)
                java.lang.Object r3 = r3.get(r4)
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Position r3 = (com.lumina.monsterhunterfieldbook.WeaponTreeLayout.Position) r3
                if (r3 != 0) goto L42
                goto L1f
            L42:
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r4 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getGraph$p(r1)
                java.util.Map r4 = r4.getPositions()
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout r5 = com.lumina.monsterhunterfieldbook.WeaponTreeLayout.INSTANCE
                java.lang.String r2 = r5.rawId(r2)
                java.lang.Object r2 = r4.get(r2)
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Position r2 = (com.lumina.monsterhunterfieldbook.WeaponTreeLayout.Position) r2
                if (r2 != 0) goto L59
                goto L1f
            L59:
                android.graphics.Path r4 = r9.path
                float r5 = r3.getX()
                r6 = 1130889216(0x43680000, float:232.0)
                float r5 = r5 + r6
                float r5 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$units(r1, r5)
                float r6 = r3.getY()
                r7 = 1110441984(0x42300000, float:44.0)
                float r6 = r6 + r7
                float r6 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$units(r1, r6)
                r4.moveTo(r5, r6)
                android.graphics.Path r4 = r9.path
                float r5 = r3.getX()
                r6 = 1132134400(0x437b0000, float:251.0)
                float r5 = r5 + r6
                float r5 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$units(r1, r5)
                float r8 = r3.getY()
                float r8 = r8 + r7
                float r8 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$units(r1, r8)
                r4.lineTo(r5, r8)
                android.graphics.Path r4 = r9.path
                float r3 = r3.getX()
                float r3 = r3 + r6
                float r3 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$units(r1, r3)
                float r5 = r2.getY()
                float r5 = r5 + r7
                float r5 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$units(r1, r5)
                r4.lineTo(r3, r5)
                android.graphics.Path r3 = r9.path
                float r4 = r2.getX()
                float r4 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$units(r1, r4)
                float r2 = r2.getY()
                float r2 = r2 + r7
                float r2 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$units(r1, r2)
                r3.lineTo(r4, r2)
                goto L1f
            Lbc:
                android.graphics.Path r0 = r9.path
                android.graphics.Paint r1 = r9.edgePaint
                r10.drawPath(r0, r1)
                return
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
                r2 = this;
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r3 = r2.this$0
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r3 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getGraph$p(r3)
                java.util.List r3 = r3.getRecords()
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r4 = r2.this$0
                java.util.Iterator r3 = r3.iterator()
            L12:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L72
                java.lang.Object r5 = r3.next()
                com.lumina.monsterhunterfieldbook.FieldRecord r5 = (com.lumina.monsterhunterfieldbook.FieldRecord) r5
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout r6 = com.lumina.monsterhunterfieldbook.WeaponTreeLayout.INSTANCE
                java.lang.String r5 = r6.rawId(r5)
                java.util.LinkedHashMap<java.lang.String, android.view.View> r6 = r2.nodes
                java.lang.Object r6 = r6.get(r5)
                android.view.View r6 = (android.view.View) r6
                if (r6 != 0) goto L2f
                goto L12
            L2f:
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r7 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getGraph$p(r4)
                java.util.Map r7 = r7.getPositions()
                java.lang.Object r5 = r7.get(r5)
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Position r5 = (com.lumina.monsterhunterfieldbook.WeaponTreeLayout.Position) r5
                if (r5 != 0) goto L40
                goto L12
            L40:
                com.lumina.monsterhunterfieldbook.MainActivity r7 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r4)
                float r0 = r5.getX()
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                java.lang.Number r0 = (java.lang.Number) r0
                int r7 = r7.dp(r0)
                com.lumina.monsterhunterfieldbook.MainActivity r0 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r4)
                float r5 = r5.getY()
                java.lang.Float r5 = java.lang.Float.valueOf(r5)
                java.lang.Number r5 = (java.lang.Number) r5
                int r5 = r0.dp(r5)
                int r0 = r6.getMeasuredWidth()
                int r0 = r0 + r7
                int r1 = r6.getMeasuredHeight()
                int r1 = r1 + r5
                r6.layout(r7, r5, r0, r1)
                goto L12
            L72:
                return
        }

        @Override // android.view.View
        protected void onMeasure(int r6, int r7) {
                r5 = this;
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r6 = r5.this$0
                com.lumina.monsterhunterfieldbook.MainActivity r6 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r6)
                r7 = 1130889216(0x43680000, float:232.0)
                java.lang.Float r7 = java.lang.Float.valueOf(r7)
                java.lang.Number r7 = (java.lang.Number) r7
                int r6 = r6.dp(r7)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r7 = r5.this$0
                com.lumina.monsterhunterfieldbook.MainActivity r7 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r7)
                r0 = 1118830592(0x42b00000, float:88.0)
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                java.lang.Number r0 = (java.lang.Number) r0
                int r7 = r7.dp(r0)
                int r0 = r5.getChildCount()
                r1 = 0
            L29:
                if (r1 >= r0) goto L3f
                android.view.View r2 = r5.getChildAt(r1)
                r3 = 1073741824(0x40000000, float:2.0)
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r3)
                int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r3)
                r2.measure(r4, r3)
                int r1 = r1 + 1
                goto L29
            L3f:
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r6 = r5.this$0
                com.lumina.monsterhunterfieldbook.MainActivity r6 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r6)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r7 = r5.this$0
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r7 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getGraph$p(r7)
                float r7 = r7.getWidth()
                java.lang.Float r7 = java.lang.Float.valueOf(r7)
                java.lang.Number r7 = (java.lang.Number) r7
                int r6 = r6.dp(r7)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r7 = r5.this$0
                com.lumina.monsterhunterfieldbook.MainActivity r7 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r7)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r0 = r5.this$0
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r0 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getGraph$p(r0)
                float r0 = r0.getHeight()
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                java.lang.Number r0 = (java.lang.Number) r0
                int r7 = r7.dp(r0)
                r5.setMeasuredDimension(r6, r7)
                return
        }

        public final void populate() {
                r26 = this;
                r0 = r26
                r0.removeAllViews()
                java.util.LinkedHashMap<java.lang.String, android.view.View> r1 = r0.nodes
                r1.clear()
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r1 = r0.this$0
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r1 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getGraph$p(r1)
                java.util.List r1 = r1.getRecords()
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r6 = r0.this$0
                java.util.Iterator r7 = r1.iterator()
            L1c:
                boolean r1 = r7.hasNext()
                if (r1 == 0) goto L389
                java.lang.Object r1 = r7.next()
                r8 = r1
                com.lumina.monsterhunterfieldbook.FieldRecord r8 = (com.lumina.monsterhunterfieldbook.FieldRecord) r8
                com.lumina.monsterhunterfieldbook.WeaponModel r1 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
                org.json.JSONObject r1 = r1.data(r8)
                java.lang.String r2 = "elements"
                org.json.JSONArray r2 = r1.optJSONArray(r2)
                r3 = 0
                if (r2 == 0) goto L3d
                int r4 = r2.length()
                goto L3e
            L3d:
                r4 = r3
            L3e:
                kotlin.ranges.IntRange r4 = kotlin.ranges.RangesKt.until(r3, r4)
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Collection r5 = (java.util.Collection) r5
                java.util.Iterator r4 = r4.iterator()
            L4f:
                boolean r9 = r4.hasNext()
                java.lang.String r10 = "type"
                if (r9 == 0) goto L9e
                r9 = r4
                kotlin.collections.IntIterator r9 = (kotlin.collections.IntIterator) r9
                int r9 = r9.nextInt()
                if (r2 == 0) goto L65
                java.lang.Object r9 = r2.opt(r9)
                goto L66
            L65:
                r9 = 0
            L66:
                boolean r12 = r9 instanceof java.lang.String
                if (r12 == 0) goto L6d
                java.lang.String r9 = (java.lang.String) r9
                goto L8a
            L6d:
                boolean r12 = r9 instanceof org.json.JSONObject
                if (r12 == 0) goto L89
                org.json.JSONObject r9 = (org.json.JSONObject) r9
                java.lang.String r10 = r9.optString(r10)
                java.lang.CharSequence r10 = (java.lang.CharSequence) r10
                boolean r12 = kotlin.text.StringsKt.isBlank(r10)
                if (r12 == 0) goto L85
                java.lang.String r10 = "name"
                java.lang.String r10 = r9.optString(r10)
            L85:
                r9 = r10
                java.lang.String r9 = (java.lang.String) r9
                goto L8a
            L89:
                r9 = 0
            L8a:
                if (r9 == 0) goto L97
                r10 = r9
                java.lang.CharSequence r10 = (java.lang.CharSequence) r10
                boolean r10 = kotlin.text.StringsKt.isBlank(r10)
                if (r10 != 0) goto L97
                r11 = r9
                goto L98
            L97:
                r11 = 0
            L98:
                if (r11 == 0) goto L4f
                r5.add(r11)
                goto L4f
            L9e:
                r9 = r5
                java.util.List r9 = (java.util.List) r9
                com.lumina.monsterhunterfieldbook.MainActivity r2 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r6)
                android.widget.LinearLayout r12 = r2.row()
                com.lumina.monsterhunterfieldbook.MainActivity r2 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r6)
                r4 = 13
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                java.lang.Number r5 = (java.lang.Number) r5
                int r2 = r2.dp(r5)
                com.lumina.monsterhunterfieldbook.MainActivity r5 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r6)
                r13 = 12
                java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
                java.lang.Number r14 = (java.lang.Number) r14
                int r5 = r5.dp(r14)
                com.lumina.monsterhunterfieldbook.MainActivity r14 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r6)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                java.lang.Number r4 = (java.lang.Number) r4
                int r4 = r14.dp(r4)
                com.lumina.monsterhunterfieldbook.MainActivity r14 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r6)
                java.lang.Integer r15 = java.lang.Integer.valueOf(r13)
                java.lang.Number r15 = (java.lang.Number) r15
                int r14 = r14.dp(r15)
                r12.setPadding(r2, r5, r4, r14)
                r2 = 16
                r12.setGravity(r2)
                java.lang.String r2 = r8.getName()
                java.lang.String r4 = "rarity"
                r5 = 1
                int r14 = r1.optInt(r4, r5)
                boolean r15 = r9.isEmpty()
                java.lang.String r11 = ""
                if (r15 == 0) goto L102
                r3 = r11
                goto L12b
            L102:
                r16 = r9
                java.lang.Iterable r16 = (java.lang.Iterable) r16
                java.lang.String r15 = ", "
                r17 = r15
                java.lang.CharSequence r17 = (java.lang.CharSequence) r17
                r23 = 62
                r24 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                java.lang.String r13 = kotlin.collections.CollectionsKt.joinToString$default(r16, r17, r18, r19, r20, r21, r22, r23, r24)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r15)
                java.lang.StringBuilder r3 = r3.append(r13)
                java.lang.String r3 = r3.toString()
            L12b:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.StringBuilder r2 = r13.append(r2)
                java.lang.String r13 = ", rarity "
                java.lang.StringBuilder r2 = r2.append(r13)
                java.lang.StringBuilder r2 = r2.append(r14)
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                r12.setContentDescription(r2)
                r12.setImportantForAccessibility(r5)
                r2 = 393216(0x60000, float:5.51013E-40)
                r12.setDescendantFocusability(r2)
                r12.setFocusable(r5)
                r12.setClickable(r5)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeDrawing$$ExternalSyntheticLambda1 r2 = new com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeDrawing$$ExternalSyntheticLambda1
                r2.<init>(r6, r8)
                r12.setOnClickListener(r2)
                com.lumina.monsterhunterfieldbook.MainActivity r17 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r6)
                java.lang.String r18 = r8.getName()
                r22 = 12
                r23 = 0
                r19 = 1101004800(0x41a00000, float:20.0)
                r20 = 0
                r21 = 0
                android.widget.TextView r2 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r17, r18, r19, r20, r21, r22, r23)
                com.lumina.monsterhunterfieldbook.MainActivity r3 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r6)
                com.lumina.monsterhunterfieldbook.NativePrefs r3 = r3.getPrefs()
                java.lang.String r13 = "font"
                r14 = 100
                int r3 = r3.number(r13, r14)
                float r3 = (float) r3
                r13 = 1101004800(0x41a00000, float:20.0)
                float r3 = r3 * r13
                r13 = 1120403456(0x42c80000, float:100.0)
                float r3 = r3 / r13
                r13 = 1098907648(0x41800000, float:16.0)
                r14 = 1104674816(0x41d80000, float:27.0)
                float r3 = kotlin.ranges.RangesKt.coerceIn(r3, r13, r14)
                r2.setTextSize(r3)
                r3 = 3
                r2.setMaxLines(r3)
                android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.END
                r2.setEllipsize(r3)
                r3 = 0
                r13 = 1068289229(0x3faccccd, float:1.35)
                r2.setLineSpacing(r3, r13)
                r3 = 2
                r2.setImportantForAccessibility(r3)
                android.view.View r2 = (android.view.View) r2
                android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
                r13 = 1065353216(0x3f800000, float:1.0)
                r14 = -2
                r15 = 0
                r3.<init>(r15, r14, r13)
                android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
                r12.addView(r2, r3)
                com.lumina.monsterhunterfieldbook.MainActivity r2 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r6)
                android.widget.LinearLayout r2 = r2.row()
                r3 = 4
                r2.setImportantForAccessibility(r3)
                com.lumina.monsterhunterfieldbook.MainActivity r3 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r6)
                org.json.JSONObject r3 = r3.getLibraryData()
                java.lang.String r13 = "nativeVisuals"
                org.json.JSONObject r13 = r3.optJSONObject(r13)
                java.lang.String r3 = r8.getImage()
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                boolean r15 = kotlin.text.StringsKt.isBlank(r3)
                if (r15 == 0) goto L216
                if (r13 == 0) goto L212
                java.lang.String r3 = "weaponTypes"
                org.json.JSONObject r3 = r13.optJSONObject(r3)
                if (r3 == 0) goto L212
                java.lang.String r10 = r1.optString(r10)
                org.json.JSONObject r3 = r3.optJSONObject(r10)
                if (r3 == 0) goto L212
                java.lang.String r10 = "rarityIcons"
                org.json.JSONObject r3 = r3.optJSONObject(r10)
                if (r3 == 0) goto L212
                int r10 = r1.optInt(r4, r5)
                r15 = 12
                int r10 = kotlin.ranges.RangesKt.coerceIn(r10, r5, r15)
                java.lang.String r10 = java.lang.String.valueOf(r10)
                java.lang.String r3 = r3.optString(r10)
                goto L213
            L212:
                r3 = 0
            L213:
                if (r3 != 0) goto L216
                r3 = r11
            L216:
                java.lang.String r3 = (java.lang.String) r3
                r10 = r3
                java.lang.CharSequence r10 = (java.lang.CharSequence) r10
                boolean r10 = kotlin.text.StringsKt.isBlank(r10)
                if (r10 != 0) goto L23e
                int r1 = r1.optInt(r4, r5)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "Rarity "
                r4.<init>(r5)
                java.lang.StringBuilder r1 = r4.append(r1)
                java.lang.String r5 = r1.toString()
                r1 = r2
                r2 = r3
                r3 = 30
                r4 = 32
                r0.addIcon(r1, r2, r3, r4, r5)
                goto L23f
            L23e:
                r1 = r2
            L23f:
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.Iterator r9 = r9.iterator()
            L245:
                boolean r0 = r9.hasNext()
                if (r0 == 0) goto L32b
                java.lang.Object r0 = r9.next()
                r5 = r0
                java.lang.String r5 = (java.lang.String) r5
                java.util.Locale r0 = java.util.Locale.ROOT
                java.lang.String r0 = r5.toLowerCase(r0)
                java.lang.String r2 = "toLowerCase(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                kotlin.text.Regex r2 = new kotlin.text.Regex
                java.lang.String r3 = "[\\s_-]"
                r2.<init>(r3)
                java.lang.String r0 = r2.replace(r0, r11)
                int r2 = r0.hashCode()
                switch(r2) {
                    case -2007407553: goto L2f3;
                    case -1941022228: goto L2e7;
                    case -302630242: goto L2db;
                    case -204597334: goto L2cf;
                    case -108608057: goto L2c3;
                    case 3428: goto L2b7;
                    case 752908747: goto L2ab;
                    case 1171415384: goto L29f;
                    case 1511326680: goto L291;
                    case 1908818914: goto L287;
                    case 1954131909: goto L27d;
                    case 1954138636: goto L273;
                    default: goto L271;
                }
            L271:
                goto L2fe
            L273:
                java.lang.String r2 = "paralyzed"
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L2a8
                goto L2fe
            L27d:
                java.lang.String r2 = "paralysed"
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L2a8
                goto L2fe
            L287:
                java.lang.String r2 = "blastscourge"
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L2f0
                goto L2fe
            L291:
                java.lang.String r2 = "thunderblight"
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L29b
                goto L2fe
            L29b:
                java.lang.String r0 = "thunder"
                goto L2fe
            L29f:
                java.lang.String r2 = "paralyze"
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L2a8
                goto L2fe
            L2a8:
                java.lang.String r0 = "paralysis"
                goto L2fe
            L2ab:
                java.lang.String r2 = "waterblight"
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L2b4
                goto L2fe
            L2b4:
                java.lang.String r0 = "water"
                goto L2fe
            L2b7:
                java.lang.String r2 = "ko"
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L2c0
                goto L2fe
            L2c0:
                java.lang.String r0 = "stun"
                goto L2fe
            L2c3:
                java.lang.String r2 = "dragonblight"
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L2cc
                goto L2fe
            L2cc:
                java.lang.String r0 = "dragon"
                goto L2fe
            L2cf:
                java.lang.String r2 = "fireblight"
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L2d8
                goto L2fe
            L2d8:
                java.lang.String r0 = "fire"
                goto L2fe
            L2db:
                java.lang.String r2 = "exhaustion"
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L2e4
                goto L2fe
            L2e4:
                java.lang.String r0 = "exhaust"
                goto L2fe
            L2e7:
                java.lang.String r2 = "blastblight"
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L2f0
                goto L2fe
            L2f0:
                java.lang.String r0 = "blast"
                goto L2fe
            L2f3:
                java.lang.String r2 = "iceblight"
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L2fc
                goto L2fe
            L2fc:
                java.lang.String r0 = "ice"
            L2fe:
                if (r13 == 0) goto L30d
                java.lang.String r2 = "effects"
                org.json.JSONObject r2 = r13.optJSONObject(r2)
                if (r2 == 0) goto L30d
                java.lang.String r0 = r2.optString(r0)
                goto L30e
            L30d:
                r0 = 0
            L30e:
                if (r0 != 0) goto L312
                r2 = r11
                goto L313
            L312:
                r2 = r0
            L313:
                r0 = r2
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = kotlin.text.StringsKt.isBlank(r0)
                if (r0 != 0) goto L327
                r3 = 24
                r4 = 27
                r0 = r26
                r0.addIcon(r1, r2, r3, r4, r5)
                goto L245
            L327:
                r0 = r26
                goto L245
            L32b:
                r0 = r26
                r2 = r1
                android.view.View r2 = (android.view.View) r2
                android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
                r1.<init>(r14, r14)
                com.lumina.monsterhunterfieldbook.MainActivity r3 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r6)
                r25 = 12
                java.lang.Integer r4 = java.lang.Integer.valueOf(r25)
                java.lang.Number r4 = (java.lang.Number) r4
                int r3 = r3.dp(r4)
                r1.setMarginStart(r3)
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                android.view.ViewGroup$LayoutParams r1 = (android.view.ViewGroup.LayoutParams) r1
                r12.addView(r2, r1)
                r1 = r12
                android.view.View r1 = (android.view.View) r1
                android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
                com.lumina.monsterhunterfieldbook.MainActivity r3 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r6)
                r4 = 1130889216(0x43680000, float:232.0)
                java.lang.Float r4 = java.lang.Float.valueOf(r4)
                java.lang.Number r4 = (java.lang.Number) r4
                int r3 = r3.dp(r4)
                com.lumina.monsterhunterfieldbook.MainActivity r4 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r6)
                r5 = 1118830592(0x42b00000, float:88.0)
                java.lang.Float r5 = java.lang.Float.valueOf(r5)
                java.lang.Number r5 = (java.lang.Number) r5
                int r4 = r4.dp(r5)
                r2.<init>(r3, r4)
                r0.addView(r1, r2)
                java.util.LinkedHashMap<java.lang.String, android.view.View> r1 = r0.nodes
                java.util.Map r1 = (java.util.Map) r1
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout r2 = com.lumina.monsterhunterfieldbook.WeaponTreeLayout.INSTANCE
                java.lang.String r2 = r2.rawId(r8)
                r1.put(r2, r12)
                goto L1c
            L389:
                r0.updateSelection()
                r0.requestLayout()
                r0.invalidate()
                return
        }

        public final void updateSelection() {
                r10 = this;
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r0 = r10.this$0
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r0 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getGraph$p(r0)
                java.util.List r0 = r0.getRecords()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r1 = r10.this$0
                java.util.Iterator r0 = r0.iterator()
            L12:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L15d
                java.lang.Object r2 = r0.next()
                com.lumina.monsterhunterfieldbook.FieldRecord r2 = (com.lumina.monsterhunterfieldbook.FieldRecord) r2
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout r3 = com.lumina.monsterhunterfieldbook.WeaponTreeLayout.INSTANCE
                java.lang.String r3 = r3.rawId(r2)
                java.util.LinkedHashMap<java.lang.String, android.view.View> r4 = r10.nodes
                java.lang.Object r4 = r4.get(r3)
                android.view.View r4 = (android.view.View) r4
                if (r4 != 0) goto L2f
                goto L12
            L2f:
                java.lang.String r5 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$selectedId(r1)
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r5)
                r4.setSelected(r3)
                com.lumina.monsterhunterfieldbook.WeaponModel r5 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
                org.json.JSONObject r2 = r5.data(r2)
                java.lang.String r5 = "forge"
                org.json.JSONObject r5 = r2.optJSONObject(r5)
                r6 = 1
                if (r5 != 0) goto L53
                java.lang.String r5 = "upgrade"
                org.json.JSONObject r2 = r2.optJSONObject(r5)
                if (r2 != 0) goto L53
                r2 = r6
                goto L54
            L53:
                r2 = 0
            L54:
                com.lumina.monsterhunterfieldbook.MainActivity r5 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r1)
                com.lumina.monsterhunterfieldbook.NativePrefs r5 = r5.getPrefs()
                java.lang.String r7 = "theme"
                java.lang.String r8 = "game"
                java.lang.String r5 = r5.text(r7, r8)
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r8)
                if (r5 == 0) goto L7e
                com.lumina.monsterhunterfieldbook.MainActivity r5 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r1)
                boolean r5 = r5.isIce()
                if (r5 == 0) goto L77
                java.lang.String r5 = "#172938"
                goto L79
            L77:
                java.lang.String r5 = "#1b271f"
            L79:
                int r5 = android.graphics.Color.parseColor(r5)
                goto L95
            L7e:
                com.lumina.monsterhunterfieldbook.MainActivity r5 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r1)
                int r5 = r5.getBg()
                com.lumina.monsterhunterfieldbook.MainActivity r7 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r1)
                int r7 = r7.getInk()
                r8 = 1033476506(0x3d99999a, float:0.075)
                int r5 = com.lumina.monsterhunterfieldbook.FieldViewsKt.blend(r5, r7, r8)
            L95:
                android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
                r7.<init>()
                r7.setColor(r5)
                r5 = 1077936128(0x40400000, float:3.0)
                float r8 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$units(r1, r5)
                r7.setCornerRadius(r8)
                if (r2 == 0) goto Ld9
                com.lumina.monsterhunterfieldbook.MainActivity r2 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r1)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Number r6 = (java.lang.Number) r6
                int r2 = r2.dp(r6)
                if (r3 == 0) goto Lc1
                com.lumina.monsterhunterfieldbook.MainActivity r3 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r1)
                int r3 = r3.getAccent()
                goto Lc9
            Lc1:
                com.lumina.monsterhunterfieldbook.MainActivity r3 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r1)
                int r3 = r3.getLine()
            Lc9:
                r6 = 1084227584(0x40a00000, float:5.0)
                float r6 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$units(r1, r6)
                r8 = 1082130432(0x40800000, float:4.0)
                float r8 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$units(r1, r8)
                r7.setStroke(r2, r3, r6, r8)
                goto Lfd
            Ld9:
                com.lumina.monsterhunterfieldbook.MainActivity r2 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r1)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Number r6 = (java.lang.Number) r6
                int r2 = r2.dp(r6)
                if (r3 == 0) goto Lf2
                com.lumina.monsterhunterfieldbook.MainActivity r3 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r1)
                int r3 = r3.getAccent()
                goto Lfa
            Lf2:
                com.lumina.monsterhunterfieldbook.MainActivity r3 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r1)
                int r3 = r3.getLine()
            Lfa:
                r7.setStroke(r2, r3)
            Lfd:
                com.lumina.monsterhunterfieldbook.MainActivity r2 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r1)
                com.lumina.monsterhunterfieldbook.NativePrefs r2 = r2.getPrefs()
                java.lang.String r3 = "touch"
                java.lang.String r6 = "ripple"
                java.lang.String r2 = r2.text(r3, r6)
                java.lang.String r3 = "none"
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
                if (r2 != 0) goto L155
                com.lumina.monsterhunterfieldbook.MainActivity r2 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r1)
                r8 = 170(0xaa, double:8.4E-322)
                long r2 = r2.motionDuration(r8)
                r8 = 0
                int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r2 <= 0) goto L155
                com.lumina.monsterhunterfieldbook.MainActivity r2 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r1)
                int r2 = r2.getAccent()
                r3 = 60
                int r2 = com.lumina.monsterhunterfieldbook.FieldViewsKt.alphaColour(r2, r3)
                android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
                android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
                android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
                r3.<init>()
                r6 = -1
                r3.setColor(r6)
                float r5 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$units(r1, r5)
                r3.setCornerRadius(r5)
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
                android.graphics.drawable.RippleDrawable r5 = new android.graphics.drawable.RippleDrawable
                r5.<init>(r2, r7, r3)
                android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
                goto L158
            L155:
                r5 = r7
                android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
            L158:
                r4.setBackground(r5)
                goto L12
            L15d:
                return
        }
    }

    /* compiled from: WeaponTreePanel.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006 "}, d2 = {"Lcom/lumina/monsterhunterfieldbook/WeaponTreePanel$TreeGesture;", "", "zoom", "", "x", "y", "midX", "midY", "distance", "<init>", "(FFFFFF)V", "getZoom", "()F", "getX", "getY", "getMidX", "getMidY", "getDistance", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class TreeGesture {
        private final float distance;
        private final float midX;
        private final float midY;
        private final float x;
        private final float y;
        private final float zoom;

        public TreeGesture(float r1, float r2, float r3, float r4, float r5, float r6) {
                r0 = this;
                r0.<init>()
                r0.zoom = r1
                r0.x = r2
                r0.y = r3
                r0.midX = r4
                r0.midY = r5
                r0.distance = r6
                return
        }

        public static /* synthetic */ com.lumina.monsterhunterfieldbook.WeaponTreePanel.TreeGesture copy$default(com.lumina.monsterhunterfieldbook.WeaponTreePanel.TreeGesture r0, float r1, float r2, float r3, float r4, float r5, float r6, int r7, java.lang.Object r8) {
                r8 = r7 & 1
                if (r8 == 0) goto L6
                float r1 = r0.zoom
            L6:
                r8 = r7 & 2
                if (r8 == 0) goto Lc
                float r2 = r0.x
            Lc:
                r8 = r7 & 4
                if (r8 == 0) goto L12
                float r3 = r0.y
            L12:
                r8 = r7 & 8
                if (r8 == 0) goto L18
                float r4 = r0.midX
            L18:
                r8 = r7 & 16
                if (r8 == 0) goto L1e
                float r5 = r0.midY
            L1e:
                r7 = r7 & 32
                if (r7 == 0) goto L24
                float r6 = r0.distance
            L24:
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                r2 = r0
                com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeGesture r0 = r2.copy(r3, r4, r5, r6, r7, r8)
                return r0
        }

        public final float component1() {
                r1 = this;
                float r0 = r1.zoom
                return r0
        }

        public final float component2() {
                r1 = this;
                float r0 = r1.x
                return r0
        }

        public final float component3() {
                r1 = this;
                float r0 = r1.y
                return r0
        }

        public final float component4() {
                r1 = this;
                float r0 = r1.midX
                return r0
        }

        public final float component5() {
                r1 = this;
                float r0 = r1.midY
                return r0
        }

        public final float component6() {
                r1 = this;
                float r0 = r1.distance
                return r0
        }

        public final com.lumina.monsterhunterfieldbook.WeaponTreePanel.TreeGesture copy(float r8, float r9, float r10, float r11, float r12, float r13) {
                r7 = this;
                com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeGesture r0 = new com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeGesture
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                r6 = r13
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.lumina.monsterhunterfieldbook.WeaponTreePanel.TreeGesture
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeGesture r5 = (com.lumina.monsterhunterfieldbook.WeaponTreePanel.TreeGesture) r5
                float r1 = r4.zoom
                float r3 = r5.zoom
                int r1 = java.lang.Float.compare(r1, r3)
                if (r1 == 0) goto L17
                return r2
            L17:
                float r1 = r4.x
                float r3 = r5.x
                int r1 = java.lang.Float.compare(r1, r3)
                if (r1 == 0) goto L22
                return r2
            L22:
                float r1 = r4.y
                float r3 = r5.y
                int r1 = java.lang.Float.compare(r1, r3)
                if (r1 == 0) goto L2d
                return r2
            L2d:
                float r1 = r4.midX
                float r3 = r5.midX
                int r1 = java.lang.Float.compare(r1, r3)
                if (r1 == 0) goto L38
                return r2
            L38:
                float r1 = r4.midY
                float r3 = r5.midY
                int r1 = java.lang.Float.compare(r1, r3)
                if (r1 == 0) goto L43
                return r2
            L43:
                float r1 = r4.distance
                float r5 = r5.distance
                int r5 = java.lang.Float.compare(r1, r5)
                if (r5 == 0) goto L4e
                return r2
            L4e:
                return r0
        }

        public final float getDistance() {
                r1 = this;
                float r0 = r1.distance
                return r0
        }

        public final float getMidX() {
                r1 = this;
                float r0 = r1.midX
                return r0
        }

        public final float getMidY() {
                r1 = this;
                float r0 = r1.midY
                return r0
        }

        public final float getX() {
                r1 = this;
                float r0 = r1.x
                return r0
        }

        public final float getY() {
                r1 = this;
                float r0 = r1.y
                return r0
        }

        public final float getZoom() {
                r1 = this;
                float r0 = r1.zoom
                return r0
        }

        public int hashCode() {
                r2 = this;
                float r0 = r2.zoom
                int r0 = java.lang.Float.hashCode(r0)
                int r0 = r0 * 31
                float r1 = r2.x
                int r1 = java.lang.Float.hashCode(r1)
                int r0 = r0 + r1
                int r0 = r0 * 31
                float r1 = r2.y
                int r1 = java.lang.Float.hashCode(r1)
                int r0 = r0 + r1
                int r0 = r0 * 31
                float r1 = r2.midX
                int r1 = java.lang.Float.hashCode(r1)
                int r0 = r0 + r1
                int r0 = r0 * 31
                float r1 = r2.midY
                int r1 = java.lang.Float.hashCode(r1)
                int r0 = r0 + r1
                int r0 = r0 * 31
                float r1 = r2.distance
                int r1 = java.lang.Float.hashCode(r1)
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r8 = this;
                float r0 = r8.zoom
                float r1 = r8.x
                float r2 = r8.y
                float r3 = r8.midX
                float r4 = r8.midY
                float r5 = r8.distance
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r7 = "TreeGesture(zoom="
                r6.<init>(r7)
                java.lang.StringBuilder r0 = r6.append(r0)
                java.lang.String r6 = ", x="
                java.lang.StringBuilder r0 = r0.append(r6)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", y="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r1 = ", midX="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r3)
                java.lang.String r1 = ", midY="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r4)
                java.lang.String r1 = ", distance="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r5)
                java.lang.String r1 = ")"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: WeaponTreePanel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001b\u001a\u00020\u0019J(\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000bH\u0014J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#H\u0014J\u0010\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0016J\u001a\u0010'\u001a\u0014\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)0(H\u0002J\b\u0010*\u001a\u00020\u0019H\u0002J \u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020)H\u0002J\u001a\u0010/\u001a\u0004\u0018\u00010\u00152\u0006\u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020)H\u0002J\u0010\u00100\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0016J\b\u00101\u001a\u00020\u0011H\u0016J\u0010\u00102\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0016J\u0018\u00103\u001a\u00020\u00112\u0006\u00104\u001a\u00020\u000b2\u0006\u0010%\u001a\u000205H\u0016J\u0010\u00106\u001a\u00020\u00192\u0006\u00107\u001a\u000208H\u0016J\u001a\u00109\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u000b2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016R\u0012\u0010\u0004\u001a\u00060\u0005R\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/lumina/monsterhunterfieldbook/WeaponTreePanel$TreeViewport;", "Landroid/widget/FrameLayout;", "<init>", "(Lcom/lumina/monsterhunterfieldbook/WeaponTreePanel;)V", "drawing", "Lcom/lumina/monsterhunterfieldbook/WeaponTreePanel$TreeDrawing;", "Lcom/lumina/monsterhunterfieldbook/WeaponTreePanel;", "gridPaint", "Landroid/graphics/Paint;", "points", "Ljava/util/LinkedHashMap;", "", "Landroid/graphics/PointF;", "Lkotlin/collections/LinkedHashMap;", "gesture", "Lcom/lumina/monsterhunterfieldbook/WeaponTreePanel$TreeGesture;", "suppressed", "", "lastDrag", "", "pressedNode", "Landroid/view/View;", "lastBackgroundTap", "lastBackgroundPoint", "populate", "", "updateSelection", "updateTransform", "onSizeChanged", "w", "h", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onInterceptTouchEvent", "event", "Landroid/view/MotionEvent;", "midpoint", "Lkotlin/Triple;", "", "beginGesture", "setView", "zoom", "x", "y", "hitNode", "onTouchEvent", "performClick", "onGenericMotionEvent", "onKeyDown", "keyCode", "Landroid/view/KeyEvent;", "onInitializeAccessibilityNodeInfo", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "performAccessibilityAction", "action", "arguments", "Landroid/os/Bundle;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private final class TreeViewport extends android.widget.FrameLayout {
        private final com.lumina.monsterhunterfieldbook.WeaponTreePanel.TreeDrawing drawing;
        private com.lumina.monsterhunterfieldbook.WeaponTreePanel.TreeGesture gesture;
        private final android.graphics.Paint gridPaint;
        private android.graphics.PointF lastBackgroundPoint;
        private long lastBackgroundTap;
        private long lastDrag;
        private final java.util.LinkedHashMap<java.lang.Integer, android.graphics.PointF> points;
        private android.view.View pressedNode;
        private boolean suppressed;
        final /* synthetic */ com.lumina.monsterhunterfieldbook.WeaponTreePanel this$0;

        /* renamed from: $r8$lambda$ARX-eKlyxhMRHcQyTZ8owRdtLj4, reason: not valid java name */
        public static /* synthetic */ void m73$r8$lambda$ARXeKlyxhMRHcQyTZ8owRdtLj4(com.lumina.monsterhunterfieldbook.WeaponTreePanel.TreeViewport r0, com.lumina.monsterhunterfieldbook.WeaponTreePanel r1) {
                populate$lambda$0(r0, r1)
                return
        }

        public TreeViewport(com.lumina.monsterhunterfieldbook.WeaponTreePanel r6) {
                r5 = this;
                r5.this$0 = r6
                com.lumina.monsterhunterfieldbook.MainActivity r0 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r6)
                android.content.Context r0 = (android.content.Context) r0
                r5.<init>(r0)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeDrawing r0 = new com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeDrawing
                r0.<init>(r6)
                r5.drawing = r0
                android.graphics.Paint r1 = new android.graphics.Paint
                r2 = 1
                r1.<init>(r2)
                com.lumina.monsterhunterfieldbook.MainActivity r6 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r6)
                int r6 = r6.getLine()
                r1.setColor(r6)
                r5.gridPaint = r1
                java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
                r6.<init>()
                r5.points = r6
                r3 = -350(0xfffffffffffffea2, double:NaN)
                r5.lastDrag = r3
                android.graphics.PointF r6 = new android.graphics.PointF
                r6.<init>()
                r5.lastBackgroundPoint = r6
                r6 = 0
                r5.setWillNotDraw(r6)
                r5.setClipChildren(r2)
                r5.setClipToPadding(r2)
                r5.setFocusable(r2)
                r5.setClickable(r2)
                r5.setImportantForAccessibility(r2)
                java.lang.String r6 = "Weapon family tree. Pinch to zoom and drag to pan."
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                r5.setContentDescription(r6)
                android.view.View r0 = (android.view.View) r0
                r5.addView(r0)
                return
        }

        private final void beginGesture() {
                r11 = this;
                java.util.LinkedHashMap<java.lang.Integer, android.graphics.PointF> r0 = r11.points
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto Lc
                r0 = 0
                r11.gesture = r0
                return
            Lc:
                kotlin.Triple r0 = r11.midpoint()
                java.lang.Object r1 = r0.component1()
                java.lang.Number r1 = (java.lang.Number) r1
                float r6 = r1.floatValue()
                java.lang.Object r1 = r0.component2()
                java.lang.Number r1 = (java.lang.Number) r1
                float r7 = r1.floatValue()
                java.lang.Object r0 = r0.component3()
                java.lang.Number r0 = (java.lang.Number) r0
                float r8 = r0.floatValue()
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r0 = r11.this$0
                org.json.JSONObject r0 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$treeState(r0)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeGesture r2 = new com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeGesture
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r1 = r11.this$0
                float r3 = r1.logicalZoom()
                java.lang.String r1 = "x"
                r4 = 4625196817309499392(0x4030000000000000, double:16.0)
                double r9 = r0.optDouble(r1, r4)
                float r1 = (float) r9
                java.lang.String r9 = "y"
                double r4 = r0.optDouble(r9, r4)
                float r5 = (float) r4
                r4 = r1
                r2.<init>(r3, r4, r5, r6, r7, r8)
                r11.gesture = r2
                return
        }

        private final android.view.View hitNode(float r8, float r9) {
                r7 = this;
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r0 = r7.this$0
                org.json.JSONObject r0 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$treeState(r0)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r1 = r7.this$0
                float r1 = r1.logicalZoom()
                r2 = 1056964608(0x3f000000, float:0.5)
                float r1 = r1 * r2
                java.lang.String r2 = "x"
                r3 = 4625196817309499392(0x4030000000000000, double:16.0)
                double r5 = r0.optDouble(r2, r3)
                float r2 = (float) r5
                float r8 = r8 - r2
                float r8 = r8 / r1
                java.lang.String r2 = "y"
                double r2 = r0.optDouble(r2, r3)
                float r0 = (float) r2
                float r9 = r9 - r0
                float r9 = r9 / r1
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r0 = r7.this$0
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r0 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getGraph$p(r0)
                java.util.List r0 = r0.getRecords()
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r1 = r7.this$0
                int r2 = r0.size()
                java.util.ListIterator r0 = r0.listIterator(r2)
            L37:
                boolean r2 = r0.hasPrevious()
                r3 = 0
                if (r2 == 0) goto L83
                java.lang.Object r2 = r0.previous()
                r4 = r2
                com.lumina.monsterhunterfieldbook.FieldRecord r4 = (com.lumina.monsterhunterfieldbook.FieldRecord) r4
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r5 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getGraph$p(r1)
                java.util.Map r5 = r5.getPositions()
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout r6 = com.lumina.monsterhunterfieldbook.WeaponTreeLayout.INSTANCE
                java.lang.String r4 = r6.rawId(r4)
                java.lang.Object r4 = r5.get(r4)
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Position r4 = (com.lumina.monsterhunterfieldbook.WeaponTreeLayout.Position) r4
                if (r4 != 0) goto L5c
                goto L37
            L5c:
                float r5 = r4.getX()
                int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                if (r5 < 0) goto L37
                float r5 = r4.getX()
                r6 = 1130889216(0x43680000, float:232.0)
                float r5 = r5 + r6
                int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                if (r5 > 0) goto L37
                float r5 = r4.getY()
                int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                if (r5 < 0) goto L37
                float r4 = r4.getY()
                r5 = 1118830592(0x42b00000, float:88.0)
                float r4 = r4 + r5
                int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r4 > 0) goto L37
                goto L84
            L83:
                r2 = r3
            L84:
                com.lumina.monsterhunterfieldbook.FieldRecord r2 = (com.lumina.monsterhunterfieldbook.FieldRecord) r2
                if (r2 != 0) goto L89
                return r3
            L89:
                com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeDrawing r8 = r7.drawing
                java.util.LinkedHashMap r8 = r8.getNodes()
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout r9 = com.lumina.monsterhunterfieldbook.WeaponTreeLayout.INSTANCE
                java.lang.String r9 = r9.rawId(r2)
                java.lang.Object r8 = r8.get(r9)
                android.view.View r8 = (android.view.View) r8
                return r8
        }

        private final kotlin.Triple<java.lang.Float, java.lang.Float, java.lang.Float> midpoint() {
                r7 = this;
                java.util.LinkedHashMap<java.lang.Integer, android.graphics.PointF> r0 = r7.points
                java.util.Collection r0 = r0.values()
                java.lang.String r1 = "<get-values>(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.lang.Object r0 = kotlin.collections.CollectionsKt.firstOrNull(r0)
                android.graphics.PointF r0 = (android.graphics.PointF) r0
                r2 = 0
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                if (r0 != 0) goto L20
                kotlin.Triple r0 = new kotlin.Triple
                r0.<init>(r2, r2, r2)
                return r0
            L20:
                java.util.LinkedHashMap<java.lang.Integer, android.graphics.PointF> r3 = r7.points
                java.util.Collection r3 = r3.values()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                r1 = 1
                java.util.List r1 = kotlin.collections.CollectionsKt.drop(r3, r1)
                java.lang.Object r1 = kotlin.collections.CollectionsKt.firstOrNull(r1)
                android.graphics.PointF r1 = (android.graphics.PointF) r1
                if (r1 != 0) goto L4a
                kotlin.Triple r1 = new kotlin.Triple
                float r3 = r0.x
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                float r0 = r0.y
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                r1.<init>(r3, r0, r2)
                return r1
            L4a:
                kotlin.Triple r2 = new kotlin.Triple
                float r3 = r0.x
                float r4 = r1.x
                float r3 = r3 + r4
                r4 = 1073741824(0x40000000, float:2.0)
                float r3 = r3 / r4
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                float r5 = r0.y
                float r6 = r1.y
                float r5 = r5 + r6
                float r5 = r5 / r4
                java.lang.Float r4 = java.lang.Float.valueOf(r5)
                float r5 = r0.x
                float r6 = r1.x
                float r5 = r5 - r6
                double r5 = (double) r5
                float r0 = r0.y
                float r1 = r1.y
                float r0 = r0 - r1
                double r0 = (double) r0
                double r0 = java.lang.Math.hypot(r5, r0)
                float r0 = (float) r0
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                r2.<init>(r3, r4, r0)
                return r2
        }

        private static final void populate$lambda$0(com.lumina.monsterhunterfieldbook.WeaponTreePanel.TreeViewport r1, com.lumina.monsterhunterfieldbook.WeaponTreePanel r2) {
                int r0 = r1.getWidth()
                if (r0 <= 0) goto Lf
                int r1 = r1.getHeight()
                if (r1 <= 0) goto Lf
                r2.resetViewport()
            Lf:
                return
        }

        private final void setView(float r3, float r4, float r5) {
                r2 = this;
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r0 = r2.this$0
                org.json.JSONObject r0 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$treeState(r0)
                java.lang.String r1 = "zoom"
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                org.json.JSONObject r3 = r0.put(r1, r3)
                java.lang.String r0 = "x"
                java.lang.Float r4 = java.lang.Float.valueOf(r4)
                org.json.JSONObject r3 = r3.put(r0, r4)
                java.lang.String r4 = "y"
                java.lang.Float r5 = java.lang.Float.valueOf(r5)
                r3.put(r4, r5)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r3 = r2.this$0
                org.json.JSONObject r3 = r3.getState()
                java.lang.String r4 = "treeInitialized"
                r5 = 1
                r3.put(r4, r5)
                r2.updateTransform()
                return
        }

        @Override // android.view.View
        protected void onDraw(android.graphics.Canvas r7) {
                r6 = this;
                java.lang.String r0 = "canvas"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                super.onDraw(r7)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r0 = r6.this$0
                r1 = 1101004800(0x41a00000, float:20.0)
                float r0 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$units(r0, r1)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r1 = r6.this$0
                r2 = 1065353216(0x3f800000, float:1.0)
                float r1 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$units(r1, r2)
            L18:
                int r3 = r6.getWidth()
                float r3 = (float) r3
                int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r3 >= 0) goto L41
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r3 = r6.this$0
                float r3 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$units(r3, r2)
            L27:
                int r4 = r6.getHeight()
                float r4 = (float) r4
                int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r4 >= 0) goto L3f
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r4 = r6.this$0
                r5 = 1061158912(0x3f400000, float:0.75)
                float r4 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$units(r4, r5)
                android.graphics.Paint r5 = r6.gridPaint
                r7.drawCircle(r1, r3, r4, r5)
                float r3 = r3 + r0
                goto L27
            L3f:
                float r1 = r1 + r0
                goto L18
            L41:
                return
        }

        @Override // android.view.View
        public boolean onGenericMotionEvent(android.view.MotionEvent r7) {
                r6 = this;
                java.lang.String r0 = "event"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                int r0 = r7.getAction()
                r1 = 8
                if (r0 != r1) goto L51
                int r0 = r7.getMetaState()
                r1 = 69632(0x11000, float:9.7575E-41)
                r0 = r0 & r1
                if (r0 == 0) goto L51
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r0 = r6.this$0
                org.json.JSONObject r0 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$treeState(r0)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r1 = r6.this$0
                float r1 = r1.logicalZoom()
                r2 = 9
                float r7 = r7.getAxisValue(r2)
                r2 = 1050253722(0x3e99999a, float:0.3)
                float r7 = r7 * r2
                double r2 = (double) r7
                double r2 = java.lang.Math.exp(r2)
                float r7 = (float) r2
                float r1 = r1 * r7
                r7 = 1056964608(0x3f000000, float:0.5)
                r2 = 1086324736(0x40c00000, float:6.0)
                float r7 = kotlin.ranges.RangesKt.coerceIn(r1, r7, r2)
                java.lang.String r1 = "x"
                r2 = 4625196817309499392(0x4030000000000000, double:16.0)
                double r4 = r0.optDouble(r1, r2)
                float r1 = (float) r4
                java.lang.String r4 = "y"
                double r2 = r0.optDouble(r4, r2)
                float r0 = (float) r2
                r6.setView(r7, r1, r0)
                r7 = 1
                return r7
            L51:
                boolean r7 = super.onGenericMotionEvent(r7)
                return r7
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r4) {
                r3 = this;
                java.lang.String r0 = "info"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                super.onInitializeAccessibilityNodeInfo(r4)
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = new android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
                java.lang.String r1 = "Zoom in"
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r2 = 16842753(0x1010001, float:2.369356E-38)
                r0.<init>(r2, r1)
                r4.addAction(r0)
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = new android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
                java.lang.String r1 = "Zoom out"
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r2 = 16842754(0x1010002, float:2.3693564E-38)
                r0.<init>(r2, r1)
                r4.addAction(r0)
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = new android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
                java.lang.String r1 = "Reset view"
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r2 = 16842755(0x1010003, float:2.3693566E-38)
                r0.<init>(r2, r1)
                r4.addAction(r0)
                return
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(android.view.MotionEvent r2) {
                r1 = this;
                java.lang.String r0 = "event"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r2 = 1
                return r2
        }

        @Override // android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int r8, android.view.KeyEvent r9) {
                r7 = this;
                java.lang.String r0 = "event"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r0 = r7.this$0
                org.json.JSONObject r0 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$treeState(r0)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r1 = r7.this$0
                float r1 = r1.logicalZoom()
                java.lang.String r2 = "x"
                r3 = 4625196817309499392(0x4030000000000000, double:16.0)
                double r5 = r0.optDouble(r2, r3)
                float r2 = (float) r5
                java.lang.String r5 = "y"
                double r3 = r0.optDouble(r5, r3)
                float r0 = (float) r3
                r3 = 7
                if (r8 == r3) goto L60
                r3 = 81
                r4 = 1048576000(0x3e800000, float:0.25)
                if (r8 == r3) goto L58
                r3 = 144(0x90, float:2.02E-43)
                if (r8 == r3) goto L60
                r3 = 69
                if (r8 == r3) goto L50
                r3 = 70
                if (r8 == r3) goto L58
                r3 = 156(0x9c, float:2.19E-43)
                if (r8 == r3) goto L50
                r3 = 157(0x9d, float:2.2E-43)
                if (r8 == r3) goto L58
                r3 = 1112014848(0x42480000, float:50.0)
                switch(r8) {
                    case 19: goto L4e;
                    case 20: goto L4c;
                    case 21: goto L4a;
                    case 22: goto L48;
                    default: goto L43;
                }
            L43:
                boolean r8 = super.onKeyDown(r8, r9)
                return r8
            L48:
                float r2 = r2 - r3
                goto L64
            L4a:
                float r2 = r2 + r3
                goto L64
            L4c:
                float r0 = r0 - r3
                goto L64
            L4e:
                float r0 = r0 + r3
                goto L64
            L50:
                r8 = 1056964608(0x3f000000, float:0.5)
                float r1 = r1 - r4
                float r1 = java.lang.Math.max(r8, r1)
                goto L64
            L58:
                r8 = 1086324736(0x40c00000, float:6.0)
                float r1 = r1 + r4
                float r1 = java.lang.Math.min(r8, r1)
                goto L64
            L60:
                r2 = 0
                r1 = 1065353216(0x3f800000, float:1.0)
                r0 = r2
            L64:
                r7.setView(r1, r2, r0)
                r8 = 1
                return r8
        }

        @Override // android.view.View
        protected void onSizeChanged(int r1, int r2, int r3, int r4) {
                r0 = this;
                super.onSizeChanged(r1, r2, r3, r4)
                if (r1 <= 0) goto L27
                if (r2 <= 0) goto L27
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r1 = r0.this$0
                org.json.JSONObject r1 = r1.getState()
                java.lang.String r2 = "treeInitialized"
                boolean r1 = r1.optBoolean(r2)
                if (r1 == 0) goto L19
                r0.updateTransform()
                goto L1e
            L19:
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r1 = r0.this$0
                r1.resetViewport()
            L1e:
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r1 = r0.this$0
                com.lumina.monsterhunterfieldbook.WeaponTreePanel$MaterialHost r1 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getMaterialHost$p(r1)
                r1.requestLayout()
            L27:
                return
        }

        @Override // android.view.View
        public boolean onTouchEvent(android.view.MotionEvent r14) {
                r13 = this;
                java.lang.String r0 = "event"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                int r0 = r14.getActionMasked()
                r1 = 0
                r2 = 0
                r3 = 1
                if (r0 == 0) goto L28e
                r4 = 0
                if (r0 == r3) goto L1d2
                r5 = 2
                if (r0 == r5) goto Ldf
                r4 = 3
                if (r0 == r4) goto Lc4
                r1 = 5
                if (r0 == r1) goto L7c
                r1 = 6
                if (r0 == r1) goto L1f
                goto L2eb
            L1f:
                java.util.LinkedHashMap<java.lang.Integer, android.graphics.PointF> r0 = r13.points
                int r1 = r14.getActionIndex()
                int r1 = r14.getPointerId(r1)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.remove(r1)
                int r0 = r14.getPointerCount()
            L34:
                if (r2 >= r0) goto L77
                int r1 = r14.getActionIndex()
                if (r2 == r1) goto L74
                int r1 = r14.getPointerId(r2)
                java.util.LinkedHashMap<java.lang.Integer, android.graphics.PointF> r4 = r13.points
                java.util.Map r4 = (java.util.Map) r4
                java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
                boolean r4 = r4.containsKey(r5)
                if (r4 == 0) goto L74
                java.util.LinkedHashMap<java.lang.Integer, android.graphics.PointF> r4 = r13.points
                java.util.Map r4 = (java.util.Map) r4
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                android.graphics.PointF r5 = new android.graphics.PointF
                float r6 = r14.getX(r2)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r7 = r13.this$0
                float r7 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getDensity$p(r7)
                float r6 = r6 / r7
                float r7 = r14.getY(r2)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r8 = r13.this$0
                float r8 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getDensity$p(r8)
                float r7 = r7 / r8
                r5.<init>(r6, r7)
                r4.put(r1, r5)
            L74:
                int r2 = r2 + 1
                goto L34
            L77:
                r13.beginGesture()
                goto L2eb
            L7c:
                int r0 = r14.getPointerCount()
                r1 = r2
            L81:
                if (r1 >= r0) goto Lb0
                java.util.LinkedHashMap<java.lang.Integer, android.graphics.PointF> r4 = r13.points
                java.util.Map r4 = (java.util.Map) r4
                int r5 = r14.getPointerId(r1)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                android.graphics.PointF r6 = new android.graphics.PointF
                float r7 = r14.getX(r1)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r8 = r13.this$0
                float r8 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getDensity$p(r8)
                float r7 = r7 / r8
                float r8 = r14.getY(r1)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r9 = r13.this$0
                float r9 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getDensity$p(r9)
                float r8 = r8 / r9
                r6.<init>(r7, r8)
                r4.put(r5, r6)
                int r1 = r1 + 1
                goto L81
            Lb0:
                r13.suppressed = r3
                long r0 = android.os.SystemClock.uptimeMillis()
                r13.lastDrag = r0
                android.view.View r14 = r13.pressedNode
                if (r14 == 0) goto Lbf
                r14.setPressed(r2)
            Lbf:
                r13.beginGesture()
                goto L2eb
            Lc4:
                android.view.View r14 = r13.pressedNode
                if (r14 == 0) goto Lcb
                r14.setPressed(r2)
            Lcb:
                r13.pressedNode = r1
                java.util.LinkedHashMap<java.lang.Integer, android.graphics.PointF> r14 = r13.points
                r14.clear()
                r13.gesture = r1
                r13.suppressed = r3
                android.view.ViewParent r14 = r13.getParent()
                r14.requestDisallowInterceptTouchEvent(r2)
                goto L2eb
            Ldf:
                int r0 = r14.getPointerCount()
                r1 = r2
            Le4:
                if (r1 >= r0) goto L121
                int r5 = r14.getPointerId(r1)
                java.util.LinkedHashMap<java.lang.Integer, android.graphics.PointF> r6 = r13.points
                java.util.Map r6 = (java.util.Map) r6
                java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
                boolean r6 = r6.containsKey(r7)
                if (r6 == 0) goto L11e
                java.util.LinkedHashMap<java.lang.Integer, android.graphics.PointF> r6 = r13.points
                java.util.Map r6 = (java.util.Map) r6
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                android.graphics.PointF r7 = new android.graphics.PointF
                float r8 = r14.getX(r1)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r9 = r13.this$0
                float r9 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getDensity$p(r9)
                float r8 = r8 / r9
                float r9 = r14.getY(r1)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r10 = r13.this$0
                float r10 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getDensity$p(r10)
                float r9 = r9 / r10
                r7.<init>(r8, r9)
                r6.put(r5, r7)
            L11e:
                int r1 = r1 + 1
                goto Le4
            L121:
                com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeGesture r14 = r13.gesture
                if (r14 == 0) goto L2eb
                kotlin.Triple r0 = r13.midpoint()
                java.lang.Object r1 = r0.component1()
                java.lang.Number r1 = (java.lang.Number) r1
                float r1 = r1.floatValue()
                java.lang.Object r5 = r0.component2()
                java.lang.Number r5 = (java.lang.Number) r5
                float r5 = r5.floatValue()
                java.lang.Object r0 = r0.component3()
                java.lang.Number r0 = (java.lang.Number) r0
                float r0 = r0.floatValue()
                float r6 = r14.getZoom()
                float r7 = r14.getX()
                float r7 = r7 + r1
                float r8 = r14.getMidX()
                float r7 = r7 - r8
                float r8 = r14.getY()
                float r8 = r8 + r5
                float r9 = r14.getMidY()
                float r8 = r8 - r9
                java.util.LinkedHashMap<java.lang.Integer, android.graphics.PointF> r9 = r13.points
                int r9 = r9.size()
                if (r9 <= r3) goto L19f
                float r9 = r14.getDistance()
                int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r4 <= 0) goto L19f
                float r4 = r14.getZoom()
                float r4 = r4 * r0
                float r0 = r14.getDistance()
                float r4 = r4 / r0
                r0 = 1056964608(0x3f000000, float:0.5)
                r6 = 1086324736(0x40c00000, float:6.0)
                float r6 = kotlin.ranges.RangesKt.coerceIn(r4, r0, r6)
                float r0 = r14.getZoom()
                float r0 = r6 / r0
                float r4 = r14.getMidX()
                float r7 = r14.getX()
                float r4 = r4 - r7
                float r4 = r4 * r0
                float r7 = r1 - r4
                float r4 = r14.getMidY()
                float r8 = r14.getY()
                float r4 = r4 - r8
                float r4 = r4 * r0
                float r8 = r5 - r4
            L19f:
                float r0 = r14.getMidX()
                float r1 = r1 - r0
                double r0 = (double) r1
                float r14 = r14.getMidY()
                float r5 = r5 - r14
                double r4 = (double) r5
                double r0 = java.lang.Math.hypot(r0, r4)
                float r14 = (float) r0
                r0 = 1084227584(0x40a00000, float:5.0)
                int r14 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
                if (r14 > 0) goto L1be
                java.util.LinkedHashMap<java.lang.Integer, android.graphics.PointF> r14 = r13.points
                int r14 = r14.size()
                if (r14 <= r3) goto L1cd
            L1be:
                r13.suppressed = r3
                long r0 = android.os.SystemClock.uptimeMillis()
                r13.lastDrag = r0
                android.view.View r14 = r13.pressedNode
                if (r14 == 0) goto L1cd
                r14.setPressed(r2)
            L1cd:
                r13.setView(r6, r7, r8)
                goto L2eb
            L1d2:
                float r0 = r14.getX()
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r5 = r13.this$0
                float r5 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getDensity$p(r5)
                float r0 = r0 / r5
                float r5 = r14.getY()
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r6 = r13.this$0
                float r6 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getDensity$p(r6)
                float r5 = r5 / r6
                android.view.View r0 = r13.hitNode(r0, r5)
                android.view.View r5 = r13.pressedNode
                if (r5 == 0) goto L1f3
                r5.setPressed(r2)
            L1f3:
                boolean r5 = r13.suppressed
                if (r5 != 0) goto L27d
                long r5 = android.os.SystemClock.uptimeMillis()
                long r7 = r13.lastDrag
                long r5 = r5 - r7
                r7 = 350(0x15e, double:1.73E-321)
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 < 0) goto L27d
                r5 = 0
                if (r0 == 0) goto L212
                android.view.View r7 = r13.pressedNode
                if (r0 != r7) goto L212
                r0.performClick()
                r13.lastBackgroundTap = r5
                goto L27d
            L212:
                if (r0 != 0) goto L27d
                long r7 = android.os.SystemClock.uptimeMillis()
                float r0 = r14.getX()
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r9 = r13.this$0
                float r9 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getDensity$p(r9)
                float r0 = r0 / r9
                float r14 = r14.getY()
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r9 = r13.this$0
                float r9 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getDensity$p(r9)
                float r14 = r14 / r9
                long r9 = r13.lastBackgroundTap
                int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                if (r11 <= 0) goto L26c
                long r9 = r7 - r9
                int r11 = android.view.ViewConfiguration.getDoubleTapTimeout()
                long r11 = (long) r11
                int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r9 > 0) goto L26c
                android.graphics.PointF r9 = r13.lastBackgroundPoint
                float r9 = r9.x
                float r9 = r0 - r9
                double r9 = (double) r9
                android.graphics.PointF r11 = r13.lastBackgroundPoint
                float r11 = r11.y
                float r11 = r14 - r11
                double r11 = (double) r11
                double r9 = java.lang.Math.hypot(r9, r11)
                float r9 = (float) r9
                r10 = 1109393408(0x42200000, float:40.0)
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 >= 0) goto L26c
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r14 = r13.this$0
                float r14 = r14.logicalZoom()
                r0 = 1065353216(0x3f800000, float:1.0)
                int r14 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
                if (r14 != 0) goto L266
                r0 = 1073741824(0x40000000, float:2.0)
            L266:
                r13.setView(r0, r4, r4)
                r13.lastBackgroundTap = r5
                goto L27a
            L26c:
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r4 = r13.this$0
                r4.closeMaterials()
                r13.lastBackgroundTap = r7
                android.graphics.PointF r4 = new android.graphics.PointF
                r4.<init>(r0, r14)
                r13.lastBackgroundPoint = r4
            L27a:
                r13.performClick()
            L27d:
                r13.pressedNode = r1
                java.util.LinkedHashMap<java.lang.Integer, android.graphics.PointF> r14 = r13.points
                r14.clear()
                r13.gesture = r1
                android.view.ViewParent r14 = r13.getParent()
                r14.requestDisallowInterceptTouchEvent(r2)
                goto L2eb
            L28e:
                android.view.ViewParent r0 = r13.getParent()
                r0.requestDisallowInterceptTouchEvent(r3)
                java.util.LinkedHashMap<java.lang.Integer, android.graphics.PointF> r0 = r13.points
                r0.clear()
                r13.suppressed = r2
                java.util.LinkedHashMap<java.lang.Integer, android.graphics.PointF> r0 = r13.points
                java.util.Map r0 = (java.util.Map) r0
                int r2 = r14.getPointerId(r2)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                android.graphics.PointF r4 = new android.graphics.PointF
                float r5 = r14.getX()
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r6 = r13.this$0
                float r6 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getDensity$p(r6)
                float r5 = r5 / r6
                float r6 = r14.getY()
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r7 = r13.this$0
                float r7 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getDensity$p(r7)
                float r6 = r6 / r7
                r4.<init>(r5, r6)
                r0.put(r2, r4)
                float r0 = r14.getX()
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r2 = r13.this$0
                float r2 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getDensity$p(r2)
                float r0 = r0 / r2
                float r14 = r14.getY()
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r2 = r13.this$0
                float r2 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getDensity$p(r2)
                float r14 = r14 / r2
                android.view.View r14 = r13.hitNode(r0, r14)
                if (r14 == 0) goto L2e6
                r14.setPressed(r3)
                r1 = r14
            L2e6:
                r13.pressedNode = r1
                r13.beginGesture()
            L2eb:
                return r3
        }

        @Override // android.view.View
        public boolean performAccessibilityAction(int r7, android.os.Bundle r8) {
                r6 = this;
                r0 = 16842755(0x1010003, float:2.3693566E-38)
                r1 = 1
                if (r7 != r0) goto Lc
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r7 = r6.this$0
                r7.resetViewport()
                return r1
            Lc:
                switch(r7) {
                    case 16842753: goto L14;
                    case 16842754: goto L14;
                    default: goto Lf;
                }
            Lf:
                boolean r7 = super.performAccessibilityAction(r7, r8)
                return r7
            L14:
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r8 = r6.this$0
                org.json.JSONObject r8 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$treeState(r8)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r0 = r6.this$0
                float r0 = r0.logicalZoom()
                r2 = 16842753(0x1010001, float:2.369356E-38)
                if (r7 != r2) goto L28
                r7 = 1048576000(0x3e800000, float:0.25)
                goto L2a
            L28:
                r7 = -1098907648(0xffffffffbe800000, float:-0.25)
            L2a:
                float r0 = r0 + r7
                r7 = 1056964608(0x3f000000, float:0.5)
                r2 = 1086324736(0x40c00000, float:6.0)
                float r7 = kotlin.ranges.RangesKt.coerceIn(r0, r7, r2)
                java.lang.String r0 = "x"
                r2 = 4625196817309499392(0x4030000000000000, double:16.0)
                double r4 = r8.optDouble(r0, r2)
                float r0 = (float) r4
                java.lang.String r4 = "y"
                double r2 = r8.optDouble(r4, r2)
                float r8 = (float) r2
                r6.setView(r7, r0, r8)
                return r1
        }

        @Override // android.view.View
        public boolean performClick() {
                r1 = this;
                super.performClick()
                r0 = 1
                return r0
        }

        public final void populate() {
                r5 = this;
                com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeDrawing r0 = r5.drawing
                r0.populate()
                com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeDrawing r0 = r5.drawing
                android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r2 = r5.this$0
                com.lumina.monsterhunterfieldbook.MainActivity r2 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r2)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r3 = r5.this$0
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r3 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getGraph$p(r3)
                float r3 = r3.getWidth()
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                java.lang.Number r3 = (java.lang.Number) r3
                int r2 = r2.dp(r3)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r3 = r5.this$0
                com.lumina.monsterhunterfieldbook.MainActivity r3 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getA$p(r3)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r4 = r5.this$0
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r4 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getGraph$p(r4)
                float r4 = r4.getHeight()
                java.lang.Float r4 = java.lang.Float.valueOf(r4)
                java.lang.Number r4 = (java.lang.Number) r4
                int r3 = r3.dp(r4)
                r1.<init>(r2, r3)
                android.view.ViewGroup$LayoutParams r1 = (android.view.ViewGroup.LayoutParams) r1
                r0.setLayoutParams(r1)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r0 = r5.this$0
                org.json.JSONObject r0 = r0.getState()
                java.lang.String r1 = "treeInitialized"
                boolean r0 = r0.optBoolean(r1)
                if (r0 != 0) goto L5e
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r0 = r5.this$0
                com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeViewport$$ExternalSyntheticLambda0 r1 = new com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeViewport$$ExternalSyntheticLambda0
                r1.<init>(r5, r0)
                r5.post(r1)
                goto L61
            L5e:
                r5.updateTransform()
            L61:
                r5.requestLayout()
                return
        }

        public final void updateSelection() {
                r1 = this;
                com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeDrawing r0 = r1.drawing
                r0.updateSelection()
                return
        }

        public final void updateTransform() {
                r12 = this;
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r0 = r12.this$0
                org.json.JSONObject r0 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$treeState(r0)
                r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                java.lang.String r3 = "zoom"
                double r1 = r0.optDouble(r3, r1)
                float r1 = (float) r1
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r2 = r1
                java.lang.Number r2 = (java.lang.Number) r2
                float r2 = r2.floatValue()
                float r2 = java.lang.Math.abs(r2)
                r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                r5 = 0
                if (r2 > 0) goto L27
                goto L28
            L27:
                r1 = r5
            L28:
                r2 = 1056964608(0x3f000000, float:0.5)
                if (r1 == 0) goto L37
                float r1 = r1.floatValue()
                r6 = 1086324736(0x40c00000, float:6.0)
                float r1 = kotlin.ranges.RangesKt.coerceIn(r1, r2, r6)
                goto L39
            L37:
                r1 = 1065353216(0x3f800000, float:1.0)
            L39:
                float r2 = r2 * r1
                java.lang.String r6 = "x"
                r7 = 4625196817309499392(0x4030000000000000, double:16.0)
                double r9 = r0.optDouble(r6, r7)
                float r9 = (float) r9
                java.lang.Float r9 = java.lang.Float.valueOf(r9)
                r10 = r9
                java.lang.Number r10 = (java.lang.Number) r10
                float r10 = r10.floatValue()
                float r10 = java.lang.Math.abs(r10)
                int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
                if (r10 > 0) goto L57
                goto L58
            L57:
                r9 = r5
            L58:
                r10 = 1098907648(0x41800000, float:16.0)
                if (r9 == 0) goto L61
                float r9 = r9.floatValue()
                goto L62
            L61:
                r9 = r10
            L62:
                java.lang.String r11 = "y"
                double r7 = r0.optDouble(r11, r7)
                float r7 = (float) r7
                java.lang.Float r7 = java.lang.Float.valueOf(r7)
                r8 = r7
                java.lang.Number r8 = (java.lang.Number) r8
                float r8 = r8.floatValue()
                float r8 = java.lang.Math.abs(r8)
                int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r4 > 0) goto L7d
                r5 = r7
            L7d:
                if (r5 == 0) goto L83
                float r10 = r5.floatValue()
            L83:
                int r4 = r12.getWidth()
                if (r4 <= 0) goto La6
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout r4 = com.lumina.monsterhunterfieldbook.WeaponTreeLayout.INSTANCE
                int r5 = r12.getWidth()
                float r5 = (float) r5
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r7 = r12.this$0
                float r7 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getDensity$p(r7)
                float r5 = r5 / r7
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r7 = r12.this$0
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r7 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getGraph$p(r7)
                float r7 = r7.getWidth()
                float r7 = r7 * r2
                float r9 = r4.clampPan(r9, r5, r7)
            La6:
                int r4 = r12.getHeight()
                if (r4 <= 0) goto Lc9
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout r4 = com.lumina.monsterhunterfieldbook.WeaponTreeLayout.INSTANCE
                int r5 = r12.getHeight()
                float r5 = (float) r5
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r7 = r12.this$0
                float r7 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getDensity$p(r7)
                float r5 = r5 / r7
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r7 = r12.this$0
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r7 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getGraph$p(r7)
                float r7 = r7.getHeight()
                float r7 = r7 * r2
                float r10 = r4.clampPan(r10, r5, r7)
            Lc9:
                java.lang.Float r4 = java.lang.Float.valueOf(r1)
                org.json.JSONObject r0 = r0.put(r3, r4)
                java.lang.Float r3 = java.lang.Float.valueOf(r9)
                org.json.JSONObject r0 = r0.put(r6, r3)
                java.lang.Float r3 = java.lang.Float.valueOf(r10)
                r0.put(r11, r3)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeDrawing r0 = r12.drawing
                r3 = 0
                r0.setPivotX(r3)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeDrawing r0 = r12.drawing
                r0.setPivotY(r3)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeDrawing r0 = r12.drawing
                r0.setScaleX(r2)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeDrawing r0 = r12.drawing
                r0.setScaleY(r2)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeDrawing r0 = r12.drawing
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r2 = r12.this$0
                float r2 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$units(r2, r9)
                r0.setTranslationX(r2)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeDrawing r0 = r12.drawing
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r2 = r12.this$0
                float r2 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$units(r2, r10)
                r0.setTranslationY(r2)
                r0 = 100
                float r0 = (float) r0
                float r1 = r1 * r0
                int r0 = kotlin.math.MathKt.roundToInt(r1)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r1 = r12.this$0
                android.widget.TextView r1 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getZoomLabel$p(r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.StringBuilder r2 = r2.append(r0)
                java.lang.String r3 = "%"
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                r1.setText(r2)
                com.lumina.monsterhunterfieldbook.WeaponTreePanel r1 = r12.this$0
                android.widget.TextView r1 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getZoomLabel$p(r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Tree zoom, "
                r2.<init>(r3)
                java.lang.StringBuilder r0 = r2.append(r0)
                java.lang.String r2 = " percent"
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r1.setContentDescription(r0)
                r12.invalidate()
                return
        }
    }

    /* renamed from: $r8$lambda$2FKZx-uN19MMgd5om7pVtjb-Dt8, reason: not valid java name */
    public static /* synthetic */ void m71$r8$lambda$2FKZxuN19MMgd5om7pVtjbDt8(int r0, com.lumina.monsterhunterfieldbook.WeaponTreePanel r1) {
            hideMaterials$lambda$0(r0, r1)
            return
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IXh0o89ZEO_BXJamQZ4HjwEXH4E(com.lumina.monsterhunterfieldbook.WeaponTreePanel r0, java.lang.String r1) {
            kotlin.Unit r0 = showMaterials$lambda$7(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UJBQ9m30yRe8rzBnmPdcP9Y5fX4(com.lumina.monsterhunterfieldbook.WeaponTreePanel r0, java.lang.String r1) {
            kotlin.Unit r0 = showMaterials$lambda$6(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YLzCJqviICWfl2ontlolzgTybXc(com.lumina.monsterhunterfieldbook.WeaponTreePanel r0) {
            kotlin.Unit r0 = _init_$lambda$1(r0)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$aFs1Kq3lH9P8iHWtL1euyKPfOjc(com.lumina.monsterhunterfieldbook.WeaponTreePanel r0) {
            resetViewport$lambda$0(r0)
            return
    }

    /* renamed from: $r8$lambda$zZQ1v96vorkrfVkW-3bt77q4kVs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m72$r8$lambda$zZQ1v96vorkrfVkW3bt77q4kVs(com.lumina.monsterhunterfieldbook.WeaponTreePanel r0) {
            kotlin.Unit r0 = showMaterials$lambda$3(r0)
            return r0
    }

    public WeaponTreePanel(com.lumina.monsterhunterfieldbook.MainActivity r21, java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r22, org.json.JSONObject r23, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r24) {
            r20 = this;
            r0 = r20
            r1 = r21
            r8 = r22
            r9 = r23
            r2 = r24
            java.lang.String r3 = "a"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "records"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r3)
            java.lang.String r3 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r3)
            java.lang.String r3 = "onInfo"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            r3 = r1
            android.content.Context r3 = (android.content.Context) r3
            r0.<init>(r3)
            r0.a = r1
            r0.records = r8
            r0.state = r9
            r0.onInfo = r2
            android.content.res.Resources r2 = r0.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r0.density = r2
            android.content.res.Resources r2 = r0.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.screenWidthDp
            r3 = 780(0x30c, float:1.093E-42)
            r10 = 1
            r11 = 0
            if (r2 > r3) goto L4a
            r12 = r10
            goto L4b
        L4a:
            r12 = r11
        L4b:
            r0.compact = r12
            android.widget.FrameLayout r13 = new android.widget.FrameLayout
            r2 = r1
            android.content.Context r2 = (android.content.Context) r2
            r13.<init>(r2)
            r0.shell = r13
            android.widget.Spinner r14 = new android.widget.Spinner
            r2 = r1
            android.content.Context r2 = (android.content.Context) r2
            r14.<init>(r2, r10)
            r0.familySelector = r14
            if (r12 == 0) goto L66
            r2 = 1093664768(0x41300000, float:11.0)
            goto L68
        L66:
            r2 = 1094713344(0x41400000, float:12.0)
        L68:
            r3 = r2
            int r5 = r1.getMuted()
            r6 = 4
            r7 = 0
            java.lang.String r2 = "100%"
            r4 = 0
            android.widget.TextView r7 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r1, r2, r3, r4, r5, r6, r7)
            r0.zoomLabel = r7
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$MaterialHost r15 = new com.lumina.monsterhunterfieldbook.WeaponTreePanel$MaterialHost
            r15.<init>(r0)
            r0.materialHost = r15
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout r2 = com.lumina.monsterhunterfieldbook.WeaponTreeLayout.INSTANCE
            java.lang.String r3 = "family"
            java.lang.String r4 = "default"
            java.lang.String r3 = r9.optString(r3, r4)
            java.lang.String r4 = "optString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.String r5 = "selected"
            java.lang.String r5 = r9.optString(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r2 = r2.build(r8, r3, r5)
            r0.graph = r2
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeViewport r8 = new com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeViewport
            r8.<init>(r0)
            r0.viewport = r8
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Map r2 = (java.util.Map) r2
            r0.pendingIcons = r2
            r0.setOrientation(r10)
            r2 = r13
            android.view.View r2 = (android.view.View) r2
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
            r0.addView(r2, r3)
            android.widget.LinearLayout r2 = r1.column()
            r3 = r2
            android.view.View r3 = (android.view.View) r3
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r5.<init>(r4, r4)
            android.view.ViewGroup$LayoutParams r5 = (android.view.ViewGroup.LayoutParams) r5
            r13.addView(r3, r5)
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$toolbar$1 r3 = new com.lumina.monsterhunterfieldbook.WeaponTreePanel$toolbar$1
            r3.<init>(r0, r1)
            r5 = 58
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r1.dp(r5)
            r3.setMinimumHeight(r5)
            r16 = 12
            if (r12 == 0) goto Lea
            r6 = 8
            goto Lec
        Lea:
            r6 = r16
        Lec:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r1.dp(r6)
            r17 = 9
            if (r12 == 0) goto Lfd
            r18 = 8
            goto Lff
        Lfd:
            r18 = r17
        Lff:
            java.lang.Integer r18 = java.lang.Integer.valueOf(r18)
            r4 = r18
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r1.dp(r4)
            if (r12 == 0) goto L110
            r18 = 8
            goto L112
        L110:
            r18 = r16
        L112:
            java.lang.Integer r18 = java.lang.Integer.valueOf(r18)
            r5 = r18
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r1.dp(r5)
            if (r12 == 0) goto L123
            r18 = 8
            goto L125
        L123:
            r18 = r17
        L125:
            java.lang.Integer r18 = java.lang.Integer.valueOf(r18)
            r10 = r18
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r1.dp(r10)
            r3.setPadding(r6, r4, r5, r10)
            java.lang.String r4 = "Weapon family"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r14.setContentDescription(r4)
            r5 = 7
            r6 = 0
            r4 = r2
            r2 = 0
            r10 = r3
            r3 = 0
            r18 = r4
            r4 = 0
            r19 = r10
            r10 = r18
            android.graphics.drawable.GradientDrawable r2 = com.lumina.monsterhunterfieldbook.MainActivity.surface$default(r1, r2, r3, r4, r5, r6)
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            r14.setBackground(r2)
            android.view.View r14 = (android.view.View) r14
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = 40
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r1.dp(r4)
            r2.<init>(r11, r4)
            android.view.ViewGroup$LayoutParams r2 = (android.view.ViewGroup.LayoutParams) r2
            r4 = r19
            r4.addView(r14, r2)
            android.view.View r2 = new android.view.View
            r5 = r1
            android.content.Context r5 = (android.content.Context) r5
            r2.<init>(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r6 = 1065353216(0x3f800000, float:1.0)
            r14 = 1
            r5.<init>(r11, r14, r6)
            android.view.ViewGroup$LayoutParams r5 = (android.view.ViewGroup.LayoutParams) r5
            r4.addView(r2, r5)
            r2 = 17
            r7.setGravity(r2)
            java.lang.String r2 = "Tree zoom, 100 percent"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r7.setContentDescription(r2)
            android.view.View r7 = (android.view.View) r7
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r1.dp(r5)
            r14 = -2
            r2.<init>(r14, r5)
            if (r12 == 0) goto L1a3
            r5 = r17
            goto L1a5
        L1a3:
            r5 = r16
        L1a5:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r1.dp(r5)
            r2.setMarginStart(r5)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            android.view.ViewGroup$LayoutParams r2 = (android.view.ViewGroup.LayoutParams) r2
            r4.addView(r7, r2)
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$$ExternalSyntheticLambda4 r2 = new com.lumina.monsterhunterfieldbook.WeaponTreePanel$$ExternalSyntheticLambda4
            r2.<init>(r0)
            java.lang.String r5 = "Reset"
            android.widget.TextView r2 = r1.button(r5, r2)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r1.dp(r5)
            r2.setMinHeight(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r1.dp(r5)
            r2.setMinimumHeight(r5)
            if (r12 == 0) goto L1e2
            r16 = r17
        L1e2:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r16)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r1.dp(r5)
            r2.setPadding(r5, r11, r11, r11)
            r5 = 0
            r2.setBackground(r5)
            int r5 = r1.getAccent()
            r2.setTextColor(r5)
            java.lang.String r5 = "Reset weapon tree view"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r2.setContentDescription(r5)
            android.view.View r2 = (android.view.View) r2
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r1.dp(r3)
            r5.<init>(r14, r3)
            android.view.ViewGroup$LayoutParams r5 = (android.view.ViewGroup.LayoutParams) r5
            r4.addView(r2, r5)
            r3 = r4
            android.view.View r3 = (android.view.View) r3
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r2.<init>(r4, r14)
            android.view.ViewGroup$LayoutParams r2 = (android.view.ViewGroup.LayoutParams) r2
            r10.addView(r3, r2)
            r1.rule(r10)
            r2 = r8
            android.view.View r2 = (android.view.View) r2
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r4, r11, r6)
            android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
            r10.addView(r2, r3)
            if (r12 == 0) goto L239
            r2 = 6
            goto L23b
        L239:
            r2 = 10
        L23b:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r1 = r1.dp(r2)
            r2 = r15
            android.view.View r2 = (android.view.View) r2
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r5 = 80
            r3.<init>(r4, r14, r5)
            r3.leftMargin = r1
            r3.rightMargin = r1
            r3.bottomMargin = r1
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
            r13.addView(r2, r3)
            r1 = 8
            r15.setVisibility(r1)
            r0.writeGraphState()
            r0.bindFamilies()
            r8.populate()
            java.lang.String r1 = "treeDetails"
            boolean r1 = r9.optBoolean(r1)
            if (r1 == 0) goto L275
            r0.showMaterials(r11)
        L275:
            return
    }

    private static final kotlin.Unit _init_$lambda$1(com.lumina.monsterhunterfieldbook.WeaponTreePanel r0) {
            r0.resetViewport()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    public static final /* synthetic */ com.lumina.monsterhunterfieldbook.MainActivity access$getA$p(com.lumina.monsterhunterfieldbook.WeaponTreePanel r0) {
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r0.a
            return r0
    }

    public static final /* synthetic */ boolean access$getCompact$p(com.lumina.monsterhunterfieldbook.WeaponTreePanel r0) {
            boolean r0 = r0.compact
            return r0
    }

    public static final /* synthetic */ float access$getDensity$p(com.lumina.monsterhunterfieldbook.WeaponTreePanel r0) {
            float r0 = r0.density
            return r0
    }

    public static final /* synthetic */ android.widget.Spinner access$getFamilySelector$p(com.lumina.monsterhunterfieldbook.WeaponTreePanel r0) {
            android.widget.Spinner r0 = r0.familySelector
            return r0
    }

    public static final /* synthetic */ com.lumina.monsterhunterfieldbook.WeaponTreeLayout.Graph access$getGraph$p(com.lumina.monsterhunterfieldbook.WeaponTreePanel r0) {
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r0 = r0.graph
            return r0
    }

    public static final /* synthetic */ com.lumina.monsterhunterfieldbook.WeaponTreePanel.MaterialHost access$getMaterialHost$p(com.lumina.monsterhunterfieldbook.WeaponTreePanel r0) {
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$MaterialHost r0 = r0.materialHost
            return r0
    }

    public static final /* synthetic */ java.util.Map access$getPendingIcons$p(com.lumina.monsterhunterfieldbook.WeaponTreePanel r0) {
            java.util.Map<java.lang.String, java.util.List<android.widget.ImageView>> r0 = r0.pendingIcons
            return r0
    }

    public static final /* synthetic */ java.util.List access$getRecords$p(com.lumina.monsterhunterfieldbook.WeaponTreePanel r0) {
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r0 = r0.records
            return r0
    }

    public static final /* synthetic */ boolean access$getSelectorReady$p(com.lumina.monsterhunterfieldbook.WeaponTreePanel r0) {
            boolean r0 = r0.selectorReady
            return r0
    }

    public static final /* synthetic */ android.widget.FrameLayout access$getShell$p(com.lumina.monsterhunterfieldbook.WeaponTreePanel r0) {
            android.widget.FrameLayout r0 = r0.shell
            return r0
    }

    public static final /* synthetic */ com.lumina.monsterhunterfieldbook.WeaponTreePanel.TreeViewport access$getViewport$p(com.lumina.monsterhunterfieldbook.WeaponTreePanel r0) {
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeViewport r0 = r0.viewport
            return r0
    }

    public static final /* synthetic */ android.widget.TextView access$getZoomLabel$p(com.lumina.monsterhunterfieldbook.WeaponTreePanel r0) {
            android.widget.TextView r0 = r0.zoomLabel
            return r0
    }

    public static final /* synthetic */ void access$hideMaterials(com.lumina.monsterhunterfieldbook.WeaponTreePanel r0, boolean r1) {
            r0.hideMaterials(r1)
            return
    }

    public static final /* synthetic */ void access$select(com.lumina.monsterhunterfieldbook.WeaponTreePanel r0, com.lumina.monsterhunterfieldbook.FieldRecord r1) {
            r0.select(r1)
            return
    }

    public static final /* synthetic */ java.lang.String access$selectedId(com.lumina.monsterhunterfieldbook.WeaponTreePanel r0) {
            java.lang.String r0 = r0.selectedId()
            return r0
    }

    public static final /* synthetic */ void access$setGraph$p(com.lumina.monsterhunterfieldbook.WeaponTreePanel r0, com.lumina.monsterhunterfieldbook.WeaponTreeLayout.Graph r1) {
            r0.graph = r1
            return
    }

    public static final /* synthetic */ void access$setSelectorReady$p(com.lumina.monsterhunterfieldbook.WeaponTreePanel r0, boolean r1) {
            r0.selectorReady = r1
            return
    }

    public static final /* synthetic */ org.json.JSONObject access$treeState(com.lumina.monsterhunterfieldbook.WeaponTreePanel r0) {
            org.json.JSONObject r0 = r0.treeState()
            return r0
    }

    public static final /* synthetic */ float access$units(com.lumina.monsterhunterfieldbook.WeaponTreePanel r0, float r1) {
            float r0 = r0.units(r1)
            return r0
    }

    public static final /* synthetic */ void access$writeGraphState(com.lumina.monsterhunterfieldbook.WeaponTreePanel r0) {
            r0.writeGraphState()
            return
    }

    private final void bindFamilies() {
            r7 = this;
            java.lang.String r0 = "All"
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r1 = r7.graph
            java.util.List r1 = r1.getRoots()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r3)
            r2.<init>(r4)
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r1 = r1.iterator()
        L21:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L64
            java.lang.Object r4 = r1.next()
            com.lumina.monsterhunterfieldbook.FieldRecord r4 = (com.lumina.monsterhunterfieldbook.FieldRecord) r4
            com.lumina.monsterhunterfieldbook.WeaponModel r5 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            org.json.JSONObject r5 = r5.data(r4)
            java.lang.String r6 = "family"
            java.lang.String r5 = r5.optString(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            r6 = r5
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = kotlin.text.StringsKt.isBlank(r6)
            java.lang.String r4 = r4.getName()
            if (r6 != 0) goto L60
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r6 = " · "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
        L60:
            r2.add(r4)
            goto L21
        L64:
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r0 = kotlin.collections.CollectionsKt.plus(r0, r2)
            java.lang.String r1 = "all"
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
            java.util.Collection r1 = (java.util.Collection) r1
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r2 = r7.graph
            java.util.List r2 = r2.getRoots()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r3)
            r4.<init>(r3)
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r2 = r2.iterator()
        L8b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La1
            java.lang.Object r3 = r2.next()
            com.lumina.monsterhunterfieldbook.FieldRecord r3 = (com.lumina.monsterhunterfieldbook.FieldRecord) r3
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout r5 = com.lumina.monsterhunterfieldbook.WeaponTreeLayout.INSTANCE
            java.lang.String r3 = r5.rawId(r3)
            r4.add(r3)
            goto L8b
        La1:
            java.util.List r4 = (java.util.List) r4
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r1 = kotlin.collections.CollectionsKt.plus(r1, r4)
            android.widget.Spinner r2 = r7.familySelector
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r7.a
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$bindFamilies$1 r4 = new com.lumina.monsterhunterfieldbook.WeaponTreePanel$bindFamilies$1
            r4.<init>(r0, r7, r3)
            android.widget.SpinnerAdapter r4 = (android.widget.SpinnerAdapter) r4
            r2.setAdapter(r4)
            android.widget.Spinner r0 = r7.familySelector
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r2 = r7.graph
            java.lang.String r2 = r2.getFamily()
            int r2 = r1.indexOf(r2)
            r3 = 0
            int r2 = kotlin.ranges.RangesKt.coerceAtLeast(r2, r3)
            r0.setSelection(r2, r3)
            android.widget.Spinner r0 = r7.familySelector
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$bindFamilies$2 r2 = new com.lumina.monsterhunterfieldbook.WeaponTreePanel$bindFamilies$2
            r2.<init>(r7, r1)
            android.widget.AdapterView$OnItemSelectedListener r2 = (android.widget.AdapterView.OnItemSelectedListener) r2
            r0.setOnItemSelectedListener(r2)
            return
    }

    private final void hideMaterials(boolean r8) {
            r7 = this;
            int r0 = r7.materialVersion
            int r0 = r0 + 1
            r7.materialVersion = r0
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$MaterialHost r1 = r7.materialHost
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r1.cancel()
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$MaterialHost r1 = r7.materialHost
            int r1 = r1.getVisibility()
            if (r1 == 0) goto L18
            return
        L18:
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$MaterialHost r1 = r7.materialHost
            r2 = 0
            r1.setEnabled(r2)
            if (r8 == 0) goto L5c
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r7.a
            r1 = 140(0x8c, double:6.9E-322)
            long r3 = r8.motionDuration(r1)
            r5 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L2f
            goto L5c
        L2f:
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$MaterialHost r8 = r7.materialHost
            android.view.ViewPropertyAnimator r8 = r8.animate()
            r3 = 0
            android.view.ViewPropertyAnimator r8 = r8.alpha(r3)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r7.a
            long r1 = r3.motionDuration(r1)
            android.view.ViewPropertyAnimator r8 = r8.setDuration(r1)
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r1.<init>()
            android.animation.TimeInterpolator r1 = (android.animation.TimeInterpolator) r1
            android.view.ViewPropertyAnimator r8 = r8.setInterpolator(r1)
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$$ExternalSyntheticLambda5 r1 = new com.lumina.monsterhunterfieldbook.WeaponTreePanel$$ExternalSyntheticLambda5
            r1.<init>(r0, r7)
            android.view.ViewPropertyAnimator r8 = r8.withEndAction(r1)
            r8.start()
            return
        L5c:
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$MaterialHost r8 = r7.materialHost
            r0 = 8
            r8.setVisibility(r0)
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$MaterialHost r8 = r7.materialHost
            r0 = 1065353216(0x3f800000, float:1.0)
            r8.setAlpha(r0)
            return
    }

    private static final void hideMaterials$lambda$0(int r1, com.lumina.monsterhunterfieldbook.WeaponTreePanel r2) {
            int r0 = r2.materialVersion
            if (r1 != r0) goto L12
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$MaterialHost r1 = r2.materialHost
            r0 = 8
            r1.setVisibility(r0)
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$MaterialHost r1 = r2.materialHost
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r2)
        L12:
            return
    }

    private static final void resetViewport$lambda$0(com.lumina.monsterhunterfieldbook.WeaponTreePanel r1) {
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeViewport r0 = r1.viewport
            int r0 = r0.getWidth()
            if (r0 <= 0) goto L13
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeViewport r0 = r1.viewport
            int r0 = r0.getHeight()
            if (r0 <= 0) goto L13
            r1.resetViewport()
        L13:
            return
    }

    private final void select(com.lumina.monsterhunterfieldbook.FieldRecord r3) {
            r2 = this;
            org.json.JSONObject r0 = r2.state
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout r1 = com.lumina.monsterhunterfieldbook.WeaponTreeLayout.INSTANCE
            java.lang.String r3 = r1.rawId(r3)
            java.lang.String r1 = "selected"
            org.json.JSONObject r3 = r0.put(r1, r3)
            java.lang.String r0 = "treeDetails"
            r1 = 1
            r3.put(r0, r1)
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeViewport r3 = r2.viewport
            r3.updateSelection()
            r2.showMaterials(r1)
            return
    }

    private final java.lang.String selectedId() {
            r2 = this;
            org.json.JSONObject r0 = r2.state
            java.lang.String r1 = "selected"
            java.lang.String r0 = r0.optString(r1)
            java.lang.String r1 = "null"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r1 == 0) goto L12
            java.lang.String r0 = ""
        L12:
            java.lang.String r1 = "let(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private final void showMaterials(boolean r20) {
            r19 = this;
            r0 = r19
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r1 = r0.graph
            java.util.List r1 = r1.getRecords()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()
            r3 = r2
            com.lumina.monsterhunterfieldbook.FieldRecord r3 = (com.lumina.monsterhunterfieldbook.FieldRecord) r3
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout r4 = com.lumina.monsterhunterfieldbook.WeaponTreeLayout.INSTANCE
            java.lang.String r3 = r4.rawId(r3)
            java.lang.String r4 = r0.selectedId()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 == 0) goto Le
            goto L2d
        L2c:
            r2 = 0
        L2d:
            r5 = r2
            com.lumina.monsterhunterfieldbook.FieldRecord r5 = (com.lumina.monsterhunterfieldbook.FieldRecord) r5
            if (r5 != 0) goto L33
            return
        L33:
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$MaterialHost r1 = r0.materialHost
            int r1 = r1.getVisibility()
            r2 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 1
            if (r1 != 0) goto L4c
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$MaterialHost r1 = r0.materialHost
            float r1 = r1.getAlpha()
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 >= 0) goto L4a
            goto L4c
        L4a:
            r1 = r2
            goto L4d
        L4c:
            r1 = r11
        L4d:
            int r3 = r0.materialVersion
            int r3 = r3 + r11
            r0.materialVersion = r3
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$MaterialHost r3 = r0.materialHost
            android.view.ViewPropertyAnimator r3 = r3.animate()
            r3.cancel()
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$MaterialHost r3 = r0.materialHost
            r3.removeAllViews()
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            android.widget.LinearLayout r3 = r3.row()
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            r6 = 16
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.Number r7 = (java.lang.Number) r7
            int r4 = r4.dp(r7)
            com.lumina.monsterhunterfieldbook.MainActivity r7 = r0.a
            r8 = 13
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            java.lang.Number r9 = (java.lang.Number) r9
            int r7 = r7.dp(r9)
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r0.a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r9.dp(r6)
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r0.a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r9.dp(r8)
            r3.setPadding(r4, r7, r6, r8)
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r0.a
            java.lang.String r13 = r5.getName()
            boolean r4 = r0.compact
            if (r4 == 0) goto Laa
            r4 = 1099431936(0x41880000, float:17.0)
            goto Lac
        Laa:
            r4 = 1099956224(0x41900000, float:18.0)
        Lac:
            r14 = r4
            r17 = 8
            r18 = 0
            r15 = 1
            r16 = 0
            android.widget.TextView r4 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r12, r13, r14, r15, r16, r17, r18)
            r6 = 1069547520(0x3fc00000, float:1.5)
            r12 = 0
            r4.setLineSpacing(r12, r6)
            android.view.View r4 = (android.view.View) r4
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r13 = -2
            r6.<init>(r2, r13, r10)
            android.view.ViewGroup$LayoutParams r6 = (android.view.ViewGroup.LayoutParams) r6
            r3.addView(r4, r6)
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$$ExternalSyntheticLambda1 r6 = new com.lumina.monsterhunterfieldbook.WeaponTreePanel$$ExternalSyntheticLambda1
            r6.<init>(r0)
            java.lang.String r7 = "close"
            java.lang.String r8 = "Close weapon materials"
            android.widget.FrameLayout r4 = r4.iconButton(r7, r8, r6)
            android.view.View r4 = (android.view.View) r4
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r7 = r0.a
            r8 = 36
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            java.lang.Number r9 = (java.lang.Number) r9
            int r7 = r7.dp(r9)
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r0.a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r9.dp(r8)
            r6.<init>(r7, r8)
            com.lumina.monsterhunterfieldbook.MainActivity r7 = r0.a
            r8 = 10
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Number r8 = (java.lang.Number) r8
            int r7 = r7.dp(r8)
            r6.setMarginStart(r7)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            android.view.ViewGroup$LayoutParams r6 = (android.view.ViewGroup.LayoutParams) r6
            r3.addView(r4, r6)
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$MaterialHost r4 = r0.materialHost
            android.view.View r3 = (android.view.View) r3
            r4.addView(r3)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$MaterialHost r4 = r0.materialHost
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r3.rule(r4)
            android.widget.ScrollView r14 = new android.widget.ScrollView
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            android.content.Context r3 = (android.content.Context) r3
            r14.<init>(r3)
            r14.setFillViewport(r2)
            r14.setOverScrollMode(r11)
            com.lumina.monsterhunterfieldbook.WeaponMaterialsView r3 = new com.lumina.monsterhunterfieldbook.WeaponMaterialsView
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            org.json.JSONObject r6 = r0.state
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$$ExternalSyntheticLambda2 r8 = new com.lumina.monsterhunterfieldbook.WeaponTreePanel$$ExternalSyntheticLambda2
            r8.<init>(r0)
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$$ExternalSyntheticLambda3 r9 = new com.lumina.monsterhunterfieldbook.WeaponTreePanel$$ExternalSyntheticLambda3
            r9.<init>(r0)
            r7 = 1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            boolean r5 = r0.compact
            if (r5 == 0) goto L14f
            r5 = 14
            goto L151
        L14f:
            r5 = 18
        L151:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r4 = r4.dp(r5)
            r3.setPadding(r4, r4, r4, r4)
            android.view.View r3 = (android.view.View) r3
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r5 = -1
            r4.<init>(r5, r13)
            android.view.ViewGroup$LayoutParams r4 = (android.view.ViewGroup.LayoutParams) r4
            r14.addView(r3, r4)
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$MaterialHost r3 = r0.materialHost
            android.view.View r14 = (android.view.View) r14
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r5, r13)
            android.view.ViewGroup$LayoutParams r4 = (android.view.ViewGroup.LayoutParams) r4
            r3.addView(r14, r4)
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$MaterialHost r3 = r0.materialHost
            r3.setVisibility(r2)
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$MaterialHost r2 = r0.materialHost
            r2.setEnabled(r11)
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$MaterialHost r2 = r0.materialHost
            r2.setAlpha(r10)
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$MaterialHost r2 = r0.materialHost
            r2.setTranslationY(r12)
            if (r1 == 0) goto L1d5
            if (r20 == 0) goto L1d5
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            r2 = 170(0xaa, double:8.4E-322)
            long r4 = r1.motionDuration(r2)
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L1d5
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$MaterialHost r1 = r0.materialHost
            r1.setAlpha(r12)
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$MaterialHost r1 = r0.materialHost
            r4 = 1084227584(0x40a00000, float:5.0)
            float r4 = r0.units(r4)
            r1.setTranslationY(r4)
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$MaterialHost r1 = r0.materialHost
            android.view.ViewPropertyAnimator r1 = r1.animate()
            android.view.ViewPropertyAnimator r1 = r1.alpha(r10)
            android.view.ViewPropertyAnimator r1 = r1.translationY(r12)
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            long r2 = r4.motionDuration(r2)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r2)
            android.view.animation.DecelerateInterpolator r2 = new android.view.animation.DecelerateInterpolator
            r2.<init>()
            android.animation.TimeInterpolator r2 = (android.animation.TimeInterpolator) r2
            android.view.ViewPropertyAnimator r1 = r1.setInterpolator(r2)
            r1.start()
        L1d5:
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$MaterialHost r1 = r0.materialHost
            r1.requestLayout()
            return
    }

    private static final kotlin.Unit showMaterials$lambda$3(com.lumina.monsterhunterfieldbook.WeaponTreePanel r0) {
            r0.closeMaterials()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    private static final kotlin.Unit showMaterials$lambda$6(com.lumina.monsterhunterfieldbook.WeaponTreePanel r4, java.lang.String r5) {
            java.lang.String r0 = "parentId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r0 = r4.graph
            java.util.List r0 = r0.getRecords()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            r2 = r1
            com.lumina.monsterhunterfieldbook.FieldRecord r2 = (com.lumina.monsterhunterfieldbook.FieldRecord) r2
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout r3 = com.lumina.monsterhunterfieldbook.WeaponTreeLayout.INSTANCE
            java.lang.String r2 = r3.rawId(r2)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r5)
            if (r2 == 0) goto L11
            goto L2c
        L2b:
            r1 = 0
        L2c:
            com.lumina.monsterhunterfieldbook.FieldRecord r1 = (com.lumina.monsterhunterfieldbook.FieldRecord) r1
            if (r1 == 0) goto L33
            r4.select(r1)
        L33:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
    }

    private static final kotlin.Unit showMaterials$lambda$7(com.lumina.monsterhunterfieldbook.WeaponTreePanel r1, java.lang.String r2) {
            java.lang.String r0 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r1 = r1.onInfo
            r1.invoke(r2)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    private final org.json.JSONObject treeState() {
            r4 = this;
            org.json.JSONObject r0 = r4.state
            java.lang.String r1 = "tree"
            org.json.JSONObject r0 = r0.optJSONObject(r1)
            if (r0 != 0) goto L2e
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r2 = "zoom"
            r3 = 1
            org.json.JSONObject r0 = r0.put(r2, r3)
            java.lang.String r2 = "x"
            r3 = 16
            org.json.JSONObject r0 = r0.put(r2, r3)
            java.lang.String r2 = "y"
            org.json.JSONObject r0 = r0.put(r2, r3)
            org.json.JSONObject r2 = r4.state
            r2.put(r1, r0)
            java.lang.String r1 = "also(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
        L2e:
            return r0
    }

    private final float units(float r2) {
            r1 = this;
            float r0 = r1.density
            float r2 = r2 * r0
            return r2
    }

    private final void writeGraphState() {
            r4 = this;
            org.json.JSONObject r0 = r4.state
            java.lang.String r1 = "default"
            java.lang.String r2 = "family"
            java.lang.String r0 = r0.optString(r2, r1)
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r1 = r4.graph
            java.lang.String r1 = r1.getFamily()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L1e
            org.json.JSONObject r0 = r4.state
            java.lang.String r1 = "treeInitialized"
            r3 = 0
            r0.put(r1, r3)
        L1e:
            org.json.JSONObject r0 = r4.state
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r1 = r4.graph
            java.lang.String r1 = r1.getFamily()
            r0.put(r2, r1)
            org.json.JSONObject r0 = r4.state
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r1 = r4.graph
            java.lang.String r1 = r1.getSelected()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 != 0) goto L3c
            java.lang.Object r1 = org.json.JSONObject.NULL
            goto L42
        L3c:
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r1 = r4.graph
            java.lang.String r1 = r1.getSelected()
        L42:
            java.lang.String r2 = "selected"
            r0.put(r2, r1)
            return
    }

    public final boolean closeMaterials() {
            r3 = this;
            org.json.JSONObject r0 = r3.state
            java.lang.String r1 = "treeDetails"
            boolean r0 = r0.optBoolean(r1)
            r2 = 0
            if (r0 != 0) goto Lc
            return r2
        Lc:
            org.json.JSONObject r0 = r3.state
            r0.put(r1, r2)
            r0 = 1
            r3.hideMaterials(r0)
            return r0
    }

    public final org.json.JSONObject getState() {
            r1 = this;
            org.json.JSONObject r0 = r1.state
            return r0
    }

    public final float logicalZoom() {
            r4 = this;
            org.json.JSONObject r0 = r4.treeState()
            java.lang.String r1 = "zoom"
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0.optDouble(r1, r2)
            float r0 = (float) r0
            return r0
    }

    public final void resetViewport() {
            r6 = this;
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeViewport r0 = r6.viewport
            int r0 = r0.getWidth()
            if (r0 == 0) goto L61
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeViewport r0 = r6.viewport
            int r0 = r0.getHeight()
            if (r0 != 0) goto L11
            goto L61
        L11:
            org.json.JSONObject r0 = r6.state
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "zoom"
            r3 = 1
            org.json.JSONObject r1 = r1.put(r2, r3)
            java.lang.String r2 = "x"
            r4 = 16
            org.json.JSONObject r1 = r1.put(r2, r4)
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeViewport r2 = r6.viewport
            int r2 = r2.getHeight()
            float r2 = (float) r2
            float r4 = r6.density
            float r2 = r2 / r4
            r4 = 1051931443(0x3eb33333, float:0.35)
            float r2 = r2 * r4
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r4 = r6.graph
            float r4 = r4.getRootY()
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 * r5
            float r2 = r2 - r4
            r4 = 1098907648(0x41800000, float:16.0)
            float r2 = java.lang.Math.min(r4, r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.String r4 = "y"
            org.json.JSONObject r1 = r1.put(r4, r2)
            java.lang.String r2 = "tree"
            r0.put(r2, r1)
            org.json.JSONObject r0 = r6.state
            java.lang.String r1 = "treeInitialized"
            r0.put(r1, r3)
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeViewport r0 = r6.viewport
            r0.updateTransform()
            return
        L61:
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeViewport r0 = r6.viewport
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$$ExternalSyntheticLambda0 r1 = new com.lumina.monsterhunterfieldbook.WeaponTreePanel$$ExternalSyntheticLambda0
            r1.<init>(r6)
            r0.post(r1)
            return
    }

    public final org.json.JSONObject snapshot() {
            r1 = this;
            org.json.JSONObject r0 = r1.state
            return r0
    }
}
