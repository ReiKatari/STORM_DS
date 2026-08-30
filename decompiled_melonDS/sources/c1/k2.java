package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k2 {

    /* renamed from: a  reason: collision with root package name */
    public final d1.c f2456a;

    /* renamed from: b  reason: collision with root package name */
    public long f2457b;

    public k2(d1.c cVar, long j2) {
        this.f2456a = cVar;
        this.f2457b = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k2) {
                k2 k2Var = (k2) obj;
                if (!this.f2456a.equals(k2Var.f2456a) || !x4.l.b(this.f2457b, k2Var.f2457b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2457b) + (this.f2456a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimData(anim=" + this.f2456a + ", startSize=" + ((Object) x4.l.c(this.f2457b)) + ')';
    }
}
