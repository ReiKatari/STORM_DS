package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ju6  reason: default package */
/* loaded from: classes.dex */
public final class ju6 extends gv6 {
    public final String a;
    public final ku6 b;
    public final String c;

    public ju6(String str, ku6 ku6Var, String str2) {
        ku6Var.getClass();
        this.a = str;
        this.b = ku6Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ju6) {
                ju6 ju6Var = (ju6) obj;
                if (!this.a.equals(ju6Var.a) || this.b != ju6Var.b || !b53.x(this.c, ju6Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfflineAchievementNotSynced(title=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", reasonDetail=");
        return b31.q(sb, this.c, ")");
    }
}
