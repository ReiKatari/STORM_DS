package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m93  reason: default package */
/* loaded from: classes.dex */
public final class m93 {
    public static final m93 e = new m93(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public m93(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final int a() {
        return this.d - this.b;
    }

    public final long b() {
        return (this.a << 32) | (this.b & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m93)) {
            return false;
        }
        m93 m93Var = (m93) obj;
        if (this.a == m93Var.a && this.b == m93Var.b && this.c == m93Var.c && this.d == m93Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + lb1.a(this.c, lb1.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return xg6.q(sb, this.d, ')');
    }
}
