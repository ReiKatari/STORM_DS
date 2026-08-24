package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: of6  reason: default package */
/* loaded from: classes.dex */
public class of6 extends defpackage.t1 implements defpackage.na4, defpackage.le2, defpackage.ro2 {
    public final int X;
    public final int Y;
    public final defpackage.m80 Z;
    public java.lang.Object[] d0;
    public long e0;
    public long f0;
    public int g0;
    public int h0;

    public of6(int r1, int r2, defpackage.m80 r3) {
            r0 = this;
            r0.<init>()
            r0.X = r1
            r0.Y = r2
            r0.Z = r3
            return
    }

    public static defpackage.x61 m(defpackage.of6 r8, defpackage.ne2 r9, defpackage.r41 r10) {
            boolean r0 = r10 instanceof defpackage.nf6
            if (r0 == 0) goto L13
            r0 = r10
            nf6 r0 = (defpackage.nf6) r0
            int r1 = r0.f0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f0 = r1
            goto L18
        L13:
            nf6 r0 = new nf6
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.d0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.f0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L5c
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L38
            rc3 r8 = r0.Z
            qf6 r9 = r0.Y
            ne2 r2 = r0.X
            of6 r5 = r0.R
        L31:
            defpackage.oi2.Y(r10)     // Catch: java.lang.Throwable -> L35
            goto L48
        L35:
            r8 = move-exception
            goto Lcc
        L38:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            r8 = 0
            return r8
        L3f:
            rc3 r8 = r0.Z
            qf6 r9 = r0.Y
            ne2 r2 = r0.X
            of6 r5 = r0.R
            goto L31
        L48:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L90
        L4c:
            qf6 r9 = r0.Y
            ne2 r8 = r0.X
            of6 r2 = r0.R
            defpackage.oi2.Y(r10)     // Catch: java.lang.Throwable -> L58
            r10 = r8
            r8 = r2
            goto L83
        L58:
            r8 = move-exception
            r5 = r2
            goto Lcc
        L5c:
            defpackage.oi2.Y(r10)
            u1 r10 = r8.d()
            qf6 r10 = (defpackage.qf6) r10
            boolean r2 = r9 instanceof defpackage.ut6     // Catch: java.lang.Throwable -> L7b
            if (r2 == 0) goto L80
            r2 = r9
            ut6 r2 = (defpackage.ut6) r2     // Catch: java.lang.Throwable -> L7b
            r0.R = r8     // Catch: java.lang.Throwable -> L7b
            r0.X = r9     // Catch: java.lang.Throwable -> L7b
            r0.Y = r10     // Catch: java.lang.Throwable -> L7b
            r0.f0 = r5     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r2 = r2.b(r0)     // Catch: java.lang.Throwable -> L7b
            if (r2 != r1) goto L80
            goto Lcb
        L7b:
            r9 = move-exception
            r5 = r8
            r8 = r9
            r9 = r10
            goto Lcc
        L80:
            r7 = r10
            r10 = r9
            r9 = r7
        L83:
            l61 r2 = r0.B     // Catch: java.lang.Throwable -> La9
            r2.getClass()     // Catch: java.lang.Throwable -> La9
            vs0 r5 = defpackage.vs0.h0     // Catch: java.lang.Throwable -> La9
            j61 r2 = r2.Z(r5)     // Catch: java.lang.Throwable -> La9
            rc3 r2 = (defpackage.rc3) r2     // Catch: java.lang.Throwable -> La9
        L90:
            java.lang.Object r5 = r8.u(r9)     // Catch: java.lang.Throwable -> La9
            gr1 r6 = defpackage.pf6.a     // Catch: java.lang.Throwable -> La9
            if (r5 != r6) goto Lad
            r0.R = r8     // Catch: java.lang.Throwable -> La9
            r0.X = r10     // Catch: java.lang.Throwable -> La9
            r0.Y = r9     // Catch: java.lang.Throwable -> La9
            r0.Z = r2     // Catch: java.lang.Throwable -> La9
            r0.f0 = r4     // Catch: java.lang.Throwable -> La9
            java.lang.Object r5 = r8.j(r9, r0)     // Catch: java.lang.Throwable -> La9
            if (r5 != r1) goto L90
            goto Lcb
        La9:
            r10 = move-exception
            r5 = r8
            r8 = r10
            goto Lcc
        Lad:
            if (r2 == 0) goto Lbb
            boolean r6 = r2.e()     // Catch: java.lang.Throwable -> La9
            if (r6 == 0) goto Lb6
            goto Lbb
        Lb6:
            java.util.concurrent.CancellationException r10 = r2.v()     // Catch: java.lang.Throwable -> La9
            throw r10     // Catch: java.lang.Throwable -> La9
        Lbb:
            r0.R = r8     // Catch: java.lang.Throwable -> La9
            r0.X = r10     // Catch: java.lang.Throwable -> La9
            r0.Y = r9     // Catch: java.lang.Throwable -> La9
            r0.Z = r2     // Catch: java.lang.Throwable -> La9
            r0.f0 = r3     // Catch: java.lang.Throwable -> La9
            java.lang.Object r5 = r10.a(r5, r0)     // Catch: java.lang.Throwable -> La9
            if (r5 != r1) goto L90
        Lcb:
            return r1
        Lcc:
            r5.g(r9)
            throw r8
    }

