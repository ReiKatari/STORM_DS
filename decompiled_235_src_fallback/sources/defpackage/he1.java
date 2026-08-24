package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: he1  reason: default package */
/* loaded from: classes.dex */
public final class he1 extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.ie1 b;
    public final /* synthetic */ android.view.ViewPropertyAnimator c;
    public final /* synthetic */ android.view.View d;
    public final /* synthetic */ defpackage.ke1 e;

    public /* synthetic */ he1(defpackage.ke1 r1, defpackage.ie1 r2, android.view.ViewPropertyAnimator r3, android.view.View r4, int r5) {
            r0 = this;
            r0.a = r5
            r0.e = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r7) {
            r6 = this;
            int r7 = r6.a
            ie1 r0 = r6.b
            ke1 r1 = r6.e
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            android.view.View r4 = r6.d
            r5 = 0
            android.view.ViewPropertyAnimator r6 = r6.c
            switch(r7) {
                case 0: goto L2d;
                default: goto L11;
            }
        L11:
            r6.setListener(r5)
            r4.setAlpha(r3)
            r4.setTranslationX(r2)
            r4.setTranslationY(r2)
            wg5 r6 = r0.b
            r1.c(r6)
            java.util.ArrayList r6 = r1.r
            wg5 r7 = r0.b
            r6.remove(r7)
            r1.i()
            return
        L2d:
            r6.setListener(r5)
            r4.setAlpha(r3)
            r4.setTranslationX(r2)
            r4.setTranslationY(r2)
            wg5 r6 = r0.a
            r1.c(r6)
            java.util.ArrayList r6 = r1.r
            wg5 r7 = r0.a
            r6.remove(r7)
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
