package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gn3  reason: default package */
/* loaded from: classes.dex */
public final class gn3 implements defpackage.ww0 {
    public final defpackage.sm3 A;
    public defpackage.zx0 B;
    public defpackage.st6 L;
    public int R;
    public int X;
    public final defpackage.ja4 Y;
    public final defpackage.ja4 Z;
    public final defpackage.an3 d0;
    public final defpackage.xm3 e0;
    public final defpackage.ja4 f0;
    public final defpackage.rt6 g0;
    public final defpackage.ja4 h0;
    public final defpackage.ua4 i0;
    public int j0;
    public int k0;
    public final java.lang.String l0;

    public gn3(defpackage.sm3 r1, defpackage.st6 r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.L = r2
            long[] r1 = defpackage.b66.a
            ja4 r1 = new ja4
            r1.<init>()
            r0.Y = r1
            ja4 r1 = new ja4
            r1.<init>()
            r0.Z = r1
            an3 r1 = new an3
            r1.<init>(r0)
            r0.d0 = r1
            xm3 r1 = new xm3
            r1.<init>(r0)
            r0.e0 = r1
            ja4 r1 = new ja4
            r1.<init>()
            r0.f0 = r1
            rt6 r1 = new rt6
            r1.<init>()
            r0.g0 = r1
            ja4 r1 = new ja4
            r1.<init>()
            r0.h0 = r1
            ua4 r1 = new ua4
            r2 = 16
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.<init>(r2)
            r0.i0 = r1
            java.lang.String r1 = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement."
            r0.l0 = r1
            return
    }

    public static final void c(defpackage.gn3 r6, java.lang.Object r7) {
            sm3 r0 = r6.A
            r6.h()
            ja4 r1 = r6.f0
            java.lang.Object r1 = r1.k(r7)
            sm3 r1 = (defpackage.sm3) r1
            r2 = 1
            if (r1 == 0) goto L6f
            int r3 = r6.k0
            if (r3 <= 0) goto L15
            goto L1a
        L15:
            java.lang.String r3 = "No pre-composed items to dispose"
            defpackage.p53.c(r3)
        L1a:
            java.util.List r3 = r0.o()
            aa4 r3 = (defpackage.aa4) r3
            java.lang.Object r3 = r3.B
            ua4 r3 = (defpackage.ua4) r3
            int r3 = r3.i(r1)
            java.util.List r4 = r0.o()
            aa4 r4 = (defpackage.aa4) r4
            java.lang.Object r4 = r4.B
            ua4 r4 = (defpackage.ua4) r4
            int r4 = r4.L
            int r5 = r6.k0
            int r4 = r4 - r5
            if (r3 < r4) goto L3a
            goto L3f
        L3a:
            java.lang.String r4 = "Item is not in pre-composed item range"
            defpackage.p53.c(r4)
        L3f:
            int r4 = r6.j0
            int r4 = r4 + r2
            r6.j0 = r4
            int r4 = r6.k0
            int r4 = r4 + (-1)
            r6.k0 = r4
            ja4 r4 = r6.Y
            java.lang.Object r1 = r4.g(r1)
            ym3 r1 = (defpackage.ym3) r1
            if (r1 == 0) goto L57
            e(r1)
        L57:
            java.util.List r1 = r0.o()
            aa4 r1 = (defpackage.aa4) r1
            java.lang.Object r1 = r1.B
            ua4 r1 = (defpackage.ua4) r1
            int r1 = r1.L
            int r4 = r6.k0
            int r1 = r1 - r4
            int r4 = r6.j0
            int r1 = r1 - r4
            r6.j(r3, r1)
            r6.g(r1)
        L6f:
            ua4 r6 = r6.i0
            boolean r6 = r6.h(r7)
            if (r6 == 0) goto L7b
            r6 = 6
            defpackage.sm3.V(r0, r2, r6)
        L7b:
            return
    }

