package m0;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class k implements ta.a {
    public static final k L = new k(0, null);
    public final /* synthetic */ int A;
    public final Object B;

    public /* synthetic */ k(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    @Override // ta.a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e6) {
            aj.g.t("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e6);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        switch (this.A) {
            case 0:
                return this.B;
            default:
                throw new ExecutionException((Throwable) this.B);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        switch (this.A) {
            case 0:
                return super.toString() + "[status=SUCCESS, result=[" + this.B + "]]";
            default:
                return super.toString() + "[status=FAILURE, cause=[" + ((Throwable) this.B) + "]]";
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }
}
