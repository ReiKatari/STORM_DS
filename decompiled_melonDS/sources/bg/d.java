package bg;

import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: g  reason: collision with root package name */
    public static final int f2218g = 0;
    @va.b("runtimeConsoleType")

    /* renamed from: a  reason: collision with root package name */
    private final af.f f2219a;
    @va.b("runtimeMicSource")

    /* renamed from: b  reason: collision with root package name */
    private final af.h f2220b;
    @va.b("layoutId")

    /* renamed from: c  reason: collision with root package name */
    private final String f2221c;
    @va.b("loadGbaCart")

    /* renamed from: d  reason: collision with root package name */
    private final boolean f2222d;
    @va.b("gbaCartPath")

    /* renamed from: e  reason: collision with root package name */
    private final String f2223e;
    @va.b("gbaSavePath")

    /* renamed from: f  reason: collision with root package name */
    private final String f2224f;

    public d(af.f fVar, af.h hVar, String str, boolean z10, String str2, String str3) {
        fVar.getClass();
        hVar.getClass();
        this.f2219a = fVar;
        this.f2220b = hVar;
        this.f2221c = str;
        this.f2222d = z10;
        this.f2223e = str2;
        this.f2224f = str3;
    }

    public static /* synthetic */ d h(d dVar, af.f fVar, af.h hVar, String str, boolean z10, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            fVar = dVar.f2219a;
        }
        if ((i2 & 2) != 0) {
            hVar = dVar.f2220b;
        }
        if ((i2 & 4) != 0) {
            str = dVar.f2221c;
        }
        if ((i2 & 8) != 0) {
            z10 = dVar.f2222d;
        }
        if ((i2 & 16) != 0) {
            str2 = dVar.f2223e;
        }
        if ((i2 & 32) != 0) {
            str3 = dVar.f2224f;
        }
        String str4 = str2;
        String str5 = str3;
        return dVar.g(fVar, hVar, str, z10, str4, str5);
    }

    public final af.f a() {
        return this.f2219a;
    }

    public final af.h b() {
        return this.f2220b;
    }

    public final String c() {
        return this.f2221c;
    }

    public final boolean d() {
        return this.f2222d;
    }

    public final String e() {
        return this.f2223e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f2219a == dVar.f2219a && this.f2220b == dVar.f2220b && k.a(this.f2221c, dVar.f2221c) && this.f2222d == dVar.f2222d && k.a(this.f2223e, dVar.f2223e) && k.a(this.f2224f, dVar.f2224f)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f2224f;
    }

    public final d g(af.f fVar, af.h hVar, String str, boolean z10, String str2, String str3) {
        fVar.getClass();
        hVar.getClass();
        return new d(fVar, hVar, str, z10, str2, str3);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.f2220b.hashCode() + (this.f2219a.hashCode() * 31)) * 31;
        String str = this.f2221c;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int e6 = w.d.e((hashCode3 + hashCode) * 31, this.f2222d, 31);
        String str2 = this.f2223e;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (e6 + hashCode2) * 31;
        String str3 = this.f2224f;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return i10 + i2;
    }

    public final String i() {
        return this.f2223e;
    }

    public final String j() {
        return this.f2224f;
    }

    public final String k() {
        return this.f2221c;
    }

    public final boolean l() {
        return this.f2222d;
    }

    public final af.f m() {
        return this.f2219a;
    }

    public final af.h n() {
        return this.f2220b;
    }

    public String toString() {
        af.f fVar = this.f2219a;
        af.h hVar = this.f2220b;
        String str = this.f2221c;
        boolean z10 = this.f2222d;
        String str2 = this.f2223e;
        String str3 = this.f2224f;
        return "RomConfigDto25(runtimeConsoleType=" + fVar + ", runtimeMicSource=" + hVar + ", layoutId=" + str + ", loadGbaCart=" + z10 + ", gbaCartPath=" + str2 + ", gbaSavePath=" + str3 + ")";
    }
}
