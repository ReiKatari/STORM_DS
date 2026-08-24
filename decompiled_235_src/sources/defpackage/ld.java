package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ld  reason: default package */
/* loaded from: classes.dex */
public final class ld extends aj3 implements go2 {
    public final /* synthetic */ nd B;
    public final /* synthetic */ int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(nd ndVar, int i) {
        super(4);
        this.B = ndVar;
        this.L = i;
    }

    @Override // defpackage.go2
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue();
        nd ndVar = this.B;
        s63 s63Var = ndVar.A;
        ((AutofillManager) s63Var.B).notifyViewEntered(ndVar.L, this.L, new Rect(intValue, intValue2, intValue3, intValue4));
        return jg7.a;
    }
}
