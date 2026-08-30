package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yu1  reason: default package */
/* loaded from: classes.dex */
public final class yu1 {
    public final cm1 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final gv5 h;
    public final gv5 i;

    public yu1(cm1 cm1Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, gv5 gv5Var, gv5 gv5Var2) {
        this.a = cm1Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = gv5Var;
        this.i = gv5Var2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yu1) {
                yu1 yu1Var = (yu1) obj;
                if (this.a != yu1Var.a || this.b != yu1Var.b || this.c != yu1Var.c || this.d != yu1Var.d || this.e != yu1Var.e || this.f != yu1Var.f || this.g != yu1Var.g || this.h != yu1Var.h || this.i != yu1Var.i) {
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
        int c = ej6.c(ej6.c(ej6.c(ej6.c(ej6.c(ej6.c(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31);
        int i = 0;
        gv5 gv5Var = this.h;
        if (gv5Var == null) {
            hashCode = 0;
        } else {
            hashCode = gv5Var.hashCode();
        }
        int i2 = (c + hashCode) * 31;
        gv5 gv5Var2 = this.i;
        if (gv5Var2 != null) {
            i = gv5Var2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "DualScreenPresetConfiguration(preset=" + this.a + ", integerScale=" + this.b + ", keepAspectRatio=" + this.c + ", internalFillHeight=" + this.d + ", internalFillWidth=" + this.e + ", externalFillHeight=" + this.f + ", externalFillWidth=" + this.g + ", internalAlignmentOverride=" + this.h + ", externalAlignmentOverride=" + this.i + ")";
    }
}
