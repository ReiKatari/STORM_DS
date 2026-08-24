package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vh2  reason: default package */
/* loaded from: classes.dex */
public final class vh2 extends defpackage.z64 implements defpackage.fy0, defpackage.kj3, defpackage.gi4, defpackage.c74, defpackage.xg1 {
    public final defpackage.eo2 k0;
    public boolean l0;
    public boolean m0;
    public final int n0;

    public vh2(int r1, defpackage.eo2 r2, int r3) {
            r0 = this;
            r3 = r3 & 4
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>()
            r0.k0 = r2
            r0.n0 = r1
            return
    }

    public static /* synthetic */ boolean Z0(defpackage.vh2 r1) {
            r0 = 7
            boolean r1 = r1.Y0(r0)
            return r1
    }

    @Override // defpackage.z64
    public final boolean G0() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.z64
    public final void K0() {
            r3 = this;
            sh2 r0 = r3.W0()
            int[] r1 = defpackage.uh2.b
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L2a
            r2 = 2
            if (r0 == r2) goto L2a
            r1 = 3
            if (r0 == r1) goto L1d
            r3 = 4
            if (r0 != r3) goto L19
            return
        L19:
            defpackage.i.d()
            return
        L1d:
            zp4 r0 = defpackage.nc1.g0(r3)
            te r0 = (defpackage.te) r0
            r0.getFocusOwner()
            defpackage.yh2.q(r3)
            return
        L2a:
            zp4 r3 = defpackage.nc1.g0(r3)
            te r3 = (defpackage.te) r3
            ah2 r3 = r3.getFocusOwner()
            eh2 r3 = (defpackage.eh2) r3
            r0 = 8
            r2 = 0
            r3.b(r0, r1, r2)
            xg2 r3 = r3.d
            r3.a()
            return
    }

    @Override // defpackage.z64
    public final void L0() {
            r2 = this;
            sh2 r0 = r2.W0()
            boolean r0 = r0.isFocused()
            if (r0 == 0) goto L1c
            zp4 r2 = defpackage.nc1.g0(r2)
            te r2 = (defpackage.te) r2
            ah2 r2 = r2.getFocusOwner()
            r0 = 8
            eh2 r2 = (defpackage.eh2) r2
            r1 = 1
            r2.b(r0, r1, r1)
        L1c:
            return
    }

