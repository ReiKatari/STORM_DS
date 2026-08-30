package j3;

import i3.z;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l extends c {

    /* renamed from: d  reason: collision with root package name */
    public static final float[] f7387d;

    /* renamed from: e  reason: collision with root package name */
    public static final float[] f7388e;

    /* renamed from: f  reason: collision with root package name */
    public static final float[] f7389f;

    /* renamed from: g  reason: collision with root package name */
    public static final float[] f7390g;

    static {
        float[] g10 = j.g(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, j.c(a.f7339b.f7340a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f7387d = g10;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f7388e = fArr;
        f7389f = j.f(g10);
        f7390g = j.f(fArr);
    }

    @Override // j3.c
    public final float a(int i2) {
        if (i2 == 0) {
            return 1.0f;
        }
        return 0.5f;
    }

    @Override // j3.c
    public final float b(int i2) {
        if (i2 == 0) {
            return 0.0f;
        }
        return -0.5f;
    }

    @Override // j3.c
    public final long d(float f8, float f10, float f11) {
        if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        if (f8 > 1.0f) {
            f8 = 1.0f;
        }
        if (f10 < -0.5f) {
            f10 = -0.5f;
        }
        float f12 = 0.5f;
        if (f10 > 0.5f) {
            f10 = 0.5f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 <= 0.5f) {
            f12 = f11;
        }
        float[] fArr = f7390g;
        float f13 = (fArr[6] * f12) + (fArr[3] * f10) + (fArr[0] * f8);
        float f14 = (fArr[7] * f12) + (fArr[4] * f10) + (fArr[1] * f8);
        float f15 = (fArr[8] * f12) + (fArr[5] * f10) + (fArr[2] * f8);
        float f16 = f13 * f13 * f13;
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float[] fArr2 = f7389f;
        float f19 = (fArr2[3] * f17) + (fArr2[0] * f16);
        float f20 = (fArr2[7] * f18) + (fArr2[4] * f17) + (fArr2[1] * f16);
        return (Float.floatToRawIntBits(f20) & 4294967295L) | (Float.floatToRawIntBits((fArr2[6] * f18) + f19) << 32);
    }

    @Override // j3.c
    public final float e(float f8, float f10, float f11) {
        if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        if (f8 > 1.0f) {
            f8 = 1.0f;
        }
        if (f10 < -0.5f) {
            f10 = -0.5f;
        }
        float f12 = 0.5f;
        if (f10 > 0.5f) {
            f10 = 0.5f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 <= 0.5f) {
            f12 = f11;
        }
        float[] fArr = f7390g;
        float f13 = (fArr[6] * f12) + (fArr[3] * f10) + (fArr[0] * f8);
        float f14 = (fArr[7] * f12) + (fArr[4] * f10) + (fArr[1] * f8);
        float f15 = (fArr[8] * f12) + (fArr[5] * f10) + (fArr[2] * f8);
        float f16 = f13 * f13 * f13;
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float[] fArr2 = f7389f;
        return (fArr2[8] * f18) + (fArr2[5] * f17) + (fArr2[2] * f16);
    }

    @Override // j3.c
    public final long f(float f8, float f10, float f11, float f12, c cVar) {
        float[] fArr = f7387d;
        float f13 = fArr[3] * f10;
        float f14 = fArr[6] * f11;
        float f15 = fArr[4] * f10;
        float f16 = fArr[7] * f11;
        float f17 = fArr[5] * f10;
        float f18 = fArr[8] * f11;
        float i2 = p7.l.i(f14 + f13 + (fArr[0] * f8));
        float i10 = p7.l.i(f16 + f15 + (fArr[1] * f8));
        float i11 = p7.l.i(f18 + f17 + (fArr[2] * f8));
        float[] fArr2 = f7388e;
        float f19 = (fArr2[6] * i11) + (fArr2[3] * i10) + (fArr2[0] * i2);
        float f20 = (fArr2[4] * i10) + (fArr2[1] * i2);
        float f21 = fArr2[5] * i10;
        return z.b(f19, (fArr2[7] * i11) + f20, (fArr2[8] * i11) + f21 + (fArr2[2] * i2), f12, cVar);
    }
}
