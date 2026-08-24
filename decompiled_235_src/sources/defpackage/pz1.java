package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pz1  reason: default package */
/* loaded from: classes.dex */
public final class pz1 {
    public final String a;
    public final String b;
    public final vj4 c;
    public final ep2 d;
    public final boolean e;

    public pz1(String str, String str2, vj4 vj4Var, ep2 ep2Var, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = vj4Var;
        this.d = ep2Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pz1) {
                pz1 pz1Var = (pz1) obj;
                if (nb3.k(this.a, pz1Var.a) && nb3.k(this.b, pz1Var.b) && this.c.equals(pz1Var.c) && this.d == pz1Var.d && this.e == pz1Var.e) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int d = xg6.d(this.a.hashCode() * 31, 31, this.b);
        int hashCode = this.d.hashCode();
        return Boolean.hashCode(this.e) + ((hashCode + ((this.c.hashCode() + d) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder u = i61.u("OfflineRetroAchievementsContext(userId=", this.a, ", contentId=", this.b, ", cache=");
        u.append(this.c);
        u.append(", achievementData=");
        u.append(this.d);
        u.append(", missingCache=");
        return i61.o(u, this.e, ")");
    }
}
