package com.lumina.monsterhunterfieldbook;

/* compiled from: LibraryScreen.kt */
@kotlin.Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\"\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"com/lumina/monsterhunterfieldbook/LibraryScreen$adapter$1", "Landroid/widget/BaseAdapter;", "getCount", "", "getItem", "Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "position", "getItemId", "", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LibraryScreen$adapter$1 extends android.widget.BaseAdapter {
    final /* synthetic */ com.lumina.monsterhunterfieldbook.LibraryScreen this$0;

    /* renamed from: $r8$lambda$BtwfEl69WTgTjceK8nemqRvs-4A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13$r8$lambda$BtwfEl69WTgTjceK8nemqRvs4A(com.lumina.monsterhunterfieldbook.LibraryScreen r0, com.lumina.monsterhunterfieldbook.FieldRecord r1) {
            kotlin.Unit r0 = getView$lambda$0(r0, r1)
            return r0
    }

    LibraryScreen$adapter$1(com.lumina.monsterhunterfieldbook.LibraryScreen r1) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>()
            return
    }

    private static final kotlin.Unit getView$lambda$0(com.lumina.monsterhunterfieldbook.LibraryScreen r0, com.lumina.monsterhunterfieldbook.FieldRecord r1) {
            com.lumina.monsterhunterfieldbook.LibraryScreen.access$select(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r1 = this;
            com.lumina.monsterhunterfieldbook.LibraryScreen r0 = r1.this$0
            java.util.List r0 = com.lumina.monsterhunterfieldbook.LibraryScreen.access$getRecords$p(r0)
            int r0 = r0.size()
            return r0
    }

    @Override // android.widget.Adapter
    public com.lumina.monsterhunterfieldbook.FieldRecord getItem(int r2) {
            r1 = this;
            com.lumina.monsterhunterfieldbook.LibraryScreen r0 = r1.this$0
            java.util.List r0 = com.lumina.monsterhunterfieldbook.LibraryScreen.access$getRecords$p(r0)
            java.lang.Object r2 = r0.get(r2)
            com.lumina.monsterhunterfieldbook.FieldRecord r2 = (com.lumina.monsterhunterfieldbook.FieldRecord) r2
            return r2
    }

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
            r0 = this;
            com.lumina.monsterhunterfieldbook.FieldRecord r1 = r0.getItem(r1)
            return r1
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            long r0 = (long) r3
            return r0
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
            r6 = this;
            java.lang.String r8 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r8)
            com.lumina.monsterhunterfieldbook.LibraryScreen r8 = r6.this$0
            java.util.List r8 = com.lumina.monsterhunterfieldbook.LibraryScreen.access$getRecords$p(r8)
            java.lang.Object r7 = r8.get(r7)
            com.lumina.monsterhunterfieldbook.FieldRecord r7 = (com.lumina.monsterhunterfieldbook.FieldRecord) r7
            com.lumina.monsterhunterfieldbook.LibraryScreen r8 = r6.this$0
            boolean r8 = com.lumina.monsterhunterfieldbook.LibraryScreen.access$isGrid(r8)
            if (r8 == 0) goto L20
            com.lumina.monsterhunterfieldbook.LibraryScreen r8 = r6.this$0
            android.view.View r7 = com.lumina.monsterhunterfieldbook.LibraryScreen.access$gridCard(r8, r7)
            return r7
        L20:
            com.lumina.monsterhunterfieldbook.LibraryScreen r8 = r6.this$0
            com.lumina.monsterhunterfieldbook.MainActivity r8 = com.lumina.monsterhunterfieldbook.LibraryScreen.access$getA$p(r8)
            com.lumina.monsterhunterfieldbook.LibraryScreen r9 = r6.this$0
            com.lumina.monsterhunterfieldbook.LibraryScreen$adapter$1$$ExternalSyntheticLambda0 r0 = new com.lumina.monsterhunterfieldbook.LibraryScreen$adapter$1$$ExternalSyntheticLambda0
            r0.<init>(r9, r7)
            android.widget.LinearLayout r8 = r8.recordRow(r7, r0)
            com.lumina.monsterhunterfieldbook.LibraryScreen r9 = r6.this$0
            boolean r0 = com.lumina.monsterhunterfieldbook.LibraryScreen.access$getTree$p(r9)
            if (r0 == 0) goto L70
            com.lumina.monsterhunterfieldbook.MainActivity r0 = com.lumina.monsterhunterfieldbook.LibraryScreen.access$getA$p(r9)
            java.util.Map r1 = com.lumina.monsterhunterfieldbook.LibraryScreen.access$getDepths$p(r9)
            java.lang.String r2 = r7.getId()
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L52
            int r1 = r1.intValue()
            goto L53
        L52:
            r1 = 0
        L53:
            int r1 = r1 * 15
            int r1 = r1 + 10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r0.dp(r1)
            int r1 = r8.getPaddingTop()
            int r2 = r8.getPaddingRight()
            int r3 = r8.getPaddingBottom()
            r8.setPadding(r0, r1, r2, r3)
        L70:
            java.lang.String r7 = r7.getId()
            java.lang.String r0 = com.lumina.monsterhunterfieldbook.LibraryScreen.access$getSelection$p(r9)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r0)
            if (r7 == 0) goto L90
            com.lumina.monsterhunterfieldbook.MainActivity r0 = com.lumina.monsterhunterfieldbook.LibraryScreen.access$getA$p(r9)
            r4 = 7
            r5 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            android.graphics.drawable.GradientDrawable r7 = com.lumina.monsterhunterfieldbook.MainActivity.surface$default(r0, r1, r2, r3, r4, r5)
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            r8.setBackground(r7)
        L90:
            android.view.View r8 = (android.view.View) r8
            return r8
    }
}
