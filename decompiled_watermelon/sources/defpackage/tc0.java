package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tc0  reason: default package */
/* loaded from: classes.dex */
public final class tc0 {
    public final jb0 a;

    public tc0(jb0 jb0Var) {
        jb0Var.getClass();
        this.a = jb0Var;
    }

    public static ArrayList a(tc0 tc0Var) {
        ArrayList arrayList;
        wa0 wa0Var = tc0Var.d().b;
        synchronized (wa0Var.f) {
            arrayList = wa0Var.g;
        }
        if (arrayList == null) {
            arrayList = wa0Var.d();
        }
        if (arrayList == null) {
            Log.w("CXCP", "Failed to load cameraIds from " + ((Object) ib0.a("CXCP-Camera2")));
        }
        return arrayList;
    }

    public static ce0 b(tc0 tc0Var, String str) {
        tc0Var.getClass();
        str.getClass();
        return tc0Var.d().c.d(str);
    }

    public static Set c(tc0 tc0Var) {
        Set concurrentCameraIds;
        wa0 wa0Var = tc0Var.d().b;
        if (Build.VERSION.SDK_INT < 30) {
            wa0Var.getClass();
            return up1.A;
        }
        synchronized (wa0Var.f) {
        }
        CameraManager cameraManager = (CameraManager) wa0Var.a.get();
        try {
            cameraManager.getClass();
            concurrentCameraIds = cameraManager.getConcurrentCameraIds();
            concurrentCameraIds.getClass();
            Log.d("CXCP", "Loaded ConcurrentCameraIdsSet " + concurrentCameraIds);
            Set<Set> set = concurrentCameraIds;
            ArrayList arrayList = new ArrayList(uq0.y0(set, 10));
            for (Set<String> set2 : set) {
                ArrayList arrayList2 = new ArrayList(uq0.y0(set2, 10));
                for (String str : set2) {
                    od0.a(str);
                    arrayList2.add(new od0(str));
                }
                arrayList.add(tq0.s1(arrayList2));
            }
            return tq0.s1(arrayList);
        } catch (CameraAccessException e) {
            Log.w("CXCP", "Failed to query CameraManager#getConcurrentStreamingCameraIds", e);
            return null;
        }
    }

    public final p90 d() {
        jb0 jb0Var = this.a;
        try {
            Trace.beginSection("getCameraBackend");
            jb0Var.d.getClass();
            p90 a = jb0Var.a("CXCP-Camera2");
            if (a != null) {
                return a;
            }
            throw new IllegalStateException(("Failed to load CameraBackend " + ((Object) ib0.a("CXCP-Camera2"))).toString());
        } finally {
            Trace.endSection();
        }
    }
}
