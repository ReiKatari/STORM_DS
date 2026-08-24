package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n33  reason: default package */
/* loaded from: classes.dex */
public class n33 implements gx3 {
    public static final n33 L = new n33(null, 0);
    public final /* synthetic */ int A;
    public final Object B;

    public /* synthetic */ n33(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override // defpackage.gx3
    public final void a(Executor executor, Runnable runnable) {
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            kj2.w("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
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
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                return super.toString() + "[status=SUCCESS, result=[" + obj + "]]";
            default:
                return super.toString() + "[status=FAILURE, cause=[" + ((Throwable) obj) + "]]";
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }
}
