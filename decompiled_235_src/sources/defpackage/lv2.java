package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lv2  reason: default package */
/* loaded from: classes.dex */
public abstract class lv2 {
    public static final /* synthetic */ int a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object em5Var;
        try {
            em5Var = new jv2(b(Looper.getMainLooper()));
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        if (em5Var instanceof em5) {
            em5Var = null;
        }
        jv2 jv2Var = (jv2) em5Var;
    }

    public static final void a(rj0 rj0Var) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            choreographer2.getClass();
            choreographer = choreographer2;
        }
        choreographer2.postFrameCallback(new kv2(rj0Var));
    }

    public static final Handler b(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            invoke.getClass();
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    public static final Object c(m7 m7Var) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            rj0 rj0Var = new rj0(1, np2.V(m7Var));
            rj0Var.v();
            choreographer2.postFrameCallback(new kv2(rj0Var));
            Object s = rj0Var.s();
            x61 x61Var = x61.COROUTINE_SUSPENDED;
            return s;
        }
        rj0 rj0Var2 = new rj0(1, np2.V(m7Var));
        rj0Var2.v();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a(rj0Var2);
        } else {
            xe1 xe1Var = xk1.a;
            e04.a.j0(rj0Var2.X, new g15(rj0Var2, 12));
        }
        Object s2 = rj0Var2.s();
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        return s2;
    }
}
