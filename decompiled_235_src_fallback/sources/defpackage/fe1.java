package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fe1  reason: default package */
/* loaded from: classes.dex */
public final class fe1 extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.wg5 b;
    public final /* synthetic */ android.view.View c;
    public final /* synthetic */ android.view.ViewPropertyAnimator d;
    public final /* synthetic */ defpackage.ke1 e;

    public fe1(defpackage.ke1 r2, defpackage.wg5 r3, android.view.View r4, android.view.ViewPropertyAnimator r5) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.e = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            r1.<init>()
            return
    }

    public fe1(defpackage.ke1 r2, defpackage.wg5 r3, android.view.ViewPropertyAnimator r4, android.view.View r5) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.e = r2
            r1.b = r3
            r1.d = r4
            r1.c = r5
            r1.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator r2) {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.onAnimationCancel(r2)
            return
        L9:
            android.view.View r1 = r1.c
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r2)
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r5) {
            r4 = this;
            int r5 = r4.a
            wg5 r0 = r4.b
            ke1 r1 = r4.e
            r2 = 0
            android.view.ViewPropertyAnimator r3 = r4.d
            switch(r5) {
                case 0: goto L1b;
                default: goto Lc;
            }
        Lc:
            r3.setListener(r2)
            r1.c(r0)
            java.util.ArrayList r4 = r1.o
            r4.remove(r0)
            r1.i()
            return
        L1b:
            r3.setListener(r2)
            android.view.View r4 = r4.c
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.setAlpha(r5)
            r1.c(r0)
            java.util.ArrayList r4 = r1.q
            r4.remove(r0)
            r1.i()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator r1) {
            r0 = this;
            int r1 = r0.a
            switch(r1) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            ke1 r0 = r0.e
            r0.getClass()
            return
        Lb:
            ke1 r0 = r0.e
            r0.getClass()
            return
    }
}
