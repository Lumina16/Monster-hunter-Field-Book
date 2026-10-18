package com.lumina.monsterhunterfieldbook;

/* compiled from: Catalogue.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006$"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "", "id", "", "kind", "name", "game", "summary", "image", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getKind", "getName", "getGame", "getSummary", "getImage", "getPayload", "data", "Lorg/json/JSONObject;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FieldRecord {
    private final java.lang.String game;
    private final java.lang.String id;
    private final java.lang.String image;
    private final java.lang.String kind;
    private final java.lang.String name;
    private final java.lang.String payload;
    private final java.lang.String summary;

    public FieldRecord(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r1 = this;
            java.lang.String r0 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "game"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "summary"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "image"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "payload"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r1.<init>()
            r1.id = r2
            r1.kind = r3
            r1.name = r4
            r1.game = r5
            r1.summary = r6
            r1.image = r7
            r1.payload = r8
            return
    }

    public static /* synthetic */ com.lumina.monsterhunterfieldbook.FieldRecord copy$default(com.lumina.monsterhunterfieldbook.FieldRecord r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8, java.lang.Object r9) {
            r9 = r8 & 1
            if (r9 == 0) goto L6
            java.lang.String r1 = r0.id
        L6:
            r9 = r8 & 2
            if (r9 == 0) goto Lc
            java.lang.String r2 = r0.kind
        Lc:
            r9 = r8 & 4
            if (r9 == 0) goto L12
            java.lang.String r3 = r0.name
        L12:
            r9 = r8 & 8
            if (r9 == 0) goto L18
            java.lang.String r4 = r0.game
        L18:
            r9 = r8 & 16
            if (r9 == 0) goto L1e
            java.lang.String r5 = r0.summary
        L1e:
            r9 = r8 & 32
            if (r9 == 0) goto L24
            java.lang.String r6 = r0.image
        L24:
            r8 = r8 & 64
            if (r8 == 0) goto L2a
            java.lang.String r7 = r0.payload
        L2a:
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r2 = r0
            r3 = r1
            com.lumina.monsterhunterfieldbook.FieldRecord r0 = r2.copy(r3, r4, r5, r6, r7, r8, r9)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.id
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.kind
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.game
            return r0
    }

    public final java.lang.String component5() {
            r1 = this;
            java.lang.String r0 = r1.summary
            return r0
    }

    public final java.lang.String component6() {
            r1 = this;
            java.lang.String r0 = r1.image
            return r0
    }

    public final java.lang.String component7() {
            r1 = this;
            java.lang.String r0 = r1.payload
            return r0
    }

    public final com.lumina.monsterhunterfieldbook.FieldRecord copy(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16) {
            r9 = this;
            java.lang.String r0 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "game"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "summary"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "image"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "payload"
            r8 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            com.lumina.monsterhunterfieldbook.FieldRecord r1 = new com.lumina.monsterhunterfieldbook.FieldRecord
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
    }

    public final org.json.JSONObject data() {
            r2 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            java.lang.String r1 = r2.payload
            r0.<init>(r1)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.lumina.monsterhunterfieldbook.FieldRecord
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.lumina.monsterhunterfieldbook.FieldRecord r5 = (com.lumina.monsterhunterfieldbook.FieldRecord) r5
            java.lang.String r1 = r4.id
            java.lang.String r3 = r5.id
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.kind
            java.lang.String r3 = r5.kind
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.name
            java.lang.String r3 = r5.name
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.game
            java.lang.String r3 = r5.game
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.summary
            java.lang.String r3 = r5.summary
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.String r1 = r4.image
            java.lang.String r3 = r5.image
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            java.lang.String r1 = r4.payload
            java.lang.String r5 = r5.payload
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 != 0) goto L59
            return r2
        L59:
            return r0
    }

    public final java.lang.String getGame() {
            r1 = this;
            java.lang.String r0 = r1.game
            return r0
    }

    public final java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.id
            return r0
    }

    public final java.lang.String getImage() {
            r1 = this;
            java.lang.String r0 = r1.image
            return r0
    }

    public final java.lang.String getKind() {
            r1 = this;
            java.lang.String r0 = r1.kind
            return r0
    }

    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final java.lang.String getPayload() {
            r1 = this;
            java.lang.String r0 = r1.payload
            return r0
    }

    public final java.lang.String getSummary() {
            r1 = this;
            java.lang.String r0 = r1.summary
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.id
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.kind
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.name
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.game
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.summary
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.image
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.payload
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r9 = this;
            java.lang.String r0 = r9.id
            java.lang.String r1 = r9.kind
            java.lang.String r2 = r9.name
            java.lang.String r3 = r9.game
            java.lang.String r4 = r9.summary
            java.lang.String r5 = r9.image
            java.lang.String r6 = r9.payload
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "FieldRecord(id="
            r7.<init>(r8)
            java.lang.StringBuilder r0 = r7.append(r0)
            java.lang.String r7 = ", kind="
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", name="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = ", game="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = ", summary="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = ", image="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r1 = ", payload="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
