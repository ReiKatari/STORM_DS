package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d34  reason: default package */
/* loaded from: classes.dex */
public final class d34 extends defpackage.dx4 implements defpackage.x24, defpackage.nc, defpackage.z74 {
    public float A0;
    public boolean B0;
    public defpackage.qn2 C0;
    public long D0;
    public float E0;
    public final defpackage.c34 F0;
    public boolean G0;
    public final defpackage.wm3 Y;
    public boolean Z;
    public int d0;
    public int e0;
    public boolean f0;
    public boolean g0;
    public defpackage.qm3 h0;
    public boolean i0;
    public long j0;
    public defpackage.qn2 k0;
    public float l0;
    public boolean m0;
    public java.lang.Object n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public final defpackage.tm3 t0;
    public final defpackage.ua4 u0;
    public boolean v0;
    public boolean w0;
    public long x0;
    public final defpackage.c34 y0;
    public final defpackage.c34 z0;

    public d34(defpackage.wm3 r7) {
            r6 = this;
            r6.<init>()
            r6.Y = r7
            r7 = 2147483647(0x7fffffff, float:NaN)
            r6.d0 = r7
            r6.e0 = r7
            qm3 r7 = defpackage.qm3.NotUsed
            r6.h0 = r7
            r0 = 0
            r6.j0 = r0
            r7 = 1
            r6.m0 = r7
            tm3 r2 = new tm3
            r3 = 0
            r2.<init>(r6, r3)
            r6.t0 = r2
            ua4 r2 = new ua4
            r4 = 16
            d34[] r4 = new defpackage.d34[r4]
            r2.<init>(r4)
            r6.u0 = r2
            r6.v0 = r7
            r2 = 15
            long r4 = defpackage.s21.b(r3, r3, r3, r3, r2)
            r6.x0 = r4
            c34 r2 = new c34
            r2.<init>(r6, r7)
            r6.y0 = r2
            c34 r7 = new c34
            r7.<init>(r6, r3)
            r6.z0 = r7
            r6.D0 = r0
            c34 r7 = new c34
            r0 = 2
            r7.<init>(r6, r0)
            r6.F0 = r7
            return
    }

    public final void A0(long r6, float r8, defpackage.qn2 r9) {
            r5 = this;
            wm3 r0 = r5.Y
            sm3 r1 = r0.a
            sm3 r2 = r0.a
            boolean r1 = r1.K0
            if (r1 == 0) goto Lf
            java.lang.String r1 = "place is called on a deactivated node"
            defpackage.p53.a(r1)
        Lf:
            om3 r1 = defpackage.om3.LayingOut
            r0.d = r1
            r5.j0 = r6
            r5.l0 = r8
            r5.k0 = r9
            r1 = 0
            r5.B0 = r1
            zp4 r3 = defpackage.vm3.a(r2)
            boolean r4 = r5.r0
            if (r4 != 0) goto L39
            boolean r4 = r5.o0
            if (r4 == 0) goto L39
            eg4 r1 = r0.a()
            long r2 = r1.X
            long r6 = defpackage.i93.c(r6, r2)
            r1.o1(r6, r8, r9)
            r5.z0()
            goto L55
        L39:
            tm3 r4 = r5.t0
            r4.g = r1
            r0.f(r1)
            r5.C0 = r9
            r5.D0 = r6
            r5.E0 = r8
            te r3 = (defpackage.te) r3
            bq4 r6 = r3.getSnapshotObserver()
            hh2 r7 = r6.f
            qm6 r6 = r6.a
            c34 r8 = r5.F0
            r6.d(r2, r7, r8)
        L55:
            om3 r6 = defpackage.om3.Idle
            r0.d = r6
            eg4 r6 = r0.a()
            boolean r6 = r6.g0
            if (r6 == 0) goto L6c
            boolean r6 = r0.k
            if (r6 != 0) goto L69
            boolean r6 = r0.j
            if (r6 == 0) goto L6c
        L69:
            r5.requestLayout()
        L6c:
            r6 = 1
            r5.g0 = r6
            return
    }

    @Override // defpackage.dx4, defpackage.x24
    public final java.lang.Object B() {
            r0 = this;
            java.lang.Object r0 = r0.n0
            return r0
    }

