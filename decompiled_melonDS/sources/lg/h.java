package lg;

import a7.d0;
import me.magnum.melonds.common.camera.DSiCameraSource;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h implements cd.i {
    public final /* synthetic */ int A;
    public final /* synthetic */ d0 B;

    public /* synthetic */ h(d0 d0Var, int i2) {
        this.A = i2;
        this.B = d0Var;
    }

    @Override // cd.i
    public final Object a(Object obj, cc.c cVar) {
        switch (this.A) {
            case 0:
                kg.j jVar = (kg.j) obj;
                d0.b(this.B, jg.l.INSTANCE);
                return y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                d0.b(this.B, new jg.k(((kg.j) obj).f8301a));
                return y.f14813a;
            case 2:
                d0.b(this.B, new jg.h(((kg.j) obj).f8301a));
                return y.f14813a;
            default:
                y yVar = (y) obj;
                d0.b(this.B, jg.e.INSTANCE);
                return y.f14813a;
        }
    }
}
