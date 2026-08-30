package hh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g0 extends i0 {

    /* renamed from: a  reason: collision with root package name */
    public final o0 f6527a;

    public g0(o0 o0Var) {
        o0Var.getClass();
        this.f6527a = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g0) && nc.k.a(this.f6527a, ((g0) obj).f6527a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6527a.hashCode();
    }

    public final String toString() {
        return "GameMasteredPopup(event=" + this.f6527a + ")";
    }
}
