package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a34  reason: default package */
/* loaded from: classes.dex */
public final class a34 {
    public final defpackage.sm3 a;
    public final defpackage.bt b;
    public boolean c;
    public boolean d;
    public final defpackage.ap3 e;
    public final defpackage.ua4 f;
    public final long g;
    public final defpackage.ua4 h;
    public defpackage.q21 i;

    public a34(defpackage.sm3 r4) {
            r3 = this;
            r3.<init>()
            r3.a = r4
            bt r4 = new bt
            r0 = 15
            r4.<init>(r0)
            r3.b = r4
            ap3 r4 = new ap3
            r0 = 10
            r4.<init>(r0)
            r3.e = r4
            ua4 r4 = new ua4
            r0 = 16
            sm3[] r1 = new defpackage.sm3[r0]
            r4.<init>(r1)
            r3.f = r4
            r1 = 1
            r3.g = r1
            ua4 r4 = new ua4
            y24[] r0 = new defpackage.y24[r0]
            r4.<init>(r0)
            r3.h = r4
            return
    }

    public static final boolean a(defpackage.a34 r5, defpackage.sm3 r6, boolean r7) {
            sm3 r0 = r5.a
            boolean r1 = r6.K0
            wm3 r2 = r6.C0
            r3 = 0
            if (r1 == 0) goto Lb
            goto La8
        Lb:
            boolean r1 = k(r6)
            if (r1 == 0) goto La8
            if (r6 != r0) goto L19
            q21 r1 = r5.i
            r1.getClass()
            goto L1a
        L19:
            r1 = 0
        L1a:
            if (r7 == 0) goto L3b
            boolean r7 = r2.e
            if (r7 == 0) goto L24
            boolean r3 = c(r6, r1)
        L24:
            if (r3 != 0) goto L2a
            boolean r7 = r2.f
            if (r7 == 0) goto La5
        L2a:
            java.lang.Boolean r7 = r6.J()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r7 = defpackage.nb3.k(r7, r0)
            if (r7 == 0) goto La5
            r6.K()
            goto La5
        L3b:
            boolean r7 = r6.q()
            if (r7 == 0) goto L46
            boolean r7 = d(r6, r1)
            goto L47
        L46:
            r7 = r3
        L47:
            boolean r1 = r6.p()
            if (r1 == 0) goto La4
            r1 = 1
            if (r6 == r0) goto L62
            sm3 r4 = r6.v()
            if (r4 == 0) goto La4
            boolean r4 = r4.I()
            if (r4 != r1) goto La4
            d34 r4 = r2.p
            boolean r4 = r4.p0
            if (r4 == 0) goto La4
        L62:
            if (r6 != r0) goto L8f
            qm3 r0 = r6.y0
            qm3 r4 = defpackage.qm3.NotUsed
            if (r0 != r4) goto L6d
            r6.f()
        L6d:
            sm3 r0 = r6.v()
            if (r0 == 0) goto L7f
            if0 r0 = r0.B0
            java.lang.Object r0 = r0.d
            y53 r0 = (defpackage.y53) r0
            if (r0 == 0) goto L7f
            lz3 r0 = r0.h0
            if (r0 != 0) goto L89
        L7f:
            zp4 r0 = defpackage.vm3.a(r6)
            te r0 = (defpackage.te) r0
            cx4 r0 = r0.getPlacementScope()
        L89:
            d34 r2 = r2.p
            defpackage.cx4.l(r0, r2, r3, r3)
            goto L92
        L8f:
            r6.R()
        L92:
            ap3 r0 = r5.e
            r0.getClass()
            int r2 = r6.J0
            if (r2 <= 0) goto La4
            java.lang.Object r0 = r0.B
            ua4 r0 = (defpackage.ua4) r0
            r0.b(r6)
            r6.I0 = r1
        La4:
            r3 = r7
        La5:
            r5.e()
        La8:
            return r3
    }

    public static boolean c(defpackage.sm3 r5, defpackage.q21 r6) {
            sm3 r0 = r5.e0
            wm3 r1 = r5.C0
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            if (r6 == 0) goto L1a
            if (r0 == 0) goto L18
            rz3 r0 = r1.q
            r0.getClass()
            long r3 = r6.a
            boolean r6 = r0.F0(r3)
            goto L2f
        L18:
            r6 = r2
            goto L2f
        L1a:
            rz3 r6 = r1.q
            if (r6 == 0) goto L21
            q21 r1 = r6.j0
            goto L22
        L21:
            r1 = 0
        L22:
            if (r1 == 0) goto L18
            if (r0 == 0) goto L18
            r6.getClass()
            long r0 = r1.a
            boolean r6 = r6.F0(r0)
        L2f:
            sm3 r0 = r5.v()
            if (r6 == 0) goto L57
            if (r0 == 0) goto L57
            sm3 r1 = r0.e0
            r3 = 3
            if (r1 != 0) goto L40
            defpackage.sm3.V(r0, r2, r3)
            return r6
        L40:
            qm3 r1 = r5.t()
            qm3 r4 = defpackage.qm3.InMeasureBlock
            if (r1 != r4) goto L4c
            defpackage.sm3.T(r0, r2, r3)
            return r6
        L4c:
            qm3 r5 = r5.t()
            qm3 r1 = defpackage.qm3.InLayoutBlock
            if (r5 != r1) goto L57
            r0.S(r2)
        L57:
            return r6
    }

