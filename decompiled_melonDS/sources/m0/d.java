package m0;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import l.i0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class d implements ta.a {
    public final ta.a A;
    public b5.i B;

    public d() {
        this.A = a.a.A(new i0(3, this));
    }

    public static d b(ta.a aVar) {
        if (aVar instanceof d) {
            return (d) aVar;
        }
        return new d(aVar);
    }

    @Override // ta.a
    public final void a(Runnable runnable, Executor executor) {
        this.A.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.A.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.A.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.A.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.A.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j2, TimeUnit timeUnit) {
        return this.A.get(j2, timeUnit);
    }

    public d(ta.a aVar) {
        aVar.getClass();
        this.A = aVar;
    }
}
