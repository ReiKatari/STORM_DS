package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ft2  reason: default package */
/* loaded from: classes.dex */
public final class ft2 implements java.io.Closeable {
    public final defpackage.qf0 A;
    public final java.util.Map B;
    public final java.util.Map L;
    public final java.util.ArrayList R;
    public final defpackage.w61 X;
    public final defpackage.o41 Y;
    public final defpackage.s9 Z;
    public final java.lang.Object d0;
    public volatile boolean e0;
    public defpackage.dk0 f0;
    public defpackage.kk5 g0;
    public final java.util.Map h0;
    public final defpackage.sw i0;
    public defpackage.kk5 j0;
    public java.util.Map k0;
    public java.util.Map l0;
    public java.util.Map m0;
    public final java.util.List n0;
    public defpackage.dk0 o0;

    public ft2(defpackage.qf0 r14, java.util.Map r15, java.util.Map r16, java.util.ArrayList r17, java.util.ArrayList r18, defpackage.w61 r19, defpackage.n61 r20) {
            r13 = this;
            r9 = r16
            r15.getClass()
            r9.getClass()
            r19.getClass()
            r13.<init>()
            r13.A = r14
            r13.B = r15
            r13.L = r9
            r0 = r18
            r13.R = r0
            r0 = r19
            r13.X = r0
            r61 r0 = new r61
            java.lang.String r1 = "CXCP-GraphLoop"
            r0.<init>(r1)
            r1 = r20
            l61 r0 = defpackage.jw2.y(r1, r0)
            o41 r10 = defpackage.g04.i(r0)
            r13.Y = r10
            s9 r11 = new s9
            a0 r0 = new a0
            r7 = 0
            r8 = 16
            r1 = 1
            java.lang.Class<ft2> r3 = defpackage.ft2.class
            java.lang.String r4 = "finalizeUnprocessedCommands"
            java.lang.String r5 = "finalizeUnprocessedCommands(Ljava/util/List;)V"
            r6 = 0
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r12 = r0
            h4 r0 = new h4
            r8 = 5
            r1 = 2
            java.lang.Class<ft2> r3 = defpackage.ft2.class
            java.lang.String r4 = "process"
            java.lang.String r5 = "process(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.<init>()
            r11.a = r12
            r11.b = r0
            r0 = 0
            sw r0 = defpackage.g04.s(r0)
            r11.c = r0
            bg2 r0 = new bg2
            r1 = 20
            r0.<init>(r11, r1)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            r4 = 2
            v80 r0 = defpackage.nb3.c(r1, r3, r0, r4)
            r11.d = r0
            pu r0 = new pu
            r0.<init>()
            r11.e = r0
            java.lang.Object r0 = r11.c
            sw r0 = (defpackage.sw) r0
            boolean r0 = r0.a()
            if (r0 == 0) goto Lb4
            ns3 r0 = new ns3
            r1 = 4
            r0.<init>(r11, r3, r1)
            r1 = 3
            ap6 r0 = defpackage.hv.L(r10, r3, r3, r0, r1)
            boolean r0 = r0.isCancelled()
            if (r0 == 0) goto L95
            r11.E(r3)
        L95:
            r13.Z = r11
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r13.d0 = r0
            zt1 r0 = defpackage.zt1.A
            r13.h0 = r0
            r1 = 1
            sw r1 = defpackage.g04.s(r1)
            r13.i0 = r1
            r13.k0 = r0
            r13.l0 = r0
            r13.m0 = r9
            r0 = r17
            r13.n0 = r0
            return
        Lb4:
            java.lang.String r0 = "ProcessingQueue cannot be re-started!"
            defpackage.i.m(r0)
            throw r3
    }