    public static boolean d(defpackage.sm3 r4, defpackage.q21 r5) {
            r0 = 0
            if (r5 == 0) goto L17
            qm3 r1 = r4.y0
            qm3 r2 = defpackage.qm3.NotUsed
            if (r1 != r2) goto Lc
            r4.e()
        Lc:
            wm3 r1 = r4.C0
            d34 r1 = r1.p
            long r2 = r5.a
            boolean r5 = r1.C0(r2)
            goto L42
        L17:
            wm3 r5 = r4.C0
            d34 r5 = r5.p
            boolean r1 = r5.f0
            if (r1 == 0) goto L27
            long r1 = r5.R
            q21 r5 = new q21
            r5.<init>(r1)
            goto L28
        L27:
            r5 = 0
        L28:
            if (r5 == 0) goto L3e
            qm3 r1 = r4.y0
            qm3 r2 = defpackage.qm3.NotUsed
            if (r1 != r2) goto L33
            r4.e()
        L33:
            wm3 r1 = r4.C0
            d34 r1 = r1.p
            long r2 = r5.a
            boolean r5 = r1.C0(r2)
            goto L42
        L3e:
            r4.getClass()
            r5 = r0
        L42:
            sm3 r1 = r4.v()
            if (r5 == 0) goto L62
            if (r1 == 0) goto L62
            qm3 r2 = r4.s()
            qm3 r3 = defpackage.qm3.InMeasureBlock
            if (r2 != r3) goto L57
            r4 = 3
            defpackage.sm3.V(r1, r0, r4)
            return r5
        L57:
            qm3 r4 = r4.s()
            qm3 r2 = defpackage.qm3.InLayoutBlock
            if (r4 != r2) goto L62
            r1.U(r0)
        L62:
            return r5
    }

    public static boolean i(defpackage.sm3 r3) {
            wm3 r0 = r3.C0
            boolean r0 = r0.e
            if (r0 == 0) goto L20
            qm3 r0 = r3.t()
            qm3 r1 = defpackage.qm3.NotUsed
            r2 = 1
            if (r0 != r1) goto L1f
            wm3 r3 = r3.C0
            rz3 r3 = r3.q
            if (r3 == 0) goto L20
            tm3 r3 = r3.n0
            if (r3 == 0) goto L20
            boolean r3 = r3.e()
            if (r3 != r2) goto L20
        L1f:
            return r2
        L20:
            r3 = 0
            return r3
    }

    public static boolean j(defpackage.sm3 r2) {
            boolean r0 = r2.q()
            if (r0 == 0) goto L39
        L6:
            qm3 r0 = r2.s()
            qm3 r1 = defpackage.qm3.NotUsed
            if (r0 != r1) goto L2a
            wm3 r0 = r2.C0
            d34 r0 = r0.p
            tm3 r0 = r0.t0
            boolean r0 = r0.e()
            if (r0 != 0) goto L2a
            sm3 r0 = r2.v()
            if (r0 == 0) goto L25
            wm3 r0 = r0.C0
            om3 r0 = r0.d
            goto L26
        L25:
            r0 = 0
        L26:
            om3 r1 = defpackage.om3.Measuring
            if (r0 != r1) goto L39
        L2a:
            sm3 r2 = r2.v()
            if (r2 != 0) goto L31
            goto L39
        L31:
            boolean r0 = r2.I()
            if (r0 == 0) goto L6
            r2 = 1
            return r2
        L39:
            r2 = 0
            return r2
    }

    public static boolean k(defpackage.sm3 r4) {
            wm3 r0 = r4.C0
            boolean r1 = r4.I()
            r2 = 1
            if (r1 != 0) goto L42
            d34 r1 = r0.p
            boolean r1 = r1.p0
            if (r1 != 0) goto L42
            boolean r1 = j(r4)
            if (r1 != 0) goto L42
            java.lang.Boolean r1 = r4.J()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L42
            boolean r4 = i(r4)
            if (r4 != 0) goto L42
            d34 r4 = r0.p
            tm3 r4 = r4.t0
            boolean r4 = r4.e()
            if (r4 != 0) goto L42
            rz3 r4 = r0.q
            if (r4 == 0) goto L40
            tm3 r4 = r4.n0
            if (r4 == 0) goto L40
            boolean r4 = r4.e()
            if (r4 != r2) goto L40
            goto L42
        L40:
            r4 = 0
            return r4
        L42:
            return r2
    }

