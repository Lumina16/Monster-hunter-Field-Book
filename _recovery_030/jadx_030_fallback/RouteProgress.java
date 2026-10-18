package com.lumina.monsterhunterfieldbook;

/* compiled from: ProgressScreen.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/RouteProgress;", "", "<init>", "()V", "state", "Lorg/json/JSONObject;", "p", "Lcom/lumina/monsterhunterfieldbook/NativePrefs;", "game", "", "complete", "", "stage", "completeAll", "stages", "Lorg/json/JSONArray;", "visible", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RouteProgress {
    public static final com.lumina.monsterhunterfieldbook.RouteProgress INSTANCE = null;

    static {
            com.lumina.monsterhunterfieldbook.RouteProgress r0 = new com.lumina.monsterhunterfieldbook.RouteProgress
            r0.<init>()
            com.lumina.monsterhunterfieldbook.RouteProgress.INSTANCE = r0
            return
    }

    private RouteProgress() {
            r0 = this;
            r0.<init>()
            return
    }

    public final boolean complete(org.json.JSONObject r5, org.json.JSONObject r6) {
            r4 = this;
            java.lang.String r0 = "stage"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "tasks"
            org.json.JSONArray r5 = r5.optJSONArray(r0)
            r0 = 0
            if (r5 != 0) goto L14
            return r0
        L14:
            int r1 = r5.length()
            if (r1 <= 0) goto L56
            int r1 = r5.length()
            kotlin.ranges.IntRange r1 = kotlin.ranges.RangesKt.until(r0, r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L32
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L32
            goto L54
        L32:
            java.util.Iterator r1 = r1.iterator()
        L36:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L54
            r2 = r1
            kotlin.collections.IntIterator r2 = (kotlin.collections.IntIterator) r2
            int r2 = r2.nextInt()
            org.json.JSONObject r2 = r5.getJSONObject(r2)
            java.lang.String r3 = "id"
            java.lang.String r2 = r2.getString(r3)
            boolean r2 = r6.optBoolean(r2)
            if (r2 != 0) goto L36
            goto L56
        L54:
            r5 = 1
            return r5
        L56:
            return r0
    }

    public final boolean completeAll(org.json.JSONArray r6, org.json.JSONObject r7) {
            r5 = this;
            java.lang.String r0 = "stages"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = r6.length()
            r1 = 0
            if (r0 <= 0) goto L4e
            int r0 = r6.length()
            kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until(r1, r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L29
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L29
            goto L4c
        L29:
            java.util.Iterator r0 = r0.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4c
            r2 = r0
            kotlin.collections.IntIterator r2 = (kotlin.collections.IntIterator) r2
            int r2 = r2.nextInt()
            com.lumina.monsterhunterfieldbook.RouteProgress r3 = com.lumina.monsterhunterfieldbook.RouteProgress.INSTANCE
            org.json.JSONObject r2 = r6.getJSONObject(r2)
            java.lang.String r4 = "getJSONObject(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            boolean r2 = r3.complete(r2, r7)
            if (r2 != 0) goto L2d
            goto L4e
        L4c:
            r6 = 1
            return r6
        L4e:
            return r1
    }

    public final org.json.JSONObject state(com.lumina.monsterhunterfieldbook.NativePrefs r4, java.lang.String r5) {
            r3 = this;
            java.lang.String r0 = "progress:"
            java.lang.String r1 = "p"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            java.lang.String r1 = "game"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2e
            r1 = r3
            com.lumina.monsterhunterfieldbook.RouteProgress r1 = (com.lumina.monsterhunterfieldbook.RouteProgress) r1     // Catch: java.lang.Throwable -> L2e
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r5 = r2.append(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = "{}"
            java.lang.String r4 = r4.text(r5, r0)     // Catch: java.lang.Throwable -> L2e
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = kotlin.Result.m79constructorimpl(r1)     // Catch: java.lang.Throwable -> L2e
            goto L39
        L2e:
            r4 = move-exception
            kotlin.Result$Companion r5 = kotlin.Result.Companion
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)
            java.lang.Object r4 = kotlin.Result.m79constructorimpl(r4)
        L39:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            boolean r0 = kotlin.Result.m85isFailureimpl(r4)
            if (r0 == 0) goto L45
            r4 = r5
        L45:
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            return r4
    }

    public final int visible(org.json.JSONArray r5, org.json.JSONObject r6) {
            r4 = this;
            java.lang.String r0 = "stages"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r5.length()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L23
            org.json.JSONObject r2 = r5.getJSONObject(r1)
            java.lang.String r3 = "getJSONObject(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            boolean r2 = r4.complete(r2, r6)
            int r1 = r1 + 1
            if (r2 != 0) goto Lf
            return r1
        L23:
            int r5 = r5.length()
            return r5
    }
}
