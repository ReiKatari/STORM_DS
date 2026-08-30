package m8;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import zb.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class f {
    public static int a(SidecarDeviceState sidecarDeviceState) {
        sidecarDeviceState.getClass();
        try {
            try {
                return sidecarDeviceState.posture;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        } catch (NoSuchFieldError unused2) {
            Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
            invoke.getClass();
            return ((Integer) invoke).intValue();
        }
    }

    public static int b(SidecarDeviceState sidecarDeviceState) {
        sidecarDeviceState.getClass();
        int a10 = a(sidecarDeviceState);
        if (a10 >= 0 && a10 <= 4) {
            return a10;
        }
        return 0;
    }

    public static List c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        List list;
        q qVar = q.A;
        sidecarWindowLayoutInfo.getClass();
        try {
            try {
                list = sidecarWindowLayoutInfo.displayFeatures;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            if (list != null) {
                return list;
            }
            return qVar;
        } catch (NoSuchFieldError unused2) {
            Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
            invoke.getClass();
            return (List) invoke;
        }
    }

    public static void d(SidecarDeviceState sidecarDeviceState, int i2) {
        try {
            try {
                sidecarDeviceState.posture = i2;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } catch (NoSuchFieldError unused2) {
            SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i2));
        }
    }
}
