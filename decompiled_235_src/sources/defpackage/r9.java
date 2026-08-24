package defpackage;

import android.view.MenuItem;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r9  reason: default package */
/* loaded from: classes.dex */
public final class r9 implements j8, g44 {
    public final Toolbar A;

    public /* synthetic */ r9(Toolbar toolbar) {
        this.A = toolbar;
    }

    @Override // defpackage.g44
    public void H(i44 i44Var) {
        Toolbar toolbar = this.A;
        g8 g8Var = toolbar.A.s0;
        if (g8Var == null || !g8Var.j()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.F0.L).iterator();
            while (it.hasNext()) {
                ((fl2) it.next()).a.t(i44Var);
            }
        }
        h87 h87Var = toolbar.N0;
        if (h87Var != null) {
            h87Var.H(i44Var);
        }
    }

    @Override // defpackage.g44
    public boolean n(i44 i44Var, MenuItem menuItem) {
        return false;
    }

    public r9(FrameLayout frameLayout, Toolbar toolbar) {
        this.A = toolbar;
    }
}
