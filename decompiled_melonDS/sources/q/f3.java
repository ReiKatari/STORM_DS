package q;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f3 implements m, p.j {
    public final /* synthetic */ Toolbar A;

    public /* synthetic */ f3(Toolbar toolbar) {
        this.A = toolbar;
    }

    @Override // p.j
    public void c(p.l lVar) {
        Toolbar toolbar = this.A;
        j jVar = toolbar.A.f951q0;
        if (jVar == null || !jVar.e()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.D0.L).iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.y0) it.next()).f1440a.t(lVar);
            }
        }
        l.d0 d0Var = toolbar.L0;
        if (d0Var != null) {
            d0Var.c(lVar);
        }
    }

    @Override // p.j
    public boolean e(p.l lVar, MenuItem menuItem) {
        return false;
    }
}
