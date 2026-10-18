package com.lumina.monsterhunterfieldbook;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: SettingsPanel.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 82\u00020\u0001:\u00018B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0018\u001a\u00020\u0019J\"\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u001dH\u0002J,\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00072\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00190\"H\u0002J\u0018\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0007H\u0002J*\u0010&\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\b\b\u0002\u0010'\u001a\u00020\u001dH\u0002JB\u0010(\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010'\u001a\u00020*2\b\b\u0002\u0010,\u001a\u00020\u0007H\u0002JB\u0010-\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\u0018\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070/0\u00132\u0006\u0010'\u001a\u00020\u0007H\u0002J\u0010\u00100\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0005H\u0002J \u00101\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\u0006\u00102\u001a\u00020*H\u0002J\u0010\u00103\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0005H\u0002J\u0010\u00104\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0005H\u0002J\u0010\u00105\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0005H\u0002J\u0010\u00106\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0005H\u0002J\u0010\u00107\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0005H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u00069"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/SettingsPanel;", "", "a", "Lcom/lumina/monsterhunterfieldbook/MainActivity;", "host", "Landroid/widget/LinearLayout;", "category", "", "<init>", "(Lcom/lumina/monsterhunterfieldbook/MainActivity;Landroid/widget/LinearLayout;Ljava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "opened", "", "scroll", "Landroid/widget/ScrollView;", "categories", "", "p", "Lcom/lumina/monsterhunterfieldbook/NativePrefs;", "getP", "()Lcom/lumina/monsterhunterfieldbook/NativePrefs;", "rebuild", "", "changed", "key", "value", "", "group", "parent", "title", "content", "Lkotlin/Function1;", "help", "body", "label", "toggle", "default", "range", "min", "", "max", "suffix", "choice", "choices", "Lkotlin/Pair;", "appearance", "pickColour", "initial", "motion", "browsing", "music", "about", "addLegend", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SettingsPanel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final LinkedHashMap<String, int[]> palettes = MapsKt.linkedMapOf(TuplesKt.to("forest", new int[]{Color.rgb(13, 21, 18), Color.rgb(217, 183, 122), Color.rgb(238, 233, 220)}), TuplesKt.to("frost", new int[]{Color.rgb(12, 20, 34), Color.rgb(159, 212, 237), Color.rgb(231, 239, 243)}), TuplesKt.to("obsidian", new int[]{Color.rgb(14, 14, 17), Color.rgb(190, 175, 220), Color.rgb(235, 231, 245)}), TuplesKt.to("ember", new int[]{Color.rgb(34, 20, 18), Color.rgb(237, 155, 109), Color.rgb(250, 233, 220)}), TuplesKt.to("ocean", new int[]{Color.rgb(10, 27, 34), Color.rgb(101, 210, 217), Color.rgb(224, 243, 245)}), TuplesKt.to("royal", new int[]{Color.rgb(28, 18, 43), Color.rgb(196, 155, 232), Color.rgb(241, 230, 248)}), TuplesKt.to("moss", new int[]{Color.rgb(23, 32, 20), Color.rgb(173, 204, 125), Color.rgb(235, 241, 218)}), TuplesKt.to("copper", new int[]{Color.rgb(36, 25, 20), Color.rgb(220, 169, 117), Color.rgb(242, 229, 215)}), TuplesKt.to("sakura", new int[]{Color.rgb(39, 24, 32), Color.rgb(240, 168, 192), Color.rgb(250, 231, 238)}), TuplesKt.to("storm", new int[]{Color.rgb(24, 29, 38), Color.rgb(168, 190, 219), Color.rgb(232, 237, 246)}), TuplesKt.to("rose", new int[]{Color.rgb(36, 28, 38), Color.rgb(235, 184, 213), Color.rgb(246, 232, 242)}), TuplesKt.to("parchment", new int[]{Color.rgb(238, 230, 213), Color.rgb(110, 80, 42), Color.rgb(40, 46, 37)}), TuplesKt.to("snow", new int[]{Color.rgb(233, 240, 245), Color.rgb(38, 87, 119), Color.rgb(19, 43, 58)}));
    private static final Set<String> visualKeys = SetsKt.setOf((Object[]) new String[]{"font", "lineSpacing", "letterSpacing", "wordSpacing", "density", "iconSize", "theme", "customBg", "customAccent", "customInk", "gradients", "gradientStrength", "gradientAngle", "animations", "speed", "transition", "touch", "glow", "particles", "blur", "imageMotion", "performance"});
    private final MainActivity a;
    private final List<String> categories;
    private String category;
    private final LinearLayout host;
    private final Set<String> opened;
    private ScrollView scroll;

    public SettingsPanel(MainActivity a, LinearLayout host, String category) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(category, "category");
        this.a = a;
        this.host = host;
        this.category = category;
        this.opened = new LinkedHashSet();
        this.categories = CollectionsKt.listOf((Object[]) new String[]{"Appearance", "Motion & effects", "Browsing", "Music", "About & reset"});
    }

    public /* synthetic */ SettingsPanel(MainActivity mainActivity, LinearLayout linearLayout, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mainActivity, linearLayout, (i & 4) != 0 ? "Appearance" : str);
    }

    public final String getCategory() {
        return this.category;
    }

    public final void setCategory(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.category = str;
    }

    /* compiled from: SettingsPanel.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R-\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/SettingsPanel$Companion;", "", "<init>", "()V", "palettes", "Ljava/util/LinkedHashMap;", "", "", "Lkotlin/collections/LinkedHashMap;", "getPalettes", "()Ljava/util/LinkedHashMap;", "visualKeys", "", "getVisualKeys", "()Ljava/util/Set;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LinkedHashMap<String, int[]> getPalettes() {
            return SettingsPanel.palettes;
        }

        public final Set<String> getVisualKeys() {
            return SettingsPanel.visualKeys;
        }
    }

    private final NativePrefs getP() {
        return this.a.getPrefs();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void rebuild() {
        LinearLayout linearLayout;
        ScrollView scrollView;
        LinearLayout.LayoutParams layoutParams;
        ScrollView scrollView2 = this.scroll;
        final int scrollY = scrollView2 != null ? scrollView2.getScrollY() : 0;
        this.host.removeAllViews();
        this.host.setBackgroundColor(this.a.getPanel());
        this.host.addView(this.a.settingsHeading("Settings"));
        this.a.rule(this.host);
        boolean z = Intrinsics.areEqual(getP().text("settingsLayout", "center"), "split") && this.a.getWide();
        LinearLayout row = this.a.row();
        row.setGravity(48);
        MainActivity mainActivity = this.a;
        LinearLayout column = z ? mainActivity.column() : mainActivity.row();
        MainActivity mainActivity2 = this.a;
        if (z) {
            mainActivity2.pad(column, 10);
        } else {
            column.setPadding(mainActivity2.dp((Number) 10), 0, this.a.dp((Number) 10), 0);
        }
        Iterator<T> it = this.categories.iterator();
        while (true) {
            int i = -1;
            if (!it.hasNext()) {
                break;
            }
            final String str = (String) it.next();
            TextView button = this.a.button(str, new Function0() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit rebuild$lambda$0$0;
                    rebuild$lambda$0$0 = SettingsPanel.rebuild$lambda$0$0(SettingsPanel.this, str);
                    return rebuild$lambda$0$0;
                }
            });
            button.setTextColor(Intrinsics.areEqual(str, this.category) ? this.a.getAccent() : this.a.getMuted());
            TextView textView = button;
            if (!z) {
                i = -2;
            }
            column.addView(textView, new LinearLayout.LayoutParams(i, this.a.dp((Number) 46)));
        }
        if (z) {
            row.addView(column, new LinearLayout.LayoutParams(this.a.dp((Number) 210), -1));
        } else {
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this.a);
            horizontalScrollView.setHorizontalScrollBarEnabled(false);
            horizontalScrollView.addView(column);
            this.host.addView(horizontalScrollView);
            this.a.rule(this.host);
        }
        this.scroll = new ScrollView(this.a);
        LinearLayout column2 = this.a.column();
        LinearLayout linearLayout2 = column2;
        this.a.pad(linearLayout2, 16);
        ScrollView scrollView3 = this.scroll;
        Intrinsics.checkNotNull(scrollView3);
        scrollView3.addView(linearLayout2);
        String str2 = this.category;
        switch (str2.hashCode()) {
            case -504784764:
                if (str2.equals("Appearance")) {
                    appearance(column2);
                    break;
                }
                about(column2);
                break;
            case 74710533:
                if (str2.equals("Music")) {
                    music(column2);
                    break;
                }
                about(column2);
                break;
            case 448834791:
                if (str2.equals("Browsing")) {
                    browsing(column2);
                    break;
                }
                about(column2);
                break;
            case 1706560318:
                if (str2.equals("Motion & effects")) {
                    motion(column2);
                    break;
                }
                about(column2);
                break;
            default:
                about(column2);
                break;
        }
        if (z) {
            row.addView(this.scroll, new LinearLayout.LayoutParams(0, -1, 1.0f));
            linearLayout = this.host;
            scrollView = row;
            layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
        } else {
            linearLayout = this.host;
            scrollView = this.scroll;
            layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
        }
        linearLayout.addView(scrollView, layoutParams);
        ScrollView scrollView4 = this.scroll;
        Intrinsics.checkNotNull(scrollView4);
        scrollView4.post(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda22
            @Override // java.lang.Runnable
            public final void run() {
                SettingsPanel.rebuild$lambda$1(SettingsPanel.this, scrollY);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rebuild$lambda$0$0(SettingsPanel settingsPanel, String str) {
        settingsPanel.category = str;
        settingsPanel.scroll = null;
        settingsPanel.rebuild();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rebuild$lambda$1(SettingsPanel settingsPanel, int i) {
        ScrollView scrollView = settingsPanel.scroll;
        if (scrollView != null) {
            scrollView.scrollTo(0, i);
        }
    }

    private final void changed(String key, Object value, boolean rebuild) {
        getP().set(key, value);
        this.a.afterPreference(key);
        if (rebuild) {
            rebuild();
        }
    }

    static /* synthetic */ void changed$default(SettingsPanel settingsPanel, String str, Object obj, boolean z, int i, Object obj2) {
        if ((i & 4) != 0) {
            z = false;
        }
        settingsPanel.changed(str, obj, z);
    }

    private final void group(LinearLayout parent, final String title, Function1<? super LinearLayout, Unit> content) {
        LinearLayout column = this.a.column();
        column.setBackground(MainActivity.surface$default(this.a, 0, false, 0.0f, 7, null));
        final LinearLayout row = this.a.row();
        row.setPadding(this.a.dp((Number) 13), this.a.dp((Number) 8), this.a.dp((Number) 13), this.a.dp((Number) 8));
        row.setMinimumHeight(this.a.dp((Number) 50));
        MainActivity mainActivity = this.a;
        final GlyphView glyphView = new GlyphView(mainActivity, "triangle", mainActivity.getInk());
        row.addView(glyphView, new LinearLayout.LayoutParams(this.a.dp((Number) 16), this.a.dp((Number) 16)));
        TextView text$default = MainActivity.text$default(this.a, title, 16.0f, false, 0, 12, null);
        text$default.setPadding(this.a.dp((Number) 13), 0, 0, 0);
        row.addView(text$default, new LinearLayout.LayoutParams(0, -2, 1.0f));
        LinearLayout linearLayout = row;
        column.addView(linearLayout);
        final LinearLayout column2 = this.a.column();
        column2.setPadding(this.a.dp((Number) 15), this.a.dp((Number) 4), this.a.dp((Number) 15), this.a.dp((Number) 16));
        content.invoke(column2);
        column2.setVisibility(this.opened.contains(title) ? 0 : 8);
        glyphView.setRotation(this.opened.contains(title) ? 90.0f : 0.0f);
        column.addView(column2);
        this.a.touch(linearLayout, new Function0() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit group$lambda$1;
                group$lambda$1 = SettingsPanel.group$lambda$1(column2, this, title, glyphView, row);
                return group$lambda$1;
            }
        });
        row.setContentDescription(title + ", " + (this.opened.contains(title) ? "expanded" : "collapsed"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = this.a.dp((Number) 12);
        Unit unit = Unit.INSTANCE;
        parent.addView(column, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit group$lambda$1(LinearLayout linearLayout, SettingsPanel settingsPanel, String str, GlyphView glyphView, LinearLayout linearLayout2) {
        boolean z = linearLayout.getVisibility() == 8;
        if (z) {
            settingsPanel.opened.add(str);
            linearLayout.setVisibility(0);
            linearLayout.setAlpha(0.0f);
            linearLayout.animate().alpha(1.0f).setDuration(settingsPanel.a.motionDuration(210L)).start();
        } else {
            settingsPanel.opened.remove(str);
            linearLayout.setVisibility(8);
        }
        glyphView.animate().rotation(z ? 90.0f : 0.0f).setDuration(settingsPanel.a.motionDuration(250L)).start();
        linearLayout2.setContentDescription(str + ", " + (z ? "expanded" : "collapsed"));
        return Unit.INSTANCE;
    }

    private final void help(LinearLayout body, String label) {
        MainActivity mainActivity = this.a;
        TextView text$default = MainActivity.text$default(mainActivity, label, 12.0f, false, mainActivity.getMuted(), 4, null);
        text$default.setPadding(0, this.a.dp((Number) 6), 0, this.a.dp((Number) 9));
        body.addView(text$default);
    }

    static /* synthetic */ void toggle$default(SettingsPanel settingsPanel, LinearLayout linearLayout, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        settingsPanel.toggle(linearLayout, str, str2, z);
    }

    private final void toggle(LinearLayout body, final String key, String label, boolean r13) {
        LinearLayout row = this.a.row();
        row.setMinimumHeight(this.a.dp((Number) 46));
        row.addView(MainActivity.text$default(this.a, label, 13.0f, false, 0, 12, null), new LinearLayout.LayoutParams(0, -2, 1.0f));
        Switch r12 = new Switch(this.a);
        r12.setContentDescription(label);
        r12.setChecked(getP().flag(key, r13));
        r12.setButtonTintList(ColorStateList.valueOf(this.a.getAccent()));
        r12.setThumbTintList(ColorStateList.valueOf(this.a.getAccent()));
        r12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda38
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SettingsPanel.toggle$lambda$0(SettingsPanel.this, key, compoundButton, z);
            }
        });
        row.addView(r12);
        body.addView(row);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toggle$lambda$0(SettingsPanel settingsPanel, String str, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        changed$default(settingsPanel, str, Boolean.valueOf(z), false, 4, null);
    }

    static /* synthetic */ void range$default(SettingsPanel settingsPanel, LinearLayout linearLayout, String str, String str2, int i, int i2, int i3, String str3, int i4, Object obj) {
        settingsPanel.range(linearLayout, str, str2, i, i2, i3, (i4 & 64) != 0 ? "" : str3);
    }

    private final void range(LinearLayout body, final String key, final String label, final int min, int max, int r21, final String suffix) {
        final TextView text$default = MainActivity.text$default(this.a, label + " · " + getP().number(key, r21) + suffix, 13.0f, false, 0, 12, null);
        body.addView(text$default);
        SeekBar seekBar = new SeekBar(this.a);
        seekBar.setMax(max - min);
        seekBar.setProgress(getP().number(key, r21) - min);
        seekBar.setContentDescription(label);
        seekBar.setProgressTintList(ColorStateList.valueOf(this.a.getAccent()));
        seekBar.setThumbTintList(ColorStateList.valueOf(this.a.getAccent()));
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$range$1
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar bar) {
                Intrinsics.checkNotNullParameter(bar, "bar");
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar bar, int value, boolean user) {
                Intrinsics.checkNotNullParameter(bar, "bar");
                if (user) {
                    text$default.setText(label + " · " + (min + value) + suffix);
                    SettingsPanel.changed$default(this, key, Integer.valueOf(value + min), false, 4, null);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar bar) {
                Intrinsics.checkNotNullParameter(bar, "bar");
                if (CollectionsKt.listOf((Object[]) new String[]{"font", "lineSpacing", "letterSpacing", "wordSpacing"}).contains(key)) {
                    this.rebuild();
                }
            }
        });
        body.addView(seekBar, new LinearLayout.LayoutParams(-1, this.a.dp((Number) 42)));
        this.a.gap(body, 7);
    }

    private final void choice(LinearLayout body, final String key, final String label, final List<Pair<String, String>> choices, final String r13) {
        Object obj;
        String str;
        MainActivity mainActivity = this.a;
        body.addView(MainActivity.text$default(mainActivity, label, 12.0f, false, mainActivity.getMuted(), 4, null));
        this.a.gap(body, 5);
        Iterator<T> it = choices.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual(((Pair) obj).getFirst(), getP().text(key, r13))) {
                    break;
                }
            }
        }
        Pair pair = (Pair) obj;
        if (pair == null || (str = (String) pair.getSecond()) == null) {
            str = (String) ((Pair) CollectionsKt.first((List) choices)).getSecond();
        }
        TextView button = this.a.button(str + "     ⌄", new Function0() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit choice$lambda$1;
                choice$lambda$1 = SettingsPanel.choice$lambda$1(choices, this, label, key, r13);
                return choice$lambda$1;
            }
        });
        button.setGravity(8388627);
        button.setContentDescription(label + ", " + str);
        body.addView(button, new LinearLayout.LayoutParams(-1, this.a.dp((Number) 46)));
        this.a.gap(body, 12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit choice$lambda$1(final List list, final SettingsPanel settingsPanel, String str, final String str2, String str3) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Pair) it.next()).getSecond());
        }
        int i = 0;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.areEqual(((Pair) it2.next()).getFirst(), settingsPanel.getP().text(str2, str3))) {
                break;
            }
            i++;
        }
        new AlertDialog.Builder(settingsPanel.a).setTitle(str).setSingleChoiceItems(strArr, i, new DialogInterface.OnClickListener() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                SettingsPanel.choice$lambda$1$2(SettingsPanel.this, str2, list, dialogInterface, i2);
            }
        }).setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void choice$lambda$1$2(SettingsPanel settingsPanel, String str, List list, DialogInterface dialogInterface, int i) {
        changed$default(settingsPanel, str, ((Pair) list.get(i)).getFirst(), false, 4, null);
        dialogInterface.dismiss();
        settingsPanel.rebuild();
    }

    private final void appearance(LinearLayout body) {
        group(body, "Text & spacing", new Function1() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit appearance$lambda$0;
                appearance$lambda$0 = SettingsPanel.appearance$lambda$0(SettingsPanel.this, (LinearLayout) obj);
                return appearance$lambda$0;
            }
        });
        group(body, "Cards & icons", new Function1() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit appearance$lambda$1;
                appearance$lambda$1 = SettingsPanel.appearance$lambda$1(SettingsPanel.this, (LinearLayout) obj);
                return appearance$lambda$1;
            }
        });
        group(body, "Theme presets & custom colours", new Function1() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit appearance$lambda$2;
                appearance$lambda$2 = SettingsPanel.appearance$lambda$2(SettingsPanel.this, (LinearLayout) obj);
                return appearance$lambda$2;
            }
        });
        group(body, "Gradients", new Function1() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit appearance$lambda$3;
                appearance$lambda$3 = SettingsPanel.appearance$lambda$3(SettingsPanel.this, (LinearLayout) obj);
                return appearance$lambda$3;
            }
        });
        group(body, "Saved visual presets", new Function1() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit appearance$lambda$4;
                appearance$lambda$4 = SettingsPanel.appearance$lambda$4(SettingsPanel.this, (LinearLayout) obj);
                return appearance$lambda$4;
            }
        });
        group(body, "Icon & rarity legend", new Function1() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit appearance$lambda$5;
                appearance$lambda$5 = SettingsPanel.appearance$lambda$5(SettingsPanel.this, (LinearLayout) obj);
                return appearance$lambda$5;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit appearance$lambda$0(SettingsPanel settingsPanel, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        settingsPanel.range(it, "font", "Font size", 80, 150, 100, "%");
        range$default(settingsPanel, it, "lineSpacing", "Extra line spacing", 0, 16, 0, null, 64, null);
        range$default(settingsPanel, it, "letterSpacing", "Letter spacing", 0, 20, 0, null, 64, null);
        range$default(settingsPanel, it, "wordSpacing", "Word spacing", 0, 12, 0, null, 64, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit appearance$lambda$1(SettingsPanel settingsPanel, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        settingsPanel.choice(it, "density", "Card spacing", CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("compact", "Compact"), TuplesKt.to("comfortable", "Comfortable")}), "compact");
        settingsPanel.range(it, "iconSize", "Icon size", 75, 140, 100, "%");
        settingsPanel.help(it, "Applies to native library cards and search result icons.");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit appearance$lambda$2(final SettingsPanel settingsPanel, LinearLayout it) {
        String str;
        Intrinsics.checkNotNullParameter(it, "it");
        List listOf = CollectionsKt.listOf(TuplesKt.to("game", "Follow World / Iceborne"));
        Set<String> keySet = palettes.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
        Set<String> set = keySet;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        for (String str2 : set) {
            Intrinsics.checkNotNull(str2);
            if (str2.length() > 0) {
                StringBuilder sb = new StringBuilder();
                String valueOf = String.valueOf(str2.charAt(0));
                Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = valueOf.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                StringBuilder append = sb.append((Object) upperCase);
                String substring = str2.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                str = append.append(substring).toString();
            } else {
                str = str2;
            }
            arrayList.add(TuplesKt.to(str2, str));
        }
        settingsPanel.choice(it, "theme", "Theme", CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) listOf, (Iterable) arrayList), (Iterable) CollectionsKt.listOf(TuplesKt.to("custom", "Custom colours"))), "game");
        for (Triple triple : CollectionsKt.listOf((Object[]) new Triple[]{new Triple("customBg", "Background", Integer.valueOf(settingsPanel.a.getBg())), new Triple("customAccent", "Accent", Integer.valueOf(settingsPanel.a.getAccent())), new Triple("customInk", "Text", Integer.valueOf(settingsPanel.a.getInk()))})) {
            final String str3 = (String) triple.component1();
            final String str4 = (String) triple.component2();
            final int intValue = ((Number) triple.component3()).intValue();
            it.addView(settingsPanel.a.button(str4 + " · colour wheel", new Function0() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit appearance$lambda$2$1$0;
                    appearance$lambda$2$1$0 = SettingsPanel.appearance$lambda$2$1$0(SettingsPanel.this, str3, str4, intValue);
                    return appearance$lambda$2$1$0;
                }
            }));
            settingsPanel.a.gap(it, 8);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit appearance$lambda$2$1$0(SettingsPanel settingsPanel, String str, String str2, int i) {
        settingsPanel.pickColour(str, str2, settingsPanel.getP().number(str, i));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit appearance$lambda$3(SettingsPanel settingsPanel, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        toggle$default(settingsPanel, it, "gradients", "Gradients", false, 8, null);
        settingsPanel.range(it, "gradientStrength", "Gradient intensity", 0, 60, 18, "%");
        settingsPanel.choice(it, "gradientAngle", "Direction", CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("0", "Horizontal"), TuplesKt.to("1", "Diagonal"), TuplesKt.to("2", "Vertical")}), "0");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit appearance$lambda$4(final SettingsPanel settingsPanel, LinearLayout inner) {
        Object m79constructorimpl;
        Intrinsics.checkNotNullParameter(inner, "inner");
        try {
            Result.Companion companion = Result.INSTANCE;
            m79constructorimpl = Result.m79constructorimpl(new JSONArray(settingsPanel.getP().text("visualProfiles", "[]")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m79constructorimpl = Result.m79constructorimpl(ResultKt.createFailure(th));
        }
        JSONArray jSONArray = new JSONArray();
        if (Result.m85isFailureimpl(m79constructorimpl)) {
            m79constructorimpl = jSONArray;
        }
        final JSONArray jSONArray2 = (JSONArray) m79constructorimpl;
        settingsPanel.help(inner, "Save appearance and motion together as a look. Bookmarks and history are kept separate.");
        inner.addView(settingsPanel.a.button("Save current look", new Function0() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit appearance$lambda$4$1;
                appearance$lambda$4$1 = SettingsPanel.appearance$lambda$4$1(SettingsPanel.this, jSONArray2);
                return appearance$lambda$4$1;
            }
        }));
        settingsPanel.a.gap(inner, 8);
        int length = jSONArray2.length();
        for (final int i = 0; i < length; i++) {
            final JSONObject jSONObject = jSONArray2.getJSONObject(i);
            LinearLayout row = settingsPanel.a.row();
            MainActivity mainActivity = settingsPanel.a;
            String optString = jSONObject.optString("name");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            row.addView(mainActivity.button(optString, new Function0() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit appearance$lambda$4$2;
                    appearance$lambda$4$2 = SettingsPanel.appearance$lambda$4$2(jSONObject, settingsPanel);
                    return appearance$lambda$4$2;
                }
            }), new LinearLayout.LayoutParams(0, -2, 1.0f));
            row.addView(settingsPanel.a.iconButton("close", "Delete " + jSONObject.optString("name"), new Function0() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit appearance$lambda$4$3;
                    appearance$lambda$4$3 = SettingsPanel.appearance$lambda$4$3(SettingsPanel.this, jSONObject, jSONArray2, i);
                    return appearance$lambda$4$3;
                }
            }), new LinearLayout.LayoutParams(settingsPanel.a.dp((Number) 44), settingsPanel.a.dp((Number) 44)));
            inner.addView(row);
            settingsPanel.a.gap(inner, 6);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit appearance$lambda$4$1(final SettingsPanel settingsPanel, final JSONArray jSONArray) {
        final EditText editText = new EditText(settingsPanel.a);
        editText.setHint("Preset name");
        editText.setSingleLine(true);
        new AlertDialog.Builder(settingsPanel.a).setTitle("Save visual preset").setView(editText).setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda26
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SettingsPanel.appearance$lambda$4$1$0(editText, jSONArray, settingsPanel, dialogInterface, i);
            }
        }).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appearance$lambda$4$1$0(EditText editText, JSONArray jSONArray, SettingsPanel settingsPanel, DialogInterface dialogInterface, int i) {
        String take = StringsKt.take(StringsKt.trim((CharSequence) editText.getText().toString()).toString(), 50);
        if (StringsKt.isBlank(take)) {
            take = "My look";
        }
        String str = take;
        JSONObject jSONObject = new JSONObject();
        for (String str2 : visualKeys) {
            if (settingsPanel.getP().getValues().has(str2)) {
                jSONObject.put(str2, settingsPanel.getP().getValues().get(str2));
            }
        }
        jSONArray.put(new JSONObject().put("name", str).put("values", jSONObject));
        NativePrefs p = settingsPanel.getP();
        String jSONArray2 = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray2, "toString(...)");
        p.set("visualProfiles", jSONArray2);
        settingsPanel.rebuild();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit appearance$lambda$4$2(JSONObject jSONObject, SettingsPanel settingsPanel) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("values");
        Iterator<T> it = visualKeys.iterator();
        while (it.hasNext()) {
            settingsPanel.getP().getValues().remove((String) it.next());
        }
        Iterator<String> keys = jSONObject2.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            settingsPanel.getP().getValues().put(next, jSONObject2.get(next));
        }
        settingsPanel.getP().save();
        settingsPanel.a.afterPreference("theme");
        settingsPanel.rebuild();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit appearance$lambda$4$3(final SettingsPanel settingsPanel, JSONObject jSONObject, final JSONArray jSONArray, final int i) {
        new AlertDialog.Builder(settingsPanel.a).setTitle("Delete saved look?").setMessage(jSONObject.optString("name")).setNegativeButton("Keep", (DialogInterface.OnClickListener) null).setPositiveButton("Delete", new DialogInterface.OnClickListener() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda10
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                SettingsPanel.appearance$lambda$4$3$0(jSONArray, i, settingsPanel, dialogInterface, i2);
            }
        }).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appearance$lambda$4$3$0(JSONArray jSONArray, int i, SettingsPanel settingsPanel, DialogInterface dialogInterface, int i2) {
        jSONArray.remove(i);
        NativePrefs p = settingsPanel.getP();
        String jSONArray2 = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray2, "toString(...)");
        p.set("visualProfiles", jSONArray2);
        settingsPanel.rebuild();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit appearance$lambda$5(SettingsPanel settingsPanel, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        settingsPanel.addLegend(it);
        return Unit.INSTANCE;
    }

    private final void pickColour(final String key, String label, int initial) {
        final int[] themeColours = this.a.themeColours();
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = initial;
        LinearLayout column = this.a.column();
        LinearLayout linearLayout = column;
        this.a.pad(linearLayout, 16);
        MainActivity mainActivity = this.a;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(intRef.element & 16777215)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        final TextView text$default = MainActivity.text$default(mainActivity, format, 16.0f, false, 0, 12, null);
        column.addView(text$default);
        final ColourWheel colourWheel = new ColourWheel(this.a, initial, new Function1() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit pickColour$lambda$0;
                pickColour$lambda$0 = SettingsPanel.pickColour$lambda$0(Ref.IntRef.this, text$default, this, themeColours, key, ((Integer) obj).intValue());
                return pickColour$lambda$0;
            }
        });
        column.addView(colourWheel, new LinearLayout.LayoutParams(-1, this.a.dp((Number) 240)));
        column.addView(MainActivity.text$default(this.a, "Brightness", 12.0f, false, 0, 12, null));
        SeekBar seekBar = new SeekBar(this.a);
        seekBar.setMax(100);
        seekBar.setProgress((int) (colourWheel.getBrightness() * 100));
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$pickColour$1
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar s) {
                Intrinsics.checkNotNullParameter(s, "s");
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar s) {
                Intrinsics.checkNotNullParameter(s, "s");
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar s, int v, boolean user) {
                Intrinsics.checkNotNullParameter(s, "s");
                if (user) {
                    ColourWheel.this.setBrightness(v / 100.0f);
                }
            }
        });
        column.addView(seekBar);
        colourWheel.setOnClickListener(new View.OnClickListener() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda36
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingsPanel.pickColour$lambda$1(SettingsPanel.this, key, view);
            }
        });
        AlertDialog create = new AlertDialog.Builder(this.a).setTitle(label).setView(linearLayout).setPositiveButton("Done", (DialogInterface.OnClickListener) null).create();
        create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda37
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                SettingsPanel.pickColour$lambda$2(SettingsPanel.this, key, dialogInterface);
            }
        });
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pickColour$lambda$0(Ref.IntRef intRef, TextView textView, SettingsPanel settingsPanel, int[] iArr, String str, int i) {
        intRef.element = i;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(16777215 & i)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        textView.setText(format);
        textView.setTextColor(i);
        if (!Intrinsics.areEqual(settingsPanel.getP().text("theme", "game"), "custom")) {
            settingsPanel.getP().set("customBg", Integer.valueOf(iArr[0]));
            settingsPanel.getP().set("customAccent", Integer.valueOf(iArr[1]));
            settingsPanel.getP().set("customInk", Integer.valueOf(iArr[2]));
        }
        settingsPanel.getP().set("theme", "custom");
        settingsPanel.getP().set(str, Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pickColour$lambda$1(SettingsPanel settingsPanel, String str, View view) {
        settingsPanel.a.afterPreference(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pickColour$lambda$2(SettingsPanel settingsPanel, String str, DialogInterface dialogInterface) {
        settingsPanel.a.afterPreference(str);
        settingsPanel.rebuild();
    }

    private final void motion(LinearLayout body) {
        group(body, "Animation controls", new Function1() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit motion$lambda$0;
                motion$lambda$0 = SettingsPanel.motion$lambda$0(SettingsPanel.this, (LinearLayout) obj);
                return motion$lambda$0;
            }
        });
        group(body, "Panel transitions", new Function1() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit motion$lambda$1;
                motion$lambda$1 = SettingsPanel.motion$lambda$1(SettingsPanel.this, (LinearLayout) obj);
                return motion$lambda$1;
            }
        });
        group(body, "Touch effects", new Function1() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit motion$lambda$2;
                motion$lambda$2 = SettingsPanel.motion$lambda$2(SettingsPanel.this, (LinearLayout) obj);
                return motion$lambda$2;
            }
        });
        group(body, "Ambient effects", new Function1() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit motion$lambda$3;
                motion$lambda$3 = SettingsPanel.motion$lambda$3(SettingsPanel.this, (LinearLayout) obj);
                return motion$lambda$3;
            }
        });
        group(body, "Performance", new Function1() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit motion$lambda$4;
                motion$lambda$4 = SettingsPanel.motion$lambda$4(SettingsPanel.this, (LinearLayout) obj);
                return motion$lambda$4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit motion$lambda$0(SettingsPanel settingsPanel, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        toggle$default(settingsPanel, it, "animations", "Global animations", false, 8, null);
        range$default(settingsPanel, it, "speed", "Animation speed · 0 means off", 0, 100, 50, null, 64, null);
        settingsPanel.help(it, "The launch snowflake and audio fades remain part of the fixed opening sequence.");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit motion$lambda$1(final SettingsPanel settingsPanel, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        settingsPanel.choice(it, "transition", "Transition", CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("liquid", "Liquid reveal"), TuplesKt.to("fade", "Fade"), TuplesKt.to("slide", "Soft slide"), TuplesKt.to("zoom", "Soft zoom"), TuplesKt.to("none", "None")}), "liquid");
        final TextView text$default = MainActivity.text$default(settingsPanel.a, "Field record preview", 16.0f, true, 0, 8, null);
        TextView textView = text$default;
        MainActivity.pad$default(settingsPanel.a, textView, 0, 2, null);
        text$default.setBackground(MainActivity.surface$default(settingsPanel.a, 0, false, 0.0f, 7, null));
        it.addView(textView, new LinearLayout.LayoutParams(-1, settingsPanel.a.dp((Number) 70)));
        settingsPanel.a.gap(it, 10);
        it.addView(settingsPanel.a.button("Preview open & close", new Function0() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit motion$lambda$1$0;
                motion$lambda$1$0 = SettingsPanel.motion$lambda$1$0(text$default, settingsPanel);
                return motion$lambda$1$0;
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit motion$lambda$1$0(final TextView textView, final SettingsPanel settingsPanel) {
        textView.setAlpha(0.0f);
        textView.setScaleX(Intrinsics.areEqual(settingsPanel.getP().text("transition", "liquid"), "zoom") ? 0.9f : 1.0f);
        textView.setTranslationY(Intrinsics.areEqual(settingsPanel.getP().text("transition", "liquid"), "slide") ? settingsPanel.a.dp((Number) 15) : 0.0f);
        textView.animate().alpha(1.0f).scaleX(1.0f).translationY(0.0f).setDuration(settingsPanel.a.motionDuration(350L)).withEndAction(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                SettingsPanel.motion$lambda$1$0$0(textView, settingsPanel);
            }
        }).start();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void motion$lambda$1$0$0(final TextView textView, final SettingsPanel settingsPanel) {
        textView.postDelayed(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda44
            @Override // java.lang.Runnable
            public final void run() {
                SettingsPanel.motion$lambda$1$0$0$0(textView, settingsPanel);
            }
        }, 600L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void motion$lambda$1$0$0$0(final TextView textView, SettingsPanel settingsPanel) {
        textView.animate().alpha(0.2f).setDuration(settingsPanel.a.motionDuration(240L)).withEndAction(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                textView.setAlpha(1.0f);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit motion$lambda$2(final SettingsPanel settingsPanel, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        settingsPanel.choice(it, "touch", "Touch effect", CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("ripple", "Original gold ripple"), TuplesKt.to("halo", "Halo"), TuplesKt.to("glow", "Soft glow"), TuplesKt.to("sparks", "Spark wash"), TuplesKt.to("none", "None")}), "ripple");
        it.addView(settingsPanel.a.button("Touch to preview", new Function0() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda43
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit motion$lambda$2$0;
                motion$lambda$2$0 = SettingsPanel.motion$lambda$2$0(SettingsPanel.this);
                return motion$lambda$2$0;
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit motion$lambda$2$0(SettingsPanel settingsPanel) {
        MainActivity mainActivity = settingsPanel.a;
        String text = settingsPanel.getP().text("touch", "ripple");
        Intrinsics.checkNotNullExpressionValue(text, "text(...)");
        if (text.length() > 0) {
            StringBuilder sb = new StringBuilder();
            String valueOf = String.valueOf(text.charAt(0));
            Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            StringBuilder append = sb.append((Object) upperCase);
            String substring = text.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            text = append.append(substring).toString();
        }
        mainActivity.toast(text + " effect");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit motion$lambda$3(SettingsPanel settingsPanel, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        toggle$default(settingsPanel, it, "glow", "Ambient glow", false, 8, null);
        toggle$default(settingsPanel, it, "particles", "Frost particles", false, 8, null);
        toggle$default(settingsPanel, it, "blur", "Backdrop blur, where supported", false, 8, null);
        toggle$default(settingsPanel, it, "imageMotion", "Idle artwork motion", false, 8, null);
        settingsPanel.help(it, "Older Android versions use a dimmed backdrop instead of expensive software blur. Expanded catalogue effects are preview preferences in this milestone.");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit motion$lambda$4(SettingsPanel settingsPanel, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        settingsPanel.choice(it, "performance", "Effects mode", CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("full", "Full effects"), TuplesKt.to("light", "Light mode")}), "full");
        settingsPanel.help(it, "Light mode stops ambient glow. Search and artwork decoding run off the main thread.");
        return Unit.INSTANCE;
    }

    private final void browsing(LinearLayout body) {
        group(body, "Bestiary card grid", new Function1() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda45
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit browsing$lambda$0;
                browsing$lambda$0 = SettingsPanel.browsing$lambda$0(SettingsPanel.this, (LinearLayout) obj);
                return browsing$lambda$0;
            }
        });
        group(body, "When the guide opens", new Function1() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda46
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit browsing$lambda$1;
                browsing$lambda$1 = SettingsPanel.browsing$lambda$1(SettingsPanel.this, (LinearLayout) obj);
                return browsing$lambda$1;
            }
        });
        group(body, "Reading & navigation", new Function1() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda47
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit browsing$lambda$2;
                browsing$lambda$2 = SettingsPanel.browsing$lambda$2(SettingsPanel.this, (LinearLayout) obj);
                return browsing$lambda$2;
            }
        });
        group(body, "Search history", new Function1() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda48
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit browsing$lambda$3;
                browsing$lambda$3 = SettingsPanel.browsing$lambda$3(SettingsPanel.this, (LinearLayout) obj);
                return browsing$lambda$3;
            }
        });
        group(body, "Default sorting", new Function1() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda49
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit browsing$lambda$4;
                browsing$lambda$4 = SettingsPanel.browsing$lambda$4(SettingsPanel.this, (LinearLayout) obj);
                return browsing$lambda$4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit browsing$lambda$0(SettingsPanel settingsPanel, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List listOf = CollectionsKt.listOf(TuplesKt.to("auto", "Auto"));
        IntRange intRange = new IntRange(1, 6);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator<Integer> it2 = intRange.iterator();
        while (it2.hasNext()) {
            int nextInt = ((IntIterator) it2).nextInt();
            arrayList.add(TuplesKt.to(String.valueOf(nextInt), String.valueOf(nextInt)));
        }
        settingsPanel.choice(it, "columns", "Cards across", CollectionsKt.plus((Collection) listOf, (Iterable) arrayList), "auto");
        IntRange intRange2 = new IntRange(1, 8);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange2, 10));
        Iterator<Integer> it3 = intRange2.iterator();
        while (it3.hasNext()) {
            int nextInt2 = ((IntIterator) it3).nextInt();
            arrayList2.add(TuplesKt.to(String.valueOf(nextInt2), String.valueOf(nextInt2)));
        }
        settingsPanel.choice(it, "rows", "Rows per batch", arrayList2, "6");
        String text = settingsPanel.getP().text("columns", "auto");
        Intrinsics.checkNotNullExpressionValue(text, "text(...)");
        Integer intOrNull = StringsKt.toIntOrNull(text);
        int intValue = intOrNull != null ? intOrNull.intValue() : settingsPanel.a.getWide() ? 4 : 2;
        String text2 = settingsPanel.getP().text("rows", "6");
        Intrinsics.checkNotNullExpressionValue(text2, "text(...)");
        Integer intOrNull2 = StringsKt.toIntOrNull(text2);
        int intValue2 = intOrNull2 != null ? intOrNull2.intValue() : 6;
        int i = intValue * intValue2;
        settingsPanel.help(it, intValue + " across × " + intValue2 + " rows · " + i + " cards per batch. Your manual columns are never reduced.");
        GridLayout gridLayout = new GridLayout(settingsPanel.a);
        gridLayout.setColumnCount(intValue);
        for (int i2 = 0; i2 < i; i2++) {
            View view = new View(settingsPanel.a);
            MainActivity mainActivity = settingsPanel.a;
            view.setBackground(MainActivity.surface$default(mainActivity, mainActivity.getLine(), false, 0.0f, 4, null));
            GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
            layoutParams.width = 0;
            layoutParams.height = settingsPanel.a.dp((Number) 18);
            layoutParams.columnSpec = GridLayout.spec(IntCompanionObject.MIN_VALUE, 1.0f);
            layoutParams.setMargins(settingsPanel.a.dp((Number) 2), settingsPanel.a.dp((Number) 2), settingsPanel.a.dp((Number) 2), settingsPanel.a.dp((Number) 2));
            Unit unit = Unit.INSTANCE;
            gridLayout.addView(view, layoutParams);
        }
        it.addView(gridLayout, new LinearLayout.LayoutParams(-1, -2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit browsing$lambda$1(SettingsPanel settingsPanel, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        settingsPanel.choice(it, "startup", "Start position", CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("overview", "Overview"), TuplesKt.to("last", "Last section")}), "overview");
        settingsPanel.help(it, "The snowflake introduction plays on every fresh launch. Returning from another app keeps your current screen.");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit browsing$lambda$2(SettingsPanel settingsPanel, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        settingsPanel.choice(it, "settingsLayout", "Tablet Settings layout", CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("center", "Centred panel"), TuplesKt.to("split", "Categories and controls side by side")}), "center");
        settingsPanel.help(it, "Narrow screens automatically use compact Settings without changing your saved layout preference.");
        toggle$default(settingsPanel, it, "confirmExit", "Ask before exiting", false, 8, null);
        toggle$default(settingsPanel, it, "rememberScroll", "Remember section position", false, 8, null);
        settingsPanel.toggle(it, "singleGroup", "One expandable reading group at a time", false);
        toggle$default(settingsPanel, it, "rememberGroups", "Remember reading groups", false, 8, null);
        settingsPanel.help(it, "Settings groups always start closed. Reading preferences apply to profiles, maps and campaign guidance.");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit browsing$lambda$3(final SettingsPanel settingsPanel, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        toggle$default(settingsPanel, it, "searchHistory", "Remember searches on this device", false, 8, null);
        it.addView(settingsPanel.a.button("Clear search history", new Function0() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit browsing$lambda$3$0;
                browsing$lambda$3$0 = SettingsPanel.browsing$lambda$3$0(SettingsPanel.this);
                return browsing$lambda$3$0;
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit browsing$lambda$3$0(final SettingsPanel settingsPanel) {
        new AlertDialog.Builder(settingsPanel.a).setTitle("Clear search history?").setNegativeButton("Keep", (DialogInterface.OnClickListener) null).setPositiveButton("Clear", new DialogInterface.OnClickListener() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SettingsPanel.browsing$lambda$3$0$0(SettingsPanel.this, dialogInterface, i);
            }
        }).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void browsing$lambda$3$0$0(SettingsPanel settingsPanel, DialogInterface dialogInterface, int i) {
        settingsPanel.a.clearSearchHistory();
        settingsPanel.a.toast("History cleared.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit browsing$lambda$4(SettingsPanel settingsPanel, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        settingsPanel.choice(it, "sortResources", "Resources", CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("name", "Name A–Z"), TuplesKt.to("rarity", "Rarity")}), "name");
        settingsPanel.choice(it, "sortWeapons", "Weapons", CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("source", "Original order"), TuplesKt.to("name", "Name A–Z"), TuplesKt.to("attack", "Attack")}), "source");
        for (Pair pair : CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("armours", "Armour"), TuplesKt.to("armourSets", "Armour sets"), TuplesKt.to("decorations", "Decorations"), TuplesKt.to("skills", "Skills"), TuplesKt.to("charms", "Charms"), TuplesKt.to("kinsects", "Kinsects"), TuplesKt.to("palicoEquipment", "Palico equipment"), TuplesKt.to("palicoGadgets", "Palico gadgets"), TuplesKt.to("tools", "Tools"), TuplesKt.to("canteen", "Canteen"), TuplesKt.to("foodSkills", "Food skills"), TuplesKt.to("Monsters", "Large monsters"), TuplesKt.to("smallMonsters", "Small monsters"), TuplesKt.to("endemicLife", "Endemic life"), TuplesKt.to("Quests", "Quests")})) {
            settingsPanel.choice(it, "sort:" + ((String) pair.component1()), (String) pair.component2(), CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("name", "Name A–Z"), TuplesKt.to("rarity", "Highest rarity"), TuplesKt.to("source", "Source order")}), "name");
        }
        settingsPanel.help(it, "Clear a collection’s filters to use its new default sorting order.");
        return Unit.INSTANCE;
    }

    private final void music(LinearLayout body) {
        group(body, "Camp music", new Function1() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit music$lambda$0;
                music$lambda$0 = SettingsPanel.music$lambda$0(SettingsPanel.this, (LinearLayout) obj);
                return music$lambda$0;
            }
        });
        group(body, "Player & offline music library", new Function1() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit music$lambda$1;
                music$lambda$1 = SettingsPanel.music$lambda$1(SettingsPanel.this, (LinearLayout) obj);
                return music$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit music$lambda$0(SettingsPanel settingsPanel, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        toggle$default(settingsPanel, it, "musicEnabled", "Play music automatically", false, 8, null);
        settingsPanel.range(it, "volume", "Music volume", 0, 100, 25, "%");
        toggle$default(settingsPanel, it, "followTheme", "Follow World / Iceborne music", false, 8, null);
        toggle$default(settingsPanel, it, "rememberMusicPosition", "Resume from saved track position", false, 8, null);
        settingsPanel.choice(it, "musicMode", "Playback order", CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("library", "Loop library"), TuplesKt.to("one", "Repeat current track"), TuplesKt.to("shuffle", "Shuffle")}), "library");
        settingsPanel.help(it, "World: Stars at Our Backs\nIceborne: Nay! The Honor is All Ours\n\nMusic pauses when minimised and resumes on return. Theme changes crossfade between bundled tracks. The launch chime respects media volume.");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit music$lambda$1(SettingsPanel settingsPanel, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.addView(new MusicPanel(settingsPanel.a), new LinearLayout.LayoutParams(-1, -2));
        return Unit.INSTANCE;
    }

    private final void about(LinearLayout body) {
        group(body, "This milestone", new Function1() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit about$lambda$0;
                about$lambda$0 = SettingsPanel.about$lambda$0(SettingsPanel.this, (LinearLayout) obj);
                return about$lambda$0;
            }
        });
        group(body, "Backup & restore", new Function1() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit about$lambda$1;
                about$lambda$1 = SettingsPanel.about$lambda$1(SettingsPanel.this, (LinearLayout) obj);
                return about$lambda$1;
            }
        });
        group(body, "Selective reset", new Function1() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda41
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit about$lambda$2;
                about$lambda$2 = SettingsPanel.about$lambda$2(SettingsPanel.this, (LinearLayout) obj);
                return about$lambda$2;
            }
        });
        group(body, "Reset All Settings", new Function1() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit about$lambda$3;
                about$lambda$3 = SettingsPanel.about$lambda$3(SettingsPanel.this, (LinearLayout) obj);
                return about$lambda$3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit about$lambda$0(final SettingsPanel settingsPanel, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.addView(MainActivity.text$default(settingsPanel.a, "Monster Hunter Field Book\n0.2.0 · Offline libraries & progress", 19.0f, true, 0, 8, null));
        MainActivity.gap$default(settingsPanel.a, it, 0, 2, null);
        settingsPanel.help(it, "Native libraries, complete source record data, weapon trees, maps, campaign tracking, bookmarks, backups and local music. All content is bundled. Source videos and reference links open online. Visual matching and decorative polish remain for a later milestone.");
        it.addView(settingsPanel.a.button("Sources & credits", new Function0() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit about$lambda$0$0;
                about$lambda$0$0 = SettingsPanel.about$lambda$0$0(SettingsPanel.this);
                return about$lambda$0$0;
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit about$lambda$0$0(SettingsPanel settingsPanel) {
        settingsPanel.a.showCredits();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit about$lambda$1(final SettingsPanel settingsPanel, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        settingsPanel.help(it, "Export native settings, filters, bookmarks and progress. Restore validates the file before asking for confirmation. Imported audio files are kept on this device and are not included in the backup. HTML backups are not supported.");
        it.addView(settingsPanel.a.button("Export native backup", new Function0() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit about$lambda$1$0;
                about$lambda$1$0 = SettingsPanel.about$lambda$1$0(SettingsPanel.this);
                return about$lambda$1$0;
            }
        }));
        settingsPanel.a.gap(it, 8);
        it.addView(settingsPanel.a.button("Restore native backup", new Function0() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit about$lambda$1$1;
                about$lambda$1$1 = SettingsPanel.about$lambda$1$1(SettingsPanel.this);
                return about$lambda$1$1;
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit about$lambda$1$0(SettingsPanel settingsPanel) {
        settingsPanel.a.getBackups().export();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit about$lambda$1$1(SettingsPanel settingsPanel) {
        settingsPanel.a.getBackups().importBackup();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit about$lambda$2(final SettingsPanel settingsPanel, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        settingsPanel.help(it, "Choose exactly which settings or progress to clear, then review the selection.");
        it.addView(settingsPanel.a.button("Choose what to reset", new Function0() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit about$lambda$2$0;
                about$lambda$2$0 = SettingsPanel.about$lambda$2$0(SettingsPanel.this);
                return about$lambda$2$0;
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit about$lambda$2$0(SettingsPanel settingsPanel) {
        settingsPanel.a.getBackups().selectiveReset();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit about$lambda$3(final SettingsPanel settingsPanel, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        settingsPanel.help(it, "Keeps bookmarks, campaign progress, camp checks, music files, search history and saved looks. Tick the scope and confirm to reset settings.");
        it.addView(settingsPanel.a.button("Reset All Settings", new Function0() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit about$lambda$3$0;
                about$lambda$3$0 = SettingsPanel.about$lambda$3$0(SettingsPanel.this);
                return about$lambda$3$0;
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit about$lambda$3$0(SettingsPanel settingsPanel) {
        settingsPanel.a.getBackups().resetAllSettings();
        return Unit.INSTANCE;
    }

    private final void addLegend(LinearLayout body) {
        String str;
        Object m79constructorimpl;
        help(body, "Tap an icon to inspect its meaning. Rarity is a tier, not a guarantee of the best equipment.");
        JSONObject jSONObject = this.a.getLibraryData().getJSONObject("rarityColours");
        JSONObject optJSONObject = this.a.getLibraryData().optJSONObject("legendEquipment");
        JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject("armour-head") : null;
        for (int i = 1; i < 13; i++) {
            String valueOf = String.valueOf(i);
            String str2 = "Rarity " + valueOf;
            if (optJSONObject2 == null || (str = optJSONObject2.optString(valueOf)) == null) {
                str = "";
            }
            String str3 = "Equipment rarity " + valueOf + ". Weapon and armour icons use this tier’s colour.";
            try {
                Result.Companion companion = Result.INSTANCE;
                SettingsPanel settingsPanel = this;
                m79constructorimpl = Result.m79constructorimpl(Integer.valueOf(Color.parseColor(jSONObject.getString(valueOf))));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m79constructorimpl = Result.m79constructorimpl(ResultKt.createFailure(th));
            }
            Integer valueOf2 = Integer.valueOf(this.a.getAccent());
            if (Result.m85isFailureimpl(m79constructorimpl)) {
                m79constructorimpl = valueOf2;
            }
            addLegend$icon(this, body, str2, str, str3, (Integer) m79constructorimpl);
        }
        JSONObject optJSONObject3 = this.a.getLibraryData().optJSONObject("legendSlots");
        if (optJSONObject3 == null) {
            optJSONObject3 = new JSONObject();
        }
        for (int i2 = 1; i2 < 5; i2++) {
            String optString = optJSONObject3.optString(String.valueOf(i2));
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            addLegend$icon$default(this, body, "Decoration slot " + i2, optString, "A level " + i2 + " slot accepts jewels of level " + i2 + " or lower. A jewel’s slot size is distinct from its rarity.", null, 32, null);
        }
        JSONObject optJSONObject4 = this.a.getLibraryData().optJSONObject("effectNames");
        if (optJSONObject4 == null) {
            optJSONObject4 = new JSONObject();
        }
        JSONObject optJSONObject5 = this.a.getLibraryData().optJSONObject("legend");
        if (optJSONObject5 == null) {
            optJSONObject5 = new JSONObject();
        }
        JSONObject jSONObject2 = optJSONObject5;
        Iterator<String> keys = optJSONObject4.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            ContentText contentText = ContentText.INSTANCE;
            String string = optJSONObject4.getString(next);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String label = contentText.label(string);
            String optString2 = jSONObject2.optString(next);
            Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
            addLegend$icon$default(this, body, label, optString2, "Identifies the " + optJSONObject4.getString(next) + " element, ailment or effect in the guide. Consult each profile for its recorded effectiveness.", null, 32, null);
        }
    }

    static /* synthetic */ void addLegend$icon$default(SettingsPanel settingsPanel, LinearLayout linearLayout, String str, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 32) != 0) {
            num = null;
        }
        addLegend$icon(settingsPanel, linearLayout, str, str2, str3, num);
    }

    private static final void addLegend$icon(final SettingsPanel settingsPanel, LinearLayout linearLayout, final String str, final String str2, final String str3, Integer num) {
        LinearLayout row = settingsPanel.a.row();
        ImageView imageView = new ImageView(settingsPanel.a);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setContentDescription(str);
        row.addView(imageView, new LinearLayout.LayoutParams(settingsPanel.a.dp((Number) 35), settingsPanel.a.dp((Number) 35)));
        if (!StringsKt.isBlank(str2)) {
            settingsPanel.a.assetImage(str2, imageView);
        }
        MainActivity mainActivity = settingsPanel.a;
        TextView text$default = MainActivity.text$default(mainActivity, str, 13.0f, false, num != null ? num.intValue() : mainActivity.getInk(), 4, null);
        text$default.setPadding(settingsPanel.a.dp((Number) 12), 0, 0, 0);
        row.addView(text$default, new LinearLayout.LayoutParams(0, settingsPanel.a.dp((Number) 46), 1.0f));
        LinearLayout linearLayout2 = row;
        settingsPanel.a.touch(linearLayout2, new Function0() { // from class: com.lumina.monsterhunterfieldbook.SettingsPanel$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit addLegend$icon$lambda$2;
                addLegend$icon$lambda$2 = SettingsPanel.addLegend$icon$lambda$2(SettingsPanel.this, str2, str3, str);
                return addLegend$icon$lambda$2;
            }
        });
        linearLayout.addView(linearLayout2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addLegend$icon$lambda$2(SettingsPanel settingsPanel, String str, String str2, String str3) {
        LinearLayout column = settingsPanel.a.column();
        LinearLayout linearLayout = column;
        settingsPanel.a.pad(linearLayout, 18);
        ImageView imageView = new ImageView(settingsPanel.a);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        String str4 = str3;
        imageView.setContentDescription(str4);
        column.addView(imageView, new LinearLayout.LayoutParams(-1, settingsPanel.a.dp((Number) 150)));
        if (!StringsKt.isBlank(str)) {
            settingsPanel.a.assetImage(str, imageView);
        }
        column.addView(MainActivity.text$default(settingsPanel.a, str2, 14.0f, false, 0, 12, null));
        new AlertDialog.Builder(settingsPanel.a).setTitle(str4).setView(linearLayout).setPositiveButton("Close", (DialogInterface.OnClickListener) null).show();
        return Unit.INSTANCE;
    }
}
