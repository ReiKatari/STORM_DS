package hh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 extends pc.a {

    /* renamed from: d  reason: collision with root package name */
    public final ze.a f6510d;

    public b0(ze.a aVar) {
        aVar.getClass();
        this.f6510d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b0) && nc.k.a(this.f6510d, ((b0) obj).f6510d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6510d.hashCode();
    }

    public final String toString() {
        return "RomObject(rom=" + this.f6510d + ")";
    }
}
