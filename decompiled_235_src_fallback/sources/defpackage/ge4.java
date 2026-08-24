package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ge4  reason: default package */
/* loaded from: classes.dex */
public final class ge4 extends defpackage.z64 implements defpackage.ub7, defpackage.ae4 {
    public defpackage.ae4 k0;
    public defpackage.eb l0;
    public defpackage.ge4 m0;
    public final java.lang.String n0;

    public ge4(defpackage.ae4 r1, defpackage.eb r2) {
            r0 = this;
            r0.<init>()
            r0.k0 = r1
            if (r2 != 0) goto Le
            eb r2 = new eb
            r1 = 14
            r2.<init>(r1)
        Le:
            r0.l0 = r2
            java.lang.String r1 = "androidx.compose.ui.input.nestedscroll.NestedScrollNode"
            r0.n0 = r1
            return
    }

    @Override // defpackage.ae4
    public final java.lang.Object H(long r7, defpackage.r41 r9) {
            r6 = this;
            boolean r0 = r9 instanceof defpackage.fe4
            if (r0 == 0) goto L13
            r0 = r9
            fe4 r0 = (defpackage.fe4) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L1a
        L13:
            fe4 r0 = new fe4
            s41 r9 = (defpackage.s41) r9
            r0.<init>(r6, r9)
        L1a:
            java.lang.Object r9 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            long r6 = r0.R
            defpackage.oi2.Y(r9)
            goto L6c
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r3
        L35:
            long r7 = r0.R
            defpackage.oi2.Y(r9)
            goto L53
        L3b:
            defpackage.oi2.Y(r9)
            boolean r9 = r6.j0
            if (r9 == 0) goto L46
            ge4 r3 = r6.S0()
        L46:
            if (r3 == 0) goto L58
            r0.R = r7
            r0.Z = r5
            java.lang.Object r9 = r3.H(r7, r0)
            if (r9 != r1) goto L53
            goto L6a
        L53:
            ol7 r9 = (defpackage.ol7) r9
            long r2 = r9.a
            goto L5a
        L58:
            r2 = 0
        L5a:
            ae4 r6 = r6.k0
            long r7 = defpackage.ol7.d(r7, r2)
            r0.R = r2
            r0.Z = r4
            java.lang.Object r9 = r6.H(r7, r0)
            if (r9 != r1) goto L6b
        L6a:
            return r1
        L6b:
            r6 = r2
        L6c:
            ol7 r9 = (defpackage.ol7) r9
            long r8 = r9.a
            long r6 = defpackage.ol7.e(r6, r8)
            ol7 r8 = new ol7
            r8.<init>(r6)
            return r8
    }

    @Override // defpackage.z64
    public final void J0() {
            r3 = this;
            eb r0 = r3.l0
            r0.B = r3
            r1 = 0
            r0.L = r1
            r3.m0 = r1
            pj r1 = new pj
            r2 = 14
            r1.<init>(r3, r2)
            r0.R = r1
            w61 r3 = r3.F0()
            r0.X = r3
            return
    }

    @Override // defpackage.z64
    public final void K0() {
            r3 = this;
            dh5 r0 = new dh5
            r0.<init>()
            me r1 = new me
            r2 = 2
            r1.<init>(r2, r0)
            defpackage.ii2.W(r3, r1)
            java.lang.Object r0 = r0.A
            ub7 r0 = (defpackage.ub7) r0
            ge4 r0 = (defpackage.ge4) r0
            r3.m0 = r0
            eb r1 = r3.l0
            r1.L = r0
            java.lang.Object r0 = r1.B
            ge4 r0 = (defpackage.ge4) r0
            if (r0 != r3) goto L23
            r3 = 0
            r1.B = r3
        L23:
            return
    }

