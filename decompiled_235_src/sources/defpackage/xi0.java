package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xi0  reason: default package */
/* loaded from: classes.dex */
public final class xi0 extends vi0 {
    public static final xi0 b = new Object();

    @Override // defpackage.vi0
    public final void a(zi7 zi7Var, dk0 dk0Var) {
        CaptureRequest.Key key;
        CaptureRequest.Key key2;
        zi7Var.getClass();
        super.a(zi7Var, dk0Var);
        if (zi7Var instanceof e23) {
            da4 d = da4.d();
            e23 e23Var = (e23) zi7Var;
            if (((ImageCapturePixelHDRPlusQuirk) si1.a().b(ImageCapturePixelHDRPlusQuirk.class)) != null) {
                xx xxVar = e23.B;
                if (e23Var.i(xxVar)) {
                    int intValue = ((Integer) e23Var.e(xxVar)).intValue();
                    if (intValue == 0) {
                        key = CaptureRequest.CONTROL_ENABLE_ZSL;
                        key.getClass();
                        d.m(nw7.T(key), Boolean.TRUE);
                    } else if (intValue == 1) {
                        key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                        key2.getClass();
                        d.m(nw7.T(key2), Boolean.FALSE);
                    }
                }
            }
            dk0Var.e(new os0(go4.a(d)));
            return;
        }
        i.h("config is not ImageCaptureConfig");
    }
}
