package defpackage;

import android.view.MenuItem;
import android.view.Window;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h87  reason: default package */
/* loaded from: classes.dex */
public final class h87 implements f87, g44 {
    public final /* synthetic */ i87 A;

    public /* synthetic */ h87(i87 i87Var) {
        this.A = i87Var;
    }

    @Override // defpackage.g44
    public void H(i44 i44Var) {
        i87 i87Var = this.A;
        boolean q = i87Var.l.a.q();
        Window.Callback callback = i87Var.m;
        if (q) {
            callback.onPanelClosed(108, i44Var);
        } else if (callback.onPreparePanel(0, null, i44Var)) {
            callback.onMenuOpened(108, i44Var);
        }
    }

    @Override // defpackage.g44
    public boolean n(i44 i44Var, MenuItem menuItem) {
        return false;
    }
}
