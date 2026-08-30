package d5;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l implements n {

    /* renamed from: a  reason: collision with root package name */
    public double f3867a;

    /* renamed from: b  reason: collision with root package name */
    public double f3868b;

    /* renamed from: c  reason: collision with root package name */
    public double f3869c;

    /* renamed from: d  reason: collision with root package name */
    public float f3870d;

    /* renamed from: e  reason: collision with root package name */
    public float f3871e;

    /* renamed from: f  reason: collision with root package name */
    public float f3872f;

    /* renamed from: g  reason: collision with root package name */
    public float f3873g;

    /* renamed from: h  reason: collision with root package name */
    public float f3874h;

    /* renamed from: i  reason: collision with root package name */
    public int f3875i;

    @Override // d5.n
    public final boolean a() {
        double d4 = this.f3871e - this.f3869c;
        double d10 = this.f3868b;
        double d11 = this.f3872f;
        if (Math.sqrt((((d10 * d4) * d4) + ((d11 * d11) * this.f3873g)) / d10) <= this.f3874h) {
            return true;
        }
        return false;
    }

    @Override // d5.n
    public final float b() {
        return 0.0f;
    }

    @Override // d5.n
    public final float getInterpolation(float f8) {
        double d4 = f8 - this.f3870d;
        if (d4 > 0.0d) {
            double d10 = this.f3868b;
            double d11 = this.f3867a;
            int sqrt = (int) ((9.0d / ((Math.sqrt(d10 / this.f3873g) * d4) * 4.0d)) + 1.0d);
            double d12 = d4 / sqrt;
            int i2 = 0;
            while (i2 < sqrt) {
                float f10 = this.f3871e;
                double d13 = f10;
                double d14 = this.f3869c;
                double d15 = d12;
                float f11 = this.f3872f;
                double d16 = f11;
                double d17 = ((-d10) * (d13 - d14)) - (d11 * d16);
                double d18 = this.f3873g;
                double d19 = (((d17 / d18) * d15) / 2.0d) + d16;
                double d20 = ((((-((((d15 * d19) / 2.0d) + d13) - d14)) * d10) - (d19 * d11)) / d18) * d15;
                float f12 = f11 + ((float) d20);
                this.f3872f = f12;
                float f13 = f10 + ((float) (((d20 / 2.0d) + d16) * d15));
                this.f3871e = f13;
                int i10 = this.f3875i;
                if (i10 > 0) {
                    if (f13 < 0.0f && (i10 & 1) == 1) {
                        this.f3871e = -f13;
                        this.f3872f = -f12;
                    }
                    float f14 = this.f3871e;
                    if (f14 > 1.0f && (i10 & 2) == 2) {
                        this.f3871e = 2.0f - f14;
                        this.f3872f = -this.f3872f;
                    }
                }
                i2++;
                d12 = d15;
            }
        }
        this.f3870d = f8;
        if (a()) {
            this.f3871e = (float) this.f3869c;
        }
        return this.f3871e;
    }
}
