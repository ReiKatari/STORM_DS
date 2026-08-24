package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c55  reason: default package */
/* loaded from: classes.dex */
public class c55 extends defpackage.f55 implements defpackage.x32, defpackage.vx0 {
    public defpackage.g55 L;
    public final defpackage.o45 R;
    public final defpackage.s35 X;
    public final defpackage.wb6 Y;

    public c55(defpackage.o45 r2, defpackage.s35 r3, defpackage.wb6 r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r1.<init>()
            g55 r0 = defpackage.g55.NOT_NULL
            r1.L = r0
            r1.R = r2
            r1.X = r3
            r1.Y = r4
            return
    }

    @Override // defpackage.vx0
    public final void D(defpackage.t25 r1, int r2, byte r3) {
            r0 = this;
            r1.getClass()
            long r1 = r0.u0(r1, r2)
            r0.q0(r3, r1)
            return
    }

    @Override // defpackage.x32
    public final void E(char r3) {
            r2 = this;
            long r0 = r2.m0()
            r2.q0(r3, r0)
            return
    }

    @Override // defpackage.x32
    public final void K(defpackage.wb6 r5, int r6) {
            r4 = this;
            r5.getClass()
            long r0 = r4.m0()
            r2 = 1
            int r5 = defpackage.mp2.u(r5, r6, r2)
            r2 = 19500(0x4c2c, double:9.6343E-320)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            s35 r4 = r4.X
            if (r6 != 0) goto L1c
            java.lang.Object r6 = r4.A
            t90 r6 = (defpackage.t90) r6
            defpackage.s35.s(r4, r6, r5)
            return
        L1c:
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = r0 & r2
            int r6 = (int) r0
            q45 r0 = defpackage.q45.DEFAULT
            r4.G(r5, r6, r0)
            return
    }

    @Override // defpackage.vx0
    public final void N(defpackage.t25 r1, int r2, short r3) {
            r0 = this;
            r1.getClass()
            long r1 = r0.u0(r1, r2)
            r0.q0(r3, r1)
            return
    }

    @Override // defpackage.vx0
    public final void O(int r3, int r4, defpackage.wb6 r5) {
            r2 = this;
            r5.getClass()
            long r0 = r2.u0(r5, r3)
            r2.q0(r4, r0)
            return
    }

