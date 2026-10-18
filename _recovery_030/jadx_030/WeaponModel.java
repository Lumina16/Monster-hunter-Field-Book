package com.lumina.monsterhunterfieldbook;

import android.graphics.Color;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: WeaponProfilePanel.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0006J\u0016\u0010\u000e\u001a\n \u000f*\u0004\u0018\u00010\n0\n2\u0006\u0010\r\u001a\u00020\u0006J\u0014\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013J\u0010\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0006J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\u0006\u0010\r\u001a\u00020\u0006J\"\u0010\u0017\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00180\u00132\u0006\u0010\r\u001a\u00020\u0006J\u0010\u0010\u0019\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\u001c\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0006J\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00132\u0006\u0010\r\u001a\u00020\u0006J\u0010\u0010\u001f\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0007J,\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\u0006\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010$\u001a\u00020\nJ\u0016\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020'2\u0006\u0010\r\u001a\u00020\u0006J\u0016\u0010(\u001a\u00020\n2\u0006\u0010&\u001a\u00020'2\u0006\u0010)\u001a\u00020\nJ \u0010*\u001a\u00020+2\u0006\u0010&\u001a\u00020'2\u0006\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010,\u001a\u00020\u001eJ\u000e\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u001eR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/WeaponModel;", "", "<init>", "()V", "parsed", "Ljava/util/WeakHashMap;", "Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "Lorg/json/JSONObject;", "known", "", "", "Ljava/lang/ref/WeakReference;", "data", "record", "rawId", "kotlin.jvm.PlatformType", "register", "", "records", "", "id", "parent", "elementNames", "elements", "Lkotlin/Pair;", "shown", "value", "number", "elementText", "slots", "", "factText", "matches", "", "state", "filtered", "sort", "visual", "a", "Lcom/lumina/monsterhunterfieldbook/MainActivity;", "effectPath", "name", "icon", "Landroid/widget/ImageView;", "size", "rarityColour", "rarity", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WeaponModel {
    public static final WeaponModel INSTANCE = new WeaponModel();
    private static final WeakHashMap<FieldRecord, JSONObject> parsed = new WeakHashMap<>();
    private static final Map<String, WeakReference<FieldRecord>> known = new LinkedHashMap();

    private WeaponModel() {
    }

    public final JSONObject data(FieldRecord record) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(record, "record");
        WeakHashMap<FieldRecord, JSONObject> weakHashMap = parsed;
        synchronized (weakHashMap) {
            WeakHashMap<FieldRecord, JSONObject> weakHashMap2 = weakHashMap;
            JSONObject jSONObject2 = weakHashMap2.get(record);
            if (jSONObject2 == null) {
                jSONObject2 = record.data();
                weakHashMap2.put(record, jSONObject2);
            }
            jSONObject = jSONObject2;
        }
        Intrinsics.checkNotNullExpressionValue(jSONObject, "synchronized(...)");
        return jSONObject;
    }

    public final String rawId(FieldRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        return data(record).optString("id");
    }

    public final void register(List<FieldRecord> records) {
        Intrinsics.checkNotNullParameter(records, "records");
        for (FieldRecord fieldRecord : records) {
            known.put(INSTANCE.rawId(fieldRecord), new WeakReference<>(fieldRecord));
        }
    }

    public final FieldRecord record(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        WeakReference<FieldRecord> weakReference = known.get(id);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final String parent(FieldRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        String optString = data(record).optString("parent");
        if (Intrinsics.areEqual(optString, "null")) {
            optString = null;
        }
        return optString == null ? "" : optString;
    }

    public final List<String> elementNames(FieldRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        List<Pair<String, JSONObject>> elements = elements(record);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(elements, 10));
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Pair) it.next()).getFirst());
        }
        return arrayList;
    }

    public final List<Pair<String, JSONObject>> elements(FieldRecord record) {
        String str;
        Intrinsics.checkNotNullParameter(record, "record");
        JSONArray optJSONArray = data(record).optJSONArray("elements");
        if (optJSONArray == null) {
            return CollectionsKt.emptyList();
        }
        IntRange until = RangesKt.until(0, optJSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            Object opt = optJSONArray.opt(((IntIterator) it).nextInt());
            boolean z = opt instanceof JSONObject;
            if (z) {
                JSONObject jSONObject = (JSONObject) opt;
                String optString = jSONObject.optString("type");
                if (StringsKt.isBlank(optString)) {
                    optString = jSONObject.optString("name");
                }
                str = optString;
            } else {
                str = opt instanceof String ? (String) opt : "";
            }
            Intrinsics.checkNotNull(str);
            if (StringsKt.isBlank(str)) {
                str = null;
            }
            if (str != null) {
                r6 = TuplesKt.to(str, z ? (JSONObject) opt : null);
            }
            if (r6 != null) {
                arrayList.add(r6);
            }
        }
        return arrayList;
    }

    public final String shown(Object value) {
        return (value == null || value == JSONObject.NULL || Intrinsics.areEqual(value, "")) ? "—" : value.toString();
    }

    public final String number(Object value) {
        String obj;
        Double valueOf = value instanceof Number ? Double.valueOf(((Number) value).doubleValue()) : (value == null || (obj = value.toString()) == null) ? null : StringsKt.toDoubleOrNull(obj);
        if (valueOf == null || Math.abs(valueOf.doubleValue()) > Double.MAX_VALUE) {
            return shown(value);
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        numberInstance.setMaximumFractionDigits(3);
        String format = numberInstance.format(valueOf.doubleValue());
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public final String elementText(FieldRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        String joinToString$default = CollectionsKt.joinToString$default(elements(record), " · ", null, null, 0, null, new Function1() { // from class: com.lumina.monsterhunterfieldbook.WeaponModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence elementText$lambda$0;
                elementText$lambda$0 = WeaponModel.elementText$lambda$0((Pair) obj);
                return elementText$lambda$0;
            }
        }, 30, null);
        if (StringsKt.isBlank(joinToString$default)) {
            joinToString$default = "—";
        }
        return joinToString$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence elementText$lambda$0(Pair pair) {
        String str;
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        String str2 = (String) pair.component1();
        JSONObject jSONObject = (JSONObject) pair.component2();
        if (jSONObject != null) {
            str = " " + INSTANCE.shown(jSONObject.opt(jSONObject.isNull("value") ? "damage" : "value")) + (jSONObject.optBoolean("hidden") ? " (hidden)" : "");
        }
        return str2 + str;
    }

    public final List<Integer> slots(FieldRecord record) {
        int intValue;
        Intrinsics.checkNotNullParameter(record, "record");
        JSONArray optJSONArray = data(record).optJSONArray("slots");
        if (optJSONArray == null) {
            return CollectionsKt.emptyList();
        }
        IntRange until = RangesKt.until(0, optJSONArray.length());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            Object opt = optJSONArray.opt(((IntIterator) it).nextInt());
            if (opt instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) opt;
                intValue = jSONObject.optInt("level", jSONObject.optInt("rank"));
            } else {
                Integer intOrNull = StringsKt.toIntOrNull(opt.toString());
                intValue = intOrNull != null ? intOrNull.intValue() : 0;
            }
            arrayList.add(Integer.valueOf(intValue));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Number) obj).intValue() > 0) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final String factText(final Object value) {
        if (value instanceof String) {
            String str = (String) value;
            return (StringsKt.startsWith$default(str, "data:", false, 2, (Object) null) || new Regex("^https?://").containsMatchIn((CharSequence) value)) ? "" : str;
        }
        if (value instanceof JSONArray) {
            return CollectionsKt.joinToString$default(RangesKt.until(0, ((JSONArray) value).length()), " ", null, null, 0, null, new Function1() { // from class: com.lumina.monsterhunterfieldbook.WeaponModel$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    CharSequence factText$lambda$0;
                    factText$lambda$0 = WeaponModel.factText$lambda$0(value, ((Integer) obj).intValue());
                    return factText$lambda$0;
                }
            }, 30, null);
        }
        if (!(value instanceof JSONObject)) {
            return "";
        }
        Iterator<String> keys = ((JSONObject) value).keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        return SequencesKt.joinToString$default(SequencesKt.filter(SequencesKt.asSequence(keys), new Function1() { // from class: com.lumina.monsterhunterfieldbook.WeaponModel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean factText$lambda$1;
                factText$lambda$1 = WeaponModel.factText$lambda$1((String) obj);
                return Boolean.valueOf(factText$lambda$1);
            }
        }), " ", null, null, 0, null, new Function1() { // from class: com.lumina.monsterhunterfieldbook.WeaponModel$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence factText$lambda$2;
                factText$lambda$2 = WeaponModel.factText$lambda$2(value, (String) obj);
                return factText$lambda$2;
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence factText$lambda$0(Object obj, int i) {
        return INSTANCE.factText(((JSONArray) obj).opt(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean factText$lambda$1(String str) {
        return !SetsKt.setOf((Object[]) new String[]{"source", "sources", "image", "artUrl", "artSource", "url", "path", "data", "maps"}).contains(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence factText$lambda$2(Object obj, String str) {
        return INSTANCE.factText(((JSONObject) obj).opt(str));
    }

    public final boolean matches(FieldRecord record, JSONObject state) {
        int hashCode;
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(state, "state");
        JSONObject data = data(record);
        if (!Intrinsics.areEqual(state.optString("rank", "all"), "all") && !Intrinsics.areEqual(data.optString("rank"), state.optString("rank"))) {
            return false;
        }
        if (!Intrinsics.areEqual(state.optString("rarity", "all"), "all") && !Intrinsics.areEqual(data.opt("rarity").toString(), state.optString("rarity"))) {
            return false;
        }
        List<String> elementNames = elementNames(record);
        String optString = state.optString("element", "all");
        if (!Intrinsics.areEqual(optString, "all") && ((!Intrinsics.areEqual(optString, "none") || !elementNames.isEmpty()) && !elementNames.contains(optString))) {
            return false;
        }
        boolean z = data.optJSONObject("forge") != null;
        boolean z2 = data.optJSONObject("upgrade") != null;
        String optString2 = state.optString("obtain", "all");
        if (optString2 != null && ((hashCode = optString2.hashCode()) == -934326481 ? optString2.equals("reward") && (z || z2) : hashCode == -231171556 ? optString2.equals("upgrade") && !z2 : hashCode == 97618791 && optString2.equals("forge") && !z)) {
            return false;
        }
        String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.listOf(record.getName()), (Iterable) elementNames), (Iterable) CollectionsKt.listOf((Object[]) new String[]{data.optString("family"), factText(data.opt("attributes"))})), " ", null, null, 0, null, null, 62, null);
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = joinToString$default.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String optString3 = state.optString("q");
        Intrinsics.checkNotNullExpressionValue(optString3, "optString(...)");
        String obj = StringsKt.trim((CharSequence) optString3).toString();
        Locale ROOT2 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT2, "ROOT");
        String lowerCase2 = obj.toLowerCase(ROOT2);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        List<String> split = new Regex("\\s+").split(lowerCase2, 0);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : split) {
            if (!StringsKt.isBlank((String) obj2)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = arrayList;
        if ((arrayList2 instanceof Collection) && arrayList2.isEmpty()) {
            return true;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            if (!StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) it.next(), false, 2, (Object) null)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ List filtered$default(WeaponModel weaponModel, List list, JSONObject jSONObject, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "source";
        }
        return weaponModel.filtered(list, jSONObject, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r7.equals("rarity") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        r5 = new com.lumina.monsterhunterfieldbook.WeaponModel$filtered$$inlined$compareByDescending$1(r7);
        r6 = kotlin.text.StringsKt.getCASE_INSENSITIVE_ORDER(kotlin.jvm.internal.StringCompanionObject.INSTANCE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        return kotlin.collections.CollectionsKt.sortedWith(r0, new com.lumina.monsterhunterfieldbook.WeaponModel$filtered$$inlined$thenBy$1(r5, r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        if (r7.equals("attack") == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<FieldRecord> filtered(List<FieldRecord> records, JSONObject state, final String sort) {
        Intrinsics.checkNotNullParameter(records, "records");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(sort, "sort");
        ArrayList arrayList = new ArrayList();
        for (Object obj : records) {
            if (INSTANCE.matches((FieldRecord) obj, state)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        int hashCode = sort.hashCode();
        if (hashCode != -1407259064) {
            if (hashCode != -938161749) {
                if (hashCode == 3373707 && sort.equals("name")) {
                    final Comparator<String> case_insensitive_order = StringsKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE);
                    return CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.lumina.monsterhunterfieldbook.WeaponModel$filtered$$inlined$compareBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return case_insensitive_order.compare(((FieldRecord) t).getName(), ((FieldRecord) t2).getName());
                        }
                    });
                }
            }
            return arrayList2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String visual(MainActivity a, FieldRecord record) {
        String str;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(record, "record");
        String image = record.getImage();
        if (StringsKt.isBlank(image)) {
            JSONObject optJSONObject3 = a.getLibraryData().optJSONObject("nativeVisuals");
            if (optJSONObject3 != null && (optJSONObject = optJSONObject3.optJSONObject("weaponTypes")) != null) {
                WeaponModel weaponModel = INSTANCE;
                JSONObject optJSONObject4 = optJSONObject.optJSONObject(weaponModel.data(record).optString("type"));
                if (optJSONObject4 != null && (optJSONObject2 = optJSONObject4.optJSONObject("rarityIcons")) != null) {
                    str = optJSONObject2.optString(String.valueOf(weaponModel.data(record).optInt("rarity", 1)));
                    if (str == null) {
                        str = "";
                    }
                    image = str;
                }
            }
            str = null;
            if (str == null) {
            }
            image = str;
        }
        return image;
    }

    public final String effectPath(MainActivity a, String name) {
        JSONObject optJSONObject;
        Object obj;
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(name, "name");
        JSONObject optJSONObject2 = a.getLibraryData().optJSONObject("nativeVisuals");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("effects")) == null) {
            return "";
        }
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = name.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String replace = new Regex("[\\s_-]").replace(lowerCase, "");
        String str = (String) MapsKt.mapOf(TuplesKt.to("paralyze", "paralysis"), TuplesKt.to("paralysisattack", "paralysis"), TuplesKt.to("poisonattack", "poison"), TuplesKt.to("blastblight", "blast"), TuplesKt.to("iceblight", "ice"), TuplesKt.to("waterblight", "water"), TuplesKt.to("fireblight", "fire"), TuplesKt.to("thunderblight", "thunder"), TuplesKt.to("dragonblight", "dragon")).get(replace);
        if (str != null) {
            replace = str;
        }
        Iterator<String> keys = optJSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        Iterator it = SequencesKt.asSequence(keys).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String str2 = (String) obj;
            Intrinsics.checkNotNull(str2);
            Locale ROOT2 = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT2, "ROOT");
            String lowerCase2 = str2.toLowerCase(ROOT2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            if (Intrinsics.areEqual(new Regex("[\\s_-]").replace(lowerCase2, ""), replace)) {
                break;
            }
        }
        String str3 = (String) obj;
        String optString = str3 != null ? optJSONObject.optString(str3) : null;
        return optString == null ? "" : optString;
    }

    public static /* synthetic */ ImageView icon$default(WeaponModel weaponModel, MainActivity mainActivity, FieldRecord fieldRecord, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 30;
        }
        return weaponModel.icon(mainActivity, fieldRecord, i);
    }

    public final ImageView icon(MainActivity a, FieldRecord record, int size) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(record, "record");
        ImageView imageView = new ImageView(a);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        String name = record.getName();
        WeaponModel weaponModel = INSTANCE;
        imageView.setContentDescription(name + ", rarity " + weaponModel.data(record).optInt("rarity", 1));
        imageView.setLayoutParams(new LinearLayout.LayoutParams(a.dp(Integer.valueOf(size)), a.dp(Integer.valueOf(size))));
        String visual = weaponModel.visual(a, record);
        if (!StringsKt.isBlank(visual)) {
            a.assetImage(visual, imageView);
        }
        return imageView;
    }

    public final int rarityColour(int rarity) {
        return Color.parseColor(new String[]{"#AAAAAA", "#AAAAAA", "#DEDEDE", "#A1C42E", "#48AB3F", "#5CAEBB", "#595CDA", "#8D59EF", "#C76D46", "#B3436A", "#0AD5FA", "#FAC81E", "#B4F5FF"}[RangesKt.coerceIn(rarity, 1, 12)]);
    }
}
