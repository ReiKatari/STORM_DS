package ig;

import ai.s;
import g2.b2;
import mc.p;
import me.magnum.melonds.R;
import n2.r;
import n2.w0;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements p {
    public final /* synthetic */ int A;
    public final /* synthetic */ w0 B;
    public final /* synthetic */ mc.a L;
    public final /* synthetic */ mc.a R;

    public /* synthetic */ d(int i2, mc.a aVar, mc.a aVar2, w0 w0Var) {
        this.A = i2;
        this.B = w0Var;
        this.L = aVar;
        this.R = aVar2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        int i2 = this.A;
        n2.m mVar = (n2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i2) {
            case 0:
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = (r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    b2.a(o3.b.d(pc.a.x(), rVar), l0.f.I(rVar, R.string.options), null, 0L, rVar, 8, 12);
                    w0 w0Var = this.B;
                    boolean booleanValue = ((Boolean) w0Var.getValue()).booleanValue();
                    Object L = rVar.L();
                    if (L == n2.l.f9953a) {
                        L = new s(w0Var, 7);
                        rVar.h0(L);
                    }
                    g2.s.a(booleanValue, (mc.a) L, null, 0L, null, null, v2.h.c(361844192, new e(0, this.L, this.R, w0Var), rVar), rVar, 1572912);
                } else {
                    rVar.R();
                }
                return y.f14813a;
            default:
                if ((intValue & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                r rVar2 = (r) mVar;
                if (rVar2.O(intValue & 1, z11)) {
                    b2.b(pc.a.x(), l0.f.I(rVar2, R.string.options), null, 0L, rVar2, 0, 12);
                    w0 w0Var2 = this.B;
                    boolean booleanValue2 = ((Boolean) w0Var2.getValue()).booleanValue();
                    Object L2 = rVar2.L();
                    if (L2 == n2.l.f9953a) {
                        L2 = new s(w0Var2, 14);
                        rVar2.h0(L2);
                    }
                    g2.s.a(booleanValue2, (mc.a) L2, null, 0L, null, null, v2.h.c(326841209, new e(1, this.L, this.R, w0Var2), rVar2), rVar2, 1572912);
                } else {
                    rVar2.R();
                }
                return y.f14813a;
        }
    }
}
