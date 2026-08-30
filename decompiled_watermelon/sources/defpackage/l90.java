package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l90  reason: default package */
/* loaded from: classes.dex */
public final class l90 implements fq3 {
    public final WeakReference A;
    public final k90 B = new k90(this);

    public l90(i90 i90Var) {
        this.A = new WeakReference(i90Var);
    }

    @Override // defpackage.fq3
    public final void a(Runnable runnable, Executor executor) {
        this.B.a(runnable, executor);
    }

    public final boolean b(Throwable th) {
        return this.B.i(th);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        i90 i90Var = (i90) this.A.get();
        boolean cancel = this.B.cancel(z);
        if (cancel && i90Var != null) {
            i90Var.a = null;
            i90Var.b = null;
            i90Var.c.j(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.B.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.B.A instanceof j1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.B.isDone();
    }

    public final String toString() {
        return this.B.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.B.get(j, timeUnit);
    }
}
