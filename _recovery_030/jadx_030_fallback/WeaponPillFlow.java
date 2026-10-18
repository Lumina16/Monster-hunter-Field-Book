package com.lumina.monsterhunterfieldbook;

/* compiled from: WeaponsScreen.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0014J0\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/WeaponPillFlow;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "gap", "", "<init>", "(Landroid/content/Context;I)V", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "left", "top", "right", "bottom", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
final class WeaponPillFlow extends android.view.ViewGroup {
    private final int gap;

    public WeaponPillFlow(android.content.Context r2, int r3) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>(r2)
            r1.gap = r3
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
            r5 = this;
            int r9 = r9 - r7
            int r6 = r5.getChildCount()
            r7 = 0
            r8 = r7
            r10 = r8
            r0 = r10
            r1 = r0
        La:
            if (r8 >= r6) goto L3f
            android.view.View r2 = r5.getChildAt(r8)
            if (r10 <= 0) goto L1f
            int r3 = r2.getMeasuredWidth()
            int r3 = r3 + r10
            if (r3 <= r9) goto L1f
            int r10 = r5.gap
            int r1 = r1 + r10
            int r0 = r0 + r1
            r10 = r7
            r1 = r10
        L1f:
            int r3 = r2.getMeasuredWidth()
            int r3 = r3 + r10
            int r4 = r2.getMeasuredHeight()
            int r4 = r4 + r0
            r2.layout(r10, r0, r3, r4)
            int r3 = r2.getMeasuredWidth()
            int r4 = r5.gap
            int r3 = r3 + r4
            int r10 = r10 + r3
            int r2 = r2.getMeasuredHeight()
            int r1 = java.lang.Math.max(r1, r2)
            int r8 = r8 + 1
            goto La
        L3f:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r10, int r11) {
            r9 = this;
            int r10 = android.view.View.MeasureSpec.getSize(r10)
            int r0 = r9.getChildCount()
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
        Ld:
            if (r2 >= r0) goto L42
            android.view.View r6 = r9.getChildAt(r2)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r7)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
            r6.measure(r7, r8)
            if (r5 <= 0) goto L2f
            int r7 = r6.getMeasuredWidth()
            int r7 = r7 + r5
            if (r7 <= r10) goto L2f
            int r5 = r9.gap
            int r4 = r4 + r5
            int r3 = r3 + r4
            r4 = r1
            r5 = r4
        L2f:
            int r7 = r6.getMeasuredWidth()
            int r8 = r9.gap
            int r7 = r7 + r8
            int r5 = r5 + r7
            int r6 = r6.getMeasuredHeight()
            int r4 = java.lang.Math.max(r4, r6)
            int r2 = r2 + 1
            goto Ld
        L42:
            int r3 = r3 + r4
            int r11 = android.view.ViewGroup.resolveSize(r3, r11)
            r9.setMeasuredDimension(r10, r11)
            return
    }
}
