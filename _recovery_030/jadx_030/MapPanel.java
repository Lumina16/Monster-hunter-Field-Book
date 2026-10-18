package com.lumina.monsterhunterfieldbook;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: MapPanel.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/MapPanel;", "Landroid/widget/LinearLayout;", "a", "Lcom/lumina/monsterhunterfieldbook/MainActivity;", "maps", "Lorg/json/JSONArray;", "stateKey", "", "<init>", "(Lcom/lumina/monsterhunterfieldbook/MainActivity;Lorg/json/JSONArray;Ljava/lang/String;)V", "canvas", "Lcom/lumina/monsterhunterfieldbook/ZoomMapView;", "caption", "Landroid/widget/TextView;", "baseToggle", "Landroid/widget/CheckBox;", "floorToggle", "generation", "", "index", "load", "", "save", "onDetachedFromWindow", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MapPanel extends LinearLayout {
    private final MainActivity a;
    private final CheckBox baseToggle;
    private final ZoomMapView canvas;
    private final TextView caption;
    private final CheckBox floorToggle;
    private int generation;
    private int index;
    private final JSONArray maps;
    private final String stateKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapPanel(MainActivity a, JSONArray maps, String stateKey) {
        super(a);
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(maps, "maps");
        Intrinsics.checkNotNullParameter(stateKey, "stateKey");
        this.a = a;
        this.maps = maps;
        this.stateKey = stateKey;
        this.canvas = new ZoomMapView(a);
        this.caption = MainActivity.text$default(a, "", 11.0f, false, a.getMuted(), 4, null);
        CheckBox checkBox = new CheckBox(a);
        checkBox.setText("Background");
        checkBox.setChecked(true);
        this.baseToggle = checkBox;
        CheckBox checkBox2 = new CheckBox(a);
        checkBox2.setText("Map layer");
        checkBox2.setChecked(true);
        this.floorToggle = checkBox2;
        this.index = RangesKt.coerceIn(a.getPrefs().number("mapFloor:" + stateKey, 0), 0, Math.max(0, maps.length() - 1));
        setOrientation(1);
        Spinner spinner = new Spinner(a);
        spinner.setContentDescription("Map floor");
        MainActivity mainActivity = a;
        IntRange until = RangesKt.until(0, maps.length());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            arrayList.add(this.maps.getJSONObject(nextInt).optString("title", this.maps.getJSONObject(nextInt).optString("name")));
        }
        spinner.setAdapter((SpinnerAdapter) new ArrayAdapter(mainActivity, android.R.layout.simple_spinner_dropdown_item, arrayList));
        spinner.setSelection(this.index);
        addView(spinner, new LinearLayout.LayoutParams(-1, this.a.dp((Number) 48)));
        LinearLayout row = this.a.row();
        row.addView(this.a.button("−", new Function0() { // from class: com.lumina.monsterhunterfieldbook.MapPanel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit _init_$lambda$1;
                _init_$lambda$1 = MapPanel._init_$lambda$1(MapPanel.this);
                return _init_$lambda$1;
            }
        }), new LinearLayout.LayoutParams(0, -2, 1.0f));
        row.addView(this.a.button("Reset", new Function0() { // from class: com.lumina.monsterhunterfieldbook.MapPanel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit _init_$lambda$2;
                _init_$lambda$2 = MapPanel._init_$lambda$2(MapPanel.this);
                return _init_$lambda$2;
            }
        }), new LinearLayout.LayoutParams(0, -2, 1.0f));
        row.addView(this.a.button("+", new Function0() { // from class: com.lumina.monsterhunterfieldbook.MapPanel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit _init_$lambda$3;
                _init_$lambda$3 = MapPanel._init_$lambda$3(MapPanel.this);
                return _init_$lambda$3;
            }
        }), new LinearLayout.LayoutParams(0, -2, 1.0f));
        addView(row);
        LinearLayout row2 = this.a.row();
        row2.addView(this.baseToggle);
        row2.addView(this.floorToggle);
        addView(row2);
        this.baseToggle.setTextColor(this.a.getInk());
        this.floorToggle.setTextColor(this.a.getInk());
        this.baseToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.lumina.monsterhunterfieldbook.MapPanel$$ExternalSyntheticLambda3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MapPanel._init_$lambda$4(MapPanel.this, compoundButton, z);
            }
        });
        this.floorToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.lumina.monsterhunterfieldbook.MapPanel$$ExternalSyntheticLambda4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MapPanel._init_$lambda$5(MapPanel.this, compoundButton, z);
            }
        });
        this.canvas.setOnChange(new Function0() { // from class: com.lumina.monsterhunterfieldbook.MapPanel$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit _init_$lambda$6;
                _init_$lambda$6 = MapPanel._init_$lambda$6(MapPanel.this);
                return _init_$lambda$6;
            }
        });
        addView(this.canvas, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        addView(this.caption);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.lumina.monsterhunterfieldbook.MapPanel.8
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> p) {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> p, View v, int position, long id) {
                MapPanel.this.index = position;
                MapPanel.this.a.getPrefs().set("mapFloor:" + MapPanel.this.stateKey, Integer.valueOf(position));
                MapPanel.this.load();
            }
        });
        load();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(MapPanel mapPanel) {
        mapPanel.canvas.zoom(0.8f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$2(MapPanel mapPanel) {
        mapPanel.canvas.reset();
        mapPanel.save();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$3(MapPanel mapPanel) {
        mapPanel.canvas.zoom(1.25f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(MapPanel mapPanel, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        mapPanel.canvas.setShowBase(z);
        mapPanel.canvas.invalidate();
        mapPanel.save();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(MapPanel mapPanel, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        mapPanel.canvas.setShowOverlay(z);
        mapPanel.canvas.invalidate();
        mapPanel.save();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$6(MapPanel mapPanel) {
        mapPanel.save();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void load() {
        Object m79constructorimpl;
        if (this.maps.length() == 0) {
            return;
        }
        JSONObject jSONObject = this.maps.getJSONObject(this.index);
        int i = this.generation + 1;
        this.generation = i;
        this.caption.setText(jSONObject.optString("description"));
        this.canvas.setOverlay(null);
        this.canvas.setBase(null);
        this.canvas.reset();
        try {
            Result.Companion companion = Result.INSTANCE;
            MapPanel mapPanel = this;
            m79constructorimpl = Result.m79constructorimpl(new JSONObject(this.a.getPrefs().text("mapView:" + this.stateKey + ":" + this.index, "{}")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m79constructorimpl = Result.m79constructorimpl(ResultKt.createFailure(th));
        }
        JSONObject jSONObject2 = new JSONObject();
        if (Result.m85isFailureimpl(m79constructorimpl)) {
            m79constructorimpl = jSONObject2;
        }
        this.canvas.restore((JSONObject) m79constructorimpl);
        this.baseToggle.setChecked(this.canvas.getShowBase());
        this.floorToggle.setChecked(this.canvas.getShowOverlay());
        String optString = jSONObject.optString("backgroundImage");
        if (StringsKt.isBlank(optString)) {
            optString = jSONObject.optString("background");
        }
        String str = optString;
        CheckBox checkBox = this.baseToggle;
        Intrinsics.checkNotNull(str);
        checkBox.setVisibility(StringsKt.startsWith$default(str, "art/", false, 2, (Object) null) ? 0 : 8);
        load$set(this, i, str, true);
        String optString2 = jSONObject.optString("image");
        Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
        load$set(this, i, optString2, false);
        this.canvas.setContentDescription(jSONObject.optString("title", "Map") + ". Pinch to zoom; drag to pan. Zoom controls are above.");
    }

    private static final void load$set(final MapPanel mapPanel, final int i, String str, final boolean z) {
        if (StringsKt.startsWith$default(str, "art/", false, 2, (Object) null)) {
            mapPanel.a.loadBitmap(str, new Function1() { // from class: com.lumina.monsterhunterfieldbook.MapPanel$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit load$set$lambda$2;
                    load$set$lambda$2 = MapPanel.load$set$lambda$2(i, mapPanel, z, (Bitmap) obj);
                    return load$set$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit load$set$lambda$2(int i, MapPanel mapPanel, boolean z, Bitmap bitmap) {
        if (i == mapPanel.generation) {
            ZoomMapView zoomMapView = mapPanel.canvas;
            if (z) {
                zoomMapView.setBase(bitmap);
            } else {
                zoomMapView.setOverlay(bitmap);
            }
            mapPanel.canvas.invalidate();
        }
        return Unit.INSTANCE;
    }

    private final void save() {
        NativePrefs prefs = this.a.getPrefs();
        String str = "mapView:" + this.stateKey + ":" + this.index;
        String jSONObject = this.canvas.snapshot().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        prefs.set(str, jSONObject);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        save();
        this.generation++;
        super.onDetachedFromWindow();
    }
}
