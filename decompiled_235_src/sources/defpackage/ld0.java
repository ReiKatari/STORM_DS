package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ld0  reason: default package */
/* loaded from: classes.dex */
public final class ld0 {
    public final Context a;
    public final t57 b;
    public final vv4 c;
    public final u63 d;
    public final yx6 e;
    public final ArrayMap f;
    public final ArrayMap g;
    public final ArrayMap h;

    public ld0(Context context, t57 t57Var, vv4 vv4Var, u63 u63Var, yx6 yx6Var) {
        t57Var.getClass();
        vv4Var.getClass();
        u63Var.getClass();
        yx6Var.getClass();
        this.a = context;
        this.b = t57Var;
        this.c = vv4Var;
        this.d = u63Var;
        this.e = yx6Var;
        this.f = new ArrayMap();
        this.g = new ArrayMap();
        this.h = new ArrayMap();
    }

    public static final nc0 a(ld0 ld0Var, String str, boolean z, int i) {
        String str2;
        ld0Var.e.getClass();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(((Object) xf0.b(str)) + "#readCameraExtensionMetadata");
            Log.d("CXCP", "Loading extension metadata for " + ((Object) xf0.b(str)));
            nc0 nc0Var = new nc0(str, i, ld0Var.e(str));
            long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
            if (!z) {
                str2 = "";
            } else if (z) {
                str2 = " (redacted)";
            } else {
                throw new RuntimeException();
            }
            Log.i("CXCP", "Loaded extension metadata for " + ((Object) xf0.b(str)) + " in " + String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(elapsedRealtimeNanos2 / 1000000.0d)}, 1)) + str2);
            return nc0Var;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0092 A[Catch: all -> 0x0077, TryCatch #2 {all -> 0x0141, blocks: (B:3:0x0028, B:5:0x002c, B:7:0x0059, B:9:0x0063, B:11:0x0074, B:14:0x007a, B:17:0x0092, B:19:0x00a1, B:24:0x00b5, B:27:0x00f0, B:28:0x00f5, B:18:0x0097, B:15:0x0081), top: B:47:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097 A[Catch: all -> 0x0077, TryCatch #2 {all -> 0x0141, blocks: (B:3:0x0028, B:5:0x002c, B:7:0x0059, B:9:0x0063, B:11:0x0074, B:14:0x007a, B:17:0x0092, B:19:0x00a1, B:24:0x00b5, B:27:0x00f0, B:28:0x00f5, B:18:0x0097, B:15:0x0081), top: B:47:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final qc0 b(ld0 ld0Var, String str, boolean z) {
        Iterable iterable;
        Set K;
        String str2;
        CameraCharacteristics.Key key;
        u63 u63Var = ld0Var.d;
        ld0Var.e.getClass();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(((Object) xf0.b(str)) + "#readCameraMetadata");
            Log.d("CXCP", "Loading metadata for " + ((Object) xf0.b(str)));
            Object systemService = ld0Var.a.getSystemService("camera");
            systemService.getClass();
            CameraCharacteristics cameraCharacteristics = ((CameraManager) systemService).getCameraCharacteristics(str);
            cameraCharacteristics.getClass();
            if (Build.VERSION.SDK_INT >= 32) {
                key = CameraCharacteristics.INFO_DEVICE_STATE_SENSOR_ORIENTATION_MAP;
                if (cameraCharacteristics.get(key) != null) {
                    Set set = (Set) ((Map) u63Var.L).get(new xf0(str));
                    if (set == null) {
                        set = du1.A;
                    }
                    iterable = ii2.L(set, CameraCharacteristics.SENSOR_ORIENTATION);
                    if (iterable != null) {
                        K = (Set) u63Var.B;
                    } else {
                        K = ii2.K((Set) u63Var.B, iterable);
                    }
                    qc0 qc0Var = new qc0(str, cameraCharacteristics, ld0Var, K);
                    long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
                    if (z) {
                        str2 = "";
                    } else if (z) {
                        str2 = " (redacted)";
                    } else {
                        throw new RuntimeException();
                    }
                    Log.i("CXCP", "Loaded metadata for " + ((Object) xf0.b(str)) + " in " + String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(elapsedRealtimeNanos2 / 1000000.0d)}, 1)) + str2);
                    return qc0Var;
                }
            }
            iterable = (Set) ((Map) u63Var.L).get(new xf0(str));
            if (iterable != null) {
            }
            qc0 qc0Var2 = new qc0(str, cameraCharacteristics, ld0Var, K);
            long elapsedRealtimeNanos22 = SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
            if (z) {
            }
            Log.i("CXCP", "Loaded metadata for " + ((Object) xf0.b(str)) + " in " + String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(elapsedRealtimeNanos22 / 1000000.0d)}, 1)) + str2);
            return qc0Var2;
        } finally {
            Trace.endSection();
        }
    }

    public static final boolean c(ld0 ld0Var) {
        boolean z;
        vv4 vv4Var = ld0Var.c;
        vv4Var.getClass();
        if (nb3.k(Build.FINGERPRINT, "robolectric")) {
            z = true;
        } else {
            if (!vv4Var.b) {
                Trace.beginSection("CXCP#checkCameraPermission");
                if (vv4Var.a.checkSelfPermission("android.permission.CAMERA") == 0) {
                    vv4Var.b = true;
                }
                Trace.endSection();
            }
            z = vv4Var.b;
        }
        return !z;
    }

    public final lg0 d(String str) {
        lg0 lg0Var;
        str.getClass();
        try {
            Trace.beginSection(((Object) xf0.b(str)) + "#awaitMetadata");
            synchronized (this.f) {
                lg0Var = (lg0) this.f.get(str);
                if (lg0Var == null) {
                    if (!c(this)) {
                        lg0Var = b(this, str, false);
                        this.f.put(str, lg0Var);
                    } else {
                        lg0Var = b(this, str, true);
                    }
                }
            }
            return lg0Var;
        } finally {
            Trace.endSection();
        }
    }

    public final CameraExtensionCharacteristics e(String str) {
        CameraExtensionCharacteristics cameraExtensionCharacteristics;
        synchronized (this.h) {
            CameraExtensionCharacteristics e = ma.e(this.h.get(str));
            if (e != null) {
                return e;
            }
            Log.d("CXCP", "Retrieving CameraExtensionCharacteristics for " + ((Object) xf0.b(str)));
            Object systemService = this.a.getSystemService("camera");
            systemService.getClass();
            str.getClass();
            cameraExtensionCharacteristics = ((CameraManager) systemService).getCameraExtensionCharacteristics(str);
            cameraExtensionCharacteristics.getClass();
            return cameraExtensionCharacteristics;
        }
    }
}
