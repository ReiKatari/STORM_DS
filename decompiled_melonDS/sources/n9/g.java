package n9;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: c  reason: collision with root package name */
    public static final g f10113c;

    /* renamed from: a  reason: collision with root package name */
    public final ij.a f10114a;

    /* renamed from: b  reason: collision with root package name */
    public final ij.a f10115b;

    static {
        b bVar = b.f10111e;
        f10113c = new g(bVar, bVar);
    }

    public g(ij.a aVar, ij.a aVar2) {
        this.f10114a = aVar;
        this.f10115b = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (!this.f10114a.equals(gVar.f10114a) || !this.f10115b.equals(gVar.f10115b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f10115b.hashCode() + (this.f10114a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f10114a + ", height=" + this.f10115b + ')';
    }
}
