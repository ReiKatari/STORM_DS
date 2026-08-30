package pf;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o extends p7.o {

    /* renamed from: c  reason: collision with root package name */
    public final ze.a f11641c;

    public o(ze.a aVar) {
        aVar.getClass();
        this.f11641c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof o) && nc.k.a(this.f11641c, ((o) obj).f11641c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11641c.hashCode();
    }

    public final String toString() {
        return "RomSession(rom=" + this.f11641c + ")";
    }
}
