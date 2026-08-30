package og;

import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.h0;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ e B;

    public /* synthetic */ b(e eVar, int i2) {
        this.A = i2;
        this.B = eVar;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        mc.a aVar;
        switch (this.A) {
            case 0:
                ((h0) obj).getClass();
                e eVar = this.B;
                eVar.f10992g0.addView(eVar, eVar.f10993h0);
                return new c(eVar, 0);
            case DSiCameraSource.FrontCamera /* 1 */:
                ((h0) obj).getClass();
                return new c(this.B, 1);
            default:
                h3.b bVar = (h3.b) obj;
                e eVar2 = this.B;
                if (eVar2.f10991f0.f391b && (aVar = eVar2.f10994i0) != null) {
                    aVar.b();
                }
                return y.f14813a;
        }
    }
}
