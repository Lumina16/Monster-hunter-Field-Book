package com.lumina.monsterhunterfieldbook;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: NativePrefs.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0014J\u001e\u0010\u0015\u001a\n \b*\u0004\u0018\u00010\u00110\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0001J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\nR\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/NativePrefs;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "storage", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "value", "Lorg/json/JSONObject;", "values", "getValues", "()Lorg/json/JSONObject;", "number", "", "key", "", "default", "flag", "", "text", "set", "", "save", "reset", "snapshot", "applySnapshot", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NativePrefs {
    private final SharedPreferences storage;
    private JSONObject values;

    public NativePrefs(Context context) {
        Object m79constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        this.storage = context.getSharedPreferences("native-field-book", 0);
        try {
            Result.Companion companion = Result.INSTANCE;
            NativePrefs nativePrefs = this;
            String string = this.storage.getString("preferences", "{}");
            Intrinsics.checkNotNull(string);
            m79constructorimpl = Result.m79constructorimpl(new JSONObject(string));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m79constructorimpl = Result.m79constructorimpl(ResultKt.createFailure(th));
        }
        this.values = (JSONObject) (Result.m85isFailureimpl(m79constructorimpl) ? new JSONObject() : m79constructorimpl);
    }

    public final JSONObject getValues() {
        return this.values;
    }

    public final int number(String key, int r3) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.values.optInt(key, r3);
    }

    public static /* synthetic */ boolean flag$default(NativePrefs nativePrefs, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return nativePrefs.flag(str, z);
    }

    public final boolean flag(String key, boolean r3) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.values.optBoolean(key, r3);
    }

    public final String text(String key, String r3) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(r3, "default");
        return this.values.optString(key, r3);
    }

    public final void set(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.values.put(key, value);
        save();
    }

    public final void save() {
        this.storage.edit().putString("preferences", this.values.toString()).apply();
    }

    public final void reset() {
        this.values = new JSONObject();
        save();
    }

    public final JSONObject snapshot() {
        return new JSONObject(this.values.toString());
    }

    public final void applySnapshot(JSONObject snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.values = new JSONObject(snapshot.toString());
        save();
    }
}
