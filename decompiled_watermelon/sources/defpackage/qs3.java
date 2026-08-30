package defpackage;

import android.hardware.camera2.CaptureResult;
import android.os.Build;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qs3  reason: default package */
/* loaded from: classes.dex */
public final class qs3 implements ra5 {
    public final /* synthetic */ rs3 A;

    public qs3(rs3 rs3Var) {
        this.A = rs3Var;
    }

    @Override // defpackage.ra5
    public final void i(gb5 gb5Var, long j, hh hhVar) {
        CaptureResult.Key key;
        if (Build.VERSION.SDK_INT >= 35) {
            rs3 rs3Var = this.A;
            if (rs3Var.c != null && rs3Var.e) {
                ih ihVar = (ih) hhVar.L;
                key = CaptureResult.CONTROL_LOW_LIGHT_BOOST_STATE;
                key.getClass();
                ihVar.getClass();
                Integer num = (Integer) ihVar.A.get(key);
                if (num != null) {
                    int intValue = num.intValue();
                    m14 m14Var = rs3Var.f;
                    int i = 1;
                    if (intValue != 1) {
                        i = 0;
                    }
                    rs3Var.c(m14Var, i);
                }
            }
        }
    }
}
