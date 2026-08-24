package com.google.android.gms.internal.mlkit_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zzav extends com.google.android.gms.internal.mlkit_common.zzx implements java.util.concurrent.ExecutorService, java.lang.AutoCloseable {
    public zzav() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            java.util.concurrent.ExecutorService r0 = r0.zzb()
            boolean r0 = r0.awaitTermination(r1, r3)
            return r0
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

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r1) {
            r0 = this;
            java.util.concurrent.ExecutorService r0 = r0.zzb()
            r0.execute(r1)
            return
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List invokeAll(java.util.Collection r1) {
            r0 = this;
            java.util.concurrent.ExecutorService r0 = r0.zzb()
            java.util.List r0 = r0.invokeAll(r1)
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List invokeAll(java.util.Collection r1, long r2, java.util.concurrent.TimeUnit r4) {
            r0 = this;
            java.util.concurrent.ExecutorService r0 = r0.zzb()
            java.util.List r0 = r0.invokeAll(r1, r2, r4)
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.lang.Object invokeAny(java.util.Collection r1) {
            r0 = this;
            java.util.concurrent.ExecutorService r0 = r0.zzb()
            java.lang.Object r0 = r0.invokeAny(r1)
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.lang.Object invokeAny(java.util.Collection r1, long r2, java.util.concurrent.TimeUnit r4) {
            r0 = this;
            java.util.concurrent.ExecutorService r0 = r0.zzb()
            java.lang.Object r0 = r0.invokeAny(r1, r2, r4)
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
            r0 = this;
            java.util.concurrent.ExecutorService r0 = r0.zzb()
            boolean r0 = r0.isShutdown()
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
            r0 = this;
            java.util.concurrent.ExecutorService r0 = r0.zzb()
            boolean r0 = r0.isTerminated()
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
            r0 = this;
            java.util.concurrent.ExecutorService r0 = r0.zzb()
            r0.shutdown()
            return
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List shutdownNow() {
            r0 = this;
            java.util.concurrent.ExecutorService r0 = r0.zzb()
            java.util.List r0 = r0.shutdownNow()
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.lang.Runnable r1) {
            r0 = this;
            java.util.concurrent.ExecutorService r0 = r0.zzb()
            java.util.concurrent.Future r0 = r0.submit(r1)
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.lang.Runnable r1, java.lang.Object r2) {
            r0 = this;
            java.util.concurrent.ExecutorService r0 = r0.zzb()
            java.util.concurrent.Future r0 = r0.submit(r1, r2)
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.util.concurrent.Callable r1) {
            r0 = this;
            java.util.concurrent.ExecutorService r0 = r0.zzb()
            java.util.concurrent.Future r0 = r0.submit(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzx
    public /* bridge */ /* synthetic */ java.lang.Object zza() {
            r0 = this;
            r0 = 0
            throw r0
    }

    public abstract java.util.concurrent.ExecutorService zzb();
}
