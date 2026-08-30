package q7;

import a0.j;
import android.os.Bundle;
import androidx.fragment.app.o0;
import androidx.lifecycle.d1;
import androidx.lifecycle.e1;
import androidx.lifecycle.p;
import androidx.lifecycle.s0;
import androidx.lifecycle.v;
import androidx.lifecycle.x;
import androidx.lifecycle.y0;
import d.g;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kb.i;
import m9.o;
import me.magnum.melonds.common.camera.DSiCameraSource;
import pf.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements v {
    public final /* synthetic */ int A;
    public final Object B;

    public /* synthetic */ a(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    @Override // androidx.lifecycle.v
    public final void d(x xVar, p pVar) {
        switch (this.A) {
            case 0:
                f fVar = (f) this.B;
                if (pVar == p.ON_CREATE) {
                    xVar.getLifecycle().c(this);
                    Bundle a10 = fVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                    if (a10 != null) {
                        ArrayList<String> stringArrayList = a10.getStringArrayList("classes_to_restore");
                        if (stringArrayList != null) {
                            int size = stringArrayList.size();
                            int i2 = 0;
                            while (i2 < size) {
                                String str = stringArrayList.get(i2);
                                i2++;
                                String str2 = str;
                                try {
                                    Class<? extends U> asSubclass = Class.forName(str2, false, a.class.getClassLoader()).asSubclass(b.class);
                                    asSubclass.getClass();
                                    try {
                                        Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                                        declaredConstructor.setAccessible(true);
                                        try {
                                            Object newInstance = declaredConstructor.newInstance(null);
                                            newInstance.getClass();
                                            b bVar = (b) newInstance;
                                            if (fVar instanceof e1) {
                                                d1 viewModelStore = ((e1) fVar).getViewModelStore();
                                                d savedStateRegistry = fVar.getSavedStateRegistry();
                                                viewModelStore.getClass();
                                                LinkedHashMap linkedHashMap = viewModelStore.f1470a;
                                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                                while (it.hasNext()) {
                                                    String str3 = (String) it.next();
                                                    str3.getClass();
                                                    y0 y0Var = (y0) linkedHashMap.get(str3);
                                                    if (y0Var != null) {
                                                        s0.a(y0Var, savedStateRegistry, fVar.getLifecycle());
                                                    }
                                                }
                                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                                    savedStateRegistry.d();
                                                }
                                            } else {
                                                o.u(fVar, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                                return;
                                            }
                                        } catch (Exception e6) {
                                            o.l("Failed to instantiate ", str2, e6);
                                            return;
                                        }
                                    } catch (NoSuchMethodException e10) {
                                        throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
                                    }
                                } catch (ClassNotFoundException e11) {
                                    o.m(kc.a.g("Class ", str2, " wasn't found"), e11);
                                    return;
                                }
                            }
                            return;
                        }
                        j.p("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                        return;
                    }
                    return;
                }
                throw new AssertionError("Next event must be ON_CREATE");
            case DSiCameraSource.FrontCamera /* 1 */:
                o0 o0Var = (o0) this.B;
                if (o0Var.X == null) {
                    g gVar = (g) o0Var.getLastNonConfigurationInstance();
                    if (gVar != null) {
                        o0Var.X = gVar.f3291a;
                    }
                    if (o0Var.X == null) {
                        o0Var.X = new d1();
                    }
                }
                o0Var.A.c(this);
                return;
            case 2:
                if (pVar == p.ON_DESTROY) {
                    i iVar = (i) this.B;
                    iVar.f8133a = null;
                    iVar.f8134b = null;
                    return;
                }
                return;
            default:
                if (pVar == p.ON_DESTROY) {
                    ((q) this.B).f11646a = null;
                    return;
                }
                return;
        }
    }
}
