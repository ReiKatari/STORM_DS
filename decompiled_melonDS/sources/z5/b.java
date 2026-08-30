package z5;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Object f14961a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14962b;

    public b(Object obj, Object obj2) {
        this.f14961a = obj;
        this.f14962b = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (bVar.f14961a.equals(this.f14961a) && bVar.f14962b.equals(this.f14962b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14961a.hashCode() ^ this.f14962b.hashCode();
    }

    public final String toString() {
        return "Pair{" + this.f14961a + " " + this.f14962b + "}";
    }
}
