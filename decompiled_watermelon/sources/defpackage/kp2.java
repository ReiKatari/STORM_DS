package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kp2  reason: default package */
/* loaded from: classes.dex */
public abstract class kp2 {
    public static final /* synthetic */ int a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object kc5Var;
        try {
            kc5Var = new ip2(b(Looper.getMainLooper()));
        } catch (Throwable th) {
            kc5Var = new kc5(th);
        }
        if (kc5Var instanceof kc5) {
            kc5Var = null;
        }
        ip2 ip2Var = (ip2) kc5Var;
    }

    public static final void a(ih0 ih0Var) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            choreographer2.getClass();
            choreographer = choreographer2;
        }
        choreographer2.postFrameCallback(new jp2(ih0Var));
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

    public static final Object c(l7 l7Var) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            ih0 ih0Var = new ih0(1, nk2.J(l7Var));
            ih0Var.x();
            choreographer2.postFrameCallback(new jp2(ih0Var));
            Object v = ih0Var.v();
            p31 p31Var = p31.COROUTINE_SUSPENDED;
            return v;
        }
        ih0 ih0Var2 = new ih0(1, nk2.J(l7Var));
        ih0Var2.x();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a(ih0Var2);
        } else {
            bb1 bb1Var = tg1.a;
            bt3.a.j0(ih0Var2.X, new es4(12, ih0Var2));
        }
        Object v2 = ih0Var2.v();
        p31 p31Var2 = p31.COROUTINE_SUSPENDED;
        return v2;
    }
}
