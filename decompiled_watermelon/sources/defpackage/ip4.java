package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ip4  reason: default package */
/* loaded from: classes.dex */
public final class ip4 {
    public int a;
    public int b;

    public ip4(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip4)) {
            return false;
        }
        ip4 ip4Var = (ip4) obj;
        if (this.a == ip4Var.a && this.b == ip4Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        return "Point(x=" + i + ", y=" + i2 + ")";
    }
}
