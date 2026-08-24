package defpackage;

import android.hardware.camera2.CaptureResult;
import android.os.Build;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vz3  reason: default package */
/* loaded from: classes.dex */
public final class vz3 implements jk5 {
    public final /* synthetic */ wz3 A;

    public vz3(wz3 wz3Var) {
        this.A = wz3Var;
    }

    @Override // defpackage.jk5
    public final void x(yk5 yk5Var, long j, th thVar) {
        CaptureResult.Key key;
        if (Build.VERSION.SDK_INT >= 35) {
            wz3 wz3Var = this.A;
            if (wz3Var.c != null && wz3Var.e) {
                uh uhVar = (uh) thVar.L;
                key = CaptureResult.CONTROL_LOW_LIGHT_BOOST_STATE;
                key.getClass();
                uhVar.getClass();
                Integer num = (Integer) uhVar.A.get(key);
                if (num != null) {
                    int intValue = num.intValue();
                    s94 s94Var = wz3Var.f;
                    int i = 1;
                    if (intValue != 1) {
                        i = 0;
                    }
                    wz3Var.c(s94Var, i);
                }
            }
        }
    }
}
