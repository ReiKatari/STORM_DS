package ah;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u implements cd.i {
    public final /* synthetic */ int A;
    public final /* synthetic */ e0 B;

    public /* synthetic */ u(e0 e0Var, int i2) {
        this.A = i2;
        this.B = e0Var;
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.Collection, java.lang.Object] */
    @Override // cd.i
    public final Object a(Object obj, cc.c cVar) {
        switch (this.A) {
            case 0:
                hh.v0 v0Var = (hh.v0) obj;
                this.B.m = zb.q.A;
                return yb.y.f14813a;
            default:
                xe.l lVar = (xe.l) obj;
                boolean z10 = lVar instanceof xe.d;
                e0 e0Var = this.B;
                if (z10) {
                    e0Var.m = zb.l.d0(e0Var.m, new Long(((xe.d) lVar).f14565a));
                } else if (lVar instanceof xe.g) {
                    e0Var.m = zb.l.c0((List) e0Var.m, new Long(((xe.g) lVar).f14571a));
                } else if (lVar instanceof xe.f) {
                    e0Var.f756n = zb.l.d0(e0Var.f756n, new a0(((xe.f) lVar).f14570a, wc.i.f14198a.d()));
                }
                return yb.y.f14813a;
        }
    }
}
