package androidx.work;

import android.content.Context;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends mq3 {
    public final WorkerParameters e;
    public final t31 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.e = workerParameters;
        this.f = t31.L;
    }

    @Override // defpackage.mq3
    public final l90 a() {
        e63 h = ln2.h();
        t31 t31Var = this.f;
        t31Var.getClass();
        return oo2.O(se.O(t31Var, h), new u31(this, null, 0));
    }

    @Override // defpackage.mq3
    public final l90 d() {
        t31 t31Var = t31.L;
        e31 e31Var = this.f;
        if (b53.x(e31Var, t31Var)) {
            e31Var = this.e.d;
        }
        e31Var.getClass();
        return oo2.O(e31Var.C(ln2.h()), new u31(this, null, 1));
    }

    public abstract Object e(j11 j11Var);

    public Object f() {
        throw new IllegalStateException("Not implemented");
    }
}
