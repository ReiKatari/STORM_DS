package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: og0  reason: default package */
/* loaded from: classes.dex */
public final class og0 extends mg0 {
    public static final og0 b = new Object();

    @Override // defpackage.mg0
    public final void a(b57 b57Var, vh0 vh0Var) {
        CaptureRequest.Key key;
        CaptureRequest.Key key2;
        b57Var.getClass();
        super.a(b57Var, vh0Var);
        if (b57Var instanceof aw2) {
            x14 f = x14.f();
            aw2 aw2Var = (aw2) b57Var;
            if (((ImageCapturePixelHDRPlusQuirk) oe1.a().b(ImageCapturePixelHDRPlusQuirk.class)) != null) {
                uw uwVar = aw2.B;
                if (aw2Var.a(uwVar)) {
                    int intValue = ((Integer) aw2Var.g(uwVar)).intValue();
                    if (intValue == 0) {
                        key = CaptureRequest.CONTROL_ENABLE_ZSL;
                        key.getClass();
                        f.r(dt3.a0(key), Boolean.TRUE);
                    } else if (intValue == 1) {
                        key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                        key2.getClass();
                        f.r(dt3.a0(key2), Boolean.FALSE);
                    }
                }
            }
            vh0Var.d(new bq0(ef4.b(f)));
            return;
        }
        i.i("config is not ImageCaptureConfig");
    }
}
