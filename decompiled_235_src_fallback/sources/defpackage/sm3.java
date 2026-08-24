package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sm3  reason: default package */
/* loaded from: classes.dex */
public final class sm3 implements defpackage.ww0, defpackage.aq4, defpackage.jx0 {
    public static final defpackage.q16 L0 = null;
    public static final defpackage.nm3 M0 = null;
    public static final defpackage.bk N0 = null;
    public final boolean A;
    public boolean A0;
    public int B;
    public final defpackage.if0 B0;
    public final defpackage.wm3 C0;
    public defpackage.gn3 D0;
    public defpackage.eg4 E0;
    public boolean F0;
    public defpackage.a74 G0;
    public defpackage.a74 H0;
    public boolean I0;
    public int J0;
    public boolean K0;
    public boolean L;
    public long R;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean d0;
    public defpackage.sm3 e0;
    public int f0;
    public final defpackage.ap3 g0;
    public defpackage.ua4 h0;
    public boolean i0;
    public defpackage.sm3 j0;
    public defpackage.zp4 k0;
    public int l0;
    public boolean m0;
    public boolean n0;
    public defpackage.ta6 o0;
    public boolean p0;
    public final defpackage.ua4 q0;
    public boolean r0;
    public defpackage.e34 s0;
    public defpackage.yc1 t0;
    public defpackage.qh1 u0;
    public defpackage.kk3 v0;
    public defpackage.fo7 w0;
    public defpackage.hy0 x0;
    public defpackage.qm3 y0;
    public defpackage.qm3 z0;

    static {
            q16 r0 = new q16
            java.lang.String r1 = "Undefined intrinsics block and it is required"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.sm3.L0 = r0
            nm3 r0 = new nm3
            r0.<init>()
            defpackage.sm3.M0 = r0
            bk r0 = new bk
            r1 = 4
            r0.<init>(r1)
            defpackage.sm3.N0 = r0
            return
    }

    public sm3(int r3) {
            r2 = this;
            r0 = 1
            r3 = r3 & r0
            if (r3 == 0) goto L6
            r3 = 0
            goto L7
        L6:
            r3 = r0
        L7:
            java.util.concurrent.atomic.AtomicInteger r1 = defpackage.ua6.a
            int r0 = r1.addAndGet(r0)
            r2.<init>(r3, r0)
            return
    }

    public sm3(boolean r5, int r6) {
            r4 = this;
            r4.<init>()
            r4.A = r5
            r4.B = r6
            r5 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r4.R = r5
            r5 = 1
            r4.X = r5
            r4.Y = r5
            ap3 r6 = new ap3
            ua4 r0 = new ua4
            r1 = 16
            sm3[] r2 = new defpackage.sm3[r1]
            r0.<init>(r2)
            pj r2 = new pj
            r3 = 10
            r2.<init>(r4, r3)
            r3 = 6
            r6.<init>(r3, r0, r2)
            r4.g0 = r6
            ua4 r6 = new ua4
            sm3[] r0 = new defpackage.sm3[r1]
            r6.<init>(r0)
            r4.q0 = r6
            r4.r0 = r5
            q16 r6 = defpackage.sm3.L0
            r4.s0 = r6
            th1 r6 = defpackage.vm3.a
            r4.u0 = r6
            kk3 r6 = defpackage.kk3.Ltr
            r4.v0 = r6
            nm3 r6 = defpackage.sm3.M0
            r4.w0 = r6
            gy0 r6 = defpackage.hy0.j
            r6.getClass()
            xv4 r6 = defpackage.gy0.b
            r4.x0 = r6
            qm3 r6 = defpackage.qm3.NotUsed
            r4.y0 = r6
            r4.z0 = r6
            if0 r6 = new if0
            r6.<init>(r4)
            r4.B0 = r6
            wm3 r6 = new wm3
            r6.<init>(r4)
            r4.C0 = r6
            r4.F0 = r5
            x64 r5 = defpackage.x64.a
            r4.G0 = r5
            return
    }

    public static void T(defpackage.sm3 r4, boolean r5, int r6) {
            r0 = r6 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r5 = r1
        L6:
            r0 = r6 & 2
            r2 = 1
            if (r0 == 0) goto Ld
            r0 = r2
            goto Le
        Ld:
            r0 = r1
        Le:
            r6 = r6 & 4
            if (r6 == 0) goto L13
            r1 = r2
        L13:
            sm3 r6 = r4.e0
            if (r6 == 0) goto L18
            goto L1d
        L18:
            java.lang.String r6 = "Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope"
            defpackage.p53.c(r6)
        L1d:
            zp4 r6 = r4.k0
            if (r6 != 0) goto L22
            goto L82
        L22:
            boolean r3 = r4.m0
            if (r3 != 0) goto L82
            boolean r3 = r4.A
            if (r3 != 0) goto L82
            te r6 = (defpackage.te) r6
            r6.w(r4, r2, r5, r0)
            if (r1 == 0) goto L82
            wm3 r4 = r4.C0
            rz3 r4 = r4.q
            r4.getClass()
            wm3 r4 = r4.Y
            sm3 r6 = r4.a
            sm3 r6 = r6.v()
            sm3 r4 = r4.a
            qm3 r4 = r4.y0
            if (r6 == 0) goto L82
            qm3 r0 = defpackage.qm3.NotUsed
            if (r4 == r0) goto L82
        L4a:
            qm3 r0 = r6.y0
            if (r0 != r4) goto L57
            sm3 r0 = r6.v()
            if (r0 != 0) goto L55
            goto L57
        L55:
            r6 = r0
            goto L4a
        L57:
            int[] r0 = defpackage.pz3.b
            int r4 = r4.ordinal()
            r4 = r0[r4]
            if (r4 == r2) goto L76
            r0 = 2
            if (r4 != r0) goto L70
            sm3 r4 = r6.e0
            if (r4 == 0) goto L6c
            r6.S(r5)
            return
        L6c:
            r6.U(r5)
            return
        L70:
            java.lang.String r4 = "Intrinsics isn't used by the parent"
            defpackage.i.m(r4)
            return
        L76:
            sm3 r4 = r6.e0
            r0 = 6
            if (r4 == 0) goto L7f
            T(r6, r5, r0)
            return
        L7f:
            V(r6, r5, r0)
        L82:
            return
    }

    public static void V(defpackage.sm3 r4, boolean r5, int r6) {
            r0 = r6 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r5 = r1
        L6:
            r0 = r6 & 2
            r2 = 1
            if (r0 == 0) goto Ld
            r0 = r2
            goto Le
        Ld:
            r0 = r1
        Le:
            r6 = r6 & 4
            if (r6 == 0) goto L14
            r6 = r2
            goto L15
        L14:
            r6 = r1
        L15:
            boolean r3 = r4.m0
            if (r3 != 0) goto L67
            boolean r3 = r4.A
            if (r3 != 0) goto L67
            zp4 r3 = r4.k0
            if (r3 != 0) goto L22
            goto L67
        L22:
            te r3 = (defpackage.te) r3
            r3.w(r4, r1, r5, r0)
            if (r6 == 0) goto L67
            wm3 r4 = r4.C0
            d34 r4 = r4.p
            wm3 r4 = r4.Y
            sm3 r6 = r4.a
            sm3 r6 = r6.v()
            sm3 r4 = r4.a
            qm3 r4 = r4.y0
            if (r6 == 0) goto L67
            qm3 r0 = defpackage.qm3.NotUsed
            if (r4 == r0) goto L67
        L3f:
            qm3 r0 = r6.y0
            if (r0 != r4) goto L4c
            sm3 r0 = r6.v()
            if (r0 != 0) goto L4a
            goto L4c
        L4a:
            r6 = r0
            goto L3f
        L4c:
            int[] r0 = defpackage.b34.b
            int r4 = r4.ordinal()
            r4 = r0[r4]
            if (r4 == r2) goto L63
            r0 = 2
            if (r4 != r0) goto L5d
            r6.U(r5)
            return
        L5d:
            java.lang.String r4 = "Intrinsics isn't used by the parent"
            defpackage.i.m(r4)
            return
        L63:
            r4 = 6
            V(r6, r5, r4)
        L67:
            return
    }

    public static void W(defpackage.sm3 r4) {
            wm3 r0 = r4.C0
            om3 r0 = r0.d
            int[] r1 = defpackage.rm3.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            wm3 r1 = r4.C0
            r2 = 1
            if (r0 != r2) goto L35
            boolean r0 = r1.e
            r3 = 6
            if (r0 == 0) goto L1a
            T(r4, r2, r3)
            return
        L1a:
            boolean r0 = r1.f
            if (r0 == 0) goto L21
            r4.S(r2)
        L21:
            boolean r0 = r4.q()
            if (r0 == 0) goto L2b
            V(r4, r2, r3)
            return
        L2b:
            boolean r0 = r4.p()
            if (r0 == 0) goto L34
            r4.U(r2)
        L34:
            return
        L35:
            java.lang.String r4 = "Unexpected state "
            om3 r0 = r1.d
            defpackage.e41.z(r0, r4)
            return
    }