    public final void b(boolean r3) {
            r2 = this;
            ap3 r0 = r2.e
            if (r3 == 0) goto L17
            java.lang.Object r3 = r0.B
            ua4 r3 = (defpackage.ua4) r3
            sm3 r2 = r2.a
            int r1 = r2.J0
            if (r1 <= 0) goto L17
            r3.g()
            r3.b(r2)
            r3 = 1
            r2.I0 = r3
        L17:
            java.lang.Object r2 = r0.B
            ua4 r2 = (defpackage.ua4) r2
            int r2 = r2.L
            if (r2 == 0) goto L30
            java.lang.String r2 = "Compose:onPositionedCallbacks"
            android.os.Trace.beginSection(r2)
            r0.o()     // Catch: java.lang.Throwable -> L2b
            android.os.Trace.endSection()
            return
        L2b:
            r2 = move-exception
            android.os.Trace.endSection()
            throw r2
        L30:
            return
    }

    public final void e() {
            r7 = this;
            ua4 r7 = r7.h
            int r0 = r7.L
            if (r0 == 0) goto L2d
            java.lang.Object[] r1 = r7.A
            r2 = 0
        L9:
            if (r2 >= r0) goto L2a
            r3 = r1[r2]
            y24 r3 = (defpackage.y24) r3
            sm3 r4 = r3.a
            boolean r4 = r4.H()
            if (r4 == 0) goto L27
            boolean r4 = r3.b
            sm3 r5 = r3.a
            boolean r3 = r3.c
            r6 = 2
            if (r4 != 0) goto L24
            defpackage.sm3.V(r5, r3, r6)
            goto L27
        L24:
            defpackage.sm3.T(r5, r3, r6)
        L27:
            int r2 = r2 + 1
            goto L9
        L2a:
            r7.g()
        L2d:
            return
    }

