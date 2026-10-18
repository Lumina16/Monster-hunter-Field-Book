package com.lumina.monsterhunterfieldbook;

import android.view.View;
import android.widget.AdapterView;
import com.lumina.monsterhunterfieldbook.WeaponTreePanel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WeaponTreePanel.kt */
@Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005H\u0016¨\u0006\r"}, d2 = {"com/lumina/monsterhunterfieldbook/WeaponTreePanel$bindFamilies$2", "Landroid/widget/AdapterView$OnItemSelectedListener;", "onItemSelected", "", "parent", "Landroid/widget/AdapterView;", "view", "Landroid/view/View;", "position", "", "id", "", "onNothingSelected", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WeaponTreePanel$bindFamilies$2 implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ List<String> $ids;
    final /* synthetic */ WeaponTreePanel this$0;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> parent) {
    }

    WeaponTreePanel$bindFamilies$2(WeaponTreePanel weaponTreePanel, List<String> list) {
        this.this$0 = weaponTreePanel;
        this.$ids = list;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        boolean z;
        List<FieldRecord> list;
        WeaponTreePanel.TreeViewport treeViewport;
        WeaponTreePanel.TreeViewport treeViewport2;
        z = this.this$0.selectorReady;
        if (!z) {
            this.this$0.selectorReady = true;
            if (Intrinsics.areEqual(this.$ids.get(position), this.this$0.graph.getFamily())) {
                return;
            }
        }
        String str = this.$ids.get(position);
        if (Intrinsics.areEqual(str, this.this$0.getState().optString("family"))) {
            return;
        }
        this.this$0.getState().put("family", str).put("treeInitialized", false).put("treeDetails", false);
        this.this$0.hideMaterials(false);
        WeaponTreePanel weaponTreePanel = this.this$0;
        WeaponTreeLayout weaponTreeLayout = WeaponTreeLayout.INSTANCE;
        list = this.this$0.records;
        weaponTreePanel.graph = weaponTreeLayout.build(list, str, this.this$0.selectedId());
        this.this$0.writeGraphState();
        treeViewport = this.this$0.viewport;
        treeViewport.populate();
        treeViewport2 = this.this$0.viewport;
        final WeaponTreePanel weaponTreePanel2 = this.this$0;
        treeViewport2.post(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.WeaponTreePanel$bindFamilies$2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                WeaponTreePanel$bindFamilies$2.onItemSelected$lambda$0(WeaponTreePanel.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onItemSelected$lambda$0(WeaponTreePanel weaponTreePanel) {
        WeaponTreePanel.TreeViewport treeViewport;
        WeaponTreePanel.TreeViewport treeViewport2;
        treeViewport = weaponTreePanel.viewport;
        if (treeViewport.getWidth() > 0) {
            treeViewport2 = weaponTreePanel.viewport;
            if (treeViewport2.getHeight() > 0) {
                weaponTreePanel.resetViewport();
            }
        }
    }
}
