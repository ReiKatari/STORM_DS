package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ya5  reason: default package */
/* loaded from: classes.dex */
public final class ya5 {
    public final long a;
    public final int b;
    public final ArrayList c;

    public ya5(long j, int i, ArrayList arrayList) {
        this.a = j;
        this.b = i;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ya5) {
                ya5 ya5Var = (ya5) obj;
                if (this.a != ya5Var.a || this.b != ya5Var.b || !this.c.equals(ya5Var.c)) {
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
        return "RALeaderboardRanking(leaderboardId=" + this.a + ", totalEntries=" + this.b + ", entries=" + this.c + ")";
    }
}