    public final void f(defpackage.sm3 r6) {
            r5 = this;
            ua4 r6 = r6.z()
            java.lang.Object[] r0 = r6.A
            int r6 = r6.L
            r1 = 0
        L9:
            if (r1 >= r6) goto L30
            r2 = r0[r1]
            sm3 r2 = (defpackage.sm3) r2
            java.lang.Boolean r3 = r2.J()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 == 0) goto L2d
            boolean r3 = r2.K0
            if (r3 != 0) goto L2d
            bt r3 = r5.b
            boolean r3 = r3.B(r2)
            if (r3 == 0) goto L2a
            r2.K()
        L2a:
            r5.f(r2)
        L2d:
            int r1 = r1 + 1
            goto L9
        L30:
            return
    }

    public final void g(defpackage.sm3 r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.c
            if (r0 != 0) goto L9
            java.lang.String r0 = "forceMeasureTheSubtree should be executed during the measureAndLayout pass"
            defpackage.p53.c(r0)
        L9:
            if (r3 == 0) goto L10
            wm3 r0 = r2.C0
            boolean r0 = r0.e
            goto L14
        L10:
            boolean r0 = r2.q()
        L14:
            if (r0 == 0) goto L1b
            java.lang.String r0 = "node not yet measured"
            defpackage.p53.a(r0)
        L1b:
            r1.h(r2, r3)
            return
    }

    public final void h(defpackage.sm3 r8, boolean r9) {
            r7 = this;
            ua4 r0 = r8.z()
            java.lang.Object[] r1 = r0.A
            int r0 = r0.L
            r2 = 0
        L9:
            if (r2 >= r0) goto L7d
            r3 = r1[r2]
            sm3 r3 = (defpackage.sm3) r3
            r4 = 1
            if (r9 != 0) goto L27
            qm3 r5 = r3.s()
            qm3 r6 = defpackage.qm3.InMeasureBlock
            if (r5 == r6) goto L41
            wm3 r5 = r3.C0
            d34 r5 = r5.p
            tm3 r5 = r5.t0
            boolean r5 = r5.e()
            if (r5 == 0) goto L27
            goto L41
        L27:
            if (r9 == 0) goto L7a
            qm3 r5 = r3.t()
            qm3 r6 = defpackage.qm3.InMeasureBlock
            if (r5 == r6) goto L41
            wm3 r5 = r3.C0
            rz3 r5 = r5.q
            if (r5 == 0) goto L7a
            tm3 r5 = r5.n0
            if (r5 == 0) goto L7a
            boolean r5 = r5.e()
            if (r5 != r4) goto L7a
        L41:
            boolean r5 = defpackage.bl2.J(r3)
            wm3 r6 = r3.C0
            if (r5 == 0) goto L5e
            if (r9 != 0) goto L5e
            boolean r5 = r6.e
            if (r5 == 0) goto L5b
            bt r5 = r7.b
            boolean r5 = r5.B(r3)
            if (r5 == 0) goto L5b
            r7.o(r3, r4)
            goto L5e
        L5b:
            r7.g(r3, r4)
        L5e:
            if (r9 == 0) goto L63
            boolean r4 = r6.e
            goto L67
        L63:
            boolean r4 = r3.q()
        L67:
            if (r4 == 0) goto L6c
            r7.o(r3, r9)
        L6c:
            if (r9 == 0) goto L71
            boolean r4 = r6.e
            goto L75
        L71:
            boolean r4 = r3.q()
        L75:
            if (r4 != 0) goto L7a
            r7.h(r3, r9)
        L7a:
            int r2 = r2 + 1
            goto L9
        L7d:
            if (r9 == 0) goto L84
            wm3 r0 = r8.C0
            boolean r0 = r0.e
            goto L88
        L84:
            boolean r0 = r8.q()
        L88:
            if (r0 == 0) goto L8d
            r7.o(r8, r9)
        L8d:
            return
    }

    public final boolean l(defpackage.ke r17) {
            r16 = this;
            r1 = r16
            bt r0 = r1.b
            sm3 r2 = r1.a
            boolean r3 = r2.H()
            if (r3 != 0) goto L11
            java.lang.String r3 = "performMeasureAndLayout called with unattached root"
            defpackage.p53.a(r3)
        L11:
            boolean r3 = r2.I()
            if (r3 != 0) goto L1c
            java.lang.String r3 = "performMeasureAndLayout called with unplaced root"
            defpackage.p53.a(r3)
        L1c:
            boolean r3 = r1.c
            if (r3 == 0) goto L25
            java.lang.String r3 = "performMeasureAndLayout called during measure layout"
            defpackage.p53.a(r3)
        L25:
            q21 r3 = r1.i
            r4 = 0
            r5 = 1
            if (r3 == 0) goto Lda
            r1.c = r5
            r1.d = r5
            boolean r3 = r0.O()     // Catch: java.lang.Throwable -> L62
            java.lang.Object r6 = r0.B
            d51 r6 = (defpackage.d51) r6
            if (r3 == 0) goto Lcd
            r3 = r4
        L3a:
            java.lang.Object r7 = r0.R     // Catch: java.lang.Throwable -> L62
            d51 r7 = (defpackage.d51) r7     // Catch: java.lang.Throwable -> L62
            java.lang.Object r8 = r0.L     // Catch: java.lang.Throwable -> L62
            d51 r8 = (defpackage.d51) r8     // Catch: java.lang.Throwable -> L62
            java.lang.Object r9 = r6.B     // Catch: java.lang.Throwable -> L62
            fn6 r9 = (defpackage.fn6) r9     // Catch: java.lang.Throwable -> L62
            boolean r9 = r9.isEmpty()     // Catch: java.lang.Throwable -> L62
            if (r9 != 0) goto L65
            java.lang.Object r7 = r6.B     // Catch: java.lang.Throwable -> L62
            fn6 r7 = (defpackage.fn6) r7     // Catch: java.lang.Throwable -> L62
            java.lang.Object r7 = r7.first()     // Catch: java.lang.Throwable -> L62
            sm3 r7 = (defpackage.sm3) r7     // Catch: java.lang.Throwable -> L62
            r6.o(r7)     // Catch: java.lang.Throwable -> L62
            sm3 r8 = r7.e0     // Catch: java.lang.Throwable -> L62
            if (r8 == 0) goto L5f
            r8 = r5
            goto L60
        L5f:
            r8 = r4
        L60:
            r9 = r4
            goto L9f
        L62:
            r0 = move-exception
            goto Ld3
        L65:
            java.lang.Object r9 = r8.B     // Catch: java.lang.Throwable -> L62
            fn6 r9 = (defpackage.fn6) r9     // Catch: java.lang.Throwable -> L62
            boolean r9 = r9.isEmpty()     // Catch: java.lang.Throwable -> L62
            if (r9 != 0) goto L85
            java.lang.Object r7 = r8.B     // Catch: java.lang.Throwable -> L62
            fn6 r7 = (defpackage.fn6) r7     // Catch: java.lang.Throwable -> L62
            java.lang.Object r7 = r7.first()     // Catch: java.lang.Throwable -> L62
            sm3 r7 = (defpackage.sm3) r7     // Catch: java.lang.Throwable -> L62
            r8.o(r7)     // Catch: java.lang.Throwable -> L62
            sm3 r8 = r7.e0     // Catch: java.lang.Throwable -> L62
            if (r8 == 0) goto L82
            r8 = r5
            goto L83
        L82:
            r8 = r4
        L83:
            r9 = r5
            goto L9f
        L85:
            java.lang.Object r8 = r7.B     // Catch: java.lang.Throwable -> L62
            fn6 r8 = (defpackage.fn6) r8     // Catch: java.lang.Throwable -> L62
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Throwable -> L62
            if (r8 != 0) goto Lc7
            java.lang.Object r8 = r7.B     // Catch: java.lang.Throwable -> L62
            fn6 r8 = (defpackage.fn6) r8     // Catch: java.lang.Throwable -> L62
            java.lang.Object r8 = r8.first()     // Catch: java.lang.Throwable -> L62
            sm3 r8 = (defpackage.sm3) r8     // Catch: java.lang.Throwable -> L62
            r7.o(r8)     // Catch: java.lang.Throwable -> L62
            r9 = r5
            r7 = r8
            r8 = r4
        L9f:
            if (r9 == 0) goto La6
            boolean r8 = a(r1, r7, r8)     // Catch: java.lang.Throwable -> L62
            goto Lc0
        La6:
            boolean r8 = r1.o(r7, r8)     // Catch: java.lang.Throwable -> L62
            wm3 r9 = r7.C0     // Catch: java.lang.Throwable -> L62
            boolean r9 = r9.f     // Catch: java.lang.Throwable -> L62
            if (r9 == 0) goto Lb5
            wb3 r9 = defpackage.wb3.LookaheadPlacement     // Catch: java.lang.Throwable -> L62
            r0.y(r7, r9)     // Catch: java.lang.Throwable -> L62
        Lb5:
            boolean r9 = r7.p()     // Catch: java.lang.Throwable -> L62
            if (r9 == 0) goto Lc0
            wb3 r9 = defpackage.wb3.Placement     // Catch: java.lang.Throwable -> L62
            r0.y(r7, r9)     // Catch: java.lang.Throwable -> L62
        Lc0:
            if (r7 != r2) goto L3a
            if (r8 == 0) goto L3a
            r3 = r5
            goto L3a
        Lc7:
            if (r17 == 0) goto Lce
            r17.c()     // Catch: java.lang.Throwable -> L62
            goto Lce
        Lcd:
            r3 = r4
        Lce:
            r1.c = r4
            r1.d = r4
            goto Ldb
        Ld3:
            throw r0     // Catch: java.lang.Throwable -> Ld4
        Ld4:
            r0 = move-exception
            r1.c = r4
            r1.d = r4
            throw r0
        Lda:
            r3 = r4
        Ldb:
            ua4 r0 = r1.f
            java.lang.Object[] r1 = r0.A
            int r2 = r0.L
            r6 = r4
        Le2:
            if (r6 >= r2) goto L16e
            r7 = r1[r6]
            sm3 r7 = (defpackage.sm3) r7
            if0 r7 = r7.B0
            java.lang.Object r8 = r7.d
            y53 r8 = (defpackage.y53) r8
            r9 = 4194304(0x400000, float:5.877472E-39)
            boolean r10 = defpackage.fg4.g(r9)
            if (r10 == 0) goto Lf9
            vy6 r11 = r8.P0
            goto L101
        Lf9:
            vy6 r11 = r8.P0
            z64 r11 = r11.X
            if (r11 != 0) goto L101
            goto L169
        L101:
            op5 r12 = defpackage.eg4.K0
            z64 r8 = r8.a1(r10)
        L107:
            if (r8 == 0) goto L169
            int r10 = r8.R
            r10 = r10 & r9
            if (r10 == 0) goto L169
            int r10 = r8.L
            r10 = r10 & r9
            if (r10 == 0) goto L163
            r10 = 0
            r12 = r8
            r13 = r10
        L116:
            if (r12 == 0) goto L163
            boolean r14 = r12 instanceof defpackage.kj3
            if (r14 == 0) goto L126
            kj3 r12 = (defpackage.kj3) r12
            java.lang.Object r14 = r7.d
            y53 r14 = (defpackage.y53) r14
            r12.m(r14)
            goto L15e
        L126:
            int r14 = r12.L
            r14 = r14 & r9
            if (r14 == 0) goto L15e
            boolean r14 = r12 instanceof defpackage.zg1
            if (r14 == 0) goto L15e
            r14 = r12
            zg1 r14 = (defpackage.zg1) r14
            z64 r14 = r14.l0
            r15 = r4
        L135:
            if (r14 == 0) goto L15a
            int r4 = r14.L
            r4 = r4 & r9
            if (r4 == 0) goto L156
            int r15 = r15 + 1
            if (r15 != r5) goto L142
            r12 = r14
            goto L156
        L142:
            if (r13 != 0) goto L14d
            ua4 r13 = new ua4
            r4 = 16
            z64[] r4 = new defpackage.z64[r4]
            r13.<init>(r4)
        L14d:
            if (r12 == 0) goto L153
            r13.b(r12)
            r12 = r10
        L153:
            r13.b(r14)
        L156:
            z64 r14 = r14.Y
            r4 = 0
            goto L135
        L15a:
            if (r15 != r5) goto L15e
        L15c:
            r4 = 0
            goto L116
        L15e:
            z64 r12 = defpackage.nc1.A(r13)
            goto L15c
        L163:
            if (r8 == r11) goto L169
            z64 r8 = r8.Y
            r4 = 0
            goto L107
        L169:
            int r6 = r6 + 1
            r4 = 0
            goto Le2
        L16e:
            r0.g()
            return r3
    }

    public final void m(defpackage.sm3 r13, long r14) {
            r12 = this;
            boolean r0 = r13.K0
            wm3 r1 = r13.C0
            if (r0 == 0) goto L7
            return
        L7:
            sm3 r0 = r12.a
            if (r13 == r0) goto Lc
            goto L11
        Lc:
            java.lang.String r2 = "measureAndLayout called on root"
            defpackage.p53.a(r2)
        L11:
            boolean r2 = r0.H()
            if (r2 != 0) goto L1c
            java.lang.String r2 = "performMeasureAndLayout called with unattached root"
            defpackage.p53.a(r2)
        L1c:
            boolean r0 = r0.I()
            if (r0 != 0) goto L27
            java.lang.String r0 = "performMeasureAndLayout called with unplaced root"
            defpackage.p53.a(r0)
        L27:
            boolean r0 = r12.c
            if (r0 == 0) goto L30
            java.lang.String r0 = "performMeasureAndLayout called during measure layout"
            defpackage.p53.a(r0)
        L30:
            q21 r0 = r12.i
            r2 = 1
            r3 = 0
            if (r0 == 0) goto Ld4
            r12.c = r2
            r12.d = r3
            bt r0 = r12.b     // Catch: java.lang.Throwable -> L61
            java.lang.Object r4 = r0.B     // Catch: java.lang.Throwable -> L61
            d51 r4 = (defpackage.d51) r4     // Catch: java.lang.Throwable -> L61
            r4.o(r13)     // Catch: java.lang.Throwable -> L61
            java.lang.Object r4 = r0.L     // Catch: java.lang.Throwable -> L61
            d51 r4 = (defpackage.d51) r4     // Catch: java.lang.Throwable -> L61
            r4.o(r13)     // Catch: java.lang.Throwable -> L61
            java.lang.Object r0 = r0.R     // Catch: java.lang.Throwable -> L61
            d51 r0 = (defpackage.d51) r0     // Catch: java.lang.Throwable -> L61
            r0.o(r13)     // Catch: java.lang.Throwable -> L61
            q21 r0 = new q21     // Catch: java.lang.Throwable -> L61
            r0.<init>(r14)     // Catch: java.lang.Throwable -> L61
            boolean r0 = c(r13, r0)     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto L63
            boolean r0 = r1.f     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L72
            goto L63
        L61:
            r13 = move-exception
            goto Lcd
        L63:
            java.lang.Boolean r0 = r13.J()     // Catch: java.lang.Throwable -> L61
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L61
            boolean r0 = defpackage.nb3.k(r0, r4)     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L72
            r13.K()     // Catch: java.lang.Throwable -> L61
        L72:
            r12.f(r13)     // Catch: java.lang.Throwable -> L61
            qm3 r0 = r13.y0     // Catch: java.lang.Throwable -> L61
            qm3 r4 = defpackage.qm3.NotUsed     // Catch: java.lang.Throwable -> L61
            if (r0 != r4) goto L7e
            r13.e()     // Catch: java.lang.Throwable -> L61
        L7e:
            d34 r0 = r1.p     // Catch: java.lang.Throwable -> L61
            boolean r14 = r0.C0(r14)     // Catch: java.lang.Throwable -> L61
            sm3 r15 = r13.v()     // Catch: java.lang.Throwable -> L61
            if (r14 == 0) goto La4
            if (r15 == 0) goto La4
            qm3 r14 = r13.s()     // Catch: java.lang.Throwable -> L61
            qm3 r0 = defpackage.qm3.InMeasureBlock     // Catch: java.lang.Throwable -> L61
            if (r14 != r0) goto L99
            r14 = 3
            defpackage.sm3.V(r15, r3, r14)     // Catch: java.lang.Throwable -> L61
            goto La4
        L99:
            qm3 r14 = r13.s()     // Catch: java.lang.Throwable -> L61
            qm3 r0 = defpackage.qm3.InLayoutBlock     // Catch: java.lang.Throwable -> L61
            if (r14 != r0) goto La4
            r15.U(r3)     // Catch: java.lang.Throwable -> L61
        La4:
            boolean r14 = r13.p()     // Catch: java.lang.Throwable -> L61
            if (r14 == 0) goto Lc5
            boolean r14 = r13.I()     // Catch: java.lang.Throwable -> L61
            if (r14 == 0) goto Lc5
            r13.R()     // Catch: java.lang.Throwable -> L61
            ap3 r14 = r12.e     // Catch: java.lang.Throwable -> L61
            r14.getClass()     // Catch: java.lang.Throwable -> L61
            int r15 = r13.J0     // Catch: java.lang.Throwable -> L61
            if (r15 <= 0) goto Lc5
            java.lang.Object r14 = r14.B     // Catch: java.lang.Throwable -> L61
            ua4 r14 = (defpackage.ua4) r14     // Catch: java.lang.Throwable -> L61
            r14.b(r13)     // Catch: java.lang.Throwable -> L61
            r13.I0 = r2     // Catch: java.lang.Throwable -> L61
        Lc5:
            r12.e()     // Catch: java.lang.Throwable -> L61
            r12.c = r3
            r12.d = r3
            goto Ld4
        Lcd:
            throw r13     // Catch: java.lang.Throwable -> Lce
        Lce:
            r13 = move-exception
            r12.c = r3
            r12.d = r3
            throw r13
        Ld4:
            ua4 r12 = r12.f
            java.lang.Object[] r13 = r12.A
            int r14 = r12.L
            r15 = r3
        Ldb:
            if (r15 >= r14) goto L163
            r0 = r13[r15]
            sm3 r0 = (defpackage.sm3) r0
            if0 r0 = r0.B0
            java.lang.Object r1 = r0.d
            y53 r1 = (defpackage.y53) r1
            r4 = 4194304(0x400000, float:5.877472E-39)
            boolean r5 = defpackage.fg4.g(r4)
            if (r5 == 0) goto Lf2
            vy6 r6 = r1.P0
            goto Lfa
        Lf2:
            vy6 r6 = r1.P0
            z64 r6 = r6.X
            if (r6 != 0) goto Lfa
            goto L15f
        Lfa:
            op5 r7 = defpackage.eg4.K0
            z64 r1 = r1.a1(r5)
        L100:
            if (r1 == 0) goto L15f
            int r5 = r1.R
            r5 = r5 & r4
            if (r5 == 0) goto L15f
            int r5 = r1.L
            r5 = r5 & r4
            if (r5 == 0) goto L15a
            r5 = 0
            r7 = r1
            r8 = r5
        L10f:
            if (r7 == 0) goto L15a
            boolean r9 = r7 instanceof defpackage.kj3
            if (r9 == 0) goto L11f
            kj3 r7 = (defpackage.kj3) r7
            java.lang.Object r9 = r0.d
            y53 r9 = (defpackage.y53) r9
            r7.m(r9)
            goto L155
        L11f:
            int r9 = r7.L
            r9 = r9 & r4
            if (r9 == 0) goto L155
            boolean r9 = r7 instanceof defpackage.zg1
            if (r9 == 0) goto L155
            r9 = r7
            zg1 r9 = (defpackage.zg1) r9
            z64 r9 = r9.l0
            r10 = r3
        L12e:
            if (r9 == 0) goto L152
            int r11 = r9.L
            r11 = r11 & r4
            if (r11 == 0) goto L14f
            int r10 = r10 + 1
            if (r10 != r2) goto L13b
            r7 = r9
            goto L14f
        L13b:
            if (r8 != 0) goto L146
            ua4 r8 = new ua4
            r11 = 16
            z64[] r11 = new defpackage.z64[r11]
            r8.<init>(r11)
        L146:
            if (r7 == 0) goto L14c
            r8.b(r7)
            r7 = r5
        L14c:
            r8.b(r9)
        L14f:
            z64 r9 = r9.Y
            goto L12e
        L152:
            if (r10 != r2) goto L155
            goto L10f
        L155:
            z64 r7 = defpackage.nc1.A(r8)
            goto L10f
        L15a:
            if (r1 == r6) goto L15f
            z64 r1 = r1.Y
            goto L100
        L15f:
            int r15 = r15 + 1
            goto Ldb
        L163:
            r12.g()
            return
    }

    public final void n() {
            r5 = this;
            bt r0 = r5.b
            boolean r1 = r0.O()
            if (r1 == 0) goto L70
            sm3 r1 = r5.a
            boolean r2 = r1.H()
            if (r2 != 0) goto L15
            java.lang.String r2 = "performMeasureAndLayout called with unattached root"
            defpackage.p53.a(r2)
        L15:
            boolean r2 = r1.I()
            if (r2 != 0) goto L20
            java.lang.String r2 = "performMeasureAndLayout called with unplaced root"
            defpackage.p53.a(r2)
        L20:
            boolean r2 = r5.c
            if (r2 == 0) goto L29
            java.lang.String r2 = "performMeasureAndLayout called during measure layout"
            defpackage.p53.a(r2)
        L29:
            q21 r2 = r5.i
            if (r2 == 0) goto L70
            r2 = 1
            r5.c = r2
            r3 = 0
            r5.d = r3
            java.lang.Object r4 = r0.R     // Catch: java.lang.Throwable -> L5c
            d51 r4 = (defpackage.d51) r4     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r4 = r4.B     // Catch: java.lang.Throwable -> L5c
            fn6 r4 = (defpackage.fn6) r4     // Catch: java.lang.Throwable -> L5c
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L5c
            if (r4 != 0) goto L51
            java.lang.Object r0 = r0.B     // Catch: java.lang.Throwable -> L5c
            d51 r0 = (defpackage.d51) r0     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r0 = r0.B     // Catch: java.lang.Throwable -> L5c
            fn6 r0 = (defpackage.fn6) r0     // Catch: java.lang.Throwable -> L5c
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L5c
            if (r0 != 0) goto L51
            r0 = r2
            goto L52
        L51:
            r0 = r3
        L52:
            if (r0 == 0) goto L61
            sm3 r0 = r1.e0     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L5e
            r5.q(r1, r2)     // Catch: java.lang.Throwable -> L5c
            goto L61
        L5c:
            r0 = move-exception
            goto L69
        L5e:
            r5.p(r1)     // Catch: java.lang.Throwable -> L5c
        L61:
            r5.q(r1, r3)     // Catch: java.lang.Throwable -> L5c
            r5.c = r3
            r5.d = r3
            return
        L69:
            throw r0     // Catch: java.lang.Throwable -> L6a
        L6a:
            r0 = move-exception
            r5.c = r3
            r5.d = r3
            throw r0
        L70:
            return
    }

    public final boolean o(defpackage.sm3 r3, boolean r4) {
            r2 = this;
            boolean r0 = r3.K0
            r1 = 0
            if (r0 == 0) goto L6
            goto L31
        L6:
            boolean r0 = k(r3)
            if (r0 == 0) goto L31
            sm3 r0 = r2.a
            if (r3 != r0) goto L16
            q21 r0 = r2.i
            r0.getClass()
            goto L17
        L16:
            r0 = 0
        L17:
            if (r4 == 0) goto L24
            wm3 r4 = r3.C0
            boolean r4 = r4.e
            if (r4 == 0) goto L2e
            boolean r1 = c(r3, r0)
            goto L2e
        L24:
            boolean r4 = r3.q()
            if (r4 == 0) goto L2e
            boolean r1 = d(r3, r0)
        L2e:
            r2.e()
        L31:
            return r1
    }

    public final void p(defpackage.sm3 r6) {
            r5 = this;
            ua4 r6 = r6.z()
            java.lang.Object[] r0 = r6.A
            int r6 = r6.L
            r1 = 0
        L9:
            if (r1 >= r6) goto L34
            r2 = r0[r1]
            sm3 r2 = (defpackage.sm3) r2
            qm3 r3 = r2.s()
            qm3 r4 = defpackage.qm3.InMeasureBlock
            if (r3 == r4) goto L23
            wm3 r3 = r2.C0
            d34 r3 = r3.p
            tm3 r3 = r3.t0
            boolean r3 = r3.e()
            if (r3 == 0) goto L31
        L23:
            boolean r3 = defpackage.bl2.J(r2)
            if (r3 == 0) goto L2e
            r3 = 1
            r5.q(r2, r3)
            goto L31
        L2e:
            r5.p(r2)
        L31:
            int r1 = r1 + 1
            goto L9
        L34:
            return
    }

    public final void q(defpackage.sm3 r2, boolean r3) {
            r1 = this;
            boolean r0 = r2.K0
            if (r0 == 0) goto L5
            return
        L5:
            sm3 r0 = r1.a
            if (r2 != r0) goto Lf
            q21 r1 = r1.i
            r1.getClass()
            goto L10
        Lf:
            r1 = 0
        L10:
            if (r3 == 0) goto L16
            c(r2, r1)
            return
        L16:
            d(r2, r1)
            return
    }

    public final boolean r(defpackage.sm3 r5, boolean r6) {
            r4 = this;
            wm3 r0 = r5.C0
            om3 r0 = r0.d
            int[] r1 = defpackage.z24.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L63
            r3 = 2
            if (r0 == r3) goto L63
            r3 = 3
            if (r0 == r3) goto L59
            r3 = 4
            if (r0 == r3) goto L59
            r3 = 5
            if (r0 != r3) goto L55
            boolean r0 = r5.q()
            if (r0 == 0) goto L25
            if (r6 != 0) goto L25
            goto L63
        L25:
            wm3 r6 = r5.C0
            d34 r6 = r6.p
            r6.q0 = r2
            boolean r6 = r5.K0
            if (r6 == 0) goto L30
            goto L63
        L30:
            boolean r6 = r5.I()
            if (r6 != 0) goto L3c
            boolean r6 = j(r5)
            if (r6 == 0) goto L63
        L3c:
            sm3 r6 = r5.v()
            if (r6 == 0) goto L49
            boolean r6 = r6.q()
            if (r6 != r2) goto L49
            goto L50
        L49:
            bt r6 = r4.b
            wb3 r0 = defpackage.wb3.Measurement
            r6.y(r5, r0)
        L50:
            boolean r4 = r4.d
            if (r4 != 0) goto L63
            return r2
        L55:
            defpackage.i.d()
            return r1
        L59:
            y24 r0 = new y24
            r0.<init>(r5, r1, r6)
            ua4 r4 = r4.h
            r4.b(r0)
        L63:
            return r1
    }

    public final void s(long r3) {
            r2 = this;
            q21 r0 = r2.i
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            long r0 = r0.a
            boolean r0 = defpackage.q21.b(r0, r3)
        Lc:
            if (r0 != 0) goto L39
            boolean r0 = r2.c
            if (r0 == 0) goto L17
            java.lang.String r0 = "updateRootConstraints called while measuring"
            defpackage.p53.a(r0)
        L17:
            q21 r0 = new q21
            r0.<init>(r3)
            r2.i = r0
            sm3 r3 = r2.a
            sm3 r4 = r3.e0
            wm3 r0 = r3.C0
            r1 = 1
            if (r4 == 0) goto L29
            r0.e = r1
        L29:
            d34 r0 = r0.p
            r0.q0 = r1
            if (r4 == 0) goto L32
            wb3 r4 = defpackage.wb3.LookaheadMeasurement
            goto L34
        L32:
            wb3 r4 = defpackage.wb3.Measurement
        L34:
            bt r2 = r2.b
            r2.y(r3, r4)
        L39:
            return
    }
}
