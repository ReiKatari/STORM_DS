package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kq7  reason: default package */
/* loaded from: classes.dex */
public final class kq7 implements bf0 {
    public final rd A;
    public final Object B = new Object();
    public boolean L;

    public kq7(rd rdVar) {
        this.A = rdVar;
    }

    @Override // defpackage.bf0
    public final boolean A(uc6 uc6Var) {
        boolean A;
        synchronized (this.B) {
            try {
                if (this.L) {
                    Log.w("CXCP", "createCaptureSession failed: Virtual device disconnected");
                    uc6Var.e.a();
                    A = false;
                } else {
                    A = this.A.A(uc6Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return A;
    }

    @Override // defpackage.bf0
    public final CaptureRequest.Builder D(int i) {
        CaptureRequest.Builder D;
        synchronized (this.B) {
            try {
                if (this.L) {
                    Log.w("CXCP", "createCaptureRequest failed: Virtual device disconnected");
                    D = null;
                } else {
                    D = this.A.D(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return D;
    }

    @Override // defpackage.bf0
    public final boolean F(ArrayList arrayList, le0 le0Var) {
        boolean F;
        le0Var.getClass();
        synchronized (this.B) {
            try {
                if (this.L) {
                    Log.w("CXCP", "createConstrainedHighSpeedCaptureSession failed: Virtual device disconnected");
                    ((yk0) le0Var).a();
                    F = false;
                } else {
                    F = this.A.F(arrayList, le0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return F;
    }

    @Override // defpackage.bf0
    public final boolean N(List list, le0 le0Var) {
        boolean N;
        le0Var.getClass();
        synchronized (this.B) {
            try {
                if (this.L) {
                    Log.w("CXCP", "createCaptureSession failed: Virtual device disconnected");
                    le0Var.a();
                    N = false;
                } else {
                    N = this.A.N(list, le0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return N;
    }

    @Override // defpackage.bf0
    public final boolean U(ArrayList arrayList, le0 le0Var) {
        boolean U;
        le0Var.getClass();
        synchronized (this.B) {
            try {
                if (this.L) {
                    Log.w("CXCP", "createCaptureSessionByOutputConfigurations failed: Virtual device disconnected");
                    ((yk0) le0Var).a();
                    U = false;
                } else {
                    U = this.A.U(arrayList, le0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return U;
    }

    @Override // defpackage.bf0
    public final boolean Z(j63 j63Var, ArrayList arrayList, le0 le0Var) {
        boolean Z;
        le0Var.getClass();
        synchronized (this.B) {
            try {
                if (this.L) {
                    Log.w("CXCP", "createReprocessableCaptureSessionByConfigurations failed: Virtual device disconnected");
                    ((yk0) le0Var).a();
                    Z = false;
                } else {
                    Z = this.A.Z(j63Var, arrayList, le0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return Z;
    }

    @Override // defpackage.bf0
    public final void a0() {
        this.A.a0();
    }

    @Override // defpackage.hh7
    public final Object e(ar0 ar0Var) {
        return this.A.e(ar0Var);
    }

    @Override // defpackage.bf0
    public final boolean e0(k82 k82Var) {
        boolean e0;
        synchronized (this.B) {
            try {
                if (this.L) {
                    Log.w("CXCP", "createExtensionSession failed: Virtual device disconnected");
                    k82Var.g.a();
                    e0 = false;
                } else {
                    e0 = this.A.e0(k82Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return e0;
    }

    @Override // defpackage.bf0
    public final String h() {
        return this.A.L;
    }

    @Override // defpackage.bf0
    public final boolean j0(InputConfiguration inputConfiguration, ArrayList arrayList, le0 le0Var) {
        boolean j0;
        le0Var.getClass();
        synchronized (this.B) {
            try {
                if (this.L) {
                    Log.w("CXCP", "createReprocessableCaptureSession failed: Virtual device disconnected");
                    ((yk0) le0Var).a();
                    j0 = false;
                } else {
                    j0 = this.A.j0(inputConfiguration, arrayList, le0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j0;
    }

    @Override // defpackage.bf0
    public final CaptureRequest.Builder k(TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Builder k;
        synchronized (this.B) {
            try {
                if (this.L) {
                    Log.w("CXCP", "createReprocessCaptureRequest failed: Virtual device disconnected");
                    k = null;
                } else {
                    k = this.A.k(totalCaptureResult);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return k;
    }

    @Override // defpackage.bf0
    public final void n(int i) {
        this.A.n(i);
    }

    @Override // defpackage.bf0
    public final void u() {
        this.A.u();
    }
}
