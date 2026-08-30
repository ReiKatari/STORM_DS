package ai;

import g2.a5;
import g2.t4;
import g2.w4;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements mc.p {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ long B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ c(long j2, w4 w4Var, String str) {
        this.B = j2;
        this.L = w4Var;
        this.R = str;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                n.a((List) this.L, this.B, (mc.l) this.R, (n2.m) obj, n2.s.F(1));
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                w4 w4Var = (w4) this.L;
                String str = (String) this.R;
                n2.m mVar = (n2.m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    g2.r0 b10 = g2.b0.b(this.B, rVar, 5);
                    boolean h2 = rVar.h(w4Var);
                    Object L = rVar.L();
                    if (h2 || L == n2.l.f9953a) {
                        L = new t4(w4Var, 1);
                        rVar.h0(L);
                    }
                    g2.n0.j((mc.a) L, null, false, b10, v2.h.c(-929149933, new a5(str, 0), rVar), rVar, 805306368, 382);
                } else {
                    rVar.R();
                }
                return yb.y.f14813a;
            default:
                ((Integer) obj2).getClass();
                u1.a.a((f2.m) this.L, (b3.p) this.R, this.B, (n2.m) obj, n2.s.F(1));
                break;
        }
        return yb.y.f14813a;
    }

    public /* synthetic */ c(f2.m mVar, b3.p pVar, long j2, int i2) {
        this.L = mVar;
        this.R = pVar;
        this.B = j2;
    }

    public /* synthetic */ c(List list, long j2, mc.l lVar, int i2) {
        this.L = list;
        this.B = j2;
        this.R = lVar;
    }
}
