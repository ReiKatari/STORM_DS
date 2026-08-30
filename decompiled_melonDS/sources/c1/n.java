package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n extends nc.l implements mc.l {
    public final /* synthetic */ y3.i1[] B;
    public final /* synthetic */ o L;
    public final /* synthetic */ int R;
    public final /* synthetic */ int X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(y3.i1[] i1VarArr, o oVar, int i2, int i10) {
        super(1);
        this.B = i1VarArr;
        this.L = oVar;
        this.R = i2;
        this.X = i10;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        y3.i1[] i1VarArr;
        y3.h1 h1Var = (y3.h1) obj;
        for (y3.i1 i1Var : this.B) {
            if (i1Var != null) {
                long a10 = this.L.f2485a.f2533b.a((i1Var.A << 32) | (i1Var.B & 4294967295L), (this.R << 32) | (this.X & 4294967295L), x4.m.Ltr);
                y3.h1.k(h1Var, i1Var, (int) (a10 >> 32), (int) (a10 & 4294967295L));
            }
        }
        return yb.y.f14813a;
    }
}