    public final boolean A() {
            r7 = this;
            dk0 r0 = r7.o0
            if (r0 == 0) goto L26
            kk5 r1 = r7.j0
            if (r1 == 0) goto L1e
            java.util.List r2 = defpackage.hf.b0(r1)
            java.util.Map r4 = r7.k0
            java.util.Map r5 = r7.m0
            java.util.List r6 = r7.n0
            r1 = 1
            java.util.Map r3 = r7.B
            boolean r7 = r0.y(r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L1f
        L1e:
            r7 = 0
        L1f:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r7 = defpackage.nb3.k(r7, r0)
            return r7
        L26:
            r7 = 0
            return r7
    }

    public final void D(boolean r2) {
            r1 = this;
            sw r0 = r1.i0
            r0.a = r2
            if (r2 == 0) goto Ld
            s9 r1 = r1.Z
            ts2 r2 = defpackage.ts2.b
            r1.H(r2)
        Ld:
            return
    }

    public final void F(defpackage.dk0 r5) {
            r4 = this;
            java.lang.Object r0 = r4.d0
            monitor-enter(r0)
            dk0 r1 = r4.f0     // Catch: java.lang.Throwable -> L1d
            r4.f0 = r5     // Catch: java.lang.Throwable -> L1d
            boolean r2 = r4.e0     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L21
            r1 = 0
            r4.f0 = r1     // Catch: java.lang.Throwable -> L1d
            if (r5 == 0) goto L1f
            w61 r4 = r4.X     // Catch: java.lang.Throwable -> L1d
            ct2 r2 = new ct2     // Catch: java.lang.Throwable -> L1d
            r3 = 1
            r2.<init>(r5, r1, r3)     // Catch: java.lang.Throwable -> L1d
            r5 = 3
            defpackage.hv.L(r4, r1, r1, r2, r5)     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r4 = move-exception
            goto L49
        L1f:
            monitor-exit(r0)
            return
        L21:
            if (r1 != r5) goto L24
            goto L2e
        L24:
            s9 r2 = r4.Z     // Catch: java.lang.Throwable -> L1d
            ys2 r3 = new ys2     // Catch: java.lang.Throwable -> L1d
            r3.<init>(r1, r5)     // Catch: java.lang.Throwable -> L1d
            r2.H(r3)     // Catch: java.lang.Throwable -> L1d
        L2e:
            monitor-exit(r0)
            if (r5 != 0) goto L48
            java.util.ArrayList r5 = r4.R
            int r5 = r5.size()
            r0 = 0
        L38:
            if (r0 >= r5) goto L48
            java.util.ArrayList r1 = r4.R
            java.lang.Object r1 = r1.get(r0)
            bt2 r1 = (defpackage.bt2) r1
            r1.a()
            int r0 = r0 + 1
            goto L38
        L48:
            return
        L49:
            monitor-exit(r0)
            throw r4
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r6 = this;
            java.lang.Object r0 = r6.d0
            monitor-enter(r0)
            boolean r1 = r6.e0     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L9
            monitor-exit(r0)
            return
        L9:
            r1 = 1
            r6.e0 = r1     // Catch: java.lang.Throwable -> L1e
            dk0 r1 = r6.f0     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L20
            w61 r4 = r6.X     // Catch: java.lang.Throwable -> L1e
            ct2 r5 = new ct2     // Catch: java.lang.Throwable -> L1e
            r5.<init>(r1, r3, r2)     // Catch: java.lang.Throwable -> L1e
            r1 = 3
            defpackage.hv.L(r4, r3, r3, r5, r1)     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r6 = move-exception
            goto L41
        L20:
            r6.f0 = r3     // Catch: java.lang.Throwable -> L1e
            s9 r1 = r6.Z     // Catch: java.lang.Throwable -> L1e
            ts2 r3 = defpackage.ts2.c     // Catch: java.lang.Throwable -> L1e
            r1.H(r3)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)
            java.util.ArrayList r0 = r6.R
            int r0 = r0.size()
        L30:
            if (r2 >= r0) goto L40
            java.util.ArrayList r1 = r6.R
            java.lang.Object r1 = r1.get(r2)
            bt2 r1 = (defpackage.bt2) r1
            r1.b()
            int r2 = r2 + 1
            goto L30
        L40:
            return
        L41:
            monitor-exit(r0)
            throw r6
    }

