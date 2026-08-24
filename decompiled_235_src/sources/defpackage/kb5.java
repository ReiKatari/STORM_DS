package defpackage;

import java.net.URL;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kb5  reason: default package */
/* loaded from: classes.dex */
public final class kb5 {
    public final long a;
    public final String b;
    public final URL c;
    public final String d;
    public final ArrayList e;

    public kb5(long j, String str, URL url, String str2, ArrayList arrayList) {
        str.getClass();
        this.a = j;
        this.b = str;
        this.c = url;
        this.d = str2;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kb5) {
                kb5 kb5Var = (kb5) obj;
                if (!ga5.a(this.a, kb5Var.a) || !nb3.k(this.b, kb5Var.b) || !this.c.equals(kb5Var.c) || !nb3.k(this.d, kb5Var.d) || !this.e.equals(kb5Var.e)) {
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
        StringBuilder u = i61.u("RAUserGameData(id=", ga5.b(this.a), ", title=", this.b, ", icon=");
        u.append(this.c);
        u.append(", richPresencePatch=");
        u.append(this.d);
        u.append(", sets=");
        u.append(this.e);
        u.append(")");
        return u.toString();
    }
}
