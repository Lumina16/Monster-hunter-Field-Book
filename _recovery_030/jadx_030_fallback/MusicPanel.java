package com.lumina.monsterhunterfieldbook;

/* compiled from: MusicPanel.kt */
@kotlin.Metadata(d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0019H\u0014J\b\u0010\u001c\u001a\u00020\u0019H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/MusicPanel;", "Landroid/widget/LinearLayout;", "a", "Lcom/lumina/monsterhunterfieldbook/MainActivity;", "<init>", "(Lcom/lumina/monsterhunterfieldbook/MainActivity;)V", "name", "Landroid/widget/TextView;", "time", "seek", "Landroid/widget/SeekBar;", "play", "queue", "handler", "Landroid/os/Handler;", "dragging", "", "ticker", "com/lumina/monsterhunterfieldbook/MusicPanel$ticker$1", "Lcom/lumina/monsterhunterfieldbook/MusicPanel$ticker$1;", "stamp", "", "ms", "", "update", "", "rebuildQueue", "onAttachedToWindow", "onDetachedFromWindow", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MusicPanel extends android.widget.LinearLayout {
    private final com.lumina.monsterhunterfieldbook.MainActivity a;
    private boolean dragging;
    private final android.os.Handler handler;
    private final android.widget.TextView name;
    private final android.widget.TextView play;
    private final android.widget.LinearLayout queue;
    private final android.widget.SeekBar seek;
    private final com.lumina.monsterhunterfieldbook.MusicPanel$ticker$1 ticker;
    private final android.widget.TextView time;


    public static /* synthetic */ kotlin.Unit $r8$lambda$3y6J4PN3Nav0Bg5XDIBibER0syQ(com.lumina.monsterhunterfieldbook.MusicPanel r0, com.lumina.monsterhunterfieldbook.MusicTrack r1) {
            kotlin.Unit r0 = rebuildQueue$lambda$0$3(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CnwRx3xXXyfqouS7mNlecYkNbPI(com.lumina.monsterhunterfieldbook.MusicPanel r0) {
            kotlin.Unit r0 = _init_$lambda$2(r0)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JxHVK0GJmcZQQOYvUJgPb95ueKM(com.lumina.monsterhunterfieldbook.MusicPanel r0) {
            kotlin.Unit r0 = _init_$lambda$3(r0)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MivEfB7o5YLCctbaVum6GLMG1po(com.lumina.monsterhunterfieldbook.MusicPanel r0) {
            kotlin.Unit r0 = _init_$lambda$0(r0)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$NasFj4utevrcBE7vt4Z12jK0QuI(com.lumina.monsterhunterfieldbook.MusicPanel r0, com.lumina.monsterhunterfieldbook.MusicTrack r1, android.content.DialogInterface r2, int r3) {
            rebuildQueue$lambda$0$3$0(r0, r1, r2, r3)
            return
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OFK8Y4n6zCMcGcOvin_YQdQeL88(com.lumina.monsterhunterfieldbook.MusicPanel r0) {
            kotlin.Unit r0 = _init_$lambda$1(r0)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bHqOABJqk_Kcgz2wxdOvAQH52Rg(com.lumina.monsterhunterfieldbook.MusicPanel r0, com.lumina.monsterhunterfieldbook.MusicTrack r1) {
            kotlin.Unit r0 = rebuildQueue$lambda$0$1(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oXbFWvzMQUJjIfMXZFeO7xPzE0g(com.lumina.monsterhunterfieldbook.MusicPanel r0, com.lumina.monsterhunterfieldbook.MusicTrack r1) {
            kotlin.Unit r0 = rebuildQueue$lambda$0$2(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pNl4bew1noQqS4cUtyfMd3eEGMo(com.lumina.monsterhunterfieldbook.MusicPanel r0, com.lumina.monsterhunterfieldbook.MusicTrack r1) {
            kotlin.Unit r0 = rebuildQueue$lambda$0$0(r0, r1)
            return r0
    }

    /* renamed from: $r8$lambda$zmxLLmZ1Y-C6LUOuITQy_uKvsBk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m34$r8$lambda$zmxLLmZ1YC6LUOuITQy_uKvsBk(com.lumina.monsterhunterfieldbook.MusicPanel r0) {
            kotlin.Unit r0 = play$lambda$0(r0)
            return r0
    }

    public MusicPanel(com.lumina.monsterhunterfieldbook.MainActivity r11) {
            r10 = this;
            java.lang.String r0 = "a"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = r11
            android.content.Context r0 = (android.content.Context) r0
            r10.<init>(r0)
            r10.a = r11
            r6 = 8
            r7 = 0
            java.lang.String r2 = ""
            r3 = 1098907648(0x41800000, float:16.0)
            r4 = 1
            r5 = 0
            r1 = r11
            android.widget.TextView r11 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r1, r2, r3, r4, r5, r6, r7)
            r0 = r1
            r10.name = r11
            int r4 = r0.getMuted()
            r5 = 4
            r6 = 0
            java.lang.String r1 = ""
            r2 = 1094713344(0x41400000, float:12.0)
            r3 = 0
            android.widget.TextView r1 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r0, r1, r2, r3, r4, r5, r6)
            r10.time = r1
            android.widget.SeekBar r2 = new android.widget.SeekBar
            r3 = r0
            android.content.Context r3 = (android.content.Context) r3
            r2.<init>(r3)
            r10.seek = r2
            com.lumina.monsterhunterfieldbook.MusicPanel$$ExternalSyntheticLambda1 r3 = new com.lumina.monsterhunterfieldbook.MusicPanel$$ExternalSyntheticLambda1
            r3.<init>(r10)
            java.lang.String r4 = "Play / pause"
            android.widget.TextView r3 = r0.button(r4, r3)
            r10.play = r3
            android.widget.LinearLayout r4 = r0.column()
            r10.queue = r4
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r6 = android.os.Looper.getMainLooper()
            r5.<init>(r6)
            r10.handler = r5
            com.lumina.monsterhunterfieldbook.MusicPanel$ticker$1 r5 = new com.lumina.monsterhunterfieldbook.MusicPanel$ticker$1
            r5.<init>(r10)
            r10.ticker = r5
            r5 = 1
            r10.setOrientation(r5)
            android.view.View r11 = (android.view.View) r11
            r10.addView(r11)
            android.view.View r1 = (android.view.View) r1
            r10.addView(r1)
            r11 = r10
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            r1 = 6
            r0.gap(r11, r1)
            java.lang.String r1 = "Music playback position"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2.setContentDescription(r1)
            com.lumina.monsterhunterfieldbook.MusicPanel$1 r1 = new com.lumina.monsterhunterfieldbook.MusicPanel$1
            r1.<init>(r10)
            android.widget.SeekBar$OnSeekBarChangeListener r1 = (android.widget.SeekBar.OnSeekBarChangeListener) r1
            r2.setOnSeekBarChangeListener(r1)
            android.view.View r2 = (android.view.View) r2
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r5 = 44
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r0.dp(r5)
            r6 = -1
            r1.<init>(r6, r5)
            android.view.ViewGroup$LayoutParams r1 = (android.view.ViewGroup.LayoutParams) r1
            r10.addView(r2, r1)
            android.widget.LinearLayout r1 = r0.row()
            com.lumina.monsterhunterfieldbook.MusicPanel$$ExternalSyntheticLambda2 r2 = new com.lumina.monsterhunterfieldbook.MusicPanel$$ExternalSyntheticLambda2
            r2.<init>(r10)
            java.lang.String r5 = "Previous"
            android.widget.TextView r2 = r0.button(r5, r2)
            android.view.View r2 = (android.view.View) r2
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r7 = 0
            r8 = -2
            r9 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r7, r8, r9)
            android.view.ViewGroup$LayoutParams r5 = (android.view.ViewGroup.LayoutParams) r5
            r1.addView(r2, r5)
            android.view.View r3 = (android.view.View) r3
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r7, r8, r9)
            android.view.ViewGroup$LayoutParams r2 = (android.view.ViewGroup.LayoutParams) r2
            r1.addView(r3, r2)
            com.lumina.monsterhunterfieldbook.MusicPanel$$ExternalSyntheticLambda3 r2 = new com.lumina.monsterhunterfieldbook.MusicPanel$$ExternalSyntheticLambda3
            r2.<init>(r10)
            java.lang.String r3 = "Next"
            android.widget.TextView r2 = r0.button(r3, r2)
            android.view.View r2 = (android.view.View) r2
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r7, r8, r9)
            android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
            r1.addView(r2, r3)
            android.view.View r1 = (android.view.View) r1
            r10.addView(r1)
            r1 = 2
            r2 = 0
            com.lumina.monsterhunterfieldbook.MainActivity.gap$default(r0, r11, r7, r1, r2)
            com.lumina.monsterhunterfieldbook.MusicPanel$$ExternalSyntheticLambda4 r3 = new com.lumina.monsterhunterfieldbook.MusicPanel$$ExternalSyntheticLambda4
            r3.<init>(r10)
            java.lang.String r5 = "Import audio file"
            android.widget.TextView r3 = r0.button(r5, r3)
            android.view.View r3 = (android.view.View) r3
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r6, r8)
            android.view.ViewGroup$LayoutParams r5 = (android.view.ViewGroup.LayoutParams) r5
            r10.addView(r3, r5)
            com.lumina.monsterhunterfieldbook.MainActivity.gap$default(r0, r11, r7, r1, r2)
            android.view.View r4 = (android.view.View) r4
            r10.addView(r4)
            r10.rebuildQueue()
            r10.update()
            com.lumina.monsterhunterfieldbook.MusicPanel$$ExternalSyntheticLambda5 r11 = new com.lumina.monsterhunterfieldbook.MusicPanel$$ExternalSyntheticLambda5
            r11.<init>(r10)
            java.lang.String r1 = "Restore bundled tracks"
            android.widget.TextView r11 = r0.button(r1, r11)
            android.view.View r11 = (android.view.View) r11
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r6, r8)
            android.view.ViewGroup$LayoutParams r0 = (android.view.ViewGroup.LayoutParams) r0
            r10.addView(r11, r0)
            return
    }

    private static final kotlin.Unit _init_$lambda$0(com.lumina.monsterhunterfieldbook.MusicPanel r2) {
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r2.a
            com.lumina.monsterhunterfieldbook.FieldAudio r0 = r0.getMusic()
            r1 = -1
            r0.advance(r1)
            r2.update()
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    private static final kotlin.Unit _init_$lambda$1(com.lumina.monsterhunterfieldbook.MusicPanel r2) {
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r2.a
            com.lumina.monsterhunterfieldbook.FieldAudio r0 = r0.getMusic()
            r1 = 1
            r0.advance(r1)
            r2.update()
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    private static final kotlin.Unit _init_$lambda$2(com.lumina.monsterhunterfieldbook.MusicPanel r3) {
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L23
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r3.a     // Catch: java.lang.Throwable -> L23
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "android.intent.action.OPEN_DOCUMENT"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "android.intent.category.OPENABLE"
            android.content.Intent r1 = r1.addCategory(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "audio/*"
            android.content.Intent r1 = r1.setType(r2)     // Catch: java.lang.Throwable -> L23
            r2 = 703(0x2bf, float:9.85E-43)
            r0.startActivityForResult(r1, r2)     // Catch: java.lang.Throwable -> L23
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L23
            java.lang.Object r0 = kotlin.Result.m79constructorimpl(r0)     // Catch: java.lang.Throwable -> L23
            goto L2e
        L23:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m79constructorimpl(r0)
        L2e:
            java.lang.Throwable r0 = kotlin.Result.m82exceptionOrNullimpl(r0)
            if (r0 == 0) goto L3b
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r3.a
            java.lang.String r0 = "No file picker is available."
            r3.toast(r0)
        L3b:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
    }

    private static final kotlin.Unit _init_$lambda$3(com.lumina.monsterhunterfieldbook.MusicPanel r1) {
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r1.a
            com.lumina.monsterhunterfieldbook.FieldAudio r0 = r0.getMusic()
            r0.restoreBuiltins()
            r1.rebuildQueue()
            r1.update()
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    public static final /* synthetic */ com.lumina.monsterhunterfieldbook.MainActivity access$getA$p(com.lumina.monsterhunterfieldbook.MusicPanel r0) {
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r0.a
            return r0
    }

    public static final /* synthetic */ android.os.Handler access$getHandler$p(com.lumina.monsterhunterfieldbook.MusicPanel r0) {
            android.os.Handler r0 = r0.handler
            return r0
    }

    public static final /* synthetic */ android.widget.TextView access$getTime$p(com.lumina.monsterhunterfieldbook.MusicPanel r0) {
            android.widget.TextView r0 = r0.time
            return r0
    }

    public static final /* synthetic */ void access$setDragging$p(com.lumina.monsterhunterfieldbook.MusicPanel r0, boolean r1) {
            r0.dragging = r1
            return
    }

    public static final /* synthetic */ java.lang.String access$stamp(com.lumina.monsterhunterfieldbook.MusicPanel r0, int r1) {
            java.lang.String r0 = r0.stamp(r1)
            return r0
    }

    public static final /* synthetic */ void access$update(com.lumina.monsterhunterfieldbook.MusicPanel r0) {
            r0.update()
            return
    }

    private static final kotlin.Unit play$lambda$0(com.lumina.monsterhunterfieldbook.MusicPanel r1) {
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r1.a
            com.lumina.monsterhunterfieldbook.FieldAudio r0 = r0.getMusic()
            r0.toggle()
            r1.update()
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    private final void rebuildQueue() {
            r9 = this;
            android.widget.LinearLayout r0 = r9.queue
            r0.removeAllViews()
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r9.a
            com.lumina.monsterhunterfieldbook.FieldAudio r0 = r0.getMusic()
            java.util.List r0 = r0.tracks()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb5
            java.lang.Object r1 = r0.next()
            com.lumina.monsterhunterfieldbook.MusicTrack r1 = (com.lumina.monsterhunterfieldbook.MusicTrack) r1
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r9.a
            java.lang.String r3 = r1.getTitle()
            com.lumina.monsterhunterfieldbook.MusicPanel$$ExternalSyntheticLambda6 r4 = new com.lumina.monsterhunterfieldbook.MusicPanel$$ExternalSyntheticLambda6
            r4.<init>(r9, r1)
            android.widget.TextView r2 = r2.button(r3, r4)
            r3 = 8388627(0x800013, float:1.175497E-38)
            r2.setGravity(r3)
            android.widget.LinearLayout r3 = r9.queue
            android.view.View r2 = (android.view.View) r2
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = -1
            r6 = -2
            r4.<init>(r5, r6)
            android.view.ViewGroup$LayoutParams r4 = (android.view.ViewGroup.LayoutParams) r4
            r3.addView(r2, r4)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r9.a
            android.widget.LinearLayout r2 = r2.row()
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r9.a
            com.lumina.monsterhunterfieldbook.MusicPanel$$ExternalSyntheticLambda7 r4 = new com.lumina.monsterhunterfieldbook.MusicPanel$$ExternalSyntheticLambda7
            r4.<init>(r9, r1)
            java.lang.String r5 = "Move up"
            android.widget.TextView r3 = r3.button(r5, r4)
            android.view.View r3 = (android.view.View) r3
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r5, r6, r7)
            android.view.ViewGroup$LayoutParams r4 = (android.view.ViewGroup.LayoutParams) r4
            r2.addView(r3, r4)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r9.a
            com.lumina.monsterhunterfieldbook.MusicPanel$$ExternalSyntheticLambda8 r4 = new com.lumina.monsterhunterfieldbook.MusicPanel$$ExternalSyntheticLambda8
            r4.<init>(r9, r1)
            java.lang.String r8 = "Move down"
            android.widget.TextView r3 = r3.button(r8, r4)
            android.view.View r3 = (android.view.View) r3
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r5, r6, r7)
            android.view.ViewGroup$LayoutParams r4 = (android.view.ViewGroup.LayoutParams) r4
            r2.addView(r3, r4)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r9.a
            boolean r4 = r1.getBuiltin()
            if (r4 == 0) goto L8c
            java.lang.String r4 = "Hide"
            goto L8e
        L8c:
            java.lang.String r4 = "Remove"
        L8e:
            com.lumina.monsterhunterfieldbook.MusicPanel$$ExternalSyntheticLambda9 r8 = new com.lumina.monsterhunterfieldbook.MusicPanel$$ExternalSyntheticLambda9
            r8.<init>(r9, r1)
            android.widget.TextView r1 = r3.button(r4, r8)
            android.view.View r1 = (android.view.View) r1
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r5, r6, r7)
            android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
            r2.addView(r1, r3)
            android.widget.LinearLayout r1 = r9.queue
            android.view.View r2 = (android.view.View) r2
            r1.addView(r2)
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r9.a
            android.widget.LinearLayout r2 = r9.queue
            r3 = 10
            r1.gap(r2, r3)
            goto L15
        Lb5:
            return
    }

    private static final kotlin.Unit rebuildQueue$lambda$0$0(com.lumina.monsterhunterfieldbook.MusicPanel r1, com.lumina.monsterhunterfieldbook.MusicTrack r2) {
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r1.a
            com.lumina.monsterhunterfieldbook.FieldAudio r0 = r0.getMusic()
            java.lang.String r2 = r2.getId()
            r0.select(r2)
            r1.update()
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    private static final kotlin.Unit rebuildQueue$lambda$0$1(com.lumina.monsterhunterfieldbook.MusicPanel r2, com.lumina.monsterhunterfieldbook.MusicTrack r3) {
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r2.a
            com.lumina.monsterhunterfieldbook.FieldAudio r0 = r0.getMusic()
            java.lang.String r3 = r3.getId()
            r1 = -1
            r0.move(r3, r1)
            r2.rebuildQueue()
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    private static final kotlin.Unit rebuildQueue$lambda$0$2(com.lumina.monsterhunterfieldbook.MusicPanel r2, com.lumina.monsterhunterfieldbook.MusicTrack r3) {
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r2.a
            com.lumina.monsterhunterfieldbook.FieldAudio r0 = r0.getMusic()
            java.lang.String r3 = r3.getId()
            r1 = 1
            r0.move(r3, r1)
            r2.rebuildQueue()
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    private static final kotlin.Unit rebuildQueue$lambda$0$3(com.lumina.monsterhunterfieldbook.MusicPanel r3, com.lumina.monsterhunterfieldbook.MusicTrack r4) {
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r3.a
            android.content.Context r1 = (android.content.Context) r1
            r0.<init>(r1)
            boolean r1 = r4.getBuiltin()
            if (r1 == 0) goto L12
            java.lang.String r1 = "Hide bundled track?"
            goto L14
        L12:
            java.lang.String r1 = "Remove imported audio?"
        L14:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            java.lang.String r1 = r4.getTitle()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            java.lang.String r1 = "Keep"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            java.lang.String r1 = "Remove"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            com.lumina.monsterhunterfieldbook.MusicPanel$$ExternalSyntheticLambda0 r2 = new com.lumina.monsterhunterfieldbook.MusicPanel$$ExternalSyntheticLambda0
            r2.<init>(r3, r4)
            android.app.AlertDialog$Builder r3 = r0.setPositiveButton(r1, r2)
            r3.show()
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
    }

    private static final void rebuildQueue$lambda$0$3$0(com.lumina.monsterhunterfieldbook.MusicPanel r0, com.lumina.monsterhunterfieldbook.MusicTrack r1, android.content.DialogInterface r2, int r3) {
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            com.lumina.monsterhunterfieldbook.FieldAudio r2 = r2.getMusic()
            java.lang.String r1 = r1.getId()
            r2.remove(r1)
            r0.rebuildQueue()
            r0.update()
            return
    }

    private final java.lang.String stamp(int r2) {
            r1 = this;
            r0 = 60000(0xea60, float:8.4078E-41)
            int r0 = r2 / r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r2 = r2 / 1000
            int r2 = r2 % 60
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r2}
            r0 = 2
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String r0 = "%d:%02d"
            java.lang.String r2 = java.lang.String.format(r0, r2)
            java.lang.String r0 = "format(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            return r2
    }

    private final void update() {
            r4 = this;
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r4.a
            com.lumina.monsterhunterfieldbook.FieldAudio r0 = r0.getMusic()
            java.util.List r0 = r0.tracks()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.next()
            r2 = r1
            com.lumina.monsterhunterfieldbook.MusicTrack r2 = (com.lumina.monsterhunterfieldbook.MusicTrack) r2
            java.lang.String r2 = r2.getId()
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r4.a
            com.lumina.monsterhunterfieldbook.FieldAudio r3 = r3.getMusic()
            java.lang.String r3 = r3.getTrackId()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 == 0) goto L10
            goto L33
        L32:
            r1 = 0
        L33:
            com.lumina.monsterhunterfieldbook.MusicTrack r1 = (com.lumina.monsterhunterfieldbook.MusicTrack) r1
            android.widget.TextView r0 = r4.name
            if (r1 == 0) goto L40
            java.lang.String r1 = r1.getTitle()
            if (r1 == 0) goto L40
            goto L42
        L40:
            java.lang.String r1 = "Choose a track"
        L42:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            android.widget.TextView r0 = r4.play
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r4.a
            com.lumina.monsterhunterfieldbook.FieldAudio r1 = r1.getMusic()
            boolean r1 = r1.getPlaying()
            if (r1 == 0) goto L58
            java.lang.String r1 = "Pause"
            goto L5a
        L58:
            java.lang.String r1 = "Play"
        L5a:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            boolean r0 = r4.dragging
            if (r0 != 0) goto Lc0
            android.widget.SeekBar r0 = r4.seek
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r4.a
            com.lumina.monsterhunterfieldbook.FieldAudio r1 = r1.getMusic()
            int r1 = r1.getDuration()
            r2 = 1
            int r1 = kotlin.ranges.RangesKt.coerceAtLeast(r1, r2)
            r0.setMax(r1)
            android.widget.SeekBar r0 = r4.seek
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r4.a
            com.lumina.monsterhunterfieldbook.FieldAudio r1 = r1.getMusic()
            int r1 = r1.getPosition()
            r0.setProgress(r1)
            android.widget.TextView r0 = r4.time
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r4.a
            com.lumina.monsterhunterfieldbook.FieldAudio r1 = r1.getMusic()
            int r1 = r1.getPosition()
            java.lang.String r1 = r4.stamp(r1)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r4.a
            com.lumina.monsterhunterfieldbook.FieldAudio r2 = r2.getMusic()
            int r2 = r2.getDuration()
            java.lang.String r2 = r4.stamp(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r3 = " / "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        Lc0:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            android.os.Handler r0 = r2.handler
            com.lumina.monsterhunterfieldbook.MusicPanel$ticker$1 r1 = r2.ticker
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0.post(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            android.os.Handler r0 = r2.handler
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            super.onDetachedFromWindow()
            return
    }
}
