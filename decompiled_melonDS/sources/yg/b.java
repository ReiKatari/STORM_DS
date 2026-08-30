package yg;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    public final oe.h f14819a;

    public b(oe.h hVar) {
        hVar.getClass();
        this.f14819a = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && this.f14819a == ((b) obj).f14819a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14819a.hashCode();
    }

    public final String toString() {
        return "DSiSetupInvalid(status=" + this.f14819a + ")";
    }
}
