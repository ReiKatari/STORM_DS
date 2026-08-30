package b4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n0 extends nc.l implements mc.p {
    public final /* synthetic */ int B = 1;
    public final /* synthetic */ b1 L;
    public final /* synthetic */ mc.p R;
    public final /* synthetic */ a4.c2 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(a4.c2 c2Var, b1 b1Var, mc.p pVar, int i2) {
        super(2);
        this.X = c2Var;
        this.L = b1Var;
        this.R = pVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        switch (this.B) {
            case 0:
                n2.m mVar = (n2.m) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    q1.a((x) this.X, this.L, this.R, rVar, 0);
                } else {
                    rVar.R();
                }
                return yb.y.f14813a;
            default:
                ((Number) obj2).intValue();
                q1.a(this.X, this.L, this.R, (n2.m) obj, n2.s.F(1));
                return yb.y.f14813a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(x xVar, b1 b1Var, mc.p pVar) {
        super(2);
        this.X = xVar;
        this.L = b1Var;
        this.R = pVar;
    }
}
