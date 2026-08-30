package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends nc.l implements mc.p {
    public final /* synthetic */ int B = 0;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d1 d1Var) {
        super(2);
        this.L = d1Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        switch (this.B) {
            case 0:
                m0 m0Var = (m0) obj;
                m0 m0Var2 = (m0) obj2;
                m0 m0Var3 = m0.PostExit;
                if (m0Var == m0Var3 && m0Var2 == m0Var3 && !((d1) this.L).f2403a.f2524d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                ((Number) obj2).intValue();
                c2.b((v2.c) this.L, (n2.m) obj, n2.s.F(7));
                return yb.y.f14813a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(v2.c cVar, int i2) {
        super(2);
        this.L = cVar;
    }
}