    public final boolean R0(int r23) {
            r22 = this;
            r0 = r22
            g81 r1 = defpackage.jx2.G(r22, r23)
            int[] r2 = defpackage.uh2.a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == r6) goto L27
            if (r1 == r5) goto L23
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L1f
        L1b:
            r19 = r2
            goto L2c9
        L1f:
            defpackage.i.d()
            return r2
        L23:
            r18 = r6
            goto L2cc
        L27:
            zp4 r1 = defpackage.nc1.g0(r0)
            te r1 = (defpackage.te) r1
            ah2 r1 = r1.getFocusOwner()
            eh2 r1 = (defpackage.eh2) r1
            vh2 r7 = r1.f()
            sh2 r8 = r0.W0()
            if (r7 != r0) goto L41
            r0.S0(r8, r8)
            return r6
        L41:
            if (r7 == 0) goto L44
            goto L59
        L44:
            zp4 r9 = defpackage.nc1.g0(r0)
            te r9 = (defpackage.te) r9
            ah2 r9 = r9.getFocusOwner()
            eh2 r9 = (defpackage.eh2) r9
            te r9 = r9.a
            boolean r9 = r9.B()
            if (r9 != 0) goto L59
            goto L1b
        L59:
            java.lang.String r9 = "visitAncestors called on an unattached node"
            r10 = 16
            if (r7 == 0) goto Lfd
            ua4 r12 = new ua4
            vh2[] r13 = new defpackage.vh2[r10]
            r12.<init>(r13)
            z64 r13 = r7.A
            boolean r13 = r13.j0
            if (r13 != 0) goto L6f
            defpackage.p53.c(r9)
        L6f:
            z64 r13 = r7.A
            z64 r13 = r13.X
            sm3 r14 = defpackage.nc1.f0(r7)
        L77:
            if (r14 == 0) goto Lfe
            if0 r15 = r14.B0
            java.lang.Object r15 = r15.g
            z64 r15 = (defpackage.z64) r15
            int r15 = r15.R
            r15 = r15 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto Le7
        L85:
            if (r13 == 0) goto Le7
            int r15 = r13.L
            r15 = r15 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto Le1
            r15 = r13
            r16 = 0
        L90:
            if (r15 == 0) goto Le1
            boolean r11 = r15 instanceof defpackage.vh2
            if (r11 == 0) goto L9c
            vh2 r15 = (defpackage.vh2) r15
            r12.b(r15)
            goto Ldc
        L9c:
            int r11 = r15.L
            r11 = r11 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto Ldc
            boolean r11 = r15 instanceof defpackage.zg1
            if (r11 == 0) goto Ldc
            r11 = r15
            zg1 r11 = (defpackage.zg1) r11
            z64 r11 = r11.l0
            r3 = r2
        Lac:
            if (r11 == 0) goto Ld6
            int r4 = r11.L
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto Ld1
            int r3 = r3 + 1
            if (r3 != r6) goto Lba
            r15 = r11
            goto Ld1
        Lba:
            if (r16 != 0) goto Lc4
            ua4 r4 = new ua4
            z64[] r5 = new defpackage.z64[r10]
            r4.<init>(r5)
            goto Lc6
        Lc4:
            r4 = r16
        Lc6:
            if (r15 == 0) goto Lcc
            r4.b(r15)
            r15 = 0
        Lcc:
            r4.b(r11)
            r16 = r4
        Ld1:
            z64 r11 = r11.Y
            r4 = 3
            r5 = 2
            goto Lac
        Ld6:
            if (r3 != r6) goto Ldc
        Ld8:
            r3 = 4
            r4 = 3
            r5 = 2
            goto L90
        Ldc:
            z64 r15 = defpackage.nc1.A(r16)
            goto Ld8
        Le1:
            z64 r13 = r13.X
            r3 = 4
            r4 = 3
            r5 = 2
            goto L85
        Le7:
            sm3 r14 = r14.v()
            if (r14 == 0) goto Lf7
            if0 r3 = r14.B0
            if (r3 == 0) goto Lf7
            java.lang.Object r3 = r3.f
            vy6 r3 = (defpackage.vy6) r3
            r13 = r3
            goto Lf8
        Lf7:
            r13 = 0
        Lf8:
            r3 = 4
            r4 = 3
            r5 = 2
            goto L77
        Lfd:
            r12 = 0
        Lfe:
            vh2[] r3 = new defpackage.vh2[r10]
            vh2[] r4 = new defpackage.vh2[r10]
            z64 r5 = r0.A
            boolean r5 = r5.j0
            if (r5 != 0) goto L10b
            defpackage.p53.c(r9)
        L10b:
            z64 r5 = r0.A
            z64 r5 = r5.X
            sm3 r9 = defpackage.nc1.f0(r0)
            r13 = r2
            r14 = r13
            r11 = r6
        L116:
            if (r9 == 0) goto L21a
            if0 r15 = r9.B0
            java.lang.Object r15 = r15.g
            z64 r15 = (defpackage.z64) r15
            int r15 = r15.R
            r15 = r15 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L201
        L124:
            if (r5 == 0) goto L201
            int r15 = r5.L
            r15 = r15 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L1f7
            r15 = r5
            r16 = 0
        L12f:
            if (r15 == 0) goto L1f7
            boolean r10 = r15 instanceof defpackage.vh2
            if (r10 == 0) goto L192
            r10 = r15
            vh2 r10 = (defpackage.vh2) r10
            if (r12 == 0) goto L145
            boolean r18 = r12.j(r10)
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r18)
            r6 = r18
            goto L146
        L145:
            r6 = 0
        L146:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r2 = defpackage.nb3.k(r6, r2)
            if (r2 == 0) goto L16f
            int r2 = r13 + 1
            int r6 = r3.length
            if (r6 >= r2) goto L166
            int r6 = r3.length
            r20 = r1
            int r1 = r6 * 2
            int r1 = java.lang.Math.max(r2, r1)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r21 = r2
            r2 = 0
            java.lang.System.arraycopy(r3, r2, r1, r2, r6)
            r3 = r1
            goto L16a
        L166:
            r20 = r1
            r21 = r2
        L16a:
            r3[r13] = r10
            r13 = r21
            goto L18d
        L16f:
            r20 = r1
            int r1 = r14 + 1
            int r2 = r4.length
            if (r2 >= r1) goto L187
            int r2 = r4.length
            int r6 = r2 * 2
            int r6 = java.lang.Math.max(r1, r6)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r21 = r1
            r1 = 0
            java.lang.System.arraycopy(r4, r1, r6, r1, r2)
            r4 = r6
            goto L189
        L187:
            r21 = r1
        L189:
            r4[r14] = r10
            r14 = r21
        L18d:
            if (r10 != r7) goto L190
            r11 = 0
        L190:
            r1 = 0
            goto L195
        L192:
            r20 = r1
            r1 = 1
        L195:
            if (r1 == 0) goto L1eb
            int r1 = r15.L
            r1 = r1 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L1eb
            boolean r1 = r15 instanceof defpackage.zg1
            if (r1 == 0) goto L1eb
            r1 = r15
            zg1 r1 = (defpackage.zg1) r1
            z64 r1 = r1.l0
            r2 = 0
        L1a7:
            if (r1 == 0) goto L1e1
            int r6 = r1.L
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L1dc
            int r2 = r2 + 1
            r6 = 1
            if (r2 != r6) goto L1ba
            r15 = r1
            r17 = r2
            r10 = 16
            goto L1d9
        L1ba:
            if (r16 != 0) goto L1c8
            ua4 r6 = new ua4
            r17 = r2
            r10 = 16
            z64[] r2 = new defpackage.z64[r10]
            r6.<init>(r2)
            goto L1ce
        L1c8:
            r17 = r2
            r10 = 16
            r6 = r16
        L1ce:
            if (r15 == 0) goto L1d4
            r6.b(r15)
            r15 = 0
        L1d4:
            r6.b(r1)
            r16 = r6
        L1d9:
            r2 = r17
            goto L1de
        L1dc:
            r10 = 16
        L1de:
            z64 r1 = r1.Y
            goto L1a7
        L1e1:
            r6 = 1
            r10 = 16
            if (r2 != r6) goto L1ed
            r1 = r20
            r2 = 0
            goto L12f
        L1eb:
            r10 = 16
        L1ed:
            z64 r15 = defpackage.nc1.A(r16)
            r1 = r20
            r2 = 0
            r6 = 1
            goto L12f
        L1f7:
            r20 = r1
            z64 r5 = r5.X
            r1 = r20
            r2 = 0
            r6 = 1
            goto L124
        L201:
            r20 = r1
            sm3 r9 = r9.v()
            if (r9 == 0) goto L213
            if0 r1 = r9.B0
            if (r1 == 0) goto L213
            java.lang.Object r1 = r1.f
            vy6 r1 = (defpackage.vy6) r1
            r5 = r1
            goto L214
        L213:
            r5 = 0
        L214:
            r1 = r20
            r2 = 0
            r6 = 1
            goto L116
        L21a:
            r20 = r1
            if (r11 == 0) goto L22b
            if (r7 == 0) goto L22b
            r1 = 0
            boolean r2 = defpackage.jx2.l(r7, r1)
            if (r2 != 0) goto L22b
        L227:
            r19 = 0
            goto L2c9
        L22b:
            pj r1 = new pj
            r2 = 8
            r1.<init>(r0, r2)
            defpackage.jx2.B(r0, r1)
            sh2 r1 = r0.W0()
            int[] r2 = defpackage.wh2.a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r6 = 1
            if (r1 == r6) goto L263
            r2 = 2
            if (r1 == r2) goto L263
            r2 = 3
            if (r1 == r2) goto L254
            r2 = 4
            if (r1 != r2) goto L24e
            goto L254
        L24e:
            defpackage.i.d()
            r19 = 0
            return r19
        L254:
            zp4 r1 = defpackage.nc1.g0(r0)
            te r1 = (defpackage.te) r1
            ah2 r1 = r1.getFocusOwner()
            eh2 r1 = (defpackage.eh2) r1
            r1.i(r0)
        L263:
            if (r11 == 0) goto L26e
            if (r7 == 0) goto L26e
            sh2 r1 = defpackage.sh2.Active
            sh2 r2 = defpackage.sh2.Inactive
            r7.S0(r1, r2)
        L26e:
            if (r12 == 0) goto L292
            int r1 = r12.L
            r18 = 1
            int r1 = r1 + (-1)
            java.lang.Object[] r2 = r12.A
            int r3 = r2.length
            if (r1 >= r3) goto L292
        L27b:
            if (r1 < 0) goto L292
            r3 = r2[r1]
            vh2 r3 = (defpackage.vh2) r3
            vh2 r5 = r20.f()
            if (r5 == r0) goto L288
            goto L227
        L288:
            sh2 r5 = defpackage.sh2.ActiveParent
            sh2 r6 = defpackage.sh2.Inactive
            r3.S0(r5, r6)
            int r1 = r1 + (-1)
            goto L27b
        L292:
            r18 = 1
            int r14 = r14 + (-1)
            int r1 = r4.length
            if (r14 >= r1) goto L2b5
        L299:
            if (r14 < 0) goto L2b5
            r1 = r4[r14]
            vh2 r1 = (defpackage.vh2) r1
            vh2 r2 = r20.f()
            if (r2 == r0) goto L2a6
        L2a5:
            goto L227
        L2a6:
            if (r1 != r7) goto L2ab
            sh2 r2 = defpackage.sh2.Active
            goto L2ad
        L2ab:
            sh2 r2 = defpackage.sh2.Inactive
        L2ad:
            sh2 r3 = defpackage.sh2.ActiveParent
            r1.S0(r2, r3)
            int r14 = r14 + (-1)
            goto L299
        L2b5:
            vh2 r1 = r20.f()
            if (r1 == r0) goto L2bd
            goto L227
        L2bd:
            sh2 r1 = defpackage.sh2.Active
            r0.S0(r8, r1)
            vh2 r1 = r20.f()
            if (r1 == r0) goto L2ca
            goto L2a5
        L2c9:
            return r19
        L2ca:
            r18 = 1
        L2cc:
            return r18
    }

    public final void S0(defpackage.sh2 r11, defpackage.sh2 r12) {
            r10 = this;
            zp4 r0 = defpackage.nc1.g0(r10)
            te r0 = (defpackage.te) r0
            ah2 r0 = r0.getFocusOwner()
            eh2 r0 = (defpackage.eh2) r0
            vh2 r1 = r0.f()
            boolean r2 = defpackage.nb3.k(r11, r12)
            if (r2 != 0) goto L1d
            eo2 r2 = r10.k0
            if (r2 == 0) goto L1d
            r2.o(r11, r12)
        L1d:
            z64 r11 = r10.A
            boolean r2 = r11.j0
            if (r2 != 0) goto L28
            java.lang.String r2 = "visitAncestors called on an unattached node"
            defpackage.p53.c(r2)
        L28:
            z64 r2 = r10.A
            sm3 r10 = defpackage.nc1.f0(r10)
        L2e:
            if (r10 == 0) goto Lba
            if0 r3 = r10.B0
            java.lang.Object r3 = r3.g
            z64 r3 = (defpackage.z64) r3
            int r3 = r3.R
            r3 = r3 & 5120(0x1400, float:7.175E-42)
            r4 = 0
            if (r3 == 0) goto La7
        L3d:
            if (r2 == 0) goto La7
            int r3 = r2.L
            r5 = r3 & 5120(0x1400, float:7.175E-42)
            if (r5 == 0) goto La4
            if (r2 == r11) goto L4d
            r5 = r3 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L4d
            goto Lba
        L4d:
            r3 = r3 & 4096(0x1000, float:5.74E-42)
            if (r3 == 0) goto La4
            r3 = r2
            r5 = r4
        L53:
            if (r3 == 0) goto La4
            boolean r6 = r3 instanceof defpackage.rg2
            if (r6 == 0) goto L66
            rg2 r3 = (defpackage.rg2) r3
            vh2 r6 = r0.f()
            if (r1 == r6) goto L62
            goto L9f
        L62:
            r3.D(r12)
            goto L9f
        L66:
            int r6 = r3.L
            r6 = r6 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L9f
            boolean r6 = r3 instanceof defpackage.zg1
            if (r6 == 0) goto L9f
            r6 = r3
            zg1 r6 = (defpackage.zg1) r6
            z64 r6 = r6.l0
            r7 = 0
        L76:
            r8 = 1
            if (r6 == 0) goto L9c
            int r9 = r6.L
            r9 = r9 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L99
            int r7 = r7 + 1
            if (r7 != r8) goto L85
            r3 = r6
            goto L99
        L85:
            if (r5 != 0) goto L90
            ua4 r5 = new ua4
            r8 = 16
            z64[] r8 = new defpackage.z64[r8]
            r5.<init>(r8)
        L90:
            if (r3 == 0) goto L96
            r5.b(r3)
            r3 = r4
        L96:
            r5.b(r6)
        L99:
            z64 r6 = r6.Y
            goto L76
        L9c:
            if (r7 != r8) goto L9f
            goto L53
        L9f:
            z64 r3 = defpackage.nc1.A(r5)
            goto L53
        La4:
            z64 r2 = r2.X
            goto L3d
        La7:
            sm3 r10 = r10.v()
            if (r10 == 0) goto Lb7
            if0 r2 = r10.B0
            if (r2 == 0) goto Lb7
            java.lang.Object r2 = r2.f
            vy6 r2 = (defpackage.vy6) r2
            goto L2e
        Lb7:
            r2 = r4
            goto L2e
        Lba:
            return
    }

    public final defpackage.ih2 T0() {
            r11 = this;
            ih2 r0 = new ih2
            r0.<init>()
            r1 = 1
            r0.a = r1
            nh2 r2 = defpackage.nh2.b
            r0.b = r2
            r0.c = r2
            r0.d = r2
            r0.e = r2
            r0.f = r2
            r0.g = r2
            r0.h = r2
            r0.i = r2
            hh2 r2 = defpackage.hh2.L
            r0.j = r2
            hh2 r2 = defpackage.hh2.R
            r0.k = r2
            of5 r2 = defpackage.vs0.g0
            r0.l = r2
            r2 = 0
            int r3 = r11.n0
            r4 = 0
            if (r3 != r1) goto L2e
            r3 = r1
            goto L4f
        L2e:
            if (r3 != 0) goto L4b
            nq6 r3 = defpackage.ky0.m
            java.lang.Object r3 = defpackage.hf.K(r11, r3)
            x63 r3 = (defpackage.x63) r3
            y63 r3 = (defpackage.y63) r3
            vs4 r3 = r3.a
            java.lang.Object r3 = r3.getValue()
            w63 r3 = (defpackage.w63) r3
            int r3 = r3.a
            if (r3 != r1) goto L48
            r3 = r1
            goto L49
        L48:
            r3 = r4
        L49:
            r3 = r3 ^ r1
            goto L4f
        L4b:
            r5 = 2
            if (r3 != r5) goto Le5
            r3 = r4
        L4f:
            r0.a = r3
            z64 r3 = r11.A
            boolean r5 = r3.j0
            if (r5 != 0) goto L5c
            java.lang.String r5 = "visitAncestors called on an unattached node"
            defpackage.p53.c(r5)
        L5c:
            z64 r5 = r11.A
            sm3 r11 = defpackage.nc1.f0(r11)
        L62:
            if (r11 == 0) goto Le4
            if0 r6 = r11.B0
            java.lang.Object r6 = r6.g
            z64 r6 = (defpackage.z64) r6
            int r6 = r6.R
            r6 = r6 & 3072(0xc00, float:4.305E-42)
            if (r6 == 0) goto Ld2
        L70:
            if (r5 == 0) goto Ld2
            int r6 = r5.L
            r7 = r6 & 3072(0xc00, float:4.305E-42)
            if (r7 == 0) goto Lcf
            if (r5 == r3) goto L80
            r7 = r6 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L80
            goto Le4
        L80:
            r6 = r6 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto Lcf
            r7 = r2
            r6 = r5
        L86:
            if (r6 == 0) goto Lcf
            boolean r8 = r6 instanceof defpackage.kh2
            if (r8 == 0) goto L92
            kh2 r6 = (defpackage.kh2) r6
            r6.A(r0)
            goto Lca
        L92:
            int r8 = r6.L
            r8 = r8 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto Lca
            boolean r8 = r6 instanceof defpackage.zg1
            if (r8 == 0) goto Lca
            r8 = r6
            zg1 r8 = (defpackage.zg1) r8
            z64 r8 = r8.l0
            r9 = r4
        La2:
            if (r8 == 0) goto Lc7
            int r10 = r8.L
            r10 = r10 & 2048(0x800, float:2.87E-42)
            if (r10 == 0) goto Lc4
            int r9 = r9 + 1
            if (r9 != r1) goto Lb0
            r6 = r8
            goto Lc4
        Lb0:
            if (r7 != 0) goto Lbb
            ua4 r7 = new ua4
            r10 = 16
            z64[] r10 = new defpackage.z64[r10]
            r7.<init>(r10)
        Lbb:
            if (r6 == 0) goto Lc1
            r7.b(r6)
            r6 = r2
        Lc1:
            r7.b(r8)
        Lc4:
            z64 r8 = r8.Y
            goto La2
        Lc7:
            if (r9 != r1) goto Lca
            goto L86
        Lca:
            z64 r6 = defpackage.nc1.A(r7)
            goto L86
        Lcf:
            z64 r5 = r5.X
            goto L70
        Ld2:
            sm3 r11 = r11.v()
            if (r11 == 0) goto Le1
            if0 r5 = r11.B0
            if (r5 == 0) goto Le1
            java.lang.Object r5 = r5.f
            vy6 r5 = (defpackage.vy6) r5
            goto L62
        Le1:
            r5 = r2
            goto L62
        Le4:
            return r0
        Le5:
            java.lang.String r11 = "Unknown Focusability"
            defpackage.i.m(r11)
            return r2
    }

    public final defpackage.of5 U0(defpackage.jk3 r3) {
            r2 = this;
            ih2 r0 = r2.T0()
            of5 r0 = r0.l
            of5 r1 = defpackage.vs0.g0
            if (r0 == r1) goto L1b
            if (r3 != 0) goto Ld
            return r0
        Ld:
            eg4 r2 = defpackage.nc1.e0(r2)
            r1 = 6
            long r2 = defpackage.jk3.i(r3, r2, r1)
            of5 r2 = r0.i(r2)
            return r2
        L1b:
            if (r3 == 0) goto L27
            eg4 r2 = defpackage.nc1.e0(r2)
            r0 = 0
            of5 r2 = r3.O(r2, r0)
            return r2
        L27:
            eg4 r2 = defpackage.nc1.e0(r2)
            long r2 = r2.L
            long r2 = defpackage.qo2.S(r2)
            r0 = 0
            of5 r2 = defpackage.kj2.b(r0, r2)
            return r2
    }

    public final defpackage.sp3 V0() {
            r6 = this;
            z64 r0 = r6.A
            boolean r0 = r0.j0
            if (r0 != 0) goto Lb
            java.lang.String r0 = "visitAncestors called on an unattached node"
            defpackage.p53.c(r0)
        Lb:
            z64 r0 = r6.A
            z64 r0 = r0.X
            sm3 r6 = defpackage.nc1.f0(r6)
        L13:
            r1 = 0
            if (r6 == 0) goto L9f
            if0 r2 = r6.B0
            java.lang.Object r2 = r2.g
            z64 r2 = (defpackage.z64) r2
            int r2 = r2.R
            r3 = 8388640(0x800020, float:1.1754988E-38)
            r2 = r2 & r3
            if (r2 == 0) goto L8c
        L24:
            if (r0 == 0) goto L8c
            int r2 = r0.L
            r4 = r2 & r3
            if (r4 == 0) goto L89
            r4 = 8388608(0x800000, float:1.1754944E-38)
            r4 = r4 & r2
            if (r4 == 0) goto L4f
            boolean r6 = r0 instanceof defpackage.sp3
            if (r6 == 0) goto L36
            goto L4a
        L36:
            boolean r6 = r0 instanceof defpackage.zg1
            if (r6 == 0) goto L49
            zg1 r0 = (defpackage.zg1) r0
            z64 r6 = r0.l0
            r0 = r1
        L3f:
            if (r6 == 0) goto L4a
            boolean r2 = r6 instanceof defpackage.sp3
            if (r2 == 0) goto L46
            r0 = r6
        L46:
            z64 r6 = r6.Y
            goto L3f
        L49:
            r0 = r1
        L4a:
            sp3 r0 = (defpackage.sp3) r0
            if (r0 == 0) goto L9f
            return r0
        L4f:
            r2 = r2 & 32
            if (r2 == 0) goto L89
            boolean r2 = r0 instanceof defpackage.c74
            if (r2 == 0) goto L59
            r4 = r0
            goto L6e
        L59:
            boolean r2 = r0 instanceof defpackage.zg1
            if (r2 == 0) goto L6d
            r2 = r0
            zg1 r2 = (defpackage.zg1) r2
            z64 r2 = r2.l0
            r4 = r1
        L63:
            if (r2 == 0) goto L6e
            boolean r5 = r2 instanceof defpackage.c74
            if (r5 == 0) goto L6a
            r4 = r2
        L6a:
            z64 r2 = r2.Y
            goto L63
        L6d:
            r4 = r1
        L6e:
            c74 r4 = (defpackage.c74) r4
            if (r4 == 0) goto L89
            gi2 r2 = r4.X()
            j41 r5 = defpackage.a40.a
            boolean r2 = r2.z(r5)
            if (r2 == 0) goto L89
            gi2 r6 = r4.X()
            java.lang.Object r6 = r6.D(r5)
            sp3 r6 = (defpackage.sp3) r6
            return r6
        L89:
            z64 r0 = r0.X
            goto L24
        L8c:
            sm3 r6 = r6.v()
            if (r6 == 0) goto L9c
            if0 r0 = r6.B0
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r0.f
            vy6 r0 = (defpackage.vy6) r0
            goto L13
        L9c:
            r0 = r1
            goto L13
        L9f:
            return r1
    }

    public final defpackage.sh2 W0() {
            r9 = this;
            boolean r0 = r9.j0
            if (r0 != 0) goto L7
            sh2 r9 = defpackage.sh2.Inactive
            return r9
        L7:
            zp4 r0 = defpackage.nc1.g0(r9)
            te r0 = (defpackage.te) r0
            ah2 r0 = r0.getFocusOwner()
            eh2 r0 = (defpackage.eh2) r0
            vh2 r0 = r0.f()
            if (r0 != 0) goto L1c
            sh2 r9 = defpackage.sh2.Inactive
            return r9
        L1c:
            if (r9 != r0) goto L21
            sh2 r9 = defpackage.sh2.Active
            return r9
        L21:
            boolean r1 = r0.j0
            if (r1 == 0) goto Lb0
            z64 r1 = r0.A
            boolean r1 = r1.j0
            if (r1 != 0) goto L30
            java.lang.String r1 = "visitAncestors called on an unattached node"
            defpackage.p53.c(r1)
        L30:
            z64 r1 = r0.A
            z64 r1 = r1.X
            sm3 r0 = defpackage.nc1.f0(r0)
        L38:
            if (r0 == 0) goto Lb0
            if0 r2 = r0.B0
            java.lang.Object r2 = r2.g
            z64 r2 = (defpackage.z64) r2
            int r2 = r2.R
            r2 = r2 & 1024(0x400, float:1.435E-42)
            r3 = 0
            if (r2 == 0) goto L9f
        L47:
            if (r1 == 0) goto L9f
            int r2 = r1.L
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L9c
            r2 = r1
            r4 = r3
        L51:
            if (r2 == 0) goto L9c
            boolean r5 = r2 instanceof defpackage.vh2
            if (r5 == 0) goto L5e
            vh2 r2 = (defpackage.vh2) r2
            if (r9 != r2) goto L97
            sh2 r9 = defpackage.sh2.ActiveParent
            return r9
        L5e:
            int r5 = r2.L
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L97
            boolean r5 = r2 instanceof defpackage.zg1
            if (r5 == 0) goto L97
            r5 = r2
            zg1 r5 = (defpackage.zg1) r5
            z64 r5 = r5.l0
            r6 = 0
        L6e:
            r7 = 1
            if (r5 == 0) goto L94
            int r8 = r5.L
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L91
            int r6 = r6 + 1
            if (r6 != r7) goto L7d
            r2 = r5
            goto L91
        L7d:
            if (r4 != 0) goto L88
            ua4 r4 = new ua4
            r7 = 16
            z64[] r7 = new defpackage.z64[r7]
            r4.<init>(r7)
        L88:
            if (r2 == 0) goto L8e
            r4.b(r2)
            r2 = r3
        L8e:
            r4.b(r5)
        L91:
            z64 r5 = r5.Y
            goto L6e
        L94:
            if (r6 != r7) goto L97
            goto L51
        L97:
            z64 r2 = defpackage.nc1.A(r4)
            goto L51
        L9c:
            z64 r1 = r1.X
            goto L47
        L9f:
            sm3 r0 = r0.v()
            if (r0 == 0) goto Lae
            if0 r1 = r0.B0
            if (r1 == 0) goto Lae
            java.lang.Object r1 = r1.f
            vy6 r1 = (defpackage.vy6) r1
            goto L38
        Lae:
            r1 = r3
            goto L38
        Lb0:
            sh2 r9 = defpackage.sh2.Inactive
            return r9
    }

    public final void X0() {
            r4 = this;
            sh2 r0 = r4.W0()
            int[] r1 = defpackage.uh2.b
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L1d
            r2 = 2
            if (r0 == r2) goto L1d
            r4 = 3
            if (r0 == r4) goto L48
            r4 = 4
            if (r0 != r4) goto L19
            goto L48
        L19:
            defpackage.i.d()
            return
        L1d:
            dh5 r0 = new dh5
            r0.<init>()
            le r2 = new le
            r3 = 5
            r2.<init>(r3, r0, r4)
            defpackage.jx2.B(r4, r2)
            java.lang.Object r0 = r0.A
            if (r0 == 0) goto L49
            fh2 r0 = (defpackage.fh2) r0
            boolean r0 = r0.b()
            if (r0 != 0) goto L48
            zp4 r4 = defpackage.nc1.g0(r4)
            te r4 = (defpackage.te) r4
            ah2 r4 = r4.getFocusOwner()
            eh2 r4 = (defpackage.eh2) r4
            r0 = 8
            r4.b(r0, r1, r1)
        L48:
            return
        L49:
            java.lang.String r4 = "focusProperties"
            defpackage.nb3.a0(r4)
            r4 = 0
            throw r4
    }

    public final boolean Y0(int r3) {
            r2 = this;
            java.lang.String r0 = "FocusTransactions:requestFocus"
            android.os.Trace.beginSection(r0)
            ih2 r0 = r2.T0()     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.a     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L15
            boolean r2 = r2.R0(r3)     // Catch: java.lang.Throwable -> L23
            android.os.Trace.endSection()
            return r2
        L15:
            qe r0 = new qe     // Catch: java.lang.Throwable -> L23
            r1 = 4
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L23
            boolean r2 = defpackage.uj2.y(r2, r3, r0)     // Catch: java.lang.Throwable -> L23
            android.os.Trace.endSection()
            return r2
        L23:
            r2 = move-exception
            android.os.Trace.endSection()
            throw r2
    }

    @Override // defpackage.gi4
    public final void l0() {
            r0 = this;
            r0.X0()
            return
    }

    @Override // defpackage.kj3
    public final void m(defpackage.jk3 r1) {
            r0 = this;
            return
    }
}
