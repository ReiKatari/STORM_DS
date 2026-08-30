package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xc0  reason: default package */
/* loaded from: classes.dex */
public final class xc0 implements Executor, ScheduledExecutorService, AutoCloseable {
    public static final wc0 L = new wc0(0);
    public final Object A = new Object();
    public ScheduledThreadPoolExecutor B;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.concurrent.RejectedExecutionHandler, java.lang.Object] */
    public xc0() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, L);
        scheduledThreadPoolExecutor.setKeepAliveTime(0L, TimeUnit.MILLISECONDS);
        scheduledThreadPoolExecutor.setRejectedExecutionHandler(new Object());
        this.B = scheduledThreadPoolExecutor;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        boolean awaitTermination;
        synchronized (this.A) {
            awaitTermination = this.B.awaitTermination(j, timeUnit);
        }
        return awaitTermination;
    }

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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.concurrent.RejectedExecutionHandler, java.lang.Object] */
    public final void d(zc0 zc0Var) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        zc0Var.getClass();
        synchronized (this.A) {
            try {
                if (this.B.isShutdown()) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, L);
                    scheduledThreadPoolExecutor2.setKeepAliveTime(0L, TimeUnit.MILLISECONDS);
                    scheduledThreadPoolExecutor2.setRejectedExecutionHandler(new Object());
                    this.B = scheduledThreadPoolExecutor2;
                }
                scheduledThreadPoolExecutor = this.B;
            } catch (Throwable th) {
                throw th;
            }
        }
        scheduledThreadPoolExecutor.setCorePoolSize(Math.max(1, zc0Var.e().size()));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.A) {
            this.B.execute(runnable);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        List invokeAll;
        synchronized (this.A) {
            invokeAll = this.B.invokeAll(collection);
        }
        return invokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        Object invokeAny;
        synchronized (this.A) {
            invokeAny = this.B.invokeAny(collection);
        }
        return invokeAny;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        boolean isShutdown;
        synchronized (this.A) {
            isShutdown = this.B.isShutdown();
        }
        return isShutdown;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        boolean isTerminated;
        synchronized (this.A) {
            isTerminated = this.B.isTerminated();
        }
        return isTerminated;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledFuture<?> schedule;
        synchronized (this.A) {
            schedule = this.B.schedule(runnable, j, timeUnit);
        }
        return schedule;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ScheduledFuture<?> scheduleAtFixedRate;
        synchronized (this.A) {
            scheduleAtFixedRate = this.B.scheduleAtFixedRate(runnable, j, j2, timeUnit);
        }
        return scheduleAtFixedRate;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ScheduledFuture<?> scheduleWithFixedDelay;
        synchronized (this.A) {
            scheduleWithFixedDelay = this.B.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
        }
        return scheduleWithFixedDelay;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        synchronized (this.A) {
            this.B.shutdown();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        List<Runnable> shutdownNow;
        synchronized (this.A) {
            shutdownNow = this.B.shutdownNow();
        }
        return shutdownNow;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        Future submit;
        synchronized (this.A) {
            submit = this.B.submit(callable);
        }
        return submit;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        List invokeAll;
        synchronized (this.A) {
            invokeAll = this.B.invokeAll(collection, j, timeUnit);
        }
        return invokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        Object invokeAny;
        synchronized (this.A) {
            invokeAny = this.B.invokeAny(collection, j, timeUnit);
        }
        return invokeAny;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        ScheduledFuture schedule;
        synchronized (this.A) {
            schedule = this.B.schedule(callable, j, timeUnit);
        }
        return schedule;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        Future submit;
        synchronized (this.A) {
            submit = this.B.submit(runnable, obj);
        }
        return submit;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        Future<?> submit;
        synchronized (this.A) {
            submit = this.B.submit(runnable);
        }
        return submit;
    }
}
