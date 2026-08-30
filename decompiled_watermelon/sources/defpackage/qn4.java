package defpackage;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qn4  reason: default package */
/* loaded from: classes.dex */
public final class qn4 extends ThreadPoolExecutor implements AutoCloseable {
    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean isTerminated;
        if (this != ForkJoinPool.commonPool() && !(isTerminated = isTerminated())) {
            shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void d(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        pn4 pn4Var = new pn4((x20) runnable);
        execute(pn4Var);
        return pn4Var;
    }
}
