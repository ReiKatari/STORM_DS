package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements mc.p {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ d1.i0 B;
    public final /* synthetic */ n2.w0 L;
    public final /* synthetic */ f1.w1 R;
    public final /* synthetic */ b3.p X;
    public final /* synthetic */ v2.c Y;

    public /* synthetic */ p(d1.i0 i0Var, n2.w0 w0Var, f1.w1 w1Var, b3.p pVar, v2.c cVar) {
        this.B = i0Var;
        this.L = w0Var;
        this.R = w1Var;
        this.X = pVar;
        this.Y = cVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        switch (this.A) {
            case 0:
                n2.m mVar = (n2.m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    i2.a(this.B, this.L, this.R, this.X, this.Y, rVar, 48);
                } else {
                    rVar.R();
                }
                return yb.y.f14813a;
            default:
                ((Integer) obj2).getClass();
                i2.a(this.B, this.L, this.R, this.X, this.Y, (n2.m) obj, n2.s.F(49));
                return yb.y.f14813a;
        }
    }

    public /* synthetic */ p(d1.i0 i0Var, n2.w0 w0Var, f1.w1 w1Var, b3.p pVar, v2.c cVar, int i2) {
        this.B = i0Var;
        this.L = w0Var;
        this.R = w1Var;
        this.X = pVar;
        this.Y = cVar;
    }
}
