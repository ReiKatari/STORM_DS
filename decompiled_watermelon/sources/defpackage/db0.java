package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: db0  reason: default package */
/* loaded from: classes.dex */
public final class db0 {
    public final Context a;
    public final ct6 b;
    public final qm4 c;
    public final q03 d;
    public final cm6 e;
    public final ArrayMap f;
    public final ArrayMap g;
    public final ArrayMap h;

    public db0(Context context, ct6 ct6Var, qm4 qm4Var, q03 q03Var, cm6 cm6Var) {
        ct6Var.getClass();
        qm4Var.getClass();
        q03Var.getClass();
        cm6Var.getClass();
        this.a = context;
        this.b = ct6Var;
        this.c = qm4Var;
        this.d = q03Var;
        this.e = cm6Var;
        this.f = new ArrayMap();
        this.g = new ArrayMap();
        this.h = new ArrayMap();
    }

    public static final fa0 a(db0 db0Var, String str, boolean z, int i) {
        String str2;
        db0Var.e.getClass();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(((Object) od0.b(str)) + "#readCameraExtensionMetadata");
            Log.d("CXCP", "Loading extension metadata for " + ((Object) od0.b(str)));
            fa0 fa0Var = new fa0(str, i, db0Var.e(str));
            long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
            if (!z) {
                str2 = "";
            } else if (z) {
                str2 = " (redacted)";
            } else {
                throw new RuntimeException();
            }
            Log.i("CXCP", "Loaded extension metadata for " + ((Object) od0.b(str)) + " in " + String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(elapsedRealtimeNanos2 / 1000000.0d)}, 1)) + str2);
            return fa0Var;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ia0 b(defpackage.db0 r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db0.b(db0, java.lang.String, boolean):ia0");
    }

    public static final boolean c(db0 db0Var) {
        boolean z;
        qm4 qm4Var = db0Var.c;
        qm4Var.getClass();
        if (b53.x(Build.FINGERPRINT, "robolectric")) {
            z = true;
        } else {
            if (!qm4Var.b) {
                Trace.beginSection("CXCP#checkCameraPermission");
                if (qm4Var.a.checkSelfPermission("android.permission.CAMERA") == 0) {
                    qm4Var.b = true;
                }
                Trace.endSection();
            }
            z = qm4Var.b;
        }
        return !z;
    }

    public final ce0 d(String str) {
        ce0 ce0Var;
        str.getClass();
        try {
            Trace.beginSection(((Object) od0.b(str)) + "#awaitMetadata");
            synchronized (this.f) {
                ce0Var = (ce0) this.f.get(str);
                if (ce0Var == null) {
                    if (!c(this)) {
                        ce0Var = b(this, str, false);
                        this.f.put(str, ce0Var);
                    } else {
                        ce0Var = b(this, str, true);
                    }
                }
            }
            return ce0Var;
        } finally {
            Trace.endSection();
        }
    }

    public final CameraExtensionCharacteristics e(String str) {
        CameraExtensionCharacteristics cameraExtensionCharacteristics;
        synchronized (this.h) {
            CameraExtensionCharacteristics e = dd.e(this.h.get(str));
            if (e != null) {
                return e;
            }
            Log.d("CXCP", "Retrieving CameraExtensionCharacteristics for " + ((Object) od0.b(str)));
            Object systemService = this.a.getSystemService("camera");
            systemService.getClass();
            str.getClass();
            cameraExtensionCharacteristics = ((CameraManager) systemService).getCameraExtensionCharacteristics(str);
            cameraExtensionCharacteristics.getClass();
            return cameraExtensionCharacteristics;
        }
    }
}
