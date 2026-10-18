package com.lumina.monsterhunterfieldbook;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.uuid.Uuid;

/* compiled from: Catalogue.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JY\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006%"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/LibraryFilter;", "", "kind", "", "category", "query", "game", "rank", "rarity", "type", "sort", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKind", "()Ljava/lang/String;", "getCategory", "getQuery", "getGame", "getRank", "getRarity", "getType", "getSort", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class LibraryFilter {
    private final String category;
    private final String game;
    private final String kind;
    private final String query;
    private final String rank;
    private final String rarity;
    private final String sort;
    private final String type;

    public static /* synthetic */ LibraryFilter copy$default(LibraryFilter libraryFilter, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = libraryFilter.kind;
        }
        if ((i & 2) != 0) {
            str2 = libraryFilter.category;
        }
        if ((i & 4) != 0) {
            str3 = libraryFilter.query;
        }
        if ((i & 8) != 0) {
            str4 = libraryFilter.game;
        }
        if ((i & 16) != 0) {
            str5 = libraryFilter.rank;
        }
        if ((i & 32) != 0) {
            str6 = libraryFilter.rarity;
        }
        if ((i & 64) != 0) {
            str7 = libraryFilter.type;
        }
        if ((i & Uuid.SIZE_BITS) != 0) {
            str8 = libraryFilter.sort;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return libraryFilter.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* renamed from: component3, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* renamed from: component4, reason: from getter */
    public final String getGame() {
        return this.game;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRank() {
        return this.rank;
    }

    /* renamed from: component6, reason: from getter */
    public final String getRarity() {
        return this.rarity;
    }

    /* renamed from: component7, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSort() {
        return this.sort;
    }

    public final LibraryFilter copy(String kind, String category, String query, String game, String rank, String rarity, String type, String sort) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(game, "game");
        Intrinsics.checkNotNullParameter(rank, "rank");
        Intrinsics.checkNotNullParameter(rarity, "rarity");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(sort, "sort");
        return new LibraryFilter(kind, category, query, game, rank, rarity, type, sort);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LibraryFilter)) {
            return false;
        }
        LibraryFilter libraryFilter = (LibraryFilter) other;
        return Intrinsics.areEqual(this.kind, libraryFilter.kind) && Intrinsics.areEqual(this.category, libraryFilter.category) && Intrinsics.areEqual(this.query, libraryFilter.query) && Intrinsics.areEqual(this.game, libraryFilter.game) && Intrinsics.areEqual(this.rank, libraryFilter.rank) && Intrinsics.areEqual(this.rarity, libraryFilter.rarity) && Intrinsics.areEqual(this.type, libraryFilter.type) && Intrinsics.areEqual(this.sort, libraryFilter.sort);
    }

    public int hashCode() {
        return (((((((((((((this.kind.hashCode() * 31) + this.category.hashCode()) * 31) + this.query.hashCode()) * 31) + this.game.hashCode()) * 31) + this.rank.hashCode()) * 31) + this.rarity.hashCode()) * 31) + this.type.hashCode()) * 31) + this.sort.hashCode();
    }

    public String toString() {
        return "LibraryFilter(kind=" + this.kind + ", category=" + this.category + ", query=" + this.query + ", game=" + this.game + ", rank=" + this.rank + ", rarity=" + this.rarity + ", type=" + this.type + ", sort=" + this.sort + ")";
    }

    public LibraryFilter(String kind, String category, String query, String game, String rank, String rarity, String type, String sort) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(game, "game");
        Intrinsics.checkNotNullParameter(rank, "rank");
        Intrinsics.checkNotNullParameter(rarity, "rarity");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(sort, "sort");
        this.kind = kind;
        this.category = category;
        this.query = query;
        this.game = game;
        this.rank = rank;
        this.rarity = rarity;
        this.type = type;
        this.sort = sort;
    }

    public /* synthetic */ LibraryFilter(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "all" : str4, (i & 16) != 0 ? "all" : str5, (i & 32) != 0 ? "all" : str6, (i & 64) != 0 ? "all" : str7, (i & Uuid.SIZE_BITS) != 0 ? "name" : str8);
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getGame() {
        return this.game;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getQuery() {
        return this.query;
    }

    public final String getRank() {
        return this.rank;
    }

    public final String getRarity() {
        return this.rarity;
    }

    public final String getSort() {
        return this.sort;
    }

    public final String getType() {
        return this.type;
    }
}
