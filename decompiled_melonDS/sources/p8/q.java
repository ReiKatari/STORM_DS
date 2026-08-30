package p8;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q extends t {

    /* renamed from: a  reason: collision with root package name */
    public final h f11501a = h.f11493b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            return this.f11501a.equals(((q) obj).f11501a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11501a.hashCode() + (q.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f11501a + '}';
    }
}
