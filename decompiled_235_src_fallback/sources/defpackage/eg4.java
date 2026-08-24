package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eg4  reason: default package */
/* loaded from: classes.dex */
public abstract class eg4 extends defpackage.kz3 implements defpackage.x24, defpackage.jk3, defpackage.aq4 {
    public static final defpackage.op5 K0 = null;
    public static final defpackage.jj3 L0 = null;
    public static final float[] M0 = null;
    public static final defpackage.bg4 N0 = null;
    public static final defpackage.q61 O0 = null;
    public defpackage.jj3 A0;
    public defpackage.ke6 B0;
    public boolean C0;
    public boolean D0;
    public defpackage.ut2 E0;
    public defpackage.xj0 F0;
    public defpackage.pf G0;
    public final defpackage.dg4 H0;
    public boolean I0;
    public defpackage.yp4 J0;
    public final defpackage.sm3 k0;
    public boolean l0;
    public boolean m0;
    public defpackage.eg4 n0;
    public defpackage.eg4 o0;
    public boolean p0;
    public boolean q0;
    public defpackage.qn2 r0;
    public defpackage.qh1 s0;
    public defpackage.kk3 t0;
    public float u0;
    public defpackage.f34 v0;
    public defpackage.y94 w0;
    public long x0;
    public float y0;
    public defpackage.ia4 z0;

    static {
            op5 r0 = new op5
            r0.<init>()
            defpackage.eg4.K0 = r0
            jj3 r0 = new jj3
            r0.<init>()
            defpackage.eg4.L0 = r0
            float[] r0 = defpackage.v24.a()
            defpackage.eg4.M0 = r0
            bg4 r0 = new bg4
            r0.<init>()
            defpackage.eg4.N0 = r0
            q61 r0 = new q61
            r0.<init>()
            defpackage.eg4.O0 = r0
            return
    }

    public eg4(defpackage.sm3 r3) {
            r2 = this;
            r2.<init>()
            r2.k0 = r3
            qh1 r0 = r3.u0
            r2.s0 = r0
            kk3 r3 = r3.v0
            r2.t0 = r3
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            r2.u0 = r3
            r0 = 0
            r2.x0 = r0
            jy2 r3 = defpackage.u24.m
            r2.B0 = r3
            dg4 r3 = new dg4
            r0 = 1
            r3.<init>(r2, r0)
            r2.H0 = r3
            return
    }

    public static defpackage.eg4 t1(defpackage.jk3 r1) {
            boolean r0 = r1 instanceof defpackage.nz3
            if (r0 == 0) goto L8
            r0 = r1
            nz3 r0 = (defpackage.nz3) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L13
            mz3 r0 = r0.A
            eg4 r0 = r0.k0
            if (r0 != 0) goto L12
            goto L13
        L12:
            return r0
        L13:
            r1.getClass()
            eg4 r1 = (defpackage.eg4) r1
            return r1
    }

    @Override // defpackage.jk3
    public final long A(long r4) {
            r3 = this;
            z64 r0 = r3.Y0()
            boolean r0 = r0.j0
            if (r0 != 0) goto Ld
            java.lang.String r0 = "LayoutCoordinate operations are only valid when isAttached is true"
            defpackage.p53.c(r0)
        Ld:
            jk3 r0 = defpackage.ej2.w(r3)
            sm3 r1 = r3.k0
            zp4 r1 = defpackage.vm3.a(r1)
            te r1 = (defpackage.te) r1
            r1.z()
            float[] r1 = r1.Z0
            long r4 = defpackage.v24.b(r4, r1)
            r1 = 0
            long r1 = r0.P(r1)
            long r4 = defpackage.jk4.e(r4, r1)
            r1 = 1
            long r3 = r3.R(r0, r4, r1)
            return r3
    }

    @Override // defpackage.kz3
    public final defpackage.jk3 A0() {
            r0 = this;
            return r0
    }

    @Override // defpackage.dx4, defpackage.x24
    public final java.lang.Object B() {
            r10 = this;
            sm3 r0 = r10.k0
            if0 r1 = r0.B0
            r2 = 64
            boolean r1 = r1.g(r2)
            r3 = 0
            if (r1 == 0) goto L6f
            r10.Y0()
            if0 r10 = r0.B0
            java.lang.Object r10 = r10.f
            vy6 r10 = (defpackage.vy6) r10
            r1 = r3
        L17:
            if (r10 == 0) goto L6e
            int r4 = r10.L
            r4 = r4 & r2
            if (r4 == 0) goto L6b
            r4 = r10
            r5 = r3
        L20:
            if (r4 == 0) goto L6b
            boolean r6 = r4 instanceof defpackage.xs4
            if (r6 == 0) goto L2f
            xs4 r4 = (defpackage.xs4) r4
            qh1 r6 = r0.u0
            java.lang.Object r1 = r4.t(r6, r1)
            goto L66
        L2f:
            int r6 = r4.L
            r6 = r6 & r2
            if (r6 == 0) goto L66
            boolean r6 = r4 instanceof defpackage.zg1
            if (r6 == 0) goto L66
            r6 = r4
            zg1 r6 = (defpackage.zg1) r6
            z64 r6 = r6.l0
            r7 = 0
        L3e:
            r8 = 1
            if (r6 == 0) goto L63
            int r9 = r6.L
            r9 = r9 & r2
            if (r9 == 0) goto L60
            int r7 = r7 + 1
            if (r7 != r8) goto L4c
            r4 = r6
            goto L60
        L4c:
            if (r5 != 0) goto L57
            ua4 r5 = new ua4
            r8 = 16
            z64[] r8 = new defpackage.z64[r8]
            r5.<init>(r8)
        L57:
            if (r4 == 0) goto L5d
            r5.b(r4)
            r4 = r3
        L5d:
            r5.b(r6)
        L60:
            z64 r6 = r6.Y
            goto L3e
        L63:
            if (r7 != r8) goto L66
            goto L20
        L66:
            z64 r4 = defpackage.nc1.A(r5)
            goto L20
        L6b:
            z64 r10 = r10.X
            goto L17
        L6e:
            return r1
        L6f:
            return r3
    }

