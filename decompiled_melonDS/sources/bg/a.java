package bg;

import android.net.Uri;
import java.util.Date;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final int f2197f = 8;

    /* renamed from: a  reason: collision with root package name */
    private final String f2198a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f2199b;

    /* renamed from: c  reason: collision with root package name */
    private final Uri f2200c;

    /* renamed from: d  reason: collision with root package name */
    private c f2201d;

    /* renamed from: e  reason: collision with root package name */
    private Date f2202e;

    public a(String str, Uri uri, Uri uri2, c cVar, Date date) {
        str.getClass();
        uri.getClass();
        uri2.getClass();
        cVar.getClass();
        this.f2198a = str;
        this.f2199b = uri;
        this.f2200c = uri2;
        this.f2201d = cVar;
        this.f2202e = date;
    }

    public static /* synthetic */ a g(a aVar, String str, Uri uri, Uri uri2, c cVar, Date date, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = aVar.f2198a;
        }
        if ((i2 & 2) != 0) {
            uri = aVar.f2199b;
        }
        if ((i2 & 4) != 0) {
            uri2 = aVar.f2200c;
        }
        if ((i2 & 8) != 0) {
            cVar = aVar.f2201d;
        }
        if ((i2 & 16) != 0) {
            date = aVar.f2202e;
        }
        Date date2 = date;
        Uri uri3 = uri2;
        return aVar.f(str, uri, uri3, cVar, date2);
    }

    public final String a() {
        return this.f2198a;
    }

    public final Uri b() {
        return this.f2199b;
    }

    public final Uri c() {
        return this.f2200c;
    }

    public final c d() {
        return this.f2201d;
    }

    public final Date e() {
        return this.f2202e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (k.a(this.f2198a, aVar.f2198a) && k.a(this.f2199b, aVar.f2199b) && k.a(this.f2200c, aVar.f2200c) && k.a(this.f2201d, aVar.f2201d) && k.a(this.f2202e, aVar.f2202e)) {
            return true;
        }
        return false;
    }

    public final a f(String str, Uri uri, Uri uri2, c cVar, Date date) {
        str.getClass();
        uri.getClass();
        uri2.getClass();
        cVar.getClass();
        return new a(str, uri, uri2, cVar, date);
    }

    public final c h() {
        return this.f2201d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f2199b.hashCode();
        int hashCode3 = this.f2200c.hashCode();
        int hashCode4 = (this.f2201d.hashCode() + ((hashCode3 + ((hashCode2 + (this.f2198a.hashCode() * 31)) * 31)) * 31)) * 31;
        Date date = this.f2202e;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        return hashCode4 + hashCode;
    }

    public final Date i() {
        return this.f2202e;
    }

    public final String j() {
        return this.f2198a;
    }

    public final Uri k() {
        return this.f2200c;
    }

    public final Uri l() {
        return this.f2199b;
    }

    public final void m(c cVar) {
        cVar.getClass();
        this.f2201d = cVar;
    }

    public final void n(Date date) {
        this.f2202e = date;
    }

    public String toString() {
        String str = this.f2198a;
        Uri uri = this.f2199b;
        Uri uri2 = this.f2200c;
        c cVar = this.f2201d;
        Date date = this.f2202e;
        return "Rom21(name=" + str + ", uri=" + uri + ", parentTreeUri=" + uri2 + ", config=" + cVar + ", lastPlayed=" + date + ")";
    }

    public /* synthetic */ a(String str, Uri uri, Uri uri2, c cVar, Date date, int i2, nc.f fVar) {
        this(str, uri, uri2, cVar, (i2 & 16) != 0 ? null : date);
    }
}
