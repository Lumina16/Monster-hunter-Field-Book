package com.lumina.monsterhunterfieldbook;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: WeaponProfilePanel.kt */
@Metadata(d1 = {"\u0000·\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t*\u00019\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010;\u001a\u00020\fH\u0002J\b\u0010<\u001a\u00020\fH\u0002J\u0006\u0010=\u001a\u00020\tJ\b\u0010>\u001a\u00020?H\u0002J\b\u0010@\u001a\u00020\fH\u0002J\u0006\u0010A\u001a\u00020.J\u0010\u0010B\u001a\u00020\f2\u0006\u0010C\u001a\u000202H\u0002J\u0010\u0010D\u001a\u00020\f2\u0006\u0010C\u001a\u000202H\u0002J\u0012\u0010E\u001a\u00020\f2\b\b\u0002\u0010F\u001a\u00020.H\u0002J\b\u0010G\u001a\u00020\fH\u0002J\b\u0010H\u001a\u00020\fH\u0002J\u001e\u0010I\u001a\u00020\f2\u0006\u0010J\u001a\u00020.2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0018\u0010L\u001a\u00020\f2\u0006\u0010M\u001a\u00020N2\u0006\u0010J\u001a\u00020.H\u0002J\u0010\u0010O\u001a\u00020\f2\u0006\u0010P\u001a\u00020QH\u0002J\b\u0010R\u001a\u00020\fH\u0002J\u0014\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00010TH\u0002J\b\u0010U\u001a\u00020\fH\u0002J\u001a\u0010V\u001a\u00020\f2\u0006\u0010W\u001a\u00020\u00012\b\u0010X\u001a\u0004\u0018\u00010?H\u0002J \u0010Y\u001a\u00020\f2\u0006\u0010W\u001a\u00020\u00012\u0006\u0010Z\u001a\u0002022\u0006\u0010[\u001a\u000202H\u0002J\u0010\u0010\\\u001a\u00020\u00182\u0006\u0010]\u001a\u000202H\u0002J\b\u0010^\u001a\u00020\fH\u0002J\b\u0010_\u001a\u000202H\u0002J:\u0010`\u001a\u00020\f2\u0006\u0010W\u001a\u00020a2\u0006\u0010Z\u001a\u0002022\u0006\u0010b\u001a\u0002022\u0018\u0010X\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u0002020T0\u0007H\u0002J\u0010\u0010c\u001a\u00020\f2\u0006\u0010d\u001a\u00020.H\u0002J\u0010\u0010e\u001a\u00020(2\u0006\u0010f\u001a\u00020\u0005H\u0002J\b\u0010g\u001a\u00020\fH\u0002J\b\u0010h\u001a\u00020\fH\u0002J\b\u0010i\u001a\u00020\fH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u00105\u001a\u0016\u0012\f\u0012\n 7*\u0004\u0018\u00010202\u0012\u0004\u0012\u00020\u000506X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u000209X\u0082\u0004¢\u0006\u0004\n\u0002\u0010:¨\u0006j"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/WeaponProfilePanel;", "Landroid/widget/LinearLayout;", "a", "Lcom/lumina/monsterhunterfieldbook/MainActivity;", "guide", "Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "records", "", "state", "Lorg/json/JSONObject;", "close", "Lkotlin/Function0;", "", "<init>", "(Lcom/lumina/monsterhunterfieldbook/MainActivity;Lcom/lumina/monsterhunterfieldbook/FieldRecord;Ljava/util/List;Lorg/json/JSONObject;Lkotlin/jvm/functions/Function0;)V", "getGuide", "()Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "getRecords", "()Ljava/util/List;", "getState", "()Lorg/json/JSONObject;", "heading", "tabs", "host", "Landroid/widget/FrameLayout;", "groups", "", "Lcom/lumina/monsterhunterfieldbook/ReadingGroup;", "scroll", "Landroid/widget/ScrollView;", "list", "Landroid/widget/ListView;", "treePanel", "Lcom/lumina/monsterhunterfieldbook/WeaponTreePanel;", "visible", "more", "Landroid/widget/TextView;", "meta", "filterToggle", "filterPanel", "Landroid/view/View;", "handler", "Landroid/os/Handler;", "pending", "Ljava/lang/Runnable;", "restoring", "", "contentAnimation", "Landroid/animation/ValueAnimator;", "renderedTab", "", "renderedDetail", "renderedId", "byId", "", "kotlin.jvm.PlatformType", "adapter", "com/lumina/monsterhunterfieldbook/WeaponProfilePanel$adapter$1", "Lcom/lumina/monsterhunterfieldbook/WeaponProfilePanel$adapter$1;", "saveFilters", "capture", "snapshot", "trail", "Lorg/json/JSONArray;", "checkpoint", "back", "select", "rawId", "showTreeInfo", "render", "animate", "buildHeading", "buildTabs", "transitionContent", "returning", "replace", "arrival", "milliseconds", "", "blur", "radius", "", "resetContentTransform", "contentScroll", "Lkotlin/Pair;", "renderGuide", "loops", "parent", "values", "advice", "label", "value", "bookmark", "id", "renderDatabase", "filterLabel", "choices", "Landroid/widget/GridLayout;", "key", "updateRows", "reset", "weaponRow", "record", "renderDetails", "hideKeyboard", "onDetachedFromWindow", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WeaponProfilePanel extends LinearLayout {
    private final MainActivity a;
    private final WeaponProfilePanel$adapter$1 adapter;
    private final Map<String, FieldRecord> byId;
    private final Function0<Unit> close;
    private ValueAnimator contentAnimation;
    private View filterPanel;
    private TextView filterToggle;
    private final List<ReadingGroup> groups;
    private final FieldRecord guide;
    private final Handler handler;
    private final LinearLayout heading;
    private final FrameLayout host;
    private ListView list;
    private TextView meta;
    private TextView more;
    private Runnable pending;
    private final List<FieldRecord> records;
    private boolean renderedDetail;
    private String renderedId;
    private String renderedTab;
    private boolean restoring;
    private ScrollView scroll;
    private final JSONObject state;
    private final LinearLayout tabs;
    private WeaponTreePanel treePanel;
    private final List<FieldRecord> visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x021c  */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.lumina.monsterhunterfieldbook.WeaponProfilePanel$adapter$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WeaponProfilePanel(MainActivity a, FieldRecord guide, List<FieldRecord> records, JSONObject state, Function0<Unit> close) {
        super(a);
        char c;
        Object m79constructorimpl;
        char c2;
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(guide, "guide");
        Intrinsics.checkNotNullParameter(records, "records");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(close, "close");
        this.a = a;
        this.guide = guide;
        this.records = records;
        this.state = state;
        this.close = close;
        this.heading = a.row();
        this.tabs = a.row();
        this.host = new FrameLayout(a);
        this.groups = new ArrayList();
        this.visible = new ArrayList();
        this.handler = new Handler(Looper.getMainLooper());
        this.renderedTab = "";
        this.renderedId = "";
        List<FieldRecord> list = records;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(WeaponModel.INSTANCE.rawId((FieldRecord) obj), obj);
        }
        this.byId = linkedHashMap;
        this.adapter = new BaseAdapter() { // from class: com.lumina.monsterhunterfieldbook.WeaponProfilePanel$adapter$1
            @Override // android.widget.Adapter
            public long getItemId(int position) {
                return position;
            }

            @Override // android.widget.Adapter
            public int getCount() {
                List list2;
                list2 = WeaponProfilePanel.this.visible;
                return list2.size();
            }

            @Override // android.widget.Adapter
            public FieldRecord getItem(int position) {
                List list2;
                list2 = WeaponProfilePanel.this.visible;
                return (FieldRecord) list2.get(position);
            }

            @Override // android.widget.Adapter
            public View getView(int position, View convertView, ViewGroup parent) {
                List list2;
                View weaponRow;
                Intrinsics.checkNotNullParameter(parent, "parent");
                WeaponProfilePanel weaponProfilePanel = WeaponProfilePanel.this;
                list2 = weaponProfilePanel.visible;
                weaponRow = weaponProfilePanel.weaponRow((FieldRecord) list2.get(position));
                return weaponRow;
            }
        };
        setOrientation(1);
        WeaponModel.INSTANCE.register(this.records);
        if (!this.state.has("type")) {
            this.state.put("type", this.guide.data().optString("id"));
        }
        if (!this.state.has("tab")) {
            this.state.put("tab", "guide");
        }
        if (!this.state.has("q")) {
            this.state.put("q", "");
        }
        if (!this.state.has("family")) {
            this.state.put("family", "default");
        }
        char c3 = 4;
        for (String str : CollectionsKt.listOf((Object[]) new String[]{"rank", "rarity", "element", "obtain"})) {
            if (this.state.has(str)) {
                c2 = c3;
            } else {
                c2 = c3;
                this.state.put(str, "all");
            }
            c3 = c2;
        }
        char c4 = c3;
        if (!this.state.has("path")) {
            this.state.put("path", "upgrade");
        }
        if (!this.state.has("limit")) {
            this.state.put("limit", 40);
        }
        if (!this.state.has("filtersOpen")) {
            this.state.put("filtersOpen", false);
        }
        if (!this.state.has("tree")) {
            this.state.put("tree", new JSONObject().put("zoom", 1).put("x", 0).put("y", 0));
        }
        if (!this.state.has("_memoryLoaded")) {
            try {
                Result.Companion companion = Result.INSTANCE;
                WeaponProfilePanel weaponProfilePanel = this;
                c = 2;
                try {
                    m79constructorimpl = Result.m79constructorimpl(new JSONObject(this.a.getPrefs().text("filterMemory", "{}")));
                } catch (Throwable th) {
                    th = th;
                    Result.Companion companion2 = Result.INSTANCE;
                    m79constructorimpl = Result.m79constructorimpl(ResultKt.createFailure(th));
                    JSONObject optJSONObject = ((JSONObject) (Result.m85isFailureimpl(m79constructorimpl) ? new JSONObject() : m79constructorimpl)).optJSONObject("weapon:" + this.state.optString("type"));
                    String[] strArr = new String[5];
                    strArr[0] = "rank";
                    strArr[1] = "rarity";
                    strArr[c] = "element";
                    strArr[3] = "obtain";
                    strArr[c4] = "family";
                    while (r3.hasNext()) {
                    }
                    this.state.put("_memoryLoaded", true);
                    this.heading.setPadding(this.a.dp((Number) 13), this.a.dp((Number) 10), this.a.dp((Number) 6), this.a.dp((Number) 10));
                    this.heading.setMinimumHeight(this.a.dp((Number) 60));
                    addView(this.heading, new LinearLayout.LayoutParams(-1, -2));
                    this.a.rule(this);
                    this.tabs.setPadding(this.a.dp((Number) 12), 0, this.a.dp((Number) 12), 0);
                    addView(this.tabs, new LinearLayout.LayoutParams(-1, -2));
                    addView(this.host, new LinearLayout.LayoutParams(-1, 0, 1.0f));
                    render(false);
                }
            } catch (Throwable th2) {
                th = th2;
                c = 2;
            }
            JSONObject optJSONObject2 = ((JSONObject) (Result.m85isFailureimpl(m79constructorimpl) ? new JSONObject() : m79constructorimpl)).optJSONObject("weapon:" + this.state.optString("type"));
            String[] strArr2 = new String[5];
            strArr2[0] = "rank";
            strArr2[1] = "rarity";
            strArr2[c] = "element";
            strArr2[3] = "obtain";
            strArr2[c4] = "family";
            for (String str2 : CollectionsKt.listOf((Object[]) strArr2)) {
                if (optJSONObject2 != null && optJSONObject2.has(str2)) {
                    this.state.put(str2, optJSONObject2.opt(str2));
                }
            }
            this.state.put("_memoryLoaded", true);
        }
        this.heading.setPadding(this.a.dp((Number) 13), this.a.dp((Number) 10), this.a.dp((Number) 6), this.a.dp((Number) 10));
        this.heading.setMinimumHeight(this.a.dp((Number) 60));
        addView(this.heading, new LinearLayout.LayoutParams(-1, -2));
        this.a.rule(this);
        this.tabs.setPadding(this.a.dp((Number) 12), 0, this.a.dp((Number) 12), 0);
        addView(this.tabs, new LinearLayout.LayoutParams(-1, -2));
        addView(this.host, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        render(false);
    }

    public final FieldRecord getGuide() {
        return this.guide;
    }

    public final List<FieldRecord> getRecords() {
        return this.records;
    }

    public final JSONObject getState() {
        return this.state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveFilters() {
        Object m79constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            WeaponProfilePanel weaponProfilePanel = this;
            m79constructorimpl = Result.m79constructorimpl(new JSONObject(this.a.getPrefs().text("filterMemory", "{}")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m79constructorimpl = Result.m79constructorimpl(ResultKt.createFailure(th));
        }
        JSONObject jSONObject = new JSONObject();
        if (Result.m85isFailureimpl(m79constructorimpl)) {
            m79constructorimpl = jSONObject;
        }
        JSONObject jSONObject2 = (JSONObject) m79constructorimpl;
        JSONObject jSONObject3 = new JSONObject();
        for (String str : CollectionsKt.listOf((Object[]) new String[]{"rank", "rarity", "element", "obtain", "family"})) {
            jSONObject3.put(str, this.state.opt(str));
        }
        jSONObject2.put("weapon:" + this.state.optString("type"), jSONObject3);
        NativePrefs prefs = this.a.getPrefs();
        String jSONObject4 = jSONObject2.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject4, "toString(...)");
        prefs.set("filterMemory", jSONObject4);
    }

    private final void capture() {
        ListView listView = this.list;
        if (listView != null) {
            this.state.put("listPosition", listView.getFirstVisiblePosition());
            JSONObject jSONObject = this.state;
            View childAt = listView.getChildAt(0);
            jSONObject.put("listTop", childAt != null ? childAt.getTop() : 0);
        }
        ScrollView scrollView = this.scroll;
        if (scrollView != null) {
            this.state.put(Intrinsics.areEqual(this.renderedTab, "guide") ? "guideScroll" : "detailScroll:" + this.renderedId, scrollView.getScrollY());
        }
        WeaponTreePanel weaponTreePanel = this.treePanel;
        if (weaponTreePanel != null) {
            weaponTreePanel.snapshot();
        }
    }

    public final JSONObject snapshot() {
        capture();
        saveFilters();
        return new JSONObject(this.state.toString());
    }

    private final JSONArray trail() {
        JSONArray optJSONArray = this.state.optJSONArray("_trail");
        if (optJSONArray != null) {
            return optJSONArray;
        }
        JSONArray jSONArray = new JSONArray();
        this.state.put("_trail", jSONArray);
        return jSONArray;
    }

    private final void checkpoint() {
        capture();
        JSONObject jSONObject = new JSONObject(this.state.toString());
        jSONObject.remove("_trail");
        trail().put(jSONObject);
    }

    public final boolean back() {
        capture();
        if (Intrinsics.areEqual(this.state.optString("tab"), "tree") && this.state.optBoolean("treeDetails")) {
            WeaponTreePanel weaponTreePanel = this.treePanel;
            if (weaponTreePanel != null && weaponTreePanel.closeMaterials()) {
                return true;
            }
            this.state.put("treeDetails", false);
            render$default(this, false, 1, null);
            return true;
        }
        if (!this.state.optBoolean("detail")) {
            return false;
        }
        JSONArray trail = trail();
        if (trail.length() > 0) {
            JSONObject jSONObject = trail.getJSONObject(trail.length() - 1);
            trail.remove(trail.length() - 1);
            JSONArray jSONArray = new JSONArray(trail.toString());
            Iterator<String> keys = this.state.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
            Iterator it = SequencesKt.toList(SequencesKt.asSequence(keys)).iterator();
            while (it.hasNext()) {
                this.state.remove((String) it.next());
            }
            Iterator<String> keys2 = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(keys2, "keys(...)");
            while (keys2.hasNext()) {
                String next = keys2.next();
                this.state.put(next, jSONObject.opt(next));
            }
            this.state.put("_trail", jSONArray);
        } else if (Intrinsics.areEqual(this.state.optString("detailOrigin"), "tree")) {
            this.state.put("tab", "tree").put("detail", false).put("detailOrigin", JSONObject.NULL).put("treeDetails", true);
        } else {
            this.state.put("detail", false).put("detailOrigin", JSONObject.NULL);
        }
        transitionContent(true, new Function0() { // from class: com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit back$lambda$2;
                back$lambda$2 = WeaponProfilePanel.back$lambda$2(WeaponProfilePanel.this);
                return back$lambda$2;
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit back$lambda$2(WeaponProfilePanel weaponProfilePanel) {
        weaponProfilePanel.render(false);
        return Unit.INSTANCE;
    }

    private final void select(String rawId) {
        if (this.byId.containsKey(rawId)) {
            checkpoint();
            JSONObject jSONObject = this.state;
            jSONObject.put("detailOrigin", jSONObject.optBoolean("detail") ? "record" : "list");
            this.state.put("selected", rawId).put("detail", true).put("tab", "database");
            render$default(this, false, 1, null);
        }
    }

    private final void showTreeInfo(String rawId) {
        if (this.byId.containsKey(rawId)) {
            checkpoint();
            this.state.put("selected", rawId).put("tab", "database").put("detail", true).put("detailOrigin", "tree");
            render$default(this, false, 1, null);
        }
    }

    static /* synthetic */ void render$default(WeaponProfilePanel weaponProfilePanel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        weaponProfilePanel.render(z);
    }

    private final void render(boolean animate) {
        this.handler.removeCallbacksAndMessages(null);
        this.pending = null;
        this.scroll = null;
        this.list = null;
        this.treePanel = null;
        this.more = null;
        this.meta = null;
        this.filterPanel = null;
        this.filterToggle = null;
        String optString = this.state.optString("tab", "guide");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        this.renderedTab = optString;
        this.renderedDetail = Intrinsics.areEqual(optString, "database") && this.state.optBoolean("detail");
        String optString2 = this.state.optString("selected");
        Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
        this.renderedId = optString2;
        buildHeading();
        buildTabs();
        this.host.removeAllViews();
        this.groups.clear();
        String str = this.renderedTab;
        if (Intrinsics.areEqual(str, "database")) {
            if (this.renderedDetail) {
                renderDetails();
            } else {
                renderDatabase();
            }
        } else if (Intrinsics.areEqual(str, "tree")) {
            WeaponTreePanel weaponTreePanel = new WeaponTreePanel(this.a, this.records, this.state, new Function1() { // from class: com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit render$lambda$0;
                    render$lambda$0 = WeaponProfilePanel.render$lambda$0(WeaponProfilePanel.this, (String) obj);
                    return render$lambda$0;
                }
            });
            this.treePanel = weaponTreePanel;
            this.host.addView(weaponTreePanel, new FrameLayout.LayoutParams(-1, -1));
        } else {
            renderGuide();
        }
        if (animate) {
            arrival(190L, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$0(WeaponProfilePanel weaponProfilePanel, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        weaponProfilePanel.showTreeInfo(it);
        return Unit.INSTANCE;
    }

    private final void buildHeading() {
        String name;
        this.heading.removeAllViews();
        FieldRecord fieldRecord = this.state.optBoolean("detail") ? this.byId.get(this.renderedId) : null;
        if (fieldRecord != null) {
            this.heading.addView(this.a.iconButton("back", "Back to weapons", new Function0() { // from class: com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit buildHeading$lambda$0;
                    buildHeading$lambda$0 = WeaponProfilePanel.buildHeading$lambda$0(WeaponProfilePanel.this);
                    return buildHeading$lambda$0;
                }
            }), new LinearLayout.LayoutParams(this.a.dp((Number) 32), this.a.dp((Number) 44)));
            this.heading.addView(WeaponModel.INSTANCE.icon(this.a, fieldRecord, 29), new LinearLayout.LayoutParams(this.a.dp((Number) 29), this.a.dp((Number) 32)));
        }
        LinearLayout linearLayout = this.heading;
        MainActivity mainActivity = this.a;
        if (fieldRecord == null || (name = fieldRecord.getName()) == null) {
            name = this.guide.getName();
        }
        TextView text$default = MainActivity.text$default(mainActivity, name, this.a.getWide() ? 22.0f : 20.0f, true, 0, 8, null);
        text$default.setPadding(this.a.dp(Integer.valueOf(fieldRecord == null ? 0 : 10)), 0, this.a.dp((Number) 8), 0);
        linearLayout.addView(text$default, new LinearLayout.LayoutParams(0, -2, 1.0f));
        if (fieldRecord != null) {
            this.heading.addView(MainActivity.text$default(this.a, "Rarity " + WeaponModel.INSTANCE.data(fieldRecord).optInt("rarity"), 10.0f, false, this.a.getMuted(), 4, null), new LinearLayout.LayoutParams(-2, -2));
        }
        this.heading.addView(this.a.iconButton("close", "Close " + this.guide.getName(), this.close), new LinearLayout.LayoutParams(this.a.dp((Number) 42), this.a.dp((Number) 44)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildHeading$lambda$0(WeaponProfilePanel weaponProfilePanel) {
        weaponProfilePanel.back();
        return Unit.INSTANCE;
    }

    private final void buildTabs() {
        this.tabs.removeAllViews();
        for (Pair pair : CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("guide", "Guide"), TuplesKt.to("database", "Database"), TuplesKt.to("tree", "Family Tree")})) {
            final String str = (String) pair.component1();
            String str2 = (String) pair.component2();
            LinearLayout column = this.a.column();
            boolean areEqual = Intrinsics.areEqual(this.state.optString("tab"), str);
            TextView button = this.a.button(str2, new Function0() { // from class: com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit buildTabs$lambda$0$0;
                    buildTabs$lambda$0$0 = WeaponProfilePanel.buildTabs$lambda$0$0(WeaponProfilePanel.this, str);
                    return buildTabs$lambda$0$0;
                }
            });
            MainActivity mainActivity = this.a;
            button.setTextColor(areEqual ? mainActivity.getAccent() : mainActivity.getMuted());
            button.setBackground(new ColorDrawable(0));
            button.setTextSize((this.a.getPrefs().number("font", 100) * 13.0f) / 100.0f);
            button.setPadding(this.a.dp((Number) 6), this.a.dp((Number) 10), this.a.dp((Number) 6), this.a.dp((Number) 10));
            button.setContentDescription(str2 + " tab");
            button.setSelected(areEqual);
            column.addView(button, new LinearLayout.LayoutParams(-1, this.a.dp((Number) 48)));
            View view = new View(this.a);
            MainActivity mainActivity2 = this.a;
            view.setBackgroundColor(areEqual ? mainActivity2.getAccent() : mainActivity2.getLine());
            column.addView(view, new LinearLayout.LayoutParams(-1, this.a.dp(Integer.valueOf(areEqual ? 2 : 1))));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
            layoutParams.rightMargin = this.a.dp((Number) 8);
            Unit unit = Unit.INSTANCE;
            this.tabs.addView(column, layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildTabs$lambda$0$0(final WeaponProfilePanel weaponProfilePanel, String str) {
        if (!Intrinsics.areEqual(weaponProfilePanel.state.optString("tab"), str)) {
            weaponProfilePanel.capture();
            weaponProfilePanel.state.put("tab", str);
            weaponProfilePanel.hideKeyboard();
            weaponProfilePanel.buildTabs();
            weaponProfilePanel.transitionContent(false, new Function0() { // from class: com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit buildTabs$lambda$0$0$0;
                    buildTabs$lambda$0$0$0 = WeaponProfilePanel.buildTabs$lambda$0$0$0(WeaponProfilePanel.this);
                    return buildTabs$lambda$0$0$0;
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildTabs$lambda$0$0$0(WeaponProfilePanel weaponProfilePanel) {
        weaponProfilePanel.render(false);
        return Unit.INSTANCE;
    }

    private final void transitionContent(final boolean returning, final Function0<Unit> replace) {
        ValueAnimator valueAnimator = this.contentAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.contentAnimation = null;
        if (this.a.motionDuration(110L) == 0 || Intrinsics.areEqual(this.a.getPrefs().text("transition", "liquid"), "none")) {
            resetContentTransform();
            replace.invoke();
            return;
        }
        final String text = this.a.getPrefs().text("transition", "liquid");
        final float alpha = this.host.getAlpha();
        final float scaleX = this.host.getScaleX();
        final float translationY = this.host.getTranslationY();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(this.a.motionDuration(returning ? 190L : 110L));
        ofFloat.setInterpolator(new PathInterpolator(0.42f, 0.0f, 1.0f, 1.0f));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda20
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                WeaponProfilePanel.transitionContent$lambda$0$0(WeaponProfilePanel.this, alpha, text, translationY, scaleX, valueAnimator2);
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.lumina.monsterhunterfieldbook.WeaponProfilePanel$transitionContent$1$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                Ref.BooleanRef.this.element = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (Ref.BooleanRef.this.element) {
                    return;
                }
                this.resetContentTransform();
                replace.invoke();
                WeaponProfilePanel weaponProfilePanel = this;
                boolean z = returning;
                weaponProfilePanel.arrival(z ? 170L : 190L, z);
            }
        });
        ofFloat.start();
        this.contentAnimation = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void transitionContent$lambda$0$0(WeaponProfilePanel weaponProfilePanel, float f, String str, float f2, float f3, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        weaponProfilePanel.host.setAlpha(f + (((Intrinsics.areEqual(str, "liquid") ? 0.25f : 0.0f) - f) * floatValue));
        if (Intrinsics.areEqual(str, "slide")) {
            weaponProfilePanel.host.setTranslationY(f2 + ((weaponProfilePanel.a.dp((Number) 10) - f2) * floatValue));
        }
        if (Intrinsics.areEqual(str, "zoom")) {
            weaponProfilePanel.host.setScaleX(f3 + ((0.97f - f3) * floatValue));
            FrameLayout frameLayout = weaponProfilePanel.host;
            frameLayout.setScaleY(frameLayout.getScaleX());
        }
        weaponProfilePanel.blur(Intrinsics.areEqual(str, "liquid") ? floatValue * 5.0f : 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void arrival(long milliseconds, boolean returning) {
        final float f;
        final String text = returning ? "return" : this.a.getPrefs().text("transition", "liquid");
        if (this.a.motionDuration(milliseconds) == 0 || Intrinsics.areEqual(text, "none")) {
            resetContentTransform();
            return;
        }
        ValueAnimator valueAnimator = this.contentAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (returning) {
            f = 0.55f;
        } else {
            f = Intrinsics.areEqual(text, "liquid") ? 0.25f : 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(this.a.motionDuration(milliseconds));
        ofFloat.setInterpolator(new PathInterpolator(0.0f, 0.0f, 0.58f, 1.0f));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda19
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                WeaponProfilePanel.arrival$lambda$0$0(WeaponProfilePanel.this, f, text, valueAnimator2);
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.lumina.monsterhunterfieldbook.WeaponProfilePanel$arrival$1$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                WeaponProfilePanel.this.resetContentTransform();
            }
        });
        ofFloat.start();
        this.contentAnimation = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void arrival$lambda$0$0(WeaponProfilePanel weaponProfilePanel, float f, String str, ValueAnimator animation) {
        float f2;
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        float f3 = 1;
        weaponProfilePanel.host.setAlpha(f + ((f3 - f) * floatValue));
        float f4 = 0.0f;
        weaponProfilePanel.host.setTranslationY(Intrinsics.areEqual(str, "slide") ? weaponProfilePanel.a.dp((Number) 12) * (f3 - floatValue) : 0.0f);
        weaponProfilePanel.host.setScaleX(Intrinsics.areEqual(str, "zoom") ? (0.03f * floatValue) + 0.97f : 1.0f);
        FrameLayout frameLayout = weaponProfilePanel.host;
        frameLayout.setScaleY(frameLayout.getScaleX());
        if (!Intrinsics.areEqual(str, "return")) {
            f2 = Intrinsics.areEqual(str, "liquid") ? 5.0f : 1.5f;
            weaponProfilePanel.blur(f4);
        }
        f4 = (f3 - floatValue) * f2;
        weaponProfilePanel.blur(f4);
    }

    private final void blur(float radius) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.host.setRenderEffect(radius > 0.05f ? RenderEffect.createBlurEffect(RangesKt.coerceAtLeast(this.a.dp(Float.valueOf(radius)), 1), RangesKt.coerceAtLeast(this.a.dp(Float.valueOf(radius)), 1), Shader.TileMode.CLAMP) : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetContentTransform() {
        this.host.setAlpha(1.0f);
        this.host.setTranslationY(0.0f);
        this.host.setScaleX(1.0f);
        this.host.setScaleY(1.0f);
        blur(0.0f);
    }

    private final Pair<ScrollView, LinearLayout> contentScroll() {
        ScrollView scrollView = new ScrollView(this.a);
        scrollView.setFillViewport(true);
        scrollView.setClipToPadding(false);
        LinearLayout column = this.a.column();
        MainActivity mainActivity = this.a;
        int dp = mainActivity.dp(Integer.valueOf(mainActivity.getWide() ? 24 : 18));
        int dp2 = this.a.dp((Number) 16);
        MainActivity mainActivity2 = this.a;
        column.setPadding(dp, dp2, mainActivity2.dp(Integer.valueOf(mainActivity2.getWide() ? 24 : 18)), this.a.dp((Number) 28));
        scrollView.addView(column);
        this.host.addView(scrollView, new FrameLayout.LayoutParams(-1, -1));
        this.scroll = scrollView;
        return TuplesKt.to(scrollView, column);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v23 java.lang.String, still in use, count: 2, list:
          (r4v23 java.lang.String) from 0x0179: INVOKE (r4v23 java.lang.String) STATIC call: kotlin.text.StringsKt.isBlank(java.lang.CharSequence):boolean A[MD:(java.lang.CharSequence):boolean (m), WRAPPED]
          (r4v23 java.lang.String) from 0x0183: PHI (r4v25 java.lang.String) = (r4v23 java.lang.String), (r4v24 java.lang.String), (r4v29 java.lang.String) binds: [B:19:0x017d, B:17:0x017f, B:13:0x016e] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    private final void renderGuide() {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lumina.monsterhunterfieldbook.WeaponProfilePanel.renderGuide():void");
    }

    private static final TextView renderGuide$pill(WeaponProfilePanel weaponProfilePanel, String str, boolean z) {
        MainActivity mainActivity = weaponProfilePanel.a;
        TextView text$default = MainActivity.text$default(mainActivity, str, 10.0f, false, z ? mainActivity.getAccent() : mainActivity.getMuted(), 4, null);
        text$default.setBackground(weaponProfilePanel.a.surface(0, true, 2.0f));
        text$default.setPadding(weaponProfilePanel.a.dp((Number) 8), weaponProfilePanel.a.dp((Number) 4), weaponProfilePanel.a.dp((Number) 8), weaponProfilePanel.a.dp((Number) 4));
        return text$default;
    }

    static /* synthetic */ TextView renderGuide$pill$default(WeaponProfilePanel weaponProfilePanel, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return renderGuide$pill(weaponProfilePanel, str, z);
    }

    private static final void renderGuide$fold(WeaponProfilePanel weaponProfilePanel, LinearLayout linearLayout, String str, String str2, Function1<? super LinearLayout, Unit> function1) {
        ReadingGroup readingGroup = new ReadingGroup(weaponProfilePanel.a, weaponProfilePanel.guide.getId() + ":" + str2, str, weaponProfilePanel.groups, false, function1);
        readingGroup.setBackground(new ColorDrawable(0));
        View childAt = readingGroup.getChildAt(0);
        TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
        if (textView != null) {
            textView.setBackground(new ColorDrawable(0));
            textView.setPadding(weaponProfilePanel.a.dp((Number) 4), weaponProfilePanel.a.dp((Number) 18), weaponProfilePanel.a.dp((Number) 4), weaponProfilePanel.a.dp((Number) 18));
            textView.setMinHeight(weaponProfilePanel.a.dp((Number) 56));
            textView.setTextSize((weaponProfilePanel.a.getPrefs().number("font", 100) * 15.0f) / 100.0f);
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, new WeaponDisclosureDrawable(weaponProfilePanel.a, readingGroup), (Drawable) null);
        }
        View childAt2 = readingGroup.getChildAt(1);
        if (childAt2 != null) {
            childAt2.setPadding(weaponProfilePanel.a.dp((Number) 28), weaponProfilePanel.a.dp((Number) 5), weaponProfilePanel.a.dp((Number) 4), weaponProfilePanel.a.dp((Number) 24));
        }
        linearLayout.addView(readingGroup, new LinearLayout.LayoutParams(-1, -2));
        weaponProfilePanel.a.rule(linearLayout);
    }

    private static final void renderGuide$bullets(WeaponProfilePanel weaponProfilePanel, LinearLayout linearLayout, JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            LinearLayout row = weaponProfilePanel.a.row();
            row.setGravity(48);
            row.addView(MainActivity.text$default(weaponProfilePanel.a, "•", 14.0f, false, 0, 12, null), new LinearLayout.LayoutParams(weaponProfilePanel.a.dp((Number) 20), -2));
            MainActivity mainActivity = weaponProfilePanel.a;
            String optString = jSONArray.optString(i);
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            row.addView(MainActivity.text$default(mainActivity, optString, 14.0f, false, 0, 12, null), new LinearLayout.LayoutParams(0, -2, 1.0f));
            linearLayout.addView(row);
            if (i < jSONArray.length() - 1) {
                weaponProfilePanel.a.gap(linearLayout, 12);
            }
        }
    }

    private static final void renderGuide$paragraph(WeaponProfilePanel weaponProfilePanel, LinearLayout linearLayout, String str) {
        linearLayout.addView(MainActivity.text$default(weaponProfilePanel.a, str, 14.0f, false, 0, 12, null));
        weaponProfilePanel.a.gap(linearLayout, 12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderGuide$lambda$2(JSONObject jSONObject, WeaponProfilePanel weaponProfilePanel, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        renderGuide$bullets(weaponProfilePanel, it, jSONObject.optJSONArray("strengths"));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderGuide$lambda$3(JSONObject jSONObject, WeaponProfilePanel weaponProfilePanel, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        renderGuide$bullets(weaponProfilePanel, it, jSONObject.optJSONArray("tradeoffs"));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderGuide$lambda$4(JSONObject jSONObject, WeaponProfilePanel weaponProfilePanel, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String optString = jSONObject.optString("mobility");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        renderGuide$paragraph(weaponProfilePanel, it, optString);
        String optString2 = jSONObject.optString("reach");
        Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
        renderGuide$paragraph(weaponProfilePanel, it, optString2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderGuide$lambda$5(JSONObject jSONObject, WeaponProfilePanel weaponProfilePanel, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String optString = jSONObject.optString("defense");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        renderGuide$paragraph(weaponProfilePanel, it, optString);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderGuide$lambda$8(JSONObject jSONObject, WeaponProfilePanel weaponProfilePanel, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        renderGuide$bullets(weaponProfilePanel, it, jSONObject.optJSONArray("skills"));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderGuide$lambda$9(JSONObject jSONObject, WeaponProfilePanel weaponProfilePanel, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        renderGuide$bullets(weaponProfilePanel, it, jSONObject.optJSONArray("mistakes"));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderGuide$lambda$12(ScrollView scrollView, WeaponProfilePanel weaponProfilePanel) {
        scrollView.scrollTo(0, weaponProfilePanel.state.optInt("guideScroll"));
    }

    private final void loops(LinearLayout parent, JSONArray values) {
        if (values == null) {
            return;
        }
        int i = this.a.getResources().getConfiguration().screenWidthDp > 780 ? 4 : 2;
        int length = values.length();
        LinearLayout linearLayout = null;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 % i;
            if (i3 == 0) {
                linearLayout = this.a.row();
                linearLayout.setGravity(48);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.bottomMargin = this.a.dp((Number) 8);
                Unit unit = Unit.INSTANCE;
                parent.addView(linearLayout, layoutParams);
            }
            LinearLayout column = this.a.column();
            column.setBackground(MainActivity.surface$default(this.a, 0, false, 0.0f, 7, null));
            column.setPadding(this.a.dp((Number) 14), this.a.dp((Number) 12), this.a.dp((Number) 14), this.a.dp((Number) 14));
            MainActivity mainActivity = this.a;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            int i4 = i2 + 1;
            String format = String.format(Locale.US, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            column.addView(MainActivity.text$default(mainActivity, format, 10.0f, false, this.a.getAccent(), 4, null));
            this.a.gap(column, 5);
            MainActivity mainActivity2 = this.a;
            String optString = values.optString(i2);
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            column.addView(MainActivity.text$default(mainActivity2, optString, 12.0f, false, 0, 12, null));
            Intrinsics.checkNotNull(linearLayout);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
            layoutParams2.rightMargin = this.a.dp((Number) 8);
            Unit unit2 = Unit.INSTANCE;
            linearLayout.addView(column, layoutParams2);
            if (i2 == values.length() - 1) {
                int i5 = (i - 1) - i3;
                for (int i6 = 0; i6 < i5; i6++) {
                    linearLayout.addView(new View(this.a), new LinearLayout.LayoutParams(0, 1, 1.0f));
                }
            }
            i2 = i4;
        }
    }

    private final void advice(LinearLayout parent, String label, String value) {
        LinearLayout column = this.a.column();
        MainActivity mainActivity = this.a;
        column.setBackground(MainActivity.surface$default(mainActivity, FieldViewsKt.blend(mainActivity.getPanel(), this.a.getAccent(), 0.035f), false, 0.0f, 6, null));
        LinearLayout linearLayout = column;
        this.a.pad(linearLayout, 16);
        MainActivity mainActivity2 = this.a;
        TextView textBold = mainActivity2.textBold(label, 10.0f, mainActivity2.getAccent());
        textBold.setLetterSpacing(0.14f);
        column.addView(textBold);
        this.a.gap(column, 10);
        column.addView(MainActivity.text$default(this.a, value, 14.0f, false, 0, 12, null));
        parent.addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
    }

    private final FrameLayout bookmark(final String id) {
        final FrameLayout frameLayout = new FrameLayout(this.a);
        MainActivity mainActivity = this.a;
        final GlyphView glyphView = new GlyphView(mainActivity, "bookmark", mainActivity.isBookmarked(id) ? this.a.getAccent() : this.a.getMuted());
        frameLayout.addView(glyphView, new FrameLayout.LayoutParams(this.a.dp((Number) 21), this.a.dp((Number) 21), 17));
        this.a.touch(frameLayout, new Function0() { // from class: com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit bookmark$lambda$0;
                bookmark$lambda$0 = WeaponProfilePanel.bookmark$lambda$0(WeaponProfilePanel.this, id, glyphView, frameLayout);
                return bookmark$lambda$0;
            }
        });
        bookmark$sync(this, id, glyphView, frameLayout);
        return frameLayout;
    }

    private static final void bookmark$sync(WeaponProfilePanel weaponProfilePanel, String str, GlyphView glyphView, FrameLayout frameLayout) {
        boolean isBookmarked = weaponProfilePanel.a.isBookmarked(str);
        MainActivity mainActivity = weaponProfilePanel.a;
        glyphView.setColour(isBookmarked ? mainActivity.getAccent() : mainActivity.getMuted());
        glyphView.invalidate();
        frameLayout.setContentDescription(isBookmarked ? "Remove saved entry" : "Save entry");
        frameLayout.setSelected(isBookmarked);
        MainActivity mainActivity2 = weaponProfilePanel.a;
        frameLayout.setBackground(mainActivity2.surface(isBookmarked ? FieldViewsKt.alphaColour(mainActivity2.getAccent(), 20) : 0, isBookmarked, 3.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bookmark$lambda$0(WeaponProfilePanel weaponProfilePanel, String str, GlyphView glyphView, FrameLayout frameLayout) {
        weaponProfilePanel.a.toggleBookmark(str);
        bookmark$sync(weaponProfilePanel, str, glyphView, frameLayout);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r3v16, types: [com.lumina.monsterhunterfieldbook.WeaponProfilePanel$renderDatabase$filterScroll$1] */
    private final void renderDatabase() {
        LinearLayout column = this.a.column();
        Integer num = 14;
        column.setPadding(this.a.dp((Number) 12), this.a.dp(num), this.a.dp((Number) 12), this.a.dp((Number) 12));
        this.host.addView(column, new FrameLayout.LayoutParams(-1, -1));
        LinearLayout row = this.a.row();
        Integer num2 = 10;
        row.setPadding(this.a.dp(num2), this.a.dp((Number) 9), this.a.dp(num2), this.a.dp((Number) 9));
        row.setBackground(MainActivity.surface$default(this.a, 0, false, 0.0f, 7, null));
        LinearLayout row2 = this.a.row();
        MainActivity mainActivity = this.a;
        row2.setBackground(MainActivity.surface$default(mainActivity, mainActivity.getBg(), false, 0.0f, 6, null));
        MainActivity mainActivity2 = this.a;
        GlyphView glyphView = new GlyphView(mainActivity2, "search", mainActivity2.getMuted());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.a.dp((Number) 18), this.a.dp((Number) 18));
        layoutParams.leftMargin = this.a.dp(num2);
        Unit unit = Unit.INSTANCE;
        row2.addView(glyphView, layoutParams);
        final EditText editText = new EditText(this.a);
        editText.setHint("Search");
        editText.setSingleLine(true);
        editText.setTextColor(this.a.getInk());
        editText.setHintTextColor(this.a.getMuted());
        editText.setTypeface(MainActivity.text$default(this.a, "", 0.0f, false, 0, 14, null).getTypeface());
        editText.setTextSize((this.a.getPrefs().number("font", 100) * 14.0f) / 100.0f);
        editText.setText(this.state.optString("q"));
        editText.setBackground(new ColorDrawable(0));
        editText.setContentDescription("Search this weapon database");
        editText.setImeOptions(3);
        editText.setPadding(this.a.dp(num2), this.a.dp((Number) 8), this.a.dp((Number) 4), this.a.dp((Number) 8));
        row2.addView(editText, new LinearLayout.LayoutParams(0, this.a.dp((Number) 44), 1.0f));
        FrameLayout iconButton = this.a.iconButton("close", "Clear search", new Function0() { // from class: com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit renderDatabase$lambda$2;
                renderDatabase$lambda$2 = WeaponProfilePanel.renderDatabase$lambda$2(editText);
                return renderDatabase$lambda$2;
            }
        });
        Editable text = editText.getText();
        iconButton.setVisibility((text == null || text.length() == 0) ? 8 : 0);
        row2.addView(iconButton, new LinearLayout.LayoutParams(this.a.dp((Number) 35), this.a.dp((Number) 42)));
        row.addView(row2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView button = this.a.button(filterLabel(), new Function0() { // from class: com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit renderDatabase$lambda$3;
                renderDatabase$lambda$3 = WeaponProfilePanel.renderDatabase$lambda$3(WeaponProfilePanel.this);
                return renderDatabase$lambda$3;
            }
        });
        button.setPadding(this.a.dp((Number) 9), this.a.dp((Number) 7), this.a.dp((Number) 9), this.a.dp((Number) 7));
        button.setContentDescription("Filters, ".concat(this.state.optBoolean("filtersOpen") ? "expanded" : "collapsed"));
        this.filterToggle = button;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, this.a.dp((Number) 44));
        layoutParams2.leftMargin = this.a.dp((Number) 8);
        Unit unit2 = Unit.INSTANCE;
        row.addView(button, layoutParams2);
        column.addView(row);
        final MainActivity mainActivity3 = this.a;
        ?? r3 = new ScrollView(mainActivity3) { // from class: com.lumina.monsterhunterfieldbook.WeaponProfilePanel$renderDatabase$filterScroll$1
            {
                super(mainActivity3);
            }

            @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
            protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
                FrameLayout frameLayout;
                frameLayout = WeaponProfilePanel.this.host;
                Integer valueOf = Integer.valueOf(frameLayout.getHeight());
                if (valueOf.intValue() <= 0) {
                    valueOf = null;
                }
                super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) ((valueOf != null ? valueOf.intValue() : getResources().getDisplayMetrics().heightPixels) * 0.45f), IntCompanionObject.MIN_VALUE));
            }
        };
        LinearLayout column2 = this.a.column();
        column2.setBackground(MainActivity.surface$default(this.a, 0, false, 0.0f, 7, null));
        LinearLayout linearLayout = column2;
        this.a.pad(linearLayout, 14);
        r3.addView(linearLayout);
        r3.setVisibility(this.state.optBoolean("filtersOpen") ? 0 : 8);
        View view = (View) r3;
        this.filterPanel = view;
        column.addView(view, new LinearLayout.LayoutParams(-1, -2));
        GridLayout gridLayout = new GridLayout(this.a);
        gridLayout.setColumnCount(gridLayout.getResources().getConfiguration().screenWidthDp > 780 ? 4 : 2);
        column2.addView(gridLayout, new LinearLayout.LayoutParams(-1, -2));
        choices(gridLayout, "Rank", "rank", CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("all", "All"), TuplesKt.to("LR", "Low Rank"), TuplesKt.to("HR", "High Rank"), TuplesKt.to("MR", "Master Rank")}));
        List listOf = CollectionsKt.listOf(TuplesKt.to("all", "All"));
        List<FieldRecord> list = this.records;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(WeaponModel.INSTANCE.data((FieldRecord) it.next()).optInt("rarity")));
        }
        List sorted = CollectionsKt.sorted(CollectionsKt.distinct(arrayList));
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(sorted, 10));
        Iterator it2 = sorted.iterator();
        while (it2.hasNext()) {
            int intValue = ((Number) it2.next()).intValue();
            arrayList2.add(TuplesKt.to(String.valueOf(intValue), "Rarity " + intValue));
            num = num;
            num2 = num2;
        }
        Integer num3 = num;
        Integer num4 = num2;
        choices(gridLayout, "Rarity", "rarity", CollectionsKt.plus((Collection) listOf, (Iterable) arrayList2));
        List listOf2 = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("all", "All"), TuplesKt.to("none", "No element")});
        List<FieldRecord> list2 = this.records;
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it3 = list2.iterator();
        while (it3.hasNext()) {
            CollectionsKt.addAll(arrayList3, WeaponModel.INSTANCE.elementNames((FieldRecord) it3.next()));
        }
        List<String> sorted2 = CollectionsKt.sorted(CollectionsKt.distinct(arrayList3));
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(sorted2, 10));
        for (String str : sorted2) {
            arrayList4.add(TuplesKt.to(str, str));
        }
        choices(gridLayout, "Element / status", "element", CollectionsKt.plus((Collection) listOf2, (Iterable) arrayList4));
        choices(gridLayout, "Obtain", "obtain", CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("all", "All"), TuplesKt.to("forge", "Forge"), TuplesKt.to("upgrade", "Upgrade"), TuplesKt.to("reward", "Rewards")}));
        TextView button2 = this.a.button("Clear filters", new Function0() { // from class: com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit renderDatabase$lambda$11;
                renderDatabase$lambda$11 = WeaponProfilePanel.renderDatabase$lambda$11(WeaponProfilePanel.this);
                return renderDatabase$lambda$11;
            }
        });
        button2.setBackground(new ColorDrawable(0));
        button2.setTextColor(this.a.getAccent());
        button2.setGravity(8388627);
        column2.addView(button2);
        MainActivity mainActivity4 = this.a;
        TextView text$default = MainActivity.text$default(mainActivity4, "", 11.0f, false, mainActivity4.getMuted(), 4, null);
        text$default.setPadding(this.a.dp(num3), this.a.dp(num4), this.a.dp(num3), this.a.dp(num4));
        this.meta = text$default;
        column.addView(text$default);
        final ListView listView = new ListView(this.a);
        listView.setDivider(new ColorDrawable(this.a.getLine()));
        listView.setDividerHeight(this.a.dp((Number) 1));
        listView.setCacheColorHint(0);
        listView.setVerticalScrollBarEnabled(true);
        listView.setFooterDividersEnabled(false);
        listView.setBackground(MainActivity.surface$default(this.a, 0, false, 0.0f, 6, null));
        listView.setContentDescription("Weapons");
        TextView button3 = this.a.button("", new Function0() { // from class: com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit3;
                unit3 = Unit.INSTANCE;
                return unit3;
            }
        });
        this.more = button3;
        TextView textView = button3;
        listView.addFooterView(textView, null, false);
        listView.setAdapter((ListAdapter) this.adapter);
        this.a.touch(textView, new Function0() { // from class: com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit renderDatabase$lambda$16;
                renderDatabase$lambda$16 = WeaponProfilePanel.renderDatabase$lambda$16(WeaponProfilePanel.this);
                return renderDatabase$lambda$16;
            }
        });
        listView.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.lumina.monsterhunterfieldbook.WeaponProfilePanel$renderDatabase$13
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView v, int scrollState) {
                if (scrollState != 0) {
                    WeaponProfilePanel.this.hideKeyboard();
                }
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView v, int first, int count, int total) {
                boolean z;
                z = WeaponProfilePanel.this.restoring;
                if (z) {
                    return;
                }
                WeaponProfilePanel.this.getState().put("listPosition", first);
                JSONObject state = WeaponProfilePanel.this.getState();
                View childAt = listView.getChildAt(0);
                state.put("listTop", childAt != null ? childAt.getTop() : 0);
            }
        });
        this.list = listView;
        column.addView(listView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        updateRows(false);
        editText.addTextChangedListener(new WeaponProfilePanel$renderDatabase$14(this, iconButton));
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda5
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i, KeyEvent keyEvent) {
                boolean renderDatabase$lambda$17;
                renderDatabase$lambda$17 = WeaponProfilePanel.renderDatabase$lambda$17(WeaponProfilePanel.this, textView2, i, keyEvent);
                return renderDatabase$lambda$17;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderDatabase$lambda$2(EditText editText) {
        editText.setText("");
        editText.requestFocus();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderDatabase$lambda$3(WeaponProfilePanel weaponProfilePanel) {
        boolean optBoolean = weaponProfilePanel.state.optBoolean("filtersOpen");
        weaponProfilePanel.state.put("filtersOpen", !optBoolean);
        View view = weaponProfilePanel.filterPanel;
        if (view != null) {
            view.setVisibility(!optBoolean ? 0 : 8);
        }
        TextView textView = weaponProfilePanel.filterToggle;
        if (textView != null) {
            textView.setContentDescription("Filters, ".concat(!optBoolean ? "expanded" : "collapsed"));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderDatabase$lambda$11(WeaponProfilePanel weaponProfilePanel) {
        weaponProfilePanel.capture();
        Iterator it = CollectionsKt.listOf((Object[]) new String[]{"rank", "rarity", "element", "obtain"}).iterator();
        while (it.hasNext()) {
            weaponProfilePanel.state.put((String) it.next(), "all");
        }
        weaponProfilePanel.state.put("limit", 40);
        weaponProfilePanel.state.put("listPosition", 0).put("listTop", 0);
        weaponProfilePanel.saveFilters();
        render$default(weaponProfilePanel, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderDatabase$lambda$16(WeaponProfilePanel weaponProfilePanel) {
        weaponProfilePanel.capture();
        JSONObject jSONObject = weaponProfilePanel.state;
        jSONObject.put("limit", jSONObject.optInt("limit", 40) + 40);
        weaponProfilePanel.updateRows(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean renderDatabase$lambda$17(WeaponProfilePanel weaponProfilePanel, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        weaponProfilePanel.hideKeyboard();
        return true;
    }

    private final String filterLabel() {
        int i = 0;
        List listOf = CollectionsKt.listOf((Object[]) new String[]{"rank", "rarity", "element", "obtain"});
        if (!(listOf instanceof Collection) || !listOf.isEmpty()) {
            Iterator it = listOf.iterator();
            while (it.hasNext()) {
                if (!Intrinsics.areEqual(this.state.optString((String) it.next(), "all"), "all") && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return "Filters" + (i > 0 ? "  " + i : "");
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.lumina.monsterhunterfieldbook.WeaponProfilePanel$choices$textAdapter$1] */
    private final void choices(GridLayout parent, String label, final String key, final List<Pair<String, String>> values) {
        LinearLayout column = this.a.column();
        MainActivity mainActivity = this.a;
        column.addView(MainActivity.text$default(mainActivity, label, 11.0f, false, mainActivity.getMuted(), 4, null));
        Spinner spinner = new Spinner(this.a);
        spinner.setContentDescription(label);
        MainActivity mainActivity2 = this.a;
        spinner.setBackground(MainActivity.surface$default(mainActivity2, mainActivity2.getBg(), false, 0.0f, 6, null));
        final MainActivity mainActivity3 = this.a;
        List<Pair<String, String>> list = values;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Pair) it.next()).getSecond());
        }
        final ArrayList arrayList2 = arrayList;
        ?? r2 = new ArrayAdapter<String>(mainActivity3, arrayList2) { // from class: com.lumina.monsterhunterfieldbook.WeaponProfilePanel$choices$textAdapter$1
            {
                super(mainActivity3, android.R.layout.simple_spinner_item, arrayList2);
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int position, View convertView, ViewGroup parent2) {
                MainActivity mainActivity4;
                MainActivity mainActivity5;
                MainActivity mainActivity6;
                MainActivity mainActivity7;
                MainActivity mainActivity8;
                MainActivity mainActivity9;
                Intrinsics.checkNotNullParameter(parent2, "parent");
                View view = super.getView(position, convertView, parent2);
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) view;
                WeaponProfilePanel weaponProfilePanel = WeaponProfilePanel.this;
                mainActivity4 = weaponProfilePanel.a;
                textView.setTextColor(mainActivity4.getInk());
                mainActivity5 = weaponProfilePanel.a;
                textView.setTypeface(MainActivity.text$default(mainActivity5, "", 0.0f, false, 0, 14, null).getTypeface());
                textView.setTextSize(13.0f);
                mainActivity6 = weaponProfilePanel.a;
                int dp = mainActivity6.dp((Number) 10);
                mainActivity7 = weaponProfilePanel.a;
                int dp2 = mainActivity7.dp((Number) 8);
                mainActivity8 = weaponProfilePanel.a;
                int dp3 = mainActivity8.dp((Number) 10);
                mainActivity9 = weaponProfilePanel.a;
                textView.setPadding(dp, dp2, dp3, mainActivity9.dp((Number) 8));
                return textView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
            public View getDropDownView(int position, View convertView, ViewGroup parent2) {
                MainActivity mainActivity4;
                MainActivity mainActivity5;
                MainActivity mainActivity6;
                MainActivity mainActivity7;
                MainActivity mainActivity8;
                MainActivity mainActivity9;
                MainActivity mainActivity10;
                Intrinsics.checkNotNullParameter(parent2, "parent");
                View dropDownView = super.getDropDownView(position, convertView, parent2);
                Intrinsics.checkNotNull(dropDownView, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) dropDownView;
                WeaponProfilePanel weaponProfilePanel = WeaponProfilePanel.this;
                mainActivity4 = weaponProfilePanel.a;
                textView.setTextColor(mainActivity4.getInk());
                mainActivity5 = weaponProfilePanel.a;
                textView.setBackgroundColor(mainActivity5.getPanel());
                mainActivity6 = weaponProfilePanel.a;
                textView.setTypeface(MainActivity.text$default(mainActivity6, "", 0.0f, false, 0, 14, null).getTypeface());
                textView.setTextSize(13.0f);
                mainActivity7 = weaponProfilePanel.a;
                int dp = mainActivity7.dp((Number) 14);
                mainActivity8 = weaponProfilePanel.a;
                int dp2 = mainActivity8.dp((Number) 12);
                mainActivity9 = weaponProfilePanel.a;
                int dp3 = mainActivity9.dp((Number) 14);
                mainActivity10 = weaponProfilePanel.a;
                textView.setPadding(dp, dp2, dp3, mainActivity10.dp((Number) 12));
                return textView;
            }
        };
        r2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter((SpinnerAdapter) r2);
        Iterator<Pair<String, String>> it2 = values.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(it2.next().getFirst(), this.state.optString(key, "all"))) {
                break;
            } else {
                i++;
            }
        }
        int coerceAtLeast = RangesKt.coerceAtLeast(i, 0);
        spinner.setSelection(coerceAtLeast);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = values.get(coerceAtLeast).getFirst();
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.lumina.monsterhunterfieldbook.WeaponProfilePanel$choices$1
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> p) {
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Object, java.lang.String] */
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> p, View v, int position, long id) {
                String first = values.get(position).getFirst();
                if (Intrinsics.areEqual(first, objectRef.element)) {
                    return;
                }
                objectRef.element = first;
                this.getState().put(key, first).put("limit", 40).put("listPosition", 0).put("listTop", 0);
                this.saveFilters();
                this.updateRows(true);
            }
        });
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.a.dp((Number) 44));
        layoutParams.topMargin = this.a.dp((Number) 9);
        Unit unit = Unit.INSTANCE;
        column.addView(spinner, layoutParams);
        int childCount = parent.getChildCount();
        LinearLayout linearLayout = column;
        GridLayout.LayoutParams layoutParams2 = new GridLayout.LayoutParams();
        layoutParams2.width = 0;
        layoutParams2.columnSpec = GridLayout.spec(childCount % parent.getColumnCount(), 1.0f);
        layoutParams2.rowSpec = GridLayout.spec(childCount / parent.getColumnCount());
        layoutParams2.rightMargin = this.a.dp(Integer.valueOf(childCount % parent.getColumnCount() != parent.getColumnCount() + (-1) ? 12 : 0));
        layoutParams2.bottomMargin = this.a.dp((Number) 15);
        Unit unit2 = Unit.INSTANCE;
        parent.addView(linearLayout, layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateRows(final boolean reset) {
        String str;
        WeaponModel weaponModel = WeaponModel.INSTANCE;
        List<FieldRecord> list = this.records;
        JSONObject jSONObject = this.state;
        String text = this.a.getPrefs().text("sortWeapons", "source");
        Intrinsics.checkNotNullExpressionValue(text, "text(...)");
        List<FieldRecord> filtered = weaponModel.filtered(list, jSONObject, text);
        int coerceAtLeast = RangesKt.coerceAtLeast(this.state.optInt("limit", 40), 40);
        this.restoring = true;
        this.visible.clear();
        this.visible.addAll(CollectionsKt.take(filtered, coerceAtLeast));
        TextView textView = this.meta;
        if (textView != null) {
            textView.setText(filtered.size() + " weapons");
        }
        TextView textView2 = this.filterToggle;
        if (textView2 != null) {
            textView2.setText(filterLabel());
        }
        TextView textView3 = this.more;
        if (textView3 != null) {
            if (filtered.isEmpty()) {
                str = "No matching weapons.";
            } else {
                str = "Show more · " + Math.min(coerceAtLeast, filtered.size()) + " of " + filtered.size();
            }
            textView3.setText(str);
            textView3.setVisibility((filtered.isEmpty() || filtered.size() > coerceAtLeast) ? 0 : 8);
            textView3.setEnabled(!filtered.isEmpty());
        }
        notifyDataSetChanged();
        ListView listView = this.list;
        if (listView != null) {
            listView.post(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    WeaponProfilePanel.updateRows$lambda$1(WeaponProfilePanel.this, reset);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateRows$lambda$1(WeaponProfilePanel weaponProfilePanel, boolean z) {
        ListView listView = weaponProfilePanel.list;
        if (listView != null) {
            listView.setSelectionFromTop(z ? 0 : weaponProfilePanel.state.optInt("listPosition"), z ? 0 : weaponProfilePanel.state.optInt("listTop"));
        }
        weaponProfilePanel.restoring = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View weaponRow(final FieldRecord record) {
        LinearLayout weaponElement;
        JSONObject data = WeaponModel.INSTANCE.data(record);
        LinearLayout row = this.a.row();
        row.setGravity(16);
        row.setPadding(this.a.dp((Number) 14), this.a.dp((Number) 13), this.a.dp((Number) 14), this.a.dp((Number) 13));
        row.setMinimumHeight(this.a.dp((Number) 76));
        row.addView(WeaponModel.INSTANCE.icon(this.a, record, 32), new LinearLayout.LayoutParams(this.a.dp((Number) 42), this.a.dp((Number) 42)));
        LinearLayout column = this.a.column();
        LinearLayout row2 = this.a.row();
        row2.setGravity(48);
        row2.addView(this.a.textBold(record.getName(), 14.0f, this.a.getAccent()), new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView text$default = MainActivity.text$default(this.a, "Rarity " + data.optInt("rarity"), 10.0f, false, this.a.getMuted(), 4, null);
        text$default.setPadding(this.a.dp((Number) 10), 0, 0, 0);
        row2.addView(text$default);
        column.addView(row2);
        this.a.gap(column, 5);
        WeaponFlowLayout weaponFlowLayout = new WeaponFlowLayout(this.a, 7, 3);
        weaponFlowLayout.addView(MainActivity.text$default(this.a, data.optString("rank") + "  ·  Attack " + WeaponModel.INSTANCE.number(data.opt("attack")) + "  ·  Affinity " + WeaponModel.INSTANCE.shown(data.opt("affinity")) + "%", 12.0f, false, this.a.getMuted(), 4, null), new ViewGroup.LayoutParams(-2, -2));
        if (!WeaponModel.INSTANCE.elementNames(record).isEmpty()) {
            MainActivity mainActivity = this.a;
            weaponFlowLayout.addView(MainActivity.text$default(mainActivity, "·", 12.0f, false, mainActivity.getMuted(), 4, null), new ViewGroup.LayoutParams(-2, -2));
            Iterator<T> it = WeaponModel.INSTANCE.elements(record).iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                String str = (String) pair.component1();
                JSONObject jSONObject = (JSONObject) pair.component2();
                MainActivity mainActivity2 = this.a;
                weaponElement = WeaponProfilePanelKt.weaponElement(mainActivity2, str, jSONObject, 12.0f, mainActivity2.getMuted());
                weaponFlowLayout.addView(weaponElement, new ViewGroup.LayoutParams(-2, -2));
            }
        }
        column.addView(weaponFlowLayout);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.leftMargin = this.a.dp((Number) 12);
        Unit unit = Unit.INSTANCE;
        row.addView(column, layoutParams);
        if (Intrinsics.areEqual(WeaponModel.INSTANCE.rawId(record), this.state.optString("selected"))) {
            MainActivity mainActivity3 = this.a;
            row.setBackground(MainActivity.surface$default(mainActivity3, FieldViewsKt.alphaColour(mainActivity3.getAccent(), 14), false, 0.0f, 4, null));
        }
        LinearLayout linearLayout = row;
        this.a.touch(linearLayout, new Function0() { // from class: com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit weaponRow$lambda$3;
                weaponRow$lambda$3 = WeaponProfilePanel.weaponRow$lambda$3(WeaponProfilePanel.this, record);
                return weaponRow$lambda$3;
            }
        });
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit weaponRow$lambda$3(WeaponProfilePanel weaponProfilePanel, FieldRecord fieldRecord) {
        weaponProfilePanel.capture();
        weaponProfilePanel.hideKeyboard();
        String rawId = WeaponModel.INSTANCE.rawId(fieldRecord);
        Intrinsics.checkNotNullExpressionValue(rawId, "rawId(...)");
        weaponProfilePanel.select(rawId);
        return Unit.INSTANCE;
    }

    private final void renderDetails() {
        final FieldRecord fieldRecord = this.byId.get(this.state.optString("selected"));
        if (fieldRecord == null) {
            this.state.put("detail", false);
            render(false);
            return;
        }
        Pair<ScrollView, LinearLayout> contentScroll = contentScroll();
        final ScrollView component1 = contentScroll.component1();
        LinearLayout component2 = contentScroll.component2();
        MainActivity mainActivity = this.a;
        int dp = mainActivity.dp(Integer.valueOf(mainActivity.getWide() ? 29 : 20));
        int dp2 = this.a.dp((Number) 12);
        MainActivity mainActivity2 = this.a;
        component2.setPadding(dp, dp2, mainActivity2.dp(Integer.valueOf(mainActivity2.getWide() ? 29 : 20)), this.a.dp((Number) 25));
        component2.addView(new WeaponMaterialsView(this.a, fieldRecord, this.state, false, new Function1() { // from class: com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit renderDetails$lambda$0;
                renderDetails$lambda$0 = WeaponProfilePanel.renderDetails$lambda$0(WeaponProfilePanel.this, (String) obj);
                return renderDetails$lambda$0;
            }
        }, null, 32, null), new LinearLayout.LayoutParams(-1, -2));
        component1.post(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda23
            @Override // java.lang.Runnable
            public final void run() {
                WeaponProfilePanel.renderDetails$lambda$1(component1, this, fieldRecord);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderDetails$lambda$0(WeaponProfilePanel weaponProfilePanel, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        weaponProfilePanel.select(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderDetails$lambda$1(ScrollView scrollView, WeaponProfilePanel weaponProfilePanel, FieldRecord fieldRecord) {
        scrollView.scrollTo(0, weaponProfilePanel.state.optInt("detailScroll:" + WeaponModel.INSTANCE.rawId(fieldRecord)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideKeyboard() {
        Object systemService = this.a.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        capture();
        saveFilters();
        ValueAnimator valueAnimator = this.contentAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.handler.removeCallbacksAndMessages(null);
        super.onDetachedFromWindow();
    }
}
