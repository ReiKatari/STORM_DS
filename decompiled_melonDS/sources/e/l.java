package e;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l extends d0.d {

    /* renamed from: o  reason: collision with root package name */
    public final Object f4146o;

    /* renamed from: p  reason: collision with root package name */
    public final long f4147p;

    public l(long j2, Object obj) {
        super(11);
        this.f4146o = obj;
        this.f4147p = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l) {
                l lVar = (l) obj;
                if (!this.f4146o.equals(lVar.f4146o) || this.f4147p != lVar.f4147p) {
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
        return Long.hashCode(this.f4147p) + (this.f4146o.hashCode() * 31);
    }

    @Override // d0.d
    public final String toString() {
        return "PredictiveBackHandlerInfo(owner=" + this.f4146o + ", compositeKey=" + this.f4147p + ')';
    }
}
