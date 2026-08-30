package defpackage;

import java.net.URL;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c6  reason: default package */
/* loaded from: classes.dex */
public final class c6 {
    public final long a;
    public final String b;
    public final gy4 c;
    public final URL d;
    public final sg5 e;
    public final List f;
    public final List g;

    public c6(long j, String str, gy4 gy4Var, URL url, sg5 sg5Var, List list, List list2) {
        gy4Var.getClass();
        url.getClass();
        sg5Var.getClass();
        list.getClass();
        this.a = j;
        this.b = str;
        this.c = gy4Var;
        this.d = url;
        this.e = sg5Var;
        this.f = list;
        this.g = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c6) {
                c6 c6Var = (c6) obj;
                if (this.a != c6Var.a || !b53.x(this.b, c6Var.b) || this.c != c6Var.c || !b53.x(this.d, c6Var.d) || !b53.x(this.e, c6Var.e) || !b53.x(this.f, c6Var.f) || !this.g.equals(c6Var.g)) {
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
        return this.g.hashCode() + b31.b((this.e.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + hashCode) * 31)) * 31)) * 31)) * 31, 31, this.f);
    }

    public final String toString() {
        return "AchievementSetUiModel(setId=" + this.a + ", setTitle=" + this.b + ", setType=" + this.c + ", setIcon=" + this.d + ", setSummary=" + this.e + ", buckets=" + this.f + ", leaderboards=" + this.g + ")";
    }
}
