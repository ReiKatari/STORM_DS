package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jm2  reason: default package */
/* loaded from: classes.dex */
public class jm2 extends defpackage.dm2 {
    public jm2() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.dm2
    public final void a(android.view.View r1, java.lang.Object r2) {
            r0 = this;
            ea7 r2 = (defpackage.ea7) r2
            r2.b(r1)
            return
    }

    @Override // defpackage.dm2
    public final void b(java.lang.Object r4, java.util.ArrayList r5) {
            r3 = this;
            ea7 r4 = (defpackage.ea7) r4
            if (r4 != 0) goto L5
            goto L40
        L5:
            boolean r0 = r4 instanceof defpackage.qa7
            r1 = 0
            if (r0 == 0) goto L1e
            qa7 r4 = (defpackage.qa7) r4
            java.util.ArrayList r0 = r4.A0
            int r0 = r0.size()
        L12:
            if (r1 >= r0) goto L40
            ea7 r2 = r4.R(r1)
            r3.b(r2, r5)
            int r1 = r1 + 1
            goto L12
        L1e:
            java.util.ArrayList r3 = r4.X
            boolean r3 = defpackage.dm2.k(r3)
            if (r3 == 0) goto L40
            java.util.ArrayList r3 = r4.Y
            boolean r3 = defpackage.dm2.k(r3)
            if (r3 == 0) goto L40
            int r3 = r5.size()
        L32:
            if (r1 >= r3) goto L40
            java.lang.Object r0 = r5.get(r1)
            android.view.View r0 = (android.view.View) r0
            r4.b(r0)
            int r1 = r1 + 1
            goto L32
        L40:
            return
    }

    @Override // defpackage.dm2
    public final void c(java.lang.Object r1) {
            r0 = this;
            z97 r1 = (defpackage.z97) r1
            r1.g()
            return
    }

    @Override // defpackage.dm2
    public final void d(java.lang.Object r1, defpackage.mf r2) {
            r0 = this;
            z97 r1 = (defpackage.z97) r1
            r1.g = r2
            boolean r0 = r1.b
            if (r0 != 0) goto Lc
            r0 = 2
            r1.d = r0
            return
        Lc:
            r1.h()
            fo6 r0 = r1.e
            r1 = 0
            r0.a(r1)
            return
    }

    @Override // defpackage.dm2
    public final void e(android.view.ViewGroup r1, java.lang.Object r2) {
            r0 = this;
            ea7 r2 = (defpackage.ea7) r2
            defpackage.oa7.a(r1, r2)
            return
    }

    @Override // defpackage.dm2
    public final boolean g(java.lang.Object r1) {
            r0 = this;
            boolean r0 = r1 instanceof defpackage.ea7
            return r0
    }

    @Override // defpackage.dm2
    public final java.lang.Object h(java.lang.Object r1) {
            r0 = this;
            if (r1 == 0) goto L9
            ea7 r1 = (defpackage.ea7) r1
            ea7 r0 = r1.k()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // defpackage.dm2
    public final java.lang.Object i(android.view.ViewGroup r4, java.lang.Object r5) {
            r3 = this;
            ea7 r5 = (defpackage.ea7) r5
            java.util.ArrayList r3 = defpackage.oa7.c
            boolean r0 = r3.contains(r4)
            r1 = 0
            if (r0 != 0) goto L5e
            boolean r0 = r4.isLaidOut()
            if (r0 == 0) goto L5e
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r0 >= r2) goto L18
            goto L5e
        L18:
            boolean r0 = r5.v()
            if (r0 == 0) goto L59
            r3.add(r4)
            ea7 r3 = r5.k()
            qa7 r5 = new qa7
            r5.<init>()
            r5.Q(r3)
            defpackage.oa7.c(r4, r5)
            r3 = 2131428025(0x7f0b02b9, float:1.8477683E38)
            r4.setTag(r3, r1)
            na7 r3 = new na7
            r3.<init>()
            r3.A = r5
            r3.B = r4
            r4.addOnAttachStateChangeListener(r3)
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()
            r0.addOnPreDrawListener(r3)
            r4.invalidate()
            z97 r3 = new z97
            r3.<init>(r5)
            r5.u0 = r3
            r5.a(r3)
            z97 r3 = r5.u0
            return r3
        L59:
            java.lang.String r3 = "The Transition must support seeking."
            defpackage.i.h(r3)
        L5e:
            return r1
    }

