package p5;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: k  reason: collision with root package name */
    public static final l f11355k;

    /* renamed from: a  reason: collision with root package name */
    public final float f11356a;

    /* renamed from: b  reason: collision with root package name */
    public final float f11357b;

    /* renamed from: c  reason: collision with root package name */
    public final float f11358c;

    /* renamed from: d  reason: collision with root package name */
    public final float f11359d;

    /* renamed from: e  reason: collision with root package name */
    public final float f11360e;

    /* renamed from: f  reason: collision with root package name */
    public final float f11361f;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f11362g;

    /* renamed from: h  reason: collision with root package name */
    public final float f11363h;

    /* renamed from: i  reason: collision with root package name */
    public final float f11364i;

    /* renamed from: j  reason: collision with root package name */
    public final float f11365j;

    static {
        float f8;
        float[] fArr;
        float[] fArr2 = b.f11330c;
        float n10 = (float) ((b.n() * 63.66197723675813d) / 100.0d);
        float[][] fArr3 = b.f11328a;
        float f10 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f11 = fArr2[1];
        float f12 = fArr4[1] * f11;
        float f13 = fArr2[2];
        float f14 = (fArr4[2] * f13) + f12 + (fArr4[0] * f10);
        float[] fArr5 = fArr3[1];
        float f15 = (fArr5[2] * f13) + (fArr5[1] * f11) + (fArr5[0] * f10);
        float[] fArr6 = fArr3[2];
        float f16 = (f13 * fArr6[2]) + (f11 * fArr6[1]) + (f10 * fArr6[0]);
        if (1.0f >= 0.9d) {
            f8 = 0.69f;
        } else {
            f8 = 0.655f;
        }
        float f17 = f8;
        float exp = (1.0f - (((float) Math.exp(((-n10) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d4 = exp;
        if (d4 > 1.0d) {
            exp = 1.0f;
        } else if (d4 < 0.0d) {
            exp = 0.0f;
        }
        float f18 = 1.0f / ((5.0f * n10) + 1.0f);
        float f19 = f18 * f18 * f18 * f18;
        float f20 = 1.0f - f19;
        float cbrt = (0.1f * f20 * f20 * ((float) Math.cbrt(n10 * 5.0d))) + (f19 * n10);
        float n11 = b.n() / fArr2[1];
        double d10 = n11;
        float sqrt = ((float) Math.sqrt(d10)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d10, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr[0] * cbrt) * f14) / 100.0d, 0.42d), (float) Math.pow(((fArr[1] * cbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((fArr[2] * cbrt) * f16) / 100.0d, 0.42d)};
        float f21 = fArr7[0];
        float f22 = (f21 * 400.0f) / (f21 + 27.13f);
        float f23 = fArr7[1];
        float f24 = (f23 * 400.0f) / (f23 + 27.13f);
        float f25 = fArr7[2];
        float[] fArr8 = {f22, f24, (400.0f * f25) / (f25 + 27.13f)};
        f11355k = new l(n11, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * pow, pow, pow, f17, 1.0f, new float[]{(((100.0f / f14) * exp) + 1.0f) - exp, (((100.0f / f15) * exp) + 1.0f) - exp, (((100.0f / f16) * exp) + 1.0f) - exp}, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public l(float f8, float f10, float f11, float f12, float f13, float f14, float[] fArr, float f15, float f16, float f17) {
        this.f11361f = f8;
        this.f11356a = f10;
        this.f11357b = f11;
        this.f11358c = f12;
        this.f11359d = f13;
        this.f11360e = f14;
        this.f11362g = fArr;
        this.f11363h = f15;
        this.f11364i = f16;
        this.f11365j = f17;
    }
}
