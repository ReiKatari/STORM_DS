package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: be0  reason: default package */
/* loaded from: classes.dex */
public final class be0 {
    public static final /* synthetic */ be0 a = new Object();
    public static final int[] b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, be0] */
    static {
        HashMap hashMap = tx3.c;
        hk2.j(q75.a(cg0.class), "androidx.camera.camera2.pipe.scalar.streamConfigurationMap");
        hk2.j(q75.a(de0.class), "androidx.camera.camera2.pipe.scalar.multiResolutionStreamConfigurationMap");
        hk2.j(q75.a(ec0.class), "androidx.camera.camera2.pipe.request.availableColorSpaceProfilesMap");
        b = new int[0];
    }

    public static boolean a(ce0 ce0Var) {
        ce0Var.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE;
        key.getClass();
        ia0 ia0Var = (ia0) ce0Var;
        Float f = (Float) ia0Var.c(key);
        if (f != null) {
            if (f.floatValue() <= RecyclerView.A1) {
                return false;
            }
        } else {
            CameraCharacteristics.Key key2 = CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
            key2.getClass();
            int[] iArr = (int[]) ia0Var.c(key2);
            if (iArr != null) {
                if (!nu.Y(iArr, 1) && !nu.Y(iArr, 2) && !nu.Y(iArr, 4) && !nu.Y(iArr, 3)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean b(ce0 ce0Var) {
        ce0Var.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            ce0.g.getClass();
            CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES;
            key.getClass();
            int[] iArr = (int[]) ((ia0) ce0Var).c(key);
            if (iArr == null) {
                iArr = b;
            }
            return nu.Y(iArr, 2);
        }
        return false;
    }

    public static boolean c(ce0 ce0Var) {
        ce0Var.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        key.getClass();
        Integer num = (Integer) ((ia0) ce0Var).c(key);
        if (num != null && num.intValue() == 2) {
            return true;
        }
        return false;
    }
}