    @Override // defpackage.dm2
    public final boolean l() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.dm2
    public final boolean m(java.lang.Object r3) {
            r2 = this;
            r2 = r3
            ea7 r2 = (defpackage.ea7) r2
            boolean r2 = r2.v()
            if (r2 != 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Predictive back not available for AndroidX Transition "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = ". Please enable seeking support for the designated transition by overriding isSeekingSupported()."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r3)
        L21:
            return r2
    }

    @Override // defpackage.dm2
    public final java.lang.Object n(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            ea7 r1 = (defpackage.ea7) r1
            ea7 r2 = (defpackage.ea7) r2
            ea7 r3 = (defpackage.ea7) r3
            if (r1 == 0) goto L1a
            if (r2 == 0) goto L1a
            qa7 r0 = new qa7
            r0.<init>()
            r0.Q(r1)
            r0.Q(r2)
            r1 = 0
            r0.B0 = r1
            r1 = r0
            goto L22
        L1a:
            if (r1 == 0) goto L1d
            goto L22
        L1d:
            if (r2 == 0) goto L21
            r1 = r2
            goto L22
        L21:
            r1 = 0
        L22:
            if (r3 == 0) goto L32
            qa7 r0 = new qa7
            r0.<init>()
            if (r1 == 0) goto L2e
            r0.Q(r1)
        L2e:
            r0.Q(r3)
            return r0
        L32:
            return r1
    }

    @Override // defpackage.dm2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            qa7 r0 = new qa7
            r0.<init>()
            if (r1 == 0) goto Lc
            ea7 r1 = (defpackage.ea7) r1
            r0.Q(r1)
        Lc:
            ea7 r2 = (defpackage.ea7) r2
            r0.Q(r2)
            return r0
    }

    @Override // defpackage.dm2
    public final void p(java.lang.Object r1, android.view.View r2, java.util.ArrayList r3) {
            r0 = this;
            ea7 r1 = (defpackage.ea7) r1
            gm2 r0 = new gm2
            r0.<init>(r2, r3)
            r1.a(r0)
            return
    }

    @Override // defpackage.dm2
    public final void q(java.lang.Object r7, java.lang.Object r8, java.util.ArrayList r9, java.lang.Object r10, java.util.ArrayList r11) {
            r6 = this;
            ea7 r7 = (defpackage.ea7) r7
            hm2 r0 = new hm2
            r1 = r6
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r7.a(r0)
            return
    }

