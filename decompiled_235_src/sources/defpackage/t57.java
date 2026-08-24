package defpackage;

import android.os.Handler;
import android.util.Log;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t57  reason: default package */
/* loaded from: classes.dex */
public final class t57 {
    public final w61 a;
    public final w61 b;
    public final Executor c;
    public final n61 d;
    public final Executor e;
    public final n61 f;
    public final Executor g;
    public final n61 h;
    public final ex6 i;
    public final ex6 j;

    public t57(w61 w61Var, w61 w61Var2, Executor executor, n61 n61Var, Executor executor2, n61 n61Var2, Executor executor3, n61 n61Var3, on2 on2Var, j57 j57Var) {
        w61Var.getClass();
        w61Var2.getClass();
        this.a = w61Var;
        this.b = w61Var2;
        this.c = executor;
        this.d = n61Var;
        this.e = executor2;
        this.f = n61Var2;
        this.g = executor3;
        this.h = n61Var3;
        this.i = new ex6(new x7(20, on2Var));
        this.j = new ex6(new t46(j57Var, 17));
    }

    public final Handler a() {
        return (Handler) this.i.getValue();
    }

    public final Object b(long j, qn2 qn2Var) {
        try {
            return hv.V(this.d, new wk0(4, j, null, this, qn2Var));
        } catch (InterruptedException e) {
            Log.i("CXCP", "runBlockingCheckedOrNull cancelled by thread interruption", e);
            return null;
        }
    }
}
