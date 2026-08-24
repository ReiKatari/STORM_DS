package defpackage;

import android.util.Rational;
import android.util.Size;
import java.io.Serializable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j50  reason: default package */
/* loaded from: classes.dex */
public final class j50 {
    public int a;
    public int b;
    public boolean c;
    public final Serializable d;

    public j50(cg0 cg0Var, Rational rational) {
        this.a = cg0Var.b();
        this.b = cg0Var.m();
        this.d = rational;
        boolean z = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z = false;
        }
        this.c = z;
    }

    public Size a(n23 n23Var) {
        boolean z = false;
        int K = n23Var.K(0);
        Size size = (Size) n23Var.b(n23.s, null);
        int i = this.b;
        int i2 = this.a;
        if (size != null) {
            int Z = nb3.Z(K);
            if (1 == i) {
                z = true;
            }
            int z2 = nb3.z(Z, z, i2);
            if (z2 == 90 || z2 == 270) {
                return new Size(size.getHeight(), size.getWidth());
            }
        }
        return size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j50(u... uVarArr) {
        this.a = -1;
        this.b = -1;
        this.c = false;
        this.d = uVarArr;
    }
}
