package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: re5  reason: default package */
/* loaded from: classes.dex */
public final class re5 implements defpackage.v23 {
    public boolean A;
    public final java.lang.Object B;
    public int L;
    public final java.lang.Object R;
    public final java.lang.Object X;
    public java.lang.Object Y;
    public final java.lang.Object Z;

    public re5(defpackage.ea r1, defpackage.il5 r2, defpackage.je5 r3, boolean r4) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.R = r1
            r0.X = r2
            r0.A = r4
            yt1 r2 = defpackage.yt1.A
            r0.B = r2
            r0.Y = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.Z = r2
            i03 r2 = r1.h
            r2.getClass()
            java.net.URI r2 = r2.h()
            java.lang.String r3 = r2.getHost()
            if (r3 != 0) goto L33
            java.net.Proxy r1 = java.net.Proxy.NO_PROXY
            java.net.Proxy[] r1 = new java.net.Proxy[]{r1}
            java.util.List r1 = defpackage.az7.k(r1)
            goto L51
        L33:
            java.net.ProxySelector r1 = r1.g
            java.util.List r1 = r1.select(r2)
            if (r1 == 0) goto L47
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L42
            goto L47
        L42:
            java.util.List r1 = defpackage.az7.j(r1)
            goto L51
        L47:
            java.net.Proxy r1 = java.net.Proxy.NO_PROXY
            java.net.Proxy[] r1 = new java.net.Proxy[]{r1}
            java.util.List r1 = defpackage.az7.k(r1)
        L51:
            r0.B = r1
            r1 = 0
            r0.L = r1
            return
    }

    public re5(defpackage.v23 r3) {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.R = r0
            r0 = 0
            r2.L = r0
            r2.A = r0
            w13 r0 = new w13
            r1 = 1
            r0.<init>(r2, r1)
            r2.Z = r0
            r2.X = r3
            android.view.Surface r3 = r3.getSurface()
            r2.B = r3
            return
    }

    public re5(defpackage.z23 r1, java.util.List r2, int r3, defpackage.z23 r4, defpackage.wi6 r5, defpackage.k62 r6, boolean r7) {
            r0 = this;
            r0.<init>()
            r0.R = r1
            r0.B = r2
            r0.L = r3
            r0.X = r4
            r0.Y = r5
            r0.Z = r6
            r0.A = r7
            return
    }

    @Override // defpackage.v23
    public defpackage.s23 a() {
            r3 = this;
            java.lang.Object r0 = r3.R
            monitor-enter(r0)
            java.lang.Object r1 = r3.X     // Catch: java.lang.Throwable -> L23
            v23 r1 = (defpackage.v23) r1     // Catch: java.lang.Throwable -> L23
            s23 r1 = r1.a()     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L20
            int r2 = r3.L     // Catch: java.lang.Throwable -> L23
            int r2 = r2 + 1
            r3.L = r2     // Catch: java.lang.Throwable -> L23
            x13 r2 = new x13     // Catch: java.lang.Throwable -> L23
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.Object r3 = r3.Z     // Catch: java.lang.Throwable -> L23
            w13 r3 = (defpackage.w13) r3     // Catch: java.lang.Throwable -> L23
            r2.e(r3)     // Catch: java.lang.Throwable -> L23
            goto L21
        L20:
            r2 = 0
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return r2
        L23:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r3
    }

    @Override // defpackage.v23
    public int b() {
            r1 = this;
            java.lang.Object r0 = r1.R
            monitor-enter(r0)
            java.lang.Object r1 = r1.X     // Catch: java.lang.Throwable -> Ld
            v23 r1 = (defpackage.v23) r1     // Catch: java.lang.Throwable -> Ld
            int r1 = r1.b()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    public void c(defpackage.z23 r4, defpackage.w42 r5) {
            r3 = this;
            android.content.Context r0 = r4.a
            java.lang.Object r3 = r3.R
            z23 r3 = (defpackage.z23) r3
            android.content.Context r1 = r3.a
            java.lang.String r2 = "Interceptor '"
            if (r0 != r1) goto L3d
            java.lang.Object r0 = r4.b
            cs1 r1 = defpackage.cs1.i0
            if (r0 == r1) goto L37
            iz6 r0 = r4.c
            iz6 r1 = r3.c
            if (r0 != r1) goto L31
            ut3 r0 = r4.w
            ut3 r1 = r3.w
            if (r0 != r1) goto L2b
            fj6 r4 = r4.x
            fj6 r3 = r3.x
            if (r4 != r3) goto L25
            return
        L25:
            java.lang.String r3 = "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead."
            defpackage.e41.g(r5, r3, r2)
            return
        L2b:
            java.lang.String r3 = "' cannot modify the request's lifecycle."
            defpackage.e41.g(r5, r3, r2)
            return
        L31:
            java.lang.String r3 = "' cannot modify the request's target."
            defpackage.e41.g(r5, r3, r2)
            return
        L37:
            java.lang.String r3 = "' cannot set the request's data to null."
            defpackage.e41.g(r5, r3, r2)
            return
        L3d:
            java.lang.String r3 = "' cannot modify the request's context."
            defpackage.e41.g(r5, r3, r2)
            return
    }

    @Override // defpackage.v23
    public void close() {
            r2 = this;
            java.lang.Object r0 = r2.R
            monitor-enter(r0)
            java.lang.Object r1 = r2.B     // Catch: java.lang.Throwable -> Ld
            android.view.Surface r1 = (android.view.Surface) r1     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto Lf
            r1.release()     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r2 = move-exception
            goto L18
        Lf:
            java.lang.Object r2 = r2.X     // Catch: java.lang.Throwable -> Ld
            v23 r2 = (defpackage.v23) r2     // Catch: java.lang.Throwable -> Ld
            r2.close()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    @Override // defpackage.v23
    public void d() {
            r1 = this;
            java.lang.Object r0 = r1.R
            monitor-enter(r0)
            java.lang.Object r1 = r1.X     // Catch: java.lang.Throwable -> Lc
            v23 r1 = (defpackage.v23) r1     // Catch: java.lang.Throwable -> Lc
            r1.d()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    @Override // defpackage.v23
    public void e(defpackage.u23 r5, java.util.concurrent.Executor r6) {
            r4 = this;
            java.lang.Object r0 = r4.R
            monitor-enter(r0)
            java.lang.Object r1 = r4.X     // Catch: java.lang.Throwable -> L12
            v23 r1 = (defpackage.v23) r1     // Catch: java.lang.Throwable -> L12
            pk0 r2 = new pk0     // Catch: java.lang.Throwable -> L12
            r3 = 5
            r2.<init>(r3, r4, r5)     // Catch: java.lang.Throwable -> L12
            r1.e(r2, r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r4
    }

    @Override // defpackage.v23
    public int f() {
            r1 = this;
            java.lang.Object r0 = r1.R
            monitor-enter(r0)
            java.lang.Object r1 = r1.X     // Catch: java.lang.Throwable -> Ld
            v23 r1 = (defpackage.v23) r1     // Catch: java.lang.Throwable -> Ld
            int r1 = r1.f()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    public boolean g() {
            r2 = this;
            int r0 = r2.L
            java.lang.Object r1 = r2.B
            java.util.List r1 = (java.util.List) r1
            int r1 = r1.size()
            if (r0 >= r1) goto Ld
            goto L17
        Ld:
            java.lang.Object r2 = r2.Z
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L19
        L17:
            r2 = 1
            return r2
        L19:
            r2 = 0
            return r2
    }

    @Override // defpackage.v23
    public int getHeight() {
            r1 = this;
            java.lang.Object r0 = r1.R
            monitor-enter(r0)
            java.lang.Object r1 = r1.X     // Catch: java.lang.Throwable -> Ld
            v23 r1 = (defpackage.v23) r1     // Catch: java.lang.Throwable -> Ld
            int r1 = r1.getHeight()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    @Override // defpackage.v23
    public android.view.Surface getSurface() {
            r1 = this;
            java.lang.Object r0 = r1.R
            monitor-enter(r0)
            java.lang.Object r1 = r1.X     // Catch: java.lang.Throwable -> Ld
            v23 r1 = (defpackage.v23) r1     // Catch: java.lang.Throwable -> Ld
            android.view.Surface r1 = r1.getSurface()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    @Override // defpackage.v23
    public int getWidth() {
            r1 = this;
            java.lang.Object r0 = r1.R
            monitor-enter(r0)
            java.lang.Object r1 = r1.X     // Catch: java.lang.Throwable -> Ld
            v23 r1 = (defpackage.v23) r1     // Catch: java.lang.Throwable -> Ld
            int r1 = r1.getWidth()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    public java.lang.Object h(defpackage.z23 r19, defpackage.s41 r20) {
            r18 = this;
            r0 = r18
            r1 = r20
            java.lang.Object r2 = r0.B
            r3 = r2
            java.util.List r3 = (java.util.List) r3
            int r4 = r0.L
            boolean r5 = r1 instanceof defpackage.qe5
            if (r5 == 0) goto L1e
            r5 = r1
            qe5 r5 = (defpackage.qe5) r5
            int r6 = r5.d0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L1e
            int r6 = r6 - r7
            r5.d0 = r6
            goto L23
        L1e:
            qe5 r5 = new qe5
            r5.<init>(r0, r1)
        L23:
            java.lang.Object r1 = r5.Y
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r5.d0
            r8 = 1
            if (r7 == 0) goto L43
            if (r7 != r8) goto L3c
            w42 r0 = r5.X
            re5 r2 = r5.R
            defpackage.oi2.Y(r1)
            r17 = r1
            r1 = r0
            r0 = r2
            r2 = r17
            goto L88
        L3c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L43:
            defpackage.oi2.Y(r1)
            if (r4 <= 0) goto L56
            int r1 = r4 + (-1)
            java.lang.Object r1 = r3.get(r1)
            w42 r1 = (defpackage.w42) r1
            r13 = r19
            r0.c(r13, r1)
            goto L58
        L56:
            r13 = r19
        L58:
            java.lang.Object r1 = r3.get(r4)
            w42 r1 = (defpackage.w42) r1
            int r12 = r4 + 1
            java.lang.Object r3 = r0.Y
            r14 = r3
            wi6 r14 = (defpackage.wi6) r14
            re5 r9 = new re5
            java.lang.Object r3 = r0.R
            r10 = r3
            z23 r10 = (defpackage.z23) r10
            r11 = r2
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r2 = r0.Z
            r15 = r2
            k62 r15 = (defpackage.k62) r15
            boolean r2 = r0.A
            r16 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r5.R = r0
            r5.X = r1
            r5.d0 = r8
            java.lang.Object r2 = r1.d(r9, r5)
            if (r2 != r6) goto L88
            return r6
        L88:
            a33 r2 = (defpackage.a33) r2
            z23 r3 = r2.b()
            r0.c(r3, r1)
            return r2
    }

    public void i() {
            r2 = this;
            java.lang.Object r0 = r2.R
            monitor-enter(r0)
            r1 = 1
            r2.A = r1     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = r2.X     // Catch: java.lang.Throwable -> L15
            v23 r1 = (defpackage.v23) r1     // Catch: java.lang.Throwable -> L15
            r1.d()     // Catch: java.lang.Throwable -> L15
            int r1 = r2.L     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L17
            r2.close()     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r2 = move-exception
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r2
    }

    @Override // defpackage.v23
    public defpackage.s23 j() {
            r3 = this;
            java.lang.Object r0 = r3.R
            monitor-enter(r0)
            java.lang.Object r1 = r3.X     // Catch: java.lang.Throwable -> L23
            v23 r1 = (defpackage.v23) r1     // Catch: java.lang.Throwable -> L23
            s23 r1 = r1.j()     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L20
            int r2 = r3.L     // Catch: java.lang.Throwable -> L23
            int r2 = r2 + 1
            r3.L = r2     // Catch: java.lang.Throwable -> L23
            x13 r2 = new x13     // Catch: java.lang.Throwable -> L23
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.Object r3 = r3.Z     // Catch: java.lang.Throwable -> L23
            w13 r3 = (defpackage.w13) r3     // Catch: java.lang.Throwable -> L23
            r2.e(r3)     // Catch: java.lang.Throwable -> L23
            goto L21
        L20:
            r2 = 0
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return r2
        L23:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r3
    }
}
