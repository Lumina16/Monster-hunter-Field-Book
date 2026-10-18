package com.lumina.monsterhunterfieldbook;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/lumina/monsterhunterfieldbook/MainActivity$showIntro$3$1$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "a", "Landroid/animation/Animator;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MainActivity$showIntro$3$1$2 extends AnimatorListenerAdapter {
    final /* synthetic */ FrameLayout $cover;
    final /* synthetic */ MainActivity this$0;

    MainActivity$showIntro$3$1$2(MainActivity mainActivity, FrameLayout frameLayout) {
        this.this$0 = mainActivity;
        this.$cover = frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAnimationEnd$lambda$0(MainActivity mainActivity, FrameLayout frameLayout) {
        boolean z;
        FieldAudio fieldAudio;
        z = mainActivity.destroyed;
        if (z) {
            return;
        }
        mainActivity.getRoot().removeView(frameLayout);
        FieldAudio fieldAudio2 = null;
        mainActivity.introView = null;
        mainActivity.introDone = true;
        fieldAudio = mainActivity.audio;
        if (fieldAudio == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audio");
        } else {
            fieldAudio2 = fieldAudio;
        }
        fieldAudio2.introductionFinished();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator a) {
        boolean z;
        Intrinsics.checkNotNullParameter(a, "a");
        z = this.this$0.destroyed;
        if (z) {
            return;
        }
        ViewPropertyAnimator duration = this.$cover.animate().alpha(0.0f).setDuration(600L);
        final MainActivity mainActivity = this.this$0;
        final FrameLayout frameLayout = this.$cover;
        duration.withEndAction(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$showIntro$3$1$2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity$showIntro$3$1$2.onAnimationEnd$lambda$0(MainActivity.this, frameLayout);
            }
        }).start();
    }
}
