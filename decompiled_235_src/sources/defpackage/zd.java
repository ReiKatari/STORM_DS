package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zd  reason: default package */
/* loaded from: classes.dex */
public final class zd extends CameraCaptureSession.StateCallback {
    public final rd a;
    public final le0 b;
    public final id0 c;
    public final u63 d;
    public final Handler e;
    public final xw f;
    public final xw g;

    public zd(rd rdVar, le0 le0Var, zc6 zc6Var, id0 id0Var, u63 u63Var, Handler handler) {
        le0Var.getClass();
        id0Var.getClass();
        handler.getClass();
        this.a = rdVar;
        this.b = le0Var;
        this.c = id0Var;
        this.d = u63Var;
        this.e = handler;
        this.f = g04.u(zc6Var);
        this.g = g04.u(null);
    }

    public final me0 a(CameraCaptureSession cameraCaptureSession, id0 id0Var) {
        me0 pdVar;
        me0 me0Var = (me0) this.g.a;
        if (me0Var != null) {
            return me0Var;
        }
        Handler handler = this.e;
        boolean z = cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession;
        rd rdVar = this.a;
        if (z) {
            pdVar = new qd(rdVar, (CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession, id0Var, handler);
        } else {
            pdVar = new pd(rdVar, cameraCaptureSession, id0Var, handler);
        }
        if (this.g.a(null, pdVar)) {
            return pdVar;
        }
        Object obj = this.g.a;
        obj.getClass();
        return (me0) obj;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        a(cameraCaptureSession, this.c);
        this.b.c(a(cameraCaptureSession, this.c));
        u63 u63Var = this.d;
        if (u63Var != null) {
            this.a.L.getClass();
            for (CameraCaptureSession.StateCallback stateCallback : (List) ((xw) u63Var.L).a) {
                stateCallback.onActive((di5) u63Var.B);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        a(cameraCaptureSession, this.c);
        this.b.f(a(cameraCaptureSession, this.c));
        u63 u63Var = this.d;
        if (u63Var != null) {
            this.a.L.getClass();
            if (Build.VERSION.SDK_INT >= 26) {
                di5 di5Var = (di5) u63Var.B;
                xw xwVar = (xw) u63Var.L;
                di5Var.getClass();
                xwVar.getClass();
                for (CameraCaptureSession.StateCallback stateCallback : (List) xwVar.a) {
                    au.n(stateCallback, di5Var);
                }
            } else if (kj2.G()) {
                Log.e("CXCP", "onCaptureQueueEmpty called for unsupported OS version.");
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        id0 id0Var = this.c;
        a(cameraCaptureSession, id0Var);
        me0 a = a(cameraCaptureSession, id0Var);
        le0 le0Var = this.b;
        le0Var.d(a);
        zc6 zc6Var = (zc6) this.f.b(null);
        if (zc6Var != null) {
            zc6Var.a();
        }
        le0Var.a();
        u63 u63Var = this.d;
        if (u63Var != null) {
            u63Var.t(this.a.L);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        me0 a = a(cameraCaptureSession, this.c);
        le0 le0Var = this.b;
        le0Var.h(a);
        zc6 zc6Var = (zc6) this.f.b(null);
        if (zc6Var != null) {
            zc6Var.a();
        }
        le0Var.a();
        u63 u63Var = this.d;
        if (u63Var != null) {
            u63Var.u(this.a.L);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        this.b.g(a(cameraCaptureSession, this.c));
        zc6 zc6Var = (zc6) this.f.b(null);
        if (zc6Var != null) {
            zc6Var.a();
        }
        u63 u63Var = this.d;
        if (u63Var != null) {
            u63Var.v(this.a.L);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        a(cameraCaptureSession, this.c);
        this.b.e(a(cameraCaptureSession, this.c));
        u63 u63Var = this.d;
        if (u63Var != null) {
            this.a.L.getClass();
            for (CameraCaptureSession.StateCallback stateCallback : (List) ((xw) u63Var.L).a) {
                stateCallback.onReady((di5) u63Var.B);
            }
        }
    }
}
