package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cf0  reason: default package */
/* loaded from: classes.dex */
public final class cf0 {
    public final rd0 a;

    public cf0(rd0 rd0Var) {
        rd0Var.getClass();
        this.a = rd0Var;
    }

    public static ArrayList a(cf0 cf0Var) {
        ArrayList arrayList;
        ed0 ed0Var = cf0Var.d().b;
        synchronized (ed0Var.f) {
            arrayList = ed0Var.g;
        }
        if (arrayList == null) {
            arrayList = ed0Var.d();
        }
        if (arrayList == null) {
            Log.w("CXCP", "Failed to load cameraIds from " + ((Object) qd0.a("CXCP-Camera2")));
        }
        return arrayList;
    }

    public static lg0 b(cf0 cf0Var, String str) {
        cf0Var.getClass();
        str.getClass();
        return cf0Var.d().c.d(str);
    }

    public static Set c(cf0 cf0Var) {
        Set concurrentCameraIds;
        ed0 ed0Var = cf0Var.d().b;
        if (Build.VERSION.SDK_INT < 30) {
            ed0Var.getClass();
            return du1.A;
        }
        synchronized (ed0Var.f) {
        }
        CameraManager cameraManager = (CameraManager) ed0Var.a.get();
        try {
            cameraManager.getClass();
            concurrentCameraIds = cameraManager.getConcurrentCameraIds();
            concurrentCameraIds.getClass();
            Log.d("CXCP", "Loaded ConcurrentCameraIdsSet " + concurrentCameraIds);
            Set<Set> set = concurrentCameraIds;
            ArrayList arrayList = new ArrayList(ht0.v0(set, 10));
            for (Set<String> set2 : set) {
                ArrayList arrayList2 = new ArrayList(ht0.v0(set2, 10));
                for (String str : set2) {
                    xf0.a(str);
                    arrayList2.add(new xf0(str));
                }
                arrayList.add(gt0.p1(arrayList2));
            }
            return gt0.p1(arrayList);
        } catch (CameraAccessException e) {
            Log.w("CXCP", "Failed to query CameraManager#getConcurrentStreamingCameraIds", e);
            return null;
        }
    }

    public final xb0 d() {
        rd0 rd0Var = this.a;
        try {
            Trace.beginSection("getCameraBackend");
            rd0Var.d.getClass();
            xb0 a = rd0Var.a("CXCP-Camera2");
            if (a != null) {
                return a;
            }
            throw new IllegalStateException(("Failed to load CameraBackend " + ((Object) qd0.a("CXCP-Camera2"))).toString());
        } finally {
            Trace.endSection();
        }
    }
}