    @Override // defpackage.ae4
    public final long N(int r3, long r4) {
            r2 = this;
            boolean r0 = r2.j0
            if (r0 == 0) goto L9
            ge4 r0 = r2.S0()
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L11
            long r0 = r0.N(r3, r4)
            goto L13
        L11:
            r0 = 0
        L13:
            ae4 r2 = r2.k0
            long r4 = defpackage.jk4.e(r4, r0)
            long r2 = r2.N(r3, r4)
            long r2 = defpackage.jk4.f(r0, r2)
            return r2
    }

    public final defpackage.w61 R0() {
            r4 = this;
            ge4 r0 = r4.S0()
            r1 = 0
            if (r0 == 0) goto Lc
            w61 r0 = r0.R0()
            goto Ld
        Lc:
            r0 = r1
        Ld:
            if (r0 == 0) goto L17
            boolean r2 = defpackage.g04.H(r0)
            r3 = 1
            if (r2 != r3) goto L17
            return r0
        L17:
            eb r4 = r4.l0
            java.lang.Object r4 = r4.X
            w61 r4 = (defpackage.w61) r4
            if (r4 == 0) goto L20
            return r4
        L20:
            java.lang.String r4 = "in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first."
            defpackage.i.m(r4)
            return r1
    }

    public final defpackage.ge4 S0() {
            r10 = this;
            boolean r0 = r10.j0
            r1 = 0
            if (r0 == 0) goto La3
            z64 r0 = r10.A
            boolean r0 = r0.j0
            if (r0 != 0) goto L10
            java.lang.String r0 = "visitAncestors called on an unattached node"
            defpackage.p53.c(r0)
        L10:
            z64 r0 = r10.A
            z64 r0 = r0.X
            sm3 r2 = defpackage.nc1.f0(r10)
        L18:
            if (r2 == 0) goto La1
            if0 r3 = r2.B0
            java.lang.Object r3 = r3.g
            z64 r3 = (defpackage.z64) r3
            int r3 = r3.R
            r4 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 & r4
            if (r3 == 0) goto L8e
        L27:
            if (r0 == 0) goto L8e
            int r3 = r0.L
            r3 = r3 & r4
            if (r3 == 0) goto L8b
            r3 = r0
            r5 = r1
        L30:
            if (r3 == 0) goto L8b
            boolean r6 = r3 instanceof defpackage.ub7
            if (r6 == 0) goto L4f
            r6 = r3
            ub7 r6 = (defpackage.ub7) r6
            java.lang.String r7 = r10.n0
            java.lang.Object r8 = r6.n()
            boolean r7 = defpackage.nb3.k(r7, r8)
            if (r7 == 0) goto L4f
            java.lang.Class<ge4> r7 = defpackage.ge4.class
            java.lang.Class r8 = r6.getClass()
            if (r7 != r8) goto L4f
            r1 = r6
            goto La1
        L4f:
            int r6 = r3.L
            r6 = r6 & r4
            if (r6 == 0) goto L86
            boolean r6 = r3 instanceof defpackage.zg1
            if (r6 == 0) goto L86
            r6 = r3
            zg1 r6 = (defpackage.zg1) r6
            z64 r6 = r6.l0
            r7 = 0
        L5e:
            r8 = 1
            if (r6 == 0) goto L83
            int r9 = r6.L
            r9 = r9 & r4
            if (r9 == 0) goto L80
            int r7 = r7 + 1
            if (r7 != r8) goto L6c
            r3 = r6
            goto L80
        L6c:
            if (r5 != 0) goto L77
            ua4 r5 = new ua4
            r8 = 16
            z64[] r8 = new defpackage.z64[r8]
            r5.<init>(r8)
        L77:
            if (r3 == 0) goto L7d
            r5.b(r3)
            r3 = r1
        L7d:
            r5.b(r6)
        L80:
            z64 r6 = r6.Y
            goto L5e
        L83:
            if (r7 != r8) goto L86
            goto L30
        L86:
            z64 r3 = defpackage.nc1.A(r5)
            goto L30
        L8b:
            z64 r0 = r0.X
            goto L27
        L8e:
            sm3 r2 = r2.v()
            if (r2 == 0) goto L9e
            if0 r0 = r2.B0
            if (r0 == 0) goto L9e
            java.lang.Object r0 = r0.f
            vy6 r0 = (defpackage.vy6) r0
            goto L18
        L9e:
            r0 = r1
            goto L18
        La1:
            ge4 r1 = (defpackage.ge4) r1
        La3:
            return r1
    }

