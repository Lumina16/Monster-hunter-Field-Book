package com.lumina.monsterhunterfieldbook;

/* compiled from: FieldViews.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/GlyphView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "glyph", "", "colour", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;I)V", "getGlyph", "()Ljava/lang/String;", "getColour", "()I", "setColour", "(I)V", "p", "Landroid/graphics/Paint;", "onDraw", "", "c", "Landroid/graphics/Canvas;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GlyphView extends android.view.View {
    private int colour;
    private final java.lang.String glyph;
    private final android.graphics.Paint p;

    public GlyphView(android.content.Context r2, java.lang.String r3, int r4) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "glyph"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>(r2)
            r1.glyph = r3
            r1.colour = r4
            android.graphics.Paint r2 = new android.graphics.Paint
            r3 = 1
            r2.<init>(r3)
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r3)
            r3 = 1070386381(0x3fcccccd, float:1.6)
            r2.setStrokeWidth(r3)
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND
            r2.setStrokeCap(r3)
            android.graphics.Paint$Join r3 = android.graphics.Paint.Join.ROUND
            r2.setStrokeJoin(r3)
            r1.p = r2
            return
    }

    public final int getColour() {
            r1 = this;
            int r0 = r1.colour
            return r0
    }

    public final java.lang.String getGlyph() {
            r1 = this;
            java.lang.String r0 = r1.glyph
            return r0
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r10) {
            r9 = this;
            java.lang.String r1 = "c"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            r10.save()
            int r1 = r9.getWidth()
            int r2 = r9.getHeight()
            int r1 = java.lang.Math.min(r1, r2)
            float r1 = (float) r1
            r2 = 1103101952(0x41c00000, float:24.0)
            float r1 = r1 / r2
            int r2 = r9.getWidth()
            float r2 = (float) r2
            r3 = 24
            float r3 = (float) r3
            float r3 = r3 * r1
            float r2 = r2 - r3
            r4 = 2
            float r4 = (float) r4
            float r2 = r2 / r4
            int r5 = r9.getHeight()
            float r5 = (float) r5
            float r5 = r5 - r3
            float r5 = r5 / r4
            r10.translate(r2, r5)
            r10.scale(r1, r1)
            android.graphics.Paint r1 = r9.p
            int r2 = r9.colour
            r1.setColor(r2)
            java.lang.String r1 = r9.glyph
            int r2 = r1.hashCode()
            r6 = 1077936128(0x40400000, float:3.0)
            r7 = 1094713344(0x41400000, float:12.0)
            switch(r2) {
                case -906336856: goto L18c;
                case 3015911: goto L162;
                case 94756344: goto L141;
                case 104263205: goto Lec;
                case 1434631203: goto Lb0;
                case 1497762312: goto L78;
                case 2005378358: goto L48;
                default: goto L46;
            }
        L46:
            goto L1ae
        L48:
            java.lang.String r2 = "bookmark"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L52
            goto L1ae
        L52:
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r2 = 1086324736(0x40c00000, float:6.0)
            r1.moveTo(r2, r6)
            r3 = 1099956224(0x41900000, float:18.0)
            r1.lineTo(r3, r6)
            r4 = 1101529088(0x41a80000, float:21.0)
            r1.lineTo(r3, r4)
            r3 = 1099431936(0x41880000, float:17.0)
            r1.lineTo(r7, r3)
            r1.lineTo(r2, r4)
            r1.close()
            android.graphics.Paint r2 = r9.p
            r10.drawPath(r1, r2)
            goto L1cc
        L78:
            java.lang.String r2 = "triangle"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L82
            goto L1ae
        L82:
            android.graphics.Paint r1 = r9.p
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r2 = 1082130432(0x40800000, float:4.0)
            r3 = 1088421888(0x40e00000, float:7.0)
            r1.moveTo(r3, r2)
            r2 = 1100480512(0x41980000, float:19.0)
            r1.lineTo(r2, r7)
            r2 = 1101004800(0x41a00000, float:20.0)
            r1.lineTo(r3, r2)
            r1.close()
            android.graphics.Paint r2 = r9.p
            r10.drawPath(r1, r2)
            android.graphics.Paint r1 = r9.p
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r2)
            goto L1cc
        Lb0:
            java.lang.String r2 = "settings"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Lba
            goto L1ae
        Lba:
            r1 = 0
            r8 = r1
        Lbc:
            r1 = 8
            if (r8 >= r1) goto Lde
            r10.save()
            float r1 = (float) r8
            r2 = 1110704128(0x42340000, float:45.0)
            float r1 = r1 * r2
            r10.rotate(r1, r7, r7)
            r4 = 1084227584(0x40a00000, float:5.0)
            android.graphics.Paint r5 = r9.p
            r1 = 1092616192(0x41200000, float:10.0)
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = 1096810496(0x41600000, float:14.0)
            r0 = r10
            r0.drawRect(r1, r2, r3, r4, r5)
            r10.restore()
            int r8 = r8 + 1
            goto Lbc
        Lde:
            r1 = 1090519040(0x41000000, float:8.0)
            android.graphics.Paint r2 = r9.p
            r10.drawCircle(r7, r7, r1, r2)
            android.graphics.Paint r1 = r9.p
            r10.drawCircle(r7, r7, r6, r1)
            goto L1cc
        Lec:
            java.lang.String r2 = "music"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Lf6
            goto L1ae
        Lf6:
            r4 = 1084227584(0x40a00000, float:5.0)
            android.graphics.Paint r5 = r9.p
            r1 = 1091567616(0x41100000, float:9.0)
            r2 = 1099956224(0x41900000, float:18.0)
            r3 = 1091567616(0x41100000, float:9.0)
            r0 = r10
            r0.drawLine(r1, r2, r3, r4, r5)
            r4 = 1077936128(0x40400000, float:3.0)
            android.graphics.Paint r5 = r9.p
            r2 = 1084227584(0x40a00000, float:5.0)
            r3 = 1101004800(0x41a00000, float:20.0)
            r0.drawLine(r1, r2, r3, r4, r5)
            r4 = 1098907648(0x41800000, float:16.0)
            android.graphics.Paint r5 = r9.p
            r1 = 1101004800(0x41a00000, float:20.0)
            r2 = 1077936128(0x40400000, float:3.0)
            r0.drawLine(r1, r2, r3, r4, r5)
            r4 = 1088421888(0x40e00000, float:7.0)
            android.graphics.Paint r5 = r9.p
            r1 = 1091567616(0x41100000, float:9.0)
            r2 = 1091567616(0x41100000, float:9.0)
            r0.drawLine(r1, r2, r3, r4, r5)
            r4 = 1101529088(0x41a80000, float:21.0)
            android.graphics.Paint r5 = r9.p
            r1 = 1077936128(0x40400000, float:3.0)
            r2 = 1098907648(0x41800000, float:16.0)
            r3 = 1091567616(0x41100000, float:9.0)
            r0.drawOval(r1, r2, r3, r4, r5)
            r4 = 1100480512(0x41980000, float:19.0)
            android.graphics.Paint r5 = r9.p
            r1 = 1096810496(0x41600000, float:14.0)
            r2 = 1096810496(0x41600000, float:14.0)
            r3 = 1101004800(0x41a00000, float:20.0)
            r0.drawOval(r1, r2, r3, r4, r5)
            goto L1cc
        L141:
            java.lang.String r0 = "close"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L14a
            goto L1ae
        L14a:
            r4 = 1100480512(0x41980000, float:19.0)
            android.graphics.Paint r5 = r9.p
            r1 = 1084227584(0x40a00000, float:5.0)
            r2 = 1084227584(0x40a00000, float:5.0)
            r3 = 1100480512(0x41980000, float:19.0)
            r0 = r10
            r0.drawLine(r1, r2, r3, r4, r5)
            android.graphics.Paint r5 = r9.p
            r1 = 1100480512(0x41980000, float:19.0)
            r3 = 1084227584(0x40a00000, float:5.0)
            r0.drawLine(r1, r2, r3, r4, r5)
            goto L1cc
        L162:
            java.lang.String r0 = "back"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L16b
            goto L1ae
        L16b:
            r4 = 1094713344(0x41400000, float:12.0)
            android.graphics.Paint r5 = r9.p
            r1 = 1101004800(0x41a00000, float:20.0)
            r2 = 1094713344(0x41400000, float:12.0)
            r3 = 1082130432(0x40800000, float:4.0)
            r0 = r10
            r0.drawLine(r1, r2, r3, r4, r5)
            r4 = 1086324736(0x40c00000, float:6.0)
            android.graphics.Paint r5 = r9.p
            r1 = 1082130432(0x40800000, float:4.0)
            r3 = 1092616192(0x41200000, float:10.0)
            r0.drawLine(r1, r2, r3, r4, r5)
            r4 = 1099956224(0x41900000, float:18.0)
            android.graphics.Paint r5 = r9.p
            r0.drawLine(r1, r2, r3, r4, r5)
            goto L1cc
        L18c:
            java.lang.String r2 = "search"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L195
            goto L1ae
        L195:
            r1 = 1088002458(0x40d9999a, float:6.8)
            android.graphics.Paint r2 = r9.p
            r3 = 1092616192(0x41200000, float:10.0)
            r10.drawCircle(r3, r3, r1, r2)
            r4 = 1101529088(0x41a80000, float:21.0)
            android.graphics.Paint r5 = r9.p
            r1 = 1097859072(0x41700000, float:15.0)
            r2 = 1097859072(0x41700000, float:15.0)
            r3 = 1101529088(0x41a80000, float:21.0)
            r0 = r10
            r0.drawLine(r1, r2, r3, r4, r5)
            goto L1cc
        L1ae:
            r4 = 1094713344(0x41400000, float:12.0)
            android.graphics.Paint r5 = r9.p
            r1 = 1082130432(0x40800000, float:4.0)
            r2 = 1094713344(0x41400000, float:12.0)
            r3 = 1101004800(0x41a00000, float:20.0)
            r0 = r10
            r0.drawLine(r1, r2, r3, r4, r5)
            android.graphics.Paint r5 = r9.p
            r1 = 1096810496(0x41600000, float:14.0)
            r2 = 1086324736(0x40c00000, float:6.0)
            r0.drawLine(r1, r2, r3, r4, r5)
            android.graphics.Paint r5 = r9.p
            r2 = 1099956224(0x41900000, float:18.0)
            r0.drawLine(r1, r2, r3, r4, r5)
        L1cc:
            r10.restore()
            return
    }

    public final void setColour(int r1) {
            r0 = this;
            r0.colour = r1
            return
    }
}
