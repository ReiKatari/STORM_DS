package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zg1  reason: default package */
/* loaded from: classes.dex */
public abstract class zg1 extends defpackage.z64 {
    public final int k0;
    public defpackage.z64 l0;

    public zg1() {
            r1 = this;
            r1.<init>()
            int r0 = defpackage.fg4.e(r1)
            r1.k0 = r0
            return
    }

    @Override // defpackage.z64
    public final void H0() {
            r2 = this;
            super.H0()
            z64 r0 = r2.l0
        L5:
            if (r0 == 0) goto L16
            eg4 r1 = r2.d0
            r0.Q0(r1)
            boolean r1 = r0.j0
            if (r1 != 0) goto L13
            r0.H0()
        L13:
            z64 r0 = r0.Y
            goto L5
        L16:
            return
    }

    @Override // defpackage.z64
    public final void I0() {
            r1 = this;
            z64 r0 = r1.l0
        L2:
            if (r0 == 0) goto La
            r0.I0()
            z64 r0 = r0.Y
            goto L2
        La:
            super.I0()
            return
    }

    @Override // defpackage.z64
    public final void M0() {
            r0 = this;
            super.M0()
            z64 r0 = r0.l0
        L5:
            if (r0 == 0) goto Ld
            r0.M0()
            z64 r0 = r0.Y
            goto L5
        Ld:
            return
    }

    @Override // defpackage.z64
    public final void N0() {
            r1 = this;
            z64 r0 = r1.l0
        L2:
            if (r0 == 0) goto La
            r0.N0()
            z64 r0 = r0.Y
            goto L2
        La:
            super.N0()
            return
    }

    @Override // defpackage.z64
    public final void O0() {
            r0 = this;
            super.O0()
            z64 r0 = r0.l0
        L5:
            if (r0 == 0) goto Ld
            r0.O0()
            z64 r0 = r0.Y
            goto L5
        Ld:
            return
    }

    @Override // defpackage.z64
    public final void P0(defpackage.z64 r1) {
            r0 = this;
            r0.A = r1
            z64 r0 = r0.l0
        L4:
            if (r0 == 0) goto Lc
            r0.P0(r1)
            z64 r0 = r0.Y
            goto L4
        Lc:
            return
    }

    @Override // defpackage.z64
    public final void Q0(defpackage.eg4 r1) {
            r0 = this;
            r0.d0 = r1
            z64 r0 = r0.l0
        L4:
            if (r0 == 0) goto Lc
            r0.Q0(r1)
            z64 r0 = r0.Y
            goto L4
        Lc:
            return
    }

    public final defpackage.xg1 R0(defpackage.xg1 r8) {
            r7 = this;
            r0 = r8
            z64 r0 = (defpackage.z64) r0
            z64 r0 = r0.A
            r1 = 0
            if (r0 == r8) goto L29
            boolean r2 = r8 instanceof defpackage.z64
            if (r2 == 0) goto L10
            r2 = r8
            z64 r2 = (defpackage.z64) r2
            goto L11
        L10:
            r2 = r1
        L11:
            if (r2 == 0) goto L16
            z64 r2 = r2.X
            goto L17
        L16:
            r2 = r1
        L17:
            z64 r3 = r7.A
            if (r0 != r3) goto L23
            boolean r7 = defpackage.nb3.k(r2, r7)
            if (r7 == 0) goto L23
            goto La8
        L23:
            java.lang.String r7 = "Cannot delegate to an already delegated node"
            defpackage.i.m(r7)
            return r1
        L29:
            boolean r2 = r0.j0
            if (r2 == 0) goto L32
            java.lang.String r2 = "Cannot delegate to an already attached node"
            defpackage.p53.c(r2)
        L32:
            z64 r2 = r7.A
            r0.P0(r2)
            int r2 = r7.L
            int r3 = defpackage.fg4.f(r0)
            r0.L = r3
            int r4 = r7.L
            r5 = r3 & 2
            if (r5 == 0) goto L66
            r4 = r4 & 2
            if (r4 == 0) goto L66
            boolean r4 = r7 instanceof defpackage.jm3
            if (r4 != 0) goto L66
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: "
            r4.<init>(r6)
            r4.append(r7)
            java.lang.String r6 = "\nDelegate Node: "
            r4.append(r6)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            defpackage.p53.c(r4)
        L66:
            z64 r4 = r7.l0
            r0.Y = r4
            r7.l0 = r0
            r0.X = r7
            int r4 = r7.L
            r3 = r3 | r4
            r4 = 0
            r7.T0(r3, r4)
            boolean r3 = r7.j0
            if (r3 == 0) goto La8
            if (r5 == 0) goto L8f
            r2 = r2 & 2
            if (r2 == 0) goto L80
            goto L8f
        L80:
            sm3 r2 = defpackage.nc1.f0(r7)
            if0 r2 = r2.B0
            z64 r7 = r7.A
            r7.Q0(r1)
            r2.k()
            goto L94
        L8f:
            eg4 r1 = r7.d0
            r7.Q0(r1)
        L94:
            r0.H0()
            r0.N0()
            boolean r7 = r0.j0
            if (r7 != 0) goto La3
            java.lang.String r7 = "autoInvalidateInsertedNode called on unattached node"
            defpackage.p53.c(r7)
        La3:
            r7 = -1
            r1 = 1
            defpackage.fg4.a(r0, r7, r1)
        La8:
            return r8
    }

