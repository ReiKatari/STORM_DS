package c3;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;
import mc.r;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends nc.l implements r {
    public final /* synthetic */ d B;
    public final /* synthetic */ int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, int i2) {
        super(4);
        this.B = dVar;
        this.L = i2;
    }

    @Override // mc.r
    public final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue();
        d dVar = this.B;
        a0.b bVar = dVar.A;
        ((AutofillManager) bVar.B).notifyViewEntered(dVar.L, this.L, new Rect(intValue, intValue2, intValue3, intValue4));
        return y.f14813a;
    }
}
