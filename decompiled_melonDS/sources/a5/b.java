package a5;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends nc.l implements mc.l {
    public final /* synthetic */ int B;
    public final /* synthetic */ i0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(i0 i0Var, int i2) {
        super(1);
        this.B = i2;
        this.L = i0Var;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        switch (this.B) {
            case 0:
                n2.h0 h0Var = (n2.h0) obj;
                i0 i0Var = this.L;
                i0Var.show();
                return new a(0, i0Var);
            default:
                d.w wVar = (d.w) obj;
                i0 i0Var2 = this.L;
                if (i0Var2.Y.f390a) {
                    i0Var2.X.b();
                }
                return yb.y.f14813a;
        }
    }
}
