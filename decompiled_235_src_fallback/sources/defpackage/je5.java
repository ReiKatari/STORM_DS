package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: je5  reason: default package */
/* loaded from: classes.dex */
public final class je5 implements java.lang.Cloneable {
    public final defpackage.xk4 A;
    public final defpackage.pa B;
    public final boolean L;
    public final defpackage.ls1 R;
    public final defpackage.ie5 X;
    public final java.util.concurrent.atomic.AtomicBoolean Y;
    public java.lang.Object Z;
    public defpackage.w62 d0;
    public defpackage.ke5 e0;
    public boolean f0;
    public defpackage.bk1 g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public volatile boolean m0;
    public volatile defpackage.bk1 n0;
    public final java.util.concurrent.CopyOnWriteArrayList o0;

    public je5(defpackage.xk4 r3, defpackage.pa r4, boolean r5) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            r2.<init>()
            r2.A = r3
            r2.B = r4
            r2.L = r5
            os0 r5 = r3.D
            java.lang.Object r5 = r5.B
            ls1 r5 = (defpackage.ls1) r5
            r2.R = r5
            fa6 r3 = r3.d
            r3.getClass()
            ie5 r3 = new ie5
            r3.<init>(r2)
            r0 = 0
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            r3.g(r0, r5)
            r2.X = r3
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r3.<init>()
            r2.Y = r3
            r3 = 1
            r2.l0 = r3
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r2.o0 = r3
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            java.lang.Object r3 = r4.Y
            qo2 r3 = (defpackage.qo2) r3
            r2.<init>(r3)
            return
    }

    public static final java.lang.String a(defpackage.je5 r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r2.m0
            if (r1 == 0) goto Lc
            java.lang.String r1 = "canceled "
            goto Le
        Lc:
            java.lang.String r1 = ""
        Le:
            r0.append(r1)
            boolean r1 = r2.L
            if (r1 == 0) goto L18
            java.lang.String r1 = "web socket"
            goto L1a
        L18:
            java.lang.String r1 = "call"
        L1a:
            r0.append(r1)
            java.lang.String r1 = " to "
            r0.append(r1)
            pa r2 = r2.B
            java.lang.Object r2 = r2.B
            i03 r2 = (defpackage.i03) r2
            java.lang.String r2 = r2.g()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public final void b(defpackage.ke5 r3) {
            r2 = this;
            r3.getClass()
            java.util.TimeZone r0 = defpackage.az7.a
            ke5 r0 = r2.e0
            if (r0 != 0) goto L18
            r2.e0 = r3
            java.util.ArrayList r3 = r3.p
            he5 r0 = new he5
            java.lang.Object r1 = r2.Z
            r0.<init>(r2, r1)
            r3.add(r0)
            return
        L18:
            java.lang.String r2 = "Check failed."
            defpackage.i.m(r2)
            return
    }

    public final java.io.IOException c(java.io.IOException r3) {
            r2 = this;
            java.util.TimeZone r0 = defpackage.az7.a
            ke5 r0 = r2.e0
            if (r0 == 0) goto L23
            monitor-enter(r0)
            java.net.Socket r1 = r2.k()     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)
            ke5 r0 = r2.e0
            if (r0 != 0) goto L16
            if (r1 == 0) goto L23
            defpackage.az7.c(r1)
            goto L23
        L16:
            if (r1 != 0) goto L19
            goto L23
        L19:
            java.lang.String r2 = "Check failed."
            defpackage.i.m(r2)
            r2 = 0
            return r2
        L20:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        L23:
            boolean r0 = r2.f0
            if (r0 == 0) goto L28
            goto L30
        L28:
            ie5 r2 = r2.X
            boolean r2 = r2.j()
            if (r2 != 0) goto L32
        L30:
            r2 = r3
            goto L3e
        L32:
            java.io.InterruptedIOException r2 = new java.io.InterruptedIOException
            java.lang.String r0 = "timeout"
            r2.<init>(r0)
            if (r3 == 0) goto L3e
            r2.initCause(r3)
        L3e:
            if (r3 == 0) goto L43
            r2.getClass()
        L43:
            return r2
    }

    public final void cancel() {
            r1 = this;
            boolean r0 = r1.m0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.m0 = r0
            bk1 r0 = r1.n0
            if (r0 == 0) goto L13
            java.lang.Object r0 = r0.R
            v62 r0 = (defpackage.v62) r0
            r0.cancel()
        L13:
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.o0
            java.util.Iterator r1 = r1.iterator()
            r1.getClass()
        L1c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r1.next()
            h26 r0 = (defpackage.h26) r0
            r0.cancel()
            goto L1c
        L2c:
            return
    }

    public final java.lang.Object clone() {
            r3 = this;
            je5 r0 = new je5
            pa r1 = r3.B
            boolean r2 = r3.L
            xk4 r3 = r3.A
            r0.<init>(r3, r1, r2)
            return r0
    }

    public final void d(defpackage.nb0 r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.Y
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L26
            kx4 r0 = defpackage.kx4.a
            kx4 r0 = defpackage.kx4.a
            java.lang.Object r0 = r0.g()
            r3.Z = r0
            xk4 r0 = r3.A
            eb r0 = r0.a
            ge5 r1 = new ge5
            r1.<init>(r3, r4)
            r0.getClass()
            r3 = 6
            r4 = 0
            defpackage.eb.L(r0, r1, r4, r4, r3)
            return
        L26:
            java.lang.String r3 = "Already Executed"
            defpackage.i.m(r3)
            return
    }

    public final defpackage.wl5 e() {
            r4 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.Y
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r1 = 0
            if (r0 == 0) goto L47
            ie5 r0 = r4.X
            r0.i()
            kx4 r0 = defpackage.kx4.a
            kx4 r0 = defpackage.kx4.a
            java.lang.Object r0 = r0.g()
            r4.Z = r0
            r0 = 5
            xk4 r2 = r4.A     // Catch: java.lang.Throwable -> L37
            eb r2 = r2.a     // Catch: java.lang.Throwable -> L37
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L37
            java.lang.Object r3 = r2.X     // Catch: java.lang.Throwable -> L39
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch: java.lang.Throwable -> L39
            r3.add(r4)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L37
            wl5 r2 = r4.g()     // Catch: java.lang.Throwable -> L37
            xk4 r3 = r4.A
            eb r3 = r3.a
            r3.getClass()
            defpackage.eb.L(r3, r1, r4, r1, r0)
            return r2
        L37:
            r2 = move-exception
            goto L3c
        L39:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L39
            throw r3     // Catch: java.lang.Throwable -> L37
        L3c:
            xk4 r3 = r4.A
            eb r3 = r3.a
            r3.getClass()
            defpackage.eb.L(r3, r1, r4, r1, r0)
            throw r2
        L47:
            java.lang.String r4 = "Already Executed"
            defpackage.i.m(r4)
            return r1
    }

    public final void f(boolean r9) {
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.l0     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L24
            monitor-exit(r8)
            if (r9 == 0) goto L20
            bk1 r2 = r8.n0
            if (r2 == 0) goto L20
            java.lang.Object r9 = r2.R
            v62 r9 = (defpackage.v62) r9
            r9.cancel()
            java.lang.Object r9 = r2.L
            r1 = r9
            je5 r1 = (defpackage.je5) r1
            r6 = 1
            r7 = 0
            r3 = 1
            r4 = 1
            r5 = 1
            r1.i(r2, r3, r4, r5, r6, r7)
        L20:
            r9 = 0
            r8.g0 = r9
            return
        L24:
            java.lang.String r9 = "released"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2c
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L2c
            throw r0     // Catch: java.lang.Throwable -> L2c
        L2c:
            r0 = move-exception
            r9 = r0
            monitor-exit(r8)
            throw r9
    }

    public final defpackage.wl5 g() {
            r9 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            xk4 r0 = r9.A
            java.util.List r0 = r0.b
            defpackage.gt0.A0(r2, r0)
            n70 r0 = new n70
            xk4 r1 = r9.A
            r0.<init>(r1)
            r2.add(r0)
            n70 r0 = new n70
            xk4 r1 = r9.A
            vs0 r1 = r1.j
            r0.<init>(r1)
            r2.add(r0)
            n70 r0 = new n70
            xk4 r1 = r9.A
            la0 r1 = r1.k
            r0.<init>(r1)
            r2.add(r0)
            jb0 r0 = defpackage.jb0.c
            r2.add(r0)
            boolean r0 = r9.L
            if (r0 != 0) goto L3e
            xk4 r0 = r9.A
            java.util.List r0 = r0.c
            defpackage.gt0.A0(r2, r0)
        L3e:
            jb0 r0 = defpackage.jb0.b
            r2.add(r0)
            dp3 r0 = new dp3
            pa r5 = r9.B
            xk4 r1 = r9.A
            int r6 = r1.w
            int r7 = r1.x
            int r8 = r1.y
            r3 = 0
            r4 = 0
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9 = 0
            r2 = 0
            pa r3 = r1.B     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
            wl5 r0 = r0.f(r3)     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
            boolean r3 = r1.m0     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
            if (r3 != 0) goto L65
            r1.j(r9)
            return r0
        L65:
            defpackage.yy7.b(r0)     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
            throw r0     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
        L70:
            r0 = move-exception
            goto L7c
        L72:
            r0 = move-exception
            r2 = 1
            java.io.IOException r0 = r1.j(r0)     // Catch: java.lang.Throwable -> L70
            r0.getClass()     // Catch: java.lang.Throwable -> L70
            throw r0     // Catch: java.lang.Throwable -> L70
        L7c:
            if (r2 != 0) goto L81
            r1.j(r9)
        L81:
            throw r0
    }

    public final java.io.IOException i(defpackage.bk1 r4, boolean r5, boolean r6, boolean r7, boolean r8, java.io.IOException r9) {
            r3 = this;
            r4.getClass()
            bk1 r0 = r3.n0
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Ld
            goto L78
        Ld:
            monitor-enter(r3)
            r4 = 1
            r0 = 0
            if (r5 == 0) goto L19
            boolean r1 = r3.h0     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L2b
            goto L19
        L17:
            r4 = move-exception
            goto L59
        L19:
            if (r6 == 0) goto L1f
            boolean r1 = r3.i0     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L2b
        L1f:
            if (r8 == 0) goto L25
            boolean r1 = r3.j0     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L2b
        L25:
            if (r7 == 0) goto L5b
            boolean r1 = r3.k0     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L5b
        L2b:
            if (r5 == 0) goto L2f
            r3.h0 = r0     // Catch: java.lang.Throwable -> L17
        L2f:
            if (r6 == 0) goto L33
            r3.i0 = r0     // Catch: java.lang.Throwable -> L17
        L33:
            if (r8 == 0) goto L37
            r3.j0 = r0     // Catch: java.lang.Throwable -> L17
        L37:
            if (r7 == 0) goto L3b
            r3.k0 = r0     // Catch: java.lang.Throwable -> L17
        L3b:
            boolean r5 = r3.h0     // Catch: java.lang.Throwable -> L17
            if (r5 != 0) goto L4d
            boolean r5 = r3.i0     // Catch: java.lang.Throwable -> L17
            if (r5 != 0) goto L4d
            boolean r5 = r3.j0     // Catch: java.lang.Throwable -> L17
            if (r5 != 0) goto L4d
            boolean r5 = r3.k0     // Catch: java.lang.Throwable -> L17
            if (r5 != 0) goto L4d
            r5 = r4
            goto L4e
        L4d:
            r5 = r0
        L4e:
            if (r5 == 0) goto L55
            boolean r6 = r3.l0     // Catch: java.lang.Throwable -> L17
            if (r6 != 0) goto L55
            r0 = r4
        L55:
            r2 = r0
            r0 = r5
            r5 = r2
            goto L5c
        L59:
            monitor-exit(r3)
            throw r4
        L5b:
            r5 = r0
        L5c:
            monitor-exit(r3)
            if (r0 == 0) goto L71
            r6 = 0
            r3.n0 = r6
            ke5 r6 = r3.e0
            if (r6 == 0) goto L71
            monitor-enter(r6)
            int r7 = r6.m     // Catch: java.lang.Throwable -> L6e
            int r7 = r7 + r4
            r6.m = r7     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r6)
            goto L71
        L6e:
            r3 = move-exception
            monitor-exit(r6)
            throw r3
        L71:
            if (r5 == 0) goto L78
            java.io.IOException r3 = r3.c(r9)
            return r3
        L78:
            return r9
    }

    public final java.io.IOException j(java.io.IOException r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.l0     // Catch: java.lang.Throwable -> L1a
            r1 = 0
            if (r0 == 0) goto L1c
            r2.l0 = r1     // Catch: java.lang.Throwable -> L1a
            boolean r0 = r2.h0     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            boolean r0 = r2.i0     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            boolean r0 = r2.j0     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            boolean r0 = r2.k0     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            r1 = 1
            goto L1c
        L1a:
            r3 = move-exception
            goto L25
        L1c:
            monitor-exit(r2)
            if (r1 == 0) goto L24
            java.io.IOException r2 = r2.c(r3)
            return r2
        L24:
            return r3
        L25:
            monitor-exit(r2)
            throw r3
    }

    public final java.net.Socket k() {
            r7 = this;
            ke5 r0 = r7.e0
            r0.getClass()
            java.util.TimeZone r1 = defpackage.az7.a
            java.util.ArrayList r1 = r0.p
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lf:
            r5 = -1
            if (r4 >= r2) goto L28
            java.lang.Object r6 = r1.get(r4)
            int r4 = r4 + 1
            java.lang.ref.Reference r6 = (java.lang.ref.Reference) r6
            java.lang.Object r6 = r6.get()
            boolean r6 = defpackage.nb3.k(r6, r7)
            if (r6 == 0) goto L25
            goto L29
        L25:
            int r3 = r3 + 1
            goto Lf
        L28:
            r3 = r5
        L29:
            r2 = 0
            if (r3 == r5) goto L7e
            r1.remove(r3)
            r7.e0 = r2
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L7d
            long r3 = java.lang.System.nanoTime()
            r0.q = r3
            ls1 r7 = r7.R
            java.io.Serializable r1 = r7.d
            java.util.concurrent.ConcurrentLinkedQueue r1 = (java.util.concurrent.ConcurrentLinkedQueue) r1
            java.util.TimeZone r3 = defpackage.az7.a
            boolean r3 = r0.j
            if (r3 != 0) goto L55
            java.lang.Object r0 = r7.b
            pz6 r0 = (defpackage.pz6) r0
            java.lang.Object r7 = r7.c
            hk1 r7 = (defpackage.hk1) r7
            defpackage.pz6.d(r0, r7)
            return r2
        L55:
            r2 = 1
            r0.j = r2
            r1.remove(r0)
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L7a
            java.lang.Object r7 = r7.b
            pz6 r7 = (defpackage.pz6) r7
            qz6 r1 = r7.a
            monitor-enter(r1)
            boolean r2 = r7.a()     // Catch: java.lang.Throwable -> L74
            if (r2 == 0) goto L76
            qz6 r2 = r7.a     // Catch: java.lang.Throwable -> L74
            r2.c(r7)     // Catch: java.lang.Throwable -> L74
            goto L76
        L74:
            r7 = move-exception
            goto L78
        L76:
            monitor-exit(r1)
            goto L7a
        L78:
            monitor-exit(r1)
            throw r7
        L7a:
            java.net.Socket r7 = r0.e
            return r7
        L7d:
            return r2
        L7e:
            java.lang.String r7 = "Check failed."
            defpackage.i.m(r7)
            return r2
    }
}
