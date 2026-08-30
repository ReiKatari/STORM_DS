package r6;

import android.util.Log;
import androidx.fragment.app.g1;
import androidx.fragment.app.j0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final c f12618a = c.f12617a;

    public static c a(j0 j0Var) {
        while (j0Var != null) {
            if (j0Var.isAdded()) {
                j0Var.getParentFragmentManager().getClass();
            }
            j0Var = j0Var.getParentFragment();
        }
        return f12618a;
    }

    public static void b(h hVar) {
        if (g1.K(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(hVar.A.getClass().getName()), hVar);
        }
    }

    public static final void c(j0 j0Var, String str) {
        j0Var.getClass();
        str.getClass();
        b(new h(j0Var, "Attempting to reuse fragment " + j0Var + " with previous ID " + str));
        a(j0Var).getClass();
        b bVar = b.PENALTY_LOG;
    }
}
