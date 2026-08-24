package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sq7  reason: default package */
/* loaded from: classes.dex */
public final class sq7 extends android.animation.AnimatorListenerAdapter implements defpackage.da7 {
    public final android.view.View a;
    public final int b;
    public final android.view.ViewGroup c;
    public final boolean d;
    public boolean e;
    public boolean f;

    public sq7(android.view.View r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f = r0
            r1.a = r2
            r1.b = r3
            android.view.ViewParent r2 = r2.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r1.c = r2
            r2 = 1
            r1.d = r2
            r1.g(r2)
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
            r1 = this;
            r0 = 0
            r1.g(r0)
            boolean r0 = r1.f
            if (r0 != 0) goto Lf
            android.view.View r0 = r1.a
            int r1 = r1.b
            defpackage.dq7.b(r0, r1)
        Lf:
            return
    }

    @Override // defpackage.da7
    public final void c(defpackage.ea7 r1) {
            r0 = this;
            return
    }

    @Override // defpackage.da7
    public final void e() {
            r1 = this;
            r0 = 1
            r1.g(r0)
            boolean r0 = r1.f
            if (r0 != 0) goto Le
            android.view.View r1 = r1.a
            r0 = 0
            defpackage.dq7.b(r1, r0)
        Le:
            return
    }

    @Override // defpackage.da7
    public final void f(defpackage.ea7 r1) {
            r0 = this;
            return
    }

    public final void g(boolean r2) {
            r1 = this;
            boolean r0 = r1.d
            if (r0 == 0) goto L11
            boolean r0 = r1.e
            if (r0 == r2) goto L11
            android.view.ViewGroup r0 = r1.c
            if (r0 == 0) goto L11
            r1.e = r2
            defpackage.ej2.W(r0, r2)
        L11:
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator r1) {
            r0 = this;
            r1 = 1
            r0.f = r1
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r2) {
            r1 = this;
            boolean r2 = r1.f
            if (r2 != 0) goto L12
            android.view.View r2 = r1.a
            int r0 = r1.b
            defpackage.dq7.b(r2, r0)
            android.view.ViewGroup r2 = r1.c
            if (r2 == 0) goto L12
            r2.invalidate()
        L12:
            r2 = 0
            r1.g(r2)
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r1, boolean r2) {
            r0 = this;
            if (r2 != 0) goto L18
            boolean r1 = r0.f
            if (r1 != 0) goto L14
            android.view.View r1 = r0.a
            int r2 = r0.b
            defpackage.dq7.b(r1, r2)
            android.view.ViewGroup r1 = r0.c
            if (r1 == 0) goto L14
            r1.invalidate()
        L14:
            r1 = 0
            r0.g(r1)
        L18:
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator r1) {
            r0 = this;
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator r1) {
            r0 = this;
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto Lf
            android.view.View r1 = r0.a
            r2 = 0
            defpackage.dq7.b(r1, r2)
            android.view.ViewGroup r0 = r0.c
            if (r0 == 0) goto Lf
            r0.invalidate()
        Lf:
            return
    }
}
