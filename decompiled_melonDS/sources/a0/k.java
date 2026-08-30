package a0;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
import w.m0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f9b;

    /* renamed from: c  reason: collision with root package name */
    public Object f10c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, b5.n] */
    /* JADX WARN: Type inference failed for: r4v3, types: [b5.i, java.lang.Object] */
    public k(int i2) {
        this.f8a = i2;
        switch (i2) {
            case 2:
                this.f10c = null;
                this.f9b = new HashMap();
                return;
            default:
                ?? obj = new Object();
                obj.f2053c = new Object();
                b5.l lVar = new b5.l(obj);
                obj.f2052b = lVar;
                obj.f2051a = w.d.class;
                try {
                    this.f10c = obj;
                    obj.f2051a = "RequestCompleteListener[" + this + "]";
                } catch (Exception e6) {
                    lVar.b(e6);
                }
                this.f9b = lVar;
                return;
        }
    }

    public void a(CaptureRequest captureRequest, List list) {
        HashMap hashMap = (HashMap) this.f9b;
        List list2 = (List) hashMap.get(captureRequest);
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(list2.size() + list.size());
            arrayList.addAll(list);
            arrayList.addAll(list2);
            hashMap.put(captureRequest, arrayList);
            return;
        }
        hashMap.put(captureRequest, list);
    }

    public void b() {
        b5.i iVar = (b5.i) this.f10c;
        if (iVar != null) {
            iVar.b(null);
            this.f10c = null;
        }
    }

    public List c(CaptureRequest captureRequest) {
        List list = (List) ((HashMap) this.f9b).get(captureRequest);
        if (list != null) {
            return list;
        }
        return Collections.EMPTY_LIST;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j2) {
        switch (this.f8a) {
            case 2:
                for (CameraCaptureSession.CaptureCallback captureCallback : c(captureRequest)) {
                    captureCallback.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j2);
                }
                return;
            case 3:
                ((l0.h) this.f10c).execute(new Runnable() { // from class: x.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((CameraCaptureSession.CaptureCallback) a0.k.this.f9b).onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j2);
                    }
                });
                return;
            default:
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j2);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        switch (this.f8a) {
            case 0:
                b();
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((l0.h) this.f10c).execute(new w.g(0, this, totalCaptureResult));
                return;
            case 2:
                for (CameraCaptureSession.CaptureCallback captureCallback : c(captureRequest)) {
                    captureCallback.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
                return;
            default:
                ((l0.h) this.f10c).execute(new q8.h(this, cameraCaptureSession, captureRequest, totalCaptureResult, 1));
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        switch (this.f8a) {
            case 0:
                b();
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
            default:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                return;
            case 2:
                for (CameraCaptureSession.CaptureCallback captureCallback : c(captureRequest)) {
                    captureCallback.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
                return;
            case 3:
                ((l0.h) this.f10c).execute(new q8.h(this, cameraCaptureSession, captureRequest, captureFailure, 3));
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        switch (this.f8a) {
            case 2:
                for (CameraCaptureSession.CaptureCallback captureCallback : c(captureRequest)) {
                    captureCallback.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
                return;
            case 3:
                ((l0.h) this.f10c).execute(new q8.h(this, cameraCaptureSession, captureRequest, captureResult, 2));
                return;
            default:
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i2) {
        switch (this.f8a) {
            case 0:
                b();
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
            default:
                super.onCaptureSequenceAborted(cameraCaptureSession, i2);
                return;
            case 2:
                for (List<CameraCaptureSession.CaptureCallback> list : ((HashMap) this.f9b).values()) {
                    for (CameraCaptureSession.CaptureCallback captureCallback : list) {
                        captureCallback.onCaptureSequenceAborted(cameraCaptureSession, i2);
                    }
                }
                m0 m0Var = (m0) this.f10c;
                if (m0Var != null) {
                    m0Var.a();
                    return;
                }
                return;
            case 3:
                ((l0.h) this.f10c).execute(new d.i(this, cameraCaptureSession, i2, 6));
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i2, final long j2) {
        switch (this.f8a) {
            case 0:
                b();
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
            default:
                super.onCaptureSequenceCompleted(cameraCaptureSession, i2, j2);
                return;
            case 2:
                for (List<CameraCaptureSession.CaptureCallback> list : ((HashMap) this.f9b).values()) {
                    for (CameraCaptureSession.CaptureCallback captureCallback : list) {
                        captureCallback.onCaptureSequenceCompleted(cameraCaptureSession, i2, j2);
                    }
                }
                m0 m0Var = (m0) this.f10c;
                if (m0Var != null) {
                    m0Var.a();
                    return;
                }
                return;
            case 3:
                ((l0.h) this.f10c).execute(new Runnable() { // from class: x.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((CameraCaptureSession.CaptureCallback) a0.k.this.f9b).onCaptureSequenceCompleted(cameraCaptureSession, i2, j2);
                    }
                });
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j2, final long j10) {
        switch (this.f8a) {
            case 0:
                b();
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
            default:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j2, j10);
                return;
            case 2:
                for (CameraCaptureSession.CaptureCallback captureCallback : c(captureRequest)) {
                    captureCallback.onCaptureStarted(cameraCaptureSession, captureRequest, j2, j10);
                }
                return;
            case 3:
                ((l0.h) this.f10c).execute(new Runnable() { // from class: x.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((CameraCaptureSession.CaptureCallback) a0.k.this.f9b).onCaptureStarted(cameraCaptureSession, captureRequest, j2, j10);
                    }
                });
                return;
        }
    }

    public k(l0.h hVar, CameraCaptureSession.CaptureCallback captureCallback) {
        this.f8a = 3;
        this.f10c = hVar;
        this.f9b = captureCallback;
    }

    public k(l0.h hVar) {
        this.f8a = 1;
        this.f9b = new HashSet();
        this.f10c = hVar;
    }
}
