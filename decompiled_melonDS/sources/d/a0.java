package d;

import android.window.OnBackInvokedDispatcher;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f3285a;

    /* renamed from: b  reason: collision with root package name */
    public final yb.n f3286b = new yb.n(new a2.n(5, this));

    public a0(Runnable runnable) {
        this.f3285a = runnable;
    }

    public final void a(androidx.lifecycle.x xVar, w wVar) {
        wVar.getClass();
        androidx.lifecycle.r lifecycle = xVar.getLifecycle();
        if (lifecycle.b() == androidx.lifecycle.q.DESTROYED) {
            return;
        }
        v vVar = new v(wVar, new x(xVar, wVar));
        wVar.f3313a.add(vVar);
        vVar.g(false);
        b9.e.b(c().f3318c, vVar);
        z zVar = new z(vVar, this, lifecycle);
        lifecycle.a(zVar);
        wVar.f3315c.add(zVar);
    }

    public final void b(w wVar) {
        wVar.getClass();
        v vVar = new v(wVar, new x(null, wVar));
        wVar.f3313a.add(vVar);
        b9.e.b(c().f3318c, vVar);
    }

    public final y c() {
        return (y) this.f3286b.getValue();
    }

    public final void d(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        c().f3318c.e(new f7.j(onBackInvokedDispatcher, 0), 1);
        c().f3318c.e(new f7.j(onBackInvokedDispatcher, 1000000), 0);
    }
}
