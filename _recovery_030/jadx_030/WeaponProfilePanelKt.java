package com.lumina.monsterhunterfieldbook;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: WeaponProfilePanel.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a2\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\u0010"}, d2 = {"weaponElements", "Landroid/view/ViewGroup;", "a", "Lcom/lumina/monsterhunterfieldbook/MainActivity;", "record", "Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "size", "", "colour", "", "weaponElement", "Landroid/widget/LinearLayout;", "name", "", "value", "Lorg/json/JSONObject;", "app_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WeaponProfilePanelKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup weaponElements(MainActivity mainActivity, FieldRecord fieldRecord, float f, int i) {
        MainActivity mainActivity2;
        float f2;
        int i2;
        WeaponFlowLayout weaponFlowLayout = new WeaponFlowLayout(mainActivity, 8, 5);
        List<Pair<String, JSONObject>> elements = WeaponModel.INSTANCE.elements(fieldRecord);
        if (elements.isEmpty()) {
            mainActivity2 = mainActivity;
            f2 = f;
            i2 = i;
            weaponFlowLayout.addView(MainActivity.text$default(mainActivity2, "—", f2, false, i2, 4, null));
        } else {
            mainActivity2 = mainActivity;
            f2 = f;
            i2 = i;
        }
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            weaponFlowLayout.addView(weaponElement(mainActivity2, (String) pair.component1(), (JSONObject) pair.component2(), f2, i2), new ViewGroup.LayoutParams(-2, -2));
        }
        return weaponFlowLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout weaponElement(MainActivity mainActivity, String str, JSONObject jSONObject, float f, int i) {
        String str2;
        LinearLayout row = mainActivity.row();
        String effectPath = WeaponModel.INSTANCE.effectPath(mainActivity, str);
        if (!StringsKt.isBlank(effectPath)) {
            ImageView imageView = new ImageView(mainActivity);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImportantForAccessibility(2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(mainActivity.dp((Number) 18), mainActivity.dp((Number) 18));
            layoutParams.rightMargin = mainActivity.dp((Number) 7);
            Unit unit = Unit.INSTANCE;
            row.addView(imageView, layoutParams);
            mainActivity.assetImage(effectPath, imageView);
        }
        if (jSONObject != null) {
            str2 = " " + WeaponModel.INSTANCE.shown(jSONObject.opt(jSONObject.isNull("value") ? "damage" : "value")) + (jSONObject.optBoolean("hidden") ? " (hidden)" : "");
        }
        row.addView(MainActivity.text$default(mainActivity, str + str2, f, false, i, 4, null), new LinearLayout.LayoutParams(-2, -2));
        return row;
    }
}
