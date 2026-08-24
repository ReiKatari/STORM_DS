package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jj1  reason: default package */
/* loaded from: classes.dex */
public final class jj1 {
    public final boolean a;
    public final boolean b;
    public final y86 c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final int g;

    public jj1(int i, boolean z, boolean z2) {
        boolean z3;
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? true : z2;
        if ((i & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        y86 y86Var = y86.Inherit;
        this.a = z;
        this.b = z2;
        this.c = y86Var;
        this.d = z3;
        this.e = true;
        this.f = "";
        this.g = 2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jj1) {
                jj1 jj1Var = (jj1) obj;
                if (this.a != jj1Var.a || this.b != jj1Var.b || this.c != jj1Var.c || this.d != jj1Var.d || this.e != jj1Var.e || this.g != jj1Var.g) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (xg6.e(xg6.e((this.c.hashCode() + xg6.e(Boolean.hashCode(this.a) * 31, this.b, 31)) * 31, this.d, 31), this.e, 31) + this.g) * 31;
    }
}
