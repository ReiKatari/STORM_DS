package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y46  reason: default package */
/* loaded from: classes.dex */
public abstract class y46 {
    public static final q61 a = new Object();
    public static final jd1 b = new jd1(23);
    public static final w31 c = new w31(24);

    public static final v46 a(j71 j71Var) {
        z46 z46Var;
        v46 v46Var;
        j71Var.getClass();
        g56 g56Var = (g56) j71Var.a(a);
        Bundle bundle = null;
        if (g56Var != null) {
            bp7 bp7Var = (bp7) j71Var.a(b);
            if (bp7Var != null) {
                Bundle bundle2 = (Bundle) j71Var.a(c);
                String str = (String) j71Var.a(os0.X);
                if (str != null) {
                    c56 b2 = g56Var.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider");
                    if (b2 instanceof z46) {
                        z46Var = (z46) b2;
                    } else {
                        z46Var = null;
                    }
                    if (z46Var != null) {
                        LinkedHashMap linkedHashMap = c(bp7Var).b;
                        v46 v46Var2 = (v46) linkedHashMap.get(str);
                        if (v46Var2 == null) {
                            z46Var.b();
                            Bundle bundle3 = z46Var.c;
                            if (bundle3 != null && bundle3.containsKey(str)) {
                                Bundle bundle4 = bundle3.getBundle(str);
                                if (bundle4 == null) {
                                    bundle4 = jw2.l((vr4[]) Arrays.copyOf(new vr4[0], 0));
                                }
                                bundle3.remove(str);
                                if (bundle3.isEmpty()) {
                                    z46Var.c = null;
                                }
                                bundle = bundle4;
                            }
                            if (bundle != null) {
                                bundle2 = bundle;
                            }
                            if (bundle2 == null) {
                                v46Var = new v46();
                            } else {
                                ClassLoader classLoader = v46.class.getClassLoader();
                                classLoader.getClass();
                                bundle2.setClassLoader(classLoader);
                                p04 p04Var = new p04(bundle2.size());
                                for (String str2 : bundle2.keySet()) {
                                    str2.getClass();
                                    p04Var.put(str2, bundle2.get(str2));
                                }
                                v46Var = new v46(p04Var.b());
                            }
                            linkedHashMap.put(str, v46Var);
                            return v46Var;
                        }
                        return v46Var2;
                    }
                    i.m("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                    return null;
                }
                i.h("CreationExtras must have a value by `VIEW_MODEL_KEY`");
                return null;
            }
            i.h("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        i.h("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        return null;
    }

    public static final void b(g56 g56Var) {
        tt3 b2 = g56Var.getLifecycle().b();
        if (b2 != tt3.INITIALIZED && b2 != tt3.CREATED) {
            i.h("Failed requirement.");
        } else if (g56Var.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            z46 z46Var = new z46(g56Var.getSavedStateRegistry(), (bp7) g56Var);
            g56Var.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", z46Var);
            g56Var.getLifecycle().a(new mf5(z46Var, 4));
        }
    }

    public static final a56 c(bp7 bp7Var) {
        os0 a2 = xo7.a(bp7Var, new eg1(1), 4);
        return (a56) ((eb) a2.B).G(gh5.a(a56.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
