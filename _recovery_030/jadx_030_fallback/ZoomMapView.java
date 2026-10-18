package com.lumina.monsterhunterfieldbook;

/* compiled from: MapPanel.kt */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010+\u001a\u00020\u001aJ\u000e\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020 J\u000e\u0010.\u001a\n 0*\u0004\u0018\u00010/0/J\u000e\u00101\u001a\u00020\u001a2\u0006\u00102\u001a\u00020/J(\u00103\u001a\u00020\u001a2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u0002052\u0006\u00108\u001a\u000205H\u0014J\b\u00109\u001a\u00020\u001aH\u0002J\u0010\u0010:\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020<H\u0014J\u0010\u0010=\u001a\u00020\u00102\u0006\u0010>\u001a\u00020?H\u0016J\b\u0010@\u001a\u00020\u0010H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/ZoomMapView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "base", "Landroid/graphics/Bitmap;", "getBase", "()Landroid/graphics/Bitmap;", "setBase", "(Landroid/graphics/Bitmap;)V", "overlay", "getOverlay", "setOverlay", "showBase", "", "getShowBase", "()Z", "setShowBase", "(Z)V", "showOverlay", "getShowOverlay", "setShowOverlay", "onChange", "Lkotlin/Function0;", "", "getOnChange", "()Lkotlin/jvm/functions/Function0;", "setOnChange", "(Lkotlin/jvm/functions/Function0;)V", "scale", "", "x", "y", "lastX", "lastY", "paint", "Landroid/graphics/Paint;", "pinch", "Landroid/view/ScaleGestureDetector;", "gestures", "Landroid/view/GestureDetector;", "reset", "zoom", "factor", "snapshot", "Lorg/json/JSONObject;", "kotlin.jvm.PlatformType", "restore", "saved", "onSizeChanged", "w", "", "h", "oldw", "oldh", "clamp", "onDraw", "c", "Landroid/graphics/Canvas;", "onTouchEvent", "e", "Landroid/view/MotionEvent;", "performClick", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ZoomMapView extends android.view.View {
    private android.graphics.Bitmap base;
    private final android.view.GestureDetector gestures;
    private float lastX;
    private float lastY;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onChange;
    private android.graphics.Bitmap overlay;
    private final android.graphics.Paint paint;
    private final android.view.ScaleGestureDetector pinch;
    private float scale;
    private boolean showBase;
    private boolean showOverlay;
    private float x;
    private float y;

    /* renamed from: $r8$lambda$AK5eYPbh7dBK91-ulh4pMy0o17Y, reason: not valid java name */
    public static /* synthetic */ void m74$r8$lambda$AK5eYPbh7dBK91ulh4pMy0o17Y(com.lumina.monsterhunterfieldbook.ZoomMapView r0, org.json.JSONObject r1) {
            restore$lambda$0(r0, r1)
            return
    }

    public ZoomMapView(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r3.<init>(r4)
            r0 = 1
            r3.showBase = r0
            r3.showOverlay = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.scale = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r2 = 3
            r1.<init>(r2)
            r3.paint = r1
            android.view.ScaleGestureDetector r1 = new android.view.ScaleGestureDetector
            com.lumina.monsterhunterfieldbook.ZoomMapView$pinch$1 r2 = new com.lumina.monsterhunterfieldbook.ZoomMapView$pinch$1
            r2.<init>(r3)
            android.view.ScaleGestureDetector$OnScaleGestureListener r2 = (android.view.ScaleGestureDetector.OnScaleGestureListener) r2
            r1.<init>(r4, r2)
            r3.pinch = r1
            android.view.GestureDetector r1 = new android.view.GestureDetector
            com.lumina.monsterhunterfieldbook.ZoomMapView$gestures$1 r2 = new com.lumina.monsterhunterfieldbook.ZoomMapView$gestures$1
            r2.<init>(r3)
            android.view.GestureDetector$OnGestureListener r2 = (android.view.GestureDetector.OnGestureListener) r2
            r1.<init>(r4, r2)
            r3.gestures = r1
            r3.setFocusable(r0)
            r3.setClickable(r0)
            r4 = 20
            r0 = 24
            r1 = 15
            int r4 = android.graphics.Color.rgb(r1, r4, r0)
            r3.setBackgroundColor(r4)
            return
    }

    public static final /* synthetic */ void access$clamp(com.lumina.monsterhunterfieldbook.ZoomMapView r0) {
            r0.clamp()
            return
    }

    public static final /* synthetic */ float access$getScale$p(com.lumina.monsterhunterfieldbook.ZoomMapView r0) {
            float r0 = r0.scale
            return r0
    }

    public static final /* synthetic */ float access$getX$p(com.lumina.monsterhunterfieldbook.ZoomMapView r0) {
            float r0 = r0.x
            return r0
    }

    public static final /* synthetic */ float access$getY$p(com.lumina.monsterhunterfieldbook.ZoomMapView r0) {
            float r0 = r0.y
            return r0
    }

    public static final /* synthetic */ void access$setScale$p(com.lumina.monsterhunterfieldbook.ZoomMapView r0, float r1) {
            r0.scale = r1
            return
    }

    public static final /* synthetic */ void access$setX$p(com.lumina.monsterhunterfieldbook.ZoomMapView r0, float r1) {
            r0.x = r1
            return
    }

    public static final /* synthetic */ void access$setY$p(com.lumina.monsterhunterfieldbook.ZoomMapView r0, float r1) {
            r0.y = r1
            return
    }

    private final void clamp() {
            r6 = this;
            float r0 = r6.x
            int r1 = r6.getWidth()
            int r1 = -r1
            float r1 = (float) r1
            float r2 = r6.scale
            r3 = 1
            float r3 = (float) r3
            float r2 = r2 - r3
            float r1 = r1 * r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r5 = r6.scale
            float r5 = r5 - r3
            float r4 = r4 * r5
            float r4 = r4 / r2
            float r0 = kotlin.ranges.RangesKt.coerceIn(r0, r1, r4)
            r6.x = r0
            float r0 = r6.y
            int r1 = r6.getHeight()
            int r1 = -r1
            float r1 = (float) r1
            float r4 = r6.scale
            float r4 = r4 - r3
            float r1 = r1 * r4
            float r1 = r1 / r2
            int r4 = r6.getHeight()
            float r4 = (float) r4
            float r5 = r6.scale
            float r5 = r5 - r3
            float r4 = r4 * r5
            float r4 = r4 / r2
            float r0 = kotlin.ranges.RangesKt.coerceIn(r0, r1, r4)
            r6.y = r0
            return
    }

    private static final void onDraw$draw(com.lumina.monsterhunterfieldbook.ZoomMapView r6, android.graphics.Canvas r7, android.graphics.Bitmap r8) {
            if (r8 != 0) goto L3
            return
        L3:
            int r0 = r6.getWidth()
            float r0 = (float) r0
            int r1 = r8.getWidth()
            float r1 = (float) r1
            float r0 = r0 / r1
            int r1 = r6.getHeight()
            float r1 = (float) r1
            int r2 = r8.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r0 = java.lang.Math.min(r0, r1)
            int r1 = r8.getWidth()
            float r1 = (float) r1
            float r1 = r1 * r0
            int r2 = r8.getHeight()
            float r2 = (float) r2
            float r2 = r2 * r0
            android.graphics.RectF r0 = new android.graphics.RectF
            float r3 = -r1
            r4 = 2
            float r4 = (float) r4
            float r3 = r3 / r4
            float r5 = -r2
            float r5 = r5 / r4
            float r1 = r1 / r4
            float r2 = r2 / r4
            r0.<init>(r3, r5, r1, r2)
            android.graphics.Paint r6 = r6.paint
            r1 = 0
            r7.drawBitmap(r8, r1, r0, r6)
            return
    }

    private static final void restore$lambda$0(com.lumina.monsterhunterfieldbook.ZoomMapView r5, org.json.JSONObject r6) {
            java.lang.String r0 = "x"
            r1 = 0
            double r3 = r6.optDouble(r0, r1)
            float r0 = (float) r3
            int r3 = r5.getWidth()
            float r3 = (float) r3
            float r0 = r0 * r3
            r5.x = r0
            java.lang.String r0 = "y"
            double r0 = r6.optDouble(r0, r1)
            float r6 = (float) r0
            int r0 = r5.getHeight()
            float r0 = (float) r0
            float r6 = r6 * r0
            r5.y = r6
            r5.clamp()
            r5.invalidate()
            return
    }

    public final android.graphics.Bitmap getBase() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.base
            return r0
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnChange() {
            r1 = this;
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r1.onChange
            return r0
    }

    @Override // android.view.View
    public final android.graphics.Bitmap getOverlay() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.overlay
            return r0
    }

    public final boolean getShowBase() {
            r1 = this;
            boolean r0 = r1.showBase
            return r0
    }

    public final boolean getShowOverlay() {
            r1 = this;
            boolean r0 = r1.showOverlay
            return r0
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r4) {
            r3 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            super.onDraw(r4)
            r4.save()
            int r0 = r3.getWidth()
            float r0 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            float r2 = r3.x
            float r0 = r0 + r2
            int r2 = r3.getHeight()
            float r2 = (float) r2
            float r2 = r2 / r1
            float r1 = r3.y
            float r2 = r2 + r1
            r4.translate(r0, r2)
            float r0 = r3.scale
            r4.scale(r0, r0)
            boolean r0 = r3.showBase
            if (r0 == 0) goto L30
            android.graphics.Bitmap r0 = r3.base
            onDraw$draw(r3, r4, r0)
        L30:
            boolean r0 = r3.showOverlay
            if (r0 == 0) goto L39
            android.graphics.Bitmap r0 = r3.overlay
            onDraw$draw(r3, r4, r0)
        L39:
            r4.restore()
            return
    }

    @Override // android.view.View
    protected void onSizeChanged(int r3, int r4, int r5, int r6) {
            r2 = this;
            if (r5 <= 0) goto La
            float r0 = r2.x
            float r1 = (float) r5
            float r0 = r0 / r1
            float r1 = (float) r3
            float r0 = r0 * r1
            r2.x = r0
        La:
            if (r6 <= 0) goto L14
            float r0 = r2.y
            float r1 = (float) r6
            float r0 = r0 / r1
            float r1 = (float) r4
            float r0 = r0 * r1
            r2.y = r0
        L14:
            r2.clamp()
            super.onSizeChanged(r3, r4, r5, r6)
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            java.lang.String r0 = "e"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            android.view.ScaleGestureDetector r0 = r4.pinch
            r0.onTouchEvent(r5)
            android.view.GestureDetector r0 = r4.gestures
            r0.onTouchEvent(r5)
            int r0 = r5.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L7f
            r2 = 0
            if (r0 == r1) goto L70
            r3 = 2
            if (r0 == r3) goto L37
            r3 = 3
            if (r0 == r3) goto L70
            r3 = 6
            if (r0 == r3) goto L23
            goto L92
        L23:
            int r0 = r5.getActionIndex()
            if (r0 != 0) goto L2a
            r2 = r1
        L2a:
            float r0 = r5.getX(r2)
            r4.lastX = r0
            float r5 = r5.getY(r2)
            r4.lastY = r5
            goto L92
        L37:
            android.view.ScaleGestureDetector r0 = r4.pinch
            boolean r0 = r0.isInProgress()
            if (r0 != 0) goto L63
            int r0 = r5.getPointerCount()
            if (r0 != r1) goto L63
            float r0 = r4.x
            float r2 = r5.getX()
            float r3 = r4.lastX
            float r2 = r2 - r3
            float r0 = r0 + r2
            r4.x = r0
            float r0 = r4.y
            float r2 = r5.getY()
            float r3 = r4.lastY
            float r2 = r2 - r3
            float r0 = r0 + r2
            r4.y = r0
            r4.clamp()
            r4.invalidate()
        L63:
            float r0 = r5.getX()
            r4.lastX = r0
            float r5 = r5.getY()
            r4.lastY = r5
            goto L92
        L70:
            android.view.ViewParent r5 = r4.getParent()
            r5.requestDisallowInterceptTouchEvent(r2)
            kotlin.jvm.functions.Function0<kotlin.Unit> r5 = r4.onChange
            if (r5 == 0) goto L92
            r5.invoke()
            goto L92
        L7f:
            float r0 = r5.getX()
            r4.lastX = r0
            float r5 = r5.getY()
            r4.lastY = r5
            android.view.ViewParent r5 = r4.getParent()
            r5.requestDisallowInterceptTouchEvent(r1)
        L92:
            return r1
    }

    @Override // android.view.View
    public boolean performClick() {
            r1 = this;
            boolean r0 = super.performClick()
            return r0
    }

    public final void reset() {
            r1 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.scale = r0
            r0 = 0
            r1.x = r0
            r1.y = r0
            r1.invalidate()
            return
    }

    public final void restore(org.json.JSONObject r4) {
            r3 = this;
            java.lang.String r0 = "saved"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "scale"
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r4.optDouble(r0, r1)
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 1090519040(0x41000000, float:8.0)
            float r0 = kotlin.ranges.RangesKt.coerceIn(r0, r1, r2)
            r3.scale = r0
            java.lang.String r0 = "base"
            r1 = 1
            boolean r0 = r4.optBoolean(r0, r1)
            r3.showBase = r0
            java.lang.String r0 = "overlay"
            boolean r0 = r4.optBoolean(r0, r1)
            r3.showOverlay = r0
            com.lumina.monsterhunterfieldbook.ZoomMapView$$ExternalSyntheticLambda0 r0 = new com.lumina.monsterhunterfieldbook.ZoomMapView$$ExternalSyntheticLambda0
            r0.<init>(r3, r4)
            r3.post(r0)
            return
    }

    public final void setBase(android.graphics.Bitmap r1) {
            r0 = this;
            r0.base = r1
            return
    }

    public final void setOnChange(kotlin.jvm.functions.Function0<kotlin.Unit> r1) {
            r0 = this;
            r0.onChange = r1
            return
    }

    public final void setOverlay(android.graphics.Bitmap r1) {
            r0 = this;
            r0.overlay = r1
            return
    }

    public final void setShowBase(boolean r1) {
            r0 = this;
            r0.showBase = r1
            return
    }

    public final void setShowOverlay(boolean r1) {
            r0 = this;
            r0.showOverlay = r1
            return
    }

    public final org.json.JSONObject snapshot() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            float r1 = r4.scale
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.String r2 = "scale"
            org.json.JSONObject r0 = r0.put(r2, r1)
            int r1 = r4.getWidth()
            r2 = 0
            if (r1 <= 0) goto L21
            float r1 = r4.x
            int r3 = r4.getWidth()
            float r3 = (float) r3
            float r1 = r1 / r3
            goto L22
        L21:
            r1 = r2
        L22:
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.String r3 = "x"
            org.json.JSONObject r0 = r0.put(r3, r1)
            int r1 = r4.getHeight()
            if (r1 <= 0) goto L3b
            float r1 = r4.y
            int r2 = r4.getHeight()
            float r2 = (float) r2
            float r2 = r1 / r2
        L3b:
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            java.lang.String r2 = "y"
            org.json.JSONObject r0 = r0.put(r2, r1)
            java.lang.String r1 = "base"
            boolean r2 = r4.showBase
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "overlay"
            boolean r2 = r4.showOverlay
            org.json.JSONObject r0 = r0.put(r1, r2)
            return r0
    }

    public final void zoom(float r3) {
            r2 = this;
            float r0 = r2.scale
            float r0 = r0 * r3
            r3 = 1065353216(0x3f800000, float:1.0)
            r1 = 1090519040(0x41000000, float:8.0)
            float r3 = kotlin.ranges.RangesKt.coerceIn(r0, r3, r1)
            r2.scale = r3
            r2.clamp()
            r2.invalidate()
            kotlin.jvm.functions.Function0<kotlin.Unit> r3 = r2.onChange
            if (r3 == 0) goto L1a
            r3.invoke()
        L1a:
            return
    }
}
