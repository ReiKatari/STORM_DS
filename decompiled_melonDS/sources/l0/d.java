package l0;

import android.os.Handler;
import android.os.SystemClock;
import b4.w0;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import m0.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends AbstractExecutorService implements ScheduledExecutorService, AutoCloseable {
    public final Handler A;

    static {
        new w0(2);
    }

    public d(Handler handler) {
        this.A = handler;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(d.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        if (this == ForkJoinPool.commonPool()) {
            return;
        }
        shutdown();
        throw null;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Handler handler = this.A;
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [m0.k, java.util.concurrent.ScheduledFuture] */
    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j2, TimeUnit timeUnit) {
        long convert = TimeUnit.MILLISECONDS.convert(j2, timeUnit) + SystemClock.uptimeMillis();
        Handler handler = this.A;
        c cVar = new c(handler, convert, callable);
        if (handler.postAtTime(cVar, convert)) {
            return cVar;
        }
        return new k(1, new RejectedExecutionException(handler + " is shutting down"));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j2, long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(d.class.getSimpleName().concat(" does not yet support fixed-rate scheduling."));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j2, long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(d.class.getSimpleName().concat(" does not yet support fixed-delay scheduling."));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException(d.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException(d.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
        return schedule(new b(runnable), j2, timeUnit);
    }
}
