package a5;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l0 extends nc.l implements mc.a {
    public final /* synthetic */ nc.s B;
    public final /* synthetic */ m0 L;
    public final /* synthetic */ x4.k R;
    public final /* synthetic */ long X;
    public final /* synthetic */ long Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(nc.s sVar, m0 m0Var, x4.k kVar, long j2, long j10) {
        super(0);
        this.B = sVar;
        this.L = m0Var;
        this.R = kVar;
        this.X = j2;
        this.Y = j10;
    }

    @Override // mc.a
    public final Object b() {
        m0 m0Var = this.L;
        this.B.A = m0Var.getPositionProvider().d(this.R, this.X, m0Var.getParentLayoutDirection(), this.Y);
        return yb.y.f14813a;
    }
}
