package com.lumina.monsterhunterfieldbook;

import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.FrameLayout;
import kotlin.Metadata;
import org.json.JSONObject;

/* compiled from: WeaponProfilePanel.kt */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J*\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u000e"}, d2 = {"com/lumina/monsterhunterfieldbook/WeaponProfilePanel$renderDatabase$14", "Landroid/text/TextWatcher;", "beforeTextChanged", "", "s", "", "start", "", "count", "after", "onTextChanged", "before", "afterTextChanged", "Landroid/text/Editable;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WeaponProfilePanel$renderDatabase$14 implements TextWatcher {
    final /* synthetic */ FrameLayout $clear;
    final /* synthetic */ WeaponProfilePanel this$0;

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable s) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    WeaponProfilePanel$renderDatabase$14(WeaponProfilePanel weaponProfilePanel, FrameLayout frameLayout) {
        this.this$0 = weaponProfilePanel;
        this.$clear = frameLayout;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        Runnable runnable;
        Handler handler;
        Handler handler2;
        JSONObject state = this.this$0.getState();
        String obj = s != null ? s.toString() : null;
        if (obj == null) {
            obj = "";
        }
        state.put("q", obj).put("limit", 40).put("listPosition", 0).put("listTop", 0);
        this.$clear.setVisibility((s == null || s.length() == 0) ? 8 : 0);
        runnable = this.this$0.pending;
        if (runnable != null) {
            handler2 = this.this$0.handler;
            handler2.removeCallbacks(runnable);
        }
        final WeaponProfilePanel weaponProfilePanel = this.this$0;
        Runnable runnable2 = new Runnable() { // from class: com.lumina.monsterhunterfieldbook.WeaponProfilePanel$renderDatabase$14$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                WeaponProfilePanel.access$updateRows(WeaponProfilePanel.this, true);
            }
        };
        this.this$0.pending = runnable2;
        handler = this.this$0.handler;
        handler.postDelayed(runnable2, 80L);
    }
}
