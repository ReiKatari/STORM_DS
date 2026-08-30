package u1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ f2.b1 B;
    public final /* synthetic */ v2.c L;
    public final /* synthetic */ int R;

    public /* synthetic */ o(f2.b1 b1Var, v2.c cVar, int i2, int i10) {
        this.A = i10;
        this.B = b1Var;
        this.L = cVar;
        this.R = i2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        int i2 = this.A;
        n2.m mVar = (n2.m) obj;
        ((Integer) obj2).getClass();
        switch (i2) {
            case 0:
                l0.c(this.B, this.L, mVar, n2.s.F(this.R | 1));
                break;
            default:
                l0.d(this.B, this.L, mVar, n2.s.F(this.R | 1));
                break;
        }
        return yb.y.f14813a;
    }
}
