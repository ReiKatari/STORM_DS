package defpackage;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nv6  reason: default package */
/* loaded from: classes.dex */
public final class nv6 implements i8, sw3 {
    public final /* synthetic */ Toolbar A;

    public /* synthetic */ nv6(Toolbar toolbar) {
        this.A = toolbar;
    }

    @Override // defpackage.sw3
    public void D(uw3 uw3Var) {
        Toolbar toolbar = this.A;
        f8 f8Var = toolbar.A.r0;
        if (f8Var == null || !f8Var.h()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.E0.R).iterator();
            while (it.hasNext()) {
                ((gg2) it.next()).a.t(uw3Var);
            }
        }
        tv6 tv6Var = toolbar.M0;
        if (tv6Var != null) {
            tv6Var.D(uw3Var);
        }
    }

    @Override // defpackage.sw3
    public boolean t(uw3 uw3Var, MenuItem menuItem) {
        return false;
    }
}
