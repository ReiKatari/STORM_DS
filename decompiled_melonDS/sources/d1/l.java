package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l extends p {

    /* renamed from: a  reason: collision with root package name */
    public float f3600a;

    public l(float f8) {
        this.f3600a = f8;
    }

    @Override // d1.p
    public final float a(int i2) {
        if (i2 == 0) {
            return this.f3600a;
        }
        return 0.0f;
    }

    @Override // d1.p
    public final int b() {
        return 1;
    }

    @Override // d1.p
    public final p c() {
        return new l(0.0f);
    }

    @Override // d1.p
    public final void d() {
        this.f3600a = 0.0f;
    }

    @Override // d1.p
    public final void e(int i2, float f8) {
        if (i2 == 0) {
            this.f3600a = f8;
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof l) && ((l) obj).f3600a == this.f3600a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3600a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f3600a;
    }
}
