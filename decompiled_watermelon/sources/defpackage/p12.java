package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import android.util.Rational;
import java.util.Collections;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p12  reason: default package */
/* loaded from: classes.dex */
public final class p12 implements i47 {
    public final r12 a;
    public s12 b;
    public n47 c;

    public p12(r12 r12Var) {
        r12Var.getClass();
        this.a = r12Var;
        this.b = new s12(r12Var.d, 0, r12Var.c, r12Var.e);
    }

    public final gs0 a(boolean z) {
        r12 r12Var = this.a;
        boolean z2 = r12Var.d;
        Range range = r12Var.c;
        if (!z2) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("ExposureCompensation is not supported");
            gs0 gs0Var = new gs0();
            gs0Var.v0(illegalArgumentException);
            return gs0Var;
        } else if (!range.contains((Range) 0)) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Requested ExposureCompensation 0 is not within valid range [" + range.getUpper() + " .. " + range.getLower() + ']');
            gs0 gs0Var2 = new gs0();
            gs0Var2.v0(illegalArgumentException2);
            return gs0Var2;
        } else {
            n47 n47Var = this.c;
            if (n47Var != null) {
                s12 s12Var = this.b;
                boolean z3 = s12Var.a;
                Range range2 = s12Var.c;
                Rational rational = s12Var.d;
                range2.getClass();
                rational.getClass();
                this.b = new s12(z3, 0, range2, rational);
                bs0 bs0Var = r12Var.b;
                gs0 gs0Var3 = new gs0();
                gs0 gs0Var4 = r12Var.f;
                if (gs0Var4 != null) {
                    if (z) {
                        b31.z("Cancelled by another setExposureCompensationIndex()", gs0Var4);
                    } else {
                        l.K(gs0Var3, gs0Var4);
                    }
                }
                r12Var.f = gs0Var3;
                q12 q12Var = r12Var.g;
                if (q12Var != null) {
                    bs0Var.b(q12Var);
                    r12Var.g = null;
                }
                Map singletonMap = Collections.singletonMap(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, 0);
                singletonMap.getClass();
                n47.d(n47Var, singletonMap);
                q12 q12Var2 = new q12(gs0Var3);
                bs0Var.a(q12Var2, r12Var.a.e);
                gs0Var3.R(new x(27, r12Var, q12Var2));
                r12Var.g = q12Var2;
                return gs0Var3;
            }
            Exception exc = new Exception("Camera is not active.");
            gs0 gs0Var5 = r12Var.f;
            if (gs0Var5 != null) {
                gs0Var5.v0(exc);
            }
            gs0 gs0Var6 = new gs0();
            gs0Var6.v0(exc);
            return gs0Var6;
        }
    }

    @Override // defpackage.i47
    public final void b(n47 n47Var) {
        this.c = n47Var;
        a(false);
    }

    @Override // defpackage.i47
    public final void reset() {
        s12 s12Var = this.b;
        boolean z = s12Var.a;
        Range range = s12Var.c;
        Rational rational = s12Var.d;
        range.getClass();
        rational.getClass();
        this.b = new s12(z, 0, range, rational);
        a(true);
    }
}
