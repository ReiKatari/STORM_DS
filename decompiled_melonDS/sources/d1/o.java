package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o extends p {

    /* renamed from: a  reason: collision with root package name */
    public float f3620a;

    /* renamed from: b  reason: collision with root package name */
    public float f3621b;

    /* renamed from: c  reason: collision with root package name */
    public float f3622c;

    /* renamed from: d  reason: collision with root package name */
    public float f3623d;

    public o(float f8, float f10, float f11, float f12) {
        this.f3620a = f8;
        this.f3621b = f10;
        this.f3622c = f11;
        this.f3623d = f12;
    }

    @Override // d1.p
    public final float a(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        return 0.0f;
                    }
                    return this.f3623d;
                }
                return this.f3622c;
            }
            return this.f3621b;
        }
        return this.f3620a;
    }

    @Override // d1.p
    public final int b() {
        return 4;
    }

    @Override // d1.p
    public final p c() {
        return new o(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // d1.p
    public final void d() {
        this.f3620a = 0.0f;
        this.f3621b = 0.0f;
        this.f3622c = 0.0f;
        this.f3623d = 0.0f;
    }

    @Override // d1.p
    public final void e(int i2, float f8) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        return;
                    }
                    this.f3623d = f8;
                    return;
                }
                this.f3622c = f8;
                return;
            }
            this.f3621b = f8;
            return;
        }
        this.f3620a = f8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (oVar.f3620a == this.f3620a && oVar.f3621b == this.f3621b && oVar.f3622c == this.f3622c && oVar.f3623d == this.f3623d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3623d) + w.d.b(this.f3622c, w.d.b(this.f3621b, Float.hashCode(this.f3620a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f3620a + ", v2 = " + this.f3621b + ", v3 = " + this.f3622c + ", v4 = " + this.f3623d;
    }
}
