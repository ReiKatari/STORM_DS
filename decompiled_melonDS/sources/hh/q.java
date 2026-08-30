package hh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q extends s {

    /* renamed from: a  reason: collision with root package name */
    public final oe.e0 f6561a;

    public q(oe.e0 e0Var) {
        this.f6561a = e0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof q) || !this.f6561a.equals(((q) obj).f6561a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6561a.hashCode();
    }

    public final String toString() {
        return "CheatsScreen(romInfo=" + this.f6561a + ")";
    }
}
