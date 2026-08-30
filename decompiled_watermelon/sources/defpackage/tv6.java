package defpackage;

import android.view.MenuItem;
import android.view.Window;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tv6  reason: default package */
/* loaded from: classes.dex */
public final class tv6 implements rv6, sw3 {
    public final /* synthetic */ uv6 A;

    public /* synthetic */ tv6(uv6 uv6Var) {
        this.A = uv6Var;
    }

    @Override // defpackage.sw3
    public void D(uw3 uw3Var) {
        uv6 uv6Var = this.A;
        boolean q = uv6Var.o0.a.q();
        Window.Callback callback = uv6Var.p0;
        if (q) {
            callback.onPanelClosed(108, uw3Var);
        } else if (callback.onPreparePanel(0, null, uw3Var)) {
            callback.onMenuOpened(108, uw3Var);
        }
    }

    @Override // defpackage.sw3
    public boolean t(uw3 uw3Var, MenuItem menuItem) {
        return false;
    }
}
