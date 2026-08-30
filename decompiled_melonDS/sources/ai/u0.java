package ai;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ b3.p B;
    public final /* synthetic */ mc.p L;
    public final /* synthetic */ int R;

    public /* synthetic */ u0(b3.p pVar, mc.p pVar2, int i2, int i10) {
        this.A = i10;
        this.B = pVar;
        this.L = pVar2;
        this.R = i2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        int i2 = this.A;
        n2.m mVar = (n2.m) obj;
        ((Integer) obj2).intValue();
        switch (i2) {
            case 0:
                n.i(this.B, this.L, mVar, n2.s.F(this.R | 1));
                break;
            default:
                n.h(this.B, this.L, mVar, n2.s.F(this.R | 1));
                break;
        }
        return yb.y.f14813a;
    }
}
