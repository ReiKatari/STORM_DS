package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: st5  reason: default package */
/* loaded from: classes.dex */
public abstract class st5 {
    public static final vn1 a = new vn1(21);
    public static final jo1 b = new jo1(21);
    public static final so1 c = new so1(21);

    public static final pt5 a(z31 z31Var) {
        tt5 tt5Var;
        pt5 pt5Var;
        z31Var.getClass();
        au5 au5Var = (au5) z31Var.a(a);
        Bundle bundle = null;
        if (au5Var != null) {
            ab7 ab7Var = (ab7) z31Var.a(b);
            if (ab7Var != null) {
                Bundle bundle2 = (Bundle) z31Var.a(c);
                String str = (String) z31Var.a(bq0.X);
                if (str != null) {
                    wt5 b2 = au5Var.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider");
                    if (b2 instanceof tt5) {
                        tt5Var = (tt5) b2;
                    } else {
                        tt5Var = null;
                    }
                    if (tt5Var != null) {
                        LinkedHashMap linkedHashMap = c(ab7Var).b;
                        pt5 pt5Var2 = (pt5) linkedHashMap.get(str);
                        if (pt5Var2 == null) {
                            tt5Var.b();
                            Bundle bundle3 = tt5Var.c;
                            if (bundle3 != null && bundle3.containsKey(str)) {
                                Bundle bundle4 = bundle3.getBundle(str);
                                if (bundle4 == null) {
                                    bundle4 = dk7.k((ti4[]) Arrays.copyOf(new ti4[0], 0));
                                }
                                bundle3.remove(str);
                                if (bundle3.isEmpty()) {
                                    tt5Var.c = null;
                                }
                                bundle = bundle4;
                            }
                            if (bundle != null) {
                                bundle2 = bundle;
                            }
                            if (bundle2 == null) {
                                pt5Var = new pt5();
                            } else {
                                ClassLoader classLoader = pt5.class.getClassLoader();
                                classLoader.getClass();
                                bundle2.setClassLoader(classLoader);
                                mt3 mt3Var = new mt3(bundle2.size());
                                for (String str2 : bundle2.keySet()) {
                                    str2.getClass();
                                    mt3Var.put(str2, bundle2.get(str2));
                                }
                                pt5Var = new pt5(mt3Var.b());
                            }
                            linkedHashMap.put(str, pt5Var);
                            return pt5Var;
                        }
                        return pt5Var2;
                    }
                    i.n("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                    return null;
                }
                i.i("CreationExtras must have a value by `VIEW_MODEL_KEY`");
                return null;
            }
            i.i("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        i.i("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        return null;
    }

    public static final void b(au5 au5Var) {
        qm3 b2 = au5Var.getLifecycle().b();
        if (b2 != qm3.INITIALIZED && b2 != qm3.CREATED) {
            i.i("Failed requirement.");
        } else if (au5Var.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            tt5 tt5Var = new tt5(au5Var.getSavedStateRegistry(), (ab7) au5Var);
            au5Var.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", tt5Var);
            au5Var.getLifecycle().a(new w55(4, tt5Var));
        }
    }

    public static final ut5 c(ab7 ab7Var) {
        bq0 k = hm1.k(ab7Var, new dc1(1), 4);
        return (ut5) ((q9) k.B).F(q75.a(ut5.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
