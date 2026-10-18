package com.lumina.monsterhunterfieldbook;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: WeaponProfilePanel.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/WeaponSharpnessView;", "Landroid/view/View;", "a", "Lcom/lumina/monsterhunterfieldbook/MainActivity;", "values", "", "", "<init>", "(Lcom/lumina/monsterhunterfieldbook/MainActivity;Ljava/util/List;)V", "colours", "", "paint", "Landroid/graphics/Paint;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
final class WeaponSharpnessView extends View {
    private final int[] colours;
    private final Paint paint;
    private final List<Float> values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeaponSharpnessView(MainActivity a, List<Float> values) {
        super(a);
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(values, "values");
        this.values = values;
        this.colours = new int[]{Color.rgb(197, 64, 54), Color.rgb(217, 113, 47), Color.rgb(216, 189, 82), Color.rgb(117, 161, 84), Color.rgb(82, 147, 202), Color.rgb(236, 235, 220), Color.rgb(168, 131, 206)};
        this.paint = new Paint(1);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Float valueOf = Float.valueOf(CollectionsKt.sumOfFloat(this.values));
        if (valueOf.floatValue() <= 0.0f) {
            valueOf = null;
        }
        float floatValue = valueOf != null ? valueOf.floatValue() : 1.0f;
        int i = 0;
        float f = 0.0f;
        for (Object obj : this.values) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            float floatValue2 = ((Number) obj).floatValue();
            this.paint.setColor(this.colours[RangesKt.coerceAtMost(i, 6)]);
            float width = f + ((getWidth() * floatValue2) / floatValue);
            canvas.drawRect(f, 0.0f, width, getHeight(), this.paint);
            f = width;
            i = i2;
        }
    }
}