    public final boolean C0(long r11) {
            r10 = this;
            wm3 r0 = r10.Y
            sm3 r1 = r0.a
            sm3 r2 = r0.a
            boolean r3 = r1.K0     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L13
            java.lang.String r3 = "measure is called on a deactivated node"
            defpackage.p53.a(r3)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r10 = move-exception
            goto Ldd
        L13:
            zp4 r3 = defpackage.vm3.a(r2)     // Catch: java.lang.Throwable -> L10
            sm3 r4 = r2.v()     // Catch: java.lang.Throwable -> L10
            boolean r5 = r2.A0     // Catch: java.lang.Throwable -> L10
            r6 = 1
            r7 = 0
            if (r5 != 0) goto L2a
            if (r4 == 0) goto L28
            boolean r4 = r4.A0     // Catch: java.lang.Throwable -> L10
            if (r4 == 0) goto L28
            goto L2a
        L28:
            r4 = r7
            goto L2b
        L2a:
            r4 = r6
        L2b:
            r2.A0 = r4     // Catch: java.lang.Throwable -> L10
            boolean r4 = r2.q()     // Catch: java.lang.Throwable -> L10
            if (r4 != 0) goto L45
            long r4 = r10.R     // Catch: java.lang.Throwable -> L10
            boolean r4 = defpackage.q21.b(r4, r11)     // Catch: java.lang.Throwable -> L10
            if (r4 != 0) goto L3c
            goto L45
        L3c:
            te r3 = (defpackage.te) r3     // Catch: java.lang.Throwable -> L10
            r3.i(r2, r7)     // Catch: java.lang.Throwable -> L10
            r2.X()     // Catch: java.lang.Throwable -> L10
            return r7
        L45:
            tm3 r3 = r10.t0     // Catch: java.lang.Throwable -> L10
            r3.f = r7     // Catch: java.lang.Throwable -> L10
            ua4 r3 = r2.z()     // Catch: java.lang.Throwable -> L10
            java.lang.Object[] r4 = r3.A     // Catch: java.lang.Throwable -> L10
            int r3 = r3.L     // Catch: java.lang.Throwable -> L10
            r5 = r7
        L52:
            if (r5 >= r3) goto L63
            r8 = r4[r5]     // Catch: java.lang.Throwable -> L10
            sm3 r8 = (defpackage.sm3) r8     // Catch: java.lang.Throwable -> L10
            wm3 r8 = r8.C0     // Catch: java.lang.Throwable -> L10
            d34 r8 = r8.p     // Catch: java.lang.Throwable -> L10
            tm3 r8 = r8.t0     // Catch: java.lang.Throwable -> L10
            r8.c = r7     // Catch: java.lang.Throwable -> L10
            int r5 = r5 + 1
            goto L52
        L63:
            r10.f0 = r6     // Catch: java.lang.Throwable -> L10
            eg4 r3 = r0.a()     // Catch: java.lang.Throwable -> L10
            long r3 = r3.L     // Catch: java.lang.Throwable -> L10
            r10.m0(r11)     // Catch: java.lang.Throwable -> L10
            om3 r5 = r0.d     // Catch: java.lang.Throwable -> L10
            om3 r8 = defpackage.om3.Idle     // Catch: java.lang.Throwable -> L10
            if (r5 != r8) goto L75
            goto L7a
        L75:
            java.lang.String r5 = "layout state is not idle before measure starts"
            defpackage.p53.c(r5)     // Catch: java.lang.Throwable -> L10
        L7a:
            r10.x0 = r11     // Catch: java.lang.Throwable -> L10
            om3 r11 = defpackage.om3.Measuring     // Catch: java.lang.Throwable -> L10
            r0.d = r11     // Catch: java.lang.Throwable -> L10
            r10.q0 = r7     // Catch: java.lang.Throwable -> L10
            zp4 r12 = defpackage.vm3.a(r2)     // Catch: java.lang.Throwable -> L10
            te r12 = (defpackage.te) r12     // Catch: java.lang.Throwable -> L10
            bq4 r12 = r12.getSnapshotObserver()     // Catch: java.lang.Throwable -> L10
            c34 r5 = r10.y0     // Catch: java.lang.Throwable -> L10
            hh2 r9 = r12.c     // Catch: java.lang.Throwable -> L10
            qm6 r12 = r12.a     // Catch: java.lang.Throwable -> L10
            r12.d(r2, r9, r5)     // Catch: java.lang.Throwable -> L10
            om3 r12 = r0.d     // Catch: java.lang.Throwable -> L10
            if (r12 != r11) goto L9f
            r10.r0 = r6     // Catch: java.lang.Throwable -> L10
            r10.s0 = r6     // Catch: java.lang.Throwable -> L10
            r0.d = r8     // Catch: java.lang.Throwable -> L10
        L9f:
            eg4 r11 = r0.a()     // Catch: java.lang.Throwable -> L10
            long r11 = r11.L     // Catch: java.lang.Throwable -> L10
            boolean r11 = defpackage.q93.b(r11, r3)     // Catch: java.lang.Throwable -> L10
            if (r11 == 0) goto Lc1
            eg4 r11 = r0.a()     // Catch: java.lang.Throwable -> L10
            int r11 = r11.A     // Catch: java.lang.Throwable -> L10
            int r12 = r10.A     // Catch: java.lang.Throwable -> L10
            if (r11 != r12) goto Lc1
            eg4 r11 = r0.a()     // Catch: java.lang.Throwable -> L10
            int r11 = r11.B     // Catch: java.lang.Throwable -> L10
            int r12 = r10.B     // Catch: java.lang.Throwable -> L10
            if (r11 == r12) goto Lc0
            goto Lc1
        Lc0:
            r6 = r7
        Lc1:
            eg4 r11 = r0.a()     // Catch: java.lang.Throwable -> L10
            int r11 = r11.A     // Catch: java.lang.Throwable -> L10
            eg4 r12 = r0.a()     // Catch: java.lang.Throwable -> L10
            int r12 = r12.B     // Catch: java.lang.Throwable -> L10
            long r2 = (long) r11     // Catch: java.lang.Throwable -> L10
            r11 = 32
            long r2 = r2 << r11
            long r11 = (long) r12     // Catch: java.lang.Throwable -> L10
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r11 = r11 & r4
            long r11 = r11 | r2
            r10.l0(r11)     // Catch: java.lang.Throwable -> L10
            return r6
        Ldd:
            r1.Y(r10)
            r10 = 0
            throw r10
    }

