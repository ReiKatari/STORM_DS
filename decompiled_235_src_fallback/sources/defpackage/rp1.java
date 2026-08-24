package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rp1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class rp1 implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ rp1(defpackage.j97 r1, android.view.View r2) {
            r0 = this;
            r2 = 1
            r0.a = r2
            r0.<init>()
            r0.b = r1
            return
    }

    public /* synthetic */ rp1(defpackage.vp1 r2) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            r1.b = r2
            return
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator r2) {
            r1 = this;
            int r0 = r1.a
            java.lang.Object r1 = r1.b
            switch(r0) {
                case 0: goto L19;
                default: goto L7;
            }
        L7:
            j97 r1 = (defpackage.j97) r1
            java.lang.Object r1 = r1.B
            nt7 r1 = (defpackage.nt7) r1
            androidx.appcompat.widget.ActionBarContainer r1 = r1.o
            android.view.ViewParent r1 = r1.getParent()
            android.view.View r1 = (android.view.View) r1
            r1.invalidate()
            return
        L19:
            vp1 r1 = (defpackage.vp1) r1
            java.lang.Object r2 = r2.getAnimatedValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            com.google.android.material.internal.CheckableImageButton r1 = r1.d
            r1.setAlpha(r2)
            return
    }
}
