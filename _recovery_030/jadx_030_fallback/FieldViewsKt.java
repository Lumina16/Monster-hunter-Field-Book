package com.lumina.monsterhunterfieldbook;

/* compiled from: FieldViews.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\b"}, d2 = {"blend", "", "a", "b", "t", "", "alphaColour", "c", "app_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FieldViewsKt {
    public static final int alphaColour(int r2, int r3) {
            int r0 = android.graphics.Color.red(r2)
            int r1 = android.graphics.Color.green(r2)
            int r2 = android.graphics.Color.blue(r2)
            int r2 = android.graphics.Color.argb(r3, r0, r1, r2)
            return r2
    }

    public static final int blend(int r4, int r5, float r6) {
            int r0 = android.graphics.Color.red(r4)
            float r0 = (float) r0
            r1 = 1
            float r1 = (float) r1
            float r1 = r1 - r6
            float r0 = r0 * r1
            int r2 = android.graphics.Color.red(r5)
            float r2 = (float) r2
            float r2 = r2 * r6
            float r0 = r0 + r2
            int r0 = (int) r0
            int r2 = android.graphics.Color.green(r4)
            float r2 = (float) r2
            float r2 = r2 * r1
            int r3 = android.graphics.Color.green(r5)
            float r3 = (float) r3
            float r3 = r3 * r6
            float r2 = r2 + r3
            int r2 = (int) r2
            int r4 = android.graphics.Color.blue(r4)
            float r4 = (float) r4
            float r4 = r4 * r1
            int r5 = android.graphics.Color.blue(r5)
            float r5 = (float) r5
            float r5 = r5 * r6
            float r4 = r4 + r5
            int r4 = (int) r4
            int r4 = android.graphics.Color.rgb(r0, r2, r4)
            return r4
    }
}
