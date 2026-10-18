package com.lumina.monsterhunterfieldbook;

/* compiled from: Catalogue.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JY\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006%"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/LibraryFilter;", "", "kind", "", "category", "query", "game", "rank", "rarity", "type", "sort", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKind", "()Ljava/lang/String;", "getCategory", "getQuery", "getGame", "getRank", "getRarity", "getType", "getSort", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LibraryFilter {
    private final java.lang.String category;
    private final java.lang.String game;
    private final java.lang.String kind;
    private final java.lang.String query;
    private final java.lang.String rank;
    private final java.lang.String rarity;
    private final java.lang.String sort;
    private final java.lang.String type;

    public LibraryFilter(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r1 = this;
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "category"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "query"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "game"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "rank"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "rarity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "sort"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r1.<init>()
            r1.kind = r2
            r1.category = r3
            r1.query = r4
            r1.game = r5
            r1.rank = r6
            r1.rarity = r7
            r1.type = r8
            r1.sort = r9
            return
    }

    public /* synthetic */ LibraryFilter(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
            r1 = this;
            r11 = r10 & 2
            java.lang.String r0 = ""
            if (r11 == 0) goto L7
            r3 = r0
        L7:
            r11 = r10 & 4
            if (r11 == 0) goto Lc
            r4 = r0
        Lc:
            r11 = r10 & 8
            java.lang.String r0 = "all"
            if (r11 == 0) goto L13
            r5 = r0
        L13:
            r11 = r10 & 16
            if (r11 == 0) goto L18
            r6 = r0
        L18:
            r11 = r10 & 32
            if (r11 == 0) goto L1d
            r7 = r0
        L1d:
            r11 = r10 & 64
            if (r11 == 0) goto L22
            r8 = r0
        L22:
            r10 = r10 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L28
            java.lang.String r9 = "name"
        L28:
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static /* synthetic */ com.lumina.monsterhunterfieldbook.LibraryFilter copy$default(com.lumina.monsterhunterfieldbook.LibraryFilter r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9, java.lang.Object r10) {
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.String r1 = r0.kind
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lc
            java.lang.String r2 = r0.category
        Lc:
            r10 = r9 & 4
            if (r10 == 0) goto L12
            java.lang.String r3 = r0.query
        L12:
            r10 = r9 & 8
            if (r10 == 0) goto L18
            java.lang.String r4 = r0.game
        L18:
            r10 = r9 & 16
            if (r10 == 0) goto L1e
            java.lang.String r5 = r0.rank
        L1e:
            r10 = r9 & 32
            if (r10 == 0) goto L24
            java.lang.String r6 = r0.rarity
        L24:
            r10 = r9 & 64
            if (r10 == 0) goto L2a
            java.lang.String r7 = r0.type
        L2a:
            r9 = r9 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L30
            java.lang.String r8 = r0.sort
        L30:
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            r2 = r0
            com.lumina.monsterhunterfieldbook.LibraryFilter r0 = r2.copy(r3, r4, r5, r6, r7, r8, r9, r10)
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
            java.lang.String r0 = r1.query
            return r0
    }

    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.game
            return r0
    }

    public final java.lang.String component5() {
            r1 = this;
            java.lang.String r0 = r1.rank
            return r0
    }

    public final java.lang.String component6() {
            r1 = this;
            java.lang.String r0 = r1.rarity
            return r0
    }

    public final java.lang.String component7() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }

    public final java.lang.String component8() {
            r1 = this;
            java.lang.String r0 = r1.sort
            return r0
    }

    public final com.lumina.monsterhunterfieldbook.LibraryFilter copy(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
            r10 = this;
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "category"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "query"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "game"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "rank"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "rarity"
            r7 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "type"
            r8 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "sort"
            r9 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            com.lumina.monsterhunterfieldbook.LibraryFilter r1 = new com.lumina.monsterhunterfieldbook.LibraryFilter
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.lumina.monsterhunterfieldbook.LibraryFilter
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.lumina.monsterhunterfieldbook.LibraryFilter r5 = (com.lumina.monsterhunterfieldbook.LibraryFilter) r5
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
            java.lang.String r1 = r4.query
            java.lang.String r3 = r5.query
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
            java.lang.String r1 = r4.rank
            java.lang.String r3 = r5.rank
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.String r1 = r4.rarity
            java.lang.String r3 = r5.rarity
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            java.lang.String r1 = r4.type
            java.lang.String r3 = r5.type
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L59
            return r2
        L59:
            java.lang.String r1 = r4.sort
            java.lang.String r5 = r5.sort
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 != 0) goto L64
            return r2
        L64:
            return r0
    }

    public final java.lang.String getCategory() {
            r1 = this;
            java.lang.String r0 = r1.category
            return r0
    }

    public final java.lang.String getGame() {
            r1 = this;
            java.lang.String r0 = r1.game
            return r0
    }

    public final java.lang.String getKind() {
            r1 = this;
            java.lang.String r0 = r1.kind
            return r0
    }

    public final java.lang.String getQuery() {
            r1 = this;
            java.lang.String r0 = r1.query
            return r0
    }

    public final java.lang.String getRank() {
            r1 = this;
            java.lang.String r0 = r1.rank
            return r0
    }

    public final java.lang.String getRarity() {
            r1 = this;
            java.lang.String r0 = r1.rarity
            return r0
    }

    public final java.lang.String getSort() {
            r1 = this;
            java.lang.String r0 = r1.sort
            return r0
    }

    public final java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.type
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
            java.lang.String r1 = r2.query
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.game
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.rank
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.rarity
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.type
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.sort
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r10 = this;
            java.lang.String r0 = r10.kind
            java.lang.String r1 = r10.category
            java.lang.String r2 = r10.query
            java.lang.String r3 = r10.game
            java.lang.String r4 = r10.rank
            java.lang.String r5 = r10.rarity
            java.lang.String r6 = r10.type
            java.lang.String r7 = r10.sort
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "LibraryFilter(kind="
            r8.<init>(r9)
            java.lang.StringBuilder r0 = r8.append(r0)
            java.lang.String r8 = ", category="
            java.lang.StringBuilder r0 = r0.append(r8)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", query="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = ", game="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = ", rank="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = ", rarity="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r1 = ", type="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r1 = ", sort="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