    public final void F0() {
            r3 = this;
            wm3 r3 = r3.Y
            sm3 r0 = r3.a
            sm3 r1 = r3.a
            boolean r0 = r0.I()
            if (r0 == 0) goto L3c
            int r3 = r3.l
            if (r3 <= 0) goto L3c
            wm3 r3 = r1.C0
            boolean r0 = r3.j
            r2 = 0
            if (r0 != 0) goto L1b
            boolean r0 = r3.k
            if (r0 == 0) goto L24
        L1b:
            d34 r3 = r3.p
            boolean r3 = r3.r0
            if (r3 != 0) goto L24
            r1.U(r2)
        L24:
            ua4 r3 = r1.z()
            java.lang.Object[] r0 = r3.A
            int r3 = r3.L
        L2c:
            if (r2 >= r3) goto L3c
            r1 = r0[r2]
            sm3 r1 = (defpackage.sm3) r1
            wm3 r1 = r1.C0
            d34 r1 = r1.p
            r1.F0()
            int r2 = r2 + 1
            goto L2c
        L3c:
            return
    }

    @Override // defpackage.nc
    public final void G(defpackage.mc r4) {
            r3 = this;
            wm3 r3 = r3.Y
            sm3 r3 = r3.a
            ua4 r3 = r3.z()
            java.lang.Object[] r0 = r3.A
            int r3 = r3.L
            r1 = 0
        Ld:
            if (r1 >= r3) goto L1d
            r2 = r0[r1]
            sm3 r2 = (defpackage.sm3) r2
            wm3 r2 = r2.C0
            d34 r2 = r2.p
            r4.g(r2)
            int r1 = r1 + 1
            goto Ld
        L1d:
            return
    }

    @Override // defpackage.z74
    public final void H(boolean r3) {
            r2 = this;
            wm3 r0 = r2.Y
            eg4 r1 = r0.a()
            boolean r1 = r1.e0
            if (r3 == r1) goto L13
            eg4 r0 = r0.a()
            r0.e0 = r3
            r3 = 1
            r2.G0 = r3
        L13:
            return
    }

