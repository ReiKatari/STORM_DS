package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t95  reason: default package */
/* loaded from: classes.dex */
public final class t95 extends ca5 {
    public final long a;
    public final ls3 b;

    public t95(long j, ls3 ls3Var) {
        this.a = j;
        this.b = ls3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t95)) {
            return false;
        }
        t95 t95Var = (t95) obj;
        if (this.a == t95Var.a && nb3.k(this.b, t95Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Long.hashCode(this.a) * 31;
        ls3 ls3Var = this.b;
        if (ls3Var == null) {
            hashCode = 0;
        } else {
            hashCode = ls3Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "LeaderboardAttemptCancelled(leaderboardId=" + this.a + ", attemptKey=" + this.b + ")";
    }
}
