package defpackage;

import android.util.Rational;
import android.util.Size;
import java.io.Serializable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l30  reason: default package */
/* loaded from: classes.dex */
public final class l30 {
    public int a;
    public int b;
    public boolean c;
    public final Serializable d;

    public l30(td0 td0Var, Rational rational) {
        this.a = td0Var.b();
        this.b = td0Var.c();
        this.d = rational;
        boolean z = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z = false;
        }
        this.c = z;
    }

    public Size a(jw2 jw2Var) {
        boolean z = false;
        int I = jw2Var.I(0);
        Size size = (Size) jw2Var.d(jw2.s, null);
        int i = this.b;
        int i2 = this.a;
        if (size != null) {
            int I2 = pu.I(I);
            if (1 == i) {
                z = true;
            }
            int u = pu.u(I2, z, i2);
            if (u == 90 || u == 270) {
                return new Size(size.getHeight(), size.getWidth());
            }
        }
        return size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l30(t... tVarArr) {
        this.a = -1;
        this.b = -1;
        this.c = false;
        this.d = tVarArr;
    }
}
