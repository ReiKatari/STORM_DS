package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rz3  reason: default package */
/* loaded from: classes.dex */
public final class rz3 extends defpackage.dx4 implements defpackage.x24, defpackage.nc, defpackage.z74 {
    public final defpackage.wm3 Y;
    public boolean Z;
    public int d0;
    public int e0;
    public defpackage.qm3 f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public defpackage.q21 j0;
    public long k0;
    public defpackage.qn2 l0;
    public defpackage.oz3 m0;
    public final defpackage.tm3 n0;
    public final defpackage.ua4 o0;
    public boolean p0;
    public boolean q0;
    public final defpackage.qz3 r0;
    public boolean s0;
    public java.lang.Object t0;
    public long u0;
    public final defpackage.qz3 v0;
    public final defpackage.qz3 w0;
    public boolean x0;

    public rz3(defpackage.wm3 r4) {
            r3 = this;
            r3.<init>()
            r3.Y = r4
            r0 = 2147483647(0x7fffffff, float:NaN)
            r3.d0 = r0
            r3.e0 = r0
            qm3 r0 = defpackage.qm3.NotUsed
            r3.f0 = r0
            r0 = 0
            r3.k0 = r0
            oz3 r0 = defpackage.oz3.IsNotPlaced
            r3.m0 = r0
            tm3 r0 = new tm3
            r1 = 1
            r0.<init>(r3, r1)
            r3.n0 = r0
            ua4 r0 = new ua4
            r1 = 16
            rz3[] r1 = new defpackage.rz3[r1]
            r0.<init>(r1)
            r3.o0 = r0
            r0 = 1
            r3.p0 = r0
            qz3 r1 = new qz3
            r2 = 0
            r1.<init>(r3, r2)
            r3.r0 = r1
            r3.s0 = r0
            d34 r4 = r4.p
            java.lang.Object r4 = r4.n0
            r3.t0 = r4
            r4 = 0
            r0 = 15
            long r0 = defpackage.s21.b(r4, r4, r4, r4, r0)
            r3.u0 = r0
            qz3 r4 = new qz3
            r0 = 2
            r4.<init>(r3, r0)
            r3.v0 = r4
            qz3 r4 = new qz3
            r0 = 1
            r4.<init>(r3, r0)
            r3.w0 = r4
            return
    }

