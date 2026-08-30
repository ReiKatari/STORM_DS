package hh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h0 extends i0 {

    /* renamed from: a  reason: collision with root package name */
    public final a1 f6530a;

    public h0(a1 a1Var) {
        a1Var.getClass();
        this.f6530a = a1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h0) && nc.k.a(this.f6530a, ((h0) obj).f6530a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6530a.hashCode();
    }

    public final String toString() {
        return "RAIntegrationPopup(event=" + this.f6530a + ")";
    }
}