    @Override // defpackage.nc
    public final void I() {
            r12 = this;
            r0 = 1
            r12.w0 = r0
            tm3 r1 = r12.t0
            r1.h()
            boolean r2 = r12.r0
            wm3 r3 = r12.Y
            r4 = 0
            if (r2 == 0) goto L5f
            sm3 r2 = r3.a
            ua4 r2 = r2.z()
            java.lang.Object[] r5 = r2.A
            int r2 = r2.L
            r6 = r4
        L1a:
            if (r6 >= r2) goto L5f
            r7 = r5[r6]
            sm3 r7 = (defpackage.sm3) r7
            boolean r8 = r7.q()
            wm3 r9 = r7.C0
            if (r8 == 0) goto L5c
            qm3 r8 = r7.s()
            qm3 r10 = defpackage.qm3.InMeasureBlock
            if (r8 != r10) goto L5c
            d34 r8 = r9.p
            boolean r10 = r8.f0
            if (r10 == 0) goto L3e
            long r10 = r8.R
            q21 r8 = new q21
            r8.<init>(r10)
            goto L3f
        L3e:
            r8 = 0
        L3f:
            if (r8 == 0) goto L53
            qm3 r10 = r7.y0
            qm3 r11 = defpackage.qm3.NotUsed
            if (r10 != r11) goto L4a
            r7.e()
        L4a:
            d34 r7 = r9.p
            long r8 = r8.a
            boolean r7 = r7.C0(r8)
            goto L54
        L53:
            r7 = r4
        L54:
            if (r7 == 0) goto L5c
            sm3 r7 = r3.a
            r8 = 7
            defpackage.sm3.V(r7, r4, r8)
        L5c:
            int r6 = r6 + 1
            goto L1a
        L5f:
            boolean r2 = r12.s0
            if (r2 != 0) goto L73
            boolean r2 = r12.i0
            if (r2 != 0) goto L97
            y53 r2 = r12.f()
            boolean r2 = r2.g0
            if (r2 != 0) goto L97
            boolean r2 = r12.r0
            if (r2 == 0) goto L97
        L73:
            r12.r0 = r4
            om3 r2 = r3.d
            om3 r5 = defpackage.om3.LayingOut
            r3.d = r5
            r3.g(r4)
            sm3 r5 = r3.a
            zp4 r6 = defpackage.vm3.a(r5)
            te r6 = (defpackage.te) r6
            bq4 r6 = r6.getSnapshotObserver()
            hh2 r7 = r6.e
            qm6 r6 = r6.a
            c34 r8 = r12.z0
            r6.d(r5, r7, r8)
            r3.d = r2
            r12.s0 = r4
        L97:
            boolean r2 = r1.d
            if (r2 == 0) goto L9d
            r1.e = r0
        L9d:
            boolean r0 = r1.b
            if (r0 == 0) goto Laa
            boolean r0 = r1.e()
            if (r0 == 0) goto Laa
            r1.g()
        Laa:
            r12.w0 = r4
            return
    }

    @Override // defpackage.nc
    public final void S() {
            r2 = this;
            wm3 r2 = r2.Y
            sm3 r2 = r2.a
            r0 = 0
            r1 = 7
            defpackage.sm3.V(r2, r0, r1)
            return
    }

    @Override // defpackage.x24
    public final int V(int r3) {
            r2 = this;
            wm3 r0 = r2.Y
            sm3 r1 = r0.a
            boolean r1 = defpackage.bl2.J(r1)
            if (r1 == 0) goto L14
            rz3 r2 = r0.q
            r2.getClass()
            int r2 = r2.V(r3)
            return r2
        L14:
            r2.x0()
            eg4 r2 = r0.a()
            int r2 = r2.V(r3)
            return r2
    }

    @Override // defpackage.dx4
    public final int X(defpackage.ey2 r7) {
            r6 = this;
            wm3 r0 = r6.Y
            sm3 r1 = r0.a
            sm3 r1 = r1.v()
            r2 = 0
            if (r1 == 0) goto L10
            wm3 r1 = r1.C0
            om3 r1 = r1.d
            goto L11
        L10:
            r1 = r2
        L11:
            om3 r3 = defpackage.om3.Measuring
            tm3 r4 = r6.t0
            r5 = 1
            if (r1 != r3) goto L1b
            r4.c = r5
            goto L2d
        L1b:
            sm3 r1 = r0.a
            sm3 r1 = r1.v()
            if (r1 == 0) goto L27
            wm3 r1 = r1.C0
            om3 r2 = r1.d
        L27:
            om3 r1 = defpackage.om3.LayingOut
            if (r2 != r1) goto L2d
            r4.d = r5
        L2d:
            r6.i0 = r5
            eg4 r0 = r0.a()
            int r7 = r0.X(r7)
            r0 = 0
            r6.i0 = r0
            return r7
    }

