package hh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n extends o {

    /* renamed from: a  reason: collision with root package name */
    public final ze.a f6549a;

    public n(ze.a aVar) {
        aVar.getClass();
        this.f6549a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && nc.k.a(this.f6549a, ((n) obj).f6549a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6549a.hashCode();
    }

    public final String toString() {
        return "ValidatingRom(rom=" + this.f6549a + ")";
    }
}
