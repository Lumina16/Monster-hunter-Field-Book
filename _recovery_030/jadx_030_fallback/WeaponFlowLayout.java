package com.lumina.monsterhunterfieldbook;

/* compiled from: WeaponProfilePanel.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0014J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0014J0\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/WeaponFlowLayout;", "Landroid/view/ViewGroup;", "a", "Lcom/lumina/monsterhunterfieldbook/MainActivity;", "gap", "", "rowGap", "<init>", "(Lcom/lumina/monsterhunterfieldbook/MainActivity;II)V", "gapPx", "rowGapPx", "positions", "", "Landroid/graphics/Rect;", "generateDefaultLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "left", "top", "right", "bottom", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
final class WeaponFlowLayout extends android.view.ViewGroup {
    private final com.lumina.monsterhunterfieldbook.MainActivity a;
    private final int gapPx;
    private final java.util.List<android.graphics.Rect> positions;
    private final int rowGapPx;

    public WeaponFlowLayout(com.lumina.monsterhunterfieldbook.MainActivity r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = "a"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = r2
            android.content.Context r0 = (android.content.Context) r0
            r1.<init>(r0)
            r1.a = r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r2.dp(r3)
            r1.gapPx = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.Number r3 = (java.lang.Number) r3
            int r2 = r2.dp(r3)
            r1.rowGapPx = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
            r1.positions = r2
            return
    }

    public /* synthetic */ WeaponFlowLayout(com.lumina.monsterhunterfieldbook.MainActivity r2, int r3, int r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
            r1 = this;
            r6 = r5 & 2
            r0 = 8
            if (r6 == 0) goto L7
            r3 = r0
        L7:
            r5 = r5 & 4
            if (r5 == 0) goto Lc
            r4 = r0
        Lc:
            r1.<init>(r2, r3, r4)
            return
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            int r3 = r2.getChildCount()
            r4 = 0
        L5:
            if (r4 >= r3) goto L24
            java.util.List<android.graphics.Rect> r5 = r2.positions
            java.lang.Object r5 = kotlin.collections.CollectionsKt.getOrNull(r5, r4)
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            if (r5 != 0) goto L12
            goto L21
        L12:
            android.view.View r6 = r2.getChildAt(r4)
            int r7 = r5.left
            int r0 = r5.top
            int r1 = r5.right
            int r5 = r5.bottom
            r6.layout(r7, r0, r1, r5)
        L21:
            int r4 = r4 + 1
            goto L5
        L24:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r19, int r20) {
            r18 = this;
            r0 = r18
            r1 = r20
            int r2 = android.view.View.MeasureSpec.getSize(r19)
            int r3 = r0.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r0.getPaddingRight()
            int r2 = r2 - r3
            r3 = 1
            int r2 = kotlin.ranges.RangesKt.coerceAtLeast(r2, r3)
            java.util.List<android.graphics.Rect> r3 = r0.positions
            r3.clear()
            int r3 = r0.getChildCount()
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
        L25:
            if (r5 >= r3) goto L9b
            android.view.View r10 = r0.getChildAt(r5)
            int r11 = r10.getVisibility()
            r12 = 8
            if (r11 != r12) goto L3e
            java.util.List<android.graphics.Rect> r10 = r0.positions
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r10.add(r11)
            goto L98
        L3e:
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r11)
            r0.measureChild(r10, r11, r1)
            if (r7 <= 0) goto L5d
            int r11 = r10.getMeasuredWidth()
            int r11 = r11 + r7
            if (r11 <= r2) goto L5d
            int r11 = r0.gapPx
            int r7 = r7 - r11
            int r6 = java.lang.Math.max(r6, r7)
            int r7 = r0.rowGapPx
            int r9 = r9 + r7
            int r8 = r8 + r9
            r7 = 0
            r9 = 0
        L5d:
            java.util.List<android.graphics.Rect> r11 = r0.positions
            android.graphics.Rect r12 = new android.graphics.Rect
            int r13 = r0.getPaddingLeft()
            int r13 = r13 + r7
            int r14 = r0.getPaddingTop()
            int r14 = r14 + r8
            int r15 = r0.getPaddingLeft()
            int r15 = r15 + r7
            int r16 = r10.getMeasuredWidth()
            int r15 = r15 + r16
            int r16 = r0.getPaddingTop()
            int r16 = r16 + r8
            int r17 = r10.getMeasuredHeight()
            int r4 = r16 + r17
            r12.<init>(r13, r14, r15, r4)
            r11.add(r12)
            int r4 = r10.getMeasuredWidth()
            int r11 = r0.gapPx
            int r4 = r4 + r11
            int r7 = r7 + r4
            int r4 = r10.getMeasuredHeight()
            int r9 = java.lang.Math.max(r9, r4)
        L98:
            int r5 = r5 + 1
            goto L25
        L9b:
            int r2 = r0.gapPx
            int r7 = r7 - r2
            r2 = 0
            int r2 = kotlin.ranges.RangesKt.coerceAtLeast(r7, r2)
            int r2 = java.lang.Math.max(r6, r2)
            int r3 = r0.getPaddingLeft()
            int r2 = r2 + r3
            int r3 = r0.getPaddingRight()
            int r2 = r2 + r3
            r3 = r19
            int r2 = android.view.ViewGroup.resolveSize(r2, r3)
            int r8 = r8 + r9
            int r3 = r0.getPaddingTop()
            int r8 = r8 + r3
            int r3 = r0.getPaddingBottom()
            int r8 = r8 + r3
            int r1 = android.view.ViewGroup.resolveSize(r8, r1)
            r0.setMeasuredDimension(r2, r1)
            return
    }
}
