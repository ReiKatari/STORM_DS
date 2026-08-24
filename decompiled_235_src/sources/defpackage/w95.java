package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w95  reason: default package */
/* loaded from: classes.dex */
public final class w95 extends ca5 {
    public final long a;
    public final ls3 b;
    public final boolean c;

    public w95(long j, ls3 ls3Var, boolean z) {
        this.a = j;
        this.b = ls3Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w95) {
                w95 w95Var = (w95) obj;
                if (this.a != w95Var.a || !nb3.k(this.b, w95Var.b) || this.c != w95Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
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
        return Boolean.hashCode(this.c) + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        return "LeaderboardEntrySubmitError(leaderboardId=" + this.a + ", attemptKey=" + this.b + ", willRetryInBackground=" + this.c + ")";
    }
}