    public final void e(java.util.ArrayList r9) {
            r8 = this;
            int r0 = r9.size()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L26
            java.lang.Object r3 = r9.get(r2)
            kk5 r3 = (defpackage.kk5) r3
            java.util.List r4 = r8.n0
            int r5 = r4.size()
            r6 = r1
        L15:
            if (r6 >= r5) goto L23
            java.lang.Object r7 = r4.get(r6)
            jk5 r7 = (defpackage.jk5) r7
            r7.N(r3)
            int r6 = r6 + 1
            goto L15
        L23:
            int r2 = r2 + 1
            goto L6
        L26:
            int r8 = r9.size()
            r0 = r1
        L2b:
            if (r0 >= r8) goto L4d
            java.lang.Object r2 = r9.get(r0)
            kk5 r2 = (defpackage.kk5) r2
            java.util.List r3 = r2.d
            int r3 = r3.size()
            r4 = r1
        L3a:
            if (r4 >= r3) goto L4a
            java.util.List r5 = r2.d
            java.lang.Object r5 = r5.get(r4)
            jk5 r5 = (defpackage.jk5) r5
            r5.N(r2)
            int r4 = r4 + 1
            goto L3a
        L4a:
            int r0 = r0 + 1
            goto L2b
        L4d:
            return
    }

