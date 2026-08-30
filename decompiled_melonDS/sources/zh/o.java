package zh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o extends p {

    /* renamed from: a  reason: collision with root package name */
    public final af.h f15134a;

    public o(af.h hVar) {
        hVar.getClass();
        this.f15134a = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof o) && this.f15134a == ((o) obj).f15134a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15134a.hashCode();
    }

    public final String toString() {
        return "RuntimeMicSourceUpdate(newRuntimeMicSource=" + this.f15134a + ")";
    }
}
