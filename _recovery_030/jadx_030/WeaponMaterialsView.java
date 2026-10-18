package com.lumina.monsterhunterfieldbook;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: WeaponProfilePanel.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0018\u001a\u00020\rH\u0002J\u0018\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/WeaponMaterialsView;", "Landroid/widget/LinearLayout;", "a", "Lcom/lumina/monsterhunterfieldbook/MainActivity;", "record", "Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "state", "Lorg/json/JSONObject;", "compact", "", "onSelect", "Lkotlin/Function1;", "", "", "onInfo", "<init>", "(Lcom/lumina/monsterhunterfieldbook/MainActivity;Lcom/lumina/monsterhunterfieldbook/FieldRecord;Lorg/json/JSONObject;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getRecord", "()Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "getState", "()Lorg/json/JSONObject;", "getCompact", "()Z", "data", "render", "stat", "label", "value", "Landroid/view/View;", "sharpness", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WeaponMaterialsView extends LinearLayout {
    private final MainActivity a;
    private final boolean compact;
    private final JSONObject data;
    private final Function1<String, Unit> onInfo;
    private final Function1<String, Unit> onSelect;
    private final FieldRecord record;
    private final JSONObject state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WeaponMaterialsView(MainActivity a, FieldRecord record, JSONObject state, boolean z, Function1<? super String, Unit> onSelect, Function1<? super String, Unit> onInfo) {
        super(a);
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onSelect, "onSelect");
        Intrinsics.checkNotNullParameter(onInfo, "onInfo");
        this.a = a;
        this.record = record;
        this.state = state;
        this.compact = z;
        this.onSelect = onSelect;
        this.onInfo = onInfo;
        this.data = WeaponModel.INSTANCE.data(record);
        setOrientation(1);
        render();
    }

    public /* synthetic */ WeaponMaterialsView(MainActivity mainActivity, FieldRecord fieldRecord, JSONObject jSONObject, boolean z, Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mainActivity, fieldRecord, jSONObject, (i & 8) != 0 ? false : z, function1, (i & 32) != 0 ? new Function1() { // from class: com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$0;
                _init_$lambda$0 = WeaponMaterialsView._init_$lambda$0((String) obj);
                return _init_$lambda$0;
            }
        } : function12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final boolean getCompact() {
        return this.compact;
    }

    public final FieldRecord getRecord() {
        return this.record;
    }

    public final JSONObject getState() {
        return this.state;
    }

    private final void render() {
        int i;
        char c;
        int i2;
        String str;
        Object obj;
        JSONArray jSONArray;
        String str2;
        Integer num;
        String name;
        int i3;
        ViewGroup weaponElements;
        JSONObject optJSONObject;
        removeAllViews();
        String str3 = "";
        int i4 = 4;
        Integer num2 = 8;
        if (this.compact) {
            i = 4;
            c = 1;
            i2 = 2;
        } else {
            LinearLayout row = this.a.row();
            row.setGravity(48);
            c = 1;
            row.addView(WeaponModel.INSTANCE.icon(this.a, this.record, 36), new LinearLayout.LayoutParams(this.a.dp((Number) 40), this.a.dp((Number) 44)));
            TextView text$default = MainActivity.text$default(this.a, this.record.getName(), this.a.getWide() ? 27.0f : 25.0f, true, 0, 8, null);
            text$default.setPadding(this.a.dp((Number) 12), 0, this.a.dp(num2), 0);
            row.addView(text$default, new LinearLayout.LayoutParams(0, -2, 1.0f));
            final FrameLayout frameLayout = new FrameLayout(this.a);
            MainActivity mainActivity = this.a;
            final GlyphView glyphView = new GlyphView(mainActivity, "bookmark", mainActivity.isBookmarked(this.record.getId()) ? this.a.getAccent() : this.a.getMuted());
            frameLayout.addView(glyphView, new FrameLayout.LayoutParams(this.a.dp((Number) 21), this.a.dp((Number) 21), 17));
            FrameLayout frameLayout2 = frameLayout;
            this.a.touch(frameLayout2, new Function0() { // from class: com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit render$lambda$1;
                    render$lambda$1 = WeaponMaterialsView.render$lambda$1(WeaponMaterialsView.this, frameLayout, glyphView);
                    return render$lambda$1;
                }
            });
            render$sync(this, frameLayout, glyphView);
            row.addView(frameLayout2, new LinearLayout.LayoutParams(this.a.dp((Number) 40), this.a.dp((Number) 40)));
            addView(row);
            this.a.gap(this, 24);
            GridLayout gridLayout = new GridLayout(this.a);
            gridLayout.setColumnCount(this.a.getResources().getConfiguration().screenWidthDp >= 650 ? 4 : 2);
            Pair[] pairArr = new Pair[4];
            pairArr[0] = TuplesKt.to("Attack", WeaponModel.INSTANCE.shown(this.data.opt("attack")));
            pairArr[1] = TuplesKt.to("Affinity", WeaponModel.INSTANCE.shown(this.data.opt("affinity")) + "%");
            pairArr[2] = TuplesKt.to("Rarity", WeaponModel.INSTANCE.shown(this.data.opt("rarity")));
            WeaponModel weaponModel = WeaponModel.INSTANCE;
            Object opt = this.data.opt("defense");
            if (opt == null) {
                opt = 0;
            }
            pairArr[3] = TuplesKt.to("Defense", weaponModel.shown(opt));
            Iterator it = CollectionsKt.listOf((Object[]) pairArr).iterator();
            int i5 = 0;
            while (true) {
                i3 = 22;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Pair pair = (Pair) next;
                LinearLayout stat = stat((String) pair.component1(), MainActivity.text$default(this.a, (String) pair.component2(), 15.0f, false, 0, 12, null));
                GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
                layoutParams.width = 0;
                int i7 = i4;
                layoutParams.columnSpec = GridLayout.spec(i5 % gridLayout.getColumnCount(), 1.0f);
                layoutParams.rowSpec = GridLayout.spec(i5 / gridLayout.getColumnCount());
                layoutParams.setMargins(0, 0, this.a.dp((Number) 18), this.a.dp((Number) 22));
                Unit unit = Unit.INSTANCE;
                gridLayout.addView(stat, layoutParams);
                i5 = i6;
                i4 = i7;
            }
            i = i4;
            addView(gridLayout, new LinearLayout.LayoutParams(-1, -2));
            MainActivity mainActivity2 = this.a;
            weaponElements = WeaponProfilePanelKt.weaponElements(mainActivity2, this.record, 15.0f, mainActivity2.getInk());
            LinearLayout stat2 = stat("Element / status", weaponElements);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.bottomMargin = this.a.dp((Number) 22);
            Unit unit2 = Unit.INSTANCE;
            addView(stat2, layoutParams2);
            List<Integer> slots = WeaponModel.INSTANCE.slots(this.record);
            LinearLayout row2 = this.a.row();
            row2.setGravity(48);
            if (slots.isEmpty()) {
                MainActivity mainActivity3 = this.a;
                row2.addView(MainActivity.text$default(mainActivity3, "None", 15.0f, false, mainActivity3.getMuted(), 4, null));
            } else {
                Iterator<T> it2 = slots.iterator();
                while (it2.hasNext()) {
                    final int intValue = ((Number) it2.next()).intValue();
                    LinearLayout row3 = this.a.row();
                    int i8 = i3;
                    row3.setPadding(this.a.dp((Number) 6), this.a.dp((Number) 5), this.a.dp(num2), this.a.dp((Number) 5));
                    row3.setMinimumHeight(this.a.dp((Number) 40));
                    row3.setBackground(MainActivity.surface$default(this.a, 0, false, 0.0f, 6, null));
                    JSONObject optJSONObject2 = this.a.getLibraryData().optJSONObject("nativeVisuals");
                    String optString = (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("slots")) == null) ? null : optJSONObject.optString(String.valueOf(intValue));
                    if (optString == null) {
                        optString = "";
                    }
                    if (!StringsKt.isBlank(optString)) {
                        ImageView imageView = new ImageView(this.a);
                        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        row3.addView(imageView, new LinearLayout.LayoutParams(this.a.dp((Number) 20), this.a.dp(Integer.valueOf(i8))));
                        this.a.assetImage(optString, imageView);
                    }
                    TextView text$default2 = MainActivity.text$default(this.a, "Lv " + intValue, 12.0f, false, 0, 12, null);
                    text$default2.setPadding(this.a.dp((Number) 5), 0, 0, 0);
                    row3.addView(text$default2);
                    row3.setContentDescription("Find decorations fitting slot level " + intValue);
                    LinearLayout linearLayout = row3;
                    this.a.touch(linearLayout, new Function0() { // from class: com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit render$lambda$4$2;
                            render$lambda$4$2 = WeaponMaterialsView.render$lambda$4$2(WeaponMaterialsView.this, intValue);
                            return render$lambda$4$2;
                        }
                    });
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams3.rightMargin = this.a.dp((Number) 7);
                    Unit unit3 = Unit.INSTANCE;
                    row2.addView(linearLayout, layoutParams3);
                    i3 = i8;
                }
            }
            int i9 = i3;
            LinearLayout stat3 = stat("Slots", row2);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams4.bottomMargin = this.a.dp(Integer.valueOf(i9));
            Unit unit4 = Unit.INSTANCE;
            addView(stat3, layoutParams4);
            View sharpness = sharpness();
            if (sharpness != null) {
                LinearLayout stat4 = stat("Sharpness", sharpness);
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams5.bottomMargin = this.a.dp(Integer.valueOf(i9));
                Unit unit5 = Unit.INSTANCE;
                addView(stat4, layoutParams5);
                Unit unit6 = Unit.INSTANCE;
                Unit unit7 = Unit.INSTANCE;
            }
            JSONObject optJSONObject3 = this.data.optJSONObject("attributes");
            if (optJSONObject3 != null) {
                Iterator<String> keys = optJSONObject3.keys();
                Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
                while (keys.hasNext()) {
                    String next2 = keys.next();
                    Object opt2 = optJSONObject3.opt(next2);
                    if (opt2 != null && opt2 != JSONObject.NULL && !Intrinsics.areEqual(opt2, "") && !Intrinsics.areEqual(opt2, (Object) false)) {
                        Intrinsics.checkNotNull(next2);
                        LinearLayout stat5 = stat(new Regex("([A-Z])").replace(next2, " $1"), MainActivity.text$default(this.a, opt2.toString(), 15.0f, false, 0, 12, null));
                        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams6.bottomMargin = this.a.dp(Integer.valueOf(i9));
                        Unit unit8 = Unit.INSTANCE;
                        addView(stat5, layoutParams6);
                    }
                }
                Unit unit9 = Unit.INSTANCE;
                Unit unit10 = Unit.INSTANCE;
            }
            i2 = 2;
        }
        String[] strArr = new String[i2];
        strArr[0] = "forge";
        strArr[c] = "upgrade";
        List listOf = CollectionsKt.listOf((Object[]) strArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listOf) {
            if (this.data.optJSONObject((String) obj2) != null) {
                arrayList.add(obj2);
            }
        }
        ArrayList<String> arrayList2 = arrayList;
        int i10 = 16;
        if (!arrayList2.isEmpty()) {
            if (!arrayList2.contains(this.state.optString("path"))) {
                this.state.put("path", arrayList2.contains("upgrade") ? "upgrade" : "forge");
            }
            LinearLayout row4 = this.a.row();
            row4.setContentDescription("Crafting path");
            for (final String str4 : arrayList2) {
                boolean areEqual = Intrinsics.areEqual(this.state.optString("path"), str4);
                TextView button = this.a.button(Intrinsics.areEqual(str4, "forge") ? "Forge" : "Upgrade", new Function0() { // from class: com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit render$lambda$9$0;
                        render$lambda$9$0 = WeaponMaterialsView.render$lambda$9$0(WeaponMaterialsView.this, str4);
                        return render$lambda$9$0;
                    }
                });
                MainActivity mainActivity4 = this.a;
                button.setBackground(MainActivity.surface$default(mainActivity4, areEqual ? FieldViewsKt.alphaColour(mainActivity4.getAccent(), 24) : 0, false, 0.0f, 6, null));
                MainActivity mainActivity5 = this.a;
                button.setTextColor(areEqual ? mainActivity5.getAccent() : mainActivity5.getMuted());
                button.setSelected(areEqual);
                LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, this.a.dp((Number) 44), 1.0f);
                layoutParams7.rightMargin = this.a.dp((Number) 7);
                Unit unit11 = Unit.INSTANCE;
                row4.addView(button, layoutParams7);
            }
            addView(row4);
            WeaponMaterialsView weaponMaterialsView = this;
            this.a.gap(weaponMaterialsView, 16);
            String optString2 = this.state.optString("path");
            JSONObject jSONObject = this.data.getJSONObject(optString2);
            if (!this.compact && Intrinsics.areEqual(optString2, "upgrade") && !StringsKt.isBlank(WeaponModel.INSTANCE.parent(this.record))) {
                final String parent = WeaponModel.INSTANCE.parent(this.record);
                LinearLayout row5 = this.a.row();
                MainActivity mainActivity6 = this.a;
                row5.addView(MainActivity.text$default(mainActivity6, "From ", 12.0f, false, mainActivity6.getMuted(), 4, null));
                MainActivity mainActivity7 = this.a;
                FieldRecord record = WeaponModel.INSTANCE.record(parent);
                TextView text$default3 = MainActivity.text$default(mainActivity7, (record == null || (name = record.getName()) == null) ? parent : name, 12.0f, false, this.a.getAccent(), 4, null);
                this.a.touch(text$default3, new Function0() { // from class: com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit render$lambda$10;
                        render$lambda$10 = WeaponMaterialsView.render$lambda$10(WeaponMaterialsView.this, parent);
                        return render$lambda$10;
                    }
                });
                row5.addView(text$default3, new LinearLayout.LayoutParams(0, -2, 1.0f));
                addView(row5);
                this.a.gap(weaponMaterialsView, 16);
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("materials");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                MainActivity mainActivity8 = this.a;
                addView(MainActivity.text$default(mainActivity8, "—", 15.0f, false, mainActivity8.getMuted(), 4, null));
            } else {
                int length = optJSONArray.length();
                int i11 = 0;
                while (i11 < length) {
                    final JSONObject optJSONObject4 = optJSONArray.optJSONObject(i11);
                    if (optJSONObject4 == null) {
                        jSONArray = optJSONArray;
                        str2 = str3;
                        num = num2;
                    } else {
                        final String optString3 = optJSONObject4.optString("name");
                        LinearLayout row6 = this.a.row();
                        row6.setGravity(i10);
                        row6.setPadding(0, this.a.dp((Number) 7), 0, this.a.dp((Number) 7));
                        final ImageView imageView2 = new ImageView(this.a);
                        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        imageView2.setImportantForAccessibility(2);
                        jSONArray = optJSONArray;
                        str2 = str3;
                        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(this.a.dp((Number) 24), this.a.dp((Number) 24));
                        layoutParams8.rightMargin = this.a.dp(num2);
                        Unit unit12 = Unit.INSTANCE;
                        row6.addView(imageView2, layoutParams8);
                        MainActivity mainActivity9 = this.a;
                        Intrinsics.checkNotNull(optString3);
                        num = num2;
                        row6.addView(MainActivity.text$default(mainActivity9, optString3, this.compact ? 14.0f : 15.0f, false, this.a.getAccent(), 4, null), new LinearLayout.LayoutParams(0, -2, 1.0f));
                        if (optJSONObject4.has("quantity")) {
                            row6.addView(MainActivity.text$default(this.a, " ×" + WeaponModel.INSTANCE.shown(optJSONObject4.opt("quantity")), this.compact ? 14.0f : 15.0f, false, 0, 12, null));
                        }
                        row6.setContentDescription(optString3 + (optJSONObject4.has("quantity") ? ", quantity " + WeaponModel.INSTANCE.shown(optJSONObject4.opt("quantity")) : str2));
                        LinearLayout linearLayout2 = row6;
                        this.a.touch(linearLayout2, new Function0() { // from class: com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit render$lambda$13;
                                render$lambda$13 = WeaponMaterialsView.render$lambda$13(WeaponMaterialsView.this, optString3, optJSONObject4);
                                return render$lambda$13;
                            }
                        });
                        addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
                        this.a.getCatalogue().getExecutor().execute(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda8
                            @Override // java.lang.Runnable
                            public final void run() {
                                WeaponMaterialsView.render$lambda$14(WeaponMaterialsView.this, optString3, imageView2);
                            }
                        });
                        if (optJSONObject4.has("points")) {
                            TextView text$default4 = MainActivity.text$default(this.a, WeaponModel.INSTANCE.shown(optJSONObject4.opt("points")) + " pts each", 10.0f, false, this.a.getMuted(), 4, null);
                            text$default4.setPadding(this.a.dp((Number) 32), 0, 0, this.a.dp(Integer.valueOf(i)));
                            addView(text$default4);
                        }
                    }
                    i11++;
                    optJSONArray = jSONArray;
                    num2 = num;
                    str3 = str2;
                    i10 = 16;
                }
            }
            this.a.gap(weaponMaterialsView, 14);
            addView(MainActivity.text$default(this.a, (!jSONObject.has("zenny") || jSONObject.isNull("zenny")) ? "Price not supplied" : WeaponModel.INSTANCE.number(jSONObject.opt("zenny")) + " z", this.compact ? 16.0f : 15.0f, false, this.a.getMuted(), 4, null));
        } else {
            final Object opt3 = this.data.opt("obtain");
            if (opt3 instanceof JSONArray) {
                str = CollectionsKt.joinToString$default(RangesKt.until(0, ((JSONArray) opt3).length()), "\n", null, null, 0, null, new Function1() { // from class: com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        CharSequence render$lambda$17;
                        render$lambda$17 = WeaponMaterialsView.render$lambda$17(opt3, ((Integer) obj3).intValue());
                        return render$lambda$17;
                    }
                }, 30, null);
            } else {
                if (opt3 instanceof JSONObject) {
                    String render$description = render$description(opt3);
                    boolean isBlank = StringsKt.isBlank(render$description);
                    obj = render$description;
                    if (isBlank) {
                        obj = "Quest or appraisal reward";
                    }
                } else {
                    boolean z = opt3 instanceof String;
                    obj = opt3;
                    if (!z) {
                        str = "Quest or appraisal reward";
                    }
                }
                str = (String) obj;
            }
            TextView text$default5 = MainActivity.text$default(this.a, str, this.compact ? 14.0f : 15.0f, false, 0, 12, null);
            if (!this.compact) {
                text$default5.setBackground(MainActivity.surface$default(this.a, 0, false, 0.0f, 7, null));
                this.a.pad(text$default5, 16);
            }
            addView(text$default5);
        }
        if (this.compact) {
            this.a.gap(this, 12);
            LinearLayout row7 = this.a.row();
            row7.setGravity(8388613);
            row7.addView(this.a.button("Info", new Function0() { // from class: com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit render$lambda$20;
                    render$lambda$20 = WeaponMaterialsView.render$lambda$20(WeaponMaterialsView.this);
                    return render$lambda$20;
                }
            }), new LinearLayout.LayoutParams(this.a.dp((Number) 88), this.a.dp((Number) 42)));
            addView(row7);
        }
    }

    private static final void render$sync(WeaponMaterialsView weaponMaterialsView, FrameLayout frameLayout, GlyphView glyphView) {
        boolean isBookmarked = weaponMaterialsView.a.isBookmarked(weaponMaterialsView.record.getId());
        frameLayout.setContentDescription(isBookmarked ? "Remove saved entry" : "Save entry");
        MainActivity mainActivity = weaponMaterialsView.a;
        glyphView.setColour(isBookmarked ? mainActivity.getAccent() : mainActivity.getMuted());
        glyphView.invalidate();
        frameLayout.setSelected(isBookmarked);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$1(WeaponMaterialsView weaponMaterialsView, FrameLayout frameLayout, GlyphView glyphView) {
        weaponMaterialsView.a.toggleBookmark(weaponMaterialsView.record.getId());
        render$sync(weaponMaterialsView, frameLayout, glyphView);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$4$2(WeaponMaterialsView weaponMaterialsView, int i) {
        weaponMaterialsView.a.showCompatibleDecorations(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$9$0(WeaponMaterialsView weaponMaterialsView, String str) {
        weaponMaterialsView.state.put("path", str);
        weaponMaterialsView.render();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$10(WeaponMaterialsView weaponMaterialsView, String str) {
        weaponMaterialsView.onSelect.invoke(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$13(WeaponMaterialsView weaponMaterialsView, String str, JSONObject jSONObject) {
        MainActivity mainActivity = weaponMaterialsView.a;
        Intrinsics.checkNotNull(str);
        String optString = jSONObject.optString("id");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        mainActivity.showWeaponItem(str, optString);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$14(final WeaponMaterialsView weaponMaterialsView, String str, final ImageView imageView) {
        Object m79constructorimpl;
        Object obj;
        try {
            Result.Companion companion = Result.INSTANCE;
            Catalogue catalogue = weaponMaterialsView.a.getCatalogue();
            Intrinsics.checkNotNull(str);
            Iterator<T> it = catalogue.reference(str, "Items").iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (StringsKt.equals(((FieldRecord) obj).getName(), str, true)) {
                        break;
                    }
                }
            }
            m79constructorimpl = Result.m79constructorimpl((FieldRecord) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m79constructorimpl = Result.m79constructorimpl(ResultKt.createFailure(th));
        }
        final FieldRecord fieldRecord = (FieldRecord) (Result.m85isFailureimpl(m79constructorimpl) ? null : m79constructorimpl);
        weaponMaterialsView.a.runOnUiThread(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                WeaponMaterialsView.render$lambda$14$1(WeaponMaterialsView.this, fieldRecord, imageView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$14$1(WeaponMaterialsView weaponMaterialsView, FieldRecord fieldRecord, ImageView imageView) {
        String image;
        if (weaponMaterialsView.a.isDestroyed() || weaponMaterialsView.a.isFinishing() || !weaponMaterialsView.isAttachedToWindow() || fieldRecord == null || (image = fieldRecord.getImage()) == null || !(!StringsKt.isBlank(image))) {
            return;
        }
        weaponMaterialsView.a.assetImage(fieldRecord.getImage(), imageView);
    }

    private static final String render$description(Object obj) {
        if (!(obj instanceof JSONObject)) {
            return obj instanceof String ? (String) obj : "";
        }
        JSONObject jSONObject = (JSONObject) obj;
        String optString = jSONObject.optString("description");
        if (StringsKt.isBlank(optString)) {
            String optString2 = jSONObject.optString("method");
            if (StringsKt.isBlank(optString2)) {
                optString2 = jSONObject.optString("name");
            }
            optString = optString2;
        }
        Intrinsics.checkNotNullExpressionValue(optString, "ifBlank(...)");
        return optString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence render$lambda$17(Object obj, int i) {
        return render$description(((JSONArray) obj).opt(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$20(WeaponMaterialsView weaponMaterialsView) {
        Function1<String, Unit> function1 = weaponMaterialsView.onInfo;
        String rawId = WeaponModel.INSTANCE.rawId(weaponMaterialsView.record);
        Intrinsics.checkNotNullExpressionValue(rawId, "rawId(...)");
        function1.invoke(rawId);
        return Unit.INSTANCE;
    }

    private final LinearLayout stat(String label, View value) {
        LinearLayout column = this.a.column();
        MainActivity mainActivity = this.a;
        column.addView(MainActivity.text$default(mainActivity, label, 12.0f, false, mainActivity.getMuted(), 4, null));
        this.a.gap(column, 7);
        ViewGroup.LayoutParams layoutParams = value.getLayoutParams();
        column.addView(value, new LinearLayout.LayoutParams(-1, layoutParams != null ? layoutParams.height : -2));
        return column;
    }

    private final View sharpness() {
        ArrayList list;
        final Object opt = this.data.opt("sharpness");
        if (opt == null) {
            return null;
        }
        if (!(opt instanceof JSONArray)) {
            if (!(opt instanceof JSONObject)) {
                return null;
            }
            Iterator<String> keys = ((JSONObject) opt).keys();
            Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
            list = SequencesKt.toList(SequencesKt.map(SequencesKt.asSequence(keys), new Function1() { // from class: com.lumina.monsterhunterfieldbook.WeaponMaterialsView$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Object sharpness$lambda$1;
                    sharpness$lambda$1 = WeaponMaterialsView.sharpness$lambda$1(opt, (String) obj);
                    return sharpness$lambda$1;
                }
            }));
        } else {
            JSONArray jSONArray = (JSONArray) opt;
            IntRange until = RangesKt.until(0, jSONArray.length());
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                arrayList.add(jSONArray.opt(((IntIterator) it).nextInt()));
            }
            list = arrayList;
        }
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (!(it2.next() instanceof Number)) {
                    return null;
                }
            }
        }
        MainActivity mainActivity = this.a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (Object obj : list2) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Number");
            arrayList2.add(Float.valueOf(((Number) obj).floatValue()));
        }
        WeaponSharpnessView weaponSharpnessView = new WeaponSharpnessView(mainActivity, arrayList2);
        weaponSharpnessView.setLayoutParams(new LinearLayout.LayoutParams(-1, this.a.dp((Number) 12)));
        weaponSharpnessView.setContentDescription("Sharpness: " + CollectionsKt.joinToString$default(list2, " / ", null, null, 0, null, null, 62, null));
        return weaponSharpnessView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object sharpness$lambda$1(Object obj, String str) {
        return ((JSONObject) obj).opt(str);
    }
}
