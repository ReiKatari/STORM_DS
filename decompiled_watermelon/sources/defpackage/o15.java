package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o15  reason: default package */
/* loaded from: classes.dex */
public final class o15 {
    public final long a;
    public final int b;
    public final ArrayList c;

    public o15(long j, int i, ArrayList arrayList) {
        this.a = j;
        this.b = i;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o15) {
                o15 o15Var = (o15) obj;
                if (this.a != o15Var.a || this.b != o15Var.b || !this.c.equals(o15Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + wh1.a(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "RALeaderboardRanking(leaderboardId=" + this.a + ", totalEntries=" + this.b + ", entries=" + this.c + ")";
    }
}
