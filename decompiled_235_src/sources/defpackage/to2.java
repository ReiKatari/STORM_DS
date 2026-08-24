package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: to2  reason: default package */
/* loaded from: classes.dex */
public class to2 implements gx3 {
    public final gx3 A;
    public qb0 B;

    public to2() {
        this.A = ak7.W(new d51(this, 22));
    }

    @Override // defpackage.gx3
    public final void a(Executor executor, Runnable runnable) {
        this.A.a(executor, runnable);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.A.cancel(z);
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
    public Object get(long j, TimeUnit timeUnit) {
        return this.A.get(j, timeUnit);
    }

    public to2(gx3 gx3Var) {
        gx3Var.getClass();
        this.A = gx3Var;
    }
}
