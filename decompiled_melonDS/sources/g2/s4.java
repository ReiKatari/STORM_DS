package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class s4 implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ w4 B;

    public /* synthetic */ s4(w4 w4Var, int i2) {
        this.A = i2;
        this.B = w4Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        switch (this.A) {
            case 0:
                v2.c cVar = n0.f5285j;
                n2.m mVar = (n2.m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    w4 w4Var = this.B;
                    w4Var.getClass();
                    cVar.i(w4Var, rVar, 0);
                } else {
                    rVar.R();
                }
                return yb.y.f14813a;
            default:
                n2.m mVar2 = (n2.m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n2.r rVar2 = (n2.r) mVar2;
                if (rVar2.O(intValue2 & 1, z11)) {
                    e7.b(this.B.f5449a, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar2, 0, 0, 131070);
                } else {
                    rVar2.R();
                }
                return yb.y.f14813a;
        }
    }
}
