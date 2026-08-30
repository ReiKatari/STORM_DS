package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v0 implements a1 {

    /* renamed from: a  reason: collision with root package name */
    public final Application f1492a;

    /* renamed from: b  reason: collision with root package name */
    public final z0 f1493b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f1494c;

    /* renamed from: d  reason: collision with root package name */
    public final r f1495d;

    /* renamed from: e  reason: collision with root package name */
    public final q7.d f1496e;

    public v0(Application application, q7.f fVar, Bundle bundle) {
        z0 z0Var;
        this.f1496e = fVar.getSavedStateRegistry();
        this.f1495d = fVar.getLifecycle();
        this.f1494c = bundle;
        this.f1492a = application;
        if (application != null) {
            if (z0.f1511c == null) {
                z0.f1511c = new z0(application);
            }
            z0Var = z0.f1511c;
            z0Var.getClass();
        } else {
            z0Var = new z0(null);
        }
        this.f1493b = z0Var;
    }

    @Override // androidx.lifecycle.a1
    public final y0 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        a0.j.h("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // androidx.lifecycle.a1
    public final y0 b(Class cls, w6.d dVar) {
        Constructor a10;
        LinkedHashMap linkedHashMap = dVar.f14161a;
        String str = (String) linkedHashMap.get(c1.f1454b);
        if (str != null) {
            if (linkedHashMap.get(s0.f1482a) != null && linkedHashMap.get(s0.f1483b) != null) {
                Application application = (Application) linkedHashMap.get(z0.f1512d);
                boolean isAssignableFrom = a.class.isAssignableFrom(cls);
                if (isAssignableFrom && application != null) {
                    a10 = w0.a(cls, w0.f1497a);
                } else {
                    a10 = w0.a(cls, w0.f1498b);
                }
                if (a10 == null) {
                    return this.f1493b.b(cls, dVar);
                }
                if (isAssignableFrom && application != null) {
                    return w0.b(cls, a10, application, s0.b(dVar));
                }
                return w0.b(cls, a10, s0.b(dVar));
            } else if (this.f1495d != null) {
                return d(str, cls);
            } else {
                a0.j.p("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
                return null;
            }
        }
        a0.j.p("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        return null;
    }

    @Override // androidx.lifecycle.a1
    public final y0 c(nc.e eVar, w6.d dVar) {
        Class cls = eVar.f10259a;
        cls.getClass();
        return b(cls, dVar);
    }

    /* JADX WARN: Type inference failed for: r11v14, types: [androidx.lifecycle.b1, java.lang.Object] */
    public final y0 d(String str, Class cls) {
        Constructor a10;
        p0 p0Var;
        y0 b10;
        r rVar = this.f1495d;
        if (rVar != null) {
            boolean isAssignableFrom = a.class.isAssignableFrom(cls);
            Application application = this.f1492a;
            if (isAssignableFrom && application != null) {
                a10 = w0.a(cls, w0.f1497a);
            } else {
                a10 = w0.a(cls, w0.f1498b);
            }
            if (a10 == null) {
                if (application != null) {
                    return this.f1493b.a(cls);
                }
                if (b1.f1447a == null) {
                    b1.f1447a = new Object();
                }
                b1.f1447a.getClass();
                return zb.k.p(cls);
            }
            q7.d dVar = this.f1496e;
            dVar.getClass();
            Bundle a11 = dVar.a(str);
            if (a11 == null) {
                a11 = this.f1494c;
            }
            if (a11 == null) {
                p0Var = new p0();
            } else {
                ClassLoader classLoader = p0.class.getClassLoader();
                classLoader.getClass();
                a11.setClassLoader(classLoader);
                ac.e eVar = new ac.e(a11.size());
                for (String str2 : a11.keySet()) {
                    str2.getClass();
                    eVar.put(str2, a11.get(str2));
                }
                p0Var = new p0(eVar.b());
            }
            q0 q0Var = new q0(str, p0Var);
            q0Var.i(rVar, dVar);
            q b11 = rVar.b();
            if (b11 != q.INITIALIZED && !b11.isAtLeast(q.STARTED)) {
                rVar.a(new h(rVar, dVar));
            } else {
                dVar.d();
            }
            if (isAssignableFrom && application != null) {
                b10 = w0.b(cls, a10, application, p0Var);
            } else {
                b10 = w0.b(cls, a10, p0Var);
            }
            b10.a("androidx.lifecycle.savedstate.vm.tag", q0Var);
            return b10;
        }
        m9.o.v("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    public v0() {
        this.f1493b = new z0(null);
    }
}
