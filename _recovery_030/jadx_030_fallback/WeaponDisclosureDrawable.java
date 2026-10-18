package com.lumina.monsterhunterfieldbook;

/* compiled from: WeaponProfilePanel.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0012\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/WeaponDisclosureDrawable;", "Landroid/graphics/drawable/Drawable;", "a", "Lcom/lumina/monsterhunterfieldbook/MainActivity;", "group", "Lcom/lumina/monsterhunterfieldbook/ReadingGroup;", "<init>", "(Lcom/lumina/monsterhunterfieldbook/MainActivity;Lcom/lumina/monsterhunterfieldbook/ReadingGroup;)V", "paint", "Landroid/graphics/Paint;", "getIntrinsicWidth", "", "getIntrinsicHeight", "draw", "", "canvas", "Landroid/graphics/Canvas;", "setAlpha", "alpha", "setColorFilter", "filter", "Landroid/graphics/ColorFilter;", "getOpacity", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
final class WeaponDisclosureDrawable extends android.graphics.drawable.Drawable {
    private final com.lumina.monsterhunterfieldbook.MainActivity a;
    private final com.lumina.monsterhunterfieldbook.ReadingGroup group;
    private final android.graphics.Paint paint;

    public WeaponDisclosureDrawable(com.lumina.monsterhunterfieldbook.MainActivity r2, com.lumina.monsterhunterfieldbook.ReadingGroup r3) {
            r1 = this;
            java.lang.String r0 = "a"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "group"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.group = r3
            android.graphics.Paint r3 = new android.graphics.Paint
            r0 = 1
            r3.<init>(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r3.setStyle(r0)
            r0 = 1067869798(0x3fa66666, float:1.3)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r2.dp(r0)
            float r2 = (float) r2
            r3.setStrokeWidth(r2)
            android.graphics.Paint$Cap r2 = android.graphics.Paint.Cap.ROUND
            r3.setStrokeCap(r2)
            android.graphics.Paint$Join r2 = android.graphics.Paint.Join.ROUND
            r3.setStrokeJoin(r2)
            r1.paint = r3
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r8) {
            r7 = this;
            java.lang.String r0 = "canvas"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            android.graphics.Paint r0 = r7.paint
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r7.a
            int r1 = r1.getMuted()
            r0.setColor(r1)
            android.graphics.Rect r0 = r7.getBounds()
            float r0 = r0.exactCenterX()
            android.graphics.Rect r1 = r7.getBounds()
            float r1 = r1.exactCenterY()
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r7.a
            r3 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r2 = r2.dp(r3)
            float r2 = (float) r2
            r8.save()
            com.lumina.monsterhunterfieldbook.ReadingGroup r3 = r7.group
            boolean r3 = r3.getExpanded()
            if (r3 == 0) goto L3e
            r3 = 1119092736(0x42b40000, float:90.0)
            r8.rotate(r3, r0, r1)
        L3e:
            android.graphics.Path r3 = new android.graphics.Path
            r3.<init>()
            r4 = 2
            float r4 = (float) r4
            float r4 = r2 / r4
            float r5 = r0 - r4
            float r6 = r1 - r2
            r3.moveTo(r5, r6)
            float r0 = r0 + r4
            r3.lineTo(r0, r1)
            float r1 = r1 + r2
            r3.lineTo(r5, r1)
            android.graphics.Paint r0 = r7.paint
            r8.drawPath(r3, r0)
            r8.restore()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r2 = this;
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r2.a
            r1 = 17
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r0.dp(r1)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r2 = this;
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r2.a
            r1 = 17
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r0.dp(r1)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.paint
            r0.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.paint
            r0.setColorFilter(r2)
            return
    }
}
