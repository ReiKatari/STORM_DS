package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b35  reason: default package */
/* loaded from: classes.dex */
public final class b35 {
    public static final b35 f = new b35(0, 0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public b35(int i, int i2, int i3, int i4, int i5) {
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
        if (!(obj instanceof b35)) {
            return false;
        }
        b35 b35Var = (b35) obj;
        if (this.a == b35Var.a && this.b == b35Var.b && this.c == b35Var.c && this.d == b35Var.d && this.e == b35Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + wh1.a(this.d, wh1.a(this.c, wh1.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder s = b31.s(this.a, this.b, "RaPendingCounts(total=", ", achievementUnlocks=", ", leaderboardEntries=");
        b31.A(s, this.c, ", retryable=", this.d, ", permanentFailures=");
        return wh1.m(s, this.e, ")");
    }
}
