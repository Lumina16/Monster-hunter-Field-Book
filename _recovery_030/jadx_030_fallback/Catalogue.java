package com.lumina.monsterhunterfieldbook;

/* compiled from: Catalogue.kt */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0016\u001a\u00020\u0017J+\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00132\u0006\u0010\u001a\u001a\u00020\u00152\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u001cH\u0002¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001f\u001a\u00020\u0015J \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u00132\u0006\u0010\u000b\u001a\u00020\u00152\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0015J(\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u00132\u0006\u0010\u001f\u001a\u00020\u00152\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$J\"\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$J(\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00190\u00132\u0006\u0010+\u001a\u00020\u00152\b\b\u0002\u0010!\u001a\u00020\u00152\b\b\u0002\u0010\"\u001a\u00020\fJ\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020$0-J\u0006\u0010.\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R&\u0010\u0012\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00140\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/Catalogue;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "executor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "getExecutor", "()Ljava/util/concurrent/ExecutorService;", "value", "", "ready", "getReady", "()Z", "db", "Landroid/database/sqlite/SQLiteDatabase;", "names", "", "Lkotlin/Triple;", "", "open", "", "rows", "Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "sql", "args", "", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;", "record", "id", "reference", "kind", "related", "offset", "", "limit", "browse", "Lcom/lumina/monsterhunterfieldbook/LibraryPage;", "filter", "Lcom/lumina/monsterhunterfieldbook/LibraryFilter;", "search", "query", "counts", "", "close", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Catalogue {
    private final android.content.Context context;
    private android.database.sqlite.SQLiteDatabase db;
    private final java.util.concurrent.ExecutorService executor;
    private java.util.List<kotlin.Triple<java.lang.String, java.lang.String, java.lang.String>> names;
    private volatile boolean ready;

    public static /* synthetic */ boolean $r8$lambda$7rB7Nf0ljTMPDFv67lZcg6WL1C0(java.lang.String r0, kotlin.Triple r1) {
            boolean r0 = search$lambda$3(r0, r1)
            return r0
    }

    /* renamed from: $r8$lambda$eDTX-lzSQcoBKhMopg_kJEP7FBI, reason: not valid java name */
    public static /* synthetic */ java.lang.CharSequence m4$r8$lambda$eDTXlzSQcoBKhMopg_kJEP7FBI(java.lang.String r0) {
            java.lang.CharSequence r0 = search$lambda$0(r0)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$rvks4I_aL_tBWV8c0V3JxvRn_A4(com.lumina.monsterhunterfieldbook.Catalogue r0) {
            close$lambda$0(r0)
            return
    }

    public static /* synthetic */ kotlin.Pair $r8$lambda$z5dHVTS19xrNHilGKWPwlFOTk4w(java.util.List r0, kotlin.Triple r1) {
            kotlin.Pair r0 = search$lambda$4(r0, r1)
            return r0
    }

    /* renamed from: $r8$lambda$zh2-T7V8gcpmoBXiYFcrnAwK7k4, reason: not valid java name */
    public static /* synthetic */ com.lumina.monsterhunterfieldbook.FieldRecord m5$r8$lambda$zh2T7V8gcpmoBXiYFcrnAwK7k4(com.lumina.monsterhunterfieldbook.Catalogue r0, kotlin.Pair r1) {
            com.lumina.monsterhunterfieldbook.FieldRecord r0 = search$lambda$6(r0, r1)
            return r0
    }

    public Catalogue(android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.context = r2
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r1.executor = r2
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            r1.names = r2
            return
    }

    public static /* synthetic */ com.lumina.monsterhunterfieldbook.LibraryPage browse$default(com.lumina.monsterhunterfieldbook.Catalogue r0, com.lumina.monsterhunterfieldbook.LibraryFilter r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 60
        Lb:
            com.lumina.monsterhunterfieldbook.LibraryPage r0 = r0.browse(r1, r2, r3)
            return r0
    }

    private static final void close$lambda$0(com.lumina.monsterhunterfieldbook.Catalogue r1) {
            r0 = 0
            r1.ready = r0
            android.database.sqlite.SQLiteDatabase r1 = r1.db
            if (r1 == 0) goto L12
            if (r1 != 0) goto Lf
            java.lang.String r1 = "db"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r1 = 0
        Lf:
            r1.close()
        L12:
            return
    }

    public static /* synthetic */ java.util.List reference$default(com.lumina.monsterhunterfieldbook.Catalogue r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            java.util.List r0 = r0.reference(r1, r2)
            return r0
    }

    public static /* synthetic */ java.util.List related$default(com.lumina.monsterhunterfieldbook.Catalogue r0, java.lang.String r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 60
        Lb:
            java.util.List r0 = r0.related(r1, r2, r3)
            return r0
    }

    private final java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> rows(java.lang.String r13, java.lang.String[] r14) {
            r12 = this;
            java.lang.String r0 = "getString(...)"
            boolean r1 = r12.ready
            if (r1 != 0) goto Lb
            java.util.List r13 = kotlin.collections.CollectionsKt.emptyList()
            return r13
        Lb:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r1 = (java.util.List) r1
            android.database.sqlite.SQLiteDatabase r2 = r12.db
            r3 = 0
            if (r2 != 0) goto L1d
            java.lang.String r2 = "db"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            r2 = r3
        L1d:
            android.database.Cursor r13 = r2.rawQuery(r13, r14)
            java.io.Closeable r13 = (java.io.Closeable) r13
            r14 = r13
            android.database.Cursor r14 = (android.database.Cursor) r14     // Catch: java.lang.Throwable -> L76
        L26:
            boolean r2 = r14.moveToNext()     // Catch: java.lang.Throwable -> L76
            if (r2 == 0) goto L70
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L76
            com.lumina.monsterhunterfieldbook.FieldRecord r4 = new com.lumina.monsterhunterfieldbook.FieldRecord     // Catch: java.lang.Throwable -> L76
            r5 = 0
            java.lang.String r5 = r14.getString(r5)     // Catch: java.lang.Throwable -> L76
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)     // Catch: java.lang.Throwable -> L76
            r6 = 1
            java.lang.String r6 = r14.getString(r6)     // Catch: java.lang.Throwable -> L76
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)     // Catch: java.lang.Throwable -> L76
            r7 = 2
            java.lang.String r7 = r14.getString(r7)     // Catch: java.lang.Throwable -> L76
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)     // Catch: java.lang.Throwable -> L76
            r8 = 3
            java.lang.String r8 = r14.getString(r8)     // Catch: java.lang.Throwable -> L76
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)     // Catch: java.lang.Throwable -> L76
            r9 = 4
            java.lang.String r9 = r14.getString(r9)     // Catch: java.lang.Throwable -> L76
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)     // Catch: java.lang.Throwable -> L76
            r10 = 5
            java.lang.String r10 = r14.getString(r10)     // Catch: java.lang.Throwable -> L76
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)     // Catch: java.lang.Throwable -> L76
            r11 = 6
            java.lang.String r11 = r14.getString(r11)     // Catch: java.lang.Throwable -> L76
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)     // Catch: java.lang.Throwable -> L76
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L76
            r2.add(r4)     // Catch: java.lang.Throwable -> L76
            goto L26
        L70:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L76
            kotlin.io.CloseableKt.closeFinally(r13, r3)
            return r1
        L76:
            r0 = move-exception
            r14 = r0
            throw r14     // Catch: java.lang.Throwable -> L79
        L79:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r13, r14)
            throw r0
    }

    static /* synthetic */ java.util.List rows$default(com.lumina.monsterhunterfieldbook.Catalogue r0, java.lang.String r1, java.lang.String[] r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
        L7:
            java.util.List r0 = r0.rows(r1, r2)
            return r0
    }

    public static /* synthetic */ java.util.List search$default(com.lumina.monsterhunterfieldbook.Catalogue r0, java.lang.String r1, java.lang.String r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            java.lang.String r2 = "All"
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            java.util.List r0 = r0.search(r1, r2, r3)
            return r0
    }

    private static final java.lang.CharSequence search$lambda$0(java.lang.String r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\""
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = "\"*"
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            return r2
    }

    private static final boolean search$lambda$3(java.lang.String r1, kotlin.Triple r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "All"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L1a
            java.lang.Object r2 = r2.getThird()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r1)
            if (r1 == 0) goto L18
            goto L1a
        L18:
            r1 = 0
            return r1
        L1a:
            r1 = 1
            return r1
    }

    private static final kotlin.Pair search$lambda$4(java.util.List r8, kotlin.Triple r9) {
            java.lang.String r0 = "entry"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.Object r0 = r9.getSecond()
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0 = 1
            char[] r2 = new char[r0]
            r3 = 32
            r4 = 0
            r2[r4] = r3
            r5 = 6
            r6 = 0
            r3 = 0
            java.util.List r1 = kotlin.text.StringsKt.split$default(r1, r2, r3, r4, r5, r6)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r8, r3)
            r2.<init>(r3)
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r8 = r8.iterator()
        L2e:
            boolean r3 = r8.hasNext()
            r4 = 0
            if (r3 == 0) goto L8d
            java.lang.Object r3 = r8.next()
            java.lang.String r3 = (java.lang.String) r3
            r5 = r1
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L49
            goto L7b
        L49:
            java.lang.Object r4 = r5.next()
            java.lang.String r4 = (java.lang.String) r4
            com.lumina.monsterhunterfieldbook.SearchRanking r6 = com.lumina.monsterhunterfieldbook.SearchRanking.INSTANCE
            int r4 = r6.distance(r4, r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Comparable r4 = (java.lang.Comparable) r4
        L5b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L7b
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            com.lumina.monsterhunterfieldbook.SearchRanking r7 = com.lumina.monsterhunterfieldbook.SearchRanking.INSTANCE
            int r6 = r7.distance(r6, r3)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Comparable r6 = (java.lang.Comparable) r6
            int r7 = r4.compareTo(r6)
            if (r7 <= 0) goto L5b
            r4 = r6
            goto L5b
        L7b:
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L84
            int r3 = r4.intValue()
            goto L85
        L84:
            r3 = 4
        L85:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            goto L2e
        L8d:
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r8 = r2 instanceof java.util.Collection
            if (r8 == 0) goto L9f
            r8 = r2
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L9f
            goto Lb6
        L9f:
            java.util.Iterator r8 = r2.iterator()
        La3:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto Lb6
            java.lang.Object r1 = r8.next()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 > r0) goto Lce
            goto La3
        Lb6:
            int r8 = kotlin.collections.CollectionsKt.sumOfInt(r2)
            r0 = 2
            if (r8 > r0) goto Lce
            java.lang.Object r8 = r9.getFirst()
            int r9 = kotlin.collections.CollectionsKt.sumOfInt(r2)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            kotlin.Pair r8 = kotlin.TuplesKt.to(r8, r9)
            return r8
        Lce:
            return r4
    }

    private static final com.lumina.monsterhunterfieldbook.FieldRecord search$lambda$6(com.lumina.monsterhunterfieldbook.Catalogue r1, kotlin.Pair r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Object r2 = r2.getFirst()
            java.lang.String r2 = (java.lang.String) r2
            com.lumina.monsterhunterfieldbook.FieldRecord r1 = r1.record(r2)
            return r1
    }

    public final com.lumina.monsterhunterfieldbook.LibraryPage browse(com.lumina.monsterhunterfieldbook.LibraryFilter r21, int r22, int r23) {
            r20 = this;
            r1 = r20
            java.lang.String r0 = "filter"
            r2 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1.ready
            r3 = 0
            if (r0 != 0) goto L18
            com.lumina.monsterhunterfieldbook.LibraryPage r0 = new com.lumina.monsterhunterfieldbook.LibraryPage
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            r0.<init>(r2, r3)
            return r0
        L18:
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]
            java.lang.String r5 = "kind=?"
            r4[r3] = r5
            java.util.List r4 = kotlin.collections.CollectionsKt.mutableListOf(r4)
            java.lang.String[] r5 = new java.lang.String[r0]
            java.lang.String r6 = r2.getKind()
            r5[r3] = r6
            java.util.List r5 = kotlin.collections.CollectionsKt.mutableListOf(r5)
            java.lang.String r6 = r2.getCategory()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = kotlin.text.StringsKt.isBlank(r6)
            if (r6 != 0) goto L4d
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.String r7 = "category=?"
            r6.add(r7)
            r6 = r5
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.String r7 = r2.getCategory()
            r6.add(r7)
        L4d:
            java.lang.String r6 = r2.getGame()
            java.lang.String r7 = "world"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
            if (r6 == 0) goto L61
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.String r7 = "game IN ('world', 'both')"
            r6.add(r7)
        L61:
            java.lang.String r6 = r2.getRank()
            java.lang.String r7 = "all"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
            if (r6 != 0) goto L7f
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.String r8 = "rank=?"
            r6.add(r8)
            r6 = r5
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.String r8 = r2.getRank()
            r6.add(r8)
        L7f:
            java.lang.String r6 = r2.getRarity()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
            if (r6 != 0) goto L9b
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.String r8 = "rarity=?"
            r6.add(r8)
            r6 = r5
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.String r8 = r2.getRarity()
            r6.add(r8)
        L9b:
            java.lang.String r6 = r2.getType()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
            if (r6 != 0) goto Lb7
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.String r7 = "equipment_type=?"
            r6.add(r7)
            r6 = r5
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.String r7 = r2.getType()
            r6.add(r7)
        Lb7:
            com.lumina.monsterhunterfieldbook.SearchRanking r6 = com.lumina.monsterhunterfieldbook.SearchRanking.INSTANCE
            java.lang.String r7 = r2.getQuery()
            java.util.List r6 = r6.tokens(r7)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        Lc7:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L115
            java.lang.Object r7 = r6.next()
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            r7 = r4
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.String r9 = "(name LIKE ? ESCAPE '\\' OR summary LIKE ? ESCAPE '\\' OR payload LIKE ? ESCAPE '\\')"
            r7.add(r9)
            r12 = 4
            r13 = 0
            java.lang.String r9 = "%"
            java.lang.String r10 = "\\%"
            r11 = 0
            java.lang.String r14 = kotlin.text.StringsKt.replace$default(r8, r9, r10, r11, r12, r13)
            r18 = 4
            r19 = 0
            java.lang.String r15 = "_"
            java.lang.String r16 = "\\_"
            r17 = 0
            java.lang.String r7 = kotlin.text.StringsKt.replace$default(r14, r15, r16, r17, r18, r19)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "%"
            r8.<init>(r9)
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.StringBuilder r7 = r7.append(r9)
            java.lang.String r7 = r7.toString()
            r8 = r3
        L109:
            r9 = 3
            if (r8 >= r9) goto Lc7
            r9 = r5
            java.util.Collection r9 = (java.util.Collection) r9
            r9.add(r7)
            int r8 = r8 + 1
            goto L109
        L115:
            r9 = r4
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.lang.String r4 = " AND "
            r10 = r4
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            r16 = 62
            r17 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            java.lang.String r4 = kotlin.collections.CollectionsKt.joinToString$default(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            android.database.sqlite.SQLiteDatabase r6 = r1.db
            r7 = 0
            if (r6 != 0) goto L135
            java.lang.String r6 = "db"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
            r6 = r7
        L135:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "SELECT COUNT(*) FROM records WHERE "
            r8.<init>(r9)
            java.lang.StringBuilder r8 = r8.append(r4)
            java.lang.String r8 = r8.toString()
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.String[] r9 = new java.lang.String[r3]
            java.lang.Object[] r9 = r5.toArray(r9)
            java.lang.String[] r9 = (java.lang.String[]) r9
            android.database.Cursor r6 = r6.rawQuery(r8, r9)
            java.io.Closeable r6 = (java.io.Closeable) r6
            r8 = r6
            android.database.Cursor r8 = (android.database.Cursor) r8     // Catch: java.lang.Throwable -> L1e7
            r8.moveToFirst()     // Catch: java.lang.Throwable -> L1e7
            int r8 = r8.getInt(r3)     // Catch: java.lang.Throwable -> L1e7
            kotlin.io.CloseableKt.closeFinally(r6, r7)
            java.lang.String r2 = r2.getSort()
            int r6 = r2.hashCode()
            switch(r6) {
                case -1407259064: goto L18d;
                case -938161749: goto L182;
                case -896505829: goto L176;
                case 3568542: goto L16d;
                default: goto L16c;
            }
        L16c:
            goto L199
        L16d:
            java.lang.String r6 = "tree"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L17f
            goto L199
        L176:
            java.lang.String r6 = "source"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L17f
            goto L199
        L17f:
            java.lang.String r2 = "ordinal"
            goto L19b
        L182:
            java.lang.String r6 = "rarity"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L199
            java.lang.String r2 = "rarity DESC,name COLLATE NOCASE"
            goto L19b
        L18d:
            java.lang.String r6 = "attack"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L196
            goto L199
        L196:
            java.lang.String r2 = "attack DESC,name COLLATE NOCASE"
            goto L19b
        L199:
            java.lang.String r2 = "name COLLATE NOCASE"
        L19b:
            com.lumina.monsterhunterfieldbook.LibraryPage r6 = new com.lumina.monsterhunterfieldbook.LibraryPage
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "SELECT * FROM records WHERE "
            r7.<init>(r9)
            java.lang.StringBuilder r4 = r7.append(r4)
            java.lang.String r7 = " ORDER BY "
            java.lang.StringBuilder r4 = r4.append(r7)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = " LIMIT ? OFFSET ?"
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.String r7 = java.lang.String.valueOf(r23)
            r4[r3] = r7
            java.lang.String r7 = java.lang.String.valueOf(r22)
            r4[r0] = r7
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r4)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.CollectionsKt.plus(r5, r0)
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r0 = r0.toArray(r3)
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.util.List r0 = r1.rows(r2, r0)
            r6.<init>(r0, r8)
            return r6
        L1e7:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch: java.lang.Throwable -> L1ea
        L1ea:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r6, r2)
            throw r0
    }

    public final void close() {
            r2 = this;
            java.util.concurrent.ExecutorService r0 = r2.executor
            com.lumina.monsterhunterfieldbook.Catalogue$$ExternalSyntheticLambda0 r1 = new com.lumina.monsterhunterfieldbook.Catalogue$$ExternalSyntheticLambda0
            r1.<init>(r2)
            r0.execute(r1)
            java.util.concurrent.ExecutorService r0 = r2.executor
            r0.shutdown()
            return
    }

    public final java.util.Map<java.lang.String, java.lang.Integer> counts() {
            r7 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            boolean r1 = r7.ready
            if (r1 == 0) goto L47
            android.database.sqlite.SQLiteDatabase r1 = r7.db
            r2 = 0
            if (r1 != 0) goto L14
            java.lang.String r1 = "db"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r1 = r2
        L14:
            java.lang.String r3 = "SELECT kind,COUNT(*) FROM records GROUP BY kind"
            android.database.Cursor r1 = r1.rawQuery(r3, r2)
            java.io.Closeable r1 = (java.io.Closeable) r1
            r3 = r1
            android.database.Cursor r3 = (android.database.Cursor) r3     // Catch: java.lang.Throwable -> L40
        L1f:
            boolean r4 = r3.moveToNext()     // Catch: java.lang.Throwable -> L40
            if (r4 == 0) goto L3a
            r4 = r0
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Throwable -> L40
            r5 = 0
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Throwable -> L40
            r6 = 1
            int r6 = r3.getInt(r6)     // Catch: java.lang.Throwable -> L40
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L40
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L40
            goto L1f
        L3a:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L40
            kotlin.io.CloseableKt.closeFinally(r1, r2)
            goto L47
        L40:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L42
        L42:
            r2 = move-exception
            kotlin.io.CloseableKt.closeFinally(r1, r0)
            throw r2
        L47:
            java.util.Map r0 = (java.util.Map) r0
            return r0
    }

    public final java.util.concurrent.ExecutorService getExecutor() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.executor
            return r0
    }

    public final boolean getReady() {
            r1 = this;
            boolean r0 = r1.ready
            return r0
    }

    public final void open() {
            r13 = this;
            android.content.Context r0 = r13.context
            java.lang.String r1 = "catalogue-0.3.0.db"
            java.io.File r0 = r0.getDatabasePath(r1)
            boolean r1 = r0.exists()
            r2 = 2
            r3 = 0
            r4 = 0
            if (r1 != 0) goto L80
            java.io.File r1 = r0.getParentFile()
            if (r1 == 0) goto L1a
            r1.mkdirs()
        L1a:
            java.io.File r1 = new java.io.File
            java.lang.String r5 = r0.getPath()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r6 = ".tmp"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
            android.content.Context r5 = r13.context
            android.content.res.AssetManager r5 = r5.getAssets()
            java.lang.String r6 = "catalogue.db"
            java.io.InputStream r5 = r5.open(r6)
            java.io.Closeable r5 = (java.io.Closeable) r5
            r6 = r5
            java.io.InputStream r6 = (java.io.InputStream) r6     // Catch: java.lang.Throwable -> L79
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L79
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L79
            java.io.Closeable r7 = (java.io.Closeable) r7     // Catch: java.lang.Throwable -> L79
            r8 = r7
            java.io.FileOutputStream r8 = (java.io.FileOutputStream) r8     // Catch: java.lang.Throwable -> L72
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)     // Catch: java.lang.Throwable -> L72
            java.io.OutputStream r8 = (java.io.OutputStream) r8     // Catch: java.lang.Throwable -> L72
            kotlin.io.ByteStreamsKt.copyTo$default(r6, r8, r3, r2, r4)     // Catch: java.lang.Throwable -> L72
            kotlin.io.CloseableKt.closeFinally(r7, r4)     // Catch: java.lang.Throwable -> L79
            kotlin.io.CloseableKt.closeFinally(r5, r4)
            boolean r1 = r1.renameTo(r0)
            if (r1 == 0) goto L66
            goto L80
        L66:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot install offline catalogue"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L72:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L74
        L74:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r7, r0)     // Catch: java.lang.Throwable -> L79
            throw r1     // Catch: java.lang.Throwable -> L79
        L79:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L7b
        L7b:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r5, r0)
            throw r1
        L80:
            java.lang.String r0 = r0.getPath()
            r1 = 1
            android.database.sqlite.SQLiteDatabase r0 = android.database.sqlite.SQLiteDatabase.openDatabase(r0, r4, r1)
            java.lang.String r5 = "openDatabase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            r13.db = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            android.database.sqlite.SQLiteDatabase r5 = r13.db
            if (r5 != 0) goto La1
            java.lang.String r5 = "db"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            r5 = r4
        La1:
            java.lang.String r6 = "SELECT id,name,kind FROM records"
            android.database.Cursor r5 = r5.rawQuery(r6, r4)
            java.io.Closeable r5 = (java.io.Closeable) r5
            r6 = r5
            android.database.Cursor r6 = (android.database.Cursor) r6     // Catch: java.lang.Throwable -> Ldf
        Lac:
            boolean r7 = r6.moveToNext()     // Catch: java.lang.Throwable -> Ldf
            if (r7 == 0) goto Ld5
            r7 = r0
            java.util.Collection r7 = (java.util.Collection) r7     // Catch: java.lang.Throwable -> Ldf
            kotlin.Triple r8 = new kotlin.Triple     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r9 = r6.getString(r3)     // Catch: java.lang.Throwable -> Ldf
            com.lumina.monsterhunterfieldbook.SearchRanking r10 = com.lumina.monsterhunterfieldbook.SearchRanking.INSTANCE     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r11 = r6.getString(r1)     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r12 = "getString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r12)     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r10 = r10.normalise(r11)     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r11 = r6.getString(r2)     // Catch: java.lang.Throwable -> Ldf
            r8.<init>(r9, r10, r11)     // Catch: java.lang.Throwable -> Ldf
            r7.add(r8)     // Catch: java.lang.Throwable -> Ldf
            goto Lac
        Ld5:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Ldf
            kotlin.io.CloseableKt.closeFinally(r5, r4)
            r13.names = r0
            r13.ready = r1
            return
        Ldf:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> Le1
        Le1:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r5, r0)
            throw r1
    }

    public final com.lumina.monsterhunterfieldbook.FieldRecord record(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "SELECT * FROM records WHERE id=?"
            java.util.List r3 = r2.rows(r3, r0)
            java.lang.Object r3 = kotlin.collections.CollectionsKt.firstOrNull(r3)
            com.lumina.monsterhunterfieldbook.FieldRecord r3 = (com.lumina.monsterhunterfieldbook.FieldRecord) r3
            return r3
    }

    public final java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> reference(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            if (r6 != 0) goto La
            java.lang.String r0 = ""
            goto Lc
        La:
            java.lang.String r0 = " AND kind=?"
        Lc:
            r1 = 3
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            r1[r2] = r5
            r3 = 1
            r1[r3] = r5
            r3 = 2
            r1[r3] = r5
            java.util.List r5 = kotlin.collections.CollectionsKt.mutableListOf(r1)
            if (r6 == 0) goto L24
            r1 = r5
            java.util.Collection r1 = (java.util.Collection) r1
            r1.add(r6)
        L24:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "SELECT * FROM records WHERE (raw_id=? OR name=? COLLATE NOCASE OR id=?)"
            r6.<init>(r1)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r0 = " ORDER BY ordinal LIMIT 20"
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.Object[] r5 = r5.toArray(r0)
            java.lang.String[] r5 = (java.lang.String[]) r5
            java.util.List r5 = r4.rows(r6, r5)
            return r5
    }

    public final java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> related(java.lang.String r3, int r4, int r5) {
            r2 = this;
            java.lang.String r0 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 3
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r0[r3] = r5
            r3 = 2
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r0[r3] = r4
            java.lang.String r3 = "SELECT DISTINCT r.* FROM records r JOIN links l ON r.id=l.target WHERE l.source=? ORDER BY r.kind,r.name COLLATE NOCASE LIMIT ? OFFSET ?"
            java.util.List r3 = r2.rows(r3, r0)
            return r3
    }

    public final java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> search(java.lang.String r22, java.lang.String r23, boolean r24) {
            r21 = this;
            r1 = r21
            r2 = r22
            r8 = r23
            java.lang.String r0 = "SELECT r.* FROM records r JOIN names n ON r.id=n.id WHERE names MATCH ?"
            java.lang.String r3 = "query"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.lang.String r3 = "kind"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r3)
            boolean r3 = r1.ready
            if (r3 != 0) goto L1b
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            return r0
        L1b:
            com.lumina.monsterhunterfieldbook.SearchRanking r3 = com.lumina.monsterhunterfieldbook.SearchRanking.INSTANCE
            java.util.List r9 = r3.tokens(r2)
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L2c
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            return r0
        L2c:
            java.lang.String r10 = "All"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r10)
            if (r3 == 0) goto L37
            java.lang.String r3 = ""
            goto L39
        L37:
            java.lang.String r3 = " AND r.kind=?"
        L39:
            r11 = r3
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]
            r12 = r9
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.lang.String r5 = " "
            r13 = r5
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            com.lumina.monsterhunterfieldbook.Catalogue$$ExternalSyntheticLambda1 r18 = new com.lumina.monsterhunterfieldbook.Catalogue$$ExternalSyntheticLambda1
            r18.<init>()
            r19 = 30
            r20 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            java.lang.String r5 = kotlin.collections.CollectionsKt.joinToString$default(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r13 = 0
            r4[r13] = r5
            java.util.List r4 = kotlin.collections.CollectionsKt.mutableListOf(r4)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r10)
            if (r5 != 0) goto L6b
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            r5.add(r8)
        L6b:
            kotlin.Result$Companion r5 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L96
            r5 = r1
            com.lumina.monsterhunterfieldbook.Catalogue r5 = (com.lumina.monsterhunterfieldbook.Catalogue) r5     // Catch: java.lang.Throwable -> L96
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L96
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L96
            java.lang.StringBuilder r0 = r5.append(r11)     // Catch: java.lang.Throwable -> L96
            java.lang.String r5 = " LIMIT 200"
            java.lang.StringBuilder r0 = r0.append(r5)     // Catch: java.lang.Throwable -> L96
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L96
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L96
            java.lang.String[] r5 = new java.lang.String[r13]     // Catch: java.lang.Throwable -> L96
            java.lang.Object[] r4 = r4.toArray(r5)     // Catch: java.lang.Throwable -> L96
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch: java.lang.Throwable -> L96
            java.util.List r0 = r1.rows(r0, r4)     // Catch: java.lang.Throwable -> L96
            java.lang.Object r0 = kotlin.Result.m79constructorimpl(r0)     // Catch: java.lang.Throwable -> L96
            goto La1
        L96:
            r0 = move-exception
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m79constructorimpl(r0)
        La1:
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            boolean r5 = kotlin.Result.m85isFailureimpl(r0)
            if (r5 == 0) goto Lac
            r0 = r4
        Lac:
            java.util.List r0 = (java.util.List) r0
            if (r24 == 0) goto L113
            java.lang.String[] r0 = new java.lang.String[r3]
            r6 = 4
            r7 = 0
            java.lang.String r3 = "%"
            java.lang.String r4 = "\\%"
            r5 = 0
            java.lang.String r14 = kotlin.text.StringsKt.replace$default(r2, r3, r4, r5, r6, r7)
            r18 = 4
            r19 = 0
            java.lang.String r15 = "_"
            java.lang.String r16 = "\\_"
            r17 = 0
            java.lang.String r3 = kotlin.text.StringsKt.replace$default(r14, r15, r16, r17, r18, r19)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "%"
            r4.<init>(r5)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r3 = r3.toString()
            r0[r13] = r3
            java.util.List r0 = kotlin.collections.CollectionsKt.mutableListOf(r0)
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r10)
            if (r3 != 0) goto Lf0
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            r3.add(r8)
        Lf0:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "SELECT r.* FROM records r WHERE r.payload LIKE ? ESCAPE '\\'"
            r3.<init>(r4)
            java.lang.StringBuilder r3 = r3.append(r11)
            java.lang.String r4 = " LIMIT 120"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.String[] r4 = new java.lang.String[r13]
            java.lang.Object[] r0 = r0.toArray(r4)
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.util.List r0 = r1.rows(r3, r0)
        L113:
            int r3 = r0.size()
            r4 = 8
            if (r3 >= r4) goto L1b6
            int r3 = r9.size()
            r4 = 4
            if (r3 > r4) goto L1b6
            boolean r3 = r12 instanceof java.util.Collection
            if (r3 == 0) goto L130
            r3 = r12
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L130
            goto L148
        L130:
            java.util.Iterator r3 = r12.iterator()
        L134:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L148
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.length()
            r5 = 3
            if (r4 < r5) goto L1b6
            goto L134
        L148:
            java.util.List<kotlin.Triple<java.lang.String, java.lang.String, java.lang.String>> r3 = r1.names
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            kotlin.sequences.Sequence r3 = kotlin.collections.CollectionsKt.asSequence(r3)
            com.lumina.monsterhunterfieldbook.Catalogue$$ExternalSyntheticLambda2 r4 = new com.lumina.monsterhunterfieldbook.Catalogue$$ExternalSyntheticLambda2
            r4.<init>(r8)
            kotlin.sequences.Sequence r3 = kotlin.sequences.SequencesKt.filter(r3, r4)
            com.lumina.monsterhunterfieldbook.Catalogue$$ExternalSyntheticLambda3 r4 = new com.lumina.monsterhunterfieldbook.Catalogue$$ExternalSyntheticLambda3
            r4.<init>(r9)
            kotlin.sequences.Sequence r3 = kotlin.sequences.SequencesKt.mapNotNull(r3, r4)
            com.lumina.monsterhunterfieldbook.Catalogue$search$$inlined$sortedBy$1 r4 = new com.lumina.monsterhunterfieldbook.Catalogue$search$$inlined$sortedBy$1
            r4.<init>()
            java.util.Comparator r4 = (java.util.Comparator) r4
            kotlin.sequences.Sequence r3 = kotlin.sequences.SequencesKt.sortedWith(r3, r4)
            r4 = 15
            kotlin.sequences.Sequence r3 = kotlin.sequences.SequencesKt.take(r3, r4)
            com.lumina.monsterhunterfieldbook.Catalogue$$ExternalSyntheticLambda4 r4 = new com.lumina.monsterhunterfieldbook.Catalogue$$ExternalSyntheticLambda4
            r4.<init>(r1)
            kotlin.sequences.Sequence r3 = kotlin.sequences.SequencesKt.mapNotNull(r3, r4)
            java.util.List r3 = kotlin.sequences.SequencesKt.toList(r3)
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r0 = kotlin.collections.CollectionsKt.plus(r0, r3)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L198:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L1b3
            java.lang.Object r5 = r0.next()
            r6 = r5
            com.lumina.monsterhunterfieldbook.FieldRecord r6 = (com.lumina.monsterhunterfieldbook.FieldRecord) r6
            java.lang.String r6 = r6.getId()
            boolean r6 = r3.add(r6)
            if (r6 == 0) goto L198
            r4.add(r5)
            goto L198
        L1b3:
            r0 = r4
            java.util.List r0 = (java.util.List) r0
        L1b6:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            com.lumina.monsterhunterfieldbook.Catalogue$search$$inlined$compareBy$1 r3 = new com.lumina.monsterhunterfieldbook.Catalogue$search$$inlined$compareBy$1
            r3.<init>(r2)
            java.util.Comparator r3 = (java.util.Comparator) r3
            com.lumina.monsterhunterfieldbook.Catalogue$search$$inlined$thenBy$1 r2 = new com.lumina.monsterhunterfieldbook.Catalogue$search$$inlined$thenBy$1
            r2.<init>(r3)
            java.util.Comparator r2 = (java.util.Comparator) r2
            java.util.List r0 = kotlin.collections.CollectionsKt.sortedWith(r0, r2)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r2 = 100
            java.util.List r0 = kotlin.collections.CollectionsKt.take(r0, r2)
            return r0
    }
}
