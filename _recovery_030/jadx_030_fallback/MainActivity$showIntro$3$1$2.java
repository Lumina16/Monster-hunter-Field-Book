package com.lumina.monsterhunterfieldbook;

/* compiled from: MainActivity.kt */
@kotlin.Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/lumina/monsterhunterfieldbook/MainActivity$showIntro$3$1$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "a", "Landroid/animation/Animator;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MainActivity$showIntro$3$1$2 extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ android.widget.FrameLayout $cover;
    final /* synthetic */ com.lumina.monsterhunterfieldbook.MainActivity this$0;

    public static /* synthetic */ void $r8$lambda$XNZJQcipY4ghZnbmHbCTMrLwvtg(com.lumina.monsterhunterfieldbook.MainActivity r0, android.widget.FrameLayout r1) {
            onAnimationEnd$lambda$0(r0, r1)
            return
    }

    MainActivity$showIntro$3$1$2(com.lumina.monsterhunterfieldbook.MainActivity r1, android.widget.FrameLayout r2) {
            r0 = this;
            r0.this$0 = r1
            r0.$cover = r2
            r0.<init>()
            return
    }

    private static final void onAnimationEnd$lambda$0(com.lumina.monsterhunterfieldbook.MainActivity r1, android.widget.FrameLayout r2) {
            boolean r0 = com.lumina.monsterhunterfieldbook.MainActivity.access$getDestroyed$p(r1)
            if (r0 != 0) goto L27
            android.widget.FrameLayout r0 = r1.getRoot()
            android.view.View r2 = (android.view.View) r2
            r0.removeView(r2)
            r2 = 0
            com.lumina.monsterhunterfieldbook.MainActivity.access$setIntroView$p(r1, r2)
            r0 = 1
            com.lumina.monsterhunterfieldbook.MainActivity.access$setIntroDone$p(r1, r0)
            com.lumina.monsterhunterfieldbook.FieldAudio r1 = com.lumina.monsterhunterfieldbook.MainActivity.access$getAudio$p(r1)
            if (r1 != 0) goto L23
            java.lang.String r1 = "audio"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            goto L24
        L23:
            r2 = r1
        L24:
            r2.introductionFinished()
        L27:
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator r4) {
            r3 = this;
            java.lang.String r0 = "a"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            com.lumina.monsterhunterfieldbook.MainActivity r4 = r3.this$0
            boolean r4 = com.lumina.monsterhunterfieldbook.MainActivity.access$getDestroyed$p(r4)
            if (r4 == 0) goto Le
            return
        Le:
            android.widget.FrameLayout r4 = r3.$cover
            android.view.ViewPropertyAnimator r4 = r4.animate()
            r0 = 0
            android.view.ViewPropertyAnimator r4 = r4.alpha(r0)
            r0 = 600(0x258, double:2.964E-321)
            android.view.ViewPropertyAnimator r4 = r4.setDuration(r0)
            com.lumina.monsterhunterfieldbook.MainActivity r0 = r3.this$0
            android.widget.FrameLayout r1 = r3.$cover
            com.lumina.monsterhunterfieldbook.MainActivity$showIntro$3$1$2$$ExternalSyntheticLambda0 r2 = new com.lumina.monsterhunterfieldbook.MainActivity$showIntro$3$1$2$$ExternalSyntheticLambda0
            r2.<init>(r0, r1)
            android.view.ViewPropertyAnimator r4 = r4.withEndAction(r2)
            r4.start()
            return
    }
}
