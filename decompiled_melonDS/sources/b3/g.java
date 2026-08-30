package b3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final float f1764a;

    public g(float f8) {
        this.f1764a = f8;
    }

    public final int a(int i2, int i10) {
        return Math.round((1 + this.f1764a) * ((i10 - i2) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && Float.compare(this.f1764a, ((g) obj).f1764a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1764a);
    }

    public final String toString() {
        return w.d.o(new StringBuilder("Vertical(bias="), this.f1764a, ')');
    }
}
