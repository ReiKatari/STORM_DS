package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vz1  reason: default package */
/* loaded from: classes.dex */
public final class vz1 {
    public final fk3 a;
    public final vr4 b;
    public final um6 c;
    public final boolean d;
    public final int e;

    public vz1(fk3 fk3Var, vr4 vr4Var, um6 um6Var, boolean z, int i) {
        um6Var.getClass();
        this.a = fk3Var;
        this.b = vr4Var;
        this.c = um6Var;
        this.d = z;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz1)) {
            return false;
        }
        vz1 vz1Var = (vz1) obj;
        if (nb3.k(this.a, vz1Var.a) && nb3.k(this.b, vz1Var.b) && this.c == vz1Var.c && this.d == vz1Var.d && this.e == vz1Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        fk3 fk3Var = this.a;
        if (fk3Var == null) {
            hashCode = 0;
        } else {
            hashCode = fk3Var.hashCode();
        }
        int i2 = hashCode * 31;
        vr4 vr4Var = this.b;
        if (vr4Var != null) {
            i = vr4Var.hashCode();
        }
        return Integer.hashCode(this.e) + xg6.e((this.c.hashCode() + ((i2 + i) * 31)) * 31, this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RuntimeLayoutConfiguration(layoutConfiguration=");
        sb.append(this.a);
        sb.append(", layoutVariant=");
        sb.append(this.b);
        sb.append(", softInputBehaviour=");
        sb.append(this.c);
        sb.append(", isHapticFeedbackEnabled=");
        sb.append(this.d);
        sb.append(", inputOpacity=");
        return lb1.o(sb, this.e, ")");
    }
}
