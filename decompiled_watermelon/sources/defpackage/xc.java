package defpackage;

import android.view.autofill.AutofillManager;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xc  reason: default package */
/* loaded from: classes.dex */
public final class xc extends ic3 implements cj2 {
    public final /* synthetic */ yc B;
    public final /* synthetic */ vf3 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc(yc ycVar, vf3 vf3Var) {
        super(4);
        this.B = ycVar;
        this.L = vf3Var;
    }

    @Override // defpackage.cj2
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue();
        yc ycVar = this.B;
        ycVar.Y.set(intValue, intValue2, intValue3, intValue4);
        ka3 ka3Var = ycVar.A;
        ((AutofillManager) ka3Var.B).requestAutofill(ycVar.L, this.L.B, ycVar.Y);
        return o27.a;
    }
}
