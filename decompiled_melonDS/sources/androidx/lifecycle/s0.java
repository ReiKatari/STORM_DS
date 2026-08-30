package androidx.lifecycle;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import me.magnum.melonds.R;
import zc.m1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: a  reason: collision with root package name */
    public static final x8.e f1482a = new x8.e(5);

    /* renamed from: b  reason: collision with root package name */
    public static final na.f f1483b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final x8.e f1484c = new x8.e(6);

    /* renamed from: d  reason: collision with root package name */
    public static final y6.c f1485d = new Object();

    public static final void a(y0 y0Var, q7.d dVar, r rVar) {
        dVar.getClass();
        rVar.getClass();
        q0 q0Var = (q0) y0Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (q0Var != null && !q0Var.L) {
            q0Var.i(rVar, dVar);
            q b10 = rVar.b();
            if (b10 != q.INITIALIZED && !b10.isAtLeast(q.STARTED)) {
                rVar.a(new h(rVar, dVar));
            } else {
                dVar.d();
            }
        }
    }

    public static final p0 b(w6.c cVar) {
        t0 t0Var;
        p0 p0Var;
        cVar.getClass();
        q7.f fVar = (q7.f) cVar.a(f1482a);
        if (fVar != null) {
            e1 e1Var = (e1) cVar.a(f1483b);
            if (e1Var != null) {
                Bundle bundle = (Bundle) cVar.a(f1484c);
                String str = (String) cVar.a(c1.f1454b);
                if (str != null) {
                    q7.c b10 = fVar.getSavedStateRegistry().b();
                    Bundle bundle2 = null;
                    if (b10 instanceof t0) {
                        t0Var = (t0) b10;
                    } else {
                        t0Var = null;
                    }
                    if (t0Var != null) {
                        LinkedHashMap linkedHashMap = g(e1Var).f1491b;
                        p0 p0Var2 = (p0) linkedHashMap.get(str);
                        if (p0Var2 == null) {
                            t0Var.b();
                            Bundle bundle3 = t0Var.f1488c;
                            if (bundle3 != null && bundle3.containsKey(str)) {
                                Bundle bundle4 = bundle3.getBundle(str);
                                if (bundle4 == null) {
                                    bundle4 = zb.k.b((yb.j[]) Arrays.copyOf(new yb.j[0], 0));
                                }
                                bundle3.remove(str);
                                if (bundle3.isEmpty()) {
                                    t0Var.f1488c = null;
                                }
                                bundle2 = bundle4;
                            }
                            if (bundle2 != null) {
                                bundle = bundle2;
                            }
                            if (bundle == null) {
                                p0Var = new p0();
                            } else {
                                ClassLoader classLoader = p0.class.getClassLoader();
                                classLoader.getClass();
                                bundle.setClassLoader(classLoader);
                                ac.e eVar = new ac.e(bundle.size());
                                for (String str2 : bundle.keySet()) {
                                    str2.getClass();
                                    eVar.put(str2, bundle.get(str2));
                                }
                                p0Var = new p0(eVar.b());
                            }
                            linkedHashMap.put(str, p0Var);
                            return p0Var;
                        }
                        return p0Var2;
                    }
                    a0.j.p("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                    return null;
                }
                a0.j.h("CreationExtras must have a value by `VIEW_MODEL_KEY`");
                return null;
            }
            a0.j.h("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        a0.j.h("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        return null;
    }

    public static final void c(q7.f fVar) {
        q b10 = fVar.getLifecycle().b();
        if (b10 != q.INITIALIZED && b10 != q.CREATED) {
            a0.j.h("Failed requirement.");
        } else if (fVar.getSavedStateRegistry().b() == null) {
            t0 t0Var = new t0(fVar.getSavedStateRegistry(), (e1) fVar);
            fVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", t0Var);
            fVar.getLifecycle().a(new e(1, t0Var));
        }
    }

    public static final x d(View view) {
        x xVar;
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            if (tag instanceof x) {
                xVar = (x) tag;
            } else {
                xVar = null;
            }
            if (xVar != null) {
                return xVar;
            }
            ViewParent D = a.a.D(view);
            if (D instanceof View) {
                view = (View) D;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static final e1 e(View view) {
        e1 e1Var;
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            if (tag instanceof e1) {
                e1Var = (e1) tag;
            } else {
                e1Var = null;
            }
            if (e1Var != null) {
                return e1Var;
            }
            ViewParent D = a.a.D(view);
            if (D instanceof View) {
                view = (View) D;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static final s f(x xVar) {
        xVar.getClass();
        r lifecycle = xVar.getLifecycle();
        lifecycle.getClass();
        c1 c1Var = lifecycle.f1481a;
        while (true) {
            s sVar = (s) ((AtomicReference) c1Var.f1455a).get();
            if (sVar != null) {
                return sVar;
            }
            m1 c4 = zc.x.c();
            gd.f fVar = zc.g0.f15015a;
            s sVar2 = new s(lifecycle, pc.a.G(c4, ed.n.f4465a.Y));
            AtomicReference atomicReference = (AtomicReference) c1Var.f1455a;
            while (!atomicReference.compareAndSet(null, sVar2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            gd.f fVar2 = zc.g0.f15015a;
            zc.x.v(sVar2, ed.n.f4465a.Y, null, new ah.u0(4, null, sVar2), 2);
            return sVar2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.a1, java.lang.Object] */
    public static final u0 g(e1 e1Var) {
        c1 j2 = x8.e.j(e1Var, new Object(), 4);
        return (u0) ((b9.e) j2.f1455a).B("androidx.lifecycle.internal.SavedStateHandlesVM", nc.u.a(u0.class));
    }

    public static final y6.a h(y0 y0Var) {
        y6.a aVar;
        ad.e eVar;
        y0Var.getClass();
        synchronized (f1485d) {
            aVar = (y6.a) y0Var.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (aVar == null) {
                cc.h hVar = cc.h.A;
                try {
                    gd.f fVar = zc.g0.f15015a;
                    eVar = ed.n.f4465a.Y;
                } catch (IllegalStateException | yb.i unused) {
                }
                y6.a aVar2 = new y6.a(eVar.H(zc.x.c()));
                y0Var.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aVar2);
                aVar = aVar2;
            }
        }
        return aVar;
    }

    public static final Object i(r rVar, q qVar, mc.p pVar, cc.c cVar) {
        Object g10;
        if (qVar != q.INITIALIZED) {
            if (rVar.b() != q.DESTROYED && (g10 = zc.x.g(new a9.d(rVar, qVar, pVar, (cc.c) null), cVar)) == dc.a.COROUTINE_SUSPENDED) {
                return g10;
            }
            return yb.y.f14813a;
        }
        a0.j.h("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        return null;
    }

    public static final Object j(x xVar, q qVar, mc.p pVar, ec.j jVar) {
        Object i2 = i(xVar.getLifecycle(), qVar, pVar, jVar);
        if (i2 == dc.a.COROUTINE_SUSPENDED) {
            return i2;
        }
        return yb.y.f14813a;
    }
}
