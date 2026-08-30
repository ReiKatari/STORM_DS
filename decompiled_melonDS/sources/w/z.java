package w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import j0.h2;
import j0.w1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14103a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14104b;

    public z(List list) {
        this.f14103a = 0;
        this.f14104b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) it.next();
            if (!(captureCallback instanceof a0)) {
                ((ArrayList) this.f14104b).add(captureCallback);
            }
        }
    }

    public static int a(CaptureRequest captureRequest) {
        Integer num;
        if (!(captureRequest.getTag() instanceof h2) || (num = (Integer) ((h2) captureRequest.getTag()).f7212a.get("CAPTURE_CONFIG_ID_KEY")) == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j2) {
        switch (this.f14103a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f14104b;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((CameraCaptureSession.CaptureCallback) arrayList.get(i2)).onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j2);
                }
                return;
            default:
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j2);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        h2 h2Var;
        switch (this.f14103a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f14104b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((CameraCaptureSession.CaptureCallback) obj).onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                Object tag = captureRequest.getTag();
                if (tag != null) {
                    p7.m.g("The tagBundle object from the CaptureResult is not a TagBundle object.", tag instanceof h2);
                    h2Var = (h2) tag;
                } else {
                    h2Var = h2.f7211b;
                }
                ((j0.m) this.f14104b).b(a(captureRequest), new p1.a0(18, h2Var, totalCaptureResult));
                return;
            default:
                synchronized (((p0) this.f14104b).f14010a) {
                    try {
                        w1 w1Var = ((p0) this.f14104b).f14015f;
                        if (w1Var != null) {
                            j0.p0 p0Var = w1Var.f7322g;
                            aj.g.o("CaptureSession", "Submit FLASH_MODE_OFF request");
                            p0 p0Var2 = (p0) this.f14104b;
                            p0Var2.f14023o.getClass();
                            p0Var2.j(Collections.singletonList(a0.m.f(p0Var)));
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        switch (this.f14103a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f14104b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((CameraCaptureSession.CaptureCallback) obj).onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                ((j0.m) this.f14104b).c(a(captureRequest), new na.f(j0.p.ERROR));
                return;
            default:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        switch (this.f14103a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f14104b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((CameraCaptureSession.CaptureCallback) obj).onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
                return;
            default:
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i2) {
        switch (this.f14103a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f14104b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((CameraCaptureSession.CaptureCallback) obj).onCaptureSequenceAborted(cameraCaptureSession, i2);
                }
                return;
            default:
                super.onCaptureSequenceAborted(cameraCaptureSession, i2);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i2, long j2) {
        switch (this.f14103a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f14104b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((CameraCaptureSession.CaptureCallback) obj).onCaptureSequenceCompleted(cameraCaptureSession, i2, j2);
                }
                return;
            default:
                super.onCaptureSequenceCompleted(cameraCaptureSession, i2, j2);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j2, long j10) {
        switch (this.f14103a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f14104b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((CameraCaptureSession.CaptureCallback) obj).onCaptureStarted(cameraCaptureSession, captureRequest, j2, j10);
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j2, j10);
                ((j0.m) this.f14104b).d(a(captureRequest));
                return;
            default:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j2, j10);
                return;
        }
    }

    public z(j0.m mVar) {
        this.f14103a = 1;
        if (mVar != null) {
            this.f14104b = mVar;
        } else {
            m9.o.i("cameraCaptureCallback is null");
            throw null;
        }
    }

    public z(p0 p0Var) {
        this.f14103a = 2;
        this.f14104b = p0Var;
    }
}
