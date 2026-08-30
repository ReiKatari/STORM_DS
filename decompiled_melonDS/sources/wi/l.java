package wi;

import java.io.IOException;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ p B;
    public final /* synthetic */ int L;

    public /* synthetic */ l(p pVar, int i2, List list, boolean z10) {
        this.A = 2;
        this.B = pVar;
        this.L = i2;
    }

    @Override // mc.a
    public final Object b() {
        switch (this.A) {
            case 0:
                p pVar = this.B;
                int i2 = this.L;
                pVar.f14262e0.getClass();
                try {
                    pVar.f14273q0.z(i2, c.CANCEL);
                    synchronized (pVar) {
                        pVar.f14275s0.remove(Integer.valueOf(i2));
                    }
                } catch (IOException unused) {
                }
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                p pVar2 = this.B;
                int i10 = this.L;
                pVar2.f14262e0.getClass();
                synchronized (pVar2) {
                    pVar2.f14275s0.remove(Integer.valueOf(i10));
                }
                return yb.y.f14813a;
            default:
                p pVar3 = this.B;
                int i11 = this.L;
                pVar3.f14262e0.getClass();
                try {
                    pVar3.f14273q0.z(i11, c.CANCEL);
                    synchronized (pVar3) {
                        pVar3.f14275s0.remove(Integer.valueOf(i11));
                    }
                } catch (IOException unused2) {
                }
                return yb.y.f14813a;
        }
    }

    public /* synthetic */ l(p pVar, int i2, Object obj, int i10) {
        this.A = i10;
        this.B = pVar;
        this.L = i2;
    }
}
