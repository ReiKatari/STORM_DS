package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x0 extends d.w {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g1 f1438d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(g1 g1Var) {
        super(false);
        this.f1438d = g1Var;
    }

    @Override // d.w
    public final void a() {
        boolean K = g1.K(3);
        g1 g1Var = this.f1438d;
        if (K) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + g1Var);
        }
        if (g1.K(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + g1Var.f1317h);
        }
        a aVar = g1Var.f1317h;
        if (aVar != null) {
            aVar.f1246u = false;
            aVar.d();
            a aVar2 = g1Var.f1317h;
            x xVar = new x(4, g1Var);
            if (aVar2.f1244s == null) {
                aVar2.f1244s = new ArrayList();
            }
            aVar2.f1244s.add(xVar);
            g1Var.f1317h.e();
            g1Var.f1318i = true;
            g1Var.z(true);
            g1Var.E();
            g1Var.f1318i = false;
            g1Var.f1317h = null;
        }
    }

    @Override // d.w
    public final void b() {
        boolean K = g1.K(3);
        g1 g1Var = this.f1438d;
        if (K) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + g1Var);
        }
        x0 x0Var = g1Var.f1319j;
        ArrayList arrayList = g1Var.f1322n;
        g1Var.f1318i = true;
        g1Var.z(true);
        int i2 = 0;
        g1Var.f1318i = false;
        if (g1Var.f1317h != null) {
            if (!arrayList.isEmpty()) {
                LinkedHashSet<j0> linkedHashSet = new LinkedHashSet(g1.F(g1Var.f1317h));
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ci.m mVar = (ci.m) obj;
                    for (j0 j0Var : linkedHashSet) {
                        mVar.getClass();
                    }
                }
            }
            ArrayList arrayList2 = g1Var.f1317h.f1229c;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                j0 j0Var2 = ((r1) obj2).f1406b;
                if (j0Var2 != null) {
                    j0Var2.mTransitioning = false;
                }
            }
            Iterator it = g1Var.f(new ArrayList(Collections.singletonList(g1Var.f1317h)), 0, 1).iterator();
            while (it.hasNext()) {
                q qVar = (q) it.next();
                ArrayList arrayList3 = qVar.f1397c;
                if (g1.K(3)) {
                    Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                }
                qVar.m(arrayList3);
                qVar.c(arrayList3);
            }
            ArrayList arrayList4 = g1Var.f1317h.f1229c;
            int size3 = arrayList4.size();
            while (i2 < size3) {
                Object obj3 = arrayList4.get(i2);
                i2++;
                j0 j0Var3 = ((r1) obj3).f1406b;
                if (j0Var3 != null && j0Var3.mContainer == null) {
                    g1Var.g(j0Var3).k();
                }
            }
            g1Var.f1317h = null;
            g1Var.e0();
            if (g1.K(3)) {
                Log.d("FragmentManager", "Op is being set to null");
                Log.d("FragmentManager", "OnBackPressedCallback enabled=" + x0Var.f3314b + " for  FragmentManager " + g1Var);
            }
        } else if (x0Var.f3314b) {
            if (g1.K(3)) {
                Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
            }
            g1Var.Q();
        } else {
            if (g1.K(3)) {
                Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
            }
            g1Var.f1316g.c().a();
        }
    }

    @Override // d.w
    public final void c(d.a aVar) {
        boolean K = g1.K(2);
        g1 g1Var = this.f1438d;
        if (K) {
            Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + g1Var);
        }
        if (g1Var.f1317h != null) {
            int i2 = 0;
            Iterator it = g1Var.f(new ArrayList(Collections.singletonList(g1Var.f1317h)), 0, 1).iterator();
            while (it.hasNext()) {
                q qVar = (q) it.next();
                qVar.getClass();
                if (g1.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + aVar.f3282c);
                }
                ArrayList arrayList = qVar.f1397c;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    zb.l.L(((e2) obj).f1281k, arrayList2);
                }
                List p0 = zb.l.p0(zb.l.s0(arrayList2));
                int size2 = p0.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    ((d2) p0.get(i11)).d(aVar, qVar.f1395a);
                }
            }
            ArrayList arrayList3 = g1Var.f1322n;
            int size3 = arrayList3.size();
            while (i2 < size3) {
                Object obj2 = arrayList3.get(i2);
                i2++;
                ((ci.m) obj2).getClass();
            }
        }
    }

    @Override // d.w
    public final void d(d.a aVar) {
        boolean K = g1.K(3);
        g1 g1Var = this.f1438d;
        if (K) {
            Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + g1Var);
        }
        g1Var.w();
        g1Var.x(new f1(g1Var), false);
    }
}
