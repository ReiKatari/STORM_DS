package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: us  reason: default package */
/* loaded from: classes.dex */
public final class us {
    public final ts a;
    public final long b;
    public final Uri c;
    public final c87 d;
    public final String e;
    public final long f;
    public final l23 g;
    public final String h;
    public final String i;

    public us(ts tsVar, long j, Uri uri, c87 c87Var, String str, long j2, l23 l23Var, String str2, String str3) {
        tsVar.getClass();
        uri.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = tsVar;
        this.b = j;
        this.c = uri;
        this.d = c87Var;
        this.e = str;
        this.f = j2;
        this.g = l23Var;
        this.h = str2;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof us) {
                us usVar = (us) obj;
                if (this.a != usVar.a || this.b != usVar.b || !b53.x(this.c, usVar.c) || !this.d.equals(usVar.d) || !b53.x(this.e, usVar.e) || this.f != usVar.f || !this.g.equals(usVar.g) || !b53.x(this.h, usVar.h) || !b53.x(this.i, usVar.i)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int c = b31.c(this.b, this.a.hashCode() * 31, 31);
        return this.i.hashCode() + ej6.b((this.g.hashCode() + b31.c(this.f, ej6.b((this.d.hashCode() + ((this.c.hashCode() + c) * 31)) * 31, 31, this.e), 31)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppUpdate(type=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", downloadUri=");
        sb.append(this.c);
        sb.append(", newVersion=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", binarySize=");
        sb.append(this.f);
        sb.append(", updateDate=");
        sb.append(this.g);
        b31.B(sb, ", releaseTag=", this.h, ", sourceReleaseUrl=", this.i);
        sb.append(")");
        return sb.toString();
    }
}
