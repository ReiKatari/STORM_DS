package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t92  reason: default package */
/* loaded from: classes.dex */
public final class t92 extends android.animation.AnimatorListenerAdapter {
    public boolean a;
    public final /* synthetic */ defpackage.u92 b;

    public t92(defpackage.u92 r1) {
            r0 = this;
            r0.b = r1
            r0.<init>()
            r1 = 0
            r0.a = r1
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator r1) {
            r0 = this;
            r1 = 1
            r0.a = r1
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r3) {
            r2 = this;
            boolean r3 = r2.a
            r0 = 0
            if (r3 == 0) goto L8
            r2.a = r0
            return
        L8:
            u92 r2 = r2.b
            android.animation.ValueAnimator r3 = r2.z
            java.lang.Object r3 = r3.getAnimatedValue()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r1 = 0
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 != 0) goto L21
            r2.A = r0
            r2.g(r0)
            return
        L21:
            r3 = 2
            r2.A = r3
            androidx.recyclerview.widget.RecyclerView r2 = r2.s
            r2.invalidate()
            return
    }
}
