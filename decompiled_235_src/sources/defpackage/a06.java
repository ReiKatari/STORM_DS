package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a06  reason: default package */
/* loaded from: classes.dex */
public final class a06 {
    public final int a;
    public final int b;
    public final zz5 c;

    public a06(int i, int i2, zz5 zz5Var) {
        zz5Var.getClass();
        this.a = i;
        this.b = i2;
        this.c = zz5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a06)) {
            return false;
        }
        a06 a06Var = (a06) obj;
        if (this.a == a06Var.a && this.b == a06Var.b && this.c == a06Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + lb1.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder q = i61.q(this.a, this.b, "RequiredRomSection(offset=", ", size=", ", type=");
        q.append(this.c);
        q.append(")");
        return q.toString();
    }
}