    @Override // defpackage.kz3
    public final boolean C0() {
            r0 = this;
            f34 r0 = r0.v0
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // defpackage.jk3
    public final defpackage.jk3 D() {
            r4 = this;
            z64 r0 = r4.Y0()
            boolean r0 = r0.j0
            sm3 r1 = r4.k0
            if (r0 != 0) goto L4a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "LayoutCoordinate operations are only valid when isAttached is true"
            r0.<init>(r2)
            r2 = r1
        L12:
            if (r2 == 0) goto L43
            java.lang.String r3 = "\n|"
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = " isAttached="
            r0.append(r3)
            boolean r3 = r2.H()
            r0.append(r3)
            java.lang.String r3 = " modifier="
            r0.append(r3)
            a74 r3 = r2.G0
            r0.append(r3)
            java.lang.String r3 = " tail="
            r0.append(r3)
            z64 r3 = r4.Y0()
            r0.append(r3)
            sm3 r2 = r2.v()
            goto L12
        L43:
            java.lang.String r0 = r0.toString()
            defpackage.p53.c(r0)
        L4a:
            r4.h1()
            if0 r4 = r1.B0
            java.lang.Object r4 = r4.e
            eg4 r4 = (defpackage.eg4) r4
            eg4 r4 = r4.o0
            return r4
    }

    @Override // defpackage.kz3
    public final defpackage.sm3 F0() {
            r0 = this;
            sm3 r0 = r0.k0
            return r0
    }

    @Override // defpackage.kz3
    public final defpackage.f34 G0() {
            r0 = this;
            f34 r0 = r0.v0
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "Asking for measurement result of unmeasured layout modifier"
            defpackage.i.m(r0)
            r0 = 0
            return r0
    }

    @Override // defpackage.kz3
    public final defpackage.kz3 H0() {
            r0 = this;
            eg4 r0 = r0.o0
            return r0
    }

    @Override // defpackage.kz3
    public final long I0() {
            r2 = this;
            long r0 = r2.x0
            return r0
    }

    @Override // defpackage.jk3
    public final long J(defpackage.jk3 r2, long r3) {
            r1 = this;
            r0 = 1
            long r1 = r1.R(r2, r3, r0)
            return r1
    }

    @Override // defpackage.kz3
    public final void M0() {
            r4 = this;
            long r0 = r4.x0
            float r2 = r4.y0
            qn2 r3 = r4.r0
            r4.h0(r0, r2, r3)
            return
    }

    @Override // defpackage.jk3
    public final long N(long r3) {
            r2 = this;
            z64 r0 = r2.Y0()
            boolean r0 = r0.j0
            if (r0 != 0) goto Ld
            java.lang.String r0 = "LayoutCoordinate operations are only valid when isAttached is true"
            defpackage.p53.c(r0)
        Ld:
            sm3 r0 = r2.k0
            zp4 r0 = defpackage.vm3.a(r0)
            te r0 = (defpackage.te) r0
            long r3 = r0.D(r3)
            jk3 r0 = defpackage.ej2.w(r2)
            r1 = 1
            long r2 = r2.R(r0, r3, r1)
            return r2
    }

    public final void N0(defpackage.eg4 r6, defpackage.ia4 r7, boolean r8) {
            r5 = this;
            if (r6 != r5) goto L3
            goto L5d
        L3:
            eg4 r0 = r5.o0
            if (r0 == 0) goto La
            r0.N0(r6, r7, r8)
        La:
            long r0 = r5.x0
            r6 = 32
            long r2 = r0 >> r6
            int r2 = (int) r2
            float r3 = r7.a
            float r2 = (float) r2
            float r3 = r3 - r2
            r7.a = r3
            float r3 = r7.c
            float r3 = r3 - r2
            r7.c = r3
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r0 = (int) r0
            float r1 = r7.b
            float r0 = (float) r0
            float r1 = r1 - r0
            r7.b = r1
            float r1 = r7.d
            float r1 = r1 - r0
            r7.d = r1
            yp4 r0 = r5.J0
            if (r0 == 0) goto L5d
            xt2 r0 = (defpackage.xt2) r0
            float[] r1 = r0.a()
            boolean r0 = r0.o0
            r4 = 0
            if (r0 != 0) goto L4b
            if (r1 != 0) goto L48
            r7.a = r4
            r7.b = r4
            r7.c = r4
            r7.d = r4
            goto L4b
        L48:
            defpackage.v24.c(r1, r7)
        L4b:
            boolean r0 = r5.q0
            if (r0 == 0) goto L5d
            if (r8 == 0) goto L5d
            long r0 = r5.L
            long r5 = r0 >> r6
            int r5 = (int) r5
            float r5 = (float) r5
            long r0 = r0 & r2
            int r6 = (int) r0
            float r6 = (float) r6
            r7.a(r4, r4, r5, r6)
        L5d:
            return
    }

    @Override // defpackage.jk3
    public final defpackage.of5 O(defpackage.jk3 r8, boolean r9) {
            r7 = this;
            z64 r0 = r7.Y0()
            boolean r0 = r0.j0
            if (r0 != 0) goto Ld
            java.lang.String r0 = "LayoutCoordinate operations are only valid when isAttached is true"
            defpackage.p53.c(r0)
        Ld:
            boolean r0 = r8.t()
            if (r0 != 0) goto L29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LayoutCoordinates "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r1 = " is not attached!"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            defpackage.p53.c(r0)
        L29:
            eg4 r0 = t1(r8)
            r0.h1()
            eg4 r1 = r7.U0(r0)
            ia4 r2 = r7.z0
            if (r2 != 0) goto L3f
            ia4 r2 = new ia4
            r2.<init>()
            r7.z0 = r2
        L3f:
            r3 = 0
            r2.a = r3
            r2.b = r3
            long r3 = r8.m()
            r5 = 32
            long r3 = r3 >> r5
            int r3 = (int) r3
            float r3 = (float) r3
            r2.c = r3
            long r3 = r8.m()
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            int r8 = (int) r3
            float r8 = (float) r8
            r2.d = r8
        L5d:
            if (r0 == r1) goto L72
            r8 = 0
            r0.p1(r2, r9, r8)
            boolean r8 = r2.b()
            if (r8 == 0) goto L6c
            of5 r7 = defpackage.of5.e
            return r7
        L6c:
            eg4 r0 = r0.o0
            r0.getClass()
            goto L5d
        L72:
            r7.N0(r1, r2, r9)
            of5 r7 = new of5
            float r8 = r2.a
            float r9 = r2.b
            float r0 = r2.c
            float r1 = r2.d
            r7.<init>(r8, r9, r0, r1)
            return r7
    }

    public final long O0(defpackage.eg4 r3, long r4, boolean r6) {
            r2 = this;
            if (r3 != r2) goto L3
            return r4
        L3:
            eg4 r0 = r2.o0
            if (r0 == 0) goto L17
            boolean r1 = defpackage.nb3.k(r3, r0)
            if (r1 == 0) goto Le
            goto L17
        Le:
            long r3 = r0.O0(r3, r4, r6)
            long r2 = r2.V0(r3, r6)
            return r2
        L17:
            long r2 = r2.V0(r4, r6)
            return r2
    }

    @Override // defpackage.jk3
    public final long P(long r5) {
            r4 = this;
            z64 r0 = r4.Y0()
            boolean r0 = r0.j0
            if (r0 != 0) goto Ld
            java.lang.String r0 = "LayoutCoordinate operations are only valid when isAttached is true"
            defpackage.p53.c(r0)
        Ld:
            r4.h1()
        L10:
            if (r4 == 0) goto L5a
            sm3 r0 = r4.k0
            if0 r1 = r0.B0
            java.lang.Object r1 = r1.e
            eg4 r1 = (defpackage.eg4) r1
            if (r4 != r1) goto L3e
            boolean r1 = r0.L
            if (r1 != 0) goto L3e
            zp4 r1 = defpackage.vm3.a(r0)
            te r1 = (defpackage.te) r1
            rf5 r1 = r1.getRectManager()
            long r0 = r1.b(r0)
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            boolean r2 = defpackage.i93.a(r0, r2)
            if (r2 != 0) goto L3e
            long r4 = defpackage.kn2.U(r5, r0)
            return r4
        L3e:
            yp4 r0 = r4.J0
            if (r0 == 0) goto L51
            xt2 r0 = (defpackage.xt2) r0
            float[] r1 = r0.b()
            boolean r0 = r0.o0
            if (r0 == 0) goto L4d
            goto L51
        L4d:
            long r5 = defpackage.v24.b(r5, r1)
        L51:
            long r0 = r4.x0
            long r5 = defpackage.kn2.U(r5, r0)
            eg4 r4 = r4.o0
            goto L10
        L5a:
            return r5
    }

    public final long P0(long r7) {
            r6 = this;
            r0 = 32
            long r1 = r7 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r2 = r6.d0()
            float r2 = (float) r2
            float r1 = r1 - r2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r2
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            int r6 = r6.Z()
            float r6 = (float) r6
            float r7 = r7 - r6
            r6 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r6
            r8 = 0
            float r1 = java.lang.Math.max(r8, r1)
            float r7 = r7 / r6
            float r6 = java.lang.Math.max(r8, r7)
            int r7 = java.lang.Float.floatToRawIntBits(r1)
            long r7 = (long) r7
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r4 = (long) r6
            long r6 = r7 << r0
            long r0 = r4 & r2
            long r6 = r6 | r0
            return r6
    }

    public final float Q0(long r9, long r11) {
            r8 = this;
            int r0 = r8.d0()
            float r0 = (float) r0
            r1 = 32
            long r2 = r11 >> r1
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r2 = 2139095040(0x7f800000, float:Infinity)
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r0 < 0) goto L2a
            int r0 = r8.Z()
            float r0 = (float) r0
            long r5 = r11 & r3
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 < 0) goto L2a
            return r2
        L2a:
            long r11 = r8.P0(r11)
            long r5 = r11 >> r1
            int r0 = (int) r5
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r11 = r11 & r3
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            long r5 = r9 >> r1
            int r12 = (int) r5
            float r12 = java.lang.Float.intBitsToFloat(r12)
            r5 = 0
            int r6 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r6 >= 0) goto L49
            float r12 = -r12
            goto L4f
        L49:
            int r6 = r8.d0()
            float r6 = (float) r6
            float r12 = r12 - r6
        L4f:
            float r12 = java.lang.Math.max(r5, r12)
            long r9 = r9 & r3
            int r9 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r9)
            int r10 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r10 >= 0) goto L5f
            float r8 = -r9
            goto L66
        L5f:
            int r8 = r8.Z()
            float r8 = (float) r8
            float r8 = r9 - r8
        L66:
            float r8 = java.lang.Math.max(r5, r8)
            int r9 = java.lang.Float.floatToRawIntBits(r12)
            long r9 = (long) r9
            int r8 = java.lang.Float.floatToRawIntBits(r8)
            long r6 = (long) r8
            long r8 = r9 << r1
            long r6 = r6 & r3
            long r8 = r8 | r6
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r10 > 0) goto L80
            int r10 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r10 <= 0) goto La1
        L80:
            long r5 = r8 >> r1
            int r10 = (int) r5
            float r12 = java.lang.Float.intBitsToFloat(r10)
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 > 0) goto La1
            long r8 = r8 & r3
            int r8 = (int) r8
            float r9 = java.lang.Float.intBitsToFloat(r8)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 > 0) goto La1
            float r9 = java.lang.Float.intBitsToFloat(r10)
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r9 = r9 * r9
            float r8 = r8 * r8
            float r8 = r8 + r9
            return r8
        La1:
            return r2
    }

    @Override // defpackage.jk3
    public final long R(defpackage.jk3 r4, long r5, boolean r7) {
            r3 = this;
            boolean r0 = r4 instanceof defpackage.nz3
            if (r0 == 0) goto L19
            nz3 r4 = (defpackage.nz3) r4
            mz3 r0 = r4.A
            eg4 r0 = r0.k0
            r0.h1()
            r0 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            long r5 = r5 ^ r0
            long r3 = r4.R(r3, r5, r7)
            long r3 = r3 ^ r0
            return r3
        L19:
            eg4 r4 = t1(r4)
            r4.h1()
            eg4 r0 = r3.U0(r4)
        L24:
            if (r4 == r0) goto L4c
            yp4 r1 = r4.J0
            if (r1 == 0) goto L39
            xt2 r1 = (defpackage.xt2) r1
            float[] r2 = r1.b()
            boolean r1 = r1.o0
            if (r1 == 0) goto L35
            goto L39
        L35:
            long r5 = defpackage.v24.b(r5, r2)
        L39:
            if (r7 != 0) goto L40
            boolean r1 = r4.e0
            if (r1 == 0) goto L40
            goto L46
        L40:
            long r1 = r4.x0
            long r5 = defpackage.kn2.U(r5, r1)
        L46:
            eg4 r4 = r4.o0
            r4.getClass()
            goto L24
        L4c:
            long r3 = r3.O0(r0, r5, r7)
            return r3
    }

    public final void R0(defpackage.xj0 r6, defpackage.ut2 r7) {
            r5 = this;
            yp4 r0 = r5.J0
            if (r0 == 0) goto L2a
            xt2 r0 = (defpackage.xt2) r0
            zj0 r5 = r0.i0
            r0.g()
            ut2 r1 = r0.A
            wt2 r1 = r1.a
            float r1 = r1.M()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L1a
            r1 = 1
            goto L1b
        L1a:
            r1 = 0
        L1b:
            r0.p0 = r1
            bt r1 = r5.B
            r1.V(r6)
            r1.L = r7
            ut2 r6 = r0.A
            defpackage.oi2.u(r5, r6)
            return
        L2a:
            long r0 = r5.x0
            r2 = 32
            long r2 = r0 >> r2
            int r2 = (int) r2
            float r2 = (float) r2
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r3
            int r0 = (int) r0
            float r0 = (float) r0
            r6.o(r2, r0)
            r5.S0(r6, r7)
            float r5 = -r2
            float r7 = -r0
            r6.o(r5, r7)
            return
    }

    public final void S0(defpackage.xj0 r12, defpackage.ut2 r13) {
            r11 = this;
            r0 = 4
            z64 r1 = r11.Z0(r0)
            if (r1 != 0) goto Lb
            r11.n1(r12, r13)
            return
        Lb:
            sm3 r2 = r11.k0
            r2.getClass()
            zp4 r2 = defpackage.vm3.a(r2)
            te r2 = (defpackage.te) r2
            um3 r3 = r2.getSharedDrawScope()
            long r4 = r11.L
            long r5 = defpackage.qo2.S(r4)
            r3.getClass()
            r2 = 0
            r10 = r2
        L25:
            if (r1 == 0) goto L77
            boolean r4 = r1 instanceof defpackage.mo1
            if (r4 == 0) goto L35
            r8 = r1
            mo1 r8 = (defpackage.mo1) r8
            r7 = r11
            r4 = r12
            r9 = r13
            r3.c(r4, r5, r7, r8, r9)
            goto L72
        L35:
            r7 = r11
            r4 = r12
            r9 = r13
            int r11 = r1.L
            r11 = r11 & r0
            if (r11 == 0) goto L72
            boolean r11 = r1 instanceof defpackage.zg1
            if (r11 == 0) goto L72
            r11 = r1
            zg1 r11 = (defpackage.zg1) r11
            z64 r11 = r11.l0
            r12 = 0
        L47:
            r13 = 1
            if (r11 == 0) goto L6c
            int r8 = r11.L
            r8 = r8 & r0
            if (r8 == 0) goto L69
            int r12 = r12 + 1
            if (r12 != r13) goto L55
            r1 = r11
            goto L69
        L55:
            if (r10 != 0) goto L60
            ua4 r10 = new ua4
            r13 = 16
            z64[] r13 = new defpackage.z64[r13]
            r10.<init>(r13)
        L60:
            if (r1 == 0) goto L66
            r10.b(r1)
            r1 = r2
        L66:
            r10.b(r11)
        L69:
            z64 r11 = r11.Y
            goto L47
        L6c:
            if (r12 != r13) goto L72
        L6e:
            r12 = r4
            r11 = r7
            r13 = r9
            goto L25
        L72:
            z64 r1 = defpackage.nc1.A(r10)
            goto L6e
        L77:
            return
    }

    public abstract void T0();

    public final defpackage.eg4 U0(defpackage.eg4 r6) {
            r5 = this;
            sm3 r0 = r6.k0
            sm3 r1 = r5.k0
            if (r0 != r1) goto L2b
            z64 r0 = r6.Y0()
            z64 r1 = r5.Y0()
            z64 r2 = r1.A
            boolean r2 = r2.j0
            if (r2 != 0) goto L19
            java.lang.String r2 = "visitLocalAncestors called on an unattached node"
            defpackage.p53.c(r2)
        L19:
            z64 r1 = r1.A
            z64 r1 = r1.X
        L1d:
            if (r1 == 0) goto L60
            int r2 = r1.L
            r2 = r2 & 2
            if (r2 == 0) goto L28
            if (r1 != r0) goto L28
            goto L65
        L28:
            z64 r1 = r1.X
            goto L1d
        L2b:
            int r2 = r0.l0
            int r3 = r1.l0
            if (r2 <= r3) goto L39
            sm3 r0 = r0.v()
            r0.getClass()
            goto L2b
        L39:
            r2 = r1
        L3a:
            int r3 = r2.l0
            int r4 = r0.l0
            if (r3 <= r4) goto L48
            sm3 r2 = r2.v()
            r2.getClass()
            goto L3a
        L48:
            if (r0 == r2) goto L5e
            sm3 r0 = r0.v()
            sm3 r2 = r2.v()
            if (r0 == 0) goto L57
            if (r2 == 0) goto L57
            goto L48
        L57:
            java.lang.String r5 = "layouts are not part of the same hierarchy"
            defpackage.i.h(r5)
            r5 = 0
            return r5
        L5e:
            if (r2 != r1) goto L61
        L60:
            return r5
        L61:
            sm3 r5 = r6.k0
            if (r0 != r5) goto L66
        L65:
            return r6
        L66:
            if0 r5 = r0.B0
            java.lang.Object r5 = r5.d
            y53 r5 = (defpackage.y53) r5
            return r5
    }

    public final long V0(long r6, boolean r8) {
            r5 = this;
            if (r8 != 0) goto L7
            boolean r8 = r5.e0
            if (r8 == 0) goto L7
            goto L33
        L7:
            long r0 = r5.x0
            r8 = 32
            long r2 = r6 >> r8
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r3 = r0 >> r8
            int r3 = (int) r3
            float r3 = (float) r3
            float r2 = r2 - r3
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r3
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            long r0 = r0 & r3
            int r7 = (int) r0
            float r7 = (float) r7
            float r6 = r6 - r7
            int r7 = java.lang.Float.floatToRawIntBits(r2)
            long r0 = (long) r7
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r6 = (long) r6
            long r0 = r0 << r8
            long r6 = r6 & r3
            long r6 = r6 | r0
        L33:
            yp4 r5 = r5.J0
            if (r5 == 0) goto L4f
            xt2 r5 = (defpackage.xt2) r5
            float[] r8 = r5.a()
            if (r8 != 0) goto L45
            r5 = 9187343241974906880(0x7f8000007f800000, double:1.404448428688076E306)
            return r5
        L45:
            boolean r5 = r5.o0
            if (r5 == 0) goto L4a
            goto L4f
        L4a:
            long r5 = defpackage.v24.b(r6, r8)
            return r5
        L4f:
            return r6
    }

    public abstract defpackage.mz3 W0();

    public final long X0() {
            r3 = this;
            qh1 r0 = r3.s0
            sm3 r3 = r3.k0
            fo7 r3 = r3.w0
            long r1 = r3.d()
            long r0 = r0.v0(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final float Y() {
            r0 = this;
            sm3 r0 = r0.k0
            qh1 r0 = r0.u0
            float r0 = r0.Y()
            return r0
    }

    public abstract defpackage.z64 Y0();

    public final defpackage.z64 Z0(int r3) {
            r2 = this;
            boolean r0 = defpackage.fg4.g(r3)
            z64 r1 = r2.Y0()
            if (r0 == 0) goto Lb
            goto L10
        Lb:
            z64 r1 = r1.X
            if (r1 != 0) goto L10
            goto L26
        L10:
            z64 r2 = r2.a1(r0)
        L14:
            if (r2 == 0) goto L26
            int r0 = r2.R
            r0 = r0 & r3
            if (r0 == 0) goto L26
            int r0 = r2.L
            r0 = r0 & r3
            if (r0 == 0) goto L21
            return r2
        L21:
            if (r2 == r1) goto L26
            z64 r2 = r2.Y
            goto L14
        L26:
            r2 = 0
            return r2
    }

    @Override // defpackage.qh1
    public final float a() {
            r0 = this;
            sm3 r0 = r0.k0
            qh1 r0 = r0.u0
            float r0 = r0.a()
            return r0
    }

    public final defpackage.z64 a1(boolean r3) {
            r2 = this;
            sm3 r0 = r2.k0
            if0 r0 = r0.B0
            java.lang.Object r1 = r0.e
            eg4 r1 = (defpackage.eg4) r1
            if (r1 != r2) goto Lf
            java.lang.Object r2 = r0.g
            z64 r2 = (defpackage.z64) r2
            return r2
        Lf:
            eg4 r2 = r2.o0
            if (r3 == 0) goto L1e
            if (r2 == 0) goto L25
            z64 r2 = r2.Y0()
            if (r2 == 0) goto L25
            z64 r2 = r2.Y
            return r2
        L1e:
            if (r2 == 0) goto L25
            z64 r2 = r2.Y0()
            return r2
        L25:
            r2 = 0
            return r2
    }

    public final void b1(defpackage.z64 r8, defpackage.cg4 r9, long r10, defpackage.zx2 r12, int r13, boolean r14) {
            r7 = this;
            if (r8 != 0) goto Lc
            r0 = r7
            r1 = r9
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.e1(r1, r2, r4, r5, r6)
            return
        Lc:
            boolean r0 = r9.d(r8)
            if (r0 != 0) goto L1e
            int r0 = r9.c()
            z64 r8 = defpackage.ln2.g(r8, r0)
            r7.b1(r8, r9, r10, r12, r13, r14)
            return
        L1e:
            int r0 = r12.L
            ca4 r1 = r12.A
            int r2 = r0 + 1
            int r3 = r1.b
            r12.b(r2, r3)
            int r2 = r12.L
            int r2 = r2 + 1
            r12.L = r2
            r1.a(r8)
            t94 r1 = r12.B
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 0
            long r2 = defpackage.yh2.a(r2, r14, r3)
            r1.a(r2)
            int r1 = r9.c()
            z64 r8 = defpackage.ln2.g(r8, r1)
            r7.b1(r8, r9, r10, r12, r13, r14)
            r12.L = r0
            return
    }

    public final void c1(defpackage.z64 r12, defpackage.cg4 r13, long r14, defpackage.zx2 r16, int r17, boolean r18, float r19) {
            r11 = this;
            if (r12 != 0) goto Lf
            r0 = r11
            r1 = r13
            r2 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            r0.e1(r1, r2, r4, r5, r6)
            return
        Lf:
            boolean r0 = r13.d(r12)
            if (r0 != 0) goto L2c
            int r0 = r13.c()
            z64 r1 = defpackage.ln2.g(r12, r0)
            r0 = r11
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r0.c1(r1, r2, r3, r5, r6, r7, r8)
            return
        L2c:
            r5 = r16
            int r10 = r5.L
            ca4 r0 = r5.A
            int r1 = r10 + 1
            int r2 = r0.b
            r5.b(r1, r2)
            int r1 = r5.L
            int r1 = r1 + 1
            r5.L = r1
            r0.a(r12)
            t94 r0 = r5.B
            r1 = 0
            r7 = r18
            r8 = r19
            long r1 = defpackage.yh2.a(r8, r7, r1)
            r0.a(r1)
            int r0 = r13.c()
            z64 r1 = defpackage.ln2.g(r12, r0)
            r9 = 1
            r0 = r11
            r2 = r13
            r3 = r14
            r6 = r17
            r0.m1(r1, r2, r3, r5, r6, r7, r8, r9)
            r5.L = r10
            return
    }

    @Override // defpackage.jk3
    public final long d(long r1) {
            r0 = this;
            long r1 = r0.P(r1)
            sm3 r0 = r0.k0
            zp4 r0 = defpackage.vm3.a(r0)
            te r0 = (defpackage.te) r0
            r0.z()
            float[] r0 = r0.Y0
            long r0 = defpackage.v24.b(r1, r0)
            return r0
    }

    public final void d1(defpackage.cg4 r15, long r16, defpackage.zx2 r18, int r19, boolean r20) {
            r14 = this;
            r3 = r16
            r5 = r18
            r6 = r19
            int r0 = r15.c()
            z64 r1 = r14.Z0(r0)
            boolean r0 = r14.z1(r3)
            r8 = 0
            r9 = 2139095040(0x7f800000, float:Infinity)
            r10 = 2147483647(0x7fffffff, float:NaN)
            r11 = 1
            if (r0 != 0) goto L4c
            if (r6 != r11) goto L4b
            long r12 = r14.X0()
            float r0 = r14.Q0(r3, r12)
            int r2 = java.lang.Float.floatToRawIntBits(r0)
            r2 = r2 & r10
            if (r2 >= r9) goto L4b
            int r2 = r5.L
            ca4 r7 = r5.A
            int r7 = r7.b
            int r7 = r7 - r11
            if (r2 != r7) goto L36
            goto L44
        L36:
            long r7 = defpackage.yh2.a(r0, r8, r8)
            long r9 = r5.a()
            int r2 = defpackage.vy7.U(r9, r7)
            if (r2 <= 0) goto L4b
        L44:
            r7 = 0
            r2 = r15
            r8 = r0
            r0 = r14
            r0.c1(r1, r2, r3, r5, r6, r7, r8)
        L4b:
            return
        L4c:
            if (r1 != 0) goto L52
            r14.e1(r15, r16, r18, r19, r20)
            return
        L52:
            r0 = 32
            long r2 = r16 >> r0
            int r0 = (int) r2
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r16 & r2
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r3 = 0
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 < 0) goto L90
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L90
            int r3 = r14.d0()
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L90
            int r0 = r14.Z()
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L90
            r0 = r14
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r0.b1(r1, r2, r3, r5, r6, r7)
            return
        L90:
            r3 = r16
            r5 = r18
            r6 = r19
            if (r6 != r11) goto La1
            long r12 = r14.X0()
            float r2 = r14.Q0(r3, r12)
            goto La3
        La1:
            r2 = 2139095040(0x7f800000, float:Infinity)
        La3:
            int r7 = java.lang.Float.floatToRawIntBits(r2)
            r7 = r7 & r10
            if (r7 >= r9) goto Lcb
            int r7 = r5.L
            ca4 r9 = r5.A
            int r9 = r9.b
            int r9 = r9 - r11
            if (r7 != r9) goto Lb6
            r7 = r20
            goto Lc6
        Lb6:
            r7 = r20
            long r9 = defpackage.yh2.a(r2, r7, r8)
            long r12 = r5.a()
            int r9 = defpackage.vy7.U(r12, r9)
            if (r9 <= 0) goto Lcd
        Lc6:
            r9 = r11
        Lc7:
            r0 = r14
            r8 = r2
            r2 = r15
            goto Lcf
        Lcb:
            r7 = r20
        Lcd:
            r9 = r8
            goto Lc7
        Lcf:
            r0.m1(r1, r2, r3, r5, r6, r7, r8, r9)
            return
    }

    public void e1(defpackage.cg4 r2, long r3, defpackage.zx2 r5, int r6, boolean r7) {
            r1 = this;
            eg4 r1 = r1.n0
            if (r1 == 0) goto Lc
            r0 = 1
            long r3 = r1.V0(r3, r0)
            r1.d1(r2, r3, r5, r6, r7)
        Lc:
            return
    }

    public final void f1() {
            r1 = this;
            yp4 r0 = r1.J0
            if (r0 == 0) goto La
            xt2 r0 = (defpackage.xt2) r0
            r0.c()
            return
        La:
            eg4 r1 = r1.o0
            if (r1 == 0) goto L11
            r1.f1()
        L11:
            return
    }

    public final boolean g1() {
            r2 = this;
            yp4 r0 = r2.J0
            if (r0 == 0) goto Ld
            float r0 = r2.u0
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Ld
            r2 = 1
            return r2
        Ld:
            eg4 r2 = r2.o0
            if (r2 == 0) goto L16
            boolean r2 = r2.g1()
            return r2
        L16:
            r2 = 0
            return r2
    }

    @Override // defpackage.eb3
    public final defpackage.kk3 getLayoutDirection() {
            r0 = this;
            sm3 r0 = r0.k0
            kk3 r0 = r0.v0
            return r0
    }

    public final void h1() {
            r0 = this;
            sm3 r0 = r0.k0
            wm3 r0 = r0.C0
            r0.b()
            return
    }

    public final void i1() {
            r13 = this;
            r0 = 128(0x80, float:1.8E-43)
            boolean r1 = defpackage.fg4.g(r0)
            z64 r2 = r13.a1(r1)
            if (r2 == 0) goto La1
            z64 r2 = r2.A
            int r2 = r2.R
            r2 = r2 & r0
            if (r2 == 0) goto La1
            vl6 r2 = defpackage.ln2.t()
            r3 = 0
            if (r2 == 0) goto L1f
            qn2 r4 = r2.e()
            goto L20
        L1f:
            r4 = r3
        L20:
            vl6 r5 = defpackage.ln2.N(r2)
            if (r1 == 0) goto L2e
            z64 r6 = r13.Y0()     // Catch: java.lang.Throwable -> L2b
            goto L38
        L2b:
            r13 = move-exception
            goto L9d
        L2e:
            z64 r6 = r13.Y0()     // Catch: java.lang.Throwable -> L2b
            z64 r6 = r6.X     // Catch: java.lang.Throwable -> L2b
            if (r6 != 0) goto L38
            goto L99
        L38:
            z64 r1 = r13.a1(r1)     // Catch: java.lang.Throwable -> L2b
        L3c:
            if (r1 == 0) goto L99
            int r7 = r1.R     // Catch: java.lang.Throwable -> L2b
            r7 = r7 & r0
            if (r7 == 0) goto L99
            int r7 = r1.L     // Catch: java.lang.Throwable -> L2b
            r7 = r7 & r0
            if (r7 == 0) goto L94
            r7 = r1
            r8 = r3
        L4a:
            if (r7 == 0) goto L94
            boolean r9 = r7 instanceof defpackage.j34     // Catch: java.lang.Throwable -> L2b
            if (r9 == 0) goto L58
            j34 r7 = (defpackage.j34) r7     // Catch: java.lang.Throwable -> L2b
            long r9 = r13.L     // Catch: java.lang.Throwable -> L2b
            r7.b(r9)     // Catch: java.lang.Throwable -> L2b
            goto L8f
        L58:
            int r9 = r7.L     // Catch: java.lang.Throwable -> L2b
            r9 = r9 & r0
            if (r9 == 0) goto L8f
            boolean r9 = r7 instanceof defpackage.zg1     // Catch: java.lang.Throwable -> L2b
            if (r9 == 0) goto L8f
            r9 = r7
            zg1 r9 = (defpackage.zg1) r9     // Catch: java.lang.Throwable -> L2b
            z64 r9 = r9.l0     // Catch: java.lang.Throwable -> L2b
            r10 = 0
        L67:
            r11 = 1
            if (r9 == 0) goto L8c
            int r12 = r9.L     // Catch: java.lang.Throwable -> L2b
            r12 = r12 & r0
            if (r12 == 0) goto L89
            int r10 = r10 + 1
            if (r10 != r11) goto L75
            r7 = r9
            goto L89
        L75:
            if (r8 != 0) goto L80
            ua4 r8 = new ua4     // Catch: java.lang.Throwable -> L2b
            r11 = 16
            z64[] r11 = new defpackage.z64[r11]     // Catch: java.lang.Throwable -> L2b
            r8.<init>(r11)     // Catch: java.lang.Throwable -> L2b
        L80:
            if (r7 == 0) goto L86
            r8.b(r7)     // Catch: java.lang.Throwable -> L2b
            r7 = r3
        L86:
            r8.b(r9)     // Catch: java.lang.Throwable -> L2b
        L89:
            z64 r9 = r9.Y     // Catch: java.lang.Throwable -> L2b
            goto L67
        L8c:
            if (r10 != r11) goto L8f
            goto L4a
        L8f:
            z64 r7 = defpackage.nc1.A(r8)     // Catch: java.lang.Throwable -> L2b
            goto L4a
        L94:
            if (r1 == r6) goto L99
            z64 r1 = r1.Y     // Catch: java.lang.Throwable -> L2b
            goto L3c
        L99:
            defpackage.ln2.V(r2, r5, r4)
            return
        L9d:
            defpackage.ln2.V(r2, r5, r4)
            throw r13
        La1:
            return
    }

    public final void j1() {
            r10 = this;
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r1 = defpackage.fg4.g(r0)
            z64 r2 = r10.Y0()
            if (r1 == 0) goto Ld
            goto L13
        Ld:
            z64 r2 = r2.X
            if (r2 != 0) goto L13
            goto L73
        L13:
            z64 r1 = r10.a1(r1)
        L17:
            if (r1 == 0) goto L73
            int r3 = r1.R
            r3 = r3 & r0
            if (r3 == 0) goto L73
            int r3 = r1.L
            r3 = r3 & r0
            if (r3 == 0) goto L6e
            r3 = 0
            r4 = r1
            r5 = r3
        L26:
            if (r4 == 0) goto L6e
            boolean r6 = r4 instanceof defpackage.kj3
            if (r6 == 0) goto L32
            kj3 r4 = (defpackage.kj3) r4
            r4.m(r10)
            goto L69
        L32:
            int r6 = r4.L
            r6 = r6 & r0
            if (r6 == 0) goto L69
            boolean r6 = r4 instanceof defpackage.zg1
            if (r6 == 0) goto L69
            r6 = r4
            zg1 r6 = (defpackage.zg1) r6
            z64 r6 = r6.l0
            r7 = 0
        L41:
            r8 = 1
            if (r6 == 0) goto L66
            int r9 = r6.L
            r9 = r9 & r0
            if (r9 == 0) goto L63
            int r7 = r7 + 1
            if (r7 != r8) goto L4f
            r4 = r6
            goto L63
        L4f:
            if (r5 != 0) goto L5a
            ua4 r5 = new ua4
            r8 = 16
            z64[] r8 = new defpackage.z64[r8]
            r5.<init>(r8)
        L5a:
            if (r4 == 0) goto L60
            r5.b(r4)
            r4 = r3
        L60:
            r5.b(r6)
        L63:
            z64 r6 = r6.Y
            goto L41
        L66:
            if (r7 != r8) goto L69
            goto L26
        L69:
            z64 r4 = defpackage.nc1.A(r5)
            goto L26
        L6e:
            if (r1 == r2) goto L73
            z64 r1 = r1.Y
            goto L17
        L73:
            return
    }

    @Override // defpackage.jk3
    public final void k(float[] r7) {
            r6 = this;
            sm3 r0 = r6.k0
            zp4 r0 = defpackage.vm3.a(r0)
            jk3 r1 = defpackage.ej2.w(r6)
            eg4 r1 = t1(r1)
            r6.w1(r1, r7)
            boolean r6 = r0 instanceof defpackage.te
            if (r6 == 0) goto L1b
            te r0 = (defpackage.te) r0
            r0.q(r7)
            return
        L1b:
            r2 = 0
            long r0 = r1.w(r2)
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r2 = r2 & r0
            r4 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L47
            r6 = 32
            long r2 = r0 >> r6
            int r6 = (int) r2
            float r6 = java.lang.Float.intBitsToFloat(r6)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            defpackage.v24.f(r7, r6, r0)
        L47:
            return
    }

    public final void k1() {
            r4 = this;
            r0 = 1
            r4.p0 = r0
            dg4 r0 = r4.H0
            r0.c()
            r4.q1()
            long r0 = r4.x0
            r2 = 0
            boolean r0 = defpackage.i93.a(r0, r2)
            if (r0 != 0) goto L1a
            sm3 r0 = r4.k0
            r0.N(r4)
        L1a:
            return
    }

    @Override // defpackage.jk3
    public final void l(defpackage.jk3 r2, float[] r3) {
            r1 = this;
            eg4 r2 = t1(r2)
            r2.h1()
            eg4 r0 = r1.U0(r2)
            defpackage.v24.d(r3)
            r2.w1(r0, r3)
            r1.v1(r0, r3)
            return
    }

    public final void l1() {
            r9 = this;
            r0 = 1048576(0x100000, float:1.469368E-39)
            boolean r1 = defpackage.fg4.g(r0)
            z64 r2 = r9.a1(r1)
            if (r2 == 0) goto L75
            z64 r2 = r2.A
            int r2 = r2.R
            r2 = r2 & r0
            if (r2 == 0) goto L75
            z64 r2 = r9.Y0()
            if (r1 == 0) goto L1a
            goto L1f
        L1a:
            z64 r2 = r2.X
            if (r2 != 0) goto L1f
            goto L75
        L1f:
            z64 r9 = r9.a1(r1)
        L23:
            if (r9 == 0) goto L75
            int r1 = r9.R
            r1 = r1 & r0
            if (r1 == 0) goto L75
            int r1 = r9.L
            r1 = r1 & r0
            if (r1 == 0) goto L70
            r1 = 0
            r3 = r9
            r4 = r1
        L32:
            if (r3 == 0) goto L70
            int r5 = r3.L
            r5 = r5 & r0
            if (r5 == 0) goto L6b
            boolean r5 = r3 instanceof defpackage.zg1
            if (r5 == 0) goto L6b
            r5 = r3
            zg1 r5 = (defpackage.zg1) r5
            z64 r5 = r5.l0
            r6 = 0
        L43:
            r7 = 1
            if (r5 == 0) goto L68
            int r8 = r5.L
            r8 = r8 & r0
            if (r8 == 0) goto L65
            int r6 = r6 + 1
            if (r6 != r7) goto L51
            r3 = r5
            goto L65
        L51:
            if (r4 != 0) goto L5c
            ua4 r4 = new ua4
            r7 = 16
            z64[] r7 = new defpackage.z64[r7]
            r4.<init>(r7)
        L5c:
            if (r3 == 0) goto L62
            r4.b(r3)
            r3 = r1
        L62:
            r4.b(r5)
        L65:
            z64 r5 = r5.Y
            goto L43
        L68:
            if (r6 != r7) goto L6b
            goto L32
        L6b:
            z64 r3 = defpackage.nc1.A(r4)
            goto L32
        L70:
            if (r9 == r2) goto L75
            z64 r9 = r9.Y
            goto L23
        L75:
            return
    }

    @Override // defpackage.jk3
    public final long m() {
            r2 = this;
            long r0 = r2.L
            return r0
    }

    public final void m1(defpackage.z64 r19, defpackage.cg4 r20, long r21, defpackage.zx2 r23, int r24, boolean r25, float r26, boolean r27) {
            r18 = this;
            r0 = r19
            if (r0 != 0) goto L14
            r1 = r18
            r2 = r20
            r3 = r21
            r5 = r23
            r6 = r24
            r7 = r25
            r1.e1(r2, r3, r5, r6, r7)
            return
        L14:
            r2 = r20
            boolean r1 = r2.d(r0)
            if (r1 != 0) goto L36
            int r1 = r2.c()
            z64 r1 = defpackage.ln2.g(r0, r1)
            r0 = r18
            r3 = r21
            r5 = r23
            r6 = r24
            r7 = r25
            r8 = r26
            r9 = r27
            r0.m1(r1, r2, r3, r5, r6, r7, r8, r9)
            return
        L36:
            r5 = r23
            r6 = r24
            r7 = r25
            r1 = 3
            if (r6 != r1) goto L40
            goto L43
        L40:
            r2 = 4
            if (r6 != r2) goto L1d7
        L43:
            r2 = 0
            r3 = r0
            r4 = r2
        L46:
            if (r3 == 0) goto L1d7
            boolean r8 = r3 instanceof defpackage.yy4
            r9 = 0
            r10 = 1
            if (r8 == 0) goto L196
            yy4 r3 = (defpackage.yy4) r3
            long r2 = r3.o()
            r4 = 32
            long r11 = r21 >> r4
            int r4 = (int) r11
            float r8 = java.lang.Float.intBitsToFloat(r4)
            r11 = r18
            sm3 r12 = r11.k0
            kk3 r13 = r12.v0
            int r14 = defpackage.s87.b
            r14 = -9223372036854775808
            long r14 = r14 & r2
            r16 = 0
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            r15 = 2
            if (r14 == 0) goto L79
            kk3 r1 = defpackage.kk3.Ltr
            if (r13 != r1) goto L74
            goto L79
        L74:
            int r1 = defpackage.x31.p(r15, r2)
            goto L7d
        L79:
            int r1 = defpackage.x31.p(r9, r2)
        L7d:
            int r1 = -r1
            float r1 = (float) r1
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 < 0) goto L1d7
            float r1 = java.lang.Float.intBitsToFloat(r4)
            int r4 = r11.d0()
            kk3 r8 = r12.v0
            if (r14 == 0) goto L99
            kk3 r12 = defpackage.kk3.Ltr
            if (r8 != r12) goto L94
            goto L99
        L94:
            int r8 = defpackage.x31.p(r9, r2)
            goto L9d
        L99:
            int r8 = defpackage.x31.p(r15, r2)
        L9d:
            int r4 = r4 + r8
            float r4 = (float) r4
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L1d7
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r21 & r8
            int r1 = (int) r8
            float r4 = java.lang.Float.intBitsToFloat(r1)
            int r8 = defpackage.s87.b
            int r8 = defpackage.x31.p(r10, r2)
            int r8 = -r8
            float r8 = (float) r8
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 < 0) goto L1d7
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r4 = r11.Z()
            r8 = 3
            int r2 = defpackage.x31.p(r8, r2)
            int r2 = r2 + r4
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L1d7
            t94 r1 = r5.B
            ca4 r2 = r5.A
            int r12 = r5.L
            int r3 = r2.b
            int r4 = r3 + (-1)
            r13 = 0
            if (r12 != r4) goto L106
            int r4 = r12 + 1
            r5.b(r4, r3)
            int r3 = r5.L
            int r3 = r3 + r10
            r5.L = r3
            r2.a(r0)
            long r2 = defpackage.yh2.a(r13, r7, r10)
            r1.a(r2)
            int r1 = r20.c()
            z64 r1 = defpackage.ln2.g(r0, r1)
            r2 = r20
            r3 = r21
            r8 = r26
            r9 = r27
            r0 = r11
            r0.m1(r1, r2, r3, r5, r6, r7, r8, r9)
            r5.L = r12
            return
        L106:
            long r3 = r5.a()
            int r11 = r5.L
            boolean r6 = defpackage.vy7.n0(r3)
            if (r6 == 0) goto L15c
            int r3 = r2.b
            int r12 = r3 + (-1)
            r5.L = r12
            int r4 = r2.b
            r5.b(r3, r4)
            int r3 = r5.L
            int r3 = r3 + r10
            r5.L = r3
            r2.a(r0)
            long r2 = defpackage.yh2.a(r13, r7, r10)
            r1.a(r2)
            int r1 = r20.c()
            z64 r1 = defpackage.ln2.g(r0, r1)
            r0 = r18
            r2 = r20
            r3 = r21
            r6 = r24
            r8 = r26
            r9 = r27
            r0.m1(r1, r2, r3, r5, r6, r7, r8, r9)
            r5.L = r12
            long r0 = r5.a()
            float r0 = defpackage.vy7.m0(r0)
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 >= 0) goto L159
            int r0 = r11 + 1
            int r1 = r5.L
            int r1 = r1 + r10
            r5.b(r0, r1)
        L159:
            r5.L = r11
            return
        L15c:
            float r3 = defpackage.vy7.m0(r3)
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 <= 0) goto L195
            int r11 = r5.L
            int r3 = r11 + 1
            int r4 = r2.b
            r5.b(r3, r4)
            int r3 = r5.L
            int r3 = r3 + r10
            r5.L = r3
            r2.a(r0)
            long r2 = defpackage.yh2.a(r13, r7, r10)
            r1.a(r2)
            int r1 = r20.c()
            z64 r1 = defpackage.ln2.g(r0, r1)
            r0 = r18
            r2 = r20
            r3 = r21
            r6 = r24
            r8 = r26
            r9 = r27
            r0.m1(r1, r2, r3, r5, r6, r7, r8, r9)
            r5.L = r11
        L195:
            return
        L196:
            r8 = r1
            int r1 = r3.L
            r6 = 16
            r1 = r1 & r6
            if (r1 == 0) goto L1d2
            boolean r1 = r3 instanceof defpackage.zg1
            if (r1 == 0) goto L1d2
            r1 = r3
            zg1 r1 = (defpackage.zg1) r1
            z64 r1 = r1.l0
        L1a7:
            if (r1 == 0) goto L1c9
            int r7 = r1.L
            r7 = r7 & r6
            if (r7 == 0) goto L1c6
            int r9 = r9 + 1
            if (r9 != r10) goto L1b4
            r3 = r1
            goto L1c6
        L1b4:
            if (r4 != 0) goto L1bd
            ua4 r4 = new ua4
            z64[] r7 = new defpackage.z64[r6]
            r4.<init>(r7)
        L1bd:
            if (r3 == 0) goto L1c3
            r4.b(r3)
            r3 = r2
        L1c3:
            r4.b(r1)
        L1c6:
            z64 r1 = r1.Y
            goto L1a7
        L1c9:
            if (r9 != r10) goto L1d2
        L1cb:
            r6 = r24
            r7 = r25
            r1 = r8
            goto L46
        L1d2:
            z64 r3 = defpackage.nc1.A(r4)
            goto L1cb
        L1d7:
            if (r27 == 0) goto L1dd
            r18.c1(r19, r20, r21, r23, r24, r25, r26)
            return
        L1dd:
            r18.s1(r19, r20, r21, r23, r24, r25, r26)
            return
    }

    public abstract void n1(defpackage.xj0 r1, defpackage.ut2 r2);

    public final void o1(long r3, float r5, defpackage.qn2 r6) {
            r2 = this;
            r0 = 0
            r2.x1(r6, r0)
            long r0 = r2.x0
            boolean r6 = defpackage.i93.a(r0, r3)
            sm3 r0 = r2.k0
            if (r6 != 0) goto L3b
            zp4 r6 = defpackage.vm3.a(r0)
            r1 = -1065353216(0xffffffffc0800000, float:-4.0)
            te r6 = (defpackage.te) r6
            r6.J(r1)
            r2.x0 = r3
            yp4 r6 = r2.J0
            if (r6 == 0) goto L25
            xt2 r6 = (defpackage.xt2) r6
            r6.d(r3)
            goto L2c
        L25:
            eg4 r3 = r2.o0
            if (r3 == 0) goto L2c
            r3.f1()
        L2c:
            r0.N(r2)
            defpackage.kz3.K0(r2)
            zp4 r3 = r0.k0
            if (r3 == 0) goto L3b
            te r3 = (defpackage.te) r3
            r3.v(r0)
        L3b:
            r2.y0 = r5
            if0 r3 = r0.B0
            java.lang.Object r3 = r3.e
            eg4 r3 = (defpackage.eg4) r3
            if (r2 != r3) goto L52
            zp4 r3 = defpackage.vm3.a(r0)
            te r3 = (defpackage.te) r3
            rf5 r3 = r3.getRectManager()
            r3.f(r0)
        L52:
            boolean r3 = r2.g0
            if (r3 != 0) goto L5d
            f34 r3 = r2.G0()
            r2.x0(r3)
        L5d:
            return
    }

    public final void p1(defpackage.ia4 r13, boolean r14, boolean r15) {
            r12 = this;
            yp4 r0 = r12.J0
            r1 = 32
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r0 == 0) goto Lf4
            boolean r4 = r12.q0
            r5 = 0
            if (r4 == 0) goto Ldc
            if (r15 == 0) goto Lc7
            long r14 = r12.X0()
            float r4 = r13.a
            float r6 = r13.b
            float r7 = r13.c
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 < 0) goto L82
            long r7 = r12.L
            long r9 = r7 >> r1
            int r9 = (int) r9
            float r9 = (float) r9
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r9 > 0) goto L82
            float r9 = r13.d
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 < 0) goto L82
            long r7 = r7 & r2
            int r7 = (int) r7
            float r7 = (float) r7
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 <= 0) goto L38
            goto L82
        L38:
            long r7 = r14 >> r1
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            long r8 = r14 & r2
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r9 = r13.c
            float r10 = r13.a
            float r9 = r9 - r10
            float r9 = r7 - r9
            r10 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r10
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 <= 0) goto L56
            float r4 = r4 - r9
            goto L5d
        L56:
            float r7 = -r7
            float r7 = r7 / r10
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 >= 0) goto L5d
            r4 = r7
        L5d:
            float r7 = r13.d
            float r9 = r13.b
            float r7 = r7 - r9
            float r7 = r8 - r7
            float r7 = r7 / r10
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 <= 0) goto L6b
            float r6 = r6 - r7
            goto L72
        L6b:
            float r7 = -r8
            float r7 = r7 / r10
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 >= 0) goto L72
            r6 = r7
        L72:
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r7 = (long) r4
            int r4 = java.lang.Float.floatToRawIntBits(r6)
            long r9 = (long) r4
            long r6 = r7 << r1
            long r8 = r9 & r2
            long r6 = r6 | r8
            goto L84
        L82:
            r6 = 0
        L84:
            long r8 = r6 >> r1
            int r4 = (int) r8
            float r4 = java.lang.Float.intBitsToFloat(r4)
            long r6 = r6 & r2
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            long r7 = r12.L
            long r9 = r7 >> r1
            int r9 = (int) r9
            long r7 = r7 & r2
            int r7 = (int) r7
            float r8 = (float) r9
            long r9 = r14 >> r1
            int r9 = (int) r9
            float r10 = java.lang.Float.intBitsToFloat(r9)
            float r10 = r10 + r8
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r9 = r9 + r4
            float r8 = java.lang.Math.max(r8, r9)
            float r8 = java.lang.Math.min(r10, r8)
            float r7 = (float) r7
            long r14 = r14 & r2
            int r14 = (int) r14
            float r15 = java.lang.Float.intBitsToFloat(r14)
            float r15 = r15 + r7
            float r14 = java.lang.Float.intBitsToFloat(r14)
            float r14 = r14 + r6
            float r14 = java.lang.Math.max(r7, r14)
            float r14 = java.lang.Math.min(r15, r14)
            r13.a(r4, r6, r8, r14)
            goto Ld5
        Lc7:
            if (r14 == 0) goto Ld5
            long r14 = r12.L
            long r6 = r14 >> r1
            int r4 = (int) r6
            float r4 = (float) r4
            long r14 = r14 & r2
            int r14 = (int) r14
            float r14 = (float) r14
            r13.a(r5, r5, r4, r14)
        Ld5:
            boolean r14 = r13.b()
            if (r14 == 0) goto Ldc
            return
        Ldc:
            xt2 r0 = (defpackage.xt2) r0
            float[] r14 = r0.b()
            boolean r15 = r0.o0
            if (r15 != 0) goto Lf4
            if (r14 != 0) goto Lf1
            r13.a = r5
            r13.b = r5
            r13.c = r5
            r13.d = r5
            goto Lf4
        Lf1:
            defpackage.v24.c(r14, r13)
        Lf4:
            long r14 = r12.x0
            long r0 = r14 >> r1
            int r12 = (int) r0
            float r0 = r13.a
            float r12 = (float) r12
            float r0 = r0 + r12
            r13.a = r0
            float r0 = r13.c
            float r0 = r0 + r12
            r13.c = r0
            long r14 = r14 & r2
            int r12 = (int) r14
            float r14 = r13.b
            float r12 = (float) r12
            float r14 = r14 + r12
            r13.b = r14
            float r14 = r13.d
            float r14 = r14 + r12
            r13.d = r14
            return
    }

    public final void q1() {
            r2 = this;
            yp4 r0 = r2.J0
            if (r0 == 0) goto Le
            r0 = 0
            r1 = 0
            r2.x1(r0, r1)
            sm3 r2 = r2.k0
            r2.U(r1)
        Le:
            return
    }

    @Override // defpackage.aq4
    public final boolean r() {
            r1 = this;
            yp4 r0 = r1.J0
            if (r0 == 0) goto L12
            boolean r0 = r1.p0
            if (r0 != 0) goto L12
            sm3 r1 = r1.k0
            boolean r1 = r1.H()
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final void r1(defpackage.f34 r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            f34 r2 = r0.v0
            if (r1 == r2) goto L19d
            r0.v0 = r1
            sm3 r3 = r0.k0
            r4 = 0
            if (r2 == 0) goto L23
            int r5 = r1.getWidth()
            int r6 = r2.getWidth()
            if (r5 != r6) goto L23
            int r5 = r1.getHeight()
            int r2 = r2.getHeight()
            if (r5 == r2) goto Ldc
        L23:
            int r2 = r1.getWidth()
            int r5 = r1.getHeight()
            yp4 r6 = r0.J0
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r9 = 32
            if (r6 == 0) goto L41
            long r10 = (long) r2
            long r10 = r10 << r9
            long r12 = (long) r5
            long r12 = r12 & r7
            long r10 = r10 | r12
            xt2 r6 = (defpackage.xt2) r6
            r6.e(r10)
            goto L4e
        L41:
            boolean r6 = r3.I()
            if (r6 == 0) goto L4e
            eg4 r6 = r0.o0
            if (r6 == 0) goto L4e
            r6.f1()
        L4e:
            long r10 = (long) r2
            long r9 = r10 << r9
            long r5 = (long) r5
            long r5 = r5 & r7
            long r5 = r5 | r9
            r0.l0(r5)
            qn2 r2 = r0.r0
            if (r2 == 0) goto L5e
            r0.y1(r4)
        L5e:
            r2 = 4
            boolean r5 = defpackage.fg4.g(r2)
            z64 r6 = r0.Y0()
            if (r5 == 0) goto L6a
            goto L70
        L6a:
            z64 r6 = r6.X
            if (r6 != 0) goto L70
            goto Ld0
        L70:
            z64 r5 = r0.a1(r5)
        L74:
            if (r5 == 0) goto Ld0
            int r7 = r5.R
            r7 = r7 & r2
            if (r7 == 0) goto Ld0
            int r7 = r5.L
            r7 = r7 & r2
            if (r7 == 0) goto Lcb
            r7 = 0
            r8 = r5
            r9 = r7
        L83:
            if (r8 == 0) goto Lcb
            boolean r10 = r8 instanceof defpackage.mo1
            if (r10 == 0) goto L8f
            mo1 r8 = (defpackage.mo1) r8
            r8.O()
            goto Lc6
        L8f:
            int r10 = r8.L
            r10 = r10 & r2
            if (r10 == 0) goto Lc6
            boolean r10 = r8 instanceof defpackage.zg1
            if (r10 == 0) goto Lc6
            r10 = r8
            zg1 r10 = (defpackage.zg1) r10
            z64 r10 = r10.l0
            r11 = r4
        L9e:
            r12 = 1
            if (r10 == 0) goto Lc3
            int r13 = r10.L
            r13 = r13 & r2
            if (r13 == 0) goto Lc0
            int r11 = r11 + 1
            if (r11 != r12) goto Lac
            r8 = r10
            goto Lc0
        Lac:
            if (r9 != 0) goto Lb7
            ua4 r9 = new ua4
            r12 = 16
            z64[] r12 = new defpackage.z64[r12]
            r9.<init>(r12)
        Lb7:
            if (r8 == 0) goto Lbd
            r9.b(r8)
            r8 = r7
        Lbd:
            r9.b(r10)
        Lc0:
            z64 r10 = r10.Y
            goto L9e
        Lc3:
            if (r11 != r12) goto Lc6
            goto L83
        Lc6:
            z64 r8 = defpackage.nc1.A(r9)
            goto L83
        Lcb:
            if (r5 == r6) goto Ld0
            z64 r5 = r5.Y
            goto L74
        Ld0:
            zp4 r2 = r3.k0
            if (r2 == 0) goto Ld9
            te r2 = (defpackage.te) r2
            r2.v(r3)
        Ld9:
            r3.N(r0)
        Ldc:
            y94 r2 = r0.w0
            if (r2 == 0) goto Le5
            int r2 = r2.e
            if (r2 == 0) goto Le5
            goto Lef
        Le5:
            java.util.Map r2 = r1.b()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L19d
        Lef:
            y94 r2 = r0.w0
            java.util.Map r5 = r1.b()
            if (r2 != 0) goto Lf8
            goto L14c
        Lf8:
            int r6 = r2.e
            int r7 = r5.size()
            if (r6 == r7) goto L101
            goto L14c
        L101:
            java.lang.Object[] r6 = r2.b
            int[] r7 = r2.c
            long[] r2 = r2.a
            int r8 = r2.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L19d
            r9 = r4
        L10d:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L196
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r4
        L127:
            if (r14 >= r12) goto L194
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L18f
            int r15 = r9 << 3
            int r15 = r15 + r14
            r16 = r6[r15]
            r15 = r7[r15]
            r4 = r16
            ey2 r4 = (defpackage.ey2) r4
            java.lang.Object r4 = r5.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 != 0) goto L146
            goto L14c
        L146:
            int r4 = r4.intValue()
            if (r4 == r15) goto L18f
        L14c:
            wm3 r2 = r3.C0
            d34 r2 = r2.p
            tm3 r2 = r2.t0
            r2.f()
            y94 r2 = r0.w0
            if (r2 != 0) goto L162
            y94 r2 = defpackage.th4.a
            y94 r2 = new y94
            r2.<init>()
            r0.w0 = r2
        L162:
            r2.a()
            java.util.Map r0 = r1.b()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L171:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2.g(r1, r3)
            goto L171
        L18f:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            r4 = 0
            goto L127
        L194:
            if (r12 != r13) goto L19d
        L196:
            if (r9 == r8) goto L19d
            int r9 = r9 + 1
            r4 = 0
            goto L10d
        L19d:
            return
    }

    public final void s1(defpackage.z64 r17, defpackage.cg4 r18, long r19, defpackage.zx2 r21, int r22, boolean r23, float r24) {
            r16 = this;
            r0 = r17
            if (r0 != 0) goto L14
            r1 = r16
            r2 = r18
            r3 = r19
            r5 = r21
            r6 = r22
            r7 = r23
            r1.e1(r2, r3, r5, r6, r7)
            return
        L14:
            r2 = r18
            boolean r1 = r2.d(r0)
            if (r1 != 0) goto L34
            int r1 = r2.c()
            z64 r1 = defpackage.ln2.g(r0, r1)
            r0 = r16
            r3 = r19
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r0.s1(r1, r2, r3, r5, r6, r7, r8)
            return
        L34:
            r5 = r21
            r7 = r23
            r8 = r24
            boolean r1 = r2.b(r0)
            if (r1 == 0) goto L119
            t94 r10 = r5.B
            ca4 r11 = r5.A
            int r12 = r5.L
            int r1 = r11.b
            int r3 = r1 + (-1)
            r4 = 0
            if (r12 != r3) goto Laf
            int r13 = r12 + 1
            r5.b(r13, r1)
            int r1 = r5.L
            int r1 = r1 + 1
            r5.L = r1
            r11.a(r0)
            long r3 = defpackage.yh2.a(r8, r7, r4)
            r10.a(r3)
            int r1 = r2.c()
            z64 r1 = defpackage.ln2.g(r0, r1)
            r9 = 0
            r0 = r16
            r3 = r19
            r6 = r22
            r0.m1(r1, r2, r3, r5, r6, r7, r8, r9)
            r5.L = r12
            int r0 = r11.b
            int r0 = r0 + (-1)
            if (r13 == r0) goto L88
            long r0 = r5.a()
            boolean r0 = defpackage.vy7.n0(r0)
            if (r0 == 0) goto L87
            goto L88
        L87:
            return
        L88:
            int r0 = r5.L
            int r1 = r0 + 1
            r11.k(r1)
            if (r1 < 0) goto La9
            int r2 = r10.b
            if (r1 >= r2) goto La9
            long[] r3 = r10.a
            r4 = r3[r1]
            int r4 = r2 + (-1)
            if (r1 == r4) goto La2
            int r0 = r0 + 2
            defpackage.fv.s0(r3, r3, r1, r0, r2)
        La2:
            int r0 = r10.b
            int r0 = r0 + (-1)
            r10.b = r0
            return
        La9:
            java.lang.String r0 = "Index must be between 0 and size"
            defpackage.e41.q(r0)
            return
        Laf:
            long r12 = r5.a()
            int r14 = r5.L
            int r1 = r11.b
            int r15 = r1 + (-1)
            r5.L = r15
            int r2 = r11.b
            r5.b(r1, r2)
            int r1 = r5.L
            int r1 = r1 + 1
            r5.L = r1
            r11.a(r0)
            long r1 = defpackage.yh2.a(r8, r7, r4)
            r10.a(r1)
            int r1 = r18.c()
            z64 r1 = defpackage.ln2.g(r0, r1)
            r9 = 0
            r0 = r16
            r2 = r18
            r3 = r19
            r6 = r22
            r0.m1(r1, r2, r3, r5, r6, r7, r8, r9)
            r5.L = r15
            long r0 = r5.a()
            int r2 = r5.L
            int r2 = r2 + 1
            int r3 = r11.b
            int r3 = r3 + (-1)
            if (r2 >= r3) goto L10d
            int r2 = defpackage.vy7.U(r12, r0)
            if (r2 <= 0) goto L10d
            int r2 = r14 + 1
            boolean r0 = defpackage.vy7.n0(r0)
            int r1 = r5.L
            if (r0 == 0) goto L107
            int r1 = r1 + 2
            goto L109
        L107:
            int r1 = r1 + 1
        L109:
            r5.b(r2, r1)
            goto L116
        L10d:
            int r0 = r5.L
            int r0 = r0 + 1
            int r1 = r11.b
            r5.b(r0, r1)
        L116:
            r5.L = r14
            return
        L119:
            int r1 = r18.c()
            z64 r1 = defpackage.ln2.g(r0, r1)
            r9 = 0
            r0 = r16
            r2 = r18
            r3 = r19
            r6 = r22
            r7 = r23
            r8 = r24
            r0.m1(r1, r2, r3, r5, r6, r7, r8, r9)
            return
    }

    @Override // defpackage.jk3
    public final boolean t() {
            r0 = this;
            z64 r0 = r0.Y0()
            boolean r0 = r0.j0
            return r0
    }

    public final defpackage.of5 u1() {
            r7 = this;
            z64 r0 = r7.Y0()
            boolean r0 = r0.j0
            if (r0 != 0) goto L9
            goto L5f
        L9:
            jk3 r0 = defpackage.ej2.w(r7)
            ia4 r1 = r7.z0
            if (r1 != 0) goto L18
            ia4 r1 = new ia4
            r1.<init>()
            r7.z0 = r1
        L18:
            long r2 = r7.X0()
            long r2 = r7.P0(r2)
            r4 = 32
            long r4 = r2 >> r4
            int r4 = (int) r4
            float r5 = java.lang.Float.intBitsToFloat(r4)
            float r5 = -r5
            r1.a = r5
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r5
            int r2 = (int) r2
            float r3 = java.lang.Float.intBitsToFloat(r2)
            float r3 = -r3
            r1.b = r3
            int r3 = r7.d0()
            float r3 = (float) r3
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r4 = r4 + r3
            r1.c = r4
            int r3 = r7.Z()
            float r3 = (float) r3
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r2 = r2 + r3
            r1.d = r2
        L52:
            if (r7 == r0) goto L68
            r2 = 0
            r3 = 1
            r7.p1(r1, r2, r3)
            boolean r2 = r1.b()
            if (r2 == 0) goto L62
        L5f:
            of5 r7 = defpackage.of5.e
            return r7
        L62:
            eg4 r7 = r7.o0
            r7.getClass()
            goto L52
        L68:
            of5 r7 = new of5
            float r0 = r1.a
            float r2 = r1.b
            float r3 = r1.c
            float r1 = r1.d
            r7.<init>(r0, r2, r3, r1)
            return r7
    }

    public final void v1(defpackage.eg4 r6, float[] r7) {
            r5 = this;
            boolean r0 = defpackage.nb3.k(r6, r5)
            if (r0 != 0) goto L44
            eg4 r0 = r5.o0
            r0.getClass()
            r0.v1(r6, r7)
            long r0 = r5.x0
            r2 = 0
            boolean r6 = defpackage.i93.a(r0, r2)
            if (r6 != 0) goto L35
            float[] r6 = defpackage.eg4.M0
            defpackage.v24.d(r6)
            long r0 = r5.x0
            r2 = 32
            long r2 = r0 >> r2
            int r2 = (int) r2
            float r2 = (float) r2
            float r2 = -r2
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r3
            int r0 = (int) r0
            float r0 = (float) r0
            float r0 = -r0
            defpackage.v24.f(r6, r2, r0)
            defpackage.v24.e(r7, r6)
        L35:
            yp4 r5 = r5.J0
            if (r5 == 0) goto L44
            xt2 r5 = (defpackage.xt2) r5
            float[] r5 = r5.a()
            if (r5 == 0) goto L44
            defpackage.v24.e(r7, r5)
        L44:
            return
    }

    @Override // defpackage.jk3
    public final long w(long r2) {
            r1 = this;
            z64 r0 = r1.Y0()
            boolean r0 = r0.j0
            if (r0 != 0) goto Ld
            java.lang.String r0 = "LayoutCoordinate operations are only valid when isAttached is true"
            defpackage.p53.c(r0)
        Ld:
            long r2 = r1.P(r2)
            sm3 r1 = r1.k0
            zp4 r1 = defpackage.vm3.a(r1)
            te r1 = (defpackage.te) r1
            long r1 = r1.r(r2)
            return r1
    }

    public final void w1(defpackage.eg4 r7, float[] r8) {
            r6 = this;
        L0:
            boolean r0 = r6.equals(r7)
            if (r0 != 0) goto L3c
            yp4 r0 = r6.J0
            if (r0 == 0) goto L13
            xt2 r0 = (defpackage.xt2) r0
            float[] r0 = r0.b()
            defpackage.v24.e(r8, r0)
        L13:
            long r0 = r6.x0
            r2 = 0
            boolean r2 = defpackage.i93.a(r0, r2)
            if (r2 != 0) goto L36
            float[] r2 = defpackage.eg4.M0
            defpackage.v24.d(r2)
            r3 = 32
            long r3 = r0 >> r3
            int r3 = (int) r3
            float r3 = (float) r3
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            int r0 = (int) r0
            float r0 = (float) r0
            defpackage.v24.f(r2, r3, r0)
            defpackage.v24.e(r8, r2)
        L36:
            eg4 r6 = r6.o0
            r6.getClass()
            goto L0
        L3c:
            return
    }

    public final void x1(defpackage.qn2 r11, boolean r12) {
            r10 = this;
            r0 = 0
            r1 = 1
            sm3 r2 = r10.k0
            if (r12 != 0) goto L1d
            qn2 r12 = r10.r0
            if (r12 != r11) goto L1d
            qh1 r12 = r10.s0
            qh1 r3 = r2.u0
            boolean r12 = defpackage.nb3.k(r12, r3)
            if (r12 == 0) goto L1d
            kk3 r12 = r10.t0
            kk3 r3 = r2.v0
            if (r12 == r3) goto L1b
            goto L1d
        L1b:
            r12 = r0
            goto L1e
        L1d:
            r12 = r1
        L1e:
            qh1 r3 = r2.u0
            r10.s0 = r3
            kk3 r3 = r2.v0
            r10.t0 = r3
            boolean r3 = r2.H()
            dg4 r9 = r10.H0
            r4 = 0
            if (r3 == 0) goto Lf8
            if (r11 == 0) goto Lf8
            r10.r0 = r11
            yp4 r11 = r10.J0
            if (r11 != 0) goto Lf2
            zp4 r11 = defpackage.vm3.a(r2)
            pf r12 = r10.G0
            if (r12 != 0) goto L4e
            dg4 r12 = new dg4
            r12.<init>(r10, r0)
            pf r3 = new pf
            r5 = 2
            r3.<init>(r5, r10, r12)
            r10.G0 = r3
            r8 = r3
            goto L4f
        L4e:
            r8 = r12
        L4f:
            r7 = r11
            te r7 = (defpackage.te) r7
            rr6 r11 = r7.t1
        L54:
            java.lang.Object r12 = r11.L
            java.lang.ref.ReferenceQueue r12 = (java.lang.ref.ReferenceQueue) r12
            java.lang.Object r3 = r11.B
            ua4 r3 = (defpackage.ua4) r3
            java.lang.ref.Reference r12 = r12.poll()
            if (r12 == 0) goto L65
            r3.j(r12)
        L65:
            if (r12 != 0) goto L54
        L67:
            int r11 = r3.L
            if (r11 == 0) goto L7a
            int r11 = r11 + (-1)
            java.lang.Object r11 = r3.l(r11)
            java.lang.ref.Reference r11 = (java.lang.ref.Reference) r11
            java.lang.Object r11 = r11.get()
            if (r11 == 0) goto L67
            goto L7b
        L7a:
            r11 = r4
        L7b:
            yp4 r11 = (defpackage.yp4) r11
            if (r11 == 0) goto Lc8
            r12 = r11
            xt2 r12 = (defpackage.xt2) r12
            tt2 r3 = r12.B
            if (r3 == 0) goto Lc1
            ut2 r5 = r12.A
            boolean r5 = r5.s
            if (r5 != 0) goto L91
            java.lang.String r5 = "layer should have been released before reuse"
            defpackage.p53.a(r5)
        L91:
            ut2 r3 = r3.b()
            r12.A = r3
            r12.Z = r0
            r12.R = r8
            r12.X = r9
            r12.m0 = r0
            r12.n0 = r0
            r12.o0 = r1
            float[] r3 = r12.d0
            defpackage.v24.d(r3)
            float[] r3 = r12.e0
            if (r3 == 0) goto Laf
            defpackage.v24.d(r3)
        Laf:
            long r5 = defpackage.i97.b
            r12.k0 = r5
            r12.p0 = r0
            r5 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r12.Y = r5
            r12.l0 = r4
            r12.j0 = r0
            goto Lda
        Lc1:
            java.lang.String r10 = "currently reuse is only supported when we manage the layer lifecycle"
            ug r10 = defpackage.i61.e(r10)
            throw r10
        Lc8:
            xt2 r4 = new xt2
            tt2 r11 = r7.getGraphicsContext()
            ut2 r5 = r11.b()
            tt2 r6 = r7.getGraphicsContext()
            r4.<init>(r5, r6, r7, r8, r9)
            r11 = r4
        Lda:
            long r3 = r10.L
            r12 = r11
            xt2 r12 = (defpackage.xt2) r12
            r12.e(r3)
            long r3 = r10.x0
            r12.d(r3)
            r10.J0 = r11
            r10.y1(r1)
            r2.F0 = r1
            r9.c()
            return
        Lf2:
            if (r12 == 0) goto Lf7
            r10.y1(r1)
        Lf7:
            return
        Lf8:
            r10.r0 = r4
            yp4 r11 = r10.J0
            if (r11 == 0) goto L165
            xt2 r11 = (defpackage.xt2) r11
            float[] r12 = r11.b()
            boolean r12 = defpackage.nj2.w(r12)
            if (r12 != 0) goto L10d
            r2.N(r10)
        L10d:
            r11.R = r4
            r11.X = r4
            r11.Z = r1
            r11.f(r0)
            tt2 r12 = r11.B
            if (r12 == 0) goto L147
            ut2 r3 = r11.A
            r12.a(r3)
            te r12 = r11.L
            rr6 r3 = r12.t1
        L123:
            java.lang.Object r5 = r3.L
            java.lang.ref.ReferenceQueue r5 = (java.lang.ref.ReferenceQueue) r5
            java.lang.Object r6 = r3.B
            ua4 r6 = (defpackage.ua4) r6
            java.lang.ref.Reference r5 = r5.poll()
            if (r5 == 0) goto L134
            r6.j(r5)
        L134:
            if (r5 != 0) goto L123
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            java.lang.Object r3 = r3.L
            java.lang.ref.ReferenceQueue r3 = (java.lang.ref.ReferenceQueue) r3
            r5.<init>(r11, r3)
            r6.b(r5)
            ca4 r12 = r12.D0
            r12.j(r11)
        L147:
            r10.J0 = r4
            r2.F0 = r1
            r9.c()
            z64 r11 = r10.Y0()
            boolean r11 = r11.j0
            if (r11 == 0) goto L165
            boolean r11 = r2.I()
            if (r11 == 0) goto L165
            zp4 r11 = r2.k0
            if (r11 == 0) goto L165
            te r11 = (defpackage.te) r11
            r11.v(r2)
        L165:
            r10.I0 = r0
            return
    }

    public final void y1(boolean r29) {
            r28 = this;
            r0 = r28
            yp4 r1 = r0.J0
            qn2 r2 = r0.r0
            if (r1 == 0) goto L455
            if (r2 == 0) goto L44e
            op5 r3 = defpackage.eg4.K0
            r3.b()
            sm3 r4 = r0.k0
            qh1 r5 = r4.u0
            r3.l0 = r5
            kk3 r5 = r4.v0
            r3.m0 = r5
            long r5 = r0.L
            long r5 = defpackage.qo2.S(r5)
            r3.k0 = r5
            zp4 r5 = defpackage.vm3.a(r4)
            te r5 = (defpackage.te) r5
            bq4 r5 = r5.getSnapshotObserver()
            hh2 r6 = defpackage.hh2.e0
            le r7 = new le
            r8 = 8
            r7.<init>(r8, r2, r0)
            qm6 r2 = r5.a
            r2.d(r0, r6, r7)
            jj3 r2 = r0.A0
            if (r2 != 0) goto L44
            jj3 r2 = new jj3
            r2.<init>()
            r0.A0 = r2
        L44:
            jj3 r5 = defpackage.eg4.L0
            r5.getClass()
            float r6 = r2.a
            r5.a = r6
            float r6 = r2.b
            r5.b = r6
            float r6 = r2.c
            r5.c = r6
            float r6 = r2.d
            r5.d = r6
            float r6 = r2.e
            r5.e = r6
            float r6 = r2.f
            r5.f = r6
            long r6 = r2.g
            r5.g = r6
            float r6 = r3.B
            r2.a = r6
            float r7 = r3.L
            r2.b = r7
            float r7 = r3.X
            r2.c = r7
            float r7 = r3.Y
            r2.d = r7
            float r7 = r3.f0
            r2.e = r7
            float r7 = r3.g0
            r2.f = r7
            long r7 = r3.h0
            r2.g = r7
            xt2 r1 = (defpackage.xt2) r1
            te r9 = r1.L
            int r10 = r3.A
            int r11 = r1.j0
            r10 = r10 | r11
            kk3 r11 = r3.m0
            r1.h0 = r11
            qh1 r11 = r3.l0
            r1.g0 = r11
            r11 = r10 & 4096(0x1000, float:5.74E-42)
            if (r11 == 0) goto L98
            r1.k0 = r7
        L98:
            r7 = r10 & 1
            if (r7 == 0) goto Lac
            ut2 r7 = r1.A
            wt2 r7 = r7.a
            float r8 = r7.b()
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 != 0) goto La9
            goto Lac
        La9:
            r7.z(r6)
        Lac:
            r6 = r10 & 2
            if (r6 == 0) goto Lc2
            ut2 r6 = r1.A
            float r7 = r3.L
            wt2 r6 = r6.a
            float r8 = r6.N()
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 != 0) goto Lbf
            goto Lc2
        Lbf:
            r6.m(r7)
        Lc2:
            r6 = r10 & 4
            if (r6 == 0) goto Ld8
            ut2 r6 = r1.A
            float r7 = r3.R
            wt2 r6 = r6.a
            float r8 = r6.a()
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 != 0) goto Ld5
            goto Ld8
        Ld5:
            r6.t(r7)
        Ld8:
            r6 = r10 & 8
            if (r6 == 0) goto Lee
            ut2 r6 = r1.A
            float r7 = r3.X
            wt2 r6 = r6.a
            float r8 = r6.C()
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 != 0) goto Leb
            goto Lee
        Leb:
            r6.I(r7)
        Lee:
            r6 = r10 & 16
            if (r6 == 0) goto L104
            ut2 r6 = r1.A
            float r7 = r3.Y
            wt2 r6 = r6.a
            float r8 = r6.u()
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 != 0) goto L101
            goto L104
        L101:
            r6.f(r7)
        L104:
            r6 = r10 & 32
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L132
            ut2 r6 = r1.A
            float r12 = r3.Z
            wt2 r13 = r6.a
            float r14 = r13.M()
            int r14 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r14 != 0) goto L119
            goto L121
        L119:
            r13.c(r12)
            r6.g = r8
            r6.a()
        L121:
            float r6 = r3.Z
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L132
            boolean r6 = r1.p0
            if (r6 != 0) goto L132
            on2 r6 = r1.X
            if (r6 == 0) goto L132
            r6.c()
        L132:
            r6 = r10 & 64
            if (r6 == 0) goto L149
            ut2 r6 = r1.A
            long r12 = r3.d0
            wt2 r6 = r6.a
            long r14 = r6.r()
            boolean r14 = defpackage.kt0.d(r12, r14)
            if (r14 != 0) goto L149
            r6.x(r12)
        L149:
            r6 = r10 & 128(0x80, float:1.8E-43)
            if (r6 == 0) goto L160
            ut2 r6 = r1.A
            long r12 = r3.e0
            wt2 r6 = r6.a
            long r14 = r6.w()
            boolean r14 = defpackage.kt0.d(r12, r14)
            if (r14 != 0) goto L160
            r6.J(r12)
        L160:
            r6 = r10 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L176
            ut2 r6 = r1.A
            float r12 = r3.f0
            wt2 r6 = r6.a
            float r13 = r6.p()
            int r13 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r13 != 0) goto L173
            goto L176
        L173:
            r6.e(r12)
        L176:
            r6 = r10 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L18a
            ut2 r6 = r1.A
            wt2 r6 = r6.a
            float r12 = r6.F()
            int r12 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r12 != 0) goto L187
            goto L18a
        L187:
            r6.s()
        L18a:
            r6 = r10 & 512(0x200, float:7.17E-43)
            if (r6 == 0) goto L19e
            ut2 r6 = r1.A
            wt2 r6 = r6.a
            float r12 = r6.n()
            int r12 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r12 != 0) goto L19b
            goto L19e
        L19b:
            r6.v()
        L19e:
            r6 = r10 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L1b4
            ut2 r6 = r1.A
            float r12 = r3.g0
            wt2 r6 = r6.a
            float r13 = r6.A()
            int r13 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r13 != 0) goto L1b1
            goto L1b4
        L1b1:
            r6.L(r12)
        L1b4:
            r14 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r11 == 0) goto L220
            long r12 = r1.k0
            r18 = 32
            long r6 = defpackage.i97.b
            boolean r6 = defpackage.i97.a(r12, r6)
            ut2 r7 = r1.A
            if (r6 == 0) goto L1de
            long r12 = r7.v
            boolean r6 = defpackage.jk4.c(r12, r14)
            if (r6 != 0) goto L222
            r7.v = r14
            wt2 r6 = r7.a
            r6.q(r14)
            goto L222
        L1de:
            long r12 = r1.k0
            long r12 = r12 >> r18
            int r6 = (int) r12
            float r6 = java.lang.Float.intBitsToFloat(r6)
            long r12 = r1.Y
            long r12 = r12 >> r18
            int r12 = (int) r12
            float r12 = (float) r12
            float r6 = r6 * r12
            long r12 = r1.k0
            long r12 = r12 & r16
            int r12 = (int) r12
            float r12 = java.lang.Float.intBitsToFloat(r12)
            r19 = r12
            long r11 = r1.Y
            long r11 = r11 & r16
            int r11 = (int) r11
            float r11 = (float) r11
            float r12 = r19 * r11
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r13 = (long) r6
            int r6 = java.lang.Float.floatToRawIntBits(r12)
            long r11 = (long) r6
            long r13 = r13 << r18
            long r11 = r11 & r16
            long r11 = r11 | r13
            long r13 = r7.v
            boolean r6 = defpackage.jk4.c(r13, r11)
            if (r6 != 0) goto L222
            r7.v = r11
            wt2 r6 = r7.a
            r6.q(r11)
            goto L222
        L220:
            r18 = 32
        L222:
            r6 = r10 & 16384(0x4000, float:2.2959E-41)
            if (r6 == 0) goto L235
            ut2 r6 = r1.A
            boolean r7 = r3.j0
            boolean r11 = r6.w
            if (r11 == r7) goto L235
            r6.w = r7
            r6.g = r8
            r6.a()
        L235:
            r6 = 131072(0x20000, float:1.83671E-40)
            r6 = r6 & r10
            if (r6 == 0) goto L24d
            ut2 r6 = r1.A
            m50 r7 = r3.n0
            wt2 r6 = r6.a
            m50 r11 = r6.d()
            boolean r11 = defpackage.nb3.k(r11, r7)
            if (r11 != 0) goto L24d
            r6.D(r7)
        L24d:
            r6 = 262144(0x40000, float:3.67342E-40)
            r6 = r6 & r10
            r7 = 0
            if (r6 == 0) goto L264
            ut2 r6 = r1.A
            wt2 r6 = r6.a
            z40 r11 = r6.l()
            boolean r11 = defpackage.nb3.k(r11, r7)
            if (r11 != 0) goto L264
            r6.y()
        L264:
            r6 = 524288(0x80000, float:7.34684E-40)
            r6 = r6 & r10
            if (r6 == 0) goto L279
            ut2 r6 = r1.A
            int r11 = r3.o0
            wt2 r6 = r6.a
            int r12 = r6.O()
            if (r12 != r11) goto L276
            goto L279
        L276:
            r6.h(r11)
        L279:
            r6 = 32768(0x8000, float:4.5918E-41)
            r6 = r6 & r10
            r12 = 0
            if (r6 == 0) goto L28e
            ut2 r6 = r1.A
            wt2 r6 = r6.a
            int r11 = r6.k()
            if (r11 != 0) goto L28b
            goto L28e
        L28b:
            r6.H(r12)
        L28e:
            r6 = r10 & 7963(0x1f1b, float:1.1159E-41)
            if (r6 == 0) goto L296
            r1.m0 = r8
            r1.n0 = r8
        L296:
            mp2 r6 = r1.l0
            mp2 r11 = r3.p0
            boolean r6 = defpackage.nb3.k(r6, r11)
            if (r6 != 0) goto L39e
            mp2 r6 = r3.p0
            r1.l0 = r6
            if (r6 != 0) goto L2aa
            r27 = r9
            goto L398
        L2aa:
            ut2 r11 = r1.A
            boolean r13 = r6 instanceof defpackage.qo4
            if (r13 == 0) goto L2ec
            r13 = r6
            qo4 r13 = (defpackage.qo4) r13
            of5 r13 = r13.f
            float r14 = r13.a
            float r15 = r13.b
            int r12 = java.lang.Float.floatToRawIntBits(r14)
            r27 = r9
            long r8 = (long) r12
            int r12 = java.lang.Float.floatToRawIntBits(r15)
            r19 = r8
            long r7 = (long) r12
            long r19 = r19 << r18
            long r7 = r7 & r16
            long r23 = r19 | r7
            float r7 = r13.c
            float r7 = r7 - r14
            float r8 = r13.d
            float r8 = r8 - r15
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            long r12 = (long) r7
            int r7 = java.lang.Float.floatToRawIntBits(r8)
            long r7 = (long) r7
            long r12 = r12 << r18
            long r7 = r7 & r16
            long r25 = r12 | r7
            r22 = 0
            r21 = r11
            r21.f(r22, r23, r25)
            goto L379
        L2ec:
            r27 = r9
            r7 = r11
            boolean r8 = r6 instanceof defpackage.po4
            r12 = 0
            if (r8 == 0) goto L315
            r8 = r6
            po4 r8 = (defpackage.po4) r8
            hj r8 = r8.f
            r9 = 0
            r7.k = r9
            r14 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r7.i = r14
            r7.h = r12
            r11 = 0
            r7.j = r11
            r9 = 1
            r7.g = r9
            r9 = 0
            r7.n = r9
            r7.l = r8
            r7.a()
            goto L379
        L315:
            boolean r8 = r6 instanceof defpackage.ro4
            if (r8 == 0) goto L39a
            r8 = r6
            ro4 r8 = (defpackage.ro4) r8
            hj r9 = r8.g
            if (r9 == 0) goto L33b
            r14 = 0
            r7.k = r14
            r14 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r7.i = r14
            r7.h = r12
            r11 = 0
            r7.j = r11
            r8 = 1
            r7.g = r8
            r12 = 0
            r7.n = r12
            r7.l = r9
            r7.a()
            goto L379
        L33b:
            r12 = 0
            u16 r8 = r8.f
            float r9 = r8.b
            float r13 = r8.a
            int r14 = java.lang.Float.floatToRawIntBits(r13)
            long r14 = (long) r14
            int r11 = java.lang.Float.floatToRawIntBits(r9)
            r19 = r13
            long r12 = (long) r11
            long r14 = r14 << r18
            long r11 = r12 & r16
            long r23 = r14 | r11
            float r11 = r8.c
            float r11 = r11 - r19
            float r12 = r8.d
            float r12 = r12 - r9
            int r9 = java.lang.Float.floatToRawIntBits(r11)
            long r13 = (long) r9
            int r9 = java.lang.Float.floatToRawIntBits(r12)
            long r11 = (long) r9
            long r13 = r13 << r18
            long r11 = r11 & r16
            long r25 = r13 | r11
            long r8 = r8.h
            long r8 = r8 >> r18
            int r8 = (int) r8
            float r22 = java.lang.Float.intBitsToFloat(r8)
            r21 = r7
            r21.f(r22, r23, r25)
        L379:
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 33
            if (r7 >= r8) goto L398
            boolean r7 = r6 instanceof defpackage.po4
            if (r7 != 0) goto L391
            boolean r7 = r6 instanceof defpackage.ro4
            if (r7 == 0) goto L398
            ro4 r6 = (defpackage.ro4) r6
            u16 r6 = r6.f
            boolean r6 = defpackage.mp2.P(r6)
            if (r6 != 0) goto L398
        L391:
            on2 r6 = r1.X
            if (r6 == 0) goto L398
            r6.c()
        L398:
            r9 = 1
            goto L3a1
        L39a:
            defpackage.i.d()
            return
        L39e:
            r27 = r9
            r9 = 0
        L3a1:
            int r6 = r3.A
            r1.j0 = r6
            if (r10 != 0) goto L3a9
            if (r9 == 0) goto L3cd
        L3a9:
            int r1 = android.os.Build.VERSION.SDK_INT
            r6 = 26
            if (r1 < r6) goto L3be
            android.view.ViewParent r1 = r27.getParent()
            if (r1 == 0) goto L3bb
            r6 = r27
            defpackage.q66.x(r1, r6, r6)
            goto L3c3
        L3bb:
            r6 = r27
            goto L3c3
        L3be:
            r6 = r27
            r6.invalidate()
        L3c3:
            boolean r1 = defpackage.te.m()
            if (r1 == 0) goto L3cd
            r11 = 0
            r6.J(r11)
        L3cd:
            boolean r1 = r0.q0
            boolean r6 = r3.j0
            r0.q0 = r6
            float r3 = r3.R
            r0.u0 = r3
            float r3 = r5.a
            float r6 = r2.a
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L413
            float r3 = r5.b
            float r6 = r2.b
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L413
            float r3 = r5.c
            float r6 = r2.c
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L413
            float r3 = r5.d
            float r6 = r2.d
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L413
            float r3 = r5.e
            float r6 = r2.e
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L413
            float r3 = r5.f
            float r6 = r2.f
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L413
            long r5 = r5.g
            long r2 = r2.g
            boolean r2 = defpackage.i97.a(r5, r2)
            if (r2 == 0) goto L413
            r12 = 1
            goto L414
        L413:
            r12 = 0
        L414:
            if (r29 == 0) goto L425
            if (r12 == 0) goto L41c
            boolean r2 = r0.q0
            if (r1 == r2) goto L425
        L41c:
            zp4 r1 = r4.k0
            if (r1 == 0) goto L425
            te r1 = (defpackage.te) r1
            r1.v(r4)
        L425:
            if (r12 != 0) goto L457
            r4.N(r0)
            int r0 = r4.J0
            if (r0 <= 0) goto L457
            zp4 r0 = defpackage.vm3.a(r4)
            te r0 = (defpackage.te) r0
            a34 r1 = r0.U0
            ap3 r1 = r1.e
            r1.getClass()
            int r2 = r4.J0
            if (r2 <= 0) goto L449
            java.lang.Object r1 = r1.B
            ua4 r1 = (defpackage.ua4) r1
            r1.b(r4)
            r8 = 1
            r4.I0 = r8
        L449:
            r14 = 0
            r0.C(r14)
            return
        L44e:
            java.lang.String r0 = "updateLayerParameters requires a non-null layerBlock"
            ug r0 = defpackage.i61.e(r0)
            throw r0
        L455:
            if (r2 != 0) goto L458
        L457:
            return
        L458:
            java.lang.String r0 = "null layer with a non-null layerBlock"
            defpackage.p53.c(r0)
            return
    }

    @Override // defpackage.kz3
    public final defpackage.kz3 z0() {
            r0 = this;
            eg4 r0 = r0.n0
            return r0
    }

    public final boolean z1(long r24) {
            r23 = this;
            r0 = r23
            r1 = 9187343241974906880(0x7f8000007f800000, double:1.404448428688076E306)
            long r3 = r24 & r1
            long r1 = r1 ^ r3
            r3 = 4294967297(0x100000001, double:2.1219957915E-314)
            long r1 = r1 - r3
            r3 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            long r1 = r1 & r3
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L1b0
            yp4 r1 = r0.J0
            if (r1 == 0) goto L1ad
            boolean r0 = r0.q0
            if (r0 == 0) goto L1ad
            xt2 r1 = (defpackage.xt2) r1
            r0 = 32
            long r4 = r24 >> r0
            int r4 = (int) r4
            float r5 = java.lang.Float.intBitsToFloat(r4)
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r24 & r6
            int r4 = (int) r8
            float r4 = java.lang.Float.intBitsToFloat(r4)
            ut2 r1 = r1.A
            boolean r8 = r1.w
            if (r8 == 0) goto L1a5
            mp2 r1 = r1.d()
            boolean r8 = r1 instanceof defpackage.qo4
            if (r8 == 0) goto L6d
            qo4 r1 = (defpackage.qo4) r1
            of5 r0 = r1.f
            float r1 = r0.a
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 > 0) goto L67
            float r1 = r0.c
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 >= 0) goto L67
            float r1 = r0.b
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 > 0) goto L67
            float r0 = r0.d
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L67
            goto L1a5
        L67:
            r16 = 0
            r17 = 1
            goto L18c
        L6d:
            boolean r8 = r1 instanceof defpackage.ro4
            if (r8 == 0) goto L18f
            ro4 r1 = (defpackage.ro4) r1
            u16 r1 = r1.f
            float r8 = r1.c
            float r9 = r1.b
            float r10 = r1.d
            float r11 = r1.a
            long r12 = r1.f
            long r14 = r1.h
            r16 = 0
            r17 = 1
            long r2 = r1.g
            r18 = r6
            long r6 = r1.e
            int r20 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r20 < 0) goto L18c
            int r20 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r20 >= 0) goto L18c
            int r20 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r20 < 0) goto L18c
            int r20 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r20 < 0) goto L9d
            goto L18c
        L9d:
            r23 = r0
            r20 = r1
            long r0 = r6 >> r23
            int r0 = (int) r0
            float r1 = java.lang.Float.intBitsToFloat(r0)
            r24 = r0
            r25 = r1
            long r0 = r12 >> r23
            int r0 = (int) r0
            float r1 = java.lang.Float.intBitsToFloat(r0)
            float r1 = r1 + r25
            float r21 = r8 - r11
            int r1 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            if (r1 > 0) goto L17d
            r21 = r0
            long r0 = r14 >> r23
            int r0 = (int) r0
            float r1 = java.lang.Float.intBitsToFloat(r0)
            r25 = r0
            r22 = r1
            long r0 = r2 >> r23
            int r0 = (int) r0
            float r1 = java.lang.Float.intBitsToFloat(r0)
            float r1 = r1 + r22
            float r22 = r8 - r11
            int r1 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r1 > 0) goto L17d
            long r6 = r6 & r18
            int r1 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r1)
            long r14 = r14 & r18
            int r7 = (int) r14
            float r14 = java.lang.Float.intBitsToFloat(r7)
            float r14 = r14 + r6
            float r6 = r10 - r9
            int r6 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r6 > 0) goto L17d
            long r12 = r12 & r18
            int r6 = (int) r12
            float r12 = java.lang.Float.intBitsToFloat(r6)
            long r2 = r2 & r18
            int r2 = (int) r2
            float r3 = java.lang.Float.intBitsToFloat(r2)
            float r3 = r3 + r12
            float r12 = r10 - r9
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 > 0) goto L17d
            float r3 = java.lang.Float.intBitsToFloat(r24)
            float r3 = r3 + r11
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r1 = r1 + r9
            float r12 = java.lang.Float.intBitsToFloat(r21)
            float r12 = r8 - r12
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r6 = r6 + r9
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r8 = r8 - r0
            float r0 = java.lang.Float.intBitsToFloat(r2)
            float r0 = r10 - r0
            float r2 = java.lang.Float.intBitsToFloat(r7)
            float r10 = r10 - r2
            float r2 = java.lang.Float.intBitsToFloat(r25)
            float r7 = r2 + r11
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 >= 0) goto L141
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 >= 0) goto L141
            r2 = r20
            long r9 = r2.e
            r8 = r1
            r7 = r3
            r6 = r4
            boolean r0 = defpackage.uj2.Z(r5, r6, r7, r8, r9)
            goto L1aa
        L141:
            r1 = r7
            r7 = r8
            r2 = r20
            r8 = r6
            r6 = r4
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 >= 0) goto L158
            int r3 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r3 <= 0) goto L158
            r8 = r10
            long r9 = r2.h
            r7 = r1
            boolean r0 = defpackage.uj2.Z(r5, r6, r7, r8, r9)
            goto L1aa
        L158:
            r3 = r8
            int r1 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r1 <= 0) goto L16a
            int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r1 >= 0) goto L16a
            long r9 = r2.f
            r8 = r3
            r7 = r12
            boolean r0 = defpackage.uj2.Z(r5, r6, r7, r8, r9)
            goto L1aa
        L16a:
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L17a
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 <= 0) goto L17a
            long r9 = r2.g
            r8 = r0
            boolean r0 = defpackage.uj2.Z(r5, r6, r7, r8, r9)
            goto L1aa
        L17a:
            r0 = r17
            goto L1aa
        L17d:
            r6 = r4
            r2 = r20
            hj r0 = defpackage.lj.a()
            defpackage.hj.c(r0, r2)
            boolean r0 = defpackage.uj2.W(r5, r6, r0)
            goto L1aa
        L18c:
            r0 = r16
            goto L1aa
        L18f:
            r6 = r4
            r16 = 0
            r17 = 1
            boolean r0 = r1 instanceof defpackage.po4
            if (r0 == 0) goto L1a1
            po4 r1 = (defpackage.po4) r1
            hj r0 = r1.f
            boolean r0 = defpackage.uj2.W(r5, r6, r0)
            goto L1aa
        L1a1:
            defpackage.i.d()
            return r16
        L1a5:
            r16 = 0
            r17 = 1
            goto L17a
        L1aa:
            if (r0 == 0) goto L1b2
            goto L1af
        L1ad:
            r17 = 1
        L1af:
            return r17
        L1b0:
            r16 = 0
        L1b2:
            return r16
    }
}
