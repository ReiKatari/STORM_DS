package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zn5  reason: default package */
/* loaded from: classes.dex */
public final class zn5 {
    public final int a;
    public final int b;

    public zn5(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn5)) {
            return false;
        }
        zn5 zn5Var = (zn5) obj;
        if (this.a == zn5Var.a && this.b == zn5Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xg6.m(this.a, this.b, "PendingSubmissionsSummary(pendingAchievements=", ", pendingLeaderboardSubmissions=", ")");
    }
}
