package com.lumina.monsterhunterfieldbook;

/* compiled from: Catalogue.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/LibraryPage;", "", "records", "", "Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "total", "", "<init>", "(Ljava/util/List;I)V", "getRecords", "()Ljava/util/List;", "getTotal", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LibraryPage {
    private final java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> records;
    private final int total;

    public LibraryPage(java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r2, int r3) {
            r1 = this;
            java.lang.String r0 = "records"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.records = r2
            r1.total = r3
            return
    }

    public static /* synthetic */ com.lumina.monsterhunterfieldbook.LibraryPage copy$default(com.lumina.monsterhunterfieldbook.LibraryPage r0, java.util.List r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r1 = r0.records
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            int r2 = r0.total
        Lc:
            com.lumina.monsterhunterfieldbook.LibraryPage r0 = r0.copy(r1, r2)
            return r0
    }

    public final java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> component1() {
            r1 = this;
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r0 = r1.records
            return r0
    }

    public final int component2() {
            r1 = this;
            int r0 = r1.total
            return r0
    }

    public final com.lumina.monsterhunterfieldbook.LibraryPage copy(java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r2, int r3) {
            r1 = this;
            java.lang.String r0 = "records"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            com.lumina.monsterhunterfieldbook.LibraryPage r0 = new com.lumina.monsterhunterfieldbook.LibraryPage
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.lumina.monsterhunterfieldbook.LibraryPage
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.lumina.monsterhunterfieldbook.LibraryPage r5 = (com.lumina.monsterhunterfieldbook.LibraryPage) r5
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r1 = r4.records
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r3 = r5.records
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r4.total
            int r5 = r5.total
            if (r1 == r5) goto L1e
            return r2
        L1e:
            return r0
    }

    public final java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> getRecords() {
            r1 = this;
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r0 = r1.records
            return r0
    }

    public final int getTotal() {
            r1 = this;
            int r0 = r1.total
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r0 = r2.records
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r2.total
            int r1 = java.lang.Integer.hashCode(r1)
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r0 = r4.records
            int r1 = r4.total
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "LibraryPage(records="
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = ", total="
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
