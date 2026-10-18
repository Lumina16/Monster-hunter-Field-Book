package com.lumina.monsterhunterfieldbook;

/* compiled from: FieldViews.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/RevealFrame;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "value", "", "reveal", "getReveal", "()F", "setReveal", "(F)V", "dispatchDraw", "", "canvas", "Landroid/graphics/Canvas;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class RevealFrame extends android.widget.FrameLayout {
    private float reveal;

    public RevealFrame(android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>(r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.reveal = r2
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas r5) {
            r4 = this;
            java.lang.String r0 = "canvas"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r5.save()
            int r1 = r4.getWidth()
            float r1 = (float) r1
            int r2 = r4.getHeight()
            float r2 = (float) r2
            float r3 = r4.reveal
            float r2 = r2 * r3
            r3 = 0
            r5.clipRect(r3, r3, r1, r2)
            super.dispatchDraw(r5)
            r5.restoreToCount(r0)
            return
    }

    public final float getReveal() {
            r1 = this;
            float r0 = r1.reveal
            return r0
    }

    public final void setReveal(float r1) {
            r0 = this;
            r0.reveal = r1
            r0.invalidate()
            return
    }
}
