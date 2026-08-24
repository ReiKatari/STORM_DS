package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g92  reason: default package */
/* loaded from: classes.dex */
public final class g92 extends android.animation.AnimatorListenerAdapter implements defpackage.da7 {
    public final android.view.View a;
    public boolean b;

    public g92(android.view.View r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.b = r0
            r1.a = r2
            return
    }

    @Override // defpackage.da7
    public final void a(defpackage.ea7 r1) {
            r0 = this;
            return
    }

    @Override // defpackage.da7
    public final void b() {
            r2 = this;
            android.view.View r2 = r2.a
            int r0 = r2.getVisibility()
            if (r0 != 0) goto Lf
            gq7 r0 = defpackage.dq7.a
            float r0 = r0.K(r2)
            goto L10
        Lf:
            r0 = 0
        L10:
            r1 = 2131428028(0x7f0b02bc, float:1.8477689E38)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.setTag(r1, r0)
            return
    }

    @Override // defpackage.da7
    public final void c(defpackage.ea7 r1) {
            r0 = this;
            return
    }

    @Override // defpackage.da7
    public final void d(defpackage.ea7 r1) {
            r0 = this;
            return
    }

    @Override // defpackage.da7
    public final void e() {
            r2 = this;
            r0 = 2131428028(0x7f0b02bc, float:1.8477689E38)
            r1 = 0
            android.view.View r2 = r2.a
            r2.setTag(r0, r1)
            return
    }

    @Override // defpackage.da7
    public final void f(defpackage.ea7 r1) {
            r0 = this;
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator r2) {
            r1 = this;
            r2 = 1065353216(0x3f800000, float:1.0)
            gq7 r0 = defpackage.dq7.a
            android.view.View r1 = r1.a
            r0.Y(r1, r2)
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r2) {
            r1 = this;
            r0 = 0
            r1.onAnimationEnd(r2, r0)
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r2, boolean r3) {
            r1 = this;
            boolean r2 = r1.b
            android.view.View r1 = r1.a
            if (r2 == 0) goto Lb
            r2 = 0
            r0 = 0
            r1.setLayerType(r2, r0)
        Lb:
            if (r3 != 0) goto L17
            gq7 r2 = defpackage.dq7.a
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.Y(r1, r3)
            r2.getClass()
        L17:
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator r2) {
            r1 = this;
            android.view.View r2 = r1.a
            boolean r0 = r2.hasOverlappingRendering()
            if (r0 == 0) goto L16
            int r0 = r2.getLayerType()
            if (r0 != 0) goto L16
            r0 = 1
            r1.b = r0
            r1 = 2
            r0 = 0
            r2.setLayerType(r1, r0)
        L16:
            return
    }
}
