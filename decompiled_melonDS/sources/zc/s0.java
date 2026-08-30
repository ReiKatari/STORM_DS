package zc;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s0 extends r0 implements a0 {
    public final Executor L;

    public s0(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.L = executor;
        Method method2 = ed.a.f4444a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null && (method = ed.a.f4444a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // zc.a0
    public final i0 J(long j2, Runnable runnable, cc.g gVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.L;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j2, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e6) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e6);
                x.e(gVar, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            return new h0(scheduledFuture);
        }
        return y.f15041d0.J(j2, runnable, gVar);
    }

    @Override // zc.q
    public final void X(cc.g gVar, Runnable runnable) {
        try {
            this.L.execute(runnable);
        } catch (RejectedExecutionException e6) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e6);
            x.e(gVar, cancellationException);
            gd.f fVar = g0.f15015a;
            gd.e.L.X(gVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.L;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof s0) && ((s0) obj).L == this.L) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.L);
    }

    @Override // zc.q
    public final String toString() {
        return this.L.toString();
    }

    @Override // zc.a0
    public final void v(long j2, h hVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.L;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            m0.h hVar2 = new m0.h(13, this, hVar);
            cc.g gVar = hVar.X;
            try {
                scheduledFuture = scheduledExecutorService.schedule(hVar2, j2, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e6) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e6);
                x.e(gVar, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            hVar.y(new e(0, scheduledFuture));
        } else {
            y.f15041d0.v(j2, hVar);
        }
    }
}
