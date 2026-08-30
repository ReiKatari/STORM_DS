package m2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final h3.c f9191a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9192b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f9193c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f9194d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f9195e;

    public d(h3.c cVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f9191a = cVar;
        this.f9192b = z10;
        this.f9193c = z11;
        this.f9194d = z12;
        this.f9195e = z13;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (!this.f9191a.equals(dVar.f9191a) || this.f9192b != dVar.f9192b || this.f9193c != dVar.f9193c || this.f9194d != dVar.f9194d || this.f9195e != dVar.f9195e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9195e) + w.d.e(w.d.e(w.d.e(this.f9191a.hashCode() * 31, this.f9192b, 31), this.f9193c, 31), this.f9194d, 31);
    }

    public final String toString() {
        return "HingeInfo(bounds=" + this.f9191a + ", isFlat=" + this.f9192b + ", isVertical=" + this.f9193c + ", isSeparating=" + this.f9194d + ", isOccluding=" + this.f9195e + ')';
    }
}
