package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r37  reason: default package */
/* loaded from: classes.dex */
public final class r37 implements defpackage.gy4 {
    public final android.view.View a;
    public final defpackage.bt b;
    public final defpackage.s37 c;
    public boolean d;
    public defpackage.qn2 e;
    public defpackage.qn2 f;
    public defpackage.c37 g;
    public defpackage.l33 h;
    public final java.util.ArrayList i;
    public final defpackage.go3 j;
    public android.graphics.Rect k;
    public final defpackage.b81 l;
    public final defpackage.ua4 m;
    public defpackage.rk3 n;

    public r37(android.view.View r6, defpackage.te r7) {
            r5 = this;
            bt r0 = new bt
            r0.<init>(r6)
            android.view.Choreographer r1 = android.view.Choreographer.getInstance()
            s37 r2 = new s37
            r3 = 0
            r2.<init>(r1, r3)
            r5.<init>()
            r5.a = r6
            r5.b = r0
            r5.c = r2
            hh2 r6 = defpackage.hh2.t0
            r5.e = r6
            hh2 r6 = defpackage.hh2.u0
            r5.f = r6
            c37 r6 = new c37
            long r1 = defpackage.k47.b
            r3 = 4
            java.lang.String r4 = ""
            r6.<init>(r4, r3, r1)
            r5.g = r6
            l33 r6 = defpackage.l33.g
            r5.h = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.i = r6
            xr3 r6 = defpackage.xr3.NONE
            pj r1 = new pj
            r2 = 19
            r1.<init>(r5, r2)
            go3 r6 = defpackage.kj2.M(r6, r1)
            r5.j = r6
            b81 r6 = new b81
            r6.<init>(r7, r0)
            r5.l = r6
            ua4 r6 = new ua4
            r7 = 16
            p37[] r7 = new defpackage.p37[r7]
            r6.<init>(r7)
            r5.m = r6
            return
    }

    @Override // defpackage.gy4
    public final void a() {
            r1 = this;
            p37 r0 = defpackage.p37.StartInput
            r1.i(r0)
            return
    }

    @Override // defpackage.gy4
    public final void b() {
            r1 = this;
            p37 r0 = defpackage.p37.ShowKeyboard
            r1.i(r0)
            return
    }

    @Override // defpackage.gy4
    public final void c() {
            r1 = this;
            r0 = 0
            r1.d = r0
            hh2 r0 = defpackage.hh2.v0
            r1.e = r0
            hh2 r0 = defpackage.hh2.w0
            r1.f = r0
            r0 = 0
            r1.k = r0
            p37 r0 = defpackage.p37.StopInput
            r1.i(r0)
            return
    }

    @Override // defpackage.gy4
    public final void d(defpackage.c37 r2, defpackage.mk4 r3, defpackage.a47 r4, defpackage.d80 r5, defpackage.of5 r6, defpackage.of5 r7) {
            r1 = this;
            b81 r1 = r1.l
            java.lang.Object r0 = r1.c
            monitor-enter(r0)
            r1.j = r2     // Catch: java.lang.Throwable -> L1a
            r1.l = r3     // Catch: java.lang.Throwable -> L1a
            r1.k = r4     // Catch: java.lang.Throwable -> L1a
            r1.m = r5     // Catch: java.lang.Throwable -> L1a
            r1.n = r6     // Catch: java.lang.Throwable -> L1a
            r1.o = r7     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r1.e     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L1c
            boolean r2 = r1.d     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L1f
            goto L1c
        L1a:
            r1 = move-exception
            goto L21
        L1c:
            r1.a()     // Catch: java.lang.Throwable -> L1a
        L1f:
            monitor-exit(r0)
            return
        L21:
            monitor-exit(r0)
            throw r1
    }

    @Override // defpackage.gy4
    public final void e(defpackage.c37 r2, defpackage.l33 r3, defpackage.t00 r4, defpackage.w51 r5) {
            r1 = this;
            r0 = 1
            r1.d = r0
            r1.g = r2
            r1.h = r3
            r1.e = r4
            r1.f = r5
            p37 r2 = defpackage.p37.StartInput
            r1.i(r2)
            return
    }

