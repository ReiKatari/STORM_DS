package defpackage;

import android.net.ConnectivityManager;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cf4  reason: default package */
/* loaded from: classes.dex */
public final class cf4 implements k11 {
    public final ConnectivityManager a;

    public cf4(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    @Override // defpackage.k11
    public final boolean a(yw7 yw7Var) {
        if (!c(yw7Var)) {
            return false;
        }
        i.m("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        return false;
    }

    @Override // defpackage.k11
    public final pb0 b(p21 p21Var) {
        p21Var.getClass();
        return f04.p(new u12(p21Var, this, (r41) null, 18));
    }

    @Override // defpackage.k11
    public final boolean c(yw7 yw7Var) {
        yw7Var.getClass();
        if (yw7Var.j.a() == null && yw7Var.j.a == kf4.NOT_REQUIRED) {
            return false;
        }
        return true;
    }
}
