package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tq0  reason: default package */
/* loaded from: classes.dex */
public final class tq0 implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ defpackage.vq0 a;
    public final /* synthetic */ defpackage.wq0 b;

    public tq0(defpackage.wq0 r1, defpackage.vq0 r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.a = r2
            return
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator r3) {
            r2 = this;
            java.lang.Object r3 = r3.getAnimatedValue()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            vq0 r0 = r2.a
            defpackage.wq0.d(r3, r0)
            r1 = 0
            wq0 r2 = r2.b
            r2.a(r3, r0, r1)
            r2.invalidateSelf()
            return
    }
}
