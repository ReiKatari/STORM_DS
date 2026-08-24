package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class s extends dl4 {
    public final /* synthetic */ u d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar) {
        super(false);
        this.d = uVar;
    }

    @Override // defpackage.dl4
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
            aVar.g();
            a aVar2 = uVar.h;
            n0 n0Var = new n0(uVar, 27);
            if (aVar2.s == null) {
                aVar2.s = new ArrayList();
            }
            aVar2.s.add(n0Var);
            uVar.h.h();
            uVar.i = true;
            uVar.z(true);
            uVar.E();
            uVar.i = false;
            uVar.h = null;
        }
    }

    @Override // defpackage.dl4
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
                    gd6 gd6Var = (gd6) obj;
                    for (o oVar : linkedHashSet) {
                        gd6Var.getClass();
                    }
                }
            }
            ArrayList arrayList2 = uVar.h.c;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                o oVar2 = ((ul2) obj2).b;
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
                o oVar3 = ((ul2) obj3).b;
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

    @Override // defpackage.dl4
    public final void c(b00 b00Var) {
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
                    Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + b00Var.c);
                }
                ArrayList arrayList = hVar.c;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    gt0.A0(arrayList2, ((b0) obj).k);
                }
                List k1 = gt0.k1(gt0.p1(arrayList2));
                int size2 = k1.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((wn6) k1.get(i3)).d(b00Var, hVar.a);
                }
            }
            ArrayList arrayList3 = uVar.n;
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj2 = arrayList3.get(i);
                i++;
                ((gd6) obj2).getClass();
            }
        }
    }

    @Override // defpackage.dl4
    public final void d(b00 b00Var) {
        boolean K = u.K(3);
        u uVar = this.d;
        if (K) {
            Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + uVar);
        }
        uVar.w();
        uVar.x(new t(uVar), false);
    }
}
