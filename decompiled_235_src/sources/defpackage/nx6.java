package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nx6  reason: default package */
/* loaded from: classes.dex */
public final class nx6 {
    public final String a;
    public final int b;
    public final int c;

    public nx6(String str, int i, int i2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx6)) {
            return false;
        }
        nx6 nx6Var = (nx6) obj;
        if (nb3.k(this.a, nx6Var.a) && this.b == nx6Var.b && this.c == nx6Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + lb1.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        sb.append(this.b);
        sb.append(", systemId=");
        return xg6.q(sb, this.c, ')');
    }
}
