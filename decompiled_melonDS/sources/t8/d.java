package t8;

import a0.j;
import android.net.ConnectivityManager;
import cd.q;
import h1.x2;
import x8.p;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d implements u8.d {

    /* renamed from: a  reason: collision with root package name */
    public final ConnectivityManager f13137a;

    public d(ConnectivityManager connectivityManager) {
        this.f13137a = connectivityManager;
    }

    @Override // u8.d
    public final boolean a(p pVar) {
        if (!c(pVar)) {
            return false;
        }
        j.p("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        return false;
    }

    @Override // u8.d
    public final cd.c b(p8.e eVar) {
        eVar.getClass();
        return q.h(new x2(eVar, this, null, 20));
    }

    @Override // u8.d
    public final boolean c(p pVar) {
        pVar.getClass();
        if (pVar.f14429j.a() != null) {
            return true;
        }
        return false;
    }
}
