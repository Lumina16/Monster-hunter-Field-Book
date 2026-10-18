package com.lumina.monsterhunterfieldbook;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: RecordPanel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006J\u001a\u0010\u000b\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\r\u001a\u00020\fJ\u0010\u0010\n\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u000fR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/ContentText;", "", "<init>", "()V", "labels", "", "", "label", "key", "clean", "value", "useful", "", "hideZero", "monsterRow", "Lorg/json/JSONObject;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContentText {
    public static final ContentText INSTANCE = new ContentText();
    private static final Map<String, String> labels = MapsKt.mapOf(TuplesKt.to("cut", "Sever"), TuplesKt.to("impact", "Blunt"), TuplesKt.to("shot", "Shot"), TuplesKt.to("zenny", "Cost (zenny)"), TuplesKt.to("stats", "Statistics"), TuplesKt.to("maxDefence", "Maximum defence"), TuplesKt.to("questIds", "Quests"), TuplesKt.to("forge", "Forging"), TuplesKt.to("upgrade", "Upgrading"), TuplesKt.to("parent", "Previous weapon"), TuplesKt.to("previous", "Previous upgrade"), TuplesKt.to("iceborne", "Iceborne additions"), TuplesKt.to("world", "World foundation"), TuplesKt.to("database", "Detailed game data"), TuplesKt.to("guidingLands", "Guiding Lands"), TuplesKt.to("slot", "Slot level"), TuplesKt.to("slots", "Decoration slots"));

    private ContentText() {
    }

    public final String label(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String str = labels.get(key);
        if (str != null) {
            return str;
        }
        String replace$default = StringsKt.replace$default(StringsKt.replace$default(new Regex("([a-z])([A-Z])").replace(key, "$1 $2"), '-', ' ', false, 4, (Object) null), '_', ' ', false, 4, (Object) null);
        if (replace$default.length() <= 0) {
            return replace$default;
        }
        StringBuilder sb = new StringBuilder();
        String valueOf = String.valueOf(replace$default.charAt(0));
        Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        StringBuilder append = sb.append((Object) upperCase);
        String substring = replace$default.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return append.append(substring).toString();
    }

    public final String clean(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return StringsKt.trim((CharSequence) new Regex("Image†[^\\s]+\\s*").replace(value, "")).toString();
    }

    public static /* synthetic */ boolean useful$default(ContentText contentText, Object obj, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = false;
        }
        return contentText.useful(obj, z);
    }

    public final boolean useful(Object value, boolean hideZero) {
        if (value == null || Intrinsics.areEqual(value, JSONObject.NULL)) {
            return false;
        }
        if (value instanceof Number) {
            return (hideZero && ((Number) value).doubleValue() == 0.0d) ? false : true;
        }
        if (value instanceof String) {
            if (!StringsKt.isBlank((CharSequence) value)) {
                List listOf = CollectionsKt.listOf((Object[]) new String[]{"null", "undefined", "n/a", "—", "-"});
                String str = (String) value;
                String lowerCase = StringsKt.trim((CharSequence) str).toString().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (!listOf.contains(lowerCase) && (!hideZero || !Intrinsics.areEqual(StringsKt.toDoubleOrNull(StringsKt.trim((CharSequence) str).toString()), 0.0d))) {
                    return true;
                }
            }
            return false;
        }
        if (!(value instanceof JSONArray)) {
            if (!(value instanceof JSONObject)) {
                return true;
            }
            JSONObject jSONObject = (JSONObject) value;
            Iterator<String> keys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
            Iterator it = SequencesKt.asSequence(keys).iterator();
            while (it.hasNext()) {
                if (INSTANCE.useful(jSONObject.opt((String) it.next()), hideZero)) {
                    return true;
                }
            }
            return false;
        }
        JSONArray jSONArray = (JSONArray) value;
        Iterable until = RangesKt.until(0, jSONArray.length());
        if ((until instanceof Collection) && ((Collection) until).isEmpty()) {
            return false;
        }
        Iterator it2 = until.iterator();
        while (it2.hasNext()) {
            if (INSTANCE.useful(jSONArray.opt(((IntIterator) it2).nextInt()), hideZero)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence value$lambda$0(Object obj, int i) {
        return INSTANCE.value(((JSONArray) obj).opt(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean value$lambda$1(Object obj, String str) {
        return useful$default(INSTANCE, ((JSONObject) obj).opt(str), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence value$lambda$2(Object obj, String str) {
        ContentText contentText = INSTANCE;
        Intrinsics.checkNotNull(str);
        return contentText.label(str) + ": " + contentText.value(((JSONObject) obj).opt(str));
    }

    public final String value(final Object value) {
        if (value == null || Intrinsics.areEqual(value, JSONObject.NULL)) {
            return "";
        }
        if (value instanceof Boolean) {
            return ((Boolean) value).booleanValue() ? "Yes" : "No";
        }
        if (value instanceof JSONArray) {
            return CollectionsKt.joinToString$default(RangesKt.until(0, ((JSONArray) value).length()), " · ", null, null, 0, null, new Function1() { // from class: com.lumina.monsterhunterfieldbook.ContentText$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    CharSequence value$lambda$0;
                    value$lambda$0 = ContentText.value$lambda$0(value, ((Integer) obj).intValue());
                    return value$lambda$0;
                }
            }, 30, null);
        }
        if (!(value instanceof JSONObject)) {
            return clean(value.toString());
        }
        Iterator<String> keys = ((JSONObject) value).keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        return SequencesKt.joinToString$default(SequencesKt.filter(SequencesKt.asSequence(keys), new Function1() { // from class: com.lumina.monsterhunterfieldbook.ContentText$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean value$lambda$1;
                value$lambda$1 = ContentText.value$lambda$1(value, (String) obj);
                return Boolean.valueOf(value$lambda$1);
            }
        }), " · ", null, null, 0, null, new Function1() { // from class: com.lumina.monsterhunterfieldbook.ContentText$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence value$lambda$2;
                value$lambda$2 = ContentText.value$lambda$2(value, (String) obj);
                return value$lambda$2;
            }
        }, 30, null);
    }

    public final boolean monsterRow(JSONObject value) {
        Intrinsics.checkNotNullParameter(value, "value");
        final Set of = SetsKt.setOf((Object[]) new String[]{"name", "part", "type", "effect", "id", "rank", "source", "sources"});
        Iterator<String> keys = value.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        List list = SequencesKt.toList(SequencesKt.filter(SequencesKt.asSequence(keys), new Function1() { // from class: com.lumina.monsterhunterfieldbook.ContentText$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean monsterRow$lambda$0;
                monsterRow$lambda$0 = ContentText.monsterRow$lambda$0(of, (String) obj);
                return Boolean.valueOf(monsterRow$lambda$0);
            }
        }));
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (INSTANCE.useful(value.opt((String) it.next()), true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean monsterRow$lambda$0(Set set, String str) {
        return !set.contains(str);
    }
}
