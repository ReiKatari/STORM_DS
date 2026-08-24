package defpackage;

import android.hardware.camera2.CameraExtensionCharacteristics;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nc0  reason: default package */
/* loaded from: classes.dex */
public final class nc0 implements l54, hh7 {
    public final String A;
    public final int B;
    public final CameraExtensionCharacteristics L;
    public final go3 R;

    public nc0(String str, int i, CameraExtensionCharacteristics cameraExtensionCharacteristics) {
        str.getClass();
        this.A = str;
        this.B = i;
        this.L = cameraExtensionCharacteristics;
        new LinkedHashMap();
        new LinkedHashMap();
        new LinkedHashMap();
        xr3 xr3Var = xr3.PUBLICATION;
        kj2.M(xr3Var, new mc0(this, 0));
        kj2.M(xr3Var, new mc0(this, 1));
        this.R = kj2.M(xr3Var, new mc0(this, 2));
        kj2.M(xr3Var, new mc0(this, 3));
    }

    @Override // defpackage.hh7
    public final Object e(ar0 ar0Var) {
        if (ar0Var.equals(gh5.a(ma.p()))) {
            return this.L;
        }
        return null;
    }
}
