package defpackage;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mf5  reason: default package */
/* loaded from: classes.dex */
public final class mf5 implements fu3 {
    public final /* synthetic */ int A;
    public final Object B;

    public /* synthetic */ mf5(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override // defpackage.fu3
    public final void h(hu3 hu3Var, st3 st3Var) {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                g56 g56Var = (g56) obj;
                if (st3Var == st3.ON_CREATE) {
                    hu3Var.getLifecycle().c(this);
                    Bundle a = g56Var.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                    if (a != null) {
                        ArrayList<String> stringArrayList = a.getStringArrayList("classes_to_restore");
                        if (stringArrayList != null) {
                            int size = stringArrayList.size();
                            int i2 = 0;
                            while (i2 < size) {
                                String str = stringArrayList.get(i2);
                                i2++;
                                String str2 = str;
                                try {
                                    Class<? extends U> asSubclass = Class.forName(str2, false, mf5.class.getClassLoader()).asSubclass(b56.class);
                                    asSubclass.getClass();
                                    try {
                                        Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                                        declaredConstructor.setAccessible(true);
                                        try {
                                            Object newInstance = declaredConstructor.newInstance(null);
                                            newInstance.getClass();
                                            b56 b56Var = (b56) newInstance;
                                            if (g56Var instanceof bp7) {
                                                ap7 viewModelStore = ((bp7) g56Var).getViewModelStore();
                                                d56 savedStateRegistry = g56Var.getSavedStateRegistry();
                                                viewModelStore.getClass();
                                                LinkedHashMap linkedHashMap = viewModelStore.a;
                                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                                while (it.hasNext()) {
                                                    String str3 = (String) it.next();
                                                    str3.getClass();
                                                    qo7 qo7Var = (qo7) linkedHashMap.get(str3);
                                                    if (qo7Var != null) {
                                                        uj2.m(qo7Var, savedStateRegistry, g56Var.getLifecycle());
                                                    }
                                                }
                                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                                    savedStateRegistry.d();
                                                }
                                            } else {
                                                u34.i(g56Var, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                                return;
                                            }
                                        } catch (Exception e) {
                                            u34.p(i61.m("Failed to instantiate ", str2), e);
                                            return;
                                        }
                                    } catch (NoSuchMethodException e2) {
                                        throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                                    }
                                } catch (ClassNotFoundException e3) {
                                    u34.p(lb1.A("Class ", str2, " wasn't found"), e3);
                                    return;
                                }
                            }
                            return;
                        }
                        i.m("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                        return;
                    }
                    return;
                }
                throw new AssertionError("Next event must be ON_CREATE");
            case 1:
                mv0 mv0Var = (mv0) obj;
                if (mv0Var.X == null) {
                    iv0 iv0Var = (iv0) mv0Var.getLastNonConfigurationInstance();
                    if (iv0Var != null) {
                        mv0Var.X = iv0Var.a;
                    }
                    if (mv0Var.X == null) {
                        mv0Var.X = new ap7();
                    }
                }
                mv0Var.A.c(this);
                return;
            case 2:
                new HashMap();
                hr2[] hr2VarArr = (hr2[]) obj;
                if (hr2VarArr.length <= 0) {
                    if (hr2VarArr.length <= 0) {
                        return;
                    }
                    hr2 hr2Var = hr2VarArr[0];
                    throw null;
                }
                hr2 hr2Var2 = hr2VarArr[0];
                throw null;
            case 3:
                if (st3Var == st3.ON_DESTROY) {
                    ((iu3) obj).a = null;
                    return;
                }
                return;
            case 4:
                if (st3Var == st3.ON_CREATE) {
                    hu3Var.getLifecycle().c(this);
                    ((z46) obj).b();
                    return;
                }
                u34.i(st3Var, "Next event must be ON_CREATE, it was ");
                return;
            default:
                if (st3Var == st3.ON_DESTROY) {
                    bo7 bo7Var = (bo7) obj;
                    bo7Var.a = null;
                    bo7Var.b = null;
                    return;
                }
                return;
        }
    }
}
