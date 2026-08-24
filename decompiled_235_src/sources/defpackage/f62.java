package defpackage;

import android.hardware.camera2.CaptureResult;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f62  reason: default package */
/* loaded from: classes.dex */
public final class f62 implements jk5 {
    public final /* synthetic */ tu0 A;

    public f62(tu0 tu0Var) {
        this.A = tu0Var;
    }

    @Override // defpackage.jk5
    public final void J(yk5 yk5Var, long j, th thVar) {
        uh uhVar = (uh) thVar.L;
        CaptureResult.Key key = CaptureResult.CONTROL_AE_STATE;
        key.getClass();
        uhVar.getClass();
        Integer num = (Integer) uhVar.A.get(key);
        CaptureResult.Key key2 = CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION;
        key2.getClass();
        uhVar.getClass();
        Integer num2 = (Integer) uhVar.A.get(key2);
        tu0 tu0Var = this.A;
        if (num != null && num2 != null) {
            int intValue = num.intValue();
            if ((intValue == 2 || intValue == 3 || intValue == 4) && num2.intValue() == 0) {
                tu0Var.b0(0);
            }
        } else if (num2 != null && num2.intValue() == 0) {
            tu0Var.b0(0);
        }
    }
}