    @Override // defpackage.vx0
    public final void Q(defpackage.wb6 r1, int r2, java.lang.String r3) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            long r1 = r0.u0(r1, r2)
            r0.s0(r1, r3)
            return
    }

    @Override // defpackage.vx0
    public final void R(defpackage.t25 r1, int r2, char r3) {
            r0 = this;
            r1.getClass()
            long r1 = r0.u0(r1, r2)
            r0.q0(r3, r1)
            return
    }

    @Override // defpackage.x32
    public final void T(int r3) {
            r2 = this;
            long r0 = r2.m0()
            r2.q0(r3, r0)
            return
    }

    @Override // defpackage.vx0
    public final void V(defpackage.wb6 r3, int r4, defpackage.gg3 r5, java.lang.Object r6) {
            r2 = this;
            r3.getClass()
            r5.getClass()
            boolean r0 = r3.k(r4)
            if (r0 == 0) goto Lf
            g55 r0 = defpackage.g55.OPTIONAL
            goto L3a
        Lf:
            wb6 r0 = r3.j(r4)
            np2 r0 = r0.e()
            bt6 r1 = defpackage.bt6.g
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 != 0) goto L38
            bt6 r1 = defpackage.bt6.f
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L28
            goto L38
        L28:
            np2 r0 = r3.e()
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L35
            g55 r0 = defpackage.g55.LIST_ELEMENT
            goto L3a
        L35:
            g55 r0 = defpackage.g55.ACCEPTABLE
            goto L3a
        L38:
            g55 r0 = defpackage.g55.COLLECTION
        L3a:
            r2.L = r0
            long r3 = r2.u0(r3, r4)
            r2.n0(r3)
            wb6 r3 = r5.e()
            boolean r3 = r3.c()
            if (r3 == 0) goto L51
            r2.j(r5, r6)
            return
        L51:
            if (r6 != 0) goto L57
            r2.f()
            return
        L57:
            r2.j(r5, r6)
            return
    }

    @Override // defpackage.x32
    public final void X(long r3) {
            r2 = this;
            long r0 = r2.m0()
            r2.r0(r0, r3)
            return
    }

    @Override // defpackage.vx0
    public final void a(defpackage.wb6 r4) {
            r3 = this;
            r4.getClass()
            int r0 = r3.A
            if (r0 < 0) goto L1c
            if (r0 < 0) goto L14
            java.lang.Object r1 = r3.B
            long[] r1 = (long[]) r1
            int r2 = r0 + (-1)
            r3.A = r2
            r0 = r1[r0]
            goto L1c
        L14:
            fc6 r3 = new fc6
            java.lang.String r4 = "No tag in stack for requested element"
            r3.<init>(r4)
            throw r3
        L1c:
            r3.t0(r4)
            return
    }

    @Override // defpackage.vx0
    public final defpackage.x32 a0(defpackage.t25 r3, int r4) {
            r2 = this;
            r3.getClass()
            long r0 = r2.u0(r3, r4)
            wb6 r3 = r3.j(r4)
            r3.getClass()
            r2.n0(r0)
            return r2
    }

    @Override // defpackage.x32
    public final defpackage.jd1 b() {
            r0 = this;
            o45 r0 = r0.R
            jd1 r0 = r0.b
            return r0
    }

    @Override // defpackage.x32
    public defpackage.vx0 c(defpackage.wb6 r9) {
            r8 = this;
            r9.getClass()
            np2 r0 = r9.e()
            bt6 r1 = defpackage.bt6.f
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 == 0) goto L48
            r0 = 0
            wb6 r0 = r9.j(r0)
            boolean r0 = defpackage.mp2.O(r0)
            if (r0 == 0) goto L39
            long r0 = r8.h0()
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L39
            iq4 r1 = new iq4
            s35 r4 = r8.X
            long r2 = r8.h0()
            o45 r5 = r8.R
            r6 = r9
            r1.<init>(r2, r4, r5, r6)
            return r1
        L39:
            r7 = r9
            fk5 r2 = new fk5
            s35 r5 = r8.X
            long r3 = r8.h0()
            o45 r6 = r8.R
            r2.<init>(r3, r5, r6, r7)
            return r2
        L48:
            r7 = r9
            bt6 r9 = defpackage.bt6.e
            boolean r9 = defpackage.nb3.k(r0, r9)
            if (r9 != 0) goto L88
            bt6 r9 = defpackage.bt6.h
            boolean r9 = defpackage.nb3.k(r0, r9)
            if (r9 != 0) goto L88
            boolean r9 = r0 instanceof defpackage.dz4
            if (r9 == 0) goto L5e
            goto L88
        L5e:
            bt6 r9 = defpackage.bt6.g
            boolean r9 = defpackage.nb3.k(r0, r9)
            if (r9 == 0) goto L74
            a14 r2 = new a14
            long r3 = r8.h0()
            s35 r5 = r8.X
            o45 r6 = r8.R
            r2.<init>(r3, r5, r6, r7)
            return r2
        L74:
            fc6 r8 = new fc6
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "This serial kind is not supported as structure: "
            r9.<init>(r0)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L88:
            long r0 = r8.h0()
            r2 = 19500(0x4c2c, double:9.6343E-320)
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 != 0) goto L9b
            wb6 r9 = r8.Y
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto L9b
            return r8
        L9b:
            boolean r9 = defpackage.mp2.N(r0)
            o45 r6 = r8.R
            if (r9 == 0) goto Lab
            dm4 r9 = new dm4
            s35 r8 = r8.X
            r9.<init>(r6, r8, r7)
            return r9
        Lab:
            zd4 r2 = new zd4
            long r3 = r8.h0()
            s35 r5 = r8.X
            r2.<init>(r3, r5, r6, r7)
            return r2
    }

    @Override // defpackage.vx0
    public final void d(defpackage.t25 r1, int r2, double r3) {
            r0 = this;
            r1.getClass()
            long r1 = r0.u0(r1, r2)
            r0.o0(r1, r3)
            return
    }

    @Override // defpackage.x32
    public final void d0(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            long r0 = r2.m0()
            r2.s0(r0, r3)
            return
    }

    @Override // defpackage.x32
    public final void f() {
            r1 = this;
            g55 r1 = r1.L
            g55 r0 = defpackage.g55.ACCEPTABLE
            if (r1 == r0) goto L2e
            int[] r0 = defpackage.h55.a
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L26
            r0 = 2
            if (r1 == r0) goto L23
            r0 = 3
            if (r1 == r0) goto L20
            r0 = 4
            if (r1 == r0) goto L1d
            java.lang.String r1 = "'null' is not supported in ProtoBuf"
            goto L28
        L1d:
            java.lang.String r1 = "'null' is not allowed for not-null properties"
            goto L28
        L20:
            java.lang.String r1 = "'null' is not supported as the value of a list element in ProtoBuf"
            goto L28
        L23:
            java.lang.String r1 = "'null' is not supported as the value of collection types in ProtoBuf"
            goto L28
        L26:
            java.lang.String r1 = "'null' is not supported for optional properties in ProtoBuf"
        L28:
            fc6 r0 = new fc6
            r0.<init>(r1)
            throw r0
        L2e:
            return
    }

    @Override // defpackage.vx0
    public final void f0(defpackage.wb6 r1, int r2, float r3) {
            r0 = this;
            r1.getClass()
            long r1 = r0.u0(r1, r2)
            r0.p0(r3, r1)
            return
    }

    @Override // defpackage.x32
    public defpackage.vx0 g0(defpackage.wb6 r13, int r14) {
            r12 = this;
            r13.getClass()
            np2 r0 = r13.e()
            bt6 r1 = defpackage.bt6.f
            boolean r2 = defpackage.nb3.k(r0, r1)
            if (r2 == 0) goto L79
            long r4 = r12.h0()
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            long r2 = r2 & r4
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L39
            r0 = 0
            wb6 r0 = r13.j(r0)
            boolean r0 = defpackage.mp2.O(r0)
            if (r0 == 0) goto L39
            iq4 r6 = new iq4
            s35 r9 = r12.X
            long r7 = r12.h0()
            o45 r10 = r12.R
            r11 = r13
            r6.<init>(r7, r9, r10, r11)
            return r6
        L39:
            r8 = r13
            r2 = 19500(0x4c2c, double:9.6343E-320)
            int r13 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r13 != 0) goto L49
            s35 r0 = r12.X
            java.lang.Object r2 = r0.A
            t90 r2 = (defpackage.t90) r2
            defpackage.s35.s(r0, r2, r14)
        L49:
            wb6 r14 = r12.Y
            np2 r0 = r14.e()
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L6d
            if (r13 == 0) goto L6d
            boolean r13 = r14.equals(r8)
            if (r13 != 0) goto L6d
            zd4 r3 = new zd4
            t90 r9 = new t90
            r9.<init>()
            r6 = r4
            o45 r4 = r12.R
            s35 r5 = r12.X
            r3.<init>(r4, r5, r6, r8, r9)
            return r3
        L6d:
            r6 = r4
            fk5 r3 = new fk5
            r4 = r6
            o45 r7 = r12.R
            s35 r6 = r12.X
            r3.<init>(r4, r6, r7, r8)
            return r3
        L79:
            r8 = r13
            bt6 r13 = defpackage.bt6.g
            boolean r13 = defpackage.nb3.k(r0, r13)
            if (r13 == 0) goto L95
            a14 r0 = new a14
            java.lang.Object r13 = r12.B
            long[] r13 = (long[]) r13
            int r14 = r12.A
            r1 = r13[r14]
            s35 r3 = r12.X
            o45 r4 = r12.R
            r5 = r8
            r0.<init>(r1, r3, r4, r5)
            return r0
        L95:
            fc6 r12 = new fc6
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "This serial kind is not supported as collection: "
            r13.<init>(r14)
            r13.append(r8)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
    }

    @Override // defpackage.vx0
    public final boolean i(defpackage.wb6 r1) {
            r0 = this;
            r1.getClass()
            o45 r0 = r0.R
            boolean r0 = r0.a
            return r0
    }

    @Override // defpackage.x32
    public final void j(defpackage.gg3 r9, java.lang.Object r10) {
            r8 = this;
            r9.getClass()
            boolean r0 = r9 instanceof defpackage.qw2
            if (r0 == 0) goto L56
            qw2 r9 = (defpackage.qw2) r9
            gg3 r0 = r9.a
            gg3 r9 = r9.b
            r0.getClass()
            r9.getClass()
            w04 r1 = new w04
            r2 = 0
            r1.<init>(r0, r9, r2)
            nu r9 = new nu
            wb6 r0 = r1.e()
            r0.getClass()
            r3 = 3
            r9.<init>(r0, r3)
            r10.getClass()
            java.util.Map r10 = (java.util.Map) r10
            java.util.Set r10 = r10.entrySet()
            r0 = r10
            java.util.Collection r0 = (java.util.Collection) r0
            r0.getClass()
            int r0 = r0.size()
            vx0 r8 = r8.g0(r9, r0)
            java.util.Collection r10 = (java.util.Collection) r10
            r10.getClass()
            java.util.Iterator r10 = r10.iterator()
        L46:
            if (r2 >= r0) goto L52
            java.lang.Object r3 = r10.next()
            r8.w(r9, r2, r1, r3)
            int r2 = r2 + 1
            goto L46
        L52:
            r8.a(r9)
            return
        L56:
            wb6 r0 = r9.e()
            x90 r1 = defpackage.x90.c
            t25 r1 = r1.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            s35 r3 = r8.X
            r4 = 19500(0x4c2c, double:9.6343E-320)
            if (r0 == 0) goto L92
            r10.getClass()
            byte[] r10 = (byte[]) r10
            long r8 = r8.m0()
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 != 0) goto L7c
            r3.F(r10)
            return
        L7c:
            long r8 = r8 & r1
            int r8 = (int) r8
            r3.getClass()
            java.lang.Object r9 = r3.A
            t90 r9 = (defpackage.t90) r9
            x45 r0 = defpackage.x45.SIZE_DELIMITED
            int r8 = r0.wireIntWithTag(r8)
            defpackage.s35.s(r3, r9, r8)
            r3.F(r10)
            return
        L92:
            wb6 r0 = r9.e()
            cf7 r6 = defpackage.cf7.c
            t25 r6 = r6.b
            boolean r0 = defpackage.nb3.k(r0, r6)
            if (r0 == 0) goto Lca
            r10.getClass()
            af7 r10 = (defpackage.af7) r10
            byte[] r9 = r10.A
            long r6 = r8.m0()
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 != 0) goto Lb3
            r3.F(r9)
            return
        Lb3:
            long r0 = r6 & r1
            int r8 = (int) r0
            r3.getClass()
            java.lang.Object r10 = r3.A
            t90 r10 = (defpackage.t90) r10
            x45 r0 = defpackage.x45.SIZE_DELIMITED
            int r8 = r0.wireIntWithTag(r8)
            defpackage.s35.s(r3, r10, r8)
            r3.F(r9)
            return
        Lca:
            r9.d(r8, r10)
            return
    }

    @Override // defpackage.x32
    public final void l(double r3) {
            r2 = this;
            long r0 = r2.m0()
            r2.o0(r0, r3)
            return
    }

    @Override // defpackage.x32
    public final void m(short r3) {
            r2 = this;
            long r0 = r2.m0()
            r2.q0(r3, r0)
            return
    }

    @Override // defpackage.vx0
    public final void n(defpackage.wb6 r1, int r2, long r3) {
            r0 = this;
            r1.getClass()
            long r1 = r0.u0(r1, r2)
            r0.r0(r1, r3)
            return
    }

    @Override // defpackage.x32
    public final void o(byte r3) {
            r2 = this;
            long r0 = r2.m0()
            r2.q0(r3, r0)
            return
    }

    public final void o0(long r3, double r5) {
            r2 = this;
            r0 = 19500(0x4c2c, double:9.6343E-320)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            s35 r2 = r2.X
            if (r0 != 0) goto L18
            java.lang.Object r2 = r2.A
            t90 r2 = (defpackage.t90) r2
            long r3 = java.lang.Double.doubleToRawLongBits(r5)
            long r3 = java.lang.Long.reverseBytes(r3)
            r2.d(r3)
            return
        L18:
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r3 = r3 & r0
            int r3 = (int) r3
            java.lang.Object r4 = r2.A
            t90 r4 = (defpackage.t90) r4
            x45 r0 = defpackage.x45.i64
            int r3 = r0.wireIntWithTag(r3)
            defpackage.s35.s(r2, r4, r3)
            java.lang.Object r2 = r2.A
            t90 r2 = (defpackage.t90) r2
            long r3 = java.lang.Double.doubleToRawLongBits(r5)
            long r3 = java.lang.Long.reverseBytes(r3)
            r2.d(r3)
            return
    }

    public final void p0(float r3, long r4) {
            r2 = this;
            r0 = 19500(0x4c2c, double:9.6343E-320)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            s35 r2 = r2.X
            if (r0 != 0) goto L18
            java.lang.Object r2 = r2.A
            t90 r2 = (defpackage.t90) r2
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            int r3 = java.lang.Integer.reverseBytes(r3)
            r2.c(r3)
            return
        L18:
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r4 = r4 & r0
            int r4 = (int) r4
            java.lang.Object r5 = r2.A
            t90 r5 = (defpackage.t90) r5
            x45 r0 = defpackage.x45.i32
            int r4 = r0.wireIntWithTag(r4)
            defpackage.s35.s(r2, r5, r4)
            java.lang.Object r2 = r2.A
            t90 r2 = (defpackage.t90) r2
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            int r3 = java.lang.Integer.reverseBytes(r3)
            r2.c(r3)
            return
    }

    public final void q0(int r3, long r4) {
            r2 = this;
            r0 = 19500(0x4c2c, double:9.6343E-320)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            s35 r2 = r2.X
            if (r0 != 0) goto L10
            java.lang.Object r4 = r2.A
            t90 r4 = (defpackage.t90) r4
            defpackage.s35.s(r2, r4, r3)
            return
        L10:
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = r0 & r4
            int r0 = (int) r0
            q45 r4 = defpackage.mp2.I(r4)
            r2.G(r3, r0, r4)
            return
    }

    @Override // defpackage.x32
    public final void r(boolean r3) {
            r2 = this;
            long r0 = r2.m0()
            r2.q0(r3, r0)
            return
    }

    public final void r0(long r3, long r5) {
            r2 = this;
            r0 = 19500(0x4c2c, double:9.6343E-320)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            s35 r2 = r2.X
            if (r0 != 0) goto L12
            java.lang.Object r3 = r2.A
            t90 r3 = (defpackage.t90) r3
            q45 r4 = defpackage.q45.DEFAULT
            r2.t(r3, r5, r4)
            return
        L12:
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = r0 & r3
            int r0 = (int) r0
            q45 r3 = defpackage.mp2.I(r3)
            r2.getClass()
            java.lang.Object r4 = r2.A
            t90 r4 = (defpackage.t90) r4
            r3.getClass()
            q45 r1 = defpackage.q45.FIXED
            if (r3 != r1) goto L2c
            x45 r1 = defpackage.x45.i64
            goto L2e
        L2c:
            x45 r1 = defpackage.x45.VARINT
        L2e:
            int r0 = r1.wireIntWithTag(r0)
            defpackage.s35.s(r2, r4, r0)
            r2.t(r4, r5, r3)
            return
    }

    @Override // defpackage.x32
    public defpackage.x32 s(defpackage.wb6 r3) {
            r2 = this;
            r3.getClass()
            long r0 = r2.m0()
            r2.n0(r0)
            return r2
    }

    public void s0(long r3, java.lang.String r5) {
            r2 = this;
            r5.getClass()
            r0 = 19500(0x4c2c, double:9.6343E-320)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            s35 r2 = r2.X
            if (r0 != 0) goto L16
            r2.getClass()
            byte[] r3 = defpackage.xs6.X(r5)
            r2.F(r3)
            return
        L16:
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r3 = r3 & r0
            int r3 = (int) r3
            r2.getClass()
            byte[] r4 = defpackage.xs6.X(r5)
            java.lang.Object r5 = r2.A
            t90 r5 = (defpackage.t90) r5
            x45 r0 = defpackage.x45.SIZE_DELIMITED
            int r3 = r0.wireIntWithTag(r3)
            defpackage.s35.s(r2, r5, r3)
            r2.F(r4)
            return
    }

    public void t0(defpackage.wb6 r1) {
            r0 = this;
            r1.getClass()
            return
    }

    @Override // defpackage.vx0
    public final void u(defpackage.wb6 r1, int r2, boolean r3) {
            r0 = this;
            r1.getClass()
            long r1 = r0.u0(r1, r2)
            r0.q0(r3, r1)
            return
    }

    public long u0(defpackage.wb6 r1, int r2) {
            r0 = this;
            r1.getClass()
            long r0 = defpackage.mp2.t(r1, r2)
            return r0
    }

    @Override // defpackage.vx0
    public final void w(defpackage.wb6 r3, int r4, defpackage.gg3 r5, java.lang.Object r6) {
            r2 = this;
            r3.getClass()
            r5.getClass()
            boolean r0 = r3.k(r4)
            if (r0 == 0) goto Lf
            g55 r0 = defpackage.g55.OPTIONAL
            goto L43
        Lf:
            wb6 r0 = r3.j(r4)
            boolean r1 = r0.c()
            if (r1 != 0) goto L1c
            g55 r0 = defpackage.g55.NOT_NULL
            goto L43
        L1c:
            np2 r0 = r0.e()
            bt6 r1 = defpackage.bt6.g
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 != 0) goto L41
            bt6 r1 = defpackage.bt6.f
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L31
            goto L41
        L31:
            np2 r0 = r3.e()
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L3e
            g55 r0 = defpackage.g55.LIST_ELEMENT
            goto L43
        L3e:
            g55 r0 = defpackage.g55.ACCEPTABLE
            goto L43
        L41:
            g55 r0 = defpackage.g55.COLLECTION
        L43:
            r2.L = r0
            long r3 = r2.u0(r3, r4)
            r2.n0(r3)
            r2.j(r5, r6)
            return
    }

    @Override // defpackage.x32
    public final void x(float r3) {
            r2 = this;
            long r0 = r2.m0()
            r2.p0(r3, r0)
            return
    }
}
