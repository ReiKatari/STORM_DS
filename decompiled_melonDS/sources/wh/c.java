package wh;

import java.util.UUID;
import mc.l;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements mc.a {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ ve.f B;
    public final /* synthetic */ l L;

    public c(l lVar, ve.f fVar) {
        this.L = lVar;
        this.B = fVar;
    }

    @Override // mc.a
    public final Object b() {
        switch (this.A) {
            case 0:
                this.L.k(this.B.f13798a);
                return y.f14813a;
            default:
                UUID uuid = this.B.f13798a;
                if (uuid != null) {
                    this.L.k(uuid);
                }
                return y.f14813a;
        }
    }

    public c(ve.f fVar, l lVar) {
        this.B = fVar;
        this.L = lVar;
    }
}
