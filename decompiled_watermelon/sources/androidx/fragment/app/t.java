package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class t implements kg2 {
    public final /* synthetic */ u a;

    public t(u uVar) {
        this.a = uVar;
    }

    @Override // defpackage.kg2
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        boolean S;
        u uVar = this.a;
        ArrayList arrayList3 = uVar.n;
        if (u.K(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + uVar.a);
        }
        int i = 0;
        if (uVar.d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            S = false;
        } else {
            ArrayList arrayList4 = uVar.d;
            a aVar = (a) arrayList4.get(arrayList4.size() - 1);
            uVar.h = aVar;
            ArrayList arrayList5 = aVar.c;
            int size = arrayList5.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList5.get(i2);
                i2++;
                o oVar = ((vg2) obj).b;
                if (oVar != null) {
                    oVar.mTransitioning = true;
                }
            }
            S = uVar.S(-1, 0, arrayList, arrayList2);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet<o> linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList.get(i3);
                i3++;
                linkedHashSet.addAll(u.F((a) obj2));
            }
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj3 = arrayList3.get(i);
                i++;
                s16 s16Var = (s16) obj3;
                for (o oVar2 : linkedHashSet) {
                    s16Var.getClass();
                }
            }
        }
        return S;
    }
}
