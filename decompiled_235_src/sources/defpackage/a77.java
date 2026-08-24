package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a77  reason: default package */
/* loaded from: classes.dex */
public final class a77 extends x77 {
    public final String a;
    public final b77 b;
    public final String c;

    public a77(String str, b77 b77Var, String str2) {
        b77Var.getClass();
        this.a = str;
        this.b = b77Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a77) {
                a77 a77Var = (a77) obj;
                if (!this.a.equals(a77Var.a) || this.b != a77Var.b || !nb3.k(this.c, a77Var.c)) {
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
        return i61.n(sb, this.c, ")");
    }
}
