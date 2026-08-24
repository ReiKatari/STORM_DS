package defpackage;

import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CameraExtensionSession$ExtensionCaptureCallback;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sd  reason: default package */
/* loaded from: classes.dex */
public final class sd extends CameraExtensionSession$ExtensionCaptureCallback {
    public final /* synthetic */ int a;
    public final vc0 b;
    public final /* synthetic */ td c;
    public final Serializable d;

    public sd(td tdVar, vc0 vc0Var) {
        this.a = 0;
        this.c = tdVar;
        this.b = vc0Var;
        this.d = new ConcurrentLinkedQueue();
    }

    public final void onCaptureFailed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
        int i = this.a;
        vc0 vc0Var = this.b;
        Serializable serializable = this.d;
        cameraExtensionSession.getClass();
        captureRequest.getClass();
        switch (i) {
            case 0:
                if (((ConcurrentLinkedQueue) serializable).isEmpty()) {
                    td tdVar = this.c;
                    ww wwVar = tdVar.X;
                    wwVar.getClass();
                    long incrementAndGet = ww.b.incrementAndGet(wwVar);
                    tdVar.Y.put(cameraExtensionSession, Long.valueOf(incrementAndGet));
                    ((ConcurrentLinkedQueue) serializable).add(Long.valueOf(incrementAndGet));
                }
                Object remove = ((ConcurrentLinkedQueue) serializable).remove();
                remove.getClass();
                vc0Var.d(captureRequest, ((Number) remove).longValue());
                return;
            default:
                Object obj = ((LinkedHashMap) serializable).get(captureRequest);
                obj.getClass();
                LinkedHashMap linkedHashMap = (LinkedHashMap) serializable;
                if (((List) obj).size() == 1) {
                    Object obj2 = linkedHashMap.get(captureRequest);
                    obj2.getClass();
                    vc0Var.d(captureRequest, ((Number) ((List) obj2).get(0)).longValue());
                    return;
                }
                StringBuilder sb = new StringBuilder("onCaptureFailed is not triggered for repeating requests. Request frame numbers: ");
                Object obj3 = linkedHashMap.get(captureRequest);
                obj3.getClass();
                sb.append(((List) obj3).stream());
                Log.i("CXCP", sb.toString());
                return;
        }
    }

    public final void onCaptureProcessProgressed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, int i) {
        int i2 = this.a;
        vc0 vc0Var = this.b;
        cameraExtensionSession.getClass();
        captureRequest.getClass();
        switch (i2) {
            case 0:
                vc0Var.e(captureRequest, i);
                return;
            default:
                vc0Var.e(captureRequest, i);
                return;
        }
    }

    public final void onCaptureProcessStarted(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
        int i = this.a;
        cameraExtensionSession.getClass();
        captureRequest.getClass();
    }

    public void onCaptureResultAvailable(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        switch (this.a) {
            case 0:
                cameraExtensionSession.getClass();
                captureRequest.getClass();
                totalCaptureResult.getClass();
                Serializable serializable = this.d;
                if (((ConcurrentLinkedQueue) serializable).isEmpty()) {
                    td tdVar = this.c;
                    ww wwVar = tdVar.X;
                    wwVar.getClass();
                    long incrementAndGet = ww.b.incrementAndGet(wwVar);
                    tdVar.Y.put(cameraExtensionSession, Long.valueOf(incrementAndGet));
                    ((ConcurrentLinkedQueue) serializable).add(Long.valueOf(incrementAndGet));
                }
                Object remove = ((ConcurrentLinkedQueue) serializable).remove();
                remove.getClass();
                this.b.c(captureRequest, totalCaptureResult, ((Number) remove).longValue());
                return;
            default:
                super.onCaptureResultAvailable(cameraExtensionSession, captureRequest, totalCaptureResult);
                return;
        }
    }

    public final void onCaptureSequenceAborted(CameraExtensionSession cameraExtensionSession, int i) {
        int i2 = this.a;
        vc0 vc0Var = this.b;
        cameraExtensionSession.getClass();
        switch (i2) {
            case 0:
                vc0Var.f(i);
                return;
            default:
                vc0Var.f(i);
                return;
        }
    }

    public final void onCaptureSequenceCompleted(CameraExtensionSession cameraExtensionSession, int i) {
        int i2 = this.a;
        vc0 vc0Var = this.b;
        td tdVar = this.c;
        cameraExtensionSession.getClass();
        switch (i2) {
            case 0:
                Long l = (Long) tdVar.Y.get(cameraExtensionSession);
                l.getClass();
                vc0Var.g(i, l.longValue());
                return;
            default:
                Long l2 = (Long) tdVar.Y.get(cameraExtensionSession);
                l2.getClass();
                vc0Var.g(i, l2.longValue());
                return;
        }
    }

    public final void onCaptureStarted(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, long j) {
        int i = this.a;
        Serializable serializable = this.d;
        td tdVar = this.c;
        cameraExtensionSession.getClass();
        captureRequest.getClass();
        switch (i) {
            case 0:
                ww wwVar = tdVar.X;
                wwVar.getClass();
                long incrementAndGet = ww.b.incrementAndGet(wwVar);
                tdVar.Y.put(cameraExtensionSession, Long.valueOf(incrementAndGet));
                ((ConcurrentLinkedQueue) serializable).add(Long.valueOf(incrementAndGet));
                this.b.h(captureRequest, incrementAndGet, j);
                return;
            default:
                ww wwVar2 = tdVar.X;
                wwVar2.getClass();
                long incrementAndGet2 = ww.b.incrementAndGet(wwVar2);
                tdVar.Y.put(cameraExtensionSession, Long.valueOf(incrementAndGet2));
                LinkedHashMap linkedHashMap = (LinkedHashMap) serializable;
                Object obj = linkedHashMap.get(captureRequest);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(captureRequest, obj);
                }
                ((List) obj).add(Long.valueOf(incrementAndGet2));
                this.b.h(captureRequest, incrementAndGet2, j);
                return;
        }
    }

    public sd(td tdVar, vc0 vc0Var, LinkedHashMap linkedHashMap) {
        this.a = 1;
        this.c = tdVar;
        this.b = vc0Var;
        this.d = linkedHashMap;
    }
}
