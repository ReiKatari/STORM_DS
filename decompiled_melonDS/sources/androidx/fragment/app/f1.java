package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f1 implements d1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g1 f1304a;

    public f1(g1 g1Var) {
        this.f1304a = g1Var;
    }

    @Override // androidx.fragment.app.d1
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        boolean S;
        g1 g1Var = this.f1304a;
        ArrayList arrayList3 = g1Var.f1322n;
        if (g1.K(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + g1Var.f1310a);
        }
        int i2 = 0;
        if (g1Var.f1313d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            S = false;
        } else {
            ArrayList arrayList4 = g1Var.f1313d;
            a aVar = (a) arrayList4.get(arrayList4.size() - 1);
            g1Var.f1317h = aVar;
            ArrayList arrayList5 = aVar.f1229c;
            int size = arrayList5.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList5.get(i10);
                i10++;
                j0 j0Var = ((r1) obj).f1406b;
                if (j0Var != null) {
                    j0Var.mTransitioning = true;
                }
            }
            S = g1Var.S(arrayList, arrayList2, -1, 0);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet<j0> linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList.get(i11);
                i11++;
                linkedHashSet.addAll(g1.F((a) obj2));
            }
            int size3 = arrayList3.size();
            while (i2 < size3) {
                Object obj3 = arrayList3.get(i2);
                i2++;
                ci.m mVar = (ci.m) obj3;
                for (j0 j0Var2 : linkedHashSet) {
                    mVar.getClass();
                }
            }
        }
        return S;
    }
}
