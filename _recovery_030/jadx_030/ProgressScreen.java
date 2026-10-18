package com.lumina.monsterhunterfieldbook;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ProgressScreen.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/ProgressScreen;", "Landroid/widget/ScrollView;", "a", "Lcom/lumina/monsterhunterfieldbook/MainActivity;", "<init>", "(Lcom/lumina/monsterhunterfieldbook/MainActivity;)V", "body", "Landroid/widget/LinearLayout;", "game", "", "stages", "Lorg/json/JSONArray;", "kotlin.jvm.PlatformType", "state", "Lorg/json/JSONObject;", "groups", "", "Lcom/lumina/monsterhunterfieldbook/ReadingGroup;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProgressScreen extends ScrollView {
    private final MainActivity a;
    private final LinearLayout body;
    private final String game;
    private final List<ReadingGroup> groups;
    private final JSONArray stages;
    private final JSONObject state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressScreen(MainActivity a) {
        super(a);
        Object m79constructorimpl;
        int i;
        Intrinsics.checkNotNullParameter(a, "a");
        this.a = a;
        LinearLayout column = a.column();
        this.body = column;
        String edition = a.getEdition();
        this.game = edition;
        JSONArray jSONArray = a.getLibraryData().getJSONObject("speedrun").getJSONArray(edition);
        this.stages = jSONArray;
        this.state = RouteProgress.INSTANCE.state(a.getPrefs(), edition);
        this.groups = new ArrayList();
        a.pad(column, 14);
        addView(column);
        String upperCase = edition.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        column.addView(MainActivity.text$default(a, "Speedrun · " + upperCase, 27.0f, true, 0, 8, null));
        MainActivity.gap$default(a, column, 0, 2, null);
        Iterator<Integer> it = RangesKt.until(0, jSONArray.length()).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += this.stages.getJSONObject(((IntIterator) it).nextInt()).getJSONArray("tasks").length();
        }
        Iterator<Integer> it2 = RangesKt.until(0, this.stages.length()).iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            JSONArray jSONArray2 = this.stages.getJSONObject(((IntIterator) it2).nextInt()).getJSONArray("tasks");
            Iterable until = RangesKt.until(0, jSONArray2.length());
            if ((until instanceof Collection) && ((Collection) until).isEmpty()) {
                i = 0;
            } else {
                Iterator it3 = until.iterator();
                i = 0;
                while (it3.hasNext()) {
                    if (this.state.optBoolean(jSONArray2.getJSONObject(((IntIterator) it3).nextInt()).getString("id")) && (i = i + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            i3 += i;
        }
        this.body.addView(MainActivity.text$default(this.a, i3 + " / " + i2 + " requirements", 14.0f, false, this.a.getAccent(), 4, null));
        ProgressBar progressBar = new ProgressBar(this.a, null, android.R.attr.progressBarStyleHorizontal);
        progressBar.setMax(i2);
        progressBar.setProgress(i3);
        progressBar.setContentDescription(i3 + " of " + i2 + " story requirements completed");
        int i4 = 12;
        this.body.addView(progressBar, new LinearLayout.LayoutParams(-1, this.a.dp((Number) 12)));
        MainActivity.gap$default(this.a, this.body, 0, 2, null);
        RouteProgress routeProgress = RouteProgress.INSTANCE;
        JSONArray stages = this.stages;
        Intrinsics.checkNotNullExpressionValue(stages, "stages");
        int visible = routeProgress.visible(stages, this.state);
        int i5 = 0;
        while (i5 < visible) {
            final JSONObject jSONObject = this.stages.getJSONObject(i5);
            RouteProgress routeProgress2 = RouteProgress.INSTANCE;
            Intrinsics.checkNotNull(jSONObject);
            boolean complete = routeProgress2.complete(jSONObject, this.state);
            int i6 = i4;
            i5++;
            ReadingGroup readingGroup = new ReadingGroup(this.a, "route:" + this.game + ":" + jSONObject.getString("id"), i5 + ". " + jSONObject.getString("title") + (complete ? " · complete" : ""), this.groups, !complete, new Function1() { // from class: com.lumina.monsterhunterfieldbook.ProgressScreen$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit _init_$lambda$2;
                    _init_$lambda$2 = ProgressScreen._init_$lambda$2(ProgressScreen.this, jSONObject, (LinearLayout) obj);
                    return _init_$lambda$2;
                }
            });
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.bottomMargin = this.a.dp(Integer.valueOf(i6));
            Unit unit = Unit.INSTANCE;
            this.body.addView(readingGroup, layoutParams);
            i4 = i6;
        }
        RouteProgress routeProgress3 = RouteProgress.INSTANCE;
        JSONArray stages2 = this.stages;
        Intrinsics.checkNotNullExpressionValue(stages2, "stages");
        if (routeProgress3.completeAll(stages2, this.state)) {
            LinearLayout linearLayout = this.body;
            MainActivity mainActivity = this.a;
            String upperCase2 = this.game.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            linearLayout.addView(mainActivity.text(upperCase2 + " STORY COMPLETE", 16.0f, true, this.a.getAccent()));
            MainActivity.gap$default(this.a, this.body, 0, 2, null);
            if (Intrinsics.areEqual(this.game, "world")) {
                this.body.addView(this.a.button("Continue to Iceborne", new Function0() { // from class: com.lumina.monsterhunterfieldbook.ProgressScreen$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit _init_$lambda$4;
                        _init_$lambda$4 = ProgressScreen._init_$lambda$4(ProgressScreen.this);
                        return _init_$lambda$4;
                    }
                }));
            }
        } else {
            LinearLayout linearLayout2 = this.body;
            MainActivity mainActivity2 = this.a;
            linearLayout2.addView(MainActivity.text$default(mainActivity2, "Complete the current stage to reveal the next requirements.", 12.0f, false, mainActivity2.getMuted(), 4, null));
        }
        MainActivity.gap$default(this.a, this.body, 0, 2, null);
        this.body.addView(this.a.button("Reset this route", new Function0() { // from class: com.lumina.monsterhunterfieldbook.ProgressScreen$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit _init_$lambda$5;
                _init_$lambda$5 = ProgressScreen._init_$lambda$5(ProgressScreen.this);
                return _init_$lambda$5;
            }
        }));
        try {
            Result.Companion companion = Result.INSTANCE;
            ProgressScreen progressScreen = this;
            m79constructorimpl = Result.m79constructorimpl(new JSONObject(this.a.getPrefs().text("speedUndo", "{}")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m79constructorimpl = Result.m79constructorimpl(ResultKt.createFailure(th));
        }
        final JSONObject jSONObject2 = (JSONObject) (Result.m85isFailureimpl(m79constructorimpl) ? new JSONObject() : m79constructorimpl);
        if (Intrinsics.areEqual(jSONObject2.optString("game"), this.game) && jSONObject2.has("tasks")) {
            this.body.addView(this.a.button("Undo route reset", new Function0() { // from class: com.lumina.monsterhunterfieldbook.ProgressScreen$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit _init_$lambda$7;
                    _init_$lambda$7 = ProgressScreen._init_$lambda$7(ProgressScreen.this, jSONObject2);
                    return _init_$lambda$7;
                }
            }));
        }
        this.a.gap(this.body, 18);
        final JSONArray jSONArray3 = this.a.getLibraryData().getJSONObject("progress").getJSONArray(this.game);
        this.body.addView(new ReadingGroup(this.a, "campaign:" + this.game, "Campaign guidance & general goals", this.groups, false, new Function1() { // from class: com.lumina.monsterhunterfieldbook.ProgressScreen$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$8;
                _init_$lambda$8 = ProgressScreen._init_$lambda$8(ProgressScreen.this, jSONArray3, (LinearLayout) obj);
                return _init_$lambda$8;
            }
        }, 16, null), new LinearLayout.LayoutParams(-1, -2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$2(final ProgressScreen progressScreen, JSONObject jSONObject, LinearLayout inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        MainActivity mainActivity = progressScreen.a;
        String optString = jSONObject.optString("rank");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        inner.addView(MainActivity.text$default(mainActivity, optString, 11.0f, false, progressScreen.a.getMuted(), 4, null));
        JSONArray jSONArray = jSONObject.getJSONArray("tasks");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            final String string = jSONObject2.getString("id");
            LinearLayout row = progressScreen.a.row();
            CheckBox checkBox = new CheckBox(progressScreen.a);
            checkBox.setText(jSONObject2.getString("name"));
            checkBox.setTextColor(progressScreen.a.getInk());
            checkBox.setChecked(progressScreen.state.optBoolean(string));
            checkBox.setMinHeight(progressScreen.a.dp((Number) 48));
            row.addView(checkBox, new LinearLayout.LayoutParams(0, -2, 1.0f));
            String optString2 = jSONObject2.optString("questId");
            if (StringsKt.isBlank(optString2)) {
                optString2 = jSONObject2.optString("monsterId");
            }
            final String str = optString2;
            Intrinsics.checkNotNull(str);
            if (!StringsKt.isBlank(str)) {
                row.addView(progressScreen.a.button("Info", new Function0() { // from class: com.lumina.monsterhunterfieldbook.ProgressScreen$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProgressScreen.lambda$2$1(ProgressScreen.this, str);
                    }
                }));
            }
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.lumina.monsterhunterfieldbook.ProgressScreen$$ExternalSyntheticLambda7
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    ProgressScreen.lambda$2$2(ProgressScreen.this, string, compoundButton, z);
                }
            });
            inner.addView(row);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("tips");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        int length2 = optJSONArray.length();
        for (int i2 = 0; i2 < length2; i2++) {
            inner.addView(MainActivity.text$default(progressScreen.a, "• " + optJSONArray.getString(i2), 13.0f, false, progressScreen.a.getMuted(), 4, null));
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda$2$1(ProgressScreen progressScreen, String str) {
        MainActivity mainActivity = progressScreen.a;
        Intrinsics.checkNotNull(str);
        MainActivity.openReference$default(mainActivity, str, null, 2, null);
        return Unit.INSTANCE;
    }

    static final void lambda$2$2(ProgressScreen progressScreen, String str, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        progressScreen.state.put(str, z);
        NativePrefs prefs = progressScreen.a.getPrefs();
        String str2 = "progress:" + progressScreen.game;
        String jSONObject = progressScreen.state.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        prefs.set(str2, jSONObject);
        progressScreen.a.getPrefs().getValues().remove("speedUndo");
        progressScreen.a.getPrefs().save();
        progressScreen.a.refreshCurrentSection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$4(ProgressScreen progressScreen) {
        progressScreen.a.switchEdition("iceborne");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$5(final ProgressScreen progressScreen) {
        AlertDialog.Builder builder = new AlertDialog.Builder(progressScreen.a);
        String upperCase = progressScreen.game.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        builder.setTitle("Reset " + upperCase + " route?").setMessage("Clears this campaign’s checked requirements. Other campaign progress is kept. Undo is available until the next task change.").setNegativeButton("Keep", (DialogInterface.OnClickListener) null).setPositiveButton("Reset", new DialogInterface.OnClickListener() { // from class: com.lumina.monsterhunterfieldbook.ProgressScreen$$ExternalSyntheticLambda5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ProgressScreen.lambda$5$0(ProgressScreen.this, dialogInterface, i);
            }
        }).show();
        return Unit.INSTANCE;
    }

    static final void lambda$5$0(ProgressScreen progressScreen, DialogInterface dialogInterface, int i) {
        NativePrefs prefs = progressScreen.a.getPrefs();
        String jSONObject = new JSONObject().put("game", progressScreen.game).put("tasks", progressScreen.state).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        prefs.set("speedUndo", jSONObject);
        progressScreen.a.getPrefs().set("progress:" + progressScreen.game, "{}");
        progressScreen.a.refreshCurrentSection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$7(ProgressScreen progressScreen, JSONObject jSONObject) {
        NativePrefs prefs = progressScreen.a.getPrefs();
        String str = "progress:" + progressScreen.game;
        String jSONObject2 = jSONObject.getJSONObject("tasks").toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        prefs.set(str, jSONObject2);
        progressScreen.a.getPrefs().getValues().remove("speedUndo");
        progressScreen.a.getPrefs().save();
        progressScreen.a.refreshCurrentSection();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$8(final ProgressScreen progressScreen, JSONArray jSONArray, LinearLayout inner) {
        Object m79constructorimpl;
        Intrinsics.checkNotNullParameter(inner, "inner");
        try {
            Result.Companion companion = Result.INSTANCE;
            m79constructorimpl = Result.m79constructorimpl(new JSONObject(progressScreen.a.getPrefs().text("goals:" + progressScreen.game, "{}")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m79constructorimpl = Result.m79constructorimpl(ResultKt.createFailure(th));
        }
        JSONObject jSONObject = new JSONObject();
        if (Result.m85isFailureimpl(m79constructorimpl)) {
            m79constructorimpl = jSONObject;
        }
        final JSONObject jSONObject2 = (JSONObject) m79constructorimpl;
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i);
            MainActivity mainActivity = progressScreen.a;
            String string = jSONObject3.getString("title");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            inner.addView(MainActivity.text$default(mainActivity, string, 17.0f, true, 0, 8, null));
            MainActivity mainActivity2 = progressScreen.a;
            String optString = jSONObject3.optString("text");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            inner.addView(MainActivity.text$default(mainActivity2, optString, 14.0f, false, 0, 12, null));
            JSONArray jSONArray2 = jSONObject3.getJSONArray("tasks");
            int length2 = jSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                final String str = jSONObject3.getString("id") + ":" + i2;
                CheckBox checkBox = new CheckBox(progressScreen.a);
                checkBox.setText(jSONArray2.getString(i2));
                checkBox.setTextColor(progressScreen.a.getInk());
                checkBox.setChecked(jSONObject2.optBoolean(str));
                checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.lumina.monsterhunterfieldbook.ProgressScreen$$ExternalSyntheticLambda8
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        ProgressScreen.lambda$8$1$0(jSONObject2, str, progressScreen, compoundButton, z);
                    }
                });
                inner.addView(checkBox);
            }
            progressScreen.a.gap(inner, 14);
        }
        return Unit.INSTANCE;
    }

    static final void lambda$8$1$0(JSONObject jSONObject, String str, ProgressScreen progressScreen, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        jSONObject.put(str, z);
        NativePrefs prefs = progressScreen.a.getPrefs();
        String str2 = "goals:" + progressScreen.game;
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        prefs.set(str2, jSONObject2);
    }
}
