package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wv2  reason: default package */
/* loaded from: classes.dex */
public final class wv2 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;

    public wv2(int i, int i2, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wv2) {
                wv2 wv2Var = (wv2) obj;
                if (!this.a.equals(wv2Var.a) || !this.b.equals(wv2Var.b) || !this.c.equals(wv2Var.c) || this.d != wv2Var.d || this.e != wv2Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + lb1.a(this.d, xg6.d(xg6.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder u = i61.u("PendingHardcoreUnlockLoss(userId=", this.a, ", contentId=", this.b, ", gameTitle=");
        u.append(this.c);
        u.append(", achievementCount=");
        u.append(this.d);
        u.append(", leaderboardCount=");
        return lb1.o(u, this.e, ")");
    }
}
