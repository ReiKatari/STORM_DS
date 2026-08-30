package mg;

import n2.f1;
import q4.x;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ l B;
    public final /* synthetic */ mc.l L;

    public /* synthetic */ a(l lVar, mc.l lVar2, int i2) {
        this.A = i2;
        this.B = lVar;
        this.L = lVar2;
    }

    @Override // mc.a
    public final Object b() {
        boolean z10;
        boolean z11;
        switch (this.A) {
            case 0:
                l lVar = this.B;
                f1 f1Var = lVar.f9657e;
                if (vc.h.j0(((x) lVar.f9654b.getValue()).f12276a.B)) {
                    f1Var.setValue(k.CANNOT_BE_EMPTY);
                    z10 = false;
                } else {
                    f1Var.setValue(null);
                    z10 = true;
                }
                boolean b10 = lVar.b();
                if (z10 && b10) {
                    this.L.k(lVar.a());
                }
                return y.f14813a;
            default:
                l lVar2 = this.B;
                f1 f1Var2 = lVar2.f9657e;
                if (vc.h.j0(((x) lVar2.f9654b.getValue()).f12276a.B)) {
                    f1Var2.setValue(k.CANNOT_BE_EMPTY);
                    z11 = false;
                } else {
                    f1Var2.setValue(null);
                    z11 = true;
                }
                boolean b11 = lVar2.b();
                if (z11 && b11) {
                    this.L.k(lVar2.a());
                }
                return y.f14813a;
        }
    }
}
