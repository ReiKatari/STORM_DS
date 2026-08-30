package b5;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l implements ta.a {
    public final WeakReference A;
    public final k B = new k(this);

    public l(i iVar) {
        this.A = new WeakReference(iVar);
    }

    @Override // ta.a
    public final void a(Runnable runnable, Executor executor) {
        this.B.a(runnable, executor);
    }

    public final boolean b(Throwable th2) {
        return this.B.i(th2);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        i iVar = (i) this.A.get();
        boolean cancel = this.B.cancel(z10);
        if (cancel && iVar != null) {
            iVar.f2051a = null;
            iVar.f2052b = null;
            iVar.f2053c.j(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.B.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.B.A instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.B.isDone();
    }

    public final String toString() {
        return this.B.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        return this.B.get(j2, timeUnit);
    }
}
