package com.lumina.monsterhunterfieldbook;

/* compiled from: SearchRanking.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005J\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005¨\u0006\u0010"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/SearchRanking;", "", "<init>", "()V", "normalise", "", "text", "tokens", "", "distance", "", "a", "b", "rank", "name", "query", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SearchRanking {
    public static final com.lumina.monsterhunterfieldbook.SearchRanking INSTANCE = null;

    static {
            com.lumina.monsterhunterfieldbook.SearchRanking r0 = new com.lumina.monsterhunterfieldbook.SearchRanking
            r0.<init>()
            com.lumina.monsterhunterfieldbook.SearchRanking.INSTANCE = r0
            return
    }

    private SearchRanking() {
            r0 = this;
            r0.<init>()
            return
    }

    public final int distance(java.lang.String r17, java.lang.String r18) {
            r16 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "a"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "b"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            int r2 = r0.length()
            int r3 = r1.length()
            int r2 = r2 - r3
            int r2 = java.lang.Math.abs(r2)
            r3 = 3
            if (r2 <= r3) goto L20
            r0 = 4
            return r0
        L20:
            int r2 = r1.length()
            r3 = 1
            int r2 = r2 + r3
            int[] r4 = new int[r2]
            r5 = 0
            r6 = r5
        L2a:
            if (r6 >= r2) goto L31
            r4[r6] = r6
            int r6 = r6 + 1
            goto L2a
        L31:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2 = r5
            r6 = r2
        L35:
            int r7 = r0.length()
            if (r2 >= r7) goto L7a
            char r7 = r0.charAt(r2)
            int r6 = r6 + r3
            int r8 = r1.length()
            int r8 = r8 + r3
            int[] r8 = new int[r8]
            r8[r5] = r6
            r9 = r1
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r10 = r5
            r11 = r10
        L4e:
            int r12 = r9.length()
            if (r10 >= r12) goto L76
            char r12 = r9.charAt(r10)
            int r13 = r11 + 1
            r14 = r8[r11]
            int r14 = r14 + r3
            r15 = r4[r13]
            int r15 = r15 + r3
            int r14 = java.lang.Math.min(r14, r15)
            r11 = r4[r11]
            if (r7 != r12) goto L6a
            r12 = r5
            goto L6b
        L6a:
            r12 = r3
        L6b:
            int r11 = r11 + r12
            int r11 = java.lang.Math.min(r14, r11)
            r8[r13] = r11
            int r10 = r10 + 1
            r11 = r13
            goto L4e
        L76:
            int r2 = r2 + 1
            r4 = r8
            goto L35
        L7a:
            int r0 = r1.length()
            r0 = r4[r0]
            return r0
    }

    public final java.lang.String normalise(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.text.Normalizer$Form r0 = java.text.Normalizer.Form.NFD
            java.lang.String r4 = java.text.Normalizer.normalize(r4, r0)
            java.lang.String r0 = "normalize(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            kotlin.text.Regex r0 = new kotlin.text.Regex
            java.lang.String r1 = "\\p{M}+"
            r0.<init>(r1)
            java.lang.String r1 = ""
            java.lang.String r4 = r0.replace(r4, r1)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = "ROOT"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            kotlin.text.Regex r0 = new kotlin.text.Regex
            java.lang.String r2 = "[’']"
            r0.<init>(r2)
            java.lang.String r4 = r0.replace(r4, r1)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            kotlin.text.Regex r0 = new kotlin.text.Regex
            java.lang.String r1 = "[^a-z0-9 ]"
            r0.<init>(r1)
            java.lang.String r1 = " "
            java.lang.String r4 = r0.replace(r4, r1)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            kotlin.text.Regex r0 = new kotlin.text.Regex
            java.lang.String r2 = "\\s+"
            r0.<init>(r2)
            java.lang.String r4 = r0.replace(r4, r1)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.CharSequence r4 = kotlin.text.StringsKt.trim(r4)
            java.lang.String r4 = r4.toString()
            return r4
    }

    public final int rank(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "query"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r5 = r4.normalise(r5)
            java.lang.String r6 = r4.normalise(r6)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
            r1 = 0
            if (r0 == 0) goto L1a
            return r1
        L1a:
            r0 = 2
            r2 = 0
            boolean r3 = kotlin.text.StringsKt.startsWith$default(r5, r6, r1, r0, r2)
            if (r3 == 0) goto L24
            r5 = 1
            return r5
        L24:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r3 = r6
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = kotlin.text.StringsKt.contains$default(r5, r3, r1, r0, r2)
            if (r3 == 0) goto L30
            return r0
        L30:
            java.util.List r6 = r4.tokens(r6)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r3 = r6 instanceof java.util.Collection
            if (r3 == 0) goto L44
            r3 = r6
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L44
            goto L5f
        L44:
            java.util.Iterator r6 = r6.iterator()
        L48:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L5f
            java.lang.Object r3 = r6.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = kotlin.text.StringsKt.contains$default(r5, r3, r1, r0, r2)
            if (r3 != 0) goto L48
            r5 = 10
            return r5
        L5f:
            r5 = 3
            return r5
    }

    public final java.util.List<java.lang.String> tokens(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r7 = r6.normalise(r7)
            r0 = r7
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r7 = 1
            char[] r1 = new char[r7]
            r7 = 32
            r2 = 0
            r1[r2] = r7
            r4 = 6
            r5 = 0
            r3 = 0
            java.util.List r7 = kotlin.text.StringsKt.split$default(r0, r1, r2, r3, r4, r5)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r7 = r7.iterator()
        L28:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r7.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = kotlin.text.StringsKt.isBlank(r2)
            if (r2 != 0) goto L28
            r0.add(r1)
            goto L28
        L41:
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r7 = 12
            java.util.List r7 = kotlin.collections.CollectionsKt.take(r0, r7)
            return r7
    }
}
