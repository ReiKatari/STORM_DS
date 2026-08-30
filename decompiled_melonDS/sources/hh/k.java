package hh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends o {

    /* renamed from: a  reason: collision with root package name */
    public final ze.a f6537a;

    public k(ze.a aVar) {
        aVar.getClass();
        this.f6537a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k) && nc.k.a(this.f6537a, ((k) obj).f6537a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6537a.hashCode();
    }

    public final String toString() {
        return "RunningRom(rom=" + this.f6537a + ")";
    }
}
