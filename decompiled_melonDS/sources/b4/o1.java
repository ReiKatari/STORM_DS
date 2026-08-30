package b4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o1 extends nc.l implements mc.p {
    public static final o1 B = new nc.l(2);

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
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
    }
}