    private final java.lang.String j(defpackage.sm3 r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot insert "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = " because it already has a parent or an owner. This tree: "
            r0.append(r1)
            r1 = 0
            java.lang.String r2 = r2.g(r1)
            r0.append(r2)
            java.lang.String r2 = " Other tree: "
            r0.append(r2)
            sm3 r2 = r3.j0
            if (r2 == 0) goto L25
            java.lang.String r2 = r2.g(r1)
            goto L26
        L25:
            r2 = 0
        L26:
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public final void A(long r10, defpackage.zx2 r12, int r13, boolean r14) {
            r9 = this;
            if0 r9 = r9.B0
            java.lang.Object r0 = r9.e
            eg4 r0 = (defpackage.eg4) r0
            op5 r1 = defpackage.eg4.K0
            r1 = 1
            long r4 = r0.V0(r10, r1)
            java.lang.Object r9 = r9.e
            r2 = r9
            eg4 r2 = (defpackage.eg4) r2
            bg4 r3 = defpackage.eg4.N0
            r6 = r12
            r7 = r13
            r8 = r14
            r2.d1(r3, r4, r6, r7, r8)
            return
    }

    public final void B(int r3, defpackage.sm3 r4) {
            r2 = this;
            sm3 r0 = r4.j0
            if (r0 == 0) goto L10
            zp4 r0 = r4.k0
            if (r0 != 0) goto L9
            goto L10
        L9:
            java.lang.String r0 = r2.j(r4)
            defpackage.p53.c(r0)
        L10:
            r4.j0 = r2
            ap3 r0 = r2.g0
            java.lang.Object r1 = r0.B
            ua4 r1 = (defpackage.ua4) r1
            r1.a(r3, r4)
            java.lang.Object r3 = r0.L
            pj r3 = (defpackage.pj) r3
            r3.c()
            r2.O()
            boolean r3 = r4.A
            if (r3 == 0) goto L2f
            int r3 = r2.f0
            int r3 = r3 + 1
            r2.f0 = r3
        L2f:
            r2.G()
            zp4 r3 = r2.k0
            if (r3 == 0) goto L39
            r4.d(r3)
        L39:
            wm3 r3 = r4.C0
            int r3 = r3.l
            if (r3 <= 0) goto L48
            wm3 r3 = r2.C0
            int r0 = r3.l
            int r0 = r0 + 1
            r3.d(r0)
        L48:
            int r3 = r4.J0
            if (r3 <= 0) goto L53
            int r3 = r2.J0
            int r3 = r3 + 1
            r2.a0(r3)
        L53:
            return
    }

    public final void C() {
            r4 = this;
            boolean r0 = r4.F0
            if (r0 == 0) goto L2e
            if0 r0 = r4.B0
            java.lang.Object r1 = r0.d
            y53 r1 = (defpackage.y53) r1
            java.lang.Object r0 = r0.e
            eg4 r0 = (defpackage.eg4) r0
            eg4 r0 = r0.o0
            r2 = 0
            r4.E0 = r2
        L13:
            boolean r3 = defpackage.nb3.k(r1, r0)
            if (r3 != 0) goto L2b
            if (r1 == 0) goto L1e
            yp4 r3 = r1.J0
            goto L1f
        L1e:
            r3 = r2
        L1f:
            if (r3 == 0) goto L24
            r4.E0 = r1
            goto L2b
        L24:
            if (r1 == 0) goto L29
            eg4 r1 = r1.o0
            goto L13
        L29:
            r1 = r2
            goto L13
        L2b:
            r0 = 0
            r4.F0 = r0
        L2e:
            eg4 r0 = r4.E0
            if (r0 == 0) goto L3e
            yp4 r1 = r0.J0
            if (r1 == 0) goto L37
            goto L3e
        L37:
            java.lang.String r4 = "layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?"
            ug r4 = defpackage.i61.e(r4)
            throw r4
        L3e:
            if (r0 == 0) goto L44
            r0.f1()
            return
        L44:
            sm3 r0 = r4.v()
            if (r0 == 0) goto L4e
            r0.C()
            return
        L4e:
            zp4 r4 = r4.k0
            if (r4 == 0) goto L57
            te r4 = (defpackage.te) r4
            r4.invalidate()
        L57:
            return
    }

    public final void D() {
            r3 = this;
            if0 r3 = r3.B0
            java.lang.Object r0 = r3.e
            eg4 r0 = (defpackage.eg4) r0
            java.lang.Object r1 = r3.d
            y53 r1 = (defpackage.y53) r1
        La:
            if (r0 == r1) goto L1d
            r0.getClass()
            mm3 r0 = (defpackage.mm3) r0
            yp4 r2 = r0.J0
            if (r2 == 0) goto L1a
            xt2 r2 = (defpackage.xt2) r2
            r2.c()
        L1a:
            eg4 r0 = r0.n0
            goto La
        L1d:
            java.lang.Object r3 = r3.d
            y53 r3 = (defpackage.y53) r3
            yp4 r3 = r3.J0
            if (r3 == 0) goto L2a
            xt2 r3 = (defpackage.xt2) r3
            r3.c()
        L2a:
            return
    }

    public final void E() {
            r3 = this;
            boolean r0 = r3.A
            if (r0 == 0) goto Le
            sm3 r3 = r3.v()
            if (r3 == 0) goto Ld
            r3.E()
        Ld:
            return
        Le:
            sm3 r0 = r3.e0
            r1 = 7
            r2 = 0
            if (r0 == 0) goto L18
            T(r3, r2, r1)
            return
        L18:
            V(r3, r2, r1)
            return
    }

    public final void F() {
            r5 = this;
            boolean r0 = r5.p0
            if (r0 == 0) goto L5
            return
        L5:
            if0 r0 = r5.B0
            java.lang.Object r0 = r0.c
            ag4 r0 = (defpackage.ag4) r0
            z64 r0 = r0.Y
            r1 = 1
            if (r0 == 0) goto L11
            goto L15
        L11:
            a74 r0 = r5.H0
            if (r0 == 0) goto L18
        L15:
            r5.n0 = r1
            return
        L18:
            ta6 r0 = r5.o0
            r5.p0 = r1
            dh5 r1 = new dh5
            r1.<init>()
            ta6 r2 = new ta6
            r2.<init>()
            r1.A = r2
            zp4 r2 = defpackage.vm3.a(r5)
            te r2 = (defpackage.te) r2
            bq4 r2 = r2.getSnapshotObserver()
            le r3 = new le
            r4 = 7
            r3.<init>(r4, r5, r1)
            hh2 r4 = r2.d
            qm6 r2 = r2.a
            r2.d(r5, r4, r3)
            r2 = 0
            r5.p0 = r2
            java.lang.Object r1 = r1.A
            ta6 r1 = (defpackage.ta6) r1
            r5.o0 = r1
            r5.n0 = r2
            zp4 r1 = defpackage.vm3.a(r5)
            te r1 = (defpackage.te) r1
            ab6 r2 = r1.getSemanticsOwner()
            r2.b(r5, r0)
            r1.y()
            return
    }

    public final void G() {
            r1 = this;
            int r0 = r1.f0
            if (r0 <= 0) goto L7
            r0 = 1
            r1.i0 = r0
        L7:
            boolean r0 = r1.A
            if (r0 == 0) goto L12
            sm3 r1 = r1.j0
            if (r1 == 0) goto L12
            r1.G()
        L12:
            return
    }

    public final boolean H() {
            r0 = this;
            zp4 r0 = r0.k0
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean I() {
            r0 = this;
            wm3 r0 = r0.C0
            d34 r0 = r0.p
            boolean r0 = r0.o0
            return r0
    }

    public final java.lang.Boolean J() {
            r1 = this;
            wm3 r1 = r1.C0
            rz3 r1 = r1.q
            if (r1 == 0) goto L14
            oz3 r1 = r1.m0
            oz3 r0 = defpackage.oz3.IsNotPlaced
            if (r1 == r0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        L14:
            r1 = 0
            return r1
    }

    public final void K() {
            r5 = this;
            qm3 r0 = r5.y0
            qm3 r1 = defpackage.qm3.NotUsed
            if (r0 != r1) goto L9
            r5.f()
        L9:
            wm3 r5 = r5.C0
            rz3 r5 = r5.q
            r5.getClass()
            r0 = 1
            r1 = 0
            r5.Z = r0     // Catch: java.lang.Throwable -> L1e
            boolean r2 = r5.h0     // Catch: java.lang.Throwable -> L1e
            if (r2 != 0) goto L20
            java.lang.String r2 = "replace() called on item that was not placed"
            defpackage.p53.c(r2)     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r0 = move-exception
            goto L47
        L20:
            r5.x0 = r1     // Catch: java.lang.Throwable -> L1e
            oz3 r2 = r5.m0     // Catch: java.lang.Throwable -> L1e
            oz3 r3 = defpackage.oz3.IsNotPlaced     // Catch: java.lang.Throwable -> L1e
            if (r2 == r3) goto L29
            goto L2a
        L29:
            r0 = r1
        L2a:
            long r2 = r5.k0     // Catch: java.lang.Throwable -> L1e
            qn2 r4 = r5.l0     // Catch: java.lang.Throwable -> L1e
            r5.C0(r2, r4)     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L44
            boolean r0 = r5.x0     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L44
            wm3 r0 = r5.Y     // Catch: java.lang.Throwable -> L1e
            sm3 r0 = r0.a     // Catch: java.lang.Throwable -> L1e
            sm3 r0 = r0.v()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L44
            r0.S(r1)     // Catch: java.lang.Throwable -> L1e
        L44:
            r5.Z = r1
            return
        L47:
            r5.Z = r1
            throw r0
    }

    public final void L(int r7, int r8, int r9) {
            r6 = this;
            if (r7 != r8) goto L3
            return
        L3:
            r0 = 0
        L4:
            if (r0 >= r9) goto L35
            if (r7 <= r8) goto Lb
            int r1 = r7 + r0
            goto Lc
        Lb:
            r1 = r7
        Lc:
            if (r7 <= r8) goto L11
            int r2 = r8 + r0
            goto L15
        L11:
            int r2 = r8 + r9
            int r2 = r2 + (-2)
        L15:
            ap3 r3 = r6.g0
            java.lang.Object r4 = r3.B
            ua4 r4 = (defpackage.ua4) r4
            java.lang.Object r5 = r3.L
            pj r5 = (defpackage.pj) r5
            java.lang.Object r1 = r4.l(r1)
            r5.c()
            sm3 r1 = (defpackage.sm3) r1
            java.lang.Object r3 = r3.B
            ua4 r3 = (defpackage.ua4) r3
            r3.a(r2, r1)
            r5.c()
            int r0 = r0 + 1
            goto L4
        L35:
            r6.O()
            r6.G()
            r6.E()
            return
    }

    public final void M(defpackage.sm3 r5) {
            r4 = this;
            wm3 r0 = r5.C0
            int r0 = r0.l
            if (r0 <= 0) goto Lf
            wm3 r0 = r4.C0
            int r1 = r0.l
            int r1 = r1 + (-1)
            r0.d(r1)
        Lf:
            zp4 r0 = r4.k0
            if (r0 == 0) goto L16
            r5.h()
        L16:
            r0 = 0
            r5.j0 = r0
            int r1 = r5.J0
            if (r1 <= 0) goto L24
            int r1 = r4.J0
            int r1 = r1 + (-1)
            r4.a0(r1)
        L24:
            if0 r1 = r5.B0
            java.lang.Object r1 = r1.e
            eg4 r1 = (defpackage.eg4) r1
            r1.o0 = r0
            boolean r1 = r5.A
            if (r1 == 0) goto L52
            int r1 = r4.f0
            int r1 = r1 + (-1)
            r4.f0 = r1
            ap3 r5 = r5.g0
            java.lang.Object r5 = r5.B
            ua4 r5 = (defpackage.ua4) r5
            java.lang.Object[] r1 = r5.A
            int r5 = r5.L
            r2 = 0
        L41:
            if (r2 >= r5) goto L52
            r3 = r1[r2]
            sm3 r3 = (defpackage.sm3) r3
            if0 r3 = r3.B0
            java.lang.Object r3 = r3.e
            eg4 r3 = (defpackage.eg4) r3
            r3.o0 = r0
            int r2 = r2 + 1
            goto L41
        L52:
            r4.G()
            r4.O()
            return
    }

    public final void N(defpackage.eg4 r11) {
            r10 = this;
            zp4 r0 = r10.k0
            if (r0 == 0) goto Lb
            te r0 = (defpackage.te) r0
            rf5 r0 = r0.getRectManager()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            wm3 r1 = r10.C0
            om3 r2 = r1.d
            om3 r3 = defpackage.om3.Idle
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L25
            boolean r2 = r10.q()
            if (r2 != 0) goto L25
            boolean r2 = r10.p()
            if (r2 == 0) goto L23
            goto L25
        L23:
            r2 = r4
            goto L26
        L25:
            r2 = r5
        L26:
            boolean r3 = r10.Z
            if (r3 == 0) goto L8e
            if (r0 == 0) goto L8e
            if0 r3 = r10.B0
            java.lang.Object r3 = r3.e
            eg4 r3 = (defpackage.eg4) r3
            if (r11 != r3) goto L3c
            r10.Y = r5
            if (r2 != 0) goto L8e
            r0.f(r10)
            goto L8e
        L3c:
            r10.X = r5
            ua4 r11 = r10.z()
            java.lang.Object[] r3 = r11.A
            int r11 = r11.L
            r6 = r4
        L47:
            if (r6 >= r11) goto L57
            r7 = r3[r6]
            sm3 r7 = (defpackage.sm3) r7
            r7.Y = r5
            if (r2 != 0) goto L54
            r0.f(r7)
        L54:
            int r6 = r6 + 1
            goto L47
        L57:
            boolean r11 = r10.Z
            if (r11 == 0) goto L8b
            r0.e = r5
            ei r11 = r0.b
            int r10 = r10.B
            r2 = 33554431(0x1ffffff, float:9.403954E-38)
            r10 = r10 & r2
            java.lang.Object r3 = r11.L
            long[] r3 = (long[]) r3
            int r11 = r11.B
        L6b:
            int r5 = r3.length
            int r5 = r5 + (-2)
            if (r4 >= r5) goto L8b
            if (r4 >= r11) goto L8b
            int r5 = r4 + 2
            r6 = r3[r5]
            int r8 = (int) r6
            r8 = r8 & r2
            if (r8 != r10) goto L88
            r10 = 63
            long r10 = r6 >> r10
            r8 = 1
            long r10 = r10 & r8
            r2 = 60
            long r10 = r10 << r2
            long r10 = r10 | r6
            r3[r5] = r10
            goto L8b
        L88:
            int r4 = r4 + 3
            goto L6b
        L8b:
            r0.i()
        L8e:
            d34 r10 = r1.p
            r10.F0()
            return
    }

    public final void O() {
            r1 = this;
            boolean r0 = r1.A
            if (r0 == 0) goto Le
            sm3 r1 = r1.v()
            if (r1 == 0) goto Ld
            r1.O()
        Ld:
            return
        Le:
            r0 = 1
            r1.r0 = r0
            return
    }

    public final void P() {
            r4 = this;
            ap3 r0 = r4.g0
            java.lang.Object r1 = r0.B
            ua4 r1 = (defpackage.ua4) r1
            int r1 = r1.L
            int r1 = r1 + (-1)
        La:
            java.lang.Object r2 = r0.B
            ua4 r2 = (defpackage.ua4) r2
            r3 = -1
            if (r3 >= r1) goto L1d
            java.lang.Object[] r2 = r2.A
            r2 = r2[r1]
            sm3 r2 = (defpackage.sm3) r2
            r4.M(r2)
            int r1 = r1 + (-1)
            goto La
        L1d:
            r2.g()
            java.lang.Object r4 = r0.L
            pj r4 = (defpackage.pj) r4
            r4.c()
            return
    }

    public final void Q(int r3, int r4) {
            r2 = this;
            if (r4 < 0) goto L3
            goto L19
        L3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "count ("
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = ") must be greater than 0"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            defpackage.p53.a(r0)
        L19:
            int r4 = r4 + r3
            int r4 = r4 + (-1)
            if (r3 > r4) goto L43
        L1e:
            ap3 r0 = r2.g0
            java.lang.Object r1 = r0.B
            ua4 r1 = (defpackage.ua4) r1
            java.lang.Object[] r1 = r1.A
            r1 = r1[r4]
            sm3 r1 = (defpackage.sm3) r1
            r2.M(r1)
            java.lang.Object r1 = r0.B
            ua4 r1 = (defpackage.ua4) r1
            java.lang.Object r1 = r1.l(r4)
            java.lang.Object r0 = r0.L
            pj r0 = (defpackage.pj) r0
            r0.c()
            sm3 r1 = (defpackage.sm3) r1
            if (r4 == r3) goto L43
            int r4 = r4 + (-1)
            goto L1e
        L43:
            return
    }

    public final void R() {
            r7 = this;
            qm3 r0 = r7.y0
            qm3 r1 = defpackage.qm3.NotUsed
            if (r0 != r1) goto L9
            r7.f()
        L9:
            wm3 r7 = r7.C0
            d34 r7 = r7.p
            wm3 r0 = r7.Y
            r1 = 0
            r2 = 1
            r7.Z = r2     // Catch: java.lang.Throwable -> L1d
            boolean r2 = r7.g0     // Catch: java.lang.Throwable -> L1d
            if (r2 != 0) goto L1f
            java.lang.String r2 = "replace called on unplaced item"
            defpackage.p53.c(r2)     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r2 = move-exception
            goto L3e
        L1f:
            boolean r2 = r7.o0     // Catch: java.lang.Throwable -> L1d
            long r3 = r7.j0     // Catch: java.lang.Throwable -> L1d
            float r5 = r7.l0     // Catch: java.lang.Throwable -> L1d
            qn2 r6 = r7.k0     // Catch: java.lang.Throwable -> L1d
            r7.A0(r3, r5, r6)     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L3b
            boolean r2 = r7.B0     // Catch: java.lang.Throwable -> L1d
            if (r2 != 0) goto L3b
            sm3 r2 = r0.a     // Catch: java.lang.Throwable -> L1d
            sm3 r2 = r2.v()     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L3b
            r2.U(r1)     // Catch: java.lang.Throwable -> L1d
        L3b:
            r7.Z = r1
            return
        L3e:
            sm3 r0 = r0.a     // Catch: java.lang.Throwable -> L45
            r0.Y(r2)     // Catch: java.lang.Throwable -> L45
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L45
        L45:
            r0 = move-exception
            r7.Z = r1
            throw r0
    }

    public final void S(boolean r3) {
            r2 = this;
            boolean r0 = r2.A
            if (r0 != 0) goto Le
            zp4 r0 = r2.k0
            if (r0 == 0) goto Le
            r1 = 1
            te r0 = (defpackage.te) r0
            r0.x(r2, r1, r3)
        Le:
            return
    }

    public final void U(boolean r3) {
            r2 = this;
            boolean r0 = r2.A
            if (r0 != 0) goto Le
            zp4 r0 = r2.k0
            if (r0 == 0) goto Le
            r1 = 0
            te r0 = (defpackage.te) r0
            r0.x(r2, r1, r3)
        Le:
            return
    }

    public final void X() {
            r5 = this;
            ua4 r5 = r5.z()
            java.lang.Object[] r0 = r5.A
            int r5 = r5.L
            r1 = 0
        L9:
            if (r1 >= r5) goto L1d
            r2 = r0[r1]
            sm3 r2 = (defpackage.sm3) r2
            qm3 r3 = r2.z0
            r2.y0 = r3
            qm3 r4 = defpackage.qm3.NotUsed
            if (r3 == r4) goto L1a
            r2.X()
        L1a:
            int r1 = r1 + 1
            goto L9
        L1d:
            return
    }

    public final void Y(java.lang.Throwable r4) {
            r3 = this;
            hy0 r0 = r3.x0
            nq6 r1 = defpackage.dy0.a
            xv4 r0 = (defpackage.xv4) r0
            r0.getClass()
            java.lang.Object r0 = defpackage.q60.U(r0, r1)
            cy0 r0 = (defpackage.cy0) r0
            if (r0 == 0) goto L1b
            q6 r1 = new q6
            r2 = 18
            r1.<init>(r2, r0, r3)
            defpackage.nw7.s0(r4, r1)
        L1b:
            throw r4
    }

    public final void Z(defpackage.qh1 r2) {
            r1 = this;
            qh1 r0 = r1.u0
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L31
            r1.u0 = r2
            r1.E()
            sm3 r2 = r1.v()
            if (r2 == 0) goto L17
            r2.C()
            goto L20
        L17:
            zp4 r2 = r1.k0
            if (r2 == 0) goto L20
            te r2 = (defpackage.te) r2
            r2.invalidate()
        L20:
            r1.D()
            if0 r1 = r1.B0
            java.lang.Object r1 = r1.g
            z64 r1 = (defpackage.z64) r1
        L29:
            if (r1 == 0) goto L31
            r1.d()
            z64 r1 = r1.Y
            goto L29
        L31:
            return
    }

    @Override // defpackage.ww0
    public final void a() {
            r2 = this;
            gn3 r0 = r2.D0
            if (r0 == 0) goto L7
            r0.a()
        L7:
            if0 r2 = r2.B0
            java.lang.Object r0 = r2.e
            eg4 r0 = (defpackage.eg4) r0
            java.lang.Object r2 = r2.d
            y53 r2 = (defpackage.y53) r2
            eg4 r2 = r2.n0
        L13:
            boolean r1 = defpackage.nb3.k(r0, r2)
            if (r1 != 0) goto L21
            if (r0 == 0) goto L21
            r0.k1()
            eg4 r0 = r0.n0
            goto L13
        L21:
            return
    }

    public final void a0(int r3) {
            r2 = this;
            int r0 = r2.J0
            if (r0 == r3) goto L2a
            if (r3 <= 0) goto L15
            if (r0 != 0) goto L15
            sm3 r0 = r2.v()
            if (r0 == 0) goto L15
            int r1 = r0.J0
            int r1 = r1 + 1
            r0.a0(r1)
        L15:
            if (r3 != 0) goto L28
            int r0 = r2.J0
            if (r0 <= 0) goto L28
            sm3 r0 = r2.v()
            if (r0 == 0) goto L28
            int r1 = r0.J0
            int r1 = r1 + (-1)
            r0.a0(r1)
        L28:
            r2.J0 = r3
        L2a:
            return
    }

    @Override // defpackage.ww0
    public final void b() {
            r4 = this;
            gn3 r0 = r4.D0
            r1 = 1
            if (r0 == 0) goto L8
            r0.i(r1)
        L8:
            r4.K0 = r1
            if0 r0 = r4.B0
            java.lang.Object r0 = r0.f
            vy6 r0 = (defpackage.vy6) r0
            r1 = r0
        L11:
            if (r1 == 0) goto L1d
            boolean r2 = r1.j0
            if (r2 == 0) goto L1a
            r1.M0()
        L1a:
            z64 r1 = r1.X
            goto L11
        L1d:
            r1 = r0
        L1e:
            if (r1 == 0) goto L2a
            boolean r2 = r1.j0
            if (r2 == 0) goto L27
            r1.O0()
        L27:
            z64 r1 = r1.X
            goto L1e
        L2a:
            if (r0 == 0) goto L36
            boolean r1 = r0.j0
            if (r1 == 0) goto L33
            r0.I0()
        L33:
            z64 r0 = r0.X
            goto L2a
        L36:
            boolean r0 = r4.H()
            r1 = 0
            if (r0 == 0) goto L42
            r0 = 0
            r4.o0 = r0
            r4.n0 = r1
        L42:
            zp4 r0 = r4.k0
            if (r0 == 0) goto L65
            te r0 = (defpackage.te) r0
            boolean r2 = defpackage.te.d()
            if (r2 == 0) goto L65
            nd r0 = r0.L0
            if (r0 == 0) goto L65
            q94 r2 = r0.d0
            int r3 = r4.B
            boolean r2 = r2.f(r3)
            if (r2 == 0) goto L65
            s63 r2 = r0.A
            te r0 = r0.L
            int r4 = r4.B
            r2.v(r0, r4, r1)
        L65:
            return
    }

    public final void b0(defpackage.sm3 r3) {
            r2 = this;
            sm3 r0 = r2.e0
            boolean r0 = defpackage.nb3.k(r3, r0)
            if (r0 != 0) goto L3e
            r2.e0 = r3
            wm3 r0 = r2.C0
            if (r3 == 0) goto L33
            rz3 r3 = r0.q
            if (r3 != 0) goto L19
            rz3 r3 = new rz3
            r3.<init>(r0)
            r0.q = r3
        L19:
            if0 r3 = r2.B0
            java.lang.Object r0 = r3.e
            eg4 r0 = (defpackage.eg4) r0
            java.lang.Object r3 = r3.d
            y53 r3 = (defpackage.y53) r3
            eg4 r3 = r3.n0
        L25:
            boolean r1 = defpackage.nb3.k(r0, r3)
            if (r1 != 0) goto L3b
            if (r0 == 0) goto L3b
            r0.T0()
            eg4 r0 = r0.n0
            goto L25
        L33:
            r3 = 0
            r0.q = r3
            r3 = 0
            r0.f = r3
            r0.e = r3
        L3b:
            r2.E()
        L3e:
            return
    }

    public final void c(defpackage.a74 r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            if0 r2 = r0.B0
            r7 = 16
            boolean r8 = r2.g(r7)
            java.lang.Object r3 = r2.f
            r9 = r3
            vy6 r9 = (defpackage.vy6) r9
            r10 = 1024(0x400, float:1.435E-42)
            boolean r11 = r2.g(r10)
            r0.G0 = r1
            java.lang.Object r3 = r2.d
            y53 r3 = (defpackage.y53) r3
            java.lang.Object r4 = r2.b
            sm3 r4 = (defpackage.sm3) r4
            java.lang.Object r5 = r2.g
            z64 r5 = (defpackage.z64) r5
            java.lang.Object r6 = r2.c
            r12 = r6
            ag4 r12 = (defpackage.ag4) r12
            if (r5 == r12) goto L2d
            goto L32
        L2d:
            java.lang.String r5 = "padChain called on already padded chain"
            defpackage.p53.c(r5)
        L32:
            java.lang.Object r5 = r2.g
            z64 r5 = (defpackage.z64) r5
            r5.X = r12
            r12.Y = r5
            java.lang.Object r5 = r2.h
            ua4 r5 = (defpackage.ua4) r5
            if (r5 == 0) goto L43
            int r6 = r5.L
            goto L44
        L43:
            r6 = 0
        L44:
            java.lang.Object r14 = r2.i
            ua4 r14 = (defpackage.ua4) r14
            if (r14 != 0) goto L51
            ua4 r14 = new ua4
            y64[] r15 = new defpackage.y64[r7]
            r14.<init>(r15)
        L51:
            java.lang.Object r15 = r2.j
            ua4 r15 = (defpackage.ua4) r15
            r15.b(r1)
            r16 = 0
        L5a:
            int r1 = r15.L
            if (r1 == 0) goto L93
            int r1 = r1 + (-1)
            java.lang.Object r1 = r15.l(r1)
            a74 r1 = (defpackage.a74) r1
            boolean r13 = r1 instanceof defpackage.iu0
            if (r13 == 0) goto L77
            iu0 r1 = (defpackage.iu0) r1
            a74 r13 = r1.b
            r15.b(r13)
            a74 r1 = r1.a
            r15.b(r1)
            goto L90
        L77:
            boolean r13 = r1 instanceof defpackage.y64
            if (r13 == 0) goto L7f
            r14.b(r1)
            goto L90
        L7f:
            if (r16 != 0) goto L8b
            mc r13 = new mc
            r10 = 20
            r13.<init>(r14, r10)
            r16 = r13
            goto L8d
        L8b:
            r13 = r16
        L8d:
            r1.a(r13)
        L90:
            r10 = 1024(0x400, float:1.435E-42)
            goto L5a
        L93:
            int r1 = r14.L
            java.lang.String r13 = "expected prior modifier list to be non-empty"
            if (r1 != r6) goto L11a
            z64 r1 = r12.Y
            r3 = r2
            r2 = 0
        L9d:
            if (r1 == 0) goto Le5
            if (r2 >= r6) goto Le5
            if (r5 == 0) goto Le0
            r16 = 2
            java.lang.Object[] r10 = r5.A
            r10 = r10[r2]
            y64 r10 = (defpackage.y64) r10
            java.lang.Object[] r7 = r14.A
            r7 = r7[r2]
            y64 r7 = (defpackage.y64) r7
            boolean r17 = defpackage.nb3.k(r10, r7)
            if (r17 == 0) goto Lbc
            r18 = r3
            r3 = r16
            goto Lcb
        Lbc:
            java.lang.Class r15 = r10.getClass()
            r18 = r3
            java.lang.Class r3 = r7.getClass()
            if (r15 != r3) goto Lca
            r3 = 1
            goto Lcb
        Lca:
            r3 = 0
        Lcb:
            if (r3 == 0) goto Ldd
            r15 = 1
            if (r3 == r15) goto Ld1
            goto Ld4
        Ld1:
            defpackage.if0.l(r10, r7, r1)
        Ld4:
            z64 r1 = r1.Y
            int r2 = r2 + 1
            r3 = r18
            r7 = 16
            goto L9d
        Ldd:
            z64 r1 = r1.X
            goto Le9
        Le0:
            ug r0 = defpackage.i61.e(r13)
            throw r0
        Le5:
            r18 = r3
            r16 = 2
        Le9:
            if (r2 >= r6) goto L116
            if (r5 == 0) goto L111
            if (r1 == 0) goto L10a
            a74 r3 = r4.H0
            if (r3 == 0) goto Lf7
            r17 = 1
        Lf5:
            r15 = 1
            goto Lfa
        Lf7:
            r17 = 0
            goto Lf5
        Lfa:
            r6 = r17 ^ 1
            r3 = r5
            r4 = r14
            r7 = 0
            r5 = r1
            r1 = r18
            r1.j(r2, r3, r4, r5, r6)
            r5 = r3
            r5 = r12
        L107:
            r15 = 1
            goto L19c
        L10a:
            java.lang.String r0 = "structuralUpdate requires a non-null tail"
            ug r0 = defpackage.i61.e(r0)
            throw r0
        L111:
            ug r0 = defpackage.i61.e(r13)
            throw r0
        L116:
            r2 = r18
            r7 = 0
            goto L172
        L11a:
            r7 = 0
            r16 = 2
            a74 r10 = r4.H0
            if (r10 == 0) goto L14a
            if (r6 != 0) goto L14a
            r3 = r12
            r1 = 0
        L125:
            int r4 = r14.L
            if (r1 >= r4) goto L136
            java.lang.Object[] r4 = r14.A
            r4 = r4[r1]
            y64 r4 = (defpackage.y64) r4
            z64 r3 = defpackage.if0.c(r4, r3)
            int r1 = r1 + 1
            goto L125
        L136:
            z64 r1 = r9.X
            r3 = 0
        L139:
            if (r1 == 0) goto L145
            if (r1 == r12) goto L145
            int r4 = r1.L
            r3 = r3 | r4
            r1.R = r3
            z64 r1 = r1.X
            goto L139
        L145:
            r1 = r2
            r3 = r5
            r5 = r12
            r4 = r14
            goto L107
        L14a:
            if (r1 != 0) goto L17d
            if (r5 == 0) goto L178
            z64 r1 = r12.Y
            r6 = 0
        L151:
            if (r1 == 0) goto L160
            int r10 = r5.L
            if (r6 >= r10) goto L160
            z64 r1 = defpackage.if0.d(r1)
            z64 r1 = r1.Y
            int r6 = r6 + 1
            goto L151
        L160:
            sm3 r1 = r4.v()
            if (r1 == 0) goto L16d
            if0 r1 = r1.B0
            java.lang.Object r1 = r1.d
            y53 r1 = (defpackage.y53) r1
            goto L16e
        L16d:
            r1 = r7
        L16e:
            r3.o0 = r1
            r2.e = r3
        L172:
            r1 = r2
            r3 = r5
            r5 = r12
            r4 = r14
            r15 = 0
            goto L19c
        L178:
            ug r0 = defpackage.i61.e(r13)
            throw r0
        L17d:
            if (r5 != 0) goto L188
            ua4 r5 = new ua4
            r1 = 16
            y64[] r3 = new defpackage.y64[r1]
            r5.<init>(r3)
        L188:
            r3 = r5
            if (r10 == 0) goto L18f
            r15 = 1
        L18c:
            r17 = 1
            goto L191
        L18f:
            r15 = 0
            goto L18c
        L191:
            r6 = r15 ^ 1
            r1 = r2
            r2 = 0
            r5 = r12
            r4 = r14
            r1.j(r2, r3, r4, r5, r6)
            r15 = r17
        L19c:
            r1.h = r4
            if (r3 == 0) goto L1a4
            r3.g()
            goto L1a5
        L1a4:
            r3 = r7
        L1a5:
            r1.i = r3
            z64 r2 = r5.Y
            if (r2 != 0) goto L1ac
            goto L1ad
        L1ac:
            r9 = r2
        L1ad:
            r9.X = r7
            r5.Y = r7
            r2 = -1
            r5.R = r2
            r5.d0 = r7
            if (r9 == r5) goto L1b9
            goto L1be
        L1b9:
            java.lang.String r2 = "trimChain did not update the head"
            defpackage.p53.c(r2)
        L1be:
            r1.g = r9
            if (r15 == 0) goto L1c5
            r1.k()
        L1c5:
            r2 = 16
            boolean r2 = r1.g(r2)
            r3 = 1024(0x400, float:1.435E-42)
            boolean r3 = r1.g(r3)
            wm3 r4 = r0.C0
            r4.j()
            sm3 r4 = r0.e0
            if (r4 != 0) goto L1e5
            r4 = 512(0x200, float:7.17E-43)
            boolean r1 = r1.g(r4)
            if (r1 == 0) goto L1e5
            r0.b0(r0)
        L1e5:
            if (r8 != r2) goto L1e9
            if (r11 == r3) goto L230
        L1e9:
            zp4 r1 = defpackage.vm3.a(r0)
            te r1 = (defpackage.te) r1
            rf5 r1 = r1.getRectManager()
            r1.getClass()
            boolean r4 = r0.H()
            if (r4 == 0) goto L230
            ei r1 = r1.b
            int r0 = r0.B
            r4 = 33554431(0x1ffffff, float:9.403954E-38)
            r0 = r0 & r4
            java.lang.Object r5 = r1.L
            long[] r5 = (long[]) r5
            int r1 = r1.B
            r13 = 0
        L20b:
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r13 >= r6) goto L230
            if (r13 >= r1) goto L230
            int r6 = r13 + 2
            r7 = r5[r6]
            int r9 = (int) r7
            r9 = r9 & r4
            if (r9 != r0) goto L22d
            r0 = -6917529027641081857(0x9fffffffffffffff, double:-1.4916681462400412E-154)
            long r0 = r0 & r7
            r7 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r3 = (long) r3
            long r3 = r3 * r7
            long r0 = r0 | r3
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r7 = (long) r2
            long r7 = r7 * r3
            long r0 = r0 | r7
            r5[r6] = r0
            return
        L22d:
            int r13 = r13 + 3
            goto L20b
        L230:
            return
    }

    public final void c0(defpackage.e34 r2) {
            r1 = this;
            e34 r0 = r1.s0
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L18
            r1.s0 = r2
            yc1 r0 = r1.t0
            if (r0 == 0) goto L15
            java.lang.Object r0 = r0.B
            vs4 r0 = (defpackage.vs4) r0
            r0.setValue(r2)
        L15:
            r1.E()
        L18:
            return
    }

    public final void d(defpackage.zp4 r9) {
            r8 = this;
            zp4 r0 = r8.k0
            r1 = 0
            if (r0 != 0) goto L6
            goto L23
        L6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot attach "
            r0.<init>(r2)
            r0.append(r8)
            java.lang.String r2 = " as it already is attached.  Tree: "
            r0.append(r2)
            java.lang.String r2 = r8.g(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            defpackage.p53.c(r0)
        L23:
            sm3 r0 = r8.j0
            r2 = 0
            if (r0 == 0) goto L72
            zp4 r0 = r0.k0
            boolean r0 = defpackage.nb3.k(r0, r9)
            if (r0 == 0) goto L31
            goto L72
        L31:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Attaching to a different owner("
            r0.<init>(r3)
            r0.append(r9)
            java.lang.String r3 = ") than the parent's owner("
            r0.append(r3)
            sm3 r3 = r8.v()
            if (r3 == 0) goto L49
            zp4 r3 = r3.k0
            goto L4a
        L49:
            r3 = r2
        L4a:
            r0.append(r3)
            java.lang.String r3 = "). This tree: "
            r0.append(r3)
            java.lang.String r3 = r8.g(r1)
            r0.append(r3)
            java.lang.String r3 = " Parent tree: "
            r0.append(r3)
            sm3 r3 = r8.j0
            if (r3 == 0) goto L67
            java.lang.String r3 = r3.g(r1)
            goto L68
        L67:
            r3 = r2
        L68:
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            defpackage.p53.c(r0)
        L72:
            sm3 r0 = r8.v()
            wm3 r3 = r8.C0
            r4 = 1
            if (r0 != 0) goto L91
            d34 r5 = r3.p
            r5.o0 = r4
            r5 = r9
            te r5 = (defpackage.te) r5
            rf5 r5 = r5.getRectManager()
            r5.f(r8)
            rz3 r5 = r3.q
            if (r5 == 0) goto L91
            oz3 r6 = defpackage.oz3.IsPlacedInLookahead
            r5.m0 = r6
        L91:
            if0 r5 = r8.B0
            java.lang.Object r6 = r5.e
            eg4 r6 = (defpackage.eg4) r6
            if (r0 == 0) goto La0
            if0 r7 = r0.B0
            java.lang.Object r7 = r7.d
            y53 r7 = (defpackage.y53) r7
            goto La1
        La0:
            r7 = r2
        La1:
            r6.o0 = r7
            r8.k0 = r9
            if (r0 == 0) goto Laa
            int r6 = r0.l0
            goto Lab
        Laa:
            r6 = -1
        Lab:
            int r6 = r6 + r4
            r8.l0 = r6
            a74 r6 = r8.H0
            if (r6 == 0) goto Lb5
            r8.c(r6)
        Lb5:
            r8.H0 = r2
            r2 = r9
            te r2 = (defpackage.te) r2
            p94 r2 = r2.m17getLayoutNodes()
            int r6 = r8.B
            r2.i(r6, r8)
            boolean r2 = r8.d0
            if (r2 == 0) goto Lcb
            r8.b0(r8)
            goto Le7
        Lcb:
            sm3 r2 = r8.j0
            if (r2 == 0) goto Ld3
            sm3 r2 = r2.e0
            if (r2 != 0) goto Ld5
        Ld3:
            sm3 r2 = r8.e0
        Ld5:
            r8.b0(r2)
            sm3 r2 = r8.e0
            if (r2 != 0) goto Le7
            r2 = 512(0x200, float:7.17E-43)
            boolean r2 = r5.g(r2)
            if (r2 == 0) goto Le7
            r8.b0(r8)
        Le7:
            boolean r2 = r8.K0
            if (r2 != 0) goto Lf7
            java.lang.Object r2 = r5.g
            z64 r2 = (defpackage.z64) r2
        Lef:
            if (r2 == 0) goto Lf7
            r2.H0()
            z64 r2 = r2.Y
            goto Lef
        Lf7:
            ap3 r2 = r8.g0
            java.lang.Object r2 = r2.B
            ua4 r2 = (defpackage.ua4) r2
            java.lang.Object[] r6 = r2.A
            int r2 = r2.L
        L101:
            if (r1 >= r2) goto L10d
            r7 = r6[r1]
            sm3 r7 = (defpackage.sm3) r7
            r7.d(r9)
            int r1 = r1 + 1
            goto L101
        L10d:
            boolean r1 = r8.K0
            if (r1 != 0) goto L114
            r5.i()
        L114:
            r8.E()
            if (r0 == 0) goto L11c
            r0.E()
        L11c:
            r3.j()
            boolean r0 = r8.K0
            if (r0 != 0) goto L12e
            r0 = 8
            boolean r0 = r5.g(r0)
            if (r0 == 0) goto L12e
            r8.F()
        L12e:
            te r9 = (defpackage.te) r9
            boolean r0 = defpackage.te.d()
            if (r0 == 0) goto L15a
            nd r9 = r9.L0
            if (r9 == 0) goto L15a
            ta6 r0 = r8.x()
            if (r0 == 0) goto L15a
            ja4 r0 = r0.A
            fb6 r1 = defpackage.bb6.r
            boolean r0 = r0.b(r1)
            if (r0 != r4) goto L15a
            q94 r0 = r9.d0
            int r1 = r8.B
            r0.a(r1)
            s63 r0 = r9.A
            te r9 = r9.L
            int r8 = r8.B
            r0.v(r9, r8, r4)
        L15a:
            return
    }

    public final void d0(defpackage.a74 r3) {
            r2 = this;
            boolean r0 = r2.A
            if (r0 == 0) goto L10
            a74 r0 = r2.G0
            x64 r1 = defpackage.x64.a
            if (r0 != r1) goto Lb
            goto L10
        Lb:
            java.lang.String r0 = "Modifiers are not supported on virtual LayoutNodes"
            defpackage.p53.a(r0)
        L10:
            boolean r0 = r2.K0
            if (r0 == 0) goto L19
            java.lang.String r0 = "modifier is updated when deactivated"
            defpackage.p53.a(r0)
        L19:
            boolean r0 = r2.H()
            if (r0 == 0) goto L2a
            r2.c(r3)
            boolean r3 = r2.n0
            if (r3 == 0) goto L29
            r2.F()
        L29:
            return
        L2a:
            r2.H0 = r3
            return
    }

    public final void e() {
            r5 = this;
            qm3 r0 = r5.y0
            r5.z0 = r0
            qm3 r0 = defpackage.qm3.NotUsed
            r5.y0 = r0
            ua4 r5 = r5.z()
            java.lang.Object[] r0 = r5.A
            int r5 = r5.L
            r1 = 0
        L11:
            if (r1 >= r5) goto L23
            r2 = r0[r1]
            sm3 r2 = (defpackage.sm3) r2
            qm3 r3 = r2.y0
            qm3 r4 = defpackage.qm3.NotUsed
            if (r3 == r4) goto L20
            r2.e()
        L20:
            int r1 = r1 + 1
            goto L11
        L23:
            return
    }

    public final void e0(defpackage.fo7 r8) {
            r7 = this;
            fo7 r0 = r7.w0
            boolean r0 = defpackage.nb3.k(r0, r8)
            if (r0 != 0) goto L6f
            r7.w0 = r8
            if0 r7 = r7.B0
            java.lang.Object r7 = r7.g
            z64 r7 = (defpackage.z64) r7
            int r8 = r7.R
            r0 = 16
            r8 = r8 & r0
            if (r8 == 0) goto L6f
        L17:
            if (r7 == 0) goto L6f
            int r8 = r7.L
            r8 = r8 & r0
            if (r8 == 0) goto L67
            r8 = 0
            r1 = r7
            r2 = r8
        L21:
            if (r1 == 0) goto L67
            boolean r3 = r1 instanceof defpackage.yy4
            if (r3 == 0) goto L2d
            yy4 r1 = (defpackage.yy4) r1
            r1.x0()
            goto L62
        L2d:
            int r3 = r1.L
            r3 = r3 & r0
            if (r3 == 0) goto L62
            boolean r3 = r1 instanceof defpackage.zg1
            if (r3 == 0) goto L62
            r3 = r1
            zg1 r3 = (defpackage.zg1) r3
            z64 r3 = r3.l0
            r4 = 0
        L3c:
            r5 = 1
            if (r3 == 0) goto L5f
            int r6 = r3.L
            r6 = r6 & r0
            if (r6 == 0) goto L5c
            int r4 = r4 + 1
            if (r4 != r5) goto L4a
            r1 = r3
            goto L5c
        L4a:
            if (r2 != 0) goto L53
            ua4 r2 = new ua4
            z64[] r5 = new defpackage.z64[r0]
            r2.<init>(r5)
        L53:
            if (r1 == 0) goto L59
            r2.b(r1)
            r1 = r8
        L59:
            r2.b(r3)
        L5c:
            z64 r3 = r3.Y
            goto L3c
        L5f:
            if (r4 != r5) goto L62
            goto L21
        L62:
            z64 r1 = defpackage.nc1.A(r2)
            goto L21
        L67:
            int r8 = r7.R
            r8 = r8 & r0
            if (r8 == 0) goto L6f
            z64 r7 = r7.Y
            goto L17
        L6f:
            return
    }

    public final void f() {
            r5 = this;
            qm3 r0 = r5.y0
            r5.z0 = r0
            qm3 r0 = defpackage.qm3.NotUsed
            r5.y0 = r0
            ua4 r5 = r5.z()
            java.lang.Object[] r0 = r5.A
            int r5 = r5.L
            r1 = 0
        L11:
            if (r1 >= r5) goto L23
            r2 = r0[r1]
            sm3 r2 = (defpackage.sm3) r2
            qm3 r3 = r2.y0
            qm3 r4 = defpackage.qm3.InLayoutBlock
            if (r3 != r4) goto L20
            r2.f()
        L20:
            int r1 = r1 + 1
            goto L11
        L23:
            return
    }

    public final void f0() {
            r6 = this;
            int r0 = r6.f0
            if (r0 <= 0) goto L4e
            boolean r0 = r6.i0
            if (r0 == 0) goto L4e
            r0 = 0
            r6.i0 = r0
            ua4 r1 = r6.h0
            if (r1 != 0) goto L1a
            ua4 r1 = new ua4
            r2 = 16
            sm3[] r2 = new defpackage.sm3[r2]
            r1.<init>(r2)
            r6.h0 = r1
        L1a:
            r1.g()
            ap3 r2 = r6.g0
            java.lang.Object r2 = r2.B
            ua4 r2 = (defpackage.ua4) r2
            java.lang.Object[] r3 = r2.A
            int r2 = r2.L
        L27:
            if (r0 >= r2) goto L41
            r4 = r3[r0]
            sm3 r4 = (defpackage.sm3) r4
            boolean r5 = r4.A
            if (r5 == 0) goto L3b
            ua4 r4 = r4.z()
            int r5 = r1.L
            r1.c(r5, r4)
            goto L3e
        L3b:
            r1.b(r4)
        L3e:
            int r0 = r0 + 1
            goto L27
        L41:
            wm3 r6 = r6.C0
            d34 r0 = r6.p
            r1 = 1
            r0.v0 = r1
            rz3 r6 = r6.q
            if (r6 == 0) goto L4e
            r6.p0 = r1
        L4e:
            return
    }

    public final java.lang.String g(int r7) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            if (r2 >= r7) goto L11
            java.lang.String r3 = "  "
            r0.append(r3)
            int r2 = r2 + 1
            goto L7
        L11:
            java.lang.String r2 = "|-"
            r0.append(r2)
            java.lang.String r2 = r6.toString()
            r0.append(r2)
            r2 = 10
            r0.append(r2)
            ua4 r6 = r6.z()
            java.lang.Object[] r2 = r6.A
            int r6 = r6.L
            r3 = r1
        L2b:
            if (r3 >= r6) goto L3d
            r4 = r2[r3]
            sm3 r4 = (defpackage.sm3) r4
            int r5 = r7 + 1
            java.lang.String r4 = r4.g(r5)
            r0.append(r4)
            int r3 = r3 + 1
            goto L2b
        L3d:
            java.lang.String r6 = r0.toString()
            if (r7 != 0) goto L4d
            int r7 = r6.length()
            int r7 = r7 + (-1)
            java.lang.String r6 = r6.substring(r1, r7)
        L4d:
            return r6
    }

    public final void h() {
            r11 = this;
            zp4 r0 = r11.k0
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Cannot detach node that is already detached!  Tree: "
            r0.<init>(r3)
            sm3 r11 = r11.v()
            if (r11 == 0) goto L17
            java.lang.String r1 = r11.g(r2)
        L17:
            r0.append(r1)
            java.lang.String r11 = r0.toString()
            defpackage.p53.d(r11)
            defpackage.e41.c()
            return
        L25:
            sm3 r3 = r11.v()
            wm3 r4 = r11.C0
            if (r3 == 0) goto L3f
            r3.C()
            r3.E()
            d34 r3 = r4.p
            qm3 r5 = defpackage.qm3.NotUsed
            r3.h0 = r5
            rz3 r3 = r4.q
            if (r3 == 0) goto L3f
            r3.f0 = r5
        L3f:
            d34 r3 = r4.p
            tm3 r3 = r3.t0
            r5 = 1
            r3.b = r5
            r3.c = r2
            r3.e = r2
            r3.d = r2
            r3.f = r2
            r3.g = r2
            r3.h = r1
            rz3 r3 = r4.q
            if (r3 == 0) goto L68
            tm3 r3 = r3.n0
            if (r3 == 0) goto L68
            r3.b = r5
            r3.c = r2
            r3.e = r2
            r3.d = r2
            r3.f = r2
            r3.g = r2
            r3.h = r1
        L68:
            if0 r3 = r11.B0
            java.lang.Object r6 = r3.e
            eg4 r6 = (defpackage.eg4) r6
            java.lang.Object r7 = r3.f
            vy6 r7 = (defpackage.vy6) r7
            java.lang.Object r8 = r3.d
            y53 r8 = (defpackage.y53) r8
            eg4 r8 = r8.n0
        L78:
            boolean r9 = defpackage.nb3.k(r6, r8)
            if (r9 != 0) goto L91
            if (r6 == 0) goto L91
            r6.q1()
            sm3 r9 = r6.k0
            boolean r9 = r9.I()
            if (r9 == 0) goto L8e
            r6.l1()
        L8e:
            eg4 r6 = r6.n0
            goto L78
        L91:
            r6 = r7
        L92:
            if (r6 == 0) goto L9e
            boolean r8 = r6.j0
            if (r8 == 0) goto L9b
            r6.O0()
        L9b:
            z64 r6 = r6.X
            goto L92
        L9e:
            r11.m0 = r5
            ap3 r6 = r11.g0
            java.lang.Object r6 = r6.B
            ua4 r6 = (defpackage.ua4) r6
            java.lang.Object[] r8 = r6.A
            int r6 = r6.L
            r9 = r2
        Lab:
            if (r9 >= r6) goto Lb7
            r10 = r8[r9]
            sm3 r10 = (defpackage.sm3) r10
            r10.h()
            int r9 = r9 + 1
            goto Lab
        Lb7:
            r11.m0 = r2
        Lb9:
            if (r7 == 0) goto Lc5
            boolean r6 = r7.j0
            if (r6 == 0) goto Lc2
            r7.I0()
        Lc2:
            z64 r7 = r7.X
            goto Lb9
        Lc5:
            te r0 = (defpackage.te) r0
            p94 r6 = r0.m17getLayoutNodes()
            int r7 = r11.B
            r6.g(r7)
            a34 r6 = r0.U0
            bt r7 = r6.b
            java.lang.Object r8 = r7.B
            d51 r8 = (defpackage.d51) r8
            r8.o(r11)
            java.lang.Object r8 = r7.L
            d51 r8 = (defpackage.d51) r8
            r8.o(r11)
            java.lang.Object r7 = r7.R
            d51 r7 = (defpackage.d51) r7
            r7.o(r11)
            ap3 r6 = r6.e
            java.lang.Object r6 = r6.B
            ua4 r6 = (defpackage.ua4) r6
            r6.j(r11)
            r0.M0 = r5
            boolean r5 = defpackage.te.d()
            if (r5 == 0) goto L111
            nd r5 = r0.L0
            if (r5 == 0) goto L111
            q94 r6 = r5.d0
            int r7 = r11.B
            boolean r6 = r6.f(r7)
            if (r6 == 0) goto L111
            s63 r6 = r5.A
            te r5 = r5.L
            int r7 = r11.B
            r6.v(r5, r7, r2)
        L111:
            rf5 r5 = r0.getRectManager()
            r5.g(r11)
            r11.k0 = r1
            r11.b0(r1)
            r11.l0 = r2
            d34 r5 = r4.p
            r6 = 2147483647(0x7fffffff, float:NaN)
            r5.e0 = r6
            r5.d0 = r6
            r5.o0 = r2
            rz3 r4 = r4.q
            if (r4 == 0) goto L136
            r4.e0 = r6
            r4.d0 = r6
            oz3 r5 = defpackage.oz3.IsNotPlaced
            r4.m0 = r5
        L136:
            r4 = 8
            boolean r3 = r3.g(r4)
            if (r3 == 0) goto L14e
            ta6 r3 = r11.o0
            r11.o0 = r1
            r11.n0 = r2
            ab6 r1 = r0.getSemanticsOwner()
            r1.b(r11, r3)
            r0.y()
        L14e:
            return
    }

    public final void i(defpackage.xj0 r2, defpackage.ut2 r3) {
            r1 = this;
            if0 r0 = r1.B0     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r0.e     // Catch: java.lang.Throwable -> La
            eg4 r0 = (defpackage.eg4) r0     // Catch: java.lang.Throwable -> La
            r0.R0(r2, r3)     // Catch: java.lang.Throwable -> La
            return
        La:
            r2 = move-exception
            r1.Y(r2)
            r1 = 0
            throw r1
    }

    public final void k() {
            r3 = this;
            sm3 r0 = r3.e0
            r1 = 5
            r2 = 0
            if (r0 == 0) goto La
            T(r3, r2, r1)
            goto Ld
        La:
            V(r3, r2, r1)
        Ld:
            wm3 r0 = r3.C0
            d34 r0 = r0.p
            boolean r1 = r0.f0
            if (r1 == 0) goto L1d
            long r0 = r0.R
            q21 r2 = new q21
            r2.<init>(r0)
            goto L1e
        L1d:
            r2 = 0
        L1e:
            zp4 r0 = r3.k0
            if (r2 == 0) goto L2c
            if (r0 == 0) goto L34
            long r1 = r2.a
            te r0 = (defpackage.te) r0
            r0.t(r3, r1)
            return
        L2c:
            if (r0 == 0) goto L34
            r3 = 1
            te r0 = (defpackage.te) r0
            r0.s(r3)
        L34:
            return
    }

    public final java.util.List l() {
            r9 = this;
            wm3 r9 = r9.C0
            rz3 r9 = r9.q
            r9.getClass()
            ua4 r0 = r9.o0
            wm3 r1 = r9.Y
            sm3 r2 = r1.a
            r2.n()
            boolean r2 = r9.p0
            if (r2 != 0) goto L19
            java.util.List r9 = r0.f()
            return r9
        L19:
            sm3 r1 = r1.a
            ua4 r2 = r1.z()
            java.lang.Object[] r3 = r2.A
            int r2 = r2.L
            r4 = 0
            r5 = r4
        L25:
            if (r5 >= r2) goto L4a
            r6 = r3[r5]
            sm3 r6 = (defpackage.sm3) r6
            int r7 = r0.L
            if (r7 > r5) goto L3a
            wm3 r6 = r6.C0
            rz3 r6 = r6.q
            r6.getClass()
            r0.b(r6)
            goto L47
        L3a:
            wm3 r6 = r6.C0
            rz3 r6 = r6.q
            r6.getClass()
            java.lang.Object[] r7 = r0.A
            r8 = r7[r5]
            r7[r5] = r6
        L47:
            int r5 = r5 + 1
            goto L25
        L4a:
            java.util.List r1 = r1.n()
            aa4 r1 = (defpackage.aa4) r1
            java.lang.Object r1 = r1.B
            ua4 r1 = (defpackage.ua4) r1
            int r1 = r1.L
            int r2 = r0.L
            r0.m(r1, r2)
            r9.p0 = r4
            java.util.List r9 = r0.f()
            return r9
    }

    public final java.util.List m() {
            r0 = this;
            wm3 r0 = r0.C0
            d34 r0 = r0.p
            java.util.List r0 = r0.s0()
            return r0
    }

    public final java.util.List n() {
            r0 = this;
            ua4 r0 = r0.z()
            java.util.List r0 = r0.f()
            return r0
    }

    public final java.util.List o() {
            r0 = this;
            ap3 r0 = r0.g0
            java.lang.Object r0 = r0.B
            ua4 r0 = (defpackage.ua4) r0
            java.util.List r0 = r0.f()
            return r0
    }

    public final boolean p() {
            r0 = this;
            wm3 r0 = r0.C0
            d34 r0 = r0.p
            boolean r0 = r0.r0
            return r0
    }

    public final boolean q() {
            r0 = this;
            wm3 r0 = r0.C0
            d34 r0 = r0.p
            boolean r0 = r0.q0
            return r0
    }

    @Override // defpackage.aq4
    public final boolean r() {
            r0 = this;
            boolean r0 = r0.H()
            return r0
    }

    public final defpackage.qm3 s() {
            r0 = this;
            wm3 r0 = r0.C0
            d34 r0 = r0.p
            qm3 r0 = r0.h0
            return r0
    }

    public final defpackage.qm3 t() {
            r0 = this;
            wm3 r0 = r0.C0
            rz3 r0 = r0.q
            if (r0 == 0) goto Lc
            qm3 r0 = r0.f0
            if (r0 != 0) goto Lb
            goto Lc
        Lb:
            return r0
        Lc:
            qm3 r0 = defpackage.qm3.NotUsed
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = defpackage.ej2.U(r2)
            r0.append(r1)
            java.lang.String r1 = " children: "
            r0.append(r1)
            java.util.List r1 = r2.n()
            aa4 r1 = (defpackage.aa4) r1
            java.lang.Object r1 = r1.B
            ua4 r1 = (defpackage.ua4) r1
            int r1 = r1.L
            r0.append(r1)
            java.lang.String r1 = " measurePolicy: "
            r0.append(r1)
            e34 r1 = r2.s0
            r0.append(r1)
            java.lang.String r1 = " deactivated: "
            r0.append(r1)
            boolean r2 = r2.K0
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public final defpackage.yc1 u() {
            r2 = this;
            yc1 r0 = r2.t0
            if (r0 != 0) goto L15
            yc1 r0 = new yc1
            e34 r1 = r2.s0
            r0.<init>()
            r0.A = r2
            vs4 r1 = defpackage.np2.Y(r1)
            r0.B = r1
            r2.t0 = r0
        L15:
            return r0
    }

    public final defpackage.sm3 v() {
            r2 = this;
            sm3 r2 = r2.j0
        L2:
            if (r2 == 0) goto Lc
            boolean r0 = r2.A
            r1 = 1
            if (r0 != r1) goto Lc
            sm3 r2 = r2.j0
            goto L2
        Lc:
            return r2
    }

    public final int w() {
            r0 = this;
            wm3 r0 = r0.C0
            d34 r0 = r0.p
            int r0 = r0.e0
            return r0
    }

    public final defpackage.ta6 x() {
            r2 = this;
            boolean r0 = r2.H()
            if (r0 == 0) goto L18
            boolean r0 = r2.K0
            if (r0 != 0) goto L18
            if0 r0 = r2.B0
            r1 = 8
            boolean r0 = r0.g(r1)
            if (r0 != 0) goto L15
            goto L18
        L15:
            ta6 r2 = r2.o0
            return r2
        L18:
            r2 = 0
            return r2
    }

    public final defpackage.ua4 y() {
            r5 = this;
            boolean r0 = r5.r0
            ua4 r1 = r5.q0
            if (r0 == 0) goto L1e
            r1.g()
            ua4 r0 = r5.z()
            int r2 = r1.L
            r1.c(r2, r0)
            java.lang.Object[] r0 = r1.A
            int r2 = r1.L
            r3 = 0
            bk r4 = defpackage.sm3.N0
            java.util.Arrays.sort(r0, r3, r2, r4)
            r5.r0 = r3
        L1e:
            return r1
    }

    public final defpackage.ua4 z() {
            r1 = this;
            r1.f0()
            int r0 = r1.f0
            if (r0 != 0) goto Le
            ap3 r1 = r1.g0
            java.lang.Object r1 = r1.B
            ua4 r1 = (defpackage.ua4) r1
            return r1
        Le:
            ua4 r1 = r1.h0
            r1.getClass()
            return r1
    }
}
