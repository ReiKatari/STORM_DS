package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ry5  reason: default package */
/* loaded from: classes.dex */
public final class ry5 {
    public final qy5 a;
    public final qy5 b;
    public final boolean c;

    public ry5(qy5 qy5Var, qy5 qy5Var2, boolean z) {
        this.a = qy5Var;
        this.b = qy5Var2;
        this.c = z;
    }

    public static ry5 a(ry5 ry5Var, qy5 qy5Var, qy5 qy5Var2, boolean z, int i) {
        if ((i & 1) != 0) {
            qy5Var = ry5Var.a;
        }
        if ((i & 2) != 0) {
            qy5Var2 = ry5Var.b;
        }
        ry5Var.getClass();
        return new ry5(qy5Var, qy5Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry5)) {
            return false;
        }
        ry5 ry5Var = (ry5) obj;
        if (b53.x(this.a, ry5Var.a) && b53.x(this.b, ry5Var.b) && this.c == ry5Var.c) {
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
        return ej6.h(sb, this.c, ')');
    }
}
