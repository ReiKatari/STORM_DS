package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bm2  reason: default package */
/* loaded from: classes.dex */
public final class bm2 extends defpackage.dm2 {
    public static boolean z(android.transition.Transition r1) {
            java.util.List r0 = r1.getTargetIds()
            boolean r0 = defpackage.dm2.k(r0)
            if (r0 == 0) goto L21
            java.util.List r0 = r1.getTargetNames()
            boolean r0 = defpackage.dm2.k(r0)
            if (r0 == 0) goto L21
            java.util.List r1 = r1.getTargetTypes()
            boolean r1 = defpackage.dm2.k(r1)
            if (r1 != 0) goto L1f
            goto L21
        L1f:
            r1 = 0
            return r1
        L21:
            r1 = 1
            return r1
    }

    public final void A(java.lang.Object r4, java.util.ArrayList r5, java.util.ArrayList r6) {
            r3 = this;
            android.transition.Transition r4 = (android.transition.Transition) r4
            boolean r0 = r4 instanceof android.transition.TransitionSet
            r1 = 0
            if (r0 == 0) goto L19
            android.transition.TransitionSet r4 = (android.transition.TransitionSet) r4
            int r0 = r4.getTransitionCount()
        Ld:
            if (r1 >= r0) goto L5f
            android.transition.Transition r2 = r4.getTransitionAt(r1)
            r3.A(r2, r5, r6)
            int r1 = r1 + 1
            goto Ld
        L19:
            boolean r3 = z(r4)
            if (r3 != 0) goto L5f
            java.util.List r3 = r4.getTargets()
            if (r3 == 0) goto L5f
            int r0 = r3.size()
            int r2 = r5.size()
            if (r0 != r2) goto L5f
            boolean r3 = r3.containsAll(r5)
            if (r3 == 0) goto L5f
            if (r6 != 0) goto L39
            r3 = r1
            goto L3d
        L39:
            int r3 = r6.size()
        L3d:
            if (r1 >= r3) goto L4b
            java.lang.Object r0 = r6.get(r1)
            android.view.View r0 = (android.view.View) r0
            r4.addTarget(r0)
            int r1 = r1 + 1
            goto L3d
        L4b:
            int r3 = r5.size()
            int r3 = r3 + (-1)
        L51:
            if (r3 < 0) goto L5f
            java.lang.Object r6 = r5.get(r3)
            android.view.View r6 = (android.view.View) r6
            r4.removeTarget(r6)
            int r3 = r3 + (-1)
            goto L51
        L5f:
            return
    }

    @Override // defpackage.dm2
    public final void a(android.view.View r1, java.lang.Object r2) {
            r0 = this;
            android.transition.Transition r2 = (android.transition.Transition) r2
            r2.addTarget(r1)
            return
    }

    @Override // defpackage.dm2
    public final void b(java.lang.Object r4, java.util.ArrayList r5) {
            r3 = this;
            android.transition.Transition r4 = (android.transition.Transition) r4
            if (r4 != 0) goto L5
            goto L3e
        L5:
            boolean r0 = r4 instanceof android.transition.TransitionSet
            r1 = 0
            if (r0 == 0) goto L1c
            android.transition.TransitionSet r4 = (android.transition.TransitionSet) r4
            int r0 = r4.getTransitionCount()
        L10:
            if (r1 >= r0) goto L3e
            android.transition.Transition r2 = r4.getTransitionAt(r1)
            r3.b(r2, r5)
            int r1 = r1 + 1
            goto L10
        L1c:
            boolean r3 = z(r4)
            if (r3 != 0) goto L3e
            java.util.List r3 = r4.getTargets()
            boolean r3 = defpackage.dm2.k(r3)
            if (r3 == 0) goto L3e
            int r3 = r5.size()
        L30:
            if (r1 >= r3) goto L3e
            java.lang.Object r0 = r5.get(r1)
            android.view.View r0 = (android.view.View) r0
            r4.addTarget(r0)
            int r1 = r1 + 1
            goto L30
        L3e:
            return
    }

    @Override // defpackage.dm2
    public final void e(android.view.ViewGroup r1, java.lang.Object r2) {
            r0 = this;
            android.transition.Transition r2 = (android.transition.Transition) r2
            android.transition.TransitionManager.beginDelayedTransition(r1, r2)
            return
    }

    @Override // defpackage.dm2
    public final boolean g(java.lang.Object r1) {
            r0 = this;
            boolean r0 = r1 instanceof android.transition.Transition
            return r0
    }

    @Override // defpackage.dm2
    public final java.lang.Object h(java.lang.Object r1) {
            r0 = this;
            if (r1 == 0) goto L9
            android.transition.Transition r1 = (android.transition.Transition) r1
            android.transition.Transition r0 = r1.clone()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // defpackage.dm2
    public final boolean l() {
            r1 = this;
            r1 = 4
            boolean r1 = androidx.fragment.app.u.K(r1)
            if (r1 == 0) goto Le
            java.lang.String r1 = "FragmentManager"
            java.lang.String r0 = "Predictive back not available using Framework Transitions. Please switch to AndroidX Transition 1.5.0 or higher to enable seeking."
            android.util.Log.i(r1, r0)
        Le:
            r1 = 0
            return r1
    }

    @Override // defpackage.dm2
    public final boolean m(java.lang.Object r2) {
            r1 = this;
            r1 = 2
            boolean r1 = androidx.fragment.app.u.K(r1)
            if (r1 == 0) goto L1f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Predictive back not available for framework transition "
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r2 = ". Please switch to AndroidX Transition 1.5.0 or higher to enable seeking."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r1)
        L1f:
            r1 = 0
            return r1
    }

