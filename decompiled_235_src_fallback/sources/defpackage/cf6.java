package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cf6  reason: default package */
/* loaded from: classes.dex */
public final class cf6 extends defpackage.z64 implements defpackage.mo1, defpackage.c74, defpackage.gi4, defpackage.fy0, defpackage.jm3 {
    public defpackage.of5 k0;
    public boolean l0;
    public defpackage.if6 m0;
    public defpackage.ut2 n0;
    public final defpackage.ri6 o0;

    public cf6(defpackage.if6 r3) {
            r2 = this;
            r2.<init>()
            r2.m0 = r3
            vs4 r0 = r3.i0
            java.lang.Object r0 = r0.getValue()
            ut2 r0 = (defpackage.ut2) r0
            r2.n0 = r0
            j41 r0 = defpackage.ef6.a
            ri6 r1 = new ri6
            r1.<init>(r0)
            vs4 r0 = r1.f
            r0.setValue(r3)
            r2.o0 = r1
            return
    }

    @Override // defpackage.z64
    public final void J0() {
            r1 = this;
            if6 r0 = r1.m0
            gf6 r0 = r0.e()
            ff6 r0 = r0.i
            defpackage.jx2.B(r1, r0)
            r1.U0()
            if6 r1 = r1.m0
            vs4 r1 = r1.A
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.setValue(r0)
            return
    }

    @Override // defpackage.z64
    public final void K0() {
            r7 = this;
            if6 r0 = r7.m0
            gf6 r0 = r0.e()
            sg6 r0 = r0.b
            jk3 r0 = r0.X
            r1 = 0
            if (r0 == 0) goto L3b
            boolean r2 = r0.t()
            if (r2 == 0) goto L38
            boolean r2 = r7.l0
            if (r2 == 0) goto L38
            eg4 r2 = defpackage.nc1.e0(r7)
            r3 = 0
            long r5 = r2.P(r3)
            long r2 = r0.P(r3)
            long r2 = defpackage.jk4.e(r5, r2)
            eg4 r0 = defpackage.nc1.e0(r7)
            long r4 = r0.L
            long r4 = defpackage.qo2.S(r4)
            of5 r0 = defpackage.kj2.b(r2, r4)
            goto L39
        L38:
            r0 = r1
        L39:
            r7.k0 = r0
        L3b:
            r7.T0(r1)
            if6 r0 = r7.m0
            r0.g0 = r1
            r0.h0 = r1
            vs4 r0 = r0.A
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            r0 = 0
            r7.l0 = r0
            return
    }

    @Override // defpackage.z64
    public final void L0() {
            r2 = this;
            r0 = 0
            r2.k0 = r0
            ut2 r0 = r2.n0
            if (r0 == 0) goto L14
            zp4 r1 = defpackage.nc1.g0(r2)
            te r1 = (defpackage.te) r1
            tt2 r1 = r1.getGraphicsContext()
            r1.a(r0)
        L14:
            zp4 r0 = defpackage.nc1.g0(r2)
            te r0 = (defpackage.te) r0
            tt2 r0 = r0.getGraphicsContext()
            ut2 r0 = r0.b()
            r2.T0(r0)
            return
    }

