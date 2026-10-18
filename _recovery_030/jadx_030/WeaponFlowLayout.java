package com.lumina.monsterhunterfieldbook;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: WeaponProfilePanel.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0014J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0014J0\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/WeaponFlowLayout;", "Landroid/view/ViewGroup;", "a", "Lcom/lumina/monsterhunterfieldbook/MainActivity;", "gap", "", "rowGap", "<init>", "(Lcom/lumina/monsterhunterfieldbook/MainActivity;II)V", "gapPx", "rowGapPx", "positions", "", "Landroid/graphics/Rect;", "generateDefaultLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "left", "top", "right", "bottom", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
final class WeaponFlowLayout extends ViewGroup {
    private final MainActivity a;
    private final int gapPx;
    private final List<Rect> positions;
    private final int rowGapPx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeaponFlowLayout(MainActivity a, int i, int i2) {
        super(a);
        Intrinsics.checkNotNullParameter(a, "a");
        this.a = a;
        this.gapPx = a.dp(Integer.valueOf(i));
        this.rowGapPx = a.dp(Integer.valueOf(i2));
        this.positions = new ArrayList();
    }

    public /* synthetic */ WeaponFlowLayout(MainActivity mainActivity, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(mainActivity, (i3 & 2) != 0 ? 8 : i, (i3 & 4) != 0 ? 8 : i2);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int coerceAtLeast = RangesKt.coerceAtLeast((View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingLeft()) - getPaddingRight(), 1);
        this.positions.clear();
        int childCount = getChildCount();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() == 8) {
                this.positions.add(new Rect());
            } else {
                measureChild(childAt, View.MeasureSpec.makeMeasureSpec(coerceAtLeast, IntCompanionObject.MIN_VALUE), heightMeasureSpec);
                if (i2 > 0 && childAt.getMeasuredWidth() + i2 > coerceAtLeast) {
                    i = Math.max(i, i2 - this.gapPx);
                    i3 += i4 + this.rowGapPx;
                    i2 = 0;
                    i4 = 0;
                }
                this.positions.add(new Rect(getPaddingLeft() + i2, getPaddingTop() + i3, getPaddingLeft() + i2 + childAt.getMeasuredWidth(), getPaddingTop() + i3 + childAt.getMeasuredHeight()));
                i2 += childAt.getMeasuredWidth() + this.gapPx;
                i4 = Math.max(i4, childAt.getMeasuredHeight());
            }
        }
        setMeasuredDimension(ViewGroup.resolveSize(Math.max(i, RangesKt.coerceAtLeast(i2 - this.gapPx, 0)) + getPaddingLeft() + getPaddingRight(), widthMeasureSpec), ViewGroup.resolveSize(i3 + i4 + getPaddingTop() + getPaddingBottom(), heightMeasureSpec));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            Rect rect = (Rect) CollectionsKt.getOrNull(this.positions, i);
            if (rect != null) {
                getChildAt(i).layout(rect.left, rect.top, rect.right, rect.bottom);
            }
        }
    }
}
