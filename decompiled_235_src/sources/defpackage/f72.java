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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f72  reason: default package */
/* loaded from: classes.dex */
public final class f72 extends e72 implements ug1 {
    public final Executor L;

    public f72(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.L = executor;
        Method method2 = ty0.a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null && (method = ty0.a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.ug1
    public final il1 A(long j, Runnable runnable, l61 l61Var) {
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
                yh2.m(l61Var, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            return new hl1(scheduledFuture);
        }
        return sd1.h0.A(j, runnable, l61Var);
    }

    @Override // defpackage.ug1
    public final void J(long j, rj0 rj0Var) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.L;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            uo2 uo2Var = new uo2(14, this, rj0Var);
            l61 l61Var = rj0Var.X;
            try {
                scheduledFuture = scheduledExecutorService.schedule(uo2Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                yh2.m(l61Var, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            rj0Var.A(new kj0(scheduledFuture, 0));
        } else {
            sd1.h0.J(j, rj0Var);
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
        if ((obj instanceof f72) && ((f72) obj).L == this.L) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.L);
    }

    @Override // defpackage.n61
    public final void j0(l61 l61Var, Runnable runnable) {
        try {
            this.L.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            yh2.m(l61Var, cancellationException);
            xe1 xe1Var = xk1.a;
            de1.L.j0(l61Var, runnable);
        }
    }

    @Override // defpackage.n61
    public final String toString() {
        return this.L.toString();
    }
}
