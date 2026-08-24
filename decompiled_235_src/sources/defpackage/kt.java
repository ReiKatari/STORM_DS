package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kt  reason: default package */
/* loaded from: classes.dex */
public final class kt {
    public final jt a;
    public final long b;
    public final Uri c;
    public final bm7 d;
    public final String e;
    public final long f;
    public final s83 g;
    public final String h;
    public final String i;

    public kt(jt jtVar, long j, Uri uri, bm7 bm7Var, String str, long j2, s83 s83Var, String str2, String str3) {
        jtVar.getClass();
        uri.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = jtVar;
        this.b = j;
        this.c = uri;
        this.d = bm7Var;
        this.e = str;
        this.f = j2;
        this.g = s83Var;
        this.h = str2;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kt) {
                kt ktVar = (kt) obj;
                if (this.a != ktVar.a || this.b != ktVar.b || !nb3.k(this.c, ktVar.c) || !this.d.equals(ktVar.d) || !nb3.k(this.e, ktVar.e) || this.f != ktVar.f || !this.g.equals(ktVar.g) || !nb3.k(this.h, ktVar.h) || !nb3.k(this.i, ktVar.i)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int c = i61.c(this.b, this.a.hashCode() * 31, 31);
        return this.i.hashCode() + xg6.d((this.g.hashCode() + i61.c(this.f, xg6.d((this.d.hashCode() + ((this.c.hashCode() + c) * 31)) * 31, 31, this.e), 31)) * 31, 31, this.h);
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
        i61.B(sb, ", releaseTag=", this.h, ", sourceReleaseUrl=", this.i);
        sb.append(")");
        return sb.toString();
    }
}
