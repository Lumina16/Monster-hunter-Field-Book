package com.lumina.monsterhunterfieldbook;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: Catalogue.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006$"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "", "id", "", "kind", "name", "game", "summary", "image", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getKind", "getName", "getGame", "getSummary", "getImage", "getPayload", "data", "Lorg/json/JSONObject;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FieldRecord {
    private final String game;
    private final String id;
    private final String image;
    private final String kind;
    private final String name;
    private final String payload;
    private final String summary;

    public static /* synthetic */ FieldRecord copy$default(FieldRecord fieldRecord, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fieldRecord.id;
        }
        if ((i & 2) != 0) {
            str2 = fieldRecord.kind;
        }
        if ((i & 4) != 0) {
            str3 = fieldRecord.name;
        }
        if ((i & 8) != 0) {
            str4 = fieldRecord.game;
        }
        if ((i & 16) != 0) {
            str5 = fieldRecord.summary;
        }
        if ((i & 32) != 0) {
            str6 = fieldRecord.image;
        }
        if ((i & 64) != 0) {
            str7 = fieldRecord.payload;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return fieldRecord.copy(str, str2, str11, str4, str10, str8, str9);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getGame() {
        return this.game;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* renamed from: component6, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPayload() {
        return this.payload;
    }

    public final FieldRecord copy(String id, String kind, String name, String game, String summary, String image, String payload) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(game, "game");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(payload, "payload");
        return new FieldRecord(id, kind, name, game, summary, image, payload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FieldRecord)) {
            return false;
        }
        FieldRecord fieldRecord = (FieldRecord) other;
        return Intrinsics.areEqual(this.id, fieldRecord.id) && Intrinsics.areEqual(this.kind, fieldRecord.kind) && Intrinsics.areEqual(this.name, fieldRecord.name) && Intrinsics.areEqual(this.game, fieldRecord.game) && Intrinsics.areEqual(this.summary, fieldRecord.summary) && Intrinsics.areEqual(this.image, fieldRecord.image) && Intrinsics.areEqual(this.payload, fieldRecord.payload);
    }

    public int hashCode() {
        return (((((((((((this.id.hashCode() * 31) + this.kind.hashCode()) * 31) + this.name.hashCode()) * 31) + this.game.hashCode()) * 31) + this.summary.hashCode()) * 31) + this.image.hashCode()) * 31) + this.payload.hashCode();
    }

    public String toString() {
        return "FieldRecord(id=" + this.id + ", kind=" + this.kind + ", name=" + this.name + ", game=" + this.game + ", summary=" + this.summary + ", image=" + this.image + ", payload=" + this.payload + ")";
    }

    public FieldRecord(String id, String kind, String name, String game, String summary, String image, String payload) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(game, "game");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.game = game;
        this.summary = summary;
        this.image = image;
        this.payload = payload;
    }

    public final String getGame() {
        return this.game;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final JSONObject data() {
        return new JSONObject(this.payload);
    }
}
