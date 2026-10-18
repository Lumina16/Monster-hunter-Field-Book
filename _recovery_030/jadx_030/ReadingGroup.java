package com.lumina.monsterhunterfieldbook;

import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: RecordPanel.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001a\u001a\u00020\rH\u0002J\u0018\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/ReadingGroup;", "Landroid/widget/LinearLayout;", "a", "Lcom/lumina/monsterhunterfieldbook/MainActivity;", "key", "", "title", "siblings", "", "defaultOpen", "", "populate", "Lkotlin/Function1;", "", "<init>", "(Lcom/lumina/monsterhunterfieldbook/MainActivity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLkotlin/jvm/functions/Function1;)V", "getKey", "()Ljava/lang/String;", "inner", "head", "Landroid/widget/TextView;", "filled", "value", "expanded", "getExpanded", "()Z", "toggle", "setOpen", "open", "remember", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ReadingGroup extends LinearLayout {
    private final MainActivity a;
    private boolean expanded;
    private boolean filled;
    private final TextView head;
    private final LinearLayout inner;
    private final String key;
    private final Function1<LinearLayout, Unit> populate;
    private final List<ReadingGroup> siblings;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReadingGroup(MainActivity a, String key, String title, List<ReadingGroup> siblings, boolean z, Function1<? super LinearLayout, Unit> populate) {
        super(a);
        Object m79constructorimpl;
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(siblings, "siblings");
        Intrinsics.checkNotNullParameter(populate, "populate");
        this.a = a;
        this.key = key;
        this.siblings = siblings;
        this.populate = populate;
        LinearLayout column = a.column();
        this.inner = column;
        TextView button = a.button(title, new Function0() { // from class: com.lumina.monsterhunterfieldbook.ReadingGroup$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit head$lambda$0;
                head$lambda$0 = ReadingGroup.head$lambda$0(ReadingGroup.this);
                return head$lambda$0;
            }
        });
        this.head = button;
        setOrientation(1);
        setBackground(MainActivity.surface$default(a, 0, false, 0.0f, 7, null));
        button.setGravity(8388627);
        addView(button, new LinearLayout.LayoutParams(-1, -2));
        a.pad(column, 12);
        column.setVisibility(8);
        addView(column, new LinearLayout.LayoutParams(-1, -2));
        siblings.add(this);
        try {
            Result.Companion companion = Result.INSTANCE;
            ReadingGroup readingGroup = this;
            m79constructorimpl = Result.m79constructorimpl(new JSONObject(this.a.getPrefs().text("readingGroups", "{}")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m79constructorimpl = Result.m79constructorimpl(ResultKt.createFailure(th));
        }
        JSONObject jSONObject = (JSONObject) (Result.m85isFailureimpl(m79constructorimpl) ? new JSONObject() : m79constructorimpl);
        if (NativePrefs.flag$default(this.a.getPrefs(), "rememberGroups", false, 2, null) && jSONObject.has(this.key)) {
            z = jSONObject.optBoolean(this.key);
        }
        if (z) {
            setOpen(true, false);
        }
    }

    public /* synthetic */ ReadingGroup(MainActivity mainActivity, String str, String str2, List list, boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mainActivity, str, str2, list, (i & 16) != 0 ? false : z, function1);
    }

    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit head$lambda$0(ReadingGroup readingGroup) {
        readingGroup.toggle();
        return Unit.INSTANCE;
    }

    public final boolean getExpanded() {
        return this.expanded;
    }

    private final void toggle() {
        setOpen(!this.expanded, true);
    }

    public static /* synthetic */ void setOpen$default(ReadingGroup readingGroup, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        readingGroup.setOpen(z, z2);
    }

    public final void setOpen(boolean open, boolean remember) {
        Object m79constructorimpl;
        if (open && this.a.getPrefs().flag("singleGroup", false)) {
            List<ReadingGroup> list = this.siblings;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                ReadingGroup readingGroup = (ReadingGroup) obj;
                if (readingGroup != this && readingGroup.expanded) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ReadingGroup) it.next()).setOpen(false, remember);
            }
        }
        this.expanded = open;
        this.inner.animate().cancel();
        if (open) {
            if (!this.filled) {
                this.filled = true;
                this.populate.invoke(this.inner);
            }
            this.inner.setVisibility(0);
            this.inner.setAlpha(1.0f);
        } else if (!remember || this.a.motionDuration(160L) <= 0) {
            this.inner.setVisibility(8);
            this.inner.setAlpha(1.0f);
        } else {
            this.inner.animate().alpha(0.0f).setDuration(this.a.motionDuration(160L)).withEndAction(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.ReadingGroup$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ReadingGroup.setOpen$lambda$2(ReadingGroup.this);
                }
            }).start();
        }
        TextView textView = this.head;
        textView.setContentDescription(((Object) textView.getText()) + (open ? ", expanded" : ", collapsed"));
        if (remember && NativePrefs.flag$default(this.a.getPrefs(), "rememberGroups", false, 2, null)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                ReadingGroup readingGroup2 = this;
                m79constructorimpl = Result.m79constructorimpl(new JSONObject(this.a.getPrefs().text("readingGroups", "{}")));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m79constructorimpl = Result.m79constructorimpl(ResultKt.createFailure(th));
            }
            JSONObject jSONObject = new JSONObject();
            if (Result.m85isFailureimpl(m79constructorimpl)) {
                m79constructorimpl = jSONObject;
            }
            JSONObject jSONObject2 = (JSONObject) m79constructorimpl;
            jSONObject2.put(this.key, open);
            NativePrefs prefs = this.a.getPrefs();
            String jSONObject3 = jSONObject2.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject3, "toString(...)");
            prefs.set("readingGroups", jSONObject3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOpen$lambda$2(ReadingGroup readingGroup) {
        if (readingGroup.expanded) {
            return;
        }
        readingGroup.inner.setVisibility(8);
        readingGroup.inner.setAlpha(1.0f);
    }
}
