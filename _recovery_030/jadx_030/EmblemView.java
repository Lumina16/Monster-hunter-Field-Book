package com.lumina.monsterhunterfieldbook;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

/* compiled from: FieldViews.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u001b\u001a\u00020\u001c2\n\u0010\u001d\u001a\u00020\u001e\"\u00020\rH\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/EmblemView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "colour", "", "<init>", "(Landroid/content/Context;I)V", "getColour", "()I", "setColour", "(I)V", "value", "", "formation", "getFormation", "()F", "setFormation", "(F)V", "frost", "", "getFrost", "()Z", "setFrost", "(Z)V", "paint", "Landroid/graphics/Paint;", "polygon", "Landroid/graphics/Path;", "points", "", "onDraw", "", "c", "Landroid/graphics/Canvas;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EmblemView extends View {
    private int colour;
    private float formation;
    private boolean frost;
    private final Paint paint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmblemView(Context context, int i) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.colour = i;
        this.formation = 1.0f;
        this.paint = new Paint(1);
    }

    public /* synthetic */ EmblemView(Context context, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? Color.rgb(217, 183, 122) : i);
    }

    public final int getColour() {
        return this.colour;
    }

    public final void setColour(int i) {
        this.colour = i;
    }

    public final float getFormation() {
        return this.formation;
    }

    public final void setFormation(float f) {
        this.formation = f;
        invalidate();
    }

    public final boolean getFrost() {
        return this.frost;
    }

    public final void setFrost(boolean z) {
        this.frost = z;
    }

    private final Path polygon(float... points) {
        Path path = new Path();
        path.moveTo(points[0], points[1]);
        IntProgression step = RangesKt.step(RangesKt.until(2, points.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (true) {
                path.lineTo(points[first], points[first + 1]);
                if (first == last) {
                    break;
                }
                first += step2;
            }
        }
        path.close();
        return path;
    }

    @Override // android.view.View
    protected void onDraw(Canvas c) {
        int i;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(c, "c");
        super.onDraw(c);
        c.save();
        float min = Math.min(getWidth() / 48.0f, getHeight() / 48.0f) * 0.92f;
        float f = 48 * min;
        float f2 = 2;
        c.translate((getWidth() - f) / f2, (getHeight() - f) / f2);
        c.scale(min, min);
        Path polygon = polygon(24.0f, 2.0f, 43.0f, 13.0f, 43.0f, 35.0f, 24.0f, 46.0f, 5.0f, 35.0f, 5.0f, 13.0f);
        Path polygon2 = polygon(24.0f, 5.0f, 40.0f, 14.5f, 40.0f, 33.5f, 24.0f, 43.0f, 8.0f, 33.5f, 8.0f, 14.5f);
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(FieldViewsKt.blend(Color.rgb(21, 25, 26), this.colour, 0.35f));
        c.drawPath(polygon, this.paint);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(0.8f);
        this.paint.setColor(FieldViewsKt.blend(this.colour, -1, 0.25f));
        c.drawPath(polygon, this.paint);
        this.paint.setStyle(Paint.Style.FILL);
        Paint paint = this.paint;
        if (this.frost) {
            i = 51;
            i2 = 70;
            i3 = 24;
        } else {
            i = 39;
            i2 = 32;
            i3 = 28;
        }
        paint.setColor(Color.rgb(i3, i, i2));
        c.drawPath(polygon2, this.paint);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(1.15f);
        this.paint.setColor(this.colour);
        c.drawPath(polygon2, this.paint);
        Path path = new Path();
        path.moveTo(24.0f, 11.0f);
        path.lineTo(24.0f, 37.0f);
        path.moveTo(12.7f, 17.5f);
        path.lineTo(35.3f, 30.5f);
        path.moveTo(12.7f, 30.5f);
        path.lineTo(35.3f, 17.5f);
        path.moveTo(19.0f, 13.0f);
        path.lineTo(24.0f, 18.0f);
        path.lineTo(29.0f, 13.0f);
        path.moveTo(19.0f, 35.0f);
        path.lineTo(24.0f, 30.0f);
        path.lineTo(29.0f, 35.0f);
        path.moveTo(13.0f, 22.0f);
        path.lineTo(20.0f, 23.0f);
        path.lineTo(18.0f, 16.0f);
        path.moveTo(35.0f, 26.0f);
        path.lineTo(28.0f, 25.0f);
        path.lineTo(30.0f, 32.0f);
        path.moveTo(13.0f, 26.0f);
        path.lineTo(20.0f, 25.0f);
        path.lineTo(18.0f, 32.0f);
        path.moveTo(35.0f, 22.0f);
        path.lineTo(28.0f, 23.0f);
        path.lineTo(30.0f, 16.0f);
        this.paint.setStrokeWidth(1.25f);
        this.paint.setStrokeJoin(Paint.Join.ROUND);
        if (this.formation >= 1.0f) {
            c.drawPath(path, this.paint);
        } else {
            PathMeasure pathMeasure = new PathMeasure(path, false);
            int i4 = 0;
            do {
                Path path2 = new Path();
                pathMeasure.getSegment(0.0f, pathMeasure.getLength() * RangesKt.coerceIn((this.formation * 12) - i4, 0.0f, 1.0f), path2, true);
                c.drawPath(path2, this.paint);
                i4++;
            } while (pathMeasure.nextContour());
        }
        c.restore();
    }
}
