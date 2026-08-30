package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n extends p {

    /* renamed from: a  reason: collision with root package name */
    public float f3609a;

    /* renamed from: b  reason: collision with root package name */
    public float f3610b;

    /* renamed from: c  reason: collision with root package name */
    public float f3611c;

    public n(float f8, float f10, float f11) {
        this.f3609a = f8;
        this.f3610b = f10;
        this.f3611c = f11;
    }

    @Override // d1.p
    public final float a(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    return 0.0f;
                }
                return this.f3611c;
            }
            return this.f3610b;
        }
        return this.f3609a;
    }

    @Override // d1.p
    public final int b() {
        return 3;
    }

    @Override // d1.p
    public final p c() {
        return new n(0.0f, 0.0f, 0.0f);
    }

    @Override // d1.p
    public final void d() {
        this.f3609a = 0.0f;
        this.f3610b = 0.0f;
        this.f3611c = 0.0f;
    }

    @Override // d1.p
    public final void e(int i2, float f8) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
                this.f3611c = f8;
                return;
            }
            this.f3610b = f8;
            return;
        }
        this.f3609a = f8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (nVar.f3609a == this.f3609a && nVar.f3610b == this.f3610b && nVar.f3611c == this.f3611c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3611c) + w.d.b(this.f3610b, Float.hashCode(this.f3609a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f3609a + ", v2 = " + this.f3610b + ", v3 = " + this.f3611c;
    }
}
