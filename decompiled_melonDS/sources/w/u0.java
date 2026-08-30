package w;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import j0.l2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u0 extends b0 {

    /* renamed from: b  reason: collision with root package name */
    public static final u0 f14054b = new Object();

    @Override // w.b0
    public final void a(l2 l2Var, d0.i1 i1Var) {
        CaptureRequest.Key key;
        CaptureRequest.Key key2;
        super.a(l2Var, i1Var);
        if (l2Var instanceof j0.z0) {
            j0.z0 z0Var = (j0.z0) l2Var;
            j0.g1 b10 = j0.g1.b();
            j0.g gVar = j0.z0.B;
            if (z0Var.e(gVar)) {
                int intValue = ((Integer) z0Var.g(gVar)).intValue();
                if (((ImageCapturePixelHDRPlusQuirk) z.a.f14847a.j(ImageCapturePixelHDRPlusQuirk.class)) != null) {
                    if (intValue == 0) {
                        key = CaptureRequest.CONTROL_ENABLE_ZSL;
                        b10.o(v.a.Z(key), Boolean.TRUE);
                    } else if (intValue == 1) {
                        key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                        b10.o(v.a.Z(key2), Boolean.FALSE);
                    }
                }
            }
            i1Var.i(new a0.b(13, j0.i1.a(b10)));
            return;
        }
        a0.j.h("config is not ImageCaptureConfig");
    }
}
