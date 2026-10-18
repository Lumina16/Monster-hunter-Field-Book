package com.lumina.monsterhunterfieldbook;

/* compiled from: LibraryScreen.kt */
@kotlin.Metadata(d1 = {"\u0000\u008b\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001,\u0018\u00002\u00020\u0001:\u0001CB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\fH\u0002J\u0018\u00100\u001a\n 1*\u0004\u0018\u00010\u00050\u00052\u0006\u0010/\u001a\u00020\fH\u0002J\u0010\u00102\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\fH\u0002J\b\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u00020\u0013H\u0002J\b\u00106\u001a\u00020\u000eH\u0002J\b\u00107\u001a\u00020\u000eH\u0002J\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u001aH\u0002J\u0010\u0010;\u001a\u0002042\u0006\u0010:\u001a\u00020\u001aH\u0002J\b\u0010<\u001a\u000204H\u0002J\u0012\u0010=\u001a\u0002042\b\b\u0002\u0010>\u001a\u00020\u0013H\u0002J\b\u0010?\u001a\u000204H\u0002J\u0006\u0010@\u001a\u00020\u0007J\u0006\u0010A\u001a\u00020\u0013J\b\u0010B\u001a\u000204H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0004\n\u0002\u0010-¨\u0006D"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/LibraryScreen;", "Landroid/widget/LinearLayout;", "a", "Lcom/lumina/monsterhunterfieldbook/MainActivity;", "section", "", "restored", "Lorg/json/JSONObject;", "<init>", "(Lcom/lumina/monsterhunterfieldbook/MainActivity;Ljava/lang/String;Lorg/json/JSONObject;)V", "collections", "", "Lcom/lumina/monsterhunterfieldbook/LibraryScreen$Collection;", "currentIndex", "", "collection", "filter", "Lcom/lumina/monsterhunterfieldbook/LibraryFilter;", "tree", "", "limit", "selection", "position", "topOffset", "records", "", "Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "depths", "", "generations", "Ljava/util/concurrent/atomic/AtomicInteger;", "handler", "Landroid/os/Handler;", "pending", "Ljava/lang/Runnable;", "status", "Landroid/widget/TextView;", "list", "Landroid/widget/AbsListView;", "listSlot", "Landroid/widget/FrameLayout;", "details", "more", "adapter", "com/lumina/monsterhunterfieldbook/LibraryScreen$adapter$1", "Lcom/lumina/monsterhunterfieldbook/LibraryScreen$adapter$1;", "key", "c", "defaultSort", "kotlin.jvm.PlatformType", "loadFilter", "saveFilter", "", "isGrid", "columns", "batchSize", "gridCard", "Landroid/view/View;", "record", "select", "positionReset", "load", "reset", "capturePosition", "snapshot", "closeSelection", "onDetachedFromWindow", "Collection", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LibraryScreen extends android.widget.LinearLayout {
    private final com.lumina.monsterhunterfieldbook.MainActivity a;
    private final com.lumina.monsterhunterfieldbook.LibraryScreen$adapter$1 adapter;
    private com.lumina.monsterhunterfieldbook.LibraryScreen.Collection collection;
    private final java.util.List<com.lumina.monsterhunterfieldbook.LibraryScreen.Collection> collections;
    private final int currentIndex;
    private final java.util.Map<java.lang.String, java.lang.Integer> depths;
    private android.widget.FrameLayout details;
    private com.lumina.monsterhunterfieldbook.LibraryFilter filter;
    private final java.util.concurrent.atomic.AtomicInteger generations;
    private final android.os.Handler handler;
    private int limit;
    private android.widget.AbsListView list;
    private final android.widget.FrameLayout listSlot;
    private final android.widget.TextView more;
    private java.lang.Runnable pending;
    private int position;
    private final java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> records;
    private final org.json.JSONObject restored;
    private final java.lang.String section;
    private java.lang.String selection;
    private final android.widget.TextView status;
    private int topOffset;
    private boolean tree;



    /* compiled from: LibraryScreen.kt */
    @kotlin.Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u000bH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u000e"}, d2 = {"com/lumina/monsterhunterfieldbook/LibraryScreen$18", "Landroid/text/TextWatcher;", "beforeTextChanged", "", "s", "", "start", "", "count", "after", "afterTextChanged", "Landroid/text/Editable;", "onTextChanged", "before", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.lumina.monsterhunterfieldbook.LibraryScreen$18, reason: invalid class name */
    public static final class AnonymousClass18 implements android.text.TextWatcher {
        final /* synthetic */ com.lumina.monsterhunterfieldbook.LibraryScreen this$0;

        public static /* synthetic */ void $r8$lambda$_XQAixeUr_PZcGMrrnfX7mYNVVU(com.lumina.monsterhunterfieldbook.LibraryScreen r0) {
                onTextChanged$lambda$1(r0)
                return
        }

        AnonymousClass18(com.lumina.monsterhunterfieldbook.LibraryScreen r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private static final void onTextChanged$lambda$1(com.lumina.monsterhunterfieldbook.LibraryScreen r3) {
                com.lumina.monsterhunterfieldbook.LibraryScreen.access$positionReset(r3)
                int r0 = com.lumina.monsterhunterfieldbook.LibraryScreen.access$batchSize(r3)
                com.lumina.monsterhunterfieldbook.LibraryScreen.access$setLimit$p(r3, r0)
                r0 = 1
                r1 = 0
                r2 = 0
                com.lumina.monsterhunterfieldbook.LibraryScreen.load$default(r3, r2, r0, r1)
                return
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable r1) {
                r0 = this;
                return
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
                r0 = this;
                return
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence r12, int r13, int r14, int r15) {
                r11 = this;
                com.lumina.monsterhunterfieldbook.LibraryScreen r13 = r11.this$0
                com.lumina.monsterhunterfieldbook.LibraryFilter r0 = com.lumina.monsterhunterfieldbook.LibraryScreen.access$getFilter$p(r13)
                java.lang.String r3 = java.lang.String.valueOf(r12)
                r9 = 251(0xfb, float:3.52E-43)
                r10 = 0
                r1 = 0
                r2 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                com.lumina.monsterhunterfieldbook.LibraryFilter r12 = com.lumina.monsterhunterfieldbook.LibraryFilter.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                com.lumina.monsterhunterfieldbook.LibraryScreen.access$setFilter$p(r13, r12)
                com.lumina.monsterhunterfieldbook.LibraryScreen r12 = r11.this$0
                com.lumina.monsterhunterfieldbook.LibraryScreen.access$saveFilter(r12)
                com.lumina.monsterhunterfieldbook.LibraryScreen r12 = r11.this$0
                java.lang.Runnable r12 = com.lumina.monsterhunterfieldbook.LibraryScreen.access$getPending$p(r12)
                if (r12 == 0) goto L31
                com.lumina.monsterhunterfieldbook.LibraryScreen r13 = r11.this$0
                android.os.Handler r13 = com.lumina.monsterhunterfieldbook.LibraryScreen.access$getHandler$p(r13)
                r13.removeCallbacks(r12)
            L31:
                com.lumina.monsterhunterfieldbook.LibraryScreen r12 = r11.this$0
                com.lumina.monsterhunterfieldbook.LibraryScreen$18$$ExternalSyntheticLambda0 r13 = new com.lumina.monsterhunterfieldbook.LibraryScreen$18$$ExternalSyntheticLambda0
                r13.<init>(r12)
                com.lumina.monsterhunterfieldbook.LibraryScreen.access$setPending$p(r12, r13)
                com.lumina.monsterhunterfieldbook.LibraryScreen r12 = r11.this$0
                android.os.Handler r12 = com.lumina.monsterhunterfieldbook.LibraryScreen.access$getHandler$p(r12)
                com.lumina.monsterhunterfieldbook.LibraryScreen r13 = r11.this$0
                java.lang.Runnable r13 = com.lumina.monsterhunterfieldbook.LibraryScreen.access$getPending$p(r13)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r13)
                r14 = 180(0xb4, double:8.9E-322)
                r12.postDelayed(r13, r14)
                return
        }
    }

    /* compiled from: LibraryScreen.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/LibraryScreen$Collection;", "", "kind", "", "category", "label", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKind", "()Ljava/lang/String;", "getCategory", "getLabel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class Collection {
        private final java.lang.String category;
        private final java.lang.String kind;
        private final java.lang.String label;

        public Collection(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
                r1 = this;
                java.lang.String r0 = "kind"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "category"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "label"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r1.<init>()
                r1.kind = r2
                r1.category = r3
                r1.label = r4
                return
        }

        public static /* synthetic */ com.lumina.monsterhunterfieldbook.LibraryScreen.Collection copy$default(com.lumina.monsterhunterfieldbook.LibraryScreen.Collection r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
                r5 = r4 & 1
                if (r5 == 0) goto L6
                java.lang.String r1 = r0.kind
            L6:
                r5 = r4 & 2
                if (r5 == 0) goto Lc
                java.lang.String r2 = r0.category
            Lc:
                r4 = r4 & 4
                if (r4 == 0) goto L12
                java.lang.String r3 = r0.label
            L12:
                com.lumina.monsterhunterfieldbook.LibraryScreen$Collection r0 = r0.copy(r1, r2, r3)
                return r0
        }

        public final java.lang.String component1() {
                r1 = this;
                java.lang.String r0 = r1.kind
                return r0
        }

        public final java.lang.String component2() {
                r1 = this;
                java.lang.String r0 = r1.category
                return r0
        }

        public final java.lang.String component3() {
                r1 = this;
                java.lang.String r0 = r1.label
                return r0
        }

        public final com.lumina.monsterhunterfieldbook.LibraryScreen.Collection copy(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
                r1 = this;
                java.lang.String r0 = "kind"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "category"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "label"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                com.lumina.monsterhunterfieldbook.LibraryScreen$Collection r0 = new com.lumina.monsterhunterfieldbook.LibraryScreen$Collection
                r0.<init>(r2, r3, r4)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.lumina.monsterhunterfieldbook.LibraryScreen.Collection
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.lumina.monsterhunterfieldbook.LibraryScreen$Collection r5 = (com.lumina.monsterhunterfieldbook.LibraryScreen.Collection) r5
                java.lang.String r1 = r4.kind
                java.lang.String r3 = r5.kind
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.category
                java.lang.String r3 = r5.category
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                java.lang.String r1 = r4.label
                java.lang.String r5 = r5.label
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
                if (r5 != 0) goto L2d
                return r2
            L2d:
                return r0
        }

        public final java.lang.String getCategory() {
                r1 = this;
                java.lang.String r0 = r1.category
                return r0
        }

        public final java.lang.String getKind() {
                r1 = this;
                java.lang.String r0 = r1.kind
                return r0
        }

        public final java.lang.String getLabel() {
                r1 = this;
                java.lang.String r0 = r1.label
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.kind
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.String r1 = r2.category
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r2.label
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r5 = this;
                java.lang.String r0 = r5.kind
                java.lang.String r1 = r5.category
                java.lang.String r2 = r5.label
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "Collection(kind="
                r3.<init>(r4)
                java.lang.StringBuilder r0 = r3.append(r0)
                java.lang.String r3 = ", category="
                java.lang.StringBuilder r0 = r0.append(r3)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", label="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r1 = ")"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static /* synthetic */ void $r8$lambda$0Uydc9RYdtMhcR4gydIeBmUyFIA(com.lumina.monsterhunterfieldbook.LibraryScreen r0) {
            load$lambda$0$1$1$6(r0)
            return
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0xQO5AEPSiVgc50HdDhXBhAXudw(com.lumina.monsterhunterfieldbook.LibraryScreen r0, java.lang.String r1) {
            kotlin.Unit r0 = _init_$lambda$10(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4xkZ31szju7SBA6mQCb4Edp4LpA(com.lumina.monsterhunterfieldbook.LibraryScreen r0) {
            kotlin.Unit r0 = more$lambda$0(r0)
            return r0
    }

    /* renamed from: $r8$lambda$6P41Mzk3qPiDTv_E-BqKi7-etyE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9$r8$lambda$6P41Mzk3qPiDTv_EBqKi7etyE(com.lumina.monsterhunterfieldbook.LibraryScreen r0) {
            kotlin.Unit r0 = _init_$lambda$0(r0)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9iCIirVRvjuELLhNj10CBwxnATU() {
            kotlin.Unit r0 = _init_$lambda$3()
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EBm02RCbkk8Ci90BJkY91pwCGpk(com.lumina.monsterhunterfieldbook.LibraryScreen r0, java.lang.String r1) {
            kotlin.Unit r0 = _init_$lambda$13(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZkbmL1MEIK7MRvENCmGEWJoAm88(com.lumina.monsterhunterfieldbook.LibraryScreen r0, java.lang.String r1) {
            kotlin.Unit r0 = _init_$lambda$11(r0, r1)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$_owkwEiIUkMcSVob3e_L9eoW_MI(com.lumina.monsterhunterfieldbook.LibraryScreen r0, int r1, java.lang.Object r2) {
            load$lambda$0$1(r0, r1, r2)
            return
    }

    /* renamed from: $r8$lambda$c2YaKqruSMqmtkVCk7-W2WRSkvs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10$r8$lambda$c2YaKqruSMqmtkVCk7W2WRSkvs(com.lumina.monsterhunterfieldbook.LibraryScreen r0) {
            kotlin.Unit r0 = _init_$lambda$15(r0)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$h1REDDywCgVK79CQ6SbZL1RMlbA(com.lumina.monsterhunterfieldbook.LibraryScreen r0, java.lang.String r1) {
            kotlin.Unit r0 = _init_$lambda$7(r0, r1)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$lmO5ptBJSpXqQFt4K0BL8KxfrD4(com.lumina.monsterhunterfieldbook.LibraryScreen r0, android.widget.CompoundButton r1, boolean r2) {
            _init_$lambda$14(r0, r1, r2)
            return
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nQHK6B0FZbt9A_wkOub3lyLxMTA(com.lumina.monsterhunterfieldbook.LibraryScreen r0, android.widget.FrameLayout r1) {
            kotlin.Unit r0 = select$lambda$0(r0, r1)
            return r0
    }

    /* renamed from: $r8$lambda$qr2P5ycarzLDO4G6ra8Rs5aKW-8, reason: not valid java name */
    public static /* synthetic */ void m11$r8$lambda$qr2P5ycarzLDO4G6ra8Rs5aKW8(com.lumina.monsterhunterfieldbook.LibraryScreen r0) {
            load$lambda$0$1$1$9(r0)
            return
    }

    public static /* synthetic */ void $r8$lambda$rI_mY6XACeBuaDxRt5_9eHDpy0I(com.lumina.monsterhunterfieldbook.LibraryScreen r0, com.lumina.monsterhunterfieldbook.LibraryFilter r1, int r2, int r3) {
            load$lambda$0(r0, r1, r2, r3)
            return
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tjNwfnGekJcMHcFnAgBHrP1mzjc(com.lumina.monsterhunterfieldbook.LibraryScreen r0, com.lumina.monsterhunterfieldbook.FieldRecord r1) {
            kotlin.Unit r0 = gridCard$lambda$2(r0, r1)
            return r0
    }

    /* renamed from: $r8$lambda$xtUf-4hvfQQ9VRtlsdPpRBCOr1w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12$r8$lambda$xtUf4hvfQQ9VRtlsdPpRBCOr1w(android.widget.LinearLayout r0) {
            kotlin.Unit r0 = _init_$lambda$4(r0)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$zLksKcsQ28pn26Rpihk6QxZuWlY(com.lumina.monsterhunterfieldbook.LibraryScreen r0, com.lumina.monsterhunterfieldbook.FieldRecord r1) {
            load$lambda$0$1$1$9$0(r0, r1)
            return
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zt0jX5i18Mi0OIeyBj047Go1Wdc(com.lumina.monsterhunterfieldbook.LibraryScreen r0, java.lang.String r1) {
            kotlin.Unit r0 = _init_$lambda$8(r0, r1)
            return r0
    }

    public LibraryScreen(com.lumina.monsterhunterfieldbook.MainActivity r35, java.lang.String r36, org.json.JSONObject r37) {
            r34 = this;
            r0 = r34
            r1 = r35
            r2 = r36
            java.lang.String r3 = "a"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "section"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            r3 = r1
            android.content.Context r3 = (android.content.Context) r3
            r0.<init>(r3)
            r0.a = r1
            r0.section = r2
            r1 = r37
            r0.restored = r1
            int r1 = r2.hashCode()
            java.lang.String r3 = "locales"
            java.lang.String r4 = "notes"
            java.lang.String r5 = "quests"
            java.lang.String r6 = "Weapons"
            r7 = 7
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            java.lang.String r9 = "Quests"
            r10 = 6
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r12 = 8
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r15 = 3
            r35 = r7
            r7 = 10
            java.lang.Integer r16 = java.lang.Integer.valueOf(r7)
            r37 = r10
            r10 = 2
            r17 = r12
            r18 = 1
            java.lang.String r12 = ""
            r19 = 4
            switch(r1) {
                case -948698159: goto L1df;
                case 105008833: goto L1c6;
                case 338410841: goto L19d;
                case 1076356494: goto Lca;
                case 1223328215: goto L9e;
                case 1842985283: goto L5b;
                default: goto L53;
            }
        L53:
            r20 = r15
            r21 = 0
        L57:
            r1 = r19
            goto L1f5
        L5b:
            java.lang.String r1 = "bestiary"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L6b
            r20 = r15
            r1 = r19
            r21 = 0
            goto L1f5
        L6b:
            com.lumina.monsterhunterfieldbook.LibraryScreen$Collection[] r1 = new com.lumina.monsterhunterfieldbook.LibraryScreen.Collection[r15]
            com.lumina.monsterhunterfieldbook.LibraryScreen$Collection r2 = new com.lumina.monsterhunterfieldbook.LibraryScreen$Collection
            r20 = r15
            java.lang.String r15 = "Monsters"
            r21 = 0
            java.lang.String r14 = "Large monsters"
            r2.<init>(r15, r12, r14)
            r1[r21] = r2
            com.lumina.monsterhunterfieldbook.LibraryScreen$Collection r2 = new com.lumina.monsterhunterfieldbook.LibraryScreen$Collection
            java.lang.String r14 = "smallMonsters"
            java.lang.String r15 = "Small monsters"
            r22 = r7
            java.lang.String r7 = "Creatures"
            r2.<init>(r7, r14, r15)
            r1[r18] = r2
            com.lumina.monsterhunterfieldbook.LibraryScreen$Collection r2 = new com.lumina.monsterhunterfieldbook.LibraryScreen$Collection
            java.lang.String r7 = "endemicLife"
            java.lang.String r14 = "Endemic life"
            java.lang.String r15 = "Creatures"
            r2.<init>(r15, r7, r14)
            r1[r10] = r2
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
            goto L225
        L9e:
            r22 = r7
            r20 = r15
            r21 = 0
            java.lang.String r1 = "weapons"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto Lae
            goto L1e9
        Lae:
            com.lumina.monsterhunterfieldbook.LibraryScreen$Collection[] r1 = new com.lumina.monsterhunterfieldbook.LibraryScreen.Collection[r10]
            com.lumina.monsterhunterfieldbook.LibraryScreen$Collection r2 = new com.lumina.monsterhunterfieldbook.LibraryScreen$Collection
            java.lang.String r7 = "Weapon database"
            r2.<init>(r6, r12, r7)
            r1[r21] = r2
            com.lumina.monsterhunterfieldbook.LibraryScreen$Collection r2 = new com.lumina.monsterhunterfieldbook.LibraryScreen$Collection
            java.lang.String r7 = "Weapon Guides"
            java.lang.String r14 = "14 weapon handbooks"
            r2.<init>(r7, r12, r14)
            r1[r18] = r2
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
            goto L225
        Lca:
            r22 = r7
            r20 = r15
            r21 = 0
            java.lang.String r1 = "equipment"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto Lda
            goto L1e9
        Lda:
            r1 = 11
            kotlin.Pair[] r1 = new kotlin.Pair[r1]
            java.lang.String r2 = "armours"
            java.lang.String r7 = "Armour"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r7)
            r1[r21] = r2
            java.lang.String r2 = "armourSets"
            java.lang.String r7 = "Armour sets"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r7)
            r1[r18] = r2
            java.lang.String r2 = "decorations"
            java.lang.String r7 = "Decorations"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r7)
            r1[r10] = r2
            java.lang.String r2 = "skills"
            java.lang.String r7 = "Skills"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r7)
            r1[r20] = r2
            java.lang.String r2 = "charms"
            java.lang.String r7 = "Charms"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r7)
            r1[r19] = r2
            java.lang.String r2 = "kinsects"
            java.lang.String r7 = "Kinsects"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r7)
            r7 = 5
            r1[r7] = r2
            java.lang.String r2 = "palicoEquipment"
            java.lang.String r7 = "Palico equipment"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r7)
            r1[r37] = r2
            java.lang.String r2 = "palicoGadgets"
            java.lang.String r7 = "Palico gadgets"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r7)
            r1[r35] = r2
            java.lang.String r2 = "tools"
            java.lang.String r7 = "Specialised tools"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r7)
            r1[r17] = r2
            java.lang.String r2 = "canteen"
            java.lang.String r7 = "Canteen"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r7)
            r7 = 9
            r1[r7] = r2
            java.lang.String r2 = "foodSkills"
            java.lang.String r7 = "Food skills"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r7)
            r1[r22] = r2
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r7 = r22
            int r14 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r7)
            r2.<init>(r14)
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r1 = r1.iterator()
        L166:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L18a
            java.lang.Object r7 = r1.next()
            kotlin.Pair r7 = (kotlin.Pair) r7
            com.lumina.monsterhunterfieldbook.LibraryScreen$Collection r14 = new com.lumina.monsterhunterfieldbook.LibraryScreen$Collection
            java.lang.Object r15 = r7.getFirst()
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r7 = r7.getSecond()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r10 = "Equipment"
            r14.<init>(r10, r15, r7)
            r2.add(r14)
            r10 = 2
            goto L166
        L18a:
            java.util.List r2 = (java.util.List) r2
            java.util.Collection r2 = (java.util.Collection) r2
            com.lumina.monsterhunterfieldbook.LibraryScreen$Collection r1 = new com.lumina.monsterhunterfieldbook.LibraryScreen$Collection
            java.lang.String r7 = "Builds"
            java.lang.String r10 = "Build templates"
            r1.<init>(r7, r12, r10)
            java.util.List r1 = kotlin.collections.CollectionsKt.plus(r2, r1)
            goto L225
        L19d:
            r20 = r15
            r21 = 0
            boolean r1 = r2.equals(r3)
            if (r1 != 0) goto L1a8
            goto L1e9
        L1a8:
            r1 = 2
            com.lumina.monsterhunterfieldbook.LibraryScreen$Collection[] r2 = new com.lumina.monsterhunterfieldbook.LibraryScreen.Collection[r1]
            com.lumina.monsterhunterfieldbook.LibraryScreen$Collection r1 = new com.lumina.monsterhunterfieldbook.LibraryScreen$Collection
            java.lang.String r7 = "Locales"
            java.lang.String r10 = "Hunting locales"
            r1.<init>(r7, r12, r10)
            r2[r21] = r1
            com.lumina.monsterhunterfieldbook.LibraryScreen$Collection r1 = new com.lumina.monsterhunterfieldbook.LibraryScreen$Collection
            java.lang.String r7 = "Maps"
            java.lang.String r10 = "Atlases & bases"
            r1.<init>(r7, r12, r10)
            r2[r18] = r1
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r2)
            goto L225
        L1c6:
            r20 = r15
            r21 = 0
            boolean r1 = r2.equals(r4)
            if (r1 != 0) goto L1d1
            goto L1e9
        L1d1:
            com.lumina.monsterhunterfieldbook.LibraryScreen$Collection r1 = new com.lumina.monsterhunterfieldbook.LibraryScreen$Collection
            java.lang.String r2 = "Field Notes"
            java.lang.String r7 = "Field notes"
            r1.<init>(r2, r12, r7)
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
            goto L225
        L1df:
            r20 = r15
            r21 = 0
            boolean r1 = r2.equals(r5)
            if (r1 != 0) goto L1eb
        L1e9:
            goto L57
        L1eb:
            com.lumina.monsterhunterfieldbook.LibraryScreen$Collection r1 = new com.lumina.monsterhunterfieldbook.LibraryScreen$Collection
            r1.<init>(r9, r12, r9)
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
            goto L225
        L1f5:
            com.lumina.monsterhunterfieldbook.LibraryScreen$Collection[] r2 = new com.lumina.monsterhunterfieldbook.LibraryScreen.Collection[r1]
            com.lumina.monsterhunterfieldbook.LibraryScreen$Collection r1 = new com.lumina.monsterhunterfieldbook.LibraryScreen$Collection
            java.lang.String r7 = "Items"
            java.lang.String r10 = "Resources"
            r1.<init>(r7, r12, r10)
            r2[r21] = r1
            com.lumina.monsterhunterfieldbook.LibraryScreen$Collection r1 = new com.lumina.monsterhunterfieldbook.LibraryScreen$Collection
            java.lang.String r7 = "Recipes"
            java.lang.String r10 = "Recipe"
            r1.<init>(r7, r12, r10)
            r2[r18] = r1
            com.lumina.monsterhunterfieldbook.LibraryScreen$Collection r1 = new com.lumina.monsterhunterfieldbook.LibraryScreen$Collection
            java.lang.String r7 = "Preparation"
            java.lang.String r10 = "Preparation quick reference"
            r1.<init>(r7, r12, r10)
            r23 = 2
            r2[r23] = r1
            com.lumina.monsterhunterfieldbook.LibraryScreen$Collection r1 = new com.lumina.monsterhunterfieldbook.LibraryScreen$Collection
            r1.<init>(r9, r12, r9)
            r2[r20] = r1
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r2)
        L225:
            r0.collections = r1
            org.json.JSONObject r2 = r0.restored
            if (r2 == 0) goto L234
            java.lang.String r7 = "collection"
            int r2 = r2.optInt(r7)
            r10 = r21
            goto L251
        L234:
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            com.lumina.monsterhunterfieldbook.NativePrefs r2 = r2.getPrefs()
            java.lang.String r7 = r0.section
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r14 = "collection:"
            r10.<init>(r14)
            java.lang.StringBuilder r7 = r10.append(r7)
            java.lang.String r7 = r7.toString()
            r10 = r21
            int r2 = r2.number(r7, r10)
        L251:
            int r7 = kotlin.collections.CollectionsKt.getLastIndex(r1)
            int r2 = kotlin.ranges.RangesKt.coerceIn(r2, r10, r7)
            r0.currentIndex = r2
            java.lang.Object r2 = r1.get(r2)
            com.lumina.monsterhunterfieldbook.LibraryScreen$Collection r2 = (com.lumina.monsterhunterfieldbook.LibraryScreen.Collection) r2
            r0.collection = r2
            com.lumina.monsterhunterfieldbook.LibraryFilter r2 = r0.loadFilter(r2)
            r0.filter = r2
            org.json.JSONObject r2 = r0.restored
            if (r2 == 0) goto L274
            java.lang.String r7 = "tree"
            boolean r2 = r2.optBoolean(r7)
            goto L275
        L274:
            r2 = 0
        L275:
            r0.tree = r2
            org.json.JSONObject r2 = r0.restored
            if (r2 == 0) goto L282
            java.lang.String r7 = "limit"
            int r2 = r2.optInt(r7)
            goto L284
        L282:
            r2 = 60
        L284:
            r0.limit = r2
            org.json.JSONObject r2 = r0.restored
            if (r2 == 0) goto L294
            java.lang.String r7 = "selected"
            java.lang.String r2 = r2.optString(r7)
            if (r2 != 0) goto L293
            goto L294
        L293:
            r12 = r2
        L294:
            r0.selection = r12
            org.json.JSONObject r2 = r0.restored
            r7 = 0
            if (r2 == 0) goto L2a2
            java.lang.String r10 = "position"
            int r2 = r2.optInt(r10)
            goto L2cf
        L2a2:
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            com.lumina.monsterhunterfieldbook.NativePrefs r2 = r2.getPrefs()
            java.lang.String r10 = "rememberScroll"
            r12 = 2
            r14 = 0
            boolean r2 = com.lumina.monsterhunterfieldbook.NativePrefs.flag$default(r2, r10, r14, r12, r7)
            if (r2 == 0) goto L2ce
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            com.lumina.monsterhunterfieldbook.NativePrefs r2 = r2.getPrefs()
            java.lang.String r10 = r0.section
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r15 = "position:"
            r12.<init>(r15)
            java.lang.StringBuilder r10 = r12.append(r10)
            java.lang.String r10 = r10.toString()
            int r2 = r2.number(r10, r14)
            goto L2cf
        L2ce:
            r2 = 0
        L2cf:
            r0.position = r2
            org.json.JSONObject r2 = r0.restored
            if (r2 == 0) goto L2dc
            java.lang.String r10 = "top"
            int r2 = r2.optInt(r10)
            goto L2dd
        L2dc:
            r2 = 0
        L2dd:
            r0.topOffset = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
            r0.records = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Map r2 = (java.util.Map) r2
            r0.depths = r2
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>()
            r0.generations = r2
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r10 = android.os.Looper.getMainLooper()
            r2.<init>(r10)
            r0.handler = r2
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            int r28 = r2.getMuted()
            r29 = 4
            r30 = 0
            java.lang.String r25 = ""
            r26 = 1094713344(0x41400000, float:12.0)
            r27 = 0
            r24 = r2
            android.widget.TextView r2 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r24, r25, r26, r27, r28, r29, r30)
            r0.status = r2
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            com.lumina.monsterhunterfieldbook.MainActivity r10 = r0.a
            android.content.Context r10 = (android.content.Context) r10
            r2.<init>(r10)
            r0.listSlot = r2
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda12 r10 = new com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda12
            r10.<init>(r0)
            java.lang.String r12 = "Show more"
            android.widget.TextView r2 = r2.button(r12, r10)
            r0.more = r2
            com.lumina.monsterhunterfieldbook.LibraryScreen$adapter$1 r2 = new com.lumina.monsterhunterfieldbook.LibraryScreen$adapter$1
            r2.<init>(r0)
            r0.adapter = r2
            r2 = r18
            r0.setOrientation(r2)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            android.widget.LinearLayout r2 = r2.row()
            com.lumina.monsterhunterfieldbook.MainActivity r10 = r0.a
            r12 = 14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            java.lang.Number r14 = (java.lang.Number) r14
            int r10 = r10.dp(r14)
            com.lumina.monsterhunterfieldbook.MainActivity r14 = r0.a
            r15 = r16
            java.lang.Number r15 = (java.lang.Number) r15
            int r14 = r14.dp(r15)
            com.lumina.monsterhunterfieldbook.MainActivity r15 = r0.a
            r7 = r16
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r15.dp(r7)
            com.lumina.monsterhunterfieldbook.MainActivity r15 = r0.a
            r19 = 4
            java.lang.Integer r24 = java.lang.Integer.valueOf(r19)
            r12 = r24
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r15.dp(r12)
            r2.setPadding(r10, r14, r7, r12)
            com.lumina.monsterhunterfieldbook.MainActivity r7 = r0.a
            java.lang.String r10 = r0.section
            int r12 = r10.hashCode()
            switch(r12) {
                case -948698159: goto L3c0;
                case 105008833: goto L3b6;
                case 338410841: goto L3ac;
                case 1076356494: goto L3a0;
                case 1223328215: goto L394;
                case 1842985283: goto L388;
                default: goto L387;
            }
        L387:
            goto L3c6
        L388:
            java.lang.String r3 = "bestiary"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L391
            goto L3c6
        L391:
            java.lang.String r9 = "Bestiary"
            goto L3c8
        L394:
            java.lang.String r3 = "weapons"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L39d
            goto L3c6
        L39d:
            r27 = r6
            goto L3ca
        L3a0:
            java.lang.String r3 = "equipment"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L3a9
            goto L3c6
        L3a9:
            java.lang.String r9 = "Equipment"
            goto L3c8
        L3ac:
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L3b3
            goto L3c6
        L3b3:
            java.lang.String r9 = "Locales & bases"
            goto L3c8
        L3b6:
            boolean r3 = r10.equals(r4)
            if (r3 != 0) goto L3bd
            goto L3c6
        L3bd:
            java.lang.String r9 = "Field Notes"
            goto L3c8
        L3c0:
            boolean r3 = r10.equals(r5)
            if (r3 != 0) goto L3c8
        L3c6:
            java.lang.String r9 = "Item Libraries"
        L3c8:
            r27 = r9
        L3ca:
            r31 = 8
            r32 = 0
            r28 = 1103101952(0x41c00000, float:24.0)
            r29 = 1
            r30 = 0
            r26 = r7
            android.widget.TextView r3 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r26, r27, r28, r29, r30, r31, r32)
            android.view.View r3 = (android.view.View) r3
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r7 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            r4.<init>(r14, r5, r7)
            android.view.ViewGroup$LayoutParams r4 = (android.view.ViewGroup.LayoutParams) r4
            r2.addView(r3, r4)
            java.lang.String r3 = r0.section
            java.lang.String r4 = "preparation"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 == 0) goto L406
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda14 r4 = new com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda14
            r4.<init>(r0)
            java.lang.String r5 = "Camp checklist"
            android.widget.TextView r3 = r3.button(r5, r4)
            android.view.View r3 = (android.view.View) r3
            r2.addView(r3)
        L406:
            android.view.View r2 = (android.view.View) r2
            r0.addView(r2)
            android.widget.Spinner r9 = new android.widget.Spinner
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            android.content.Context r2 = (android.content.Context) r2
            r9.<init>(r2)
            java.lang.String r2 = "Library collection"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r9.setContentDescription(r2)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r4)
            r3.<init>(r5)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r1 = r1.iterator()
        L432:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L446
            java.lang.Object r4 = r1.next()
            com.lumina.monsterhunterfieldbook.LibraryScreen$Collection r4 = (com.lumina.monsterhunterfieldbook.LibraryScreen.Collection) r4
            java.lang.String r4 = r4.getLabel()
            r3.add(r4)
            goto L432
        L446:
            java.util.List r3 = (java.util.List) r3
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r4 = 17367049(0x1090009, float:2.516295E-38)
            r1.<init>(r2, r4, r3)
            android.widget.SpinnerAdapter r1 = (android.widget.SpinnerAdapter) r1
            r9.setAdapter(r1)
            int r1 = r0.currentIndex
            r9.setSelection(r1)
            r1 = r9
            android.view.View r1 = (android.view.View) r1
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            r4 = 46
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r3 = r3.dp(r4)
            r10 = -1
            r2.<init>(r10, r3)
            android.view.ViewGroup$LayoutParams r2 = (android.view.ViewGroup.LayoutParams) r2
            r0.addView(r1, r2)
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            android.widget.LinearLayout r1 = r1.row()
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            r3 = r16
            java.lang.Number r3 = (java.lang.Number) r3
            int r2 = r2.dp(r3)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            r4 = r16
            java.lang.Number r4 = (java.lang.Number) r4
            int r3 = r3.dp(r4)
            r14 = 0
            r1.setPadding(r2, r14, r3, r14)
            android.widget.EditText r12 = new android.widget.EditText
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            android.content.Context r2 = (android.content.Context) r2
            r12.<init>(r2)
            r2 = 1
            r12.setSingleLine(r2)
            java.lang.String r2 = "Filter this collection"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r12.setHint(r2)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            int r2 = r2.getInk()
            r12.setTextColor(r2)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            int r2 = r2.getMuted()
            r12.setHintTextColor(r2)
            r2 = 1097859072(0x41700000, float:15.0)
            r12.setTextSize(r2)
            java.lang.String r2 = "Filter this collection"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r12.setContentDescription(r2)
            com.lumina.monsterhunterfieldbook.LibraryFilter r2 = r0.filter
            java.lang.String r2 = r2.getQuery()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r12.setText(r2)
            r2 = r12
            android.view.View r2 = (android.view.View) r2
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            r5 = 48
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r4 = r4.dp(r5)
            r14 = 0
            r3.<init>(r14, r4, r7)
            android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
            r1.addView(r2, r3)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda15 r3 = new com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda15
            r3.<init>()
            java.lang.String r4 = "Filters"
            android.widget.TextView r2 = r2.button(r4, r3)
            android.view.View r2 = (android.view.View) r2
            r1.addView(r2)
            android.view.View r1 = (android.view.View) r1
            r0.addView(r1)
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            android.widget.LinearLayout r1 = r1.column()
            r3 = r17
            r1.setVisibility(r3)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            r14 = 12
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            java.lang.Number r4 = (java.lang.Number) r4
            int r3 = r3.dp(r4)
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r14)
            java.lang.Number r5 = (java.lang.Number) r5
            int r4 = r4.dp(r5)
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r0.a
            r15 = r11
            java.lang.Number r15 = (java.lang.Number) r15
            int r5 = r5.dp(r15)
            r15 = 0
            r1.setPadding(r3, r15, r4, r5)
            r3 = r1
            android.view.View r3 = (android.view.View) r3
            r0.addView(r3)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda16 r4 = new com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda16
            r4.<init>(r1)
            r3.touch(r2, r4)
            r2 = r20
            kotlin.Pair[] r3 = new kotlin.Pair[r2]
            java.lang.String r2 = "World + Iceborne"
            java.lang.String r4 = "all"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r4, r2)
            r3[r15] = r2
            java.lang.String r2 = "world"
            java.lang.String r5 = "World"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r5)
            r18 = 1
            r3[r18] = r2
            java.lang.String r2 = "iceborne"
            java.lang.String r5 = "Iceborne"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r5)
            r23 = 2
            r3[r23] = r2
            java.util.List r3 = kotlin.collections.CollectionsKt.listOf(r3)
            com.lumina.monsterhunterfieldbook.LibraryFilter r2 = r0.filter
            java.lang.String r2 = r2.getGame()
            com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda17 r5 = new com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda17
            r5.<init>(r0)
            r15 = r4
            r4 = r2
            java.lang.String r2 = "Game"
            _init_$choices(r0, r1, r2, r3, r4, r5)
            r2 = 4
            kotlin.Pair[] r3 = new kotlin.Pair[r2]
            java.lang.String r2 = "All ranks"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r15, r2)
            r21 = 0
            r3[r21] = r2
            java.lang.String r2 = "LR"
            java.lang.String r4 = "Low Rank"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r4)
            r18 = 1
            r3[r18] = r2
            java.lang.String r2 = "HR"
            java.lang.String r4 = "High Rank"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r4)
            r23 = 2
            r3[r23] = r2
            java.lang.String r2 = "MR"
            java.lang.String r4 = "Master Rank"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r4)
            r20 = 3
            r3[r20] = r2
            java.util.List r3 = kotlin.collections.CollectionsKt.listOf(r3)
            com.lumina.monsterhunterfieldbook.LibraryFilter r2 = r0.filter
            java.lang.String r4 = r2.getRank()
            com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda1 r5 = new com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda1
            r5.<init>(r0)
            java.lang.String r2 = "Rank"
            _init_$choices(r0, r1, r2, r3, r4, r5)
            java.lang.String r2 = "All rarities"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r15, r2)
            java.util.List r2 = kotlin.collections.CollectionsKt.listOf(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            kotlin.ranges.IntRange r3 = new kotlin.ranges.IntRange
            r4 = 1
            r3.<init>(r4, r14)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r16 = r14
            r5 = 10
            int r14 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r3, r5)
            r4.<init>(r14)
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r3 = r3.iterator()
        L5ee:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L619
            r5 = r3
            kotlin.collections.IntIterator r5 = (kotlin.collections.IntIterator) r5
            int r5 = r5.nextInt()
            java.lang.String r14 = java.lang.String.valueOf(r5)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r10 = "Rarity "
            r7.<init>(r10)
            java.lang.StringBuilder r5 = r7.append(r5)
            java.lang.String r5 = r5.toString()
            kotlin.Pair r5 = kotlin.TuplesKt.to(r14, r5)
            r4.add(r5)
            r7 = 1065353216(0x3f800000, float:1.0)
            r10 = -1
            goto L5ee
        L619:
            java.util.List r4 = (java.util.List) r4
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r3 = kotlin.collections.CollectionsKt.plus(r2, r4)
            com.lumina.monsterhunterfieldbook.LibraryFilter r2 = r0.filter
            java.lang.String r4 = r2.getRarity()
            com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda2 r5 = new com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda2
            r5.<init>(r0)
            java.lang.String r2 = "Rarity"
            _init_$choices(r0, r1, r2, r3, r4, r5)
            r2 = 4
            kotlin.Pair[] r3 = new kotlin.Pair[r2]
            java.lang.String r2 = "name"
            java.lang.String r4 = "Name A–Z"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r4)
            r21 = 0
            r3[r21] = r2
            java.lang.String r2 = "source"
            java.lang.String r4 = "Source order"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r4)
            r18 = 1
            r3[r18] = r2
            java.lang.String r2 = "rarity"
            java.lang.String r4 = "Highest rarity"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r4)
            r23 = 2
            r3[r23] = r2
            java.lang.String r2 = "attack"
            java.lang.String r4 = "Highest attack"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r4)
            r20 = 3
            r3[r20] = r2
            java.util.List r3 = kotlin.collections.CollectionsKt.listOf(r3)
            com.lumina.monsterhunterfieldbook.LibraryFilter r2 = r0.filter
            java.lang.String r4 = r2.getSort()
            com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda3 r5 = new com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda3
            r5.<init>(r0)
            java.lang.String r2 = "Sort"
            _init_$choices(r0, r1, r2, r3, r4, r5)
            com.lumina.monsterhunterfieldbook.LibraryScreen$Collection r2 = r0.collection
            java.lang.String r2 = r2.getKind()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r6)
            if (r2 == 0) goto L756
            r2 = 14
            java.lang.String[] r3 = new java.lang.String[r2]
            java.lang.String r2 = "great-sword"
            r21 = 0
            r3[r21] = r2
            java.lang.String r2 = "long-sword"
            r18 = 1
            r3[r18] = r2
            java.lang.String r2 = "sword-and-shield"
            r23 = 2
            r3[r23] = r2
            java.lang.String r2 = "dual-blades"
            r20 = 3
            r3[r20] = r2
            java.lang.String r2 = "hammer"
            r19 = 4
            r3[r19] = r2
            r2 = 5
            java.lang.String r4 = "hunting-horn"
            r3[r2] = r4
            java.lang.String r2 = "lance"
            r3[r37] = r2
            java.lang.String r2 = "gunlance"
            r3[r35] = r2
            java.lang.String r2 = "switch-axe"
            r17 = 8
            r3[r17] = r2
            r2 = 9
            java.lang.String r4 = "charge-blade"
            r3[r2] = r4
            java.lang.String r2 = "insect-glaive"
            r22 = 10
            r3[r22] = r2
            r2 = 11
            java.lang.String r4 = "bow"
            r3[r2] = r4
            java.lang.String r2 = "light-bowgun"
            r3[r16] = r2
            r2 = 13
            java.lang.String r4 = "heavy-bowgun"
            r3[r2] = r4
            java.util.List r2 = kotlin.collections.CollectionsKt.listOf(r3)
            java.lang.String r3 = "All weapon types"
            kotlin.Pair r3 = kotlin.TuplesKt.to(r15, r3)
            java.util.List r3 = kotlin.collections.CollectionsKt.listOf(r3)
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r5)
            r4.<init>(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r2 = r2.iterator()
        L6f8:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L712
            java.lang.Object r5 = r2.next()
            java.lang.String r5 = (java.lang.String) r5
            com.lumina.monsterhunterfieldbook.ContentText r6 = com.lumina.monsterhunterfieldbook.ContentText.INSTANCE
            java.lang.String r6 = r6.label(r5)
            kotlin.Pair r5 = kotlin.TuplesKt.to(r5, r6)
            r4.add(r5)
            goto L6f8
        L712:
            java.util.List r4 = (java.util.List) r4
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r3 = kotlin.collections.CollectionsKt.plus(r3, r4)
            com.lumina.monsterhunterfieldbook.LibraryFilter r2 = r0.filter
            java.lang.String r4 = r2.getType()
            com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda4 r5 = new com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda4
            r5.<init>(r0)
            java.lang.String r2 = "Weapon"
            _init_$choices(r0, r1, r2, r3, r4, r5)
            android.widget.Switch r2 = new android.widget.Switch
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            android.content.Context r3 = (android.content.Context) r3
            r2.<init>(r3)
            java.lang.String r3 = "Weapon family tree"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setText(r3)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            int r3 = r3.getInk()
            r2.setTextColor(r3)
            boolean r3 = r0.tree
            r2.setChecked(r3)
            com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda5 r3 = new com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda5
            r3.<init>(r0)
            r2.setOnCheckedChangeListener(r3)
            android.view.View r2 = (android.view.View) r2
            r1.addView(r2)
            goto L75a
        L756:
            r17 = 8
            r19 = 4
        L75a:
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda13 r3 = new com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda13
            r3.<init>(r0)
            java.lang.String r4 = "Clear filters"
            android.widget.TextView r2 = r2.button(r4, r3)
            android.view.View r2 = (android.view.View) r2
            r1.addView(r2)
            android.widget.TextView r1 = r0.status
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            r25 = 14
            java.lang.Integer r3 = java.lang.Integer.valueOf(r25)
            java.lang.Number r3 = (java.lang.Number) r3
            int r2 = r2.dp(r3)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            r4 = r8
            java.lang.Number r4 = (java.lang.Number) r4
            int r3 = r3.dp(r4)
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r25)
            java.lang.Number r5 = (java.lang.Number) r5
            int r4 = r4.dp(r5)
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r0.a
            r6 = r8
            java.lang.Number r6 = (java.lang.Number) r6
            int r5 = r5.dp(r6)
            r1.setPadding(r2, r3, r4, r5)
            android.widget.TextView r1 = r0.status
            android.view.View r1 = (android.view.View) r1
            r0.addView(r1)
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            android.widget.LinearLayout r1 = r1.row()
            r2 = 48
            r1.setGravity(r2)
            android.widget.FrameLayout r2 = r0.listSlot
            android.view.View r2 = (android.view.View) r2
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            boolean r4 = r4.getUseSplitLibrary()
            if (r4 == 0) goto L7c1
            r4 = 1054615798(0x3edc28f6, float:0.43)
            goto L7c3
        L7c1:
            r4 = 1065353216(0x3f800000, float:1.0)
        L7c3:
            r5 = -1
            r14 = 0
            r3.<init>(r14, r5, r4)
            android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
            r1.addView(r2, r3)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            boolean r2 = r2.getUseSplitLibrary()
            if (r2 == 0) goto L818
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            android.content.Context r3 = (android.content.Context) r3
            r2.<init>(r3)
            r0.details = r2
            android.view.View r2 = (android.view.View) r2
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = 1058139013(0x3f11eb85, float:0.57)
            r5 = -1
            r14 = 0
            r3.<init>(r14, r5, r4)
            android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
            r1.addView(r2, r3)
            android.widget.FrameLayout r2 = r0.details
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            int r31 = r3.getMuted()
            r32 = 4
            r33 = 0
            java.lang.String r28 = "Select an entry to read its complete profile."
            r29 = 1096810496(0x41600000, float:14.0)
            r30 = 0
            r27 = r3
            android.widget.TextView r3 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r27, r28, r29, r30, r31, r32, r33)
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            android.view.View r3 = (android.view.View) r3
            r5 = 18
            r4.pad(r3, r5)
            r2.addView(r3)
        L818:
            android.view.View r1 = (android.view.View) r1
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = 1065353216(0x3f800000, float:1.0)
            r5 = -1
            r14 = 0
            r2.<init>(r5, r14, r3)
            android.view.ViewGroup$LayoutParams r2 = (android.view.ViewGroup.LayoutParams) r2
            r0.addView(r1, r2)
            android.widget.TextView r1 = r0.more
            android.view.View r1 = (android.view.View) r1
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            r4 = 44
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r3 = r3.dp(r4)
            r2.<init>(r5, r3)
            android.view.ViewGroup$LayoutParams r2 = (android.view.ViewGroup.LayoutParams) r2
            r0.addView(r1, r2)
            boolean r1 = r0.isGrid()
            if (r1 == 0) goto L8a4
            android.widget.GridView r1 = new android.widget.GridView
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            android.content.Context r2 = (android.content.Context) r2
            r1.<init>(r2)
            int r2 = r0.columns()
            r1.setNumColumns(r2)
            r2 = 2
            r1.setStretchMode(r2)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            int r3 = r0.columns()
            r4 = 3
            if (r3 <= r4) goto L869
            r17 = r19
        L869:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r17)
            java.lang.Number r3 = (java.lang.Number) r3
            int r2 = r2.dp(r3)
            r1.setHorizontalSpacing(r2)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            java.lang.Number r8 = (java.lang.Number) r8
            int r2 = r2.dp(r8)
            r1.setVerticalSpacing(r2)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            r3 = r13
            java.lang.Number r3 = (java.lang.Number) r3
            int r2 = r2.dp(r3)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            r4 = r13
            java.lang.Number r4 = (java.lang.Number) r4
            int r3 = r3.dp(r4)
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            java.lang.Number r13 = (java.lang.Number) r13
            int r4 = r4.dp(r13)
            r14 = 0
            r1.setPadding(r2, r14, r3, r4)
            android.widget.AbsListView r1 = (android.widget.AbsListView) r1
            r0.list = r1
            goto L8d2
        L8a4:
            r14 = 0
            android.widget.ListView r1 = new android.widget.ListView
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            android.content.Context r2 = (android.content.Context) r2
            r1.<init>(r2)
            r1.setDividerHeight(r14)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            r3 = r11
            java.lang.Number r3 = (java.lang.Number) r3
            int r2 = r2.dp(r3)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            r4 = r11
            java.lang.Number r4 = (java.lang.Number) r4
            int r3 = r3.dp(r4)
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            java.lang.Number r11 = (java.lang.Number) r11
            int r4 = r4.dp(r11)
            r1.setPadding(r2, r14, r3, r4)
            android.widget.AbsListView r1 = (android.widget.AbsListView) r1
            r0.list = r1
        L8d2:
            android.widget.AbsListView r1 = r0.list
            java.lang.String r2 = "list"
            if (r1 != 0) goto L8dc
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            r1 = 0
        L8dc:
            com.lumina.monsterhunterfieldbook.LibraryScreen$adapter$1 r3 = r0.adapter
            android.widget.ListAdapter r3 = (android.widget.ListAdapter) r3
            r1.setAdapter(r3)
            android.widget.FrameLayout r1 = r0.listSlot
            android.widget.AbsListView r3 = r0.list
            if (r3 != 0) goto L8ed
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            r3 = 0
        L8ed:
            android.view.View r3 = (android.view.View) r3
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r5 = -1
            r4.<init>(r5, r5)
            android.view.ViewGroup$LayoutParams r4 = (android.view.ViewGroup.LayoutParams) r4
            r1.addView(r3, r4)
            android.widget.AbsListView r1 = r0.list
            if (r1 != 0) goto L903
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            r7 = 0
            goto L904
        L903:
            r7 = r1
        L904:
            com.lumina.monsterhunterfieldbook.LibraryScreen$16 r1 = new com.lumina.monsterhunterfieldbook.LibraryScreen$16
            r1.<init>(r0)
            android.widget.AbsListView$OnScrollListener r1 = (android.widget.AbsListView.OnScrollListener) r1
            r7.setOnScrollListener(r1)
            com.lumina.monsterhunterfieldbook.LibraryScreen$17 r1 = new com.lumina.monsterhunterfieldbook.LibraryScreen$17
            r1.<init>(r0)
            android.widget.AdapterView$OnItemSelectedListener r1 = (android.widget.AdapterView.OnItemSelectedListener) r1
            r9.setOnItemSelectedListener(r1)
            com.lumina.monsterhunterfieldbook.LibraryScreen$18 r1 = new com.lumina.monsterhunterfieldbook.LibraryScreen$18
            r1.<init>(r0)
            android.text.TextWatcher r1 = (android.text.TextWatcher) r1
            r12.addTextChangedListener(r1)
            org.json.JSONObject r1 = r0.restored
            if (r1 != 0) goto L92c
            int r1 = r0.batchSize()
            r0.limit = r1
        L92c:
            r14 = 0
            r0.load(r14)
            return
    }

    public /* synthetic */ LibraryScreen(com.lumina.monsterhunterfieldbook.MainActivity r1, java.lang.String r2, org.json.JSONObject r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            r0.<init>(r1, r2, r3)
            return
    }

    private static final void _init_$choices(com.lumina.monsterhunterfieldbook.LibraryScreen r8, android.widget.LinearLayout r9, java.lang.String r10, java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> r11, java.lang.String r12, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r13) {
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r8.a
            android.widget.LinearLayout r0 = r0.row()
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r8.a
            r6 = 12
            r7 = 0
            r3 = 1094713344(0x41400000, float:12.0)
            r4 = 0
            r5 = 0
            r2 = r10
            android.widget.TextView r10 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r1, r2, r3, r4, r5, r6, r7)
            android.view.View r10 = (android.view.View) r10
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r8.a
            r4 = 70
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r3 = r3.dp(r4)
            r4 = -2
            r1.<init>(r3, r4)
            android.view.ViewGroup$LayoutParams r1 = (android.view.ViewGroup.LayoutParams) r1
            r0.addView(r10, r1)
            android.widget.Spinner r10 = new android.widget.Spinner
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r8.a
            android.content.Context r1 = (android.content.Context) r1
            r10.<init>(r1)
            r1 = r2
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r10.setContentDescription(r1)
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r8.a
            android.content.Context r1 = (android.content.Context) r1
            r2 = r11
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r4)
            r3.<init>(r4)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r2 = r2.iterator()
        L56:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L6c
            java.lang.Object r4 = r2.next()
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r4 = r4.getSecond()
            java.lang.String r4 = (java.lang.String) r4
            r3.add(r4)
            goto L56
        L6c:
            java.util.List r3 = (java.util.List) r3
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            r4 = 17367049(0x1090009, float:2.516295E-38)
            r2.<init>(r1, r4, r3)
            android.widget.SpinnerAdapter r2 = (android.widget.SpinnerAdapter) r2
            r10.setAdapter(r2)
            java.util.Iterator r1 = r11.iterator()
            r2 = 0
            r3 = r2
        L81:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L9b
            java.lang.Object r4 = r1.next()
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r4 = r4.getFirst()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r12)
            if (r4 == 0) goto L98
            goto L9c
        L98:
            int r3 = r3 + 1
            goto L81
        L9b:
            r3 = -1
        L9c:
            int r12 = kotlin.ranges.RangesKt.coerceAtLeast(r3, r2)
            r10.setSelection(r12)
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            java.lang.Object r12 = r11.get(r12)
            kotlin.Pair r12 = (kotlin.Pair) r12
            java.lang.Object r12 = r12.getFirst()
            r1.element = r12
            com.lumina.monsterhunterfieldbook.LibraryScreen$choices$2 r12 = new com.lumina.monsterhunterfieldbook.LibraryScreen$choices$2
            r12.<init>(r11, r1, r13, r8)
            android.widget.AdapterView$OnItemSelectedListener r12 = (android.widget.AdapterView.OnItemSelectedListener) r12
            r10.setOnItemSelectedListener(r12)
            android.view.View r10 = (android.view.View) r10
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r8.a
            r12 = 44
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Number r12 = (java.lang.Number) r12
            int r8 = r8.dp(r12)
            r12 = 1065353216(0x3f800000, float:1.0)
            r11.<init>(r2, r8, r12)
            android.view.ViewGroup$LayoutParams r11 = (android.view.ViewGroup.LayoutParams) r11
            r0.addView(r10, r11)
            android.view.View r0 = (android.view.View) r0
            r9.addView(r0)
            return
    }

    private static final kotlin.Unit _init_$lambda$0(com.lumina.monsterhunterfieldbook.LibraryScreen r0) {
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r0.a
            r0.showCampChecklist()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    private static final kotlin.Unit _init_$lambda$10(com.lumina.monsterhunterfieldbook.LibraryScreen r12, java.lang.String r13) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            com.lumina.monsterhunterfieldbook.LibraryFilter r1 = r12.filter
            r10 = 223(0xdf, float:3.12E-43)
            r11 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r7 = r13
            com.lumina.monsterhunterfieldbook.LibraryFilter r13 = com.lumina.monsterhunterfieldbook.LibraryFilter.copy$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.filter = r13
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
    }

    private static final kotlin.Unit _init_$lambda$11(com.lumina.monsterhunterfieldbook.LibraryScreen r12, java.lang.String r13) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            com.lumina.monsterhunterfieldbook.LibraryFilter r1 = r12.filter
            r10 = 127(0x7f, float:1.78E-43)
            r11 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = r13
            com.lumina.monsterhunterfieldbook.LibraryFilter r13 = com.lumina.monsterhunterfieldbook.LibraryFilter.copy$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.filter = r13
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
    }

    private static final kotlin.Unit _init_$lambda$13(com.lumina.monsterhunterfieldbook.LibraryScreen r12, java.lang.String r13) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            com.lumina.monsterhunterfieldbook.LibraryFilter r1 = r12.filter
            r10 = 191(0xbf, float:2.68E-43)
            r11 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r8 = r13
            com.lumina.monsterhunterfieldbook.LibraryFilter r13 = com.lumina.monsterhunterfieldbook.LibraryFilter.copy$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.filter = r13
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
    }

    private static final void _init_$lambda$14(com.lumina.monsterhunterfieldbook.LibraryScreen r1, android.widget.CompoundButton r2, boolean r3) {
            java.lang.String r0 = "<unused var>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.tree = r3
            r1.positionReset()
            r2 = 1
            r3 = 0
            r0 = 0
            load$default(r1, r0, r2, r3)
            return
    }

    private static final kotlin.Unit _init_$lambda$15(com.lumina.monsterhunterfieldbook.LibraryScreen r5) {
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r5.a
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r0.getPrefs()
            com.lumina.monsterhunterfieldbook.LibraryScreen$Collection r1 = r5.collection
            java.lang.String r1 = r5.key(r1)
            java.lang.String r2 = "{}"
            r0.set(r1, r2)
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r5.a
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r0.getPrefs()
            java.lang.String r1 = r5.section
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "position:"
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.set(r1, r2)
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r5.a
            java.lang.String r1 = r5.section
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.util.List<com.lumina.monsterhunterfieldbook.LibraryScreen$Collection> r3 = r5.collections
            com.lumina.monsterhunterfieldbook.LibraryScreen$Collection r4 = r5.collection
            int r3 = r3.indexOf(r4)
            java.lang.String r4 = "collection"
            org.json.JSONObject r2 = r2.put(r4, r3)
            java.lang.String r3 = "put(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r0.replaceLibraryState(r1, r2)
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r5.a
            r5.refreshCurrentSection()
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
    }

    private static final kotlin.Unit _init_$lambda$3() {
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    private static final kotlin.Unit _init_$lambda$4(android.widget.LinearLayout r2) {
            int r0 = r2.getVisibility()
            r1 = 8
            if (r0 != r1) goto L9
            r1 = 0
        L9:
            r2.setVisibility(r1)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    private static final kotlin.Unit _init_$lambda$7(com.lumina.monsterhunterfieldbook.LibraryScreen r12, java.lang.String r13) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            com.lumina.monsterhunterfieldbook.LibraryFilter r1 = r12.filter
            r10 = 247(0xf7, float:3.46E-43)
            r11 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r5 = r13
            com.lumina.monsterhunterfieldbook.LibraryFilter r13 = com.lumina.monsterhunterfieldbook.LibraryFilter.copy$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.filter = r13
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
    }

    private static final kotlin.Unit _init_$lambda$8(com.lumina.monsterhunterfieldbook.LibraryScreen r12, java.lang.String r13) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            com.lumina.monsterhunterfieldbook.LibraryFilter r1 = r12.filter
            r10 = 239(0xef, float:3.35E-43)
            r11 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r6 = r13
            com.lumina.monsterhunterfieldbook.LibraryFilter r13 = com.lumina.monsterhunterfieldbook.LibraryFilter.copy$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.filter = r13
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
    }

    public static final /* synthetic */ int access$batchSize(com.lumina.monsterhunterfieldbook.LibraryScreen r0) {
            int r0 = r0.batchSize()
            return r0
    }

    public static final /* synthetic */ void access$capturePosition(com.lumina.monsterhunterfieldbook.LibraryScreen r0) {
            r0.capturePosition()
            return
    }

    public static final /* synthetic */ com.lumina.monsterhunterfieldbook.MainActivity access$getA$p(com.lumina.monsterhunterfieldbook.LibraryScreen r0) {
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r0.a
            return r0
    }

    public static final /* synthetic */ com.lumina.monsterhunterfieldbook.LibraryScreen.Collection access$getCollection$p(com.lumina.monsterhunterfieldbook.LibraryScreen r0) {
            com.lumina.monsterhunterfieldbook.LibraryScreen$Collection r0 = r0.collection
            return r0
    }

    public static final /* synthetic */ java.util.List access$getCollections$p(com.lumina.monsterhunterfieldbook.LibraryScreen r0) {
            java.util.List<com.lumina.monsterhunterfieldbook.LibraryScreen$Collection> r0 = r0.collections
            return r0
    }

    public static final /* synthetic */ java.util.Map access$getDepths$p(com.lumina.monsterhunterfieldbook.LibraryScreen r0) {
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r0.depths
            return r0
    }

    public static final /* synthetic */ com.lumina.monsterhunterfieldbook.LibraryFilter access$getFilter$p(com.lumina.monsterhunterfieldbook.LibraryScreen r0) {
            com.lumina.monsterhunterfieldbook.LibraryFilter r0 = r0.filter
            return r0
    }

    public static final /* synthetic */ android.os.Handler access$getHandler$p(com.lumina.monsterhunterfieldbook.LibraryScreen r0) {
            android.os.Handler r0 = r0.handler
            return r0
    }

    public static final /* synthetic */ java.lang.Runnable access$getPending$p(com.lumina.monsterhunterfieldbook.LibraryScreen r0) {
            java.lang.Runnable r0 = r0.pending
            return r0
    }

    public static final /* synthetic */ java.util.List access$getRecords$p(com.lumina.monsterhunterfieldbook.LibraryScreen r0) {
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r0 = r0.records
            return r0
    }

    public static final /* synthetic */ java.lang.String access$getSection$p(com.lumina.monsterhunterfieldbook.LibraryScreen r0) {
            java.lang.String r0 = r0.section
            return r0
    }

    public static final /* synthetic */ java.lang.String access$getSelection$p(com.lumina.monsterhunterfieldbook.LibraryScreen r0) {
            java.lang.String r0 = r0.selection
            return r0
    }

    public static final /* synthetic */ boolean access$getTree$p(com.lumina.monsterhunterfieldbook.LibraryScreen r0) {
            boolean r0 = r0.tree
            return r0
    }

    public static final /* synthetic */ android.view.View access$gridCard(com.lumina.monsterhunterfieldbook.LibraryScreen r0, com.lumina.monsterhunterfieldbook.FieldRecord r1) {
            android.view.View r0 = r0.gridCard(r1)
            return r0
    }

    public static final /* synthetic */ boolean access$isGrid(com.lumina.monsterhunterfieldbook.LibraryScreen r0) {
            boolean r0 = r0.isGrid()
            return r0
    }

    public static final /* synthetic */ void access$positionReset(com.lumina.monsterhunterfieldbook.LibraryScreen r0) {
            r0.positionReset()
            return
    }

    public static final /* synthetic */ void access$saveFilter(com.lumina.monsterhunterfieldbook.LibraryScreen r0) {
            r0.saveFilter()
            return
    }

    public static final /* synthetic */ void access$select(com.lumina.monsterhunterfieldbook.LibraryScreen r0, com.lumina.monsterhunterfieldbook.FieldRecord r1) {
            r0.select(r1)
            return
    }

    public static final /* synthetic */ void access$setFilter$p(com.lumina.monsterhunterfieldbook.LibraryScreen r0, com.lumina.monsterhunterfieldbook.LibraryFilter r1) {
            r0.filter = r1
            return
    }

    public static final /* synthetic */ void access$setLimit$p(com.lumina.monsterhunterfieldbook.LibraryScreen r0, int r1) {
            r0.limit = r1
            return
    }

    public static final /* synthetic */ void access$setPending$p(com.lumina.monsterhunterfieldbook.LibraryScreen r0, java.lang.Runnable r1) {
            r0.pending = r1
            return
    }

    private final int batchSize() {
            r4 = this;
            boolean r0 = r4.isGrid()
            if (r0 == 0) goto L32
            int r0 = r4.columns()
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r4.a
            com.lumina.monsterhunterfieldbook.NativePrefs r1 = r1.getPrefs()
            java.lang.String r2 = "rows"
            java.lang.String r3 = "6"
            java.lang.String r1 = r1.text(r2, r3)
            java.lang.String r2 = "text(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.Integer r1 = kotlin.text.StringsKt.toIntOrNull(r1)
            if (r1 == 0) goto L28
            int r1 = r1.intValue()
            goto L29
        L28:
            r1 = 6
        L29:
            r2 = 1
            r3 = 8
            int r1 = kotlin.ranges.RangesKt.coerceIn(r1, r2, r3)
            int r0 = r0 * r1
            return r0
        L32:
            r0 = 60
            return r0
    }

    private final void capturePosition() {
            r5 = this;
            android.widget.AbsListView r0 = r5.list
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L2a
            java.lang.String r3 = "list"
            if (r0 != 0) goto Le
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            r0 = r1
        Le:
            int r0 = r0.getFirstVisiblePosition()
            r5.position = r0
            android.widget.AbsListView r0 = r5.list
            if (r0 != 0) goto L1c
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            r0 = r1
        L1c:
            android.view.View r0 = r0.getChildAt(r2)
            if (r0 == 0) goto L27
            int r0 = r0.getTop()
            goto L28
        L27:
            r0 = r2
        L28:
            r5.topOffset = r0
        L2a:
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r5.a
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r0.getPrefs()
            java.lang.String r3 = "rememberScroll"
            r4 = 2
            boolean r0 = com.lumina.monsterhunterfieldbook.NativePrefs.flag$default(r0, r3, r2, r4, r1)
            if (r0 == 0) goto L59
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r5.a
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r0.getPrefs()
            java.lang.String r1 = r5.section
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "position:"
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            int r2 = r5.position
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.set(r1, r2)
        L59:
            return
    }

    private final int columns() {
            r3 = this;
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r3.a
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r0.getPrefs()
            java.lang.String r1 = "columns"
            java.lang.String r2 = "auto"
            java.lang.String r0 = r0.text(r1, r2)
            java.lang.String r1 = "text(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Integer r0 = kotlin.text.StringsKt.toIntOrNull(r0)
            if (r0 == 0) goto L24
            int r0 = r0.intValue()
            r1 = 1
            r2 = 6
            int r0 = kotlin.ranges.RangesKt.coerceIn(r0, r1, r2)
            return r0
        L24:
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r3.a
            boolean r0 = r0.getWide()
            if (r0 == 0) goto L2e
            r0 = 4
            return r0
        L2e:
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r3.a
            boolean r0 = r0.getLandscape()
            if (r0 == 0) goto L38
            r0 = 3
            return r0
        L38:
            r0 = 2
            return r0
    }

    private final java.lang.String defaultSort(com.lumina.monsterhunterfieldbook.LibraryScreen.Collection r5) {
            r4 = this;
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r4.a
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r0.getPrefs()
            java.lang.String r1 = r5.getKind()
            int r2 = r1.hashCode()
            r3 = -1547897723(0xffffffffa3bcf485, float:-2.0486559E-17)
            if (r2 == r3) goto L33
            r3 = -1406985801(0xffffffffac2319b7, float:-2.3177968E-12)
            if (r2 == r3) goto L27
            r3 = 70973344(0x43af7a0, float:2.1977899E-36)
            if (r2 == r3) goto L1e
            goto L3b
        L1e:
            java.lang.String r2 = "Items"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L5b
            goto L3b
        L27:
            java.lang.String r2 = "Weapons"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L30
            goto L3b
        L30:
            java.lang.String r5 = "sortWeapons"
            goto L5d
        L33:
            java.lang.String r2 = "Recipes"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L5b
        L3b:
            java.lang.String r1 = r5.getCategory()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r2 = kotlin.text.StringsKt.isBlank(r1)
            if (r2 == 0) goto L4b
            java.lang.String r1 = r5.getKind()
        L4b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r2 = "sort:"
            r5.<init>(r2)
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.String r5 = r5.toString()
            goto L5d
        L5b:
            java.lang.String r5 = "sortResources"
        L5d:
            java.lang.String r1 = "name"
            java.lang.String r5 = r0.text(r5, r1)
            return r5
    }

    private final android.view.View gridCard(com.lumina.monsterhunterfieldbook.FieldRecord r18) {
            r17 = this;
            r0 = r17
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            android.widget.LinearLayout r1 = r1.column()
            r2 = 17
            r1.setGravity(r2)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            r7 = 7
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.graphics.drawable.GradientDrawable r3 = com.lumina.monsterhunterfieldbook.MainActivity.surface$default(r3, r4, r5, r6, r7, r8)
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
            r1.setBackground(r3)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            r4 = r1
            android.view.View r4 = (android.view.View) r4
            int r5 = r0.columns()
            r6 = 3
            if (r5 <= r6) goto L2b
            r5 = r6
            goto L2d
        L2b:
            r5 = 9
        L2d:
            r3.pad(r4, r5)
            android.widget.ImageView r3 = new android.widget.ImageView
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r0.a
            android.content.Context r5 = (android.content.Context) r5
            r3.<init>(r5)
            android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.FIT_CENTER
            r3.setScaleType(r5)
            java.lang.String r5 = r18.getName()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r5 = r7.append(r5)
            java.lang.String r7 = " artwork"
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r3.setContentDescription(r5)
            int r5 = r0.columns()
            if (r5 <= r6) goto L63
            r5 = 50
            goto L6e
        L63:
            int r5 = r0.columns()
            if (r5 != r6) goto L6c
            r5 = 75
            goto L6e
        L6c:
            r5 = 120(0x78, float:1.68E-43)
        L6e:
            r7 = r3
            android.view.View r7 = (android.view.View) r7
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r0.a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r9.dp(r5)
            r9 = -1
            r8.<init>(r9, r5)
            android.view.ViewGroup$LayoutParams r8 = (android.view.ViewGroup.LayoutParams) r8
            r1.addView(r7, r8)
            java.lang.String r5 = r18.getImage()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = kotlin.text.StringsKt.isBlank(r5)
            if (r5 != 0) goto L9d
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r0.a
            java.lang.String r7 = r18.getImage()
            r5.assetImage(r7, r3)
        L9d:
            com.lumina.monsterhunterfieldbook.MainActivity r10 = r0.a
            java.lang.String r11 = r18.getName()
            int r3 = r0.columns()
            if (r3 <= r6) goto Lac
            r3 = 1091567616(0x41100000, float:9.0)
            goto Lae
        Lac:
            r3 = 1095761920(0x41500000, float:13.0)
        Lae:
            r12 = r3
            r15 = 12
            r16 = 0
            r13 = 0
            r14 = 0
            android.widget.TextView r3 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r10, r11, r12, r13, r14, r15, r16)
            r3.setGravity(r2)
            r3.setMaxLines(r6)
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r3.setEllipsize(r2)
            android.view.View r3 = (android.view.View) r3
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r0.a
            int r7 = r0.columns()
            if (r7 <= r6) goto Ld3
            r6 = 40
            goto Ld5
        Ld3:
            r6 = 46
        Ld5:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            int r5 = r5.dp(r6)
            r2.<init>(r9, r5)
            android.view.ViewGroup$LayoutParams r2 = (android.view.ViewGroup.LayoutParams) r2
            r1.addView(r3, r2)
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda11 r2 = new com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda11
            r3 = r18
            r2.<init>(r0, r3)
            r1.touch(r4, r2)
            return r4
    }

    private static final kotlin.Unit gridCard$lambda$2(com.lumina.monsterhunterfieldbook.LibraryScreen r0, com.lumina.monsterhunterfieldbook.FieldRecord r1) {
            r0.select(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    private final boolean isGrid() {
            r2 = this;
            java.lang.String r0 = r2.section
            java.lang.String r1 = "bestiary"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            return r0
    }

    private final java.lang.String key(com.lumina.monsterhunterfieldbook.LibraryScreen.Collection r5) {
            r4 = this;
            java.lang.String r0 = r4.section
            java.lang.String r1 = r5.getCategory()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r2 = kotlin.text.StringsKt.isBlank(r1)
            if (r2 == 0) goto L12
            java.lang.String r1 = r5.getKind()
        L12:
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r4.a
            java.lang.String r5 = r5.getCurrentEdition()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "filter:"
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = ":"
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            return r5
    }

    private final void load(boolean r5) {
            r4 = this;
            if (r5 == 0) goto L5
            r4.positionReset()
        L5:
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r4.a
            com.lumina.monsterhunterfieldbook.Catalogue r5 = r5.getCatalogue()
            boolean r5 = r5.getReady()
            if (r5 != 0) goto L1b
            android.widget.TextView r5 = r4.status
            java.lang.String r0 = "Preparing offline catalogue…"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r5.setText(r0)
            return
        L1b:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.generations
            int r5 = r5.incrementAndGet()
            com.lumina.monsterhunterfieldbook.LibraryFilter r0 = r4.filter
            boolean r1 = r4.tree
            if (r1 == 0) goto L38
            com.lumina.monsterhunterfieldbook.LibraryScreen$Collection r1 = r4.collection
            java.lang.String r1 = r1.getKind()
            java.lang.String r2 = "Weapons"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == 0) goto L38
            r1 = 10000(0x2710, float:1.4013E-41)
            goto L40
        L38:
            int r1 = r4.limit
            r2 = 12000(0x2ee0, float:1.6816E-41)
            int r1 = kotlin.ranges.RangesKt.coerceAtMost(r1, r2)
        L40:
            android.widget.TextView r2 = r4.status
            java.lang.String r3 = "Loading…"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setText(r3)
            android.widget.TextView r2 = r4.more
            r3 = 0
            r2.setEnabled(r3)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r4.a
            com.lumina.monsterhunterfieldbook.Catalogue r2 = r2.getCatalogue()
            java.util.concurrent.ExecutorService r2 = r2.getExecutor()
            com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda6 r3 = new com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda6
            r3.<init>(r4, r0, r1, r5)
            r2.execute(r3)
            return
    }

    static /* synthetic */ void load$default(com.lumina.monsterhunterfieldbook.LibraryScreen r0, boolean r1, int r2, java.lang.Object r3) {
            r3 = 1
            r2 = r2 & r3
            if (r2 == 0) goto L5
            r1 = r3
        L5:
            r0.load(r1)
            return
    }

    private static final void load$lambda$0(com.lumina.monsterhunterfieldbook.LibraryScreen r2, com.lumina.monsterhunterfieldbook.LibraryFilter r3, int r4, int r5) {
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L12
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r2.a     // Catch: java.lang.Throwable -> L12
            com.lumina.monsterhunterfieldbook.Catalogue r0 = r0.getCatalogue()     // Catch: java.lang.Throwable -> L12
            r1 = 0
            com.lumina.monsterhunterfieldbook.LibraryPage r3 = r0.browse(r3, r1, r4)     // Catch: java.lang.Throwable -> L12
            java.lang.Object r3 = kotlin.Result.m79constructorimpl(r3)     // Catch: java.lang.Throwable -> L12
            goto L1d
        L12:
            r3 = move-exception
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r3 = kotlin.Result.m79constructorimpl(r3)
        L1d:
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r2.a
            com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda0 r0 = new com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda0
            r0.<init>(r2, r5, r3)
            r4.runOnUiThread(r0)
            return
    }

    private static final void load$lambda$0$1(com.lumina.monsterhunterfieldbook.LibraryScreen r9, int r10, java.lang.Object r11) {
            boolean r0 = r9.isAttachedToWindow()
            if (r0 == 0) goto L1cc
            java.util.concurrent.atomic.AtomicInteger r0 = r9.generations
            int r0 = r0.get()
            if (r10 == r0) goto L10
            goto L1cc
        L10:
            java.lang.Throwable r10 = kotlin.Result.m82exceptionOrNullimpl(r11)
            if (r10 == 0) goto L1f
            android.widget.TextView r10 = r9.status
            java.lang.String r0 = "Could not load this library. Reopen it to try again."
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.setText(r0)
        L1f:
            boolean r10 = kotlin.Result.m86isSuccessimpl(r11)
            if (r10 == 0) goto L1cc
            com.lumina.monsterhunterfieldbook.LibraryPage r11 = (com.lumina.monsterhunterfieldbook.LibraryPage) r11
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r10 = r9.records
            r10.clear()
            java.util.Map<java.lang.String, java.lang.Integer> r10 = r9.depths
            r10.clear()
            boolean r10 = r9.tree
            r0 = 0
            if (r10 == 0) goto L115
            com.lumina.monsterhunterfieldbook.LibraryScreen$Collection r10 = r9.collection
            java.lang.String r10 = r10.getKind()
            java.lang.String r1 = "Weapons"
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r1)
            if (r10 == 0) goto L115
            java.util.List r10 = r11.getRecords()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            r1 = 10
            int r1 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r10, r1)
            int r1 = kotlin.collections.MapsKt.mapCapacity(r1)
            r2 = 16
            int r1 = kotlin.ranges.RangesKt.coerceAtLeast(r1, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r1)
            java.util.Map r2 = (java.util.Map) r2
            java.util.Iterator r1 = r10.iterator()
        L65:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L80
            java.lang.Object r3 = r1.next()
            r4 = r3
            com.lumina.monsterhunterfieldbook.FieldRecord r4 = (com.lumina.monsterhunterfieldbook.FieldRecord) r4
            org.json.JSONObject r4 = r4.data()
            java.lang.String r5 = "id"
            java.lang.String r4 = r4.optString(r5)
            r2.put(r4, r3)
            goto L65
        L80:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Map r1 = (java.util.Map) r1
            java.util.Iterator r3 = r10.iterator()
        L8b:
            boolean r4 = r3.hasNext()
            java.lang.String r5 = "parent"
            if (r4 == 0) goto Lb8
            java.lang.Object r4 = r3.next()
            r6 = r4
            com.lumina.monsterhunterfieldbook.FieldRecord r6 = (com.lumina.monsterhunterfieldbook.FieldRecord) r6
            org.json.JSONObject r6 = r6.data()
            java.lang.String r5 = r6.optString(r5)
            java.lang.Object r6 = r1.get(r5)
            if (r6 != 0) goto Lb2
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r6 = (java.util.List) r6
            r1.put(r5, r6)
        Lb2:
            java.util.List r6 = (java.util.List) r6
            r6.add(r4)
            goto L8b
        Lb8:
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.util.Set r3 = (java.util.Set) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r6 = r10.iterator()
        Lca:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Le9
            java.lang.Object r7 = r6.next()
            r8 = r7
            com.lumina.monsterhunterfieldbook.FieldRecord r8 = (com.lumina.monsterhunterfieldbook.FieldRecord) r8
            org.json.JSONObject r8 = r8.data()
            java.lang.String r8 = r8.optString(r5)
            boolean r8 = r2.containsKey(r8)
            if (r8 != 0) goto Lca
            r4.add(r7)
            goto Lca
        Le9:
            java.util.List r4 = (java.util.List) r4
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r2 = r4.iterator()
        Lf1:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L101
            java.lang.Object r4 = r2.next()
            com.lumina.monsterhunterfieldbook.FieldRecord r4 = (com.lumina.monsterhunterfieldbook.FieldRecord) r4
            load$lambda$0$1$1$append(r3, r9, r1, r4, r0)
            goto Lf1
        L101:
            java.util.Iterator r10 = r10.iterator()
        L105:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L122
            java.lang.Object r2 = r10.next()
            com.lumina.monsterhunterfieldbook.FieldRecord r2 = (com.lumina.monsterhunterfieldbook.FieldRecord) r2
            load$lambda$0$1$1$append(r3, r9, r1, r2, r0)
            goto L105
        L115:
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r10 = r9.records
            java.util.Collection r10 = (java.util.Collection) r10
            java.util.List r1 = r11.getRecords()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlin.collections.CollectionsKt.addAll(r10, r1)
        L122:
            android.widget.TextView r10 = r9.status
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r1 = r9.records
            int r1 = r1.size()
            int r2 = r11.getTotal()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r3 = " / "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " entries"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r10.setText(r1)
            android.widget.TextView r10 = r9.more
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r1 = r9.records
            int r1 = r1.size()
            int r11 = r11.getTotal()
            if (r1 >= r11) goto L15f
            goto L161
        L15f:
            r0 = 8
        L161:
            r10.setVisibility(r0)
            android.widget.TextView r10 = r9.more
            r11 = 1
            r10.setEnabled(r11)
            com.lumina.monsterhunterfieldbook.LibraryScreen$adapter$1 r10 = r9.adapter
            r10.notifyDataSetChanged()
            android.widget.AbsListView r10 = r9.list
            r11 = 0
            if (r10 != 0) goto L17a
            java.lang.String r10 = "list"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r10)
            r10 = r11
        L17a:
            com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda9 r0 = new com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda9
            r0.<init>(r9)
            r10.post(r0)
            java.lang.String r10 = r9.selection
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            boolean r10 = kotlin.text.StringsKt.isBlank(r10)
            if (r10 != 0) goto L1cc
            android.widget.FrameLayout r10 = r9.details
            if (r10 == 0) goto L1cc
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r10 = r9.records
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L198:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L1b2
            java.lang.Object r0 = r10.next()
            r1 = r0
            com.lumina.monsterhunterfieldbook.FieldRecord r1 = (com.lumina.monsterhunterfieldbook.FieldRecord) r1
            java.lang.String r1 = r1.getId()
            java.lang.String r2 = r9.selection
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == 0) goto L198
            r11 = r0
        L1b2:
            com.lumina.monsterhunterfieldbook.FieldRecord r11 = (com.lumina.monsterhunterfieldbook.FieldRecord) r11
            if (r11 == 0) goto L1ba
            r9.select(r11)
            return
        L1ba:
            com.lumina.monsterhunterfieldbook.MainActivity r10 = r9.a
            com.lumina.monsterhunterfieldbook.Catalogue r10 = r10.getCatalogue()
            java.util.concurrent.ExecutorService r10 = r10.getExecutor()
            com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda10 r11 = new com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda10
            r11.<init>(r9)
            r10.execute(r11)
        L1cc:
            return
    }

    private static final void load$lambda$0$1$1$6(com.lumina.monsterhunterfieldbook.LibraryScreen r3) {
            android.widget.AbsListView r0 = r3.list
            r1 = 0
            java.lang.String r2 = "list"
            if (r0 != 0) goto Lb
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            r0 = r1
        Lb:
            boolean r0 = r0 instanceof android.widget.ListView
            if (r0 == 0) goto L22
            android.widget.AbsListView r0 = r3.list
            if (r0 != 0) goto L17
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            goto L18
        L17:
            r1 = r0
        L18:
            android.widget.ListView r1 = (android.widget.ListView) r1
            int r0 = r3.position
            int r3 = r3.topOffset
            r1.setSelectionFromTop(r0, r3)
            return
        L22:
            android.widget.AbsListView r0 = r3.list
            if (r0 != 0) goto L2a
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            goto L2b
        L2a:
            r1 = r0
        L2b:
            int r3 = r3.position
            r1.setSelection(r3)
            return
    }

    private static final void load$lambda$0$1$1$9(com.lumina.monsterhunterfieldbook.LibraryScreen r3) {
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r3.a
            com.lumina.monsterhunterfieldbook.Catalogue r0 = r0.getCatalogue()
            java.lang.String r1 = r3.selection
            com.lumina.monsterhunterfieldbook.FieldRecord r0 = r0.record(r1)
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r3.a
            com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda7 r2 = new com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda7
            r2.<init>(r3, r0)
            r1.runOnUiThread(r2)
            return
    }

    private static final void load$lambda$0$1$1$9$0(com.lumina.monsterhunterfieldbook.LibraryScreen r1, com.lumina.monsterhunterfieldbook.FieldRecord r2) {
            boolean r0 = r1.isAttachedToWindow()
            if (r0 == 0) goto Lb
            if (r2 == 0) goto Lb
            r1.select(r2)
        Lb:
            return
    }

    private static final void load$lambda$0$1$1$append(java.util.Set<java.lang.String> r3, com.lumina.monsterhunterfieldbook.LibraryScreen r4, java.util.Map<java.lang.String, ? extends java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord>> r5, com.lumina.monsterhunterfieldbook.FieldRecord r6, int r7) {
            java.lang.String r0 = r6.getId()
            boolean r0 = r3.add(r0)
            if (r0 != 0) goto Lb
            goto L4f
        Lb:
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r0 = r4.records
            java.util.Collection r0 = (java.util.Collection) r0
            r0.add(r6)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r4.depths
            java.lang.String r1 = r6.getId()
            r2 = 10
            int r2 = kotlin.ranges.RangesKt.coerceAtMost(r7, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            org.json.JSONObject r6 = r6.data()
            java.lang.String r0 = "id"
            java.lang.String r6 = r6.optString(r0)
            java.lang.Object r6 = r5.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L4f
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L3d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r0 = r6.next()
            com.lumina.monsterhunterfieldbook.FieldRecord r0 = (com.lumina.monsterhunterfieldbook.FieldRecord) r0
            int r1 = r7 + 1
            load$lambda$0$1$1$append(r3, r4, r5, r0, r1)
            goto L3d
        L4f:
            return
    }

    private final com.lumina.monsterhunterfieldbook.LibraryFilter loadFilter(com.lumina.monsterhunterfieldbook.LibraryScreen.Collection r12) {
            r11 = this;
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L1f
            r0 = r11
            com.lumina.monsterhunterfieldbook.LibraryScreen r0 = (com.lumina.monsterhunterfieldbook.LibraryScreen) r0     // Catch: java.lang.Throwable -> L1f
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1f
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r11.a     // Catch: java.lang.Throwable -> L1f
            com.lumina.monsterhunterfieldbook.NativePrefs r1 = r1.getPrefs()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = r11.key(r12)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = "{}"
            java.lang.String r1 = r1.text(r2, r3)     // Catch: java.lang.Throwable -> L1f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = kotlin.Result.m79constructorimpl(r0)     // Catch: java.lang.Throwable -> L1f
            goto L2a
        L1f:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m79constructorimpl(r0)
        L2a:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            boolean r2 = kotlin.Result.m85isFailureimpl(r0)
            if (r2 == 0) goto L36
            r0 = r1
        L36:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            com.lumina.monsterhunterfieldbook.LibraryFilter r1 = new com.lumina.monsterhunterfieldbook.LibraryFilter
            java.lang.String r2 = r12.getKind()
            java.lang.String r3 = r12.getCategory()
            java.lang.String r4 = "query"
            java.lang.String r4 = r0.optString(r4)
            java.lang.String r5 = "optString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r11.a
            java.lang.String r6 = r6.getCurrentEdition()
            java.lang.String r7 = "game"
            java.lang.String r6 = r0.optString(r7, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            java.lang.String r7 = "rank"
            java.lang.String r8 = "all"
            java.lang.String r7 = r0.optString(r7, r8)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            java.lang.String r9 = "rarity"
            java.lang.String r9 = r0.optString(r9, r8)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r5)
            java.lang.String r10 = "type"
            java.lang.String r8 = r0.optString(r10, r8)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r5)
            java.lang.String r10 = "sort"
            java.lang.String r12 = r11.defaultSort(r12)
            java.lang.String r12 = r0.optString(r10, r12)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r5)
            r5 = r6
            r6 = r7
            r7 = r9
            r9 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
    }

    private static final kotlin.Unit more$lambda$0(com.lumina.monsterhunterfieldbook.LibraryScreen r2) {
            r2.capturePosition()
            int r0 = r2.limit
            int r1 = r2.batchSize()
            int r0 = r0 + r1
            r2.limit = r0
            r0 = 0
            r2.load(r0)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    private final void positionReset() {
            r1 = this;
            r0 = 0
            r1.position = r0
            r1.topOffset = r0
            return
    }

    private final void saveFilter() {
            r5 = this;
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r5.a
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r0.getPrefs()
            com.lumina.monsterhunterfieldbook.LibraryScreen$Collection r1 = r5.collection
            java.lang.String r1 = r5.key(r1)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            com.lumina.monsterhunterfieldbook.LibraryFilter r3 = r5.filter
            java.lang.String r3 = r3.getQuery()
            java.lang.String r4 = "query"
            org.json.JSONObject r2 = r2.put(r4, r3)
            com.lumina.monsterhunterfieldbook.LibraryFilter r3 = r5.filter
            java.lang.String r3 = r3.getGame()
            java.lang.String r4 = "game"
            org.json.JSONObject r2 = r2.put(r4, r3)
            com.lumina.monsterhunterfieldbook.LibraryFilter r3 = r5.filter
            java.lang.String r3 = r3.getRank()
            java.lang.String r4 = "rank"
            org.json.JSONObject r2 = r2.put(r4, r3)
            com.lumina.monsterhunterfieldbook.LibraryFilter r3 = r5.filter
            java.lang.String r3 = r3.getRarity()
            java.lang.String r4 = "rarity"
            org.json.JSONObject r2 = r2.put(r4, r3)
            com.lumina.monsterhunterfieldbook.LibraryFilter r3 = r5.filter
            java.lang.String r3 = r3.getType()
            java.lang.String r4 = "type"
            org.json.JSONObject r2 = r2.put(r4, r3)
            com.lumina.monsterhunterfieldbook.LibraryFilter r3 = r5.filter
            java.lang.String r3 = r3.getSort()
            java.lang.String r4 = "sort"
            org.json.JSONObject r2 = r2.put(r4, r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r0.set(r1, r2)
            return
    }

    private final void select(com.lumina.monsterhunterfieldbook.FieldRecord r5) {
            r4 = this;
            java.lang.String r0 = r5.getId()
            r4.selection = r0
            android.widget.FrameLayout r0 = r4.details
            if (r0 != 0) goto L10
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r4.a
            r0.showRecord(r5)
            return
        L10:
            r0.removeAllViews()
            com.lumina.monsterhunterfieldbook.RecordPanel r1 = new com.lumina.monsterhunterfieldbook.RecordPanel
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r4.a
            com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda8 r3 = new com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda8
            r3.<init>(r4, r0)
            r1.<init>(r2, r5, r3)
            android.view.View r1 = (android.view.View) r1
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            r5.<init>(r2, r2)
            android.view.ViewGroup$LayoutParams r5 = (android.view.ViewGroup.LayoutParams) r5
            r0.addView(r1, r5)
            com.lumina.monsterhunterfieldbook.LibraryScreen$adapter$1 r5 = r4.adapter
            r5.notifyDataSetChanged()
            return
    }

    private static final kotlin.Unit select$lambda$0(com.lumina.monsterhunterfieldbook.LibraryScreen r1, android.widget.FrameLayout r2) {
            java.lang.String r0 = ""
            r1.selection = r0
            r2.removeAllViews()
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    public final boolean closeSelection() {
            r2 = this;
            java.lang.String r0 = r2.selection
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 != 0) goto L1f
            android.widget.FrameLayout r0 = r2.details
            if (r0 != 0) goto Lf
            goto L1f
        Lf:
            java.lang.String r1 = ""
            r2.selection = r1
            if (r0 == 0) goto L18
            r0.removeAllViews()
        L18:
            com.lumina.monsterhunterfieldbook.LibraryScreen$adapter$1 r0 = r2.adapter
            r0.notifyDataSetChanged()
            r0 = 1
            return r0
        L1f:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r2.generations
            r0.incrementAndGet()
            java.lang.Runnable r0 = r2.pending
            if (r0 == 0) goto Le
            android.os.Handler r1 = r2.handler
            r1.removeCallbacks(r0)
        Le:
            super.onDetachedFromWindow()
            return
    }

    public final org.json.JSONObject snapshot() {
            r3 = this;
            r3.capturePosition()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.List<com.lumina.monsterhunterfieldbook.LibraryScreen$Collection> r1 = r3.collections
            com.lumina.monsterhunterfieldbook.LibraryScreen$Collection r2 = r3.collection
            int r1 = r1.indexOf(r2)
            java.lang.String r2 = "collection"
            org.json.JSONObject r0 = r0.put(r2, r1)
            java.lang.String r1 = "limit"
            int r2 = r3.limit
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "position"
            int r2 = r3.position
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "top"
            int r2 = r3.topOffset
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "selected"
            java.lang.String r2 = r3.selection
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "tree"
            boolean r2 = r3.tree
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "put(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }
}
