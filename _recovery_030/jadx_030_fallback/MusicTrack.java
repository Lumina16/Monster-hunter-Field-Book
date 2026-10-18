package com.lumina.monsterhunterfieldbook;

/* compiled from: FieldAudio.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/MusicTrack;", "", "id", "", "title", "path", "builtin", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getTitle", "getPath", "getBuiltin", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MusicTrack {
    private final boolean builtin;
    private final java.lang.String id;
    private final java.lang.String path;
    private final java.lang.String title;

    public MusicTrack(java.lang.String r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r1 = this;
            java.lang.String r0 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "title"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.<init>()
            r1.id = r2
            r1.title = r3
            r1.path = r4
            r1.builtin = r5
            return
    }

    public static /* synthetic */ com.lumina.monsterhunterfieldbook.MusicTrack copy$default(com.lumina.monsterhunterfieldbook.MusicTrack r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            java.lang.String r1 = r0.id
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            java.lang.String r2 = r0.title
        Lc:
            r6 = r5 & 4
            if (r6 == 0) goto L12
            java.lang.String r3 = r0.path
        L12:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            boolean r4 = r0.builtin
        L18:
            com.lumina.monsterhunterfieldbook.MusicTrack r0 = r0.copy(r1, r2, r3, r4)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.id
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.title
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.path
            return r0
    }

    public final boolean component4() {
            r1 = this;
            boolean r0 = r1.builtin
            return r0
    }

    public final com.lumina.monsterhunterfieldbook.MusicTrack copy(java.lang.String r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r1 = this;
            java.lang.String r0 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "title"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            com.lumina.monsterhunterfieldbook.MusicTrack r0 = new com.lumina.monsterhunterfieldbook.MusicTrack
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.lumina.monsterhunterfieldbook.MusicTrack
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.lumina.monsterhunterfieldbook.MusicTrack r5 = (com.lumina.monsterhunterfieldbook.MusicTrack) r5
            java.lang.String r1 = r4.id
            java.lang.String r3 = r5.id
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.title
            java.lang.String r3 = r5.title
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.path
            java.lang.String r3 = r5.path
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            boolean r1 = r4.builtin
            boolean r5 = r5.builtin
            if (r1 == r5) goto L34
            return r2
        L34:
            return r0
    }

    public final boolean getBuiltin() {
            r1 = this;
            boolean r0 = r1.builtin
            return r0
    }

    public final java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.id
            return r0
    }

    public final java.lang.String getPath() {
            r1 = this;
            java.lang.String r0 = r1.path
            return r0
    }

    public final java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.title
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.id
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.title
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.path
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.builtin
            int r1 = java.lang.Boolean.hashCode(r1)
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r6 = this;
            java.lang.String r0 = r6.id
            java.lang.String r1 = r6.title
            java.lang.String r2 = r6.path
            boolean r3 = r6.builtin
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "MusicTrack(id="
            r4.<init>(r5)
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.String r4 = ", title="
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", path="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = ", builtin="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