    @Override // defpackage.ub7
    public final java.lang.Object n() {
            r0 = this;
            java.lang.String r0 = r0.n0
            return r0
    }

    @Override // defpackage.ae4
    public final long w0(long r7, long r9, int r11) {
            r6 = this;
            ae4 r0 = r6.k0
            r1 = r7
            r3 = r9
            r5 = r11
            long r7 = r0.w0(r1, r3, r5)
            boolean r9 = r6.j0
            if (r9 == 0) goto L13
            ge4 r6 = r6.S0()
        L11:
            r0 = r6
            goto L15
        L13:
            r6 = 0
            goto L11
        L15:
            if (r0 == 0) goto L24
            long r1 = defpackage.jk4.f(r1, r7)
            long r3 = defpackage.jk4.e(r3, r7)
            long r9 = r0.w0(r1, r3, r5)
            goto L26
        L24:
            r9 = 0
        L26:
            long r6 = defpackage.jk4.f(r7, r9)
            return r6
    }

    @Override // defpackage.ae4
    public final java.lang.Object z0(long r13, long r15, defpackage.r41 r17) {
            r12 = this;
            r0 = r17
            boolean r1 = r0 instanceof defpackage.ee4
            if (r1 == 0) goto L16
            r1 = r0
            ee4 r1 = (defpackage.ee4) r1
            int r2 = r1.d0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.d0 = r2
        L14:
            r7 = r1
            goto L1e
        L16:
            ee4 r1 = new ee4
            s41 r0 = (defpackage.s41) r0
            r1.<init>(r12, r0)
            goto L14
        L1e:
            java.lang.Object r0 = r7.Y
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r7.d0
            r8 = 0
            r9 = 2
            r3 = 1
            if (r2 == 0) goto L44
            if (r2 == r3) goto L39
            if (r2 != r9) goto L33
            long r12 = r7.R
            defpackage.oi2.Y(r0)
            goto L85
        L33:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            return r8
        L39:
            long r13 = r7.X
            long r2 = r7.R
            defpackage.oi2.Y(r0)
            r10 = r2
            r2 = r13
            r13 = r10
            goto L59
        L44:
            defpackage.oi2.Y(r0)
            ae4 r2 = r12.k0
            r7.R = r13
            r5 = r15
            r7.X = r5
            r7.d0 = r3
            r3 = r13
            java.lang.Object r0 = r2.z0(r3, r5, r7)
            if (r0 != r1) goto L58
            goto L83
        L58:
            r2 = r15
        L59:
            ol7 r0 = (defpackage.ol7) r0
            long r4 = r0.a
            boolean r0 = r12.j0
            if (r0 == 0) goto L69
            if (r0 == 0) goto L67
            ge4 r8 = r12.S0()
        L67:
            r12 = r8
            goto L6c
        L69:
            ge4 r8 = r12.m0
            goto L67
        L6c:
            if (r12 == 0) goto L8b
            long r13 = defpackage.ol7.e(r13, r4)
            long r2 = defpackage.ol7.d(r2, r4)
            r7.R = r4
            r7.d0 = r9
            r15 = r2
            r17 = r7
            java.lang.Object r0 = r12.z0(r13, r15, r17)
            if (r0 != r1) goto L84
        L83:
            return r1
        L84:
            r12 = r4
        L85:
            ol7 r0 = (defpackage.ol7) r0
            long r0 = r0.a
            r4 = r12
            goto L8d
        L8b:
            r0 = 0
        L8d:
            long r12 = defpackage.ol7.e(r4, r0)
            ol7 r14 = new ol7
            r14.<init>(r12)
            return r14
    }
}
