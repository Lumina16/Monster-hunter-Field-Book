package com.lumina.monsterhunterfieldbook;

/* compiled from: MainActivity.kt */
@kotlin.Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\u008a\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J2\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"com/lumina/monsterhunterfieldbook/MainActivity$restoreContentOverlays$2$Restored", "", "descriptor", "Lorg/json/JSONObject;", "record", "Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "weapons", "", "<init>", "(Lorg/json/JSONObject;Lcom/lumina/monsterhunterfieldbook/FieldRecord;Ljava/util/List;)V", "getDescriptor", "()Lorg/json/JSONObject;", "getRecord", "()Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "getWeapons", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(Lorg/json/JSONObject;Lcom/lumina/monsterhunterfieldbook/FieldRecord;Ljava/util/List;)Lcom/lumina/monsterhunterfieldbook/MainActivity$restoreContentOverlays$2$Restored;", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MainActivity$restoreContentOverlays$2$Restored {
    private final org.json.JSONObject descriptor;
    private final com.lumina.monsterhunterfieldbook.FieldRecord record;
    private final java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> weapons;

    public MainActivity$restoreContentOverlays$2$Restored(org.json.JSONObject r2, com.lumina.monsterhunterfieldbook.FieldRecord r3, java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r4) {
            r1 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "record"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "weapons"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.<init>()
            r1.descriptor = r2
            r1.record = r3
            r1.weapons = r4
            return
    }

    public /* synthetic */ MainActivity$restoreContentOverlays$2$Restored(org.json.JSONObject r1, com.lumina.monsterhunterfieldbook.FieldRecord r2, java.util.List r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L8
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
        L8:
            r0.<init>(r1, r2, r3)
            return
    }

    public static /* synthetic */ com.lumina.monsterhunterfieldbook.MainActivity$restoreContentOverlays$2$Restored copy$default(com.lumina.monsterhunterfieldbook.MainActivity$restoreContentOverlays$2$Restored r0, org.json.JSONObject r1, com.lumina.monsterhunterfieldbook.FieldRecord r2, java.util.List r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            org.json.JSONObject r1 = r0.descriptor
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            com.lumina.monsterhunterfieldbook.FieldRecord r2 = r0.record
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r3 = r0.weapons
        L12:
            com.lumina.monsterhunterfieldbook.MainActivity$restoreContentOverlays$2$Restored r0 = r0.copy(r1, r2, r3)
            return r0
    }

    public final org.json.JSONObject component1() {
            r1 = this;
            org.json.JSONObject r0 = r1.descriptor
            return r0
    }

    public final com.lumina.monsterhunterfieldbook.FieldRecord component2() {
            r1 = this;
            com.lumina.monsterhunterfieldbook.FieldRecord r0 = r1.record
            return r0
    }

    public final java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> component3() {
            r1 = this;
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r0 = r1.weapons
            return r0
    }

    public final com.lumina.monsterhunterfieldbook.MainActivity$restoreContentOverlays$2$Restored copy(org.json.JSONObject r2, com.lumina.monsterhunterfieldbook.FieldRecord r3, java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r4) {
            r1 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "record"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "weapons"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            com.lumina.monsterhunterfieldbook.MainActivity$restoreContentOverlays$2$Restored r0 = new com.lumina.monsterhunterfieldbook.MainActivity$restoreContentOverlays$2$Restored
            r0.<init>(r2, r3, r4)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.lumina.monsterhunterfieldbook.MainActivity$restoreContentOverlays$2$Restored
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.lumina.monsterhunterfieldbook.MainActivity$restoreContentOverlays$2$Restored r5 = (com.lumina.monsterhunterfieldbook.MainActivity$restoreContentOverlays$2$Restored) r5
            org.json.JSONObject r1 = r4.descriptor
            org.json.JSONObject r3 = r5.descriptor
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            com.lumina.monsterhunterfieldbook.FieldRecord r1 = r4.record
            com.lumina.monsterhunterfieldbook.FieldRecord r3 = r5.record
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r1 = r4.weapons
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r5 = r5.weapons
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final org.json.JSONObject getDescriptor() {
            r1 = this;
            org.json.JSONObject r0 = r1.descriptor
            return r0
    }

    public final com.lumina.monsterhunterfieldbook.FieldRecord getRecord() {
            r1 = this;
            com.lumina.monsterhunterfieldbook.FieldRecord r0 = r1.record
            return r0
    }

    public final java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> getWeapons() {
            r1 = this;
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r0 = r1.weapons
            return r0
    }

    public int hashCode() {
            r2 = this;
            org.json.JSONObject r0 = r2.descriptor
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            com.lumina.monsterhunterfieldbook.FieldRecord r1 = r2.record
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r1 = r2.weapons
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            org.json.JSONObject r0 = r5.descriptor
            com.lumina.monsterhunterfieldbook.FieldRecord r1 = r5.record
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r2 = r5.weapons
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Restored(descriptor="
            r3.<init>(r4)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = ", record="
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", weapons="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
