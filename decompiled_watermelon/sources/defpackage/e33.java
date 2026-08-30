package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e33  reason: default package */
/* loaded from: classes.dex */
public final class e33 {
    public static final e33 e = new e33(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public e33(int i, int i2, int i3, int i4) {
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
        if (!(obj instanceof e33)) {
            return false;
        }
        e33 e33Var = (e33) obj;
        if (this.a == e33Var.a && this.b == e33Var.b && this.c == e33Var.c && this.d == e33Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + wh1.a(this.c, wh1.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return ej6.g(sb, this.d, ')');
    }
}
