package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pj2  reason: default package */
/* loaded from: classes.dex */
public class pj2 implements fq3 {
    public final fq3 A;
    public i90 B;

    public pj2() {
        this.A = ct3.k0(new t71(20, this));
    }

    @Override // defpackage.fq3
    public final void a(Runnable runnable, Executor executor) {
        this.A.a(runnable, executor);
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

    public pj2(fq3 fq3Var) {
        fq3Var.getClass();
        this.A = fq3Var;
    }
}