    public final defpackage.f34 R0(defpackage.st r7, defpackage.x24 r8, long r9) {
            r6 = this;
            if6 r0 = r6.m0
            x60 r0 = r0.d()
            of5 r0 = r0.c()
            if (r0 != 0) goto L23
            if6 r0 = r6.m0
            gf6 r0 = r0.e()
            mg5 r0 = r0.c
            r0.i()
            zg6 r1 = r0.d()
            java.lang.Object r0 = r0.c
            gf6 r0 = (defpackage.gf6) r0
            of5 r0 = r1.f(r0)
        L23:
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r3 = 32
            if (r0 == 0) goto L88
            long r9 = r0.c()
            long r9 = defpackage.qo2.Q(r9)
            long r4 = r9 >> r3
            int r0 = (int) r4
            long r9 = r9 & r1
            int r9 = (int) r9
            r10 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r10) goto L5d
            if (r9 == r10) goto L5d
            r10 = 0
            if (r0 >= 0) goto L44
            r0 = r10
        L44:
            if (r9 >= 0) goto L47
            r9 = r10
        L47:
            r4 = 1
            if (r0 < 0) goto L4c
            r5 = r4
            goto L4d
        L4c:
            r5 = r10
        L4d:
            if (r9 < 0) goto L50
            r10 = r4
        L50:
            r10 = r10 & r5
            if (r10 != 0) goto L58
            java.lang.String r10 = "width and height must be >= 0"
            defpackage.r53.a(r10)
        L58:
            long r9 = defpackage.s21.h(r0, r0, r9, r9)
            goto L88
        L5d:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Error: Infinite width/height is invalid. animated bounds: "
            r7.<init>(r8)
            if6 r8 = r6.m0
            x60 r8 = r8.d()
            of5 r8 = r8.c()
            r7.append(r8)
            if6 r6 = r6.m0
            gf6 r6 = r6.e()
            mg5 r6 = r6.c
            zg6 r6 = r6.d()
            of5 r6 = r6.c()
            java.lang.String r8 = ", current bounds: "
            defpackage.u34.s(r7, r8, r6)
            r6 = 0
            return r6
        L88:
            dx4 r8 = r8.y(r9)
            if6 r9 = r6.m0
            gf6 r9 = r9.e()
            mg5 r9 = r9.c
            zg6 r9 = r9.d()
            boolean r9 = r9.d()
            if (r9 == 0) goto Lc6
            if6 r9 = r6.m0
            vs4 r9 = r9.Y
            java.lang.Object r9 = r9.getValue()
            qg6 r9 = (defpackage.qg6) r9
            if6 r10 = r6.m0
            gf6 r10 = r10.e()
            sg6 r10 = r10.b
            eg4 r0 = defpackage.nc1.e0(r6)
            sz3 r10 = r10.A
            jk3 r10 = r10.b(r0)
            long r4 = r10.m()
            int r10 = r8.A
            int r10 = r8.B
            r9.getClass()
            goto Lcf
        Lc6:
            int r9 = r8.A
            int r10 = r8.B
            long r4 = (long) r9
            long r4 = r4 << r3
            long r9 = (long) r10
            long r9 = r9 & r1
            long r4 = r4 | r9
        Lcf:
            long r9 = r4 >> r3
            int r9 = (int) r9
            long r0 = r4 & r1
            int r10 = (int) r0
            bf6 r0 = new bf6
            r0.<init>(r6, r8)
            zt1 r6 = defpackage.zt1.A
            f34 r6 = r7.K(r9, r10, r6, r0)
            return r6
    }

    public final defpackage.jk3 S0() {
            r0 = this;
            if6 r0 = r0.m0
            gf6 r0 = r0.e()
            sg6 r0 = r0.b
            jk3 r0 = r0.X
            if (r0 == 0) goto Ld
            return r0
        Ld:
            java.lang.String r0 = "Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead."
            defpackage.i.h(r0)
            r0 = 0
            return r0
    }

    public final void T0(defpackage.ut2 r3) {
            r2 = this;
            if (r3 != 0) goto L14
            ut2 r0 = r2.n0
            if (r0 == 0) goto L1b
            zp4 r1 = defpackage.nc1.g0(r2)
            te r1 = (defpackage.te) r1
            tt2 r1 = r1.getGraphicsContext()
            r1.a(r0)
            goto L1b
        L14:
            if6 r0 = r2.m0
            vs4 r0 = r0.i0
            r0.setValue(r3)
        L1b:
            r2.n0 = r3
            return
    }

    public final void U0() {
            r12 = this;
            j41 r0 = defpackage.ef6.a
            if6 r1 = r12.m0
            au1 r2 = defpackage.au1.e
            ri6 r3 = r12.o0
            if (r3 == r2) goto Lb
            goto L10
        Lb:
            java.lang.String r2 = "In order to provide locals you must override providedValues: ModifierLocalMap"
            defpackage.p53.a(r2)
        L10:
            boolean r2 = r3.z(r0)
            if (r2 != 0) goto L2c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key "
            r2.<init>(r4)
            r2.append(r0)
            java.lang.String r4 = " was not found."
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            defpackage.p53.a(r2)
        L2c:
            j41 r2 = r3.e
            if (r0 != r2) goto L31
            goto L36
        L31:
            java.lang.String r2 = "Check failed."
            defpackage.p53.c(r2)
        L36:
            vs4 r2 = r3.f
            r2.setValue(r1)
            if6 r1 = r12.m0
            z64 r2 = r12.A
            boolean r2 = r2.j0
            if (r2 != 0) goto L48
            java.lang.String r2 = "ModifierLocal accessed from an unattached node"
            defpackage.p53.a(r2)
        L48:
            z64 r2 = r12.A
            boolean r2 = r2.j0
            if (r2 != 0) goto L53
            java.lang.String r2 = "visitAncestors called on an unattached node"
            defpackage.p53.c(r2)
        L53:
            z64 r2 = r12.A
            z64 r2 = r2.X
            sm3 r3 = defpackage.nc1.f0(r12)
        L5b:
            r4 = 0
            if (r3 == 0) goto Le4
            if0 r5 = r3.B0
            java.lang.Object r5 = r5.g
            z64 r5 = (defpackage.z64) r5
            int r5 = r5.R
            r5 = r5 & 32
            r6 = 0
            if (r5 == 0) goto Ld1
        L6b:
            if (r2 == 0) goto Ld1
            int r5 = r2.L
            r5 = r5 & 32
            if (r5 == 0) goto Lce
            r5 = r2
            r7 = r6
        L75:
            if (r5 == 0) goto Lce
            boolean r8 = r5 instanceof defpackage.c74
            if (r8 == 0) goto L90
            c74 r5 = (defpackage.c74) r5
            gi2 r8 = r5.X()
            boolean r8 = r8.z(r0)
            if (r8 == 0) goto Lc9
            gi2 r2 = r5.X()
            java.lang.Object r0 = r2.D(r0)
            goto Lea
        L90:
            int r8 = r5.L
            r8 = r8 & 32
            if (r8 == 0) goto Lc9
            boolean r8 = r5 instanceof defpackage.zg1
            if (r8 == 0) goto Lc9
            r8 = r5
            zg1 r8 = (defpackage.zg1) r8
            z64 r8 = r8.l0
            r9 = r4
        La0:
            r10 = 1
            if (r8 == 0) goto Lc6
            int r11 = r8.L
            r11 = r11 & 32
            if (r11 == 0) goto Lc3
            int r9 = r9 + 1
            if (r9 != r10) goto Laf
            r5 = r8
            goto Lc3
        Laf:
            if (r7 != 0) goto Lba
            ua4 r7 = new ua4
            r10 = 16
            z64[] r10 = new defpackage.z64[r10]
            r7.<init>(r10)
        Lba:
            if (r5 == 0) goto Lc0
            r7.b(r5)
            r5 = r6
        Lc0:
            r7.b(r8)
        Lc3:
            z64 r8 = r8.Y
            goto La0
        Lc6:
            if (r9 != r10) goto Lc9
            goto L75
        Lc9:
            z64 r5 = defpackage.nc1.A(r7)
            goto L75
        Lce:
            z64 r2 = r2.X
            goto L6b
        Ld1:
            sm3 r3 = r3.v()
            if (r3 == 0) goto Le1
            if0 r2 = r3.B0
            if (r2 == 0) goto Le1
            java.lang.Object r2 = r2.f
            vy6 r2 = (defpackage.vy6) r2
            goto L5b
        Le1:
            r2 = r6
            goto L5b
        Le4:
            on2 r0 = r0.a
            java.lang.Object r0 = r0.c()
        Lea:
            if6 r0 = (defpackage.if6) r0
            r1.g0 = r0
            zp4 r0 = defpackage.nc1.g0(r12)
            te r0 = (defpackage.te) r0
            tt2 r0 = r0.getGraphicsContext()
            ut2 r0 = r0.b()
            r12.T0(r0)
            r12.l0 = r4
            if6 r0 = r12.m0
            r0.h0 = r12
            return
    }

    @Override // defpackage.c74
    public final defpackage.gi2 X() {
            r0 = this;
            ri6 r0 = r0.o0
            return r0
    }

    @Override // defpackage.jm3
    public final defpackage.f34 c(defpackage.g34 r2, defpackage.x24 r3, long r4) {
            r1 = this;
            dx4 r3 = r3.y(r4)
            int r4 = r3.A
            int r5 = r3.B
            bf6 r0 = new bf6
            r0.<init>(r3, r1)
            zt1 r1 = defpackage.zt1.A
            f34 r1 = r2.K(r4, r5, r1, r0)
            return r1
    }

    @Override // defpackage.gi4
    public final void l0() {
            r1 = this;
            if6 r0 = r1.m0
            gf6 r0 = r0.e()
            r0.e()
            if6 r0 = r1.m0
            gf6 r0 = r0.e()
            ff6 r0 = r0.i
            defpackage.jx2.B(r1, r0)
            return
    }

    @Override // defpackage.mo1
    public final void m0(defpackage.um3 r11) {
            r10 = this;
            if6 r0 = r10.m0
            gf6 r0 = r0.e()
            mg5 r1 = r0.c
            zg6 r1 = r1.d()
            of5 r1 = r1.c()
            if6 r2 = r10.m0
            boolean r3 = r2.g()
            r4 = 0
            if (r3 == 0) goto L6c
            if (r1 == 0) goto L6c
            if6 r3 = r10.m0
            vs4 r3 = r3.d0
            java.lang.Object r3 = r3.getValue()
            tg6 r3 = (defpackage.tg6) r3
            if6 r5 = r10.m0
            vs4 r5 = r5.e0
            java.lang.Object r5 = r5.getValue()
            rg6 r5 = (defpackage.rg6) r5
            r11.getLayoutDirection()
            sm3 r6 = defpackage.nc1.f0(r10)
            qh1 r6 = r6.u0
            r3.getClass()
            vs4 r3 = r5.c
            java.lang.Object r3 = r3.getValue()
            if6 r3 = (defpackage.if6) r3
            java.lang.String r5 = "Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized."
            if (r3 == 0) goto L68
            if6 r3 = r3.g0
            if (r3 == 0) goto L54
            vs4 r3 = r3.e0
            java.lang.Object r3 = r3.getValue()
            rg6 r3 = (defpackage.rg6) r3
            goto L55
        L54:
            r3 = r4
        L55:
            if (r3 == 0) goto L6c
            vs4 r3 = r3.c
            java.lang.Object r3 = r3.getValue()
            if6 r3 = (defpackage.if6) r3
            if (r3 == 0) goto L64
            hj r4 = r3.f0
            goto L6c
        L64:
            defpackage.i.h(r5)
            return
        L68:
            defpackage.i.h(r5)
            return
        L6c:
            r2.f0 = r4
            if6 r2 = r10.m0
            vs4 r2 = r2.i0
            java.lang.Object r2 = r2.getValue()
            r3 = r2
            ut2 r3 = (defpackage.ut2) r3
            if (r3 == 0) goto Ld7
            mc r2 = new mc
            r2.<init>(r11, r1, r0)
            zj0 r0 = r11.A
            long r0 = r0.e()
            r4 = 32
            long r5 = r0 >> r4
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            int r5 = (int) r5
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r6
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r0 = (int) r0
            long r8 = (long) r5
            long r4 = r8 << r4
            long r0 = (long) r0
            long r0 = r0 & r6
            long r6 = r4 | r0
            mo1 r0 = r11.B
            kk3 r5 = r11.getLayoutDirection()
            ln r8 = new ln
            r1 = 6
            r8.<init>(r11, r0, r2, r1)
            r4 = r11
            r3.e(r4, r5, r6, r8)
            if6 r10 = r10.m0
            gf6 r11 = r10.e()
            mg5 r11 = r11.c
            zg6 r11 = r11.d()
            boolean r11 = r11.d()
            if (r11 == 0) goto Ld3
            boolean r11 = r10.g()
            if (r11 != 0) goto Ld2
            boolean r10 = r10.f()
            if (r10 == 0) goto Ld2
            goto Ld3
        Ld2:
            return
        Ld3:
            defpackage.oi2.u(r4, r3)
            return
        Ld7:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r1 = "Error: Layer is null when accessed for shared bounds/element : "
            r11.<init>(r1)
            java.lang.String r0 = r0.a
            r11.append(r0)
            if6 r0 = r10.m0
            x60 r0 = r0.d()
            boolean r0 = r0.b()
            boolean r10 = r10.j0
            java.lang.String r1 = ",target: "
            r11.append(r1)
            r11.append(r0)
            java.lang.String r0 = ", is attached: "
            r11.append(r0)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
    }
}
