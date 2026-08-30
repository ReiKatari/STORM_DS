package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jx2  reason: default package */
/* loaded from: classes.dex */
public class jx2 implements fq3 {
    public static final jx2 L = new jx2(0, null);
    public final /* synthetic */ int A;
    public final Object B;

    public /* synthetic */ jx2(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    @Override // defpackage.fq3
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            ve2.x("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
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
