package com.lumina.monsterhunterfieldbook;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* compiled from: Catalogue.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0016\u001a\u00020\u0017J+\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00132\u0006\u0010\u001a\u001a\u00020\u00152\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u001cH\u0002¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001f\u001a\u00020\u0015J \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u00132\u0006\u0010\u000b\u001a\u00020\u00152\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0015J(\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u00132\u0006\u0010\u001f\u001a\u00020\u00152\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$J\"\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$J(\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00190\u00132\u0006\u0010+\u001a\u00020\u00152\b\b\u0002\u0010!\u001a\u00020\u00152\b\b\u0002\u0010\"\u001a\u00020\fJ\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020$0-J\u0006\u0010.\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R&\u0010\u0012\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00140\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/Catalogue;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "executor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "getExecutor", "()Ljava/util/concurrent/ExecutorService;", "value", "", "ready", "getReady", "()Z", "db", "Landroid/database/sqlite/SQLiteDatabase;", "names", "", "Lkotlin/Triple;", "", "open", "", "rows", "Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "sql", "args", "", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;", "record", "id", "reference", "kind", "related", "offset", "", "limit", "browse", "Lcom/lumina/monsterhunterfieldbook/LibraryPage;", "filter", "Lcom/lumina/monsterhunterfieldbook/LibraryFilter;", "search", "query", "counts", "", "close", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Catalogue {
    private final Context context;
    private SQLiteDatabase db;
    private final ExecutorService executor;
    private List<Triple<String, String, String>> names;
    private volatile boolean ready;

    public Catalogue(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.executor = Executors.newSingleThreadExecutor();
        this.names = CollectionsKt.emptyList();
    }

    public final ExecutorService getExecutor() {
        return this.executor;
    }

    public final boolean getReady() {
        return this.ready;
    }

    public final void open() {
        Cursor rawQuery;
        File databasePath = this.context.getDatabasePath("catalogue-0.3.0.db");
        if (!databasePath.exists()) {
            File parentFile = databasePath.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            File file = new File(databasePath.getPath() + ".tmp");
            rawQuery = this.context.getAssets().open("catalogue.db");
            try {
                InputStream inputStream = rawQuery;
                rawQuery = new FileOutputStream(file);
                try {
                    Intrinsics.checkNotNull(inputStream);
                    ByteStreamsKt.copyTo$default(inputStream, rawQuery, 0, 2, null);
                    CloseableKt.closeFinally(rawQuery, null);
                    CloseableKt.closeFinally(rawQuery, null);
                    if (!file.renameTo(databasePath)) {
                        throw new IllegalStateException("Cannot install offline catalogue".toString());
                    }
                } finally {
                }
            } finally {
            }
        }
        SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(databasePath.getPath(), null, 1);
        Intrinsics.checkNotNullExpressionValue(openDatabase, "openDatabase(...)");
        this.db = openDatabase;
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase sQLiteDatabase = this.db;
        if (sQLiteDatabase == null) {
            Intrinsics.throwUninitializedPropertyAccessException("db");
            sQLiteDatabase = null;
        }
        rawQuery = sQLiteDatabase.rawQuery("SELECT id,name,kind FROM records", null);
        try {
            Cursor cursor = rawQuery;
            while (cursor.moveToNext()) {
                String string = cursor.getString(0);
                SearchRanking searchRanking = SearchRanking.INSTANCE;
                String string2 = cursor.getString(1);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                arrayList.add(new Triple(string, searchRanking.normalise(string2), cursor.getString(2)));
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(rawQuery, null);
            this.names = arrayList;
            this.ready = true;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    static /* synthetic */ List rows$default(Catalogue catalogue, String str, String[] strArr, int i, Object obj) {
        if ((i & 2) != 0) {
            strArr = new String[0];
        }
        return catalogue.rows(str, strArr);
    }

    private final List<FieldRecord> rows(String sql, String[] args) {
        if (!this.ready) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase sQLiteDatabase = this.db;
        if (sQLiteDatabase == null) {
            Intrinsics.throwUninitializedPropertyAccessException("db");
            sQLiteDatabase = null;
        }
        Cursor rawQuery = sQLiteDatabase.rawQuery(sql, args);
        try {
            Cursor cursor = rawQuery;
            while (cursor.moveToNext()) {
                String string = cursor.getString(0);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = cursor.getString(1);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                String string3 = cursor.getString(2);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                String string4 = cursor.getString(3);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                String string5 = cursor.getString(4);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                String string6 = cursor.getString(5);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                String string7 = cursor.getString(6);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                arrayList.add(new FieldRecord(string, string2, string3, string4, string5, string6, string7));
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(rawQuery, null);
            return arrayList;
        } finally {
        }
    }

    public final FieldRecord record(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return (FieldRecord) CollectionsKt.firstOrNull((List) rows("SELECT * FROM records WHERE id=?", new String[]{id}));
    }

    public static /* synthetic */ List reference$default(Catalogue catalogue, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return catalogue.reference(str, str2);
    }

    public final List<FieldRecord> reference(String value, String kind) {
        Intrinsics.checkNotNullParameter(value, "value");
        String str = kind == null ? "" : " AND kind=?";
        List mutableListOf = CollectionsKt.mutableListOf(value, value, value);
        if (kind != null) {
            mutableListOf.add(kind);
        }
        return rows("SELECT * FROM records WHERE (raw_id=? OR name=? COLLATE NOCASE OR id=?)" + str + " ORDER BY ordinal LIMIT 20", (String[]) mutableListOf.toArray(new String[0]));
    }

    public static /* synthetic */ List related$default(Catalogue catalogue, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 60;
        }
        return catalogue.related(str, i, i2);
    }

    public final List<FieldRecord> related(String id, int offset, int limit) {
        Intrinsics.checkNotNullParameter(id, "id");
        return rows("SELECT DISTINCT r.* FROM records r JOIN links l ON r.id=l.target WHERE l.source=? ORDER BY r.kind,r.name COLLATE NOCASE LIMIT ? OFFSET ?", new String[]{id, String.valueOf(limit), String.valueOf(offset)});
    }

    public static /* synthetic */ LibraryPage browse$default(Catalogue catalogue, LibraryFilter libraryFilter, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 60;
        }
        return catalogue.browse(libraryFilter, i, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0173, code lost:
    
        if (r2.equals("tree") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x017f, code lost:
    
        r2 = "ordinal";
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x017c, code lost:
    
        if (r2.equals("source") == false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LibraryPage browse(LibraryFilter filter, int offset, int limit) {
        String str;
        Intrinsics.checkNotNullParameter(filter, "filter");
        if (!this.ready) {
            return new LibraryPage(CollectionsKt.emptyList(), 0);
        }
        List mutableListOf = CollectionsKt.mutableListOf("kind=?");
        List mutableListOf2 = CollectionsKt.mutableListOf(filter.getKind());
        if (!StringsKt.isBlank(filter.getCategory())) {
            mutableListOf.add("category=?");
            mutableListOf2.add(filter.getCategory());
        }
        if (Intrinsics.areEqual(filter.getGame(), "world")) {
            mutableListOf.add("game IN ('world', 'both')");
        }
        if (!Intrinsics.areEqual(filter.getRank(), "all")) {
            mutableListOf.add("rank=?");
            mutableListOf2.add(filter.getRank());
        }
        if (!Intrinsics.areEqual(filter.getRarity(), "all")) {
            mutableListOf.add("rarity=?");
            mutableListOf2.add(filter.getRarity());
        }
        if (!Intrinsics.areEqual(filter.getType(), "all")) {
            mutableListOf.add("equipment_type=?");
            mutableListOf2.add(filter.getType());
        }
        for (String str2 : SearchRanking.INSTANCE.tokens(filter.getQuery())) {
            mutableListOf.add("(name LIKE ? ESCAPE '\\' OR summary LIKE ? ESCAPE '\\' OR payload LIKE ? ESCAPE '\\')");
            String str3 = "%" + StringsKt.replace$default(StringsKt.replace$default(str2, "%", "\\%", false, 4, (Object) null), "_", "\\_", false, 4, (Object) null) + "%";
            for (int i = 0; i < 3; i++) {
                mutableListOf2.add(str3);
            }
        }
        String joinToString$default = CollectionsKt.joinToString$default(mutableListOf, " AND ", null, null, 0, null, null, 62, null);
        SQLiteDatabase sQLiteDatabase = this.db;
        if (sQLiteDatabase == null) {
            Intrinsics.throwUninitializedPropertyAccessException("db");
            sQLiteDatabase = null;
        }
        List list = mutableListOf2;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT COUNT(*) FROM records WHERE " + joinToString$default, (String[]) list.toArray(new String[0]));
        try {
            Cursor cursor = rawQuery;
            cursor.moveToFirst();
            int i2 = cursor.getInt(0);
            CloseableKt.closeFinally(rawQuery, null);
            String sort = filter.getSort();
            switch (sort.hashCode()) {
                case -1407259064:
                    if (sort.equals("attack")) {
                        str = "attack DESC,name COLLATE NOCASE";
                        break;
                    }
                    str = "name COLLATE NOCASE";
                    break;
                case -938161749:
                    if (sort.equals("rarity")) {
                        str = "rarity DESC,name COLLATE NOCASE";
                        break;
                    }
                    str = "name COLLATE NOCASE";
                    break;
                case -896505829:
                    break;
                case 3568542:
                    break;
                default:
                    str = "name COLLATE NOCASE";
                    break;
            }
            return new LibraryPage(rows("SELECT * FROM records WHERE " + joinToString$default + " ORDER BY " + str + " LIMIT ? OFFSET ?", (String[]) CollectionsKt.plus((Collection) list, (Iterable) CollectionsKt.listOf((Object[]) new String[]{String.valueOf(limit), String.valueOf(offset)})).toArray(new String[0])), i2);
        } finally {
        }
    }

    public static /* synthetic */ List search$default(Catalogue catalogue, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "All";
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return catalogue.search(str, str2, z);
    }

    public final List<FieldRecord> search(final String query, final String kind, boolean related) {
        Object m79constructorimpl;
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (!this.ready) {
            return CollectionsKt.emptyList();
        }
        final List<String> list = SearchRanking.INSTANCE.tokens(query);
        if (list.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        String str = Intrinsics.areEqual(kind, "All") ? "" : " AND r.kind=?";
        List<String> list2 = list;
        List mutableListOf = CollectionsKt.mutableListOf(CollectionsKt.joinToString$default(list2, " ", null, null, 0, null, new Function1() { // from class: com.lumina.monsterhunterfieldbook.Catalogue$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence search$lambda$0;
                search$lambda$0 = Catalogue.search$lambda$0((String) obj);
                return search$lambda$0;
            }
        }, 30, null));
        if (!Intrinsics.areEqual(kind, "All")) {
            mutableListOf.add(kind);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Catalogue catalogue = this;
            m79constructorimpl = Result.m79constructorimpl(rows("SELECT r.* FROM records r JOIN names n ON r.id=n.id WHERE names MATCH ?" + str + " LIMIT 200", (String[]) mutableListOf.toArray(new String[0])));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m79constructorimpl = Result.m79constructorimpl(ResultKt.createFailure(th));
        }
        List emptyList = CollectionsKt.emptyList();
        if (Result.m85isFailureimpl(m79constructorimpl)) {
            m79constructorimpl = emptyList;
        }
        ArrayList arrayList = (List) m79constructorimpl;
        if (related) {
            List mutableListOf2 = CollectionsKt.mutableListOf("%" + StringsKt.replace$default(StringsKt.replace$default(query, "%", "\\%", false, 4, (Object) null), "_", "\\_", false, 4, (Object) null) + "%");
            if (!Intrinsics.areEqual(kind, "All")) {
                mutableListOf2.add(kind);
            }
            arrayList = rows("SELECT r.* FROM records r WHERE r.payload LIKE ? ESCAPE '\\'" + str + " LIMIT 120", (String[]) mutableListOf2.toArray(new String[0]));
        }
        if (arrayList.size() < 8 && list.size() <= 4) {
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).length() < 3) {
                        break;
                    }
                }
            }
            List plus = CollectionsKt.plus((Collection) arrayList, (Iterable) SequencesKt.toList(SequencesKt.mapNotNull(SequencesKt.take(SequencesKt.sortedWith(SequencesKt.mapNotNull(SequencesKt.filter(CollectionsKt.asSequence(this.names), new Function1() { // from class: com.lumina.monsterhunterfieldbook.Catalogue$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean search$lambda$3;
                    search$lambda$3 = Catalogue.search$lambda$3(kind, (Triple) obj);
                    return Boolean.valueOf(search$lambda$3);
                }
            }), new Function1() { // from class: com.lumina.monsterhunterfieldbook.Catalogue$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Pair search$lambda$4;
                    search$lambda$4 = Catalogue.search$lambda$4(list, (Triple) obj);
                    return search$lambda$4;
                }
            }), new Comparator() { // from class: com.lumina.monsterhunterfieldbook.Catalogue$search$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues((Integer) ((Pair) t).getSecond(), (Integer) ((Pair) t2).getSecond());
                }
            }), 15), new Function1() { // from class: com.lumina.monsterhunterfieldbook.Catalogue$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    FieldRecord search$lambda$6;
                    search$lambda$6 = Catalogue.search$lambda$6(Catalogue.this, (Pair) obj);
                    return search$lambda$6;
                }
            })));
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : plus) {
                if (hashSet.add(((FieldRecord) obj).getId())) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        }
        final Comparator comparator = new Comparator() { // from class: com.lumina.monsterhunterfieldbook.Catalogue$search$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(SearchRanking.INSTANCE.rank(((FieldRecord) t).getName(), query)), Integer.valueOf(SearchRanking.INSTANCE.rank(((FieldRecord) t2).getName(), query)));
            }
        };
        return CollectionsKt.take(CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.lumina.monsterhunterfieldbook.Catalogue$search$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compare = comparator.compare(t, t2);
                return compare != 0 ? compare : ComparisonsKt.compareValues(((FieldRecord) t).getName(), ((FieldRecord) t2).getName());
            }
        }), 100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence search$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "\"" + it + "\"*";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean search$lambda$3(String str, Triple it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(str, "All") || Intrinsics.areEqual(it.getThird(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair search$lambda$4(List list, Triple entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        List split$default = StringsKt.split$default((CharSequence) entry.getSecond(), new char[]{' '}, false, 0, 6, (Object) null);
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            Integer num = null;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            Iterator it2 = split$default.iterator();
            if (it2.hasNext()) {
                num = Integer.valueOf(SearchRanking.INSTANCE.distance((String) it2.next(), str));
                while (it2.hasNext()) {
                    Integer valueOf = Integer.valueOf(SearchRanking.INSTANCE.distance((String) it2.next(), str));
                    if (num.compareTo(valueOf) > 0) {
                        num = valueOf;
                    }
                }
            }
            Integer num2 = num;
            arrayList.add(Integer.valueOf(num2 != null ? num2.intValue() : 4));
        }
        ArrayList arrayList2 = arrayList;
        if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                if (((Number) it3.next()).intValue() > 1) {
                    break;
                }
            }
        }
        if (CollectionsKt.sumOfInt(arrayList2) <= 2) {
            return TuplesKt.to(entry.getFirst(), Integer.valueOf(CollectionsKt.sumOfInt(arrayList2)));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FieldRecord search$lambda$6(Catalogue catalogue, Pair it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return catalogue.record((String) it.getFirst());
    }

    public final Map<String, Integer> counts() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (this.ready) {
            SQLiteDatabase sQLiteDatabase = this.db;
            if (sQLiteDatabase == null) {
                Intrinsics.throwUninitializedPropertyAccessException("db");
                sQLiteDatabase = null;
            }
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT kind,COUNT(*) FROM records GROUP BY kind", null);
            try {
                Cursor cursor = rawQuery;
                while (cursor.moveToNext()) {
                    linkedHashMap.put(cursor.getString(0), Integer.valueOf(cursor.getInt(1)));
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(rawQuery, null);
            } finally {
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void close$lambda$0(Catalogue catalogue) {
        catalogue.ready = false;
        SQLiteDatabase sQLiteDatabase = catalogue.db;
        if (sQLiteDatabase != null) {
            if (sQLiteDatabase == null) {
                Intrinsics.throwUninitializedPropertyAccessException("db");
                sQLiteDatabase = null;
            }
            sQLiteDatabase.close();
        }
    }

    public final void close() {
        this.executor.execute(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.Catalogue$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Catalogue.close$lambda$0(Catalogue.this);
            }
        });
        this.executor.shutdown();
    }
}
