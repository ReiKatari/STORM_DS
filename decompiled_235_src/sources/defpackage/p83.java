package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p83  reason: default package */
/* loaded from: classes.dex */
public final class p83 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public p83(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p83)) {
            return false;
        }
        p83 p83Var = (p83) obj;
        if (this.a == p83Var.a && this.b == p83Var.b && this.c == p83Var.c && this.d == p83Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return xg6.q(sb, this.d, ')');
    }
}
