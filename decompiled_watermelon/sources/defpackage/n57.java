package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n57  reason: default package */
/* loaded from: classes.dex */
public final class n57 {
    public final g11 a;
    public final Executor b;
    public final g06 c;
    public final ThreadLocal d;
    public final dr6 e;
    public final g11 f;

    public n57(g11 g11Var, Executor executor, g31 g31Var) {
        executor.getClass();
        this.a = g11Var;
        this.b = executor;
        new Handler(Looper.getMainLooper());
        this.c = new g06(executor);
        this.d = new ThreadLocal();
        dr6 dr6Var = new dr6(1, this);
        this.e = dr6Var;
        this.f = iq2.c(g11Var.B.C(hi2.c()).C(w81.n(dr6Var)));
    }
}
