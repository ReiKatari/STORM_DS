package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g47  reason: default package */
/* loaded from: classes.dex */
public final class g47 {
    public final nn6 a;
    public final nn6 b;
    public final nn6 c;
    public final nn6 d;

    public g47(nn6 nn6Var, nn6 nn6Var2, nn6 nn6Var3, nn6 nn6Var4) {
        this.a = nn6Var;
        this.b = nn6Var2;
        this.c = nn6Var3;
        this.d = nn6Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g47)) {
            return false;
        }
        g47 g47Var = (g47) obj;
        if (nb3.k(this.a, g47Var.a) && nb3.k(this.b, g47Var.b) && nb3.k(this.c, g47Var.c) && nb3.k(this.d, g47Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        nn6 nn6Var = this.a;
        if (nn6Var != null) {
            i = nn6Var.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        nn6 nn6Var2 = this.b;
        if (nn6Var2 != null) {
            i2 = nn6Var2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        nn6 nn6Var3 = this.c;
        if (nn6Var3 != null) {
            i3 = nn6Var3.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        nn6 nn6Var4 = this.d;
        if (nn6Var4 != null) {
            i4 = nn6Var4.hashCode();
        }
        return i7 + i4;
    }
}
