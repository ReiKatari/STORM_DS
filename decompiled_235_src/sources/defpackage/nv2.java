package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nv2  reason: default package */
/* loaded from: classes.dex */
public final class nv2 implements RunnableScheduledFuture {
    public final AtomicReference A = new AtomicReference(null);
    public final long B;
    public final Callable L;
    public final tb0 R;

    public nv2(Handler handler, long j, Callable callable) {
        this.B = j;
        this.L = callable;
        this.R = ak7.W(new bt(24, this, handler, callable, false));
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.R.cancel(z);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.R.B.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.B - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.R.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.R.B.isDone();
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
        return false;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        qb0 qb0Var = (qb0) this.A.getAndSet(null);
        if (qb0Var != null) {
            try {
                qb0Var.a(this.L.call());
            } catch (Exception e) {
                qb0Var.c(e);
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.R.B.get(j, timeUnit);
    }
}