    @Override // defpackage.dx4
    public final int Z() {
            r0 = this;
            wm3 r0 = r0.Y
            eg4 r0 = r0.a()
            int r0 = r0.Z()
            return r0
    }

    @Override // defpackage.nc
    public final defpackage.tm3 b() {
            r0 = this;
            tm3 r0 = r0.t0
            return r0
    }

    @Override // defpackage.x24
    public final int c(int r3) {
            r2 = this;
            wm3 r0 = r2.Y
            sm3 r1 = r0.a
            boolean r1 = defpackage.bl2.J(r1)
            if (r1 == 0) goto L14
            rz3 r2 = r0.q
            r2.getClass()
            int r2 = r2.c(r3)
            return r2
        L14:
            r2.x0()
            eg4 r2 = r0.a()
            int r2 = r2.c(r3)
            return r2
    }

    @Override // defpackage.dx4
    public final int d0() {
            r0 = this;
            wm3 r0 = r0.Y
            eg4 r0 = r0.a()
            int r0 = r0.d0()
            return r0
    }

    @Override // defpackage.nc
    public final defpackage.y53 f() {
            r0 = this;
            wm3 r0 = r0.Y
            sm3 r0 = r0.a
            if0 r0 = r0.B0
            java.lang.Object r0 = r0.d
            y53 r0 = (defpackage.y53) r0
            return r0
    }

    @Override // defpackage.dx4
    public final void h0(long r9, float r11, defpackage.qn2 r12) {
            r8 = this;
            wm3 r0 = r8.Y
            sm3 r1 = r0.a
            sm3 r2 = r0.a
            r3 = 1
            r8.p0 = r3     // Catch: java.lang.Throwable -> L1b
            long r4 = r8.j0     // Catch: java.lang.Throwable -> L1b
            boolean r4 = defpackage.i93.a(r9, r4)     // Catch: java.lang.Throwable -> L1b
            r5 = 0
            if (r4 == 0) goto L1e
            qn2 r4 = r8.k0     // Catch: java.lang.Throwable -> L1b
            if (r12 != r4) goto L1e
            boolean r4 = r8.G0     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L2e
            goto L1e
        L1b:
            r8 = move-exception
            goto L99
        L1e:
            boolean r4 = r0.k     // Catch: java.lang.Throwable -> L1b
            if (r4 != 0) goto L2a
            boolean r4 = r0.j     // Catch: java.lang.Throwable -> L1b
            if (r4 != 0) goto L2a
            boolean r4 = r8.G0     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L2e
        L2a:
            r8.r0 = r3     // Catch: java.lang.Throwable -> L1b
            r8.G0 = r5     // Catch: java.lang.Throwable -> L1b
        L2e:
            rz3 r4 = r0.q     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L45
            wm3 r6 = r4.Y     // Catch: java.lang.Throwable -> L1b
            oz3 r4 = r4.m0     // Catch: java.lang.Throwable -> L1b
            oz3 r7 = defpackage.oz3.IsNotPlaced     // Catch: java.lang.Throwable -> L1b
            if (r4 != r7) goto L45
            sm3 r4 = r6.a     // Catch: java.lang.Throwable -> L1b
            boolean r4 = defpackage.bl2.J(r4)     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L43
            goto L45
        L43:
            r6.c = r3     // Catch: java.lang.Throwable -> L1b
        L45:
            rz3 r4 = r0.q     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L88
            boolean r4 = r4.s0()     // Catch: java.lang.Throwable -> L1b
            if (r4 != r3) goto L88
            eg4 r3 = r0.a()     // Catch: java.lang.Throwable -> L1b
            eg4 r3 = r3.o0     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L5b
            lz3 r3 = r3.h0     // Catch: java.lang.Throwable -> L1b
            if (r3 != 0) goto L65
        L5b:
            zp4 r3 = defpackage.vm3.a(r2)     // Catch: java.lang.Throwable -> L1b
            te r3 = (defpackage.te) r3     // Catch: java.lang.Throwable -> L1b
            cx4 r3 = r3.getPlacementScope()     // Catch: java.lang.Throwable -> L1b
        L65:
            rz3 r4 = r0.q     // Catch: java.lang.Throwable -> L1b
            r4.getClass()     // Catch: java.lang.Throwable -> L1b
            sm3 r2 = r2.v()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L74
            wm3 r2 = r2.C0     // Catch: java.lang.Throwable -> L1b
            r2.h = r5     // Catch: java.lang.Throwable -> L1b
        L74:
            r2 = 2147483647(0x7fffffff, float:NaN)
            r4.e0 = r2     // Catch: java.lang.Throwable -> L1b
            r2 = 32
            long r5 = r9 >> r2
            int r2 = (int) r5     // Catch: java.lang.Throwable -> L1b
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r9
            int r5 = (int) r5     // Catch: java.lang.Throwable -> L1b
            defpackage.cx4.j(r3, r4, r2, r5)     // Catch: java.lang.Throwable -> L1b
        L88:
            rz3 r0 = r0.q     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L95
            boolean r0 = r0.h0     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L95
            java.lang.String r0 = "Error: Placement happened before lookahead."
            defpackage.p53.c(r0)     // Catch: java.lang.Throwable -> L1b
        L95:
            r8.A0(r9, r11, r12)     // Catch: java.lang.Throwable -> L1b
            return
        L99:
            r1.Y(r8)
            r8 = 0
            throw r8
    }

