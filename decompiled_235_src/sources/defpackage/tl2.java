package defpackage;

import android.util.Log;
import androidx.fragment.app.o;
import androidx.fragment.app.u;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tl2  reason: default package */
/* loaded from: classes.dex */
public abstract class tl2 {
    public static final sl2 a = sl2.a;

    public static sl2 a(o oVar) {
        while (oVar != null) {
            if (oVar.isAdded()) {
                oVar.getParentFragmentManager().getClass();
            }
            oVar = oVar.getParentFragment();
        }
        return a;
    }

    public static void b(jq7 jq7Var) {
        if (u.K(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(jq7Var.A.getClass().getName()), jq7Var);
        }
    }

    public static final void c(o oVar, String str) {
        oVar.getClass();
        str.getClass();
        b(new jq7(oVar, "Attempting to reuse fragment " + oVar + " with previous ID " + str));
        a(oVar).getClass();
        rl2 rl2Var = rl2.PENALTY_LOG;
    }
}
