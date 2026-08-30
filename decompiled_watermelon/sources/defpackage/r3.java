package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r3  reason: default package */
/* loaded from: classes.dex */
public final class r3 extends se {
    public final long p;

    public r3(long j) {
        this.p = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof r3) && this.p == ((r3) obj).p) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.p);
    }

    public final String toString() {
        return "SubmitLeaderboard(leaderboardId=" + this.p + ")";
    }
}
