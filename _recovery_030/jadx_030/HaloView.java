package com.lumina.monsterhunterfieldbook;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FieldViews.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0016\u001a\u00020\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0017H\u0014J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/HaloView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "tint", "", "prefs", "Lcom/lumina/monsterhunterfieldbook/NativePrefs;", "<init>", "(Landroid/content/Context;ILcom/lumina/monsterhunterfieldbook/NativePrefs;)V", "getTint", "()I", "setTint", "(I)V", "getPrefs", "()Lcom/lumina/monsterhunterfieldbook/NativePrefs;", "paint", "Landroid/graphics/Paint;", "active", "", "phase", "", "onAttachedToWindow", "", "onDetachedFromWindow", "onDraw", "c", "Landroid/graphics/Canvas;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HaloView extends View {
    private boolean active;
    private final Paint paint;
    private float phase;
    private final NativePrefs prefs;
    private int tint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HaloView(Context context, int i, NativePrefs prefs) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.tint = i;
        this.prefs = prefs;
        this.paint = new Paint(1);
        this.active = true;
    }

    public final NativePrefs getPrefs() {
        return this.prefs;
    }

    public final int getTint() {
        return this.tint;
    }

    public final void setTint(int i) {
        this.tint = i;
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.active = true;
        invalidate();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        this.active = false;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas c) {
        Intrinsics.checkNotNullParameter(c, "c");
        if (!NativePrefs.flag$default(this.prefs, "animations", false, 2, null) || !NativePrefs.flag$default(this.prefs, "glow", false, 2, null) || this.prefs.number("speed", 50) == 0 || Intrinsics.areEqual(this.prefs.text("performance", "full"), "light")) {
            return;
        }
        this.phase += 0.025f;
        float min = (Math.min(getWidth(), getHeight()) / 2.8f) * 1.4f;
        this.paint.setShader(new RadialGradient(getWidth() / 2.0f, getHeight() / 2.0f, min, new int[]{0, FieldViewsKt.alphaColour(this.tint, (int) (35 + (18 * ((float) Math.sin(this.phase))))), 0}, new float[]{0.0f, 0.68f, 1.0f}, Shader.TileMode.CLAMP));
        c.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, min, this.paint);
        this.paint.setShader(null);
        if (this.active && getWindowVisibility() == 0) {
            postInvalidateDelayed(33L);
        }
    }
}
