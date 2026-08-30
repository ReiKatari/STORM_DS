package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i23  reason: default package */
/* loaded from: classes.dex */
public final class i23 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public i23(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i23)) {
            return false;
        }
        i23 i23Var = (i23) obj;
        if (this.a == i23Var.a && this.b == i23Var.b && this.c == i23Var.c && this.d == i23Var.d) {
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
        return ej6.g(sb, this.d, ')');
    }
}
