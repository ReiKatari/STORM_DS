package c3;

import a4.o0;
import android.view.autofill.AutofillManager;
import mc.r;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends nc.l implements r {
    public final /* synthetic */ d B;
    public final /* synthetic */ o0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, o0 o0Var) {
        super(4);
        this.B = dVar;
        this.L = o0Var;
    }

    @Override // mc.r
    public final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue();
        d dVar = this.B;
        dVar.Y.set(intValue, intValue2, intValue3, intValue4);
        a0.b bVar = dVar.A;
        ((AutofillManager) bVar.B).requestAutofill(dVar.L, this.L.B, dVar.Y);
        return y.f14813a;
    }
}
