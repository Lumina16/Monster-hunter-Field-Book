package com.lumina.monsterhunterfieldbook;

/* compiled from: WeaponProfilePanel.kt */
@kotlin.Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J*\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u000e"}, d2 = {"com/lumina/monsterhunterfieldbook/WeaponProfilePanel$renderDatabase$14", "Landroid/text/TextWatcher;", "beforeTextChanged", "", "s", "", "start", "", "count", "after", "onTextChanged", "before", "afterTextChanged", "Landroid/text/Editable;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WeaponProfilePanel$renderDatabase$14 implements android.text.TextWatcher {
    final /* synthetic */ android.widget.FrameLayout $clear;
    final /* synthetic */ com.lumina.monsterhunterfieldbook.WeaponProfilePanel this$0;

    /* renamed from: $r8$lambda$-1zrnl5fYue4zKE1wy-zlJGyZXQ, reason: not valid java name */
    public static /* synthetic */ void m70$r8$lambda$1zrnl5fYue4zKE1wyzlJGyZXQ(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r0) {
            onTextChanged$lambda$1(r0)
            return
    }

    WeaponProfilePanel$renderDatabase$14(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r1, android.widget.FrameLayout r2) {
            r0 = this;
            r0.this$0 = r1
            r0.$clear = r2
            r0.<init>()
            return
    }

    private static final void onTextChanged$lambda$1(com.lumina.monsterhunterfieldbook.WeaponProfilePanel r1) {
            r0 = 1
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel.access$updateRows(r1, r0)
            return
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable r1) {
            r0 = this;
            return
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel r2 = r0.this$0
            org.json.JSONObject r2 = r2.getState()
            if (r1 == 0) goto Ld
            java.lang.String r3 = r1.toString()
            goto Le
        Ld:
            r3 = 0
        Le:
            if (r3 != 0) goto L12
            java.lang.String r3 = ""
        L12:
            java.lang.String r4 = "q"
            org.json.JSONObject r2 = r2.put(r4, r3)
            java.lang.String r3 = "limit"
            r4 = 40
            org.json.JSONObject r2 = r2.put(r3, r4)
            java.lang.String r3 = "listPosition"
            r4 = 0
            org.json.JSONObject r2 = r2.put(r3, r4)
            java.lang.String r3 = "listTop"
            r2.put(r3, r4)
            android.widget.FrameLayout r2 = r0.$clear
            if (r1 == 0) goto L36
            int r1 = r1.length()
            if (r1 != 0) goto L38
        L36:
            r4 = 8
        L38:
            r2.setVisibility(r4)
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel r1 = r0.this$0
            java.lang.Runnable r1 = com.lumina.monsterhunterfieldbook.WeaponProfilePanel.access$getPending$p(r1)
            if (r1 == 0) goto L4c
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel r2 = r0.this$0
            android.os.Handler r2 = com.lumina.monsterhunterfieldbook.WeaponProfilePanel.access$getHandler$p(r2)
            r2.removeCallbacks(r1)
        L4c:
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel r1 = r0.this$0
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel$renderDatabase$14$$ExternalSyntheticLambda0 r2 = new com.lumina.monsterhunterfieldbook.WeaponProfilePanel$renderDatabase$14$$ExternalSyntheticLambda0
            r2.<init>(r1)
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel r1 = r0.this$0
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel.access$setPending$p(r1, r2)
            com.lumina.monsterhunterfieldbook.WeaponProfilePanel r1 = r0.this$0
            android.os.Handler r1 = com.lumina.monsterhunterfieldbook.WeaponProfilePanel.access$getHandler$p(r1)
            r3 = 80
            r1.postDelayed(r2, r3)
            return
    }
}
