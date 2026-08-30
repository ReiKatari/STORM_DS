package j0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class o0 {

    /* renamed from: a  reason: collision with root package name */
    public static final d0.r f7268a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new f1(2));
        f7268a = new d0.r(linkedHashSet);
    }

    public static void a(Context context, j0 j0Var, d0.r rVar) {
        Integer b10;
        if (Build.VERSION.SDK_INT >= 34 && a6.g0.f(context) != 0) {
            LinkedHashSet c4 = j0Var.c();
            aj.g.o("CameraValidator", "Virtual device with ID: " + a6.g0.f(context) + " has " + c4.size() + " cameras. Skipping validation.");
            return;
        }
        IllegalArgumentException e6 = null;
        if (rVar != null) {
            try {
                b10 = rVar.b();
                if (b10 == null) {
                    aj.g.y0("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e10) {
                aj.g.t("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e10);
                return;
            }
        } else {
            b10 = null;
        }
        aj.g.o("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + b10);
        PackageManager packageManager = context.getPackageManager();
        int i2 = 0;
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera")) {
                if (rVar != null) {
                    if (b10.intValue() == 1) {
                    }
                }
                d0.r.f3443c.c(j0Var.c());
                i2 = 1;
            }
        } catch (IllegalArgumentException e11) {
            e6 = e11;
            aj.g.z0("CameraValidator", "Camera LENS_FACING_BACK verification failed", e6);
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                if (rVar != null) {
                    if (b10.intValue() == 0) {
                    }
                }
                d0.r.f3442b.c(j0Var.c());
                i2++;
            }
        } catch (IllegalArgumentException e12) {
            e6 = e12;
            aj.g.z0("CameraValidator", "Camera LENS_FACING_FRONT verification failed", e6);
        }
        try {
            f7268a.c(j0Var.c());
            aj.g.o("CameraValidator", "Found a LENS_FACING_EXTERNAL camera");
            i2++;
        } catch (IllegalArgumentException unused) {
        }
        if (e6 == null) {
            return;
        }
        aj.g.s("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + j0Var.c());
        throw new n0(i2, e6);
    }
}
