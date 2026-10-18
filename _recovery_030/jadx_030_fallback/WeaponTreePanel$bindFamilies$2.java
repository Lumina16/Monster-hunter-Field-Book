package com.lumina.monsterhunterfieldbook;

/* compiled from: WeaponTreePanel.kt */
@kotlin.Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005H\u0016¨\u0006\r"}, d2 = {"com/lumina/monsterhunterfieldbook/WeaponTreePanel$bindFamilies$2", "Landroid/widget/AdapterView$OnItemSelectedListener;", "onItemSelected", "", "parent", "Landroid/widget/AdapterView;", "view", "Landroid/view/View;", "position", "", "id", "", "onNothingSelected", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WeaponTreePanel$bindFamilies$2 implements android.widget.AdapterView.OnItemSelectedListener {
    final /* synthetic */ java.util.List<java.lang.String> $ids;
    final /* synthetic */ com.lumina.monsterhunterfieldbook.WeaponTreePanel this$0;

    public static /* synthetic */ void $r8$lambda$6dNRzkohJz6ZVmvXz1EIDjGp0hQ(com.lumina.monsterhunterfieldbook.WeaponTreePanel r0) {
            onItemSelected$lambda$0(r0)
            return
    }

    WeaponTreePanel$bindFamilies$2(com.lumina.monsterhunterfieldbook.WeaponTreePanel r1, java.util.List<java.lang.String> r2) {
            r0 = this;
            r0.this$0 = r1
            r0.$ids = r2
            r0.<init>()
            return
    }

    private static final void onItemSelected$lambda$0(com.lumina.monsterhunterfieldbook.WeaponTreePanel r1) {
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeViewport r0 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getViewport$p(r1)
            int r0 = r0.getWidth()
            if (r0 <= 0) goto L17
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeViewport r0 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getViewport$p(r1)
            int r0 = r0.getHeight()
            if (r0 <= 0) goto L17
            r1.resetViewport()
        L17:
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            com.lumina.monsterhunterfieldbook.WeaponTreePanel r1 = r0.this$0
            boolean r1 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getSelectorReady$p(r1)
            if (r1 != 0) goto L25
            com.lumina.monsterhunterfieldbook.WeaponTreePanel r1 = r0.this$0
            r2 = 1
            com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$setSelectorReady$p(r1, r2)
            java.util.List<java.lang.String> r1 = r0.$ids
            java.lang.Object r1 = r1.get(r3)
            com.lumina.monsterhunterfieldbook.WeaponTreePanel r2 = r0.this$0
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r2 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getGraph$p(r2)
            java.lang.String r2 = r2.getFamily()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == 0) goto L25
            goto L3f
        L25:
            java.util.List<java.lang.String> r1 = r0.$ids
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            com.lumina.monsterhunterfieldbook.WeaponTreePanel r2 = r0.this$0
            org.json.JSONObject r2 = r2.getState()
            java.lang.String r3 = "family"
            java.lang.String r2 = r2.optString(r3)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r2 == 0) goto L40
        L3f:
            return
        L40:
            com.lumina.monsterhunterfieldbook.WeaponTreePanel r2 = r0.this$0
            org.json.JSONObject r2 = r2.getState()
            org.json.JSONObject r2 = r2.put(r3, r1)
            java.lang.String r3 = "treeInitialized"
            r4 = 0
            org.json.JSONObject r2 = r2.put(r3, r4)
            java.lang.String r3 = "treeDetails"
            r2.put(r3, r4)
            com.lumina.monsterhunterfieldbook.WeaponTreePanel r2 = r0.this$0
            com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$hideMaterials(r2, r4)
            com.lumina.monsterhunterfieldbook.WeaponTreePanel r2 = r0.this$0
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout r3 = com.lumina.monsterhunterfieldbook.WeaponTreeLayout.INSTANCE
            com.lumina.monsterhunterfieldbook.WeaponTreePanel r4 = r0.this$0
            java.util.List r4 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getRecords$p(r4)
            com.lumina.monsterhunterfieldbook.WeaponTreePanel r5 = r0.this$0
            java.lang.String r5 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$selectedId(r5)
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r1 = r3.build(r4, r1, r5)
            com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$setGraph$p(r2, r1)
            com.lumina.monsterhunterfieldbook.WeaponTreePanel r1 = r0.this$0
            com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$writeGraphState(r1)
            com.lumina.monsterhunterfieldbook.WeaponTreePanel r1 = r0.this$0
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeViewport r1 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getViewport$p(r1)
            r1.populate()
            com.lumina.monsterhunterfieldbook.WeaponTreePanel r1 = r0.this$0
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeViewport r1 = com.lumina.monsterhunterfieldbook.WeaponTreePanel.access$getViewport$p(r1)
            com.lumina.monsterhunterfieldbook.WeaponTreePanel r2 = r0.this$0
            com.lumina.monsterhunterfieldbook.WeaponTreePanel$bindFamilies$2$$ExternalSyntheticLambda0 r3 = new com.lumina.monsterhunterfieldbook.WeaponTreePanel$bindFamilies$2$$ExternalSyntheticLambda0
            r3.<init>(r2)
            r1.post(r3)
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView<?> r1) {
            r0 = this;
            return
    }
}