    @Override // defpackage.dm2
    public final void r(java.lang.Object r12, float r13) {
            r11 = this;
            z97 r12 = (defpackage.z97) r12
            boolean r11 = r12.b
            if (r11 == 0) goto L6c
            qa7 r0 = r12.h
            long r1 = r0.t0
            float r3 = (float) r1
            float r13 = r13 * r3
            long r3 = (long) r13
            r5 = 0
            int r13 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r7 = 1
            if (r13 != 0) goto L16
            r3 = r7
        L16:
            int r13 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r13 != 0) goto L1c
            long r3 = r1 - r7
        L1c:
            fo6 r13 = r12.e
            if (r13 != 0) goto L67
            long r9 = r12.a
            int r13 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r13 == 0) goto L6c
            if (r11 != 0) goto L29
            goto L6c
        L29:
            boolean r11 = r12.c
            if (r11 != 0) goto L4b
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 != 0) goto L38
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 <= 0) goto L38
            r3 = -1
            goto L42
        L38:
            int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r11 != 0) goto L42
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 >= 0) goto L42
            long r3 = r1 + r7
        L42:
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 == 0) goto L4b
            r0.H(r3, r9)
            r12.a = r3
        L4b:
            ei r11 = r12.f
            long r12 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            float r0 = (float) r3
            int r1 = r11.B
            int r1 = r1 + 1
            int r1 = r1 % 20
            r11.B = r1
            java.lang.Object r2 = r11.L
            long[] r2 = (long[]) r2
            r2[r1] = r12
            java.lang.Object r11 = r11.R
            float[] r11 = (float[]) r11
            r11[r1] = r0
            return
        L67:
            java.lang.String r11 = "setCurrentPlayTimeMillis() called after animation has been started"
            defpackage.i.m(r11)
        L6c:
            return
    }

    @Override // defpackage.dm2
    public final void s(android.view.View r1, java.lang.Object r2) {
            r0 = this;
            if (r1 == 0) goto L14
            ea7 r2 = (defpackage.ea7) r2
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            defpackage.dm2.j(r1, r0)
            fm2 r0 = new fm2
            r0.<init>()
            r2.J(r0)
        L14:
            return
    }

    @Override // defpackage.dm2
    public final void t(java.lang.Object r1, android.graphics.Rect r2) {
            r0 = this;
            ea7 r1 = (defpackage.ea7) r1
            fm2 r0 = new fm2
            r0.<init>()
            r1.J(r0)
            return
    }

    @Override // defpackage.dm2
    public final void u(androidx.fragment.app.o r1, java.lang.Object r2, defpackage.uj0 r3, java.lang.Runnable r4) {
            r0 = this;
            r1 = 0
            r0.v(r2, r3, r1, r4)
            return
    }

    @Override // defpackage.dm2
    public final void v(java.lang.Object r1, defpackage.uj0 r2, defpackage.n0 r3, java.lang.Runnable r4) {
            r0 = this;
            ea7 r1 = (defpackage.ea7) r1
            em2 r0 = new em2
            r0.<init>(r3, r1, r4)
            monitor-enter(r2)
        L8:
            boolean r3 = r2.c     // Catch: java.lang.Throwable -> L16
            if (r3 == 0) goto L10
            r2.wait()     // Catch: java.lang.InterruptedException -> L8 java.lang.Throwable -> L16
            goto L8
        L10:
            em2 r3 = r2.b     // Catch: java.lang.Throwable -> L16
            if (r3 != r0) goto L18
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            goto L39
        L16:
            r0 = move-exception
            goto L42
        L18:
            r2.b = r0     // Catch: java.lang.Throwable -> L16
            boolean r3 = r2.a     // Catch: java.lang.Throwable -> L16
            if (r3 == 0) goto L38
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            java.lang.Object r2 = r0.B
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            java.lang.Object r3 = r0.R
            ea7 r3 = (defpackage.ea7) r3
            java.lang.Object r0 = r0.L
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r2 != 0) goto L34
            r3.cancel()
            r0.run()
            goto L39
        L34:
            r2.run()
            goto L39
        L38:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
        L39:
            im2 r0 = new im2
            r0.<init>(r4)
            r1.a(r0)
            return
        L42:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r0
    }

    @Override // defpackage.dm2
    public final void w(java.lang.Object r5, android.view.View r6, java.util.ArrayList r7) {
            r4 = this;
            qa7 r5 = (defpackage.qa7) r5
            java.util.ArrayList r0 = r5.Y
            r0.clear()
            int r1 = r7.size()
            r2 = 0
        Lc:
            if (r2 >= r1) goto L1a
            java.lang.Object r3 = r7.get(r2)
            android.view.View r3 = (android.view.View) r3
            defpackage.dm2.f(r0, r3)
            int r2 = r2 + 1
            goto Lc
        L1a:
            r0.add(r6)
            r7.add(r6)
            r4.b(r5, r7)
            return
    }

    @Override // defpackage.dm2
    public final void x(java.lang.Object r2, java.util.ArrayList r3, java.util.ArrayList r4) {
            r1 = this;
            qa7 r2 = (defpackage.qa7) r2
            if (r2 == 0) goto Lf
            java.util.ArrayList r0 = r2.Y
            r0.clear()
            r0.addAll(r4)
            r1.z(r2, r3, r4)
        Lf:
            return
    }

    @Override // defpackage.dm2
    public final java.lang.Object y(java.lang.Object r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r0 = 0
            return r0
        L4:
            qa7 r0 = new qa7
            r0.<init>()
            ea7 r1 = (defpackage.ea7) r1
            r0.Q(r1)
            return r0
    }

    public final void z(java.lang.Object r4, java.util.ArrayList r5, java.util.ArrayList r6) {
            r3 = this;
            ea7 r4 = (defpackage.ea7) r4
            boolean r0 = r4 instanceof defpackage.qa7
            r1 = 0
            if (r0 == 0) goto L1b
            qa7 r4 = (defpackage.qa7) r4
            java.util.ArrayList r0 = r4.A0
            int r0 = r0.size()
        Lf:
            if (r1 >= r0) goto L5f
            ea7 r2 = r4.R(r1)
            r3.z(r2, r5, r6)
            int r1 = r1 + 1
            goto Lf
        L1b:
            java.util.ArrayList r3 = r4.X
            boolean r3 = defpackage.dm2.k(r3)
            if (r3 == 0) goto L5f
            java.util.ArrayList r3 = r4.Y
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
            r4.b(r0)
            int r1 = r1 + 1
            goto L3d
        L4b:
            int r3 = r5.size()
            int r3 = r3 + (-1)
        L51:
            if (r3 < 0) goto L5f
            java.lang.Object r6 = r5.get(r3)
            android.view.View r6 = (android.view.View) r6
            r4.E(r6)
            int r3 = r3 + (-1)
            goto L51
        L5f:
            return
    }
}
