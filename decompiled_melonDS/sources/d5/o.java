package d5;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o implements n {

    /* renamed from: a  reason: collision with root package name */
    public float f3877a;

    /* renamed from: b  reason: collision with root package name */
    public float f3878b;

    /* renamed from: c  reason: collision with root package name */
    public float f3879c;

    /* renamed from: d  reason: collision with root package name */
    public float f3880d;

    /* renamed from: e  reason: collision with root package name */
    public float f3881e;

    /* renamed from: f  reason: collision with root package name */
    public float f3882f;

    /* renamed from: g  reason: collision with root package name */
    public float f3883g;

    /* renamed from: h  reason: collision with root package name */
    public float f3884h;

    /* renamed from: i  reason: collision with root package name */
    public float f3885i;

    /* renamed from: j  reason: collision with root package name */
    public int f3886j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3887k;

    /* renamed from: l  reason: collision with root package name */
    public float f3888l;
    public float m;

    /* renamed from: n  reason: collision with root package name */
    public float f3889n;

    @Override // d5.n
    public final boolean a() {
        if (b() < 1.0E-5f && Math.abs(this.f3885i - this.m) < 1.0E-5f) {
            return true;
        }
        return false;
    }

    @Override // d5.n
    public final float b() {
        boolean z10 = this.f3887k;
        float f8 = this.f3889n;
        if (z10) {
            return -c(f8);
        }
        return c(f8);
    }

    public final float c(float f8) {
        float f10;
        float f11;
        float f12 = this.f3880d;
        if (f8 <= f12) {
            f10 = this.f3877a;
            f11 = this.f3878b;
        } else {
            int i2 = this.f3886j;
            if (i2 != 1) {
                f8 -= f12;
                f12 = this.f3881e;
                if (f8 < f12) {
                    f10 = this.f3878b;
                    f11 = this.f3879c;
                } else if (i2 != 2) {
                    float f13 = f8 - f12;
                    float f14 = this.f3882f;
                    if (f13 < f14) {
                        float f15 = this.f3879c;
                        return f15 - ((f13 * f15) / f14);
                    }
                    return 0.0f;
                } else {
                    return 0.0f;
                }
            } else {
                return 0.0f;
            }
        }
        return (((f11 - f10) * f8) / f12) + f10;
    }

    public final void d(float f8, float f10, float f11, float f12, float f13) {
        this.f3885i = f10;
        if (f8 == 0.0f) {
            f8 = 1.0E-4f;
        }
        float f14 = f8 / f11;
        float f15 = (f14 * f8) / 2.0f;
        if (f8 < 0.0f) {
            float sqrt = (float) Math.sqrt((f10 - ((((-f8) / f11) * f8) / 2.0f)) * f11);
            if (sqrt < f12) {
                this.f3886j = 2;
                this.f3877a = f8;
                this.f3878b = sqrt;
                this.f3879c = 0.0f;
                float f16 = (sqrt - f8) / f11;
                this.f3880d = f16;
                this.f3881e = sqrt / f11;
                this.f3883g = ((f8 + sqrt) * f16) / 2.0f;
                this.f3884h = f10;
                this.f3885i = f10;
                return;
            }
            this.f3886j = 3;
            this.f3877a = f8;
            this.f3878b = f12;
            this.f3879c = f12;
            float f17 = (f12 - f8) / f11;
            this.f3880d = f17;
            float f18 = f12 / f11;
            this.f3882f = f18;
            float f19 = ((f8 + f12) * f17) / 2.0f;
            float f20 = (f18 * f12) / 2.0f;
            this.f3881e = ((f10 - f19) - f20) / f12;
            this.f3883g = f19;
            this.f3884h = f10 - f20;
            this.f3885i = f10;
        } else if (f15 >= f10) {
            this.f3886j = 1;
            this.f3877a = f8;
            this.f3878b = 0.0f;
            this.f3883g = f10;
            this.f3880d = (2.0f * f10) / f8;
        } else {
            float f21 = f10 - f15;
            float f22 = f21 / f8;
            if (f22 + f14 < f13) {
                this.f3886j = 2;
                this.f3877a = f8;
                this.f3878b = f8;
                this.f3879c = 0.0f;
                this.f3883g = f21;
                this.f3884h = f10;
                this.f3880d = f22;
                this.f3881e = f14;
                return;
            }
            float sqrt2 = (float) Math.sqrt(((f8 * f8) / 2.0f) + (f11 * f10));
            float f23 = (sqrt2 - f8) / f11;
            this.f3880d = f23;
            float f24 = sqrt2 / f11;
            this.f3881e = f24;
            if (sqrt2 < f12) {
                this.f3886j = 2;
                this.f3877a = f8;
                this.f3878b = sqrt2;
                this.f3879c = 0.0f;
                this.f3880d = f23;
                this.f3881e = f24;
                this.f3883g = ((f8 + sqrt2) * f23) / 2.0f;
                this.f3884h = f10;
                return;
            }
            this.f3886j = 3;
            this.f3877a = f8;
            this.f3878b = f12;
            this.f3879c = f12;
            float f25 = (f12 - f8) / f11;
            this.f3880d = f25;
            float f26 = f12 / f11;
            this.f3882f = f26;
            float f27 = ((f8 + f12) * f25) / 2.0f;
            float f28 = (f26 * f12) / 2.0f;
            this.f3881e = ((f10 - f27) - f28) / f12;
            this.f3883g = f27;
            this.f3884h = f10 - f28;
            this.f3885i = f10;
        }
    }

    @Override // d5.n
    public final float getInterpolation(float f8) {
        float f10;
        float f11 = this.f3880d;
        if (f8 <= f11) {
            float f12 = this.f3877a;
            f10 = ((((this.f3878b - f12) * f8) * f8) / (f11 * 2.0f)) + (f12 * f8);
        } else {
            int i2 = this.f3886j;
            if (i2 == 1) {
                f10 = this.f3883g;
            } else {
                float f13 = f8 - f11;
                float f14 = this.f3881e;
                if (f13 < f14) {
                    float f15 = this.f3883g;
                    float f16 = this.f3878b;
                    f10 = ((((this.f3879c - f16) * f13) * f13) / (f14 * 2.0f)) + (f16 * f13) + f15;
                } else if (i2 == 2) {
                    f10 = this.f3884h;
                } else {
                    float f17 = f13 - f14;
                    float f18 = this.f3882f;
                    if (f17 <= f18) {
                        float f19 = this.f3884h;
                        float f20 = this.f3879c * f17;
                        f10 = (f19 + f20) - ((f20 * f17) / (f18 * 2.0f));
                    } else {
                        f10 = this.f3885i;
                    }
                }
            }
        }
        this.m = f10;
        this.f3889n = f8;
        boolean z10 = this.f3887k;
        float f21 = this.f3888l;
        if (z10) {
            return f21 - f10;
        }
        return f21 + f10;
    }
}
