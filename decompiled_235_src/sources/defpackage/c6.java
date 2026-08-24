package defpackage;

import java.net.URL;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c6  reason: default package */
/* loaded from: classes.dex */
public final class c6 {
    public final long a;
    public final String b;
    public final r75 c;
    public final URL d;
    public final qq5 e;
    public final List f;
    public final List g;

    public c6(long j, String str, r75 r75Var, URL url, qq5 qq5Var, List list, List list2) {
        r75Var.getClass();
        url.getClass();
        qq5Var.getClass();
        list.getClass();
        this.a = j;
        this.b = str;
        this.c = r75Var;
        this.d = url;
        this.e = qq5Var;
        this.f = list;
        this.g = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c6) {
                c6 c6Var = (c6) obj;
                if (this.a != c6Var.a || !nb3.k(this.b, c6Var.b) || this.c != c6Var.c || !nb3.k(this.d, c6Var.d) || !nb3.k(this.e, c6Var.e) || !nb3.k(this.f, c6Var.f) || !this.g.equals(c6Var.g)) {
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
        int hashCode2 = Long.hashCode(this.a) * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = this.c.hashCode();
        int hashCode4 = this.d.hashCode();
        return this.g.hashCode() + i61.b((this.e.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + hashCode) * 31)) * 31)) * 31)) * 31, this.f, 31);
    }

    public final String toString() {
        return "AchievementSetUiModel(setId=" + this.a + ", setTitle=" + this.b + ", setType=" + this.c + ", setIcon=" + this.d + ", setSummary=" + this.e + ", buckets=" + this.f + ", leaderboards=" + this.g + ")";
    }
}
