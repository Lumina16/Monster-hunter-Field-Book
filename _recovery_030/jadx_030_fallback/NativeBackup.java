package com.lumina.monsterhunterfieldbook;

/* compiled from: BackupController.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0005J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/NativeBackup;", "", "<init>", "()V", "FORMAT", "", "MAX_BYTES", "", "integers", "", "Lkotlin/ranges/IntRange;", "flags", "", "objects", "enums", "encode", "values", "Lorg/json/JSONObject;", "decode", "text", "validate", "", "preset", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NativeBackup {
    public static final java.lang.String FORMAT = "monster-hunter-field-book-native";
    public static final com.lumina.monsterhunterfieldbook.NativeBackup INSTANCE = null;
    public static final int MAX_BYTES = 2097152;
    private static final java.util.Map<java.lang.String, java.util.Set<java.lang.String>> enums = null;
    private static final java.util.Set<java.lang.String> flags = null;
    private static final java.util.Map<java.lang.String, kotlin.ranges.IntRange> integers = null;
    private static final java.util.Set<java.lang.String> objects = null;

    static {
            com.lumina.monsterhunterfieldbook.NativeBackup r0 = new com.lumina.monsterhunterfieldbook.NativeBackup
            r0.<init>()
            com.lumina.monsterhunterfieldbook.NativeBackup.INSTANCE = r0
            r0 = 8
            kotlin.Pair[] r1 = new kotlin.Pair[r0]
            kotlin.ranges.IntRange r2 = new kotlin.ranges.IntRange
            r3 = 160(0xa0, float:2.24E-43)
            r4 = 75
            r2.<init>(r4, r3)
            java.lang.String r3 = "font"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r3, r2)
            r3 = 0
            r1[r3] = r2
            kotlin.ranges.IntRange r2 = new kotlin.ranges.IntRange
            r5 = 20
            r2.<init>(r3, r5)
            java.lang.String r6 = "lineSpacing"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r6, r2)
            r6 = 1
            r1[r6] = r2
            kotlin.ranges.IntRange r2 = new kotlin.ranges.IntRange
            r2.<init>(r3, r5)
            java.lang.String r5 = "letterSpacing"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r5, r2)
            r5 = 2
            r1[r5] = r2
            kotlin.ranges.IntRange r2 = new kotlin.ranges.IntRange
            r7 = 12
            r2.<init>(r3, r7)
            java.lang.String r8 = "wordSpacing"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r8, r2)
            r8 = 3
            r1[r8] = r2
            kotlin.ranges.IntRange r2 = new kotlin.ranges.IntRange
            r9 = 140(0x8c, float:1.96E-43)
            r2.<init>(r4, r9)
            java.lang.String r4 = "iconSize"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r4, r2)
            r4 = 4
            r1[r4] = r2
            kotlin.ranges.IntRange r2 = new kotlin.ranges.IntRange
            r9 = 60
            r2.<init>(r3, r9)
            java.lang.String r9 = "gradientStrength"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r9, r2)
            r9 = 5
            r1[r9] = r2
            kotlin.ranges.IntRange r2 = new kotlin.ranges.IntRange
            r10 = 100
            r2.<init>(r3, r10)
            java.lang.String r11 = "speed"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r11, r2)
            r11 = 6
            r1[r11] = r2
            kotlin.ranges.IntRange r2 = new kotlin.ranges.IntRange
            r2.<init>(r3, r10)
            java.lang.String r10 = "volume"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r10, r2)
            r10 = 7
            r1[r10] = r2
            java.util.Map r1 = kotlin.collections.MapsKt.mapOf(r1)
            com.lumina.monsterhunterfieldbook.NativeBackup.integers = r1
            r1 = 15
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r2 = "animations"
            r1[r3] = r2
            java.lang.String r2 = "gradients"
            r1[r6] = r2
            java.lang.String r2 = "glow"
            r1[r5] = r2
            java.lang.String r12 = "particles"
            r1[r8] = r12
            java.lang.String r12 = "blur"
            r1[r4] = r12
            java.lang.String r12 = "imageMotion"
            r1[r9] = r12
            java.lang.String r12 = "musicEnabled"
            r1[r11] = r12
            java.lang.String r12 = "confirmExit"
            r1[r10] = r12
            java.lang.String r12 = "rememberScroll"
            r1[r0] = r12
            java.lang.String r12 = "singleGroup"
            r13 = 9
            r1[r13] = r12
            java.lang.String r12 = "rememberGroups"
            r14 = 10
            r1[r14] = r12
            java.lang.String r12 = "searchHistory"
            r15 = 11
            r1[r15] = r12
            java.lang.String r12 = "followTheme"
            r1[r7] = r12
            r7 = 13
            java.lang.String r12 = "musicPaused"
            r1[r7] = r12
            r7 = 14
            java.lang.String r12 = "rememberMusicPosition"
            r1[r7] = r12
            java.util.Set r1 = kotlin.collections.SetsKt.setOf(r1)
            com.lumina.monsterhunterfieldbook.NativeBackup.flags = r1
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r7 = "bookmarks"
            r1[r3] = r7
            java.lang.String r7 = "recent"
            r1[r6] = r7
            java.lang.String r7 = "visualProfiles"
            r1[r5] = r7
            java.lang.String r7 = "readingGroups"
            r1[r8] = r7
            java.lang.String r7 = "campChecks"
            r1[r4] = r7
            java.lang.String r7 = "musicPositions"
            r1[r9] = r7
            java.lang.String r7 = "trackOrder"
            r1[r11] = r7
            java.lang.String r7 = "hiddenTracks"
            r1[r10] = r7
            java.util.Set r1 = kotlin.collections.SetsKt.setOf(r1)
            com.lumina.monsterhunterfieldbook.NativeBackup.objects = r1
            kotlin.Pair[] r1 = new kotlin.Pair[r15]
            java.lang.String[] r7 = new java.lang.String[r5]
            java.lang.String r12 = "compact"
            r7[r3] = r12
            java.lang.String r12 = "comfortable"
            r7[r6] = r12
            java.util.Set r7 = kotlin.collections.SetsKt.setOf(r7)
            java.lang.String r12 = "density"
            kotlin.Pair r7 = kotlin.TuplesKt.to(r12, r7)
            r1[r3] = r7
            java.lang.String[] r7 = new java.lang.String[r5]
            java.lang.String r12 = "overview"
            r7[r3] = r12
            java.lang.String r12 = "last"
            r7[r6] = r12
            java.util.Set r7 = kotlin.collections.SetsKt.setOf(r7)
            java.lang.String r12 = "startup"
            kotlin.Pair r7 = kotlin.TuplesKt.to(r12, r7)
            r1[r6] = r7
            java.lang.String[] r7 = new java.lang.String[r5]
            java.lang.String r12 = "center"
            r7[r3] = r12
            java.lang.String r12 = "split"
            r7[r6] = r12
            java.util.Set r7 = kotlin.collections.SetsKt.setOf(r7)
            java.lang.String r12 = "settingsLayout"
            kotlin.Pair r7 = kotlin.TuplesKt.to(r12, r7)
            r1[r5] = r7
            java.lang.String[] r7 = new java.lang.String[r5]
            java.lang.String r12 = "full"
            r7[r3] = r12
            java.lang.String r12 = "light"
            r7[r6] = r12
            java.util.Set r7 = kotlin.collections.SetsKt.setOf(r7)
            java.lang.String r12 = "performance"
            kotlin.Pair r7 = kotlin.TuplesKt.to(r12, r7)
            r1[r8] = r7
            java.lang.String[] r7 = new java.lang.String[r9]
            java.lang.String r12 = "liquid"
            r7[r3] = r12
            java.lang.String r12 = "fade"
            r7[r6] = r12
            java.lang.String r12 = "slide"
            r7[r5] = r12
            java.lang.String r12 = "zoom"
            r7[r8] = r12
            java.lang.String r12 = "none"
            r7[r4] = r12
            java.util.Set r7 = kotlin.collections.SetsKt.setOf(r7)
            java.lang.String r15 = "transition"
            kotlin.Pair r7 = kotlin.TuplesKt.to(r15, r7)
            r1[r4] = r7
            java.lang.String[] r7 = new java.lang.String[r9]
            java.lang.String r15 = "ripple"
            r7[r3] = r15
            java.lang.String r15 = "halo"
            r7[r6] = r15
            r7[r5] = r2
            java.lang.String r2 = "sparks"
            r7[r8] = r2
            r7[r4] = r12
            java.util.Set r2 = kotlin.collections.SetsKt.setOf(r7)
            java.lang.String r7 = "touch"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r7, r2)
            r1[r9] = r2
            java.lang.String[] r2 = new java.lang.String[r8]
            java.lang.String r7 = "one"
            r2[r3] = r7
            java.lang.String r7 = "library"
            r2[r6] = r7
            java.lang.String r7 = "shuffle"
            r2[r5] = r7
            java.util.Set r2 = kotlin.collections.SetsKt.setOf(r2)
            java.lang.String r7 = "musicMode"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r7, r2)
            r1[r11] = r2
            java.lang.String[] r2 = new java.lang.String[r5]
            java.lang.String r7 = "world"
            r2[r3] = r7
            java.lang.String r7 = "iceborne"
            r2[r6] = r7
            java.util.Set r2 = kotlin.collections.SetsKt.setOf(r2)
            java.lang.String r7 = "edition"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r7, r2)
            r1[r10] = r2
            java.lang.String[] r2 = new java.lang.String[r10]
            java.lang.String r7 = "auto"
            r2[r3] = r7
            java.lang.String r7 = "1"
            r2[r6] = r7
            java.lang.String r10 = "2"
            r2[r5] = r10
            java.lang.String r12 = "3"
            r2[r8] = r12
            java.lang.String r12 = "4"
            r2[r4] = r12
            java.lang.String r4 = "5"
            r2[r9] = r4
            java.lang.String r4 = "6"
            r2[r11] = r4
            java.util.Set r2 = kotlin.collections.SetsKt.setOf(r2)
            java.lang.String r4 = "columns"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r4, r2)
            r1[r0] = r2
            kotlin.ranges.IntRange r2 = new kotlin.ranges.IntRange
            r2.<init>(r6, r0)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r0 = new java.util.ArrayList
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r14)
            r0.<init>(r4)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r2 = r2.iterator()
        L211:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L226
            r4 = r2
            kotlin.collections.IntIterator r4 = (kotlin.collections.IntIterator) r4
            int r4 = r4.nextInt()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r0.add(r4)
            goto L211
        L226:
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r0 = kotlin.collections.CollectionsKt.toSet(r0)
            java.lang.String r2 = "rows"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r2, r0)
            r1[r13] = r0
            java.lang.String[] r0 = new java.lang.String[r8]
            java.lang.String r2 = "0"
            r0[r3] = r2
            r0[r6] = r7
            r0[r5] = r10
            java.util.Set r0 = kotlin.collections.SetsKt.setOf(r0)
            java.lang.String r2 = "gradientAngle"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r2, r0)
            r1[r14] = r0
            java.util.Map r0 = kotlin.collections.MapsKt.mapOf(r1)
            com.lumina.monsterhunterfieldbook.NativeBackup.enums = r0
            return
    }

    private NativeBackup() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void validate(org.json.JSONObject r27, boolean r28) {
            r26 = this;
            java.util.Iterator r0 = r27.keys()
            java.lang.String r1 = "keys(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
        L9:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L417
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            r3 = r27
            java.lang.Object r4 = r3.get(r2)
            boolean r5 = r4 instanceof java.lang.String
            if (r5 != 0) goto L41
            boolean r6 = r4 instanceof java.lang.Number
            if (r6 != 0) goto L41
            boolean r6 = r4 instanceof java.lang.Boolean
            if (r6 == 0) goto L28
            goto L41
        L28:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid setting value: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L41:
            if (r28 == 0) goto L69
            com.lumina.monsterhunterfieldbook.SettingsPanel$Companion r6 = com.lumina.monsterhunterfieldbook.SettingsPanel.Companion
            java.util.Set r6 = r6.getVisualKeys()
            boolean r6 = r6.contains(r2)
            if (r6 == 0) goto L50
            goto L69
        L50:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid saved-look setting: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L69:
            java.util.Map<java.lang.String, kotlin.ranges.IntRange> r6 = com.lumina.monsterhunterfieldbook.NativeBackup.integers
            boolean r7 = r6.containsKey(r2)
            if (r7 == 0) goto Lb5
            boolean r7 = r4 instanceof java.lang.Number
            if (r7 == 0) goto L9c
            r7 = r4
            java.lang.Number r7 = (java.lang.Number) r7
            double r8 = r7.doubleValue()
            int r10 = r7.intValue()
            double r10 = (double) r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L9c
            java.lang.Object r6 = kotlin.collections.MapsKt.getValue(r6, r2)
            kotlin.ranges.IntRange r6 = (kotlin.ranges.IntRange) r6
            int r8 = r6.getFirst()
            int r6 = r6.getLast()
            int r7 = r7.intValue()
            if (r8 > r7) goto L9c
            if (r7 > r6) goto L9c
            goto Lb5
        L9c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Setting is out of range: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        Lb5:
            java.util.Set<java.lang.String> r6 = com.lumina.monsterhunterfieldbook.NativeBackup.flags
            boolean r6 = r6.contains(r2)
            if (r6 == 0) goto Ldb
            boolean r6 = r4 instanceof java.lang.Boolean
            if (r6 == 0) goto Lc2
            goto Ldb
        Lc2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid switch: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        Ldb:
            java.util.Map<java.lang.String, java.util.Set<java.lang.String>> r6 = com.lumina.monsterhunterfieldbook.NativeBackup.enums
            java.lang.Object r6 = r6.get(r2)
            java.util.Set r6 = (java.util.Set) r6
            if (r6 == 0) goto L109
            java.lang.String r7 = r4.toString()
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto Lf0
            goto L109
        Lf0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown option: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L109:
            java.lang.String r6 = "theme"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r6)
            java.lang.String r7 = "game"
            r8 = 1
            r9 = 2
            r10 = 0
            if (r6 == 0) goto L147
            if (r5 == 0) goto L13b
            com.lumina.monsterhunterfieldbook.SettingsPanel$Companion r6 = com.lumina.monsterhunterfieldbook.SettingsPanel.Companion
            java.util.LinkedHashMap r6 = r6.getPalettes()
            java.util.Set r6 = r6.keySet()
            boolean r6 = r6.contains(r4)
            if (r6 != 0) goto L147
            java.lang.String[] r6 = new java.lang.String[r9]
            r6[r10] = r7
            java.lang.String r11 = "custom"
            r6[r8] = r11
            java.util.Set r6 = kotlin.collections.SetsKt.setOf(r6)
            boolean r6 = r6.contains(r4)
            if (r6 == 0) goto L13b
            goto L147
        L13b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown theme."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L147:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.lang.String r6 = "sort:"
            r11 = 0
            boolean r6 = kotlin.text.StringsKt.startsWith$default(r2, r6, r10, r9, r11)
            java.lang.String r12 = "tree"
            java.lang.String r13 = "attack"
            java.lang.String r14 = "rarity"
            java.lang.String r15 = "source"
            r16 = r8
            r8 = 5
            r17 = r10
            r18 = 4
            java.lang.String r10 = "name"
            r11 = 3
            if (r6 != 0) goto L179
            java.lang.String[] r6 = new java.lang.String[r9]
            java.lang.String r19 = "sortWeapons"
            r6[r17] = r19
            java.lang.String r19 = "sortResources"
            r6[r16] = r19
            java.util.Set r6 = kotlin.collections.SetsKt.setOf(r6)
            boolean r6 = r6.contains(r2)
            if (r6 == 0) goto L191
        L179:
            java.lang.String[] r6 = new java.lang.String[r8]
            r6[r17] = r10
            r6[r16] = r15
            r6[r9] = r14
            r6[r11] = r13
            r6[r18] = r12
            java.util.Set r6 = kotlin.collections.SetsKt.setOf(r6)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r6 = kotlin.collections.CollectionsKt.contains(r6, r4)
            if (r6 == 0) goto L40b
        L191:
            java.lang.String[] r6 = new java.lang.String[r11]
            java.lang.String r19 = "customBg"
            r6[r17] = r19
            java.lang.String r19 = "customAccent"
            r6[r16] = r19
            java.lang.String r19 = "customInk"
            r6[r9] = r19
            java.util.Set r6 = kotlin.collections.SetsKt.setOf(r6)
            boolean r6 = r6.contains(r2)
            if (r6 == 0) goto L1be
            boolean r6 = r4 instanceof java.lang.Integer
            if (r6 != 0) goto L1be
            boolean r6 = r4 instanceof java.lang.Long
            if (r6 == 0) goto L1b2
            goto L1be
        L1b2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid colour."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1be:
            if (r5 == 0) goto L3f1
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r4.length()
            r6 = 1048576(0x100000, float:1.469368E-39)
            if (r5 > r6) goto L3e5
            java.util.Set<java.lang.String> r5 = com.lumina.monsterhunterfieldbook.NativeBackup.objects
            boolean r5 = r5.contains(r2)
            java.lang.String r6 = "mapView:"
            java.lang.String r8 = "filter:"
            r20 = r11
            java.lang.String r11 = "goals:"
            r21 = r0
            java.lang.String r0 = "progress:"
            if (r5 != 0) goto L1fb
            r3 = r17
            r5 = 0
            boolean r17 = kotlin.text.StringsKt.startsWith$default(r2, r0, r3, r9, r5)
            if (r17 != 0) goto L1f9
            boolean r17 = kotlin.text.StringsKt.startsWith$default(r2, r11, r3, r9, r5)
            if (r17 != 0) goto L1f9
            boolean r17 = kotlin.text.StringsKt.startsWith$default(r2, r8, r3, r9, r5)
            if (r17 != 0) goto L1f9
            boolean r17 = kotlin.text.StringsKt.startsWith$default(r2, r6, r3, r9, r5)
            if (r17 == 0) goto L3f3
        L1f9:
            r17 = r3
        L1fb:
            r5 = r18
            java.lang.String[] r3 = new java.lang.String[r5]
            java.lang.String r5 = "bookmarks"
            r3[r17] = r5
            java.lang.String r5 = "recent"
            r3[r16] = r5
            java.lang.String r5 = "trackOrder"
            r3[r9] = r5
            java.lang.String r5 = "hiddenTracks"
            r3[r20] = r5
            java.util.Set r3 = kotlin.collections.SetsKt.setOf(r3)
            boolean r3 = r3.contains(r2)
            if (r3 == 0) goto L250
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>(r4)
            int r3 = r0.length()
            r4 = 20000(0x4e20, float:2.8026E-41)
            if (r3 > r4) goto L244
            int r3 = r0.length()
            r10 = 0
        L22b:
            if (r10 >= r3) goto L3f3
            java.lang.Object r4 = r0.get(r10)
            boolean r4 = r4 instanceof java.lang.String
            if (r4 == 0) goto L238
            int r10 = r10 + 1
            goto L22b
        L238:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid saved entry."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L244:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Too many saved entries."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L250:
            java.lang.String r3 = "visualProfiles"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r3 == 0) goto L2ab
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>(r4)
            int r3 = r0.length()
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 > r4) goto L29f
            int r3 = r0.length()
            r4 = 0
        L26a:
            if (r4 >= r3) goto L3f3
            org.json.JSONObject r5 = r0.getJSONObject(r4)
            java.lang.String r6 = r5.getString(r10)
            int r6 = r6.length()
            r7 = 50
            if (r6 > r7) goto L293
            com.lumina.monsterhunterfieldbook.NativeBackup r6 = com.lumina.monsterhunterfieldbook.NativeBackup.INSTANCE
            java.lang.String r7 = "values"
            org.json.JSONObject r5 = r5.getJSONObject(r7)
            java.lang.String r7 = "getJSONObject(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r7)
            r7 = r16
            r6.validate(r5, r7)
            int r4 = r4 + 1
            r16 = 1
            goto L26a
        L293:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Saved look name is too long."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L29f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Too many saved looks."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2ab:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>(r4)
            java.lang.String r4 = "readingGroups"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            if (r4 != 0) goto L2ce
            java.lang.String r4 = "campChecks"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            if (r4 != 0) goto L2ce
            r4 = 0
            r5 = 0
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r2, r0, r4, r9, r5)
            if (r0 != 0) goto L2ce
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r2, r11, r4, r9, r5)
            if (r0 == 0) goto L2f6
        L2ce:
            java.util.Iterator r0 = r3.keys()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
        L2d5:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L2f6
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r3.get(r4)
            boolean r4 = r4 instanceof java.lang.Boolean
            if (r4 == 0) goto L2ea
            goto L2d5
        L2ea:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid checklist value."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2f6:
            java.lang.String r0 = "musicPositions"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto L330
            java.util.Iterator r0 = r3.keys()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
        L305:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L330
            java.lang.Object r11 = r0.next()
            java.lang.String r11 = (java.lang.String) r11
            r22 = 0
            java.lang.Object r4 = r3.get(r11)
            boolean r4 = r4 instanceof java.lang.Number
            if (r4 == 0) goto L324
            double r4 = r3.getDouble(r11)
            int r4 = (r4 > r22 ? 1 : (r4 == r22 ? 0 : -1))
            if (r4 < 0) goto L324
            goto L305
        L324:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid music position."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L330:
            r22 = 0
            r4 = 0
            r5 = 0
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r2, r6, r4, r9, r5)
            if (r0 == 0) goto L385
            r0 = r20
            java.lang.String[] r5 = new java.lang.String[r0]
            java.lang.String r0 = "scale"
            r5[r4] = r0
            java.lang.String r0 = "x"
            r16 = 1
            r5[r16] = r0
            java.lang.String r0 = "y"
            r5[r9] = r0
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r5)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L356:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L384
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            r5 = r22
            double r22 = r3.optDouble(r4, r5)
            double r22 = java.lang.Math.abs(r22)
            r24 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r4 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r4 > 0) goto L378
            r22 = r5
            goto L356
        L378:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid map position."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L384:
            r4 = 0
        L385:
            r5 = 0
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r2, r8, r4, r9, r5)
            if (r0 == 0) goto L3f3
            r0 = 3
            java.lang.String[] r5 = new java.lang.String[r0]
            java.lang.String r0 = "all"
            r5[r4] = r0
            java.lang.String r6 = "world"
            r16 = 1
            r5[r16] = r6
            java.lang.String r6 = "iceborne"
            r5[r9] = r6
            java.util.Set r5 = kotlin.collections.SetsKt.setOf(r5)
            java.lang.String r0 = r3.optString(r7, r0)
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L3d9
            r0 = 5
            java.lang.String[] r0 = new java.lang.String[r0]
            r0[r4] = r10
            r0[r16] = r14
            r0[r9] = r13
            r20 = 3
            r0[r20] = r15
            r18 = 4
            r0[r18] = r12
            java.util.Set r0 = kotlin.collections.SetsKt.setOf(r0)
            java.lang.String r4 = "sort"
            java.lang.String r3 = r3.optString(r4, r10)
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L3cd
            goto L3f3
        L3cd:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid collection sort."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L3d9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid collection filter."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L3e5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Setting value is too large."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L3f1:
            r21 = r0
        L3f3:
            java.lang.String r0 = "tracks"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 != 0) goto L3ff
            r0 = r21
            goto L9
        L3ff:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Music files are managed on this device."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L40b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown sort order."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L417:
            return
    }

    static /* synthetic */ void validate$default(com.lumina.monsterhunterfieldbook.NativeBackup r0, org.json.JSONObject r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.validate(r1, r2)
            return
    }

    public final org.json.JSONObject decode(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8
            byte[] r0 = r4.getBytes(r0)
            java.lang.String r1 = "getBytes(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r0 = r0.length
            r1 = 2097152(0x200000, float:2.938736E-39)
            if (r0 > r1) goto L67
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r4)
            java.lang.String r4 = "format"
            java.lang.String r4 = r0.optString(r4)
            java.lang.String r1 = "monster-hunter-field-book-native"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r1)
            if (r4 == 0) goto L5b
            java.lang.String r4 = "version"
            int r4 = r0.optInt(r4)
            r1 = 1
            if (r4 != r1) goto L5b
            java.lang.String r4 = "values"
            org.json.JSONObject r4 = r0.getJSONObject(r4)
            int r0 = r4.length()
            r1 = 50000(0xc350, float:7.0065E-41)
            if (r0 > r1) goto L4f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r0 = 2
            r1 = 0
            r2 = 0
            validate$default(r3, r4, r2, r0, r1)
            java.lang.String r0 = "speedUndo"
            r4.remove(r0)
            return r4
        L4f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Backup contains too many settings."
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L5b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Choose a native Field Book backup."
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L67:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Backup is too large."
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    public final java.lang.String encode(org.json.JSONObject r5) {
            r4 = this;
            java.lang.String r0 = "values"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            org.json.JSONObject r1 = new org.json.JSONObject
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
            java.lang.String r5 = "tracks"
            r1.remove(r5)
            java.lang.String r5 = "speedUndo"
            r1.remove(r5)
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r2 = "format"
            java.lang.String r3 = "monster-hunter-field-book-native"
            org.json.JSONObject r5 = r5.put(r2, r3)
            java.lang.String r2 = "version"
            r3 = 1
            org.json.JSONObject r5 = r5.put(r2, r3)
            java.lang.String r2 = "appVersion"
            java.lang.String r3 = "0.2.0"
            org.json.JSONObject r5 = r5.put(r2, r3)
            org.json.JSONObject r5 = r5.put(r0, r1)
            r0 = 2
            java.lang.String r5 = r5.toString(r0)
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
    }
}
