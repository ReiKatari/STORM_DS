package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x85  reason: default package */
/* loaded from: classes.dex */
public final class x85 extends l95 {
    public final long a;
    public final int b;
    public final String c;

    public x85(String str, int i, long j) {
        this.a = j;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof x85) {
                x85 x85Var = (x85) obj;
                if (this.a != x85Var.a || this.b != x85Var.b || !this.c.equals(x85Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + lb1.a(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "OnLeaderboardAttemptCompleted(leaderboardId=" + this.a + ", value=" + this.b + ", formattedValue=" + this.c + ")";
    }
}
