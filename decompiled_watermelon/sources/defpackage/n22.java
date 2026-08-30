package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n22  reason: default package */
/* loaded from: classes.dex */
public final class n22 extends m22 implements sc1 {
    public final Executor L;

    public n22(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.L = executor;
        Method method2 = xv0.a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null && (method = xv0.a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.sc1
    public final eh1 Q(long j, Runnable runnable, e31 e31Var) {
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
                scheduledFuture = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                ln2.t(e31Var, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            return new dh1(scheduledFuture);
        }
        return w91.g0.Q(j, runnable, e31Var);
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
        if ((obj instanceof n22) && ((n22) obj).L == this.L) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.L);
    }

    @Override // defpackage.g31
    public final void j0(e31 e31Var, Runnable runnable) {
        try {
            this.L.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            ln2.t(e31Var, cancellationException);
            bb1 bb1Var = tg1.a;
            ha1.L.j0(e31Var, runnable);
        }
    }

    @Override // defpackage.g31
    public final String toString() {
        return this.L.toString();
    }

    @Override // defpackage.sc1
    public final void w(long j, ih0 ih0Var) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.L;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            qj2 qj2Var = new qj2(11, this, ih0Var);
            e31 e31Var = ih0Var.X;
            try {
                scheduledFuture = scheduledExecutorService.schedule(qj2Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                ln2.t(e31Var, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            ih0Var.A(new bh0(0, scheduledFuture));
        } else {
            w91.g0.w(j, ih0Var);
        }
    }
}
