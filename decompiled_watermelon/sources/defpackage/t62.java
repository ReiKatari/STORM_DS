package defpackage;

import java.util.Date;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t62  reason: default package */
/* loaded from: classes.dex */
public final class t62 {
    public final String a;
    public final String b;
    public final String c;
    public final xi5 d;
    public final Date e;
    public final boolean f;
    public final String g;
    public final long h;
    public final boolean i;

    public t62(String str, String str2, String str3, xi5 xi5Var, Date date, boolean z, String str4, long j, boolean z2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = xi5Var;
        this.e = date;
        this.f = z;
        this.g = str4;
        this.h = j;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t62) {
                t62 t62Var = (t62) obj;
                if (!b53.x(this.a, t62Var.a) || !b53.x(this.b, t62Var.b) || !b53.x(this.c, t62Var.c) || !this.d.equals(t62Var.d) || !b53.x(this.e, t62Var.e) || this.f != t62Var.f || !b53.x(this.g, t62Var.g) || this.h != t62Var.h || this.i != t62Var.i) {
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
        int hashCode2 = (this.d.hashCode() + ej6.b(ej6.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        Date date = this.e;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        return Boolean.hashCode(this.i) + b31.c(this.h, ej6.b(ej6.c((hashCode2 + hashCode) * 31, this.f, 31), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder v = b31.v("RomMetadataMirrorDto(name=", this.a, ", developerName=", this.b, ", fileName=");
        v.append(this.c);
        v.append(", config=");
        v.append(this.d);
        v.append(", lastPlayed=");
        v.append(this.e);
        v.append(", isDsiWareTitle=");
        v.append(this.f);
        v.append(", retroAchievementsHash=");
        v.append(this.g);
        v.append(", totalPlayTime=");
        v.append(this.h);
        v.append(", isFavorite=");
        v.append(this.i);
        v.append(")");
        return v.toString();
    }
}
