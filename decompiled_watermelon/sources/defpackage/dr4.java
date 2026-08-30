package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dr4  reason: default package */
/* loaded from: classes.dex */
public final class dr4 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;

    public dr4(boolean z, mx5 mx5Var, boolean z2, int i) {
        int i2;
        boolean z3;
        tv0 tv0Var = oj.a;
        if (!z) {
            i2 = 262152;
        } else {
            i2 = 262144;
        }
        i2 = mx5Var == mx5.SecureOn ? i2 | 8192 : i2;
        i2 = z2 ? i2 : i2 | 512;
        if (mx5Var == mx5.Inherit) {
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
            if (obj instanceof dr4) {
                dr4 dr4Var = (dr4) obj;
                if (this.a != dr4Var.a || this.b != dr4Var.b || this.c != dr4Var.c || this.d != dr4Var.d || this.e != dr4Var.e || this.f != dr4Var.f) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (ej6.c(ej6.c(ej6.c(ej6.c(ej6.c(this.a * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), false, 31) + this.f) * 31;
    }
}
