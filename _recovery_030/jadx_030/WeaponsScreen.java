package com.lumina.monsterhunterfieldbook;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import org.json.JSONObject;

/* compiled from: WeaponsScreen.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0011H\u0002J(\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011H\u0014J\b\u0010\"\u001a\u00020\u001dH\u0002J\b\u0010#\u001a\u00020\u001dH\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0014H\u0002J\u0006\u0010'\u001a\u00020\u0005J\b\u0010(\u001a\u00020\u001dH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00180\u0017j\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0018`\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/WeaponsScreen;", "Landroid/widget/ScrollView;", "a", "Lcom/lumina/monsterhunterfieldbook/MainActivity;", "restored", "Lorg/json/JSONObject;", "<init>", "(Lcom/lumina/monsterhunterfieldbook/MainActivity;Lorg/json/JSONObject;)V", "page", "Landroid/widget/LinearLayout;", "chips", "grid", "token", "Ljava/util/concurrent/atomic/AtomicInteger;", "kind", "", "position", "", "guides", "", "Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "columns", "chipViews", "Ljava/util/LinkedHashMap;", "Landroid/widget/TextView;", "Lkotlin/collections/LinkedHashMap;", "columnCount", "width", "onSizeChanged", "", "w", "h", "oldw", "oldh", "syncChips", "renderCards", "card", "Landroid/view/View;", "record", "snapshot", "onDetachedFromWindow", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WeaponsScreen extends ScrollView {
    private final MainActivity a;
    private final LinkedHashMap<String, TextView> chipViews;
    private final LinearLayout chips;
    private int columns;
    private final LinearLayout grid;
    private List<FieldRecord> guides;
    private String kind;
    private final LinearLayout page;
    private int position;
    private final AtomicInteger token;

    private final int columnCount(int width) {
        if (width > 1150) {
            return 3;
        }
        return width > 480 ? 2 : 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeaponsScreen(MainActivity a, JSONObject jSONObject) {
        super(a);
        String optString;
        Intrinsics.checkNotNullParameter(a, "a");
        this.a = a;
        LinearLayout column = a.column();
        this.page = column;
        this.chips = a.row();
        this.grid = a.column();
        this.token = new AtomicInteger();
        this.kind = (jSONObject == null || (optString = jSONObject.optString("kind", "all")) == null) ? "all" : optString;
        this.position = jSONObject != null ? jSONObject.optInt("scroll", 0) : 0;
        this.guides = CollectionsKt.emptyList();
        this.columns = columnCount(a.getResources().getConfiguration().screenWidthDp);
        this.chipViews = new LinkedHashMap<>();
        setFillViewport(false);
        setHorizontalScrollBarEnabled(false);
        addView(column, new FrameLayout.LayoutParams(-1, -2));
        int coerceIn = RangesKt.coerceIn(MathKt.roundToInt(a.getResources().getConfiguration().screenWidthDp * 0.05f), 16, 52);
        column.setPadding(a.dp(Integer.valueOf(coerceIn)), a.dp(Integer.valueOf(a.getResources().getConfiguration().screenWidthDp <= 780 ? 19 : 30)), a.dp(Integer.valueOf(coerceIn)), a.dp((Number) 28));
        String upperCase = a.getEdition().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        TextView text$default = MainActivity.text$default(a, upperCase + " / WEAPON HANDBOOK", 9.0f, false, a.getAccent(), 4, null);
        text$default.setLetterSpacing(0.14f);
        column.addView(text$default);
        a.gap(column, 9);
        column.addView(MainActivity.text$default(a, "Find your hunting rhythm.", a.getResources().getConfiguration().screenWidthDp <= 780 ? 27.0f : 29.0f, true, 0, 8, null));
        a.gap(column, 8);
        column.addView(MainActivity.text$default(a, "All fourteen weapon types. Learn a reliable loop, understand the tradeoffs, and choose skills that support how you actually hunt.", 13.0f, false, a.getMuted(), 4, null));
        a.gap(column, 18);
        int i = 2;
        for (Pair pair : CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("all", "All 14 weapons"), TuplesKt.to("melee", "Melee"), TuplesKt.to("ranged", "Ranged")})) {
            final String str = (String) pair.component1();
            TextView button = this.a.button((String) pair.component2(), new Function0() { // from class: com.lumina.monsterhunterfieldbook.WeaponsScreen$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WeaponsScreen.lambda$1$0(WeaponsScreen.this, str);
                }
            });
            button.setTextSize((this.a.getPrefs().number("font", 100) * 11.0f) / 100.0f);
            button.setMinHeight(this.a.dp((Number) 40));
            button.setPadding(this.a.dp((Number) 12), this.a.dp((Number) 7), this.a.dp((Number) 12), this.a.dp((Number) 7));
            this.chipViews.put(str, button);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, this.a.dp((Number) 40));
            layoutParams.setMarginEnd(this.a.dp((Number) 7));
            Unit unit = Unit.INSTANCE;
            this.chips.addView(button, layoutParams);
            i = i;
        }
        int i2 = i;
        this.page.addView(this.chips);
        syncChips();
        this.a.gap(this.page, 18);
        LinearLayout column2 = this.a.column();
        MainActivity mainActivity = this.a;
        column2.setBackground(mainActivity.surface(FieldViewsKt.alphaColour(mainActivity.getAccent(), 6), true, 0.0f));
        column2.setPadding(this.a.dp((Number) 16), this.a.dp((Number) 14), this.a.dp((Number) 16), this.a.dp((Number) 14));
        MainActivity mainActivity2 = this.a;
        column2.addView(mainActivity2.textBold(mainActivity2.isIce() ? "Iceborne additions included." : "The World foundation.", 11.0f, this.a.getMuted()));
        MainActivity mainActivity3 = this.a;
        column2.addView(MainActivity.text$default(mainActivity3, mainActivity3.isIce() ? "Each guide separates the World foundation from the expansion’s new moves and example sequences." : "These guides focus on base-game moves. Switch to Iceborne for Clutch Claw integrations and expansion moves.", 11.0f, false, this.a.getMuted(), 4, null));
        FrameLayout frameLayout = new FrameLayout(this.a);
        frameLayout.addView(column2, new FrameLayout.LayoutParams(-1, -2));
        View view = new View(this.a);
        view.setBackgroundColor(this.a.getAccent());
        frameLayout.addView(view, new FrameLayout.LayoutParams(this.a.dp(Integer.valueOf(i2)), -1));
        this.page.addView(frameLayout, new LinearLayout.LayoutParams(-1, -2));
        this.a.gap(this.page, 25);
        this.page.addView(this.grid, new LinearLayout.LayoutParams(-1, -2));
        this.a.gap(this.page, 20);
        LinearLayout linearLayout = this.page;
        MainActivity mainActivity4 = this.a;
        linearLayout.addView(MainActivity.text$default(mainActivity4, "Learning curve describes resource and execution demands, not a damage ranking. Move names are platform-neutral; use the in-game control list for your device.", 10.0f, false, mainActivity4.getMuted(), 4, null));
        if (this.a.getCatalogue().getReady()) {
            final int incrementAndGet = this.token.incrementAndGet();
            this.a.getCatalogue().getExecutor().execute(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.WeaponsScreen$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    WeaponsScreen._init_$lambda$4(WeaponsScreen.this, incrementAndGet);
                }
            });
        } else {
            LinearLayout linearLayout2 = this.grid;
            MainActivity mainActivity5 = this.a;
            linearLayout2.addView(MainActivity.text$default(mainActivity5, "Preparing offline catalogue…", 13.0f, false, mainActivity5.getMuted(), 4, null));
        }
    }

    public /* synthetic */ WeaponsScreen(MainActivity mainActivity, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mainActivity, (i & 2) != 0 ? null : jSONObject);
    }

    static final Unit lambda$1$0(WeaponsScreen weaponsScreen, String str) {
        weaponsScreen.kind = str;
        weaponsScreen.syncChips();
        weaponsScreen.renderCards();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(final WeaponsScreen weaponsScreen, final int i) {
        final List<FieldRecord> records = weaponsScreen.a.getCatalogue().browse(new LibraryFilter("Weapon Guides", null, null, null, null, null, null, "source", 126, null), 0, 20).getRecords();
        weaponsScreen.a.runOnUiThread(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.WeaponsScreen$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                WeaponsScreen.lambda$4$0(i, weaponsScreen, records);
            }
        });
    }

    static final void lambda$4$0(int i, final WeaponsScreen weaponsScreen, List list) {
        if (i == weaponsScreen.token.get()) {
            weaponsScreen.guides = list;
            weaponsScreen.renderCards();
            weaponsScreen.post(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.WeaponsScreen$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    r0.scrollTo(0, WeaponsScreen.this.position);
                }
            });
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        int columnCount = columnCount(MathKt.roundToInt(w / this.a.getResources().getDisplayMetrics().density));
        if (columnCount != this.columns) {
            this.columns = columnCount;
            renderCards();
        }
    }

    private final void syncChips() {
        for (Map.Entry<String, TextView> entry : this.chipViews.entrySet()) {
            final String key = entry.getKey();
            TextView value = entry.getValue();
            value.setTextColor(Intrinsics.areEqual(key, this.kind) ? this.a.getAccent() : this.a.getMuted());
            value.setBackground(this.a.surface(Intrinsics.areEqual(key, this.kind) ? FieldViewsKt.alphaColour(this.a.getAccent(), 18) : 0, true, 2.0f));
            this.a.touch(value, new Function0() { // from class: com.lumina.monsterhunterfieldbook.WeaponsScreen$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit syncChips$lambda$0$0;
                    syncChips$lambda$0$0 = WeaponsScreen.syncChips$lambda$0$0(WeaponsScreen.this, key);
                    return syncChips$lambda$0$0;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncChips$lambda$0$0(WeaponsScreen weaponsScreen, String str) {
        weaponsScreen.kind = str;
        weaponsScreen.syncChips();
        weaponsScreen.renderCards();
        return Unit.INSTANCE;
    }

    private final void renderCards() {
        this.grid.removeAllViews();
        List<FieldRecord> list = this.guides;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            boolean contains = SetsKt.setOf((Object[]) new String[]{"bow", "light-bowgun", "heavy-bowgun"}).contains(((FieldRecord) obj).data().optString("id"));
            if (Intrinsics.areEqual(this.kind, "all") || Intrinsics.areEqual(this.kind, "ranged") == contains) {
                arrayList.add(obj);
            }
        }
        for (List list2 : CollectionsKt.chunked(arrayList, this.columns)) {
            LinearLayout row = this.a.row();
            row.setGravity(48);
            int i = 0;
            for (Object obj2 : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                View card = card((FieldRecord) obj2);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
                if (i > 0) {
                    layoutParams.setMarginStart(this.a.dp((Number) 14));
                }
                Unit unit = Unit.INSTANCE;
                row.addView(card, layoutParams);
                i = i2;
            }
            int size = this.columns - list2.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view = new View(this.a);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, 1, 1.0f);
                layoutParams2.setMarginStart(this.a.dp((Number) 14));
                Unit unit2 = Unit.INSTANCE;
                row.addView(view, layoutParams2);
            }
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.bottomMargin = this.a.dp((Number) 14);
            Unit unit3 = Unit.INSTANCE;
            this.grid.addView(row, layoutParams3);
        }
    }

    private final View card(final FieldRecord record) {
        JSONObject data = record.data();
        final String optString = data.optString("id");
        FrameLayout frameLayout = new FrameLayout(this.a);
        frameLayout.setTag("weapon-card:" + optString);
        frameLayout.setContentDescription("Open " + record.getName());
        frameLayout.setBackground(MainActivity.surface$default(this.a, 0, false, 3.0f, 3, null));
        LinearLayout column = this.a.column();
        MainActivity mainActivity = this.a;
        LinearLayout linearLayout = column;
        mainActivity.pad(linearLayout, Intrinsics.areEqual(mainActivity.getPrefs().text("density", "compact"), "comfortable") ? 22 : 17);
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        LinearLayout row = this.a.row();
        row.setGravity(16);
        FrameLayout frameLayout2 = new FrameLayout(this.a);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(FieldViewsKt.alphaColour(this.a.getAccent(), 10));
        gradientDrawable.setStroke(this.a.dp((Number) 1), FieldViewsKt.alphaColour(this.a.getAccent(), 64));
        frameLayout2.setBackground(gradientDrawable);
        ImageView imageView = new ImageView(this.a);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setContentDescription(record.getName() + " icon");
        boolean z = true;
        frameLayout2.addView(imageView, new FrameLayout.LayoutParams(this.a.dp((Number) 38), this.a.dp((Number) 38), 17));
        this.a.assetImage(record.getImage(), imageView);
        row.addView(frameLayout2, new LinearLayout.LayoutParams(this.a.dp((Number) 53), this.a.dp((Number) 53)));
        LinearLayout column2 = this.a.column();
        int i = 0;
        column2.setPadding(this.a.dp((Number) 13), 0, this.a.dp((Number) 21), 0);
        boolean contains = SetsKt.setOf((Object[]) new String[]{"bow", "light-bowgun", "heavy-bowgun"}).contains(optString);
        MainActivity mainActivity2 = this.a;
        TextView text$default = MainActivity.text$default(mainActivity2, contains ? "RANGED DISCIPLINE" : "MELEE DISCIPLINE", 9.0f, false, mainActivity2.getMuted(), 4, null);
        text$default.setLetterSpacing(0.08f);
        column2.addView(text$default);
        column2.addView(MainActivity.text$default(this.a, record.getName(), 22.0f, true, 0, 8, null));
        row.addView(column2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        column.addView(row);
        this.a.gap(column, 10);
        MainActivity mainActivity3 = this.a;
        String optString2 = data.optString("short");
        Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
        column.addView(MainActivity.text$default(mainActivity3, optString2, 13.0f, false, 0, 12, null));
        this.a.gap(column, 12);
        MainActivity mainActivity4 = this.a;
        WeaponPillFlow weaponPillFlow = new WeaponPillFlow(mainActivity4, mainActivity4.dp((Number) 8));
        String optString3 = data.optString("complexity");
        String optString4 = data.optString("role");
        Intrinsics.checkNotNullExpressionValue(optString4, "optString(...)");
        for (String str : CollectionsKt.listOf((Object[]) new String[]{optString3 + " learning curve", StringsKt.trim((CharSequence) StringsKt.substringBefore$default(optString4, Typography.bullet, (String) null, 2, (Object) null)).toString()})) {
            MainActivity mainActivity5 = this.a;
            TextView text$default2 = MainActivity.text$default(mainActivity5, str, 10.0f, false, mainActivity5.getMuted(), 4, null);
            text$default2.setBackground(this.a.surface(i, z, 2.0f));
            text$default2.setPadding(this.a.dp((Number) 8), this.a.dp((Number) 3), this.a.dp((Number) 8), this.a.dp((Number) 3));
            weaponPillFlow.addView(text$default2, new ViewGroup.LayoutParams(-2, -2));
            i = 0;
            z = true;
        }
        column.addView(weaponPillFlow, new LinearLayout.LayoutParams(-1, -2));
        final FrameLayout frameLayout3 = new FrameLayout(this.a);
        MainActivity mainActivity6 = this.a;
        final GlyphView glyphView = new GlyphView(mainActivity6, "bookmark", mainActivity6.isBookmarked(record.getId()) ? this.a.getAccent() : this.a.getMuted());
        frameLayout3.addView(glyphView, new FrameLayout.LayoutParams(this.a.dp((Number) 17), this.a.dp((Number) 17), 17));
        frameLayout3.setContentDescription("Bookmark " + record.getName());
        frameLayout3.setSelected(this.a.isBookmarked(record.getId()));
        FrameLayout frameLayout4 = frameLayout3;
        this.a.touch(frameLayout4, new Function0() { // from class: com.lumina.monsterhunterfieldbook.WeaponsScreen$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit card$lambda$4;
                card$lambda$4 = WeaponsScreen.card$lambda$4(WeaponsScreen.this, record, frameLayout3, glyphView);
                return card$lambda$4;
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.a.dp((Number) 36), this.a.dp((Number) 36), 8388661);
        layoutParams.topMargin = this.a.dp((Number) 5);
        layoutParams.setMarginEnd(this.a.dp((Number) 4));
        Unit unit = Unit.INSTANCE;
        frameLayout.addView(frameLayout4, layoutParams);
        FrameLayout frameLayout5 = frameLayout;
        this.a.touch(frameLayout5, new Function0() { // from class: com.lumina.monsterhunterfieldbook.WeaponsScreen$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit card$lambda$6;
                card$lambda$6 = WeaponsScreen.card$lambda$6(WeaponsScreen.this, optString);
                return card$lambda$6;
            }
        });
        return frameLayout5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit card$lambda$4(WeaponsScreen weaponsScreen, FieldRecord fieldRecord, FrameLayout frameLayout, GlyphView glyphView) {
        weaponsScreen.a.toggleBookmark(fieldRecord.getId());
        frameLayout.setSelected(weaponsScreen.a.isBookmarked(fieldRecord.getId()));
        boolean isSelected = frameLayout.isSelected();
        MainActivity mainActivity = weaponsScreen.a;
        glyphView.setColour(isSelected ? mainActivity.getAccent() : mainActivity.getMuted());
        glyphView.invalidate();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit card$lambda$6(WeaponsScreen weaponsScreen, String str) {
        MainActivity mainActivity = weaponsScreen.a;
        Intrinsics.checkNotNull(str);
        MainActivity.openWeapon$default(mainActivity, str, null, null, 6, null);
        return Unit.INSTANCE;
    }

    public final JSONObject snapshot() {
        JSONObject put = new JSONObject().put("kind", this.kind).put("scroll", getScrollY());
        Intrinsics.checkNotNullExpressionValue(put, "put(...)");
        return put;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.token.incrementAndGet();
        super.onDetachedFromWindow();
    }
}
