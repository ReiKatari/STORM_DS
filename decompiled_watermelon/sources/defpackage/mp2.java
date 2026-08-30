package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mp2  reason: default package */
/* loaded from: classes.dex */
public final class mp2 implements RunnableScheduledFuture {
    public final AtomicReference A = new AtomicReference(null);
    public final long B;
    public final Callable L;
    public final l90 R;

    public mp2(Handler handler, long j, Callable callable) {
        this.B = j;
        this.L = callable;
        this.R = ct3.k0(new os(this, handler, callable));
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
        i90 i90Var = (i90) this.A.getAndSet(null);
        if (i90Var != null) {
            try {
                i90Var.a(this.L.call());
            } catch (Exception e) {
                i90Var.c(e);
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.R.B.get(j, timeUnit);
    }
}
