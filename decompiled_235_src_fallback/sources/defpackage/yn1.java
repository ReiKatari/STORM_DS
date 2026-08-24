package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yn1  reason: default package */
/* loaded from: classes.dex */
public abstract class yn1 extends defpackage.zg1 implements defpackage.yy4, defpackage.a53, defpackage.fy0, defpackage.ur2 {
    public defpackage.j97 A0;
    public long B0;
    public defpackage.kk C0;
    public defpackage.z43 D0;
    public long E0;
    public defpackage.lo4 m0;
    public defpackage.qn2 n0;
    public boolean o0;
    public defpackage.r94 p0;
    public defpackage.vr2 q0;
    public defpackage.v80 r0;
    public defpackage.ao1 s0;
    public boolean t0;
    public boolean u0;
    public defpackage.an1 v0;
    public defpackage.dn1 w0;
    public defpackage.cn1 x0;
    public defpackage.bn1 y0;
    public defpackage.nb3 z0;

    public yn1(defpackage.qn2 r1, boolean r2, defpackage.r94 r3, defpackage.lo4 r4) {
            r0 = this;
            r0.<init>()
            r0.m0 = r4
            r0.n0 = r1
            r0.o0 = r2
            r0.p0 = r3
            r1 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r0.B0 = r1
            r1 = 0
            r0.E0 = r1
            return
    }

