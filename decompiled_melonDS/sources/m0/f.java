package m0;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements b5.j {
    public final /* synthetic */ ta.a A;
    public final /* synthetic */ ScheduledExecutorService B;
    public final /* synthetic */ long L;

    public /* synthetic */ f(ta.a aVar, ScheduledExecutorService scheduledExecutorService, long j2) {
        this.A = aVar;
        this.B = scheduledExecutorService;
        this.L = j2;
    }

    @Override // b5.j
    public final Object h(final b5.i iVar) {
        final ta.a aVar = this.A;
        i.e(aVar, iVar);
        if (!aVar.isDone()) {
            final long j2 = this.L;
            aVar.a(new a8.f(21, this.B.schedule(new Callable() { // from class: m0.g
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(b5.i.this.c(new TimeoutException("Future[" + aVar + "] is not done within " + j2 + " ms.")));
                }
            }, j2, TimeUnit.MILLISECONDS)), ij.a.D());
        }
        return "TimeoutFuture[" + aVar + "]";
    }
}
