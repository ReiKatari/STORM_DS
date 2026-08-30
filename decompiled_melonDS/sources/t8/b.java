package t8;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public final int f13136a;

    public b(int i2) {
        this.f13136a = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && this.f13136a == ((b) obj).f13136a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13136a);
    }

    public final String toString() {
        return w.d.p(new StringBuilder("ConstraintsNotMet(reason="), this.f13136a, ')');
    }
}
