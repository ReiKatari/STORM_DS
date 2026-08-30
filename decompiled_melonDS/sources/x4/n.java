package x4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n implements y4.a {

    /* renamed from: a  reason: collision with root package name */
    public final float f14347a;

    public n(float f8) {
        this.f14347a = f8;
    }

    @Override // y4.a
    public final float a(float f8) {
        return f8 / this.f14347a;
    }

    @Override // y4.a
    public final float b(float f8) {
        return f8 * this.f14347a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && Float.compare(this.f14347a, ((n) obj).f14347a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14347a);
    }

    public final String toString() {
        return w.d.o(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f14347a, ')');
    }
}
