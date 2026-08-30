package y3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l extends nc.l implements mc.p {
    public static final l L = new l(2, 0);
    public static final l R = new l(2, 1);
    public final /* synthetic */ int B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i2, int i10) {
        super(i2);
        this.B = i10;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        switch (this.B) {
            case 0:
                n2.m mVar = (n2.m) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                if (!rVar.O(intValue & 1, z10)) {
                    rVar.R();
                }
                return yb.y.f14813a;
            default:
                a4.o0 o0Var = (a4.o0) obj;
                ((t0) obj2).getClass();
                return yb.y.f14813a;
        }
    }
}