    public static final java.lang.Object U0(defpackage.yn1 r6, defpackage.s41 r7) {
            boolean r0 = r7 instanceof defpackage.un1
            if (r0 == 0) goto L13
            r0 = r7
            un1 r0 = (defpackage.un1) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            un1 r0 = new un1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.oi2.Y(r7)
            goto L47
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r3
        L2e:
            defpackage.oi2.Y(r7)
            ao1 r7 = r6.s0
            if (r7 == 0) goto L49
            r94 r2 = r6.p0
            if (r2 == 0) goto L47
            zn1 r5 = new zn1
            r5.<init>(r7)
            r0.Y = r4
            java.lang.Object r7 = r2.a(r5, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            r6.s0 = r3
        L49:
            hn1 r7 = new hn1
            r0 = 0
            r2 = 0
            r7.<init>(r0, r2)
            r6.e1(r7)
            jg7 r6 = defpackage.jg7.a
            return r6
    }

    public static final java.lang.Object V0(defpackage.yn1 r6, defpackage.gn1 r7, defpackage.s41 r8) {
            boolean r0 = r8 instanceof defpackage.vn1
            if (r0 == 0) goto L13
            r0 = r8
            vn1 r0 = (defpackage.vn1) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            vn1 r0 = new vn1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.Y
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.d0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2e
            ao1 r7 = r0.X
            gn1 r0 = r0.R
            defpackage.oi2.Y(r8)
            goto L6e
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            r6 = 0
            return r6
        L35:
            gn1 r7 = r0.R
            defpackage.oi2.Y(r8)
            goto L56
        L3b:
            defpackage.oi2.Y(r8)
            ao1 r8 = r6.s0
            if (r8 == 0) goto L56
            r94 r2 = r6.p0
            if (r2 == 0) goto L56
            zn1 r5 = new zn1
            r5.<init>(r8)
            r0.R = r7
            r0.d0 = r4
            java.lang.Object r8 = r2.a(r5, r0)
            if (r8 != r1) goto L56
            goto L6b
        L56:
            ao1 r8 = new ao1
            r8.<init>()
            r94 r2 = r6.p0
            if (r2 == 0) goto L70
            r0.R = r7
            r0.X = r8
            r0.d0 = r3
            java.lang.Object r0 = r2.a(r8, r0)
            if (r0 != r1) goto L6c
        L6b:
            return r1
        L6c:
            r0 = r7
            r7 = r8
        L6e:
            r8 = r7
            r7 = r0
        L70:
            r6.s0 = r8
            long r7 = r7.a
            r6.d1(r7)
            jg7 r6 = defpackage.jg7.a
            return r6
    }

    public static final java.lang.Object W0(defpackage.yn1 r6, defpackage.hn1 r7, defpackage.s41 r8) {
            boolean r0 = r8 instanceof defpackage.wn1
            if (r0 == 0) goto L13
            r0 = r8
            wn1 r0 = (defpackage.wn1) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            wn1 r0 = new wn1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            hn1 r7 = r0.R
            defpackage.oi2.Y(r8)
            goto L4b
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r3
        L30:
            defpackage.oi2.Y(r8)
            ao1 r8 = r6.s0
            if (r8 == 0) goto L4d
            r94 r2 = r6.p0
            if (r2 == 0) goto L4b
            bo1 r5 = new bo1
            r5.<init>(r8)
            r0.R = r7
            r0.Z = r4
            java.lang.Object r8 = r2.a(r5, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            r6.s0 = r3
        L4d:
            r6.e1(r7)
            jg7 r6 = defpackage.jg7.a
            return r6
    }

    public static void b1(defpackage.yn1 r3, defpackage.vy4 r4, long r5, long r7, int r9) {
            r9 = r9 & 4
            if (r9 == 0) goto L6
            r7 = 0
        L6:
            cn1 r9 = r3.x0
            r0 = 0
            if (r9 != 0) goto L1e
            cn1 r9 = new cn1
            r9.<init>()
            r1 = 0
            r9.x = r1
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9.y = r1
            r9.z = r0
            r3.x0 = r9
        L1e:
            r9.x = r4
            r9.y = r5
            kk r4 = r3.C0
            lo4 r5 = r3.m0
            if (r4 != 0) goto L30
            kk r4 = new kk
            r4.<init>(r5)
            r3.C0 = r4
            goto L34
        L30:
            r4.L = r5
            r4.B = r7
        L34:
            r9.z = r0
            r3.z0 = r9
            return
    }

    @Override // defpackage.yy4
    public final void I() {
            r2 = this;
            boolean r0 = r2.u0
            if (r0 == 0) goto L17
            r2.Z0()
            boolean r0 = r2.t0
            if (r0 == 0) goto L14
            ul0 r0 = r2.f1()
            en1 r1 = defpackage.en1.a
            r0.c(r1)
        L14:
            r0 = 0
            r2.A0 = r0
        L17:
            r0 = 0
            r2.u0 = r0
            return
    }

    @Override // defpackage.z64
    public final void K0() {
            r2 = this;
            r0 = 0
            r2.t0 = r0
            r2.X0()
            r0 = 0
            r2.E0 = r0
            vr2 r0 = r2.q0
            if (r0 == 0) goto L11
            r2.S0(r0)
        L11:
            r0 = 0
            r2.q0 = r0
            return
    }

    @Override // defpackage.ur2
    public final boolean V(defpackage.vy4 r9) {
            r8 = this;
            boolean r0 = defpackage.ej2.n(r9)
            if (r0 == 0) goto L9
            boolean r8 = r8.o0
            return r8
        L9:
            boolean r0 = defpackage.ej2.p(r9)
            r1 = 0
            if (r0 == 0) goto L12
            goto L98
        L12:
            kk r0 = r8.C0
            if (r0 != 0) goto L1f
            kk r0 = new kk
            lo4 r2 = r8.m0
            r0.<init>(r2)
            r8.C0 = r0
        L1f:
            nq6 r0 = defpackage.ky0.t
            java.lang.Object r0 = defpackage.hf.K(r8, r0)
            fo7 r0 = (defpackage.fo7) r0
            float r0 = r0.f()
            long r2 = defpackage.ej2.R(r9, r1)
            kk r8 = r8.C0
            if (r8 == 0) goto L99
            long r4 = r8.e(r0, r2, r1)
            r6 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            boolean r9 = defpackage.jk4.c(r4, r6)
            if (r9 != 0) goto L98
            long r4 = r8.B
            long r2 = defpackage.jk4.f(r4, r2)
            r9 = 32
            long r4 = r2 >> r9
            int r9 = (int) r4
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r9 = java.lang.Math.abs(r9)
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r0 = (int) r2
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r0 = java.lang.Math.abs(r0)
            double r2 = (double) r0
            double r4 = (double) r9
            double r2 = java.lang.Math.atan2(r2, r4)
            float r9 = (float) r2
            r0 = 1127481344(0x43340000, float:180.0)
            float r9 = r9 * r0
            double r2 = (double) r9
            r4 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r2 = r2 / r4
            java.lang.Object r8 = r8.L
            lo4 r8 = (defpackage.lo4) r8
            if (r8 != 0) goto L7d
            r8 = -1
            goto L85
        L7d:
            int[] r9 = defpackage.t87.a
            int r8 = r8.ordinal()
            r8 = r9[r8]
        L85:
            r9 = 1
            r4 = 4629137466983448576(0x403e000000000000, double:30.0)
            if (r8 == r9) goto L93
            r0 = 2
            if (r8 == r0) goto L8e
            goto L98
        L8e:
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L98
            goto L97
        L93:
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 >= 0) goto L98
        L97:
            return r9
        L98:
            return r1
        L99:
            java.lang.String r8 = "Touch slop detector not initialized."
            defpackage.i.h(r8)
            return r1
    }

    public final void X0() {
            r3 = this;
            ao1 r0 = r3.s0
            if (r0 == 0) goto L13
            r94 r1 = r3.p0
            if (r1 == 0) goto L10
            zn1 r2 = new zn1
            r2.<init>(r0)
            r1.b(r2)
        L10:
            r0 = 0
            r3.s0 = r0
        L13:
            return
    }

    public abstract java.lang.Object Y0(defpackage.xn1 r1, defpackage.xn1 r2);

    public final void Z0() {
            r3 = this;
            an1 r0 = r3.v0
            r1 = 0
            if (r0 != 0) goto L12
            an1 r0 = new an1
            zm1 r2 = defpackage.zm1.NotInitialized
            r0.<init>()
            r0.x = r2
            r0.y = r1
            r3.v0 = r0
        L12:
            zm1 r2 = defpackage.zm1.NotInitialized
            r0.x = r2
            r0.y = r1
            r3.z0 = r0
            return
    }

    public final void a1(defpackage.vy4 r4, long r5, defpackage.kk r7) {
            r3 = this;
            bn1 r0 = r3.y0
            if (r0 != 0) goto L15
            bn1 r0 = new bn1
            r0.<init>()
            r1 = 0
            r0.x = r1
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0.y = r1
            r3.y0 = r0
        L15:
            r0.x = r4
            r0.y = r5
            r4 = 0
            r7.B = r4
            r3.z0 = r0
            return
    }

    public final void c1(defpackage.in1 r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.gn1
            if (r0 == 0) goto Le
            boolean r0 = r1.t0
            if (r0 != 0) goto Le
            r0 = 1
            r1.t0 = r0
            r1.k1()
        Le:
            ul0 r1 = r1.f1()
            r1.c(r2)
            return
    }

    public abstract void d1(long r1);

    public abstract void e1(defpackage.hn1 r1);

    @Override // defpackage.a53
    public final void f0() {
            r2 = this;
            z43 r2 = r2.D0
            if (r2 == 0) goto L20
            r2.a()
            yn1 r0 = r2.a
            boolean r1 = r0.t0
            if (r1 == 0) goto L12
            en1 r1 = defpackage.en1.a
            r0.c1(r1)
        L12:
            r0 = 0
            r2.g = r0
            zb r2 = r2.k
            r0 = 0
            r2.B = r0
            java.lang.Object r2 = r2.L
            t94 r2 = (defpackage.t94) r2
            r2.b = r0
        L20:
            return
    }

    public final defpackage.ul0 f1() {
            r0 = this;
            v80 r0 = r0.r0
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "Events channel not initialized."
            defpackage.i.h(r0)
            r0 = 0
            return r0
    }

    public final defpackage.j97 g1() {
            r0 = this;
            j97 r0 = r0.A0
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "Velocity Tracker not initialized."
            defpackage.i.h(r0)
            r0 = 0
            return r0
    }

    public final void h1(long r7, defpackage.vy4 r9) {
            r6 = this;
            z64 r0 = r6.A
            eg4 r0 = defpackage.nc1.e0(r0)
            r1 = 0
            long r0 = r0.w(r1)
            long r2 = r6.B0
            r4 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            boolean r2 = defpackage.jk4.c(r2, r4)
            if (r2 != 0) goto L2f
            long r2 = r6.B0
            boolean r2 = defpackage.jk4.c(r0, r2)
            if (r2 != 0) goto L2f
            long r2 = r6.B0
            long r2 = defpackage.jk4.e(r0, r2)
            long r4 = r6.E0
            long r2 = defpackage.jk4.f(r4, r2)
            r6.E0 = r2
        L2f:
            r6.B0 = r0
            j97 r0 = r6.g1()
            long r1 = r6.E0
            defpackage.mp2.h(r0, r9, r1)
            ul0 r6 = r6.f1()
            fn1 r9 = new fn1
            r0 = 0
            r9.<init>(r7, r0)
            r6.c(r9)
            return
    }

    public final void i1(defpackage.vy4 r6, defpackage.vy4 r7, long r8) {
            r5 = this;
            j97 r0 = r5.A0
            if (r0 != 0) goto Lb
            j97 r0 = new j97
            r0.<init>()
            r5.A0 = r0
        Lb:
            j97 r0 = r5.g1()
            r1 = 0
            defpackage.mp2.h(r0, r6, r1)
            long r3 = r7.c
            long r7 = defpackage.jk4.e(r3, r8)
            r5.E0 = r1
            qn2 r9 = r5.n0
            int r6 = r6.i
            bz4 r0 = new bz4
            r0.<init>(r6)
            java.lang.Object r6 = r9.g(r0)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L5d
            boolean r6 = r5.t0
            if (r6 != 0) goto L47
            v80 r6 = r5.r0
            if (r6 != 0) goto L44
            r6 = 2147483647(0x7fffffff, float:NaN)
            r9 = 6
            r0 = 0
            v80 r6 = defpackage.nb3.c(r6, r0, r0, r9)
            r5.r0 = r6
        L44:
            r5.k1()
        L47:
            eg4 r6 = defpackage.nc1.e0(r5)
            long r0 = r6.w(r1)
            r5.B0 = r0
            ul0 r5 = r5.f1()
            gn1 r6 = new gn1
            r6.<init>(r7)
            r5.c(r6)
        L5d:
            return
    }

    public abstract boolean j1();

    public final void k1() {
            r3 = this;
            r0 = 1
            r3.t0 = r0
            v80 r0 = r3.r0
            r1 = 0
            if (r0 != 0) goto L12
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2 = 6
            v80 r0 = defpackage.nb3.c(r0, r1, r1, r2)
            r3.r0 = r0
        L12:
            w61 r0 = r3.F0()
            xn1 r2 = new xn1
            r2.<init>(r3, r1)
            r3 = 3
            defpackage.hv.L(r0, r1, r1, r2, r3)
            return
    }

    public final void l1(defpackage.qn2 r3, boolean r4, defpackage.r94 r5, defpackage.lo4 r6, boolean r7) {
            r2 = this;
            r2.n0 = r3
            boolean r3 = r2.o0
            r0 = 0
            r1 = 1
            if (r3 == r4) goto L12
            r2.o0 = r4
            if (r4 != 0) goto L11
            r2.X0()
            r2.D0 = r0
        L11:
            r7 = r1
        L12:
            r94 r3 = r2.p0
            boolean r3 = defpackage.nb3.k(r3, r5)
            if (r3 != 0) goto L1f
            r2.X0()
            r2.p0 = r5
        L1f:
            lo4 r3 = r2.m0
            if (r3 == r6) goto L26
            r2.m0 = r6
            goto L27
        L26:
            r1 = r7
        L27:
            if (r1 == 0) goto L5c
            boolean r3 = r2.u0
            en1 r4 = defpackage.en1.a
            if (r3 == 0) goto L3f
            r2.Z0()
            boolean r3 = r2.t0
            if (r3 == 0) goto L3d
            ul0 r3 = r2.f1()
            r3.c(r4)
        L3d:
            r2.A0 = r0
        L3f:
            z43 r2 = r2.D0
            if (r2 == 0) goto L5c
            r2.a()
            yn1 r3 = r2.a
            boolean r5 = r3.t0
            if (r5 == 0) goto L4f
            r3.c1(r4)
        L4f:
            r2.g = r0
            zb r2 = r2.k
            r3 = 0
            r2.B = r3
            java.lang.Object r2 = r2.L
            t94 r2 = (defpackage.t94) r2
            r2.b = r3
        L5c:
            return
    }

    @Override // defpackage.a53
    public final void u(defpackage.ei r22, defpackage.py4 r23) {
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            int r3 = r1.B
            java.lang.Object r1 = r1.L
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            vr2 r4 = r0.q0
            if (r4 != 0) goto L1a
            vr2 r4 = new vr2
            r4.<init>(r0)
            r0.R0(r4)
            r0.q0 = r4
        L1a:
            boolean r4 = r0.o0
            if (r4 == 0) goto L39d
            z43 r4 = r0.D0
            if (r4 != 0) goto L29
            z43 r4 = new z43
            r4.<init>(r0)
            r0.D0 = r4
        L29:
            z43 r5 = r0.D0
            if (r5 == 0) goto L39d
            yn1 r0 = r5.a
            np2 r4 = r5.f
            r11 = 2
            r12 = 0
            if (r4 != 0) goto L48
            u43 r4 = r5.b
            if (r4 != 0) goto L46
            u43 r4 = new u43
            t43 r6 = defpackage.t43.NotInitialized
            r4.<init>(r11)
            r4.e = r6
            r4.f = r12
            r5.b = r4
        L46:
            r5.f = r4
        L48:
            np2 r4 = r5.f
            if (r4 == 0) goto L398
            boolean r6 = r4 instanceof defpackage.u43
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = 0
            r9 = 1
            if (r6 == 0) goto Le6
            u43 r4 = (defpackage.u43) r4
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L62
            goto L39d
        L62:
            int r6 = r1.size()
        L66:
            if (r12 >= r6) goto L79
            java.lang.Object r10 = r1.get(r12)
            s43 r10 = (defpackage.s43) r10
            boolean r10 = defpackage.jx2.k(r10)
            if (r10 != 0) goto L76
            goto L39d
        L76:
            int r12 = r12 + 1
            goto L66
        L79:
            java.lang.Object r1 = defpackage.gt0.H0(r1)
            r6 = r1
            s43 r6 = (defpackage.s43) r6
            t43 r1 = r4.e
            int[] r10 = defpackage.y43.a
            int r1 = r1.ordinal()
            r1 = r10[r1]
            if (r1 != r9) goto L98
            boolean r0 = r0.j1()
            if (r0 != 0) goto L95
            t43 r0 = defpackage.t43.Yes
            goto L9a
        L95:
            t43 r0 = defpackage.t43.No
            goto L9a
        L98:
            t43 r0 = r4.e
        L9a:
            r4.e = r0
            py4 r1 = defpackage.py4.Initial
            if (r2 != r1) goto La8
            t43 r1 = defpackage.t43.No
            if (r0 != r1) goto La8
            r6.i = r9
            r4.f = r9
        La8:
            py4 r1 = defpackage.py4.Main
            if (r2 != r1) goto L39d
            t43 r1 = defpackage.t43.Yes
            if (r0 != r1) goto Lba
            long r7 = r6.a
            r9 = 0
            r11 = 12
            defpackage.z43.c(r5, r6, r7, r9, r11)
            return
        Lba:
            boolean r0 = r4.f
            if (r0 == 0) goto L39d
            r0 = r7
            r43 r8 = new r43
            r8.<init>(r3)
            r9 = 0
            r7 = r6
            r5.f(r6, r7, r8, r9)
            r43 r2 = new r43
            r2.<init>(r3)
            r5.e(r6, r2, r0)
            long r0 = r6.a
            x43 r2 = r5.c
            if (r2 != 0) goto Le1
            x43 r2 = new x43
            r2.<init>(r11)
            r2.e = r13
            r5.c = r2
        Le1:
            r2.e = r0
            r5.f = r2
            return
        Le6:
            r6 = r7
            boolean r8 = r4 instanceof defpackage.w43
            r10 = 0
            if (r8 == 0) goto L21d
            w43 r4 = (defpackage.w43) r4
            py4 r6 = defpackage.py4.Initial
            if (r2 != r6) goto Lf4
            goto L39d
        Lf4:
            int r6 = r1.size()
            r7 = r12
        Lf9:
            if (r7 >= r6) goto L116
            java.lang.Object r8 = r1.get(r7)
            r15 = r8
            s43 r15 = (defpackage.s43) r15
            long r12 = r15.a
            long r14 = r4.f
            boolean r12 = defpackage.nj2.o(r12, r14)
            if (r12 == 0) goto L10d
            goto L117
        L10d:
            int r7 = r7 + 1
            r12 = 0
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto Lf9
        L116:
            r8 = r10
        L117:
            s43 r8 = (defpackage.s43) r8
            if (r8 != 0) goto L13e
            int r6 = r1.size()
            r7 = 0
        L120:
            if (r7 >= r6) goto L131
            java.lang.Object r8 = r1.get(r7)
            r12 = r8
            s43 r12 = (defpackage.s43) r12
            boolean r12 = r12.d
            if (r12 == 0) goto L12e
            goto L132
        L12e:
            int r7 = r7 + 1
            goto L120
        L131:
            r8 = r10
        L132:
            s43 r8 = (defpackage.s43) r8
            if (r8 != 0) goto L13a
            r5.a()
            return
        L13a:
            long r6 = r8.a
            r4.f = r6
        L13e:
            r7 = r8
            py4 r6 = defpackage.py4.Main
            java.lang.String r12 = "AwaitTouchSlop.touchSlopDetector was not initialized"
            java.lang.String r13 = "AwaitTouchSlop.initialDown was not initialized"
            if (r2 != r6) goto L1f7
            boolean r6 = r7.i
            if (r6 != 0) goto L1e1
            boolean r6 = defpackage.jx2.i(r7)
            if (r6 == 0) goto L177
            int r0 = r1.size()
            r3 = 0
        L156:
            if (r3 >= r0) goto L168
            java.lang.Object r6 = r1.get(r3)
            r8 = r6
            s43 r8 = (defpackage.s43) r8
            boolean r8 = r8.d
            if (r8 == 0) goto L165
            r10 = r6
            goto L168
        L165:
            int r3 = r3 + 1
            goto L156
        L168:
            s43 r10 = (defpackage.s43) r10
            if (r10 != 0) goto L171
            r5.a()
            goto L1f7
        L171:
            long r0 = r10.a
            r4.f = r0
            goto L1f7
        L177:
            nq6 r1 = defpackage.ky0.t
            java.lang.Object r1 = defpackage.hf.K(r0, r1)
            fo7 r1 = (defpackage.fo7) r1
            float r6 = defpackage.sn1.a
            float r1 = r1.f()
            kk r6 = r5.i
            if (r6 == 0) goto L1db
            lo4 r0 = r0.m0
            r43 r8 = new r43
            r8.<init>(r3)
            long r14 = defpackage.jx2.H(r7, r0, r8, r9)
            long r0 = r6.e(r1, r14, r9)
            r14 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r14 = r14 & r0
            r18 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r6 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r6 == 0) goto L1d8
            r7.i = r9
            s43 r6 = r4.e
            r6.getClass()
            r43 r8 = new r43
            r8.<init>(r3)
            r9 = r0
            r5.f(r6, r7, r8, r9)
            r43 r0 = new r43
            r0.<init>(r3)
            r5.e(r7, r0, r9)
            long r0 = r7.a
            x43 r3 = r5.c
            if (r3 != 0) goto L1d3
            x43 r3 = new x43
            r3.<init>(r11)
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.e = r8
            r5.c = r3
        L1d3:
            r3.e = r0
            r5.f = r3
            goto L1f7
        L1d8:
            r4.g = r9
            goto L1f7
        L1db:
            java.lang.String r0 = "Touch slop detector not initialized."
            defpackage.i.h(r0)
            return
        L1e1:
            s43 r0 = r4.e
            if (r0 == 0) goto L1f3
            long r8 = r4.f
            kk r1 = r5.i
            if (r1 == 0) goto L1ef
            r5.b(r0, r8, r1)
            goto L1f7
        L1ef:
            defpackage.i.h(r12)
            return
        L1f3:
            defpackage.i.h(r13)
            return
        L1f7:
            py4 r0 = defpackage.py4.Final
            if (r2 != r0) goto L39d
            boolean r0 = r4.g
            if (r0 == 0) goto L39d
            boolean r0 = r7.i
            if (r0 == 0) goto L219
            s43 r0 = r4.e
            if (r0 == 0) goto L215
            long r1 = r4.f
            kk r3 = r5.i
            if (r3 == 0) goto L211
            r5.b(r0, r1, r3)
            return
        L211:
            defpackage.i.h(r12)
            return
        L215:
            defpackage.i.h(r13)
            return
        L219:
            r0 = 0
            r4.g = r0
            return
        L21d:
            boolean r8 = r4 instanceof defpackage.v43
            if (r8 == 0) goto L297
            v43 r4 = (defpackage.v43) r4
            py4 r6 = defpackage.py4.Final
            if (r2 == r6) goto L229
            goto L39d
        L229:
            int r2 = r1.size()
            r6 = 0
        L22e:
            if (r6 >= r2) goto L23f
            java.lang.Object r7 = r1.get(r6)
            s43 r7 = (defpackage.s43) r7
            boolean r7 = r7.i
            if (r7 == 0) goto L23c
            r9 = 0
            goto L23f
        L23c:
            int r6 = r6 + 1
            goto L22e
        L23f:
            int r2 = r1.size()
            r12 = 0
        L244:
            if (r12 >= r2) goto L293
            java.lang.Object r6 = r1.get(r12)
            s43 r6 = (defpackage.s43) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L290
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L257
            goto L293
        L257:
            if (r9 == 0) goto L39d
            java.lang.Object r1 = defpackage.gt0.H0(r1)
            s43 r1 = (defpackage.s43) r1
            lo4 r2 = r0.m0
            r43 r6 = new r43
            r6.<init>(r3)
            long r1 = defpackage.jx2.I(r1, r2, r6)
            s43 r6 = r4.e
            r6.getClass()
            lo4 r0 = r0.m0
            r43 r7 = new r43
            r7.<init>(r3)
            long r6 = defpackage.jx2.I(r6, r0, r7)
            long r9 = defpackage.jk4.e(r1, r6)
            s43 r6 = r4.e
            if (r6 == 0) goto L28a
            long r7 = r4.f
            r11 = 8
            defpackage.z43.c(r5, r6, r7, r9, r11)
            return
        L28a:
            java.lang.String r0 = "AwaitGesturePickup.initialDown was not initialized."
            defpackage.i.h(r0)
            return
        L290:
            int r12 = r12 + 1
            goto L244
        L293:
            r5.a()
            return
        L297:
            boolean r8 = r4 instanceof defpackage.x43
            if (r8 == 0) goto L394
            x43 r4 = (defpackage.x43) r4
            py4 r8 = defpackage.py4.Main
            if (r2 == r8) goto L2a3
            goto L39d
        L2a3:
            long r11 = r4.e
            int r2 = r1.size()
            r8 = 0
        L2aa:
            if (r8 >= r2) goto L2bf
            java.lang.Object r13 = r1.get(r8)
            r14 = r13
            s43 r14 = (defpackage.s43) r14
            long r14 = r14.a
            boolean r14 = defpackage.nj2.o(r14, r11)
            if (r14 == 0) goto L2bc
            goto L2c0
        L2bc:
            int r8 = r8 + 1
            goto L2aa
        L2bf:
            r13 = r10
        L2c0:
            r15 = r13
            s43 r15 = (defpackage.s43) r15
            if (r15 != 0) goto L2c7
            goto L39d
        L2c7:
            boolean r2 = defpackage.jx2.i(r15)
            en1 r8 = defpackage.en1.a
            if (r2 == 0) goto L360
            int r2 = r1.size()
            r11 = 0
        L2d4:
            if (r11 >= r2) goto L2e5
            java.lang.Object r12 = r1.get(r11)
            r13 = r12
            s43 r13 = (defpackage.s43) r13
            boolean r13 = r13.d
            if (r13 == 0) goto L2e2
            goto L2e6
        L2e2:
            int r11 = r11 + 1
            goto L2d4
        L2e5:
            r12 = r10
        L2e6:
            s43 r12 = (defpackage.s43) r12
            if (r12 != 0) goto L35b
            boolean r1 = r15.i
            if (r1 != 0) goto L354
            boolean r1 = defpackage.jx2.i(r15)
            if (r1 == 0) goto L354
            r43 r1 = new r43
            r1.<init>(r3)
            j97 r14 = r5.d()
            lo4 r2 = r0.m0
            zb r3 = r5.j
            long r11 = r5.l
            r17 = r1
            r16 = r2
            r18 = r3
            r19 = r11
            defpackage.jx2.h(r14, r15, r16, r17, r18, r19)
            nq6 r1 = defpackage.ky0.t
            java.lang.Object r1 = defpackage.hf.K(r0, r1)
            fo7 r1 = (defpackage.fo7) r1
            float r1 = r1.e()
            j97 r2 = r5.d()
            long r3 = defpackage.qo2.k(r1, r1)
            long r1 = r2.c(r3)
            j97 r3 = r5.d()
            java.lang.Object r3 = r3.B
            bg1 r3 = (defpackage.bg1) r3
            java.lang.Object r4 = r3.B
            rl7 r4 = (defpackage.rl7) r4
            yb1[] r8 = r4.d
            defpackage.fv.B0(r8, r10)
            r8 = 0
            r4.e = r8
            java.lang.Object r4 = r3.L
            rl7 r4 = (defpackage.rl7) r4
            yb1[] r11 = r4.d
            defpackage.fv.B0(r11, r10)
            r4.e = r8
            r3.A = r6
            hn1 r3 = new hn1
            long r1 = defpackage.eo1.b(r1)
            r3.<init>(r1, r9)
            r0.c1(r3)
            goto L357
        L354:
            r0.c1(r8)
        L357:
            r5.a()
            return
        L35b:
            long r0 = r12.a
            r4.e = r0
            return
        L360:
            boolean r1 = r15.i
            if (r1 == 0) goto L368
            r0.c1(r8)
            return
        L368:
            lo4 r1 = r0.m0
            r43 r2 = new r43
            r2.<init>(r3)
            long r1 = defpackage.jx2.H(r15, r1, r2, r9)
            float r1 = defpackage.jk4.d(r1)
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L37d
            goto L39d
        L37d:
            lo4 r0 = r0.m0
            r43 r1 = new r43
            r1.<init>(r3)
            r8 = 0
            long r0 = defpackage.jx2.H(r15, r0, r1, r8)
            r43 r2 = new r43
            r2.<init>(r3)
            r5.e(r15, r2, r0)
            r15.i = r9
            return
        L394:
            defpackage.i.d()
            return
        L398:
            java.lang.String r0 = "currentDragState should not be null"
            defpackage.i.h(r0)
        L39d:
            return
    }