    @Override // defpackage.dm2
    public final java.lang.Object n(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            android.transition.Transition r1 = (android.transition.Transition) r1
            android.transition.Transition r2 = (android.transition.Transition) r2
            android.transition.Transition r3 = (android.transition.Transition) r3
            if (r1 == 0) goto L1d
            if (r2 == 0) goto L1d
            android.transition.TransitionSet r0 = new android.transition.TransitionSet
            r0.<init>()
            android.transition.TransitionSet r0 = r0.addTransition(r1)
            android.transition.TransitionSet r0 = r0.addTransition(r2)
            r1 = 1
            android.transition.TransitionSet r1 = r0.setOrdering(r1)
            goto L25
        L1d:
            if (r1 == 0) goto L20
            goto L25
        L20:
            if (r2 == 0) goto L24
            r1 = r2
            goto L25
        L24:
            r1 = 0
        L25:
            if (r3 == 0) goto L35
            android.transition.TransitionSet r0 = new android.transition.TransitionSet
            r0.<init>()
            if (r1 == 0) goto L31
            r0.addTransition(r1)
        L31:
            r0.addTransition(r3)
            return r0
        L35:
            return r1
    }

    @Override // defpackage.dm2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            android.transition.TransitionSet r0 = new android.transition.TransitionSet
            r0.<init>()
            if (r1 == 0) goto Lc
            android.transition.Transition r1 = (android.transition.Transition) r1
            r0.addTransition(r1)
        Lc:
            android.transition.Transition r2 = (android.transition.Transition) r2
            r0.addTransition(r2)
            return r0
    }

    @Override // defpackage.dm2
    public final void p(java.lang.Object r1, android.view.View r2, java.util.ArrayList r3) {
            r0 = this;
            android.transition.Transition r1 = (android.transition.Transition) r1
            yl2 r0 = new yl2
            r0.<init>(r2, r3)
            r1.addListener(r0)
            return
    }

    @Override // defpackage.dm2
    public final void q(java.lang.Object r7, java.lang.Object r8, java.util.ArrayList r9, java.lang.Object r10, java.util.ArrayList r11) {
            r6 = this;
            android.transition.Transition r7 = (android.transition.Transition) r7
            zl2 r0 = new zl2
            r1 = r6
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r7.addListener(r0)
            return
    }

    @Override // defpackage.dm2
    public final void s(android.view.View r2, java.lang.Object r3) {
            r1 = this;
            if (r2 == 0) goto L15
            android.transition.Transition r3 = (android.transition.Transition) r3
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            defpackage.dm2.j(r2, r1)
            xl2 r2 = new xl2
            r0 = 0
            r2.<init>(r0, r1)
            r3.setEpicenterCallback(r2)
        L15:
            return
    }

    @Override // defpackage.dm2
    public final void t(java.lang.Object r2, android.graphics.Rect r3) {
            r1 = this;
            android.transition.Transition r2 = (android.transition.Transition) r2
            xl2 r1 = new xl2
            r0 = 1
            r1.<init>(r0, r3)
            r2.setEpicenterCallback(r1)
            return
    }

    @Override // defpackage.dm2
    public final void u(androidx.fragment.app.o r1, java.lang.Object r2, defpackage.uj0 r3, java.lang.Runnable r4) {
            r0 = this;
            android.transition.Transition r2 = (android.transition.Transition) r2
            am2 r0 = new am2
            r0.<init>(r4)
            r2.addListener(r0)
            return
    }

    @Override // defpackage.dm2
    public final void w(java.lang.Object r5, android.view.View r6, java.util.ArrayList r7) {
            r4 = this;
            android.transition.TransitionSet r5 = (android.transition.TransitionSet) r5
            java.util.List r0 = r5.getTargets()
            r0.clear()
            int r1 = r7.size()
            r2 = 0
        Le:
            if (r2 >= r1) goto L1c
            java.lang.Object r3 = r7.get(r2)
            android.view.View r3 = (android.view.View) r3
            defpackage.dm2.f(r0, r3)
            int r2 = r2 + 1
            goto Le
        L1c:
            r0.add(r6)
            r7.add(r6)
            r4.b(r5, r7)
            return
    }

    @Override // defpackage.dm2
    public final void x(java.lang.Object r2, java.util.ArrayList r3, java.util.ArrayList r4) {
            r1 = this;
            android.transition.TransitionSet r2 = (android.transition.TransitionSet) r2
            if (r2 == 0) goto L15
            java.util.List r0 = r2.getTargets()
            r0.clear()
            java.util.List r0 = r2.getTargets()
            r0.addAll(r4)
            r1.A(r2, r3, r4)
        L15:
            return
    }

    @Override // defpackage.dm2
    public final java.lang.Object y(java.lang.Object r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r0 = 0
            return r0
        L4:
            android.transition.TransitionSet r0 = new android.transition.TransitionSet
            r0.<init>()
            android.transition.Transition r1 = (android.transition.Transition) r1
            r0.addTransition(r1)
            return r0
    }
}
