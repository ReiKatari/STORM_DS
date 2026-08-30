package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a  reason: collision with root package name */
    public float f3712a;

    /* renamed from: b  reason: collision with root package name */
    public double f3713b;

    /* renamed from: c  reason: collision with root package name */
    public float f3714c;

    public final long a(float f8, float f10, long j2) {
        double sin;
        double cos;
        double exp;
        double exp2;
        float f11 = f8 - this.f3712a;
        double d4 = j2 / 1000.0d;
        float f12 = this.f3714c;
        double d10 = f12 * f12;
        double d11 = this.f3713b;
        double d12 = (-f12) * d11;
        if (f12 > 1.0f) {
            double sqrt = Math.sqrt(d10 - 1) * d11;
            double d13 = d12 + sqrt;
            double d14 = d12 - sqrt;
            double d15 = f11;
            double d16 = ((d14 * d15) - f10) / (d14 - d13);
            double d17 = d15 - d16;
            double d18 = d14 * d4;
            double d19 = d4 * d13;
            sin = (Math.exp(d19) * d16) + (Math.exp(d18) * d17);
            exp = Math.exp(d18) * d17 * d14;
            exp2 = Math.exp(d19) * d16 * d13;
        } else if (f12 == 1.0f) {
            double d20 = f11;
            double d21 = (d11 * d20) + f10;
            double d22 = (-d11) * d4;
            double d23 = (d4 * d21) + d20;
            sin = Math.exp(d22) * d23;
            exp = Math.exp(d22) * d23 * (-this.f3713b);
            exp2 = Math.exp(d22) * d21;
        } else {
            double d24 = 1;
            double sqrt2 = Math.sqrt(d24 - d10) * d11;
            double d25 = f11;
            double d26 = (((-d12) * d25) + f10) * (d24 / sqrt2);
            double d27 = sqrt2 * d4;
            double d28 = d4 * d12;
            sin = ((Math.sin(d27) * d26) + (Math.cos(d27) * d25)) * Math.exp(d28);
            cos = (((Math.cos(d27) * sqrt2 * d26) + (Math.sin(d27) * (-sqrt2) * d25)) * Math.exp(d28)) + (d12 * sin);
            float f13 = (float) cos;
            return (Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits((float) (sin + this.f3712a)) << 32);
        }
        cos = exp2 + exp;
        float f132 = (float) cos;
        return (Float.floatToRawIntBits(f132) & 4294967295L) | (Float.floatToRawIntBits((float) (sin + this.f3712a)) << 32);
    }
}
