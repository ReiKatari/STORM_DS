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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rb0  reason: default package */
/* loaded from: classes.dex */
public final class rb0 implements ra5 {
    public final LinkedHashMap A = new LinkedHashMap();
    public final il6 B = new il6(new d5(12));
    public volatile Map L = qp1.A;

    public static int b(gb5 gb5Var) {
        Object obj;
        im6 im6Var = (im6) gb5Var.b(km6.a);
        Integer num = null;
        if (im6Var != null) {
            obj = im6Var.a.get("CAPTURE_CONFIG_ID_KEY");
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

    @Override // defpackage.ra5
    public final void B(gb5 gb5Var, long j) {
        gb5Var.getClass();
        for (Map.Entry entry : this.L.entrySet()) {
            sb0 sb0Var = (sb0) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (sb0Var instanceof kg0) {
                CameraCaptureSession a = a(gb5Var);
                CaptureRequest captureRequest = (CaptureRequest) gb5Var.p(q75.a(CaptureRequest.class));
                if (a != null && captureRequest != null) {
                    executor.execute(new qb0((kg0) sb0Var, a, j, 0));
                }
            }
        }
    }

    @Override // defpackage.ra5
    public final void D(gb5 gb5Var) {
        gb5Var.getClass();
        for (Map.Entry entry : this.L.entrySet()) {
            sb0 sb0Var = (sb0) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (sb0Var instanceof kg0) {
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) gb5Var.p(q75.a(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) gb5Var.p(q75.a(CaptureRequest.class));
                if (cameraCaptureSession != null && captureRequest != null) {
                    executor.execute(new we(3, (kg0) sb0Var, cameraCaptureSession));
                }
            } else {
                executor.execute(new lb0(sb0Var, this, gb5Var, 1));
            }
        }
    }

    @Override // defpackage.ra5
    public final void F(gb5 gb5Var, long j, long j2) {
        gb5Var.getClass();
        for (Map.Entry entry : this.L.entrySet()) {
            sb0 sb0Var = (sb0) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (sb0Var instanceof kg0) {
                CameraCaptureSession a = a(gb5Var);
                CaptureRequest captureRequest = (CaptureRequest) gb5Var.p(q75.a(CaptureRequest.class));
                if (a != null && captureRequest != null) {
                    executor.execute(new kb0((kg0) sb0Var, a, captureRequest, j2, j, 0));
                }
            } else {
                executor.execute(new lb0(sb0Var, this, gb5Var, 0));
            }
        }
    }

    @Override // defpackage.ra5
    public final void I(gb5 gb5Var, long j, ih ihVar) {
        gb5Var.getClass();
        for (Map.Entry entry : this.L.entrySet()) {
            sb0 sb0Var = (sb0) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (sb0Var instanceof kg0) {
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) gb5Var.p(q75.a(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) gb5Var.p(q75.a(CaptureRequest.class));
                CaptureResult captureResult = (CaptureResult) ihVar.p(q75.a(CaptureResult.class));
                if (cameraCaptureSession != null && captureRequest != null && captureResult != null) {
                    executor.execute(new nb0((kg0) sb0Var, cameraCaptureSession, captureRequest, captureResult, 1));
                }
            }
        }
    }

    @Override // defpackage.ra5
    public final void J(gb5 gb5Var, long j, eb5 eb5Var) {
        for (Map.Entry entry : this.L.entrySet()) {
            sb0 sb0Var = (sb0) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (sb0Var instanceof kg0) {
                CameraCaptureSession a = a(gb5Var);
                CaptureRequest captureRequest = (CaptureRequest) gb5Var.p(q75.a(CaptureRequest.class));
                CaptureFailure captureFailure = (CaptureFailure) eb5Var.p(q75.a(CaptureFailure.class));
                if (a != null && captureRequest != null && captureFailure != null) {
                    executor.execute(new mb0((kg0) sb0Var, a, captureRequest, captureFailure, 1));
                }
            } else {
                vb0 vb0Var = vb0.ERROR;
                executor.execute(new u(sb0Var, this, gb5Var, new sn1(25), 4));
            }
        }
    }

    @Override // defpackage.ra5
    public final void K(gb5 gb5Var, long j, hh hhVar) {
        for (Map.Entry entry : this.L.entrySet()) {
            sb0 sb0Var = (sb0) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (sb0Var instanceof kg0) {
                CameraCaptureSession a = a(gb5Var);
                CaptureRequest captureRequest = (CaptureRequest) gb5Var.p(q75.a(CaptureRequest.class));
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) hhVar.p(q75.a(TotalCaptureResult.class));
                if (a != null && captureRequest != null && totalCaptureResult != null) {
                    executor.execute(new mb0((kg0) sb0Var, a, captureRequest, totalCaptureResult, 0));
                }
            } else {
                executor.execute(new u(sb0Var, this, gb5Var, new hh(gb5Var, hhVar), 3));
            }
        }
    }

    @Override // defpackage.ra5
    public final void N(sa5 sa5Var) {
        im6 im6Var;
        Object obj;
        int i;
        sa5Var.getClass();
        for (Map.Entry entry : this.L.entrySet()) {
            sb0 sb0Var = (sb0) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            Object obj2 = sa5Var.c.get(km6.a);
            Integer num = null;
            if (obj2 instanceof im6) {
                im6Var = (im6) obj2;
            } else {
                im6Var = null;
            }
            if (im6Var != null) {
                obj = im6Var.a.get("CAPTURE_CONFIG_ID_KEY");
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
            executor.execute(new cm(i, 2, sb0Var));
        }
    }

    public final CameraCaptureSession a(gb5 gb5Var) {
        CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) gb5Var.p(q75.a(CameraCaptureSession.class));
        if (cameraCaptureSession == null) {
            if (Build.VERSION.SDK_INT >= 31 && dd.f(gb5Var.p(q75.a(dd.B()))) != null) {
                return (CameraCaptureSession) this.B.getValue();
            }
            return null;
        }
        return cameraCaptureSession;
    }

    @Override // defpackage.ra5
    public final void d(gb5 gb5Var, int i) {
        gb5Var.getClass();
        for (Map.Entry entry : this.L.entrySet()) {
            sb0 sb0Var = (sb0) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (sb0Var instanceof kg0) {
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) gb5Var.p(q75.a(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) gb5Var.p(q75.a(CaptureRequest.class));
                CaptureResult captureResult = (CaptureResult) gb5Var.p(q75.a(CaptureResult.class));
                if (cameraCaptureSession != null && captureRequest != null && captureResult != null) {
                    executor.execute(new nb0((kg0) sb0Var, cameraCaptureSession, captureRequest, captureResult, 0));
                }
            } else {
                executor.execute(new ob0(sb0Var, this, gb5Var, i));
            }
        }
    }

    @Override // defpackage.ra5
    public final void p(gb5 gb5Var, final long j, int i, int i2) {
        for (Map.Entry entry : this.L.entrySet()) {
            sb0 sb0Var = (sb0) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (sb0Var instanceof kg0) {
                final CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) gb5Var.p(q75.a(CameraCaptureSession.class));
                final CaptureRequest captureRequest = (CaptureRequest) gb5Var.p(q75.a(CaptureRequest.class));
                final Surface surface = (Surface) gb5Var.N().get(new uf6(i));
                if (cameraCaptureSession != null && captureRequest != null && surface != null) {
                    final kg0 kg0Var = (kg0) sb0Var;
                    executor.execute(new Runnable() { // from class: pb0
                        @Override // java.lang.Runnable
                        public final void run() {
                            kg0.this.a.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                        }
                    });
                }
            }
        }
    }

    @Override // defpackage.ra5
    public final void w(gb5 gb5Var, long j, long j2) {
        gb5Var.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            for (Map.Entry entry : this.L.entrySet()) {
                sb0 sb0Var = (sb0) entry.getKey();
                Executor executor = (Executor) entry.getValue();
                if (sb0Var instanceof kg0) {
                    CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) gb5Var.p(q75.a(CameraCaptureSession.class));
                    CaptureRequest captureRequest = (CaptureRequest) gb5Var.p(q75.a(CaptureRequest.class));
                    if (cameraCaptureSession != null && captureRequest != null) {
                        executor.execute(new kb0((kg0) sb0Var, cameraCaptureSession, captureRequest, j2, j, 1));
                    }
                }
            }
        }
    }
}
