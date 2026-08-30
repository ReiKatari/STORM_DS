package c1;

import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y extends nc.l implements mc.a {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i2, Object obj) {
        super(0);
        this.B = i2;
        this.L = obj;
    }

    @Override // mc.a
    public final Object b() {
        boolean z10;
        switch (this.B) {
            case 0:
                d1.q1 q1Var = (d1.q1) this.L;
                Object c4 = q1Var.f3649a.c();
                m0 m0Var = m0.PostExit;
                if (c4 == m0Var && q1Var.f3652d.getValue() == m0Var) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                z2.s sVar = ((y1) this.L).f2549b0;
                if (!sVar.isEmpty()) {
                    Iterator it = sVar.B.iterator();
                    while (((z2.x) it).hasNext() && !((p1) ((Map.Entry) ((z2.x) it).next()).getValue()).a()) {
                    }
                }
                return yb.y.f14813a;
        }
    }
}
