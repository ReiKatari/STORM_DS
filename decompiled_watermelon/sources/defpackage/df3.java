package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: df3  reason: default package */
/* loaded from: classes.dex */
public final class df3 {
    public final int a;
    public final int b;
    public final boolean c;

    public df3(int i, boolean z, int i2) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df3)) {
            return false;
        }
        df3 df3Var = (df3) obj;
        if (this.a == df3Var.a && this.b == df3Var.b && this.c == df3Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + wh1.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BidiRun(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", isRtl=");
        return ej6.h(sb, this.c, ')');
    }
}
