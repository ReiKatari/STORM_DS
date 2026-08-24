package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ki  reason: default package */
/* loaded from: classes.dex */
public final class ki implements defpackage.gy4 {
    public defpackage.et3 a;
    public defpackage.ap6 b;
    public defpackage.kt3 c;
    public defpackage.of6 d;

    @Override // defpackage.gy4
    public final void a() {
            r1 = this;
            r0 = 0
            r1.j(r0)
            return
    }

    @Override // defpackage.gy4
    public final void b() {
            r1 = this;
            et3 r1 = r1.a
            if (r1 == 0) goto L13
            nq6 r0 = defpackage.ky0.q
            java.lang.Object r1 = defpackage.hf.K(r1, r0)
            xm6 r1 = (defpackage.xm6) r1
            if (r1 == 0) goto L13
            bh1 r1 = (defpackage.bh1) r1
            r1.b()
        L13:
            return
    }

    @Override // defpackage.gy4
    public final void c() {
            r2 = this;
            ap6 r0 = r2.b
            r1 = 0
            if (r0 == 0) goto L8
            r0.h(r1)
        L8:
            r2.b = r1
            na4 r2 = r2.i()
            if (r2 == 0) goto L15
            of6 r2 = (defpackage.of6) r2
            r2.h()
        L15:
            return
    }

    @Override // defpackage.gy4
    public final void d(defpackage.c37 r1, defpackage.mk4 r2, defpackage.a47 r3, defpackage.d80 r4, defpackage.of5 r5, defpackage.of5 r6) {
            r0 = this;
            kt3 r0 = r0.c
            if (r0 == 0) goto L25
            ft3 r0 = r0.m
            java.lang.Object r4 = r0.c
            monitor-enter(r4)
            r0.j = r1     // Catch: java.lang.Throwable -> L1c
            r0.l = r2     // Catch: java.lang.Throwable -> L1c
            r0.k = r3     // Catch: java.lang.Throwable -> L1c
            r0.m = r5     // Catch: java.lang.Throwable -> L1c
            r0.n = r6     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r0.e     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            boolean r1 = r0.d     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L21
            goto L1e
        L1c:
            r0 = move-exception
            goto L23
        L1e:
            r0.a()     // Catch: java.lang.Throwable -> L1c
        L21:
            monitor-exit(r4)
            return
        L23:
            monitor-exit(r4)
            throw r0
        L25:
            return
    }

    @Override // defpackage.gy4
    public final void e(defpackage.c37 r8, defpackage.l33 r9, defpackage.t00 r10, defpackage.w51 r11) {
            r7 = this;
            d5 r0 = new d5
            r6 = 2
            r2 = r7
            r1 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r2.j(r0)
            return
    }

