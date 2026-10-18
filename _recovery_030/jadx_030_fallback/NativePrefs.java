package com.lumina.monsterhunterfieldbook;

/* compiled from: NativePrefs.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0014J\u001e\u0010\u0015\u001a\n \b*\u0004\u0018\u00010\u00110\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0001J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\nR\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/NativePrefs;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "storage", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "value", "Lorg/json/JSONObject;", "values", "getValues", "()Lorg/json/JSONObject;", "number", "", "key", "", "default", "flag", "", "text", "set", "", "save", "reset", "snapshot", "applySnapshot", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NativePrefs {
    private final android.content.SharedPreferences storage;
    private org.json.JSONObject values;

    public NativePrefs(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r3.<init>()
            java.lang.String r0 = "native-field-book"
            r1 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r0, r1)
            r3.storage = r4
            kotlin.Result$Companion r4 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2d
            r4 = r3
            com.lumina.monsterhunterfieldbook.NativePrefs r4 = (com.lumina.monsterhunterfieldbook.NativePrefs) r4     // Catch: java.lang.Throwable -> L2d
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2d
            android.content.SharedPreferences r0 = r3.storage     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = "preferences"
            java.lang.String r2 = "{}"
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Throwable -> L2d
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: java.lang.Throwable -> L2d
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r4 = kotlin.Result.m79constructorimpl(r4)     // Catch: java.lang.Throwable -> L2d
            goto L38
        L2d:
            r4 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)
            java.lang.Object r4 = kotlin.Result.m79constructorimpl(r4)
        L38:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            boolean r1 = kotlin.Result.m85isFailureimpl(r4)
            if (r1 == 0) goto L44
            r4 = r0
        L44:
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            r3.values = r4
            return
    }

    public static /* synthetic */ boolean flag$default(com.lumina.monsterhunterfieldbook.NativePrefs r0, java.lang.String r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 1
        L5:
            boolean r0 = r0.flag(r1, r2)
            return r0
    }

    public final void applySnapshot(org.json.JSONObject r2) {
            r1 = this;
            java.lang.String r0 = "snapshot"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            r1.values = r0
            r1.save()
            return
    }

    public final boolean flag(java.lang.String r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            org.json.JSONObject r0 = r1.values
            boolean r2 = r0.optBoolean(r2, r3)
            return r2
    }

    public final org.json.JSONObject getValues() {
            r1 = this;
            org.json.JSONObject r0 = r1.values
            return r0
    }

    public final int number(java.lang.String r2, int r3) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            org.json.JSONObject r0 = r1.values
            int r2 = r0.optInt(r2, r3)
            return r2
    }

    public final void reset() {
            r1 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r1.values = r0
            r1.save()
            return
    }

    public final void save() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.storage
            android.content.SharedPreferences$Editor r0 = r0.edit()
            org.json.JSONObject r1 = r3.values
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "preferences"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            r0.apply()
            return
    }

    public final void set(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            org.json.JSONObject r0 = r1.values
            r0.put(r2, r3)
            r1.save()
            return
    }

    public final org.json.JSONObject snapshot() {
            r2 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            org.json.JSONObject r1 = r2.values
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            return r0
    }

    public final java.lang.String text(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "default"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            org.json.JSONObject r0 = r1.values
            java.lang.String r2 = r0.optString(r2, r3)
            return r2
    }
}