    @Override // defpackage.gy4
    public final void f(defpackage.c37 r13, defpackage.c37 r14) {
            r12 = this;
            c37 r0 = r12.g
            long r0 = r0.b
            long r2 = r14.b
            boolean r0 = defpackage.k47.b(r0, r2)
            r1 = 0
            if (r0 == 0) goto L1c
            c37 r0 = r12.g
            k47 r0 = r0.c
            k47 r2 = r14.c
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L1a
            goto L1c
        L1a:
            r0 = r1
            goto L1d
        L1c:
            r0 = 1
        L1d:
            r12.g = r14
            java.util.ArrayList r2 = r12.i
            int r2 = r2.size()
            r3 = r1
        L26:
            if (r3 >= r2) goto L3d
            java.util.ArrayList r4 = r12.i
            java.lang.Object r4 = r4.get(r3)
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            java.lang.Object r4 = r4.get()
            kf5 r4 = (defpackage.kf5) r4
            if (r4 == 0) goto L3a
            r4.d = r14
        L3a:
            int r3 = r3 + 1
            goto L26
        L3d:
            b81 r2 = r12.l
            java.lang.Object r3 = r2.c
            monitor-enter(r3)
            r4 = 0
            r2.j = r4     // Catch: java.lang.Throwable -> L14a
            r2.l = r4     // Catch: java.lang.Throwable -> L14a
            r2.k = r4     // Catch: java.lang.Throwable -> L14a
            ne r5 = defpackage.ne.s0     // Catch: java.lang.Throwable -> L14a
            r2.m = r5     // Catch: java.lang.Throwable -> L14a
            r2.n = r4     // Catch: java.lang.Throwable -> L14a
            r2.o = r4     // Catch: java.lang.Throwable -> L14a
            monitor-exit(r3)
            boolean r2 = defpackage.nb3.k(r13, r14)
            r3 = -1
            if (r2 == 0) goto L99
            if (r0 == 0) goto L149
            bt r13 = r12.b
            long r0 = r14.b
            int r6 = defpackage.k47.f(r0)
            long r0 = r14.b
            int r7 = defpackage.k47.e(r0)
            c37 r14 = r12.g
            k47 r14 = r14.c
            if (r14 == 0) goto L77
            long r0 = r14.a
            int r14 = defpackage.k47.f(r0)
            r8 = r14
            goto L78
        L77:
            r8 = r3
        L78:
            c37 r12 = r12.g
            k47 r12 = r12.c
            if (r12 == 0) goto L84
            long r0 = r12.a
            int r3 = defpackage.k47.e(r0)
        L84:
            r9 = r3
            java.lang.Object r12 = r13.L
            go3 r12 = (defpackage.go3) r12
            java.lang.Object r12 = r12.getValue()
            r4 = r12
            android.view.inputmethod.InputMethodManager r4 = (android.view.inputmethod.InputMethodManager) r4
            java.lang.Object r12 = r13.B
            r5 = r12
            android.view.View r5 = (android.view.View) r5
            r4.updateSelection(r5, r6, r7, r8, r9)
            return
        L99:
            if (r13 == 0) goto Ld1
            fp r0 = r13.a
            java.lang.String r0 = r0.B
            fp r2 = r14.a
            java.lang.String r2 = r2.B
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 == 0) goto Lbd
            long r4 = r13.b
            long r6 = r14.b
            boolean r0 = defpackage.k47.b(r4, r6)
            if (r0 == 0) goto Ld1
            k47 r13 = r13.c
            k47 r14 = r14.c
            boolean r13 = defpackage.nb3.k(r13, r14)
            if (r13 != 0) goto Ld1
        Lbd:
            bt r12 = r12.b
            java.lang.Object r13 = r12.L
            go3 r13 = (defpackage.go3) r13
            java.lang.Object r13 = r13.getValue()
            android.view.inputmethod.InputMethodManager r13 = (android.view.inputmethod.InputMethodManager) r13
            java.lang.Object r12 = r12.B
            android.view.View r12 = (android.view.View) r12
            r13.restartInput(r12)
            return
        Ld1:
            java.util.ArrayList r13 = r12.i
            int r13 = r13.size()
        Ld7:
            if (r1 >= r13) goto L149
            java.util.ArrayList r14 = r12.i
            java.lang.Object r14 = r14.get(r1)
            java.lang.ref.WeakReference r14 = (java.lang.ref.WeakReference) r14
            java.lang.Object r14 = r14.get()
            kf5 r14 = (defpackage.kf5) r14
            if (r14 == 0) goto L146
            c37 r0 = r12.g
            bt r2 = r12.b
            boolean r4 = r14.h
            if (r4 != 0) goto Lf2
            goto L146
        Lf2:
            r14.d = r0
            boolean r4 = r14.f
            if (r4 == 0) goto L10f
            int r14 = r14.e
            android.view.inputmethod.ExtractedText r4 = defpackage.uj2.c0(r0)
            java.lang.Object r5 = r2.L
            go3 r5 = (defpackage.go3) r5
            java.lang.Object r5 = r5.getValue()
            android.view.inputmethod.InputMethodManager r5 = (android.view.inputmethod.InputMethodManager) r5
            java.lang.Object r6 = r2.B
            android.view.View r6 = (android.view.View) r6
            r5.updateExtractedText(r6, r14, r4)
        L10f:
            k47 r14 = r0.c
            long r4 = r0.b
            if (r14 == 0) goto L11d
            long r6 = r14.a
            int r14 = defpackage.k47.f(r6)
            r10 = r14
            goto L11e
        L11d:
            r10 = r3
        L11e:
            k47 r14 = r0.c
            if (r14 == 0) goto L12a
            long r6 = r14.a
            int r14 = defpackage.k47.e(r6)
            r11 = r14
            goto L12b
        L12a:
            r11 = r3
        L12b:
            int r8 = defpackage.k47.f(r4)
            int r9 = defpackage.k47.e(r4)
            java.lang.Object r14 = r2.L
            go3 r14 = (defpackage.go3) r14
            java.lang.Object r14 = r14.getValue()
            r6 = r14
            android.view.inputmethod.InputMethodManager r6 = (android.view.inputmethod.InputMethodManager) r6
            java.lang.Object r14 = r2.B
            r7 = r14
            android.view.View r7 = (android.view.View) r7
            r6.updateSelection(r7, r8, r9, r10, r11)
        L146:
            int r1 = r1 + 1
            goto Ld7
        L149:
            return
        L14a:
            r0 = move-exception
            r12 = r0
            monitor-exit(r3)
            throw r12
    }

    @Override // defpackage.gy4
    public final void g() {
            r1 = this;
            p37 r0 = defpackage.p37.HideKeyboard
            r1.i(r0)
            return
    }

    @Override // defpackage.gy4
    public final void h(defpackage.of5 r5) {
            r4 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            float r1 = r5.a
            int r1 = defpackage.u24.E(r1)
            float r2 = r5.b
            int r2 = defpackage.u24.E(r2)
            float r3 = r5.c
            int r3 = defpackage.u24.E(r3)
            float r5 = r5.d
            int r5 = defpackage.u24.E(r5)
            r0.<init>(r1, r2, r3, r5)
            r4.k = r0
            java.util.ArrayList r5 = r4.i
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L35
            android.graphics.Rect r5 = r4.k
            if (r5 == 0) goto L35
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r5)
            android.view.View r4 = r4.a
            r4.requestRectangleOnScreen(r0)
        L35:
            return
    }

    public final void i(defpackage.p37 r2) {
            r1 = this;
            ua4 r0 = r1.m
            r0.b(r2)
            rk3 r2 = r1.n
            if (r2 != 0) goto L17
            rk3 r2 = new rk3
            r0 = 17
            r2.<init>(r1, r0)
            s37 r0 = r1.c
            r0.execute(r2)
            r1.n = r2
        L17:
            return
    }
}
