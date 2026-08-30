package ad;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import ed.n;
import yb.k;
import zc.g0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f705a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object kVar;
        try {
            kVar = new e(b(Looper.getMainLooper()));
        } catch (Throwable th2) {
            kVar = new k(th2);
        }
        if (kVar instanceof k) {
            kVar = null;
        }
        e eVar = (e) kVar;
    }

    public static final void a(zc.h hVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            choreographer2.getClass();
            choreographer = choreographer2;
        }
        choreographer2.postFrameCallback(new f(hVar));
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

    public static final Object c(ai.g gVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            zc.h hVar = new zc.h(1, pc.a.A(gVar));
            hVar.v();
            choreographer2.postFrameCallback(new f(hVar));
            Object u4 = hVar.u();
            dc.a aVar = dc.a.COROUTINE_SUSPENDED;
            return u4;
        }
        zc.h hVar2 = new zc.h(1, pc.a.A(gVar));
        hVar2.v();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a(hVar2);
        } else {
            gd.f fVar = g0.f15015a;
            n.f4465a.X(hVar2.X, new g(0, hVar2));
        }
        Object u10 = hVar2.u();
        dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
        return u10;
    }
}
