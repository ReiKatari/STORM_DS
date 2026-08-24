package androidx.work;

import android.content.Context;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends nx3 {
    public final WorkerParameters e;
    public final b71 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.e = workerParameters;
        this.f = b71.L;
    }

    @Override // defpackage.nx3
    public final tb0 a() {
        tc3 c = yh2.c();
        b71 b71Var = this.f;
        b71Var.getClass();
        return yh2.B(jw2.y(b71Var, c), new c71(this, null, 0));
    }

    @Override // defpackage.nx3
    public final tb0 d() {
        b71 b71Var = b71.L;
        l61 l61Var = this.f;
        if (nb3.k(l61Var, b71Var)) {
            l61Var = this.e.d;
        }
        l61Var.getClass();
        return yh2.B(l61Var.N(yh2.c()), new c71(this, null, 1));
    }

    public abstract Object e(r41 r41Var);

    public Object f() {
        throw new IllegalStateException("Not implemented");
    }
}
