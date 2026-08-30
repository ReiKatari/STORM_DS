package e;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends d0.d {

    /* renamed from: o  reason: collision with root package name */
    public final Object f4132o;

    /* renamed from: p  reason: collision with root package name */
    public final long f4133p;

    public b(long j2, Object obj) {
        super(11);
        this.f4132o = obj;
        this.f4133p = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (!this.f4132o.equals(bVar.f4132o) || this.f4133p != bVar.f4133p) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // d0.d
    public final int hashCode() {
        return Long.hashCode(this.f4133p) + (this.f4132o.hashCode() * 31);
    }

    @Override // d0.d
    public final String toString() {
        return "BackHandlerInfo(owner=" + this.f4132o + ", compositeKey=" + this.f4133p + ')';
    }
}
