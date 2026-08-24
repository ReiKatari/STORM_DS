package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kg0  reason: default package */
/* loaded from: classes.dex */
public final class kg0 {
    public static final /* synthetic */ kg0 a = new Object();
    public static final int[] b;

    /* JADX WARN: Type inference failed for: r0v0, types: [kg0, java.lang.Object] */
    static {
        HashMap hashMap = k54.c;
        qo2.s(gh5.a(li0.class), "androidx.camera.camera2.pipe.scalar.streamConfigurationMap");
        qo2.s(gh5.a(mg0.class), "androidx.camera.camera2.pipe.scalar.multiResolutionStreamConfigurationMap");
        qo2.s(gh5.a(ne0.class), "androidx.camera.camera2.pipe.request.availableColorSpaceProfilesMap");
        b = new int[0];
    }

    public static boolean a(lg0 lg0Var) {
        lg0Var.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE;
        key.getClass();
        qc0 qc0Var = (qc0) lg0Var;
        Float f = (Float) qc0Var.c(key);
        if (f != null) {
            if (f.floatValue() <= RecyclerView.B1) {
                return false;
            }
        } else {
            CameraCharacteristics.Key key2 = CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
            key2.getClass();
            int[] iArr = (int[]) qc0Var.c(key2);
            if (iArr != null) {
                if (!fv.m0(iArr, 1) && !fv.m0(iArr, 2) && !fv.m0(iArr, 4) && !fv.m0(iArr, 3)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean b(lg0 lg0Var) {
        lg0Var.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            lg0.g.getClass();
            CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES;
            key.getClass();
            int[] iArr = (int[]) ((qc0) lg0Var).c(key);
            if (iArr == null) {
                iArr = b;
            }
            return fv.m0(iArr, 2);
        }
        return false;
    }

    public static boolean c(lg0 lg0Var) {
        lg0Var.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        key.getClass();
        Integer num = (Integer) ((qc0) lg0Var).c(key);
        if (num != null && num.intValue() == 2) {
            return true;
        }
        return false;
    }
}