    @Override // defpackage.na4, defpackage.ne2
    public final java.lang.Object a(java.lang.Object r8, defpackage.r41 r9) {
            r7 = this;
            boolean r0 = r7.k(r8)
            if (r0 == 0) goto L9
            jg7 r7 = defpackage.jg7.a
            return r7
        L9:
            rj0 r5 = new rj0
            r41 r9 = defpackage.np2.V(r9)
            r6 = 1
            r5.<init>(r6, r9)
            r5.v()
            r41[] r9 = defpackage.q60.a
            monitor-enter(r7)
            boolean r0 = r7.s(r8)     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L30
            jg7 r8 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L2b
            r5.i(r8)     // Catch: java.lang.Throwable -> L2b
            r41[] r8 = r7.p(r9)     // Catch: java.lang.Throwable -> L2b
            r9 = 0
            r1 = r7
            goto L59
        L2b:
            r0 = move-exception
            r8 = r0
            r1 = r7
            goto L8e
        L30:
            lf6 r0 = new lf6     // Catch: java.lang.Throwable -> L8b
            long r1 = r7.q()     // Catch: java.lang.Throwable -> L8b
            int r3 = r7.g0     // Catch: java.lang.Throwable -> L86
            int r4 = r7.h0     // Catch: java.lang.Throwable -> L86
            int r3 = r3 + r4
            long r3 = (long) r3
            long r2 = r1 + r3
            r1 = r7
            r4 = r8
            r0.<init>(r1, r2, r4, r5)     // Catch: java.lang.Throwable -> L54
            r1.o(r0)     // Catch: java.lang.Throwable -> L54
            int r7 = r1.h0     // Catch: java.lang.Throwable -> L54
            int r7 = r7 + r6
            r1.h0 = r7     // Catch: java.lang.Throwable -> L54
            int r7 = r1.Y     // Catch: java.lang.Throwable -> L54
            if (r7 != 0) goto L57
            r41[] r9 = r1.p(r9)     // Catch: java.lang.Throwable -> L54
            goto L57
        L54:
            r0 = move-exception
        L55:
            r8 = r0
            goto L8e
        L57:
            r8 = r9
            r9 = r0
        L59:
            monitor-exit(r1)
            if (r9 == 0) goto L65
            kj0 r7 = new kj0
            r0 = 2
            r7.<init>(r9, r0)
            r5.A(r7)
        L65:
            int r7 = r8.length
            r9 = 0
        L67:
            if (r9 >= r7) goto L75
            r0 = r8[r9]
            if (r0 == 0) goto L72
            jg7 r1 = defpackage.jg7.a
            r0.i(r1)
        L72:
            int r9 = r9 + 1
            goto L67
        L75:
            java.lang.Object r7 = r5.s()
            x61 r8 = defpackage.x61.COROUTINE_SUSPENDED
            if (r7 != r8) goto L7e
            goto L80
        L7e:
            jg7 r7 = defpackage.jg7.a
        L80:
            if (r7 != r8) goto L83
            return r7
        L83:
            jg7 r7 = defpackage.jg7.a
            return r7
        L86:
            r0 = move-exception
            r1 = r7
            r7 = r0
            r8 = r7
            goto L8e
        L8b:
            r0 = move-exception
            r1 = r7
            goto L55
        L8e:
            monitor-exit(r1)
            throw r8
    }

