package com.lumina.monsterhunterfieldbook;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import kotlin.uuid.Uuid;
import org.json.JSONObject;

/* compiled from: WeaponTreePanel.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\"\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\u0011J$\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bJ\u001e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/WeaponTreeLayout;", "", "<init>", "()V", "BASE_SCALE", "", "NODE_WIDTH", "NODE_HEIGHT", "DEPTH_GAP", "LEAF_GAP", "rawId", "", "record", "Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "parentId", "rootOf", "byId", "", "build", "Lcom/lumina/monsterhunterfieldbook/WeaponTreeLayout$Graph;", "records", "", "requestedFamily", "selected", "clampPan", "value", "viewport", "content", "Position", "Graph", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WeaponTreeLayout {
    public static final float BASE_SCALE = 0.5f;
    public static final float DEPTH_GAP = 270.0f;
    public static final WeaponTreeLayout INSTANCE = new WeaponTreeLayout();
    public static final float LEAF_GAP = 116.0f;
    public static final float NODE_HEIGHT = 88.0f;
    public static final float NODE_WIDTH = 232.0f;

    private WeaponTreeLayout() {
    }

    /* compiled from: WeaponTreePanel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/WeaponTreeLayout$Position;", "", "x", "", "y", "<init>", "(FF)V", "getX", "()F", "getY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Position {
        private final float x;
        private final float y;

        public static /* synthetic */ Position copy$default(Position position, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = position.x;
            }
            if ((i & 2) != 0) {
                f2 = position.y;
            }
            return position.copy(f, f2);
        }

        /* renamed from: component1, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* renamed from: component2, reason: from getter */
        public final float getY() {
            return this.y;
        }

        public final Position copy(float x, float y) {
            return new Position(x, y);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Position)) {
                return false;
            }
            Position position = (Position) other;
            return Float.compare(this.x, position.x) == 0 && Float.compare(this.y, position.y) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.x) * 31) + Float.hashCode(this.y);
        }

        public String toString() {
            return "Position(x=" + this.x + ", y=" + this.y + ")";
        }

        public Position(float f, float f2) {
            this.x = f;
            this.y = f2;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }
    }

    /* compiled from: WeaponTreePanel.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0015\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003Jq\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001b¨\u0006-"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/WeaponTreeLayout$Graph;", "", "family", "", "roots", "", "Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "records", "positions", "", "Lcom/lumina/monsterhunterfieldbook/WeaponTreeLayout$Position;", "selected", "width", "", "height", "rootY", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;FFF)V", "getFamily", "()Ljava/lang/String;", "getRoots", "()Ljava/util/List;", "getRecords", "getPositions", "()Ljava/util/Map;", "getSelected", "getWidth", "()F", "getHeight", "getRootY", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Graph {
        private final String family;
        private final float height;
        private final Map<String, Position> positions;
        private final List<FieldRecord> records;
        private final float rootY;
        private final List<FieldRecord> roots;
        private final String selected;
        private final float width;

        public static /* synthetic */ Graph copy$default(Graph graph, String str, List list, List list2, Map map, String str2, float f, float f2, float f3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = graph.family;
            }
            if ((i & 2) != 0) {
                list = graph.roots;
            }
            if ((i & 4) != 0) {
                list2 = graph.records;
            }
            if ((i & 8) != 0) {
                map = graph.positions;
            }
            if ((i & 16) != 0) {
                str2 = graph.selected;
            }
            if ((i & 32) != 0) {
                f = graph.width;
            }
            if ((i & 64) != 0) {
                f2 = graph.height;
            }
            if ((i & Uuid.SIZE_BITS) != 0) {
                f3 = graph.rootY;
            }
            float f4 = f2;
            float f5 = f3;
            String str3 = str2;
            float f6 = f;
            return graph.copy(str, list, list2, map, str3, f6, f4, f5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFamily() {
            return this.family;
        }

        public final List<FieldRecord> component2() {
            return this.roots;
        }

        public final List<FieldRecord> component3() {
            return this.records;
        }

        public final Map<String, Position> component4() {
            return this.positions;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSelected() {
            return this.selected;
        }

        /* renamed from: component6, reason: from getter */
        public final float getWidth() {
            return this.width;
        }

        /* renamed from: component7, reason: from getter */
        public final float getHeight() {
            return this.height;
        }

        /* renamed from: component8, reason: from getter */
        public final float getRootY() {
            return this.rootY;
        }

        public final Graph copy(String family, List<FieldRecord> roots, List<FieldRecord> records, Map<String, Position> positions, String selected, float width, float height, float rootY) {
            Intrinsics.checkNotNullParameter(family, "family");
            Intrinsics.checkNotNullParameter(roots, "roots");
            Intrinsics.checkNotNullParameter(records, "records");
            Intrinsics.checkNotNullParameter(positions, "positions");
            Intrinsics.checkNotNullParameter(selected, "selected");
            return new Graph(family, roots, records, positions, selected, width, height, rootY);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Graph)) {
                return false;
            }
            Graph graph = (Graph) other;
            return Intrinsics.areEqual(this.family, graph.family) && Intrinsics.areEqual(this.roots, graph.roots) && Intrinsics.areEqual(this.records, graph.records) && Intrinsics.areEqual(this.positions, graph.positions) && Intrinsics.areEqual(this.selected, graph.selected) && Float.compare(this.width, graph.width) == 0 && Float.compare(this.height, graph.height) == 0 && Float.compare(this.rootY, graph.rootY) == 0;
        }

        public int hashCode() {
            return (((((((((((((this.family.hashCode() * 31) + this.roots.hashCode()) * 31) + this.records.hashCode()) * 31) + this.positions.hashCode()) * 31) + this.selected.hashCode()) * 31) + Float.hashCode(this.width)) * 31) + Float.hashCode(this.height)) * 31) + Float.hashCode(this.rootY);
        }

        public String toString() {
            return "Graph(family=" + this.family + ", roots=" + this.roots + ", records=" + this.records + ", positions=" + this.positions + ", selected=" + this.selected + ", width=" + this.width + ", height=" + this.height + ", rootY=" + this.rootY + ")";
        }

        public Graph(String family, List<FieldRecord> roots, List<FieldRecord> records, Map<String, Position> positions, String selected, float f, float f2, float f3) {
            Intrinsics.checkNotNullParameter(family, "family");
            Intrinsics.checkNotNullParameter(roots, "roots");
            Intrinsics.checkNotNullParameter(records, "records");
            Intrinsics.checkNotNullParameter(positions, "positions");
            Intrinsics.checkNotNullParameter(selected, "selected");
            this.family = family;
            this.roots = roots;
            this.records = records;
            this.positions = positions;
            this.selected = selected;
            this.width = f;
            this.height = f2;
            this.rootY = f3;
        }

        public final String getFamily() {
            return this.family;
        }

        public final List<FieldRecord> getRoots() {
            return this.roots;
        }

        public final List<FieldRecord> getRecords() {
            return this.records;
        }

        public final Map<String, Position> getPositions() {
            return this.positions;
        }

        public final String getSelected() {
            return this.selected;
        }

        public final float getWidth() {
            return this.width;
        }

        public final float getHeight() {
            return this.height;
        }

        public final float getRootY() {
            return this.rootY;
        }
    }

    public final String rawId(FieldRecord record) {
        String str;
        Intrinsics.checkNotNullParameter(record, "record");
        JSONObject data = WeaponModel.INSTANCE.data(record);
        if (data.isNull("id")) {
            str = record.getId();
        } else {
            String optString = data.optString("id");
            if (StringsKt.isBlank(optString)) {
                optString = record.getId();
            }
            str = optString;
        }
        Intrinsics.checkNotNullExpressionValue(str, "let(...)");
        return str;
    }

    public final String parentId(FieldRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        JSONObject data = WeaponModel.INSTANCE.data(record);
        String optString = data.isNull("parent") ? "" : data.optString("parent");
        Intrinsics.checkNotNullExpressionValue(optString, "let(...)");
        return optString;
    }

    public final FieldRecord rootOf(FieldRecord record, Map<String, FieldRecord> byId) {
        FieldRecord fieldRecord;
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(byId, "byId");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (linkedHashSet.add(rawId(record)) && (fieldRecord = byId.get(parentId(record))) != null && !linkedHashSet.contains(rawId(fieldRecord))) {
            record = fieldRecord;
        }
        return record;
    }

    public final Graph build(List<FieldRecord> records, String requestedFamily, String selected) {
        Object obj;
        FieldRecord fieldRecord;
        String rawId;
        String requestedFamily2 = requestedFamily;
        Intrinsics.checkNotNullParameter(records, "records");
        Intrinsics.checkNotNullParameter(requestedFamily2, "requestedFamily");
        Intrinsics.checkNotNullParameter(selected, "selected");
        List<FieldRecord> list = records;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj2 : list) {
            linkedHashMap.put(INSTANCE.rawId((FieldRecord) obj2), obj2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (FieldRecord fieldRecord2 : list) {
            WeaponTreeLayout weaponTreeLayout = INSTANCE;
            FieldRecord rootOf = weaponTreeLayout.rootOf(fieldRecord2, linkedHashMap);
            linkedHashMap2.put(weaponTreeLayout.rawId(rootOf), rootOf);
        }
        Float f = null;
        if (Intrinsics.areEqual(requestedFamily2, "default") || (!Intrinsics.areEqual(requestedFamily2, "all") && !linkedHashMap.containsKey(requestedFamily2))) {
            FieldRecord fieldRecord3 = (FieldRecord) linkedHashMap.get(selected);
            if (fieldRecord3 == null || (fieldRecord = INSTANCE.rootOf(fieldRecord3, linkedHashMap)) == null) {
                Collection values = linkedHashMap2.values();
                Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
                Iterator it = values.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    FieldRecord fieldRecord4 = (FieldRecord) obj;
                    Regex regex = new Regex("ore tree|bone tree", RegexOption.IGNORE_CASE);
                    WeaponModel weaponModel = WeaponModel.INSTANCE;
                    Intrinsics.checkNotNull(fieldRecord4);
                    String optString = weaponModel.data(fieldRecord4).optString("family");
                    Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                    if (regex.containsMatchIn(optString)) {
                        break;
                    }
                }
                fieldRecord = (FieldRecord) obj;
                if (fieldRecord == null) {
                    Collection values2 = linkedHashMap2.values();
                    Intrinsics.checkNotNullExpressionValue(values2, "<get-values>(...)");
                    fieldRecord = (FieldRecord) CollectionsKt.firstOrNull(values2);
                }
            }
            if (fieldRecord == null || (requestedFamily2 = INSTANCE.rawId(fieldRecord)) == null) {
                requestedFamily2 = "all";
            }
        }
        String str = requestedFamily2;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (FieldRecord fieldRecord5 : list) {
            LinkedHashMap linkedHashMap4 = linkedHashMap3;
            String parentId = INSTANCE.parentId(fieldRecord5);
            Object obj3 = linkedHashMap4.get(parentId);
            if (obj3 == null) {
                obj3 = (List) new ArrayList();
                linkedHashMap4.put(parentId, obj3);
            }
            ((List) obj3).add(fieldRecord5);
        }
        Ref.IntRef intRef = new Ref.IntRef();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            String str2 = (String) entry.getKey();
            FieldRecord fieldRecord6 = (FieldRecord) entry.getValue();
            if (Intrinsics.areEqual(str, "all") || Intrinsics.areEqual(str, str2)) {
                build$visit(linkedHashSet, linkedHashMap3, intRef, linkedHashMap5, fieldRecord6, 0);
                intRef.element++;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : list) {
            if (linkedHashMap5.containsKey(INSTANCE.rawId((FieldRecord) obj4))) {
                arrayList.add(obj4);
            }
        }
        ArrayList arrayList2 = arrayList;
        Collection values3 = linkedHashMap2.values();
        Intrinsics.checkNotNullExpressionValue(values3, "<get-values>(...)");
        List list2 = CollectionsKt.toList(values3);
        LinkedHashMap linkedHashMap6 = linkedHashMap5;
        if (linkedHashMap6.containsKey(selected)) {
            rawId = selected;
        } else {
            FieldRecord fieldRecord7 = (FieldRecord) CollectionsKt.firstOrNull((List) arrayList2);
            rawId = fieldRecord7 != null ? INSTANCE.rawId(fieldRecord7) : null;
            if (rawId == null) {
                rawId = "";
            }
        }
        Collection values4 = linkedHashMap5.values();
        Intrinsics.checkNotNullExpressionValue(values4, "<get-values>(...)");
        Iterator it2 = values4.iterator();
        if (it2.hasNext()) {
            float x = ((Position) it2.next()).getX() + 252.0f;
            while (it2.hasNext()) {
                x = Math.max(x, ((Position) it2.next()).getX() + 252.0f);
            }
            f = Float.valueOf(x);
        }
        float max = Math.max(400.0f, f != null ? f.floatValue() : 400.0f);
        float max2 = Math.max(250.0f, intRef.element * 116.0f);
        Position position = (Position) linkedHashMap5.get(str);
        return new Graph(str, list2, arrayList2, linkedHashMap6, rawId, max, max2, position != null ? position.getY() : 0.0f);
    }

    private static final void build$visit(Set<String> set, LinkedHashMap<String, List<FieldRecord>> linkedHashMap, Ref.IntRef intRef, LinkedHashMap<String, Position> linkedHashMap2, FieldRecord fieldRecord, int i) {
        String rawId = INSTANCE.rawId(fieldRecord);
        if (set.add(rawId)) {
            List<FieldRecord> list = linkedHashMap.get(rawId);
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            int i2 = intRef.element;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                build$visit(set, linkedHashMap, intRef, linkedHashMap2, (FieldRecord) it.next(), i + 1);
            }
            if (list.isEmpty()) {
                intRef.element++;
            }
            linkedHashMap2.put(rawId, new Position(i * 270.0f, (!list.isEmpty() ? ((i2 + intRef.element) - 1) / 2.0f : i2) * 116.0f));
        }
    }

    public final float clampPan(float value, float viewport, float content) {
        return Math.min(Math.max(16.0f, 0.5f * viewport), Math.max(Math.min(16.0f, (viewport - content) - 24.0f) - (viewport * 0.25f), value));
    }
}
