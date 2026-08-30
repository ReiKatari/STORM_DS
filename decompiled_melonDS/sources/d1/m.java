package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m extends p {

    /* renamed from: a  reason: collision with root package name */
    public float f3603a;

    /* renamed from: b  reason: collision with root package name */
    public float f3604b;

    public m(float f8, float f10) {
        this.f3603a = f8;
        this.f3604b = f10;
    }

    @Override // d1.p
    public final float a(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                return 0.0f;
            }
            return this.f3604b;
        }
        return this.f3603a;
    }

    @Override // d1.p
    public final int b() {
        return 2;
    }

    @Override // d1.p
    public final p c() {
        return new m(0.0f, 0.0f);
    }

    @Override // d1.p
    public final void d() {
        this.f3603a = 0.0f;
        this.f3604b = 0.0f;
    }

    @Override // d1.p
    public final void e(int i2, float f8) {
        if (i2 != 0) {
            if (i2 != 1) {
                return;
            }
            this.f3604b = f8;
            return;
        }
        this.f3603a = f8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (mVar.f3603a == this.f3603a && mVar.f3604b == this.f3604b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3604b) + (Float.hashCode(this.f3603a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f3603a + ", v2 = " + this.f3604b;
    }
}
