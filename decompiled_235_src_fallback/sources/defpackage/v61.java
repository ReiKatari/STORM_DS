package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v61  reason: default package */
/* loaded from: classes.dex */
public final class v61 implements java.util.concurrent.Executor, java.io.Closeable {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater d0 = null;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater e0 = null;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f0 = null;
    public static final defpackage.gr1 g0 = null;
    public final int A;
    public final int B;
    public final long L;
    public final java.lang.String R;
    public final defpackage.ls2 X;
    public final defpackage.ls2 Y;
    public final defpackage.dl5 Z;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    static {
            java.lang.String r0 = "parkedWorkersStack$volatile"
            java.lang.Class<v61> r1 = defpackage.v61.class
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            defpackage.v61.d0 = r0
            java.lang.String r0 = "controlState$volatile"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            defpackage.v61.e0 = r0
            java.lang.String r0 = "_isTerminated$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            defpackage.v61.f0 = r0
            gr1 r0 = new gr1
            java.lang.String r1 = "NOT_IN_STACK"
            r2 = 9
            r0.<init>(r1, r2)
            defpackage.v61.g0 = r0
            return
    }

    public v61(int r3, int r4, long r5, java.lang.String r7) {
            r2 = this;
            r2.<init>()
            r2.A = r3
            r2.B = r4
            r2.L = r5
            r2.R = r7
            r7 = 1
            if (r3 < r7) goto L60
            java.lang.String r7 = "Max pool size "
            if (r4 < r3) goto L55
            r0 = 2097150(0x1ffffe, float:2.938733E-39)
            if (r4 > r0) goto L4a
            r0 = 0
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 <= 0) goto L3d
            ls2 r4 = new ls2
            r4.<init>()
            r2.X = r4
            ls2 r4 = new ls2
            r4.<init>()
            r2.Y = r4
            dl5 r4 = new dl5
            int r5 = r3 + 1
            int r5 = r5 * 2
            r4.<init>(r5)
            r2.Z = r4
            long r3 = (long) r3
            r5 = 42
            long r3 = r3 << r5
            r2.controlState$volatile = r3
            return
        L3d:
            java.lang.String r2 = "Idle worker keep alive time "
            java.lang.String r3 = " must be positive"
            java.lang.String r2 = defpackage.lb1.i(r5, r2, r3)
            defpackage.i.f(r2)
            r2 = 0
            throw r2
        L4a:
            java.lang.String r2 = " should not exceed maximal supported number of threads 2097150"
            java.lang.String r2 = defpackage.lb1.k(r7, r4, r2)
            defpackage.i.f(r2)
            r2 = 0
            throw r2
        L55:
            java.lang.String r2 = " should be greater than or equals to core pool size "
            java.lang.String r2 = defpackage.lb1.j(r7, r4, r3, r2)
            defpackage.i.f(r2)
            r2 = 0
            throw r2
        L60:
            java.lang.String r2 = "Core pool size "
            java.lang.String r4 = " should be at least 1"
            java.lang.String r2 = defpackage.lb1.k(r2, r3, r4)
            defpackage.i.f(r2)
            r2 = 0
            throw r2
    }

    public static /* synthetic */ void k(defpackage.v61 r1, java.lang.Runnable r2, int r3) {
            r3 = r3 & 4
            r0 = 0
            if (r3 == 0) goto L7
            r3 = r0
            goto L8
        L7:
            r3 = 1
        L8:
            r1.h(r2, r0, r3)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.v61.f0
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof defpackage.t61
            r3 = 0
            if (r1 == 0) goto L17
            t61 r0 = (defpackage.t61) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L20
            v61 r1 = r0.d0
            if (r1 == r8) goto L1f
            goto L20
        L1f:
            r3 = r0
        L20:
            dl5 r0 = r8.Z
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.v61.e0     // Catch: java.lang.Throwable -> La7
            long r4 = r1.get(r8)     // Catch: java.lang.Throwable -> La7
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r1 = (int) r4
            monitor-exit(r0)
            if (r2 > r1) goto L5c
            r0 = r2
        L32:
            dl5 r4 = r8.Z
            java.lang.Object r4 = r4.b(r0)
            r4.getClass()
            t61 r4 = (defpackage.t61) r4
            if (r4 == r3) goto L57
        L3f:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L50
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r5 = 10000(0x2710, double:4.9407E-320)
            r4.join(r5)
            goto L3f
        L50:
            uw7 r4 = r4.A
            ls2 r5 = r8.Y
            r4.d(r5)
        L57:
            if (r0 == r1) goto L5c
            int r0 = r0 + 1
            goto L32
        L5c:
            ls2 r0 = r8.Y
            r0.b()
            ls2 r0 = r8.X
            r0.b()
        L66:
            if (r3 == 0) goto L6e
            mz6 r0 = r3.a(r2)
            if (r0 != 0) goto L96
        L6e:
            ls2 r0 = r8.X
            java.lang.Object r0 = r0.d()
            mz6 r0 = (defpackage.mz6) r0
            if (r0 != 0) goto L96
            ls2 r0 = r8.Y
            java.lang.Object r0 = r0.d()
            mz6 r0 = (defpackage.mz6) r0
            if (r0 != 0) goto L96
            if (r3 == 0) goto L89
            u61 r0 = defpackage.u61.TERMINATED
            r3.h(r0)
        L89:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.v61.d0
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.v61.e0
            r0.set(r8, r1)
            return
        L96:
            r0.run()     // Catch: java.lang.Throwable -> L9a
            goto L66
        L9a:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r1.getUncaughtExceptionHandler()
            r4.uncaughtException(r1, r0)
            goto L66
        La7:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
    }

    public final int e() {
            r11 = this;
            dl5 r0 = r11.Z
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.v61.f0     // Catch: java.lang.Throwable -> L6d
            int r1 = r1.get(r11)     // Catch: java.lang.Throwable -> L6d
            r2 = 1
            r3 = 0
            if (r1 != r2) goto Lf
            r1 = r2
            goto L10
        Lf:
            r1 = r3
        L10:
            if (r1 == 0) goto L15
            monitor-exit(r0)
            r11 = -1
            return r11
        L15:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.v61.e0     // Catch: java.lang.Throwable -> L6d
            long r4 = r1.get(r11)     // Catch: java.lang.Throwable -> L6d
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r8 = r4 & r6
            int r8 = (int) r8     // Catch: java.lang.Throwable -> L6d
            r9 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r4 = r4 & r9
            r9 = 21
            long r4 = r4 >> r9
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L6d
            int r4 = r8 - r4
            if (r4 >= 0) goto L30
            r4 = r3
        L30:
            int r5 = r11.A     // Catch: java.lang.Throwable -> L6d
            if (r4 < r5) goto L36
            monitor-exit(r0)
            return r3
        L36:
            int r5 = r11.B     // Catch: java.lang.Throwable -> L6d
            if (r8 < r5) goto L3c
            monitor-exit(r0)
            return r3
        L3c:
            long r8 = r1.get(r11)     // Catch: java.lang.Throwable -> L6d
            long r8 = r8 & r6
            int r3 = (int) r8     // Catch: java.lang.Throwable -> L6d
            int r3 = r3 + r2
            if (r3 <= 0) goto L6f
            dl5 r5 = r11.Z     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r5 = r5.b(r3)     // Catch: java.lang.Throwable -> L6d
            if (r5 != 0) goto L6f
            t61 r5 = new t61     // Catch: java.lang.Throwable -> L6d
            r5.<init>(r11, r3)     // Catch: java.lang.Throwable -> L6d
            dl5 r8 = r11.Z     // Catch: java.lang.Throwable -> L6d
            r8.c(r3, r5)     // Catch: java.lang.Throwable -> L6d
            long r8 = r1.incrementAndGet(r11)     // Catch: java.lang.Throwable -> L6d
            long r6 = r6 & r8
            int r11 = (int) r6
            if (r3 != r11) goto L65
            int r4 = r4 + r2
            monitor-exit(r0)
            r5.start()
            return r4
        L65:
            java.lang.String r11 = "Failed requirement."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r11)     // Catch: java.lang.Throwable -> L6d
            throw r1     // Catch: java.lang.Throwable -> L6d
        L6d:
            r11 = move-exception
            goto L77
        L6f:
            java.lang.String r11 = "Failed requirement."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r11)     // Catch: java.lang.Throwable -> L6d
            throw r1     // Catch: java.lang.Throwable -> L6d
        L77:
            monitor-exit(r0)
            throw r11
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r2) {
            r1 = this;
            r0 = 6
            k(r1, r2, r0)
            return
    }

    public final void h(java.lang.Runnable r7, boolean r8, boolean r9) {
            r6 = this;
            xd5 r0 = defpackage.sz6.f
            r0.getClass()
            long r0 = java.lang.System.nanoTime()
            boolean r2 = r7 instanceof defpackage.mz6
            if (r2 == 0) goto L14
            mz6 r7 = (defpackage.mz6) r7
            r7.A = r0
            r7.B = r8
            goto L1a
        L14:
            nz6 r2 = new nz6
            r2.<init>(r7, r0, r8)
            r7 = r2
        L1a:
            boolean r8 = r7.B
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.v61.e0
            if (r8 == 0) goto L28
            r1 = 2097152(0x200000, double:1.036131E-317)
            long r1 = r0.addAndGet(r6, r1)
            goto L2a
        L28:
            r1 = 0
        L2a:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            boolean r4 = r3 instanceof defpackage.t61
            r5 = 0
            if (r4 == 0) goto L36
            t61 r3 = (defpackage.t61) r3
            goto L37
        L36:
            r3 = r5
        L37:
            if (r3 == 0) goto L3f
            v61 r4 = r3.d0
            if (r4 == r6) goto L3e
            goto L3f
        L3e:
            r5 = r3
        L3f:
            if (r5 != 0) goto L42
            goto L5b
        L42:
            u61 r3 = r5.L
            u61 r4 = defpackage.u61.TERMINATED
            if (r3 != r4) goto L49
            goto L5b
        L49:
            boolean r4 = r7.B
            if (r4 != 0) goto L52
            u61 r4 = defpackage.u61.BLOCKING
            if (r3 != r4) goto L52
            goto L5b
        L52:
            r3 = 1
            r5.Z = r3
            uw7 r3 = r5.A
            mz6 r7 = r3.a(r7, r9)
        L5b:
            if (r7 == 0) goto L84
            boolean r9 = r7.B
            if (r9 == 0) goto L68
            ls2 r9 = r6.Y
            boolean r7 = r9.a(r7)
            goto L6e
        L68:
            ls2 r9 = r6.X
            boolean r7 = r9.a(r7)
        L6e:
            if (r7 == 0) goto L71
            goto L84
        L71:
            java.util.concurrent.RejectedExecutionException r7 = new java.util.concurrent.RejectedExecutionException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r6 = r6.R
            java.lang.String r9 = " was terminated"
            java.lang.String r6 = defpackage.i61.n(r8, r6, r9)
            r7.<init>(r6)
            throw r7
        L84:
            if (r8 == 0) goto L98
            boolean r7 = r6.u()
            if (r7 == 0) goto L8d
            goto La9
        L8d:
            boolean r7 = r6.r(r1)
            if (r7 == 0) goto L94
            goto La9
        L94:
            r6.u()
            return
        L98:
            boolean r7 = r6.u()
            if (r7 == 0) goto L9f
            goto La9
        L9f:
            long r7 = r0.get(r6)
            boolean r7 = r6.r(r7)
            if (r7 == 0) goto Laa
        La9:
            return
        Laa:
            r6.u()
            return
    }

    public final void n(defpackage.t61 r8, int r9, int r10) {
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.v61.d0
            long r3 = r0.get(r7)
            r0 = 2097151(0x1fffff, double:1.0361303E-317)
            long r0 = r0 & r3
            int r0 = (int) r0
            r1 = 2097152(0x200000, double:1.036131E-317)
            long r1 = r1 + r3
            r5 = -2097152(0xffffffffffe00000, double:NaN)
            long r1 = r1 & r5
            if (r0 != r9) goto L35
            if (r10 != 0) goto L34
            java.lang.Object r0 = r8.c()
        L1b:
            gr1 r5 = defpackage.v61.g0
            if (r0 != r5) goto L21
            r0 = -1
            goto L35
        L21:
            if (r0 != 0) goto L25
            r0 = 0
            goto L35
        L25:
            t61 r0 = (defpackage.t61) r0
            int r5 = r0.b()
            if (r5 == 0) goto L2f
            r0 = r5
            goto L35
        L2f:
            java.lang.Object r0 = r0.c()
            goto L1b
        L34:
            r0 = r10
        L35:
            if (r0 < 0) goto L0
            long r5 = (long) r0
            long r5 = r5 | r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.v61.d0
            r2 = r7
            boolean r7 = r1.compareAndSet(r2, r3, r5)
            if (r7 == 0) goto L43
            return
        L43:
            r7 = r2
            goto L0
    }

    public final boolean r(long r4) {
            r3 = this;
            r0 = 2097151(0x1fffff, double:1.0361303E-317)
            long r0 = r0 & r4
            int r0 = (int) r0
            r1 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r4 = r4 & r1
            r1 = 21
            long r4 = r4 >> r1
            int r4 = (int) r4
            int r0 = r0 - r4
            r4 = 0
            if (r0 >= 0) goto L14
            r0 = r4
        L14:
            int r5 = r3.A
            if (r0 >= r5) goto L27
            int r0 = r3.e()
            r1 = 1
            if (r0 != r1) goto L24
            if (r5 <= r1) goto L24
            r3.e()
        L24:
            if (r0 <= 0) goto L27
            return r1
        L27:
            return r4
    }

    public final java.lang.String toString() {
            r13 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            dl5 r1 = r13.Z
            int r2 = r1.a()
            r3 = 0
            r4 = 1
            r5 = r3
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r4
        L12:
            if (r9 >= r2) goto L90
            java.lang.Object r10 = r1.b(r9)
            t61 r10 = (defpackage.t61) r10
            if (r10 != 0) goto L1e
            goto L8d
        L1e:
            uw7 r11 = r10.A
            int r11 = r11.c()
            u61 r10 = r10.L
            int[] r12 = defpackage.s61.a
            int r10 = r10.ordinal()
            r10 = r12[r10]
            if (r10 == r4) goto L8b
            r12 = 2
            if (r10 == r12) goto L74
            r12 = 3
            if (r10 == r12) goto L5d
            r12 = 4
            if (r10 == r12) goto L44
            r11 = 5
            if (r10 != r11) goto L3f
            int r8 = r8 + 1
            goto L8d
        L3f:
            defpackage.i.d()
            r13 = 0
            return r13
        L44:
            int r7 = r7 + 1
            if (r11 <= 0) goto L8d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r11)
            r11 = 100
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r0.add(r10)
            goto L8d
        L5d:
            int r3 = r3 + 1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r11)
            r11 = 99
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r0.add(r10)
            goto L8d
        L74:
            int r5 = r5 + 1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r11)
            r11 = 98
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r0.add(r10)
            goto L8d
        L8b:
            int r6 = r6 + 1
        L8d:
            int r9 = r9 + 1
            goto L12
        L90:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.v61.e0
            long r1 = r1.get(r13)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = r13.R
            r4.append(r9)
            r9 = 64
            r4.append(r9)
            java.lang.String r9 = defpackage.nc1.P(r13)
            r4.append(r9)
            java.lang.String r9 = "[Pool Size {core = "
            r4.append(r9)
            int r9 = r13.A
            r4.append(r9)
            java.lang.String r10 = ", max = "
            r4.append(r10)
            java.lang.String r10 = "}, Worker States {CPU = "
            java.lang.String r11 = ", blocking = "
            int r12 = r13.B
            defpackage.lb1.x(r4, r12, r10, r3, r11)
            java.lang.String r3 = ", parked = "
            java.lang.String r10 = ", dormant = "
            defpackage.lb1.x(r4, r5, r3, r6, r10)
            java.lang.String r3 = ", terminated = "
            java.lang.String r5 = "}, running workers queues = "
            defpackage.lb1.x(r4, r7, r3, r8, r5)
            r4.append(r0)
            java.lang.String r0 = ", global CPU queue size = "
            r4.append(r0)
            ls2 r0 = r13.X
            int r0 = r0.c()
            r4.append(r0)
            java.lang.String r0 = ", global blocking queue size = "
            r4.append(r0)
            ls2 r13 = r13.Y
            int r13 = r13.c()
            r4.append(r13)
            java.lang.String r13 = ", Control State {created workers= "
            r4.append(r13)
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r5 & r1
            int r13 = (int) r5
            r4.append(r13)
            java.lang.String r13 = ", blocking tasks = "
            r4.append(r13)
            r5 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r5 = r5 & r1
            r13 = 21
            long r5 = r5 >> r13
            int r13 = (int) r5
            r4.append(r13)
            java.lang.String r13 = ", CPUs acquired = "
            r4.append(r13)
            r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r0 = r1 & r5
            r13 = 42
            long r0 = r0 >> r13
            int r13 = (int) r0
            int r9 = r9 - r13
            r4.append(r9)
            java.lang.String r13 = "}]"
            r4.append(r13)
            java.lang.String r13 = r4.toString()
            return r13
    }

    public final boolean u() {
            r11 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.v61.d0
            long r3 = r0.get(r11)
            r0 = 2097151(0x1fffff, double:1.0361303E-317)
            long r0 = r0 & r3
            int r0 = (int) r0
            dl5 r1 = r11.Z
            java.lang.Object r0 = r1.b(r0)
            t61 r0 = (defpackage.t61) r0
            r7 = -1
            r8 = 0
            if (r0 != 0) goto L1a
            r0 = 0
            r3 = r11
            goto L49
        L1a:
            r1 = 2097152(0x200000, double:1.036131E-317)
            long r1 = r1 + r3
            r5 = -2097152(0xffffffffffe00000, double:NaN)
            long r1 = r1 & r5
            java.lang.Object r5 = r0.c()
        L26:
            gr1 r9 = defpackage.v61.g0
            if (r5 != r9) goto L2c
            r6 = r7
            goto L38
        L2c:
            if (r5 != 0) goto L30
            r6 = r8
            goto L38
        L30:
            t61 r5 = (defpackage.t61) r5
            int r6 = r5.b()
            if (r6 == 0) goto L5b
        L38:
            if (r6 < 0) goto L0
            long r5 = (long) r6
            long r5 = r5 | r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.v61.d0
            r2 = r11
            boolean r11 = r1.compareAndSet(r2, r3, r5)
            r3 = r2
            if (r11 == 0) goto L59
            r0.g(r9)
        L49:
            if (r0 != 0) goto L4c
            return r8
        L4c:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r11 = defpackage.t61.e0
            boolean r11 = r11.compareAndSet(r0, r7, r8)
            if (r11 == 0) goto L59
            java.util.concurrent.locks.LockSupport.unpark(r0)
            r11 = 1
            return r11
        L59:
            r11 = r3
            goto L0
        L5b:
            r9 = r3
            r3 = r11
            java.lang.Object r5 = r5.c()
            r3 = r9
            goto L26
    }
}
