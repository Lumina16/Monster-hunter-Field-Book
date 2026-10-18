package com.lumina.monsterhunterfieldbook;

/* compiled from: FieldViews.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001cH\u0016R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006 "}, d2 = {"Lcom/lumina/monsterhunterfieldbook/ColourWheel;", "Landroid/view/View;", "context", "Landroid/content/Context;", "initial", "", "change", "Lkotlin/Function1;", "", "<init>", "(Landroid/content/Context;ILkotlin/jvm/functions/Function1;)V", "getChange", "()Lkotlin/jvm/functions/Function1;", "paint", "Landroid/graphics/Paint;", "hsv", "", "value", "", "brightness", "getBrightness", "()F", "setBrightness", "(F)V", "onDraw", "c", "Landroid/graphics/Canvas;", "onTouchEvent", "", "e", "Landroid/view/MotionEvent;", "performClick", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ColourWheel extends android.view.View {
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> change;
    private final float[] hsv;
    private final android.graphics.Paint paint;

    public ColourWheel(android.content.Context r2, int r3, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r4) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "change"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.<init>(r2)
            r1.change = r4
            android.graphics.Paint r2 = new android.graphics.Paint
            r4 = 1
            r2.<init>(r4)
            r1.paint = r2
            r2 = 3
            float[] r2 = new float[r2]
            android.graphics.Color.colorToHSV(r3, r2)
            r1.hsv = r2
            return
    }

    public final float getBrightness() {
            r2 = this;
            float[] r0 = r2.hsv
            r1 = 2
            r0 = r0[r1]
            return r0
    }

    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getChange() {
            r1 = this;
            kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> r0 = r1.change
            return r0
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r11) {
            r10 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            int r0 = r10.getWidth()
            float r0 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r3 = r0 / r1
            int r0 = r10.getHeight()
            float r0 = (float) r0
            float r4 = r0 / r1
            float r0 = java.lang.Math.min(r3, r4)
            r1 = 12
            float r1 = (float) r1
            float r5 = r0 - r1
            android.graphics.Paint r0 = r10.paint
            android.graphics.SweepGradient r1 = new android.graphics.SweepGradient
            r2 = 7
            int[] r2 = new int[r2]
            r2 = {x00aa: FILL_ARRAY_DATA , data: [-65536, -256, -16711936, -16711681, -16776961, -65281, -65536} // fill-array
            r9 = 0
            r1.<init>(r3, r4, r2, r9)
            android.graphics.Shader r1 = (android.graphics.Shader) r1
            r0.setShader(r1)
            android.graphics.Paint r0 = r10.paint
            r11.drawCircle(r3, r4, r5, r0)
            android.graphics.Paint r0 = r10.paint
            android.graphics.RadialGradient r2 = new android.graphics.RadialGradient
            r7 = 0
            android.graphics.Shader$TileMode r8 = android.graphics.Shader.TileMode.CLAMP
            r6 = -1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            android.graphics.Shader r2 = (android.graphics.Shader) r2
            r0.setShader(r2)
            android.graphics.Paint r0 = r10.paint
            r11.drawCircle(r3, r4, r5, r0)
            android.graphics.Paint r0 = r10.paint
            r0.setShader(r9)
            float[] r0 = r10.hsv
            r1 = 0
            r0 = r0[r1]
            double r0 = (double) r0
            double r0 = java.lang.Math.toRadians(r0)
            double r6 = java.lang.Math.cos(r0)
            float r2 = (float) r6
            float[] r6 = r10.hsv
            r7 = 1
            r6 = r6[r7]
            float r2 = r2 * r6
            float r2 = r2 * r5
            float r3 = r3 + r2
            double r0 = java.lang.Math.sin(r0)
            float r0 = (float) r0
            float[] r1 = r10.hsv
            r1 = r1[r7]
            float r0 = r0 * r1
            float r0 = r0 * r5
            float r4 = r4 + r0
            android.graphics.Paint r0 = r10.paint
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setColor(r1)
            android.graphics.Paint r0 = r10.paint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            android.graphics.Paint r0 = r10.paint
            r1 = 1088421888(0x40e00000, float:7.0)
            r0.setStrokeWidth(r1)
            android.graphics.Paint r0 = r10.paint
            r1 = 1091567616(0x41100000, float:9.0)
            r11.drawCircle(r3, r4, r1, r0)
            android.graphics.Paint r0 = r10.paint
            r2 = -1
            r0.setColor(r2)
            android.graphics.Paint r0 = r10.paint
            r2 = 1077936128(0x40400000, float:3.0)
            r0.setStrokeWidth(r2)
            android.graphics.Paint r0 = r10.paint
            r11.drawCircle(r3, r4, r1, r0)
            android.graphics.Paint r11 = r10.paint
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r11.setStyle(r0)
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r13) {
            r12 = this;
            java.lang.String r0 = "e"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            int r0 = r13.getAction()
            r1 = 1
            if (r0 == 0) goto L1e
            int r0 = r13.getAction()
            r2 = 2
            if (r0 != r2) goto L14
            goto L1e
        L14:
            int r13 = r13.getAction()
            if (r13 != r1) goto L1d
            r12.performClick()
        L1d:
            return r1
        L1e:
            android.view.ViewParent r0 = r12.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            float r0 = r13.getX()
            int r2 = r12.getWidth()
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r0 = r0 - r2
            float r13 = r13.getY()
            int r2 = r12.getHeight()
            float r2 = (float) r2
            float r2 = r2 / r3
            float r13 = r13 - r2
            float[] r2 = r12.hsv
            double r4 = (double) r13
            double r6 = (double) r0
            double r8 = java.lang.Math.atan2(r4, r6)
            float r13 = (float) r8
            r0 = 180(0xb4, float:2.52E-43)
            float r0 = (float) r0
            float r13 = r13 * r0
            double r8 = (double) r13
            r10 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r8 = r8 / r10
            r13 = 360(0x168, float:5.04E-43)
            double r10 = (double) r13
            double r8 = r8 + r10
            double r8 = r8 % r10
            float r13 = (float) r8
            r0 = 0
            r2[r0] = r13
            float[] r13 = r12.hsv
            double r4 = java.lang.Math.hypot(r6, r4)
            float r0 = (float) r4
            int r2 = r12.getWidth()
            int r4 = r12.getHeight()
            int r2 = java.lang.Math.min(r2, r4)
            float r2 = (float) r2
            float r2 = r2 / r3
            r3 = 12
            float r3 = (float) r3
            float r2 = r2 - r3
            float r0 = r0 / r2
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = kotlin.ranges.RangesKt.coerceIn(r0, r2, r3)
            r13[r1] = r0
            kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> r13 = r12.change
            float[] r0 = r12.hsv
            int r0 = android.graphics.Color.HSVToColor(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13.invoke(r0)
            r12.invalidate()
            return r1
    }

    @Override // android.view.View
    public boolean performClick() {
            r1 = this;
            super.performClick()
            r0 = 1
            return r0
    }

    public final void setBrightness(float r3) {
            r2 = this;
            float[] r0 = r2.hsv
            r1 = 2
            r0[r1] = r3
            kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> r3 = r2.change
            int r0 = android.graphics.Color.HSVToColor(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.invoke(r0)
            r2.invalidate()
            return
    }
}
