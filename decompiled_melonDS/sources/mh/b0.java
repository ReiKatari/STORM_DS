package mh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ b3.p B;
    public final /* synthetic */ cd.h L;

    public /* synthetic */ b0(b3.p pVar, cd.h hVar, int i2, int i10) {
        this.A = i10;
        this.B = pVar;
        this.L = hVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        int i2 = this.A;
        n2.m mVar = (n2.m) obj;
        ((Integer) obj2).getClass();
        switch (i2) {
            case 0:
                g0.f(this.B, this.L, mVar, n2.s.F(7));
                break;
            default:
                g0.b(this.B, this.L, mVar, n2.s.F(1));
                break;
        }
        return yb.y.f14813a;
    }
}
