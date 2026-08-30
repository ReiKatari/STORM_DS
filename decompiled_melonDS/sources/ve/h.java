package ve;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final int f13805a;

    /* renamed from: b  reason: collision with root package name */
    public final g f13806b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13807c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13808d;

    public h(int i2, g gVar, int i10, int i11) {
        gVar.getClass();
        this.f13805a = i2;
        this.f13806b = gVar;
        this.f13807c = i10;
        this.f13808d = i11;
    }

    public static h a(h hVar) {
        g gVar = hVar.f13806b;
        int i2 = hVar.f13807c;
        int i10 = hVar.f13808d;
        hVar.getClass();
        gVar.getClass();
        return new h(-1, gVar, i2, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f13805a == hVar.f13805a && this.f13806b == hVar.f13806b && this.f13807c == hVar.f13807c && this.f13808d == hVar.f13808d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f13806b.hashCode();
        return Integer.hashCode(this.f13808d) + w.d.c(this.f13807c, (hashCode + (Integer.hashCode(this.f13805a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "LayoutDisplay(id=" + this.f13805a + ", type=" + this.f13806b + ", width=" + this.f13807c + ", height=" + this.f13808d + ")";
    }
}
