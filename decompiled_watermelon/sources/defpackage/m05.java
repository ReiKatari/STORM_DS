package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m05  reason: default package */
/* loaded from: classes.dex */
public final class m05 extends s05 {
    public final long a;
    public final kl3 b;
    public final boolean c;

    public m05(long j, kl3 kl3Var, boolean z) {
        this.a = j;
        this.b = kl3Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m05) {
                m05 m05Var = (m05) obj;
                if (this.a != m05Var.a || !b53.x(this.b, m05Var.b) || this.c != m05Var.c) {
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
        kl3 kl3Var = this.b;
        if (kl3Var == null) {
            hashCode = 0;
        } else {
            hashCode = kl3Var.hashCode();
        }
        return Boolean.hashCode(this.c) + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        return "LeaderboardEntrySubmitError(leaderboardId=" + this.a + ", attemptKey=" + this.b + ", willRetryInBackground=" + this.c + ")";
    }
}
