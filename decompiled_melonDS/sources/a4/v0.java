package a4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v0 extends nc.l implements mc.a {
    public final /* synthetic */ x0 B;
    public final /* synthetic */ long L;
    public final /* synthetic */ long R;
    public final /* synthetic */ g2 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(x0 x0Var, long j2, long j10, g2 g2Var) {
        super(0);
        this.B = x0Var;
        this.L = j2;
        this.R = j10;
        this.X = g2Var;
    }

    @Override // mc.a
    public final Object b() {
        x0 x0Var = this.B;
        x0Var.I0().A = false;
        x0Var.I0().B = this.L;
        x0Var.I0().L = this.R;
        mc.l e6 = this.X.A.e();
        if (e6 != null) {
            e6.k(x0Var.I0());
        }
        return yb.y.f14813a;
    }
}
