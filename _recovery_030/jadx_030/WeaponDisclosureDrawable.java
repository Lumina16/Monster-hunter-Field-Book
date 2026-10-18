package com.lumina.monsterhunterfieldbook;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WeaponProfilePanel.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0012\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/WeaponDisclosureDrawable;", "Landroid/graphics/drawable/Drawable;", "a", "Lcom/lumina/monsterhunterfieldbook/MainActivity;", "group", "Lcom/lumina/monsterhunterfieldbook/ReadingGroup;", "<init>", "(Lcom/lumina/monsterhunterfieldbook/MainActivity;Lcom/lumina/monsterhunterfieldbook/ReadingGroup;)V", "paint", "Landroid/graphics/Paint;", "getIntrinsicWidth", "", "getIntrinsicHeight", "draw", "", "canvas", "Landroid/graphics/Canvas;", "setAlpha", "alpha", "setColorFilter", "filter", "Landroid/graphics/ColorFilter;", "getOpacity", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
final class WeaponDisclosureDrawable extends Drawable {
    private final MainActivity a;
    private final ReadingGroup group;
    private final Paint paint;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public WeaponDisclosureDrawable(MainActivity a, ReadingGroup group) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(group, "group");
        this.a = a;
        this.group = group;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(a.dp(Float.valueOf(1.3f)));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.paint = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.a.dp((Number) 17);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.a.dp((Number) 17);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.paint.setColor(this.a.getMuted());
        float exactCenterX = getBounds().exactCenterX();
        float exactCenterY = getBounds().exactCenterY();
        float dp = this.a.dp((Number) 4);
        canvas.save();
        if (this.group.getExpanded()) {
            canvas.rotate(90.0f, exactCenterX, exactCenterY);
        }
        Path path = new Path();
        float f = dp / 2;
        float f2 = exactCenterX - f;
        path.moveTo(f2, exactCenterY - dp);
        path.lineTo(exactCenterX + f, exactCenterY);
        path.lineTo(f2, exactCenterY + dp);
        canvas.drawPath(path, this.paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.paint.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter filter) {
        this.paint.setColorFilter(filter);
    }
}
