package com.lumina.monsterhunterfieldbook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: BackupController.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0005J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/NativeBackup;", "", "<init>", "()V", "FORMAT", "", "MAX_BYTES", "", "integers", "", "Lkotlin/ranges/IntRange;", "flags", "", "objects", "enums", "encode", "values", "Lorg/json/JSONObject;", "decode", "text", "validate", "", "preset", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NativeBackup {
    public static final String FORMAT = "monster-hunter-field-book-native";
    public static final int MAX_BYTES = 2097152;
    private static final Map<String, Set<String>> enums;
    public static final NativeBackup INSTANCE = new NativeBackup();
    private static final Map<String, IntRange> integers = MapsKt.mapOf(TuplesKt.to("font", new IntRange(75, 160)), TuplesKt.to("lineSpacing", new IntRange(0, 20)), TuplesKt.to("letterSpacing", new IntRange(0, 20)), TuplesKt.to("wordSpacing", new IntRange(0, 12)), TuplesKt.to("iconSize", new IntRange(75, 140)), TuplesKt.to("gradientStrength", new IntRange(0, 60)), TuplesKt.to("speed", new IntRange(0, 100)), TuplesKt.to("volume", new IntRange(0, 100)));
    private static final Set<String> flags = SetsKt.setOf((Object[]) new String[]{"animations", "gradients", "glow", "particles", "blur", "imageMotion", "musicEnabled", "confirmExit", "rememberScroll", "singleGroup", "rememberGroups", "searchHistory", "followTheme", "musicPaused", "rememberMusicPosition"});
    private static final Set<String> objects = SetsKt.setOf((Object[]) new String[]{"bookmarks", "recent", "visualProfiles", "readingGroups", "campChecks", "musicPositions", "trackOrder", "hiddenTracks"});

    private NativeBackup() {
    }

    static {
        Pair[] pairArr = new Pair[11];
        pairArr[0] = TuplesKt.to("density", SetsKt.setOf((Object[]) new String[]{"compact", "comfortable"}));
        pairArr[1] = TuplesKt.to("startup", SetsKt.setOf((Object[]) new String[]{"overview", "last"}));
        pairArr[2] = TuplesKt.to("settingsLayout", SetsKt.setOf((Object[]) new String[]{"center", "split"}));
        pairArr[3] = TuplesKt.to("performance", SetsKt.setOf((Object[]) new String[]{"full", "light"}));
        pairArr[4] = TuplesKt.to("transition", SetsKt.setOf((Object[]) new String[]{"liquid", "fade", "slide", "zoom", "none"}));
        pairArr[5] = TuplesKt.to("touch", SetsKt.setOf((Object[]) new String[]{"ripple", "halo", "glow", "sparks", "none"}));
        pairArr[6] = TuplesKt.to("musicMode", SetsKt.setOf((Object[]) new String[]{"one", "library", "shuffle"}));
        pairArr[7] = TuplesKt.to("edition", SetsKt.setOf((Object[]) new String[]{"world", "iceborne"}));
        pairArr[8] = TuplesKt.to("columns", SetsKt.setOf((Object[]) new String[]{"auto", "1", "2", "3", "4", "5", "6"}));
        IntRange intRange = new IntRange(1, 8);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((IntIterator) it).nextInt()));
        }
        pairArr[9] = TuplesKt.to("rows", CollectionsKt.toSet(arrayList));
        pairArr[10] = TuplesKt.to("gradientAngle", SetsKt.setOf((Object[]) new String[]{"0", "1", "2"}));
        enums = MapsKt.mapOf(pairArr);
    }

    public final String encode(JSONObject values) {
        Intrinsics.checkNotNullParameter(values, "values");
        JSONObject jSONObject = new JSONObject(values.toString());
        jSONObject.remove("tracks");
        jSONObject.remove("speedUndo");
        String jSONObject2 = new JSONObject().put("format", FORMAT).put("version", 1).put("appVersion", "0.2.0").put("values", jSONObject).toString(2);
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    public final JSONObject decode(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        byte[] bytes = text.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        if (bytes.length > 2097152) {
            throw new IllegalArgumentException("Backup is too large.".toString());
        }
        JSONObject jSONObject = new JSONObject(text);
        if (!Intrinsics.areEqual(jSONObject.optString("format"), FORMAT) || jSONObject.optInt("version") != 1) {
            throw new IllegalArgumentException("Choose a native Field Book backup.".toString());
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("values");
        if (jSONObject2.length() > 50000) {
            throw new IllegalArgumentException("Backup contains too many settings.".toString());
        }
        Intrinsics.checkNotNull(jSONObject2);
        validate$default(this, jSONObject2, false, 2, null);
        jSONObject2.remove("speedUndo");
        return jSONObject2;
    }

    static /* synthetic */ void validate$default(NativeBackup nativeBackup, JSONObject jSONObject, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        nativeBackup.validate(jSONObject, z);
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v9 */
    private final void validate(JSONObject values, boolean preset) {
        Iterator<String> it;
        char c;
        Iterator<String> keys = values.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = values.get(next);
            boolean z = obj instanceof String;
            if (!z && !(obj instanceof Number) && !(obj instanceof Boolean)) {
                throw new IllegalArgumentException(("Invalid setting value: " + next).toString());
            }
            if (preset && !SettingsPanel.INSTANCE.getVisualKeys().contains(next)) {
                throw new IllegalArgumentException(("Invalid saved-look setting: " + next).toString());
            }
            Map<String, IntRange> map = integers;
            if (map.containsKey(next)) {
                if (obj instanceof Number) {
                    Number number = (Number) obj;
                    if (number.doubleValue() == number.intValue()) {
                        IntRange intRange = (IntRange) MapsKt.getValue(map, next);
                        int first = intRange.getFirst();
                        int last = intRange.getLast();
                        int intValue = number.intValue();
                        if (first <= intValue) {
                            if (intValue > last) {
                            }
                        }
                    }
                }
                throw new IllegalArgumentException(("Setting is out of range: " + next).toString());
            }
            if (flags.contains(next) && !(obj instanceof Boolean)) {
                throw new IllegalArgumentException(("Invalid switch: " + next).toString());
            }
            Set<String> set = enums.get(next);
            if (set != null && !set.contains(obj.toString())) {
                throw new IllegalArgumentException(("Unknown option: " + next).toString());
            }
            if (Intrinsics.areEqual(next, "theme") && (!z || (!SettingsPanel.INSTANCE.getPalettes().keySet().contains(obj) && !SetsKt.setOf((Object[]) new String[]{"game", "custom"}).contains(obj)))) {
                throw new IllegalArgumentException("Unknown theme.".toString());
            }
            Intrinsics.checkNotNull(next);
            boolean z2 = true;
            if ((StringsKt.startsWith$default(next, "sort:", false, 2, (Object) null) || SetsKt.setOf((Object[]) new String[]{"sortWeapons", "sortResources"}).contains(next)) && !CollectionsKt.contains(SetsKt.setOf((Object[]) new String[]{"name", "source", "rarity", "attack", "tree"}), obj)) {
                throw new IllegalArgumentException("Unknown sort order.".toString());
            }
            if (SetsKt.setOf((Object[]) new String[]{"customBg", "customAccent", "customInk"}).contains(next) && !(obj instanceof Integer) && !(obj instanceof Long)) {
                throw new IllegalArgumentException("Invalid colour.".toString());
            }
            if (z) {
                String str = (String) obj;
                if (str.length() > 1048576) {
                    throw new IllegalArgumentException("Setting value is too large.".toString());
                }
                it = keys;
                if (!objects.contains(next)) {
                    c = (StringsKt.startsWith$default(next, "progress:", false, 2, (Object) null) || StringsKt.startsWith$default(next, "goals:", false, 2, (Object) null) || StringsKt.startsWith$default(next, "filter:", false, 2, (Object) null) || StringsKt.startsWith$default(next, "mapView:", false, 2, (Object) null)) ? (char) 0 : (char) 0;
                }
                String[] strArr = new String[4];
                strArr[c] = "bookmarks";
                strArr[1] = "recent";
                strArr[2] = "trackOrder";
                strArr[3] = "hiddenTracks";
                if (SetsKt.setOf((Object[]) strArr).contains(next)) {
                    JSONArray jSONArray = new JSONArray(str);
                    if (jSONArray.length() > 20000) {
                        throw new IllegalArgumentException("Too many saved entries.".toString());
                    }
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        if (!(jSONArray.get(i) instanceof String)) {
                            throw new IllegalArgumentException("Invalid saved entry.".toString());
                        }
                    }
                } else if (Intrinsics.areEqual(next, "visualProfiles")) {
                    JSONArray jSONArray2 = new JSONArray(str);
                    if (jSONArray2.length() > 200) {
                        throw new IllegalArgumentException("Too many saved looks.".toString());
                    }
                    int length2 = jSONArray2.length();
                    int i2 = 0;
                    while (i2 < length2) {
                        JSONObject jSONObject = jSONArray2.getJSONObject(i2);
                        if (jSONObject.getString("name").length() > 50) {
                            throw new IllegalArgumentException("Saved look name is too long.".toString());
                        }
                        NativeBackup nativeBackup = INSTANCE;
                        JSONObject jSONObject2 = jSONObject.getJSONObject("values");
                        Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
                        nativeBackup.validate(jSONObject2, z2);
                        i2++;
                        z2 = true;
                    }
                } else {
                    JSONObject jSONObject3 = new JSONObject(str);
                    if (Intrinsics.areEqual(next, "readingGroups") || Intrinsics.areEqual(next, "campChecks") || StringsKt.startsWith$default(next, "progress:", false, 2, (Object) null) || StringsKt.startsWith$default(next, "goals:", false, 2, (Object) null)) {
                        Iterator<String> keys2 = jSONObject3.keys();
                        Intrinsics.checkNotNullExpressionValue(keys2, "keys(...)");
                        while (keys2.hasNext()) {
                            if (!(jSONObject3.get(keys2.next()) instanceof Boolean)) {
                                throw new IllegalArgumentException("Invalid checklist value.".toString());
                            }
                        }
                    }
                    if (Intrinsics.areEqual(next, "musicPositions")) {
                        Iterator<String> keys3 = jSONObject3.keys();
                        Intrinsics.checkNotNullExpressionValue(keys3, "keys(...)");
                        while (keys3.hasNext()) {
                            String next2 = keys3.next();
                            if (!(jSONObject3.get(next2) instanceof Number) || jSONObject3.getDouble(next2) < 0.0d) {
                                throw new IllegalArgumentException("Invalid music position.".toString());
                            }
                        }
                    }
                    double d = 0.0d;
                    ?? r4 = 0;
                    if (StringsKt.startsWith$default(next, "mapView:", false, 2, (Object) null)) {
                        Iterator it2 = CollectionsKt.listOf((Object[]) new String[]{"scale", "x", "y"}).iterator();
                        while (it2.hasNext()) {
                            double d2 = d;
                            if (Math.abs(jSONObject3.optDouble((String) it2.next(), d2)) > Double.MAX_VALUE) {
                                throw new IllegalArgumentException("Invalid map position.".toString());
                            }
                            d = d2;
                        }
                        r4 = 0;
                    }
                    if (StringsKt.startsWith$default(next, "filter:", (boolean) r4, 2, (Object) null)) {
                        String[] strArr2 = new String[3];
                        strArr2[r4] = "all";
                        strArr2[1] = "world";
                        strArr2[2] = "iceborne";
                        if (!SetsKt.setOf((Object[]) strArr2).contains(jSONObject3.optString("game", "all"))) {
                            throw new IllegalArgumentException("Invalid collection filter.".toString());
                        }
                        String[] strArr3 = new String[5];
                        strArr3[r4] = "name";
                        strArr3[1] = "rarity";
                        strArr3[2] = "attack";
                        strArr3[3] = "source";
                        strArr3[4] = "tree";
                        if (!SetsKt.setOf((Object[]) strArr3).contains(jSONObject3.optString("sort", "name"))) {
                            throw new IllegalArgumentException("Invalid collection sort.".toString());
                        }
                    }
                }
            } else {
                it = keys;
            }
            if (Intrinsics.areEqual(next, "tracks")) {
                throw new IllegalArgumentException("Music files are managed on this device.".toString());
            }
            keys = it;
        }
    }
}
