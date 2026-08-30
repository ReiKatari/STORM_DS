package e;

import mc.p;
import n2.m;
import n2.s;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements p {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ int L;
    public final /* synthetic */ yb.d R;

    public /* synthetic */ d(boolean z10, mc.a aVar, int i2, int i10) {
        this.B = z10;
        this.R = aVar;
        this.L = i10;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int F = s.F(1);
                aj.g.a(this.B, (mc.a) this.R, (m) obj, F, this.L);
                break;
            default:
                ((Integer) obj2).getClass();
                int F2 = s.F(this.L | 1);
                d0.d.E(this.B, (p) this.R, (m) obj, F2);
                break;
        }
        return y.f14813a;
    }

    public /* synthetic */ d(boolean z10, p pVar, int i2) {
        this.B = z10;
        this.R = pVar;
        this.L = i2;
    }
}
