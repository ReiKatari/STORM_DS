package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q24  reason: default package */
/* loaded from: classes.dex */
public final class q24 extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ defpackage.r24 c;

    public q24(defpackage.r24 r1, boolean r2, int r3) {
            r0 = this;
            r0.c = r1
            r0.a = r2
            r0.b = r3
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r3) {
            r2 = this;
            r24 r3 = r2.c
            android.view.View r0 = r3.b
            r1 = 0
            r0.setTranslationX(r1)
            boolean r0 = r2.a
            int r2 = r2.b
            r3.a(r1, r2, r0)
            return
    }
}
