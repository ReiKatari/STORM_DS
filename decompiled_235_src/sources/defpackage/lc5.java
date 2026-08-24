package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lc5  reason: default package */
/* loaded from: classes.dex */
public final class lc5 {
    public static final lc5 f = new lc5(0, 0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public lc5(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc5)) {
            return false;
        }
        lc5 lc5Var = (lc5) obj;
        if (this.a == lc5Var.a && this.b == lc5Var.b && this.c == lc5Var.c && this.d == lc5Var.d && this.e == lc5Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + lb1.a(this.d, lb1.a(this.c, lb1.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder q = i61.q(this.a, this.b, "RaPendingCounts(total=", ", achievementUnlocks=", ", leaderboardEntries=");
        lb1.x(q, this.c, ", retryable=", this.d, ", permanentFailures=");
        return lb1.o(q, this.e, ")");
    }
}
