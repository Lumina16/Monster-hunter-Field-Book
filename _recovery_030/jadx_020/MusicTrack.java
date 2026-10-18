package com.lumina.monsterhunterfieldbook;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FieldAudio.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/MusicTrack;", "", "id", "", "title", "path", "builtin", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getTitle", "getPath", "getBuiltin", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MusicTrack {
    private final boolean builtin;
    private final String id;
    private final String path;
    private final String title;

    public static /* synthetic */ MusicTrack copy$default(MusicTrack musicTrack, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = musicTrack.id;
        }
        if ((i & 2) != 0) {
            str2 = musicTrack.title;
        }
        if ((i & 4) != 0) {
            str3 = musicTrack.path;
        }
        if ((i & 8) != 0) {
            z = musicTrack.builtin;
        }
        return musicTrack.copy(str, str2, str3, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getBuiltin() {
        return this.builtin;
    }

    public final MusicTrack copy(String id, String title, String path, boolean builtin) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(path, "path");
        return new MusicTrack(id, title, path, builtin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MusicTrack)) {
            return false;
        }
        MusicTrack musicTrack = (MusicTrack) other;
        return Intrinsics.areEqual(this.id, musicTrack.id) && Intrinsics.areEqual(this.title, musicTrack.title) && Intrinsics.areEqual(this.path, musicTrack.path) && this.builtin == musicTrack.builtin;
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.path.hashCode()) * 31) + Boolean.hashCode(this.builtin);
    }

    public String toString() {
        return "MusicTrack(id=" + this.id + ", title=" + this.title + ", path=" + this.path + ", builtin=" + this.builtin + ")";
    }

    public MusicTrack(String id, String title, String path, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(path, "path");
        this.id = id;
        this.title = title;
        this.path = path;
        this.builtin = z;
    }

    public final boolean getBuiltin() {
        return this.builtin;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getTitle() {
        return this.title;
    }
}
