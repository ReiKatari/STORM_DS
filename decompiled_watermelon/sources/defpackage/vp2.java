package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vp2  reason: default package */
/* loaded from: classes.dex */
public final class vp2 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;

    public vp2(int i, int i2, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vp2) {
                vp2 vp2Var = (vp2) obj;
                if (!this.a.equals(vp2Var.a) || !this.b.equals(vp2Var.b) || !this.c.equals(vp2Var.c) || this.d != vp2Var.d || this.e != vp2Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + wh1.a(this.d, ej6.b(ej6.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder v = b31.v("PendingHardcoreUnlockLoss(userId=", this.a, ", contentId=", this.b, ", gameTitle=");
        v.append(this.c);
        v.append(", achievementCount=");
        v.append(this.d);
        v.append(", leaderboardCount=");
        return wh1.m(v, this.e, ")");
    }
}
