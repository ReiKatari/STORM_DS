package bg;

import android.net.Uri;
import java.util.Date;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: h  reason: collision with root package name */
    public static final int f2203h = 8;
    @va.b("a")

    /* renamed from: a  reason: collision with root package name */
    private final String f2204a;
    @va.b("b")

    /* renamed from: b  reason: collision with root package name */
    private final String f2205b;
    @va.b("c")

    /* renamed from: c  reason: collision with root package name */
    private final Uri f2206c;
    @va.b("d")

    /* renamed from: d  reason: collision with root package name */
    private final Uri f2207d;
    @va.b("e")

    /* renamed from: e  reason: collision with root package name */
    private final c f2208e;
    @va.b("f")

    /* renamed from: f  reason: collision with root package name */
    private final Date f2209f;
    @va.b("g")

    /* renamed from: g  reason: collision with root package name */
    private final boolean f2210g;

    public b(String str, String str2, Uri uri, Uri uri2, c cVar, Date date, boolean z10) {
        str.getClass();
        str2.getClass();
        uri.getClass();
        uri2.getClass();
        cVar.getClass();
        this.f2204a = str;
        this.f2205b = str2;
        this.f2206c = uri;
        this.f2207d = uri2;
        this.f2208e = cVar;
        this.f2209f = date;
        this.f2210g = z10;
    }

    public static /* synthetic */ b i(b bVar, String str, String str2, Uri uri, Uri uri2, c cVar, Date date, boolean z10, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bVar.f2204a;
        }
        if ((i2 & 2) != 0) {
            str2 = bVar.f2205b;
        }
        if ((i2 & 4) != 0) {
            uri = bVar.f2206c;
        }
        if ((i2 & 8) != 0) {
            uri2 = bVar.f2207d;
        }
        if ((i2 & 16) != 0) {
            cVar = bVar.f2208e;
        }
        if ((i2 & 32) != 0) {
            date = bVar.f2209f;
        }
        if ((i2 & 64) != 0) {
            z10 = bVar.f2210g;
        }
        Date date2 = date;
        boolean z11 = z10;
        c cVar2 = cVar;
        Uri uri3 = uri;
        return bVar.h(str, str2, uri3, uri2, cVar2, date2, z11);
    }

    public final String a() {
        return this.f2204a;
    }

    public final String b() {
        return this.f2205b;
    }

    public final Uri c() {
        return this.f2206c;
    }

    public final Uri d() {
        return this.f2207d;
    }

    public final c e() {
        return this.f2208e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (k.a(this.f2204a, bVar.f2204a) && k.a(this.f2205b, bVar.f2205b) && k.a(this.f2206c, bVar.f2206c) && k.a(this.f2207d, bVar.f2207d) && k.a(this.f2208e, bVar.f2208e) && k.a(this.f2209f, bVar.f2209f) && this.f2210g == bVar.f2210g) {
            return true;
        }
        return false;
    }

    public final Date f() {
        return this.f2209f;
    }

    public final boolean g() {
        return this.f2210g;
    }

    public final b h(String str, String str2, Uri uri, Uri uri2, c cVar, Date date, boolean z10) {
        str.getClass();
        str2.getClass();
        uri.getClass();
        uri2.getClass();
        cVar.getClass();
        return new b(str, str2, uri, uri2, cVar, date, z10);
    }

    public int hashCode() {
        int hashCode;
        int d4 = w.d.d(this.f2204a.hashCode() * 31, 31, this.f2205b);
        int hashCode2 = this.f2207d.hashCode();
        int hashCode3 = (this.f2208e.hashCode() + ((hashCode2 + ((this.f2206c.hashCode() + d4) * 31)) * 31)) * 31;
        Date date = this.f2209f;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        return Boolean.hashCode(this.f2210g) + ((hashCode3 + hashCode) * 31);
    }

    public final c j() {
        return this.f2208e;
    }

    public final String k() {
        return this.f2205b;
    }

    public final Date l() {
        return this.f2209f;
    }

    public final String m() {
        return this.f2204a;
    }

    public final Uri n() {
        return this.f2207d;
    }

    public final Uri o() {
        return this.f2206c;
    }

    public final boolean p() {
        return this.f2210g;
    }

    public String toString() {
        String str = this.f2204a;
        String str2 = this.f2205b;
        Uri uri = this.f2206c;
        Uri uri2 = this.f2207d;
        c cVar = this.f2208e;
        Date date = this.f2209f;
        boolean z10 = this.f2210g;
        StringBuilder k10 = kc.a.k("Rom22(name=", str, ", fileName=", str2, ", uri=");
        k10.append(uri);
        k10.append(", parentTreeUri=");
        k10.append(uri2);
        k10.append(", config=");
        k10.append(cVar);
        k10.append(", lastPlayed=");
        k10.append(date);
        k10.append(", isDsiWareTitle=");
        k10.append(z10);
        k10.append(")");
        return k10.toString();
    }

    public /* synthetic */ b(String str, String str2, Uri uri, Uri uri2, c cVar, Date date, boolean z10, int i2, nc.f fVar) {
        this(str, str2, uri, uri2, cVar, (i2 & 32) != 0 ? null : date, z10);
    }
}
