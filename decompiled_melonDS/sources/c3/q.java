package c3;

import android.view.ViewStructure;
import mc.r;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q extends nc.l implements r {
    public final /* synthetic */ ViewStructure B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ViewStructure viewStructure) {
        super(4);
        this.B = viewStructure;
    }

    @Override // mc.r
    public final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        this.B.setDimens(intValue, intValue2, 0, 0, intValue3 - intValue, ((Number) obj4).intValue() - intValue2);
        return y.f14813a;
    }
}
