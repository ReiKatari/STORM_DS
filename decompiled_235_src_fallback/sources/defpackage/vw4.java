package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vw4  reason: default package */
/* loaded from: classes.dex */
public final class vw4 extends java.util.concurrent.ThreadPoolExecutor implements java.lang.AutoCloseable {
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

    public final void e(int r1) {
            r0 = this;
            r0.setCorePoolSize(r1)
            r0.setMaximumPoolSize(r1)
            return
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.lang.Runnable r2) {
            r1 = this;
            uw4 r0 = new uw4
            v40 r2 = (defpackage.v40) r2
            r0.<init>(r2)
            r1.execute(r0)
            return r0
    }
}
