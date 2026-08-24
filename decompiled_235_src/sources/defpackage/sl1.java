package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sl1  reason: default package */
/* loaded from: classes.dex */
public final class sl1 {
    public final rl1 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public sl1(rl1 rl1Var, long j, long j2, long j3, long j4) {
        rl1Var.getClass();
        this.a = rl1Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl1)) {
            return false;
        }
        sl1 sl1Var = (sl1) obj;
        if (this.a == sl1Var.a && this.b == sl1Var.b && this.c == sl1Var.c && this.d == sl1Var.d && this.e == sl1Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + i61.c(this.d, i61.c(this.c, i61.c(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnapshotEntry(kind=");
        sb.append(this.a);
        sb.append(", localLastModified=");
        sb.append(this.b);
        xg6.B(sb, ", localLength=", this.c, ", documentLastModified=");
        sb.append(this.d);
        return lb1.r(sb, ", documentLength=", this.e, ")");
    }
}
