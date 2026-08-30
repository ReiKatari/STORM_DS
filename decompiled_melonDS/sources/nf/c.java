package nf;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {
    @va.b("id")

    /* renamed from: a  reason: collision with root package name */
    private final int f10414a;
    @va.b("type")

    /* renamed from: b  reason: collision with root package name */
    private final String f10415b;
    @va.b("width")

    /* renamed from: c  reason: collision with root package name */
    private final int f10416c;
    @va.b("height")

    /* renamed from: d  reason: collision with root package name */
    private final int f10417d;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public c(String str, int i2, int i10, int i11) {
        str.getClass();
        this.f10414a = i2;
        this.f10415b = str;
        this.f10416c = i10;
        this.f10417d = i11;
    }

    public final ve.h a() {
        return new ve.h(this.f10414a, (ve.g) pc.a.t(this.f10415b, ve.g.values()), this.f10416c, this.f10417d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f10414a == cVar.f10414a && nc.k.a(this.f10415b, cVar.f10415b) && this.f10416c == cVar.f10416c && this.f10417d == cVar.f10417d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10417d) + w.d.c(this.f10416c, w.d.d(Integer.hashCode(this.f10414a) * 31, 31, this.f10415b), 31);
    }

    public final String toString() {
        int i2 = this.f10414a;
        String str = this.f10415b;
        int i10 = this.f10416c;
        int i11 = this.f10417d;
        return "LayoutDisplayDto(id=" + i2 + ", type=" + str + ", width=" + i10 + ", height=" + i11 + ")";
    }
}
