package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d83  reason: default package */
/* loaded from: classes.dex */
public final class d83 {
    public static final d83 e = new d83(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public d83(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d83)) {
            return false;
        }
        d83 d83Var = (d83) obj;
        if (this.a == d83Var.a && this.b == d83Var.b && this.c == d83Var.c && this.d == d83Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + lb1.a(this.c, lb1.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder q = i61.q(this.a, this.b, "Insets(left=", ", top=", ", right=");
        q.append(this.c);
        q.append(", bottom=");
        q.append(this.d);
        q.append(")");
        return q.toString();
    }
}
