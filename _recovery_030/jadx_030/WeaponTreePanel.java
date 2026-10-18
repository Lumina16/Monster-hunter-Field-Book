package com.lumina.monsterhunterfieldbook;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.lumina.monsterhunterfieldbook.WeaponTreeLayout;
import com.lumina.monsterhunterfieldbook.WeaponTreePanel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: WeaponTreePanel.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0004789:B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010(\u001a\u00020\bJ\u0006\u0010)\u001a\u00020\u0012J\b\u0010*\u001a\u00020\bH\u0002J\u0010\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u0012H\u0002J\b\u0010-\u001a\u00020\u000bH\u0002J\b\u0010.\u001a\u00020\fH\u0002J\b\u0010/\u001a\u00020\fH\u0002J\u0006\u00100\u001a\u00020\fJ\u0006\u00101\u001a\u00020\u0014J\u0010\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\u0006H\u0002J\u0010\u00104\u001a\u00020\f2\u0006\u00105\u001a\u00020\u0014H\u0002J\u0010\u00106\u001a\u00020\f2\u0006\u00105\u001a\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00060\u001cR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u00060 R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&0%X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/WeaponTreePanel;", "Landroid/widget/LinearLayout;", "a", "Lcom/lumina/monsterhunterfieldbook/MainActivity;", "records", "", "Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "state", "Lorg/json/JSONObject;", "onInfo", "Lkotlin/Function1;", "", "", "<init>", "(Lcom/lumina/monsterhunterfieldbook/MainActivity;Ljava/util/List;Lorg/json/JSONObject;Lkotlin/jvm/functions/Function1;)V", "getState", "()Lorg/json/JSONObject;", "density", "", "compact", "", "shell", "Landroid/widget/FrameLayout;", "familySelector", "Landroid/widget/Spinner;", "zoomLabel", "Landroid/widget/TextView;", "materialHost", "Lcom/lumina/monsterhunterfieldbook/WeaponTreePanel$MaterialHost;", "graph", "Lcom/lumina/monsterhunterfieldbook/WeaponTreeLayout$Graph;", "viewport", "Lcom/lumina/monsterhunterfieldbook/WeaponTreePanel$TreeViewport;", "materialVersion", "", "selectorReady", "pendingIcons", "", "", "Landroid/widget/ImageView;", "snapshot", "logicalZoom", "treeState", "units", "value", "selectedId", "writeGraphState", "bindFamilies", "resetViewport", "closeMaterials", "select", "record", "showMaterials", "animate", "hideMaterials", "TreeGesture", "MaterialHost", "TreeViewport", "TreeDrawing", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WeaponTreePanel extends LinearLayout {
    private final MainActivity a;
    private final boolean compact;
    private final float density;
    private final Spinner familySelector;
    private WeaponTreeLayout.Graph graph;
    private final MaterialHost materialHost;
    private int materialVersion;
    private final Function1<String, Unit> onInfo;
    private final Map<String, List<ImageView>> pendingIcons;
    private final List<FieldRecord> records;
    private boolean selectorReady;
    private final FrameLayout shell;
    private final JSONObject state;
    private final TreeViewport viewport;
    private final TextView zoomLabel;

    public static final /* synthetic */ void access$select(WeaponTreePanel weaponTreePanel, FieldRecord fieldRecord) {
        weaponTreePanel.select(fieldRecord);
    }

    public final JSONObject getState() {
        return this.state;
    }

    /* compiled from: WeaponTreePanel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006 "}, d2 = {"Lcom/lumina/monsterhunterfieldbook/WeaponTreePanel$TreeGesture;", "", "zoom", "", "x", "y", "midX", "midY", "distance", "<init>", "(FFFFFF)V", "getZoom", "()F", "getX", "getY", "getMidX", "getMidY", "getDistance", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final /* data */ class TreeGesture {
        private final float distance;
        private final float midX;
        private final float midY;
        private final float x;
        private final float y;
        private final float zoom;

        public static /* synthetic */ TreeGesture copy$default(TreeGesture treeGesture, float f, float f2, float f3, float f4, float f5, float f6, int i, Object obj) {
            if ((i & 1) != 0) {
                f = treeGesture.zoom;
            }
            if ((i & 2) != 0) {
                f2 = treeGesture.x;
            }
            if ((i & 4) != 0) {
                f3 = treeGesture.y;
            }
            if ((i & 8) != 0) {
                f4 = treeGesture.midX;
            }
            if ((i & 16) != 0) {
                f5 = treeGesture.midY;
            }
            if ((i & 32) != 0) {
                f6 = treeGesture.distance;
            }
            float f7 = f5;
            float f8 = f6;
            return treeGesture.copy(f, f2, f3, f4, f7, f8);
        }

        /* renamed from: component1, reason: from getter */
        public final float getZoom() {
            return this.zoom;
        }

        /* renamed from: component2, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* renamed from: component3, reason: from getter */
        public final float getY() {
            return this.y;
        }

        /* renamed from: component4, reason: from getter */
        public final float getMidX() {
            return this.midX;
        }

        /* renamed from: component5, reason: from getter */
        public final float getMidY() {
            return this.midY;
        }

        /* renamed from: component6, reason: from getter */
        public final float getDistance() {
            return this.distance;
        }

        public final TreeGesture copy(float zoom, float x, float y, float midX, float midY, float distance) {
            return new TreeGesture(zoom, x, y, midX, midY, distance);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TreeGesture)) {
                return false;
            }
            TreeGesture treeGesture = (TreeGesture) other;
            return Float.compare(this.zoom, treeGesture.zoom) == 0 && Float.compare(this.x, treeGesture.x) == 0 && Float.compare(this.y, treeGesture.y) == 0 && Float.compare(this.midX, treeGesture.midX) == 0 && Float.compare(this.midY, treeGesture.midY) == 0 && Float.compare(this.distance, treeGesture.distance) == 0;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.zoom) * 31) + Float.hashCode(this.x)) * 31) + Float.hashCode(this.y)) * 31) + Float.hashCode(this.midX)) * 31) + Float.hashCode(this.midY)) * 31) + Float.hashCode(this.distance);
        }

        public String toString() {
            return "TreeGesture(zoom=" + this.zoom + ", x=" + this.x + ", y=" + this.y + ", midX=" + this.midX + ", midY=" + this.midY + ", distance=" + this.distance + ")";
        }

        public TreeGesture(float f, float f2, float f3, float f4, float f5, float f6) {
            this.zoom = f;
            this.x = f2;
            this.y = f3;
            this.midX = f4;
            this.midY = f5;
            this.distance = f6;
        }

        public final float getDistance() {
            return this.distance;
        }

        public final float getMidX() {
            return this.midX;
        }

        public final float getMidY() {
            return this.midY;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public final float getZoom() {
            return this.zoom;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [com.lumina.monsterhunterfieldbook.WeaponTreePanel$toolbar$1] */
    public WeaponTreePanel(final MainActivity a, List<FieldRecord> records, JSONObject state, Function1<? super String, Unit> onInfo) {
        super(a);
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(records, "records");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onInfo, "onInfo");
        this.a = a;
        this.records = records;
        this.state = state;
        this.onInfo = onInfo;
        this.density = getResources().getDisplayMetrics().density;
        boolean z = getResources().getConfiguration().screenWidthDp <= 780;
        this.compact = z;
        FrameLayout frameLayout = new FrameLayout(a);
        this.shell = frameLayout;
        Spinner spinner = new Spinner(a, 1);
        this.familySelector = spinner;
        TextView text$default = MainActivity.text$default(a, "100%", z ? 11.0f : 12.0f, false, a.getMuted(), 4, null);
        this.zoomLabel = text$default;
        MaterialHost materialHost = new MaterialHost();
        this.materialHost = materialHost;
        WeaponTreeLayout weaponTreeLayout = WeaponTreeLayout.INSTANCE;
        String optString = state.optString("family", "default");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        String optString2 = state.optString("selected");
        Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
        this.graph = weaponTreeLayout.build(records, optString, optString2);
        TreeViewport treeViewport = new TreeViewport();
        this.viewport = treeViewport;
        this.pendingIcons = new LinkedHashMap();
        setOrientation(1);
        addView(frameLayout, new LinearLayout.LayoutParams(-1, -1));
        LinearLayout column = a.column();
        frameLayout.addView(column, new FrameLayout.LayoutParams(-1, -1));
        ?? r3 = new LinearLayout(a) { // from class: com.lumina.monsterhunterfieldbook.WeaponTreePanel$toolbar$1
            {
                super(a);
                setOrientation(0);
                setGravity(16);
            }

            @Override // android.widget.LinearLayout, android.view.View
            protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
                Spinner spinner2;
                int size = (View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingLeft()) - getPaddingRight();
                int dp = WeaponTreePanel.this.a.dp(Integer.valueOf(WeaponTreePanel.this.compact ? 111 : 125));
                spinner2 = WeaponTreePanel.this.familySelector;
                spinner2.getLayoutParams().width = Math.min(WeaponTreePanel.this.a.dp((Number) 340), Math.min(MathKt.roundToInt(size * 0.7f), Math.max(0, size - dp)));
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            }
        };
        r3.setMinimumHeight(a.dp((Number) 58));
        r3.setPadding(a.dp(Integer.valueOf(z ? 8 : 12)), a.dp(Integer.valueOf(z ? 8 : 9)), a.dp(Integer.valueOf(z ? 8 : 12)), a.dp(Integer.valueOf(z ? 8 : 9)));
        spinner.setContentDescription("Weapon family");
        spinner.setBackground(MainActivity.surface$default(a, 0, false, 0.0f, 7, null));
        r3.addView(spinner, new LinearLayout.LayoutParams(0, a.dp((Number) 40)));
        r3.addView(new View(a), new LinearLayout.LayoutParams(0, 1, 1.0f));
        text$default.setGravity(17);
        text$default.setContentDescription("Tree zoom, 100 percent");
        TextView textView = text$default;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, a.dp((Number) 40));
        layoutParams.setMarginStart(a.dp(Integer.valueOf(z ? 9 : 12)));
        Unit unit = Unit.INSTANCE;
        r3.addView(textView, layoutParams);
        TextView button = a.button("Reset", new Function0() { // from class: com.lumina.monsterhunterfieldbook.WeaponTreePanel$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit _init_$lambda$1;
                _init_$lambda$1 = WeaponTreePanel._init_$lambda$1(WeaponTreePanel.this);
                return _init_$lambda$1;
            }
        });
        button.setMinHeight(a.dp((Number) 40));
        button.setMinimumHeight(a.dp((Number) 40));
        button.setPadding(a.dp(Integer.valueOf(z ? 9 : 12)), 0, 0, 0);
        button.setBackground(null);
        button.setTextColor(a.getAccent());
        button.setContentDescription("Reset weapon tree view");
        r3.addView(button, new LinearLayout.LayoutParams(-2, a.dp((Number) 40)));
        column.addView((View) r3, new LinearLayout.LayoutParams(-1, -2));
        a.rule(column);
        column.addView(treeViewport, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        int dp = a.dp(Integer.valueOf(z ? 6 : 10));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams2.leftMargin = dp;
        layoutParams2.rightMargin = dp;
        layoutParams2.bottomMargin = dp;
        Unit unit2 = Unit.INSTANCE;
        frameLayout.addView(materialHost, layoutParams2);
        materialHost.setVisibility(8);
        writeGraphState();
        bindFamilies();
        treeViewport.populate();
        if (state.optBoolean("treeDetails")) {
            showMaterials(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(WeaponTreePanel weaponTreePanel) {
        weaponTreePanel.resetViewport();
        return Unit.INSTANCE;
    }

    public final JSONObject snapshot() {
        return this.state;
    }

    public final float logicalZoom() {
        return (float) treeState().optDouble("zoom", 1.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject treeState() {
        JSONObject optJSONObject = this.state.optJSONObject("tree");
        if (optJSONObject != null) {
            return optJSONObject;
        }
        JSONObject put = new JSONObject().put("zoom", 1).put("x", 16).put("y", 16);
        this.state.put("tree", put);
        Intrinsics.checkNotNullExpressionValue(put, "also(...)");
        return put;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float units(float value) {
        return value * this.density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String selectedId() {
        String optString = this.state.optString("selected");
        if (Intrinsics.areEqual(optString, "null")) {
            optString = "";
        }
        Intrinsics.checkNotNullExpressionValue(optString, "let(...)");
        return optString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeGraphState() {
        if (!Intrinsics.areEqual(this.state.optString("family", "default"), this.graph.getFamily())) {
            this.state.put("treeInitialized", false);
        }
        this.state.put("family", this.graph.getFamily());
        this.state.put("selected", this.graph.getSelected().length() == 0 ? JSONObject.NULL : this.graph.getSelected());
    }

    private final void bindFamilies() {
        List listOf = CollectionsKt.listOf("All");
        List<FieldRecord> roots = this.graph.getRoots();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(roots, 10));
        for (FieldRecord fieldRecord : roots) {
            String optString = WeaponModel.INSTANCE.data(fieldRecord).optString("family");
            Intrinsics.checkNotNull(optString);
            boolean isBlank = StringsKt.isBlank(optString);
            String name = fieldRecord.getName();
            if (!isBlank) {
                name = optString + " · " + name;
            }
            arrayList.add(name);
        }
        final List plus = CollectionsKt.plus((Collection) listOf, (Iterable) arrayList);
        List listOf2 = CollectionsKt.listOf("all");
        List<FieldRecord> roots2 = this.graph.getRoots();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(roots2, 10));
        Iterator<T> it = roots2.iterator();
        while (it.hasNext()) {
            arrayList2.add(WeaponTreeLayout.INSTANCE.rawId((FieldRecord) it.next()));
        }
        List plus2 = CollectionsKt.plus((Collection) listOf2, (Iterable) arrayList2);
        Spinner spinner = this.familySelector;
        final MainActivity mainActivity = this.a;
        spinner.setAdapter((SpinnerAdapter) new ArrayAdapter<String>(plus, this, mainActivity) { // from class: com.lumina.monsterhunterfieldbook.WeaponTreePanel$bindFamilies$1
            final /* synthetic */ List<String> $labels;
            final /* synthetic */ WeaponTreePanel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(mainActivity, android.R.layout.simple_spinner_item, plus);
                this.$labels = plus;
                this.this$0 = this;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int position, View recycled, ViewGroup parent) {
                Intrinsics.checkNotNullParameter(parent, "parent");
                LinearLayout row = this.this$0.a.row();
                WeaponTreePanel weaponTreePanel = this.this$0;
                List<String> list = this.$labels;
                row.setPadding(weaponTreePanel.a.dp((Number) 8), 0, weaponTreePanel.a.dp((Number) 7), 0);
                TextView text$default = MainActivity.text$default(weaponTreePanel.a, list.get(position), 12.0f, false, 0, 12, null);
                text$default.setMaxLines(1);
                text$default.setEllipsize(TextUtils.TruncateAt.END);
                row.addView(text$default, new LinearLayout.LayoutParams(0, -2, 1.0f));
                row.addView(MainActivity.text$default(weaponTreePanel.a, "⌄", 14.0f, false, weaponTreePanel.a.getMuted(), 4, null), new LinearLayout.LayoutParams(-2, -2));
                return row;
            }

            @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
            public View getDropDownView(int position, View recycled, ViewGroup parent) {
                Intrinsics.checkNotNullParameter(parent, "parent");
                TextView text$default = MainActivity.text$default(this.this$0.a, this.$labels.get(position), 12.0f, false, 0, 12, null);
                WeaponTreePanel weaponTreePanel = this.this$0;
                text$default.setPadding(weaponTreePanel.a.dp((Number) 12), weaponTreePanel.a.dp((Number) 11), weaponTreePanel.a.dp((Number) 12), weaponTreePanel.a.dp((Number) 11));
                text$default.setBackgroundColor(weaponTreePanel.a.getPanel());
                text$default.setMinHeight(weaponTreePanel.a.dp((Number) 44));
                return text$default;
            }
        });
        this.familySelector.setSelection(RangesKt.coerceAtLeast(plus2.indexOf(this.graph.getFamily()), 0), false);
        this.familySelector.setOnItemSelectedListener(new WeaponTreePanel$bindFamilies$2(this, plus2));
    }

    public final void resetViewport() {
        if (this.viewport.getWidth() == 0 || this.viewport.getHeight() == 0) {
            this.viewport.post(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.WeaponTreePanel$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    WeaponTreePanel.resetViewport$lambda$0(WeaponTreePanel.this);
                }
            });
            return;
        }
        this.state.put("tree", new JSONObject().put("zoom", 1).put("x", 16).put("y", Float.valueOf(Math.min(16.0f, ((this.viewport.getHeight() / this.density) * 0.35f) - (this.graph.getRootY() * 0.5f)))));
        this.state.put("treeInitialized", true);
        this.viewport.updateTransform();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetViewport$lambda$0(WeaponTreePanel weaponTreePanel) {
        if (weaponTreePanel.viewport.getWidth() <= 0 || weaponTreePanel.viewport.getHeight() <= 0) {
            return;
        }
        weaponTreePanel.resetViewport();
    }

    public final boolean closeMaterials() {
        if (!this.state.optBoolean("treeDetails")) {
            return false;
        }
        this.state.put("treeDetails", false);
        hideMaterials(true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void select(FieldRecord record) {
        this.state.put("selected", WeaponTreeLayout.INSTANCE.rawId(record)).put("treeDetails", true);
        this.viewport.updateSelection();
        showMaterials(true);
    }

    private final void showMaterials(boolean animate) {
        Object obj;
        Iterator<T> it = this.graph.getRecords().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual(WeaponTreeLayout.INSTANCE.rawId((FieldRecord) obj), selectedId())) {
                    break;
                }
            }
        }
        FieldRecord fieldRecord = (FieldRecord) obj;
        if (fieldRecord == null) {
            return;
        }
        boolean z = this.materialHost.getVisibility() != 0 || this.materialHost.getAlpha() < 1.0f;
        this.materialVersion++;
        this.materialHost.animate().cancel();
        this.materialHost.removeAllViews();
        LinearLayout row = this.a.row();
        row.setPadding(this.a.dp((Number) 16), this.a.dp((Number) 13), this.a.dp((Number) 16), this.a.dp((Number) 13));
        TextView text$default = MainActivity.text$default(this.a, fieldRecord.getName(), this.compact ? 17.0f : 18.0f, true, 0, 8, null);
        text$default.setLineSpacing(0.0f, 1.5f);
        row.addView(text$default, new LinearLayout.LayoutParams(0, -2, 1.0f));
        FrameLayout iconButton = this.a.iconButton("close", "Close weapon materials", new Function0() { // from class: com.lumina.monsterhunterfieldbook.WeaponTreePanel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit showMaterials$lambda$3;
                showMaterials$lambda$3 = WeaponTreePanel.showMaterials$lambda$3(WeaponTreePanel.this);
                return showMaterials$lambda$3;
            }
        });
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.a.dp((Number) 36), this.a.dp((Number) 36));
        layoutParams.setMarginStart(this.a.dp((Number) 10));
        Unit unit = Unit.INSTANCE;
        row.addView(iconButton, layoutParams);
        this.materialHost.addView(row);
        this.a.rule(this.materialHost);
        ScrollView scrollView = new ScrollView(this.a);
        scrollView.setFillViewport(false);
        scrollView.setOverScrollMode(1);
        WeaponMaterialsView weaponMaterialsView = new WeaponMaterialsView(this.a, fieldRecord, this.state, true, new Function1() { // from class: com.lumina.monsterhunterfieldbook.WeaponTreePanel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit showMaterials$lambda$6;
                showMaterials$lambda$6 = WeaponTreePanel.showMaterials$lambda$6(WeaponTreePanel.this, (String) obj2);
                return showMaterials$lambda$6;
            }
        }, new Function1() { // from class: com.lumina.monsterhunterfieldbook.WeaponTreePanel$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit showMaterials$lambda$7;
                showMaterials$lambda$7 = WeaponTreePanel.showMaterials$lambda$7(WeaponTreePanel.this, (String) obj2);
                return showMaterials$lambda$7;
            }
        });
        int dp = this.a.dp(Integer.valueOf(this.compact ? 14 : 18));
        weaponMaterialsView.setPadding(dp, dp, dp, dp);
        scrollView.addView(weaponMaterialsView, new FrameLayout.LayoutParams(-1, -2));
        this.materialHost.addView(scrollView, new LinearLayout.LayoutParams(-1, -2));
        this.materialHost.setVisibility(0);
        this.materialHost.setEnabled(true);
        this.materialHost.setAlpha(1.0f);
        this.materialHost.setTranslationY(0.0f);
        if (z && animate && this.a.motionDuration(170L) > 0) {
            this.materialHost.setAlpha(0.0f);
            this.materialHost.setTranslationY(units(5.0f));
            this.materialHost.animate().alpha(1.0f).translationY(0.0f).setDuration(this.a.motionDuration(170L)).setInterpolator(new DecelerateInterpolator()).start();
        }
        this.materialHost.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showMaterials$lambda$3(WeaponTreePanel weaponTreePanel) {
        weaponTreePanel.closeMaterials();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showMaterials$lambda$6(WeaponTreePanel weaponTreePanel, String parentId) {
        Object obj;
        Intrinsics.checkNotNullParameter(parentId, "parentId");
        Iterator<T> it = weaponTreePanel.graph.getRecords().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(WeaponTreeLayout.INSTANCE.rawId((FieldRecord) obj), parentId)) {
                break;
            }
        }
        FieldRecord fieldRecord = (FieldRecord) obj;
        if (fieldRecord != null) {
            weaponTreePanel.select(fieldRecord);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showMaterials$lambda$7(WeaponTreePanel weaponTreePanel, String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        weaponTreePanel.onInfo.invoke(id);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideMaterials(boolean animate) {
        final int i = this.materialVersion + 1;
        this.materialVersion = i;
        this.materialHost.animate().cancel();
        if (this.materialHost.getVisibility() != 0) {
            return;
        }
        this.materialHost.setEnabled(false);
        if (!animate || this.a.motionDuration(140L) == 0) {
            this.materialHost.setVisibility(8);
            this.materialHost.setAlpha(1.0f);
        } else {
            this.materialHost.animate().alpha(0.0f).setDuration(this.a.motionDuration(140L)).setInterpolator(new DecelerateInterpolator()).withEndAction(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.WeaponTreePanel$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    WeaponTreePanel.hideMaterials$lambda$0(i, this);
                }
            }).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideMaterials$lambda$0(int i, WeaponTreePanel weaponTreePanel) {
        if (i == weaponTreePanel.materialVersion) {
            weaponTreePanel.materialHost.setVisibility(8);
            weaponTreePanel.materialHost.setAlpha(1.0f);
        }
    }

    /* compiled from: WeaponTreePanel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/WeaponTreePanel$MaterialHost;", "Landroid/widget/LinearLayout;", "<init>", "(Lcom/lumina/monsterhunterfieldbook/WeaponTreePanel;)V", "onMeasure", "", "widthMeasureSpec", "", "heightMeasureSpec", "dispatchTouchEvent", "", "event", "Landroid/view/MotionEvent;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private final class MaterialHost extends LinearLayout {
        public MaterialHost() {
            super(WeaponTreePanel.this.a);
            setOrientation(1);
            setElevation(WeaponTreePanel.this.a.dp((Number) 7));
            setClipToOutline(true);
            GradientDrawable surface = WeaponTreePanel.this.a.surface(WeaponTreePanel.this.a.getPanel(), false, 5.0f);
            surface.setStroke(WeaponTreePanel.this.a.dp((Number) 1), FieldViewsKt.alphaColour(WeaponTreePanel.this.a.getAccent(), 102));
            setBackground(surface);
            setAccessibilityLiveRegion(1);
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(RangesKt.coerceAtLeast(MathKt.roundToInt((WeaponTreePanel.this.shell.getHeight() > 0 ? WeaponTreePanel.this.shell.getHeight() : View.MeasureSpec.getSize(heightMeasureSpec)) * (WeaponTreePanel.this.compact ? 0.56f : 0.52f)), 0), IntCompanionObject.MIN_VALUE));
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (isEnabled()) {
                return super.dispatchTouchEvent(event);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WeaponTreePanel.kt */
    @Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001b\u001a\u00020\u0019J(\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000bH\u0014J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#H\u0014J\u0010\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0016J\u001a\u0010'\u001a\u0014\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)0(H\u0002J\b\u0010*\u001a\u00020\u0019H\u0002J \u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020)H\u0002J\u001a\u0010/\u001a\u0004\u0018\u00010\u00152\u0006\u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020)H\u0002J\u0010\u00100\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0016J\b\u00101\u001a\u00020\u0011H\u0016J\u0010\u00102\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0016J\u0018\u00103\u001a\u00020\u00112\u0006\u00104\u001a\u00020\u000b2\u0006\u0010%\u001a\u000205H\u0016J\u0010\u00106\u001a\u00020\u00192\u0006\u00107\u001a\u000208H\u0016J\u001a\u00109\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u000b2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016R\u0012\u0010\u0004\u001a\u00060\u0005R\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/lumina/monsterhunterfieldbook/WeaponTreePanel$TreeViewport;", "Landroid/widget/FrameLayout;", "<init>", "(Lcom/lumina/monsterhunterfieldbook/WeaponTreePanel;)V", "drawing", "Lcom/lumina/monsterhunterfieldbook/WeaponTreePanel$TreeDrawing;", "Lcom/lumina/monsterhunterfieldbook/WeaponTreePanel;", "gridPaint", "Landroid/graphics/Paint;", "points", "Ljava/util/LinkedHashMap;", "", "Landroid/graphics/PointF;", "Lkotlin/collections/LinkedHashMap;", "gesture", "Lcom/lumina/monsterhunterfieldbook/WeaponTreePanel$TreeGesture;", "suppressed", "", "lastDrag", "", "pressedNode", "Landroid/view/View;", "lastBackgroundTap", "lastBackgroundPoint", "populate", "", "updateSelection", "updateTransform", "onSizeChanged", "w", "h", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onInterceptTouchEvent", "event", "Landroid/view/MotionEvent;", "midpoint", "Lkotlin/Triple;", "", "beginGesture", "setView", "zoom", "x", "y", "hitNode", "onTouchEvent", "performClick", "onGenericMotionEvent", "onKeyDown", "keyCode", "Landroid/view/KeyEvent;", "onInitializeAccessibilityNodeInfo", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "performAccessibilityAction", "action", "arguments", "Landroid/os/Bundle;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    final class TreeViewport extends FrameLayout {
        private final TreeDrawing drawing;
        private TreeGesture gesture;
        private final Paint gridPaint;
        private PointF lastBackgroundPoint;
        private long lastBackgroundTap;
        private long lastDrag;
        private final LinkedHashMap<Integer, PointF> points;
        private View pressedNode;
        private boolean suppressed;

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            return true;
        }

        public TreeViewport() {
            super(WeaponTreePanel.this.a);
            TreeDrawing treeDrawing = WeaponTreePanel.this.new TreeDrawing();
            this.drawing = treeDrawing;
            Paint paint = new Paint(1);
            paint.setColor(WeaponTreePanel.this.a.getLine());
            this.gridPaint = paint;
            this.points = new LinkedHashMap<>();
            this.lastDrag = -350L;
            this.lastBackgroundPoint = new PointF();
            setWillNotDraw(false);
            setClipChildren(true);
            setClipToPadding(true);
            setFocusable(true);
            setClickable(true);
            setImportantForAccessibility(1);
            setContentDescription("Weapon family tree. Pinch to zoom and drag to pan.");
            addView(treeDrawing);
        }

        public final void populate() {
            this.drawing.populate();
            this.drawing.setLayoutParams(new FrameLayout.LayoutParams(WeaponTreePanel.this.a.dp(Float.valueOf(WeaponTreePanel.this.graph.getWidth())), WeaponTreePanel.this.a.dp(Float.valueOf(WeaponTreePanel.this.graph.getHeight()))));
            if (WeaponTreePanel.this.getState().optBoolean("treeInitialized")) {
                updateTransform();
            } else {
                final WeaponTreePanel weaponTreePanel = WeaponTreePanel.this;
                post(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeViewport$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        WeaponTreePanel.TreeViewport.populate$lambda$0(WeaponTreePanel.TreeViewport.this, weaponTreePanel);
                    }
                });
            }
            requestLayout();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void populate$lambda$0(TreeViewport treeViewport, WeaponTreePanel weaponTreePanel) {
            if (treeViewport.getWidth() <= 0 || treeViewport.getHeight() <= 0) {
                return;
            }
            weaponTreePanel.resetViewport();
        }

        public final void updateSelection() {
            this.drawing.updateSelection();
        }

        public final void updateTransform() {
            JSONObject treeState = WeaponTreePanel.this.treeState();
            Float valueOf = Float.valueOf((float) treeState.optDouble("zoom", 1.0d));
            if (Math.abs(valueOf.floatValue()) > Float.MAX_VALUE) {
                valueOf = null;
            }
            float coerceIn = valueOf != null ? RangesKt.coerceIn(valueOf.floatValue(), 0.5f, 6.0f) : 1.0f;
            float f = 0.5f * coerceIn;
            Float valueOf2 = Float.valueOf((float) treeState.optDouble("x", 16.0d));
            if (Math.abs(valueOf2.floatValue()) > Float.MAX_VALUE) {
                valueOf2 = null;
            }
            float floatValue = valueOf2 != null ? valueOf2.floatValue() : 16.0f;
            Float valueOf3 = Float.valueOf((float) treeState.optDouble("y", 16.0d));
            Float f2 = Math.abs(valueOf3.floatValue()) <= Float.MAX_VALUE ? valueOf3 : null;
            float floatValue2 = f2 != null ? f2.floatValue() : 16.0f;
            if (getWidth() > 0) {
                floatValue = WeaponTreeLayout.INSTANCE.clampPan(floatValue, getWidth() / WeaponTreePanel.this.density, WeaponTreePanel.this.graph.getWidth() * f);
            }
            if (getHeight() > 0) {
                floatValue2 = WeaponTreeLayout.INSTANCE.clampPan(floatValue2, getHeight() / WeaponTreePanel.this.density, WeaponTreePanel.this.graph.getHeight() * f);
            }
            treeState.put("zoom", Float.valueOf(coerceIn)).put("x", Float.valueOf(floatValue)).put("y", Float.valueOf(floatValue2));
            this.drawing.setPivotX(0.0f);
            this.drawing.setPivotY(0.0f);
            this.drawing.setScaleX(f);
            this.drawing.setScaleY(f);
            this.drawing.setTranslationX(WeaponTreePanel.this.units(floatValue));
            this.drawing.setTranslationY(WeaponTreePanel.this.units(floatValue2));
            int roundToInt = MathKt.roundToInt(coerceIn * 100);
            WeaponTreePanel.this.zoomLabel.setText(roundToInt + "%");
            WeaponTreePanel.this.zoomLabel.setContentDescription("Tree zoom, " + roundToInt + " percent");
            invalidate();
        }

        @Override // android.view.View
        protected void onSizeChanged(int w, int h, int oldw, int oldh) {
            super.onSizeChanged(w, h, oldw, oldh);
            if (w <= 0 || h <= 0) {
                return;
            }
            if (WeaponTreePanel.this.getState().optBoolean("treeInitialized")) {
                updateTransform();
            } else {
                WeaponTreePanel.this.resetViewport();
            }
            WeaponTreePanel.this.materialHost.requestLayout();
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            super.onDraw(canvas);
            float units = WeaponTreePanel.this.units(20.0f);
            for (float units2 = WeaponTreePanel.this.units(1.0f); units2 < getWidth(); units2 += units) {
                for (float units3 = WeaponTreePanel.this.units(1.0f); units3 < getHeight(); units3 += units) {
                    canvas.drawCircle(units2, units3, WeaponTreePanel.this.units(0.75f), this.gridPaint);
                }
            }
        }

        private final Triple<Float, Float, Float> midpoint() {
            Collection<PointF> values = this.points.values();
            Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
            PointF pointF = (PointF) CollectionsKt.firstOrNull(values);
            Float valueOf = Float.valueOf(0.0f);
            if (pointF == null) {
                return new Triple<>(valueOf, valueOf, valueOf);
            }
            Collection<PointF> values2 = this.points.values();
            Intrinsics.checkNotNullExpressionValue(values2, "<get-values>(...)");
            PointF pointF2 = (PointF) CollectionsKt.firstOrNull(CollectionsKt.drop(values2, 1));
            return pointF2 == null ? new Triple<>(Float.valueOf(pointF.x), Float.valueOf(pointF.y), valueOf) : new Triple<>(Float.valueOf((pointF.x + pointF2.x) / 2.0f), Float.valueOf((pointF.y + pointF2.y) / 2.0f), Float.valueOf((float) Math.hypot(pointF.x - pointF2.x, pointF.y - pointF2.y)));
        }

        private final void beginGesture() {
            if (this.points.isEmpty()) {
                this.gesture = null;
                return;
            }
            Triple<Float, Float, Float> midpoint = midpoint();
            float floatValue = midpoint.component1().floatValue();
            float floatValue2 = midpoint.component2().floatValue();
            float floatValue3 = midpoint.component3().floatValue();
            JSONObject treeState = WeaponTreePanel.this.treeState();
            this.gesture = new TreeGesture(WeaponTreePanel.this.logicalZoom(), (float) treeState.optDouble("x", 16.0d), (float) treeState.optDouble("y", 16.0d), floatValue, floatValue2, floatValue3);
        }

        private final void setView(float zoom, float x, float y) {
            WeaponTreePanel.this.treeState().put("zoom", Float.valueOf(zoom)).put("x", Float.valueOf(x)).put("y", Float.valueOf(y));
            WeaponTreePanel.this.getState().put("treeInitialized", true);
            updateTransform();
        }

        private final View hitNode(float x, float y) {
            FieldRecord fieldRecord;
            JSONObject treeState = WeaponTreePanel.this.treeState();
            float logicalZoom = WeaponTreePanel.this.logicalZoom() * 0.5f;
            float optDouble = (x - ((float) treeState.optDouble("x", 16.0d))) / logicalZoom;
            float optDouble2 = (y - ((float) treeState.optDouble("y", 16.0d))) / logicalZoom;
            List<FieldRecord> records = WeaponTreePanel.this.graph.getRecords();
            WeaponTreePanel weaponTreePanel = WeaponTreePanel.this;
            ListIterator<FieldRecord> listIterator = records.listIterator(records.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    fieldRecord = null;
                    break;
                }
                fieldRecord = listIterator.previous();
                WeaponTreeLayout.Position position = weaponTreePanel.graph.getPositions().get(WeaponTreeLayout.INSTANCE.rawId(fieldRecord));
                if (position != null && optDouble >= position.getX() && optDouble <= position.getX() + 232.0f && optDouble2 >= position.getY() && optDouble2 <= position.getY() + 88.0f) {
                    break;
                }
            }
            FieldRecord fieldRecord2 = fieldRecord;
            if (fieldRecord2 == null) {
                return null;
            }
            return this.drawing.getNodes().get(WeaponTreeLayout.INSTANCE.rawId(fieldRecord2));
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            int actionMasked = event.getActionMasked();
            View view = null;
            if (actionMasked == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.points.clear();
                this.suppressed = false;
                this.points.put(Integer.valueOf(event.getPointerId(0)), new PointF(event.getX() / WeaponTreePanel.this.density, event.getY() / WeaponTreePanel.this.density));
                View hitNode = hitNode(event.getX() / WeaponTreePanel.this.density, event.getY() / WeaponTreePanel.this.density);
                if (hitNode != null) {
                    hitNode.setPressed(true);
                    view = hitNode;
                }
                this.pressedNode = view;
                beginGesture();
            } else if (actionMasked == 1) {
                View hitNode2 = hitNode(event.getX() / WeaponTreePanel.this.density, event.getY() / WeaponTreePanel.this.density);
                View view2 = this.pressedNode;
                if (view2 != null) {
                    view2.setPressed(false);
                }
                if (!this.suppressed && SystemClock.uptimeMillis() - this.lastDrag >= 350) {
                    if (hitNode2 != null && hitNode2 == this.pressedNode) {
                        hitNode2.performClick();
                        this.lastBackgroundTap = 0L;
                    } else if (hitNode2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        float x = event.getX() / WeaponTreePanel.this.density;
                        float y = event.getY() / WeaponTreePanel.this.density;
                        long j = this.lastBackgroundTap;
                        if (j > 0 && uptimeMillis - j <= ViewConfiguration.getDoubleTapTimeout() && ((float) Math.hypot(x - this.lastBackgroundPoint.x, y - this.lastBackgroundPoint.y)) < 40.0f) {
                            setView(WeaponTreePanel.this.logicalZoom() == 1.0f ? 2.0f : 1.0f, 0.0f, 0.0f);
                            this.lastBackgroundTap = 0L;
                        } else {
                            WeaponTreePanel.this.closeMaterials();
                            this.lastBackgroundTap = uptimeMillis;
                            this.lastBackgroundPoint = new PointF(x, y);
                        }
                        performClick();
                    }
                }
                this.pressedNode = null;
                this.points.clear();
                this.gesture = null;
                getParent().requestDisallowInterceptTouchEvent(false);
            } else if (actionMasked == 2) {
                int pointerCount = event.getPointerCount();
                for (int i = 0; i < pointerCount; i++) {
                    int pointerId = event.getPointerId(i);
                    if (this.points.containsKey(Integer.valueOf(pointerId))) {
                        this.points.put(Integer.valueOf(pointerId), new PointF(event.getX(i) / WeaponTreePanel.this.density, event.getY(i) / WeaponTreePanel.this.density));
                    }
                }
                TreeGesture treeGesture = this.gesture;
                if (treeGesture != null) {
                    Triple<Float, Float, Float> midpoint = midpoint();
                    float floatValue = midpoint.component1().floatValue();
                    float floatValue2 = midpoint.component2().floatValue();
                    float floatValue3 = midpoint.component3().floatValue();
                    float zoom = treeGesture.getZoom();
                    float x2 = (treeGesture.getX() + floatValue) - treeGesture.getMidX();
                    float y2 = (treeGesture.getY() + floatValue2) - treeGesture.getMidY();
                    if (this.points.size() > 1 && treeGesture.getDistance() > 0.0f) {
                        zoom = RangesKt.coerceIn((treeGesture.getZoom() * floatValue3) / treeGesture.getDistance(), 0.5f, 6.0f);
                        float zoom2 = zoom / treeGesture.getZoom();
                        x2 = floatValue - ((treeGesture.getMidX() - treeGesture.getX()) * zoom2);
                        y2 = floatValue2 - ((treeGesture.getMidY() - treeGesture.getY()) * zoom2);
                    }
                    if (((float) Math.hypot(floatValue - treeGesture.getMidX(), floatValue2 - treeGesture.getMidY())) > 5.0f || this.points.size() > 1) {
                        this.suppressed = true;
                        this.lastDrag = SystemClock.uptimeMillis();
                        View view3 = this.pressedNode;
                        if (view3 != null) {
                            view3.setPressed(false);
                        }
                    }
                    setView(zoom, x2, y2);
                }
            } else if (actionMasked == 3) {
                View view4 = this.pressedNode;
                if (view4 != null) {
                    view4.setPressed(false);
                }
                this.pressedNode = null;
                this.points.clear();
                this.gesture = null;
                this.suppressed = true;
                getParent().requestDisallowInterceptTouchEvent(false);
            } else if (actionMasked == 5) {
                int pointerCount2 = event.getPointerCount();
                for (int i2 = 0; i2 < pointerCount2; i2++) {
                    this.points.put(Integer.valueOf(event.getPointerId(i2)), new PointF(event.getX(i2) / WeaponTreePanel.this.density, event.getY(i2) / WeaponTreePanel.this.density));
                }
                this.suppressed = true;
                this.lastDrag = SystemClock.uptimeMillis();
                View view5 = this.pressedNode;
                if (view5 != null) {
                    view5.setPressed(false);
                }
                beginGesture();
            } else if (actionMasked == 6) {
                this.points.remove(Integer.valueOf(event.getPointerId(event.getActionIndex())));
                int pointerCount3 = event.getPointerCount();
                for (int i3 = 0; i3 < pointerCount3; i3++) {
                    if (i3 != event.getActionIndex()) {
                        int pointerId2 = event.getPointerId(i3);
                        if (this.points.containsKey(Integer.valueOf(pointerId2))) {
                            this.points.put(Integer.valueOf(pointerId2), new PointF(event.getX(i3) / WeaponTreePanel.this.density, event.getY(i3) / WeaponTreePanel.this.density));
                        }
                    }
                }
                beginGesture();
            }
            return true;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return true;
        }

        @Override // android.view.View
        public boolean onGenericMotionEvent(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (event.getAction() == 8 && (event.getMetaState() & 69632) != 0) {
                JSONObject treeState = WeaponTreePanel.this.treeState();
                setView(RangesKt.coerceIn(WeaponTreePanel.this.logicalZoom() * ((float) Math.exp(event.getAxisValue(9) * 0.3f)), 0.5f, 6.0f), (float) treeState.optDouble("x", 16.0d), (float) treeState.optDouble("y", 16.0d));
                return true;
            }
            return super.onGenericMotionEvent(event);
        }

        @Override // android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int keyCode, KeyEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            JSONObject treeState = WeaponTreePanel.this.treeState();
            float logicalZoom = WeaponTreePanel.this.logicalZoom();
            float optDouble = (float) treeState.optDouble("x", 16.0d);
            float optDouble2 = (float) treeState.optDouble("y", 16.0d);
            if (keyCode != 7) {
                if (keyCode != 81) {
                    if (keyCode != 144) {
                        if (keyCode != 69) {
                            if (keyCode != 70) {
                                if (keyCode != 156) {
                                    if (keyCode != 157) {
                                        switch (keyCode) {
                                            case 19:
                                                optDouble2 += 50.0f;
                                                break;
                                            case 20:
                                                optDouble2 -= 50.0f;
                                                break;
                                            case 21:
                                                optDouble += 50.0f;
                                                break;
                                            case 22:
                                                optDouble -= 50.0f;
                                                break;
                                            default:
                                                return super.onKeyDown(keyCode, event);
                                        }
                                        setView(logicalZoom, optDouble, optDouble2);
                                        return true;
                                    }
                                }
                            }
                        }
                        logicalZoom = Math.max(0.5f, logicalZoom - 0.25f);
                        setView(logicalZoom, optDouble, optDouble2);
                        return true;
                    }
                }
                logicalZoom = Math.min(6.0f, logicalZoom + 0.25f);
                setView(logicalZoom, optDouble, optDouble2);
                return true;
            }
            optDouble = 0.0f;
            logicalZoom = 1.0f;
            optDouble2 = 0.0f;
            setView(logicalZoom, optDouble, optDouble2);
            return true;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            super.onInitializeAccessibilityNodeInfo(info);
            info.addAction(new AccessibilityNodeInfo.AccessibilityAction(android.R.attr.label, "Zoom in"));
            info.addAction(new AccessibilityNodeInfo.AccessibilityAction(android.R.attr.icon, "Zoom out"));
            info.addAction(new AccessibilityNodeInfo.AccessibilityAction(android.R.attr.name, "Reset view"));
        }

        @Override // android.view.View
        public boolean performAccessibilityAction(int action, Bundle arguments) {
            if (action != 16842755) {
                switch (action) {
                    case android.R.attr.label:
                    case android.R.attr.icon:
                        JSONObject treeState = WeaponTreePanel.this.treeState();
                        setView(RangesKt.coerceIn(WeaponTreePanel.this.logicalZoom() + (action == 16842753 ? 0.25f : -0.25f), 0.5f, 6.0f), (float) treeState.optDouble("x", 16.0d), (float) treeState.optDouble("y", 16.0d));
                        return true;
                    default:
                        return super.performAccessibilityAction(action, arguments);
                }
            }
            WeaponTreePanel.this.resetViewport();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WeaponTreePanel.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000f\u001a\u00020\u0010J0\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006H\u0002J\u0006\u0010\u0019\u001a\u00020\u0010J\u0018\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0016H\u0014J0\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u0016H\u0014J\u0010\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020&H\u0014R-\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/WeaponTreePanel$TreeDrawing;", "Landroid/view/ViewGroup;", "<init>", "(Lcom/lumina/monsterhunterfieldbook/WeaponTreePanel;)V", "nodes", "Ljava/util/LinkedHashMap;", "", "Landroid/view/View;", "Lkotlin/collections/LinkedHashMap;", "getNodes", "()Ljava/util/LinkedHashMap;", "edgePaint", "Landroid/graphics/Paint;", "path", "Landroid/graphics/Path;", "populate", "", "addIcon", "parent", "Landroid/widget/LinearLayout;", "asset", "width", "", "height", "label", "updateSelection", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "left", "top", "right", "bottom", "onDraw", "canvas", "Landroid/graphics/Canvas;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    final class TreeDrawing extends ViewGroup {
        private final Paint edgePaint;
        private final LinkedHashMap<String, View> nodes;
        private final Path path;

        public TreeDrawing() {
            super(WeaponTreePanel.this.a);
            this.nodes = new LinkedHashMap<>();
            Paint paint = new Paint(1);
            paint.setColor(FieldViewsKt.alphaColour(WeaponTreePanel.this.a.getAccent(), 102));
            paint.setStrokeWidth(WeaponTreePanel.this.units(1.5f));
            paint.setStyle(Paint.Style.STROKE);
            this.edgePaint = paint;
            this.path = new Path();
            setWillNotDraw(false);
            setClipChildren(false);
            setImportantForAccessibility(2);
        }

        public final LinkedHashMap<String, View> getNodes() {
            return this.nodes;
        }

        /* JADX WARN: Code restructure failed: missing block: B:61:0x0279, code lost:
        
            if (r0.equals("paralyzed") == false) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x02a8, code lost:
        
            r0 = "paralysis";
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0283, code lost:
        
            if (r0.equals("paralysed") == false) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x028d, code lost:
        
            if (r0.equals("blastscourge") == false) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x02f0, code lost:
        
            r0 = "blast";
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x02a5, code lost:
        
            if (r0.equals("paralyze") == false) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x02ed, code lost:
        
            if (r0.equals("blastblight") == false) goto L105;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void populate() {
            LinearLayout linearLayout;
            JSONObject optJSONObject;
            JSONObject optJSONObject2;
            JSONObject optJSONObject3;
            JSONObject optJSONObject4;
            String str;
            TreeDrawing treeDrawing = this;
            treeDrawing.removeAllViews();
            treeDrawing.nodes.clear();
            List<FieldRecord> records = WeaponTreePanel.this.graph.getRecords();
            final WeaponTreePanel weaponTreePanel = WeaponTreePanel.this;
            for (final FieldRecord fieldRecord : records) {
                JSONObject data = WeaponModel.INSTANCE.data(fieldRecord);
                JSONArray optJSONArray = data.optJSONArray("elements");
                IntRange until = RangesKt.until(0, optJSONArray != null ? optJSONArray.length() : 0);
                ArrayList arrayList = new ArrayList();
                Iterator<Integer> it = until.iterator();
                while (it.hasNext()) {
                    Object opt = optJSONArray != null ? optJSONArray.opt(((IntIterator) it).nextInt()) : null;
                    if (opt instanceof String) {
                        str = (String) opt;
                    } else if (opt instanceof JSONObject) {
                        JSONObject jSONObject = (JSONObject) opt;
                        String optString = jSONObject.optString("type");
                        if (StringsKt.isBlank(optString)) {
                            optString = jSONObject.optString("name");
                        }
                        str = optString;
                    } else {
                        str = null;
                    }
                    String str2 = (str == null || StringsKt.isBlank(str)) ? null : str;
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                }
                ArrayList<String> arrayList2 = arrayList;
                LinearLayout row = weaponTreePanel.a.row();
                row.setPadding(weaponTreePanel.a.dp((Number) 13), weaponTreePanel.a.dp((Number) 12), weaponTreePanel.a.dp((Number) 13), weaponTreePanel.a.dp((Number) 12));
                row.setGravity(16);
                row.setContentDescription(fieldRecord.getName() + ", rarity " + data.optInt("rarity", 1) + (arrayList2.isEmpty() ? "" : ", " + CollectionsKt.joinToString$default(arrayList2, ", ", null, null, 0, null, null, 62, null)));
                row.setImportantForAccessibility(1);
                row.setDescendantFocusability(393216);
                row.setFocusable(true);
                row.setClickable(true);
                row.setOnClickListener(new View.OnClickListener() { // from class: com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeDrawing$$ExternalSyntheticLambda1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        WeaponTreePanel.access$select(WeaponTreePanel.this, fieldRecord);
                    }
                });
                TextView text$default = MainActivity.text$default(weaponTreePanel.a, fieldRecord.getName(), 20.0f, false, 0, 12, null);
                text$default.setTextSize(RangesKt.coerceIn((weaponTreePanel.a.getPrefs().number("font", 100) * 20.0f) / 100.0f, 16.0f, 27.0f));
                text$default.setMaxLines(3);
                text$default.setEllipsize(TextUtils.TruncateAt.END);
                text$default.setLineSpacing(0.0f, 1.35f);
                text$default.setImportantForAccessibility(2);
                row.addView(text$default, new LinearLayout.LayoutParams(0, -2, 1.0f));
                LinearLayout row2 = weaponTreePanel.a.row();
                row2.setImportantForAccessibility(4);
                JSONObject optJSONObject5 = weaponTreePanel.a.getLibraryData().optJSONObject("nativeVisuals");
                String image = fieldRecord.getImage();
                if (StringsKt.isBlank(image)) {
                    image = (optJSONObject5 == null || (optJSONObject2 = optJSONObject5.optJSONObject("weaponTypes")) == null || (optJSONObject3 = optJSONObject2.optJSONObject(data.optString("type"))) == null || (optJSONObject4 = optJSONObject3.optJSONObject("rarityIcons")) == null) ? null : optJSONObject4.optString(String.valueOf(RangesKt.coerceIn(data.optInt("rarity", 1), 1, 12)));
                    if (image == null) {
                        image = "";
                    }
                }
                String str3 = image;
                if (StringsKt.isBlank(str3)) {
                    linearLayout = row2;
                } else {
                    String str4 = "Rarity " + data.optInt("rarity", 1);
                    linearLayout = row2;
                    treeDrawing.addIcon(linearLayout, str3, 30, 32, str4);
                }
                for (String str5 : arrayList2) {
                    String lowerCase = str5.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    String replace = new Regex("[\\s_-]").replace(lowerCase, "");
                    switch (replace.hashCode()) {
                        case -2007407553:
                            if (replace.equals("iceblight")) {
                                replace = "ice";
                                break;
                            }
                            break;
                        case -1941022228:
                            break;
                        case -302630242:
                            if (replace.equals("exhaustion")) {
                                replace = "exhaust";
                                break;
                            }
                            break;
                        case -204597334:
                            if (replace.equals("fireblight")) {
                                replace = "fire";
                                break;
                            }
                            break;
                        case -108608057:
                            if (replace.equals("dragonblight")) {
                                replace = "dragon";
                                break;
                            }
                            break;
                        case 3428:
                            if (replace.equals("ko")) {
                                replace = "stun";
                                break;
                            }
                            break;
                        case 752908747:
                            if (replace.equals("waterblight")) {
                                replace = "water";
                                break;
                            }
                            break;
                        case 1171415384:
                            break;
                        case 1511326680:
                            if (replace.equals("thunderblight")) {
                                replace = "thunder";
                                break;
                            }
                            break;
                        case 1908818914:
                            break;
                        case 1954131909:
                            break;
                        case 1954138636:
                            break;
                    }
                    String optString2 = (optJSONObject5 == null || (optJSONObject = optJSONObject5.optJSONObject("effects")) == null) ? null : optJSONObject.optString(replace);
                    String str6 = optString2 == null ? "" : optString2;
                    if (!StringsKt.isBlank(str6)) {
                        addIcon(linearLayout, str6, 24, 27, str5);
                    }
                }
                treeDrawing = this;
                LinearLayout linearLayout2 = linearLayout;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMarginStart(weaponTreePanel.a.dp((Number) 12));
                Unit unit = Unit.INSTANCE;
                row.addView(linearLayout2, layoutParams);
                treeDrawing.addView(row, new ViewGroup.LayoutParams(weaponTreePanel.a.dp(Float.valueOf(232.0f)), weaponTreePanel.a.dp(Float.valueOf(88.0f))));
                treeDrawing.nodes.put(WeaponTreeLayout.INSTANCE.rawId(fieldRecord), row);
            }
            treeDrawing.updateSelection();
            treeDrawing.requestLayout();
            treeDrawing.invalidate();
        }

        private final void addIcon(LinearLayout parent, final String asset, int width, int height, String label) {
            ImageView imageView = new ImageView(WeaponTreePanel.this.a);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setContentDescription(label);
            imageView.setTag(asset);
            ImageView imageView2 = imageView;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(WeaponTreePanel.this.a.dp(Integer.valueOf(width)), WeaponTreePanel.this.a.dp(Integer.valueOf(height)));
            WeaponTreePanel weaponTreePanel = WeaponTreePanel.this;
            if (parent.getChildCount() > 0) {
                layoutParams.setMarginStart(weaponTreePanel.a.dp((Number) 8));
            }
            Unit unit = Unit.INSTANCE;
            parent.addView(imageView2, layoutParams);
            Map map = WeaponTreePanel.this.pendingIcons;
            Object obj = map.get(asset);
            if (obj == null) {
                obj = (List) new ArrayList();
                map.put(asset, obj);
            }
            List list = (List) obj;
            list.add(imageView);
            if (list.size() == 1) {
                MainActivity mainActivity = WeaponTreePanel.this.a;
                final WeaponTreePanel weaponTreePanel2 = WeaponTreePanel.this;
                mainActivity.loadBitmap(asset, new Function1() { // from class: com.lumina.monsterhunterfieldbook.WeaponTreePanel$TreeDrawing$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit addIcon$lambda$3;
                        addIcon$lambda$3 = WeaponTreePanel.TreeDrawing.addIcon$lambda$3(WeaponTreePanel.this, asset, (Bitmap) obj2);
                        return addIcon$lambda$3;
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit addIcon$lambda$3(WeaponTreePanel weaponTreePanel, String str, Bitmap bitmap) {
            List<ImageView> list = (List) weaponTreePanel.pendingIcons.remove(str);
            if (list != null) {
                for (ImageView imageView : list) {
                    if (bitmap != null && Intrinsics.areEqual(imageView.getTag(), str)) {
                        imageView.setImageBitmap(bitmap);
                    }
                }
            }
            return Unit.INSTANCE;
        }

        public final void updateSelection() {
            Drawable drawable;
            List<FieldRecord> records = WeaponTreePanel.this.graph.getRecords();
            WeaponTreePanel weaponTreePanel = WeaponTreePanel.this;
            for (FieldRecord fieldRecord : records) {
                String rawId = WeaponTreeLayout.INSTANCE.rawId(fieldRecord);
                View view = this.nodes.get(rawId);
                if (view != null) {
                    boolean areEqual = Intrinsics.areEqual(rawId, weaponTreePanel.selectedId());
                    view.setSelected(areEqual);
                    JSONObject data = WeaponModel.INSTANCE.data(fieldRecord);
                    boolean z = data.optJSONObject("forge") == null && data.optJSONObject("upgrade") == null;
                    int parseColor = Intrinsics.areEqual(weaponTreePanel.a.getPrefs().text("theme", "game"), "game") ? Color.parseColor(weaponTreePanel.a.isIce() ? "#172938" : "#1b271f") : FieldViewsKt.blend(weaponTreePanel.a.getBg(), weaponTreePanel.a.getInk(), 0.075f);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(parseColor);
                    gradientDrawable.setCornerRadius(weaponTreePanel.units(3.0f));
                    if (z) {
                        gradientDrawable.setStroke(weaponTreePanel.a.dp((Number) 1), areEqual ? weaponTreePanel.a.getAccent() : weaponTreePanel.a.getLine(), weaponTreePanel.units(5.0f), weaponTreePanel.units(4.0f));
                    } else {
                        gradientDrawable.setStroke(weaponTreePanel.a.dp((Number) 1), areEqual ? weaponTreePanel.a.getAccent() : weaponTreePanel.a.getLine());
                    }
                    if (!Intrinsics.areEqual(weaponTreePanel.a.getPrefs().text("touch", "ripple"), "none") && weaponTreePanel.a.motionDuration(170L) > 0) {
                        GradientDrawable gradientDrawable2 = new GradientDrawable();
                        gradientDrawable2.setColor(-1);
                        gradientDrawable2.setCornerRadius(weaponTreePanel.units(3.0f));
                        Unit unit = Unit.INSTANCE;
                        drawable = new RippleDrawable(ColorStateList.valueOf(FieldViewsKt.alphaColour(weaponTreePanel.a.getAccent(), 60)), gradientDrawable, gradientDrawable2);
                    } else {
                        drawable = gradientDrawable;
                    }
                    view.setBackground(drawable);
                }
            }
        }

        @Override // android.view.View
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            int dp = WeaponTreePanel.this.a.dp(Float.valueOf(232.0f));
            int dp2 = WeaponTreePanel.this.a.dp(Float.valueOf(88.0f));
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).measure(View.MeasureSpec.makeMeasureSpec(dp, 1073741824), View.MeasureSpec.makeMeasureSpec(dp2, 1073741824));
            }
            setMeasuredDimension(WeaponTreePanel.this.a.dp(Float.valueOf(WeaponTreePanel.this.graph.getWidth())), WeaponTreePanel.this.a.dp(Float.valueOf(WeaponTreePanel.this.graph.getHeight())));
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
            WeaponTreeLayout.Position position;
            List<FieldRecord> records = WeaponTreePanel.this.graph.getRecords();
            WeaponTreePanel weaponTreePanel = WeaponTreePanel.this;
            Iterator<T> it = records.iterator();
            while (it.hasNext()) {
                String rawId = WeaponTreeLayout.INSTANCE.rawId((FieldRecord) it.next());
                View view = this.nodes.get(rawId);
                if (view != null && (position = weaponTreePanel.graph.getPositions().get(rawId)) != null) {
                    int dp = weaponTreePanel.a.dp(Float.valueOf(position.getX()));
                    int dp2 = weaponTreePanel.a.dp(Float.valueOf(position.getY()));
                    view.layout(dp, dp2, view.getMeasuredWidth() + dp, view.getMeasuredHeight() + dp2);
                }
            }
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            WeaponTreeLayout.Position position;
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            super.onDraw(canvas);
            this.path.rewind();
            List<FieldRecord> records = WeaponTreePanel.this.graph.getRecords();
            WeaponTreePanel weaponTreePanel = WeaponTreePanel.this;
            for (FieldRecord fieldRecord : records) {
                WeaponTreeLayout.Position position2 = weaponTreePanel.graph.getPositions().get(WeaponTreeLayout.INSTANCE.parentId(fieldRecord));
                if (position2 != null && (position = weaponTreePanel.graph.getPositions().get(WeaponTreeLayout.INSTANCE.rawId(fieldRecord))) != null) {
                    this.path.moveTo(weaponTreePanel.units(position2.getX() + 232.0f), weaponTreePanel.units(position2.getY() + 44.0f));
                    this.path.lineTo(weaponTreePanel.units(position2.getX() + 251.0f), weaponTreePanel.units(position2.getY() + 44.0f));
                    this.path.lineTo(weaponTreePanel.units(position2.getX() + 251.0f), weaponTreePanel.units(position.getY() + 44.0f));
                    this.path.lineTo(weaponTreePanel.units(position.getX()), weaponTreePanel.units(position.getY() + 44.0f));
                }
            }
            canvas.drawPath(this.path, this.edgePaint);
        }
    }
}
