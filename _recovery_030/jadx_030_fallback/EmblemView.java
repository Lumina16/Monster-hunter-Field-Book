package com.lumina.monsterhunterfieldbook;

/* compiled from: FieldViews.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u001b\u001a\u00020\u001c2\n\u0010\u001d\u001a\u00020\u001e\"\u00020\rH\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/EmblemView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "colour", "", "<init>", "(Landroid/content/Context;I)V", "getColour", "()I", "setColour", "(I)V", "value", "", "formation", "getFormation", "()F", "setFormation", "(F)V", "frost", "", "getFrost", "()Z", "setFrost", "(Z)V", "paint", "Landroid/graphics/Paint;", "polygon", "Landroid/graphics/Path;", "points", "", "onDraw", "", "c", "Landroid/graphics/Canvas;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EmblemView extends android.view.View {
    private int colour;
    private float formation;
    private boolean frost;
    private final android.graphics.Paint paint;

    public EmblemView(android.content.Context r2, int r3) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>(r2)
            r1.colour = r3
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.formation = r2
            android.graphics.Paint r2 = new android.graphics.Paint
            r3 = 1
            r2.<init>(r3)
            r1.paint = r2
            return
    }

    public /* synthetic */ EmblemView(android.content.Context r1, int r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto Le
            r2 = 183(0xb7, float:2.56E-43)
            r3 = 122(0x7a, float:1.71E-43)
            r4 = 217(0xd9, float:3.04E-43)
            int r2 = android.graphics.Color.rgb(r4, r2, r3)
        Le:
            r0.<init>(r1, r2)
            return
    }

    private final android.graphics.Path polygon(float... r7) {
            r6 = this;
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1 = 0
            r1 = r7[r1]
            r2 = 1
            r2 = r7[r2]
            r0.moveTo(r1, r2)
            int r1 = r7.length
            r2 = 2
            kotlin.ranges.IntRange r1 = kotlin.ranges.RangesKt.until(r2, r1)
            kotlin.ranges.IntProgression r1 = (kotlin.ranges.IntProgression) r1
            kotlin.ranges.IntProgression r1 = kotlin.ranges.RangesKt.step(r1, r2)
            int r2 = r1.getFirst()
            int r3 = r1.getLast()
            int r1 = r1.getStep()
            if (r1 <= 0) goto L2a
            if (r2 <= r3) goto L2e
        L2a:
            if (r1 >= 0) goto L3b
            if (r3 > r2) goto L3b
        L2e:
            r4 = r7[r2]
            int r5 = r2 + 1
            r5 = r7[r5]
            r0.lineTo(r4, r5)
            if (r2 == r3) goto L3b
            int r2 = r2 + r1
            goto L2e
        L3b:
            r0.close()
            return r0
    }

    public final int getColour() {
            r1 = this;
            int r0 = r1.colour
            return r0
    }

    public final float getFormation() {
            r1 = this;
            float r0 = r1.formation
            return r0
    }

    public final boolean getFrost() {
            r1 = this;
            boolean r0 = r1.frost
            return r0
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r12) {
            r11 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            super.onDraw(r12)
            r12.save()
            int r0 = r11.getWidth()
            float r0 = (float) r0
            r1 = 1111490560(0x42400000, float:48.0)
            float r0 = r0 / r1
            int r2 = r11.getHeight()
            float r2 = (float) r2
            float r2 = r2 / r1
            float r0 = java.lang.Math.min(r0, r2)
            r1 = 1064011039(0x3f6b851f, float:0.92)
            float r0 = r0 * r1
            int r1 = r11.getWidth()
            float r1 = (float) r1
            r2 = 48
            float r2 = (float) r2
            float r2 = r2 * r0
            float r1 = r1 - r2
            r3 = 2
            float r3 = (float) r3
            float r1 = r1 / r3
            int r4 = r11.getHeight()
            float r4 = (float) r4
            float r4 = r4 - r2
            float r4 = r4 / r3
            r12.translate(r1, r4)
            r12.scale(r0, r0)
            r0 = 12
            float[] r1 = new float[r0]
            r1 = {x01a8: FILL_ARRAY_DATA , data: [1103101952, 1073741824, 1110179840, 1095761920, 1110179840, 1108082688, 1103101952, 1110966272, 1084227584, 1108082688, 1084227584, 1095761920} // fill-array
            android.graphics.Path r1 = r11.polygon(r1)
            float[] r2 = new float[r0]
            r2 = {x01c4: FILL_ARRAY_DATA , data: [1103101952, 1084227584, 1109393408, 1097334784, 1109393408, 1107689472, 1103101952, 1110179840, 1090519040, 1107689472, 1090519040, 1097334784} // fill-array
            android.graphics.Path r2 = r11.polygon(r2)
            android.graphics.Paint r3 = r11.paint
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.FILL
            r3.setStyle(r4)
            android.graphics.Paint r3 = r11.paint
            r4 = 25
            r5 = 26
            r6 = 21
            int r4 = android.graphics.Color.rgb(r6, r4, r5)
            int r5 = r11.colour
            r6 = 1051931443(0x3eb33333, float:0.35)
            int r4 = com.lumina.monsterhunterfieldbook.FieldViewsKt.blend(r4, r5, r6)
            r3.setColor(r4)
            android.graphics.Paint r3 = r11.paint
            r12.drawPath(r1, r3)
            android.graphics.Paint r3 = r11.paint
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.STROKE
            r3.setStyle(r4)
            android.graphics.Paint r3 = r11.paint
            r4 = 1061997773(0x3f4ccccd, float:0.8)
            r3.setStrokeWidth(r4)
            android.graphics.Paint r3 = r11.paint
            int r4 = r11.colour
            r5 = -1
            r6 = 1048576000(0x3e800000, float:0.25)
            int r4 = com.lumina.monsterhunterfieldbook.FieldViewsKt.blend(r4, r5, r6)
            r3.setColor(r4)
            android.graphics.Paint r3 = r11.paint
            r12.drawPath(r1, r3)
            android.graphics.Paint r1 = r11.paint
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r1.setStyle(r3)
            android.graphics.Paint r1 = r11.paint
            boolean r3 = r11.frost
            if (r3 == 0) goto La9
            r3 = 51
            r4 = 70
            r5 = 24
            goto Laf
        La9:
            r3 = 39
            r4 = 32
            r5 = 28
        Laf:
            int r3 = android.graphics.Color.rgb(r5, r3, r4)
            r1.setColor(r3)
            android.graphics.Paint r1 = r11.paint
            r12.drawPath(r2, r1)
            android.graphics.Paint r1 = r11.paint
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r3)
            android.graphics.Paint r1 = r11.paint
            r3 = 1066611507(0x3f933333, float:1.15)
            r1.setStrokeWidth(r3)
            android.graphics.Paint r1 = r11.paint
            int r3 = r11.colour
            r1.setColor(r3)
            android.graphics.Paint r1 = r11.paint
            r12.drawPath(r2, r1)
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r2 = 1093664768(0x41300000, float:11.0)
            r3 = 1103101952(0x41c00000, float:24.0)
            r1.moveTo(r3, r2)
            r2 = 1108606976(0x42140000, float:37.0)
            r1.lineTo(r3, r2)
            r2 = 1095447347(0x414b3333, float:12.7)
            r4 = 1099694080(0x418c0000, float:17.5)
            r1.moveTo(r2, r4)
            r5 = 1108161331(0x420d3333, float:35.3)
            r6 = 1106509824(0x41f40000, float:30.5)
            r1.lineTo(r5, r6)
            r1.moveTo(r2, r6)
            r1.lineTo(r5, r4)
            r2 = 1100480512(0x41980000, float:19.0)
            r4 = 1095761920(0x41500000, float:13.0)
            r1.moveTo(r2, r4)
            r5 = 1099956224(0x41900000, float:18.0)
            r1.lineTo(r3, r5)
            r6 = 1105723392(0x41e80000, float:29.0)
            r1.lineTo(r6, r4)
            r7 = 1108082688(0x420c0000, float:35.0)
            r1.moveTo(r2, r7)
            r2 = 1106247680(0x41f00000, float:30.0)
            r1.lineTo(r3, r2)
            r1.lineTo(r6, r7)
            r3 = 1102053376(0x41b00000, float:22.0)
            r1.moveTo(r4, r3)
            r6 = 1101004800(0x41a00000, float:20.0)
            r8 = 1102577664(0x41b80000, float:23.0)
            r1.lineTo(r6, r8)
            r9 = 1098907648(0x41800000, float:16.0)
            r1.lineTo(r5, r9)
            r9 = 1104150528(0x41d00000, float:26.0)
            r1.moveTo(r7, r9)
            r9 = 1105199104(0x41e00000, float:28.0)
            r10 = 1103626240(0x41c80000, float:25.0)
            r1.lineTo(r9, r10)
            r9 = 1107296256(0x42000000, float:32.0)
            r1.lineTo(r2, r9)
            r9 = 1104150528(0x41d00000, float:26.0)
            r1.moveTo(r4, r9)
            r4 = 1103626240(0x41c80000, float:25.0)
            r1.lineTo(r6, r4)
            r4 = 1107296256(0x42000000, float:32.0)
            r1.lineTo(r5, r4)
            r1.moveTo(r7, r3)
            r3 = 1105199104(0x41e00000, float:28.0)
            r1.lineTo(r3, r8)
            r3 = 1098907648(0x41800000, float:16.0)
            r1.lineTo(r2, r3)
            android.graphics.Paint r2 = r11.paint
            r3 = 1067450368(0x3fa00000, float:1.25)
            r2.setStrokeWidth(r3)
            android.graphics.Paint r2 = r11.paint
            android.graphics.Paint$Join r3 = android.graphics.Paint.Join.ROUND
            r2.setStrokeJoin(r3)
            float r2 = r11.formation
            r3 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L175
            android.graphics.Paint r0 = r11.paint
            r12.drawPath(r1, r0)
            goto L1a4
        L175:
            android.graphics.PathMeasure r2 = new android.graphics.PathMeasure
            r3 = 0
            r2.<init>(r1, r3)
            r1 = 0
        L17c:
            android.graphics.Path r3 = new android.graphics.Path
            r3.<init>()
            float r4 = r2.getLength()
            float r5 = r11.formation
            float r6 = (float) r0
            float r5 = r5 * r6
            float r6 = (float) r1
            float r5 = r5 - r6
            r6 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            float r5 = kotlin.ranges.RangesKt.coerceIn(r5, r6, r7)
            float r4 = r4 * r5
            r5 = 1
            r2.getSegment(r6, r4, r3, r5)
            android.graphics.Paint r4 = r11.paint
            r12.drawPath(r3, r4)
            int r1 = r1 + 1
            boolean r3 = r2.nextContour()
            if (r3 != 0) goto L17c
        L1a4:
            r12.restore()
            return
    }

    public final void setColour(int r1) {
            r0 = this;
            r0.colour = r1
            return
    }

    public final void setFormation(float r1) {
            r0 = this;
            r0.formation = r1
            r0.invalidate()
            return
    }

    public final void setFrost(boolean r1) {
            r0 = this;
            r0.frost = r1
            return
    }
}
