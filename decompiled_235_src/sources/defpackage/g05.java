package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g05  reason: default package */
/* loaded from: classes.dex */
public final class g05 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;

    public g05(boolean z, y86 y86Var, boolean z2, int i) {
        int i2;
        boolean z3;
        py0 py0Var = ak.a;
        if (!z) {
            i2 = 262152;
        } else {
            i2 = 262144;
        }
        i2 = y86Var == y86.SecureOn ? i2 | 8192 : i2;
        i2 = z2 ? i2 : i2 | 512;
        if (y86Var == y86.Inherit) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.a = i2;
        this.b = z3;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = 1002;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g05) {
                g05 g05Var = (g05) obj;
                if (this.a != g05Var.a || this.b != g05Var.b || this.c != g05Var.c || this.d != g05Var.d || this.e != g05Var.e || this.f != g05Var.f) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (xg6.e(xg6.e(xg6.e(xg6.e(xg6.e(this.a * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), false, 31) + this.f) * 31;
    }
}