    @Override // defpackage.gy4
    public final void f(defpackage.c37 r13, defpackage.c37 r14) {
            r12 = this;
            kt3 r12 = r12.c
            if (r12 == 0) goto L133
            c37 r0 = r12.h
            long r0 = r0.b
            long r2 = r14.b
            boolean r0 = defpackage.k47.b(r0, r2)
            r1 = 0
            if (r0 == 0) goto L20
            c37 r0 = r12.h
            k47 r0 = r0.c
            k47 r2 = r14.c
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L1e
            goto L20
        L1e:
            r0 = r1
            goto L21
        L20:
            r0 = 1
        L21:
            r12.h = r14
            java.util.ArrayList r2 = r12.j
            int r2 = r2.size()
            r3 = r1
        L2a:
            if (r3 >= r2) goto L41
            java.util.ArrayList r4 = r12.j
            java.lang.Object r4 = r4.get(r3)
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            java.lang.Object r4 = r4.get()
            lf5 r4 = (defpackage.lf5) r4
            if (r4 == 0) goto L3e
            r4.g = r14
        L3e:
            int r3 = r3 + 1
            goto L2a
        L41:
            ft3 r2 = r12.m
            java.lang.Object r3 = r2.c
            monitor-enter(r3)
            r4 = 0
            r2.j = r4     // Catch: java.lang.Throwable -> L12f
            r2.l = r4     // Catch: java.lang.Throwable -> L12f
            r2.k = r4     // Catch: java.lang.Throwable -> L12f
            r2.m = r4     // Catch: java.lang.Throwable -> L12f
            r2.n = r4     // Catch: java.lang.Throwable -> L12f
            monitor-exit(r3)
            boolean r2 = defpackage.nb3.k(r13, r14)
            r3 = -1
            if (r2 == 0) goto L92
            if (r0 == 0) goto L133
            u63 r13 = r12.b
            long r0 = r14.b
            int r6 = defpackage.k47.f(r0)
            long r0 = r14.b
            int r7 = defpackage.k47.e(r0)
            c37 r14 = r12.h
            k47 r14 = r14.c
            if (r14 == 0) goto L77
            long r0 = r14.a
            int r14 = defpackage.k47.f(r0)
            r8 = r14
            goto L78
        L77:
            r8 = r3
        L78:
            c37 r12 = r12.h
            k47 r12 = r12.c
            if (r12 == 0) goto L84
            long r0 = r12.a
            int r3 = defpackage.k47.e(r0)
        L84:
            r9 = r3
            android.view.inputmethod.InputMethodManager r4 = r13.n()
            java.lang.Object r12 = r13.B
            r5 = r12
            android.view.View r5 = (android.view.View) r5
            r4.updateSelection(r5, r6, r7, r8, r9)
            return
        L92:
            if (r13 == 0) goto Lc4
            fp r0 = r13.a
            java.lang.String r0 = r0.B
            fp r2 = r14.a
            java.lang.String r2 = r2.B
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 == 0) goto Lb6
            long r4 = r13.b
            long r6 = r14.b
            boolean r0 = defpackage.k47.b(r4, r6)
            if (r0 == 0) goto Lc4
            k47 r13 = r13.c
            k47 r14 = r14.c
            boolean r13 = defpackage.nb3.k(r13, r14)
            if (r13 != 0) goto Lc4
        Lb6:
            u63 r12 = r12.b
            android.view.inputmethod.InputMethodManager r13 = r12.n()
            java.lang.Object r12 = r12.B
            android.view.View r12 = (android.view.View) r12
            r13.restartInput(r12)
            return
        Lc4:
            java.util.ArrayList r13 = r12.j
            int r13 = r13.size()
        Lca:
            if (r1 >= r13) goto L133
            java.util.ArrayList r14 = r12.j
            java.lang.Object r14 = r14.get(r1)
            java.lang.ref.WeakReference r14 = (java.lang.ref.WeakReference) r14
            java.lang.Object r14 = r14.get()
            lf5 r14 = (defpackage.lf5) r14
            if (r14 == 0) goto L12c
            c37 r0 = r12.h
            u63 r2 = r12.b
            boolean r4 = r14.k
            if (r4 != 0) goto Le5
            goto L12c
        Le5:
            r14.g = r0
            boolean r4 = r14.i
            if (r4 == 0) goto Lfc
            int r14 = r14.h
            android.view.inputmethod.ExtractedText r4 = defpackage.oi2.g(r0)
            android.view.inputmethod.InputMethodManager r5 = r2.n()
            java.lang.Object r6 = r2.B
            android.view.View r6 = (android.view.View) r6
            r5.updateExtractedText(r6, r14, r4)
        Lfc:
            k47 r14 = r0.c
            long r4 = r0.b
            if (r14 == 0) goto L10a
            long r6 = r14.a
            int r14 = defpackage.k47.f(r6)
            r10 = r14
            goto L10b
        L10a:
            r10 = r3
        L10b:
            k47 r14 = r0.c
            if (r14 == 0) goto L117
            long r6 = r14.a
            int r14 = defpackage.k47.e(r6)
            r11 = r14
            goto L118
        L117:
            r11 = r3
        L118:
            int r8 = defpackage.k47.f(r4)
            int r9 = defpackage.k47.e(r4)
            android.view.inputmethod.InputMethodManager r6 = r2.n()
            java.lang.Object r14 = r2.B
            r7 = r14
            android.view.View r7 = (android.view.View) r7
            r6.updateSelection(r7, r8, r9, r10, r11)
        L12c:
            int r1 = r1 + 1
            goto Lca
        L12f:
            r0 = move-exception
            r12 = r0
            monitor-exit(r3)
            throw r12
        L133:
            return
    }

    @Override // defpackage.gy4
    public final void g() {
            r1 = this;
            et3 r1 = r1.a
            if (r1 == 0) goto L13
            nq6 r0 = defpackage.ky0.q
            java.lang.Object r1 = defpackage.hf.K(r1, r0)
            xm6 r1 = (defpackage.xm6) r1
            if (r1 == 0) goto L13
            bh1 r1 = (defpackage.bh1) r1
            r1.a()
        L13:
            return
    }

    @Override // defpackage.gy4
    public final void h(defpackage.of5 r5) {
            r4 = this;
            kt3 r4 = r4.c
            if (r4 == 0) goto L39
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
            r4.l = r0
            java.util.ArrayList r5 = r4.j
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L39
            android.graphics.Rect r5 = r4.l
            if (r5 == 0) goto L39
            android.view.View r4 = r4.a
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r5)
            r4.requestRectangleOnScreen(r0)
        L39:
            return
    }

    public final defpackage.na4 i() {
            r4 = this;
            of6 r0 = r4.d
            if (r0 == 0) goto L5
            return r0
        L5:
            boolean r0 = defpackage.et6.a
            if (r0 != 0) goto Lb
            r4 = 0
            return r4
        Lb:
            m80 r0 = defpackage.m80.DROP_LATEST
            r1 = 2
            r2 = 1
            r3 = 0
            of6 r0 = defpackage.pf6.b(r2, r3, r0, r1)
            r4.d = r0
            return r0
    }

    public final void j(defpackage.d5 r7) {
            r6 = this;
            et3 r3 = r6.a
            if (r3 != 0) goto L5
            return
        L5:
            l5 r0 = new l5
            r5 = 1
            r4 = 0
            r2 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            boolean r6 = r3.j0
            if (r6 != 0) goto L13
            goto L25
        L13:
            w61 r6 = r3.F0()
            a71 r7 = defpackage.a71.UNDISPATCHED
            xd1 r1 = new xd1
            r5 = 26
            r1.<init>(r3, r0, r4, r5)
            r0 = 1
            ap6 r4 = defpackage.hv.L(r6, r4, r7, r1, r0)
        L25:
            r2.b = r4
            return
    }

    public final void k(defpackage.et3 r3) {
            r2 = this;
            et3 r0 = r2.a
            if (r0 != r3) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 != 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected textInputModifierNode to be "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " but was "
            r0.append(r3)
            et3 r3 = r2.a
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            defpackage.s53.c(r3)
        L24:
            r3 = 0
            r2.a = r3
            return
    }
}