    public static void e(defpackage.ym3 r5) {
            tu4 r0 = r5.f
            if (r0 == 0) goto L49
            java.util.concurrent.atomic.AtomicReference r1 = r0.h
            vu4 r2 = defpackage.vu4.Cancelled
            r1.set(r2)
            jb1 r1 = r0.k
            java.lang.Object r2 = r1.d
            ka4 r2 = (defpackage.ka4) r2
            boolean r2 = r2.h()
            r3 = 0
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.d
            ka4 r2 = (defpackage.ka4) r2
            ka4 r4 = defpackage.c66.a
            ka4 r4 = new ka4
            r4.<init>()
            r1.d = r4
            java.lang.Object r4 = r1.c
            ua4 r4 = (defpackage.ua4) r4
            r4.g()
            goto L2e
        L2d:
            r2 = r3
        L2e:
            r1.b()
            ey0 r0 = r0.a
            r0.m0 = r3
            if (r2 == 0) goto L3e
            jb1 r1 = r0.q0
            r1.k = r2
            r1 = 2
            r0.s0 = r1
        L3e:
            r5.f = r3
            ey0 r0 = r5.c
            if (r0 == 0) goto L47
            r0.m()
        L47:
            r5.c = r3
        L49:
            return
    }

    @Override // defpackage.ww0
    public final void a() {
            r17 = this;
            r0 = r17
            r1 = 1
            sm3 r2 = r0.A
            r2.m0 = r1
            ja4 r1 = r0.Y
            java.lang.Object[] r3 = r1.c
            long[] r4 = r1.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L52
            r7 = r6
        L14:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4d
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2e:
            if (r12 >= r10) goto L4b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L47
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            ym3 r13 = (defpackage.ym3) r13
            ey0 r13 = r13.c
            if (r13 == 0) goto L47
            r13.m()
        L47:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2e
        L4b:
            if (r10 != r11) goto L52
        L4d:
            if (r7 == r5) goto L52
            int r7 = r7 + 1
            goto L14
        L52:
            r2.P()
            r2.m0 = r6
            r1.a()
            ja4 r1 = r0.Z
            r1.a()
            r0.k0 = r6
            r0.j0 = r6
            ja4 r1 = r0.f0
            r1.a()
            r0.h()
            return
    }

    @Override // defpackage.ww0
    public final void b() {
            r1 = this;
            r0 = 1
            r1.i(r0)
            return
    }

    public final void d(defpackage.ym3 r7, boolean r8) {
            r6 = this;
            tu4 r0 = r7.f
            if (r0 == 0) goto L40
            vl6 r1 = defpackage.ln2.t()
            r2 = 0
            if (r1 == 0) goto L10
            qn2 r3 = r1.e()
            goto L11
        L10:
            r3 = r2
        L11:
            vl6 r4 = defpackage.ln2.N(r1)
            sm3 r6 = r6.A     // Catch: java.lang.Throwable -> L39
            r5 = 1
            r6.m0 = r5     // Catch: java.lang.Throwable -> L39
            if (r8 == 0) goto L2d
        L1c:
            boolean r8 = r0.c()     // Catch: java.lang.Throwable -> L2b
            if (r8 != 0) goto L2d
            e41 r8 = new e41     // Catch: java.lang.Throwable -> L2b
            r8.<init>()     // Catch: java.lang.Throwable -> L2b
            r0.e(r8)     // Catch: java.lang.Throwable -> L2b
            goto L1c
        L2b:
            r6 = move-exception
            goto L3b
        L2d:
            r0.a()     // Catch: java.lang.Throwable -> L2b
            r7.f = r2     // Catch: java.lang.Throwable -> L39
            r7 = 0
            r6.m0 = r7     // Catch: java.lang.Throwable -> L39
            defpackage.ln2.V(r1, r4, r3)
            return
        L39:
            r6 = move-exception
            goto L3c
        L3b:
            throw r6     // Catch: java.lang.Throwable -> L39
        L3c:
            defpackage.ln2.V(r1, r4, r3)
            throw r6
        L40:
            return
    }

    public final defpackage.nt6 f(java.lang.Object r2) {
            r1 = this;
            sm3 r0 = r1.A
            boolean r0 = r0.H()
            if (r0 != 0) goto Le
            dn3 r1 = new dn3
            r1.<init>()
            return r1
        Le:
            en3 r0 = new en3
            r0.<init>(r1, r2)
            return r0
    }

