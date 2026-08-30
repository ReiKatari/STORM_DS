package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tl3  reason: default package */
/* loaded from: classes.dex */
public final class tl3 {
    public final long a;
    public final int b;
    public final String c;

    public tl3(String str, int i, long j) {
        this.a = j;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof tl3) {
                tl3 tl3Var = (tl3) obj;
                if (this.a != tl3Var.a || this.b != tl3Var.b || !this.c.equals(tl3Var.c)) {
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
        return "SubmitLegacy(leaderboardId=" + this.a + ", value=" + this.b + ", formattedValue=" + this.c + ")";
    }
}
