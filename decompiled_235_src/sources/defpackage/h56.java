package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h56  reason: default package */
/* loaded from: classes.dex */
public final class h56 implements yo7 {
    public final Application a;
    public final wo7 b;
    public final Bundle c;
    public final ut3 d;
    public final d56 e;

    public h56(Application application, g56 g56Var, Bundle bundle) {
        wo7 wo7Var;
        this.e = g56Var.getSavedStateRegistry();
        this.d = g56Var.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (wo7.c == null) {
                wo7.c = new wo7(application);
            }
            wo7Var = wo7.c;
            wo7Var.getClass();
        } else {
            wo7Var = new wo7(null);
        }
        this.b = wo7Var;
    }

    @Override // defpackage.yo7
    public final qo7 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        i.h("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.yo7
    public final qo7 b(Class cls, m94 m94Var) {
        Constructor a;
        th7 th7Var = os0.X;
        LinkedHashMap linkedHashMap = m94Var.a;
        String str = (String) linkedHashMap.get(th7Var);
        if (str != null) {
            if (linkedHashMap.get(y46.a) != null && linkedHashMap.get(y46.b) != null) {
                Application application = (Application) linkedHashMap.get(wo7.d);
                boolean isAssignableFrom = ym.class.isAssignableFrom(cls);
                if (isAssignableFrom && application != null) {
                    a = i56.a(cls, i56.a);
                } else {
                    a = i56.a(cls, i56.b);
                }
                if (a == null) {
                    return this.b.b(cls, m94Var);
                }
                if (isAssignableFrom && application != null) {
                    return i56.b(cls, a, application, y46.a(m94Var));
                }
                return i56.b(cls, a, y46.a(m94Var));
            } else if (this.d != null) {
                return d(cls, str);
            } else {
                i.m("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
                return null;
            }
        }
        i.m("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        return null;
    }

    @Override // defpackage.yo7
    public final qo7 c(ar0 ar0Var, m94 m94Var) {
        Class cls = ar0Var.a;
        cls.getClass();
        return b(cls, m94Var);
    }

    /* JADX WARN: Type inference failed for: r9v20, types: [zo7, java.lang.Object] */
    public final qo7 d(Class cls, String str) {
        Constructor a;
        v46 v46Var;
        qo7 b;
        ut3 ut3Var = this.d;
        if (ut3Var != null) {
            boolean isAssignableFrom = ym.class.isAssignableFrom(cls);
            Application application = this.a;
            if (isAssignableFrom && application != null) {
                a = i56.a(cls, i56.a);
            } else {
                a = i56.a(cls, i56.b);
            }
            if (a == null) {
                if (application != null) {
                    return this.b.a(cls);
                }
                if (zo7.a == null) {
                    zo7.a = new Object();
                }
                zo7.a.getClass();
                return nj2.k(cls);
            }
            d56 d56Var = this.e;
            d56Var.getClass();
            Bundle a2 = d56Var.a(str);
            if (a2 == null) {
                a2 = this.c;
            }
            if (a2 == null) {
                v46Var = new v46();
            } else {
                ClassLoader classLoader = v46.class.getClassLoader();
                classLoader.getClass();
                a2.setClassLoader(classLoader);
                p04 p04Var = new p04(a2.size());
                for (String str2 : a2.keySet()) {
                    str2.getClass();
                    p04Var.put(str2, a2.get(str2));
                }
                v46Var = new v46(p04Var.b());
            }
            w46 w46Var = new w46(str, v46Var);
            w46Var.e(ut3Var, d56Var);
            tt3 b2 = ut3Var.b();
            if (b2 != tt3.INITIALIZED && !b2.isAtLeast(tt3.STARTED)) {
                ut3Var.a(new se1(ut3Var, d56Var));
            } else {
                d56Var.d();
            }
            if (isAssignableFrom && application != null) {
                b = i56.b(cls, a, application, v46Var);
            } else {
                b = i56.b(cls, a, v46Var);
            }
            b.a("androidx.lifecycle.savedstate.vm.tag", w46Var);
            return b;
        }
        fa6.h("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    public h56() {
        this.b = new wo7(null);
    }
}
