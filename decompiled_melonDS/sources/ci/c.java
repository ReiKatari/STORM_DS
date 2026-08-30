package ci;

import androidx.lifecycle.e1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends nc.l implements mc.a {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(yb.f fVar, int i2) {
        super(0);
        this.B = i2;
        this.L = fVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [yb.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [yb.f, java.lang.Object] */
    @Override // mc.a
    public final Object b() {
        androidx.lifecycle.k kVar;
        switch (this.B) {
            case 0:
                return ((e1) this.L.getValue()).getViewModelStore();
            default:
                e1 e1Var = (e1) this.L.getValue();
                if (e1Var instanceof androidx.lifecycle.k) {
                    kVar = (androidx.lifecycle.k) e1Var;
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    return kVar.getDefaultViewModelCreationExtras();
                }
                return w6.a.f14160b;
        }
    }
}
