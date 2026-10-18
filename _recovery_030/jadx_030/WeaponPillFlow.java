package com.lumina.monsterhunterfieldbook;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WeaponsScreen.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0014J0\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/WeaponPillFlow;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "gap", "", "<init>", "(Landroid/content/Context;I)V", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "left", "top", "right", "bottom", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
final class WeaponPillFlow extends ViewGroup {
    private final int gap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeaponPillFlow(Context context, int i) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.gap = i;
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int childCount = getChildCount();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, IntCompanionObject.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            if (i3 > 0 && childAt.getMeasuredWidth() + i3 > size) {
                i += i2 + this.gap;
                i2 = 0;
                i3 = 0;
            }
            i3 += childAt.getMeasuredWidth() + this.gap;
            i2 = Math.max(i2, childAt.getMeasuredHeight());
        }
        setMeasuredDimension(size, ViewGroup.resolveSize(i + i2, heightMeasureSpec));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int i = right - left;
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (i2 > 0 && childAt.getMeasuredWidth() + i2 > i) {
                i3 += i4 + this.gap;
                i2 = 0;
                i4 = 0;
            }
            childAt.layout(i2, i3, childAt.getMeasuredWidth() + i2, childAt.getMeasuredHeight() + i3);
            i2 += childAt.getMeasuredWidth() + this.gap;
            i4 = Math.max(i4, childAt.getMeasuredHeight());
        }
    }
}
