package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r1  reason: default package */
/* loaded from: classes.dex */
public abstract class r1 implements defpackage.gx3 {
    public static final boolean R = false;
    public static final java.util.logging.Logger X = null;
    public static final defpackage.q60 Y = null;
    public static final java.lang.Object Z = null;
    public volatile java.lang.Object A;
    public volatile defpackage.n1 B;
    public volatile defpackage.q1 L;

    static {
            java.lang.Class<q1> r0 = defpackage.q1.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            defpackage.r1.R = r1
            java.lang.Class<r1> r1 = defpackage.r1.class
            java.lang.String r2 = r1.getName()
            java.util.logging.Logger r2 = java.util.logging.Logger.getLogger(r2)
            defpackage.r1.X = r2
            o1 r3 = new o1     // Catch: java.lang.Throwable -> L47
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r4 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r4)     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = "L"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)     // Catch: java.lang.Throwable -> L47
            java.lang.Class<n1> r0 = defpackage.n1.class
            java.lang.String r2 = "B"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)     // Catch: java.lang.Throwable -> L47
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r2 = "A"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)     // Catch: java.lang.Throwable -> L47
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L47
            r0 = 0
            goto L4d
        L47:
            r0 = move-exception
            p1 r3 = new p1
            r3.<init>()
        L4d:
            defpackage.r1.Y = r3
            if (r0 == 0) goto L5a
            java.util.logging.Logger r1 = defpackage.r1.X
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L5a:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.r1.Z = r0
            return
    }

    public static void c(defpackage.r1 r4) {
        L0:
            q1 r0 = r4.L
            q60 r1 = defpackage.r1.Y
            q1 r2 = defpackage.q1.c
            boolean r1 = r1.o(r4, r0, r2)
            if (r1 == 0) goto L0
        Lc:
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.Thread r2 = r0.a
            if (r2 == 0) goto L18
            r0.a = r1
            java.util.concurrent.locks.LockSupport.unpark(r2)
        L18:
            q1 r0 = r0.b
            goto Lc
        L1b:
            n1 r0 = r4.B
            q60 r2 = defpackage.r1.Y
            n1 r3 = defpackage.n1.d
            boolean r2 = r2.m(r4, r0, r3)
            if (r2 == 0) goto L1b
        L27:
            r4 = r1
            r1 = r0
            if (r1 == 0) goto L30
            n1 r0 = r1.c
            r1.c = r4
            goto L27
        L30:
            if (r4 == 0) goto L3d
            n1 r0 = r4.c
            java.lang.Runnable r1 = r4.a
            java.util.concurrent.Executor r4 = r4.b
            d(r4, r1)
            r4 = r0
            goto L30
        L3d:
            return
    }

    public static void d(java.util.concurrent.Executor r4, java.lang.Runnable r5) {
            r4.execute(r5)     // Catch: java.lang.RuntimeException -> L4
            return
        L4:
            r0 = move-exception
            java.util.logging.Level r1 = java.util.logging.Level.SEVERE
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "RuntimeException while executing runnable "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r5 = " with executor "
            r2.append(r5)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            java.util.logging.Logger r5 = defpackage.r1.X
            r5.log(r1, r4, r0)
            return
    }

    public static java.lang.Object e(java.lang.Object r2) {
            boolean r0 = r2 instanceof defpackage.k1
            if (r0 != 0) goto L18
            boolean r0 = r2 instanceof defpackage.m1
            if (r0 != 0) goto Le
            java.lang.Object r0 = defpackage.r1.Z
            if (r2 != r0) goto Ld
            r2 = 0
        Ld:
            return r2
        Le:
            java.util.concurrent.ExecutionException r0 = new java.util.concurrent.ExecutionException
            m1 r2 = (defpackage.m1) r2
            java.lang.Throwable r2 = r2.a
            r0.<init>(r2)
            throw r0
        L18:
            k1 r2 = (defpackage.k1) r2
            java.lang.Throwable r2 = r2.a
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r1 = "Task was cancelled."
            r0.<init>(r1)
            r0.initCause(r2)
            throw r0
    }

    public static java.lang.Object f(java.util.concurrent.Future r1) {
            r0 = 0
        L1:
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lf java.lang.InterruptedException -> L1a
            if (r0 == 0) goto Le
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        Le:
            return r1
        Lf:
            r1 = move-exception
            if (r0 == 0) goto L19
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L19:
            throw r1
        L1a:
            r0 = 1
            goto L1
    }

    @Override // defpackage.gx3
    public final void a(java.util.concurrent.Executor r5, java.lang.Runnable r6) {
            r4 = this;
            r5.getClass()
            n1 r0 = r4.B
            n1 r1 = defpackage.n1.d
            if (r0 == r1) goto L1d
            n1 r2 = new n1
            r2.<init>(r5, r6)
        Le:
            r2.c = r0
            q60 r3 = defpackage.r1.Y
            boolean r0 = r3.m(r4, r0, r2)
            if (r0 == 0) goto L19
            return
        L19:
            n1 r0 = r4.B
            if (r0 != r1) goto Le
        L1d:
            d(r5, r6)
            return
    }

    public final void b(java.lang.StringBuilder r4) {
            r3 = this;
            java.lang.String r0 = "]"
            java.lang.Object r1 = f(r3)     // Catch: java.lang.RuntimeException -> L1b java.util.concurrent.ExecutionException -> L1d java.util.concurrent.CancellationException -> L31
            java.lang.String r2 = "SUCCESS, result=["
            r4.append(r2)     // Catch: java.lang.RuntimeException -> L1b java.util.concurrent.ExecutionException -> L1d java.util.concurrent.CancellationException -> L31
            if (r1 != r3) goto L10
            java.lang.String r3 = "this future"
            goto L14
        L10:
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch: java.lang.RuntimeException -> L1b java.util.concurrent.ExecutionException -> L1d java.util.concurrent.CancellationException -> L31
        L14:
            r4.append(r3)     // Catch: java.lang.RuntimeException -> L1b java.util.concurrent.ExecutionException -> L1d java.util.concurrent.CancellationException -> L31
            r4.append(r0)     // Catch: java.lang.RuntimeException -> L1b java.util.concurrent.ExecutionException -> L1d java.util.concurrent.CancellationException -> L31
            return
        L1b:
            r3 = move-exception
            goto L1f
        L1d:
            r3 = move-exception
            goto L37
        L1f:
            java.lang.String r0 = "UNKNOWN, cause=["
            r4.append(r0)
            java.lang.Class r3 = r3.getClass()
            r4.append(r3)
            java.lang.String r3 = " thrown from get()]"
            r4.append(r3)
            goto L46
        L31:
            java.lang.String r3 = "CANCELLED"
            r4.append(r3)
            goto L46
        L37:
            java.lang.String r1 = "FAILURE, cause=["
            r4.append(r1)
            java.lang.Throwable r3 = r3.getCause()
            r4.append(r3)
            r4.append(r0)
        L46:
            return
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean r5) {
            r4 = this;
            java.lang.Object r0 = r4.A
            if (r0 != 0) goto L29
            boolean r1 = defpackage.r1.R
            if (r1 == 0) goto L15
            k1 r1 = new k1
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r3 = "Future.cancel() was called."
            r2.<init>(r3)
            r1.<init>(r2, r5)
            goto L1c
        L15:
            if (r5 == 0) goto L1a
            k1 r1 = defpackage.k1.b
            goto L1c
        L1a:
            k1 r1 = defpackage.k1.c
        L1c:
            q60 r5 = defpackage.r1.Y
            boolean r5 = r5.n(r4, r0, r1)
            if (r5 == 0) goto L29
            c(r4)
            r4 = 1
            return r4
        L29:
            r4 = 0
            return r4
    }

    public java.lang.String g() {
            r3 = this;
            boolean r0 = r3 instanceof java.util.concurrent.ScheduledFuture
            if (r0 == 0) goto L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "remaining delay=["
            r0.<init>(r1)
            java.util.concurrent.ScheduledFuture r3 = (java.util.concurrent.ScheduledFuture) r3
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r3.getDelay(r1)
            r0.append(r1)
            java.lang.String r3 = " ms]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
        L20:
            r3 = 0
            return r3
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
            r4 = this;
            q1 r0 = defpackage.q1.c
            boolean r1 = java.lang.Thread.interrupted()
            if (r1 != 0) goto L4b
            java.lang.Object r1 = r4.A
            if (r1 == 0) goto L11
            java.lang.Object r4 = e(r1)
            return r4
        L11:
            q1 r1 = r4.L
            if (r1 == r0) goto L44
            q1 r2 = new q1
            r2.<init>()
        L1a:
            q60 r3 = defpackage.r1.Y
            r3.S(r2, r1)
            boolean r1 = r3.o(r4, r1, r2)
            if (r1 == 0) goto L40
        L25:
            java.util.concurrent.locks.LockSupport.park(r4)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L37
            java.lang.Object r0 = r4.A
            if (r0 == 0) goto L25
            java.lang.Object r4 = e(r0)
            return r4
        L37:
            r4.h(r2)
            java.lang.InterruptedException r4 = new java.lang.InterruptedException
            r4.<init>()
            throw r4
        L40:
            q1 r1 = r4.L
            if (r1 != r0) goto L1a
        L44:
            java.lang.Object r4 = r4.A
            java.lang.Object r4 = e(r4)
            return r4
        L4b:
            java.lang.InterruptedException r4 = new java.lang.InterruptedException
            r4.<init>()
            throw r4
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long r18, java.util.concurrent.TimeUnit r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r20
            q1 r4 = defpackage.q1.c
            long r5 = r3.toNanos(r1)
            boolean r7 = java.lang.Thread.interrupted()
            if (r7 != 0) goto L13d
            java.lang.Object r7 = r0.A
            if (r7 == 0) goto L1b
            java.lang.Object r0 = e(r7)
            return r0
        L1b:
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L27
            long r9 = java.lang.System.nanoTime()
            long r9 = r9 + r5
            goto L28
        L27:
            r9 = r7
        L28:
            r11 = 1000(0x3e8, double:4.94E-321)
            int r13 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r13 < 0) goto L76
            q1 r13 = r0.L
            if (r13 == r4) goto L6f
            q1 r14 = new q1
            r14.<init>()
        L37:
            q60 r15 = defpackage.r1.Y
            r15.S(r14, r13)
            boolean r13 = r15.o(r0, r13, r14)
            if (r13 == 0) goto L6b
        L42:
            java.util.concurrent.locks.LockSupport.parkNanos(r0, r5)
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L62
            java.lang.Object r4 = r0.A
            if (r4 == 0) goto L54
            java.lang.Object r0 = e(r4)
            return r0
        L54:
            long r4 = java.lang.System.nanoTime()
            long r5 = r9 - r4
            int r4 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r4 >= 0) goto L42
            r0.h(r14)
            goto L76
        L62:
            r0.h(r14)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L6b:
            q1 r13 = r0.L
            if (r13 != r4) goto L37
        L6f:
            java.lang.Object r0 = r0.A
            java.lang.Object r0 = e(r0)
            return r0
        L76:
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 <= 0) goto L96
            java.lang.Object r4 = r0.A
            if (r4 == 0) goto L83
            java.lang.Object r0 = e(r4)
            return r0
        L83:
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L90
            long r4 = java.lang.System.nanoTime()
            long r5 = r9 - r4
            goto L76
        L90:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L96:
            java.lang.String r4 = r0.toString()
            java.lang.String r9 = r3.toString()
            java.util.Locale r10 = java.util.Locale.ROOT
            java.lang.String r9 = r9.toLowerCase(r10)
            java.lang.String r13 = "Waited "
            java.lang.String r14 = " "
            java.lang.StringBuilder r1 = defpackage.xg6.s(r1, r13, r14)
            java.lang.String r2 = r3.toString()
            java.lang.String r2 = r2.toLowerCase(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            long r15 = r5 + r11
            int r2 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r2 >= 0) goto L11f
            java.lang.String r2 = " (plus "
            java.lang.String r1 = r1.concat(r2)
            long r5 = -r5
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            r15 = r7
            long r7 = r3.convert(r5, r2)
            long r2 = r3.toNanos(r7)
            long r5 = r5 - r2
            int r2 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r2 == 0) goto Ldf
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 <= 0) goto Ldd
            goto Ldf
        Ldd:
            r3 = 0
            goto Le0
        Ldf:
            r3 = 1
        Le0:
            if (r2 <= 0) goto L103
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r7)
            r2.append(r14)
            r2.append(r9)
            java.lang.String r1 = r2.toString()
            if (r3 == 0) goto Lff
            java.lang.String r2 = ","
            java.lang.String r1 = r1.concat(r2)
        Lff:
            java.lang.String r1 = r1.concat(r14)
        L103:
            if (r3 == 0) goto L119
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = " nanoseconds "
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L119:
            java.lang.String r2 = "delay)"
            java.lang.String r1 = r1.concat(r2)
        L11f:
            boolean r0 = r0.isDone()
            if (r0 == 0) goto L131
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            java.lang.String r2 = " but future completed as timeout expired"
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1)
            throw r0
        L131:
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            java.lang.String r2 = " for "
            java.lang.String r1 = defpackage.lb1.m(r1, r2, r4)
            r0.<init>(r1)
            throw r0
        L13d:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
    }

    public final void h(defpackage.q1 r5) {
            r4 = this;
            r0 = 0
            r5.a = r0
        L3:
            q1 r5 = r4.L
            q1 r1 = defpackage.q1.c
            if (r5 != r1) goto La
            goto L29
        La:
            r1 = r0
        Lb:
            if (r5 == 0) goto L29
            q1 r2 = r5.b
            java.lang.Thread r3 = r5.a
            if (r3 == 0) goto L15
            r1 = r5
            goto L27
        L15:
            if (r1 == 0) goto L1e
            r1.b = r2
            java.lang.Thread r5 = r1.a
            if (r5 != 0) goto L27
            goto L3
        L1e:
            q60 r3 = defpackage.r1.Y
            boolean r5 = r3.o(r4, r5, r2)
            if (r5 != 0) goto L27
            goto L3
        L27:
            r5 = r2
            goto Lb
        L29:
            return
    }

    public boolean i(java.lang.Throwable r3) {
            r2 = this;
            m1 r0 = new m1
            r3.getClass()
            r0.<init>(r3)
            q60 r3 = defpackage.r1.Y
            r1 = 0
            boolean r3 = r3.n(r2, r1, r0)
            if (r3 == 0) goto L16
            c(r2)
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
            r0 = this;
            java.lang.Object r0 = r0.A
            boolean r0 = r0 instanceof defpackage.k1
            return r0
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
            r0 = this;
            java.lang.Object r0 = r0.A
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            java.lang.Object r1 = r5.A
            boolean r1 = r1 instanceof defpackage.k1
            java.lang.String r2 = "]"
            if (r1 == 0) goto L1f
            java.lang.String r5 = "CANCELLED"
            r0.append(r5)
            goto L64
        L1f:
            boolean r1 = r5.isDone()
            if (r1 == 0) goto L29
            r5.b(r0)
            goto L64
        L29:
            java.lang.String r1 = r5.g()     // Catch: java.lang.RuntimeException -> L2e
            goto L41
        L2e:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Exception thrown from implementation: "
            r3.<init>(r4)
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L41:
            if (r1 == 0) goto L55
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L55
            java.lang.String r5 = "PENDING, info=["
            r0.append(r5)
            r0.append(r1)
            r0.append(r2)
            goto L64
        L55:
            boolean r1 = r5.isDone()
            if (r1 == 0) goto L5f
            r5.b(r0)
            goto L64
        L5f:
            java.lang.String r5 = "PENDING"
            r0.append(r5)
        L64:
            r0.append(r2)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
