package com.lumina.monsterhunterfieldbook;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: FieldViews.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001cH\u0016R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006 "}, d2 = {"Lcom/lumina/monsterhunterfieldbook/ColourWheel;", "Landroid/view/View;", "context", "Landroid/content/Context;", "initial", "", "change", "Lkotlin/Function1;", "", "<init>", "(Landroid/content/Context;ILkotlin/jvm/functions/Function1;)V", "getChange", "()Lkotlin/jvm/functions/Function1;", "paint", "Landroid/graphics/Paint;", "hsv", "", "value", "", "brightness", "getBrightness", "()F", "setBrightness", "(F)V", "onDraw", "c", "Landroid/graphics/Canvas;", "onTouchEvent", "", "e", "Landroid/view/MotionEvent;", "performClick", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ColourWheel extends View {
    private final Function1<Integer, Unit> change;
    private final float[] hsv;
    private final Paint paint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ColourWheel(Context context, int i, Function1<? super Integer, Unit> change) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(change, "change");
        this.change = change;
        this.paint = new Paint(1);
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        this.hsv = fArr;
    }

    public final Function1<Integer, Unit> getChange() {
        return this.change;
    }

    public final float getBrightness() {
        return this.hsv[2];
    }

    public final void setBrightness(float f) {
        float[] fArr = this.hsv;
        fArr[2] = f;
        this.change.invoke(Integer.valueOf(Color.HSVToColor(fArr)));
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas c) {
        Intrinsics.checkNotNullParameter(c, "c");
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float min = Math.min(width, height) - 12;
        this.paint.setShader(new SweepGradient(width, height, new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null));
        c.drawCircle(width, height, min, this.paint);
        this.paint.setShader(new RadialGradient(width, height, min, -1, 0, Shader.TileMode.CLAMP));
        c.drawCircle(width, height, min, this.paint);
        this.paint.setShader(null);
        double radians = Math.toRadians(this.hsv[0]);
        float cos = width + (((float) Math.cos(radians)) * this.hsv[1] * min);
        float sin = height + (((float) Math.sin(radians)) * this.hsv[1] * min);
        this.paint.setColor(-16777216);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(7.0f);
        c.drawCircle(cos, sin, 9.0f, this.paint);
        this.paint.setColor(-1);
        this.paint.setStrokeWidth(3.0f);
        c.drawCircle(cos, sin, 9.0f, this.paint);
        this.paint.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (e.getAction() == 0 || e.getAction() == 2) {
            getParent().requestDisallowInterceptTouchEvent(true);
            float x = e.getX() - (getWidth() / 2.0f);
            double y = e.getY() - (getHeight() / 2.0f);
            double d = 360;
            this.hsv[0] = (float) ((((((float) Math.atan2(y, r6)) * 180) / 3.141592653589793d) + d) % d);
            this.hsv[1] = RangesKt.coerceIn(((float) Math.hypot(x, y)) / ((Math.min(getWidth(), getHeight()) / 2.0f) - 12), 0.0f, 1.0f);
            this.change.invoke(Integer.valueOf(Color.HSVToColor(this.hsv)));
            invalidate();
            return true;
        }
        if (e.getAction() == 1) {
            performClick();
        }
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return true;
    }
}