    public final void g(int r14) {
            r13 = this;
            r0 = 0
            r13.j0 = r0
            sm3 r1 = r13.A
            java.util.List r1 = r1.o()
            r2 = r1
            aa4 r2 = (defpackage.aa4) r2
            java.lang.Object r3 = r2.B
            ua4 r3 = (defpackage.ua4) r3
            int r3 = r3.L
            int r4 = r13.k0
            int r3 = r3 - r4
            r4 = 1
            int r3 = r3 - r4
            if (r14 > r3) goto Ld1
            rt6 r5 = r13.g0
            r5.clear()
            if (r14 > r3) goto L42
            r5 = r14
        L21:
            java.lang.Object r6 = r2.get(r5)
            sm3 r6 = (defpackage.sm3) r6
            ja4 r7 = r13.Y
            java.lang.Object r6 = r7.g(r6)
            r6.getClass()
            ym3 r6 = (defpackage.ym3) r6
            java.lang.Object r6 = r6.a
            rt6 r7 = r13.g0
            java.lang.Object r7 = r7.B
            ea4 r7 = (defpackage.ea4) r7
            r7.a(r6)
            if (r5 == r3) goto L42
            int r5 = r5 + 1
            goto L21
        L42:
            st6 r2 = r13.L
            rt6 r5 = r13.g0
            r2.d(r5)
            vl6 r2 = defpackage.ln2.t()
            if (r2 == 0) goto L54
            qn2 r5 = r2.e()
            goto L55
        L54:
            r5 = 0
        L55:
            vl6 r6 = defpackage.ln2.N(r2)
            r7 = r0
        L5a:
            if (r3 < r14) goto Lcd
            r8 = r1
            aa4 r8 = (defpackage.aa4) r8     // Catch: java.lang.Throwable -> La8
            java.lang.Object r8 = r8.get(r3)     // Catch: java.lang.Throwable -> La8
            sm3 r8 = (defpackage.sm3) r8     // Catch: java.lang.Throwable -> La8
            ja4 r9 = r13.Y     // Catch: java.lang.Throwable -> La8
            java.lang.Object r9 = r9.g(r8)     // Catch: java.lang.Throwable -> La8
            r9.getClass()     // Catch: java.lang.Throwable -> La8
            ym3 r9 = (defpackage.ym3) r9     // Catch: java.lang.Throwable -> La8
            java.lang.Object r10 = r9.a     // Catch: java.lang.Throwable -> La8
            rt6 r11 = r13.g0     // Catch: java.lang.Throwable -> La8
            java.lang.Object r11 = r11.B     // Catch: java.lang.Throwable -> La8
            ea4 r11 = (defpackage.ea4) r11     // Catch: java.lang.Throwable -> La8
            boolean r11 = r11.c(r10)     // Catch: java.lang.Throwable -> La8
            if (r11 == 0) goto Laa
            int r11 = r13.j0     // Catch: java.lang.Throwable -> La8
            int r11 = r11 + r4
            r13.j0 = r11     // Catch: java.lang.Throwable -> La8
            vs4 r11 = r9.g     // Catch: java.lang.Throwable -> La8
            java.lang.Object r11 = r11.getValue()     // Catch: java.lang.Throwable -> La8
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> La8
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> La8
            if (r11 == 0) goto Lc1
            wm3 r8 = r8.C0     // Catch: java.lang.Throwable -> La8
            d34 r11 = r8.p     // Catch: java.lang.Throwable -> La8
            qm3 r12 = defpackage.qm3.NotUsed     // Catch: java.lang.Throwable -> La8
            r11.h0 = r12     // Catch: java.lang.Throwable -> La8
            rz3 r8 = r8.q     // Catch: java.lang.Throwable -> La8
            if (r8 == 0) goto L9f
            r8.f0 = r12     // Catch: java.lang.Throwable -> La8
        L9f:
            r13.l(r9, r0)     // Catch: java.lang.Throwable -> La8
            boolean r8 = r9.h     // Catch: java.lang.Throwable -> La8
            if (r8 == 0) goto Lc1
            r7 = r4
            goto Lc1
        La8:
            r13 = move-exception
            goto Lc9
        Laa:
            sm3 r11 = r13.A     // Catch: java.lang.Throwable -> La8
            r11.m0 = r4     // Catch: java.lang.Throwable -> La8
            ja4 r12 = r13.Y     // Catch: java.lang.Throwable -> La8
            r12.k(r8)     // Catch: java.lang.Throwable -> La8
            ey0 r8 = r9.c     // Catch: java.lang.Throwable -> La8
            if (r8 == 0) goto Lba
            r8.m()     // Catch: java.lang.Throwable -> La8
        Lba:
            sm3 r8 = r13.A     // Catch: java.lang.Throwable -> La8
            r8.Q(r3, r4)     // Catch: java.lang.Throwable -> La8
            r11.m0 = r0     // Catch: java.lang.Throwable -> La8
        Lc1:
            ja4 r8 = r13.Z     // Catch: java.lang.Throwable -> La8
            r8.k(r10)     // Catch: java.lang.Throwable -> La8
            int r3 = r3 + (-1)
            goto L5a
        Lc9:
            defpackage.ln2.V(r2, r6, r5)
            throw r13
        Lcd:
            defpackage.ln2.V(r2, r6, r5)
            goto Ld2
        Ld1:
            r7 = r0
        Ld2:
            if (r7 == 0) goto Lee
            java.lang.Object r14 = defpackage.bm6.c
            monitor-enter(r14)
            os2 r1 = defpackage.bm6.j     // Catch: java.lang.Throwable -> Leb
            ka4 r1 = r1.h     // Catch: java.lang.Throwable -> Leb
            if (r1 == 0) goto Le4
            boolean r1 = r1.h()     // Catch: java.lang.Throwable -> Leb
            if (r1 != r4) goto Le4
            r0 = r4
        Le4:
            monitor-exit(r14)
            if (r0 == 0) goto Lee
            defpackage.bm6.a()
            goto Lee
        Leb:
            r13 = move-exception
            monitor-exit(r14)
            throw r13
        Lee:
            r13.h()
            return
    }

