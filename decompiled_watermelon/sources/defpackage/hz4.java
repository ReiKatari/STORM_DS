package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hz4  reason: default package */
/* loaded from: classes.dex */
public final class hz4 extends b05 {
    public final long a;
    public final int b;
    public final int c;
    public final String d;

    public hz4(int i, int i2, long j, String str) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hz4) {
                hz4 hz4Var = (hz4) obj;
                if (this.a != hz4Var.a || this.b != hz4Var.b || this.c != hz4Var.c || !this.d.equals(hz4Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + wh1.a(this.c, wh1.a(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "OnAchievementProgressUpdated(achievementId=" + this.a + ", current=" + this.b + ", target=" + this.c + ", progress=" + this.d + ")";
    }
}
