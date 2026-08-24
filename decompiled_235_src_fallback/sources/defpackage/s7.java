package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s7  reason: default package */
/* loaded from: classes.dex */
public final class s7 extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ s7(java.lang.Object r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    public s7(defpackage.kp7 r1, android.view.View r2) {
            r0 = this;
            r2 = 9
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator r3) {
            r2 = this;
            int r0 = r2.a
            java.lang.Object r1 = r2.b
            switch(r0) {
                case 0: goto L11;
                case 9: goto Lb;
                default: goto L7;
            }
        L7:
            super.onAnimationCancel(r3)
            return
        Lb:
            kp7 r1 = (defpackage.kp7) r1
            r1.a()
            return
        L11:
            androidx.appcompat.widget.ActionBarOverlayLayout r1 = (androidx.appcompat.widget.ActionBarOverlayLayout) r1
            r2 = 0
            r1.v0 = r2
            r2 = 0
            r1.i0 = r2
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r6) {
            r5 = this;
            int r0 = r5.a
            r1 = 0
            r2 = 5
            r3 = 0
            java.lang.Object r4 = r5.b
            switch(r0) {
                case 0: goto L92;
                case 1: goto L70;
                case 2: goto L55;
                case 3: goto L4a;
                case 4: goto L45;
                case 5: goto L40;
                case 6: goto L34;
                case 7: goto L19;
                case 8: goto L10;
                default: goto La;
            }
        La:
            kp7 r4 = (defpackage.kp7) r4
            r4.c()
            return
        L10:
            ea7 r4 = (defpackage.ea7) r4
            r4.n()
            r6.removeListener(r5)
            return
        L19:
            com.google.android.material.sidesheet.SideSheetBehavior r4 = (com.google.android.material.sidesheet.SideSheetBehavior) r4
            r4.w(r2)
            java.lang.ref.WeakReference r5 = r4.p
            if (r5 == 0) goto L33
            java.lang.Object r5 = r5.get()
            if (r5 == 0) goto L33
            java.lang.ref.WeakReference r5 = r4.p
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            r5.requestLayout()
        L33:
            return
        L34:
            v14 r4 = (defpackage.v14) r4
            android.view.View r5 = r4.b
            r6 = 0
            r5.setTranslationY(r6)
            r4.b(r6)
            return
        L40:
            com.google.android.material.behavior.HideViewOnScrollBehavior r4 = (com.google.android.material.behavior.HideViewOnScrollBehavior) r4
            r4.k = r3
            return
        L45:
            com.google.android.material.behavior.HideBottomViewOnScrollBehavior r4 = (com.google.android.material.behavior.HideBottomViewOnScrollBehavior) r4
            r4.k = r3
            return
        L4a:
            vp1 r4 = (defpackage.vp1) r4
            r4.p()
            android.animation.ValueAnimator r5 = r4.r
            r5.start()
            return
        L55:
            com.google.android.material.bottomsheet.BottomSheetBehavior r4 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r4
            r4.J(r2)
            java.lang.ref.WeakReference r5 = r4.W
            if (r5 == 0) goto L6f
            java.lang.Object r5 = r5.get()
            if (r5 == 0) goto L6f
            java.lang.ref.WeakReference r5 = r4.W
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            r5.requestLayout()
        L6f:
            return
        L70:
            java.util.ArrayList r5 = new java.util.ArrayList
            eo r4 = (defpackage.eo) r4
            java.util.ArrayList r6 = r4.X
            r5.<init>(r6)
            int r6 = r5.size()
        L7d:
            if (r1 >= r6) goto L91
            java.lang.Object r0 = r5.get(r1)
            g24 r0 = (defpackage.g24) r0
            i24 r0 = r0.b
            android.content.res.ColorStateList r0 = r0.n0
            if (r0 == 0) goto L8e
            r4.setTintList(r0)
        L8e:
            int r1 = r1 + 1
            goto L7d
        L91:
            return
        L92:
            androidx.appcompat.widget.ActionBarOverlayLayout r4 = (androidx.appcompat.widget.ActionBarOverlayLayout) r4
            r4.v0 = r3
            r4.i0 = r1
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator r4) {
            r3 = this;
            int r0 = r3.a
            java.lang.Object r1 = r3.b
            switch(r0) {
                case 1: goto L11;
                case 9: goto Lb;
                default: goto L7;
            }
        L7:
            super.onAnimationStart(r4)
            return
        Lb:
            kp7 r1 = (defpackage.kp7) r1
            r1.b()
            return
        L11:
            java.util.ArrayList r3 = new java.util.ArrayList
            eo r1 = (defpackage.eo) r1
            java.util.ArrayList r4 = r1.X
            r3.<init>(r4)
            int r4 = r3.size()
            r0 = 0
        L1f:
            if (r0 >= r4) goto L2d
            java.lang.Object r2 = r3.get(r0)
            g24 r2 = (defpackage.g24) r2
            r2.a(r1)
            int r0 = r0 + 1
            goto L1f
        L2d:
            return
    }
}