    public final void h() {
            r4 = this;
            sm3 r0 = r4.A
            java.util.List r0 = r0.o()
            aa4 r0 = (defpackage.aa4) r0
            java.lang.Object r0 = r0.B
            ua4 r0 = (defpackage.ua4) r0
            int r0 = r0.L
            ja4 r1 = r4.Y
            int r2 = r1.e
            if (r2 != r0) goto L15
            goto L35
        L15:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Inconsistency between the count of nodes tracked by the state ("
            r2.<init>(r3)
            int r1 = r1.e
            r2.append(r1)
            java.lang.String r1 = ") and the children count on the SubcomposeLayout ("
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = "). Are you trying to use the state of the disposed SubcomposeLayout?"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            defpackage.p53.a(r1)
        L35:
            int r1 = r4.j0
            int r1 = r0 - r1
            int r2 = r4.k0
            int r1 = r1 - r2
            if (r1 < 0) goto L3f
            goto L5d
        L3f:
            java.lang.String r1 = "Incorrect state. Total children "
            java.lang.String r2 = ". Reusable children "
            java.lang.StringBuilder r0 = defpackage.xg6.t(r1, r0, r2)
            int r1 = r4.j0
            r0.append(r1)
            java.lang.String r1 = ". Precomposed children "
            r0.append(r1)
            int r1 = r4.k0
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            defpackage.p53.a(r0)
        L5d:
            ja4 r0 = r4.f0
            int r1 = r0.e
            int r2 = r4.k0
            if (r1 != r2) goto L66
            return
        L66:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Incorrect state. Precomposed children "
            r1.<init>(r2)
            int r4 = r4.k0
            r1.append(r4)
            java.lang.String r4 = ". Map size "
            r1.append(r4)
            int r4 = r0.e
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            defpackage.p53.a(r4)
            return
    }

    public final void i(boolean r11) {
            r10 = this;
            r0 = 0
            r10.k0 = r0
            ja4 r1 = r10.f0
            r1.a()
            sm3 r1 = r10.A
            java.util.List r1 = r1.o()
            r2 = r1
            aa4 r2 = (defpackage.aa4) r2
            java.lang.Object r2 = r2.B
            ua4 r2 = (defpackage.ua4) r2
            int r2 = r2.L
            int r3 = r10.j0
            if (r3 == r2) goto L77
            r10.j0 = r2
            vl6 r3 = defpackage.ln2.t()
            if (r3 == 0) goto L28
            qn2 r4 = r3.e()
            goto L29
        L28:
            r4 = 0
        L29:
            vl6 r5 = defpackage.ln2.N(r3)
        L2d:
            if (r0 >= r2) goto L6f
            r6 = r1
            aa4 r6 = (defpackage.aa4) r6     // Catch: java.lang.Throwable -> L66
            java.lang.Object r6 = r6.get(r0)     // Catch: java.lang.Throwable -> L66
            sm3 r6 = (defpackage.sm3) r6     // Catch: java.lang.Throwable -> L66
            ja4 r7 = r10.Y     // Catch: java.lang.Throwable -> L66
            java.lang.Object r7 = r7.g(r6)     // Catch: java.lang.Throwable -> L66
            ym3 r7 = (defpackage.ym3) r7     // Catch: java.lang.Throwable -> L66
            if (r7 == 0) goto L68
            vs4 r8 = r7.g     // Catch: java.lang.Throwable -> L66
            java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Throwable -> L66
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L66
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L66
            if (r8 == 0) goto L68
            wm3 r6 = r6.C0     // Catch: java.lang.Throwable -> L66
            d34 r8 = r6.p     // Catch: java.lang.Throwable -> L66
            qm3 r9 = defpackage.qm3.NotUsed     // Catch: java.lang.Throwable -> L66
            r8.h0 = r9     // Catch: java.lang.Throwable -> L66
            rz3 r6 = r6.q     // Catch: java.lang.Throwable -> L66
            if (r6 == 0) goto L5e
            r6.f0 = r9     // Catch: java.lang.Throwable -> L66
        L5e:
            r10.l(r7, r11)     // Catch: java.lang.Throwable -> L66
            jd1 r6 = defpackage.mt6.a     // Catch: java.lang.Throwable -> L66
            r7.a = r6     // Catch: java.lang.Throwable -> L66
            goto L68
        L66:
            r10 = move-exception
            goto L6b
        L68:
            int r0 = r0 + 1
            goto L2d
        L6b:
            defpackage.ln2.V(r3, r5, r4)
            throw r10
        L6f:
            defpackage.ln2.V(r3, r5, r4)
            ja4 r11 = r10.Z
            r11.a()
        L77:
            r10.h()
            return
    }

    public final void j(int r2, int r3) {
            r1 = this;
            sm3 r1 = r1.A
            r0 = 1
            r1.m0 = r0
            r1.L(r2, r3, r0)
            r2 = 0
            r1.m0 = r2
            return
    }

    public final void k(java.lang.Object r7, defpackage.eo2 r8, boolean r9) {
            r6 = this;
            sm3 r0 = r6.A
            boolean r1 = r0.H()
            if (r1 != 0) goto L9
            goto L73
        L9:
            r6.h()
            ja4 r1 = r6.Z
            boolean r1 = r1.c(r7)
            if (r1 != 0) goto L73
            ja4 r1 = r6.h0
            r1.k(r7)
            ja4 r1 = r6.f0
            java.lang.Object r2 = r1.g(r7)
            if (r2 != 0) goto L6e
            sm3 r2 = r6.n(r7)
            r3 = 1
            if (r2 == 0) goto L4b
            java.util.List r4 = r0.o()
            aa4 r4 = (defpackage.aa4) r4
            java.lang.Object r4 = r4.B
            ua4 r4 = (defpackage.ua4) r4
            int r4 = r4.i(r2)
            java.util.List r0 = r0.o()
            aa4 r0 = (defpackage.aa4) r0
            java.lang.Object r0 = r0.B
            ua4 r0 = (defpackage.ua4) r0
            int r0 = r0.L
            r6.j(r4, r0)
            int r0 = r6.k0
            int r0 = r0 + r3
            r6.k0 = r0
            goto L6b
        L4b:
            java.util.List r2 = r0.o()
            aa4 r2 = (defpackage.aa4) r2
            java.lang.Object r2 = r2.B
            ua4 r2 = (defpackage.ua4) r2
            int r2 = r2.L
            sm3 r4 = new sm3
            r5 = 2
            r4.<init>(r5)
            r0.m0 = r3
            r0.B(r2, r4)
            r2 = 0
            r0.m0 = r2
            int r0 = r6.k0
            int r0 = r0 + r3
            r6.k0 = r0
            r2 = r4
        L6b:
            r1.m(r7, r2)
        L6e:
            sm3 r2 = (defpackage.sm3) r2
            r6.m(r2, r7, r9, r8)
        L73:
            return
    }

    public final void l(defpackage.ym3 r3, boolean r4) {
            r2 = this;
            if (r4 != 0) goto Le
            boolean r0 = r3.h
            if (r0 == 0) goto Le
            vs4 r0 = r3.g
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            goto L16
        Le:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            vs4 r0 = defpackage.np2.Y(r0)
            r3.g = r0
        L16:
            tu4 r0 = r3.f
            if (r0 == 0) goto L1e
            e(r3)
            return
        L1e:
            if (r4 == 0) goto L28
            ey0 r2 = r3.c
            if (r2 == 0) goto L67
            r2.l()
            return
        L28:
            sm3 r2 = r2.A
            zp4 r2 = defpackage.vm3.a(r2)
            te r2 = (defpackage.te) r2
            no4 r2 = r2.getOutOfFrameExecutor()
            if (r2 == 0) goto L5c
            pj r4 = new pj
            r0 = 11
            r4.<init>(r3, r0)
            te r2 = (defpackage.te) r2
            pu r3 = r2.h0
            boolean r0 = r3.isEmpty()
            r3.addLast(r4)
            if (r0 == 0) goto L67
            android.os.Handler r3 = r2.getHandler()
            if (r3 == 0) goto L56
            ee r2 = r2.i0
            r3.postAtFrontOfQueue(r2)
            return
        L56:
            java.lang.String r2 = "schedule is called when outOfFrameExecutor is not available (view is detached)"
            defpackage.i.h(r2)
            return
        L5c:
            boolean r2 = r3.h
            if (r2 != 0) goto L67
            ey0 r2 = r3.c
            if (r2 == 0) goto L67
            r2.l()
        L67:
            return
    }

    public final void m(defpackage.sm3 r10, java.lang.Object r11, boolean r12, defpackage.eo2 r13) {
            r9 = this;
            ja4 r0 = r9.Y
            java.lang.Object r1 = r0.g(r10)
            r2 = 0
            if (r1 != 0) goto L21
            ym3 r1 = new ym3
            zv0 r3 = defpackage.mw0.a
            r1.<init>()
            r1.a = r11
            r1.b = r3
            r1.c = r2
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            vs4 r11 = defpackage.np2.Y(r11)
            r1.g = r11
            r0.m(r10, r1)
        L21:
            ym3 r1 = (defpackage.ym3) r1
            eo2 r11 = r1.b
            r0 = 0
            r3 = 1
            if (r11 == r13) goto L2b
            r11 = r3
            goto L2c
        L2b:
            r11 = r0
        L2c:
            tu4 r4 = r1.f
            if (r4 == 0) goto L3c
            if (r11 == 0) goto L36
            e(r1)
            goto L3c
        L36:
            if (r12 == 0) goto L39
            goto L5b
        L39:
            r9.d(r1, r3)
        L3c:
            ey0 r4 = r1.c
            if (r4 == 0) goto L51
            java.lang.Object r5 = r4.R
            monitor-enter(r5)
            ja4 r4 = r4.j0     // Catch: java.lang.Throwable -> L4e
            int r4 = r4.e     // Catch: java.lang.Throwable -> L4e
            if (r4 <= 0) goto L4b
            r4 = r3
            goto L4c
        L4b:
            r4 = r0
        L4c:
            monitor-exit(r5)
            goto L52
        L4e:
            r9 = move-exception
            monitor-exit(r5)
            throw r9
        L51:
            r4 = r3
        L52:
            if (r11 != 0) goto L5c
            if (r4 != 0) goto L5c
            boolean r11 = r1.d
            if (r11 == 0) goto L5b
            goto L5c
        L5b:
            return
        L5c:
            r1.b = r13
            tu4 r11 = r1.f
            if (r11 != 0) goto L63
            goto L68
        L63:
            java.lang.String r11 = "new subcompose call while paused composition is still active"
            defpackage.p53.a(r11)
        L68:
            vl6 r11 = defpackage.ln2.t()
            if (r11 == 0) goto L72
            qn2 r2 = r11.e()
        L72:
            vl6 r13 = defpackage.ln2.N(r11)
            sm3 r4 = r9.A     // Catch: java.lang.Throwable -> L8d
            r4.m0 = r3     // Catch: java.lang.Throwable -> L8d
            ey0 r5 = r1.c     // Catch: java.lang.Throwable -> L8d
            zx0 r6 = r9.B     // Catch: java.lang.Throwable -> L8d
            if (r6 == 0) goto L115
            if (r5 == 0) goto L90
            int r7 = r5.s0     // Catch: java.lang.Throwable -> L8d
            r8 = 3
            if (r7 != r8) goto L89
            r7 = r3
            goto L8a
        L89:
            r7 = r0
        L8a:
            if (r7 == 0) goto Lad
            goto L90
        L8d:
            r9 = move-exception
            goto L120
        L90:
            if (r12 == 0) goto La0
            android.view.ViewGroup$LayoutParams r5 = defpackage.zx7.a     // Catch: java.lang.Throwable -> L8d
            cg7 r5 = new cg7     // Catch: java.lang.Throwable -> L8d
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L8d
            ey0 r10 = new ey0     // Catch: java.lang.Throwable -> L8d
            r10.<init>(r6, r5)     // Catch: java.lang.Throwable -> L8d
        L9e:
            r5 = r10
            goto Lad
        La0:
            android.view.ViewGroup$LayoutParams r5 = defpackage.zx7.a     // Catch: java.lang.Throwable -> L8d
            cg7 r5 = new cg7     // Catch: java.lang.Throwable -> L8d
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L8d
            ey0 r10 = new ey0     // Catch: java.lang.Throwable -> L8d
            r10.<init>(r6, r5)     // Catch: java.lang.Throwable -> L8d
            goto L9e
        Lad:
            r1.c = r5     // Catch: java.lang.Throwable -> L8d
            eo2 r10 = r1.b     // Catch: java.lang.Throwable -> L8d
            sm3 r9 = r9.A     // Catch: java.lang.Throwable -> L8d
            zp4 r9 = defpackage.vm3.a(r9)     // Catch: java.lang.Throwable -> L8d
            te r9 = (defpackage.te) r9     // Catch: java.lang.Throwable -> L8d
            no4 r9 = r9.getOutOfFrameExecutor()     // Catch: java.lang.Throwable -> L8d
            if (r9 == 0) goto Lc2
            r1.h = r0     // Catch: java.lang.Throwable -> L8d
            goto Ld1
        Lc2:
            r1.h = r3     // Catch: java.lang.Throwable -> L8d
            pf r9 = new pf     // Catch: java.lang.Throwable -> L8d
            r9.<init>(r3, r1, r10)     // Catch: java.lang.Throwable -> L8d
            zv0 r10 = new zv0     // Catch: java.lang.Throwable -> L8d
            r6 = 1524156494(0x5ad8c84e, float:3.0509416E16)
            r10.<init>(r6, r3, r9)     // Catch: java.lang.Throwable -> L8d
        Ld1:
            if (r12 == 0) goto Lef
            boolean r9 = r1.e     // Catch: java.lang.Throwable -> L8d
            if (r9 == 0) goto Le4
            r5.i()     // Catch: java.lang.Throwable -> L8d
            r5.q()     // Catch: java.lang.Throwable -> L8d
            tu4 r9 = r5.k(r3, r10)     // Catch: java.lang.Throwable -> L8d
            r1.f = r9     // Catch: java.lang.Throwable -> L8d
            goto L10b
        Le4:
            boolean r9 = r5.i()     // Catch: java.lang.Throwable -> L8d
            tu4 r9 = r5.k(r9, r10)     // Catch: java.lang.Throwable -> L8d
            r1.f = r9     // Catch: java.lang.Throwable -> L8d
            goto L10b
        Lef:
            boolean r9 = r1.e     // Catch: java.lang.Throwable -> L8d
            if (r9 == 0) goto L108
            r5.i()     // Catch: java.lang.Throwable -> L8d
            r5.q()     // Catch: java.lang.Throwable -> L8d
            xq2 r9 = r5.r0     // Catch: java.lang.Throwable -> L8d
            r9.z = r0     // Catch: java.lang.Throwable -> L8d
            r9.y = r3     // Catch: java.lang.Throwable -> L8d
            zx0 r12 = r5.A     // Catch: java.lang.Throwable -> L8d
            r12.a(r5, r10)     // Catch: java.lang.Throwable -> L8d
            r9.u()     // Catch: java.lang.Throwable -> L8d
            goto L10b
        L108:
            r5.A(r10)     // Catch: java.lang.Throwable -> L8d
        L10b:
            r1.e = r0     // Catch: java.lang.Throwable -> L8d
            r4.m0 = r0     // Catch: java.lang.Throwable -> L8d
            defpackage.ln2.V(r11, r13, r2)
            r1.d = r0
            return
        L115:
            java.lang.String r9 = "parent composition reference not set"
            defpackage.p53.d(r9)     // Catch: java.lang.Throwable -> L8d
            ug r9 = new ug     // Catch: java.lang.Throwable -> L8d
            r9.<init>()     // Catch: java.lang.Throwable -> L8d
            throw r9     // Catch: java.lang.Throwable -> L8d
        L120:
            defpackage.ln2.V(r11, r13, r2)
            throw r9
    }

    public final defpackage.sm3 n(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.j0
            if (r0 != 0) goto L6
            goto L6d
        L6:
            sm3 r0 = r10.A
            java.util.List r0 = r0.o()
            aa4 r0 = (defpackage.aa4) r0
            java.lang.Object r1 = r0.B
            ua4 r1 = (defpackage.ua4) r1
            int r1 = r1.L
            int r2 = r10.k0
            int r1 = r1 - r2
            int r2 = r10.j0
            int r2 = r1 - r2
            r3 = 1
            int r1 = r1 - r3
            r4 = r1
        L1e:
            ja4 r5 = r10.Y
            r6 = -1
            if (r4 < r2) goto L3f
            java.lang.Object r7 = r0.get(r4)
            sm3 r7 = (defpackage.sm3) r7
            java.lang.Object r7 = r5.g(r7)
            r7.getClass()
            ym3 r7 = (defpackage.ym3) r7
            java.lang.Object r7 = r7.a
            boolean r7 = defpackage.nb3.k(r7, r11)
            if (r7 == 0) goto L3c
            r7 = r4
            goto L40
        L3c:
            int r4 = r4 + (-1)
            goto L1e
        L3f:
            r7 = r6
        L40:
            if (r7 != r6) goto L6b
        L42:
            if (r1 < r2) goto L6a
            java.lang.Object r4 = r0.get(r1)
            sm3 r4 = (defpackage.sm3) r4
            java.lang.Object r4 = r5.g(r4)
            r4.getClass()
            ym3 r4 = (defpackage.ym3) r4
            java.lang.Object r8 = r4.a
            jd1 r9 = defpackage.mt6.a
            if (r8 == r9) goto L65
            st6 r9 = r10.L
            boolean r8 = r9.g(r11, r8)
            if (r8 == 0) goto L62
            goto L65
        L62:
            int r1 = r1 + (-1)
            goto L42
        L65:
            r4.a = r11
            r4 = r1
            r7 = r4
            goto L6b
        L6a:
            r4 = r1
        L6b:
            if (r7 != r6) goto L6f
        L6d:
            r10 = 0
            return r10
        L6f:
            if (r4 == r2) goto L74
            r10.j(r4, r2)
        L74:
            int r11 = r10.j0
            int r11 = r11 + r6
            r10.j0 = r11
            java.lang.Object r10 = r0.get(r2)
            sm3 r10 = (defpackage.sm3) r10
            java.lang.Object r11 = r5.g(r10)
            r11.getClass()
            ym3 r11 = (defpackage.ym3) r11
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            vs4 r0 = defpackage.np2.Y(r0)
            r11.g = r0
            r11.e = r3
            r11.d = r3
            return r10
    }
}
