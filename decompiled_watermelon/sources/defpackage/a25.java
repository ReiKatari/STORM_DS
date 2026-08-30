package defpackage;

import java.net.URL;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a25  reason: default package */
/* loaded from: classes.dex */
public final class a25 {
    public final long a;
    public final String b;
    public final URL c;
    public final String d;
    public final ArrayList e;

    public a25(long j, String str, URL url, String str2, ArrayList arrayList) {
        str.getClass();
        this.a = j;
        this.b = str;
        this.c = url;
        this.d = str2;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a25) {
                a25 a25Var = (a25) obj;
                if (!w05.a(this.a, a25Var.a) || !b53.x(this.b, a25Var.b) || !this.c.equals(a25Var.c) || !b53.x(this.d, a25Var.d) || !this.e.equals(a25Var.e)) {
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
        StringBuilder v = b31.v("RAUserGameData(id=", w05.b(this.a), ", title=", this.b, ", icon=");
        v.append(this.c);
        v.append(", richPresencePatch=");
        v.append(this.d);
        v.append(", sets=");
        v.append(this.e);
        v.append(")");
        return v.toString();
    }
}