    @Override // defpackage.nc
    public final defpackage.nc j() {
            r0 = this;
            wm3 r0 = r0.Y
            sm3 r0 = r0.a
            sm3 r0 = r0.v()
            if (r0 == 0) goto L11
            wm3 r0 = r0.C0
            if (r0 == 0) goto L11
            d34 r0 = r0.p
            return r0
        L11:
            r0 = 0
            return r0
    }

    @Override // defpackage.x24
    public final int n(int r3) {
            r2 = this;
            wm3 r0 = r2.Y
            sm3 r1 = r0.a
            boolean r1 = defpackage.bl2.J(r1)
            if (r1 == 0) goto L14
            rz3 r2 = r0.q
            r2.getClass()
            int r2 = r2.n(r3)
            return r2
        L14:
            r2.x0()
            eg4 r2 = r0.a()
            int r2 = r2.n(r3)
            return r2
    }

    @Override // defpackage.nc
    public final int o() {
            r0 = this;
            int r0 = r0.e0
            return r0
    }

    @Override // defpackage.nc
    public final void requestLayout() {
            r1 = this;
            wm3 r1 = r1.Y
            sm3 r1 = r1.a
            r0 = 0
            r1.U(r0)
            return
    }

    public final java.util.List s0() {
            r9 = this;
            wm3 r0 = r9.Y
            sm3 r1 = r0.a
            r1.f0()
            boolean r1 = r9.v0
            ua4 r2 = r9.u0
            if (r1 != 0) goto L12
            java.util.List r9 = r2.f()
            return r9
        L12:
            sm3 r0 = r0.a
            ua4 r1 = r0.z()
            java.lang.Object[] r3 = r1.A
            int r1 = r1.L
            r4 = 0
            r5 = r4
        L1e:
            if (r5 >= r1) goto L3d
            r6 = r3[r5]
            sm3 r6 = (defpackage.sm3) r6
            int r7 = r2.L
            if (r7 > r5) goto L30
            wm3 r6 = r6.C0
            d34 r6 = r6.p
            r2.b(r6)
            goto L3a
        L30:
            wm3 r6 = r6.C0
            d34 r6 = r6.p
            java.lang.Object[] r7 = r2.A
            r8 = r7[r5]
            r7[r5] = r6
        L3a:
            int r5 = r5 + 1
            goto L1e
        L3d:
            java.util.List r0 = r0.n()
            aa4 r0 = (defpackage.aa4) r0
            java.lang.Object r0 = r0.B
            ua4 r0 = (defpackage.ua4) r0
            int r0 = r0.L
            int r1 = r2.L
            r2.m(r0, r1)
            r9.v0 = r4
            java.util.List r9 = r2.f()
            return r9
    }

    @Override // defpackage.x24
    public final int u(int r3) {
            r2 = this;
            wm3 r0 = r2.Y
            sm3 r1 = r0.a
            boolean r1 = defpackage.bl2.J(r1)
            if (r1 == 0) goto L14
            rz3 r2 = r0.q
            r2.getClass()
            int r2 = r2.u(r3)
            return r2
        L14:
            r2.x0()
            eg4 r2 = r0.a()
            int r2 = r2.u(r3)
            return r2
    }

