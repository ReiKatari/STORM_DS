package com.google.android.material.behavior;

import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends android.view.View> extends defpackage.e51 {
    public defpackage.jx2 a;
    public android.view.accessibility.AccessibilityManager b;
    public defpackage.ix2 c;
    public final java.util.LinkedHashSet d;
    public int e;
    public int f;
    public android.animation.TimeInterpolator g;
    public android.animation.TimeInterpolator h;
    public int i;
    public int j;
    public android.view.ViewPropertyAnimator k;

    public HideViewOnScrollBehavior() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.d = r0
            r0 = 0
            r1.i = r0
            r0 = 2
            r1.j = r0
            return
    }

    public HideViewOnScrollBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.d = r1
            r1 = 0
            r0.i = r1
            r1 = 2
            r0.j = r1
            return
    }

    @Override // defpackage.e51
    public final boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout r5, android.view.View r6, int r7) {
            r4 = this;
            android.view.accessibility.AccessibilityManager r5 = r4.b
            if (r5 != 0) goto L12
            android.content.Context r5 = r6.getContext()
            java.lang.Class<android.view.accessibility.AccessibilityManager> r0 = android.view.accessibility.AccessibilityManager.class
            java.lang.Object r5 = r5.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r5 = (android.view.accessibility.AccessibilityManager) r5
            r4.b = r5
        L12:
            android.view.accessibility.AccessibilityManager r5 = r4.b
            r0 = 1
            if (r5 == 0) goto L2e
            ix2 r1 = r4.c
            if (r1 != 0) goto L2e
            ix2 r1 = new ix2
            r1.<init>(r4, r6, r0)
            r4.c = r1
            r5.addTouchExplorationStateChangeListener(r1)
            wh r5 = new wh
            r1 = 5
            r5.<init>(r4, r1)
            r6.addOnAttachStateChangeListener(r5)
        L2e:
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            h51 r1 = (defpackage.h51) r1
            int r1 = r1.c
            r2 = 80
            r3 = 0
            if (r1 == r2) goto L59
            r2 = 81
            if (r1 != r2) goto L46
            goto L59
        L46:
            int r7 = android.view.Gravity.getAbsoluteGravity(r1, r7)
            r0 = 3
            if (r7 == r0) goto L54
            r0 = 19
            if (r7 != r0) goto L52
            goto L54
        L52:
            r7 = r3
            goto L55
        L54:
            r7 = 2
        L55:
            r4.v(r7)
            goto L5c
        L59:
            r4.v(r0)
        L5c:
            jx2 r7 = r4.a
            int r7 = r7.a
            switch(r7) {
                case 0: goto L72;
                case 1: goto L6b;
                default: goto L63;
            }
        L63:
            int r7 = r6.getMeasuredWidth()
            int r5 = r5.rightMargin
        L69:
            int r7 = r7 + r5
            goto L79
        L6b:
            int r7 = r6.getMeasuredWidth()
            int r5 = r5.leftMargin
            goto L69
        L72:
            int r7 = r6.getMeasuredHeight()
            int r5 = r5.bottomMargin
            goto L69
        L79:
            r4.i = r7
            android.content.Context r5 = r6.getContext()
            r7 = 2130969523(0x7f0403b3, float:1.754773E38)
            r0 = 225(0xe1, float:3.15E-43)
            int r5 = defpackage.kj2.W(r5, r7, r0)
            r4.e = r5
            android.content.Context r5 = r6.getContext()
            r7 = 2130969529(0x7f0403b9, float:1.7547742E38)
            r0 = 175(0xaf, float:2.45E-43)
            int r5 = defpackage.kj2.W(r5, r7, r0)
            r4.f = r5
            android.content.Context r5 = r6.getContext()
            q92 r7 = defpackage.vo.d
            r0 = 2130969539(0x7f0403c3, float:1.7547763E38)
            android.animation.TimeInterpolator r5 = defpackage.kj2.X(r5, r0, r7)
            r4.g = r5
            android.content.Context r5 = r6.getContext()
            q92 r6 = defpackage.vo.c
            android.animation.TimeInterpolator r5 = defpackage.kj2.X(r5, r0, r6)
            r4.h = r5
            return r3
    }

    @Override // defpackage.e51
    public final void o(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, int r3, int r4, int r5, int[] r6) {
            r0 = this;
            if (r3 <= 0) goto L52
            int r1 = r0.j
            r3 = 1
            if (r1 != r3) goto L8
            goto L57
        L8:
            android.view.accessibility.AccessibilityManager r1 = r0.b
            if (r1 == 0) goto L13
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L13
            goto L57
        L13:
            android.view.ViewPropertyAnimator r1 = r0.k
            if (r1 == 0) goto L1d
            r1.cancel()
            r2.clearAnimation()
        L1d:
            r0.j = r3
            java.util.LinkedHashSet r1 = r0.d
            java.util.Iterator r1 = r1.iterator()
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto L4d
            int r1 = r0.i
            int r3 = r0.f
            long r3 = (long) r3
            android.animation.TimeInterpolator r5 = r0.h
            jx2 r6 = r0.a
            android.view.ViewPropertyAnimator r1 = r6.u(r2, r1)
            android.view.ViewPropertyAnimator r1 = r1.setInterpolator(r5)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r3)
            s7 r2 = new s7
            r3 = 5
            r2.<init>(r0, r3)
            android.view.ViewPropertyAnimator r1 = r1.setListener(r2)
            r0.k = r1
            return
        L4d:
            java.lang.ClassCastException r0 = defpackage.i61.j(r1)
            throw r0
        L52:
            if (r3 >= 0) goto L57
            r0.w(r2)
        L57:
            return
    }

    @Override // defpackage.e51
    public final boolean s(android.view.View r1, int r2, int r3) {
            r0 = this;
            r0 = 2
            if (r2 != r0) goto L5
            r0 = 1
            return r0
        L5:
            r0 = 0
            return r0
    }

    public final void v(int r5) {
            r4 = this;
            jx2 r0 = r4.a
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 == 0) goto L15
            int r0 = r0.a
            switch(r0) {
                case 0: goto L10;
                case 1: goto Le;
                default: goto Lc;
            }
        Lc:
            r0 = r1
            goto L11
        Le:
            r0 = r3
            goto L11
        L10:
            r0 = r2
        L11:
            if (r0 == r5) goto L14
            goto L15
        L14:
            return
        L15:
            if (r5 == 0) goto L37
            if (r5 == r2) goto L2f
            if (r5 != r3) goto L23
            jx2 r5 = new jx2
            r5.<init>(r2)
            r4.a = r5
            return
        L23:
            java.lang.String r4 = "Invalid view edge position value: "
            java.lang.String r0 = ". Must be 0, 1 or 2."
            java.lang.String r4 = defpackage.lb1.k(r4, r5, r0)
            defpackage.i.h(r4)
            return
        L2f:
            jx2 r5 = new jx2
            r5.<init>(r1)
            r4.a = r5
            return
        L37:
            jx2 r5 = new jx2
            r5.<init>(r3)
            r4.a = r5
            return
    }

    public final void w(android.view.View r6) {
            r5 = this;
            int r0 = r5.j
            r1 = 2
            if (r0 != r1) goto L6
            return
        L6:
            android.view.ViewPropertyAnimator r0 = r5.k
            if (r0 == 0) goto L10
            r0.cancel()
            r6.clearAnimation()
        L10:
            r5.j = r1
            java.util.LinkedHashSet r0 = r5.d
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L44
            jx2 r0 = r5.a
            r0.getClass()
            int r0 = r5.e
            long r0 = (long) r0
            android.animation.TimeInterpolator r2 = r5.g
            jx2 r3 = r5.a
            r4 = 0
            android.view.ViewPropertyAnimator r6 = r3.u(r6, r4)
            android.view.ViewPropertyAnimator r6 = r6.setInterpolator(r2)
            android.view.ViewPropertyAnimator r6 = r6.setDuration(r0)
            s7 r0 = new s7
            r1 = 5
            r0.<init>(r5, r1)
            android.view.ViewPropertyAnimator r6 = r6.setListener(r0)
            r5.k = r6
            return
        L44:
            java.lang.ClassCastException r5 = defpackage.i61.j(r0)
            throw r5
    }
}
