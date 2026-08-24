package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.view.Surface;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ae0  reason: default package */
/* loaded from: classes.dex */
public final class ae0 implements jk5 {
    public final LinkedHashMap A = new LinkedHashMap();
    public final ex6 B = new ex6(new c5(12));
    public volatile Map L = zt1.A;

    public static int b(yk5 yk5Var) {
        Object obj;
        sy6 sy6Var = (sy6) yk5Var.b(uy6.a);
        Integer num = null;
        if (sy6Var != null) {
            obj = sy6Var.a.get("CAPTURE_CONFIG_ID_KEY");
        } else {
            obj = null;
        }
        if (obj instanceof Integer) {
            num = (Integer) obj;
        }
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // defpackage.jk5
    public final void D(yk5 yk5Var, long j, uh uhVar) {
        yk5Var.getClass();
        for (Map.Entry entry : this.L.entrySet()) {
            be0 be0Var = (be0) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (be0Var instanceof ti0) {
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) yk5Var.e(gh5.a(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) yk5Var.e(gh5.a(CaptureRequest.class));
                CaptureResult captureResult = (CaptureResult) uhVar.e(gh5.a(CaptureResult.class));
                if (cameraCaptureSession != null && captureRequest != null && captureResult != null) {
                    executor.execute(new wd0((ti0) be0Var, cameraCaptureSession, captureRequest, captureResult, 1));
                }
            }
        }
    }

    @Override // defpackage.jk5
    public final void F(yk5 yk5Var, long j, wk5 wk5Var) {
        for (Map.Entry entry : this.L.entrySet()) {
            be0 be0Var = (be0) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (be0Var instanceof ti0) {
                CameraCaptureSession a = a(yk5Var);
                CaptureRequest captureRequest = (CaptureRequest) yk5Var.e(gh5.a(CaptureRequest.class));
                CaptureFailure captureFailure = (CaptureFailure) wk5Var.e(gh5.a(CaptureFailure.class));
                if (a != null && captureRequest != null && captureFailure != null) {
                    executor.execute(new vd0((ti0) be0Var, a, captureRequest, captureFailure, 1));
                }
            } else {
                ee0 ee0Var = ee0.ERROR;
                executor.execute(new v(be0Var, this, yk5Var, new d90(27), 5));
            }
        }
    }

    @Override // defpackage.jk5
    public final void J(yk5 yk5Var, long j, th thVar) {
        for (Map.Entry entry : this.L.entrySet()) {
            be0 be0Var = (be0) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (be0Var instanceof ti0) {
                CameraCaptureSession a = a(yk5Var);
                CaptureRequest captureRequest = (CaptureRequest) yk5Var.e(gh5.a(CaptureRequest.class));
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) thVar.e(gh5.a(TotalCaptureResult.class));
                if (a != null && captureRequest != null && totalCaptureResult != null) {
                    executor.execute(new vd0((ti0) be0Var, a, captureRequest, totalCaptureResult, 0));
                }
            } else {
                executor.execute(new v(be0Var, this, yk5Var, new th(yk5Var, thVar), 4));
            }
        }
    }

    @Override // defpackage.jk5
    public final void N(kk5 kk5Var) {
        sy6 sy6Var;
        Object obj;
        int i;
        kk5Var.getClass();
        for (Map.Entry entry : this.L.entrySet()) {
            be0 be0Var = (be0) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            Object obj2 = kk5Var.c.get(uy6.a);
            Integer num = null;
            if (obj2 instanceof sy6) {
                sy6Var = (sy6) obj2;
            } else {
                sy6Var = null;
            }
            if (sy6Var != null) {
                obj = sy6Var.a.get("CAPTURE_CONFIG_ID_KEY");
            } else {
                obj = null;
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
            }
            if (num != null) {
                i = num.intValue();
            } else {
                i = -1;
            }
            executor.execute(new om(be0Var, i, 2));
        }
    }

