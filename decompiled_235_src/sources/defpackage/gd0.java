package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gd0  reason: default package */
/* loaded from: classes.dex */
public final class gd0 {
    public final t57 a;
    public final nd0 b;
    public final mp5 c;

    public gd0(t57 t57Var, nd0 nd0Var, mp5 mp5Var) {
        t57Var.getClass();
        nd0Var.getClass();
        mp5Var.getClass();
        this.a = t57Var;
        this.b = nd0Var;
        this.c = mp5Var;
    }

    public static final void a(gd0 gd0Var, bf0 bf0Var) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        Surface surface = new Surface(surfaceTexture);
        sw s = g04.s(false);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (bf0Var.N(hf.b0(surface), new fd0(countDownLatch, s, surface, surfaceTexture))) {
            countDownLatch.await();
            return;
        }
        Log.e("CXCP", "Failed to create a blank capture session! Surfaces may not be disconnected properly.");
        if (s.a()) {
            surface.release();
            surfaceTexture.release();
        }
    }

    public final void b(bf0 bf0Var, CameraDevice cameraDevice, vd vdVar, bx bxVar, boolean z, boolean z2) {
        CameraDevice cameraDevice2;
        uz uzVar;
        bxVar.getClass();
        vr4 vr4Var = null;
        if (bf0Var != null) {
            cameraDevice2 = (CameraDevice) bf0Var.e(gh5.a(CameraDevice.class));
        } else {
            cameraDevice2 = null;
        }
        if (cameraDevice2 != null) {
            String id = cameraDevice2.getId();
            id.getClass();
            xf0.a(id);
            if (cameraDevice != null && !id.equals(cameraDevice.getId())) {
                StringBuilder t = i61.t("Unwrapped camera device has camera ID ", id, ", but the wrapped camera device has camera ID ");
                t.append(cameraDevice.getId());
                t.append('!');
                throw new IllegalStateException(t.toString().toString());
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                bf0Var.getClass();
                if (i >= 30) {
                    bxVar.e.remove(bf0Var);
                }
            }
            Log.d("CXCP", "handleQuirksBeforeClosing(" + cameraDevice2 + ')');
            String h = bf0Var.h();
            if (z) {
                try {
                    Trace.beginSection("Camera2DeviceCloserImpl#reopenCameraDevice");
                    Log.d("CXCP", "Reopening camera device");
                    c(cameraDevice2, vdVar);
                    uzVar = this.c.a(h, this);
                } finally {
                }
            } else {
                uzVar = new uz(bf0Var, vdVar);
            }
            bf0 bf0Var2 = uzVar.a;
            vd vdVar2 = uzVar.b;
            if (bf0Var2 != null && vdVar2 != null) {
                if (z2) {
                    try {
                        Trace.beginSection("Camera2DeviceCloserImpl#createCaptureSession");
                        Log.d("CXCP", "Creating an empty capture session before closing " + ((Object) xf0.b(h)));
                        a(this, bf0Var2);
                        Log.d("CXCP", "Created an empty capture session.");
                    } finally {
                    }
                }
                vr4Var = new vr4(bf0Var2, vdVar2);
            } else {
                Log.e("CXCP", "Failed to retain an opened camera device!");
            }
            if (vr4Var == null) {
                Log.e("CXCP", "Failed to handle quirks before closing the camera device!");
                bf0Var.u();
                bf0Var.a0();
                vdVar.d(cameraDevice2);
                return;
            }
            vd vdVar3 = (vd) vr4Var.B;
            Object e = ((bf0) vr4Var.A).e(gh5.a(CameraDevice.class));
            if (e != null) {
                bf0Var.u();
                c((CameraDevice) e, vdVar3);
                bf0Var.a0();
                if (z) {
                    vdVar.d(cameraDevice2);
                    return;
                }
                return;
            }
            i.m("Required value was null.");
        } else if (cameraDevice != null) {
            c(cameraDevice, vdVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [zg5, java.lang.Object] */
    public final void c(CameraDevice cameraDevice, vd vdVar) {
        String id = cameraDevice.getId();
        id.getClass();
        Log.d("CXCP", "closeCameraDevice(" + id + ')');
        ?? obj = new Object();
        if (((jg7) this.a.b(7000L, new en(cameraDevice, obj, null, 1))) == null) {
            Log.e("CXCP", "Failed to close CameraDevice(" + id + ") after 7000ms. The camera is likely in a bad state.");
        }
        String id2 = cameraDevice.getId();
        id2.getClass();
        xf0.a(id2);
        nd0 nd0Var = this.b;
        nd0Var.getClass();
        nd0Var.b.getClass();
        kg0 kg0Var = lg0.g;
        lg0 d = nd0Var.a.d(id2);
        kg0Var.getClass();
        if (kg0.c(d) && obj.A) {
            Log.d("CXCP", "Waiting for OnClosed from " + ((Object) xf0.b(id2)));
            if (vdVar.r.await(2000L, TimeUnit.MILLISECONDS)) {
                Log.d("CXCP", "Received OnClosed for " + ((Object) xf0.b(id2)));
                return;
            }
            Log.w("CXCP", "Failed to close " + ((Object) xf0.b(id2)) + " after 2000ms!");
        }
    }
}
