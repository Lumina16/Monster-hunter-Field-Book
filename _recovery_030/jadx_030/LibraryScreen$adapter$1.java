package com.lumina.monsterhunterfieldbook;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LibraryScreen.kt */
@Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\"\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"com/lumina/monsterhunterfieldbook/LibraryScreen$adapter$1", "Landroid/widget/BaseAdapter;", "getCount", "", "getItem", "Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "position", "getItemId", "", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LibraryScreen$adapter$1 extends BaseAdapter {
    final /* synthetic */ LibraryScreen this$0;

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        return position;
    }

    LibraryScreen$adapter$1(LibraryScreen libraryScreen) {
        this.this$0 = libraryScreen;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List list;
        list = this.this$0.records;
        return list.size();
    }

    @Override // android.widget.Adapter
    public FieldRecord getItem(int position) {
        List list;
        list = this.this$0.records;
        return (FieldRecord) list.get(position);
    }

    @Override // android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        List list;
        boolean isGrid;
        boolean z;
        String str;
        Map map;
        View gridCard;
        Intrinsics.checkNotNullParameter(parent, "parent");
        list = this.this$0.records;
        final FieldRecord fieldRecord = (FieldRecord) list.get(position);
        isGrid = this.this$0.isGrid();
        if (isGrid) {
            gridCard = this.this$0.gridCard(fieldRecord);
            return gridCard;
        }
        MainActivity mainActivity = this.this$0.a;
        final LibraryScreen libraryScreen = this.this$0;
        LinearLayout recordRow = mainActivity.recordRow(fieldRecord, new Function0() { // from class: com.lumina.monsterhunterfieldbook.LibraryScreen$adapter$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit view$lambda$0;
                view$lambda$0 = LibraryScreen$adapter$1.getView$lambda$0(LibraryScreen.this, fieldRecord);
                return view$lambda$0;
            }
        });
        LibraryScreen libraryScreen2 = this.this$0;
        z = libraryScreen2.tree;
        if (z) {
            MainActivity mainActivity2 = libraryScreen2.a;
            map = libraryScreen2.depths;
            Integer num = (Integer) map.get(fieldRecord.getId());
            recordRow.setPadding(mainActivity2.dp(Integer.valueOf(((num != null ? num.intValue() : 0) * 15) + 10)), recordRow.getPaddingTop(), recordRow.getPaddingRight(), recordRow.getPaddingBottom());
        }
        String id = fieldRecord.getId();
        str = libraryScreen2.selection;
        if (Intrinsics.areEqual(id, str)) {
            recordRow.setBackground(MainActivity.surface$default(libraryScreen2.a, 0, false, 0.0f, 7, null));
        }
        return recordRow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getView$lambda$0(LibraryScreen libraryScreen, FieldRecord fieldRecord) {
        libraryScreen.select(fieldRecord);
        return Unit.INSTANCE;
    }
}
