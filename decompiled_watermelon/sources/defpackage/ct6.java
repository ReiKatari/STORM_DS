package defpackage;

import android.os.Handler;
import android.util.Log;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ct6  reason: default package */
/* loaded from: classes.dex */
public final class ct6 {
    public final o31 a;
    public final o31 b;
    public final Executor c;
    public final g31 d;
    public final Executor e;
    public final g31 f;
    public final Executor g;
    public final g31 h;
    public final il6 i;
    public final il6 j;

    public ct6(o31 o31Var, o31 o31Var2, Executor executor, g31 g31Var, Executor executor2, g31 g31Var2, Executor executor3, g31 g31Var3, ki2 ki2Var, ss6 ss6Var) {
        o31Var.getClass();
        o31Var2.getClass();
        this.a = o31Var;
        this.b = o31Var2;
        this.c = executor;
        this.d = g31Var;
        this.e = executor2;
        this.f = g31Var2;
        this.g = executor3;
        this.h = g31Var3;
        this.i = new il6(new w7(20, ki2Var));
        this.j = new il6(new t06(10, ss6Var));
    }

    public final Handler a() {
        return (Handler) this.i.getValue();
    }

    public final Object b(long j, mi2 mi2Var) {
        try {
            return tq5.A(this.d, new oi0(4, j, null, this, mi2Var));
        } catch (InterruptedException e) {
            Log.i("CXCP", "runBlockingCheckedOrNull cancelled by thread interruption", e);
            return null;
        }
    }
}