    public final boolean h(java.util.List r8, java.util.Map r9, boolean r10) {
            r7 = this;
            dk0 r0 = r7.o0
            if (r0 != 0) goto L6
            r7 = 0
            return r7
        L6:
            java.util.Map r4 = r7.k0
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto L12
            java.util.Map r1 = r7.m0
        L10:
            r5 = r1
            goto L2f
        L12:
            p04 r1 = new p04
            r1.<init>()
            java.util.Map r2 = r7.l0
            r2.getClass()
            r1.putAll(r2)
            r1.putAll(r9)
            java.util.Map r2 = r7.L
            r2.getClass()
            r1.putAll(r2)
            p04 r1 = r1.b()
            goto L10
        L2f:
            java.util.List r6 = r7.n0
            java.util.Map r3 = r7.B
            r2 = r8
            r1 = r10
            boolean r7 = r0.y(r1, r2, r3, r4, r5, r6)
            if (r7 != 0) goto L8a
            java.lang.String r8 = "CXCP"
            if (r1 == 0) goto L55
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Failed to repeat with "
            r9.<init>(r10)
            java.lang.Object r10 = defpackage.gt0.b1(r2)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.w(r8, r9)
            return r7
        L55:
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L6d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Failed to submit capture with "
            r9.<init>(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            android.util.Log.w(r8, r9)
            return r7
        L6d:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to trigger with "
            r10.<init>(r0)
            java.lang.Object r0 = defpackage.gt0.b1(r2)
            r10.append(r0)
            java.lang.String r0 = " and "
            r10.append(r0)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            android.util.Log.w(r8, r9)
        L8a:
            return r7
    }

    public final defpackage.kk5 k() {
            r1 = this;
            java.lang.Object r0 = r1.d0
            monitor-enter(r0)
            kk5 r1 = r1.g0     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final void n(java.util.List r3, int r4, defpackage.us2 r5, boolean r6) {
            r2 = this;
            sw r5 = r2.i0
            boolean r5 = r5.b()
            r0 = 0
            if (r5 == 0) goto L16
            r5 = 0
            zt1 r1 = defpackage.zt1.A
            boolean r5 = r2.h(r5, r1, r0)
            if (r5 == 0) goto L16
            r3.remove(r4)
            return
        L16:
            if (r6 == 0) goto L2f
            if (r4 <= 0) goto L2f
            int r4 = r4 + (-1)
            java.lang.Object r5 = r3.get(r4)
            at2 r5 = (defpackage.at2) r5
            boolean r5 = r5 instanceof defpackage.xs2
            if (r5 == 0) goto L2a
            r2.r(r4, r3, r0)
            return
        L2a:
            java.lang.String r2 = "Check failed."
            defpackage.i.m(r2)
        L2f:
            return
    }

    public final void r(int r7, java.util.List r8, boolean r9) {
            r6 = this;
            r0 = r7
        L1:
            r1 = 1
            r2 = 0
            r3 = -1
            if (r3 >= r0) goto L3d
            java.lang.Object r3 = r8.get(r0)
            at2 r3 = (defpackage.at2) r3
            boolean r4 = r3 instanceof defpackage.xs2
            if (r4 == 0) goto L3a
            xs2 r3 = (defpackage.xs2) r3
            kk5 r3 = r3.a
            java.util.List r4 = defpackage.hf.b0(r3)
            zt1 r5 = defpackage.zt1.A
            boolean r1 = r6.h(r4, r5, r1)
            if (r1 == 0) goto L3a
            r6.j0 = r3
            r8.remove(r0)
        L25:
            if (r2 >= r0) goto L5f
            java.lang.Object r6 = r8.get(r2)
            at2 r6 = (defpackage.at2) r6
            boolean r6 = r6 instanceof defpackage.xs2
            if (r6 == 0) goto L37
            r8.remove(r2)
            int r0 = r0 + (-1)
            goto L25
        L37:
            int r2 = r2 + 1
            goto L25
        L3a:
            int r0 = r0 + (-1)
            goto L1
        L3d:
            if (r9 == 0) goto L5f
            int r7 = r7 + r1
            int r9 = r8.size()
            if (r7 >= r9) goto L5f
            java.lang.Object r9 = r8.get(r7)
            at2 r9 = (defpackage.at2) r9
            boolean r0 = r9 instanceof defpackage.us2
            if (r0 == 0) goto L56
            us2 r9 = (defpackage.us2) r9
            r6.n(r8, r7, r9, r2)
            return
        L56:
            boolean r0 = r9 instanceof defpackage.zs2
            if (r0 == 0) goto L5f
            zs2 r9 = (defpackage.zs2) r9
            r6.x(r8, r7, r9)
        L5f:
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GraphLoop("
            r0.<init>(r1)
            qf0 r2 = r2.A
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public final java.lang.Object u(java.util.List r18, int r19, defpackage.ys2 r20, defpackage.r41 r21) {
            r17 = this;
            r0 = r17
            r1 = r21
            boolean r2 = r1 instanceof defpackage.dt2
            if (r2 == 0) goto L17
            r2 = r1
            dt2 r2 = (defpackage.dt2) r2
            int r3 = r2.i0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.i0 = r3
            goto L1c
        L17:
            dt2 r2 = new dt2
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.g0
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.i0
            jg7 r5 = defpackage.jg7.a
            r6 = 3
            r7 = 2
            r9 = 0
            r10 = 1
            if (r4 == 0) goto L64
            if (r4 == r10) goto L52
            if (r4 == r7) goto L41
            if (r4 != r6) goto L3b
            bh5 r3 = r2.Y
            ys2 r4 = r2.X
            java.util.List r2 = r2.R
            defpackage.oi2.Y(r1)
            goto L10d
        L3b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r9
        L41:
            int r4 = r2.f0
            int r11 = r2.e0
            java.util.List r12 = r2.Z
            bh5 r13 = r2.Y
            ys2 r14 = r2.X
            java.util.List r15 = r2.R
            defpackage.oi2.Y(r1)
            goto Ld8
        L52:
            int r4 = r2.f0
            int r11 = r2.e0
            ys2 r12 = r2.d0
            java.util.List r13 = r2.Z
            bh5 r14 = r2.Y
            ys2 r15 = r2.X
            java.util.List r8 = r2.R
            defpackage.oi2.Y(r1)
            goto Lad
        L64:
            defpackage.oi2.Y(r1)
            bh5 r1 = new bh5
            r1.<init>()
            r1.A = r10
            r18.remove(r19)
            r4 = r19
            r8 = r20
            r12 = r1
            r11 = r2
            r13 = 0
            r1 = r18
            r2 = r1
        L7b:
            if (r13 >= r4) goto Lf4
            java.lang.Object r14 = r1.get(r13)
            at2 r14 = (defpackage.at2) r14
            boolean r15 = r14 instanceof defpackage.ys2
            if (r15 == 0) goto Le7
            r15 = r14
            ys2 r15 = (defpackage.ys2) r15
            dk0 r6 = r15.a
            if (r6 == 0) goto Lb4
            r11.R = r2
            r11.X = r8
            r11.Y = r12
            r11.Z = r1
            r11.d0 = r15
            r11.e0 = r13
            r11.f0 = r4
            r11.i0 = r10
            r6.w()
            if (r5 != r3) goto La5
            goto L10a
        La5:
            r15 = r14
            r14 = r12
            r12 = r15
            r15 = r8
            r8 = r2
            r2 = r11
            r11 = r13
            r13 = r1
        Lad:
            r16 = r14
            r14 = r12
            r12 = r13
            r13 = r16
            goto Lba
        Lb4:
            r15 = r8
            r8 = r2
            r2 = r11
            r11 = r13
            r13 = r12
            r12 = r1
        Lba:
            ys2 r14 = (defpackage.ys2) r14
            dk0 r1 = r14.b
            if (r1 == 0) goto Lda
            r2.R = r8
            r2.X = r15
            r2.Y = r13
            r2.Z = r12
            r2.d0 = r9
            r2.e0 = r11
            r2.f0 = r4
            r2.i0 = r7
            r1.w()
            if (r5 != r3) goto Ld6
            goto L10a
        Ld6:
            r14 = r15
            r15 = r8
        Ld8:
            r8 = r15
            r15 = r14
        Lda:
            r1 = r12
            r12 = r13
            r13 = r11
            int r6 = r12.A
            int r6 = r6 + r10
            r12.A = r6
            r11 = r2
            r2 = r8
            r6 = r10
            r8 = r15
            goto Le8
        Le7:
            r6 = 0
        Le8:
            if (r6 == 0) goto Lf1
            r1.remove(r13)
            int r4 = r4 + (-1)
        Lef:
            r6 = 3
            goto L7b
        Lf1:
            int r13 = r13 + 1
            goto Lef
        Lf4:
            dk0 r1 = r8.a
            if (r1 == 0) goto L10f
            r11.R = r2
            r11.X = r8
            r11.Y = r12
            r11.Z = r9
            r11.d0 = r9
            r4 = 3
            r11.i0 = r4
            r1.w()
            if (r5 != r3) goto L10b
        L10a:
            return r3
        L10b:
            r4 = r8
            r3 = r12
        L10d:
            r12 = r3
            r8 = r4
        L10f:
            dk0 r1 = r8.b
            r0.o0 = r1
            boolean r1 = r0.A()
            if (r1 != 0) goto L131
            kk5 r1 = r0.j0
            if (r1 == 0) goto L12f
            xs2 r3 = new xs2
            r3.<init>(r1)
            r1 = 0
            r2.add(r1, r3)
            int r1 = r12.A
            if (r1 != r10) goto L12f
            ts2 r1 = defpackage.ts2.b
            r2.add(r1)
        L12f:
            r0.j0 = r9
        L131:
            return r5
    }

    public final java.lang.Object v(java.util.List r12, defpackage.r41 r13) {
            r11 = this;
            boolean r0 = r13 instanceof defpackage.et2
            if (r0 == 0) goto L13
            r0 = r13
            et2 r0 = (defpackage.et2) r0
            int r1 = r0.f0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f0 = r1
            goto L18
        L13:
            et2 r0 = new et2
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.d0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.f0
            jg7 r3 = defpackage.jg7.a
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 0
            r8 = 1
            if (r2 == 0) goto L51
            if (r2 == r8) goto L4b
            if (r2 == r6) goto L3e
            if (r2 != r5) goto L38
            int r12 = r0.Z
            int r2 = r0.Y
            java.util.List r4 = r0.R
            defpackage.oi2.Y(r13)
            goto Lc9
        L38:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r11)
            return r7
        L3e:
            int r12 = r0.Z
            int r2 = r0.Y
            ys2 r4 = r0.X
            java.util.List r9 = r0.R
            defpackage.oi2.Y(r13)
            goto Lae
        L4b:
            java.util.List r12 = r0.R
            defpackage.oi2.Y(r13)
            goto L81
        L51:
            defpackage.oi2.Y(r13)
            r11.j0 = r7
            zt1 r13 = defpackage.zt1.A
            r11.k0 = r13
            r11.l0 = r13
            int r13 = r12.size()
            r2 = r4
        L61:
            if (r2 >= r13) goto L73
            java.lang.Object r9 = r12.get(r2)
            at2 r9 = (defpackage.at2) r9
            boolean r9 = r9 instanceof defpackage.us2
            if (r9 == 0) goto L70
            r11.e(r7)
        L70:
            int r2 = r2 + 1
            goto L61
        L73:
            dk0 r13 = r11.o0
            if (r13 == 0) goto L81
            r0.R = r12
            r0.f0 = r8
            r13.w()
            if (r3 != r1) goto L81
            goto Lc8
        L81:
            r11.o0 = r7
            int r13 = r12.size()
            r9 = r12
            r12 = r13
        L89:
            if (r4 >= r12) goto Lcd
            java.lang.Object r13 = r9.get(r4)
            at2 r13 = (defpackage.at2) r13
            boolean r2 = r13 instanceof defpackage.ys2
            if (r2 == 0) goto Lcb
            r2 = r13
            ys2 r2 = (defpackage.ys2) r2
            dk0 r10 = r2.a
            if (r10 == 0) goto Lb1
            r0.R = r9
            r0.X = r2
            r0.Y = r4
            r0.Z = r12
            r0.f0 = r6
            r10.w()
            if (r3 != r1) goto Lac
            goto Lc8
        Lac:
            r2 = r4
            r4 = r13
        Lae:
            r13 = r4
        Laf:
            r4 = r9
            goto Lb3
        Lb1:
            r2 = r4
            goto Laf
        Lb3:
            ys2 r13 = (defpackage.ys2) r13
            dk0 r13 = r13.b
            if (r13 == 0) goto Lc9
            r0.R = r4
            r0.X = r7
            r0.Y = r2
            r0.Z = r12
            r0.f0 = r5
            r13.w()
            if (r3 != r1) goto Lc9
        Lc8:
            return r1
        Lc9:
            r9 = r4
            r4 = r2
        Lcb:
            int r4 = r4 + r8
            goto L89
        Lcd:
            r9.clear()
            o41 r11 = r11.Y
            defpackage.g04.x(r11, r7)
            return r3
    }

    public final void x(java.util.List r4, int r5, defpackage.zs2 r6) {
            r3 = this;
            kk5 r0 = r3.j0
            if (r0 != 0) goto La
            if (r5 != 0) goto La
            r4.remove(r5)
            return
        La:
            sw r1 = r3.i0
            boolean r1 = r1.b()
            r2 = 0
            if (r1 == 0) goto L25
            if (r0 == 0) goto L25
            java.util.List r0 = defpackage.hf.b0(r0)
            java.util.Map r6 = r6.a
            boolean r6 = r3.h(r0, r6, r2)
            if (r6 == 0) goto L25
            r4.remove(r5)
            return
        L25:
            if (r5 <= 0) goto L3c
            int r5 = r5 + (-1)
            java.lang.Object r6 = r4.get(r5)
            at2 r6 = (defpackage.at2) r6
            boolean r6 = r6 instanceof defpackage.xs2
            if (r6 == 0) goto L37
            r3.r(r5, r4, r2)
            return
        L37:
            java.lang.String r3 = "Check failed."
            defpackage.i.m(r3)
        L3c:
            return
    }
}
