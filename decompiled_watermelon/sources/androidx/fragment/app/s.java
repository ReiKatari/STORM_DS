package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class s extends fc4 {
    public final /* synthetic */ u d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar) {
        super(false);
        this.d = uVar;
    }

    @Override // defpackage.fc4
    public final void a() {
        boolean K = u.K(3);
        u uVar = this.d;
        if (K) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + uVar);
        }
        if (u.K(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + uVar.h);
        }
        a aVar = uVar.h;
        if (aVar != null) {
            aVar.u = false;
            aVar.e();
            a aVar2 = uVar.h;
            m0 m0Var = new m0(27, uVar);
            if (aVar2.s == null) {
                aVar2.s = new ArrayList();
            }
            aVar2.s.add(m0Var);
            uVar.h.f();
            uVar.i = true;
            uVar.z(true);
            uVar.E();
            uVar.i = false;
            uVar.h = null;
        }
    }

    @Override // defpackage.fc4
    public final void b() {
        boolean K = u.K(3);
        u uVar = this.d;
        if (K) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + uVar);
        }
        s sVar = uVar.j;
        ArrayList arrayList = uVar.n;
        uVar.i = true;
        uVar.z(true);
        int i = 0;
        uVar.i = false;
        if (uVar.h != null) {
            if (!arrayList.isEmpty()) {
                LinkedHashSet<o> linkedHashSet = new LinkedHashSet(u.F(uVar.h));
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    s16 s16Var = (s16) obj;
                    for (o oVar : linkedHashSet) {
                        s16Var.getClass();
                    }
                }
            }
            ArrayList arrayList2 = uVar.h.c;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                o oVar2 = ((vg2) obj2).b;
                if (oVar2 != null) {
                    oVar2.mTransitioning = false;
                }
            }
            Iterator it = uVar.f(new ArrayList(Collections.singletonList(uVar.h)), 0, 1).iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                ArrayList arrayList3 = hVar.c;
                if (u.K(3)) {
                    Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                }
                hVar.m(arrayList3);
                hVar.c(arrayList3);
            }
            ArrayList arrayList4 = uVar.h.c;
            int size3 = arrayList4.size();
            while (i < size3) {
                Object obj3 = arrayList4.get(i);
                i++;
                o oVar3 = ((vg2) obj3).b;
                if (oVar3 != null && oVar3.mContainer == null) {
                    uVar.g(oVar3).k();
                }
            }
            uVar.h = null;
            uVar.e0();
            if (u.K(3)) {
                Log.d("FragmentManager", "Op is being set to null");
                Log.d("FragmentManager", "OnBackPressedCallback enabled=" + sVar.b + " for  FragmentManager " + uVar);
            }
        } else if (sVar.b) {
            if (u.K(3)) {
                Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
            }
            uVar.Q();
        } else {
            if (u.K(3)) {
                Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
            }
            uVar.g.c().a();
        }
    }

    @Override // defpackage.fc4
    public final void c(ky kyVar) {
        boolean K = u.K(2);
        u uVar = this.d;
        if (K) {
            Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + uVar);
        }
        if (uVar.h != null) {
            int i = 0;
            Iterator it = uVar.f(new ArrayList(Collections.singletonList(uVar.h)), 0, 1).iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                hVar.getClass();
                if (u.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + kyVar.c);
                }
                ArrayList arrayList = hVar.c;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    tq0.D0(arrayList2, ((b0) obj).k);
                }
                List n1 = tq0.n1(tq0.s1(arrayList2));
                int size2 = n1.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((gc6) n1.get(i3)).d(kyVar, hVar.a);
                }
            }
            ArrayList arrayList3 = uVar.n;
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj2 = arrayList3.get(i);
                i++;
                ((s16) obj2).getClass();
            }
        }
    }

    @Override // defpackage.fc4
    public final void d(ky kyVar) {
        boolean K = u.K(3);
        u uVar = this.d;
        if (K) {
            Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + uVar);
        }
        uVar.w();
        uVar.x(new t(uVar), false);
    }
}
