package com.lumina.monsterhunterfieldbook;

/* compiled from: WeaponProfilePanel.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/WeaponSharpnessView;", "Landroid/view/View;", "a", "Lcom/lumina/monsterhunterfieldbook/MainActivity;", "values", "", "", "<init>", "(Lcom/lumina/monsterhunterfieldbook/MainActivity;Ljava/util/List;)V", "colours", "", "paint", "Landroid/graphics/Paint;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
final class WeaponSharpnessView extends android.view.View {
    private final int[] colours;
    private final android.graphics.Paint paint;
    private final java.util.List<java.lang.Float> values;

    public WeaponSharpnessView(com.lumina.monsterhunterfieldbook.MainActivity r9, java.util.List<java.lang.Float> r10) {
            r8 = this;
            java.lang.String r0 = "a"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "values"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            android.content.Context r9 = (android.content.Context) r9
            r8.<init>(r9)
            r8.values = r10
            r9 = 64
            r10 = 54
            r0 = 197(0xc5, float:2.76E-43)
            int r1 = android.graphics.Color.rgb(r0, r9, r10)
            r9 = 113(0x71, float:1.58E-43)
            r10 = 47
            r0 = 217(0xd9, float:3.04E-43)
            int r2 = android.graphics.Color.rgb(r0, r9, r10)
            r9 = 216(0xd8, float:3.03E-43)
            r10 = 189(0xbd, float:2.65E-43)
            r0 = 82
            int r3 = android.graphics.Color.rgb(r9, r10, r0)
            r9 = 161(0xa1, float:2.26E-43)
            r10 = 84
            r4 = 117(0x75, float:1.64E-43)
            int r4 = android.graphics.Color.rgb(r4, r9, r10)
            r9 = 147(0x93, float:2.06E-43)
            r10 = 202(0xca, float:2.83E-43)
            int r5 = android.graphics.Color.rgb(r0, r9, r10)
            r9 = 235(0xeb, float:3.3E-43)
            r10 = 220(0xdc, float:3.08E-43)
            r0 = 236(0xec, float:3.31E-43)
            int r6 = android.graphics.Color.rgb(r0, r9, r10)
            r9 = 131(0x83, float:1.84E-43)
            r10 = 206(0xce, float:2.89E-43)
            r0 = 168(0xa8, float:2.35E-43)
            int r7 = android.graphics.Color.rgb(r0, r9, r10)
            int[] r9 = new int[]{r1, r2, r3, r4, r5, r6, r7}
            r8.colours = r9
            android.graphics.Paint r9 = new android.graphics.Paint
            r10 = 1
            r9.<init>(r10)
            r8.paint = r9
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r12) {
            r11 = this;
            java.lang.String r0 = "canvas"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.util.List<java.lang.Float> r0 = r11.values
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            float r0 = kotlin.collections.CollectionsKt.sumOfFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1 = r0
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L1e
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r0 == 0) goto L26
            float r0 = r0.floatValue()
            goto L28
        L26:
            r0 = 1065353216(0x3f800000, float:1.0)
        L28:
            java.util.List<java.lang.Float> r1 = r11.values
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
            r5 = r2
        L32:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r1.next()
            int r10 = r3 + 1
            if (r3 >= 0) goto L43
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L43:
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            android.graphics.Paint r4 = r11.paint
            int[] r6 = r11.colours
            r7 = 6
            int r3 = kotlin.ranges.RangesKt.coerceAtMost(r3, r7)
            r3 = r6[r3]
            r4.setColor(r3)
            int r3 = r11.getWidth()
            float r3 = (float) r3
            float r3 = r3 * r2
            float r3 = r3 / r0
            float r7 = r5 + r3
            int r2 = r11.getHeight()
            float r8 = (float) r2
            android.graphics.Paint r9 = r11.paint
            r6 = 0
            r4 = r12
            r4.drawRect(r5, r6, r7, r8, r9)
            r5 = r7
            r3 = r10
            goto L32
        L6f:
            return
    }
}
