package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jp2  reason: default package */
/* loaded from: classes.dex */
public final class jp2 {
    public final String a;
    public final String b;
    public final ArrayList c;

    public jp2(String str, String str2, ArrayList arrayList) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jp2) {
                jp2 jp2Var = (jp2) obj;
                if (!nb3.k(this.a, jp2Var.a) || !nb3.k(this.b, jp2Var.b) || !this.c.equals(jp2Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + xg6.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder u = i61.u("LookupResult(query=", this.a, ", fullTranslation=", this.b, ", words=");
        u.append(this.c);
        u.append(")");
        return u.toString();
    }
}
