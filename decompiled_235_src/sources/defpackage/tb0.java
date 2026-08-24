package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tb0  reason: default package */
/* loaded from: classes.dex */
public final class tb0 implements gx3 {
    public final WeakReference A;
    public final sb0 B = new sb0(this);

    public tb0(qb0 qb0Var) {
        this.A = new WeakReference(qb0Var);
    }

    @Override // defpackage.gx3
    public final void a(Executor executor, Runnable runnable) {
        this.B.a(executor, runnable);
    }

    public final boolean b(Throwable th) {
        return this.B.i(th);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        qb0 qb0Var = (qb0) this.A.get();
        boolean cancel = this.B.cancel(z);
        if (cancel && qb0Var != null) {
            qb0Var.a = null;
            qb0Var.b = null;
            qb0Var.c.j(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.B.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.B.A instanceof k1;
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
