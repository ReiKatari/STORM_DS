package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ya0  reason: default package */
/* loaded from: classes.dex */
public final class ya0 {
    public final ct6 a;
    public final fb0 b;
    public final pf5 c;

    public ya0(ct6 ct6Var, fb0 fb0Var, pf5 pf5Var) {
        ct6Var.getClass();
        fb0Var.getClass();
        pf5Var.getClass();
        this.a = ct6Var;
        this.b = fb0Var;
        this.c = pf5Var;
    }

    public static final void a(ya0 ya0Var, sc0 sc0Var) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        Surface surface = new Surface(surfaceTexture);
        aw e = w81.e(false);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (sc0Var.d(l07.b0(surface), new xa0(countDownLatch, e, surface, surfaceTexture))) {
            countDownLatch.await();
            return;
        }
        Log.e("CXCP", "Failed to create a blank capture session! Surfaces may not be disconnected properly.");
        if (e.a()) {
            surface.release();
            surfaceTexture.release();
        }
    }

    public final void b(sc0 sc0Var, CameraDevice cameraDevice, hd hdVar, jw jwVar, boolean z, boolean z2) {
        CameraDevice cameraDevice2;
        dy dyVar;
        jwVar.getClass();
        ti4 ti4Var = null;
        if (sc0Var != null) {
            cameraDevice2 = (CameraDevice) sc0Var.p(q75.a(CameraDevice.class));
        } else {
            cameraDevice2 = null;
        }
        if (cameraDevice2 != null) {
            String id = cameraDevice2.getId();
            id.getClass();
            od0.a(id);
            if (cameraDevice != null && !id.equals(cameraDevice.getId())) {
                StringBuilder u = b31.u("Unwrapped camera device has camera ID ", id, ", but the wrapped camera device has camera ID ");
                u.append(cameraDevice.getId());
                u.append('!');
                throw new IllegalStateException(u.toString().toString());
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                sc0Var.getClass();
                if (i >= 30) {
                    jwVar.e.remove(sc0Var);
                }
            }
            Log.d("CXCP", "handleQuirksBeforeClosing(" + cameraDevice2 + ')');
            String w = sc0Var.w();
            if (z) {
                try {
                    Trace.beginSection("Camera2DeviceCloserImpl#reopenCameraDevice");
                    Log.d("CXCP", "Reopening camera device");
                    c(cameraDevice2, hdVar);
                    dyVar = this.c.a(w, this);
                } finally {
                }
            } else {
                dyVar = new dy(sc0Var, hdVar);
            }
            sc0 sc0Var2 = dyVar.a;
            hd hdVar2 = dyVar.b;
            if (sc0Var2 != null && hdVar2 != null) {
                if (z2) {
                    try {
                        Trace.beginSection("Camera2DeviceCloserImpl#createCaptureSession");
                        Log.d("CXCP", "Creating an empty capture session before closing " + ((Object) od0.b(w)));
                        a(this, sc0Var2);
                        Log.d("CXCP", "Created an empty capture session.");
                    } finally {
                    }
                }
                ti4Var = new ti4(sc0Var2, hdVar2);
            } else {
                Log.e("CXCP", "Failed to retain an opened camera device!");
            }
            if (ti4Var == null) {
                Log.e("CXCP", "Failed to handle quirks before closing the camera device!");
                sc0Var.J();
                sc0Var.D();
                hdVar.d(cameraDevice2);
                return;
            }
            hd hdVar3 = (hd) ti4Var.B;
            Object p = ((sc0) ti4Var.A).p(q75.a(CameraDevice.class));
            if (p != null) {
                sc0Var.J();
                c((CameraDevice) p, hdVar3);
                sc0Var.D();
                if (z) {
                    hdVar.d(cameraDevice2);
                    return;
                }
                return;
            }
            i.n("Required value was null.");
        } else if (cameraDevice != null) {
            c(cameraDevice, hdVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [j75, java.lang.Object] */
    public final void c(CameraDevice cameraDevice, hd hdVar) {
        String id = cameraDevice.getId();
        id.getClass();
        Log.d("CXCP", "closeCameraDevice(" + id + ')');
        ?? obj = new Object();
        if (((o27) this.a.b(7000L, new sm(cameraDevice, obj, null, 1))) == null) {
            Log.e("CXCP", "Failed to close CameraDevice(" + id + ") after 7000ms. The camera is likely in a bad state.");
        }
        String id2 = cameraDevice.getId();
        id2.getClass();
        od0.a(id2);
        fb0 fb0Var = this.b;
        fb0Var.getClass();
        fb0Var.b.getClass();
        be0 be0Var = ce0.g;
        ce0 d = fb0Var.a.d(id2);
        be0Var.getClass();
        if (be0.c(d) && obj.A) {
            Log.d("CXCP", "Waiting for OnClosed from " + ((Object) od0.b(id2)));
            if (hdVar.r.await(2000L, TimeUnit.MILLISECONDS)) {
                Log.d("CXCP", "Received OnClosed for " + ((Object) od0.b(id2)));
                return;
            }
            Log.w("CXCP", "Failed to close " + ((Object) od0.b(id2)) + " after 2000ms!");
        }
    }
}
