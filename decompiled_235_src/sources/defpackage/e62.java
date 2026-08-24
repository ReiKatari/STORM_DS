package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import android.util.Rational;
import java.util.Collections;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e62  reason: default package */
/* loaded from: classes.dex */
public final class e62 implements gi7 {
    public final g62 a;
    public h62 b;
    public li7 c;

    public e62(g62 g62Var) {
        g62Var.getClass();
        this.a = g62Var;
        this.b = new h62(g62Var.d, 0, g62Var.c, g62Var.e);
    }

    public final tu0 a(boolean z) {
        g62 g62Var = this.a;
        boolean z2 = g62Var.d;
        Range range = g62Var.c;
        if (!z2) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("ExposureCompensation is not supported");
            tu0 tu0Var = new tu0();
            tu0Var.v0(illegalArgumentException);
            return tu0Var;
        } else if (!range.contains((Range) 0)) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Requested ExposureCompensation 0 is not within valid range [" + range.getUpper() + " .. " + range.getLower() + ']');
            tu0 tu0Var2 = new tu0();
            tu0Var2.v0(illegalArgumentException2);
            return tu0Var2;
        } else {
            li7 li7Var = this.c;
            if (li7Var != null) {
                h62 h62Var = this.b;
                boolean z3 = h62Var.a;
                Range range2 = h62Var.c;
                Rational rational = h62Var.d;
                range2.getClass();
                rational.getClass();
                this.b = new h62(z3, 0, range2, rational);
                ou0 ou0Var = g62Var.b;
                tu0 tu0Var3 = new tu0();
                tu0 tu0Var4 = g62Var.f;
                if (tu0Var4 != null) {
                    if (z) {
                        i61.A("Cancelled by another setExposureCompensationIndex()", tu0Var4);
                    } else {
                        nc1.a0(tu0Var3, tu0Var4);
                    }
                }
                g62Var.f = tu0Var3;
                f62 f62Var = g62Var.g;
                if (f62Var != null) {
                    ou0Var.b(f62Var);
                    g62Var.g = null;
                }
                Map singletonMap = Collections.singletonMap(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, 0);
                singletonMap.getClass();
                li7.b(li7Var, singletonMap);
                f62 f62Var2 = new f62(tu0Var3);
                ou0Var.a(f62Var2, g62Var.a.e);
                tu0Var3.a0(new y(29, g62Var, f62Var2));
                g62Var.g = f62Var2;
                return tu0Var3;
            }
            Exception exc = new Exception("Camera is not active.");
            tu0 tu0Var5 = g62Var.f;
            if (tu0Var5 != null) {
                tu0Var5.v0(exc);
            }
            tu0 tu0Var6 = new tu0();
            tu0Var6.v0(exc);
            return tu0Var6;
        }
    }

    @Override // defpackage.gi7
    public final void b(li7 li7Var) {
        this.c = li7Var;
        a(false);
    }

    @Override // defpackage.gi7
    public final void reset() {
        h62 h62Var = this.b;
        boolean z = h62Var.a;
        Range range = h62Var.c;
        Rational rational = h62Var.d;
        range.getClass();
        rational.getClass();
        this.b = new h62(z, 0, range, rational);
        a(true);
    }
}
