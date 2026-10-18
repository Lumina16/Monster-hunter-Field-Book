package com.lumina.monsterhunterfieldbook;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FieldViews.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/GlyphView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "glyph", "", "colour", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;I)V", "getGlyph", "()Ljava/lang/String;", "getColour", "()I", "setColour", "(I)V", "p", "Landroid/graphics/Paint;", "onDraw", "", "c", "Landroid/graphics/Canvas;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GlyphView extends View {
    private int colour;
    private final String glyph;
    private final Paint p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlyphView(Context context, String glyph, int i) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(glyph, "glyph");
        this.glyph = glyph;
        this.colour = i;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.6f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.p = paint;
    }

    public final int getColour() {
        return this.colour;
    }

    public final String getGlyph() {
        return this.glyph;
    }

    public final void setColour(int i) {
        this.colour = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View
    protected void onDraw(Canvas c) {
        Intrinsics.checkNotNullParameter(c, "c");
        c.save();
        float min = Math.min(getWidth(), getHeight()) / 24.0f;
        float f = 24 * min;
        float f2 = 2;
        c.translate((getWidth() - f) / f2, (getHeight() - f) / f2);
        c.scale(min, min);
        this.p.setColor(this.colour);
        String str = this.glyph;
        switch (str.hashCode()) {
            case -906336856:
                if (str.equals("search")) {
                    c.drawCircle(10.0f, 10.0f, 6.8f, this.p);
                    c.drawLine(15.0f, 15.0f, 21.0f, 21.0f, this.p);
                    break;
                }
                c.drawLine(4.0f, 12.0f, 20.0f, 12.0f, this.p);
                c.drawLine(14.0f, 6.0f, 20.0f, 12.0f, this.p);
                c.drawLine(14.0f, 18.0f, 20.0f, 12.0f, this.p);
                break;
            case 3015911:
                if (str.equals("back")) {
                    c.drawLine(20.0f, 12.0f, 4.0f, 12.0f, this.p);
                    c.drawLine(4.0f, 12.0f, 10.0f, 6.0f, this.p);
                    c.drawLine(4.0f, 12.0f, 10.0f, 18.0f, this.p);
                    break;
                }
                c.drawLine(4.0f, 12.0f, 20.0f, 12.0f, this.p);
                c.drawLine(14.0f, 6.0f, 20.0f, 12.0f, this.p);
                c.drawLine(14.0f, 18.0f, 20.0f, 12.0f, this.p);
                break;
            case 94756344:
                if (str.equals("close")) {
                    c.drawLine(5.0f, 5.0f, 19.0f, 19.0f, this.p);
                    c.drawLine(19.0f, 5.0f, 5.0f, 19.0f, this.p);
                    break;
                }
                c.drawLine(4.0f, 12.0f, 20.0f, 12.0f, this.p);
                c.drawLine(14.0f, 6.0f, 20.0f, 12.0f, this.p);
                c.drawLine(14.0f, 18.0f, 20.0f, 12.0f, this.p);
                break;
            case 104263205:
                if (str.equals("music")) {
                    c.drawLine(9.0f, 18.0f, 9.0f, 5.0f, this.p);
                    c.drawLine(9.0f, 5.0f, 20.0f, 3.0f, this.p);
                    c.drawLine(20.0f, 3.0f, 20.0f, 16.0f, this.p);
                    c.drawLine(9.0f, 9.0f, 20.0f, 7.0f, this.p);
                    c.drawOval(3.0f, 16.0f, 9.0f, 21.0f, this.p);
                    c.drawOval(14.0f, 14.0f, 20.0f, 19.0f, this.p);
                    break;
                }
                c.drawLine(4.0f, 12.0f, 20.0f, 12.0f, this.p);
                c.drawLine(14.0f, 6.0f, 20.0f, 12.0f, this.p);
                c.drawLine(14.0f, 18.0f, 20.0f, 12.0f, this.p);
                break;
            case 1434631203:
                if (str.equals("settings")) {
                    for (int i = 0; i < 8; i++) {
                        c.save();
                        c.rotate(i * 45.0f, 12.0f, 12.0f);
                        c.drawRect(10.0f, 2.0f, 14.0f, 5.0f, this.p);
                        c.restore();
                    }
                    c.drawCircle(12.0f, 12.0f, 8.0f, this.p);
                    c.drawCircle(12.0f, 12.0f, 3.0f, this.p);
                    break;
                }
                c.drawLine(4.0f, 12.0f, 20.0f, 12.0f, this.p);
                c.drawLine(14.0f, 6.0f, 20.0f, 12.0f, this.p);
                c.drawLine(14.0f, 18.0f, 20.0f, 12.0f, this.p);
                break;
            case 1497762312:
                if (str.equals("triangle")) {
                    this.p.setStyle(Paint.Style.FILL);
                    Path path = new Path();
                    path.moveTo(7.0f, 4.0f);
                    path.lineTo(19.0f, 12.0f);
                    path.lineTo(7.0f, 20.0f);
                    path.close();
                    c.drawPath(path, this.p);
                    this.p.setStyle(Paint.Style.STROKE);
                    break;
                }
                c.drawLine(4.0f, 12.0f, 20.0f, 12.0f, this.p);
                c.drawLine(14.0f, 6.0f, 20.0f, 12.0f, this.p);
                c.drawLine(14.0f, 18.0f, 20.0f, 12.0f, this.p);
                break;
            case 2005378358:
                if (str.equals("bookmark")) {
                    Path path2 = new Path();
                    path2.moveTo(6.0f, 3.0f);
                    path2.lineTo(18.0f, 3.0f);
                    path2.lineTo(18.0f, 21.0f);
                    path2.lineTo(12.0f, 17.0f);
                    path2.lineTo(6.0f, 21.0f);
                    path2.close();
                    c.drawPath(path2, this.p);
                    break;
                }
                c.drawLine(4.0f, 12.0f, 20.0f, 12.0f, this.p);
                c.drawLine(14.0f, 6.0f, 20.0f, 12.0f, this.p);
                c.drawLine(14.0f, 18.0f, 20.0f, 12.0f, this.p);
                break;
            default:
                c.drawLine(4.0f, 12.0f, 20.0f, 12.0f, this.p);
                c.drawLine(14.0f, 6.0f, 20.0f, 12.0f, this.p);
                c.drawLine(14.0f, 18.0f, 20.0f, 12.0f, this.p);
                break;
        }
        c.restore();
    }
}
