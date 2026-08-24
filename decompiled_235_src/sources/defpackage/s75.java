package defpackage;

import java.net.URL;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s75  reason: default package */
/* loaded from: classes.dex */
public final class s75 {
    public final long a;
    public final long b;
    public final String c;
    public final r75 d;
    public final URL e;
    public final ArrayList f;
    public final ArrayList g;

    public s75(long j, long j2, r75 r75Var, String str, URL url, ArrayList arrayList, ArrayList arrayList2) {
        r75Var.getClass();
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = r75Var;
        this.e = url;
        this.f = arrayList;
        this.g = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof s75) {
                s75 s75Var = (s75) obj;
                if (this.a == s75Var.a && ga5.a(this.b, s75Var.b) && nb3.k(this.c, s75Var.c) && this.d == s75Var.d && this.e.equals(s75Var.e) && this.f.equals(s75Var.f) && this.g.equals(s75Var.g)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int c = i61.c(this.b, Long.hashCode(this.a) * 31, 31);
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = this.d.hashCode();
        int hashCode3 = this.e.hashCode();
        int hashCode4 = this.f.hashCode();
        return this.g.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((c + hashCode) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder u = i61.u("RAAchievementSet(id=", mp2.a0(this.a), ", gameId=", ga5.b(this.b), ", title=");
        u.append(this.c);
        u.append(", type=");
        u.append(this.d);
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
