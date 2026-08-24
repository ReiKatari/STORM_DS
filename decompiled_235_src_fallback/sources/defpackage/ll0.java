package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ll0  reason: default package */
/* loaded from: classes.dex */
public final class ll0 extends defpackage.to2 implements java.lang.Runnable {
    public defpackage.aw L;
    public final java.util.concurrent.LinkedBlockingQueue R;
    public final java.util.concurrent.CountDownLatch X;
    public defpackage.gx3 Y;
    public volatile defpackage.gx3 Z;

    public ll0(defpackage.aw r3, defpackage.gx3 r4) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r1 = 1
            r0.<init>(r1)
            r2.R = r0
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r0.<init>(r1)
            r2.X = r0
            r2.L = r3
            r4.getClass()
            r2.Y = r4
            return
    }

    public static java.lang.Object b(java.util.concurrent.LinkedBlockingQueue r1) {
            r0 = 0
        L1:
            java.lang.Object r1 = r1.take()     // Catch: java.lang.Throwable -> Lf java.lang.InterruptedException -> L1a
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

    @Override // defpackage.to2, java.util.concurrent.Future
    public final boolean cancel(boolean r5) {
            r4 = this;
            gx3 r0 = r4.A
            boolean r0 = r0.cancel(r5)
            r1 = 0
            if (r0 == 0) goto L38
            java.util.concurrent.LinkedBlockingQueue r0 = r4.R
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
        Lf:
            r3 = 1
            r0.put(r2)     // Catch: java.lang.Throwable -> L2b java.lang.InterruptedException -> L36
            if (r1 == 0) goto L1c
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L1c:
            gx3 r0 = r4.Y
            if (r0 == 0) goto L23
            r0.cancel(r5)
        L23:
            gx3 r4 = r4.Z
            if (r4 == 0) goto L2a
            r4.cancel(r5)
        L2a:
            return r3
        L2b:
            r4 = move-exception
            if (r1 == 0) goto L35
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
        L35:
            throw r4
        L36:
            r1 = r3
            goto Lf
        L38:
            return r1
    }

    @Override // defpackage.to2, java.util.concurrent.Future
    public final java.lang.Object get() {
            r1 = this;
            gx3 r0 = r1.A
            boolean r0 = r0.isDone()
            if (r0 != 0) goto L1b
            gx3 r0 = r1.Y
            if (r0 == 0) goto Lf
            r0.get()
        Lf:
            java.util.concurrent.CountDownLatch r0 = r1.X
            r0.await()
            gx3 r0 = r1.Z
            if (r0 == 0) goto L1b
            r0.get()
        L1b:
            gx3 r1 = r1.A
            java.lang.Object r1 = r1.get()
            return r1
    }

    @Override // defpackage.to2, java.util.concurrent.Future
    public final java.lang.Object get(long r8, java.util.concurrent.TimeUnit r10) {
            r7 = this;
            gx3 r0 = r7.A
            boolean r0 = r0.isDone()
            if (r0 != 0) goto L4c
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            if (r10 == r0) goto L11
            long r8 = r0.convert(r8, r10)
            r10 = r0
        L11:
            gx3 r0 = r7.Y
            r1 = 0
            if (r0 == 0) goto L28
            long r3 = java.lang.System.nanoTime()
            r0.get(r8, r10)
            long r5 = java.lang.System.nanoTime()
            long r5 = r5 - r3
            long r3 = java.lang.Math.max(r1, r5)
            long r8 = r8 - r3
        L28:
            long r3 = java.lang.System.nanoTime()
            java.util.concurrent.CountDownLatch r0 = r7.X
            boolean r0 = r0.await(r8, r10)
            if (r0 == 0) goto L46
            long r5 = java.lang.System.nanoTime()
            long r5 = r5 - r3
            long r0 = java.lang.Math.max(r1, r5)
            long r8 = r8 - r0
            gx3 r0 = r7.Z
            if (r0 == 0) goto L4c
            r0.get(r8, r10)
            goto L4c
        L46:
            java.util.concurrent.TimeoutException r7 = new java.util.concurrent.TimeoutException
            r7.<init>()
            throw r7
        L4c:
            gx3 r7 = r7.A
            java.lang.Object r7 = r7.get(r8, r10)
            return r7
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            r0 = 0
            r1 = 0
            gx3 r2 = r5.Y     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39 java.util.concurrent.ExecutionException -> L49 java.util.concurrent.CancellationException -> L56
            java.lang.Object r2 = defpackage.l.w(r2)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39 java.util.concurrent.ExecutionException -> L49 java.util.concurrent.CancellationException -> L56
            aw r3 = r5.L     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            gx3 r2 = r3.apply(r2)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            r5.Z = r2     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            gx3 r3 = r5.A     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            boolean r3 = r3.isCancelled()     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            if (r3 == 0) goto L3b
            java.util.concurrent.LinkedBlockingQueue r0 = r5.R     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            java.lang.Object r0 = b(r0)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            r2.cancel(r0)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            r5.Z = r1     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
        L29:
            r5.L = r1
            r5.Y = r1
            java.util.concurrent.CountDownLatch r5 = r5.X
            r5.countDown()
            return
        L33:
            r0 = move-exception
            goto L80
        L35:
            r0 = move-exception
            goto L5a
        L37:
            r0 = move-exception
            goto L6b
        L39:
            r0 = move-exception
            goto L73
        L3b:
            uo2 r3 = new uo2     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            r4 = 6
            r3.<init>(r4, r5, r2, r0)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            uj1 r0 = defpackage.u24.j()     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            r2.a(r0, r3)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            goto L29
        L49:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            qb0 r2 = r5.B     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            if (r2 == 0) goto L29
            r2.c(r0)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            goto L29
        L56:
            r5.cancel(r0)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            goto L29
        L5a:
            qb0 r2 = r5.B     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L61
            r2.c(r0)     // Catch: java.lang.Throwable -> L33
        L61:
            r5.L = r1
            r5.Y = r1
            java.util.concurrent.CountDownLatch r5 = r5.X
            r5.countDown()
            goto L7f
        L6b:
            qb0 r2 = r5.B     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L61
            r2.c(r0)     // Catch: java.lang.Throwable -> L33
            goto L61
        L73:
            java.lang.Throwable r0 = r0.getCause()     // Catch: java.lang.Throwable -> L33
            qb0 r2 = r5.B     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L61
            r2.c(r0)     // Catch: java.lang.Throwable -> L33
            goto L61
        L7f:
            return
        L80:
            r5.L = r1
            r5.Y = r1
            java.util.concurrent.CountDownLatch r5 = r5.X
            r5.countDown()
            throw r0
    }
}
