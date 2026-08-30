package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z40  reason: default package */
/* loaded from: classes.dex */
public final class z40 {
    public final String a;
    public final String b;
    public final Set c;

    public z40(String str, String str2, Set set) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof z40) {
                z40 z40Var = (z40) obj;
                if (!b53.x(this.a, z40Var.a) || !this.b.equals(z40Var.b) || !this.c.equals(z40Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + ej6.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b31.v("IndexEntry(encodedName=", this.a, ", normalized=", this.b, ", tokens=");
        v.append(this.c);
        v.append(")");
        return v.toString();
    }
}
