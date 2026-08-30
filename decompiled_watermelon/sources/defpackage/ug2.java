package defpackage;

import android.util.Log;
import androidx.fragment.app.o;
import androidx.fragment.app.u;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ug2  reason: default package */
/* loaded from: classes.dex */
public abstract class ug2 {
    public static final tg2 a = tg2.a;

    public static tg2 a(o oVar) {
        while (oVar != null) {
            if (oVar.isAdded()) {
                oVar.getParentFragmentManager().getClass();
            }
            oVar = oVar.getParentFragment();
        }
        return a;
    }

    public static void b(hc7 hc7Var) {
        if (u.K(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(hc7Var.A.getClass().getName()), hc7Var);
        }
    }

    public static final void c(o oVar, String str) {
        oVar.getClass();
        str.getClass();
        b(new hc7(oVar, "Attempting to reuse fragment " + oVar + " with previous ID " + str));
        a(oVar).getClass();
        sg2 sg2Var = sg2.PENALTY_LOG;
    }
}
