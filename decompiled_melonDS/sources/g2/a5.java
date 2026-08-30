package g2;

import java.util.Locale;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class a5 implements mc.q {
    public final /* synthetic */ int A;
    public final /* synthetic */ String B;

    public /* synthetic */ a5(String str, int i2) {
        this.A = i2;
        this.B = str;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        boolean z10;
        boolean z11;
        switch (this.A) {
            case 0:
                l1.p1 p1Var = (l1.p1) obj;
                n2.m mVar = (n2.m) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 17) != 16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    e7.b(this.B, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 131070);
                } else {
                    rVar.R();
                }
                return yb.y.f14813a;
            default:
                n2.m mVar2 = (n2.m) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((l1.p1) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n2.r rVar2 = (n2.r) mVar2;
                if (rVar2.O(intValue2 & 1, z11)) {
                    String upperCase = this.B.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    e7.b(upperCase, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar2, 0, 0, 131070);
                } else {
                    rVar2.R();
                }
                return yb.y.f14813a;
        }
    }
}
