package com.lumina.monsterhunterfieldbook;

/* compiled from: WeaponProfilePanel.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a2\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\u0010"}, d2 = {"weaponElements", "Landroid/view/ViewGroup;", "a", "Lcom/lumina/monsterhunterfieldbook/MainActivity;", "record", "Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "size", "", "colour", "", "weaponElement", "Landroid/widget/LinearLayout;", "name", "", "value", "Lorg/json/JSONObject;", "app_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WeaponProfilePanelKt {
    public static final /* synthetic */ android.widget.LinearLayout access$weaponElement(com.lumina.monsterhunterfieldbook.MainActivity r0, java.lang.String r1, org.json.JSONObject r2, float r3, int r4) {
            android.widget.LinearLayout r0 = weaponElement(r0, r1, r2, r3, r4)
            return r0
    }

    public static final /* synthetic */ android.view.ViewGroup access$weaponElements(com.lumina.monsterhunterfieldbook.MainActivity r0, com.lumina.monsterhunterfieldbook.FieldRecord r1, float r2, int r3) {
            android.view.ViewGroup r0 = weaponElements(r0, r1, r2, r3)
            return r0
    }

    private static final android.widget.LinearLayout weaponElement(com.lumina.monsterhunterfieldbook.MainActivity r8, java.lang.String r9, org.json.JSONObject r10, float r11, int r12) {
            android.widget.LinearLayout r0 = r8.row()
            com.lumina.monsterhunterfieldbook.WeaponModel r1 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            java.lang.String r1 = r1.effectPath(r8, r9)
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = kotlin.text.StringsKt.isBlank(r2)
            if (r2 != 0) goto L59
            android.widget.ImageView r2 = new android.widget.ImageView
            r3 = r8
            android.content.Context r3 = (android.content.Context) r3
            r2.<init>(r3)
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.FIT_CENTER
            r2.setScaleType(r3)
            r3 = 2
            r2.setImportantForAccessibility(r3)
            r3 = r2
            android.view.View r3 = (android.view.View) r3
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = 18
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r8.dp(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r8.dp(r5)
            r4.<init>(r6, r5)
            r5 = 7
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r8.dp(r5)
            r4.rightMargin = r5
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            android.view.ViewGroup$LayoutParams r4 = (android.view.ViewGroup.LayoutParams) r4
            r0.addView(r3, r4)
            r8.assetImage(r1, r2)
        L59:
            java.lang.String r1 = ""
            if (r10 == 0) goto L8e
            com.lumina.monsterhunterfieldbook.WeaponModel r2 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            java.lang.String r3 = "value"
            boolean r4 = r10.isNull(r3)
            if (r4 == 0) goto L69
            java.lang.String r3 = "damage"
        L69:
            java.lang.Object r3 = r10.opt(r3)
            java.lang.String r2 = r2.shown(r3)
            java.lang.String r3 = "hidden"
            boolean r10 = r10.optBoolean(r3)
            if (r10 == 0) goto L7b
            java.lang.String r1 = " (hidden)"
        L7b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r3 = " "
            r10.<init>(r3)
            java.lang.StringBuilder r10 = r10.append(r2)
            java.lang.StringBuilder r10 = r10.append(r1)
            java.lang.String r1 = r10.toString()
        L8e:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.StringBuilder r9 = r10.append(r9)
            java.lang.StringBuilder r9 = r9.append(r1)
            java.lang.String r2 = r9.toString()
            r6 = 4
            r7 = 0
            r4 = 0
            r1 = r8
            r3 = r11
            r5 = r12
            android.widget.TextView r8 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r1, r2, r3, r4, r5, r6, r7)
            android.view.View r8 = (android.view.View) r8
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r10 = -2
            r9.<init>(r10, r10)
            android.view.ViewGroup$LayoutParams r9 = (android.view.ViewGroup.LayoutParams) r9
            r0.addView(r8, r9)
            return r0
    }

    private static final android.view.ViewGroup weaponElements(com.lumina.monsterhunterfieldbook.MainActivity r9, com.lumina.monsterhunterfieldbook.FieldRecord r10, float r11, int r12) {
            com.lumina.monsterhunterfieldbook.WeaponFlowLayout r0 = new com.lumina.monsterhunterfieldbook.WeaponFlowLayout
            r1 = 8
            r2 = 5
            r0.<init>(r9, r1, r2)
            com.lumina.monsterhunterfieldbook.WeaponModel r1 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            java.util.List r10 = r1.elements(r10)
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto L26
            r7 = 4
            r8 = 0
            java.lang.String r3 = "—"
            r5 = 0
            r2 = r9
            r4 = r11
            r6 = r12
            android.widget.TextView r9 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r2, r3, r4, r5, r6, r7, r8)
            android.view.View r9 = (android.view.View) r9
            r0.addView(r9)
            goto L29
        L26:
            r2 = r9
            r4 = r11
            r6 = r12
        L29:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r9 = r10.iterator()
        L2f:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L57
            java.lang.Object r10 = r9.next()
            kotlin.Pair r10 = (kotlin.Pair) r10
            java.lang.Object r11 = r10.component1()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r10.component2()
            org.json.JSONObject r10 = (org.json.JSONObject) r10
            android.widget.LinearLayout r10 = weaponElement(r2, r11, r10, r4, r6)
            android.view.View r10 = (android.view.View) r10
            android.view.ViewGroup$LayoutParams r11 = new android.view.ViewGroup$LayoutParams
            r12 = -2
            r11.<init>(r12, r12)
            r0.addView(r10, r11)
            goto L2f
        L57:
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            return r0
    }
}
