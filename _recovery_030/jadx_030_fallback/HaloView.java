package com.lumina.monsterhunterfieldbook;

/* compiled from: FieldViews.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0016\u001a\u00020\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0017H\u0014J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/HaloView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "tint", "", "prefs", "Lcom/lumina/monsterhunterfieldbook/NativePrefs;", "<init>", "(Landroid/content/Context;ILcom/lumina/monsterhunterfieldbook/NativePrefs;)V", "getTint", "()I", "setTint", "(I)V", "getPrefs", "()Lcom/lumina/monsterhunterfieldbook/NativePrefs;", "paint", "Landroid/graphics/Paint;", "active", "", "phase", "", "onAttachedToWindow", "", "onDetachedFromWindow", "onDraw", "c", "Landroid/graphics/Canvas;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HaloView extends android.view.View {
    private boolean active;
    private final android.graphics.Paint paint;
    private float phase;
    private final com.lumina.monsterhunterfieldbook.NativePrefs prefs;
    private int tint;

    public HaloView(android.content.Context r2, int r3, com.lumina.monsterhunterfieldbook.NativePrefs r4) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "prefs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.<init>(r2)
            r1.tint = r3
            r1.prefs = r4
            android.graphics.Paint r2 = new android.graphics.Paint
            r3 = 1
            r2.<init>(r3)
            r1.paint = r2
            r1.active = r3
            return
    }

    public final com.lumina.monsterhunterfieldbook.NativePrefs getPrefs() {
            r1 = this;
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r1.prefs
            return r0
    }

    public final int getTint() {
            r1 = this;
            int r0 = r1.tint
            return r0
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            r0 = 1
            r1.active = r0
            r1.invalidate()
            return
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            r0 = 0
            r1.active = r0
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r14) {
            r13 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r13.prefs
            java.lang.String r1 = "animations"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r0 = com.lumina.monsterhunterfieldbook.NativePrefs.flag$default(r0, r1, r2, r3, r4)
            if (r0 == 0) goto Lbe
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r13.prefs
            java.lang.String r1 = "glow"
            boolean r0 = com.lumina.monsterhunterfieldbook.NativePrefs.flag$default(r0, r1, r2, r3, r4)
            if (r0 == 0) goto Lbe
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r13.prefs
            java.lang.String r1 = "speed"
            r3 = 50
            int r0 = r0.number(r1, r3)
            if (r0 == 0) goto Lbe
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r13.prefs
            java.lang.String r1 = "performance"
            java.lang.String r3 = "full"
            java.lang.String r0 = r0.text(r1, r3)
            java.lang.String r1 = "light"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L3c
            goto Lbe
        L3c:
            int r0 = r13.getWidth()
            int r1 = r13.getHeight()
            int r0 = java.lang.Math.min(r0, r1)
            float r0 = (float) r0
            r1 = 1077097267(0x40333333, float:2.8)
            float r0 = r0 / r1
            float r1 = r13.phase
            r3 = 1020054733(0x3ccccccd, float:0.025)
            float r1 = r1 + r3
            r13.phase = r1
            android.graphics.Paint r1 = r13.paint
            android.graphics.RadialGradient r5 = new android.graphics.RadialGradient
            int r3 = r13.getWidth()
            float r3 = (float) r3
            r12 = 1073741824(0x40000000, float:2.0)
            float r6 = r3 / r12
            int r3 = r13.getHeight()
            float r3 = (float) r3
            float r7 = r3 / r12
            r3 = 1068708659(0x3fb33333, float:1.4)
            float r8 = r0 * r3
            int r0 = r13.tint
            r3 = 35
            float r3 = (float) r3
            r9 = 18
            float r9 = (float) r9
            float r10 = r13.phase
            double r10 = (double) r10
            double r10 = java.lang.Math.sin(r10)
            float r10 = (float) r10
            float r9 = r9 * r10
            float r3 = r3 + r9
            int r3 = (int) r3
            int r0 = com.lumina.monsterhunterfieldbook.FieldViewsKt.alphaColour(r0, r3)
            int[] r9 = new int[]{r2, r0, r2}
            r0 = 3
            float[] r10 = new float[r0]
            r10 = {x00c0: FILL_ARRAY_DATA , data: [0, 1059984507, 1065353216} // fill-array
            android.graphics.Shader$TileMode r11 = android.graphics.Shader.TileMode.CLAMP
            r5.<init>(r6, r7, r8, r9, r10, r11)
            android.graphics.Shader r5 = (android.graphics.Shader) r5
            r1.setShader(r5)
            int r0 = r13.getWidth()
            float r0 = (float) r0
            float r0 = r0 / r12
            int r1 = r13.getHeight()
            float r1 = (float) r1
            float r1 = r1 / r12
            android.graphics.Paint r2 = r13.paint
            r14.drawCircle(r0, r1, r8, r2)
            android.graphics.Paint r14 = r13.paint
            r14.setShader(r4)
            boolean r14 = r13.active
            if (r14 == 0) goto Lbe
            int r14 = r13.getWindowVisibility()
            if (r14 != 0) goto Lbe
            r0 = 33
            r13.postInvalidateDelayed(r0)
        Lbe:
            return
    }

    public final void setTint(int r1) {
            r0 = this;
            r0.tint = r1
            return
    }
}
