package com.lumina.monsterhunterfieldbook;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\u008a\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J2\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"com/lumina/monsterhunterfieldbook/MainActivity$restoreContentOverlays$2$Restored", "", "descriptor", "Lorg/json/JSONObject;", "record", "Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "weapons", "", "<init>", "(Lorg/json/JSONObject;Lcom/lumina/monsterhunterfieldbook/FieldRecord;Ljava/util/List;)V", "getDescriptor", "()Lorg/json/JSONObject;", "getRecord", "()Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "getWeapons", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(Lorg/json/JSONObject;Lcom/lumina/monsterhunterfieldbook/FieldRecord;Ljava/util/List;)Lcom/lumina/monsterhunterfieldbook/MainActivity$restoreContentOverlays$2$Restored;", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MainActivity$restoreContentOverlays$2$Restored {
    private final JSONObject descriptor;
    private final FieldRecord record;
    private final List<FieldRecord> weapons;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MainActivity$restoreContentOverlays$2$Restored copy$default(MainActivity$restoreContentOverlays$2$Restored mainActivity$restoreContentOverlays$2$Restored, JSONObject jSONObject, FieldRecord fieldRecord, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = mainActivity$restoreContentOverlays$2$Restored.descriptor;
        }
        if ((i & 2) != 0) {
            fieldRecord = mainActivity$restoreContentOverlays$2$Restored.record;
        }
        if ((i & 4) != 0) {
            list = mainActivity$restoreContentOverlays$2$Restored.weapons;
        }
        return mainActivity$restoreContentOverlays$2$Restored.copy(jSONObject, fieldRecord, list);
    }

    /* renamed from: component1, reason: from getter */
    public final JSONObject getDescriptor() {
        return this.descriptor;
    }

    /* renamed from: component2, reason: from getter */
    public final FieldRecord getRecord() {
        return this.record;
    }

    public final List<FieldRecord> component3() {
        return this.weapons;
    }

    public final MainActivity$restoreContentOverlays$2$Restored copy(JSONObject descriptor, FieldRecord record, List<FieldRecord> weapons) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(weapons, "weapons");
        return new MainActivity$restoreContentOverlays$2$Restored(descriptor, record, weapons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MainActivity$restoreContentOverlays$2$Restored)) {
            return false;
        }
        MainActivity$restoreContentOverlays$2$Restored mainActivity$restoreContentOverlays$2$Restored = (MainActivity$restoreContentOverlays$2$Restored) other;
        return Intrinsics.areEqual(this.descriptor, mainActivity$restoreContentOverlays$2$Restored.descriptor) && Intrinsics.areEqual(this.record, mainActivity$restoreContentOverlays$2$Restored.record) && Intrinsics.areEqual(this.weapons, mainActivity$restoreContentOverlays$2$Restored.weapons);
    }

    public int hashCode() {
        return (((this.descriptor.hashCode() * 31) + this.record.hashCode()) * 31) + this.weapons.hashCode();
    }

    public String toString() {
        return "Restored(descriptor=" + this.descriptor + ", record=" + this.record + ", weapons=" + this.weapons + ")";
    }

    public MainActivity$restoreContentOverlays$2$Restored(JSONObject descriptor, FieldRecord record, List<FieldRecord> weapons) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(weapons, "weapons");
        this.descriptor = descriptor;
        this.record = record;
        this.weapons = weapons;
    }

    public /* synthetic */ MainActivity$restoreContentOverlays$2$Restored(JSONObject jSONObject, FieldRecord fieldRecord, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject, fieldRecord, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final JSONObject getDescriptor() {
        return this.descriptor;
    }

    public final FieldRecord getRecord() {
        return this.record;
    }

    public final List<FieldRecord> getWeapons() {
        return this.weapons;
    }
}
