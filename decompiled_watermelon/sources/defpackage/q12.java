package defpackage;

import android.hardware.camera2.CaptureResult;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q12  reason: default package */
/* loaded from: classes.dex */
public final class q12 implements ra5 {
    public final /* synthetic */ gs0 A;

    public q12(gs0 gs0Var) {
        this.A = gs0Var;
    }

    @Override // defpackage.ra5
    public final void K(gb5 gb5Var, long j, hh hhVar) {
        ih ihVar = (ih) hhVar.L;
        CaptureResult.Key key = CaptureResult.CONTROL_AE_STATE;
        key.getClass();
        ihVar.getClass();
        Integer num = (Integer) ihVar.A.get(key);
        CaptureResult.Key key2 = CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION;
        key2.getClass();
        ihVar.getClass();
        Integer num2 = (Integer) ihVar.A.get(key2);
        gs0 gs0Var = this.A;
        if (num != null && num2 != null) {
            int intValue = num.intValue();
            if ((intValue == 2 || intValue == 3 || intValue == 4) && num2.intValue() == 0) {
                gs0Var.c0(0);
            }
        } else if (num2 != null && num2.intValue() == 0) {
            gs0Var.c0(0);
        }
    }
}
