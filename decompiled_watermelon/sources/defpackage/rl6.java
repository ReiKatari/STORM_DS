package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rl6  reason: default package */
/* loaded from: classes.dex */
public final class rl6 {
    public final String a;
    public final int b;
    public final int c;

    public rl6(String str, int i, int i2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl6)) {
            return false;
        }
        rl6 rl6Var = (rl6) obj;
        if (b53.x(this.a, rl6Var.a) && this.b == rl6Var.b && this.c == rl6Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + wh1.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        sb.append(this.b);
        sb.append(", systemId=");
        return ej6.g(sb, this.c, ')');
    }
}