    public void w(defpackage.oy4 r20, defpackage.py4 r21, long r22) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = 1
            r0.u0 = r3
            vr2 r4 = r0.q0
            if (r4 != 0) goto L17
            vr2 r4 = new vr2
            r4.<init>(r0)
            r0.R0(r4)
            r0.q0 = r4
        L17:
            boolean r4 = r0.o0
            if (r4 == 0) goto L35f
            nb3 r4 = r0.z0
            r5 = 0
            if (r4 != 0) goto L33
            an1 r4 = r0.v0
            if (r4 != 0) goto L31
            an1 r4 = new an1
            zm1 r6 = defpackage.zm1.NotInitialized
            r4.<init>()
            r4.x = r6
            r4.y = r5
            r0.v0 = r4
        L31:
            r0.z0 = r4
        L33:
            nb3 r4 = r0.z0
            if (r4 == 0) goto L35a
            boolean r6 = r4 instanceof defpackage.an1
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = 0
            if (r6 == 0) goto Lb7
            an1 r4 = (defpackage.an1) r4
            java.util.List r6 = r1.a
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L4e
            goto L35f
        L4e:
            boolean r5 = defpackage.hz6.e(r1, r5)
            if (r5 != 0) goto L56
            goto L35f
        L56:
            java.util.List r1 = r1.a
            java.lang.Object r1 = defpackage.gt0.H0(r1)
            vy4 r1 = (defpackage.vy4) r1
            zm1 r5 = r4.x
            int[] r6 = defpackage.tn1.a
            int r5 = r5.ordinal()
            r5 = r6[r5]
            if (r5 != r3) goto L76
            boolean r5 = r0.j1()
            if (r5 != 0) goto L73
            zm1 r5 = defpackage.zm1.Yes
            goto L78
        L73:
            zm1 r5 = defpackage.zm1.No
            goto L78
        L76:
            zm1 r5 = r4.x
        L78:
            r4.x = r5
            py4 r6 = defpackage.py4.Initial
            if (r2 != r6) goto L87
            zm1 r6 = defpackage.zm1.No
            if (r5 != r6) goto L87
            r1.a()
            r4.y = r3
        L87:
            py4 r3 = defpackage.py4.Main
            if (r2 != r3) goto L35f
            zm1 r2 = defpackage.zm1.Yes
            if (r5 != r2) goto L99
            long r2 = r1.a
            r4 = 0
            r6 = 12
            b1(r0, r1, r2, r4, r6)
            return
        L99:
            boolean r2 = r4.y
            if (r2 == 0) goto L35f
            r0.i1(r1, r1, r9)
            r0.h1(r9, r1)
            long r1 = r1.a
            dn1 r3 = r0.w0
            if (r3 != 0) goto Lb2
            dn1 r3 = new dn1
            r3.<init>()
            r3.x = r7
            r0.w0 = r3
        Lb2:
            r3.x = r1
            r0.z0 = r3
            return
        Lb7:
            boolean r6 = r4 instanceof defpackage.cn1
            r11 = 0
            if (r6 == 0) goto L1fd
            cn1 r4 = (defpackage.cn1) r4
            py4 r6 = defpackage.py4.Initial
            if (r2 != r6) goto Lc4
            goto L35f
        Lc4:
            java.util.List r1 = r1.a
            int r6 = r1.size()
            r9 = r5
        Lcb:
            if (r9 >= r6) goto Le2
            java.lang.Object r10 = r1.get(r9)
            r12 = r10
            vy4 r12 = (defpackage.vy4) r12
            long r12 = r12.a
            long r14 = r4.y
            boolean r12 = defpackage.nj2.o(r12, r14)
            if (r12 == 0) goto Ldf
            goto Le3
        Ldf:
            int r9 = r9 + 1
            goto Lcb
        Le2:
            r10 = r11
        Le3:
            vy4 r10 = (defpackage.vy4) r10
            if (r10 != 0) goto L10a
            int r6 = r1.size()
            r9 = r5
        Lec:
            if (r9 >= r6) goto Lfd
            java.lang.Object r10 = r1.get(r9)
            r12 = r10
            vy4 r12 = (defpackage.vy4) r12
            boolean r12 = r12.d
            if (r12 == 0) goto Lfa
            goto Lfe
        Lfa:
            int r9 = r9 + 1
            goto Lec
        Lfd:
            r10 = r11
        Lfe:
            vy4 r10 = (defpackage.vy4) r10
            if (r10 != 0) goto L106
            r0.Z0()
            return
        L106:
            long r12 = r10.a
            r4.y = r12
        L10a:
            py4 r6 = defpackage.py4.Main
            java.lang.String r9 = "AwaitTouchSlop.touchSlopDetector was not initialized"
            java.lang.String r12 = "AwaitTouchSlop.initialDown was not initialized"
            if (r2 != r6) goto L1d6
            boolean r6 = r10.c()
            if (r6 != 0) goto L1c0
            boolean r6 = defpackage.ej2.p(r10)
            if (r6 == 0) goto L144
            int r3 = r1.size()
            r6 = r5
        L123:
            if (r6 >= r3) goto L135
            java.lang.Object r7 = r1.get(r6)
            r8 = r7
            vy4 r8 = (defpackage.vy4) r8
            boolean r8 = r8.d
            if (r8 == 0) goto L132
            r11 = r7
            goto L135
        L132:
            int r6 = r6 + 1
            goto L123
        L135:
            vy4 r11 = (defpackage.vy4) r11
            if (r11 != 0) goto L13e
            r0.Z0()
            goto L1d6
        L13e:
            long r6 = r11.a
            r4.y = r6
            goto L1d6
        L144:
            nq6 r1 = defpackage.ky0.t
            java.lang.Object r1 = defpackage.hf.K(r0, r1)
            fo7 r1 = (defpackage.fo7) r1
            int r6 = r10.i
            float r1 = defpackage.sn1.g(r1, r6)
            kk r6 = r0.C0
            if (r6 == 0) goto L1ba
            long r13 = defpackage.ej2.R(r10, r3)
            long r13 = r6.e(r1, r13, r3)
            r15 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r15 = r15 & r13
            r17 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r1 == 0) goto L1b7
            boolean r1 = r0.V(r10)
            q61 r6 = defpackage.vr2.l0
            ub7 r6 = defpackage.ii2.t(r0, r6)
            boolean r15 = r6 instanceof defpackage.vr2
            if (r15 == 0) goto L17e
            vr2 r6 = (defpackage.vr2) r6
            goto L17f
        L17e:
            r6 = r11
        L17f:
            if (r6 == 0) goto L183
            ur2 r11 = r6.k0
        L183:
            if (r11 == 0) goto L18d
            boolean r6 = r11.V(r10)
            if (r6 != r3) goto L18d
            r6 = r3
            goto L18e
        L18d:
            r6 = r5
        L18e:
            if (r1 != 0) goto L195
            if (r6 == 0) goto L195
            r4.z = r3
            goto L1d6
        L195:
            r10.a()
            vy4 r1 = r4.x
            r1.getClass()
            r0.i1(r1, r10, r13)
            r0.h1(r13, r10)
            long r13 = r10.a
            dn1 r1 = r0.w0
            if (r1 != 0) goto L1b2
            dn1 r1 = new dn1
            r1.<init>()
            r1.x = r7
            r0.w0 = r1
        L1b2:
            r1.x = r13
            r0.z0 = r1
            goto L1d6
        L1b7:
            r4.z = r3
            goto L1d6
        L1ba:
            java.lang.String r0 = "Touch slop detector not initialized."
            defpackage.i.h(r0)
            return
        L1c0:
            vy4 r1 = r4.x
            if (r1 == 0) goto L1d2
            long r6 = r4.y
            kk r3 = r0.C0
            if (r3 == 0) goto L1ce
            r0.a1(r1, r6, r3)
            goto L1d6
        L1ce:
            defpackage.i.h(r9)
            return
        L1d2:
            defpackage.i.h(r12)
            return
        L1d6:
            py4 r1 = defpackage.py4.Final
            if (r2 != r1) goto L35f
            boolean r1 = r4.z
            if (r1 == 0) goto L35f
            boolean r1 = r10.c()
            if (r1 == 0) goto L1fa
            vy4 r1 = r4.x
            if (r1 == 0) goto L1f6
            long r2 = r4.y
            kk r4 = r0.C0
            if (r4 == 0) goto L1f2
            r0.a1(r1, r2, r4)
            return
        L1f2:
            defpackage.i.h(r9)
            return
        L1f6:
            defpackage.i.h(r12)
            return
        L1fa:
            r4.z = r5
            return
        L1fd:
            boolean r6 = r4 instanceof defpackage.bn1
            if (r6 == 0) goto L26b
            bn1 r4 = (defpackage.bn1) r4
            py4 r6 = defpackage.py4.Final
            if (r2 == r6) goto L209
            goto L35f
        L209:
            java.util.List r1 = r1.a
            int r2 = r1.size()
            r6 = r5
        L210:
            if (r6 >= r2) goto L223
            java.lang.Object r7 = r1.get(r6)
            vy4 r7 = (defpackage.vy4) r7
            boolean r7 = r7.c()
            if (r7 == 0) goto L220
            r3 = r5
            goto L223
        L220:
            int r6 = r6 + 1
            goto L210
        L223:
            int r2 = r1.size()
        L227:
            if (r5 >= r2) goto L267
            java.lang.Object r6 = r1.get(r5)
            vy4 r6 = (defpackage.vy4) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L264
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L23a
            goto L267
        L23a:
            if (r3 == 0) goto L35f
            java.lang.Object r1 = defpackage.gt0.H0(r1)
            vy4 r1 = (defpackage.vy4) r1
            long r1 = r1.c
            vy4 r3 = r4.x
            r3.getClass()
            long r5 = r3.c
            long r1 = defpackage.jk4.e(r1, r5)
            r2 = r1
            vy4 r1 = r4.x
            if (r1 == 0) goto L25e
            r5 = r2
            long r2 = r4.y
            r4 = r5
            r6 = 8
            b1(r0, r1, r2, r4, r6)
            return
        L25e:
            java.lang.String r0 = "AwaitGesturePickup.initialDown was not initialized."
            defpackage.i.h(r0)
            return
        L264:
            int r5 = r5 + 1
            goto L227
        L267:
            r0.Z0()
            return
        L26b:
            boolean r6 = r4 instanceof defpackage.dn1
            if (r6 == 0) goto L356
            dn1 r4 = (defpackage.dn1) r4
            py4 r6 = defpackage.py4.Main
            if (r2 == r6) goto L277
            goto L35f
        L277:
            long r6 = r4.x
            java.util.List r2 = r1.a
            int r8 = r2.size()
            r12 = r5
        L280:
            if (r12 >= r8) goto L295
            java.lang.Object r13 = r2.get(r12)
            r14 = r13
            vy4 r14 = (defpackage.vy4) r14
            long r14 = r14.a
            boolean r14 = defpackage.nj2.o(r14, r6)
            if (r14 == 0) goto L292
            goto L296
        L292:
            int r12 = r12 + 1
            goto L280
        L295:
            r13 = r11
        L296:
            vy4 r13 = (defpackage.vy4) r13
            if (r13 != 0) goto L29c
            goto L35f
        L29c:
            boolean r2 = defpackage.ej2.p(r13)
            en1 r6 = defpackage.en1.a
            if (r2 == 0) goto L32f
            java.util.List r1 = r1.a
            int r2 = r1.size()
            r3 = r5
        L2ab:
            if (r3 >= r2) goto L2bc
            java.lang.Object r7 = r1.get(r3)
            r8 = r7
            vy4 r8 = (defpackage.vy4) r8
            boolean r8 = r8.d
            if (r8 == 0) goto L2b9
            goto L2bd
        L2b9:
            int r3 = r3 + 1
            goto L2ab
        L2bc:
            r7 = r11
        L2bd:
            vy4 r7 = (defpackage.vy4) r7
            if (r7 != 0) goto L32a
            boolean r1 = r13.c()
            if (r1 != 0) goto L31f
            boolean r1 = defpackage.ej2.p(r13)
            if (r1 == 0) goto L31f
            j97 r1 = r0.g1()
            defpackage.mp2.h(r1, r13, r9)
            nq6 r1 = defpackage.ky0.t
            java.lang.Object r1 = defpackage.hf.K(r0, r1)
            fo7 r1 = (defpackage.fo7) r1
            float r1 = r1.e()
            j97 r2 = r0.g1()
            long r3 = defpackage.qo2.k(r1, r1)
            long r1 = r2.c(r3)
            j97 r3 = r0.g1()
            java.lang.Object r3 = r3.B
            bg1 r3 = (defpackage.bg1) r3
            java.lang.Object r4 = r3.B
            rl7 r4 = (defpackage.rl7) r4
            yb1[] r6 = r4.d
            defpackage.fv.B0(r6, r11)
            r4.e = r5
            java.lang.Object r4 = r3.L
            rl7 r4 = (defpackage.rl7) r4
            yb1[] r6 = r4.d
            defpackage.fv.B0(r6, r11)
            r4.e = r5
            r3.A = r9
            ul0 r3 = r0.f1()
            hn1 r4 = new hn1
            long r1 = defpackage.eo1.b(r1)
            r4.<init>(r1, r5)
            r3.c(r4)
            r0.u0 = r5
            goto L326
        L31f:
            ul0 r1 = r0.f1()
            r1.c(r6)
        L326:
            r0.Z0()
            return
        L32a:
            long r0 = r7.a
            r4.x = r0
            return
        L32f:
            boolean r1 = r13.c()
            if (r1 == 0) goto L33d
            ul0 r0 = r0.f1()
            r0.c(r6)
            return
        L33d:
            long r1 = defpackage.ej2.R(r13, r3)
            float r1 = defpackage.jk4.d(r1)
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L34b
            goto L35f
        L34b:
            long r1 = defpackage.ej2.R(r13, r5)
            r0.h1(r1, r13)
            r13.a()
            return
        L356:
            defpackage.i.d()
            return
        L35a:
            java.lang.String r0 = "currentDragState should not be null"
            defpackage.i.h(r0)
        L35f:
            return
    }

    @Override // defpackage.ur2
    public final boolean y(defpackage.s43 r1) {
            r0 = this;
            boolean r1 = defpackage.jx2.k(r1)
            if (r1 == 0) goto Lc
            boolean r0 = r0.o0
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }
}
