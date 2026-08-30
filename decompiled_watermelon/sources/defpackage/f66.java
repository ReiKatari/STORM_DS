package defpackage;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f66  reason: default package */
/* loaded from: classes.dex */
public abstract class f66 {
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
        int a = a(sidecarDeviceState);
        if (a >= 0 && a <= 4) {
            return a;
        }
        return 0;
    }

    public static List c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        List list;
        pp1 pp1Var = pp1.A;
        sidecarWindowLayoutInfo.getClass();
        try {
            try {
                list = sidecarWindowLayoutInfo.displayFeatures;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            if (list != null) {
                return list;
            }
            return pp1Var;
        } catch (NoSuchFieldError unused2) {
            Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
            invoke.getClass();
            return (List) invoke;
        }
    }

    public static void d(SidecarDeviceState sidecarDeviceState, int i) {
        try {
            try {
                sidecarDeviceState.posture = i;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } catch (NoSuchFieldError unused2) {
            SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i));
        }
    }
}
