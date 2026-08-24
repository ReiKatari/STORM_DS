package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ge1  reason: default package */
/* loaded from: classes.dex */
public final class ge1 extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ defpackage.wg5 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ android.view.View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ android.view.ViewPropertyAnimator e;
    public final /* synthetic */ defpackage.ke1 f;

    public ge1(defpackage.ke1 r1, defpackage.wg5 r2, int r3, android.view.View r4, int r5, android.view.ViewPropertyAnimator r6) {
            r0 = this;
            r0.f = r1
            r0.a = r2
            r0.b = r3
            r0.c = r4
            r0.d = r5
            r0.e = r6
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator r3) {
            r2 = this;
            int r3 = r2.b
            r0 = 0
            android.view.View r1 = r2.c
            if (r3 == 0) goto La
            r1.setTranslationX(r0)
        La:
            int r2 = r2.d
            if (r2 == 0) goto L11
            r1.setTranslationY(r0)
        L11:
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r2) {
            r1 = this;
            android.view.ViewPropertyAnimator r2 = r1.e
            r0 = 0
            r2.setListener(r0)
            ke1 r2 = r1.f
            wg5 r1 = r1.a
            r2.c(r1)
            java.util.ArrayList r0 = r2.p
            r0.remove(r1)
            r2.i()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator r1) {
            r0 = this;
            ke1 r0 = r0.f
            r0.getClass()
            return
    }
}
