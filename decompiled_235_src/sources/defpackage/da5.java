package defpackage;

import java.net.URL;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: da5  reason: default package */
/* loaded from: classes.dex */
public final class da5 {
    public final long a;
    public final String b;
    public final URL c;
    public final String d;
    public final List e;

    public da5(long j, String str, URL url, String str2, List list) {
        str.getClass();
        this.a = j;
        this.b = str;
        this.c = url;
        this.d = str2;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof da5) {
                da5 da5Var = (da5) obj;
                if (!ga5.a(this.a, da5Var.a) || !nb3.k(this.b, da5Var.b) || !this.c.equals(da5Var.c) || !nb3.k(this.d, da5Var.d) || !this.e.equals(da5Var.e)) {
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
        int hashCode2 = (this.c.hashCode() + xg6.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.e.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder u = i61.u("RAGame(id=", ga5.b(this.a), ", title=", this.b, ", icon=");
        u.append(this.c);
        u.append(", richPresencePatch=");
        u.append(this.d);
        u.append(", sets=");
        u.append(this.e);
        u.append(")");
        return u.toString();
    }
}
