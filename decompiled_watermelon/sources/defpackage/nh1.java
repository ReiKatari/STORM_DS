package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nh1  reason: default package */
/* loaded from: classes.dex */
public final class nh1 {
    public final mh1 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public nh1(mh1 mh1Var, long j, long j2, long j3, long j4) {
        mh1Var.getClass();
        this.a = mh1Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh1)) {
            return false;
        }
        nh1 nh1Var = (nh1) obj;
        if (this.a == nh1Var.a && this.b == nh1Var.b && this.c == nh1Var.c && this.d == nh1Var.d && this.e == nh1Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + b31.c(this.d, b31.c(this.c, b31.c(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnapshotEntry(kind=");
        sb.append(this.a);
        sb.append(", localLastModified=");
        sb.append(this.b);
        ej6.k(sb, ", localLength=", this.c, ", documentLastModified=");
        sb.append(this.d);
        return wh1.p(sb, ", documentLength=", this.e, ")");
    }
}
