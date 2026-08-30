package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fp5  reason: default package */
/* loaded from: classes.dex */
public final class fp5 {
    public final int a;
    public final int b;
    public final ep5 c;

    public fp5(int i, int i2, ep5 ep5Var) {
        ep5Var.getClass();
        this.a = i;
        this.b = i2;
        this.c = ep5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp5)) {
            return false;
        }
        fp5 fp5Var = (fp5) obj;
        if (this.a == fp5Var.a && this.b == fp5Var.b && this.c == fp5Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + wh1.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder s = b31.s(this.a, this.b, "RequiredRomSection(offset=", ", size=", ", type=");
        s.append(this.c);
        s.append(")");
        return s.toString();
    }
}
