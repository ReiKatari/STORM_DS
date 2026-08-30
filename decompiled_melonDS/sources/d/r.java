package d;

import a6.j2;
import a6.l2;
import android.os.Build;
import android.view.View;
import android.view.Window;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class r extends q {
    @Override // d.p, q8.r
    public void U(c0 c0Var, c0 c0Var2, Window window, View view, boolean z10, boolean z11) {
        aj.g j2Var;
        c0Var.getClass();
        c0Var2.getClass();
        window.getClass();
        view.getClass();
        q8.r.S(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        a0.b bVar = new a0.b(view);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            j2Var = new l2(window, bVar);
        } else if (i2 >= 30) {
            j2Var = new l2(window, bVar);
        } else if (i2 >= 26) {
            j2Var = new j2(window, bVar);
        } else {
            j2Var = new j2(window, bVar);
        }
        j2Var.e0(!z10);
        j2Var.d0(!z11);
    }
}
