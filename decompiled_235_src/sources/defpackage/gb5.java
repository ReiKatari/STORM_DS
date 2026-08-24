package defpackage;

import java.net.URL;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gb5  reason: default package */
/* loaded from: classes.dex */
public final class gb5 {
    public final long a;
    public final String b;
    public final r75 c;
    public final long d;
    public final URL e;
    public final ArrayList f;
    public final ArrayList g;

    public gb5(long j, long j2, r75 r75Var, String str, URL url, ArrayList arrayList, ArrayList arrayList2) {
        r75Var.getClass();
        this.a = j;
        this.b = str;
        this.c = r75Var;
        this.d = j2;
        this.e = url;
        this.f = arrayList;
        this.g = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gb5) {
                gb5 gb5Var = (gb5) obj;
                if (this.a == gb5Var.a && nb3.k(this.b, gb5Var.b) && this.c == gb5Var.c && ga5.a(this.d, gb5Var.d) && this.e.equals(gb5Var.e) && this.f.equals(gb5Var.f) && this.g.equals(gb5Var.g)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Long.hashCode(this.a) * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = this.c.hashCode();
        int c = i61.c(this.d, (hashCode3 + ((hashCode2 + hashCode) * 31)) * 31, 31);
        int hashCode4 = this.f.hashCode();
        return this.g.hashCode() + ((hashCode4 + ((this.e.hashCode() + c) * 31)) * 31);
    }

    public final String toString() {
        String a0 = mp2.a0(this.a);
        String b = ga5.b(this.d);
        StringBuilder u = i61.u("RAUserAchievementSet(id=", a0, ", title=", this.b, ", type=");
        u.append(this.c);
        u.append(", gameId=");
        u.append(b);
        u.append(", iconUrl=");
        u.append(this.e);
        u.append(", achievements=");
        u.append(this.f);
        u.append(", leaderboards=");
        u.append(this.g);
        u.append(")");
        return u.toString();
    }
}
