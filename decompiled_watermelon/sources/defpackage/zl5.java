package defpackage;

import java.util.Date;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zl5  reason: default package */
/* loaded from: classes.dex */
public final class zl5 {
    public static final int j = 8;
    @r06("name")
    private final String a;
    @r06("developerName")
    private final String b;
    @r06("fileName")
    private final String c;
    @r06("uri")
    private final String d;
    @r06("parentTreeUri")
    private final String e;
    @r06("config")
    private zi5 f;
    @r06("lastPlayed")
    private Date g;
    @r06("isDsiWareTitle")
    private final boolean h;
    @r06("retroAchievementsHash")
    private final String i;

    public zl5(String str, String str2, String str3, String str4, String str5, zi5 zi5Var, Date date, boolean z, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        zi5Var.getClass();
        str6.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = zi5Var;
        this.g = date;
        this.h = z;
        this.i = str6;
    }

    public static /* synthetic */ zl5 k(zl5 zl5Var, String str, String str2, String str3, String str4, String str5, zi5 zi5Var, Date date, boolean z, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zl5Var.a;
        }
        if ((i & 2) != 0) {
            str2 = zl5Var.b;
        }
        if ((i & 4) != 0) {
            str3 = zl5Var.c;
        }
        if ((i & 8) != 0) {
            str4 = zl5Var.d;
        }
        if ((i & 16) != 0) {
            str5 = zl5Var.e;
        }
        if ((i & 32) != 0) {
            zi5Var = zl5Var.f;
        }
        if ((i & 64) != 0) {
            date = zl5Var.g;
        }
        if ((i & 128) != 0) {
            z = zl5Var.h;
        }
        if ((i & 256) != 0) {
            str6 = zl5Var.i;
        }
        boolean z2 = z;
        String str7 = str6;
        zi5 zi5Var2 = zi5Var;
        Date date2 = date;
        String str8 = str5;
        String str9 = str3;
        return zl5Var.j(str, str2, str9, str4, str8, zi5Var2, date2, z2, str7);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl5)) {
            return false;
        }
        zl5 zl5Var = (zl5) obj;
        if (b53.x(this.a, zl5Var.a) && b53.x(this.b, zl5Var.b) && b53.x(this.c, zl5Var.c) && b53.x(this.d, zl5Var.d) && b53.x(this.e, zl5Var.e) && b53.x(this.f, zl5Var.f) && b53.x(this.g, zl5Var.g) && this.h == zl5Var.h && b53.x(this.i, zl5Var.i)) {
            return true;
        }
        return false;
    }

    public final zi5 f() {
        return this.f;
    }

    public final Date g() {
        return this.g;
    }

    public final boolean h() {
        return this.h;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f.hashCode() + ej6.b(ej6.b(ej6.b(ej6.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31;
        Date date = this.g;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        return this.i.hashCode() + ej6.c((hashCode2 + hashCode) * 31, this.h, 31);
    }

    public final String i() {
        return this.i;
    }

    public final zl5 j(String str, String str2, String str3, String str4, String str5, zi5 zi5Var, Date date, boolean z, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        zi5Var.getClass();
        str6.getClass();
        return new zl5(str, str2, str3, str4, str5, zi5Var, date, z, str6);
    }

    public final zi5 l() {
        return this.f;
    }

    public final String m() {
        return this.b;
    }

    public final String n() {
        return this.c;
    }

    public final Date o() {
        return this.g;
    }

    public final String p() {
        return this.a;
    }

    public final String q() {
        return this.e;
    }

    public final String r() {
        return this.i;
    }

    public final String s() {
        return this.d;
    }

    public final boolean t() {
        return this.h;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        String str5 = this.e;
        zi5 zi5Var = this.f;
        Date date = this.g;
        boolean z = this.h;
        String str6 = this.i;
        StringBuilder v = b31.v("RomDto31(name=", str, ", developerName=", str2, ", fileName=");
        b31.B(v, str3, ", uri=", str4, ", parentTreeUri=");
        v.append(str5);
        v.append(", config=");
        v.append(zi5Var);
        v.append(", lastPlayed=");
        v.append(date);
        v.append(", isDsiWareTitle=");
        v.append(z);
        v.append(", retroAchievementsHash=");
        return b31.q(v, str6, ")");
    }

    public final void u(zi5 zi5Var) {
        zi5Var.getClass();
        this.f = zi5Var;
    }

    public final void v(Date date) {
        this.g = date;
    }

    public /* synthetic */ zl5(String str, String str2, String str3, String str4, String str5, zi5 zi5Var, Date date, boolean z, String str6, int i, n91 n91Var) {
        this(str, str2, str3, str4, str5, zi5Var, (i & 64) != 0 ? null : date, z, str6);
    }
}
