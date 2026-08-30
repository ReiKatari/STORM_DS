package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y0 extends nc.l implements mc.l {
    public final /* synthetic */ y3.i1 B;
    public final /* synthetic */ long L;
    public final /* synthetic */ long R;
    public final /* synthetic */ a4.q0 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(y3.i1 i1Var, long j2, long j10, a4.q0 q0Var) {
        super(1);
        this.B = i1Var;
        this.L = j2;
        this.R = j10;
        this.X = q0Var;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        y3.h1 h1Var = (y3.h1) obj;
        long j2 = this.L;
        long j10 = this.R;
        h1Var.getClass();
        y3.i1 i1Var = this.B;
        y3.h1.a(h1Var, i1Var);
        i1Var.q0(x4.j.c(((((int) (j2 >> 32)) + ((int) (j10 >> 32))) << 32) | ((((int) (j2 & 4294967295L)) + ((int) (j10 & 4294967295L))) & 4294967295L), i1Var.X), 0.0f, this.X);
        return yb.y.f14813a;
    }
}
