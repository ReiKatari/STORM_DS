package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tq7  reason: default package */
/* loaded from: classes.dex */
public final class tq7 extends android.animation.AnimatorListenerAdapter implements defpackage.da7 {
    public final android.view.ViewGroup a;
    public final android.view.View b;
    public final android.view.View c;
    public boolean d;
    public final /* synthetic */ defpackage.h92 e;

    public tq7(defpackage.h92 r1, android.view.ViewGroup r2, android.view.View r3, android.view.View r4) {
            r0 = this;
            r0.e = r1
            r0.<init>()
            r1 = 1
            r0.d = r1
            r0.a = r2
            r0.b = r3
            r0.c = r4
            return
    }

    @Override // defpackage.da7
    public final void a(defpackage.ea7 r1) {
            r0 = this;
            r1.D(r0)
            return
    }

    @Override // defpackage.da7
    public final void b() {
            r0 = this;
            return
    }

    @Override // defpackage.da7
    public final void c(defpackage.ea7 r1) {
            r0 = this;
            return
    }

    @Override // defpackage.da7
    public final void e() {
            r0 = this;
            return
    }

    @Override // defpackage.da7
    public final void f(defpackage.ea7 r1) {
            r0 = this;
            boolean r1 = r0.d
            if (r1 == 0) goto L7
            r0.g()
        L7:
            return
    }

    public final void g() {
            r3 = this;
            r0 = 2131427852(0x7f0b020c, float:1.8477332E38)
            r1 = 0
            android.view.View r2 = r3.c
            r2.setTag(r0, r1)
            android.view.ViewGroup r0 = r3.a
            android.view.ViewGroupOverlay r0 = r0.getOverlay()
            android.view.View r1 = r3.b
            r0.remove(r1)
            r0 = 0
            r3.d = r0
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r1) {
            r0 = this;
            r0.g()
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r1, boolean r2) {
            r0 = this;
            if (r2 != 0) goto L5
            r0.g()
        L5:
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(android.animation.Animator r1) {
            r0 = this;
            android.view.ViewGroup r1 = r0.a
            android.view.ViewGroupOverlay r1 = r1.getOverlay()
            android.view.View r0 = r0.b
            r1.remove(r0)
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(android.animation.Animator r2) {
            r1 = this;
            android.view.View r2 = r1.b
            android.view.ViewParent r0 = r2.getParent()
            if (r0 != 0) goto Le
            android.view.ViewGroup r1 = r1.a
            defpackage.ao7.a(r2, r1)
            return
        Le:
            h92 r1 = r1.e
            r1.cancel()
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator r2, boolean r3) {
            r1 = this;
            if (r3 == 0) goto L14
            android.view.View r2 = r1.c
            r3 = 2131427852(0x7f0b020c, float:1.8477332E38)
            android.view.View r0 = r1.b
            r2.setTag(r3, r0)
            android.view.ViewGroup r2 = r1.a
            defpackage.ao7.a(r0, r2)
            r2 = 1
            r1.d = r2
        L14:
            return
    }
}
