package bd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m extends n {

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f2190a;

    public m(Throwable th2) {
        this.f2190a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            if (nc.k.a(this.f2190a, ((m) obj).f2190a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f2190a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override // bd.n
    public final String toString() {
        return "Closed(" + this.f2190a + ')';
    }
}
