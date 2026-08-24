package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wv5  reason: default package */
/* loaded from: classes.dex */
public final class wv5 extends zv5 {
    public final String a;
    public final xv5 b;
    public final String c;

    public wv5(String str, xv5 xv5Var, String str2) {
        xv5Var.getClass();
        this.a = str;
        this.b = xv5Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wv5) {
                wv5 wv5Var = (wv5) obj;
                if (!this.a.equals(wv5Var.a) || this.b != wv5Var.b || !nb3.k(this.c, wv5Var.c)) {
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
