package l;

import android.view.MenuItem;
import android.view.Window;
import q.j3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 implements j3, p.j {
    public final /* synthetic */ e0 A;

    public /* synthetic */ d0(e0 e0Var) {
        this.A = e0Var;
    }

    @Override // p.j
    public void c(p.l lVar) {
        e0 e0Var = this.A;
        boolean q10 = e0Var.f8381l.f11964a.q();
        Window.Callback callback = e0Var.m;
        if (q10) {
            callback.onPanelClosed(108, lVar);
        } else if (callback.onPreparePanel(0, null, lVar)) {
            callback.onMenuOpened(108, lVar);
        }
    }

    @Override // p.j
    public boolean e(p.l lVar, MenuItem menuItem) {
        return false;
    }
}
