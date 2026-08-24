package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ov2  reason: default package */
/* loaded from: classes.dex */
public final class ov2 extends java.util.concurrent.AbstractExecutorService implements java.util.concurrent.ScheduledExecutorService, java.lang.AutoCloseable {
    public final android.os.Handler A;

    static {
            qm r0 = new qm
            r1 = 4
            r0.<init>(r1)
            return
    }

    public ov2(android.os.Handler r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.Class<ov2> r1 = defpackage.ov2.class
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r2 = " cannot be shut down. Use Looper.quitSafely()."
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1)
            throw r0
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
            r1 = this;
            java.util.concurrent.ForkJoinPool r0 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r1 != r0) goto L7
            return
        L7:
            r1.shutdown()
            r1 = 0
            throw r1
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r1) {
            r0 = this;
            android.os.Handler r0 = r0.A
            boolean r1 = r0.post(r1)
            if (r1 == 0) goto L9
            return
        L9:
            defpackage.e41.e(r0)
            return
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture schedule(java.lang.Runnable r2, long r3, java.util.concurrent.TimeUnit r5) {
            r1 = this;
            mv2 r0 = new mv2
            r0.<init>(r2)
            java.util.concurrent.ScheduledFuture r1 = r1.schedule(r0, r3, r5)
            return r1
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture schedule(java.util.concurrent.Callable r4, long r5, java.util.concurrent.TimeUnit r7) {
            r3 = this;
            long r0 = android.os.SystemClock.uptimeMillis()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r5 = r2.convert(r5, r7)
            long r5 = r5 + r0
            nv2 r7 = new nv2
            android.os.Handler r3 = r3.A
            r7.<init>(r3, r5, r4)
            boolean r4 = r3.postAtTime(r7, r5)
            if (r4 == 0) goto L19
            return r7
        L19:
            java.util.concurrent.RejectedExecutionException r4 = new java.util.concurrent.RejectedExecutionException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = " is shutting down"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            m33 r3 = new m33
            r5 = 1
            r3.<init>(r4, r5)
            return r3
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture scheduleAtFixedRate(java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.Class<ov2> r1 = defpackage.ov2.class
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r2 = " does not yet support fixed-rate scheduling."
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture scheduleWithFixedDelay(java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.Class<ov2> r1 = defpackage.ov2.class
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r2 = " does not yet support fixed-delay scheduling."
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
            r2 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.Class<ov2> r0 = defpackage.ov2.class
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = " cannot be shut down. Use Looper.quitSafely()."
            java.lang.String r0 = r0.concat(r1)
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List shutdownNow() {
            r2 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.Class<ov2> r0 = defpackage.ov2.class
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = " cannot be shut down. Use Looper.quitSafely()."
            java.lang.String r0 = r0.concat(r1)
            r2.<init>(r0)
            throw r2
    }
}
