package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ld  reason: default package */
/* loaded from: classes.dex */
public final class ld extends CameraCaptureSession.StateCallback {
    public final cd a;
    public final cc0 b;
    public final ab0 c;
    public final q03 d;
    public final Handler e;
    public final fw f;
    public final fw g;

    public ld(cd cdVar, cc0 cc0Var, l16 l16Var, ab0 ab0Var, q03 q03Var, Handler handler) {
        cc0Var.getClass();
        ab0Var.getClass();
        handler.getClass();
        this.a = cdVar;
        this.b = cc0Var;
        this.c = ab0Var;
        this.d = q03Var;
        this.e = handler;
        this.f = w81.g(l16Var);
        this.g = w81.g(null);
    }

    public final dc0 a(CameraCaptureSession cameraCaptureSession, ab0 ab0Var) {
        dc0 adVar;
        dc0 dc0Var = (dc0) this.g.a;
        if (dc0Var != null) {
            return dc0Var;
        }
        Handler handler = this.e;
        boolean z = cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession;
        cd cdVar = this.a;
        if (z) {
            adVar = new bd(cdVar, (CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession, ab0Var, handler);
        } else {
            adVar = new ad(cdVar, cameraCaptureSession, ab0Var, handler);
        }
        if (this.g.a(null, adVar)) {
            return adVar;
        }
        Object obj = this.g.a;
        obj.getClass();
        return (dc0) obj;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        a(cameraCaptureSession, this.c);
        this.b.e(a(cameraCaptureSession, this.c));
        q03 q03Var = this.d;
        if (q03Var != null) {
            this.a.L.getClass();
            for (CameraCaptureSession.StateCallback stateCallback : (List) ((fw) q03Var.L).a) {
                stateCallback.onActive((o85) q03Var.B);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        a(cameraCaptureSession, this.c);
        this.b.d(a(cameraCaptureSession, this.c));
        q03 q03Var = this.d;
        if (q03Var != null) {
            this.a.L.getClass();
            if (Build.VERSION.SDK_INT >= 26) {
                o85 o85Var = (o85) q03Var.B;
                fw fwVar = (fw) q03Var.L;
                o85Var.getClass();
                fwVar.getClass();
                for (CameraCaptureSession.StateCallback stateCallback : (List) fwVar.a) {
                    rx.n(stateCallback, o85Var);
                }
            } else if (ve2.E()) {
                Log.e("CXCP", "onCaptureQueueEmpty called for unsupported OS version.");
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        ab0 ab0Var = this.c;
        a(cameraCaptureSession, ab0Var);
        dc0 a = a(cameraCaptureSession, ab0Var);
        cc0 cc0Var = this.b;
        cc0Var.h(a);
        l16 l16Var = (l16) this.f.b(null);
        if (l16Var != null) {
            l16Var.b();
        }
        cc0Var.b();
        q03 q03Var = this.d;
        if (q03Var != null) {
            q03Var.q(this.a.L);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        dc0 a = a(cameraCaptureSession, this.c);
        cc0 cc0Var = this.b;
        cc0Var.g(a);
        l16 l16Var = (l16) this.f.b(null);
        if (l16Var != null) {
            l16Var.b();
        }
        cc0Var.b();
        q03 q03Var = this.d;
        if (q03Var != null) {
            q03Var.r(this.a.L);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        this.b.f(a(cameraCaptureSession, this.c));
        l16 l16Var = (l16) this.f.b(null);
        if (l16Var != null) {
            l16Var.b();
        }
        q03 q03Var = this.d;
        if (q03Var != null) {
            q03Var.s(this.a.L);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        a(cameraCaptureSession, this.c);
        this.b.a(a(cameraCaptureSession, this.c));
        q03 q03Var = this.d;
        if (q03Var != null) {
            this.a.L.getClass();
            for (CameraCaptureSession.StateCallback stateCallback : (List) ((fw) q03Var.L).a) {
                stateCallback.onReady((o85) q03Var.B);
            }
        }
    }
}
