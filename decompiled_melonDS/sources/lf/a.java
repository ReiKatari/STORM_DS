package lf;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends ij.a {

    /* renamed from: e  reason: collision with root package name */
    public final int f9068e;

    public a(int i2) {
        this.f9068e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.f9068e == ((a) obj).f9068e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9068e);
    }

    public final String toString() {
        return w.d.m("Running(activeCamera=", this.f9068e, ")");
    }
}
