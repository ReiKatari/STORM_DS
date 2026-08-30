package dg;

import java.util.List;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: i  reason: collision with root package name */
    public static final int f4073i = 8;
    @va.b("id")

    /* renamed from: a  reason: collision with root package name */
    private final String f4074a;
    @va.b("name")

    /* renamed from: b  reason: collision with root package name */
    private final String f4075b;
    @va.b("type")

    /* renamed from: c  reason: collision with root package name */
    private final String f4076c;
    @va.b("orientation")

    /* renamed from: d  reason: collision with root package name */
    private final String f4077d;
    @va.b("useCustomOpacity")

    /* renamed from: e  reason: collision with root package name */
    private final boolean f4078e;
    @va.b("opacity")

    /* renamed from: f  reason: collision with root package name */
    private final int f4079f;
    @va.b("layoutVariants")

    /* renamed from: g  reason: collision with root package name */
    private final List<a> f4080g;
    @va.b("target")

    /* renamed from: h  reason: collision with root package name */
    private final String f4081h;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: c  reason: collision with root package name */
        public static final int f4082c = 8;
        @va.b("variant")

        /* renamed from: a  reason: collision with root package name */
        private final h f4083a;
        @va.b("layout")

        /* renamed from: b  reason: collision with root package name */
        private final g f4084b;

        public a(h hVar, g gVar) {
            hVar.getClass();
            gVar.getClass();
            this.f4083a = hVar;
            this.f4084b = gVar;
        }

        public static /* synthetic */ a d(a aVar, h hVar, g gVar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                hVar = aVar.f4083a;
            }
            if ((i2 & 2) != 0) {
                gVar = aVar.f4084b;
            }
            return aVar.c(hVar, gVar);
        }

        public final h a() {
            return this.f4083a;
        }

        public final g b() {
            return this.f4084b;
        }

        public final a c(h hVar, g gVar) {
            hVar.getClass();
            gVar.getClass();
            return new a(hVar, gVar);
        }

        public final g e() {
            return this.f4084b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (k.a(this.f4083a, aVar.f4083a) && k.a(this.f4084b, aVar.f4084b)) {
                return true;
            }
            return false;
        }

        public final h f() {
            return this.f4083a;
        }

        public int hashCode() {
            return this.f4084b.hashCode() + (this.f4083a.hashCode() * 31);
        }

        public String toString() {
            h hVar = this.f4083a;
            g gVar = this.f4084b;
            return "LayoutEntryDto35(variant=" + hVar + ", layout=" + gVar + ")";
        }
    }

    public c(String str, String str2, String str3, String str4, boolean z10, int i2, List<a> list, String str5) {
        str3.getClass();
        str4.getClass();
        list.getClass();
        this.f4074a = str;
        this.f4075b = str2;
        this.f4076c = str3;
        this.f4077d = str4;
        this.f4078e = z10;
        this.f4079f = i2;
        this.f4080g = list;
        this.f4081h = str5;
    }

    public static /* synthetic */ c j(c cVar, String str, String str2, String str3, String str4, boolean z10, int i2, List list, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cVar.f4074a;
        }
        if ((i10 & 2) != 0) {
            str2 = cVar.f4075b;
        }
        if ((i10 & 4) != 0) {
            str3 = cVar.f4076c;
        }
        if ((i10 & 8) != 0) {
            str4 = cVar.f4077d;
        }
        if ((i10 & 16) != 0) {
            z10 = cVar.f4078e;
        }
        if ((i10 & 32) != 0) {
            i2 = cVar.f4079f;
        }
        List<a> list2 = list;
        if ((i10 & 64) != 0) {
            list2 = cVar.f4080g;
        }
        if ((i10 & 128) != 0) {
            str5 = cVar.f4081h;
        }
        List list3 = list2;
        String str6 = str5;
        boolean z11 = z10;
        int i11 = i2;
        return cVar.i(str, str2, str3, str4, z11, i11, list3, str6);
    }

    public final String a() {
        return this.f4074a;
    }

    public final String b() {
        return this.f4075b;
    }

    public final String c() {
        return this.f4076c;
    }

    public final String d() {
        return this.f4077d;
    }

    public final boolean e() {
        return this.f4078e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (k.a(this.f4074a, cVar.f4074a) && k.a(this.f4075b, cVar.f4075b) && k.a(this.f4076c, cVar.f4076c) && k.a(this.f4077d, cVar.f4077d) && this.f4078e == cVar.f4078e && this.f4079f == cVar.f4079f && k.a(this.f4080g, cVar.f4080g) && k.a(this.f4081h, cVar.f4081h)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f4079f;
    }

    public final List<a> g() {
        return this.f4080g;
    }

    public final String h() {
        return this.f4081h;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.f4074a;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.f4075b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode3 = (this.f4080g.hashCode() + w.d.c(this.f4079f, w.d.e(w.d.d(w.d.d((i10 + hashCode2) * 31, 31, this.f4076c), 31, this.f4077d), this.f4078e, 31), 31)) * 31;
        String str3 = this.f4081h;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode3 + i2;
    }

    public final c i(String str, String str2, String str3, String str4, boolean z10, int i2, List<a> list, String str5) {
        str3.getClass();
        str4.getClass();
        list.getClass();
        return new c(str, str2, str3, str4, z10, i2, list, str5);
    }

    public final String k() {
        return this.f4074a;
    }

    public final List<a> l() {
        return this.f4080g;
    }

    public final String m() {
        return this.f4075b;
    }

    public final int n() {
        return this.f4079f;
    }

    public final String o() {
        return this.f4077d;
    }

    public final String p() {
        return this.f4081h;
    }

    public final String q() {
        return this.f4076c;
    }

    public final boolean r() {
        return this.f4078e;
    }

    public String toString() {
        String str = this.f4074a;
        String str2 = this.f4075b;
        String str3 = this.f4076c;
        String str4 = this.f4077d;
        boolean z10 = this.f4078e;
        int i2 = this.f4079f;
        List<a> list = this.f4080g;
        String str5 = this.f4081h;
        StringBuilder k10 = kc.a.k("LayoutConfigurationDto35(id=", str, ", name=", str2, ", type=");
        w.d.B(k10, str3, ", orientation=", str4, ", useCustomOpacity=");
        k10.append(z10);
        k10.append(", opacity=");
        k10.append(i2);
        k10.append(", layoutVariants=");
        k10.append(list);
        k10.append(", target=");
        k10.append(str5);
        k10.append(")");
        return k10.toString();
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, boolean z10, int i2, List list, String str5, int i10, nc.f fVar) {
        this(str, str2, str3, str4, z10, i2, list, (i10 & 128) != 0 ? null : str5);
    }
}
