package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wh  reason: default package */
/* loaded from: classes.dex */
public final class wh implements android.view.View.OnAttachStateChangeListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;

    public /* synthetic */ wh(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    private final void a(android.view.View r1) {
            r0 = this;
            return
    }

    private final void b(android.view.View r1) {
            r0 = this;
            return
    }

    private final void c(android.view.View r1) {
            r0 = this;
            return
    }

    private final void d(android.view.View r1) {
            r0 = this;
            return
    }

    private final void e(android.view.View r1) {
            r0 = this;
            return
    }

    private final void f(android.view.View r1) {
            r0 = this;
            return
    }

    private final void g(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r3) {
            r2 = this;
            int r0 = r2.A
            java.lang.Object r1 = r2.B
            switch(r0) {
                case 0: goto L29;
                case 1: goto L28;
                case 2: goto L13;
                case 3: goto L8;
                case 4: goto L7;
                case 5: goto L7;
                case 6: goto L7;
                case 7: goto L7;
                default: goto L7;
            }
        L7:
            return
        L8:
            android.view.View r1 = (android.view.View) r1
            r1.removeOnAttachStateChangeListener(r2)
            java.util.WeakHashMap r2 = defpackage.ao7.a
            r1.requestApplyInsets()
            return
        L13:
            n42 r1 = (defpackage.n42) r1
            android.view.accessibility.AccessibilityManager r2 = r1.s0
            android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener r3 = r1.t0
            if (r3 == 0) goto L28
            if (r2 == 0) goto L28
            boolean r3 = r1.isAttachedToWindow()
            if (r3 == 0) goto L28
            android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener r3 = r1.t0
            r2.addTouchExplorationStateChangeListener(r3)
        L28:
            return
        L29:
            xh r1 = (defpackage.xh) r1
            android.content.Context r2 = r3.getContext()
            boolean r3 = r1.d
            if (r3 != 0) goto L3f
            android.content.Context r2 = r2.getApplicationContext()
            vh r3 = r1.e
            r2.registerComponentCallbacks(r3)
            r2 = 1
            r1.d = r2
        L3f:
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r5) {
            r4 = this;
            int r0 = r4.A
            r1 = 0
            r2 = 0
            java.lang.Object r3 = r4.B
            switch(r0) {
                case 0: goto Lbd;
                case 1: goto La0;
                case 2: goto L92;
                case 3: goto L91;
                case 4: goto L82;
                case 5: goto L72;
                case 6: goto L55;
                case 7: goto L12;
                default: goto L9;
            }
        L9:
            r5.removeOnAttachStateChangeListener(r4)
            ap6 r3 = (defpackage.ap6) r3
            r3.h(r2)
            return
        L12:
            p0 r3 = (defpackage.p0) r3
            android.view.ViewParent r4 = r3.getParent()
            mo7 r5 = defpackage.mo7.d0
            qb6 r4 = defpackage.sb6.Z(r4, r5)
            java.util.Iterator r4 = r4.iterator()
        L22:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L51
            java.lang.Object r5 = r4.next()
            android.view.ViewParent r5 = (android.view.ViewParent) r5
            boolean r0 = r5 instanceof android.view.View
            if (r0 == 0) goto L22
            android.view.View r5 = (android.view.View) r5
            r5.getClass()
            r0 = 2131427639(0x7f0b0137, float:1.84769E38)
            java.lang.Object r5 = r5.getTag(r0)
            boolean r0 = r5 instanceof java.lang.Boolean
            if (r0 == 0) goto L45
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            goto L46
        L45:
            r5 = r2
        L46:
            if (r5 == 0) goto L4d
            boolean r5 = r5.booleanValue()
            goto L4e
        L4d:
            r5 = r1
        L4e:
            if (r5 == 0) goto L22
            goto L54
        L51:
            r3.e()
        L54:
            return
        L55:
            ep6 r3 = (defpackage.ep6) r3
            android.view.ViewTreeObserver r0 = r3.k0
            if (r0 == 0) goto L6e
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto L67
            android.view.ViewTreeObserver r0 = r5.getViewTreeObserver()
            r3.k0 = r0
        L67:
            android.view.ViewTreeObserver r0 = r3.k0
            wr r1 = r3.e0
            r0.removeGlobalOnLayoutListener(r1)
        L6e:
            r5.removeOnAttachStateChangeListener(r4)
            return
        L72:
            com.google.android.material.behavior.HideViewOnScrollBehavior r3 = (com.google.android.material.behavior.HideViewOnScrollBehavior) r3
            ix2 r4 = r3.c
            if (r4 == 0) goto L81
            android.view.accessibility.AccessibilityManager r5 = r3.b
            if (r5 == 0) goto L81
            r5.removeTouchExplorationStateChangeListener(r4)
            r3.c = r2
        L81:
            return
        L82:
            com.google.android.material.behavior.HideBottomViewOnScrollBehavior r3 = (com.google.android.material.behavior.HideBottomViewOnScrollBehavior) r3
            ix2 r4 = r3.h
            if (r4 == 0) goto L91
            android.view.accessibility.AccessibilityManager r5 = r3.g
            if (r5 == 0) goto L91
            r5.removeTouchExplorationStateChangeListener(r4)
            r3.h = r2
        L91:
            return
        L92:
            n42 r3 = (defpackage.n42) r3
            android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener r4 = r3.t0
            if (r4 == 0) goto L9f
            android.view.accessibility.AccessibilityManager r5 = r3.s0
            if (r5 == 0) goto L9f
            r5.removeTouchExplorationStateChangeListener(r4)
        L9f:
            return
        La0:
            gl0 r3 = (defpackage.gl0) r3
            android.view.ViewTreeObserver r0 = r3.t0
            if (r0 == 0) goto Lb9
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto Lb2
            android.view.ViewTreeObserver r0 = r5.getViewTreeObserver()
            r3.t0 = r0
        Lb2:
            android.view.ViewTreeObserver r0 = r3.t0
            wr r1 = r3.e0
            r0.removeGlobalOnLayoutListener(r1)
        Lb9:
            r5.removeOnAttachStateChangeListener(r4)
            return
        Lbd:
            xh r3 = (defpackage.xh) r3
            android.content.Context r4 = r5.getContext()
            boolean r5 = r3.d
            if (r5 == 0) goto Ld2
            android.content.Context r4 = r4.getApplicationContext()
            vh r5 = r3.e
            r4.unregisterComponentCallbacks(r5)
            r3.d = r1
        Ld2:
            return
    }
}
