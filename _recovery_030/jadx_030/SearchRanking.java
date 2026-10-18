package com.lumina.monsterhunterfieldbook;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: SearchRanking.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005J\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005¨\u0006\u0010"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/SearchRanking;", "", "<init>", "()V", "normalise", "", "text", "tokens", "", "distance", "", "a", "b", "rank", "name", "query", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SearchRanking {
    public static final SearchRanking INSTANCE = new SearchRanking();

    private SearchRanking() {
    }

    public final String normalise(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        String normalize = Normalizer.normalize(text, Normalizer.Form.NFD);
        Intrinsics.checkNotNullExpressionValue(normalize, "normalize(...)");
        String replace = new Regex("\\p{M}+").replace(normalize, "");
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = replace.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return StringsKt.trim((CharSequence) new Regex("\\s+").replace(new Regex("[^a-z0-9 ]").replace(new Regex("[’']").replace(lowerCase, ""), " "), " ")).toString();
    }

    public final List<String> tokens(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        List split$default = StringsKt.split$default((CharSequence) normalise(text), new char[]{' '}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : split$default) {
            if (!StringsKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.take(arrayList, 12);
    }

    public final int distance(String a, String b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        if (Math.abs(a.length() - b.length()) > 3) {
            return 4;
        }
        int length = b.length() + 1;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = i;
        }
        String str = a;
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            i3++;
            int[] iArr2 = new int[b.length() + 1];
            iArr2[0] = i3;
            String str2 = b;
            int i4 = 0;
            int i5 = 0;
            while (i4 < str2.length()) {
                int i6 = i5 + 1;
                iArr2[i6] = Math.min(Math.min(iArr2[i5] + 1, iArr[i6] + 1), iArr[i5] + (charAt == str2.charAt(i4) ? 0 : 1));
                i4++;
                i5 = i6;
            }
            i2++;
            iArr = iArr2;
        }
        return iArr[b.length()];
    }

    public final int rank(String name, String query) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(query, "query");
        String normalise = normalise(name);
        String normalise2 = normalise(query);
        if (Intrinsics.areEqual(normalise, normalise2)) {
            return 0;
        }
        if (StringsKt.startsWith$default(normalise, normalise2, false, 2, (Object) null)) {
            return 1;
        }
        String str = normalise;
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) normalise2, false, 2, (Object) null)) {
            return 2;
        }
        List<String> list = tokens(normalise2);
        if ((list instanceof Collection) && list.isEmpty()) {
            return 3;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!StringsKt.contains$default((CharSequence) str, (CharSequence) it.next(), false, 2, (Object) null)) {
                return 10;
            }
        }
        return 3;
    }
}
