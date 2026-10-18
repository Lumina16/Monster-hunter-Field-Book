package com.lumina.monsterhunterfieldbook;

/* compiled from: RecordPanel.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001a\u001a\u00020\rH\u0002J\u0018\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/ReadingGroup;", "Landroid/widget/LinearLayout;", "a", "Lcom/lumina/monsterhunterfieldbook/MainActivity;", "key", "", "title", "siblings", "", "defaultOpen", "", "populate", "Lkotlin/Function1;", "", "<init>", "(Lcom/lumina/monsterhunterfieldbook/MainActivity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLkotlin/jvm/functions/Function1;)V", "getKey", "()Ljava/lang/String;", "inner", "head", "Landroid/widget/TextView;", "filled", "value", "expanded", "getExpanded", "()Z", "toggle", "setOpen", "open", "remember", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ReadingGroup extends android.widget.LinearLayout {
    private final com.lumina.monsterhunterfieldbook.MainActivity a;
    private boolean expanded;
    private boolean filled;
    private final android.widget.TextView head;
    private final android.widget.LinearLayout inner;
    private final java.lang.String key;
    private final kotlin.jvm.functions.Function1<android.widget.LinearLayout, kotlin.Unit> populate;
    private final java.util.List<com.lumina.monsterhunterfieldbook.ReadingGroup> siblings;

    /* renamed from: $r8$lambda$CzSGgp0inioRLu-JbDiF4m-YXyA, reason: not valid java name */
    public static /* synthetic */ void m37$r8$lambda$CzSGgp0inioRLuJbDiF4mYXyA(com.lumina.monsterhunterfieldbook.ReadingGroup r0) {
            setOpen$lambda$2(r0)
            return
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$N64qjrT47Mf0PqvCbPEz1uqRujk(com.lumina.monsterhunterfieldbook.ReadingGroup r0) {
            kotlin.Unit r0 = head$lambda$0(r0)
            return r0
    }

    public ReadingGroup(com.lumina.monsterhunterfieldbook.MainActivity r7, java.lang.String r8, java.lang.String r9, java.util.List<com.lumina.monsterhunterfieldbook.ReadingGroup> r10, boolean r11, kotlin.jvm.functions.Function1<? super android.widget.LinearLayout, kotlin.Unit> r12) {
            r6 = this;
            java.lang.String r0 = "a"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "title"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "siblings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "populate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = r7
            android.content.Context r0 = (android.content.Context) r0
            r6.<init>(r0)
            r6.a = r7
            r6.key = r8
            r6.siblings = r10
            r6.populate = r12
            android.widget.LinearLayout r8 = r7.column()
            r6.inner = r8
            com.lumina.monsterhunterfieldbook.ReadingGroup$$ExternalSyntheticLambda1 r12 = new com.lumina.monsterhunterfieldbook.ReadingGroup$$ExternalSyntheticLambda1
            r12.<init>(r6)
            android.widget.TextView r9 = r7.button(r9, r12)
            r6.head = r9
            r12 = 1
            r6.setOrientation(r12)
            r4 = 7
            r5 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r0 = r7
            android.graphics.drawable.GradientDrawable r7 = com.lumina.monsterhunterfieldbook.MainActivity.surface$default(r0, r1, r2, r3, r4, r5)
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            r6.setBackground(r7)
            r7 = 8388627(0x800013, float:1.175497E-38)
            r9.setGravity(r7)
            android.view.View r9 = (android.view.View) r9
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r1 = -1
            r2 = -2
            r7.<init>(r1, r2)
            android.view.ViewGroup$LayoutParams r7 = (android.view.ViewGroup.LayoutParams) r7
            r6.addView(r9, r7)
            r7 = r8
            android.view.View r7 = (android.view.View) r7
            r9 = 12
            r0.pad(r7, r9)
            r7 = 8
            r8.setVisibility(r7)
            android.view.View r8 = (android.view.View) r8
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r7.<init>(r1, r2)
            android.view.ViewGroup$LayoutParams r7 = (android.view.ViewGroup.LayoutParams) r7
            r6.addView(r8, r7)
            java.util.Collection r10 = (java.util.Collection) r10
            r10.add(r6)
            kotlin.Result$Companion r7 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L9a
            r7 = r6
            com.lumina.monsterhunterfieldbook.ReadingGroup r7 = (com.lumina.monsterhunterfieldbook.ReadingGroup) r7     // Catch: java.lang.Throwable -> L9a
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L9a
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r6.a     // Catch: java.lang.Throwable -> L9a
            com.lumina.monsterhunterfieldbook.NativePrefs r8 = r8.getPrefs()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r9 = "readingGroups"
            java.lang.String r10 = "{}"
            java.lang.String r8 = r8.text(r9, r10)     // Catch: java.lang.Throwable -> L9a
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r7 = kotlin.Result.m79constructorimpl(r7)     // Catch: java.lang.Throwable -> L9a
            goto La6
        L9a:
            r0 = move-exception
            r7 = r0
            kotlin.Result$Companion r8 = kotlin.Result.Companion
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)
            java.lang.Object r7 = kotlin.Result.m79constructorimpl(r7)
        La6:
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            boolean r9 = kotlin.Result.m85isFailureimpl(r7)
            if (r9 == 0) goto Lb2
            r7 = r8
        Lb2:
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r6.a
            com.lumina.monsterhunterfieldbook.NativePrefs r8 = r8.getPrefs()
            r9 = 2
            r10 = 0
            java.lang.String r0 = "rememberGroups"
            r1 = 0
            boolean r8 = com.lumina.monsterhunterfieldbook.NativePrefs.flag$default(r8, r0, r1, r9, r10)
            if (r8 == 0) goto Ld3
            java.lang.String r8 = r6.key
            boolean r8 = r7.has(r8)
            if (r8 == 0) goto Ld3
            java.lang.String r8 = r6.key
            boolean r11 = r7.optBoolean(r8)
        Ld3:
            if (r11 == 0) goto Ld8
            r6.setOpen(r12, r1)
        Ld8:
            return
    }

    public /* synthetic */ ReadingGroup(com.lumina.monsterhunterfieldbook.MainActivity r8, java.lang.String r9, java.lang.String r10, java.util.List r11, boolean r12, kotlin.jvm.functions.Function1 r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
            r7 = this;
            r14 = r14 & 16
            if (r14 == 0) goto L5
            r12 = 0
        L5:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    private static final kotlin.Unit head$lambda$0(com.lumina.monsterhunterfieldbook.ReadingGroup r0) {
            r0.toggle()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    public static /* synthetic */ void setOpen$default(com.lumina.monsterhunterfieldbook.ReadingGroup r0, boolean r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 1
        L5:
            r0.setOpen(r1, r2)
            return
    }

    private static final void setOpen$lambda$2(com.lumina.monsterhunterfieldbook.ReadingGroup r2) {
            boolean r0 = r2.expanded
            if (r0 != 0) goto L12
            android.widget.LinearLayout r0 = r2.inner
            r1 = 8
            r0.setVisibility(r1)
            android.widget.LinearLayout r2 = r2.inner
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r0)
        L12:
            return
    }

    private final void toggle() {
            r2 = this;
            boolean r0 = r2.expanded
            r1 = 1
            r0 = r0 ^ r1
            r2.setOpen(r0, r1)
            return
    }

    public final boolean getExpanded() {
            r1 = this;
            boolean r0 = r1.expanded
            return r0
    }

    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = r1.key
            return r0
    }

    public final void setOpen(boolean r11, boolean r12) {
            r10 = this;
            java.lang.String r0 = "readingGroups"
            r1 = 0
            if (r11 == 0) goto L51
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r10.a
            com.lumina.monsterhunterfieldbook.NativePrefs r2 = r2.getPrefs()
            java.lang.String r3 = "singleGroup"
            boolean r2 = r2.flag(r3, r1)
            if (r2 == 0) goto L51
            java.util.List<com.lumina.monsterhunterfieldbook.ReadingGroup> r2 = r10.siblings
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r2 = r2.iterator()
        L22:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L39
            java.lang.Object r4 = r2.next()
            r5 = r4
            com.lumina.monsterhunterfieldbook.ReadingGroup r5 = (com.lumina.monsterhunterfieldbook.ReadingGroup) r5
            if (r5 == r10) goto L22
            boolean r5 = r5.expanded
            if (r5 == 0) goto L22
            r3.add(r4)
            goto L22
        L39:
            java.util.List r3 = (java.util.List) r3
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r2 = r3.iterator()
        L41:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L51
            java.lang.Object r3 = r2.next()
            com.lumina.monsterhunterfieldbook.ReadingGroup r3 = (com.lumina.monsterhunterfieldbook.ReadingGroup) r3
            r3.setOpen(r1, r12)
            goto L41
        L51:
            r10.expanded = r11
            android.widget.LinearLayout r2 = r10.inner
            android.view.ViewPropertyAnimator r2 = r2.animate()
            r2.cancel()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto L79
            boolean r3 = r10.filled
            if (r3 != 0) goto L6e
            r3 = 1
            r10.filled = r3
            kotlin.jvm.functions.Function1<android.widget.LinearLayout, kotlin.Unit> r3 = r10.populate
            android.widget.LinearLayout r4 = r10.inner
            r3.invoke(r4)
        L6e:
            android.widget.LinearLayout r3 = r10.inner
            r3.setVisibility(r1)
            android.widget.LinearLayout r3 = r10.inner
            r3.setAlpha(r2)
            goto Lb7
        L79:
            if (r12 == 0) goto Lab
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r10.a
            r4 = 160(0xa0, double:7.9E-322)
            long r6 = r3.motionDuration(r4)
            r8 = 0
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 <= 0) goto Lab
            android.widget.LinearLayout r2 = r10.inner
            android.view.ViewPropertyAnimator r2 = r2.animate()
            r3 = 0
            android.view.ViewPropertyAnimator r2 = r2.alpha(r3)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r10.a
            long r3 = r3.motionDuration(r4)
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r3)
            com.lumina.monsterhunterfieldbook.ReadingGroup$$ExternalSyntheticLambda0 r3 = new com.lumina.monsterhunterfieldbook.ReadingGroup$$ExternalSyntheticLambda0
            r3.<init>(r10)
            android.view.ViewPropertyAnimator r2 = r2.withEndAction(r3)
            r2.start()
            goto Lb7
        Lab:
            android.widget.LinearLayout r3 = r10.inner
            r4 = 8
            r3.setVisibility(r4)
            android.widget.LinearLayout r3 = r10.inner
            r3.setAlpha(r2)
        Lb7:
            android.widget.TextView r2 = r10.head
            java.lang.CharSequence r3 = r2.getText()
            if (r11 == 0) goto Lc2
            java.lang.String r4 = ", expanded"
            goto Lc4
        Lc2:
            java.lang.String r4 = ", collapsed"
        Lc4:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setContentDescription(r3)
            if (r12 == 0) goto L137
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r10.a
            com.lumina.monsterhunterfieldbook.NativePrefs r12 = r12.getPrefs()
            r2 = 2
            r3 = 0
            java.lang.String r4 = "rememberGroups"
            boolean r12 = com.lumina.monsterhunterfieldbook.NativePrefs.flag$default(r12, r4, r1, r2, r3)
            if (r12 == 0) goto L137
            kotlin.Result$Companion r12 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L107
            r12 = r10
            com.lumina.monsterhunterfieldbook.ReadingGroup r12 = (com.lumina.monsterhunterfieldbook.ReadingGroup) r12     // Catch: java.lang.Throwable -> L107
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L107
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r10.a     // Catch: java.lang.Throwable -> L107
            com.lumina.monsterhunterfieldbook.NativePrefs r1 = r1.getPrefs()     // Catch: java.lang.Throwable -> L107
            java.lang.String r2 = "{}"
            java.lang.String r1 = r1.text(r0, r2)     // Catch: java.lang.Throwable -> L107
            r12.<init>(r1)     // Catch: java.lang.Throwable -> L107
            java.lang.Object r12 = kotlin.Result.m79constructorimpl(r12)     // Catch: java.lang.Throwable -> L107
            goto L112
        L107:
            r12 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r12 = kotlin.ResultKt.createFailure(r12)
            java.lang.Object r12 = kotlin.Result.m79constructorimpl(r12)
        L112:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            boolean r2 = kotlin.Result.m85isFailureimpl(r12)
            if (r2 == 0) goto L11e
            r12 = r1
        L11e:
            org.json.JSONObject r12 = (org.json.JSONObject) r12
            java.lang.String r1 = r10.key
            r12.put(r1, r11)
            com.lumina.monsterhunterfieldbook.MainActivity r11 = r10.a
            com.lumina.monsterhunterfieldbook.NativePrefs r11 = r11.getPrefs()
            java.lang.String r12 = r12.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r1)
            r11.set(r0, r12)
        L137:
            return
    }
}
