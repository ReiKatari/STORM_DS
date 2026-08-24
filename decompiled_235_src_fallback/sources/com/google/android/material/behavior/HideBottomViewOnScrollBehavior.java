package com.google.android.material.behavior;

import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@java.lang.Deprecated
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends android.view.View> extends defpackage.e51 {
    public final java.util.LinkedHashSet a;
    public int b;
    public int c;
    public android.animation.TimeInterpolator d;
    public android.animation.TimeInterpolator e;
    public int f;
    public android.view.accessibility.AccessibilityManager g;
    public defpackage.ix2 h;
    public final boolean i;
    public int j;
    public android.view.ViewPropertyAnimator k;

    public HideBottomViewOnScrollBehavior() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.a = r0
            r0 = 0
            r1.f = r0
            r0 = 1
            r1.i = r0
            r0 = 2
            r1.j = r0
            return
    }

    public HideBottomViewOnScrollBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.a = r1
            r1 = 0
            r0.f = r1
            r1 = 1
            r0.i = r1
            r1 = 2
            r0.j = r1
            return
    }

    @Override // defpackage.e51
    public boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, int r4) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r4 = r3.getMeasuredHeight()
            int r2 = r2.bottomMargin
            int r4 = r4 + r2
            r1.f = r4
            android.content.Context r2 = r3.getContext()
            r4 = 2130969523(0x7f0403b3, float:1.754773E38)
            r0 = 225(0xe1, float:3.15E-43)
            int r2 = defpackage.kj2.W(r2, r4, r0)
            r1.b = r2
            android.content.Context r2 = r3.getContext()
            r4 = 2130969529(0x7f0403b9, float:1.7547742E38)
            r0 = 175(0xaf, float:2.45E-43)
            int r2 = defpackage.kj2.W(r2, r4, r0)
            r1.c = r2
            android.content.Context r2 = r3.getContext()
            q92 r4 = defpackage.vo.d
            r0 = 2130969539(0x7f0403c3, float:1.7547763E38)
            android.animation.TimeInterpolator r2 = defpackage.kj2.X(r2, r0, r4)
            r1.d = r2
            android.content.Context r2 = r3.getContext()
            q92 r4 = defpackage.vo.c
            android.animation.TimeInterpolator r2 = defpackage.kj2.X(r2, r0, r4)
            r1.e = r2
            android.view.accessibility.AccessibilityManager r2 = r1.g
            if (r2 != 0) goto L5a
            android.content.Context r2 = r3.getContext()
            java.lang.Class<android.view.accessibility.AccessibilityManager> r4 = android.view.accessibility.AccessibilityManager.class
            java.lang.Object r2 = r2.getSystemService(r4)
            android.view.accessibility.AccessibilityManager r2 = (android.view.accessibility.AccessibilityManager) r2
            r1.g = r2
        L5a:
            android.view.accessibility.AccessibilityManager r2 = r1.g
            r4 = 0
            if (r2 == 0) goto L76
            ix2 r0 = r1.h
            if (r0 != 0) goto L76
            ix2 r0 = new ix2
            r0.<init>(r1, r3, r4)
            r1.h = r0
            r2.addTouchExplorationStateChangeListener(r0)
            wh r2 = new wh
            r0 = 4
            r2.<init>(r1, r0)
            r3.addOnAttachStateChangeListener(r2)
        L76:
            return r4
    }

    @Override // defpackage.e51
    public final void o(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, int r3, int r4, int r5, int[] r6) {
            r0 = this;
            if (r3 <= 0) goto L59
            int r1 = r0.j
            r3 = 1
            if (r1 != r3) goto L8
            goto L5e
        L8:
            boolean r1 = r0.i
            if (r1 == 0) goto L17
            android.view.accessibility.AccessibilityManager r1 = r0.g
            if (r1 == 0) goto L17
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L17
            goto L5e
        L17:
            android.view.ViewPropertyAnimator r1 = r0.k
            if (r1 == 0) goto L21
            r1.cancel()
            r2.clearAnimation()
        L21:
            r0.j = r3
            java.util.LinkedHashSet r1 = r0.a
            java.util.Iterator r1 = r1.iterator()
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto L54
            int r1 = r0.f
            int r3 = r0.c
            long r3 = (long) r3
            android.animation.TimeInterpolator r5 = r0.e
            android.view.ViewPropertyAnimator r2 = r2.animate()
            float r1 = (float) r1
            android.view.ViewPropertyAnimator r1 = r2.translationY(r1)
            android.view.ViewPropertyAnimator r1 = r1.setInterpolator(r5)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r3)
            s7 r2 = new s7
            r3 = 4
            r2.<init>(r0, r3)
            android.view.ViewPropertyAnimator r1 = r1.setListener(r2)
            r0.k = r1
            return
        L54:
            java.lang.ClassCastException r0 = defpackage.i61.j(r1)
            throw r0
        L59:
            if (r3 >= 0) goto L5e
            r0.v(r2)
        L5e:
            return
    }

    @Override // defpackage.e51
    public boolean s(android.view.View r1, int r2, int r3) {
            r0 = this;
            r0 = 2
            if (r2 != r0) goto L5
            r0 = 1
            return r0
        L5:
            r0 = 0
            return r0
    }

    public final void v(android.view.View r5) {
            r4 = this;
            int r0 = r4.j
            r1 = 2
            if (r0 != r1) goto L6
            return
        L6:
            android.view.ViewPropertyAnimator r0 = r4.k
            if (r0 == 0) goto L10
            r0.cancel()
            r5.clearAnimation()
        L10:
            r4.j = r1
            java.util.LinkedHashSet r0 = r4.a
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L41
            int r0 = r4.b
            long r0 = (long) r0
            android.animation.TimeInterpolator r2 = r4.d
            android.view.ViewPropertyAnimator r5 = r5.animate()
            r3 = 0
            android.view.ViewPropertyAnimator r5 = r5.translationY(r3)
            android.view.ViewPropertyAnimator r5 = r5.setInterpolator(r2)
            android.view.ViewPropertyAnimator r5 = r5.setDuration(r0)
            s7 r0 = new s7
            r1 = 4
            r0.<init>(r4, r1)
            android.view.ViewPropertyAnimator r5 = r5.setListener(r0)
            r4.k = r5
            return
        L41:
            java.lang.ClassCastException r4 = defpackage.i61.j(r0)
            throw r4
    }
}
