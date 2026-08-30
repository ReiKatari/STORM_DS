package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zl3  reason: default package */
/* loaded from: classes.dex */
public final class zl3 {
    public final boolean a;
    public final long b;
    public final long c;

    public zl3(long j, long j2, boolean z) {
        this.a = z;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zl3) {
                zl3 zl3Var = (zl3) obj;
                if (this.a != zl3Var.a || this.b != zl3Var.b || this.c != zl3Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + b31.c(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Decision(shouldLog=");
        sb.append(this.a);
        sb.append(", updateIndex=");
        sb.append(this.b);
        return wh1.p(sb, ", suppressedUpdates=", this.c, ")");
    }
}