    public final void u0() {
            r5 = this;
            boolean r0 = r5.o0
            r1 = 1
            r5.o0 = r1
            wm3 r5 = r5.Y
            sm3 r2 = r5.a
            if0 r3 = r2.B0
            if (r0 != 0) goto L37
            java.lang.Object r0 = r3.d
            y53 r0 = (defpackage.y53) r0
            r0.j1()
            zp4 r0 = defpackage.vm3.a(r2)
            te r0 = (defpackage.te) r0
            rf5 r0 = r0.getRectManager()
            sm3 r5 = r5.a
            r0.f(r5)
            boolean r5 = r2.q()
            r0 = 6
            if (r5 == 0) goto L2e
            defpackage.sm3.V(r2, r1, r0)
            goto L37
        L2e:
            wm3 r5 = r2.C0
            boolean r5 = r5.e
            if (r5 == 0) goto L37
            defpackage.sm3.T(r2, r1, r0)
        L37:
            java.lang.Object r5 = r3.e
            eg4 r5 = (defpackage.eg4) r5
            java.lang.Object r0 = r3.d
            y53 r0 = (defpackage.y53) r0
            eg4 r0 = r0.n0
        L41:
            boolean r1 = defpackage.nb3.k(r5, r0)
            if (r1 != 0) goto L53
            if (r5 == 0) goto L53
            boolean r1 = r5.I0
            if (r1 == 0) goto L50
            r5.f1()
        L50:
            eg4 r5 = r5.n0
            goto L41
        L53:
            ua4 r5 = r2.z()
            java.lang.Object[] r0 = r5.A
            int r5 = r5.L
            r1 = 0
        L5c:
            if (r1 >= r5) goto L78
            r2 = r0[r1]
            sm3 r2 = (defpackage.sm3) r2
            int r3 = r2.w()
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r4) goto L75
            wm3 r3 = r2.C0
            d34 r3 = r3.p
            r3.u0()
            defpackage.sm3.W(r2)
        L75:
            int r1 = r1 + 1
            goto L5c
        L78:
            return
    }

    public final void w0() {
            r4 = this;
            boolean r0 = r4.o0
            if (r0 == 0) goto L4f
            r0 = 0
            r4.o0 = r0
            wm3 r4 = r4.Y
            sm3 r1 = r4.a
            sm3 r4 = r4.a
            zp4 r1 = defpackage.vm3.a(r1)
            te r1 = (defpackage.te) r1
            rf5 r1 = r1.getRectManager()
            r1.g(r4)
            if0 r1 = r4.B0
            java.lang.Object r2 = r1.e
            eg4 r2 = (defpackage.eg4) r2
            java.lang.Object r1 = r1.d
            y53 r1 = (defpackage.y53) r1
            eg4 r1 = r1.n0
        L26:
            boolean r3 = defpackage.nb3.k(r2, r1)
            if (r3 != 0) goto L37
            if (r2 == 0) goto L37
            r2.l1()
            r2.q1()
            eg4 r2 = r2.n0
            goto L26
        L37:
            ua4 r4 = r4.z()
            java.lang.Object[] r1 = r4.A
            int r4 = r4.L
        L3f:
            if (r0 >= r4) goto L4f
            r2 = r1[r0]
            sm3 r2 = (defpackage.sm3) r2
            wm3 r2 = r2.C0
            d34 r2 = r2.p
            r2.w0()
            int r0 = r0 + 1
            goto L3f
        L4f:
            return
    }

    public final void x0() {
            r3 = this;
            wm3 r3 = r3.Y
            sm3 r0 = r3.a
            r1 = 0
            r2 = 7
            defpackage.sm3.V(r0, r1, r2)
            sm3 r3 = r3.a
            sm3 r0 = r3.v()
            if (r0 == 0) goto L33
            qm3 r1 = r3.y0
            qm3 r2 = defpackage.qm3.NotUsed
            if (r1 != r2) goto L33
            wm3 r1 = r0.C0
            om3 r1 = r1.d
            int[] r2 = defpackage.b34.a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L2f
            r2 = 2
            if (r1 == r2) goto L2c
            qm3 r0 = r0.y0
            goto L31
        L2c:
            qm3 r0 = defpackage.qm3.InLayoutBlock
            goto L31
        L2f:
            qm3 r0 = defpackage.qm3.InMeasureBlock
        L31:
            r3.y0 = r0
        L33:
            return
    }

    @Override // defpackage.x24
    public final defpackage.dx4 y(long r6) {
            r5 = this;
            wm3 r0 = r5.Y
            sm3 r1 = r0.a
            sm3 r2 = r0.a
            qm3 r3 = r1.y0
            qm3 r4 = defpackage.qm3.NotUsed
            if (r3 != r4) goto Lf
            r1.e()
        Lf:
            boolean r1 = defpackage.bl2.J(r2)
            if (r1 == 0) goto L1f
            rz3 r0 = r0.q
            r0.getClass()
            r0.f0 = r4
            r0.y(r6)
        L1f:
            sm3 r0 = r2.v()
            if (r0 == 0) goto L56
            wm3 r0 = r0.C0
            qm3 r1 = r5.h0
            if (r1 == r4) goto L35
            boolean r1 = r2.A0
            if (r1 == 0) goto L30
            goto L35
        L30:
            java.lang.String r1 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            defpackage.p53.c(r1)
        L35:
            om3 r1 = r0.d
            int[] r2 = defpackage.b34.a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L51
            r2 = 2
            if (r1 != r2) goto L48
            qm3 r0 = defpackage.qm3.InLayoutBlock
            goto L53
        L48:
            java.lang.String r5 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            om3 r6 = r0.d
            defpackage.e41.z(r6, r5)
            r5 = 0
            return r5
        L51:
            qm3 r0 = defpackage.qm3.InMeasureBlock
        L53:
            r5.h0 = r0
            goto L58
        L56:
            r5.h0 = r4
        L58:
            r5.C0(r6)
            return r5
    }

    public final void z0() {
            r7 = this;
            r0 = 1
            r7.B0 = r0
            wm3 r1 = r7.Y
            sm3 r2 = r1.a
            sm3 r2 = r2.v()
            y53 r3 = r7.f()
            float r3 = r3.y0
            sm3 r1 = r1.a
            if0 r4 = r1.B0
            java.lang.Object r5 = r4.e
            eg4 r5 = (defpackage.eg4) r5
            java.lang.Object r4 = r4.d
            y53 r4 = (defpackage.y53) r4
        L1d:
            if (r5 == r4) goto L2a
            r5.getClass()
            mm3 r5 = (defpackage.mm3) r5
            float r6 = r5.y0
            float r3 = r3 + r6
            eg4 r5 = r5.n0
            goto L1d
        L2a:
            float r4 = r7.A0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 != 0) goto L31
            goto L3d
        L31:
            r7.A0 = r3
            if (r2 == 0) goto L38
            r2.O()
        L38:
            if (r2 == 0) goto L3d
            r2.C()
        L3d:
            y53 r3 = r7.f()
            boolean r3 = r3.g0
            r4 = 0
            if (r3 != 0) goto L6f
            boolean r3 = r7.o0
            if (r3 == 0) goto L52
            tm3 r5 = r7.t0
            boolean r5 = r5.d()
            if (r5 == 0) goto L55
        L52:
            r7.u0()
        L55:
            if (r3 != 0) goto L66
            if (r2 == 0) goto L5c
            r2.C()
        L5c:
            boolean r1 = r7.Z
            if (r1 == 0) goto L6f
            if (r2 == 0) goto L6f
            r2.U(r4)
            goto L6f
        L66:
            if0 r1 = r1.B0
            java.lang.Object r1 = r1.d
            y53 r1 = (defpackage.y53) r1
            r1.j1()
        L6f:
            if (r2 == 0) goto L92
            wm3 r1 = r2.C0
            boolean r2 = r7.Z
            if (r2 != 0) goto L94
            om3 r2 = r1.d
            om3 r3 = defpackage.om3.LayingOut
            if (r2 != r3) goto L94
            int r2 = r7.e0
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r3) goto L85
            goto L8a
        L85:
            java.lang.String r2 = "Place was called on a node which was placed already"
            defpackage.p53.c(r2)
        L8a:
            int r2 = r1.i
            r7.e0 = r2
            int r2 = r2 + r0
            r1.i = r2
            goto L94
        L92:
            r7.e0 = r4
        L94:
            r7.I()
            return
    }
}
