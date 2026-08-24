package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uq0  reason: default package */
/* loaded from: classes.dex */
public final class uq0 implements android.animation.Animator.AnimatorListener {
    public final /* synthetic */ defpackage.vq0 a;
    public final /* synthetic */ defpackage.wq0 b;

    public uq0(defpackage.wq0 r1, defpackage.vq0 r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.a = r2
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator r1) {
            r0 = this;
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r1) {
            r0 = this;
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator r5) {
            r4 = this;
            wq0 r0 = r4.b
            r1 = 1065353216(0x3f800000, float:1.0)
            vq0 r4 = r4.a
            r2 = 1
            r0.a(r1, r4, r2)
            float r3 = r4.e
            r4.k = r3
            float r3 = r4.f
            r4.l = r3
            float r3 = r4.g
            r4.m = r3
            int r3 = r4.j
            int r3 = r3 + r2
            int[] r2 = r4.i
            int r2 = r2.length
            int r3 = r3 % r2
            r4.a(r3)
            boolean r2 = r0.Y
            if (r2 == 0) goto L39
            r1 = 0
            r0.Y = r1
            r5.cancel()
            r2 = 1332(0x534, double:6.58E-321)
            r5.setDuration(r2)
            r5.start()
            boolean r5 = r4.n
            if (r5 == 0) goto L38
            r4.n = r1
        L38:
            return
        L39:
            float r4 = r0.X
            float r4 = r4 + r1
            r0.X = r4
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator r1) {
            r0 = this;
            wq0 r0 = r0.b
            r1 = 0
            r0.X = r1
            return
    }
}
