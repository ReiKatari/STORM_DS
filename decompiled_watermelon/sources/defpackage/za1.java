package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: za1  reason: default package */
/* loaded from: classes.dex */
public final class za1 {
    public final long a;
    public final long b;
    public final long c;

    public za1(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || za1.class != obj.getClass()) {
            return false;
        }
        za1 za1Var = (za1) obj;
        if (xq0.c(this.a, za1Var.a) && xq0.c(this.b, za1Var.b) && xq0.c(this.c, za1Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = xq0.i;
        return Long.hashCode(this.c) + b31.c(this.b, Long.hashCode(this.a) * 31, 31);
    }
}
