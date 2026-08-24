package defpackage;

import java.util.Date;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nb2  reason: default package */
/* loaded from: classes.dex */
public final class nb2 {
    public final String a;
    public final String b;
    public final String c;
    public final mt5 d;
    public final Date e;
    public final boolean f;
    public final String g;
    public final long h;
    public final boolean i;

    public nb2(String str, String str2, String str3, mt5 mt5Var, Date date, boolean z, String str4, long j, boolean z2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = mt5Var;
        this.e = date;
        this.f = z;
        this.g = str4;
        this.h = j;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof nb2) {
                nb2 nb2Var = (nb2) obj;
                if (!nb3.k(this.a, nb2Var.a) || !nb3.k(this.b, nb2Var.b) || !nb3.k(this.c, nb2Var.c) || !this.d.equals(nb2Var.d) || !nb3.k(this.e, nb2Var.e) || this.f != nb2Var.f || !nb3.k(this.g, nb2Var.g) || this.h != nb2Var.h || this.i != nb2Var.i) {
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
        int hashCode2 = (this.d.hashCode() + xg6.d(xg6.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        Date date = this.e;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        return Boolean.hashCode(this.i) + i61.c(this.h, xg6.d(xg6.e((hashCode2 + hashCode) * 31, this.f, 31), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder u = i61.u("RomMetadataMirrorDto(name=", this.a, ", developerName=", this.b, ", fileName=");
        u.append(this.c);
        u.append(", config=");
        u.append(this.d);
        u.append(", lastPlayed=");
        u.append(this.e);
        u.append(", isDsiWareTitle=");
        u.append(this.f);
        u.append(", retroAchievementsHash=");
        u.append(this.g);
        u.append(", totalPlayTime=");
        u.append(this.h);
        u.append(", isFavorite=");
        u.append(this.i);
        u.append(")");
        return u.toString();
    }
}
