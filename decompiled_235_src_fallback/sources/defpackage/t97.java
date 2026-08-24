package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t97  reason: default package */
/* loaded from: classes.dex */
public final class t97 extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public t97(defpackage.au7 r2, android.view.View r3) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.b = r2
            r1.c = r3
            r1.<init>()
            return
    }

    public t97(defpackage.ea7 r2, defpackage.wu r3) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.c = r2
            r1.b = r3
            r1.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r3) {
            r2 = this;
            int r0 = r2.a
            java.lang.Object r1 = r2.c
            java.lang.Object r2 = r2.b
            switch(r0) {
                case 0: goto L18;
                default: goto L9;
            }
        L9:
            au7 r2 = (defpackage.au7) r2
            r3 = 1065353216(0x3f800000, float:1.0)
            zt7 r0 = r2.a
            r0.e(r3)
            android.view.View r1 = (android.view.View) r1
            defpackage.wt7.f(r2, r1)
            return
        L18:
            wu r2 = (defpackage.wu) r2
            r2.remove(r3)
            ea7 r1 = (defpackage.ea7) r1
            java.util.ArrayList r2 = r1.j0
            r2.remove(r3)
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator r2) {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.onAnimationStart(r2)
            return
        L9:
            java.lang.Object r1 = r1.c
            ea7 r1 = (defpackage.ea7) r1
            java.util.ArrayList r1 = r1.j0
            r1.add(r2)
            return
    }
}
