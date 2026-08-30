package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g03  reason: default package */
/* loaded from: classes.dex */
public final class g03 {
    public final int a;
    public final int b;
    public final int c;

    public g03(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g03)) {
            return false;
        }
        g03 g03Var = (g03) obj;
        if (this.a == g03Var.a && this.b == g03Var.b && this.c == g03Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + wh1.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InputConfigData(width=");
        sb.append(this.a);
        sb.append(", height=");
        sb.append(this.b);
        sb.append(", format=");
        return ej6.g(sb, this.c, ')');
    }
}