    public final void A0() {
            r6 = this;
            r0 = 1
            r6.x0 = r0
            wm3 r1 = r6.Y
            sm3 r2 = r1.a
            sm3 r2 = r2.v()
            oz3 r3 = r6.m0
            oz3 r4 = defpackage.oz3.IsPlacedInLookahead
            r5 = 0
            if (r3 == r4) goto L16
            boolean r4 = r1.c
            if (r4 == 0) goto L1e
        L16:
            oz3 r4 = defpackage.oz3.IsPlacedInApproach
            if (r3 == r4) goto L2a
            boolean r1 = r1.c
            if (r1 == 0) goto L2a
        L1e:
            r6.w0()
            boolean r1 = r6.Z
            if (r1 == 0) goto L2a
            if (r2 == 0) goto L2a
            r2.S(r5)
        L2a:
            if (r2 == 0) goto L51
            wm3 r1 = r2.C0
            boolean r2 = r6.Z
            if (r2 != 0) goto L53
            om3 r2 = r1.d
            om3 r3 = defpackage.om3.LayingOut
            if (r2 == r3) goto L3c
            om3 r3 = defpackage.om3.LookaheadLayingOut
            if (r2 != r3) goto L53
        L3c:
            int r2 = r6.e0
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r3) goto L44
            goto L49
        L44:
            java.lang.String r2 = "Place was called on a node which was placed already"
            defpackage.p53.c(r2)
        L49:
            int r2 = r1.h
            r6.e0 = r2
            int r2 = r2 + r0
            r1.h = r2
            goto L53
        L51:
            r6.e0 = r5
        L53:
            r6.I()
            return
    }

    @Override // defpackage.dx4, defpackage.x24
    public final java.lang.Object B() {
            r0 = this;
            java.lang.Object r0 = r0.t0
            return r0
    }

    public final void C0(long r10, defpackage.qn2 r12) {
            r9 = this;
            wm3 r0 = r9.Y
            sm3 r1 = r0.a
            sm3 r2 = r0.a
            r3 = 0
            sm3 r4 = r1.v()     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L12
            wm3 r4 = r4.C0     // Catch: java.lang.Throwable -> L1b
            om3 r4 = r4.d     // Catch: java.lang.Throwable -> L1b
            goto L13
        L12:
            r4 = r3
        L13:
            om3 r5 = defpackage.om3.LookaheadLayingOut     // Catch: java.lang.Throwable -> L1b
            r6 = 0
            if (r4 != r5) goto L1d
            r0.c = r6     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r9 = move-exception
            goto L8b
        L1d:
            boolean r4 = r2.K0     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L26
            java.lang.String r4 = "place is called on a deactivated node"
            defpackage.p53.a(r4)     // Catch: java.lang.Throwable -> L1b
        L26:
            r0.d = r5     // Catch: java.lang.Throwable -> L1b
            r4 = 1
            r9.h0 = r4     // Catch: java.lang.Throwable -> L1b
            r9.x0 = r6     // Catch: java.lang.Throwable -> L1b
            long r7 = r9.k0     // Catch: java.lang.Throwable -> L1b
            boolean r5 = defpackage.i93.a(r10, r7)     // Catch: java.lang.Throwable -> L1b
            if (r5 != 0) goto L42
            boolean r5 = r0.n     // Catch: java.lang.Throwable -> L1b
            if (r5 != 0) goto L3d
            boolean r5 = r0.m     // Catch: java.lang.Throwable -> L1b
            if (r5 == 0) goto L3f
        L3d:
            r0.f = r4     // Catch: java.lang.Throwable -> L1b
        L3f:
            r9.x0()     // Catch: java.lang.Throwable -> L1b
        L42:
            zp4 r5 = defpackage.vm3.a(r2)     // Catch: java.lang.Throwable -> L1b
            r9.k0 = r10     // Catch: java.lang.Throwable -> L1b
            boolean r7 = r0.f     // Catch: java.lang.Throwable -> L1b
            if (r7 != 0) goto L6e
            oz3 r7 = r9.m0     // Catch: java.lang.Throwable -> L1b
            oz3 r8 = defpackage.oz3.IsNotPlaced     // Catch: java.lang.Throwable -> L1b
            if (r7 == r8) goto L53
            goto L54
        L53:
            r4 = r6
        L54:
            if (r4 == 0) goto L6e
            eg4 r2 = r0.a()     // Catch: java.lang.Throwable -> L1b
            mz3 r2 = r2.W0()     // Catch: java.lang.Throwable -> L1b
            r2.getClass()     // Catch: java.lang.Throwable -> L1b
            long r4 = r2.X     // Catch: java.lang.Throwable -> L1b
            long r10 = defpackage.i93.c(r10, r4)     // Catch: java.lang.Throwable -> L1b
            r2.Q0(r10)     // Catch: java.lang.Throwable -> L1b
            r9.A0()     // Catch: java.lang.Throwable -> L1b
            goto L84
        L6e:
            r0.h(r6)     // Catch: java.lang.Throwable -> L1b
            tm3 r10 = r9.n0     // Catch: java.lang.Throwable -> L1b
            r10.g = r6     // Catch: java.lang.Throwable -> L1b
            te r5 = (defpackage.te) r5     // Catch: java.lang.Throwable -> L1b
            bq4 r10 = r5.getSnapshotObserver()     // Catch: java.lang.Throwable -> L1b
            qz3 r11 = r9.w0     // Catch: java.lang.Throwable -> L1b
            hh2 r4 = r10.g     // Catch: java.lang.Throwable -> L1b
            qm6 r10 = r10.a     // Catch: java.lang.Throwable -> L1b
            r10.d(r2, r4, r11)     // Catch: java.lang.Throwable -> L1b
        L84:
            r9.l0 = r12     // Catch: java.lang.Throwable -> L1b
            om3 r9 = defpackage.om3.Idle     // Catch: java.lang.Throwable -> L1b
            r0.d = r9     // Catch: java.lang.Throwable -> L1b
            return
        L8b:
            r1.Y(r9)
            throw r3
    }

    public final boolean F0(long r14) {
            r13 = this;
            wm3 r0 = r13.Y
            sm3 r1 = r0.a
            sm3 r2 = r0.a
            boolean r3 = r1.K0     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L13
            java.lang.String r3 = "measure is called on a deactivated node"
            defpackage.p53.a(r3)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r13 = move-exception
            goto Lbb
        L13:
            sm3 r3 = r2.v()     // Catch: java.lang.Throwable -> L10
            boolean r4 = r2.A0     // Catch: java.lang.Throwable -> L10
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L26
            if (r3 == 0) goto L24
            boolean r3 = r3.A0     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L24
            goto L26
        L24:
            r3 = r6
            goto L27
        L26:
            r3 = r5
        L27:
            r2.A0 = r3     // Catch: java.lang.Throwable -> L10
            wm3 r3 = r2.C0     // Catch: java.lang.Throwable -> L10
            boolean r3 = r3.e     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L4b
            q21 r3 = r13.j0     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L35
            r3 = r6
            goto L3b
        L35:
            long r3 = r3.a     // Catch: java.lang.Throwable -> L10
            boolean r3 = defpackage.q21.b(r3, r14)     // Catch: java.lang.Throwable -> L10
        L3b:
            if (r3 != 0) goto L3e
            goto L4b
        L3e:
            zp4 r13 = r2.k0     // Catch: java.lang.Throwable -> L10
            if (r13 == 0) goto L47
            te r13 = (defpackage.te) r13     // Catch: java.lang.Throwable -> L10
            r13.i(r2, r5)     // Catch: java.lang.Throwable -> L10
        L47:
            r2.X()     // Catch: java.lang.Throwable -> L10
            return r6
        L4b:
            q21 r3 = new q21     // Catch: java.lang.Throwable -> L10
            r3.<init>(r14)     // Catch: java.lang.Throwable -> L10
            r13.j0 = r3     // Catch: java.lang.Throwable -> L10
            r13.m0(r14)     // Catch: java.lang.Throwable -> L10
            tm3 r3 = r13.n0     // Catch: java.lang.Throwable -> L10
            r3.f = r6     // Catch: java.lang.Throwable -> L10
            ua4 r2 = r2.z()     // Catch: java.lang.Throwable -> L10
            java.lang.Object[] r3 = r2.A     // Catch: java.lang.Throwable -> L10
            int r2 = r2.L     // Catch: java.lang.Throwable -> L10
            r4 = r6
        L62:
            if (r4 >= r2) goto L76
            r7 = r3[r4]     // Catch: java.lang.Throwable -> L10
            sm3 r7 = (defpackage.sm3) r7     // Catch: java.lang.Throwable -> L10
            wm3 r7 = r7.C0     // Catch: java.lang.Throwable -> L10
            rz3 r7 = r7.q     // Catch: java.lang.Throwable -> L10
            r7.getClass()     // Catch: java.lang.Throwable -> L10
            tm3 r7 = r7.n0     // Catch: java.lang.Throwable -> L10
            r7.c = r6     // Catch: java.lang.Throwable -> L10
            int r4 = r4 + 1
            goto L62
        L76:
            boolean r2 = r13.i0     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L7d
            long r2 = r13.L     // Catch: java.lang.Throwable -> L10
            goto L82
        L7d:
            r2 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
        L82:
            r13.i0 = r5     // Catch: java.lang.Throwable -> L10
            eg4 r4 = r0.a()     // Catch: java.lang.Throwable -> L10
            mz3 r4 = r4.W0()     // Catch: java.lang.Throwable -> L10
            if (r4 == 0) goto L8f
            goto L94
        L8f:
            java.lang.String r7 = "Lookahead result from lookaheadRemeasure cannot be null"
            defpackage.p53.c(r7)     // Catch: java.lang.Throwable -> L10
        L94:
            r0.c(r14)     // Catch: java.lang.Throwable -> L10
            int r14 = r4.A     // Catch: java.lang.Throwable -> L10
            int r15 = r4.B     // Catch: java.lang.Throwable -> L10
            long r7 = (long) r14     // Catch: java.lang.Throwable -> L10
            r14 = 32
            long r7 = r7 << r14
            long r9 = (long) r15     // Catch: java.lang.Throwable -> L10
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r11
            long r7 = r7 | r9
            r13.l0(r7)     // Catch: java.lang.Throwable -> L10
            long r13 = r2 >> r14
            int r13 = (int) r13     // Catch: java.lang.Throwable -> L10
            int r14 = r4.A     // Catch: java.lang.Throwable -> L10
            if (r13 != r14) goto Lba
            long r13 = r2 & r11
            int r13 = (int) r13     // Catch: java.lang.Throwable -> L10
            int r14 = r4.B     // Catch: java.lang.Throwable -> L10
            if (r13 == r14) goto Lb9
            goto Lba
        Lb9:
            return r6
        Lba:
            return r5
        Lbb:
            r1.Y(r13)
            r13 = 0
            throw r13
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
            if (r1 >= r3) goto L20
            r2 = r0[r1]
            sm3 r2 = (defpackage.sm3) r2
            wm3 r2 = r2.C0
            rz3 r2 = r2.q
            r2.getClass()
            r4.g(r2)
            int r1 = r1 + 1
            goto Ld
        L20:
            return
    }

    @Override // defpackage.z74
    public final void H(boolean r3) {
            r2 = this;
            wm3 r2 = r2.Y
            eg4 r0 = r2.a()
            mz3 r0 = r0.W0()
            if (r0 == 0) goto L13
            boolean r0 = r0.e0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L14
        L13:
            r0 = 0
        L14:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2a
            eg4 r2 = r2.a()
            mz3 r2 = r2.W0()
            if (r2 == 0) goto L2a
            r2.e0 = r3
        L2a:
            return
    }

    @Override // defpackage.nc
    public final void I() {
            r11 = this;
            r0 = 1
            r11.q0 = r0
            tm3 r1 = r11.n0
            r1.h()
            wm3 r2 = r11.Y
            boolean r3 = r2.f
            sm3 r4 = r2.a
            r5 = 0
            if (r3 == 0) goto L4d
            ua4 r3 = r4.z()
            java.lang.Object[] r6 = r3.A
            int r3 = r3.L
            r7 = r5
        L1a:
            if (r7 >= r3) goto L4d
            r8 = r6[r7]
            sm3 r8 = (defpackage.sm3) r8
            wm3 r9 = r8.C0
            boolean r10 = r9.e
            if (r10 == 0) goto L4a
            qm3 r8 = r8.t()
            qm3 r10 = defpackage.qm3.InMeasureBlock
            if (r8 != r10) goto L4a
            rz3 r8 = r9.q
            r8.getClass()
            rz3 r9 = r9.q
            if (r9 == 0) goto L3a
            q21 r9 = r9.j0
            goto L3b
        L3a:
            r9 = 0
        L3b:
            r9.getClass()
            long r9 = r9.a
            boolean r8 = r8.F0(r9)
            if (r8 == 0) goto L4a
            r8 = 7
            defpackage.sm3.T(r4, r5, r8)
        L4a:
            int r7 = r7 + 1
            goto L1a
        L4d:
            y53 r3 = r11.f()
            x53 r3 = r3.Q0
            r3.getClass()
            boolean r6 = r2.g
            if (r6 != 0) goto L66
            boolean r6 = r11.g0
            if (r6 != 0) goto L93
            boolean r6 = r3.g0
            if (r6 != 0) goto L93
            boolean r6 = r2.f
            if (r6 == 0) goto L93
        L66:
            r2.f = r5
            om3 r6 = r2.d
            om3 r7 = defpackage.om3.LookaheadLayingOut
            r2.d = r7
            r2.i(r5)
            zp4 r7 = defpackage.vm3.a(r4)
            te r7 = (defpackage.te) r7
            bq4 r7 = r7.getSnapshotObserver()
            hh2 r8 = r7.h
            qm6 r7 = r7.a
            qz3 r9 = r11.r0
            r7.d(r4, r8, r9)
            r2.d = r6
            boolean r4 = r2.m
            if (r4 == 0) goto L91
            boolean r3 = r3.g0
            if (r3 == 0) goto L91
            r11.requestLayout()
        L91:
            r2.g = r5
        L93:
            boolean r2 = r1.d
            if (r2 == 0) goto L99
            r1.e = r0
        L99:
            boolean r0 = r1.b
            if (r0 == 0) goto La6
            boolean r0 = r1.e()
            if (r0 == 0) goto La6
            r1.g()
        La6:
            r11.q0 = r5
            return
    }

    @Override // defpackage.nc
    public final void S() {
            r2 = this;
            wm3 r2 = r2.Y
            sm3 r2 = r2.a
            r0 = 0
            r1 = 7
            defpackage.sm3.T(r2, r0, r1)
            return
    }

    @Override // defpackage.x24
    public final int V(int r1) {
            r0 = this;
            r0.z0()
            wm3 r0 = r0.Y
            eg4 r0 = r0.a()
            mz3 r0 = r0.W0()
            r0.getClass()
            int r0 = r0.V(r1)
            return r0
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
            om3 r3 = defpackage.om3.LookaheadMeasuring
            tm3 r4 = r6.n0
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
            om3 r1 = defpackage.om3.LookaheadLayingOut
            if (r2 != r1) goto L2d
            r4.d = r5
        L2d:
            r6.g0 = r5
            eg4 r0 = r0.a()
            mz3 r0 = r0.W0()
            r0.getClass()
            int r7 = r0.X(r7)
            r0 = 0
            r6.g0 = r0
            return r7
    }

    @Override // defpackage.dx4
    public final int Z() {
            r0 = this;
            wm3 r0 = r0.Y
            eg4 r0 = r0.a()
            mz3 r0 = r0.W0()
            r0.getClass()
            int r0 = r0.Z()
            return r0
    }

    @Override // defpackage.nc
    public final defpackage.tm3 b() {
            r0 = this;
            tm3 r0 = r0.n0
            return r0
    }

    @Override // defpackage.x24
    public final int c(int r1) {
            r0 = this;
            r0.z0()
            wm3 r0 = r0.Y
            eg4 r0 = r0.a()
            mz3 r0 = r0.W0()
            r0.getClass()
            int r0 = r0.c(r1)
            return r0
    }

    @Override // defpackage.dx4
    public final int d0() {
            r0 = this;
            wm3 r0 = r0.Y
            eg4 r0 = r0.a()
            mz3 r0 = r0.W0()
            r0.getClass()
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
    public final void h0(long r1, float r3, defpackage.qn2 r4) {
            r0 = this;
            r0.C0(r1, r4)
            return
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
            rz3 r0 = r0.q
            return r0
        L11:
            r0 = 0
            return r0
    }

    @Override // defpackage.x24
    public final int n(int r1) {
            r0 = this;
            r0.z0()
            wm3 r0 = r0.Y
            eg4 r0 = r0.a()
            mz3 r0 = r0.W0()
            r0.getClass()
            int r0 = r0.n(r1)
            return r0
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
            r1.S(r0)
            return
    }

    public final boolean s0() {
            r1 = this;
            wm3 r1 = r1.Y
            sm3 r0 = r1.a
            boolean r0 = defpackage.bl2.J(r0)
            if (r0 != 0) goto L11
            boolean r1 = r1.c
            if (r1 == 0) goto Lf
            goto L11
        Lf:
            r1 = 0
            return r1
        L11:
            r1 = 1
            return r1
    }

    @Override // defpackage.x24
    public final int u(int r1) {
            r0 = this;
            r0.z0()
            wm3 r0 = r0.Y
            eg4 r0 = r0.a()
            mz3 r0 = r0.W0()
            r0.getClass()
            int r0 = r0.u(r1)
            return r0
    }

    public final void u0(boolean r4) {
            r3 = this;
            if (r4 == 0) goto L8
            boolean r0 = r3.s0()
            if (r0 != 0) goto L36
        L8:
            if (r4 != 0) goto L11
            boolean r4 = r3.s0()
            if (r4 != 0) goto L11
            goto L36
        L11:
            oz3 r4 = defpackage.oz3.IsNotPlaced
            r3.m0 = r4
            wm3 r3 = r3.Y
            sm3 r3 = r3.a
            ua4 r3 = r3.z()
            java.lang.Object[] r4 = r3.A
            int r3 = r3.L
            r0 = 0
        L22:
            if (r0 >= r3) goto L36
            r1 = r4[r0]
            sm3 r1 = (defpackage.sm3) r1
            wm3 r1 = r1.C0
            rz3 r1 = r1.q
            r1.getClass()
            r2 = 1
            r1.u0(r2)
            int r0 = r0 + 1
            goto L22
        L36:
            return
    }

    public final void w0() {
            r6 = this;
            oz3 r0 = r6.m0
            wm3 r1 = r6.Y
            boolean r2 = r1.c
            sm3 r3 = r1.a
            if (r2 == 0) goto Lf
            oz3 r2 = defpackage.oz3.IsPlacedInApproach
            r6.m0 = r2
            goto L13
        Lf:
            oz3 r2 = defpackage.oz3.IsPlacedInLookahead
            r6.m0 = r2
        L13:
            oz3 r6 = defpackage.oz3.IsPlacedInLookahead
            if (r0 == r6) goto L20
            boolean r6 = r1.e
            if (r6 == 0) goto L20
            r6 = 6
            r0 = 1
            defpackage.sm3.T(r3, r0, r6)
        L20:
            ua4 r6 = r3.z()
            java.lang.Object[] r0 = r6.A
            int r6 = r6.L
            r1 = 0
        L29:
            if (r1 >= r6) goto L4a
            r2 = r0[r1]
            sm3 r2 = (defpackage.sm3) r2
            wm3 r3 = r2.C0
            rz3 r3 = r3.q
            if (r3 == 0) goto L45
            int r4 = r3.e0
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L42
            r3.w0()
            defpackage.sm3.W(r2)
        L42:
            int r1 = r1 + 1
            goto L29
        L45:
            java.lang.String r6 = "Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope."
            defpackage.i.h(r6)
        L4a:
            return
    }

    public final void x0() {
            r6 = this;
            wm3 r6 = r6.Y
            int r0 = r6.o
            if (r0 <= 0) goto L33
            sm3 r6 = r6.a
            ua4 r6 = r6.z()
            java.lang.Object[] r0 = r6.A
            int r6 = r6.L
            r1 = 0
            r2 = r1
        L12:
            if (r2 >= r6) goto L33
            r3 = r0[r2]
            sm3 r3 = (defpackage.sm3) r3
            wm3 r4 = r3.C0
            boolean r5 = r4.m
            if (r5 != 0) goto L22
            boolean r5 = r4.n
            if (r5 == 0) goto L29
        L22:
            boolean r5 = r4.f
            if (r5 != 0) goto L29
            r3.S(r1)
        L29:
            rz3 r3 = r4.q
            if (r3 == 0) goto L30
            r3.x0()
        L30:
            int r2 = r2 + 1
            goto L12
        L33:
            return
    }

    @Override // defpackage.x24
    public final defpackage.dx4 y(long r6) {
            r5 = this;
            wm3 r0 = r5.Y
            sm3 r1 = r0.a
            sm3 r2 = r0.a
            sm3 r1 = r1.v()
            r3 = 0
            if (r1 == 0) goto L12
            wm3 r1 = r1.C0
            om3 r1 = r1.d
            goto L13
        L12:
            r1 = r3
        L13:
            om3 r4 = defpackage.om3.LookaheadMeasuring
            if (r1 == r4) goto L27
            sm3 r1 = r2.v()
            if (r1 == 0) goto L22
            wm3 r1 = r1.C0
            om3 r1 = r1.d
            goto L23
        L22:
            r1 = r3
        L23:
            om3 r4 = defpackage.om3.LookaheadLayingOut
            if (r1 != r4) goto L2a
        L27:
            r1 = 0
            r0.b = r1
        L2a:
            sm3 r0 = r2.v()
            if (r0 == 0) goto L69
            wm3 r0 = r0.C0
            qm3 r1 = r5.f0
            qm3 r4 = defpackage.qm3.NotUsed
            if (r1 == r4) goto L42
            boolean r1 = r2.A0
            if (r1 == 0) goto L3d
            goto L42
        L3d:
            java.lang.String r1 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            defpackage.p53.c(r1)
        L42:
            om3 r1 = r0.d
            int[] r4 = defpackage.pz3.a
            int r1 = r1.ordinal()
            r1 = r4[r1]
            r4 = 1
            if (r1 == r4) goto L64
            r4 = 2
            if (r1 == r4) goto L64
            r4 = 3
            if (r1 == r4) goto L61
            r4 = 4
            if (r1 != r4) goto L59
            goto L61
        L59:
            java.lang.String r5 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            om3 r6 = r0.d
            defpackage.e41.z(r6, r5)
            return r3
        L61:
            qm3 r0 = defpackage.qm3.InLayoutBlock
            goto L66
        L64:
            qm3 r0 = defpackage.qm3.InMeasureBlock
        L66:
            r5.f0 = r0
            goto L6d
        L69:
            qm3 r0 = defpackage.qm3.NotUsed
            r5.f0 = r0
        L6d:
            qm3 r0 = r2.y0
            qm3 r1 = defpackage.qm3.NotUsed
            if (r0 != r1) goto L76
            r2.e()
        L76:
            r5.F0(r6)
            return r5
    }

    public final void z0() {
            r3 = this;
            wm3 r3 = r3.Y
            sm3 r0 = r3.a
            r1 = 0
            r2 = 7
            defpackage.sm3.T(r0, r1, r2)
            sm3 r3 = r3.a
            sm3 r0 = r3.v()
            if (r0 == 0) goto L33
            qm3 r1 = r3.y0
            qm3 r2 = defpackage.qm3.NotUsed
            if (r1 != r2) goto L33
            wm3 r1 = r0.C0
            om3 r1 = r1.d
            int[] r2 = defpackage.pz3.a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 2
            if (r1 == r2) goto L2f
            r2 = 3
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
}
