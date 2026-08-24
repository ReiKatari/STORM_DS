package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j63  reason: default package */
/* loaded from: classes.dex */
public final class j63 {
    public final int a;
    public final int b;
    public final int c;

    public j63(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j63)) {
            return false;
        }
        j63 j63Var = (j63) obj;
        if (this.a == j63Var.a && this.b == j63Var.b && this.c == j63Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + lb1.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InputConfigData(width=");
        sb.append(this.a);
        sb.append(", height=");
        sb.append(this.b);
        sb.append(", format=");
        return xg6.q(sb, this.c, ')');
    }
}
