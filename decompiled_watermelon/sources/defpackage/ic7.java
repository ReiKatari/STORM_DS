package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ic7  reason: default package */
/* loaded from: classes.dex */
public final class ic7 implements sc0 {
    public final cd A;
    public final Object B = new Object();
    public boolean L;

    public ic7(cd cdVar) {
        this.A = cdVar;
    }

    @Override // defpackage.sc0
    public final CaptureRequest.Builder B(TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Builder B;
        synchronized (this.B) {
            try {
                if (this.L) {
                    Log.w("CXCP", "createReprocessCaptureRequest failed: Virtual device disconnected");
                    B = null;
                } else {
                    B = this.A.B(totalCaptureResult);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return B;
    }

    @Override // defpackage.sc0
    public final boolean C(g03 g03Var, ArrayList arrayList, cc0 cc0Var) {
        boolean C;
        cc0Var.getClass();
        synchronized (this.B) {
            try {
                if (this.L) {
                    Log.w("CXCP", "createReprocessableCaptureSessionByConfigurations failed: Virtual device disconnected");
                    ((qi0) cc0Var).b();
                    C = false;
                } else {
                    C = this.A.C(g03Var, arrayList, cc0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return C;
    }

    @Override // defpackage.sc0
    public final void D() {
        this.A.D();
    }

    @Override // defpackage.sc0
    public final void F(int i) {
        this.A.F(i);
    }

    @Override // defpackage.sc0
    public final void J() {
        this.A.J();
    }

    @Override // defpackage.sc0
    public final boolean R(s32 s32Var) {
        boolean R;
        synchronized (this.B) {
            try {
                if (this.L) {
                    Log.w("CXCP", "createExtensionSession failed: Virtual device disconnected");
                    s32Var.g.b();
                    R = false;
                } else {
                    R = this.A.R(s32Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return R;
    }

    @Override // defpackage.sc0
    public final boolean T(g16 g16Var) {
        boolean T;
        synchronized (this.B) {
            try {
                if (this.L) {
                    Log.w("CXCP", "createCaptureSession failed: Virtual device disconnected");
                    g16Var.e.b();
                    T = false;
                } else {
                    T = this.A.T(g16Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return T;
    }

    @Override // defpackage.sc0
    public final CaptureRequest.Builder V(int i) {
        CaptureRequest.Builder V;
        synchronized (this.B) {
            try {
                if (this.L) {
                    Log.w("CXCP", "createCaptureRequest failed: Virtual device disconnected");
                    V = null;
                } else {
                    V = this.A.V(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return V;
    }

    @Override // defpackage.sc0
    public final boolean Z(ArrayList arrayList, cc0 cc0Var) {
        boolean Z;
        cc0Var.getClass();
        synchronized (this.B) {
            try {
                if (this.L) {
                    Log.w("CXCP", "createConstrainedHighSpeedCaptureSession failed: Virtual device disconnected");
                    ((qi0) cc0Var).b();
                    Z = false;
                } else {
                    Z = this.A.Z(arrayList, cc0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return Z;
    }

    @Override // defpackage.sc0
    public final boolean d(List list, cc0 cc0Var) {
        boolean d;
        cc0Var.getClass();
        synchronized (this.B) {
            try {
                if (this.L) {
                    Log.w("CXCP", "createCaptureSession failed: Virtual device disconnected");
                    cc0Var.b();
                    d = false;
                } else {
                    d = this.A.d(list, cc0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d;
    }

    @Override // defpackage.sc0
    public final boolean i(ArrayList arrayList, cc0 cc0Var) {
        boolean i;
        cc0Var.getClass();
        synchronized (this.B) {
            try {
                if (this.L) {
                    Log.w("CXCP", "createCaptureSessionByOutputConfigurations failed: Virtual device disconnected");
                    ((qi0) cc0Var).b();
                    i = false;
                } else {
                    i = this.A.i(arrayList, cc0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // defpackage.sc0
    public final boolean j0(InputConfiguration inputConfiguration, ArrayList arrayList, cc0 cc0Var) {
        boolean j0;
        cc0Var.getClass();
        synchronized (this.B) {
            try {
                if (this.L) {
                    Log.w("CXCP", "createReprocessableCaptureSession failed: Virtual device disconnected");
                    ((qi0) cc0Var).b();
                    j0 = false;
                } else {
                    j0 = this.A.j0(inputConfiguration, arrayList, cc0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j0;
    }

    @Override // defpackage.m37
    public final Object p(qo0 qo0Var) {
        return this.A.p(qo0Var);
    }

    @Override // defpackage.sc0
    public final String w() {
        return this.A.L;
    }
}
