package com.lumina.monsterhunterfieldbook;

import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import android.widget.TextView;
import com.lumina.monsterhunterfieldbook.LibraryScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: LibraryScreen.kt */
@Metadata(d1 = {"\u0000\u008b\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001,\u0018\u00002\u00020\u0001:\u0001CB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\fH\u0002J\u0018\u00100\u001a\n 1*\u0004\u0018\u00010\u00050\u00052\u0006\u0010/\u001a\u00020\fH\u0002J\u0010\u00102\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\fH\u0002J\b\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u00020\u0013H\u0002J\b\u00106\u001a\u00020\u000eH\u0002J\b\u00107\u001a\u00020\u000eH\u0002J\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u001aH\u0002J\u0010\u0010;\u001a\u0002042\u0006\u0010:\u001a\u00020\u001aH\u0002J\b\u0010<\u001a\u000204H\u0002J\u0012\u0010=\u001a\u0002042\b\b\u0002\u0010>\u001a\u00020\u0013H\u0002J\b\u0010?\u001a\u000204H\u0002J\u0006\u0010@\u001a\u00020\u0007J\u0006\u0010A\u001a\u00020\u0013J\b\u0010B\u001a\u000204H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0004\n\u0002\u0010-¨\u0006D"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/LibraryScreen;", "Landroid/widget/LinearLayout;", "a", "Lcom/lumina/monsterhunterfieldbook/MainActivity;", "section", "", "restored", "Lorg/json/JSONObject;", "<init>", "(Lcom/lumina/monsterhunterfieldbook/MainActivity;Ljava/lang/String;Lorg/json/JSONObject;)V", "collections", "", "Lcom/lumina/monsterhunterfieldbook/LibraryScreen$Collection;", "currentIndex", "", "collection", "filter", "Lcom/lumina/monsterhunterfieldbook/LibraryFilter;", "tree", "", "limit", "selection", "position", "topOffset", "records", "", "Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "depths", "", "generations", "Ljava/util/concurrent/atomic/AtomicInteger;", "handler", "Landroid/os/Handler;", "pending", "Ljava/lang/Runnable;", "status", "Landroid/widget/TextView;", "list", "Landroid/widget/AbsListView;", "listSlot", "Landroid/widget/FrameLayout;", "details", "more", "adapter", "com/lumina/monsterhunterfieldbook/LibraryScreen$adapter$1", "Lcom/lumina/monsterhunterfieldbook/LibraryScreen$adapter$1;", "key", "c", "defaultSort", "kotlin.jvm.PlatformType", "loadFilter", "saveFilter", "", "isGrid", "columns", "batchSize", "gridCard", "Landroid/view/View;", "record", "select", "positionReset", "load", "reset", "capturePosition", "snapshot", "closeSelection", "onDetachedFromWindow", "Collection", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LibraryScreen extends LinearLayout {
    private final MainActivity a;
    private final LibraryScreen$adapter$1 adapter;
    private Collection collection;
    private final List<Collection> collections;
    private final int currentIndex;
    private final Map<String, Integer> depths;
    private FrameLayout details;
    private LibraryFilter filter;
    private final AtomicInteger generations;
    private final Handler handler;
    private int limit;
    private AbsListView list;
    private final FrameLayout listSlot;
    private final TextView more;
    private Runnable pending;
    private int position;
    private final List<FieldRecord> records;
    private final JSONObject restored;
    private final String section;
    private String selection;
    private final TextView status;
    private int topOffset;
    private boolean tree;

    /* compiled from: LibraryScreen.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/LibraryScreen$Collection;", "", "kind", "", "category", "label", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKind", "()Ljava/lang/String;", "getCategory", "getLabel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final /* data */ class Collection {
        private final String category;
        private final String kind;
        private final String label;

        public static /* synthetic */ Collection copy$default(Collection collection, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = collection.kind;
            }
            if ((i & 2) != 0) {
                str2 = collection.category;
            }
            if ((i & 4) != 0) {
                str3 = collection.label;
            }
            return collection.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getKind() {
            return this.kind;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public final Collection copy(String kind, String category, String label) {
            Intrinsics.checkNotNullParameter(kind, "kind");
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(label, "label");
            return new Collection(kind, category, label);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Collection)) {
                return false;
            }
            Collection collection = (Collection) other;
            return Intrinsics.areEqual(this.kind, collection.kind) && Intrinsics.areEqual(this.category, collection.category) && Intrinsics.areEqual(this.label, collection.label);
        }

        public int hashCode() {
            return (((this.kind.hashCode() * 31) + this.category.hashCode()) * 31) + this.label.hashCode();
        }

        public String toString() {
            return "Collection(kind=" + this.kind + ", category=" + this.category + ", label=" + this.label + ")";
        }

        public Collection(String kind, String category, String label) {
            Intrinsics.checkNotNullParameter(kind, "kind");
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(label, "label");
            this.kind = kind;
            this.category = category;
            this.label = label;
        }

        public final String getCategory() {
            return this.category;
        }

        public final String getKind() {
            return this.kind;
        }

        public final String getLabel() {
            return this.label;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03c4, code lost:
    
        if (r10.equals("quests") == false) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LibraryScreen(MainActivity a, String section, JSONObject jSONObject) {
        super(a);
        int i;
        int i2;
        List<Collection> listOf;
        int i3;
        int i4;
        int number;
        String str;
        int i5;
        int i6;
        AbsListView absListView;
        String optString;
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(section, "section");
        this.a = a;
        this.section = section;
        this.restored = jSONObject;
        String str2 = "Quests";
        String str3 = "";
        switch (section.hashCode()) {
            case -948698159:
                i = 3;
                i2 = 0;
                if (section.equals("quests")) {
                    listOf = CollectionsKt.listOf(new Collection("Quests", "", "Quests"));
                    break;
                }
                i3 = 4;
                Collection[] collectionArr = new Collection[i3];
                collectionArr[i2] = new Collection("Items", "", "Resources");
                collectionArr[1] = new Collection("Recipes", "", "Recipe");
                collectionArr[2] = new Collection("Preparation", "", "Preparation quick reference");
                collectionArr[i] = new Collection("Quests", "", "Quests");
                listOf = CollectionsKt.listOf((Object[]) collectionArr);
                break;
            case 105008833:
                i = 3;
                i2 = 0;
                if (section.equals("notes")) {
                    listOf = CollectionsKt.listOf(new Collection("Field Notes", "", "Field notes"));
                    break;
                }
                i3 = 4;
                Collection[] collectionArr2 = new Collection[i3];
                collectionArr2[i2] = new Collection("Items", "", "Resources");
                collectionArr2[1] = new Collection("Recipes", "", "Recipe");
                collectionArr2[2] = new Collection("Preparation", "", "Preparation quick reference");
                collectionArr2[i] = new Collection("Quests", "", "Quests");
                listOf = CollectionsKt.listOf((Object[]) collectionArr2);
                break;
            case 338410841:
                i = 3;
                i2 = 0;
                if (section.equals("locales")) {
                    listOf = CollectionsKt.listOf((Object[]) new Collection[]{new Collection("Locales", "", "Hunting locales"), new Collection("Maps", "", "Atlases & bases")});
                    break;
                }
                i3 = 4;
                Collection[] collectionArr22 = new Collection[i3];
                collectionArr22[i2] = new Collection("Items", "", "Resources");
                collectionArr22[1] = new Collection("Recipes", "", "Recipe");
                collectionArr22[2] = new Collection("Preparation", "", "Preparation quick reference");
                collectionArr22[i] = new Collection("Quests", "", "Quests");
                listOf = CollectionsKt.listOf((Object[]) collectionArr22);
                break;
            case 1076356494:
                i = 3;
                i2 = 0;
                if (section.equals("equipment")) {
                    List<Pair> listOf2 = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("armours", "Armour"), TuplesKt.to("armourSets", "Armour sets"), TuplesKt.to("decorations", "Decorations"), TuplesKt.to("skills", "Skills"), TuplesKt.to("charms", "Charms"), TuplesKt.to("kinsects", "Kinsects"), TuplesKt.to("palicoEquipment", "Palico equipment"), TuplesKt.to("palicoGadgets", "Palico gadgets"), TuplesKt.to("tools", "Specialised tools"), TuplesKt.to("canteen", "Canteen"), TuplesKt.to("foodSkills", "Food skills")});
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOf2, 10));
                    for (Pair pair : listOf2) {
                        arrayList.add(new Collection("Equipment", (String) pair.getFirst(), (String) pair.getSecond()));
                    }
                    listOf = CollectionsKt.plus((java.util.Collection<? extends Collection>) arrayList, new Collection("Builds", "", "Build templates"));
                    break;
                }
                i3 = 4;
                Collection[] collectionArr222 = new Collection[i3];
                collectionArr222[i2] = new Collection("Items", "", "Resources");
                collectionArr222[1] = new Collection("Recipes", "", "Recipe");
                collectionArr222[2] = new Collection("Preparation", "", "Preparation quick reference");
                collectionArr222[i] = new Collection("Quests", "", "Quests");
                listOf = CollectionsKt.listOf((Object[]) collectionArr222);
                break;
            case 1223328215:
                i = 3;
                i2 = 0;
                if (section.equals("weapons")) {
                    listOf = CollectionsKt.listOf((Object[]) new Collection[]{new Collection("Weapons", "", "Weapon database"), new Collection("Weapon Guides", "", "14 weapon handbooks")});
                    break;
                }
                i3 = 4;
                Collection[] collectionArr2222 = new Collection[i3];
                collectionArr2222[i2] = new Collection("Items", "", "Resources");
                collectionArr2222[1] = new Collection("Recipes", "", "Recipe");
                collectionArr2222[2] = new Collection("Preparation", "", "Preparation quick reference");
                collectionArr2222[i] = new Collection("Quests", "", "Quests");
                listOf = CollectionsKt.listOf((Object[]) collectionArr2222);
                break;
            case 1842985283:
                if (section.equals("bestiary")) {
                    i = 3;
                    i2 = 0;
                    listOf = CollectionsKt.listOf((Object[]) new Collection[]{new Collection("Monsters", "", "Large monsters"), new Collection("Creatures", "smallMonsters", "Small monsters"), new Collection("Creatures", "endemicLife", "Endemic life")});
                    break;
                } else {
                    i = 3;
                    i3 = 4;
                    i2 = 0;
                    Collection[] collectionArr22222 = new Collection[i3];
                    collectionArr22222[i2] = new Collection("Items", "", "Resources");
                    collectionArr22222[1] = new Collection("Recipes", "", "Recipe");
                    collectionArr22222[2] = new Collection("Preparation", "", "Preparation quick reference");
                    collectionArr22222[i] = new Collection("Quests", "", "Quests");
                    listOf = CollectionsKt.listOf((Object[]) collectionArr22222);
                    break;
                }
            default:
                i = 3;
                i2 = 0;
                i3 = 4;
                Collection[] collectionArr222222 = new Collection[i3];
                collectionArr222222[i2] = new Collection("Items", "", "Resources");
                collectionArr222222[1] = new Collection("Recipes", "", "Recipe");
                collectionArr222222[2] = new Collection("Preparation", "", "Preparation quick reference");
                collectionArr222222[i] = new Collection("Quests", "", "Quests");
                listOf = CollectionsKt.listOf((Object[]) collectionArr222222);
                break;
        }
        this.collections = listOf;
        JSONObject jSONObject2 = this.restored;
        if (jSONObject2 != null) {
            number = jSONObject2.optInt("collection");
            i4 = i2;
        } else {
            i4 = i2;
            number = this.a.getPrefs().number("collection:" + this.section, i4);
        }
        int coerceIn = RangesKt.coerceIn(number, i4, CollectionsKt.getLastIndex(listOf));
        this.currentIndex = coerceIn;
        Collection collection = listOf.get(coerceIn);
        this.collection = collection;
        this.filter = loadFilter(collection);
        JSONObject jSONObject3 = this.restored;
        this.tree = jSONObject3 != null ? jSONObject3.optBoolean("tree") : false;
        JSONObject jSONObject4 = this.restored;
        this.limit = jSONObject4 != null ? jSONObject4.optInt("limit") : 60;
        JSONObject jSONObject5 = this.restored;
        if (jSONObject5 != null && (optString = jSONObject5.optString("selected")) != null) {
            str3 = optString;
        }
        this.selection = str3;
        JSONObject jSONObject6 = this.restored;
        this.position = jSONObject6 != null ? jSONObject6.optInt("position") : NativePrefs.flag$default(this.a.getPrefs(), "rememberScroll", false, 2, null) ? this.a.getPrefs().number("position:" + this.section, 0) : 0;
        JSONObject jSONObject7 = this.restored;
        this.topOffset = jSONObject7 != null ? jSONObject7.optInt("top") : 0;
        this.records = new ArrayList();
        this.depths = new LinkedHashMap();
        this.generations = new AtomicInteger();
        this.handler = new Handler(Looper.getMainLooper());
        MainActivity mainActivity = this.a;
        this.status = MainActivity.text$default(mainActivity, "", 12.0f, false, mainActivity.getMuted(), 4, null);
        this.listSlot = new FrameLayout(this.a);
        this.more = this.a.button("Show more", new Function0() { // from class: com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit more$lambda$0;
                more$lambda$0 = LibraryScreen.more$lambda$0(LibraryScreen.this);
                return more$lambda$0;
            }
        });
        this.adapter = new LibraryScreen$adapter$1(this);
        setOrientation(1);
        LinearLayout row = this.a.row();
        row.setPadding(this.a.dp((Number) 14), this.a.dp((Number) 10), this.a.dp((Number) 10), this.a.dp((Number) 4));
        MainActivity mainActivity2 = this.a;
        String str4 = this.section;
        switch (str4.hashCode()) {
            case -948698159:
                break;
            case 105008833:
                if (str4.equals("notes")) {
                    str2 = "Field Notes";
                    str = str2;
                    break;
                }
                str2 = "Item Libraries";
                str = str2;
            case 338410841:
                if (str4.equals("locales")) {
                    str2 = "Locales & bases";
                    str = str2;
                    break;
                }
                str2 = "Item Libraries";
                str = str2;
            case 1076356494:
                if (str4.equals("equipment")) {
                    str2 = "Equipment";
                    str = str2;
                    break;
                }
                str2 = "Item Libraries";
                str = str2;
            case 1223328215:
                if (str4.equals("weapons")) {
                    str = "Weapons";
                    break;
                }
                str2 = "Item Libraries";
                str = str2;
                break;
            case 1842985283:
                if (str4.equals("bestiary")) {
                    str2 = "Bestiary";
                    str = str2;
                    break;
                }
                str2 = "Item Libraries";
                str = str2;
            default:
                str2 = "Item Libraries";
                str = str2;
                break;
        }
        row.addView(MainActivity.text$default(mainActivity2, str, 24.0f, true, 0, 8, null), new LinearLayout.LayoutParams(0, -2, 1.0f));
        if (Intrinsics.areEqual(this.section, "preparation")) {
            row.addView(this.a.button("Camp checklist", new Function0() { // from class: com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit _init_$lambda$0;
                    _init_$lambda$0 = LibraryScreen._init_$lambda$0(LibraryScreen.this);
                    return _init_$lambda$0;
                }
            }));
        }
        addView(row);
        Spinner spinner = new Spinner(this.a);
        spinner.setContentDescription("Library collection");
        MainActivity mainActivity3 = this.a;
        List<Collection> list = listOf;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Collection) it.next()).getLabel());
        }
        spinner.setAdapter((SpinnerAdapter) new ArrayAdapter(mainActivity3, android.R.layout.simple_spinner_dropdown_item, arrayList2));
        spinner.setSelection(this.currentIndex);
        addView(spinner, new LinearLayout.LayoutParams(-1, this.a.dp((Number) 46)));
        LinearLayout row2 = this.a.row();
        row2.setPadding(this.a.dp((Number) 10), 0, this.a.dp((Number) 10), 0);
        EditText editText = new EditText(this.a);
        editText.setSingleLine(true);
        editText.setHint("Filter this collection");
        editText.setTextColor(this.a.getInk());
        editText.setHintTextColor(this.a.getMuted());
        editText.setTextSize(15.0f);
        editText.setContentDescription("Filter this collection");
        editText.setText(this.filter.getQuery());
        row2.addView(editText, new LinearLayout.LayoutParams(0, this.a.dp((Number) 48), 1.0f));
        TextView button = this.a.button("Filters", new Function0() { // from class: com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        });
        row2.addView(button);
        addView(row2);
        final LinearLayout column = this.a.column();
        column.setVisibility(8);
        column.setPadding(this.a.dp((Number) 12), 0, this.a.dp((Number) 12), this.a.dp((Number) 6));
        addView(column);
        this.a.touch(button, new Function0() { // from class: com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit _init_$lambda$4;
                _init_$lambda$4 = LibraryScreen._init_$lambda$4(column);
                return _init_$lambda$4;
            }
        });
        Pair[] pairArr = new Pair[i];
        pairArr[0] = TuplesKt.to("all", "World + Iceborne");
        pairArr[1] = TuplesKt.to("world", "World");
        pairArr[2] = TuplesKt.to("iceborne", "Iceborne");
        _init_$choices(this, column, "Game", CollectionsKt.listOf((Object[]) pairArr), this.filter.getGame(), new Function1() { // from class: com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$7;
                _init_$lambda$7 = LibraryScreen._init_$lambda$7(LibraryScreen.this, (String) obj);
                return _init_$lambda$7;
            }
        });
        _init_$choices(this, column, "Rank", CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("all", "All ranks"), TuplesKt.to("LR", "Low Rank"), TuplesKt.to("HR", "High Rank"), TuplesKt.to("MR", "Master Rank")}), this.filter.getRank(), new Function1() { // from class: com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$8;
                _init_$lambda$8 = LibraryScreen._init_$lambda$8(LibraryScreen.this, (String) obj);
                return _init_$lambda$8;
            }
        });
        List listOf3 = CollectionsKt.listOf(TuplesKt.to("all", "All rarities"));
        IntRange intRange = new IntRange(1, 12);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator<Integer> it2 = intRange.iterator();
        while (it2.hasNext()) {
            int nextInt = ((IntIterator) it2).nextInt();
            arrayList3.add(TuplesKt.to(String.valueOf(nextInt), "Rarity " + nextInt));
        }
        _init_$choices(this, column, "Rarity", CollectionsKt.plus((java.util.Collection) listOf3, (Iterable) arrayList3), this.filter.getRarity(), new Function1() { // from class: com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$10;
                _init_$lambda$10 = LibraryScreen._init_$lambda$10(LibraryScreen.this, (String) obj);
                return _init_$lambda$10;
            }
        });
        _init_$choices(this, column, "Sort", CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("name", "Name A–Z"), TuplesKt.to("source", "Source order"), TuplesKt.to("rarity", "Highest rarity"), TuplesKt.to("attack", "Highest attack")}), this.filter.getSort(), new Function1() { // from class: com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$11;
                _init_$lambda$11 = LibraryScreen._init_$lambda$11(LibraryScreen.this, (String) obj);
                return _init_$lambda$11;
            }
        });
        if (Intrinsics.areEqual(this.collection.getKind(), "Weapons")) {
            i6 = 4;
            i5 = 8;
            List listOf4 = CollectionsKt.listOf((Object[]) new String[]{"great-sword", "long-sword", "sword-and-shield", "dual-blades", "hammer", "hunting-horn", "lance", "gunlance", "switch-axe", "charge-blade", "insect-glaive", "bow", "light-bowgun", "heavy-bowgun"});
            List listOf5 = CollectionsKt.listOf(TuplesKt.to("all", "All weapon types"));
            List<String> list2 = listOf4;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (String str5 : list2) {
                arrayList4.add(TuplesKt.to(str5, ContentText.INSTANCE.label(str5)));
            }
            _init_$choices(this, column, "Weapon", CollectionsKt.plus((java.util.Collection) listOf5, (Iterable) arrayList4), this.filter.getType(), new Function1() { // from class: com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit _init_$lambda$13;
                    _init_$lambda$13 = LibraryScreen._init_$lambda$13(LibraryScreen.this, (String) obj);
                    return _init_$lambda$13;
                }
            });
            Switch r2 = new Switch(this.a);
            r2.setText("Weapon family tree");
            r2.setTextColor(this.a.getInk());
            r2.setChecked(this.tree);
            r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda5
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    LibraryScreen._init_$lambda$14(LibraryScreen.this, compoundButton, z);
                }
            });
            column.addView(r2);
        } else {
            i5 = 8;
            i6 = 4;
        }
        column.addView(this.a.button("Clear filters", new Function0() { // from class: com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit _init_$lambda$15;
                _init_$lambda$15 = LibraryScreen._init_$lambda$15(LibraryScreen.this);
                return _init_$lambda$15;
            }
        }));
        this.status.setPadding(this.a.dp((Number) 14), this.a.dp((Number) 7), this.a.dp((Number) 14), this.a.dp((Number) 7));
        addView(this.status);
        LinearLayout row3 = this.a.row();
        row3.setGravity(48);
        row3.addView(this.listSlot, new LinearLayout.LayoutParams(0, -1, this.a.getUseSplitLibrary() ? 0.43f : 1.0f));
        if (this.a.getUseSplitLibrary()) {
            FrameLayout frameLayout = new FrameLayout(this.a);
            this.details = frameLayout;
            row3.addView(frameLayout, new LinearLayout.LayoutParams(0, -1, 0.57f));
            FrameLayout frameLayout2 = this.details;
            Intrinsics.checkNotNull(frameLayout2);
            MainActivity mainActivity4 = this.a;
            TextView text$default = MainActivity.text$default(mainActivity4, "Select an entry to read its complete profile.", 14.0f, false, mainActivity4.getMuted(), 4, null);
            this.a.pad(text$default, 18);
            frameLayout2.addView(text$default);
        }
        addView(row3, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        addView(this.more, new LinearLayout.LayoutParams(-1, this.a.dp((Number) 44)));
        if (isGrid()) {
            GridView gridView = new GridView(this.a);
            gridView.setNumColumns(columns());
            gridView.setStretchMode(2);
            gridView.setHorizontalSpacing(this.a.dp(Integer.valueOf(columns() > 3 ? i6 : i5)));
            gridView.setVerticalSpacing(this.a.dp((Number) 7));
            gridView.setPadding(this.a.dp((Number) 8), 0, this.a.dp((Number) 8), this.a.dp((Number) 8));
            this.list = gridView;
        } else {
            ListView listView = new ListView(this.a);
            listView.setDividerHeight(0);
            listView.setPadding(this.a.dp((Number) 6), 0, this.a.dp((Number) 6), this.a.dp((Number) 6));
            this.list = listView;
        }
        AbsListView absListView2 = this.list;
        if (absListView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("list");
            absListView2 = null;
        }
        absListView2.setAdapter((ListAdapter) this.adapter);
        FrameLayout frameLayout3 = this.listSlot;
        AbsListView absListView3 = this.list;
        if (absListView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("list");
            absListView3 = null;
        }
        frameLayout3.addView(absListView3, new FrameLayout.LayoutParams(-1, -1));
        AbsListView absListView4 = this.list;
        if (absListView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("list");
            absListView = null;
        } else {
            absListView = absListView4;
        }
        absListView.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.lumina.monsterhunterfieldbook.LibraryScreen.16
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView v, int first, int visible, int total) {
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView v, int state) {
                if (state == 0) {
                    LibraryScreen.this.capturePosition();
                }
            }
        });
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.lumina.monsterhunterfieldbook.LibraryScreen.17
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> p) {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> p, View v, int position, long id) {
                if (Intrinsics.areEqual(LibraryScreen.this.collection, LibraryScreen.this.collections.get(position))) {
                    return;
                }
                LibraryScreen.this.a.getPrefs().set("collection:" + LibraryScreen.this.section, Integer.valueOf(position));
                MainActivity mainActivity5 = LibraryScreen.this.a;
                String str6 = LibraryScreen.this.section;
                JSONObject put = new JSONObject().put("collection", position);
                Intrinsics.checkNotNullExpressionValue(put, "put(...)");
                mainActivity5.replaceLibraryState(str6, put);
                LibraryScreen.this.a.refreshCurrentSection();
            }
        });
        editText.addTextChangedListener(new AnonymousClass18());
        if (this.restored == null) {
            this.limit = batchSize();
        }
        load(false);
    }

    public /* synthetic */ LibraryScreen(MainActivity mainActivity, String str, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mainActivity, str, (i & 4) != 0 ? null : jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit more$lambda$0(LibraryScreen libraryScreen) {
        libraryScreen.capturePosition();
        libraryScreen.limit += libraryScreen.batchSize();
        libraryScreen.load(false);
        return Unit.INSTANCE;
    }

    private final String key(Collection c) {
        String str = this.section;
        String category = c.getCategory();
        if (StringsKt.isBlank(category)) {
            category = c.getKind();
        }
        return "filter:" + str + ":" + ((Object) category) + ":" + this.a.getEdition();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        if (r1.equals("Recipes") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r1.equals("Items") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005b, code lost:
    
        r5 = "sortResources";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String defaultSort(Collection c) {
        String str;
        NativePrefs prefs = this.a.getPrefs();
        String kind = c.getKind();
        int hashCode = kind.hashCode();
        if (hashCode != -1547897723) {
            if (hashCode != -1406985801) {
                if (hashCode == 70973344) {
                }
            } else if (kind.equals("Weapons")) {
                str = "sortWeapons";
            }
            String category = c.getCategory();
            if (StringsKt.isBlank(category)) {
                category = c.getKind();
            }
            str = "sort:" + ((Object) category);
        }
        return prefs.text(str, "name");
    }

    private final LibraryFilter loadFilter(Collection c) {
        Object m79constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            LibraryScreen libraryScreen = this;
            m79constructorimpl = Result.m79constructorimpl(new JSONObject(this.a.getPrefs().text(key(c), "{}")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m79constructorimpl = Result.m79constructorimpl(ResultKt.createFailure(th));
        }
        JSONObject jSONObject = new JSONObject();
        if (Result.m85isFailureimpl(m79constructorimpl)) {
            m79constructorimpl = jSONObject;
        }
        JSONObject jSONObject2 = (JSONObject) m79constructorimpl;
        String kind = c.getKind();
        String category = c.getCategory();
        String optString = jSONObject2.optString("query");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        String optString2 = jSONObject2.optString("game", this.a.getEdition());
        Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
        String optString3 = jSONObject2.optString("rank", "all");
        Intrinsics.checkNotNullExpressionValue(optString3, "optString(...)");
        String optString4 = jSONObject2.optString("rarity", "all");
        Intrinsics.checkNotNullExpressionValue(optString4, "optString(...)");
        String optString5 = jSONObject2.optString("type", "all");
        Intrinsics.checkNotNullExpressionValue(optString5, "optString(...)");
        String optString6 = jSONObject2.optString("sort", defaultSort(c));
        Intrinsics.checkNotNullExpressionValue(optString6, "optString(...)");
        return new LibraryFilter(kind, category, optString, optString2, optString3, optString4, optString5, optString6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveFilter() {
        NativePrefs prefs = this.a.getPrefs();
        String key = key(this.collection);
        String jSONObject = new JSONObject().put("query", this.filter.getQuery()).put("game", this.filter.getGame()).put("rank", this.filter.getRank()).put("rarity", this.filter.getRarity()).put("type", this.filter.getType()).put("sort", this.filter.getSort()).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        prefs.set(key, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isGrid() {
        return Intrinsics.areEqual(this.section, "bestiary");
    }

    private final int columns() {
        String text = this.a.getPrefs().text("columns", "auto");
        Intrinsics.checkNotNullExpressionValue(text, "text(...)");
        Integer intOrNull = StringsKt.toIntOrNull(text);
        if (intOrNull != null) {
            return RangesKt.coerceIn(intOrNull.intValue(), 1, 6);
        }
        if (this.a.getWide()) {
            return 4;
        }
        return this.a.getLandscape() ? 3 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int batchSize() {
        if (!isGrid()) {
            return 60;
        }
        int columns = columns();
        String text = this.a.getPrefs().text("rows", "6");
        Intrinsics.checkNotNullExpressionValue(text, "text(...)");
        Integer intOrNull = StringsKt.toIntOrNull(text);
        return columns * RangesKt.coerceIn(intOrNull != null ? intOrNull.intValue() : 6, 1, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(LibraryScreen libraryScreen) {
        libraryScreen.a.showCampChecklist();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$4(LinearLayout linearLayout) {
        linearLayout.setVisibility(linearLayout.getVisibility() == 8 ? 0 : 8);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [T, java.lang.Object] */
    private static final void _init_$choices(final LibraryScreen libraryScreen, LinearLayout linearLayout, String str, final List<Pair<String, String>> list, String str2, final Function1<? super String, Unit> function1) {
        LinearLayout row = libraryScreen.a.row();
        row.addView(MainActivity.text$default(libraryScreen.a, str, 12.0f, false, 0, 12, null), new LinearLayout.LayoutParams(libraryScreen.a.dp((Number) 70), -2));
        Spinner spinner = new Spinner(libraryScreen.a);
        spinner.setContentDescription(str);
        MainActivity mainActivity = libraryScreen.a;
        List<Pair<String, String>> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Pair) it.next()).getSecond());
        }
        spinner.setAdapter((SpinnerAdapter) new ArrayAdapter(mainActivity, android.R.layout.simple_spinner_dropdown_item, arrayList));
        Iterator<Pair<String, String>> it2 = list.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(it2.next().getFirst(), str2)) {
                break;
            } else {
                i++;
            }
        }
        int coerceAtLeast = RangesKt.coerceAtLeast(i, 0);
        spinner.setSelection(coerceAtLeast);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = list.get(coerceAtLeast).getFirst();
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.lumina.monsterhunterfieldbook.LibraryScreen$choices$2
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> p) {
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Object, java.lang.String] */
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> p, View v, int position, long id) {
                String first = list.get(position).getFirst();
                if (Intrinsics.areEqual(first, objectRef.element)) {
                    return;
                }
                objectRef.element = first;
                function1.invoke(first);
                libraryScreen.saveFilter();
                LibraryScreen libraryScreen2 = libraryScreen;
                libraryScreen2.limit = libraryScreen2.batchSize();
                libraryScreen.positionReset();
                LibraryScreen.load$default(libraryScreen, false, 1, null);
            }
        });
        row.addView(spinner, new LinearLayout.LayoutParams(0, libraryScreen.a.dp((Number) 44), 1.0f));
        linearLayout.addView(row);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$7(LibraryScreen libraryScreen, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        libraryScreen.filter = LibraryFilter.copy$default(libraryScreen.filter, null, null, null, it, null, null, null, null, 247, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$8(LibraryScreen libraryScreen, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        libraryScreen.filter = LibraryFilter.copy$default(libraryScreen.filter, null, null, null, null, it, null, null, null, 239, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$10(LibraryScreen libraryScreen, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        libraryScreen.filter = LibraryFilter.copy$default(libraryScreen.filter, null, null, null, null, null, it, null, null, 223, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$11(LibraryScreen libraryScreen, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        libraryScreen.filter = LibraryFilter.copy$default(libraryScreen.filter, null, null, null, null, null, null, null, it, 127, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$13(LibraryScreen libraryScreen, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        libraryScreen.filter = LibraryFilter.copy$default(libraryScreen.filter, null, null, null, null, null, null, it, null, 191, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$14(LibraryScreen libraryScreen, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        libraryScreen.tree = z;
        libraryScreen.positionReset();
        load$default(libraryScreen, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$15(LibraryScreen libraryScreen) {
        libraryScreen.a.getPrefs().set(libraryScreen.key(libraryScreen.collection), "{}");
        libraryScreen.a.getPrefs().set("position:" + libraryScreen.section, 0);
        MainActivity mainActivity = libraryScreen.a;
        String str = libraryScreen.section;
        JSONObject put = new JSONObject().put("collection", libraryScreen.collections.indexOf(libraryScreen.collection));
        Intrinsics.checkNotNullExpressionValue(put, "put(...)");
        mainActivity.replaceLibraryState(str, put);
        libraryScreen.a.refreshCurrentSection();
        return Unit.INSTANCE;
    }

    /* compiled from: LibraryScreen.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u000bH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u000e"}, d2 = {"com/lumina/monsterhunterfieldbook/LibraryScreen$18", "Landroid/text/TextWatcher;", "beforeTextChanged", "", "s", "", "start", "", "count", "after", "afterTextChanged", "Landroid/text/Editable;", "onTextChanged", "before", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.lumina.monsterhunterfieldbook.LibraryScreen$18, reason: invalid class name */
    public static final class AnonymousClass18 implements TextWatcher {
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        AnonymousClass18() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            LibraryScreen libraryScreen = LibraryScreen.this;
            libraryScreen.filter = LibraryFilter.copy$default(libraryScreen.filter, null, null, String.valueOf(s), null, null, null, null, null, 251, null);
            LibraryScreen.this.saveFilter();
            Runnable runnable = LibraryScreen.this.pending;
            if (runnable != null) {
                LibraryScreen.this.handler.removeCallbacks(runnable);
            }
            final LibraryScreen libraryScreen2 = LibraryScreen.this;
            libraryScreen2.pending = new Runnable() { // from class: com.lumina.monsterhunterfieldbook.LibraryScreen$18$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    LibraryScreen.AnonymousClass18.onTextChanged$lambda$1(LibraryScreen.this);
                }
            };
            Handler handler = LibraryScreen.this.handler;
            Runnable runnable2 = LibraryScreen.this.pending;
            Intrinsics.checkNotNull(runnable2);
            handler.postDelayed(runnable2, 180L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onTextChanged$lambda$1(LibraryScreen libraryScreen) {
            libraryScreen.positionReset();
            libraryScreen.limit = libraryScreen.batchSize();
            LibraryScreen.load$default(libraryScreen, false, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View gridCard(final FieldRecord record) {
        LinearLayout column = this.a.column();
        column.setGravity(17);
        column.setBackground(MainActivity.surface$default(this.a, 0, false, 0.0f, 7, null));
        LinearLayout linearLayout = column;
        this.a.pad(linearLayout, columns() > 3 ? 3 : 9);
        ImageView imageView = new ImageView(this.a);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setContentDescription(record.getName() + " artwork");
        column.addView(imageView, new LinearLayout.LayoutParams(-1, this.a.dp(Integer.valueOf(columns() > 3 ? 50 : columns() == 3 ? 75 : 120))));
        if (!StringsKt.isBlank(record.getImage())) {
            this.a.assetImage(record.getImage(), imageView);
        }
        TextView text$default = MainActivity.text$default(this.a, record.getName(), columns() > 3 ? 9.0f : 13.0f, false, 0, 12, null);
        text$default.setGravity(17);
        text$default.setMaxLines(3);
        text$default.setEllipsize(TextUtils.TruncateAt.END);
        column.addView(text$default, new LinearLayout.LayoutParams(-1, this.a.dp(Integer.valueOf(columns() > 3 ? 40 : 46))));
        this.a.touch(linearLayout, new Function0() { // from class: com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit gridCard$lambda$2;
                gridCard$lambda$2 = LibraryScreen.gridCard$lambda$2(LibraryScreen.this, record);
                return gridCard$lambda$2;
            }
        });
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gridCard$lambda$2(LibraryScreen libraryScreen, FieldRecord fieldRecord) {
        libraryScreen.select(fieldRecord);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void select(FieldRecord record) {
        this.selection = record.getId();
        final FrameLayout frameLayout = this.details;
        if (frameLayout == null) {
            this.a.showRecord(record);
            return;
        }
        frameLayout.removeAllViews();
        frameLayout.addView(new RecordPanel(this.a, record, new Function0() { // from class: com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit select$lambda$0;
                select$lambda$0 = LibraryScreen.select$lambda$0(LibraryScreen.this, frameLayout);
                return select$lambda$0;
            }
        }), new FrameLayout.LayoutParams(-1, -1));
        this.adapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit select$lambda$0(LibraryScreen libraryScreen, FrameLayout frameLayout) {
        libraryScreen.selection = "";
        frameLayout.removeAllViews();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void positionReset() {
        this.position = 0;
        this.topOffset = 0;
    }

    static /* synthetic */ void load$default(LibraryScreen libraryScreen, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        libraryScreen.load(z);
    }

    private final void load(boolean reset) {
        if (reset) {
            positionReset();
        }
        if (!this.a.getCatalogue().getReady()) {
            this.status.setText("Preparing offline catalogue…");
            return;
        }
        final int incrementAndGet = this.generations.incrementAndGet();
        final LibraryFilter libraryFilter = this.filter;
        final int coerceAtMost = (this.tree && Intrinsics.areEqual(this.collection.getKind(), "Weapons")) ? 10000 : RangesKt.coerceAtMost(this.limit, 12000);
        this.status.setText("Loading…");
        this.more.setEnabled(false);
        this.a.getCatalogue().getExecutor().execute(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                LibraryScreen.load$lambda$0(LibraryScreen.this, libraryFilter, coerceAtMost, incrementAndGet);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$0(final LibraryScreen libraryScreen, LibraryFilter libraryFilter, int i, final int i2) {
        final Object m79constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m79constructorimpl = Result.m79constructorimpl(libraryScreen.a.getCatalogue().browse(libraryFilter, 0, i));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m79constructorimpl = Result.m79constructorimpl(ResultKt.createFailure(th));
        }
        libraryScreen.a.runOnUiThread(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                LibraryScreen.load$lambda$0$1(LibraryScreen.this, i2, m79constructorimpl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$0$1(final LibraryScreen libraryScreen, int i, Object obj) {
        if (libraryScreen.isAttachedToWindow() && i == libraryScreen.generations.get()) {
            if (Result.m82exceptionOrNullimpl(obj) != null) {
                libraryScreen.status.setText("Could not load this library. Reopen it to try again.");
            }
            if (Result.m86isSuccessimpl(obj)) {
                LibraryPage libraryPage = (LibraryPage) obj;
                libraryScreen.records.clear();
                libraryScreen.depths.clear();
                if (libraryScreen.tree && Intrinsics.areEqual(libraryScreen.collection.getKind(), "Weapons")) {
                    List<FieldRecord> records = libraryPage.getRecords();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(records, 10)), 16));
                    for (Object obj2 : records) {
                        linkedHashMap.put(((FieldRecord) obj2).data().optString("id"), obj2);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj3 : records) {
                        String optString = ((FieldRecord) obj3).data().optString("parent");
                        Object obj4 = linkedHashMap2.get(optString);
                        if (obj4 == null) {
                            obj4 = (List) new ArrayList();
                            linkedHashMap2.put(optString, obj4);
                        }
                        ((List) obj4).add(obj3);
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : records) {
                        if (!linkedHashMap.containsKey(((FieldRecord) obj5).data().optString("parent"))) {
                            arrayList.add(obj5);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        load$lambda$0$1$1$append(linkedHashSet, libraryScreen, linkedHashMap2, (FieldRecord) it.next(), 0);
                    }
                    Iterator<T> it2 = records.iterator();
                    while (it2.hasNext()) {
                        load$lambda$0$1$1$append(linkedHashSet, libraryScreen, linkedHashMap2, (FieldRecord) it2.next(), 0);
                    }
                } else {
                    CollectionsKt.addAll(libraryScreen.records, libraryPage.getRecords());
                }
                libraryScreen.status.setText(libraryScreen.records.size() + " / " + libraryPage.getTotal() + " entries");
                libraryScreen.more.setVisibility(libraryScreen.records.size() >= libraryPage.getTotal() ? 8 : 0);
                libraryScreen.more.setEnabled(true);
                libraryScreen.adapter.notifyDataSetChanged();
                AbsListView absListView = libraryScreen.list;
                Object obj6 = null;
                if (absListView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("list");
                    absListView = null;
                }
                absListView.post(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        LibraryScreen.load$lambda$0$1$1$6(LibraryScreen.this);
                    }
                });
                if (StringsKt.isBlank(libraryScreen.selection) || libraryScreen.details == null) {
                    return;
                }
                Iterator<T> it3 = libraryScreen.records.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next = it3.next();
                    if (Intrinsics.areEqual(((FieldRecord) next).getId(), libraryScreen.selection)) {
                        obj6 = next;
                        break;
                    }
                }
                FieldRecord fieldRecord = (FieldRecord) obj6;
                if (fieldRecord != null) {
                    libraryScreen.select(fieldRecord);
                } else {
                    libraryScreen.a.getCatalogue().getExecutor().execute(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda10
                        @Override // java.lang.Runnable
                        public final void run() {
                            LibraryScreen.load$lambda$0$1$1$9(LibraryScreen.this);
                        }
                    });
                }
            }
        }
    }

    private static final void load$lambda$0$1$1$append(Set<String> set, LibraryScreen libraryScreen, Map<String, ? extends List<FieldRecord>> map, FieldRecord fieldRecord, int i) {
        if (set.add(fieldRecord.getId())) {
            libraryScreen.records.add(fieldRecord);
            libraryScreen.depths.put(fieldRecord.getId(), Integer.valueOf(RangesKt.coerceAtMost(i, 10)));
            List<FieldRecord> list = map.get(fieldRecord.data().optString("id"));
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    load$lambda$0$1$1$append(set, libraryScreen, map, (FieldRecord) it.next(), i + 1);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$0$1$1$6(LibraryScreen libraryScreen) {
        AbsListView absListView = libraryScreen.list;
        AbsListView absListView2 = null;
        if (absListView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("list");
            absListView = null;
        }
        if (absListView instanceof ListView) {
            AbsListView absListView3 = libraryScreen.list;
            if (absListView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("list");
            } else {
                absListView2 = absListView3;
            }
            ((ListView) absListView2).setSelectionFromTop(libraryScreen.position, libraryScreen.topOffset);
            return;
        }
        AbsListView absListView4 = libraryScreen.list;
        if (absListView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("list");
        } else {
            absListView2 = absListView4;
        }
        absListView2.setSelection(libraryScreen.position);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$0$1$1$9(final LibraryScreen libraryScreen) {
        final FieldRecord record = libraryScreen.a.getCatalogue().record(libraryScreen.selection);
        libraryScreen.a.runOnUiThread(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.LibraryScreen$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                LibraryScreen.load$lambda$0$1$1$9$0(LibraryScreen.this, record);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$0$1$1$9$0(LibraryScreen libraryScreen, FieldRecord fieldRecord) {
        if (!libraryScreen.isAttachedToWindow() || fieldRecord == null) {
            return;
        }
        libraryScreen.select(fieldRecord);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void capturePosition() {
        AbsListView absListView = this.list;
        if (absListView != null) {
            if (absListView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("list");
                absListView = null;
            }
            this.position = absListView.getFirstVisiblePosition();
            AbsListView absListView2 = this.list;
            if (absListView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("list");
                absListView2 = null;
            }
            View childAt = absListView2.getChildAt(0);
            this.topOffset = childAt != null ? childAt.getTop() : 0;
        }
        if (NativePrefs.flag$default(this.a.getPrefs(), "rememberScroll", false, 2, null)) {
            this.a.getPrefs().set("position:" + this.section, Integer.valueOf(this.position));
        }
    }

    public final JSONObject snapshot() {
        capturePosition();
        JSONObject put = new JSONObject().put("collection", this.collections.indexOf(this.collection)).put("limit", this.limit).put("position", this.position).put("top", this.topOffset).put("selected", this.selection).put("tree", this.tree);
        Intrinsics.checkNotNullExpressionValue(put, "put(...)");
        return put;
    }

    public final boolean closeSelection() {
        FrameLayout frameLayout;
        if (StringsKt.isBlank(this.selection) || (frameLayout = this.details) == null) {
            return false;
        }
        this.selection = "";
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.adapter.notifyDataSetChanged();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.generations.incrementAndGet();
        Runnable runnable = this.pending;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
        }
        super.onDetachedFromWindow();
    }
}
