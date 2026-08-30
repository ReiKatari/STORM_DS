package nf;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {
    @va.b("left")

    /* renamed from: a  reason: collision with root package name */
    private final int f10401a;
    @va.b("top")

    /* renamed from: b  reason: collision with root package name */
    private final int f10402b;
    @va.b("right")

    /* renamed from: c  reason: collision with root package name */
    private final int f10403c;
    @va.b("bottom")

    /* renamed from: d  reason: collision with root package name */
    private final int f10404d;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* renamed from: nf.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0017a {
    }

    public a(int i2, int i10, int i11, int i12) {
        this.f10401a = i2;
        this.f10402b = i10;
        this.f10403c = i11;
        this.f10404d = i12;
    }

    public final ve.b a() {
        return new ve.b(this.f10401a, this.f10402b, this.f10403c, this.f10404d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f10401a == aVar.f10401a && this.f10402b == aVar.f10402b && this.f10403c == aVar.f10403c && this.f10404d == aVar.f10404d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10404d) + w.d.c(this.f10403c, w.d.c(this.f10402b, Integer.hashCode(this.f10401a) * 31, 31), 31);
    }

    public final String toString() {
        int i2 = this.f10401a;
        int i10 = this.f10402b;
        int i11 = this.f10403c;
        int i12 = this.f10404d;
        StringBuilder j2 = kc.a.j("InsetsDto(left=", i2, ", top=", i10, ", right=");
        j2.append(i11);
        j2.append(", bottom=");
        j2.append(i12);
        j2.append(")");
        return j2.toString();
    }
}
