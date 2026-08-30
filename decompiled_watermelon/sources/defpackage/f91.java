package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f91  reason: default package */
/* loaded from: classes.dex */
public final class f91 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public f91(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f91.class != obj.getClass()) {
            return false;
        }
        f91 f91Var = (f91) obj;
        if (xq0.c(this.a, f91Var.a) && xq0.c(this.b, f91Var.b) && xq0.c(this.c, f91Var.c) && xq0.c(this.d, f91Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = xq0.i;
        return Long.hashCode(this.d) + b31.c(this.c, b31.c(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }
}
