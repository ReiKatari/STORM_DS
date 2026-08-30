package bg;

import java.util.Date;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: j  reason: collision with root package name */
    public static final int f2230j = 8;
    @va.b("name")

    /* renamed from: a  reason: collision with root package name */
    private final String f2231a;
    @va.b("developerName")

    /* renamed from: b  reason: collision with root package name */
    private final String f2232b;
    @va.b("fileName")

    /* renamed from: c  reason: collision with root package name */
    private final String f2233c;
    @va.b("uri")

    /* renamed from: d  reason: collision with root package name */
    private final String f2234d;
    @va.b("parentTreeUri")

    /* renamed from: e  reason: collision with root package name */
    private final String f2235e;
    @va.b("config")

    /* renamed from: f  reason: collision with root package name */
    private d f2236f;
    @va.b("lastPlayed")

    /* renamed from: g  reason: collision with root package name */
    private Date f2237g;
    @va.b("isDsiWareTitle")

    /* renamed from: h  reason: collision with root package name */
    private final boolean f2238h;
    @va.b("retroAchievementsHash")

    /* renamed from: i  reason: collision with root package name */
    private final String f2239i;

    public f(String str, String str2, String str3, String str4, String str5, d dVar, Date date, boolean z10, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        dVar.getClass();
        str6.getClass();
        this.f2231a = str;
        this.f2232b = str2;
        this.f2233c = str3;
        this.f2234d = str4;
        this.f2235e = str5;
        this.f2236f = dVar;
        this.f2237g = date;
        this.f2238h = z10;
        this.f2239i = str6;
    }

    public static /* synthetic */ f k(f fVar, String str, String str2, String str3, String str4, String str5, d dVar, Date date, boolean z10, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = fVar.f2231a;
        }
        if ((i2 & 2) != 0) {
            str2 = fVar.f2232b;
        }
        if ((i2 & 4) != 0) {
            str3 = fVar.f2233c;
        }
        if ((i2 & 8) != 0) {
            str4 = fVar.f2234d;
        }
        if ((i2 & 16) != 0) {
            str5 = fVar.f2235e;
        }
        if ((i2 & 32) != 0) {
            dVar = fVar.f2236f;
        }
        if ((i2 & 64) != 0) {
            date = fVar.f2237g;
        }
        if ((i2 & 128) != 0) {
            z10 = fVar.f2238h;
        }
        if ((i2 & 256) != 0) {
            str6 = fVar.f2239i;
        }
        boolean z11 = z10;
        String str7 = str6;
        d dVar2 = dVar;
        Date date2 = date;
        String str8 = str5;
        String str9 = str3;
        return fVar.j(str, str2, str9, str4, str8, dVar2, date2, z11, str7);
    }

    public final String a() {
        return this.f2231a;
    }

    public final String b() {
        return this.f2232b;
    }

    public final String c() {
        return this.f2233c;
    }

    public final String d() {
        return this.f2234d;
    }

    public final String e() {
        return this.f2235e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (k.a(this.f2231a, fVar.f2231a) && k.a(this.f2232b, fVar.f2232b) && k.a(this.f2233c, fVar.f2233c) && k.a(this.f2234d, fVar.f2234d) && k.a(this.f2235e, fVar.f2235e) && k.a(this.f2236f, fVar.f2236f) && k.a(this.f2237g, fVar.f2237g) && this.f2238h == fVar.f2238h && k.a(this.f2239i, fVar.f2239i)) {
            return true;
        }
        return false;
    }

    public final d f() {
        return this.f2236f;
    }

    public final Date g() {
        return this.f2237g;
    }

    public final boolean h() {
        return this.f2238h;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f2236f.hashCode() + w.d.d(w.d.d(w.d.d(w.d.d(this.f2231a.hashCode() * 31, 31, this.f2232b), 31, this.f2233c), 31, this.f2234d), 31, this.f2235e)) * 31;
        Date date = this.f2237g;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        return this.f2239i.hashCode() + w.d.e((hashCode2 + hashCode) * 31, this.f2238h, 31);
    }

    public final String i() {
        return this.f2239i;
    }

    public final f j(String str, String str2, String str3, String str4, String str5, d dVar, Date date, boolean z10, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        dVar.getClass();
        str6.getClass();
        return new f(str, str2, str3, str4, str5, dVar, date, z10, str6);
    }

    public final d l() {
        return this.f2236f;
    }

    public final String m() {
        return this.f2232b;
    }

    public final String n() {
        return this.f2233c;
    }

    public final Date o() {
        return this.f2237g;
    }

    public final String p() {
        return this.f2231a;
    }

    public final String q() {
        return this.f2235e;
    }

    public final String r() {
        return this.f2239i;
    }

    public final String s() {
        return this.f2234d;
    }

    public final boolean t() {
        return this.f2238h;
    }

    public String toString() {
        String str = this.f2231a;
        String str2 = this.f2232b;
        String str3 = this.f2233c;
        String str4 = this.f2234d;
        String str5 = this.f2235e;
        d dVar = this.f2236f;
        Date date = this.f2237g;
        boolean z10 = this.f2238h;
        String str6 = this.f2239i;
        StringBuilder k10 = kc.a.k("RomDto25(name=", str, ", developerName=", str2, ", fileName=");
        w.d.B(k10, str3, ", uri=", str4, ", parentTreeUri=");
        k10.append(str5);
        k10.append(", config=");
        k10.append(dVar);
        k10.append(", lastPlayed=");
        k10.append(date);
        k10.append(", isDsiWareTitle=");
        k10.append(z10);
        k10.append(", retroAchievementsHash=");
        return w.d.s(k10, str6, ")");
    }

    public final void u(d dVar) {
        dVar.getClass();
        this.f2236f = dVar;
    }

    public final void v(Date date) {
        this.f2237g = date;
    }

    public /* synthetic */ f(String str, String str2, String str3, String str4, String str5, d dVar, Date date, boolean z10, String str6, int i2, nc.f fVar) {
        this(str, str2, str3, str4, str5, dVar, (i2 & 64) != 0 ? null : date, z10, str6);
    }
}