    public final CameraCaptureSession a(yk5 yk5Var) {
        CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) yk5Var.e(gh5.a(CameraCaptureSession.class));
        if (cameraCaptureSession == null) {
            if (Build.VERSION.SDK_INT >= 31 && sd0.f(yk5Var.e(gh5.a(ma.B()))) != null) {
                return (CameraCaptureSession) this.B.getValue();
            }
            return null;
        }
        return cameraCaptureSession;
    }

    @Override // defpackage.jk5
    public final void e(yk5 yk5Var, final long j, int i, int i2) {
        for (Map.Entry entry : this.L.entrySet()) {
            be0 be0Var = (be0) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (be0Var instanceof ti0) {
                final CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) yk5Var.e(gh5.a(CameraCaptureSession.class));
                final CaptureRequest captureRequest = (CaptureRequest) yk5Var.e(gh5.a(CaptureRequest.class));
                final Surface surface = (Surface) yk5Var.x().get(new kr6(i));
                if (cameraCaptureSession != null && captureRequest != null && surface != null) {
                    final ti0 ti0Var = (ti0) be0Var;
                    executor.execute(new Runnable() { // from class: yd0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ti0.this.a.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                        }
                    });
                }
            }
        }
    }

    @Override // defpackage.jk5
    public final void h(yk5 yk5Var, long j, long j2) {
        yk5Var.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            for (Map.Entry entry : this.L.entrySet()) {
                be0 be0Var = (be0) entry.getKey();
                Executor executor = (Executor) entry.getValue();
                if (be0Var instanceof ti0) {
                    CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) yk5Var.e(gh5.a(CameraCaptureSession.class));
                    CaptureRequest captureRequest = (CaptureRequest) yk5Var.e(gh5.a(CaptureRequest.class));
                    if (cameraCaptureSession != null && captureRequest != null) {
                        executor.execute(new td0((ti0) be0Var, cameraCaptureSession, captureRequest, j2, j, 1));
                    }
                }
            }
        }
    }

    @Override // defpackage.jk5
    public final void n(yk5 yk5Var, long j) {
        yk5Var.getClass();
        for (Map.Entry entry : this.L.entrySet()) {
            be0 be0Var = (be0) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (be0Var instanceof ti0) {
                CameraCaptureSession a = a(yk5Var);
                CaptureRequest captureRequest = (CaptureRequest) yk5Var.e(gh5.a(CaptureRequest.class));
                if (a != null && captureRequest != null) {
                    executor.execute(new zd0((ti0) be0Var, a, j, 0));
                }
            }
        }
    }

    @Override // defpackage.jk5
    public final void r(yk5 yk5Var) {
        yk5Var.getClass();
        for (Map.Entry entry : this.L.entrySet()) {
            be0 be0Var = (be0) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (be0Var instanceof ti0) {
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) yk5Var.e(gh5.a(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) yk5Var.e(gh5.a(CaptureRequest.class));
                if (cameraCaptureSession != null && captureRequest != null) {
                    executor.execute(new mf(3, (ti0) be0Var, cameraCaptureSession));
                }
            } else {
                executor.execute(new ud0(be0Var, this, yk5Var, 1));
            }
        }
    }

    @Override // defpackage.jk5
    public final void u(yk5 yk5Var, long j, long j2) {
        yk5Var.getClass();
        for (Map.Entry entry : this.L.entrySet()) {
            be0 be0Var = (be0) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (be0Var instanceof ti0) {
                CameraCaptureSession a = a(yk5Var);
                CaptureRequest captureRequest = (CaptureRequest) yk5Var.e(gh5.a(CaptureRequest.class));
                if (a != null && captureRequest != null) {
                    executor.execute(new td0((ti0) be0Var, a, captureRequest, j2, j, 0));
                }
            } else {
                executor.execute(new ud0(be0Var, this, yk5Var, 0));
            }
        }
    }

    @Override // defpackage.jk5
    public final void v(yk5 yk5Var, int i) {
        yk5Var.getClass();
        for (Map.Entry entry : this.L.entrySet()) {
            be0 be0Var = (be0) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (be0Var instanceof ti0) {
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) yk5Var.e(gh5.a(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) yk5Var.e(gh5.a(CaptureRequest.class));
                CaptureResult captureResult = (CaptureResult) yk5Var.e(gh5.a(CaptureResult.class));
                if (cameraCaptureSession != null && captureRequest != null && captureResult != null) {
                    executor.execute(new wd0((ti0) be0Var, cameraCaptureSession, captureRequest, captureResult, 0));
                }
            } else {
                executor.execute(new xd0(be0Var, this, yk5Var, i));
            }
        }
    }
}
