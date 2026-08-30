package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hl5  reason: default package */
/* loaded from: classes.dex */
public final class hl5 extends kl5 {
    public final String a;
    public final il5 b;
    public final String c;

    public hl5(String str, il5 il5Var, String str2) {
        il5Var.getClass();
        this.a = str;
        this.b = il5Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hl5) {
                hl5 hl5Var = (hl5) obj;
                if (!this.a.equals(hl5Var.a) || this.b != hl5Var.b || !b53.x(this.c, hl5Var.c)) {
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
