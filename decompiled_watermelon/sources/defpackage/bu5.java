package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bu5  reason: default package */
/* loaded from: classes.dex */
public final class bu5 implements xa7 {
    public final Application a;
    public final wa7 b;
    public final Bundle c;
    public final rm3 d;
    public final xt5 e;

    public bu5(Application application, au5 au5Var, Bundle bundle) {
        wa7 wa7Var;
        this.e = au5Var.getSavedStateRegistry();
        this.d = au5Var.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (wa7.c == null) {
                wa7.c = new wa7(application);
            }
            wa7Var = wa7.c;
            wa7Var.getClass();
        } else {
            wa7Var = new wa7(null);
        }
        this.b = wa7Var;
    }

    @Override // defpackage.xa7
    public final ra7 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        i.i("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.xa7
    public final ra7 b(Class cls, g14 g14Var) {
        Constructor a;
        vn1 vn1Var = bq0.X;
        LinkedHashMap linkedHashMap = g14Var.a;
        String str = (String) linkedHashMap.get(vn1Var);
        if (str != null) {
            if (linkedHashMap.get(st5.a) != null && linkedHashMap.get(st5.b) != null) {
                Application application = (Application) linkedHashMap.get(wa7.d);
                boolean isAssignableFrom = mm.class.isAssignableFrom(cls);
                if (isAssignableFrom && application != null) {
                    a = cu5.a(cls, cu5.a);
                } else {
                    a = cu5.a(cls, cu5.b);
                }
                if (a == null) {
                    return this.b.b(cls, g14Var);
                }
                if (isAssignableFrom && application != null) {
                    return cu5.b(cls, a, application, st5.a(g14Var));
                }
                return cu5.b(cls, a, st5.a(g14Var));
            } else if (this.d != null) {
                return d(cls, str);
            } else {
                i.n("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
                return null;
            }
        }
        i.n("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        return null;
    }

    @Override // defpackage.xa7
    public final ra7 c(qo0 qo0Var, g14 g14Var) {
        Class cls = qo0Var.a;
        cls.getClass();
        return b(cls, g14Var);
    }

    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.Object, ya7] */
    public final ra7 d(Class cls, String str) {
        Constructor a;
        pt5 pt5Var;
        ra7 b;
        rm3 rm3Var = this.d;
        if (rm3Var != null) {
            boolean isAssignableFrom = mm.class.isAssignableFrom(cls);
            Application application = this.a;
            if (isAssignableFrom && application != null) {
                a = cu5.a(cls, cu5.a);
            } else {
                a = cu5.a(cls, cu5.b);
            }
            if (a == null) {
                if (application != null) {
                    return this.b.a(cls);
                }
                if (ya7.a == null) {
                    ya7.a = new Object();
                }
                ya7.a.getClass();
                return yf2.n(cls);
            }
            xt5 xt5Var = this.e;
            xt5Var.getClass();
            Bundle a2 = xt5Var.a(str);
            if (a2 == null) {
                a2 = this.c;
            }
            if (a2 == null) {
                pt5Var = new pt5();
            } else {
                ClassLoader classLoader = pt5.class.getClassLoader();
                classLoader.getClass();
                a2.setClassLoader(classLoader);
                mt3 mt3Var = new mt3(a2.size());
                for (String str2 : a2.keySet()) {
                    str2.getClass();
                    mt3Var.put(str2, a2.get(str2));
                }
                pt5Var = new pt5(mt3Var.b());
            }
            qt5 qt5Var = new qt5(str, pt5Var);
            qt5Var.i(rm3Var, xt5Var);
            qm3 b2 = rm3Var.b();
            if (b2 != qm3.INITIALIZED && !b2.isAtLeast(qm3.STARTED)) {
                rm3Var.a(new wa1(rm3Var, xt5Var));
            } else {
                xt5Var.d();
            }
            if (isAssignableFrom && application != null) {
                b = cu5.b(cls, a, application, pt5Var);
            } else {
                b = cu5.b(cls, a, pt5Var);
            }
            b.a("androidx.lifecycle.savedstate.vm.tag", qt5Var);
            return b;
        }
        vd6.i("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    public bu5() {
        this.b = new wa7(null);
    }
}
