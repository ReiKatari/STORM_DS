package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ff1  reason: default package */
/* loaded from: classes.dex */
public final class ff1 {
    public final boolean a;
    public final boolean b;
    public final mx5 c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final int g;

    public ff1(int i) {
        boolean z;
        boolean z2;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z3 = (i & 4) != 0;
        mx5 mx5Var = mx5.Inherit;
        this.a = z;
        this.b = z2;
        this.c = mx5Var;
        this.d = z3;
        this.e = true;
        this.f = "";
        this.g = 2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ff1) {
                ff1 ff1Var = (ff1) obj;
                if (this.a != ff1Var.a || this.b != ff1Var.b || this.c != ff1Var.c || this.d != ff1Var.d || this.e != ff1Var.e || this.g != ff1Var.g) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (ej6.c(ej6.c((this.c.hashCode() + ej6.c(Boolean.hashCode(this.a) * 31, this.b, 31)) * 31, this.d, 31), this.e, 31) + this.g) * 31;
    }
}
