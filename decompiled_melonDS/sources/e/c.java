package e;

import a7.n;
import g3.r;
import g3.z;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.h0;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Object L;

    public /* synthetic */ c(boolean z10, z zVar) {
        this.A = 3;
        this.B = z10;
        this.L = zVar;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        switch (this.A) {
            case 0:
                g gVar = (g) this.L;
                boolean z10 = this.B;
                ((n) gVar.f1790a).f(z10);
                ((f.a) gVar.f1791b).f(z10);
                return new e((u6.c) obj, gVar, 0);
            case DSiCameraSource.FrontCamera /* 1 */:
                h hVar = (h) this.L;
                hVar.r(this.B);
                return new e((u6.c) obj, hVar, 1);
            case 2:
                s9.a aVar = (s9.a) this.L;
                ((h0) obj).getClass();
                a0.b bVar = aVar.f12850b;
                boolean z11 = false;
                if (bVar != null && ((aj.g) bVar.B).K()) {
                    z11 = true;
                }
                boolean z12 = !this.B;
                a0.b bVar2 = aVar.f12850b;
                if (bVar2 != null) {
                    bVar2.X(z12);
                }
                return new mg.i(aVar, z11);
            default:
                z zVar = (z) this.L;
                r rVar = (r) obj;
                rVar.getClass();
                if (!this.B) {
                    zVar = z.f5551b;
                }
                rVar.c(zVar);
                return y.f14813a;
        }
    }

    public /* synthetic */ c(Object obj, boolean z10, int i2) {
        this.A = i2;
        this.L = obj;
        this.B = z10;
    }
}
