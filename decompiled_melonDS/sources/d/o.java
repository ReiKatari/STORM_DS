package d;

import a6.j2;
import a6.l2;
import android.os.Build;
import android.view.View;
import android.view.Window;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o extends q8.r {
    @Override // q8.r
    public void U(c0 c0Var, c0 c0Var2, Window window, View view, boolean z10, boolean z11) {
        int i2;
        aj.g j2Var;
        c0Var.getClass();
        c0Var2.getClass();
        window.getClass();
        view.getClass();
        q8.r.S(window, false);
        if (z10) {
            i2 = c0Var.f3288b;
        } else {
            i2 = c0Var.f3287a;
        }
        window.setStatusBarColor(i2);
        window.setNavigationBarColor(c0Var2.f3288b);
        a0.b bVar = new a0.b(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            j2Var = new l2(window, bVar);
        } else if (i10 >= 30) {
            j2Var = new l2(window, bVar);
        } else if (i10 >= 26) {
            j2Var = new j2(window, bVar);
        } else {
            j2Var = new j2(window, bVar);
        }
        j2Var.e0(!z10);
    }
}
