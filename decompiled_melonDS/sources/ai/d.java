package ai;

import g2.d1;
import g2.k6;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements mc.p {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public /* synthetic */ d(b3.p pVar, zh.c cVar, boolean z10, mc.a aVar, int i2) {
        this.L = pVar;
        this.R = cVar;
        this.B = z10;
        this.X = aVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                n.j((b3.p) this.L, (zh.c) this.R, this.B, (mc.a) this.X, (n2.m) obj, n2.s.F(1));
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                j1.i iVar = (j1.i) this.L;
                d1 d1Var = (d1) this.R;
                i3.n0 n0Var = (i3.n0) this.X;
                n2.m mVar = (n2.m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    k6.f5223a.a(this.B, false, iVar, d1Var, n0Var, 0.0f, 0.0f, rVar, 12582912);
                } else {
                    rVar.R();
                }
                return yb.y.f14813a;
            default:
                ((Integer) obj2).getClass();
                qh.b.a((oe.y) this.L, this.B, (mc.a) this.X, (mc.a) this.R, (n2.m) obj, n2.s.F(1));
                break;
        }
        return yb.y.f14813a;
    }

    public /* synthetic */ d(oe.y yVar, boolean z10, mc.a aVar, mc.a aVar2, int i2) {
        this.L = yVar;
        this.B = z10;
        this.X = aVar;
        this.R = aVar2;
    }

    public /* synthetic */ d(boolean z10, j1.i iVar, d1 d1Var, i3.n0 n0Var) {
        this.B = z10;
        this.L = iVar;
        this.R = d1Var;
        this.X = n0Var;
    }
}
