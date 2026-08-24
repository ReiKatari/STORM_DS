package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zs3  reason: default package */
/* loaded from: classes.dex */
public final class zs3 {
    public final long a;
    public final long b;

    public zs3(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs3)) {
            return false;
        }
        zs3 zs3Var = (zs3) obj;
        if (this.a == zs3Var.a && this.b == zs3Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return lb1.p(xg6.s(this.a, "AttemptKey(leaderboardId=", ", attemptId="), this.b, ")");
    }
}
