package bg;

import java.util.Date;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: j  reason: collision with root package name */
    public static final int f2240j = 8;
    @va.b("name")

    /* renamed from: a  reason: collision with root package name */
    private final String f2241a;
    @va.b("developerName")

    /* renamed from: b  reason: collision with root package name */
    private final String f2242b;
    @va.b("fileName")

    /* renamed from: c  reason: collision with root package name */
    private final String f2243c;
    @va.b("uri")

    /* renamed from: d  reason: collision with root package name */
    private final String f2244d;
    @va.b("parentTreeUri")

    /* renamed from: e  reason: collision with root package name */
    private final String f2245e;
    @va.b("config")

    /* renamed from: f  reason: collision with root package name */
    private e f2246f;
    @va.b("lastPlayed")

    /* renamed from: g  reason: collision with root package name */
    private Date f2247g;
    @va.b("isDsiWareTitle")

    /* renamed from: h  reason: collision with root package name */
    private final boolean f2248h;
    @va.b("retroAchievementsHash")

    /* renamed from: i  reason: collision with root package name */
    private final String f2249i;

    public g(String str, String str2, String str3, String str4, String str5, e eVar, Date date, boolean z10, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        eVar.getClass();
        str6.getClass();
        this.f2241a = str;
        this.f2242b = str2;
        this.f2243c = str3;
        this.f2244d = str4;
        this.f2245e = str5;
        this.f2246f = eVar;
        this.f2247g = date;
        this.f2248h = z10;
        this.f2249i = str6;
    }

    public static /* synthetic */ g k(g gVar, String str, String str2, String str3, String str4, String str5, e eVar, Date date, boolean z10, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = gVar.f2241a;
        }
        if ((i2 & 2) != 0) {
            str2 = gVar.f2242b;
        }
        if ((i2 & 4) != 0) {
            str3 = gVar.f2243c;
        }
        if ((i2 & 8) != 0) {
            str4 = gVar.f2244d;
        }
        if ((i2 & 16) != 0) {
            str5 = gVar.f2245e;
        }
        if ((i2 & 32) != 0) {
            eVar = gVar.f2246f;
        }
        if ((i2 & 64) != 0) {
            date = gVar.f2247g;
        }
        if ((i2 & 128) != 0) {
            z10 = gVar.f2248h;
        }
        if ((i2 & 256) != 0) {
            str6 = gVar.f2249i;
        }
        boolean z11 = z10;
        String str7 = str6;
        e eVar2 = eVar;
        Date date2 = date;
        String str8 = str5;
        String str9 = str3;
        return gVar.j(str, str2, str9, str4, str8, eVar2, date2, z11, str7);
    }

    public final String a() {
        return this.f2241a;
    }

    public final String b() {
        return this.f2242b;
    }

    public final String c() {
        return this.f2243c;
    }

    public final String d() {
        return this.f2244d;
    }

    public final String e() {
        return this.f2245e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (k.a(this.f2241a, gVar.f2241a) && k.a(this.f2242b, gVar.f2242b) && k.a(this.f2243c, gVar.f2243c) && k.a(this.f2244d, gVar.f2244d) && k.a(this.f2245e, gVar.f2245e) && k.a(this.f2246f, gVar.f2246f) && k.a(this.f2247g, gVar.f2247g) && this.f2248h == gVar.f2248h && k.a(this.f2249i, gVar.f2249i)) {
            return true;
        }
        return false;
    }

    public final e f() {
        return this.f2246f;
    }

    public final Date g() {
        return this.f2247g;
    }

    public final boolean h() {
        return this.f2248h;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f2246f.hashCode() + w.d.d(w.d.d(w.d.d(w.d.d(this.f2241a.hashCode() * 31, 31, this.f2242b), 31, this.f2243c), 31, this.f2244d), 31, this.f2245e)) * 31;
        Date date = this.f2247g;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        return this.f2249i.hashCode() + w.d.e((hashCode2 + hashCode) * 31, this.f2248h, 31);
    }

    public final String i() {
        return this.f2249i;
    }

    public final g j(String str, String str2, String str3, String str4, String str5, e eVar, Date date, boolean z10, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        eVar.getClass();
        str6.getClass();
        return new g(str, str2, str3, str4, str5, eVar, date, z10, str6);
    }

    public final e l() {
        return this.f2246f;
    }

    public final String m() {
        return this.f2242b;
    }

    public final String n() {
        return this.f2243c;
    }

    public final Date o() {
        return this.f2247g;
    }

    public final String p() {
        return this.f2241a;
    }

    public final String q() {
        return this.f2245e;
    }

    public final String r() {
        return this.f2249i;
    }

    public final String s() {
        return this.f2244d;
    }

    public final boolean t() {
        return this.f2248h;
    }

    public String toString() {
        String str = this.f2241a;
        String str2 = this.f2242b;
        String str3 = this.f2243c;
        String str4 = this.f2244d;
        String str5 = this.f2245e;
        e eVar = this.f2246f;
        Date date = this.f2247g;
        boolean z10 = this.f2248h;
        String str6 = this.f2249i;
        StringBuilder k10 = kc.a.k("RomDto31(name=", str, ", developerName=", str2, ", fileName=");
        w.d.B(k10, str3, ", uri=", str4, ", parentTreeUri=");
        k10.append(str5);
        k10.append(", config=");
        k10.append(eVar);
        k10.append(", lastPlayed=");
        k10.append(date);
        k10.append(", isDsiWareTitle=");
        k10.append(z10);
        k10.append(", retroAchievementsHash=");
        return w.d.s(k10, str6, ")");
    }

    public final void u(e eVar) {
        eVar.getClass();
        this.f2246f = eVar;
    }

    public final void v(Date date) {
        this.f2247g = date;
    }

    public /* synthetic */ g(String str, String str2, String str3, String str4, String str5, e eVar, Date date, boolean z10, String str6, int i2, nc.f fVar) {
        this(str, str2, str3, str4, str5, eVar, (i2 & 64) != 0 ? null : date, z10, str6);
    }
}
