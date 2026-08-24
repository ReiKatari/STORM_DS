package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gf0  reason: default package */
/* loaded from: classes.dex */
public final class gf0 implements java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService, java.lang.AutoCloseable {
    public static final defpackage.ff0 L = null;
    public final java.lang.Object A;
    public java.util.concurrent.ScheduledThreadPoolExecutor B;

    static {
            ff0 r0 = new ff0
            r1 = 0
            r0.<init>(r1)
            defpackage.gf0.L = r0
            return
    }

    public gf0() {
            r4 = this;
            r4.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r4.A = r0
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = new java.util.concurrent.ScheduledThreadPoolExecutor
            r1 = 1
            ff0 r2 = defpackage.gf0.L
            r0.<init>(r1, r2)
            r1 = 0
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.setKeepAliveTime(r1, r3)
            ef0 r1 = new ef0
            r1.<init>()
            r0.setRejectedExecutionHandler(r1)
            r4.B = r0
            return
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            java.lang.Object r0 = r1.A
            monitor-enter(r0)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r1.B     // Catch: java.lang.Throwable -> Lb
            boolean r1 = r1.awaitTermination(r2, r4)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
            r5 = this;
            java.util.concurrent.ForkJoinPool r0 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r5 != r0) goto L7
            goto L2c
        L7:
            boolean r0 = r5.isTerminated()
            if (r0 != 0) goto L2c
            r5.shutdown()
            r1 = 0
        L11:
            if (r0 != 0) goto L23
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.InterruptedException -> L1c
            r3 = 1
            boolean r0 = r5.awaitTermination(r3, r2)     // Catch: java.lang.InterruptedException -> L1c
            goto L11
        L1c:
            if (r1 != 0) goto L11
            r5.shutdownNow()
            r1 = 1
            goto L11
        L23:
            if (r1 == 0) goto L2c
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
        L2c:
            return
    }

    public final void e(defpackage.if0 r7) {
            r6 = this;
            r7.getClass()
            java.lang.Object r0 = r6.A
            monitor-enter(r0)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r6.B     // Catch: java.lang.Throwable -> L28
            boolean r1 = r1.isShutdown()     // Catch: java.lang.Throwable -> L28
            r2 = 1
            if (r1 == 0) goto L2a
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = new java.util.concurrent.ScheduledThreadPoolExecutor     // Catch: java.lang.Throwable -> L28
            ff0 r3 = defpackage.gf0.L     // Catch: java.lang.Throwable -> L28
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L28
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L28
            r4 = 0
            r1.setKeepAliveTime(r4, r3)     // Catch: java.lang.Throwable -> L28
            ef0 r3 = new ef0     // Catch: java.lang.Throwable -> L28
            r3.<init>()     // Catch: java.lang.Throwable -> L28
            r1.setRejectedExecutionHandler(r3)     // Catch: java.lang.Throwable -> L28
            r6.B = r1     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r6 = move-exception
            goto L3d
        L2a:
            java.util.concurrent.ScheduledThreadPoolExecutor r6 = r6.B     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            java.util.Set r7 = r7.e()
            int r7 = r7.size()
            int r7 = java.lang.Math.max(r2, r7)
            r6.setCorePoolSize(r7)
            return
        L3d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r6
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r2) {
            r1 = this;
            r2.getClass()
            java.lang.Object r0 = r1.A
            monitor-enter(r0)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r1.B     // Catch: java.lang.Throwable -> Ld
            r1.execute(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List invokeAll(java.util.Collection r2) {
            r1 = this;
            java.lang.Object r0 = r1.A
            monitor-enter(r0)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r1.B     // Catch: java.lang.Throwable -> Lb
            java.util.List r1 = r1.invokeAll(r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List invokeAll(java.util.Collection r2, long r3, java.util.concurrent.TimeUnit r5) {
            r1 = this;
            java.lang.Object r0 = r1.A
            monitor-enter(r0)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r1.B     // Catch: java.lang.Throwable -> Lb
            java.util.List r1 = r1.invokeAll(r2, r3, r5)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.lang.Object invokeAny(java.util.Collection r2) {
            r1 = this;
            java.lang.Object r0 = r1.A
            monitor-enter(r0)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r1.B     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r1 = r1.invokeAny(r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.lang.Object invokeAny(java.util.Collection r2, long r3, java.util.concurrent.TimeUnit r5) {
            r1 = this;
            java.lang.Object r0 = r1.A
            monitor-enter(r0)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r1.B     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r1 = r1.invokeAny(r2, r3, r5)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
            r1 = this;
            java.lang.Object r0 = r1.A
            monitor-enter(r0)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r1.B     // Catch: java.lang.Throwable -> Lb
            boolean r1 = r1.isShutdown()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
            r1 = this;
            java.lang.Object r0 = r1.A
            monitor-enter(r0)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r1.B     // Catch: java.lang.Throwable -> Lb
            boolean r1 = r1.isTerminated()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture schedule(java.lang.Runnable r2, long r3, java.util.concurrent.TimeUnit r5) {
            r1 = this;
            java.lang.Object r0 = r1.A
            monitor-enter(r0)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r1.B     // Catch: java.lang.Throwable -> Lb
            java.util.concurrent.ScheduledFuture r1 = r1.schedule(r2, r3, r5)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture schedule(java.util.concurrent.Callable r2, long r3, java.util.concurrent.TimeUnit r5) {
            r1 = this;
            java.lang.Object r0 = r1.A
            monitor-enter(r0)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r1.B     // Catch: java.lang.Throwable -> Lb
            java.util.concurrent.ScheduledFuture r1 = r1.schedule(r2, r3, r5)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture scheduleAtFixedRate(java.lang.Runnable r3, long r4, long r6, java.util.concurrent.TimeUnit r8) {
            r2 = this;
            java.lang.Object r1 = r2.A
            monitor-enter(r1)
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r2.B     // Catch: java.lang.Throwable -> Lb
            java.util.concurrent.ScheduledFuture r2 = r2.scheduleAtFixedRate(r3, r4, r6, r8)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            return r2
        Lb:
            r0 = move-exception
            r2 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture scheduleWithFixedDelay(java.lang.Runnable r3, long r4, long r6, java.util.concurrent.TimeUnit r8) {
            r2 = this;
            java.lang.Object r1 = r2.A
            monitor-enter(r1)
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r2.B     // Catch: java.lang.Throwable -> Lb
            java.util.concurrent.ScheduledFuture r2 = r2.scheduleWithFixedDelay(r3, r4, r6, r8)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            return r2
        Lb:
            r0 = move-exception
            r2 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
            r1 = this;
            java.lang.Object r0 = r1.A
            monitor-enter(r0)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r1.B     // Catch: java.lang.Throwable -> La
            r1.shutdown()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List shutdownNow() {
            r1 = this;
            java.lang.Object r0 = r1.A
            monitor-enter(r0)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r1.B     // Catch: java.lang.Throwable -> Lb
            java.util.List r1 = r1.shutdownNow()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.lang.Runnable r2) {
            r1 = this;
            java.lang.Object r0 = r1.A
            monitor-enter(r0)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r1.B     // Catch: java.lang.Throwable -> Lb
            java.util.concurrent.Future r1 = r1.submit(r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.lang.Runnable r2, java.lang.Object r3) {
            r1 = this;
            java.lang.Object r0 = r1.A
            monitor-enter(r0)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r1.B     // Catch: java.lang.Throwable -> Lb
            java.util.concurrent.Future r1 = r1.submit(r2, r3)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.util.concurrent.Callable r2) {
            r1 = this;
            java.lang.Object r0 = r1.A
            monitor-enter(r0)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r1.B     // Catch: java.lang.Throwable -> Lb
            java.util.concurrent.Future r1 = r1.submit(r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }
}
