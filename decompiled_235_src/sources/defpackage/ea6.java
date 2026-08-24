package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ea6  reason: default package */
/* loaded from: classes.dex */
public final class ea6 {
    public final da6 a;
    public final da6 b;
    public final boolean c;

    public ea6(da6 da6Var, da6 da6Var2, boolean z) {
        this.a = da6Var;
        this.b = da6Var2;
        this.c = z;
    }

    public static ea6 a(ea6 ea6Var, da6 da6Var, da6 da6Var2, boolean z, int i) {
        if ((i & 1) != 0) {
            da6Var = ea6Var.a;
        }
        if ((i & 2) != 0) {
            da6Var2 = ea6Var.b;
        }
        ea6Var.getClass();
        return new ea6(da6Var, da6Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea6)) {
            return false;
        }
        ea6 ea6Var = (ea6) obj;
        if (nb3.k(this.a, ea6Var.a) && nb3.k(this.b, ea6Var.b) && this.c == ea6Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Boolean.hashCode(this.c) + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", handlesCrossed=");
        return xg6.r(sb, this.c, ')');
    }
}
