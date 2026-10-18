package com.lumina.monsterhunterfieldbook;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ProgressScreen.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/RouteProgress;", "", "<init>", "()V", "state", "Lorg/json/JSONObject;", "p", "Lcom/lumina/monsterhunterfieldbook/NativePrefs;", "game", "", "complete", "", "stage", "completeAll", "stages", "Lorg/json/JSONArray;", "visible", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RouteProgress {
    public static final RouteProgress INSTANCE = new RouteProgress();

    private RouteProgress() {
    }

    public final JSONObject state(NativePrefs p, String game) {
        Object m79constructorimpl;
        Intrinsics.checkNotNullParameter(p, "p");
        Intrinsics.checkNotNullParameter(game, "game");
        try {
            Result.Companion companion = Result.INSTANCE;
            RouteProgress routeProgress = this;
            m79constructorimpl = Result.m79constructorimpl(new JSONObject(p.text("progress:" + game, "{}")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m79constructorimpl = Result.m79constructorimpl(ResultKt.createFailure(th));
        }
        JSONObject jSONObject = new JSONObject();
        if (Result.m85isFailureimpl(m79constructorimpl)) {
            m79constructorimpl = jSONObject;
        }
        return (JSONObject) m79constructorimpl;
    }

    public final boolean complete(JSONObject stage, JSONObject state) {
        Intrinsics.checkNotNullParameter(stage, "stage");
        Intrinsics.checkNotNullParameter(state, "state");
        JSONArray optJSONArray = stage.optJSONArray("tasks");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            Iterable until = RangesKt.until(0, optJSONArray.length());
            if ((until instanceof Collection) && ((Collection) until).isEmpty()) {
                return true;
            }
            Iterator it = until.iterator();
            while (it.hasNext()) {
                if (!state.optBoolean(optJSONArray.getJSONObject(((IntIterator) it).nextInt()).getString("id"))) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean completeAll(JSONArray stages, JSONObject state) {
        Intrinsics.checkNotNullParameter(stages, "stages");
        Intrinsics.checkNotNullParameter(state, "state");
        if (stages.length() > 0) {
            Iterable until = RangesKt.until(0, stages.length());
            if ((until instanceof Collection) && ((Collection) until).isEmpty()) {
                return true;
            }
            Iterator it = until.iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                RouteProgress routeProgress = INSTANCE;
                JSONObject jSONObject = stages.getJSONObject(nextInt);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                if (!routeProgress.complete(jSONObject, state)) {
                }
            }
            return true;
        }
        return false;
    }

    public final int visible(JSONArray stages, JSONObject state) {
        Intrinsics.checkNotNullParameter(stages, "stages");
        Intrinsics.checkNotNullParameter(state, "state");
        int length = stages.length();
        int i = 0;
        while (i < length) {
            JSONObject jSONObject = stages.getJSONObject(i);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            i++;
            if (!complete(jSONObject, state)) {
                return i;
            }
        }
        return stages.length();
    }
}
