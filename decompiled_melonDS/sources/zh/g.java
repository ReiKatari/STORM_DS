package zh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: a  reason: collision with root package name */
    public final e f15127a;

    public g(e eVar) {
        eVar.getClass();
        this.f15127a = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && nc.k.a(this.f15127a, ((g) obj).f15127a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15127a.hashCode();
    }

    public final String toString() {
        return "Ready(romConfigUiModel=" + this.f15127a + ")";
    }
}