    public final void S0(defpackage.xg1 r7) {
            r6 = this;
            z64 r0 = r6.l0
            r1 = 0
            r2 = r1
        L4:
            if (r0 == 0) goto L5e
            if (r0 != r7) goto L58
            boolean r7 = r0.j0
            r3 = 2
            if (r7 == 0) goto L20
            y94 r4 = defpackage.fg4.a
            if (r7 != 0) goto L16
            java.lang.String r7 = "autoInvalidateRemovedNode called on unattached node"
            defpackage.p53.c(r7)
        L16:
            r7 = -1
            defpackage.fg4.a(r0, r7, r3)
            r0.O0()
            r0.I0()
        L20:
            r0.P0(r0)
            r7 = 0
            r0.R = r7
            z64 r7 = r0.Y
            if (r2 != 0) goto L2d
            r6.l0 = r7
            goto L2f
        L2d:
            r2.Y = r7
        L2f:
            r0.Y = r1
            r0.X = r1
            int r7 = r6.L
            int r0 = defpackage.fg4.f(r6)
            r2 = 1
            r6.T0(r0, r2)
            boolean r2 = r6.j0
            if (r2 == 0) goto L57
            r7 = r7 & r3
            if (r7 == 0) goto L57
            r7 = r0 & 2
            if (r7 == 0) goto L49
            goto L57
        L49:
            sm3 r7 = defpackage.nc1.f0(r6)
            if0 r7 = r7.B0
            z64 r6 = r6.A
            r6.Q0(r1)
            r7.k()
        L57:
            return
        L58:
            z64 r2 = r0.Y
            r5 = r2
            r2 = r0
            r0 = r5
            goto L4
        L5e:
            java.lang.String r6 = "Could not find delegate: "
            defpackage.e41.h(r7, r6)
            return
    }

    public final void T0(int r3, boolean r4) {
            r2 = this;
            int r0 = r2.L
            r2.L = r3
            if (r0 == r3) goto L3b
            z64 r0 = r2.A
            if (r0 != r2) goto Lc
            r2.R = r3
        Lc:
            boolean r1 = r2.j0
            if (r1 == 0) goto L3b
        L10:
            if (r2 == 0) goto L1c
            int r1 = r2.L
            r3 = r3 | r1
            r2.L = r3
            if (r2 == r0) goto L1c
            z64 r2 = r2.X
            goto L10
        L1c:
            if (r4 == 0) goto L26
            if (r2 != r0) goto L26
            int r3 = defpackage.fg4.f(r0)
            r0.L = r3
        L26:
            if (r2 == 0) goto L2f
            z64 r4 = r2.Y
            if (r4 == 0) goto L2f
            int r4 = r4.R
            goto L30
        L2f:
            r4 = 0
        L30:
            r3 = r3 | r4
        L31:
            if (r2 == 0) goto L3b
            int r4 = r2.L
            r3 = r3 | r4
            r2.R = r3
            z64 r2 = r2.X
            goto L31
        L3b:
            return
    }
}
