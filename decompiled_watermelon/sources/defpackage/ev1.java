package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ev1  reason: default package */
/* loaded from: classes.dex */
public final class ev1 {
    public final String a;
    public final String b;
    public final ya4 c;
    public final ak2 d;
    public final boolean e;

    public ev1(String str, String str2, ya4 ya4Var, ak2 ak2Var, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = ya4Var;
        this.d = ak2Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ev1) {
                ev1 ev1Var = (ev1) obj;
                if (b53.x(this.a, ev1Var.a) && b53.x(this.b, ev1Var.b) && this.c.equals(ev1Var.c) && this.d == ev1Var.d && this.e == ev1Var.e) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int b = ej6.b(this.a.hashCode() * 31, 31, this.b);
        int hashCode = this.d.hashCode();
        return Boolean.hashCode(this.e) + ((hashCode + ((this.c.hashCode() + b) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b31.v("OfflineRetroAchievementsContext(userId=", this.a, ", contentId=", this.b, ", cache=");
        v.append(this.c);
        v.append(", achievementData=");
        v.append(this.d);
        v.append(", missingCache=");
        v.append(this.e);
        v.append(")");
        return v.toString();
    }
}
