package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: un5  reason: default package */
/* loaded from: classes.dex */
public final class un5 extends vn5 {
    public final ta5 a;
    public final int b;
    public final String c;
    public final hb5 d;
    public final boolean e;

    public un5(ta5 ta5Var, int i, String str, hb5 hb5Var, boolean z) {
        this.a = ta5Var;
        this.b = i;
        this.c = str;
        this.d = hb5Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof un5) {
                un5 un5Var = (un5) obj;
                if (!this.a.equals(un5Var.a) || this.b != un5Var.b || !this.c.equals(un5Var.c) || !this.d.equals(un5Var.d) || this.e != un5Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int d = xg6.d(lb1.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + d) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeaderboardEntrySubmission(leaderboard=");
        sb.append(this.a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append(", formattedValue=");
        sb.append(this.c);
        sb.append(", authentication=");
        sb.append(this.d);
        sb.append(", firstTry=");
        return i61.o(sb, this.e, ")");
    }
}