    @Override // defpackage.le2
    public final java.lang.Object b(defpackage.ne2 r1, defpackage.r41 r2) {
            r0 = this;
            x61 r0 = m(r0, r1, r2)
            return r0
    }

    @Override // defpackage.ro2
    public final defpackage.le2 c(defpackage.l61 r1, int r2, defpackage.m80 r3) {
            r0 = this;
            le2 r0 = defpackage.pf6.d(r0, r1, r2, r3)
            return r0
    }

    @Override // defpackage.t1
    public final defpackage.u1 e() {
            r2 = this;
            qf6 r2 = new qf6
            r2.<init>()
            r0 = -1
            r2.a = r0
            return r2
    }

    @Override // defpackage.t1
    public final defpackage.u1[] f() {
            r0 = this;
            r0 = 2
            qf6[] r0 = new defpackage.qf6[r0]
            return r0
    }

    @Override // defpackage.na4
    public final void h() {
            r13 = this;
            monitor-enter(r13)
            long r0 = r13.q()     // Catch: java.lang.Throwable -> L2b
            int r2 = r13.g0     // Catch: java.lang.Throwable -> L2b
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L2b
            long r5 = r0 + r2
            long r7 = r13.f0     // Catch: java.lang.Throwable -> L2b
            long r0 = r13.q()     // Catch: java.lang.Throwable -> L2b
            int r2 = r13.g0     // Catch: java.lang.Throwable -> L2b
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L2b
            long r9 = r0 + r2
            long r0 = r13.q()     // Catch: java.lang.Throwable -> L2b
            int r2 = r13.g0     // Catch: java.lang.Throwable -> L2b
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L2b
            long r0 = r0 + r2
            int r2 = r13.h0     // Catch: java.lang.Throwable -> L2b
            long r2 = (long) r2
            long r11 = r0 + r2
            r4 = r13
            r4.v(r5, r7, r9, r11)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r4)
            return
        L28:
            r0 = move-exception
        L29:
            r13 = r0
            goto L2e
        L2b:
            r0 = move-exception
            r4 = r13
            goto L29
        L2e:
            monitor-exit(r4)
            throw r13
    }

    public final java.lang.Object j(defpackage.qf6 r6, defpackage.nf6 r7) {
            r5 = this;
            rj0 r0 = new rj0
            r41 r7 = defpackage.np2.V(r7)
            r1 = 1
            r0.<init>(r1, r7)
            r0.v()
            monitor-enter(r5)
            long r1 = r5.t(r6)     // Catch: java.lang.Throwable -> L1b
            r3 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 >= 0) goto L1d
            r6.b = r0     // Catch: java.lang.Throwable -> L1b
            goto L22
        L1b:
            r6 = move-exception
            goto L2f
        L1d:
            jg7 r6 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L1b
            r0.i(r6)     // Catch: java.lang.Throwable -> L1b
        L22:
            monitor-exit(r5)
            java.lang.Object r5 = r0.s()
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            if (r5 != r6) goto L2c
            return r5
        L2c:
            jg7 r5 = defpackage.jg7.a
            return r5
        L2f:
            monitor-exit(r5)
            throw r6
    }

    @Override // defpackage.na4
    public final boolean k(java.lang.Object r5) {
            r4 = this;
            r41[] r0 = defpackage.q60.a
            monitor-enter(r4)
            boolean r5 = r4.s(r5)     // Catch: java.lang.Throwable -> L10
            r1 = 0
            if (r5 == 0) goto L12
            r41[] r0 = r4.p(r0)     // Catch: java.lang.Throwable -> L10
            r5 = 1
            goto L13
        L10:
            r5 = move-exception
            goto L24
        L12:
            r5 = r1
        L13:
            monitor-exit(r4)
            int r4 = r0.length
        L15:
            if (r1 >= r4) goto L23
            r2 = r0[r1]
            if (r2 == 0) goto L20
            jg7 r3 = defpackage.jg7.a
            r2.i(r3)
        L20:
            int r1 = r1 + 1
            goto L15
        L23:
            return r5
        L24:
            monitor-exit(r4)
            throw r5
    }

    public final void l() {
            r8 = this;
            int r0 = r8.Y
            r1 = 1
            if (r0 != 0) goto La
            int r0 = r8.h0
            if (r0 > r1) goto La
            goto L3f
        La:
            java.lang.Object[] r0 = r8.d0
            r0.getClass()
        Lf:
            int r2 = r8.h0
            if (r2 <= 0) goto L3f
            long r2 = r8.q()
            int r4 = r8.g0
            int r5 = r8.h0
            int r4 = r4 + r5
            long r6 = (long) r4
            long r2 = r2 + r6
            r6 = 1
            long r2 = r2 - r6
            int r2 = (int) r2
            int r3 = r0.length
            int r3 = r3 - r1
            r2 = r2 & r3
            r2 = r0[r2]
            gr1 r3 = defpackage.pf6.a
            if (r2 != r3) goto L3f
            int r5 = r5 + (-1)
            r8.h0 = r5
            long r2 = r8.q()
            int r4 = r8.g0
            int r5 = r8.h0
            int r4 = r4 + r5
            long r4 = (long) r4
            long r2 = r2 + r4
            r4 = 0
            defpackage.pf6.c(r0, r2, r4)
            goto Lf
        L3f:
            return
    }

    public final void n() {
            r10 = this;
            java.lang.Object[] r0 = r10.d0
            r0.getClass()
            long r1 = r10.q()
            r3 = 0
            defpackage.pf6.c(r0, r1, r3)
            int r0 = r10.g0
            int r0 = r0 + (-1)
            r10.g0 = r0
            long r0 = r10.q()
            r2 = 1
            long r0 = r0 + r2
            long r2 = r10.e0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto L22
            r10.e0 = r0
        L22:
            long r2 = r10.f0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto L4d
            int r2 = r10.B
            if (r2 == 0) goto L4b
            u1[] r2 = r10.A
            if (r2 == 0) goto L4b
            int r3 = r2.length
            r4 = 0
        L32:
            if (r4 >= r3) goto L4b
            r5 = r2[r4]
            if (r5 == 0) goto L48
            qf6 r5 = (defpackage.qf6) r5
            long r6 = r5.a
            r8 = 0
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 < 0) goto L48
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 >= 0) goto L48
            r5.a = r0
        L48:
            int r4 = r4 + 1
            goto L32
        L4b:
            r10.f0 = r0
        L4d:
            return
    }

    public final void o(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.g0
            int r1 = r6.h0
            int r0 = r0 + r1
            java.lang.Object[] r1 = r6.d0
            r2 = 2
            if (r1 != 0) goto L11
            r1 = 0
            r3 = 0
            java.lang.Object[] r1 = r6.r(r1, r3, r2)
            goto L1a
        L11:
            int r3 = r1.length
            if (r0 < r3) goto L1a
            int r3 = r1.length
            int r3 = r3 * r2
            java.lang.Object[] r1 = r6.r(r1, r0, r3)
        L1a:
            long r2 = r6.q()
            long r4 = (long) r0
            long r2 = r2 + r4
            defpackage.pf6.c(r1, r2, r7)
            return
    }

    public final defpackage.r41[] p(defpackage.r41[] r11) {
            r10 = this;
            int r0 = r11.length
            int r1 = r10.B
            if (r1 == 0) goto L3e
            u1[] r1 = r10.A
            if (r1 == 0) goto L3e
            int r2 = r1.length
            r3 = 0
        Lb:
            if (r3 >= r2) goto L3e
            r4 = r1[r3]
            if (r4 == 0) goto L3b
            qf6 r4 = (defpackage.qf6) r4
            rj0 r5 = r4.b
            if (r5 != 0) goto L18
            goto L3b
        L18:
            long r6 = r10.t(r4)
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L3b
            int r6 = r11.length
            if (r0 < r6) goto L30
            int r6 = r11.length
            r7 = 2
            int r6 = r6 * r7
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r6)
        L30:
            r6 = r11
            r41[] r6 = (defpackage.r41[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.b = r0
            r0 = r7
        L3b:
            int r3 = r3 + 1
            goto Lb
        L3e:
            r41[] r11 = (defpackage.r41[]) r11
            return r11
    }

    public final long q() {
            r4 = this;
            long r0 = r4.f0
            long r2 = r4.e0
            long r0 = java.lang.Math.min(r0, r2)
            return r0
    }

    public final java.lang.Object[] r(java.lang.Object[] r7, int r8, int r9) {
            r6 = this;
            if (r9 <= 0) goto L20
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r6.d0 = r9
            if (r7 != 0) goto L9
            goto L1f
        L9:
            long r0 = r6.q()
            r6 = 0
        Le:
            if (r6 >= r8) goto L1f
            long r2 = (long) r6
            long r2 = r2 + r0
            int r4 = (int) r2
            int r5 = r7.length
            int r5 = r5 + (-1)
            r4 = r4 & r5
            r4 = r7[r4]
            defpackage.pf6.c(r9, r2, r4)
            int r6 = r6 + 1
            goto Le
        L1f:
            return r9
        L20:
            java.lang.String r6 = "Buffer size overflow"
            defpackage.i.m(r6)
            r6 = 0
            return r6
    }

    public final boolean s(java.lang.Object r13) {
            r12 = this;
            int r1 = r12.B
            int r2 = r12.X
            r9 = 1
            if (r1 != 0) goto L23
            if (r2 != 0) goto Lb
            goto L83
        Lb:
            r12.o(r13)
            int r1 = r12.g0
            int r1 = r1 + r9
            r12.g0 = r1
            if (r1 <= r2) goto L18
            r12.n()
        L18:
            long r1 = r12.q()
            int r3 = r12.g0
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.f0 = r1
            return r9
        L23:
            int r1 = r12.g0
            int r3 = r12.Y
            if (r1 < r3) goto L4b
            long r4 = r12.f0
            long r6 = r12.e0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L4b
            int[] r1 = defpackage.mf6.a
            m80 r4 = r12.Z
            int r4 = r4.ordinal()
            r1 = r1[r4]
            if (r1 == r9) goto L49
            r4 = 2
            if (r1 == r4) goto L83
            r4 = 3
            if (r1 != r4) goto L44
            goto L4b
        L44:
            defpackage.i.d()
            r0 = 0
            return r0
        L49:
            r0 = 0
            return r0
        L4b:
            r12.o(r13)
            int r1 = r12.g0
            int r1 = r1 + r9
            r12.g0 = r1
            if (r1 <= r3) goto L58
            r12.n()
        L58:
            long r3 = r12.q()
            int r1 = r12.g0
            long r5 = (long) r1
            long r3 = r3 + r5
            long r5 = r12.e0
            long r3 = r3 - r5
            int r1 = (int) r3
            if (r1 <= r2) goto L83
            r1 = 1
            long r1 = r1 + r5
            long r3 = r12.f0
            long r5 = r12.q()
            int r7 = r12.g0
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.q()
            int r10 = r12.g0
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.h0
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.v(r1, r3, r5, r7)
        L83:
            return r9
    }

    public final long t(defpackage.qf6 r7) {
            r6 = this;
            long r0 = r7.a
            long r2 = r6.q()
            int r7 = r6.g0
            long r4 = (long) r7
            long r2 = r2 + r4
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 >= 0) goto Lf
            goto L24
        Lf:
            int r7 = r6.Y
            if (r7 <= 0) goto L14
            goto L21
        L14:
            long r2 = r6.q()
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L1d
            goto L21
        L1d:
            int r6 = r6.h0
            if (r6 != 0) goto L24
        L21:
            r6 = -1
            return r6
        L24:
            return r0
    }

    public final java.lang.Object u(defpackage.qf6 r9) {
            r8 = this;
            r41[] r0 = defpackage.q60.a
            monitor-enter(r8)
            long r1 = r8.t(r9)     // Catch: java.lang.Throwable -> L10
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 >= 0) goto L12
            gr1 r9 = defpackage.pf6.a     // Catch: java.lang.Throwable -> L10
            goto L34
        L10:
            r9 = move-exception
            goto L46
        L12:
            long r3 = r9.a     // Catch: java.lang.Throwable -> L10
            java.lang.Object[] r0 = r8.d0     // Catch: java.lang.Throwable -> L10
            r0.getClass()     // Catch: java.lang.Throwable -> L10
            int r5 = (int) r1     // Catch: java.lang.Throwable -> L10
            int r6 = r0.length     // Catch: java.lang.Throwable -> L10
            int r6 = r6 + (-1)
            r5 = r5 & r6
            r0 = r0[r5]     // Catch: java.lang.Throwable -> L10
            boolean r5 = r0 instanceof defpackage.lf6     // Catch: java.lang.Throwable -> L10
            if (r5 == 0) goto L28
            lf6 r0 = (defpackage.lf6) r0     // Catch: java.lang.Throwable -> L10
            java.lang.Object r0 = r0.L     // Catch: java.lang.Throwable -> L10
        L28:
            r5 = 1
            long r1 = r1 + r5
            r9.a = r1     // Catch: java.lang.Throwable -> L10
            r41[] r9 = r8.w(r3)     // Catch: java.lang.Throwable -> L10
            r7 = r0
            r0 = r9
            r9 = r7
        L34:
            monitor-exit(r8)
            int r8 = r0.length
            r1 = 0
        L37:
            if (r1 >= r8) goto L45
            r2 = r0[r1]
            if (r2 == 0) goto L42
            jg7 r3 = defpackage.jg7.a
            r2.i(r3)
        L42:
            int r1 = r1 + 1
            goto L37
        L45:
            return r9
        L46:
            monitor-exit(r8)
            throw r9
    }

    public final void v(long r7, long r9, long r11, long r13) {
            r6 = this;
            long r0 = java.lang.Math.min(r9, r7)
            long r2 = r6.q()
        L8:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L19
            java.lang.Object[] r4 = r6.d0
            r4.getClass()
            r5 = 0
            defpackage.pf6.c(r4, r2, r5)
            r4 = 1
            long r2 = r2 + r4
            goto L8
        L19:
            r6.e0 = r7
            r6.f0 = r9
            long r7 = r11 - r0
            int r7 = (int) r7
            r6.g0 = r7
            long r13 = r13 - r11
            int r7 = (int) r13
            r6.h0 = r7
            return
    }

    public final defpackage.r41[] w(long r22) {
            r21 = this;
            r0 = r21
            r41[] r1 = defpackage.q60.a
            long r2 = r0.f0
            int r2 = (r22 > r2 ? 1 : (r22 == r2 ? 0 : -1))
            if (r2 <= 0) goto Lb
            goto L47
        Lb:
            long r2 = r0.q()
            int r4 = r0.g0
            long r4 = (long) r4
            long r4 = r4 + r2
            int r6 = r0.Y
            r7 = 1
            if (r6 != 0) goto L1e
            int r9 = r0.h0
            if (r9 <= 0) goto L1e
            long r4 = r4 + r7
        L1e:
            int r9 = r0.B
            r10 = 0
            if (r9 == 0) goto L41
            u1[] r9 = r0.A
            if (r9 == 0) goto L41
            int r11 = r9.length
            r12 = r10
        L29:
            if (r12 >= r11) goto L41
            r13 = r9[r12]
            if (r13 == 0) goto L3e
            qf6 r13 = (defpackage.qf6) r13
            long r13 = r13.a
            r15 = 0
            int r15 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r15 < 0) goto L3e
            int r15 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r15 >= 0) goto L3e
            r4 = r13
        L3e:
            int r12 = r12 + 1
            goto L29
        L41:
            long r11 = r0.f0
            int r9 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r9 > 0) goto L48
        L47:
            return r1
        L48:
            long r11 = r0.q()
            int r9 = r0.g0
            long r13 = (long) r9
            long r11 = r11 + r13
            int r9 = r0.B
            int r13 = r0.h0
            if (r9 <= 0) goto L5f
            long r14 = r11 - r4
            int r9 = (int) r14
            int r9 = r6 - r9
            int r13 = java.lang.Math.min(r13, r9)
        L5f:
            int r9 = r0.h0
            long r14 = (long) r9
            long r14 = r14 + r11
            gr1 r9 = defpackage.pf6.a
            if (r13 <= 0) goto Lb0
            r41[] r1 = new defpackage.r41[r13]
            r22 = r7
            java.lang.Object[] r7 = r0.d0
            r7.getClass()
            r16 = r2
            r3 = r1
            r1 = r11
        L74:
            int r8 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r8 >= 0) goto Lab
            int r8 = (int) r11
            r18 = r3
            int r3 = r7.length
            int r3 = r3 + (-1)
            r3 = r3 & r8
            r3 = r7[r3]
            if (r3 == r9) goto La2
            r3.getClass()
            lf6 r3 = (defpackage.lf6) r3
            int r8 = r10 + 1
            r19 = r4
            rj0 r4 = r3.R
            r18[r10] = r4
            defpackage.pf6.c(r7, r11, r9)
            java.lang.Object r3 = r3.L
            defpackage.pf6.c(r7, r1, r3)
            long r1 = r1 + r22
            if (r8 >= r13) goto L9e
            r10 = r8
            goto La4
        L9e:
            r11 = r1
            r10 = r18
            goto Lb7
        La2:
            r19 = r4
        La4:
            long r11 = r11 + r22
            r3 = r18
            r4 = r19
            goto L74
        Lab:
            r18 = r3
            r19 = r4
            goto L9e
        Lb0:
            r16 = r2
            r19 = r4
            r22 = r7
            r10 = r1
        Lb7:
            long r1 = r11 - r16
            int r1 = (int) r1
            int r2 = r0.B
            if (r2 != 0) goto Lc0
            r3 = r11
            goto Lc2
        Lc0:
            r3 = r19
        Lc2:
            long r7 = r0.e0
            int r2 = r0.X
            int r1 = java.lang.Math.min(r2, r1)
            long r1 = (long) r1
            long r1 = r11 - r1
            long r1 = java.lang.Math.max(r7, r1)
            if (r6 != 0) goto Led
            int r5 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r5 >= 0) goto Led
            java.lang.Object[] r5 = r0.d0
            r5.getClass()
            int r6 = (int) r1
            int r7 = r5.length
            int r7 = r7 + (-1)
            r6 = r6 & r7
            r5 = r5[r6]
            boolean r5 = defpackage.nb3.k(r5, r9)
            if (r5 == 0) goto Led
            long r11 = r11 + r22
            long r1 = r1 + r22
        Led:
            r5 = r11
            r7 = r14
            r0.v(r1, r3, r5, r7)
            r0.l()
            int r1 = r10.length
            if (r1 != 0) goto Lf9
            return r10
        Lf9:
            r41[] r0 = r0.p(r10)
            return r0
    }
}
