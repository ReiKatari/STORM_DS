package dg;

import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: i  reason: collision with root package name */
    public static final int f4064i = 8;
    @va.b("id")

    /* renamed from: a  reason: collision with root package name */
    private final String f4065a;
    @va.b("name")

    /* renamed from: b  reason: collision with root package name */
    private final String f4066b;
    @va.b("type")

    /* renamed from: c  reason: collision with root package name */
    private final String f4067c;
    @va.b("orientation")

    /* renamed from: d  reason: collision with root package name */
    private final String f4068d;
    @va.b("useCustomOpacity")

    /* renamed from: e  reason: collision with root package name */
    private final boolean f4069e;
    @va.b("opacity")

    /* renamed from: f  reason: collision with root package name */
    private final int f4070f;
    @va.b("portraitLayout")

    /* renamed from: g  reason: collision with root package name */
    private final g f4071g;
    @va.b("landscapeLayout")

    /* renamed from: h  reason: collision with root package name */
    private final g f4072h;

    public b(String str, String str2, String str3, String str4, boolean z10, int i2, g gVar, g gVar2) {
        str3.getClass();
        str4.getClass();
        gVar.getClass();
        gVar2.getClass();
        this.f4065a = str;
        this.f4066b = str2;
        this.f4067c = str3;
        this.f4068d = str4;
        this.f4069e = z10;
        this.f4070f = i2;
        this.f4071g = gVar;
        this.f4072h = gVar2;
    }

    public static /* synthetic */ b j(b bVar, String str, String str2, String str3, String str4, boolean z10, int i2, g gVar, g gVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bVar.f4065a;
        }
        if ((i10 & 2) != 0) {
            str2 = bVar.f4066b;
        }
        if ((i10 & 4) != 0) {
            str3 = bVar.f4067c;
        }
        if ((i10 & 8) != 0) {
            str4 = bVar.f4068d;
        }
        if ((i10 & 16) != 0) {
            z10 = bVar.f4069e;
        }
        if ((i10 & 32) != 0) {
            i2 = bVar.f4070f;
        }
        if ((i10 & 64) != 0) {
            gVar = bVar.f4071g;
        }
        if ((i10 & 128) != 0) {
            gVar2 = bVar.f4072h;
        }
        g gVar3 = gVar;
        g gVar4 = gVar2;
        boolean z11 = z10;
        int i11 = i2;
        return bVar.i(str, str2, str3, str4, z11, i11, gVar3, gVar4);
    }

    public final String a() {
        return this.f4065a;
    }

    public final String b() {
        return this.f4066b;
    }

    public final String c() {
        return this.f4067c;
    }

    public final String d() {
        return this.f4068d;
    }

    public final boolean e() {
        return this.f4069e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (k.a(this.f4065a, bVar.f4065a) && k.a(this.f4066b, bVar.f4066b) && k.a(this.f4067c, bVar.f4067c) && k.a(this.f4068d, bVar.f4068d) && this.f4069e == bVar.f4069e && this.f4070f == bVar.f4070f && k.a(this.f4071g, bVar.f4071g) && k.a(this.f4072h, bVar.f4072h)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f4070f;
    }

    public final g g() {
        return this.f4071g;
    }

    public final g h() {
        return this.f4072h;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f4065a;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.f4066b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return this.f4072h.hashCode() + ((this.f4071g.hashCode() + w.d.c(this.f4070f, w.d.e(w.d.d(w.d.d((i10 + i2) * 31, 31, this.f4067c), 31, this.f4068d), this.f4069e, 31), 31)) * 31);
    }

    public final b i(String str, String str2, String str3, String str4, boolean z10, int i2, g gVar, g gVar2) {
        str3.getClass();
        str4.getClass();
        gVar.getClass();
        gVar2.getClass();
        return new b(str, str2, str3, str4, z10, i2, gVar, gVar2);
    }

    public final String k() {
        return this.f4065a;
    }

    public final g l() {
        return this.f4072h;
    }

    public final String m() {
        return this.f4066b;
    }

    public final int n() {
        return this.f4070f;
    }

    public final String o() {
        return this.f4068d;
    }

    public final g p() {
        return this.f4071g;
    }

    public final String q() {
        return this.f4067c;
    }

    public final boolean r() {
        return this.f4069e;
    }

    public String toString() {
        String str = this.f4065a;
        String str2 = this.f4066b;
        String str3 = this.f4067c;
        String str4 = this.f4068d;
        boolean z10 = this.f4069e;
        int i2 = this.f4070f;
        g gVar = this.f4071g;
        g gVar2 = this.f4072h;
        StringBuilder k10 = kc.a.k("LayoutConfigurationDto31(id=", str, ", name=", str2, ", type=");
        w.d.B(k10, str3, ", orientation=", str4, ", useCustomOpacity=");
        k10.append(z10);
        k10.append(", opacity=");
        k10.append(i2);
        k10.append(", portraitLayout=");
        k10.append(gVar);
        k10.append(", landscapeLayout=");
        k10.append(gVar2);
        k10.append(")");
        return k10.toString();
    }
}
