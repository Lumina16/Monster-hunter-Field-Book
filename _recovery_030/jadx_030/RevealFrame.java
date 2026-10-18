package com.lumina.monsterhunterfieldbook;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FieldViews.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/RevealFrame;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "value", "", "reveal", "getReveal", "()F", "setReveal", "(F)V", "dispatchDraw", "", "canvas", "Landroid/graphics/Canvas;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class RevealFrame extends FrameLayout {
    private float reveal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevealFrame(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.reveal = 1.0f;
    }

    public final float getReveal() {
        return this.reveal;
    }

    public final void setReveal(float f) {
        this.reveal = f;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int save = canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), getHeight() * this.reveal);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }
}
