package l0;

import a4.n;
import android.os.Handler;
import b5.i;
import b5.l;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements RunnableScheduledFuture {
    public final AtomicReference A = new AtomicReference(null);
    public final long B;
    public final Callable L;
    public final l R;

    public c(Handler handler, long j2, Callable callable) {
        this.B = j2;
        this.L = callable;
        this.R = a.a.A(new n(this, handler, callable));
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.R.cancel(z10);
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
        i iVar = (i) this.A.getAndSet(null);
        if (iVar != null) {
            try {
                iVar.b(this.L.call());
            } catch (Exception e6) {
                iVar.c(e6);
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        return this.R.B.get(j2, timeUnit);
    }
}
