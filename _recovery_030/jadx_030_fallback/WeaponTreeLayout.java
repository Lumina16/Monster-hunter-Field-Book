package com.lumina.monsterhunterfieldbook;

/* compiled from: WeaponTreePanel.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\"\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\u0011J$\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bJ\u001e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/WeaponTreeLayout;", "", "<init>", "()V", "BASE_SCALE", "", "NODE_WIDTH", "NODE_HEIGHT", "DEPTH_GAP", "LEAF_GAP", "rawId", "", "record", "Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "parentId", "rootOf", "byId", "", "build", "Lcom/lumina/monsterhunterfieldbook/WeaponTreeLayout$Graph;", "records", "", "requestedFamily", "selected", "clampPan", "value", "viewport", "content", "Position", "Graph", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WeaponTreeLayout {
    public static final float BASE_SCALE = 0.5f;
    public static final float DEPTH_GAP = 270.0f;
    public static final com.lumina.monsterhunterfieldbook.WeaponTreeLayout INSTANCE = null;
    public static final float LEAF_GAP = 116.0f;
    public static final float NODE_HEIGHT = 88.0f;
    public static final float NODE_WIDTH = 232.0f;

    /* compiled from: WeaponTreePanel.kt */
    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0015\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003Jq\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001b¨\u0006-"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/WeaponTreeLayout$Graph;", "", "family", "", "roots", "", "Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "records", "positions", "", "Lcom/lumina/monsterhunterfieldbook/WeaponTreeLayout$Position;", "selected", "width", "", "height", "rootY", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;FFF)V", "getFamily", "()Ljava/lang/String;", "getRoots", "()Ljava/util/List;", "getRecords", "getPositions", "()Ljava/util/Map;", "getSelected", "getWidth", "()F", "getHeight", "getRootY", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Graph {
        private final java.lang.String family;
        private final float height;
        private final java.util.Map<java.lang.String, com.lumina.monsterhunterfieldbook.WeaponTreeLayout.Position> positions;
        private final java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> records;
        private final float rootY;
        private final java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> roots;
        private final java.lang.String selected;
        private final float width;

        public Graph(java.lang.String r2, java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r3, java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r4, java.util.Map<java.lang.String, com.lumina.monsterhunterfieldbook.WeaponTreeLayout.Position> r5, java.lang.String r6, float r7, float r8, float r9) {
                r1 = this;
                java.lang.String r0 = "family"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "roots"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "records"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "positions"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "selected"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                r1.<init>()
                r1.family = r2
                r1.roots = r3
                r1.records = r4
                r1.positions = r5
                r1.selected = r6
                r1.width = r7
                r1.height = r8
                r1.rootY = r9
                return
        }

        public static /* synthetic */ com.lumina.monsterhunterfieldbook.WeaponTreeLayout.Graph copy$default(com.lumina.monsterhunterfieldbook.WeaponTreeLayout.Graph r0, java.lang.String r1, java.util.List r2, java.util.List r3, java.util.Map r4, java.lang.String r5, float r6, float r7, float r8, int r9, java.lang.Object r10) {
                r10 = r9 & 1
                if (r10 == 0) goto L6
                java.lang.String r1 = r0.family
            L6:
                r10 = r9 & 2
                if (r10 == 0) goto Lc
                java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r2 = r0.roots
            Lc:
                r10 = r9 & 4
                if (r10 == 0) goto L12
                java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r3 = r0.records
            L12:
                r10 = r9 & 8
                if (r10 == 0) goto L18
                java.util.Map<java.lang.String, com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Position> r4 = r0.positions
            L18:
                r10 = r9 & 16
                if (r10 == 0) goto L1e
                java.lang.String r5 = r0.selected
            L1e:
                r10 = r9 & 32
                if (r10 == 0) goto L24
                float r6 = r0.width
            L24:
                r10 = r9 & 64
                if (r10 == 0) goto L2a
                float r7 = r0.height
            L2a:
                r9 = r9 & 128(0x80, float:1.8E-43)
                if (r9 == 0) goto L30
                float r8 = r0.rootY
            L30:
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                r2 = r0
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r0 = r2.copy(r3, r4, r5, r6, r7, r8, r9, r10)
                return r0
        }

        public final java.lang.String component1() {
                r1 = this;
                java.lang.String r0 = r1.family
                return r0
        }

        public final java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> component2() {
                r1 = this;
                java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r0 = r1.roots
                return r0
        }

        public final java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> component3() {
                r1 = this;
                java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r0 = r1.records
                return r0
        }

        public final java.util.Map<java.lang.String, com.lumina.monsterhunterfieldbook.WeaponTreeLayout.Position> component4() {
                r1 = this;
                java.util.Map<java.lang.String, com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Position> r0 = r1.positions
                return r0
        }

        public final java.lang.String component5() {
                r1 = this;
                java.lang.String r0 = r1.selected
                return r0
        }

        public final float component6() {
                r1 = this;
                float r0 = r1.width
                return r0
        }

        public final float component7() {
                r1 = this;
                float r0 = r1.height
                return r0
        }

        public final float component8() {
                r1 = this;
                float r0 = r1.rootY
                return r0
        }

        public final com.lumina.monsterhunterfieldbook.WeaponTreeLayout.Graph copy(java.lang.String r11, java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r12, java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r13, java.util.Map<java.lang.String, com.lumina.monsterhunterfieldbook.WeaponTreeLayout.Position> r14, java.lang.String r15, float r16, float r17, float r18) {
                r10 = this;
                java.lang.String r0 = "family"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                java.lang.String r0 = "roots"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
                java.lang.String r0 = "records"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                java.lang.String r0 = "positions"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                java.lang.String r0 = "selected"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r1 = new com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph
                r2 = r11
                r3 = r12
                r4 = r13
                r5 = r14
                r6 = r15
                r7 = r16
                r8 = r17
                r9 = r18
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
                return r1
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.lumina.monsterhunterfieldbook.WeaponTreeLayout.Graph
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r5 = (com.lumina.monsterhunterfieldbook.WeaponTreeLayout.Graph) r5
                java.lang.String r1 = r4.family
                java.lang.String r3 = r5.family
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r1 = r4.roots
                java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r3 = r5.roots
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r1 = r4.records
                java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r3 = r5.records
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                if (r1 != 0) goto L2d
                return r2
            L2d:
                java.util.Map<java.lang.String, com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Position> r1 = r4.positions
                java.util.Map<java.lang.String, com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Position> r3 = r5.positions
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                if (r1 != 0) goto L38
                return r2
            L38:
                java.lang.String r1 = r4.selected
                java.lang.String r3 = r5.selected
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                if (r1 != 0) goto L43
                return r2
            L43:
                float r1 = r4.width
                float r3 = r5.width
                int r1 = java.lang.Float.compare(r1, r3)
                if (r1 == 0) goto L4e
                return r2
            L4e:
                float r1 = r4.height
                float r3 = r5.height
                int r1 = java.lang.Float.compare(r1, r3)
                if (r1 == 0) goto L59
                return r2
            L59:
                float r1 = r4.rootY
                float r5 = r5.rootY
                int r5 = java.lang.Float.compare(r1, r5)
                if (r5 == 0) goto L64
                return r2
            L64:
                return r0
        }

        public final java.lang.String getFamily() {
                r1 = this;
                java.lang.String r0 = r1.family
                return r0
        }

        public final float getHeight() {
                r1 = this;
                float r0 = r1.height
                return r0
        }

        public final java.util.Map<java.lang.String, com.lumina.monsterhunterfieldbook.WeaponTreeLayout.Position> getPositions() {
                r1 = this;
                java.util.Map<java.lang.String, com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Position> r0 = r1.positions
                return r0
        }

        public final java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> getRecords() {
                r1 = this;
                java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r0 = r1.records
                return r0
        }

        public final float getRootY() {
                r1 = this;
                float r0 = r1.rootY
                return r0
        }

        public final java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> getRoots() {
                r1 = this;
                java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r0 = r1.roots
                return r0
        }

        public final java.lang.String getSelected() {
                r1 = this;
                java.lang.String r0 = r1.selected
                return r0
        }

        public final float getWidth() {
                r1 = this;
                float r0 = r1.width
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.family
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r1 = r2.roots
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r1 = r2.records
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.Map<java.lang.String, com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Position> r1 = r2.positions
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r2.selected
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                float r1 = r2.width
                int r1 = java.lang.Float.hashCode(r1)
                int r0 = r0 + r1
                int r0 = r0 * 31
                float r1 = r2.height
                int r1 = java.lang.Float.hashCode(r1)
                int r0 = r0 + r1
                int r0 = r0 * 31
                float r1 = r2.rootY
                int r1 = java.lang.Float.hashCode(r1)
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r10 = this;
                java.lang.String r0 = r10.family
                java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r1 = r10.roots
                java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r2 = r10.records
                java.util.Map<java.lang.String, com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Position> r3 = r10.positions
                java.lang.String r4 = r10.selected
                float r5 = r10.width
                float r6 = r10.height
                float r7 = r10.rootY
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                java.lang.String r9 = "Graph(family="
                r8.<init>(r9)
                java.lang.StringBuilder r0 = r8.append(r0)
                java.lang.String r8 = ", roots="
                java.lang.StringBuilder r0 = r0.append(r8)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", records="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r1 = ", positions="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r3)
                java.lang.String r1 = ", selected="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r4)
                java.lang.String r1 = ", width="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r5)
                java.lang.String r1 = ", height="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r6)
                java.lang.String r1 = ", rootY="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r7)
                java.lang.String r1 = ")"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: WeaponTreePanel.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/WeaponTreeLayout$Position;", "", "x", "", "y", "<init>", "(FF)V", "getX", "()F", "getY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Position {
        private final float x;
        private final float y;

        public Position(float r1, float r2) {
                r0 = this;
                r0.<init>()
                r0.x = r1
                r0.y = r2
                return
        }

        public static /* synthetic */ com.lumina.monsterhunterfieldbook.WeaponTreeLayout.Position copy$default(com.lumina.monsterhunterfieldbook.WeaponTreeLayout.Position r0, float r1, float r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                float r1 = r0.x
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                float r2 = r0.y
            Lc:
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Position r0 = r0.copy(r1, r2)
                return r0
        }

        public final float component1() {
                r1 = this;
                float r0 = r1.x
                return r0
        }

        public final float component2() {
                r1 = this;
                float r0 = r1.y
                return r0
        }

        public final com.lumina.monsterhunterfieldbook.WeaponTreeLayout.Position copy(float r2, float r3) {
                r1 = this;
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Position r0 = new com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Position
                r0.<init>(r2, r3)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.lumina.monsterhunterfieldbook.WeaponTreeLayout.Position
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Position r5 = (com.lumina.monsterhunterfieldbook.WeaponTreeLayout.Position) r5
                float r1 = r4.x
                float r3 = r5.x
                int r1 = java.lang.Float.compare(r1, r3)
                if (r1 == 0) goto L17
                return r2
            L17:
                float r1 = r4.y
                float r5 = r5.y
                int r5 = java.lang.Float.compare(r1, r5)
                if (r5 == 0) goto L22
                return r2
            L22:
                return r0
        }

        public final float getX() {
                r1 = this;
                float r0 = r1.x
                return r0
        }

        public final float getY() {
                r1 = this;
                float r0 = r1.y
                return r0
        }

        public int hashCode() {
                r2 = this;
                float r0 = r2.x
                int r0 = java.lang.Float.hashCode(r0)
                int r0 = r0 * 31
                float r1 = r2.y
                int r1 = java.lang.Float.hashCode(r1)
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                float r0 = r4.x
                float r1 = r4.y
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Position(x="
                r2.<init>(r3)
                java.lang.StringBuilder r0 = r2.append(r0)
                java.lang.String r2 = ", y="
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ")"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout r0 = new com.lumina.monsterhunterfieldbook.WeaponTreeLayout
            r0.<init>()
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout.INSTANCE = r0
            return
    }

    private WeaponTreeLayout() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final void build$visit(java.util.Set<java.lang.String> r10, java.util.LinkedHashMap<java.lang.String, java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord>> r11, kotlin.jvm.internal.Ref.IntRef r12, java.util.LinkedHashMap<java.lang.String, com.lumina.monsterhunterfieldbook.WeaponTreeLayout.Position> r13, com.lumina.monsterhunterfieldbook.FieldRecord r14, int r15) {
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout r0 = com.lumina.monsterhunterfieldbook.WeaponTreeLayout.INSTANCE
            java.lang.String r14 = r0.rawId(r14)
            boolean r0 = r10.add(r14)
            if (r0 != 0) goto Ld
            return
        Ld:
            java.lang.Object r0 = r11.get(r14)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L19
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L19:
            int r1 = r12.element
            r2 = r0
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L22:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L39
            java.lang.Object r3 = r2.next()
            r8 = r3
            com.lumina.monsterhunterfieldbook.FieldRecord r8 = (com.lumina.monsterhunterfieldbook.FieldRecord) r8
            int r9 = r15 + 1
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            build$visit(r4, r5, r6, r7, r8, r9)
            goto L22
        L39:
            r6 = r12
            r7 = r13
            boolean r10 = r0.isEmpty()
            if (r10 == 0) goto L47
            int r10 = r6.element
            int r10 = r10 + 1
            r6.element = r10
        L47:
            r13 = r7
            java.util.Map r13 = (java.util.Map) r13
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Position r10 = new com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Position
            float r11 = (float) r15
            r12 = 1132920832(0x43870000, float:270.0)
            float r11 = r11 * r12
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r12 = r0.isEmpty()
            if (r12 != 0) goto L62
            int r12 = r6.element
            int r1 = r1 + r12
            int r1 = r1 + (-1)
            float r12 = (float) r1
            r15 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 / r15
            goto L63
        L62:
            float r12 = (float) r1
        L63:
            r15 = 1122500608(0x42e80000, float:116.0)
            float r12 = r12 * r15
            r10.<init>(r11, r12)
            r13.put(r14, r10)
            return
    }

    public final com.lumina.monsterhunterfieldbook.WeaponTreeLayout.Graph build(java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r19, java.lang.String r20, java.lang.String r21) {
            r18 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.lang.String r3 = "records"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "requestedFamily"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "selected"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r3 = 10
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r3)
            int r3 = kotlin.collections.MapsKt.mapCapacity(r3)
            r4 = 16
            int r3 = kotlin.ranges.RangesKt.coerceAtLeast(r3, r4)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r3)
            java.util.Map r4 = (java.util.Map) r4
            java.util.Iterator r3 = r0.iterator()
        L32:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L49
            java.lang.Object r5 = r3.next()
            r6 = r5
            com.lumina.monsterhunterfieldbook.FieldRecord r6 = (com.lumina.monsterhunterfieldbook.FieldRecord) r6
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout r7 = com.lumina.monsterhunterfieldbook.WeaponTreeLayout.INSTANCE
            java.lang.String r6 = r7.rawId(r6)
            r4.put(r6, r5)
            goto L32
        L49:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Iterator r5 = r0.iterator()
        L52:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L6f
            java.lang.Object r6 = r5.next()
            com.lumina.monsterhunterfieldbook.FieldRecord r6 = (com.lumina.monsterhunterfieldbook.FieldRecord) r6
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout r7 = com.lumina.monsterhunterfieldbook.WeaponTreeLayout.INSTANCE
            com.lumina.monsterhunterfieldbook.FieldRecord r6 = r7.rootOf(r6, r4)
            r8 = r3
            java.util.Map r8 = (java.util.Map) r8
            java.lang.String r7 = r7.rawId(r6)
            r8.put(r7, r6)
            goto L52
        L6f:
            java.lang.String r5 = "default"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            r6 = 0
            java.lang.String r7 = "all"
            java.lang.String r8 = "<get-values>(...)"
            if (r5 != 0) goto L8c
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r7)
            if (r5 != 0) goto L89
            boolean r5 = r4.containsKey(r1)
            if (r5 != 0) goto L89
            goto L8c
        L89:
            r10 = r1
            goto Lfd
        L8c:
            java.lang.Object r1 = r4.get(r2)
            com.lumina.monsterhunterfieldbook.FieldRecord r1 = (com.lumina.monsterhunterfieldbook.FieldRecord) r1
            if (r1 == 0) goto L9c
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout r5 = com.lumina.monsterhunterfieldbook.WeaponTreeLayout.INSTANCE
            com.lumina.monsterhunterfieldbook.FieldRecord r1 = r5.rootOf(r1, r4)
            if (r1 != 0) goto Lf1
        L9c:
            java.util.Collection r1 = r3.values()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r8)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        La9:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Ldc
            java.lang.Object r4 = r1.next()
            r5 = r4
            com.lumina.monsterhunterfieldbook.FieldRecord r5 = (com.lumina.monsterhunterfieldbook.FieldRecord) r5
            kotlin.text.Regex r9 = new kotlin.text.Regex
            java.lang.String r10 = "ore tree|bone tree"
            kotlin.text.RegexOption r11 = kotlin.text.RegexOption.IGNORE_CASE
            r9.<init>(r10, r11)
            com.lumina.monsterhunterfieldbook.WeaponModel r10 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            org.json.JSONObject r5 = r10.data(r5)
            java.lang.String r10 = "family"
            java.lang.String r5 = r5.optString(r10)
            java.lang.String r10 = "optString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r10)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = r9.containsMatchIn(r5)
            if (r5 == 0) goto La9
            goto Ldd
        Ldc:
            r4 = r6
        Ldd:
            r1 = r4
            com.lumina.monsterhunterfieldbook.FieldRecord r1 = (com.lumina.monsterhunterfieldbook.FieldRecord) r1
            if (r1 != 0) goto Lf1
            java.util.Collection r1 = r3.values()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r8)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = kotlin.collections.CollectionsKt.firstOrNull(r1)
            com.lumina.monsterhunterfieldbook.FieldRecord r1 = (com.lumina.monsterhunterfieldbook.FieldRecord) r1
        Lf1:
            if (r1 == 0) goto Lfb
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout r4 = com.lumina.monsterhunterfieldbook.WeaponTreeLayout.INSTANCE
            java.lang.String r1 = r4.rawId(r1)
            if (r1 != 0) goto L89
        Lfb:
            r1 = r7
            goto L89
        Lfd:
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
            java.util.Iterator r1 = r0.iterator()
        L106:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L131
            java.lang.Object r4 = r1.next()
            com.lumina.monsterhunterfieldbook.FieldRecord r4 = (com.lumina.monsterhunterfieldbook.FieldRecord) r4
            r5 = r12
            java.util.Map r5 = (java.util.Map) r5
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout r9 = com.lumina.monsterhunterfieldbook.WeaponTreeLayout.INSTANCE
            java.lang.String r9 = r9.parentId(r4)
            java.lang.Object r11 = r5.get(r9)
            if (r11 != 0) goto L12b
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.List r11 = (java.util.List) r11
            r5.put(r9, r11)
        L12b:
            java.util.List r11 = (java.util.List) r11
            r11.add(r4)
            goto L106
        L131:
            kotlin.jvm.internal.Ref$IntRef r13 = new kotlin.jvm.internal.Ref$IntRef
            r13.<init>()
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
            r14.<init>()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r11 = r1
            java.util.Set r11 = (java.util.Set) r11
            r1 = r3
            java.util.Map r1 = (java.util.Map) r1
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L14e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L17f
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getValue()
            r15 = r4
            com.lumina.monsterhunterfieldbook.FieldRecord r15 = (com.lumina.monsterhunterfieldbook.FieldRecord) r15
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r7)
            if (r4 != 0) goto L173
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r5)
            if (r4 == 0) goto L14e
        L173:
            r16 = 0
            build$visit(r11, r12, r13, r14, r15, r16)
            int r4 = r13.element
            int r4 = r4 + 1
            r13.element = r4
            goto L14e
        L17f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r0 = r0.iterator()
        L18a:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L1aa
            java.lang.Object r4 = r0.next()
            r5 = r4
            com.lumina.monsterhunterfieldbook.FieldRecord r5 = (com.lumina.monsterhunterfieldbook.FieldRecord) r5
            r7 = r14
            java.util.Map r7 = (java.util.Map) r7
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout r9 = com.lumina.monsterhunterfieldbook.WeaponTreeLayout.INSTANCE
            java.lang.String r5 = r9.rawId(r5)
            boolean r5 = r7.containsKey(r5)
            if (r5 == 0) goto L18a
            r1.add(r4)
            goto L18a
        L1aa:
            r12 = r1
            java.util.List r12 = (java.util.List) r12
            java.util.Collection r0 = r3.values()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r8)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r11 = kotlin.collections.CollectionsKt.toList(r0)
            r0 = r14
            java.util.Map r0 = (java.util.Map) r0
            boolean r1 = r0.containsKey(r2)
            if (r1 == 0) goto L1c5
            r1 = r2
            goto L1d9
        L1c5:
            java.lang.Object r1 = kotlin.collections.CollectionsKt.firstOrNull(r12)
            com.lumina.monsterhunterfieldbook.FieldRecord r1 = (com.lumina.monsterhunterfieldbook.FieldRecord) r1
            if (r1 == 0) goto L1d4
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout r2 = com.lumina.monsterhunterfieldbook.WeaponTreeLayout.INSTANCE
            java.lang.String r1 = r2.rawId(r1)
            goto L1d5
        L1d4:
            r1 = r6
        L1d5:
            if (r1 != 0) goto L1d9
            java.lang.String r1 = ""
        L1d9:
            java.util.Collection r2 = r14.values()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r8)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto L1ed
            goto L214
        L1ed:
            java.lang.Object r3 = r2.next()
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Position r3 = (com.lumina.monsterhunterfieldbook.WeaponTreeLayout.Position) r3
            float r3 = r3.getX()
            r4 = 1132199936(0x437c0000, float:252.0)
            float r3 = r3 + r4
        L1fa:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L210
            java.lang.Object r5 = r2.next()
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Position r5 = (com.lumina.monsterhunterfieldbook.WeaponTreeLayout.Position) r5
            float r5 = r5.getX()
            float r5 = r5 + r4
            float r3 = java.lang.Math.max(r3, r5)
            goto L1fa
        L210:
            java.lang.Float r6 = java.lang.Float.valueOf(r3)
        L214:
            r2 = 1137180672(0x43c80000, float:400.0)
            if (r6 == 0) goto L21d
            float r3 = r6.floatValue()
            goto L21e
        L21d:
            r3 = r2
        L21e:
            float r15 = java.lang.Math.max(r2, r3)
            int r2 = r13.element
            float r2 = (float) r2
            r3 = 1122500608(0x42e80000, float:116.0)
            float r2 = r2 * r3
            r3 = 1132068864(0x437a0000, float:250.0)
            float r16 = java.lang.Math.max(r3, r2)
            java.lang.Object r2 = r14.get(r10)
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Position r2 = (com.lumina.monsterhunterfieldbook.WeaponTreeLayout.Position) r2
            if (r2 == 0) goto L23b
            float r2 = r2.getY()
            goto L23c
        L23b:
            r2 = 0
        L23c:
            r17 = r2
            com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph r9 = new com.lumina.monsterhunterfieldbook.WeaponTreeLayout$Graph
            r13 = r0
            r14 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            return r9
    }

    public final float clampPan(float r4, float r5, float r6) {
            r3 = this;
            r0 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r5
            r1 = 1098907648(0x41800000, float:16.0)
            float r0 = java.lang.Math.max(r1, r0)
            float r6 = r5 - r6
            r2 = 1103101952(0x41c00000, float:24.0)
            float r6 = r6 - r2
            float r6 = java.lang.Math.min(r1, r6)
            r1 = 1048576000(0x3e800000, float:0.25)
            float r5 = r5 * r1
            float r6 = r6 - r5
            float r4 = java.lang.Math.max(r6, r4)
            float r4 = java.lang.Math.min(r0, r4)
            return r4
    }

    public final java.lang.String parentId(com.lumina.monsterhunterfieldbook.FieldRecord r3) {
            r2 = this;
            java.lang.String r0 = "record"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            com.lumina.monsterhunterfieldbook.WeaponModel r0 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            org.json.JSONObject r3 = r0.data(r3)
            java.lang.String r0 = "parent"
            boolean r1 = r3.isNull(r0)
            if (r1 == 0) goto L16
            java.lang.String r3 = ""
            goto L1a
        L16:
            java.lang.String r3 = r3.optString(r0)
        L1a:
            java.lang.String r0 = "let(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            return r3
    }

    public final java.lang.String rawId(com.lumina.monsterhunterfieldbook.FieldRecord r4) {
            r3 = this;
            java.lang.String r0 = "record"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            com.lumina.monsterhunterfieldbook.WeaponModel r0 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            org.json.JSONObject r0 = r0.data(r4)
            java.lang.String r1 = "id"
            boolean r2 = r0.isNull(r1)
            if (r2 == 0) goto L18
            java.lang.String r4 = r4.getId()
            goto L2b
        L18:
            java.lang.String r0 = r0.optString(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r1 = kotlin.text.StringsKt.isBlank(r0)
            if (r1 == 0) goto L28
            java.lang.String r0 = r4.getId()
        L28:
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
        L2b:
            java.lang.String r0 = "let(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            return r4
    }

    public final com.lumina.monsterhunterfieldbook.FieldRecord rootOf(com.lumina.monsterhunterfieldbook.FieldRecord r4, java.util.Map<java.lang.String, com.lumina.monsterhunterfieldbook.FieldRecord> r5) {
            r3 = this;
            java.lang.String r0 = "record"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "byId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Set r0 = (java.util.Set) r0
        L11:
            java.lang.String r1 = r3.rawId(r4)
            boolean r1 = r0.add(r1)
            if (r1 == 0) goto L34
            java.lang.String r1 = r3.parentId(r4)
            java.lang.Object r1 = r5.get(r1)
            com.lumina.monsterhunterfieldbook.FieldRecord r1 = (com.lumina.monsterhunterfieldbook.FieldRecord) r1
            if (r1 != 0) goto L28
            goto L34
        L28:
            java.lang.String r2 = r3.rawId(r1)
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L34
            r4 = r1
            goto L11
        L34:
            return r4
    }
}
