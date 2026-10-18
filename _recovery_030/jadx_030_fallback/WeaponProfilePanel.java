package com.lumina.monsterhunterfieldbook;

/* compiled from: WeaponProfilePanel.kt */
@kotlin.Metadata(d1 = {"\u0000·\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t*\u00019\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010;\u001a\u00020\fH\u0002J\b\u0010<\u001a\u00020\fH\u0002J\u0006\u0010=\u001a\u00020\tJ\b\u0010>\u001a\u00020?H\u0002J\b\u0010@\u001a\u00020\fH\u0002J\u0006\u0010A\u001a\u00020.J\u0010\u0010B\u001a\u00020\f2\u0006\u0010C\u001a\u000202H\u0002J\u0010\u0010D\u001a\u00020\f2\u0006\u0010C\u001a\u000202H\u0002J\u0012\u0010E\u001a\u00020\f2\b\b\u0002\u0010F\u001a\u00020.H\u0002J\b\u0010G\u001a\u00020\fH\u0002J\b\u0010H\u001a\u00020\fH\u0002J\u001e\u0010I\u001a\u00020\f2\u0006\u0010J\u001a\u00020.2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0018\u0010L\u001a\u00020\f2\u0006\u0010M\u001a\u00020N2\u0006\u0010J\u001a\u00020.H\u0002J\u0010\u0010O\u001a\u00020\f2\u0006\u0010P\u001a\u00020QH\u0002J\b\u0010R\u001a\u00020\fH\u0002J\u0014\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00010TH\u0002J\b\u0010U\u001a\u00020\fH\u0002J\u001a\u0010V\u001a\u00020\f2\u0006\u0010W\u001a\u00020\u00012\b\u0010X\u001a\u0004\u0018\u00010?H\u0002J \u0010Y\u001a\u00020\f2\u0006\u0010W\u001a\u00020\u00012\u0006\u0010Z\u001a\u0002022\u0006\u0010[\u001a\u000202H\u0002J\u0010\u0010\\\u001a\u00020\u00182\u0006\u0010]\u001a\u000202H\u0002J\b\u0010^\u001a\u00020\fH\u0002J\b\u0010_\u001a\u000202H\u0002J:\u0010`\u001a\u00020\f2\u0006\u0010W\u001a\u00020a2\u0006\u0010Z\u001a\u0002022\u0006\u0010b\u001a\u0002022\u0018\u0010X\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u0002020T0\u0007H\u0002J\u0010\u0010c\u001a\u00020\f2\u0006\u0010d\u001a\u00020.H\u0002J\u0010\u0010e\u001a\u00020(2\u0006\u0010f\u001a\u00020\u0005H\u0002J\b\u0010g\u001a\u00020\fH\u0002J\b\u0010h\u001a\u00020\fH\u0002J\b\u0010i\u001a\u00020\fH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u00105\u001a\u0016\u0012\f\u0012\n 7*\u0004\u0018\u00010202\u0012\u0004\u0012\u00020\u000506X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u000209X\u0082\u0004¢\u0006\u0004\n\u0002\u0010:¨\u0006j"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/WeaponProfilePanel;", "Landroid/widget/LinearLayout;", "a", "Lcom/lumina/monsterhunterfieldbook/MainActivity;", "guide", "Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "records", "", "state", "Lorg/json/JSONObject;", "close", "Lkotlin/Function0;", "", "<init>", "(Lcom/lumina/monsterhunterfieldbook/MainActivity;Lcom/lumina/monsterhunterfieldbook/FieldRecord;Ljava/util/List;Lorg/json/JSONObject;Lkotlin/jvm/functions/Function0;)V", "getGuide", "()Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "getRecords", "()Ljava/util/List;", "getState", "()Lorg/json/JSONObject;", "heading", "tabs", "host", "Landroid/widget/FrameLayout;", "groups", "", "Lcom/lumina/monsterhunterfieldbook/ReadingGroup;", "scroll", "Landroid/widget/ScrollView;", "list", "Landroid/widget/ListView;", "treePanel", "Lcom/lumina/monsterhunterfieldbook/WeaponTreePanel;", "visible", "more", "Landroid/widget/TextView;", "meta", "filterToggle", "filterPanel", "Landroid/view/View;", "handler", "Landroid/os/Handler;", "pending", "Ljava/lang/Runnable;", "restoring", "", "contentAnimation", "Landroid/animation/ValueAnimator;", "renderedTab", "", "renderedDetail", "renderedId", "byId", "", "kotlin.jvm.PlatformType", "adapter", "com/lumina/monsterhunterfieldbook/WeaponProfilePanel$adapter$1", "Lcom/lumina/monsterhunterfieldbook/WeaponProfilePanel$adapter$1;", "saveFilters", "capture", "snapshot", "trail", "Lorg/json/JSONArray;", "checkpoint", "back", "select", "rawId", "showTreeInfo", "render", "animate", "buildHeading", "buildTabs", "transitionContent", "returning", "replace", "arrival", "milliseconds", "", "blur", "radius", "", "resetContentTransform", "contentScroll", "Lkotlin/Pair;", "renderGuide", "loops", "parent", "values", "advice", "label", "value", "bookmark", "id", "renderDatabase", "filterLabel", "choices", "Landroid/widget/GridLayout;", "key", "updateRows", "reset", "weaponRow", "record", "renderDetails", "hideKeyboard", "onDetachedFromWindow", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WeaponProfilePanel extends android.widget.LinearLayout {
    private final com.lumina.monsterhunterfieldbook.MainActivity a;
    private final com.lumina.monsterhunterfieldbook.WeaponProfilePanel$adapter$1 adapter;
    private final java.util.Map<java.lang.String, com.lumina.monsterhunterfieldbook.FieldRecord> byId;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> close;
    private android.animation.ValueAnimator contentAnimation;
    private android.view.View filterPanel;
    private android.widget.TextView filterToggle;
    private final java.util.List<com.lumina.monsterhunterfieldbook.ReadingGroup> groups;
    private final com.lumina.monsterhunterfieldbook.FieldRecord guide;
    private final android.os.Handler handler;
    private final android.widget.LinearLayout heading;
    private final android.widget.FrameLayout host;
    private android.widget.ListView list;
    private android.widget.TextView meta;
    private android.widget.TextView more;
    private java.lang.Runnable pending;
    private final java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> records;
    private boolean renderedDetail;
    private java.lang.String renderedId;
    private java.lang.String renderedTab;
    private boolean restoring;
    private android.widget.ScrollView scroll;
    private final org.json.JSONObject state;
    private final android.widget.LinearLayout tabs;
    private com.lumina.monsterhunterfieldbook.WeaponTreePanel treePanel;
    private final java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> visible;

    /* renamed from: $r8$lambda$-sCrLEaKqQ-66I5GhnPSg0j0clo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m62$r8$lambda$sCrLEaKqQ66I5GhnPSg0j0clo(org.json.JSONObject r0, com.lumina.monsterhunterfieldbook.WeaponProfilePanel r1, android.widget.LinearLayout r2) {
            kotlin.Unit r0 = renderGuide$lambda$9(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$0BGIgm68f_OcwbnB9NvUbxg8v1c(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0, float r1, java.lang.String r2, android.animation.ValueAnimator r3) {
            arrival$lambda$0$0(r0, r1, r2, r3)
            return
    }

    /* renamed from: $r8$lambda$4oS1tMulniT1ydWnr24zL-erqQ8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m63$r8$lambda$4oS1tMulniT1ydWnr24zLerqQ8(org.json.JSONObject r0, com.lumina.monsterhunterfieldbook.WeaponProfilePanel r1, android.widget.LinearLayout r2) {
            kotlin.Unit r0 = renderGuide$lambda$2(r0, r1, r2)
            return r0
    }

    /* renamed from: $r8$lambda$82DQz786UXQQMc68-1NGaLMCklg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m64$r8$lambda$82DQz786UXQQMc681NGaLMCklg(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0, java.lang.String r1) {
            kotlin.Unit r0 = render$lambda$0(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9a8WTaGX6Oh5zDJ83e3fYVaIOsc(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0) {
            kotlin.Unit r0 = renderDatabase$lambda$16(r0)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BI7GV9qRBcBP0G8Uus8J0Jm33m4(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0) {
            kotlin.Unit r0 = back$lambda$2(r0)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GkqlePXExMbozJ8tj9RxXmc5xG0(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0, java.lang.String r1) {
            kotlin.Unit r0 = buildTabs$lambda$0$0(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IZfKCQ6urHFNlS2B_du6WHusOBY(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0) {
            kotlin.Unit r0 = buildTabs$lambda$0$0$0(r0)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MTXiFd924yoql6Bc4UFkJfaNlnI(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0) {
            kotlin.Unit r0 = renderDatabase$lambda$3(r0)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PkbMmzD1f55weKb_4D_X8mt6pec(android.widget.EditText r0) {
            kotlin.Unit r0 = renderDatabase$lambda$2(r0)
            return r0
    }

    /* renamed from: $r8$lambda$T3CIiWCA8xe-0uz5PgtLAlqHqMA, reason: not valid java name */
    public static /* synthetic */ void m65$r8$lambda$T3CIiWCA8xe0uz5PgtLAlqHqMA(android.widget.ScrollView r0, com.lumina.monsterhunterfieldbook.WeaponProfilePanel r1, com.lumina.monsterhunterfieldbook.FieldRecord r2) {
            renderDetails$lambda$1(r0, r1, r2)
            return
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TbpKqWNv5dlCilKfxZEpTbX3KdA(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0, java.lang.String r1, com.lumina.monsterhunterfieldbook.GlyphView r2, android.widget.FrameLayout r3) {
            kotlin.Unit r0 = bookmark$lambda$0(r0, r1, r2, r3)
            return r0
    }

    /* renamed from: $r8$lambda$Y0nDui-AnXWJEZKS-MgGLXJI9F8, reason: not valid java name */
    public static /* synthetic */ void m66$r8$lambda$Y0nDuiAnXWJEZKSMgGLXJI9F8(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0, boolean r1) {
            updateRows$lambda$1(r0, r1)
            return
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dTt2KqMHHJzmeY2NYQPNY06ob90(org.json.JSONObject r0, com.lumina.monsterhunterfieldbook.WeaponProfilePanel r1, android.widget.LinearLayout r2) {
            kotlin.Unit r0 = renderGuide$lambda$5(r0, r1, r2)
            return r0
    }

    /* renamed from: $r8$lambda$drYfe1kDPGXBr1WemlJ0-cRHVx8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m67$r8$lambda$drYfe1kDPGXBr1WemlJ0cRHVx8(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0, java.lang.String r1) {
            kotlin.Unit r0 = renderDetails$lambda$0(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eazrLND4ojFwn_Z6hy0YeJiBsRg(org.json.JSONObject r0, com.lumina.monsterhunterfieldbook.WeaponProfilePanel r1, android.widget.LinearLayout r2) {
            kotlin.Unit r0 = renderGuide$lambda$4(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$elN3GwDOYpsRMCRW8_9Zf9J3f5E(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0) {
            kotlin.Unit r0 = renderDatabase$lambda$11(r0)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$ku0pabd5YP4xADn9HYtDvgPSRbk(android.widget.ScrollView r0, com.lumina.monsterhunterfieldbook.WeaponProfilePanel r1) {
            renderGuide$lambda$12(r0, r1)
            return
    }

    public static /* synthetic */ boolean $r8$lambda$pF0oSqFvtsjp2iYXHnaLKIXQBU0(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0, android.widget.TextView r1, int r2, android.view.KeyEvent r3) {
            boolean r0 = renderDatabase$lambda$17(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$r1KzSNqfkR5TmpUu_dcBbtiRmes(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0, float r1, java.lang.String r2, float r3, float r4, android.animation.ValueAnimator r5) {
            transitionContent$lambda$0$0(r0, r1, r2, r3, r4, r5)
            return
    }

    /* renamed from: $r8$lambda$rMkVDW81-yrP9aJP5AziHIM7PPs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m68$r8$lambda$rMkVDW81yrP9aJP5AziHIM7PPs(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0) {
            kotlin.Unit r0 = buildHeading$lambda$0(r0)
            return r0
    }

    /* renamed from: $r8$lambda$rtAtCqQ50R8cIpaka-fnPxXeFS8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m69$r8$lambda$rtAtCqQ50R8cIpakafnPxXeFS8(org.json.JSONObject r0, com.lumina.monsterhunterfieldbook.WeaponProfilePanel r1, android.widget.LinearLayout r2) {
            kotlin.Unit r0 = renderGuide$lambda$3(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vjoJvn1lRbfXYnR_uvVFJRDV7ag() {
            kotlin.Unit r0 = renderDatabase$lambda$15()
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ycnjBfpJW_oLXYyj4g7ay4tLERA(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0, com.lumina.monsterhunterfieldbook.FieldRecord r1) {
            kotlin.Unit r0 = weaponRow$lambda$3(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yhBvWGm8eaLxTtk5ZpMkhy8uXqI(org.json.JSONObject r0, com.lumina.monsterhunterfieldbook.WeaponProfilePanel r1, android.widget.LinearLayout r2) {
            kotlin.Unit r0 = renderGuide$lambda$8(r0, r1, r2)
            return r0
    }

    public WeaponProfilePanel(com.lumina.monsterhunterfieldbook.MainActivity r17, com.lumina.monsterhunterfieldbook.FieldRecord r18, java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r19, org.json.JSONObject r20, kotlin.jvm.functions.Function0<kotlin.Unit> r21) {
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            java.lang.String r6 = "a"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r6)
            java.lang.String r6 = "guide"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
            java.lang.String r7 = "records"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r7)
            java.lang.String r7 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r7)
            java.lang.String r7 = "close"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r7)
            r7 = r0
            android.content.Context r7 = (android.content.Context) r7
            r1.<init>(r7)
            r1.a = r0
            r1.guide = r2
            r1.records = r3
            r1.state = r4
            r1.close = r5
            android.widget.LinearLayout r2 = r0.row()
            r1.heading = r2
            android.widget.LinearLayout r2 = r0.row()
            r1.tabs = r2
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            android.content.Context r0 = (android.content.Context) r0
            r2.<init>(r0)
            r1.host = r2
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r1.groups = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r1.visible = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            r1.handler = r0
            java.lang.String r0 = ""
            r1.renderedTab = r0
            r1.renderedId = r0
            r2 = r3
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 10
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r3)
            int r3 = kotlin.collections.MapsKt.mapCapacity(r3)
            r5 = 16
            int r3 = kotlin.ranges.RangesKt.coerceAtLeast(r3, r5)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r3)
            java.util.Map r5 = (java.util.Map) r5
            java.util.Iterator r2 = r2.iterator()
        L8f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La6
            java.lang.Object r3 = r2.next()
            r7 = r3
            com.lumina.monsterhunterfieldbook.FieldRecord r7 = (com.lumina.monsterhunterfieldbook.FieldRecord) r7
            com.lumina.monsterhunterfieldbook.WeaponModel r8 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            java.lang.String r7 = r8.rawId(r7)
            r5.put(r7, r3)
            goto L8f
        La6:
            r1.byId = r5
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$adapter$1 r2 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$adapter$1
            r2.<init>(r1)
            r1.adapter = r2
            r2 = 1
            r1.setOrientation(r2)
            com.lumina.monsterhunterfieldbook.WeaponModel r3 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r5 = r1.records
            r3.register(r5)
            org.json.JSONObject r3 = r1.state
            java.lang.String r5 = "type"
            boolean r3 = r3.has(r5)
            if (r3 != 0) goto Ld5
            org.json.JSONObject r3 = r1.state
            com.lumina.monsterhunterfieldbook.FieldRecord r7 = r1.guide
            org.json.JSONObject r7 = r7.data()
            java.lang.String r8 = "id"
            java.lang.String r7 = r7.optString(r8)
            r3.put(r5, r7)
        Ld5:
            org.json.JSONObject r3 = r1.state
            java.lang.String r7 = "tab"
            boolean r3 = r3.has(r7)
            if (r3 != 0) goto Le4
            org.json.JSONObject r3 = r1.state
            r3.put(r7, r6)
        Le4:
            org.json.JSONObject r3 = r1.state
            java.lang.String r6 = "q"
            boolean r3 = r3.has(r6)
            if (r3 != 0) goto Lf3
            org.json.JSONObject r3 = r1.state
            r3.put(r6, r0)
        Lf3:
            org.json.JSONObject r0 = r1.state
            java.lang.String r3 = "family"
            boolean r0 = r0.has(r3)
            if (r0 != 0) goto L104
            org.json.JSONObject r0 = r1.state
            java.lang.String r6 = "default"
            r0.put(r3, r6)
        L104:
            r6 = 4
            java.lang.String[] r0 = new java.lang.String[r6]
            r7 = 0
            java.lang.String r8 = "rank"
            r0[r7] = r8
            java.lang.String r9 = "rarity"
            r0[r2] = r9
            r10 = 2
            java.lang.String r11 = "element"
            r0[r10] = r11
            r12 = 3
            java.lang.String r13 = "obtain"
            r0[r12] = r13
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L124:
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L147
            java.lang.Object r14 = r0.next()
            java.lang.String r14 = (java.lang.String) r14
            org.json.JSONObject r15 = r1.state
            boolean r15 = r15.has(r14)
            if (r15 != 0) goto L142
            org.json.JSONObject r15 = r1.state
            r17 = r6
            java.lang.String r6 = "all"
            r15.put(r14, r6)
            goto L144
        L142:
            r17 = r6
        L144:
            r6 = r17
            goto L124
        L147:
            r17 = r6
            org.json.JSONObject r0 = r1.state
            java.lang.String r6 = "path"
            boolean r0 = r0.has(r6)
            if (r0 != 0) goto L15a
            org.json.JSONObject r0 = r1.state
            java.lang.String r14 = "upgrade"
            r0.put(r6, r14)
        L15a:
            org.json.JSONObject r0 = r1.state
            java.lang.String r6 = "limit"
            boolean r0 = r0.has(r6)
            if (r0 != 0) goto L16b
            org.json.JSONObject r0 = r1.state
            r14 = 40
            r0.put(r6, r14)
        L16b:
            org.json.JSONObject r0 = r1.state
            java.lang.String r6 = "filtersOpen"
            boolean r0 = r0.has(r6)
            if (r0 != 0) goto L17a
            org.json.JSONObject r0 = r1.state
            r0.put(r6, r7)
        L17a:
            org.json.JSONObject r0 = r1.state
            java.lang.String r6 = "tree"
            boolean r0 = r0.has(r6)
            if (r0 != 0) goto L1a0
            org.json.JSONObject r0 = r1.state
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>()
            java.lang.String r15 = "zoom"
            org.json.JSONObject r14 = r14.put(r15, r2)
            java.lang.String r15 = "x"
            org.json.JSONObject r14 = r14.put(r15, r7)
            java.lang.String r15 = "y"
            org.json.JSONObject r14 = r14.put(r15, r7)
            r0.put(r6, r14)
        L1a0:
            org.json.JSONObject r0 = r1.state
            java.lang.String r6 = "_memoryLoaded"
            boolean r0 = r0.has(r6)
            if (r0 != 0) goto L239
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L1cb
            r0 = r1
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0 = (com.lumina.monsterhunterfieldbook.WeaponProfilePanel) r0     // Catch: java.lang.Throwable -> L1cb
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1cb
            com.lumina.monsterhunterfieldbook.MainActivity r14 = r1.a     // Catch: java.lang.Throwable -> L1cb
            com.lumina.monsterhunterfieldbook.NativePrefs r14 = r14.getPrefs()     // Catch: java.lang.Throwable -> L1cb
            java.lang.String r15 = "filterMemory"
            r18 = r10
            java.lang.String r10 = "{}"
            java.lang.String r10 = r14.text(r15, r10)     // Catch: java.lang.Throwable -> L1c9
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L1c9
            java.lang.Object r0 = kotlin.Result.m79constructorimpl(r0)     // Catch: java.lang.Throwable -> L1c9
            goto L1d8
        L1c9:
            r0 = move-exception
            goto L1ce
        L1cb:
            r0 = move-exception
            r18 = r10
        L1ce:
            kotlin.Result$Companion r10 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m79constructorimpl(r0)
        L1d8:
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            boolean r14 = kotlin.Result.m85isFailureimpl(r0)
            if (r14 == 0) goto L1e4
            r0 = r10
        L1e4:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            org.json.JSONObject r10 = r1.state
            java.lang.String r5 = r10.optString(r5)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r14 = "weapon:"
            r10.<init>(r14)
            java.lang.StringBuilder r5 = r10.append(r5)
            java.lang.String r5 = r5.toString()
            org.json.JSONObject r0 = r0.optJSONObject(r5)
            r5 = 5
            java.lang.String[] r5 = new java.lang.String[r5]
            r5[r7] = r8
            r5[r2] = r9
            r5[r18] = r11
            r5[r12] = r13
            r5[r17] = r3
            java.util.List r3 = kotlin.collections.CollectionsKt.listOf(r5)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L216:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L234
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            if (r0 == 0) goto L216
            boolean r8 = r0.has(r5)
            if (r8 != r2) goto L216
            org.json.JSONObject r8 = r1.state
            java.lang.Object r9 = r0.opt(r5)
            r8.put(r5, r9)
            goto L216
        L234:
            org.json.JSONObject r0 = r1.state
            r0.put(r6, r2)
        L239:
            android.widget.LinearLayout r0 = r1.heading
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r1.a
            r3 = 13
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r2 = r2.dp(r3)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r1.a
            r5 = r4
            java.lang.Number r5 = (java.lang.Number) r5
            int r3 = r3.dp(r5)
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r1.a
            r6 = 6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            int r5 = r5.dp(r6)
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r1.a
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r6.dp(r4)
            r0.setPadding(r2, r3, r5, r4)
            android.widget.LinearLayout r0 = r1.heading
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r1.a
            r3 = 60
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r2 = r2.dp(r3)
            r0.setMinimumHeight(r2)
            android.widget.LinearLayout r0 = r1.heading
            android.view.View r0 = (android.view.View) r0
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -2
            r4 = -1
            r2.<init>(r4, r3)
            android.view.ViewGroup$LayoutParams r2 = (android.view.ViewGroup.LayoutParams) r2
            r1.addView(r0, r2)
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r1.a
            r2 = r1
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r0.rule(r2)
            android.widget.LinearLayout r0 = r1.tabs
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r1.a
            r3 = 12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r2 = r2.dp(r3)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r1.a
            r5 = 12
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r3 = r3.dp(r5)
            r0.setPadding(r2, r7, r3, r7)
            android.widget.LinearLayout r0 = r1.tabs
            android.view.View r0 = (android.view.View) r0
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -2
            r2.<init>(r4, r3)
            android.view.ViewGroup$LayoutParams r2 = (android.view.ViewGroup.LayoutParams) r2
            r1.addView(r0, r2)
            android.widget.FrameLayout r0 = r1.host
            android.view.View r0 = (android.view.View) r0
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r4, r7, r3)
            android.view.ViewGroup$LayoutParams r2 = (android.view.ViewGroup.LayoutParams) r2
            r1.addView(r0, r2)
            r1.render(r7)
            return
    }

    public static final /* synthetic */ void access$arrival(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0, long r1, boolean r3) {
            r0.arrival(r1, r3)
            return
    }

    public static final /* synthetic */ com.lumina.monsterhunterfieldbook.MainActivity access$getA$p(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0) {
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r0.a
            return r0
    }

    public static final /* synthetic */ android.os.Handler access$getHandler$p(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0) {
            android.os.Handler r0 = r0.handler
            return r0
    }

    public static final /* synthetic */ android.widget.FrameLayout access$getHost$p(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0) {
            android.widget.FrameLayout r0 = r0.host
            return r0
    }

    public static final /* synthetic */ java.lang.Runnable access$getPending$p(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0) {
            java.lang.Runnable r0 = r0.pending
            return r0
    }

    public static final /* synthetic */ boolean access$getRestoring$p(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0) {
            boolean r0 = r0.restoring
            return r0
    }

    public static final /* synthetic */ java.util.List access$getVisible$p(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0) {
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r0 = r0.visible
            return r0
    }

    public static final /* synthetic */ void access$hideKeyboard(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0) {
            r0.hideKeyboard()
            return
    }

    public static final /* synthetic */ void access$resetContentTransform(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0) {
            r0.resetContentTransform()
            return
    }

    public static final /* synthetic */ void access$saveFilters(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0) {
            r0.saveFilters()
            return
    }

    public static final /* synthetic */ void access$setPending$p(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0, java.lang.Runnable r1) {
            r0.pending = r1
            return
    }

    public static final /* synthetic */ void access$updateRows(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0, boolean r1) {
            r0.updateRows(r1)
            return
    }

    public static final /* synthetic */ android.view.View access$weaponRow(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0, com.lumina.monsterhunterfieldbook.FieldRecord r1) {
            android.view.View r0 = r0.weaponRow(r1)
            return r0
    }

    private final void advice(android.widget.LinearLayout r11, java.lang.String r12, java.lang.String r13) {
            r10 = this;
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r10.a
            android.widget.LinearLayout r0 = r0.column()
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r10.a
            int r2 = r1.getPanel()
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r10.a
            int r3 = r3.getAccent()
            r4 = 1024416809(0x3d0f5c29, float:0.035)
            int r2 = com.lumina.monsterhunterfieldbook.FieldViewsKt.blend(r2, r3, r4)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            android.graphics.drawable.GradientDrawable r1 = com.lumina.monsterhunterfieldbook.MainActivity.surface$default(r1, r2, r3, r4, r5, r6)
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            r0.setBackground(r1)
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r10.a
            r2 = r0
            android.view.View r2 = (android.view.View) r2
            r3 = 16
            r1.pad(r2, r3)
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r10.a
            r3 = 1092616192(0x41200000, float:10.0)
            int r4 = r1.getAccent()
            android.widget.TextView r12 = r1.textBold(r12, r3, r4)
            r1 = 1041194025(0x3e0f5c29, float:0.14)
            r12.setLetterSpacing(r1)
            android.view.View r12 = (android.view.View) r12
            r0.addView(r12)
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r10.a
            r1 = 10
            r12.gap(r0, r1)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r10.a
            r8 = 12
            r9 = 0
            r5 = 1096810496(0x41600000, float:14.0)
            r6 = 0
            r7 = 0
            r4 = r13
            android.widget.TextView r12 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r3, r4, r5, r6, r7, r8, r9)
            android.view.View r12 = (android.view.View) r12
            r0.addView(r12)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r13 = -1
            r0 = -2
            r12.<init>(r13, r0)
            android.view.ViewGroup$LayoutParams r12 = (android.view.ViewGroup.LayoutParams) r12
            r11.addView(r2, r12)
            return
    }

    private final void arrival(long r7, boolean r9) {
            r6 = this;
            java.lang.String r0 = "liquid"
            if (r9 == 0) goto L7
            java.lang.String r1 = "return"
            goto L13
        L7:
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r6.a
            com.lumina.monsterhunterfieldbook.NativePrefs r1 = r1.getPrefs()
            java.lang.String r2 = "transition"
            java.lang.String r1 = r1.text(r2, r0)
        L13:
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r6.a
            long r2 = r2.motionDuration(r7)
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L7a
            java.lang.String r2 = "none"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r2 == 0) goto L28
            goto L7a
        L28:
            android.animation.ValueAnimator r2 = r6.contentAnimation
            if (r2 == 0) goto L2f
            r2.cancel()
        L2f:
            r2 = 0
            if (r9 == 0) goto L36
            r9 = 1057803469(0x3f0ccccd, float:0.55)
            goto L40
        L36:
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r9 == 0) goto L3f
            r9 = 1048576000(0x3e800000, float:0.25)
            goto L40
        L3f:
            r9 = r2
        L40:
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x007e: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r6.a
            long r7 = r3.motionDuration(r7)
            r0.setDuration(r7)
            android.view.animation.PathInterpolator r7 = new android.view.animation.PathInterpolator
            r8 = 1058306785(0x3f147ae1, float:0.58)
            r3 = 1065353216(0x3f800000, float:1.0)
            r7.<init>(r2, r2, r8, r3)
            android.animation.TimeInterpolator r7 = (android.animation.TimeInterpolator) r7
            r0.setInterpolator(r7)
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda19 r7 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda19
            r7.<init>(r6, r9, r1)
            r0.addUpdateListener(r7)
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$arrival$1$2 r7 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$arrival$1$2
            r7.<init>(r6)
            android.animation.Animator$AnimatorListener r7 = (android.animation.Animator.AnimatorListener) r7
            r0.addListener(r7)
            r0.start()
            r6.contentAnimation = r0
            return
        L7a:
            r6.resetContentTransform()
            return
    }

    private static final void arrival$lambda$0$0(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r4, float r5, java.lang.String r6, android.animation.ValueAnimator r7) {
            java.lang.String r0 = "animation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.Object r7 = r7.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7, r0)
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            android.widget.FrameLayout r0 = r4.host
            r1 = 1
            float r1 = (float) r1
            float r2 = r1 - r5
            float r2 = r2 * r7
            float r5 = r5 + r2
            r0.setAlpha(r5)
            android.widget.FrameLayout r5 = r4.host
            java.lang.String r0 = "slide"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r0)
            r2 = 0
            if (r0 == 0) goto L3d
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r4.a
            r3 = 12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r0 = r0.dp(r3)
            float r0 = (float) r0
            float r3 = r1 - r7
            float r0 = r0 * r3
            goto L3e
        L3d:
            r0 = r2
        L3e:
            r5.setTranslationY(r0)
            android.widget.FrameLayout r5 = r4.host
            java.lang.String r0 = "zoom"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r0)
            if (r0 == 0) goto L54
            r0 = 1022739087(0x3cf5c28f, float:0.03)
            float r0 = r0 * r7
            r3 = 1064849900(0x3f7851ec, float:0.97)
            float r0 = r0 + r3
            goto L56
        L54:
            r0 = 1065353216(0x3f800000, float:1.0)
        L56:
            r5.setScaleX(r0)
            android.widget.FrameLayout r5 = r4.host
            float r0 = r5.getScaleX()
            r5.setScaleY(r0)
            java.lang.String r5 = "return"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r5)
            if (r5 == 0) goto L70
            r5 = 1069547520(0x3fc00000, float:1.5)
        L6c:
            float r1 = r1 - r7
            float r2 = r1 * r5
            goto L7b
        L70:
            java.lang.String r5 = "liquid"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r5)
            if (r5 == 0) goto L7b
            r5 = 1084227584(0x40a00000, float:5.0)
            goto L6c
        L7b:
            r4.blur(r2)
            return
    }

    private static final kotlin.Unit back$lambda$2(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r1) {
            r0 = 0
            r1.render(r0)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    private final void blur(float r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L3d
            android.widget.FrameLayout r0 = r4.host
            r1 = 1028443341(0x3d4ccccd, float:0.05)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 <= 0) goto L39
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r4.a
            java.lang.Float r2 = java.lang.Float.valueOf(r5)
            java.lang.Number r2 = (java.lang.Number) r2
            int r1 = r1.dp(r2)
            r2 = 1
            int r1 = kotlin.ranges.RangesKt.coerceAtLeast(r1, r2)
            float r1 = (float) r1
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r4.a
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r3.dp(r5)
            int r5 = kotlin.ranges.RangesKt.coerceAtLeast(r5, r2)
            float r5 = (float) r5
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.RenderEffect r5 = android.graphics.RenderEffect.createBlurEffect(r1, r5, r2)
            goto L3a
        L39:
            r5 = 0
        L3a:
            r0.setRenderEffect(r5)
        L3d:
            return
    }

    private final android.widget.FrameLayout bookmark(java.lang.String r8) {
            r7 = this;
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r7.a
            android.content.Context r1 = (android.content.Context) r1
            r0.<init>(r1)
            com.lumina.monsterhunterfieldbook.GlyphView r1 = new com.lumina.monsterhunterfieldbook.GlyphView
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r7.a
            r3 = r2
            android.content.Context r3 = (android.content.Context) r3
            boolean r2 = r2.isBookmarked(r8)
            if (r2 == 0) goto L1d
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r7.a
            int r2 = r2.getAccent()
            goto L23
        L1d:
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r7.a
            int r2 = r2.getMuted()
        L23:
            java.lang.String r4 = "bookmark"
            r1.<init>(r3, r4, r2)
            r2 = r1
            android.view.View r2 = (android.view.View) r2
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r7.a
            r5 = 21
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Number r6 = (java.lang.Number) r6
            int r4 = r4.dp(r6)
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r7.a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r6.dp(r5)
            r6 = 17
            r3.<init>(r4, r5, r6)
            android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
            r0.addView(r2, r3)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r7.a
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda18 r4 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda18
            r4.<init>(r7, r8, r1, r0)
            r2.touch(r3, r4)
            bookmark$sync(r7, r8, r1, r0)
            return r0
    }

    private static final kotlin.Unit bookmark$lambda$0(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r1, java.lang.String r2, com.lumina.monsterhunterfieldbook.GlyphView r3, android.widget.FrameLayout r4) {
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r1.a
            r0.toggleBookmark(r2)
            bookmark$sync(r1, r2, r3, r4)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    private static final void bookmark$sync(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r1, java.lang.String r2, com.lumina.monsterhunterfieldbook.GlyphView r3, android.widget.FrameLayout r4) {
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r1.a
            boolean r2 = r0.isBookmarked(r2)
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r1.a
            if (r2 == 0) goto Lf
            int r0 = r0.getAccent()
            goto L13
        Lf:
            int r0 = r0.getMuted()
        L13:
            r3.setColour(r0)
            r3.invalidate()
            if (r2 == 0) goto L1e
            java.lang.String r3 = "Remove saved entry"
            goto L20
        L1e:
            java.lang.String r3 = "Save entry"
        L20:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r4.setContentDescription(r3)
            r4.setSelected(r2)
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r1.a
            if (r2 == 0) goto L37
            int r3 = r1.getAccent()
            r0 = 20
            int r3 = com.lumina.monsterhunterfieldbook.FieldViewsKt.alphaColour(r3, r0)
            goto L38
        L37:
            r3 = 0
        L38:
            r0 = 1077936128(0x40400000, float:3.0)
            android.graphics.drawable.GradientDrawable r1 = r1.surface(r3, r2, r0)
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            r4.setBackground(r1)
            return
    }

    private final void buildHeading() {
            r15 = this;
            android.widget.LinearLayout r0 = r15.heading
            r0.removeAllViews()
            org.json.JSONObject r0 = r15.state
            java.lang.String r1 = "detail"
            boolean r0 = r0.optBoolean(r1)
            if (r0 == 0) goto L1a
            java.util.Map<java.lang.String, com.lumina.monsterhunterfieldbook.FieldRecord> r0 = r15.byId
            java.lang.String r1 = r15.renderedId
            java.lang.Object r0 = r0.get(r1)
            com.lumina.monsterhunterfieldbook.FieldRecord r0 = (com.lumina.monsterhunterfieldbook.FieldRecord) r0
            goto L1b
        L1a:
            r0 = 0
        L1b:
            r1 = 44
            if (r0 == 0) goto L86
            android.widget.LinearLayout r2 = r15.heading
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r15.a
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda8 r4 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda8
            r4.<init>(r15)
            java.lang.String r5 = "back"
            java.lang.String r6 = "Back to weapons"
            android.widget.FrameLayout r3 = r3.iconButton(r5, r6, r4)
            android.view.View r3 = (android.view.View) r3
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r15.a
            r6 = 32
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.Number r7 = (java.lang.Number) r7
            int r5 = r5.dp(r7)
            com.lumina.monsterhunterfieldbook.MainActivity r7 = r15.a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            java.lang.Number r8 = (java.lang.Number) r8
            int r7 = r7.dp(r8)
            r4.<init>(r5, r7)
            android.view.ViewGroup$LayoutParams r4 = (android.view.ViewGroup.LayoutParams) r4
            r2.addView(r3, r4)
            android.widget.LinearLayout r2 = r15.heading
            com.lumina.monsterhunterfieldbook.WeaponModel r3 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r15.a
            r5 = 29
            android.widget.ImageView r3 = r3.icon(r4, r0, r5)
            android.view.View r3 = (android.view.View) r3
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r7 = r15.a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r7.dp(r5)
            com.lumina.monsterhunterfieldbook.MainActivity r7 = r15.a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r7.dp(r6)
            r4.<init>(r5, r6)
            android.view.ViewGroup$LayoutParams r4 = (android.view.ViewGroup.LayoutParams) r4
            r2.addView(r3, r4)
        L86:
            android.widget.LinearLayout r2 = r15.heading
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r15.a
            if (r0 == 0) goto L92
            java.lang.String r4 = r0.getName()
            if (r4 != 0) goto L98
        L92:
            com.lumina.monsterhunterfieldbook.FieldRecord r4 = r15.guide
            java.lang.String r4 = r4.getName()
        L98:
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r15.a
            boolean r5 = r5.getWide()
            if (r5 == 0) goto La3
            r5 = 1102053376(0x41b00000, float:22.0)
            goto La5
        La3:
            r5 = 1101004800(0x41a00000, float:20.0)
        La5:
            r8 = 8
            r9 = 0
            r6 = 1
            r7 = 0
            android.widget.TextView r3 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r3, r4, r5, r6, r7, r8, r9)
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r15.a
            r5 = 0
            if (r0 != 0) goto Lb5
            r6 = r5
            goto Lb7
        Lb5:
            r6 = 10
        Lb7:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            int r4 = r4.dp(r6)
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r15.a
            r7 = 8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Number r7 = (java.lang.Number) r7
            int r6 = r6.dp(r7)
            r3.setPadding(r4, r5, r6, r5)
            android.view.View r3 = (android.view.View) r3
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = -2
            r4.<init>(r5, r7, r6)
            android.view.ViewGroup$LayoutParams r4 = (android.view.ViewGroup.LayoutParams) r4
            r2.addView(r3, r4)
            if (r0 == 0) goto L11d
            android.widget.LinearLayout r2 = r15.heading
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r15.a
            com.lumina.monsterhunterfieldbook.WeaponModel r3 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            org.json.JSONObject r0 = r3.data(r0)
            java.lang.String r3 = "rarity"
            int r0 = r0.optInt(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Rarity "
            r3.<init>(r4)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r9 = r0.toString()
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r15.a
            int r12 = r0.getMuted()
            r13 = 4
            r14 = 0
            r10 = 1092616192(0x41200000, float:10.0)
            r11 = 0
            android.widget.TextView r0 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r8, r9, r10, r11, r12, r13, r14)
            android.view.View r0 = (android.view.View) r0
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r7, r7)
            android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
            r2.addView(r0, r3)
        L11d:
            android.widget.LinearLayout r0 = r15.heading
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r15.a
            com.lumina.monsterhunterfieldbook.FieldRecord r3 = r15.guide
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Close "
            r4.<init>(r5)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            kotlin.jvm.functions.Function0<kotlin.Unit> r4 = r15.close
            java.lang.String r5 = "close"
            android.widget.FrameLayout r2 = r2.iconButton(r5, r3, r4)
            android.view.View r2 = (android.view.View) r2
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r15.a
            r5 = 42
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r4 = r4.dp(r5)
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r15.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r5.dp(r1)
            r3.<init>(r4, r1)
            android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
            r0.addView(r2, r3)
            return
    }

    private static final kotlin.Unit buildHeading$lambda$0(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0) {
            r0.back()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    private final void buildTabs() {
            r13 = this;
            android.widget.LinearLayout r0 = r13.tabs
            r0.removeAllViews()
            r0 = 3
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            java.lang.String r1 = "guide"
            java.lang.String r2 = "Guide"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r1, r2)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "database"
            java.lang.String r3 = "Database"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r1, r3)
            r3 = 1
            r0[r3] = r1
            java.lang.String r1 = "tree"
            java.lang.String r4 = "Family Tree"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r1, r4)
            r4 = 2
            r0[r4] = r1
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L33:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L15f
            java.lang.Object r1 = r0.next()
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r5 = r1.component1()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r1 = r1.component2()
            java.lang.String r1 = (java.lang.String) r1
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r13.a
            android.widget.LinearLayout r6 = r6.column()
            org.json.JSONObject r7 = r13.state
            java.lang.String r8 = "tab"
            java.lang.String r7 = r7.optString(r8)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r5)
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r13.a
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda7 r9 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda7
            r9.<init>(r13, r5)
            android.widget.TextView r5 = r8.button(r1, r9)
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r13.a
            if (r7 == 0) goto L71
            int r8 = r8.getAccent()
            goto L75
        L71:
            int r8 = r8.getMuted()
        L75:
            r5.setTextColor(r8)
            android.graphics.drawable.ColorDrawable r8 = new android.graphics.drawable.ColorDrawable
            r8.<init>(r2)
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            r5.setBackground(r8)
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r13.a
            com.lumina.monsterhunterfieldbook.NativePrefs r8 = r8.getPrefs()
            java.lang.String r9 = "font"
            r10 = 100
            int r8 = r8.number(r9, r10)
            float r8 = (float) r8
            r9 = 1095761920(0x41500000, float:13.0)
            float r8 = r8 * r9
            r9 = 1120403456(0x42c80000, float:100.0)
            float r8 = r8 / r9
            r5.setTextSize(r8)
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r13.a
            r9 = 6
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            java.lang.Number r10 = (java.lang.Number) r10
            int r8 = r8.dp(r10)
            com.lumina.monsterhunterfieldbook.MainActivity r10 = r13.a
            r11 = 10
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            java.lang.Number r12 = (java.lang.Number) r12
            int r10 = r10.dp(r12)
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r13.a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r12.dp(r9)
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r13.a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r12.dp(r11)
            r5.setPadding(r8, r10, r9, r11)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.StringBuilder r1 = r8.append(r1)
            java.lang.String r8 = " tab"
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r1 = r1.toString()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r5.setContentDescription(r1)
            r5.setSelected(r7)
            android.view.View r5 = (android.view.View) r5
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r13.a
            r9 = 48
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Number r9 = (java.lang.Number) r9
            int r8 = r8.dp(r9)
            r9 = -1
            r1.<init>(r9, r8)
            android.view.ViewGroup$LayoutParams r1 = (android.view.ViewGroup.LayoutParams) r1
            r6.addView(r5, r1)
            android.view.View r1 = new android.view.View
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r13.a
            android.content.Context r5 = (android.content.Context) r5
            r1.<init>(r5)
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r13.a
            if (r7 == 0) goto L118
            int r5 = r5.getAccent()
            goto L11c
        L118:
            int r5 = r5.getLine()
        L11c:
            r1.setBackgroundColor(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r13.a
            if (r7 == 0) goto L127
            r7 = r4
            goto L128
        L127:
            r7 = r3
        L128:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r8.dp(r7)
            r5.<init>(r9, r7)
            android.view.ViewGroup$LayoutParams r5 = (android.view.ViewGroup.LayoutParams) r5
            r6.addView(r1, r5)
            android.widget.LinearLayout r1 = r13.tabs
            android.view.View r6 = (android.view.View) r6
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r7 = -2
            r8 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r2, r7, r8)
            com.lumina.monsterhunterfieldbook.MainActivity r7 = r13.a
            r8 = 8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Number r8 = (java.lang.Number) r8
            int r7 = r7.dp(r8)
            r5.rightMargin = r7
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            android.view.ViewGroup$LayoutParams r5 = (android.view.ViewGroup.LayoutParams) r5
            r1.addView(r6, r5)
            goto L33
        L15f:
            return
    }

    private static final kotlin.Unit buildTabs$lambda$0$0(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r2, java.lang.String r3) {
            org.json.JSONObject r0 = r2.state
            java.lang.String r1 = "tab"
            java.lang.String r0 = r0.optString(r1)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r0 != 0) goto L25
            r2.capture()
            org.json.JSONObject r0 = r2.state
            r0.put(r1, r3)
            r2.hideKeyboard()
            r2.buildTabs()
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda11 r3 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda11
            r3.<init>(r2)
            r0 = 0
            r2.transitionContent(r0, r3)
        L25:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    private static final kotlin.Unit buildTabs$lambda$0$0$0(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r1) {
            r0 = 0
            r1.render(r0)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    private final void capture() {
            r5 = this;
            android.widget.ListView r0 = r5.list
            if (r0 == 0) goto L21
            org.json.JSONObject r1 = r5.state
            java.lang.String r2 = "listPosition"
            int r3 = r0.getFirstVisiblePosition()
            r1.put(r2, r3)
            org.json.JSONObject r1 = r5.state
            r2 = 0
            android.view.View r0 = r0.getChildAt(r2)
            if (r0 == 0) goto L1c
            int r2 = r0.getTop()
        L1c:
            java.lang.String r0 = "listTop"
            r1.put(r0, r2)
        L21:
            android.widget.ScrollView r0 = r5.scroll
            if (r0 == 0) goto L4c
            org.json.JSONObject r1 = r5.state
            java.lang.String r2 = r5.renderedTab
            java.lang.String r3 = "guide"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 == 0) goto L34
            java.lang.String r2 = "guideScroll"
            goto L45
        L34:
            java.lang.String r2 = r5.renderedId
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "detailScroll:"
            r3.<init>(r4)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
        L45:
            int r0 = r0.getScrollY()
            r1.put(r2, r0)
        L4c:
            com.lumina.monsterhunterfieldbook.WeaponTreePanel r0 = r5.treePanel
            if (r0 == 0) goto L53
            r0.snapshot()
        L53:
            return
    }

    private final void checkpoint() {
            r2 = this;
            r2.capture()
            org.json.JSONObject r0 = new org.json.JSONObject
            org.json.JSONObject r1 = r2.state
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.String r1 = "_trail"
            r0.remove(r1)
            org.json.JSONArray r1 = r2.trail()
            r1.put(r0)
            return
    }

    private final void choices(android.widget.GridLayout r9, java.lang.String r10, java.lang.String r11, java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> r12) {
            r8 = this;
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r8.a
            android.widget.LinearLayout r0 = r0.column()
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r8.a
            int r5 = r1.getMuted()
            r6 = 4
            r7 = 0
            r3 = 1093664768(0x41300000, float:11.0)
            r4 = 0
            r2 = r10
            android.widget.TextView r10 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r1, r2, r3, r4, r5, r6, r7)
            android.view.View r10 = (android.view.View) r10
            r0.addView(r10)
            android.widget.Spinner r10 = new android.widget.Spinner
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r8.a
            android.content.Context r1 = (android.content.Context) r1
            r10.<init>(r1)
            r1 = r2
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r10.setContentDescription(r1)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r8.a
            int r3 = r2.getBg()
            r6 = 6
            r5 = 0
            android.graphics.drawable.GradientDrawable r1 = com.lumina.monsterhunterfieldbook.MainActivity.surface$default(r2, r3, r4, r5, r6, r7)
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            r10.setBackground(r1)
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r8.a
            r2 = r12
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r4)
            r3.<init>(r4)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r2 = r2.iterator()
        L51:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L67
            java.lang.Object r4 = r2.next()
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r4 = r4.getSecond()
            java.lang.String r4 = (java.lang.String) r4
            r3.add(r4)
            goto L51
        L67:
            java.util.List r3 = (java.util.List) r3
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$choices$textAdapter$1 r2 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$choices$textAdapter$1
            r2.<init>(r8, r1, r3)
            r1 = 17367049(0x1090009, float:2.516295E-38)
            r2.setDropDownViewResource(r1)
            android.widget.SpinnerAdapter r2 = (android.widget.SpinnerAdapter) r2
            r10.setAdapter(r2)
            java.util.Iterator r1 = r12.iterator()
            r2 = 0
            r3 = r2
        L7f:
            boolean r4 = r1.hasNext()
            r5 = -1
            if (r4 == 0) goto La2
            java.lang.Object r4 = r1.next()
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r4 = r4.getFirst()
            org.json.JSONObject r6 = r8.state
            java.lang.String r7 = "all"
            java.lang.String r6 = r6.optString(r11, r7)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r6)
            if (r4 == 0) goto L9f
            goto La3
        L9f:
            int r3 = r3 + 1
            goto L7f
        La2:
            r3 = r5
        La3:
            int r1 = kotlin.ranges.RangesKt.coerceAtLeast(r3, r2)
            r10.setSelection(r1)
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef
            r3.<init>()
            java.lang.Object r1 = r12.get(r1)
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r1 = r1.getFirst()
            r3.element = r1
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$choices$1 r1 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$choices$1
            r1.<init>(r12, r3, r8, r11)
            android.widget.AdapterView$OnItemSelectedListener r1 = (android.widget.AdapterView.OnItemSelectedListener) r1
            r10.setOnItemSelectedListener(r1)
            android.view.View r10 = (android.view.View) r10
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r8.a
            r1 = 44
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r12 = r12.dp(r1)
            r11.<init>(r5, r12)
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r8.a
            r1 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r12 = r12.dp(r1)
            r11.topMargin = r12
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            android.view.ViewGroup$LayoutParams r11 = (android.view.ViewGroup.LayoutParams) r11
            r0.addView(r10, r11)
            int r10 = r9.getChildCount()
            android.view.View r0 = (android.view.View) r0
            android.widget.GridLayout$LayoutParams r11 = new android.widget.GridLayout$LayoutParams
            r11.<init>()
            r11.width = r2
            int r12 = r9.getColumnCount()
            int r12 = r10 % r12
            r1 = 1065353216(0x3f800000, float:1.0)
            android.widget.GridLayout$Spec r12 = android.widget.GridLayout.spec(r12, r1)
            r11.columnSpec = r12
            int r12 = r9.getColumnCount()
            int r12 = r10 / r12
            android.widget.GridLayout$Spec r12 = android.widget.GridLayout.spec(r12)
            r11.rowSpec = r12
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r8.a
            int r1 = r9.getColumnCount()
            int r10 = r10 % r1
            int r1 = r9.getColumnCount()
            int r1 = r1 + (-1)
            if (r10 != r1) goto L128
            goto L12a
        L128:
            r2 = 12
        L12a:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r12.dp(r10)
            r11.rightMargin = r10
            com.lumina.monsterhunterfieldbook.MainActivity r10 = r8.a
            r12 = 15
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Number r12 = (java.lang.Number) r12
            int r10 = r10.dp(r12)
            r11.bottomMargin = r10
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            android.view.ViewGroup$LayoutParams r11 = (android.view.ViewGroup.LayoutParams) r11
            r9.addView(r0, r11)
            return
    }

    private final kotlin.Pair<android.widget.ScrollView, android.widget.LinearLayout> contentScroll() {
            r8 = this;
            android.widget.ScrollView r0 = new android.widget.ScrollView
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r8.a
            android.content.Context r1 = (android.content.Context) r1
            r0.<init>(r1)
            r1 = 1
            r0.setFillViewport(r1)
            r1 = 0
            r0.setClipToPadding(r1)
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r8.a
            android.widget.LinearLayout r1 = r1.column()
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r8.a
            boolean r3 = r2.getWide()
            r4 = 24
            r5 = 18
            if (r3 == 0) goto L25
            r3 = r4
            goto L26
        L25:
            r3 = r5
        L26:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r2 = r2.dp(r3)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r8.a
            r6 = 16
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            int r3 = r3.dp(r6)
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r8.a
            boolean r7 = r6.getWide()
            if (r7 == 0) goto L47
            goto L48
        L47:
            r4 = r5
        L48:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r6.dp(r4)
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r8.a
            r6 = 28
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            int r5 = r5.dp(r6)
            r1.setPadding(r2, r3, r4, r5)
            r2 = r1
            android.view.View r2 = (android.view.View) r2
            r0.addView(r2)
            android.widget.FrameLayout r2 = r8.host
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r5 = -1
            r4.<init>(r5, r5)
            android.view.ViewGroup$LayoutParams r4 = (android.view.ViewGroup.LayoutParams) r4
            r2.addView(r3, r4)
            r8.scroll = r0
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            return r0
    }

    private final java.lang.String filterLabel() {
            r5 = this;
            r0 = 4
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "rank"
            r2 = 0
            r0[r2] = r1
            r1 = 1
            java.lang.String r3 = "rarity"
            r0[r1] = r3
            r1 = 2
            java.lang.String r3 = "element"
            r0[r1] = r3
            r1 = 3
            java.lang.String r3 = "obtain"
            r0[r1] = r3
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L2b
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L2b
            goto L51
        L2b:
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L51
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            org.json.JSONObject r3 = r5.state
            java.lang.String r4 = "all"
            java.lang.String r1 = r3.optString(r1, r4)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L2f
            int r2 = r2 + 1
            if (r2 >= 0) goto L2f
            kotlin.collections.CollectionsKt.throwCountOverflow()
            goto L2f
        L51:
            if (r2 <= 0) goto L63
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "  "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            goto L65
        L63:
            java.lang.String r0 = ""
        L65:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Filters"
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private final void hideKeyboard() {
            r3 = this;
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r3.a
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            boolean r1 = r0 instanceof android.view.inputmethod.InputMethodManager
            if (r1 == 0) goto Lf
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L1a
            android.os.IBinder r1 = r3.getWindowToken()
            r2 = 0
            r0.hideSoftInputFromWindow(r1, r2)
        L1a:
            return
    }

    private final void loops(android.widget.LinearLayout r26, org.json.JSONArray r27) {
            r25 = this;
            r0 = r25
            r1 = r27
            if (r1 != 0) goto L8
            goto L158
        L8:
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.screenWidthDp
            r3 = 780(0x30c, float:1.093E-42)
            if (r2 <= r3) goto L1a
            r2 = 4
            goto L1b
        L1a:
            r2 = 2
        L1b:
            int r3 = r1.length()
            r4 = 0
            r5 = 0
            r6 = r4
        L22:
            if (r6 >= r3) goto L158
            int r7 = r6 % r2
            r8 = 8
            r9 = -2
            if (r7 != 0) goto L57
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r0.a
            android.widget.LinearLayout r5 = r5.row()
            r10 = 48
            r5.setGravity(r10)
            r10 = r5
            android.view.View r10 = (android.view.View) r10
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r12 = -1
            r11.<init>(r12, r9)
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r0.a
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            java.lang.Number r13 = (java.lang.Number) r13
            int r12 = r12.dp(r13)
            r11.bottomMargin = r12
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            android.view.ViewGroup$LayoutParams r11 = (android.view.ViewGroup.LayoutParams) r11
            r12 = r26
            r12.addView(r10, r11)
            goto L59
        L57:
            r12 = r26
        L59:
            com.lumina.monsterhunterfieldbook.MainActivity r10 = r0.a
            android.widget.LinearLayout r10 = r10.column()
            com.lumina.monsterhunterfieldbook.MainActivity r13 = r0.a
            r17 = 7
            r18 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            android.graphics.drawable.GradientDrawable r11 = com.lumina.monsterhunterfieldbook.MainActivity.surface$default(r13, r14, r15, r16, r17, r18)
            android.graphics.drawable.Drawable r11 = (android.graphics.drawable.Drawable) r11
            r10.setBackground(r11)
            com.lumina.monsterhunterfieldbook.MainActivity r11 = r0.a
            r13 = 14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            java.lang.Number r14 = (java.lang.Number) r14
            int r11 = r11.dp(r14)
            com.lumina.monsterhunterfieldbook.MainActivity r14 = r0.a
            r15 = 12
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.lang.Number r15 = (java.lang.Number) r15
            int r14 = r14.dp(r15)
            com.lumina.monsterhunterfieldbook.MainActivity r15 = r0.a
            java.lang.Integer r16 = java.lang.Integer.valueOf(r13)
            r17 = r8
            r8 = r16
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r15.dp(r8)
            com.lumina.monsterhunterfieldbook.MainActivity r15 = r0.a
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r15.dp(r13)
            r10.setPadding(r11, r14, r8, r13)
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r0.a
            kotlin.jvm.internal.StringCompanionObject r11 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            java.util.Locale r11 = java.util.Locale.US
            int r13 = r6 + 1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r14 = new java.lang.Object[]{r14}
            r15 = 1
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r15)
            r16 = r15
            java.lang.String r15 = "%02d"
            java.lang.String r11 = java.lang.String.format(r11, r15, r14)
            java.lang.String r14 = "format(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r14)
            com.lumina.monsterhunterfieldbook.MainActivity r14 = r0.a
            int r22 = r14.getAccent()
            r23 = 4
            r24 = 0
            r20 = 1092616192(0x41200000, float:10.0)
            r21 = 0
            r18 = r8
            r19 = r11
            android.widget.TextView r8 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r18, r19, r20, r21, r22, r23, r24)
            android.view.View r8 = (android.view.View) r8
            r10.addView(r8)
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r0.a
            r11 = 5
            r8.gap(r10, r11)
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r0.a
            java.lang.String r11 = r1.optString(r6)
            java.lang.String r14 = "optString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r14)
            r23 = 12
            r20 = 1094713344(0x41400000, float:12.0)
            r22 = 0
            r18 = r8
            r19 = r11
            android.widget.TextView r8 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r18, r19, r20, r21, r22, r23, r24)
            android.view.View r8 = (android.view.View) r8
            r10.addView(r8)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            android.view.View r10 = (android.view.View) r10
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r11 = 1065353216(0x3f800000, float:1.0)
            r8.<init>(r4, r9, r11)
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r0.a
            java.lang.Integer r14 = java.lang.Integer.valueOf(r17)
            java.lang.Number r14 = (java.lang.Number) r14
            int r9 = r9.dp(r14)
            r8.rightMargin = r9
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            android.view.ViewGroup$LayoutParams r8 = (android.view.ViewGroup.LayoutParams) r8
            r5.addView(r10, r8)
            int r8 = r1.length()
            int r8 = r8 + (-1)
            if (r6 != r8) goto L155
            int r6 = r2 + (-1)
            int r6 = r6 - r7
            r7 = r4
        L13b:
            if (r7 >= r6) goto L155
            android.view.View r8 = new android.view.View
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r0.a
            android.content.Context r9 = (android.content.Context) r9
            r8.<init>(r9)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r10 = r16
            r9.<init>(r4, r10, r11)
            android.view.ViewGroup$LayoutParams r9 = (android.view.ViewGroup.LayoutParams) r9
            r5.addView(r8, r9)
            int r7 = r7 + 1
            goto L13b
        L155:
            r6 = r13
            goto L22
        L158:
            return
    }

    private final void render(boolean r7) {
            r6 = this;
            android.os.Handler r0 = r6.handler
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            r6.pending = r1
            r6.scroll = r1
            r6.list = r1
            r6.treePanel = r1
            r6.more = r1
            r6.meta = r1
            r6.filterPanel = r1
            r6.filterToggle = r1
            org.json.JSONObject r0 = r6.state
            java.lang.String r1 = "tab"
            java.lang.String r2 = "guide"
            java.lang.String r0 = r0.optString(r1, r2)
            java.lang.String r1 = "optString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r6.renderedTab = r0
            java.lang.String r2 = "database"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            r3 = 0
            if (r0 == 0) goto L3c
            org.json.JSONObject r0 = r6.state
            java.lang.String r4 = "detail"
            boolean r0 = r0.optBoolean(r4)
            if (r0 == 0) goto L3c
            r0 = 1
            goto L3d
        L3c:
            r0 = r3
        L3d:
            r6.renderedDetail = r0
            org.json.JSONObject r0 = r6.state
            java.lang.String r4 = "selected"
            java.lang.String r0 = r0.optString(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r6.renderedId = r0
            r6.buildHeading()
            r6.buildTabs()
            android.widget.FrameLayout r0 = r6.host
            r0.removeAllViews()
            java.util.List<com.lumina.monsterhunterfieldbook.ReadingGroup> r0 = r6.groups
            r0.clear()
            java.lang.String r0 = r6.renderedTab
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r1 == 0) goto L70
            boolean r0 = r6.renderedDetail
            if (r0 == 0) goto L6c
            r6.renderDetails()
            goto L9d
        L6c:
            r6.renderDatabase()
            goto L9d
        L70:
            java.lang.String r1 = "tree"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L9a
            com.lumina.monsterhunterfieldbook.WeaponTreePanel r0 = new com.lumina.monsterhunterfieldbook.WeaponTreePanel
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r6.a
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r2 = r6.records
            org.json.JSONObject r4 = r6.state
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda21 r5 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda21
            r5.<init>(r6)
            r0.<init>(r1, r2, r4, r5)
            r6.treePanel = r0
            android.widget.FrameLayout r1 = r6.host
            android.view.View r0 = (android.view.View) r0
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r4 = -1
            r2.<init>(r4, r4)
            android.view.ViewGroup$LayoutParams r2 = (android.view.ViewGroup.LayoutParams) r2
            r1.addView(r0, r2)
            goto L9d
        L9a:
            r6.renderGuide()
        L9d:
            if (r7 == 0) goto La4
            r0 = 190(0xbe, double:9.4E-322)
            r6.arrival(r0, r3)
        La4:
            return
    }

    static /* synthetic */ void render$default(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0, boolean r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            r0.render(r1)
            return
    }

    private static final kotlin.Unit render$lambda$0(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r1, java.lang.String r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.showTreeInfo(r2)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    private final void renderDatabase() {
            r31 = this;
            r0 = r31
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r0.a
            android.widget.LinearLayout r1 = r1.column()
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            r3 = 12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = r3
            java.lang.Number r4 = (java.lang.Number) r4
            int r2 = r2.dp(r4)
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            r5 = 14
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r7 = r6
            java.lang.Number r7 = (java.lang.Number) r7
            int r4 = r4.dp(r7)
            com.lumina.monsterhunterfieldbook.MainActivity r7 = r0.a
            r8 = r3
            java.lang.Number r8 = (java.lang.Number) r8
            int r7 = r7.dp(r8)
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r0.a
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r8.dp(r3)
            r1.setPadding(r2, r4, r7, r3)
            android.widget.FrameLayout r2 = r0.host
            r3 = r1
            android.view.View r3 = (android.view.View) r3
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r7 = -1
            r4.<init>(r7, r7)
            android.view.ViewGroup$LayoutParams r4 = (android.view.ViewGroup.LayoutParams) r4
            r2.addView(r3, r4)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            android.widget.LinearLayout r2 = r2.row()
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            r4 = 10
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r9 = r8
            java.lang.Number r9 = (java.lang.Number) r9
            int r3 = r3.dp(r9)
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r0.a
            r10 = 9
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11 = r10
            java.lang.Number r11 = (java.lang.Number) r11
            int r9 = r9.dp(r11)
            com.lumina.monsterhunterfieldbook.MainActivity r11 = r0.a
            r12 = r8
            java.lang.Number r12 = (java.lang.Number) r12
            int r11 = r11.dp(r12)
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r0.a
            r13 = r10
            java.lang.Number r13 = (java.lang.Number) r13
            int r12 = r12.dp(r13)
            r2.setPadding(r3, r9, r11, r12)
            com.lumina.monsterhunterfieldbook.MainActivity r13 = r0.a
            r17 = 7
            r18 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            android.graphics.drawable.GradientDrawable r3 = com.lumina.monsterhunterfieldbook.MainActivity.surface$default(r13, r14, r15, r16, r17, r18)
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
            r2.setBackground(r3)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            android.widget.LinearLayout r3 = r3.row()
            com.lumina.monsterhunterfieldbook.MainActivity r11 = r0.a
            int r12 = r11.getBg()
            r15 = 6
            r16 = 0
            r13 = 0
            r14 = 0
            android.graphics.drawable.GradientDrawable r9 = com.lumina.monsterhunterfieldbook.MainActivity.surface$default(r11, r12, r13, r14, r15, r16)
            android.graphics.drawable.Drawable r9 = (android.graphics.drawable.Drawable) r9
            r3.setBackground(r9)
            com.lumina.monsterhunterfieldbook.GlyphView r9 = new com.lumina.monsterhunterfieldbook.GlyphView
            com.lumina.monsterhunterfieldbook.MainActivity r11 = r0.a
            r12 = r11
            android.content.Context r12 = (android.content.Context) r12
            java.lang.String r13 = "search"
            int r11 = r11.getMuted()
            r9.<init>(r12, r13, r11)
            android.view.View r9 = (android.view.View) r9
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r0.a
            r13 = 18
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14 = r13
            java.lang.Number r14 = (java.lang.Number) r14
            int r12 = r12.dp(r14)
            com.lumina.monsterhunterfieldbook.MainActivity r14 = r0.a
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r14.dp(r13)
            r11.<init>(r12, r13)
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r0.a
            r13 = r8
            java.lang.Number r13 = (java.lang.Number) r13
            int r12 = r12.dp(r13)
            r11.leftMargin = r12
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            android.view.ViewGroup$LayoutParams r11 = (android.view.ViewGroup.LayoutParams) r11
            r3.addView(r9, r11)
            android.widget.EditText r9 = new android.widget.EditText
            com.lumina.monsterhunterfieldbook.MainActivity r11 = r0.a
            android.content.Context r11 = (android.content.Context) r11
            r9.<init>(r11)
            java.lang.String r11 = "Search"
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            r9.setHint(r11)
            r11 = 1
            r9.setSingleLine(r11)
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r0.a
            int r12 = r12.getInk()
            r9.setTextColor(r12)
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r0.a
            int r12 = r12.getMuted()
            r9.setHintTextColor(r12)
            com.lumina.monsterhunterfieldbook.MainActivity r13 = r0.a
            r18 = 14
            r19 = 0
            java.lang.String r14 = ""
            r15 = 0
            r16 = 0
            r17 = 0
            android.widget.TextView r12 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r13, r14, r15, r16, r17, r18, r19)
            android.graphics.Typeface r12 = r12.getTypeface()
            r9.setTypeface(r12)
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r0.a
            com.lumina.monsterhunterfieldbook.NativePrefs r12 = r12.getPrefs()
            java.lang.String r13 = "font"
            r14 = 100
            int r12 = r12.number(r13, r14)
            float r12 = (float) r12
            r13 = 1096810496(0x41600000, float:14.0)
            float r12 = r12 * r13
            r13 = 1120403456(0x42c80000, float:100.0)
            float r12 = r12 / r13
            r9.setTextSize(r12)
            org.json.JSONObject r12 = r0.state
            java.lang.String r13 = "q"
            java.lang.String r12 = r12.optString(r13)
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r9.setText(r12)
            android.graphics.drawable.ColorDrawable r12 = new android.graphics.drawable.ColorDrawable
            r13 = 0
            r12.<init>(r13)
            android.graphics.drawable.Drawable r12 = (android.graphics.drawable.Drawable) r12
            r9.setBackground(r12)
            java.lang.String r12 = "Search this weapon database"
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r9.setContentDescription(r12)
            r12 = 3
            r9.setImeOptions(r12)
            com.lumina.monsterhunterfieldbook.MainActivity r14 = r0.a
            r15 = r8
            java.lang.Number r15 = (java.lang.Number) r15
            int r14 = r14.dp(r15)
            com.lumina.monsterhunterfieldbook.MainActivity r15 = r0.a
            r16 = 8
            java.lang.Integer r17 = java.lang.Integer.valueOf(r16)
            r18 = r12
            r12 = r17
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r15.dp(r12)
            com.lumina.monsterhunterfieldbook.MainActivity r15 = r0.a
            r19 = r11
            r11 = 4
            java.lang.Integer r20 = java.lang.Integer.valueOf(r11)
            r4 = r20
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r15.dp(r4)
            com.lumina.monsterhunterfieldbook.MainActivity r15 = r0.a
            r11 = r17
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r15.dp(r11)
            r9.setPadding(r14, r12, r4, r11)
            r4 = r9
            android.view.View r4 = (android.view.View) r4
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r0.a
            r14 = 44
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r15 = r14
            java.lang.Number r15 = (java.lang.Number) r15
            int r12 = r12.dp(r15)
            r15 = 1065353216(0x3f800000, float:1.0)
            r11.<init>(r13, r12, r15)
            android.view.ViewGroup$LayoutParams r11 = (android.view.ViewGroup.LayoutParams) r11
            r3.addView(r4, r11)
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda24 r11 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda24
            r11.<init>(r9)
            java.lang.String r12 = "close"
            java.lang.String r7 = "Clear search"
            android.widget.FrameLayout r4 = r4.iconButton(r12, r7, r11)
            android.text.Editable r7 = r9.getText()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            if (r7 == 0) goto L1e0
            int r7 = r7.length()
            if (r7 != 0) goto L1de
            goto L1e0
        L1de:
            r7 = r13
            goto L1e2
        L1e0:
            r7 = r16
        L1e2:
            r4.setVisibility(r7)
            r7 = r4
            android.view.View r7 = (android.view.View) r7
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r0.a
            r21 = 35
            java.lang.Integer r21 = java.lang.Integer.valueOf(r21)
            r5 = r21
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r12.dp(r5)
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r0.a
            r21 = 42
            java.lang.Integer r21 = java.lang.Integer.valueOf(r21)
            r13 = r21
            java.lang.Number r13 = (java.lang.Number) r13
            int r12 = r12.dp(r13)
            r11.<init>(r5, r12)
            android.view.ViewGroup$LayoutParams r11 = (android.view.ViewGroup.LayoutParams) r11
            r3.addView(r7, r11)
            android.view.View r3 = (android.view.View) r3
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r7 = -2
            r11 = 0
            r5.<init>(r11, r7, r15)
            android.view.ViewGroup$LayoutParams r5 = (android.view.ViewGroup.LayoutParams) r5
            r2.addView(r3, r5)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            java.lang.String r5 = r0.filterLabel()
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda1 r11 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda1
            r11.<init>(r0)
            android.widget.TextView r3 = r3.button(r5, r11)
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r0.a
            r11 = r10
            java.lang.Number r11 = (java.lang.Number) r11
            int r5 = r5.dp(r11)
            com.lumina.monsterhunterfieldbook.MainActivity r11 = r0.a
            r12 = 7
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            java.lang.Number r13 = (java.lang.Number) r13
            int r11 = r11.dp(r13)
            com.lumina.monsterhunterfieldbook.MainActivity r13 = r0.a
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r13.dp(r10)
            com.lumina.monsterhunterfieldbook.MainActivity r13 = r0.a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r13.dp(r12)
            r3.setPadding(r5, r11, r10, r12)
            org.json.JSONObject r5 = r0.state
            java.lang.String r10 = "filtersOpen"
            boolean r5 = r5.optBoolean(r10)
            if (r5 == 0) goto L269
            java.lang.String r5 = "expanded"
            goto L26b
        L269:
            java.lang.String r5 = "collapsed"
        L26b:
            java.lang.String r11 = "Filters, "
            java.lang.String r5 = r11.concat(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r3.setContentDescription(r5)
            r0.filterToggle = r3
            android.view.View r3 = (android.view.View) r3
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r11 = r0.a
            java.lang.Number r14 = (java.lang.Number) r14
            int r11 = r11.dp(r14)
            r5.<init>(r7, r11)
            com.lumina.monsterhunterfieldbook.MainActivity r11 = r0.a
            r12 = r17
            java.lang.Number r12 = (java.lang.Number) r12
            int r11 = r11.dp(r12)
            r5.leftMargin = r11
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            android.view.ViewGroup$LayoutParams r5 = (android.view.ViewGroup.LayoutParams) r5
            r2.addView(r3, r5)
            android.view.View r2 = (android.view.View) r2
            r1.addView(r2)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$renderDatabase$filterScroll$1 r3 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$renderDatabase$filterScroll$1
            r3.<init>(r0, r2)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            android.widget.LinearLayout r2 = r2.column()
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r0.a
            r28 = 7
            r29 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r24 = r5
            android.graphics.drawable.GradientDrawable r5 = com.lumina.monsterhunterfieldbook.MainActivity.surface$default(r24, r25, r26, r27, r28, r29)
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
            r2.setBackground(r5)
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r0.a
            r11 = r2
            android.view.View r11 = (android.view.View) r11
            r12 = 14
            r5.pad(r11, r12)
            r3.addView(r11)
            org.json.JSONObject r5 = r0.state
            boolean r5 = r5.optBoolean(r10)
            if (r5 == 0) goto L2da
            r5 = 0
            goto L2dc
        L2da:
            r5 = r16
        L2dc:
            r3.setVisibility(r5)
            android.view.View r3 = (android.view.View) r3
            r0.filterPanel = r3
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r10 = -1
            r5.<init>(r10, r7)
            android.view.ViewGroup$LayoutParams r5 = (android.view.ViewGroup.LayoutParams) r5
            r1.addView(r3, r5)
            android.widget.GridLayout r3 = new android.widget.GridLayout
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r0.a
            android.content.Context r5 = (android.content.Context) r5
            r3.<init>(r5)
            android.content.res.Resources r5 = r3.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            int r5 = r5.screenWidthDp
            r10 = 780(0x30c, float:1.093E-42)
            r11 = 2
            if (r5 <= r10) goto L308
            r5 = 4
            goto L309
        L308:
            r5 = r11
        L309:
            r3.setColumnCount(r5)
            r5 = r3
            android.view.View r5 = (android.view.View) r5
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r12 = -1
            r10.<init>(r12, r7)
            android.view.ViewGroup$LayoutParams r10 = (android.view.ViewGroup.LayoutParams) r10
            r2.addView(r5, r10)
            r5 = 4
            kotlin.Pair[] r7 = new kotlin.Pair[r5]
            java.lang.String r5 = "all"
            java.lang.String r10 = "All"
            kotlin.Pair r12 = kotlin.TuplesKt.to(r5, r10)
            r23 = 0
            r7[r23] = r12
            java.lang.String r12 = "LR"
            java.lang.String r13 = "Low Rank"
            kotlin.Pair r12 = kotlin.TuplesKt.to(r12, r13)
            r7[r19] = r12
            java.lang.String r12 = "HR"
            java.lang.String r13 = "High Rank"
            kotlin.Pair r12 = kotlin.TuplesKt.to(r12, r13)
            r7[r11] = r12
            java.lang.String r12 = "MR"
            java.lang.String r13 = "Master Rank"
            kotlin.Pair r12 = kotlin.TuplesKt.to(r12, r13)
            r7[r18] = r12
            java.util.List r7 = kotlin.collections.CollectionsKt.listOf(r7)
            java.lang.String r12 = "Rank"
            java.lang.String r13 = "rank"
            r0.choices(r3, r12, r13, r7)
            kotlin.Pair r7 = kotlin.TuplesKt.to(r5, r10)
            java.util.List r7 = kotlin.collections.CollectionsKt.listOf(r7)
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r12 = r0.records
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r13 = new java.util.ArrayList
            r14 = 10
            int r15 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r12, r14)
            r13.<init>(r15)
            java.util.Collection r13 = (java.util.Collection) r13
            java.util.Iterator r12 = r12.iterator()
        L371:
            boolean r14 = r12.hasNext()
            java.lang.String r15 = "rarity"
            if (r14 == 0) goto L392
            java.lang.Object r14 = r12.next()
            com.lumina.monsterhunterfieldbook.FieldRecord r14 = (com.lumina.monsterhunterfieldbook.FieldRecord) r14
            com.lumina.monsterhunterfieldbook.WeaponModel r11 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            org.json.JSONObject r11 = r11.data(r14)
            int r11 = r11.optInt(r15)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13.add(r11)
            r11 = 2
            goto L371
        L392:
            java.util.List r13 = (java.util.List) r13
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.List r11 = kotlin.collections.CollectionsKt.distinct(r13)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.List r11 = kotlin.collections.CollectionsKt.sorted(r11)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r12 = new java.util.ArrayList
            r14 = 10
            int r13 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r11, r14)
            r12.<init>(r13)
            java.util.Collection r12 = (java.util.Collection) r12
            java.util.Iterator r11 = r11.iterator()
        L3b3:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L3e6
            java.lang.Object r13 = r11.next()
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            java.lang.String r14 = java.lang.String.valueOf(r13)
            r21 = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r22 = r8
            java.lang.String r8 = "Rarity "
            r6.<init>(r8)
            java.lang.StringBuilder r6 = r6.append(r13)
            java.lang.String r6 = r6.toString()
            kotlin.Pair r6 = kotlin.TuplesKt.to(r14, r6)
            r12.add(r6)
            r6 = r21
            r8 = r22
            goto L3b3
        L3e6:
            r21 = r6
            r22 = r8
            java.util.List r12 = (java.util.List) r12
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.List r6 = kotlin.collections.CollectionsKt.plus(r7, r12)
            java.lang.String r7 = "Rarity"
            r0.choices(r3, r7, r15, r6)
            r6 = 2
            kotlin.Pair[] r7 = new kotlin.Pair[r6]
            kotlin.Pair r6 = kotlin.TuplesKt.to(r5, r10)
            r23 = 0
            r7[r23] = r6
            java.lang.String r6 = "none"
            java.lang.String r8 = "No element"
            kotlin.Pair r6 = kotlin.TuplesKt.to(r6, r8)
            r7[r19] = r6
            java.util.List r6 = kotlin.collections.CollectionsKt.listOf(r7)
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r7 = r0.records
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.Iterator r7 = r7.iterator()
        L421:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L439
            java.lang.Object r11 = r7.next()
            com.lumina.monsterhunterfieldbook.FieldRecord r11 = (com.lumina.monsterhunterfieldbook.FieldRecord) r11
            com.lumina.monsterhunterfieldbook.WeaponModel r12 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            java.util.List r11 = r12.elementNames(r11)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            kotlin.collections.CollectionsKt.addAll(r8, r11)
            goto L421
        L439:
            java.util.List r8 = (java.util.List) r8
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.List r7 = kotlin.collections.CollectionsKt.distinct(r8)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.List r7 = kotlin.collections.CollectionsKt.sorted(r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r14 = 10
            int r11 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r7, r14)
            r8.<init>(r11)
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.Iterator r7 = r7.iterator()
        L45a:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L46e
            java.lang.Object r11 = r7.next()
            java.lang.String r11 = (java.lang.String) r11
            kotlin.Pair r11 = kotlin.TuplesKt.to(r11, r11)
            r8.add(r11)
            goto L45a
        L46e:
            java.util.List r8 = (java.util.List) r8
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.List r6 = kotlin.collections.CollectionsKt.plus(r6, r8)
            java.lang.String r7 = "Element / status"
            java.lang.String r8 = "element"
            r0.choices(r3, r7, r8, r6)
            r6 = 4
            kotlin.Pair[] r6 = new kotlin.Pair[r6]
            kotlin.Pair r5 = kotlin.TuplesKt.to(r5, r10)
            r23 = 0
            r6[r23] = r5
            java.lang.String r5 = "forge"
            java.lang.String r7 = "Forge"
            kotlin.Pair r5 = kotlin.TuplesKt.to(r5, r7)
            r6[r19] = r5
            java.lang.String r5 = "upgrade"
            java.lang.String r7 = "Upgrade"
            kotlin.Pair r5 = kotlin.TuplesKt.to(r5, r7)
            r17 = 2
            r6[r17] = r5
            java.lang.String r5 = "reward"
            java.lang.String r7 = "Rewards"
            kotlin.Pair r5 = kotlin.TuplesKt.to(r5, r7)
            r6[r18] = r5
            java.util.List r5 = kotlin.collections.CollectionsKt.listOf(r6)
            java.lang.String r6 = "Obtain"
            java.lang.String r7 = "obtain"
            r0.choices(r3, r6, r7, r5)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda2 r5 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda2
            r5.<init>(r0)
            java.lang.String r6 = "Clear filters"
            android.widget.TextView r3 = r3.button(r6, r5)
            android.graphics.drawable.ColorDrawable r5 = new android.graphics.drawable.ColorDrawable
            r11 = 0
            r5.<init>(r11)
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
            r3.setBackground(r5)
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r0.a
            int r5 = r5.getAccent()
            r3.setTextColor(r5)
            r5 = 8388627(0x800013, float:1.175497E-38)
            r3.setGravity(r5)
            android.view.View r3 = (android.view.View) r3
            r2.addView(r3)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            int r28 = r2.getMuted()
            r29 = 4
            r30 = 0
            java.lang.String r25 = ""
            r26 = 1093664768(0x41300000, float:11.0)
            r27 = 0
            r24 = r2
            android.widget.TextView r2 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r24, r25, r26, r27, r28, r29, r30)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            r6 = r21
            java.lang.Number r6 = (java.lang.Number) r6
            int r3 = r3.dp(r6)
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r0.a
            r8 = r22
            java.lang.Number r8 = (java.lang.Number) r8
            int r5 = r5.dp(r8)
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r0.a
            r7 = r21
            java.lang.Number r7 = (java.lang.Number) r7
            int r6 = r6.dp(r7)
            com.lumina.monsterhunterfieldbook.MainActivity r7 = r0.a
            r8 = r22
            java.lang.Number r8 = (java.lang.Number) r8
            int r7 = r7.dp(r8)
            r2.setPadding(r3, r5, r6, r7)
            r0.meta = r2
            android.view.View r2 = (android.view.View) r2
            r1.addView(r2)
            android.widget.ListView r2 = new android.widget.ListView
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            android.content.Context r3 = (android.content.Context) r3
            r2.<init>(r3)
            android.graphics.drawable.ColorDrawable r3 = new android.graphics.drawable.ColorDrawable
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r0.a
            int r5 = r5.getLine()
            r3.<init>(r5)
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
            r2.setDivider(r3)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r19)
            java.lang.Number r5 = (java.lang.Number) r5
            int r3 = r3.dp(r5)
            r2.setDividerHeight(r3)
            r11 = 0
            r2.setCacheColorHint(r11)
            r3 = r19
            r2.setVerticalScrollBarEnabled(r3)
            r2.setFooterDividersEnabled(r11)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            r28 = 6
            r29 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r24 = r3
            android.graphics.drawable.GradientDrawable r3 = com.lumina.monsterhunterfieldbook.MainActivity.surface$default(r24, r25, r26, r27, r28, r29)
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
            r2.setBackground(r3)
            java.lang.String r3 = "Weapons"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setContentDescription(r3)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda3 r5 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda3
            r5.<init>()
            java.lang.String r6 = ""
            android.widget.TextView r3 = r3.button(r6, r5)
            r0.more = r3
            android.view.View r3 = (android.view.View) r3
            r5 = 0
            r11 = 0
            r2.addFooterView(r3, r5, r11)
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$adapter$1 r5 = r0.adapter
            android.widget.ListAdapter r5 = (android.widget.ListAdapter) r5
            r2.setAdapter(r5)
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r0.a
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda4 r6 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda4
            r6.<init>(r0)
            r5.touch(r3, r6)
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$renderDatabase$13 r3 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$renderDatabase$13
            r3.<init>(r0, r2)
            android.widget.AbsListView$OnScrollListener r3 = (android.widget.AbsListView.OnScrollListener) r3
            r2.setOnScrollListener(r3)
            r0.list = r2
            android.view.View r2 = (android.view.View) r2
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r5 = 1065353216(0x3f800000, float:1.0)
            r10 = -1
            r11 = 0
            r3.<init>(r10, r11, r5)
            android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
            r1.addView(r2, r3)
            r0.updateRows(r11)
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$renderDatabase$14 r1 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$renderDatabase$14
            r1.<init>(r0, r4)
            android.text.TextWatcher r1 = (android.text.TextWatcher) r1
            r9.addTextChangedListener(r1)
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda5 r1 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda5
            r1.<init>(r0)
            r9.setOnEditorActionListener(r1)
            return
    }

    private static final kotlin.Unit renderDatabase$lambda$11(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r6) {
            r6.capture()
            r0 = 4
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "rank"
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "rarity"
            r3 = 1
            r0[r3] = r1
            r1 = 2
            java.lang.String r4 = "element"
            r0[r1] = r4
            r1 = 3
            java.lang.String r4 = "obtain"
            r0[r1] = r4
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            org.json.JSONObject r4 = r6.state
            java.lang.String r5 = "all"
            r4.put(r1, r5)
            goto L24
        L38:
            org.json.JSONObject r0 = r6.state
            java.lang.String r1 = "limit"
            r4 = 40
            r0.put(r1, r4)
            org.json.JSONObject r0 = r6.state
            java.lang.String r1 = "listPosition"
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "listTop"
            r0.put(r1, r2)
            r6.saveFilters()
            r0 = 0
            render$default(r6, r2, r3, r0)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
    }

    private static final kotlin.Unit renderDatabase$lambda$15() {
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    private static final kotlin.Unit renderDatabase$lambda$16(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r4) {
            r4.capture()
            org.json.JSONObject r0 = r4.state
            java.lang.String r1 = "limit"
            r2 = 40
            int r3 = r0.optInt(r1, r2)
            int r3 = r3 + r2
            r0.put(r1, r3)
            r0 = 0
            r4.updateRows(r0)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
    }

    private static final boolean renderDatabase$lambda$17(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0, android.widget.TextView r1, int r2, android.view.KeyEvent r3) {
            r1 = 3
            if (r2 != r1) goto L8
            r0.hideKeyboard()
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    private static final kotlin.Unit renderDatabase$lambda$2(android.widget.EditText r1) {
            java.lang.String r0 = ""
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            r1.requestFocus()
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    private static final kotlin.Unit renderDatabase$lambda$3(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r4) {
            org.json.JSONObject r0 = r4.state
            java.lang.String r1 = "filtersOpen"
            boolean r0 = r0.optBoolean(r1)
            r2 = r0 ^ 1
            org.json.JSONObject r3 = r4.state
            r3.put(r1, r2)
            android.view.View r1 = r4.filterPanel
            if (r1 == 0) goto L1c
            if (r0 != 0) goto L17
            r2 = 0
            goto L19
        L17:
            r2 = 8
        L19:
            r1.setVisibility(r2)
        L1c:
            android.widget.TextView r4 = r4.filterToggle
            if (r4 == 0) goto L32
            if (r0 != 0) goto L25
            java.lang.String r0 = "expanded"
            goto L27
        L25:
            java.lang.String r0 = "collapsed"
        L27:
            java.lang.String r1 = "Filters, "
            java.lang.String r0 = r1.concat(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r4.setContentDescription(r0)
        L32:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
    }

    private final void renderDetails() {
            r11 = this;
            java.util.Map<java.lang.String, com.lumina.monsterhunterfieldbook.FieldRecord> r0 = r11.byId
            org.json.JSONObject r1 = r11.state
            java.lang.String r2 = "selected"
            java.lang.String r1 = r1.optString(r2)
            java.lang.Object r0 = r0.get(r1)
            r3 = r0
            com.lumina.monsterhunterfieldbook.FieldRecord r3 = (com.lumina.monsterhunterfieldbook.FieldRecord) r3
            if (r3 != 0) goto L1f
            org.json.JSONObject r0 = r11.state
            java.lang.String r1 = "detail"
            r2 = 0
            r0.put(r1, r2)
            r11.render(r2)
            return
        L1f:
            kotlin.Pair r0 = r11.contentScroll()
            java.lang.Object r1 = r0.component1()
            r10 = r1
            android.widget.ScrollView r10 = (android.widget.ScrollView) r10
            java.lang.Object r0 = r0.component2()
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r11.a
            boolean r2 = r1.getWide()
            r4 = 29
            r5 = 20
            if (r2 == 0) goto L3e
            r2 = r4
            goto L3f
        L3e:
            r2 = r5
        L3f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r1 = r1.dp(r2)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r11.a
            r6 = 12
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            int r2 = r2.dp(r6)
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r11.a
            boolean r7 = r6.getWide()
            if (r7 == 0) goto L60
            goto L61
        L60:
            r4 = r5
        L61:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r6.dp(r4)
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r11.a
            r6 = 25
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            int r5 = r5.dp(r6)
            r0.setPadding(r1, r2, r4, r5)
            com.lumina.monsterhunterfieldbook.WeaponMaterialsView r1 = new com.lumina.monsterhunterfieldbook.WeaponMaterialsView
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r11.a
            org.json.JSONObject r4 = r11.state
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda22 r6 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda22
            r6.<init>(r11)
            r8 = 32
            r9 = 0
            r5 = 0
            r7 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            android.view.View r1 = (android.view.View) r1
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r5 = -2
            r2.<init>(r4, r5)
            android.view.ViewGroup$LayoutParams r2 = (android.view.ViewGroup.LayoutParams) r2
            r0.addView(r1, r2)
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda23 r0 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda23
            r0.<init>(r10, r11, r3)
            r10.post(r0)
            return
    }

    private static final kotlin.Unit renderDetails$lambda$0(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r1, java.lang.String r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.select(r2)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    private static final void renderDetails$lambda$1(android.widget.ScrollView r2, com.lumina.monsterhunterfieldbook.WeaponProfilePanel r3, com.lumina.monsterhunterfieldbook.FieldRecord r4) {
            org.json.JSONObject r3 = r3.state
            com.lumina.monsterhunterfieldbook.WeaponModel r0 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            java.lang.String r4 = r0.rawId(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "detailScroll:"
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            int r3 = r3.optInt(r4)
            r4 = 0
            r2.scrollTo(r4, r3)
            return
    }

    private final void renderGuide() {
            r18 = this;
            r0 = r18
            kotlin.Pair r1 = r0.contentScroll()
            java.lang.Object r2 = r1.component1()
            android.widget.ScrollView r2 = (android.widget.ScrollView) r2
            java.lang.Object r1 = r1.component2()
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            com.lumina.monsterhunterfieldbook.FieldRecord r3 = r0.guide
            org.json.JSONObject r3 = r3.data()
            com.lumina.monsterhunterfieldbook.WeaponFlowLayout r4 = new com.lumina.monsterhunterfieldbook.WeaponFlowLayout
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r0.a
            r6 = 8
            r7 = 10
            r4.<init>(r5, r6, r7)
            java.lang.String r5 = "role"
            java.lang.String r5 = r3.optString(r5)
            java.lang.String r6 = "optString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            r7 = 1
            android.widget.TextView r5 = renderGuide$pill(r0, r5, r7)
            android.view.View r5 = (android.view.View) r5
            android.view.ViewGroup$LayoutParams r7 = new android.view.ViewGroup$LayoutParams
            r8 = -2
            r7.<init>(r8, r8)
            r4.addView(r5, r7)
            java.lang.String r5 = "complexity"
            java.lang.String r5 = r3.optString(r5)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r5 = r7.append(r5)
            java.lang.String r7 = " learning curve"
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r5 = r5.toString()
            r7 = 0
            r9 = 4
            r10 = 0
            android.widget.TextView r5 = renderGuide$pill$default(r0, r5, r7, r9, r10)
            android.view.View r5 = (android.view.View) r5
            android.view.ViewGroup$LayoutParams r7 = new android.view.ViewGroup$LayoutParams
            r7.<init>(r8, r8)
            r4.addView(r5, r7)
            com.lumina.monsterhunterfieldbook.FieldRecord r5 = r0.guide
            java.lang.String r5 = r5.getId()
            android.widget.FrameLayout r5 = r0.bookmark(r5)
            android.view.View r5 = (android.view.View) r5
            android.view.ViewGroup$LayoutParams r7 = new android.view.ViewGroup$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r0.a
            r9 = 40
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Number r9 = (java.lang.Number) r9
            int r8 = r8.dp(r9)
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r0.a
            r11 = 36
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Number r11 = (java.lang.Number) r11
            int r9 = r9.dp(r11)
            r7.<init>(r8, r9)
            r4.addView(r5, r7)
            android.view.View r4 = (android.view.View) r4
            r1.addView(r4)
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            r5 = 18
            r4.gap(r1, r5)
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda9 r4 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda9
            r4.<init>(r3, r0)
            java.lang.String r7 = "Strengths"
            java.lang.String r8 = "strengths"
            renderGuide$fold(r0, r1, r7, r8, r4)
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda10 r4 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda10
            r4.<init>(r3, r0)
            java.lang.String r7 = "Tradeoffs"
            java.lang.String r8 = "tradeoffs"
            renderGuide$fold(r0, r1, r7, r8, r4)
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda12 r4 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda12
            r4.<init>(r3, r0)
            java.lang.String r7 = "Movement & reach"
            java.lang.String r8 = "movement"
            renderGuide$fold(r0, r1, r7, r8, r4)
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda13 r4 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda13
            r4.<init>(r3, r0)
            java.lang.String r7 = "Defensive options"
            java.lang.String r8 = "defense"
            renderGuide$fold(r0, r1, r7, r8, r4)
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            r7 = 22
            r4.gap(r1, r7)
            com.lumina.monsterhunterfieldbook.MainActivity r11 = r0.a
            r16 = 8
            r17 = 0
            java.lang.String r12 = "World foundation loop"
            r13 = 1101004800(0x41a00000, float:20.0)
            r14 = 1
            r15 = 0
            android.widget.TextView r4 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r11, r12, r13, r14, r15, r16, r17)
            android.view.View r4 = (android.view.View) r4
            r1.addView(r4)
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            r7 = 12
            r4.gap(r1, r7)
            java.lang.String r4 = "loop"
            org.json.JSONArray r4 = r3.optJSONArray(r4)
            r0.loops(r1, r4)
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            boolean r4 = r4.isIce()
            if (r4 == 0) goto L134
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            r4.gap(r1, r5)
            java.lang.String r4 = "iceborne"
            java.lang.String r4 = r3.optString(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)
            java.lang.String r6 = "ICEBORNE"
            r0.advice(r1, r6, r4)
            java.lang.String r4 = "iceborneLoop"
            org.json.JSONArray r4 = r3.optJSONArray(r4)
            if (r4 == 0) goto L134
            int r6 = r4.length()
            if (r6 <= 0) goto L12a
            r10 = r4
        L12a:
            if (r10 == 0) goto L134
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            r4.gap(r1, r7)
            r0.loops(r1, r10)
        L134:
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            r4.gap(r1, r5)
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda14 r4 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda14
            r4.<init>(r3, r0)
            java.lang.String r5 = "Useful skills"
            java.lang.String r6 = "skills"
            renderGuide$fold(r0, r1, r5, r6, r4)
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda15 r4 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda15
            r4.<init>(r3, r0)
            java.lang.String r5 = "Common mistakes"
            java.lang.String r6 = "mistakes"
            renderGuide$fold(r0, r1, r5, r6, r4)
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            r5 = 20
            r4.gap(r1, r5)
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            boolean r4 = r4.isIce()
            java.lang.String r5 = "progression"
            if (r4 == 0) goto L171
            java.lang.String r4 = "iceborneProgression"
            java.lang.String r4 = r3.optString(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r6 = kotlin.text.StringsKt.isBlank(r4)
            if (r6 == 0) goto L183
            goto L17f
        L171:
            java.lang.String r4 = "worldProgression"
            java.lang.String r4 = r3.optString(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r6 = kotlin.text.StringsKt.isBlank(r4)
            if (r6 == 0) goto L183
        L17f:
            java.lang.String r4 = r3.optString(r5)
        L183:
            java.lang.String r4 = (java.lang.String) r4
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            java.lang.String r3 = "EQUIPMENT DIRECTION"
            r0.advice(r1, r3, r4)
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda16 r1 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda16
            r1.<init>(r2, r0)
            r2.post(r1)
            return
    }

    private static final void renderGuide$bullets(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r18, android.widget.LinearLayout r19, org.json.JSONArray r20) {
            r0 = r18
            r1 = r19
            r2 = r20
            if (r2 != 0) goto La
            goto L83
        La:
            int r3 = r2.length()
            r4 = 0
            r5 = r4
        L10:
            if (r5 >= r3) goto L83
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r0.a
            android.widget.LinearLayout r6 = r6.row()
            r7 = 48
            r6.setGravity(r7)
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r0.a
            r13 = 12
            r14 = 0
            java.lang.String r9 = "•"
            r10 = 1096810496(0x41600000, float:14.0)
            r11 = 0
            r12 = 0
            android.widget.TextView r7 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r8, r9, r10, r11, r12, r13, r14)
            android.view.View r7 = (android.view.View) r7
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r0.a
            r10 = 20
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Number r10 = (java.lang.Number) r10
            int r9 = r9.dp(r10)
            r10 = -2
            r8.<init>(r9, r10)
            android.view.ViewGroup$LayoutParams r8 = (android.view.ViewGroup.LayoutParams) r8
            r6.addView(r7, r8)
            com.lumina.monsterhunterfieldbook.MainActivity r11 = r0.a
            java.lang.String r12 = r2.optString(r5)
            java.lang.String r7 = "optString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r7)
            r16 = 12
            r17 = 0
            r13 = 1096810496(0x41600000, float:14.0)
            r14 = 0
            r15 = 0
            android.widget.TextView r7 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r11, r12, r13, r14, r15, r16, r17)
            android.view.View r7 = (android.view.View) r7
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r9 = 1065353216(0x3f800000, float:1.0)
            r8.<init>(r4, r10, r9)
            android.view.ViewGroup$LayoutParams r8 = (android.view.ViewGroup.LayoutParams) r8
            r6.addView(r7, r8)
            android.view.View r6 = (android.view.View) r6
            r1.addView(r6)
            int r6 = r2.length()
            int r6 = r6 + (-1)
            if (r5 >= r6) goto L80
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r0.a
            r7 = 12
            r6.gap(r1, r7)
        L80:
            int r5 = r5 + 1
            goto L10
        L83:
            return
    }

    private static final void renderGuide$fold(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r7, android.widget.LinearLayout r8, java.lang.String r9, java.lang.String r10, kotlin.jvm.functions.Function1<? super android.widget.LinearLayout, kotlin.Unit> r11) {
            com.lumina.monsterhunterfieldbook.ReadingGroup r0 = new com.lumina.monsterhunterfieldbook.ReadingGroup
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r7.a
            com.lumina.monsterhunterfieldbook.FieldRecord r2 = r7.guide
            java.lang.String r2 = r2.getId()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r3 = ":"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r10 = r2.append(r10)
            java.lang.String r2 = r10.toString()
            java.util.List<com.lumina.monsterhunterfieldbook.ReadingGroup> r4 = r7.groups
            r5 = 0
            r3 = r9
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            android.graphics.drawable.ColorDrawable r9 = new android.graphics.drawable.ColorDrawable
            r10 = 0
            r9.<init>(r10)
            android.graphics.drawable.Drawable r9 = (android.graphics.drawable.Drawable) r9
            r0.setBackground(r9)
            android.view.View r9 = r0.getChildAt(r10)
            boolean r11 = r9 instanceof android.widget.TextView
            r1 = 0
            if (r11 == 0) goto L40
            android.widget.TextView r9 = (android.widget.TextView) r9
            goto L41
        L40:
            r9 = r1
        L41:
            r11 = 4
            if (r9 == 0) goto Lb8
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r2.<init>(r10)
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            r9.setBackground(r2)
            com.lumina.monsterhunterfieldbook.MainActivity r10 = r7.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            java.lang.Number r2 = (java.lang.Number) r2
            int r10 = r10.dp(r2)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r7.a
            r3 = 18
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.Number r4 = (java.lang.Number) r4
            int r2 = r2.dp(r4)
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r7.a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            java.lang.Number r5 = (java.lang.Number) r5
            int r4 = r4.dp(r5)
            com.lumina.monsterhunterfieldbook.MainActivity r5 = r7.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r5.dp(r3)
            r9.setPadding(r10, r2, r4, r3)
            com.lumina.monsterhunterfieldbook.MainActivity r10 = r7.a
            r2 = 56
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r10 = r10.dp(r2)
            r9.setMinHeight(r10)
            com.lumina.monsterhunterfieldbook.MainActivity r10 = r7.a
            com.lumina.monsterhunterfieldbook.NativePrefs r10 = r10.getPrefs()
            java.lang.String r2 = "font"
            r3 = 100
            int r10 = r10.number(r2, r3)
            float r10 = (float) r10
            r2 = 1097859072(0x41700000, float:15.0)
            float r10 = r10 * r2
            r2 = 1120403456(0x42c80000, float:100.0)
            float r10 = r10 / r2
            r9.setTextSize(r10)
            com.lumina.monsterhunterfieldbook.WeaponDisclosureDrawable r10 = new com.lumina.monsterhunterfieldbook.WeaponDisclosureDrawable
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r7.a
            r10.<init>(r2, r0)
            android.graphics.drawable.Drawable r10 = (android.graphics.drawable.Drawable) r10
            r9.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r1, r10, r1)
        Lb8:
            r9 = 1
            android.view.View r9 = r0.getChildAt(r9)
            if (r9 == 0) goto Lf7
            com.lumina.monsterhunterfieldbook.MainActivity r10 = r7.a
            r1 = 28
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r10 = r10.dp(r1)
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r7.a
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r1 = r1.dp(r2)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r7.a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r2.dp(r11)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r7.a
            r3 = 24
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r2 = r2.dp(r3)
            r9.setPadding(r10, r1, r11, r2)
        Lf7:
            android.view.View r0 = (android.view.View) r0
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r10 = -1
            r11 = -2
            r9.<init>(r10, r11)
            android.view.ViewGroup$LayoutParams r9 = (android.view.ViewGroup.LayoutParams) r9
            r8.addView(r0, r9)
            com.lumina.monsterhunterfieldbook.MainActivity r7 = r7.a
            r7.rule(r8)
            return
    }

    private static final void renderGuide$lambda$12(android.widget.ScrollView r1, com.lumina.monsterhunterfieldbook.WeaponProfilePanel r2) {
            org.json.JSONObject r2 = r2.state
            java.lang.String r0 = "guideScroll"
            int r2 = r2.optInt(r0)
            r0 = 0
            r1.scrollTo(r0, r2)
            return
    }

    private static final kotlin.Unit renderGuide$lambda$2(org.json.JSONObject r1, com.lumina.monsterhunterfieldbook.WeaponProfilePanel r2, android.widget.LinearLayout r3) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "strengths"
            org.json.JSONArray r1 = r1.optJSONArray(r0)
            renderGuide$bullets(r2, r3, r1)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    private static final kotlin.Unit renderGuide$lambda$3(org.json.JSONObject r1, com.lumina.monsterhunterfieldbook.WeaponProfilePanel r2, android.widget.LinearLayout r3) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "tradeoffs"
            org.json.JSONArray r1 = r1.optJSONArray(r0)
            renderGuide$bullets(r2, r3, r1)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    private static final kotlin.Unit renderGuide$lambda$4(org.json.JSONObject r2, com.lumina.monsterhunterfieldbook.WeaponProfilePanel r3, android.widget.LinearLayout r4) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "mobility"
            java.lang.String r0 = r2.optString(r0)
            java.lang.String r1 = "optString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            renderGuide$paragraph(r3, r4, r0)
            java.lang.String r0 = "reach"
            java.lang.String r2 = r2.optString(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            renderGuide$paragraph(r3, r4, r2)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    private static final kotlin.Unit renderGuide$lambda$5(org.json.JSONObject r1, com.lumina.monsterhunterfieldbook.WeaponProfilePanel r2, android.widget.LinearLayout r3) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "defense"
            java.lang.String r1 = r1.optString(r0)
            java.lang.String r0 = "optString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            renderGuide$paragraph(r2, r3, r1)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    private static final kotlin.Unit renderGuide$lambda$8(org.json.JSONObject r1, com.lumina.monsterhunterfieldbook.WeaponProfilePanel r2, android.widget.LinearLayout r3) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "skills"
            org.json.JSONArray r1 = r1.optJSONArray(r0)
            renderGuide$bullets(r2, r3, r1)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    private static final kotlin.Unit renderGuide$lambda$9(org.json.JSONObject r1, com.lumina.monsterhunterfieldbook.WeaponProfilePanel r2, android.widget.LinearLayout r3) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "mistakes"
            org.json.JSONArray r1 = r1.optJSONArray(r0)
            renderGuide$bullets(r2, r3, r1)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    private static final void renderGuide$paragraph(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r7, android.widget.LinearLayout r8, java.lang.String r9) {
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r7.a
            r5 = 12
            r6 = 0
            r2 = 1096810496(0x41600000, float:14.0)
            r3 = 0
            r4 = 0
            r1 = r9
            android.widget.TextView r9 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r0, r1, r2, r3, r4, r5, r6)
            android.view.View r9 = (android.view.View) r9
            r8.addView(r9)
            com.lumina.monsterhunterfieldbook.MainActivity r7 = r7.a
            r9 = 12
            r7.gap(r8, r9)
            return
    }

    private static final android.widget.TextView renderGuide$pill(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r7, java.lang.String r8, boolean r9) {
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r7.a
            if (r9 == 0) goto L9
            int r9 = r0.getAccent()
            goto Ld
        L9:
            int r9 = r0.getMuted()
        Ld:
            r4 = r9
            r5 = 4
            r6 = 0
            r2 = 1092616192(0x41200000, float:10.0)
            r3 = 0
            r1 = r8
            android.widget.TextView r8 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r0, r1, r2, r3, r4, r5, r6)
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r7.a
            r0 = 1
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = 0
            android.graphics.drawable.GradientDrawable r9 = r9.surface(r2, r0, r1)
            android.graphics.drawable.Drawable r9 = (android.graphics.drawable.Drawable) r9
            r8.setBackground(r9)
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r7.a
            r0 = 8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Number r1 = (java.lang.Number) r1
            int r9 = r9.dp(r1)
            com.lumina.monsterhunterfieldbook.MainActivity r1 = r7.a
            r2 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Number r3 = (java.lang.Number) r3
            int r1 = r1.dp(r3)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r7.a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r3.dp(r0)
            com.lumina.monsterhunterfieldbook.MainActivity r7 = r7.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r7 = r7.dp(r2)
            r8.setPadding(r9, r1, r0, r7)
            return r8
    }

    static /* synthetic */ android.widget.TextView renderGuide$pill$default(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0, java.lang.String r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 4
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            android.widget.TextView r0 = renderGuide$pill(r0, r1, r2)
            return r0
    }

    private final void resetContentTransform() {
            r3 = this;
            android.widget.FrameLayout r0 = r3.host
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            android.widget.FrameLayout r0 = r3.host
            r2 = 0
            r0.setTranslationY(r2)
            android.widget.FrameLayout r0 = r3.host
            r0.setScaleX(r1)
            android.widget.FrameLayout r0 = r3.host
            r0.setScaleY(r1)
            r3.blur(r2)
            return
    }

    private final void saveFilters() {
            r6 = this;
            java.lang.String r0 = "filterMemory"
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L1d
            r1 = r6
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel r1 = (com.lumina.monsterhunterfieldbook.WeaponProfilePanel) r1     // Catch: java.lang.Throwable -> L1d
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1d
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r6.a     // Catch: java.lang.Throwable -> L1d
            com.lumina.monsterhunterfieldbook.NativePrefs r2 = r2.getPrefs()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = "{}"
            java.lang.String r2 = r2.text(r0, r3)     // Catch: java.lang.Throwable -> L1d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r1 = kotlin.Result.m79constructorimpl(r1)     // Catch: java.lang.Throwable -> L1d
            goto L28
        L1d:
            r1 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m79constructorimpl(r1)
        L28:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            boolean r3 = kotlin.Result.m85isFailureimpl(r1)
            if (r3 == 0) goto L34
            r1 = r2
        L34:
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r3 = 5
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = 0
            java.lang.String r5 = "rank"
            r3[r4] = r5
            r4 = 1
            java.lang.String r5 = "rarity"
            r3[r4] = r5
            r4 = 2
            java.lang.String r5 = "element"
            r3[r4] = r5
            r4 = 3
            java.lang.String r5 = "obtain"
            r3[r4] = r5
            r4 = 4
            java.lang.String r5 = "family"
            r3[r4] = r5
            java.util.List r3 = kotlin.collections.CollectionsKt.listOf(r3)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L61:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L77
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            org.json.JSONObject r5 = r6.state
            java.lang.Object r5 = r5.opt(r4)
            r2.put(r4, r5)
            goto L61
        L77:
            org.json.JSONObject r3 = r6.state
            java.lang.String r4 = "type"
            java.lang.String r3 = r3.optString(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "weapon:"
            r4.<init>(r5)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            r1.put(r3, r2)
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r6.a
            com.lumina.monsterhunterfieldbook.NativePrefs r2 = r2.getPrefs()
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            r2.set(r0, r1)
            return
    }

    private final void select(java.lang.String r5) {
            r4 = this;
            java.util.Map<java.lang.String, com.lumina.monsterhunterfieldbook.FieldRecord> r0 = r4.byId
            boolean r0 = r0.containsKey(r5)
            if (r0 != 0) goto L9
            return
        L9:
            r4.checkpoint()
            org.json.JSONObject r0 = r4.state
            java.lang.String r1 = "detail"
            boolean r2 = r0.optBoolean(r1)
            if (r2 == 0) goto L19
            java.lang.String r2 = "record"
            goto L1b
        L19:
            java.lang.String r2 = "list"
        L1b:
            java.lang.String r3 = "detailOrigin"
            r0.put(r3, r2)
            org.json.JSONObject r0 = r4.state
            java.lang.String r2 = "selected"
            org.json.JSONObject r5 = r0.put(r2, r5)
            r0 = 1
            org.json.JSONObject r5 = r5.put(r1, r0)
            java.lang.String r1 = "tab"
            java.lang.String r2 = "database"
            r5.put(r1, r2)
            r5 = 0
            r1 = 0
            render$default(r4, r5, r0, r1)
            return
    }

    private final void showTreeInfo(java.lang.String r4) {
            r3 = this;
            java.util.Map<java.lang.String, com.lumina.monsterhunterfieldbook.FieldRecord> r0 = r3.byId
            boolean r0 = r0.containsKey(r4)
            if (r0 != 0) goto L9
            return
        L9:
            r3.checkpoint()
            org.json.JSONObject r0 = r3.state
            java.lang.String r1 = "selected"
            org.json.JSONObject r4 = r0.put(r1, r4)
            java.lang.String r0 = "tab"
            java.lang.String r1 = "database"
            org.json.JSONObject r4 = r4.put(r0, r1)
            java.lang.String r0 = "detail"
            r1 = 1
            org.json.JSONObject r4 = r4.put(r0, r1)
            java.lang.String r0 = "detailOrigin"
            java.lang.String r2 = "tree"
            r4.put(r0, r2)
            r4 = 0
            r0 = 0
            render$default(r3, r4, r1, r0)
            return
    }

    private final org.json.JSONArray trail() {
            r3 = this;
            org.json.JSONObject r0 = r3.state
            java.lang.String r1 = "_trail"
            org.json.JSONArray r0 = r0.optJSONArray(r1)
            if (r0 != 0) goto L14
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            org.json.JSONObject r2 = r3.state
            r2.put(r1, r0)
        L14:
            return r0
    }

    private final void transitionContent(boolean r12, kotlin.jvm.functions.Function0<kotlin.Unit> r13) {
            r11 = this;
            android.animation.ValueAnimator r0 = r11.contentAnimation
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            r0 = 0
            r11.contentAnimation = r0
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r11.a
            r1 = 110(0x6e, double:5.43E-322)
            long r3 = r0.motionDuration(r1)
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L90
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r11.a
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r0.getPrefs()
            java.lang.String r3 = "transition"
            java.lang.String r4 = "liquid"
            java.lang.String r0 = r0.text(r3, r4)
            java.lang.String r5 = "none"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r5)
            if (r0 == 0) goto L2f
            goto L90
        L2f:
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r11.a
            com.lumina.monsterhunterfieldbook.NativePrefs r0 = r0.getPrefs()
            java.lang.String r8 = r0.text(r3, r4)
            android.widget.FrameLayout r0 = r11.host
            float r7 = r0.getAlpha()
            android.widget.FrameLayout r0 = r11.host
            float r10 = r0.getScaleX()
            android.widget.FrameLayout r0 = r11.host
            float r9 = r0.getTranslationY()
            kotlin.jvm.internal.Ref$BooleanRef r0 = new kotlin.jvm.internal.Ref$BooleanRef
            r0.<init>()
            r3 = 2
            float[] r3 = new float[r3]
            r3 = {x0098: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r3)
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r11.a
            if (r12 == 0) goto L60
            r1 = 190(0xbe, double:9.4E-322)
        L60:
            long r1 = r4.motionDuration(r1)
            r3.setDuration(r1)
            android.view.animation.PathInterpolator r1 = new android.view.animation.PathInterpolator
            r2 = 1054280253(0x3ed70a3d, float:0.42)
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r2, r4, r5, r5)
            android.animation.TimeInterpolator r1 = (android.animation.TimeInterpolator) r1
            r3.setInterpolator(r1)
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda20 r5 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda20
            r6 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r3.addUpdateListener(r5)
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$transitionContent$1$2 r1 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$transitionContent$1$2
            r1.<init>(r0, r11, r13, r12)
            android.animation.Animator$AnimatorListener r1 = (android.animation.Animator.AnimatorListener) r1
            r3.addListener(r1)
            r3.start()
            r6.contentAnimation = r3
            return
        L90:
            r6 = r11
            r11.resetContentTransform()
            r13.invoke()
            return
    }

    private static final void transitionContent$lambda$0$0(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r4, float r5, java.lang.String r6, float r7, float r8, android.animation.ValueAnimator r9) {
            java.lang.String r0 = "animation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.Object r9 = r9.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9, r0)
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            android.widget.FrameLayout r0 = r4.host
            java.lang.String r1 = "liquid"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r1)
            r3 = 0
            if (r2 == 0) goto L22
            r2 = 1048576000(0x3e800000, float:0.25)
            goto L23
        L22:
            r2 = r3
        L23:
            float r2 = r2 - r5
            float r2 = r2 * r9
            float r5 = r5 + r2
            r0.setAlpha(r5)
            java.lang.String r5 = "slide"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r5)
            if (r5 == 0) goto L48
            android.widget.FrameLayout r5 = r4.host
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r4.a
            r2 = 10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r0 = r0.dp(r2)
            float r0 = (float) r0
            float r0 = r0 - r7
            float r0 = r0 * r9
            float r7 = r7 + r0
            r5.setTranslationY(r7)
        L48:
            java.lang.String r5 = "zoom"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r5)
            if (r5 == 0) goto L64
            android.widget.FrameLayout r5 = r4.host
            r7 = 1064849900(0x3f7851ec, float:0.97)
            float r7 = r7 - r8
            float r7 = r7 * r9
            float r8 = r8 + r7
            r5.setScaleX(r8)
            android.widget.FrameLayout r5 = r4.host
            float r7 = r5.getScaleX()
            r5.setScaleY(r7)
        L64:
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r1)
            if (r5 == 0) goto L6e
            r5 = 1084227584(0x40a00000, float:5.0)
            float r3 = r9 * r5
        L6e:
            r4.blur(r3)
            return
    }

    private final void updateRows(boolean r9) {
            r8 = this;
            com.lumina.monsterhunterfieldbook.WeaponModel r0 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r1 = r8.records
            org.json.JSONObject r2 = r8.state
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r8.a
            com.lumina.monsterhunterfieldbook.NativePrefs r3 = r3.getPrefs()
            java.lang.String r4 = "sortWeapons"
            java.lang.String r5 = "source"
            java.lang.String r3 = r3.text(r4, r5)
            java.lang.String r4 = "text(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.util.List r0 = r0.filtered(r1, r2, r3)
            org.json.JSONObject r1 = r8.state
            java.lang.String r2 = "limit"
            r3 = 40
            int r1 = r1.optInt(r2, r3)
            int r1 = kotlin.ranges.RangesKt.coerceAtLeast(r1, r3)
            r2 = 1
            r8.restoring = r2
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r3 = r8.visible
            r3.clear()
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r3 = r8.visible
            r4 = r0
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r4 = kotlin.collections.CollectionsKt.take(r4, r1)
            java.util.Collection r4 = (java.util.Collection) r4
            r3.addAll(r4)
            android.widget.TextView r3 = r8.meta
            if (r3 == 0) goto L61
            int r4 = r0.size()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r5 = " weapons"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.setText(r4)
        L61:
            android.widget.TextView r3 = r8.filterToggle
            if (r3 == 0) goto L6e
            java.lang.String r4 = r8.filterLabel()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.setText(r4)
        L6e:
            android.widget.TextView r3 = r8.more
            if (r3 == 0) goto Lc3
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L7b
            java.lang.String r4 = "No matching weapons."
            goto La0
        L7b:
            int r4 = r0.size()
            int r4 = java.lang.Math.min(r1, r4)
            int r5 = r0.size()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Show more · "
            r6.<init>(r7)
            java.lang.StringBuilder r4 = r6.append(r4)
            java.lang.String r6 = " of "
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
        La0:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.setText(r4)
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto Lb5
            int r4 = r0.size()
            if (r4 <= r1) goto Lb2
            goto Lb5
        Lb2:
            r1 = 8
            goto Lb6
        Lb5:
            r1 = 0
        Lb6:
            r3.setVisibility(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r2
            r3.setEnabled(r0)
        Lc3:
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$adapter$1 r0 = r8.adapter
            r0.notifyDataSetChanged()
            android.widget.ListView r0 = r8.list
            if (r0 == 0) goto Ld4
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda6 r1 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda6
            r1.<init>(r8, r9)
            r0.post(r1)
        Ld4:
            return
    }

    private static final void updateRows$lambda$1(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r4, boolean r5) {
            android.widget.ListView r0 = r4.list
            r1 = 0
            if (r0 == 0) goto L20
            if (r5 == 0) goto L9
            r2 = r1
            goto L11
        L9:
            org.json.JSONObject r2 = r4.state
            java.lang.String r3 = "listPosition"
            int r2 = r2.optInt(r3)
        L11:
            if (r5 == 0) goto L15
            r5 = r1
            goto L1d
        L15:
            org.json.JSONObject r5 = r4.state
            java.lang.String r3 = "listTop"
            int r5 = r5.optInt(r3)
        L1d:
            r0.setSelectionFromTop(r2, r5)
        L20:
            r4.restoring = r1
            return
    }

    private final android.view.View weaponRow(com.lumina.monsterhunterfieldbook.FieldRecord r21) {
            r20 = this;
            r0 = r20
            r1 = r21
            com.lumina.monsterhunterfieldbook.WeaponModel r2 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            org.json.JSONObject r2 = r2.data(r1)
            com.lumina.monsterhunterfieldbook.MainActivity r3 = r0.a
            android.widget.LinearLayout r3 = r3.row()
            r4 = 16
            r3.setGravity(r4)
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            r5 = 14
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r7 = r6
            java.lang.Number r7 = (java.lang.Number) r7
            int r4 = r4.dp(r7)
            com.lumina.monsterhunterfieldbook.MainActivity r7 = r0.a
            r8 = 13
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9 = r8
            java.lang.Number r9 = (java.lang.Number) r9
            int r7 = r7.dp(r9)
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r0.a
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r9.dp(r6)
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r0.a
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r9.dp(r8)
            r3.setPadding(r4, r7, r6, r8)
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            r6 = 76
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            int r4 = r4.dp(r6)
            r3.setMinimumHeight(r4)
            com.lumina.monsterhunterfieldbook.WeaponModel r4 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r0.a
            r7 = 32
            android.widget.ImageView r4 = r4.icon(r6, r1, r7)
            android.view.View r4 = (android.view.View) r4
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            com.lumina.monsterhunterfieldbook.MainActivity r7 = r0.a
            r8 = 42
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9 = r8
            java.lang.Number r9 = (java.lang.Number) r9
            int r7 = r7.dp(r9)
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r0.a
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r9.dp(r8)
            r6.<init>(r7, r8)
            android.view.ViewGroup$LayoutParams r6 = (android.view.ViewGroup.LayoutParams) r6
            r3.addView(r4, r6)
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r0.a
            android.widget.LinearLayout r4 = r4.column()
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r0.a
            android.widget.LinearLayout r6 = r6.row()
            r7 = 48
            r6.setGravity(r7)
            com.lumina.monsterhunterfieldbook.MainActivity r7 = r0.a
            java.lang.String r8 = r1.getName()
            com.lumina.monsterhunterfieldbook.MainActivity r9 = r0.a
            int r9 = r9.getAccent()
            r10 = 1096810496(0x41600000, float:14.0)
            android.widget.TextView r7 = r7.textBold(r8, r10, r9)
            android.view.View r7 = (android.view.View) r7
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r9 = 0
            r10 = -2
            r11 = 1065353216(0x3f800000, float:1.0)
            r8.<init>(r9, r10, r11)
            android.view.ViewGroup$LayoutParams r8 = (android.view.ViewGroup.LayoutParams) r8
            r6.addView(r7, r8)
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r0.a
            java.lang.String r7 = "rarity"
            int r7 = r2.optInt(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r13 = "Rarity "
            r8.<init>(r13)
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.String r13 = r7.toString()
            com.lumina.monsterhunterfieldbook.MainActivity r7 = r0.a
            int r16 = r7.getMuted()
            r17 = 4
            r18 = 0
            r14 = 1092616192(0x41200000, float:10.0)
            r15 = 0
            android.widget.TextView r7 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r12, r13, r14, r15, r16, r17, r18)
            com.lumina.monsterhunterfieldbook.MainActivity r8 = r0.a
            r12 = 10
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Number r12 = (java.lang.Number) r12
            int r8 = r8.dp(r12)
            r7.setPadding(r8, r9, r9, r9)
            android.view.View r7 = (android.view.View) r7
            r6.addView(r7)
            android.view.View r6 = (android.view.View) r6
            r4.addView(r6)
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r0.a
            r7 = 5
            r6.gap(r4, r7)
            com.lumina.monsterhunterfieldbook.WeaponFlowLayout r6 = new com.lumina.monsterhunterfieldbook.WeaponFlowLayout
            com.lumina.monsterhunterfieldbook.MainActivity r7 = r0.a
            r8 = 7
            r12 = 3
            r6.<init>(r7, r8, r12)
            com.lumina.monsterhunterfieldbook.MainActivity r13 = r0.a
            java.lang.String r7 = "rank"
            java.lang.String r7 = r2.optString(r7)
            com.lumina.monsterhunterfieldbook.WeaponModel r8 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            java.lang.String r12 = "attack"
            java.lang.Object r12 = r2.opt(r12)
            java.lang.String r8 = r8.number(r12)
            com.lumina.monsterhunterfieldbook.WeaponModel r12 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            java.lang.String r14 = "affinity"
            java.lang.Object r2 = r2.opt(r14)
            java.lang.String r2 = r12.shown(r2)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.StringBuilder r7 = r12.append(r7)
            java.lang.String r12 = "  ·  Attack "
            java.lang.StringBuilder r7 = r7.append(r12)
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r8 = "  ·  Affinity "
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r2 = r7.append(r2)
            java.lang.String r7 = "%"
            java.lang.StringBuilder r2 = r2.append(r7)
            java.lang.String r14 = r2.toString()
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            int r17 = r2.getMuted()
            r18 = 4
            r19 = 0
            r15 = 1094713344(0x41400000, float:12.0)
            r16 = 0
            android.widget.TextView r2 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r13, r14, r15, r16, r17, r18, r19)
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r7 = new android.view.ViewGroup$LayoutParams
            r7.<init>(r10, r10)
            r6.addView(r2, r7)
            com.lumina.monsterhunterfieldbook.WeaponModel r2 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            java.util.List r2 = r2.elementNames(r1)
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L1d2
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r0.a
            int r16 = r12.getMuted()
            r17 = 4
            r18 = 0
            java.lang.String r13 = "·"
            r14 = 1094713344(0x41400000, float:12.0)
            r15 = 0
            android.widget.TextView r2 = com.lumina.monsterhunterfieldbook.MainActivity.text$default(r12, r13, r14, r15, r16, r17, r18)
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r7 = new android.view.ViewGroup$LayoutParams
            r7.<init>(r10, r10)
            r6.addView(r2, r7)
            com.lumina.monsterhunterfieldbook.WeaponModel r2 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            java.util.List r2 = r2.elements(r1)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L1a3:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L1d2
            java.lang.Object r7 = r2.next()
            kotlin.Pair r7 = (kotlin.Pair) r7
            java.lang.Object r8 = r7.component1()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r7.component2()
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            com.lumina.monsterhunterfieldbook.MainActivity r12 = r0.a
            r13 = 1094713344(0x41400000, float:12.0)
            int r14 = r12.getMuted()
            android.widget.LinearLayout r7 = com.lumina.monsterhunterfieldbook.WeaponProfilePanelKt.access$weaponElement(r12, r8, r7, r13, r14)
            android.view.View r7 = (android.view.View) r7
            android.view.ViewGroup$LayoutParams r8 = new android.view.ViewGroup$LayoutParams
            r8.<init>(r10, r10)
            r6.addView(r7, r8)
            goto L1a3
        L1d2:
            android.view.View r6 = (android.view.View) r6
            r4.addView(r6)
            android.view.View r4 = (android.view.View) r4
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r9, r10, r11)
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r0.a
            r7 = 12
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Number r7 = (java.lang.Number) r7
            int r6 = r6.dp(r7)
            r2.leftMargin = r6
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            android.view.ViewGroup$LayoutParams r2 = (android.view.ViewGroup.LayoutParams) r2
            r3.addView(r4, r2)
            com.lumina.monsterhunterfieldbook.WeaponModel r2 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            java.lang.String r2 = r2.rawId(r1)
            org.json.JSONObject r4 = r0.state
            java.lang.String r6 = "selected"
            java.lang.String r4 = r4.optString(r6)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            if (r2 == 0) goto L220
            com.lumina.monsterhunterfieldbook.MainActivity r6 = r0.a
            int r2 = r6.getAccent()
            int r7 = com.lumina.monsterhunterfieldbook.FieldViewsKt.alphaColour(r2, r5)
            r10 = 4
            r11 = 0
            r8 = 0
            r9 = 0
            android.graphics.drawable.GradientDrawable r2 = com.lumina.monsterhunterfieldbook.MainActivity.surface$default(r6, r7, r8, r9, r10, r11)
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            r3.setBackground(r2)
        L220:
            com.lumina.monsterhunterfieldbook.MainActivity r2 = r0.a
            android.view.View r3 = (android.view.View) r3
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda0 r4 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda0
            r4.<init>(r0, r1)
            r2.touch(r3, r4)
            return r3
    }

    private static final kotlin.Unit weaponRow$lambda$3(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r1, com.lumina.monsterhunterfieldbook.FieldRecord r2) {
            r1.capture()
            r1.hideKeyboard()
            com.lumina.monsterhunterfieldbook.WeaponModel r0 = com.lumina.monsterhunterfieldbook.WeaponModel.INSTANCE
            java.lang.String r2 = r0.rawId(r2)
            java.lang.String r0 = "rawId(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r1.select(r2)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    public final boolean back() {
            r8 = this;
            r8.capture()
            org.json.JSONObject r0 = r8.state
            java.lang.String r1 = "tab"
            java.lang.String r0 = r0.optString(r1)
            java.lang.String r2 = "tree"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            java.lang.String r3 = "treeDetails"
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L34
            org.json.JSONObject r0 = r8.state
            boolean r0 = r0.optBoolean(r3)
            if (r0 == 0) goto L34
            com.lumina.monsterhunterfieldbook.WeaponTreePanel r0 = r8.treePanel
            if (r0 == 0) goto L2a
            boolean r0 = r0.closeMaterials()
            if (r0 != r5) goto L2a
            return r5
        L2a:
            org.json.JSONObject r0 = r8.state
            r0.put(r3, r4)
            r0 = 0
            render$default(r8, r4, r5, r0)
            return r5
        L34:
            org.json.JSONObject r0 = r8.state
            java.lang.String r6 = "detail"
            boolean r0 = r0.optBoolean(r6)
            if (r0 == 0) goto Le8
            org.json.JSONArray r0 = r8.trail()
            int r7 = r0.length()
            if (r7 <= 0) goto Lb2
            int r1 = r0.length()
            int r1 = r1 - r5
            org.json.JSONObject r1 = r0.getJSONObject(r1)
            int r2 = r0.length()
            int r2 = r2 - r5
            r0.remove(r2)
            org.json.JSONArray r2 = new org.json.JSONArray
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            org.json.JSONObject r0 = r8.state
            java.util.Iterator r0 = r0.keys()
            java.lang.String r3 = "keys(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.asSequence(r0)
            java.util.List r0 = kotlin.sequences.SequencesKt.toList(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L7b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L8d
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            org.json.JSONObject r6 = r8.state
            r6.remove(r4)
            goto L7b
        L8d:
            java.util.Iterator r0 = r1.keys()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
        L94:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Laa
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            org.json.JSONObject r4 = r8.state
            java.lang.Object r6 = r1.opt(r3)
            r4.put(r3, r6)
            goto L94
        Laa:
            org.json.JSONObject r0 = r8.state
            java.lang.String r1 = "_trail"
            r0.put(r1, r2)
            goto Ldf
        Lb2:
            org.json.JSONObject r0 = r8.state
            java.lang.String r7 = "detailOrigin"
            java.lang.String r0 = r0.optString(r7)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r0 == 0) goto Ld4
            org.json.JSONObject r0 = r8.state
            org.json.JSONObject r0 = r0.put(r1, r2)
            org.json.JSONObject r0 = r0.put(r6, r4)
            java.lang.Object r1 = org.json.JSONObject.NULL
            org.json.JSONObject r0 = r0.put(r7, r1)
            r0.put(r3, r5)
            goto Ldf
        Ld4:
            org.json.JSONObject r0 = r8.state
            org.json.JSONObject r0 = r0.put(r6, r4)
            java.lang.Object r1 = org.json.JSONObject.NULL
            r0.put(r7, r1)
        Ldf:
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda17 r0 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$$ExternalSyntheticLambda17
            r0.<init>(r8)
            r8.transitionContent(r5, r0)
            return r5
        Le8:
            return r4
    }

    public final com.lumina.monsterhunterfieldbook.FieldRecord getGuide() {
            r1 = this;
            com.lumina.monsterhunterfieldbook.FieldRecord r0 = r1.guide
            return r0
    }

    public final java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> getRecords() {
            r1 = this;
            java.util.List<com.lumina.monsterhunterfieldbook.FieldRecord> r0 = r1.records
            return r0
    }

    public final org.json.JSONObject getState() {
            r1 = this;
            org.json.JSONObject r0 = r1.state
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            r2.capture()
            r2.saveFilters()
            android.animation.ValueAnimator r0 = r2.contentAnimation
            if (r0 == 0) goto Ld
            r0.cancel()
        Ld:
            android.os.Handler r0 = r2.handler
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            super.onDetachedFromWindow()
            return
    }

    public final org.json.JSONObject snapshot() {
            r2 = this;
            r2.capture()
            r2.saveFilters()
            org.json.JSONObject r0 = new org.json.JSONObject
            org.json.JSONObject r1 = r2.state
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            return r0
    }
}
