package dg;

import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: i  reason: collision with root package name */
    public static final int f4055i = 8;
    @va.b("a")

    /* renamed from: a  reason: collision with root package name */
    private final String f4056a;
    @va.b("b")

    /* renamed from: b  reason: collision with root package name */
    private final String f4057b;
    @va.b("c")

    /* renamed from: c  reason: collision with root package name */
    private final String f4058c;
    @va.b("d")

    /* renamed from: d  reason: collision with root package name */
    private final String f4059d;
    @va.b("e")

    /* renamed from: e  reason: collision with root package name */
    private final boolean f4060e;
    @va.b("f")

    /* renamed from: f  reason: collision with root package name */
    private final int f4061f;
    @va.b("g")

    /* renamed from: g  reason: collision with root package name */
    private final f f4062g;
    @va.b("h")

    /* renamed from: h  reason: collision with root package name */
    private final f f4063h;

    public a(String str, String str2, String str3, String str4, boolean z10, int i2, f fVar, f fVar2) {
        str3.getClass();
        str4.getClass();
        fVar.getClass();
        fVar2.getClass();
        this.f4056a = str;
        this.f4057b = str2;
        this.f4058c = str3;
        this.f4059d = str4;
        this.f4060e = z10;
        this.f4061f = i2;
        this.f4062g = fVar;
        this.f4063h = fVar2;
    }

    public static /* synthetic */ a j(a aVar, String str, String str2, String str3, String str4, boolean z10, int i2, f fVar, f fVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aVar.f4056a;
        }
        if ((i10 & 2) != 0) {
            str2 = aVar.f4057b;
        }
        if ((i10 & 4) != 0) {
            str3 = aVar.f4058c;
        }
        if ((i10 & 8) != 0) {
            str4 = aVar.f4059d;
        }
        if ((i10 & 16) != 0) {
            z10 = aVar.f4060e;
        }
        if ((i10 & 32) != 0) {
            i2 = aVar.f4061f;
        }
        if ((i10 & 64) != 0) {
            fVar = aVar.f4062g;
        }
        if ((i10 & 128) != 0) {
            fVar2 = aVar.f4063h;
        }
        f fVar3 = fVar;
        f fVar4 = fVar2;
        boolean z11 = z10;
        int i11 = i2;
        return aVar.i(str, str2, str3, str4, z11, i11, fVar3, fVar4);
    }

    public final String a() {
        return this.f4056a;
    }

    public final String b() {
        return this.f4057b;
    }

    public final String c() {
        return this.f4058c;
    }

    public final String d() {
        return this.f4059d;
    }

    public final boolean e() {
        return this.f4060e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (k.a(this.f4056a, aVar.f4056a) && k.a(this.f4057b, aVar.f4057b) && k.a(this.f4058c, aVar.f4058c) && k.a(this.f4059d, aVar.f4059d) && this.f4060e == aVar.f4060e && this.f4061f == aVar.f4061f && k.a(this.f4062g, aVar.f4062g) && k.a(this.f4063h, aVar.f4063h)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f4061f;
    }

    public final f g() {
        return this.f4062g;
    }

    public final f h() {
        return this.f4063h;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f4056a;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.f4057b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return this.f4063h.hashCode() + ((this.f4062g.hashCode() + w.d.c(this.f4061f, w.d.e(w.d.d(w.d.d((i10 + i2) * 31, 31, this.f4058c), 31, this.f4059d), this.f4060e, 31), 31)) * 31);
    }

    public final a i(String str, String str2, String str3, String str4, boolean z10, int i2, f fVar, f fVar2) {
        str3.getClass();
        str4.getClass();
        fVar.getClass();
        fVar2.getClass();
        return new a(str, str2, str3, str4, z10, i2, fVar, fVar2);
    }

    public final String k() {
        return this.f4056a;
    }

    public final f l() {
        return this.f4063h;
    }

    public final String m() {
        return this.f4057b;
    }

    public final int n() {
        return this.f4061f;
    }

    public final String o() {
        return this.f4059d;
    }

    public final f p() {
        return this.f4062g;
    }

    public final String q() {
        return this.f4058c;
    }

    public final boolean r() {
        return this.f4060e;
    }

    public String toString() {
        String str = this.f4056a;
        String str2 = this.f4057b;
        String str3 = this.f4058c;
        String str4 = this.f4059d;
        boolean z10 = this.f4060e;
        int i2 = this.f4061f;
        f fVar = this.f4062g;
        f fVar2 = this.f4063h;
        StringBuilder k10 = kc.a.k("LayoutConfiguration25(id=", str, ", name=", str2, ", type=");
        w.d.B(k10, str3, ", orientation=", str4, ", useCustomOpacity=");
        k10.append(z10);
        k10.append(", opacity=");
        k10.append(i2);
        k10.append(", portraitLayout=");
        k10.append(fVar);
        k10.append(", landscapeLayout=");
        k10.append(fVar2);
        k10.append(")");
        return k10.toString();
    }
}
