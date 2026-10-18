package com.lumina.monsterhunterfieldbook;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: RecordPanel.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\"\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u001bH\u0002J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u001bH\u0002J \u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u001bH\u0002J\"\u0010)\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J,\u0010*\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u00012\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u001b2\b\b\u0002\u0010+\u001a\u00020,H\u0002J\u001e\u0010-\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u00012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00150/H\u0002J\u0010\u00100\u001a\u00020\b2\u0006\u00101\u001a\u000202H\u0002J\u0018\u00103\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u00012\u0006\u0010+\u001a\u00020,H\u0002J\b\u00104\u001a\u00020\bH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/RecordPanel;", "Landroid/widget/LinearLayout;", "a", "Lcom/lumina/monsterhunterfieldbook/MainActivity;", "record", "Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "close", "Lkotlin/Function0;", "", "<init>", "(Lcom/lumina/monsterhunterfieldbook/MainActivity;Lcom/lumina/monsterhunterfieldbook/FieldRecord;Lkotlin/jvm/functions/Function0;)V", "getRecord", "()Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "groups", "", "Lcom/lumina/monsterhunterfieldbook/ReadingGroup;", "generation", "Ljava/util/concurrent/atomic/AtomicInteger;", "hideZero", "", "data", "Lorg/json/JSONObject;", "scroll", "Landroid/widget/ScrollView;", "body", "metadata", "", "", "addCard", "card", "Landroid/view/View;", "addGroup", "title", "value", "", "key", "sourceName", "url", "external", "parent", "label", "field", "render", "offset", "", "table", "rows", "", "mapGroup", "maps", "Lorg/json/JSONArray;", "loadRelated", "onDetachedFromWindow", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RecordPanel extends LinearLayout {
    private final MainActivity a;
    private final LinearLayout body;
    private final JSONObject data;
    private final AtomicInteger generation;
    private final List<ReadingGroup> groups;
    private final boolean hideZero;
    private final Set<String> metadata;
    private final FieldRecord record;
    private final ScrollView scroll;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordPanel(MainActivity a, FieldRecord record, Function0<Unit> close) {
        super(a);
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(close, "close");
        this.a = a;
        this.record = record;
        this.groups = new ArrayList();
        this.generation = new AtomicInteger();
        this.hideZero = CollectionsKt.listOf((Object[]) new String[]{"Monsters", "Creatures"}).contains(record.getKind());
        this.data = record.data();
        ScrollView scrollView = new ScrollView(a);
        this.scroll = scrollView;
        LinearLayout column = a.column();
        this.body = column;
        this.metadata = SetsKt.setOf((Object[]) new String[]{"id", "name", "title", "game", "image", "thumbnail", "artUrl", "artSource", "sourceId", "iconKey", "iconColor", "path", "sha256", "bytes", "nativeWidth", "nativeHeight", "width", "height", "assetType"});
        setOrientation(1);
        LinearLayout row = a.row();
        row.setPadding(a.dp((Number) 12), a.dp((Number) 8), a.dp((Number) 6), a.dp((Number) 8));
        row.addView(MainActivity.text$default(a, record.getName(), 21.0f, true, 0, 8, null), new LinearLayout.LayoutParams(0, -2, 1.0f));
        final TextView button = a.button(a.isBookmarked(record.getId()) ? "Saved" : "Save", new Function0() { // from class: com.lumina.monsterhunterfieldbook.RecordPanel$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        });
        TextView textView = button;
        a.touch(textView, new Function0() { // from class: com.lumina.monsterhunterfieldbook.RecordPanel$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit _init_$lambda$1;
                _init_$lambda$1 = RecordPanel._init_$lambda$1(RecordPanel.this, button);
                return _init_$lambda$1;
            }
        });
        row.addView(textView);
        row.addView(a.iconButton("close", "Close " + record.getName(), close), new LinearLayout.LayoutParams(a.dp((Number) 44), a.dp((Number) 44)));
        addView(row);
        a.rule(this);
        scrollView.addView(column);
        a.pad(column, 14);
        addView(scrollView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        String upperCase = record.getKind().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        String game = record.getGame();
        column.addView(MainActivity.text$default(a, upperCase + " · " + (Intrinsics.areEqual(game, "world") ? "WORLD" : Intrinsics.areEqual(game, "iceborne") ? "ICEBORNE" : "WORLD + ICEBORNE"), 10.0f, false, a.getAccent(), 4, null));
        a.gap(column, 10);
        if (!StringsKt.isBlank(record.getImage())) {
            ImageView imageView = new ImageView(a);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setContentDescription(record.getName() + " artwork");
            column.addView(imageView, new LinearLayout.LayoutParams(-1, a.dp(Integer.valueOf((StringsKt.contains$default((CharSequence) record.getImage(), (CharSequence) "/icons/", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) record.getImage(), (CharSequence) "/glyphs/", false, 2, (Object) null)) ? 90 : 200))));
            a.recordImage(record, imageView);
            a.gap(column, 10);
        }
        for (String str : CollectionsKt.listOf((Object[]) new String[]{"summary", "description", "text", "short", "tip", "overview"})) {
            if (ContentText.useful$default(ContentText.INSTANCE, this.data.opt(str), false, 2, null)) {
                this.body.addView(MainActivity.text$default(this.a, ContentText.INSTANCE.value(this.data.opt(str)), 14.0f, false, 0, 12, null));
                this.a.gap(this.body, 10);
            }
        }
        JSONArray optJSONArray = this.data.optJSONArray("maps");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            JSONArray jSONArray = this.data.getJSONArray("maps");
            Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
            mapGroup(jSONArray);
        }
        if (Intrinsics.areEqual(this.record.getKind(), "Maps")) {
            String optString = this.data.optString("image");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            if (StringsKt.startsWith$default(optString, "art/", false, 2, (Object) null)) {
                JSONArray put = new JSONArray().put(this.data);
                Intrinsics.checkNotNullExpressionValue(put, "put(...)");
                mapGroup(put);
            }
        }
        Iterator<String> keys = this.data.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        for (String str2 : SequencesKt.toList(SequencesKt.filter(SequencesKt.asSequence(keys), new Function1() { // from class: com.lumina.monsterhunterfieldbook.RecordPanel$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean _init_$lambda$5;
                _init_$lambda$5 = RecordPanel._init_$lambda$5(RecordPanel.this, (String) obj);
                return Boolean.valueOf(_init_$lambda$5);
            }
        }))) {
            Object opt = this.data.opt(str2);
            if (ContentText.INSTANCE.useful(opt, this.hideZero)) {
                boolean z = opt instanceof JSONObject;
                if (z && Intrinsics.areEqual(str2, "database")) {
                    JSONObject jSONObject = (JSONObject) opt;
                    Iterator<String> keys2 = jSONObject.keys();
                    Intrinsics.checkNotNullExpressionValue(keys2, "keys(...)");
                    for (String str3 : SequencesKt.filter(SequencesKt.asSequence(keys2), new Function1() { // from class: com.lumina.monsterhunterfieldbook.RecordPanel$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Boolean.valueOf(RecordPanel.lambda$6$0((String) obj));
                        }
                    })) {
                        ContentText contentText = ContentText.INSTANCE;
                        Intrinsics.checkNotNull(str3);
                        addGroup(contentText.label(str3), jSONObject.opt(str3), str2 + "." + str3);
                    }
                } else if ((opt instanceof JSONArray) || z) {
                    ContentText contentText2 = ContentText.INSTANCE;
                    Intrinsics.checkNotNull(str2);
                    addGroup(contentText2.label(str2), opt, str2);
                } else {
                    LinearLayout linearLayout = this.body;
                    Intrinsics.checkNotNull(str2);
                    field(linearLayout, str2, opt);
                }
            }
        }
        final JSONObject optJSONObject = this.data.optJSONObject("video");
        if (optJSONObject != null) {
            final String optString2 = optJSONObject.optString("url");
            Intrinsics.checkNotNull(optString2);
            if (StringsKt.startsWith$default(optString2, "https://", false, 2, (Object) null)) {
                addCard(new ReadingGroup(this.a, this.record.getId() + ":video", "Hunt video · opens online", this.groups, false, new Function1() { // from class: com.lumina.monsterhunterfieldbook.RecordPanel$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RecordPanel.lambda$7$0(RecordPanel.this, optJSONObject, optString2, (LinearLayout) obj);
                    }
                }, 16, null));
            }
        }
        addCard(new ReadingGroup(this.a, this.record.getId() + ":related", "Related records, recipes & upgrades", this.groups, false, new Function1() { // from class: com.lumina.monsterhunterfieldbook.RecordPanel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$8;
                _init_$lambda$8 = RecordPanel._init_$lambda$8(RecordPanel.this, (LinearLayout) obj);
                return _init_$lambda$8;
            }
        }, 16, null));
        final ArrayList arrayList = new ArrayList();
        _init_$collectSources$default(arrayList, this.data, null, 4, null);
        if (!arrayList.isEmpty()) {
            addCard(new ReadingGroup(this.a, this.record.getId() + ":sources", "Sources & credits", this.groups, false, new Function1() { // from class: com.lumina.monsterhunterfieldbook.RecordPanel$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit _init_$lambda$10;
                    _init_$lambda$10 = RecordPanel._init_$lambda$10(arrayList, this, (LinearLayout) obj);
                    return _init_$lambda$10;
                }
            }, 16, null));
        }
        if (NativePrefs.flag$default(this.a.getPrefs(), "rememberScroll", false, 2, null)) {
            this.scroll.post(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.RecordPanel$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    RecordPanel._init_$lambda$11(RecordPanel.this);
                }
            });
        }
    }

    public final FieldRecord getRecord() {
        return this.record;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(RecordPanel recordPanel, TextView textView) {
        recordPanel.a.toggleBookmark(recordPanel.record.getId());
        textView.setText(recordPanel.a.isBookmarked(recordPanel.record.getId()) ? "Saved" : "Save");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$5(RecordPanel recordPanel, String str) {
        return (recordPanel.metadata.contains(str) || SetsKt.setOf((Object[]) new String[]{"summary", "description", "text", "short", "tip", "overview", "maps", "source", "sources", "priceSource", "unlockSource", "video"}).contains(str)) ? false : true;
    }

    static final boolean lambda$6$0(String str) {
        return !SetsKt.setOf((Object[]) new String[]{"name", "source"}).contains(str);
    }

    static final Unit lambda$7$0(RecordPanel recordPanel, JSONObject jSONObject, String str, LinearLayout inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        MainActivity mainActivity = recordPanel.a;
        String optString = jSONObject.optString("title");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        inner.addView(MainActivity.text$default(mainActivity, optString, 14.0f, false, 0, 12, null));
        recordPanel.a.gap(inner, 8);
        Intrinsics.checkNotNull(str);
        recordPanel.external(inner, str, "Open " + jSONObject.optString("channel", "video"));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$8(RecordPanel recordPanel, LinearLayout inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        recordPanel.loadRelated(inner, 0);
        return Unit.INSTANCE;
    }

    static /* synthetic */ void _init_$collectSources$default(List list, Object obj, String str, int i, Object obj2) {
        if ((i & 4) != 0) {
            str = "";
        }
        _init_$collectSources(list, obj, str);
    }

    private static final void _init_$collectSources(List<Pair<String, String>> list, Object obj, String str) {
        if (!(obj instanceof JSONObject)) {
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    _init_$collectSources(list, jSONArray.opt(i), str);
                }
                return;
            }
            if ((obj instanceof String) && StringsKt.startsWith$default((String) obj, "https://", false, 2, (Object) null)) {
                if (StringsKt.contains((CharSequence) str, (CharSequence) "source", true) || CollectionsKt.listOf((Object[]) new String[]{"url", "artUrl", "artSource"}).contains(str)) {
                    list.add(TuplesKt.to(ContentText.INSTANCE.label(str), obj));
                    return;
                }
                return;
            }
            return;
        }
        JSONObject jSONObject = (JSONObject) obj;
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            Intrinsics.checkNotNull(next);
            _init_$collectSources(list, opt, next);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$10(List list, RecordPanel recordPanel, LinearLayout inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add((String) ((Pair) obj).getSecond())) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) ((Pair) it.next()).component2();
            recordPanel.external(inner, str, recordPanel.sourceName(str));
            recordPanel.a.gap(inner, 6);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$11(RecordPanel recordPanel) {
        recordPanel.scroll.scrollTo(0, recordPanel.a.getPrefs().number("recordPosition:" + recordPanel.record.getId(), 0));
    }

    private final void addCard(View card) {
        LinearLayout linearLayout = this.body;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = this.a.dp((Number) 10);
        Unit unit = Unit.INSTANCE;
        linearLayout.addView(card, layoutParams);
    }

    private final void addGroup(String title, final Object value, final String key) {
        if (ContentText.INSTANCE.useful(value, this.hideZero)) {
            if ((value instanceof JSONArray) && this.hideZero) {
                JSONArray jSONArray = (JSONArray) value;
                if (jSONArray.length() > 0) {
                    Iterable until = RangesKt.until(0, jSONArray.length());
                    if ((until instanceof Collection) && ((Collection) until).isEmpty()) {
                        return;
                    }
                    Iterator it = until.iterator();
                    while (it.hasNext()) {
                        Object opt = jSONArray.opt(((IntIterator) it).nextInt());
                        if ((opt instanceof JSONObject) && !ContentText.INSTANCE.monsterRow((JSONObject) opt)) {
                        }
                    }
                    return;
                }
            }
            addCard(new ReadingGroup(this.a, this.record.getId() + ":" + key, title, this.groups, false, new Function1() { // from class: com.lumina.monsterhunterfieldbook.RecordPanel$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit addGroup$lambda$1;
                    addGroup$lambda$1 = RecordPanel.addGroup$lambda$1(RecordPanel.this, value, key, (LinearLayout) obj);
                    return addGroup$lambda$1;
                }
            }, 16, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addGroup$lambda$1(RecordPanel recordPanel, Object obj, String str, LinearLayout inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        render$default(recordPanel, inner, obj, str, 0, 8, null);
        return Unit.INSTANCE;
    }

    private final String sourceName(String url) {
        String removePrefix;
        String str = url;
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "MHWorldData", false, 2, (Object) null)) {
            return "MHWorldData — " + ContentText.INSTANCE.label(StringsKt.replace$default(StringsKt.substringBefore$default(StringsKt.substringAfterLast$default(url, '/', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null), "_", " ", false, 4, (Object) null));
        }
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "kiranico", false, 2, (Object) null)) {
            return "Kiranico — game database";
        }
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "monsterhunterwiki", false, 2, (Object) null)) {
            return "Monster Hunter Wiki — " + StringsKt.replace$default(StringsKt.substringAfterLast$default(url, '/', (String) null, 2, (Object) null), '_', ' ', false, 4, (Object) null);
        }
        String host = Uri.parse(url).getHost();
        return (host == null || (removePrefix = StringsKt.removePrefix(host, (CharSequence) "www.")) == null) ? "Reference" : removePrefix;
    }

    private final void external(LinearLayout parent, final String url, String label) {
        TextView button = this.a.button(label, new Function0() { // from class: com.lumina.monsterhunterfieldbook.RecordPanel$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit external$lambda$0;
                external$lambda$0 = RecordPanel.external$lambda$0(RecordPanel.this, url);
                return external$lambda$0;
            }
        });
        button.setGravity(8388627);
        parent.addView(button);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit external$lambda$0(RecordPanel recordPanel, String str) {
        Object m79constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            recordPanel.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            m79constructorimpl = Result.m79constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m79constructorimpl = Result.m79constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m82exceptionOrNullimpl(m79constructorimpl) != null) {
            recordPanel.a.toast("No app is available to open this link.");
        }
        return Unit.INSTANCE;
    }

    private final void field(LinearLayout parent, String key, Object value) {
        if (ContentText.INSTANCE.useful(value, this.hideZero)) {
            if ((value instanceof String) && StringsKt.startsWith$default((String) value, "art/", false, 2, (Object) null)) {
                return;
            }
            String label = ContentText.INSTANCE.label(key);
            LinearLayout column = this.a.column();
            column.setPadding(0, this.a.dp((Number) 5), 0, this.a.dp((Number) 8));
            MainActivity mainActivity = this.a;
            column.addView(MainActivity.text$default(mainActivity, label, 11.0f, false, mainActivity.getMuted(), 4, null));
            final String value2 = ContentText.INSTANCE.value(value);
            TextView text$default = MainActivity.text$default(this.a, value2, 14.0f, false, 0, 12, null);
            if (SetsKt.setOf((Object[]) new String[]{"parent", "previous", "setId", "questId", "monsterId", "itemId", "name", "previousName", "localeId"}).contains(key)) {
                text$default.setTextColor(this.a.getAccent());
                this.a.touch(text$default, new Function0() { // from class: com.lumina.monsterhunterfieldbook.RecordPanel$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit field$lambda$0;
                        field$lambda$0 = RecordPanel.field$lambda$0(RecordPanel.this, value2);
                        return field$lambda$0;
                    }
                });
            }
            column.addView(text$default);
            parent.addView(column);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit field$lambda$0(RecordPanel recordPanel, String str) {
        MainActivity.openReference$default(recordPanel.a, str, null, 2, null);
        return Unit.INSTANCE;
    }

    static /* synthetic */ void render$default(RecordPanel recordPanel, LinearLayout linearLayout, Object obj, String str, int i, int i2, Object obj2) {
        if ((i2 & 8) != 0) {
            i = 0;
        }
        recordPanel.render(linearLayout, obj, str, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void render(final LinearLayout parent, final Object value, final String key, final int offset) {
        TextView text$default;
        if (!(value instanceof JSONObject)) {
            if (value instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) value;
                IntRange until = RangesKt.until(0, jSONArray.length());
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
                Iterator<Integer> it = until.iterator();
                while (it.hasNext()) {
                    arrayList.add(jSONArray.opt(((IntIterator) it).nextInt()));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (ContentText.INSTANCE.useful(obj, this.hideZero) && (!this.hideZero || !(obj instanceof JSONObject) || ContentText.INSTANCE.monsterRow((JSONObject) obj))) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = arrayList2;
                final List take = CollectionsKt.take(CollectionsKt.drop(arrayList3, offset), 30);
                List list = take;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof JSONObject) {
                        arrayList4.add(obj2);
                    }
                }
                ArrayList arrayList5 = arrayList4;
                if (!arrayList5.isEmpty() && arrayList5.size() == take.size()) {
                    ArrayList<JSONObject> arrayList6 = arrayList5;
                    if (!(arrayList6 instanceof Collection) || !arrayList6.isEmpty()) {
                        for (JSONObject jSONObject : arrayList6) {
                            Iterator<String> keys = jSONObject.keys();
                            Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
                            for (String str : SequencesKt.asSequence(keys)) {
                                if (!(jSONObject.opt(str) instanceof JSONObject) && !(jSONObject.opt(str) instanceof JSONArray)) {
                                }
                            }
                        }
                    }
                    table(parent, arrayList5);
                    if (take.size() + offset >= arrayList3.size()) {
                        final TextView button = this.a.button("Show more · " + ((arrayList3.size() - offset) - take.size()) + " remaining", new Function0() { // from class: com.lumina.monsterhunterfieldbook.RecordPanel$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit unit;
                                unit = Unit.INSTANCE;
                                return unit;
                            }
                        });
                        TextView textView = button;
                        this.a.touch(textView, new Function0() { // from class: com.lumina.monsterhunterfieldbook.RecordPanel$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit render$lambda$6;
                                render$lambda$6 = RecordPanel.render$lambda$6(parent, button, this, value, key, offset, take);
                                return render$lambda$6;
                            }
                        });
                        parent.addView(textView);
                        return;
                    }
                    return;
                }
                for (Object obj3 : list) {
                    if (obj3 instanceof JSONObject) {
                        JSONObject jSONObject2 = (JSONObject) obj3;
                        String optString = jSONObject2.optString("name");
                        if (StringsKt.isBlank(optString)) {
                            optString = jSONObject2.optString("title");
                        }
                        final String str2 = optString;
                        Intrinsics.checkNotNull(str2);
                        if (!StringsKt.isBlank(str2)) {
                            if (SetsKt.setOf((Object[]) new String[]{"materials", "ingredients", "skills", "links", "rewards", "gathering"}).contains(key)) {
                                TextView button2 = this.a.button(ContentText.INSTANCE.clean(str2), new Function0() { // from class: com.lumina.monsterhunterfieldbook.RecordPanel$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit render$lambda$4$1;
                                        render$lambda$4$1 = RecordPanel.render$lambda$4$1(RecordPanel.this, str2);
                                        return render$lambda$4$1;
                                    }
                                });
                                button2.setGravity(8388611);
                                parent.addView(button2);
                            } else {
                                parent.addView(MainActivity.text$default(this.a, ContentText.INSTANCE.clean(str2), 15.0f, true, 0, 8, null));
                            }
                        }
                        render$default(this, parent, obj3, key, 0, 8, null);
                        this.a.rule(parent);
                    } else {
                        final String value2 = ContentText.INSTANCE.value(obj3);
                        if (SetsKt.setOf((Object[]) new String[]{"questIds", "monsters", "pieces"}).contains(key)) {
                            text$default = this.a.button(value2, new Function0() { // from class: com.lumina.monsterhunterfieldbook.RecordPanel$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit render$lambda$4$3;
                                    render$lambda$4$3 = RecordPanel.render$lambda$4$3(RecordPanel.this, value2);
                                    return render$lambda$4$3;
                                }
                            });
                            text$default.setGravity(8388627);
                        } else {
                            text$default = MainActivity.text$default(this.a, "• " + value2, 14.0f, false, 0, 12, null);
                        }
                        parent.addView(text$default);
                    }
                    this.a.gap(parent, 6);
                }
                if (take.size() + offset >= arrayList3.size()) {
                }
            } else {
                field(parent, key, value);
            }
        } else {
            JSONObject jSONObject3 = (JSONObject) value;
            Iterator<String> keys2 = jSONObject3.keys();
            Intrinsics.checkNotNullExpressionValue(keys2, "keys(...)");
            while (keys2.hasNext()) {
                String next = keys2.next();
                if (!this.metadata.contains(next) && ContentText.INSTANCE.useful(jSONObject3.opt(next), this.hideZero)) {
                    Object opt = jSONObject3.opt(next);
                    if ((opt instanceof JSONObject) || (opt instanceof JSONArray)) {
                        MainActivity mainActivity = this.a;
                        ContentText contentText = ContentText.INSTANCE;
                        Intrinsics.checkNotNull(next);
                        parent.addView(MainActivity.text$default(mainActivity, contentText.label(next), 14.0f, true, 0, 8, null));
                        render$default(this, parent, opt, next, 0, 8, null);
                        this.a.gap(parent, 8);
                    } else {
                        Intrinsics.checkNotNull(next);
                        field(parent, next, opt);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$4$1(RecordPanel recordPanel, String str) {
        MainActivity mainActivity = recordPanel.a;
        Intrinsics.checkNotNull(str);
        MainActivity.openReference$default(mainActivity, str, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$4$3(RecordPanel recordPanel, String str) {
        MainActivity.openReference$default(recordPanel.a, str, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$6(LinearLayout linearLayout, TextView textView, RecordPanel recordPanel, Object obj, String str, int i, List list) {
        linearLayout.removeView(textView);
        recordPanel.render(linearLayout, obj, str, i + list.size());
        return Unit.INSTANCE;
    }

    private final void table(LinearLayout parent, List<? extends JSONObject> rows) {
        char c;
        char c2;
        char c3;
        boolean z;
        boolean z2;
        int i;
        List<? extends JSONObject> list = rows;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Iterator<String> keys = ((JSONObject) it.next()).keys();
            Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
            CollectionsKt.addAll(arrayList, SequencesKt.toList(SequencesKt.asSequence(keys)));
        }
        List distinct = CollectionsKt.distinct(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = distinct.iterator();
        while (true) {
            c = 4;
            c2 = 3;
            c3 = 2;
            z = true;
            z2 = false;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            String str = (String) next;
            if (!SetsKt.setOf((Object[]) new String[]{"id", "sourceId", "image", "thumbnail", "source", "sources"}).contains(str) && (!(list instanceof Collection) || !list.isEmpty())) {
                Iterator<T> it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (ContentText.INSTANCE.useful(((JSONObject) it3.next()).opt(str), this.hideZero)) {
                            arrayList2.add(next);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        ArrayList arrayList3 = arrayList2;
        if (arrayList3.isEmpty()) {
            return;
        }
        TableLayout tableLayout = new TableLayout(this.a);
        tableLayout.setStretchAllColumns(false);
        TableRow tableRow = new TableRow(this.a);
        ArrayList<String> arrayList4 = arrayList3;
        Iterator it4 = arrayList4.iterator();
        while (true) {
            i = 8;
            if (!it4.hasNext()) {
                break;
            }
            String str2 = (String) it4.next();
            MainActivity mainActivity = this.a;
            char c4 = c2;
            ContentText contentText = ContentText.INSTANCE;
            Intrinsics.checkNotNull(str2);
            TextView text$default = MainActivity.text$default(mainActivity, contentText.label(str2), 11.0f, false, this.a.getMuted(), 4, null);
            text$default.setPadding(this.a.dp((Number) 8), this.a.dp((Number) 8), this.a.dp((Number) 8), this.a.dp((Number) 8));
            text$default.setMinWidth(this.a.dp((Number) 65));
            tableRow.addView(text$default);
            c2 = c4;
            c3 = c3;
            z = z;
        }
        char c5 = c2;
        char c6 = c3;
        boolean z3 = z;
        tableLayout.addView(tableRow);
        for (JSONObject jSONObject : list) {
            TableRow tableRow2 = new TableRow(this.a);
            for (String str3 : arrayList4) {
                Object opt = jSONObject.opt(str3);
                final String value = ContentText.INSTANCE.useful(opt, this.hideZero) ? ContentText.INSTANCE.value(opt) : "";
                TextView text$default2 = MainActivity.text$default(this.a, value, 12.0f, false, 0, 12, null);
                boolean z4 = z2;
                int i2 = i;
                text$default2.setPadding(this.a.dp(Integer.valueOf(i)), this.a.dp(Integer.valueOf(i)), this.a.dp(Integer.valueOf(i2)), this.a.dp(Integer.valueOf(i2)));
                MainActivity mainActivity2 = this.a;
                String[] strArr = new String[4];
                strArr[z4 ? 1 : 0] = "name";
                strArr[z3 ? 1 : 0] = "part";
                strArr[c6] = "description";
                strArr[c5] = "condition";
                text$default2.setMaxWidth(mainActivity2.dp(Integer.valueOf(CollectionsKt.listOf((Object[]) strArr).contains(str3) ? 240 : 150)));
                String[] strArr2 = new String[5];
                strArr2[z4 ? 1 : 0] = "name";
                strArr2[z3 ? 1 : 0] = "item";
                strArr2[c6] = "monster";
                strArr2[c5] = "quest";
                strArr2[4] = "id";
                if (SetsKt.setOf((Object[]) strArr2).contains(str3) && !StringsKt.isBlank(value)) {
                    text$default2.setTextColor(this.a.getAccent());
                    this.a.touch(text$default2, new Function0() { // from class: com.lumina.monsterhunterfieldbook.RecordPanel$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit table$lambda$3$0$1;
                            table$lambda$3$0$1 = RecordPanel.table$lambda$3$0$1(RecordPanel.this, value);
                            return table$lambda$3$0$1;
                        }
                    });
                }
                tableRow2.addView(text$default2);
                z2 = z4 ? 1 : 0;
                i = i2;
                c = 4;
            }
            tableLayout.addView(tableRow2);
        }
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this.a);
        horizontalScrollView.addView(tableLayout);
        parent.addView(horizontalScrollView, new LinearLayout.LayoutParams(-1, -2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit table$lambda$3$0$1(RecordPanel recordPanel, String str) {
        MainActivity.openReference$default(recordPanel.a, str, null, 2, null);
        return Unit.INSTANCE;
    }

    private final void mapGroup(final JSONArray maps) {
        addCard(new ReadingGroup(this.a, this.record.getId() + ":maps", "Maps · zoom, floors & layers", this.groups, true, new Function1() { // from class: com.lumina.monsterhunterfieldbook.RecordPanel$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit mapGroup$lambda$0;
                mapGroup$lambda$0 = RecordPanel.mapGroup$lambda$0(RecordPanel.this, maps, (LinearLayout) obj);
                return mapGroup$lambda$0;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapGroup$lambda$0(RecordPanel recordPanel, JSONArray jSONArray, LinearLayout inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        MapPanel mapPanel = new MapPanel(recordPanel.a, jSONArray, recordPanel.record.getId());
        MainActivity mainActivity = recordPanel.a;
        inner.addView(mapPanel, new LinearLayout.LayoutParams(-1, mainActivity.dp(Integer.valueOf(mainActivity.getLandscape() ? 300 : 420))));
        return Unit.INSTANCE;
    }

    private final void loadRelated(final LinearLayout parent, final int offset) {
        final int incrementAndGet = this.generation.incrementAndGet();
        MainActivity mainActivity = this.a;
        final TextView text$default = MainActivity.text$default(mainActivity, "Loading linked records…", 12.0f, false, mainActivity.getMuted(), 4, null);
        parent.addView(text$default);
        this.a.getCatalogue().getExecutor().execute(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.RecordPanel$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                RecordPanel.loadRelated$lambda$0(RecordPanel.this, offset, incrementAndGet, parent, text$default);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void loadRelated$lambda$0(final RecordPanel recordPanel, int i, final int i2, final LinearLayout linearLayout, final TextView textView) {
        int i3;
        Object m79constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            i3 = i;
            try {
                m79constructorimpl = Result.m79constructorimpl(Catalogue.related$default(recordPanel.a.getCatalogue(), recordPanel.record.getId(), i3, 0, 4, null));
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                Result.Companion companion2 = Result.INSTANCE;
                m79constructorimpl = Result.m79constructorimpl(ResultKt.createFailure(th2));
                List emptyList = CollectionsKt.emptyList();
                if (Result.m85isFailureimpl(m79constructorimpl)) {
                }
                final List list = (List) m79constructorimpl;
                final int i4 = i3;
                recordPanel.a.runOnUiThread(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.RecordPanel$$ExternalSyntheticLambda10
                    @Override // java.lang.Runnable
                    public final void run() {
                        RecordPanel.loadRelated$lambda$0$1(RecordPanel.this, i2, linearLayout, textView, list, i4);
                    }
                });
            }
        } catch (Throwable th3) {
            th = th3;
            i3 = i;
        }
        List emptyList2 = CollectionsKt.emptyList();
        if (Result.m85isFailureimpl(m79constructorimpl)) {
            m79constructorimpl = emptyList2;
        }
        final List list2 = (List) m79constructorimpl;
        final int i42 = i3;
        recordPanel.a.runOnUiThread(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.RecordPanel$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                RecordPanel.loadRelated$lambda$0$1(RecordPanel.this, i2, linearLayout, textView, list2, i42);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadRelated$lambda$0$1(final RecordPanel recordPanel, int i, final LinearLayout linearLayout, TextView textView, List list, final int i2) {
        if (recordPanel.isAttachedToWindow() && i == recordPanel.generation.get()) {
            linearLayout.removeView(textView);
            if (list.isEmpty() && i2 == 0) {
                MainActivity mainActivity = recordPanel.a;
                linearLayout.addView(MainActivity.text$default(mainActivity, "No additional linked records are recorded.", 12.0f, false, mainActivity.getMuted(), 4, null));
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linearLayout.addView(MainActivity.recordRow$default(recordPanel.a, (FieldRecord) it.next(), null, 2, null));
                recordPanel.a.rule(linearLayout);
            }
            if (list.size() == 60) {
                final TextView button = recordPanel.a.button("Show more related records", new Function0() { // from class: com.lumina.monsterhunterfieldbook.RecordPanel$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                });
                TextView textView2 = button;
                recordPanel.a.touch(textView2, new Function0() { // from class: com.lumina.monsterhunterfieldbook.RecordPanel$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit loadRelated$lambda$0$1$2;
                        loadRelated$lambda$0$1$2 = RecordPanel.loadRelated$lambda$0$1$2(linearLayout, button, recordPanel, i2);
                        return loadRelated$lambda$0$1$2;
                    }
                });
                linearLayout.addView(textView2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadRelated$lambda$0$1$2(LinearLayout linearLayout, TextView textView, RecordPanel recordPanel, int i) {
        linearLayout.removeView(textView);
        recordPanel.loadRelated(linearLayout, i + 60);
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        if (NativePrefs.flag$default(this.a.getPrefs(), "rememberScroll", false, 2, null)) {
            this.a.getPrefs().set("recordPosition:" + this.record.getId(), Integer.valueOf(this.scroll.getScrollY()));
        }
        this.generation.incrementAndGet();
        super.onDetachedFromWindow();
    }
}
