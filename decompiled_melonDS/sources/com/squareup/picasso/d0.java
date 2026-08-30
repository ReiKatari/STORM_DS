package com.squareup.picasso;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 extends ThreadPoolExecutor implements AutoCloseable {
    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean isTerminated;
        if (this != ForkJoinPool.commonPool() && !(isTerminated = isTerminated())) {
            shutdown();
            boolean z10 = false;
            while (!isTerminated) {
                try {
                    isTerminated = awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z10) {
                        shutdownNow();
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void d(int i2) {
        setCorePoolSize(i2);
        setMaximumPoolSize(i2);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        c0 c0Var = new c0((e) runnable);
        execute(c0Var);
        return c0Var;
    }
}
