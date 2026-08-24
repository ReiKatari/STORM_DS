package defpackage;

import java.util.Date;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ow5  reason: default package */
/* loaded from: classes.dex */
public final class ow5 {
    public static final int j = 8;
    @gc6("name")
    private final String a;
    @gc6("developerName")
    private final String b;
    @gc6("fileName")
    private final String c;
    @gc6("uri")
    private final String d;
    @gc6("parentTreeUri")
    private final String e;
    @gc6("config")
    private ot5 f;
    @gc6("lastPlayed")
    private Date g;
    @gc6("isDsiWareTitle")
    private final boolean h;
    @gc6("retroAchievementsHash")
    private final String i;

    public ow5(String str, String str2, String str3, String str4, String str5, ot5 ot5Var, Date date, boolean z, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        ot5Var.getClass();
        str6.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = ot5Var;
        this.g = date;
        this.h = z;
        this.i = str6;
    }

    public static /* synthetic */ ow5 k(ow5 ow5Var, String str, String str2, String str3, String str4, String str5, ot5 ot5Var, Date date, boolean z, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ow5Var.a;
        }
        if ((i & 2) != 0) {
            str2 = ow5Var.b;
        }
        if ((i & 4) != 0) {
            str3 = ow5Var.c;
        }
        if ((i & 8) != 0) {
            str4 = ow5Var.d;
        }
        if ((i & 16) != 0) {
            str5 = ow5Var.e;
        }
        if ((i & 32) != 0) {
            ot5Var = ow5Var.f;
        }
        if ((i & 64) != 0) {
            date = ow5Var.g;
        }
        if ((i & 128) != 0) {
            z = ow5Var.h;
        }
        if ((i & 256) != 0) {
            str6 = ow5Var.i;
        }
        boolean z2 = z;
        String str7 = str6;
        ot5 ot5Var2 = ot5Var;
        Date date2 = date;
        String str8 = str5;
        String str9 = str3;
        return ow5Var.j(str, str2, str9, str4, str8, ot5Var2, date2, z2, str7);
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
        if (!(obj instanceof ow5)) {
            return false;
        }
        ow5 ow5Var = (ow5) obj;
        if (nb3.k(this.a, ow5Var.a) && nb3.k(this.b, ow5Var.b) && nb3.k(this.c, ow5Var.c) && nb3.k(this.d, ow5Var.d) && nb3.k(this.e, ow5Var.e) && nb3.k(this.f, ow5Var.f) && nb3.k(this.g, ow5Var.g) && this.h == ow5Var.h && nb3.k(this.i, ow5Var.i)) {
            return true;
        }
        return false;
    }

    public final ot5 f() {
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
        int hashCode2 = (this.f.hashCode() + xg6.d(xg6.d(xg6.d(xg6.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31;
        Date date = this.g;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        return this.i.hashCode() + xg6.e((hashCode2 + hashCode) * 31, this.h, 31);
    }

    public final String i() {
        return this.i;
    }

    public final ow5 j(String str, String str2, String str3, String str4, String str5, ot5 ot5Var, Date date, boolean z, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        ot5Var.getClass();
        str6.getClass();
        return new ow5(str, str2, str3, str4, str5, ot5Var, date, z, str6);
    }

    public final ot5 l() {
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
        ot5 ot5Var = this.f;
        Date date = this.g;
        boolean z = this.h;
        String str6 = this.i;
        StringBuilder u = i61.u("RomDto31(name=", str, ", developerName=", str2, ", fileName=");
        i61.B(u, str3, ", uri=", str4, ", parentTreeUri=");
        u.append(str5);
        u.append(", config=");
        u.append(ot5Var);
        u.append(", lastPlayed=");
        u.append(date);
        u.append(", isDsiWareTitle=");
        u.append(z);
        u.append(", retroAchievementsHash=");
        return i61.n(u, str6, ")");
    }

    public final void u(ot5 ot5Var) {
        ot5Var.getClass();
        this.f = ot5Var;
    }

    public final void v(Date date) {
        this.g = date;
    }

    public /* synthetic */ ow5(String str, String str2, String str3, String str4, String str5, ot5 ot5Var, Date date, boolean z, String str6, int i, id1 id1Var) {
        this(str, str2, str3, str4, str5, ot5Var, (i & 64) != 0 ? null : date, z, str6);
    }
}
