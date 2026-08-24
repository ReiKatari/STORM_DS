package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jz1  reason: default package */
/* loaded from: classes.dex */
public final class jz1 {
    public final jq1 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final p66 h;
    public final p66 i;

    public jz1(jq1 jq1Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, p66 p66Var, p66 p66Var2) {
        this.a = jq1Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = p66Var;
        this.i = p66Var2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jz1) {
                jz1 jz1Var = (jz1) obj;
                if (this.a != jz1Var.a || this.b != jz1Var.b || this.c != jz1Var.c || this.d != jz1Var.d || this.e != jz1Var.e || this.f != jz1Var.f || this.g != jz1Var.g || this.h != jz1Var.h || this.i != jz1Var.i) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int e = xg6.e(xg6.e(xg6.e(xg6.e(xg6.e(xg6.e(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31);
        int i = 0;
        p66 p66Var = this.h;
        if (p66Var == null) {
            hashCode = 0;
        } else {
            hashCode = p66Var.hashCode();
        }
        int i2 = (e + hashCode) * 31;
        p66 p66Var2 = this.i;
        if (p66Var2 != null) {
            i = p66Var2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "DualScreenPresetConfiguration(preset=" + this.a + ", integerScale=" + this.b + ", keepAspectRatio=" + this.c + ", internalFillHeight=" + this.d + ", internalFillWidth=" + this.e + ", externalFillHeight=" + this.f + ", externalFillWidth=" + this.g + ", internalAlignmentOverride=" + this.h + ", externalAlignmentOverride=" + this.i + ")";
    }
}
