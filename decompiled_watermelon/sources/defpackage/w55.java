package defpackage;

import android.os.Bundle;
import androidx.fragment.app.p;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w55  reason: default package */
/* loaded from: classes.dex */
public final class w55 implements dn3 {
    public final /* synthetic */ int A;
    public final Object B;

    public /* synthetic */ w55(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    @Override // defpackage.dn3
    public final void d(fn3 fn3Var, pm3 pm3Var) {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                au5 au5Var = (au5) obj;
                if (pm3Var == pm3.ON_CREATE) {
                    fn3Var.getLifecycle().c(this);
                    Bundle a = au5Var.getSavedStateRegistry().a("androidx.savedstate.Restarter");
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
                                    Class<? extends U> asSubclass = Class.forName(str2, false, w55.class.getClassLoader()).asSubclass(vt5.class);
                                    asSubclass.getClass();
                                    try {
                                        Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                                        declaredConstructor.setAccessible(true);
                                        try {
                                            Object newInstance = declaredConstructor.newInstance(null);
                                            newInstance.getClass();
                                            vt5 vt5Var = (vt5) newInstance;
                                            if (au5Var instanceof ab7) {
                                                za7 viewModelStore = ((ab7) au5Var).getViewModelStore();
                                                xt5 savedStateRegistry = au5Var.getSavedStateRegistry();
                                                viewModelStore.getClass();
                                                LinkedHashMap linkedHashMap = viewModelStore.a;
                                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                                while (it.hasNext()) {
                                                    String str3 = (String) it.next();
                                                    str3.getClass();
                                                    ra7 ra7Var = (ra7) linkedHashMap.get(str3);
                                                    if (ra7Var != null) {
                                                        mj2.k(ra7Var, savedStateRegistry, au5Var.getLifecycle());
                                                    }
                                                }
                                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                                    savedStateRegistry.d();
                                                }
                                            } else {
                                                c44.h(au5Var, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                                return;
                                            }
                                        } catch (Exception e) {
                                            c44.o(b31.p("Failed to instantiate ", str2), e);
                                            return;
                                        }
                                    } catch (NoSuchMethodException e2) {
                                        throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                                    }
                                } catch (ClassNotFoundException e3) {
                                    c44.o(wh1.A("Class ", str2, " wasn't found"), e3);
                                    return;
                                }
                            }
                            return;
                        }
                        i.n("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                        return;
                    }
                    return;
                }
                throw new AssertionError("Next event must be ON_CREATE");
            case 1:
                p pVar = (p) obj;
                if (pVar.X == null) {
                    us0 us0Var = (us0) pVar.getLastNonConfigurationInstance();
                    if (us0Var != null) {
                        pVar.X = us0Var.a;
                    }
                    if (pVar.X == null) {
                        pVar.X = new za7();
                    }
                }
                pVar.A.c(this);
                return;
            case 2:
                new HashMap();
                bl2[] bl2VarArr = (bl2[]) obj;
                if (bl2VarArr.length <= 0) {
                    if (bl2VarArr.length <= 0) {
                        return;
                    }
                    bl2 bl2Var = bl2VarArr[0];
                    throw null;
                }
                bl2 bl2Var2 = bl2VarArr[0];
                throw null;
            case 3:
                if (pm3Var == pm3.ON_DESTROY) {
                    ((gn3) obj).a = null;
                    return;
                }
                return;
            case 4:
                if (pm3Var == pm3.ON_CREATE) {
                    fn3Var.getLifecycle().c(this);
                    ((tt5) obj).b();
                    return;
                }
                c44.h(pm3Var, "Next event must be ON_CREATE, it was ");
                return;
            default:
                if (pm3Var == pm3.ON_DESTROY) {
                    ba7 ba7Var = (ba7) obj;
                    ba7Var.a = null;
                    ba7Var.b = null;
                    return;
                }
                return;
        }
    }
}
