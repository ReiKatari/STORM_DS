package j0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7209a;

    public h(Object obj) {
        this.f7209a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            return this.f7209a.equals(((h) obj).f7209a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7209a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Identifier{value=" + this.f7209a + "}";
    }
}
