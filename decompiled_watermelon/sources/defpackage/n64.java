package defpackage;

import android.net.ConnectivityManager;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n64  reason: default package */
/* loaded from: classes.dex */
public final class n64 implements fy0 {
    public final ConnectivityManager a;

    public n64(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    @Override // defpackage.fy0
    public final boolean a(xh7 xh7Var) {
        xh7Var.getClass();
        if (xh7Var.j.a() == null && xh7Var.j.a == v64.NOT_REQUIRED) {
            return false;
        }
        return true;
    }

    @Override // defpackage.fy0
    public final boolean b(xh7 xh7Var) {
        if (!a(xh7Var)) {
            return false;
        }
        i.n("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        return false;
    }

    @Override // defpackage.fy0
    public final h90 c(kz0 kz0Var) {
        kz0Var.getClass();
        return se.k(new wx1(kz0Var, this, null, 14));
    }
}
