package y3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n1 extends nc.l implements mc.p {
    public final /* synthetic */ b3.p B;
    public final /* synthetic */ mc.p L;
    public final /* synthetic */ int R;
    public final /* synthetic */ int X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(b3.p pVar, mc.p pVar2, int i2, int i10) {
        super(2);
        this.B = pVar;
        this.L = pVar2;
        this.R = i2;
        this.X = i10;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int F = n2.s.F(this.R | 1);
        int i2 = this.X;
        c0.b(this.B, this.L, (n2.m) obj, F, i2);
        return yb.y.f14813a;
    }
}
