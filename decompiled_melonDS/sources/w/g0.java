package w;

import android.hardware.camera2.CameraCaptureSession;
import android.media.ImageWriter;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g0 extends CameraCaptureSession.StateCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13924a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f13925b;

    public g0(List list) {
        this.f13924a = 0;
        this.f13925b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.StateCallback stateCallback = (CameraCaptureSession.StateCallback) it.next();
            if (!(stateCallback instanceof h0)) {
                ((ArrayList) this.f13925b).add(stateCallback);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onActive(CameraCaptureSession cameraCaptureSession) {
        switch (this.f13924a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f13925b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((CameraCaptureSession.StateCallback) obj).onActive(cameraCaptureSession);
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                g1 g1Var = (g1) this.f13925b;
                g1Var.j(cameraCaptureSession);
                g1Var.a(g1Var);
                return;
            default:
                super.onActive(cameraCaptureSession);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        switch (this.f13924a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f13925b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((CameraCaptureSession.StateCallback) obj).onCaptureQueueEmpty(cameraCaptureSession);
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                g1 g1Var = (g1) this.f13925b;
                g1Var.j(cameraCaptureSession);
                g1Var.b(g1Var);
                return;
            default:
                super.onCaptureQueueEmpty(cameraCaptureSession);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f13924a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f13925b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((CameraCaptureSession.StateCallback) obj).onClosed(cameraCaptureSession);
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                g1 g1Var = (g1) this.f13925b;
                g1Var.j(cameraCaptureSession);
                g1Var.c(g1Var);
                return;
            default:
                super.onClosed(cameraCaptureSession);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        b5.i iVar;
        switch (this.f13924a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f13925b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((CameraCaptureSession.StateCallback) obj).onConfigureFailed(cameraCaptureSession);
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                try {
                    ((g1) this.f13925b).j(cameraCaptureSession);
                    g1 g1Var = (g1) this.f13925b;
                    g1Var.d(g1Var);
                    synchronized (((g1) this.f13925b).f13926a) {
                        p7.m.l(((g1) this.f13925b).f13934i, "OpenCaptureSession completer should not null");
                        g1 g1Var2 = (g1) this.f13925b;
                        iVar = g1Var2.f13934i;
                        g1Var2.f13934i = null;
                    }
                    iVar.c(new IllegalStateException("onConfigureFailed"));
                    return;
                } catch (Throwable th2) {
                    synchronized (((g1) this.f13925b).f13926a) {
                        p7.m.l(((g1) this.f13925b).f13934i, "OpenCaptureSession completer should not null");
                        g1 g1Var3 = (g1) this.f13925b;
                        b5.i iVar2 = g1Var3.f13934i;
                        g1Var3.f13934i = null;
                        iVar2.c(new IllegalStateException("onConfigureFailed"));
                        throw th2;
                    }
                }
            default:
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        b5.i iVar;
        switch (this.f13924a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f13925b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((CameraCaptureSession.StateCallback) obj).onConfigured(cameraCaptureSession);
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                try {
                    ((g1) this.f13925b).j(cameraCaptureSession);
                    g1 g1Var = (g1) this.f13925b;
                    g1Var.e(g1Var);
                    synchronized (((g1) this.f13925b).f13926a) {
                        p7.m.l(((g1) this.f13925b).f13934i, "OpenCaptureSession completer should not null");
                        g1 g1Var2 = (g1) this.f13925b;
                        iVar = g1Var2.f13934i;
                        g1Var2.f13934i = null;
                    }
                    iVar.b(null);
                    return;
                } catch (Throwable th2) {
                    synchronized (((g1) this.f13925b).f13926a) {
                        p7.m.l(((g1) this.f13925b).f13934i, "OpenCaptureSession completer should not null");
                        g1 g1Var3 = (g1) this.f13925b;
                        b5.i iVar2 = g1Var3.f13934i;
                        g1Var3.f13934i = null;
                        iVar2.b(null);
                        throw th2;
                    }
                }
            default:
                Surface inputSurface = cameraCaptureSession.getInputSurface();
                if (inputSurface != null) {
                    p1.a0 a0Var = (p1.a0) this.f13925b;
                    ImageWriter newInstance = ImageWriter.newInstance(inputSurface, 1);
                    if (((AtomicBoolean) a0Var.L).get()) {
                        if (((ImageWriter) a0Var.B) != null) {
                            aj.g.y0("ZslControlImpl", "ImageWriter already existed in the ImageWriter holder. Closing the previous one.");
                            ((ImageWriter) a0Var.B).close();
                        }
                        a0Var.B = newInstance;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onReady(CameraCaptureSession cameraCaptureSession) {
        switch (this.f13924a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f13925b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((CameraCaptureSession.StateCallback) obj).onReady(cameraCaptureSession);
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                g1 g1Var = (g1) this.f13925b;
                g1Var.j(cameraCaptureSession);
                g1Var.f(g1Var);
                return;
            default:
                super.onReady(cameraCaptureSession);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        switch (this.f13924a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f13925b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((CameraCaptureSession.StateCallback) obj).onSurfacePrepared(cameraCaptureSession, surface);
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                g1 g1Var = (g1) this.f13925b;
                g1Var.j(cameraCaptureSession);
                g1Var.h(g1Var, surface);
                return;
            default:
                super.onSurfacePrepared(cameraCaptureSession, surface);
                return;
        }
    }

    private final void a(CameraCaptureSession cameraCaptureSession) {
    }

    public /* synthetic */ g0(int i2, Object obj) {
        this.f13924a = i2;
        this.f13925b = obj;
    }
}
