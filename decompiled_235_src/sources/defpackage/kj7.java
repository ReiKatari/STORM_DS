package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kj7  reason: default package */
/* loaded from: classes.dex */
public final class kj7 {
    public final o41 a;
    public final Executor b;
    public final vb6 c;
    public final ThreadLocal d;
    public final s37 e;
    public final o41 f;

    public kj7(o41 o41Var, Executor executor, n61 n61Var) {
        executor.getClass();
        this.a = o41Var;
        this.b = executor;
        new Handler(Looper.getMainLooper());
        this.c = new vb6(executor);
        this.d = new ThreadLocal();
        s37 s37Var = new s37(this, 1);
        this.e = s37Var;
        this.f = g04.i(o41Var.B.N(oi2.c()).N(f04.F(s37Var)));
    }
}
