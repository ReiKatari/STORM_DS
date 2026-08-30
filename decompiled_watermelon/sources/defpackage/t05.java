package defpackage;

import java.net.URL;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t05  reason: default package */
/* loaded from: classes.dex */
public final class t05 {
    public final long a;
    public final String b;
    public final URL c;
    public final String d;
    public final List e;

    public t05(long j, String str, URL url, String str2, List list) {
        str.getClass();
        this.a = j;
        this.b = str;
        this.c = url;
        this.d = str2;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t05) {
                t05 t05Var = (t05) obj;
                if (!w05.a(this.a, t05Var.a) || !b53.x(this.b, t05Var.b) || !this.c.equals(t05Var.c) || !b53.x(this.d, t05Var.d) || !this.e.equals(t05Var.e)) {
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
        int hashCode2 = (this.c.hashCode() + ej6.b(Long.hashCode(this.a) * 31, 31, this.b)) * 31;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.e.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder v = b31.v("RAGame(id=", w05.b(this.a), ", title=", this.b, ", icon=");
        v.append(this.c);
        v.append(", richPresencePatch=");
        v.append(this.d);
        v.append(", sets=");
        v.append(this.e);
        v.append(")");
        return v.toString();
    }
}
