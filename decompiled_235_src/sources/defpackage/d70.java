package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d70  reason: default package */
/* loaded from: classes.dex */
public final class d70 {
    public final String a;
    public final String b;
    public final Set c;

    public d70(String str, String str2, Set set) {
        this.a = str;
        this.b = str2;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d70) {
                d70 d70Var = (d70) obj;
                if (!this.a.equals(d70Var.a) || !this.b.equals(d70Var.b) || !this.c.equals(d70Var.c)) {
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
        StringBuilder u = i61.u("IndexEntry(fullUrl=", this.a, ", normalized=", this.b, ", tokens=");
        u.append(this.c);
        u.append(")");
        return u.toString();
    }
}
