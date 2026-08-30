package se;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p extends r {

    /* renamed from: a  reason: collision with root package name */
    public final pf.r f12885a;

    public p(pf.r rVar) {
        this.f12885a = rVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof p) || !this.f12885a.equals(((p) obj).f12885a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f12885a.hashCode();
    }

    public final String toString() {
        return "LaunchFailedSramProblem(reason=" + this.f12885a + ")";
    }
}
