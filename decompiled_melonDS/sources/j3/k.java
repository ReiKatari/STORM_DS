package j3;

import i3.z;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends c {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f7386d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i2, int i10, long j2, String str) {
        super(str, i2, j2);
        this.f7386d = i10;
    }

    @Override // j3.c
    public final float a(int i2) {
        switch (this.f7386d) {
            case 0:
                if (i2 == 0) {
                    return 100.0f;
                }
                return 128.0f;
            default:
                return 2.0f;
        }
    }

    @Override // j3.c
    public final float b(int i2) {
        switch (this.f7386d) {
            case 0:
                if (i2 == 0) {
                    return 0.0f;
                }
                return -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // j3.c
    public final long d(float f8, float f10, float f11) {
        float f12;
        float f13;
        switch (this.f7386d) {
            case 0:
                if (f8 < 0.0f) {
                    f8 = 0.0f;
                }
                if (f8 > 100.0f) {
                    f8 = 100.0f;
                }
                if (f10 < -128.0f) {
                    f10 = -128.0f;
                }
                if (f10 > 128.0f) {
                    f10 = 128.0f;
                }
                float f14 = (f8 + 16.0f) / 116.0f;
                float f15 = (f10 * 0.002f) + f14;
                if (f15 > 0.20689656f) {
                    f12 = f15 * f15 * f15;
                } else {
                    f12 = (f15 - 0.13793103f) * 0.12841855f;
                }
                if (f14 > 0.20689656f) {
                    f13 = f14 * f14 * f14;
                } else {
                    f13 = (f14 - 0.13793103f) * 0.12841855f;
                }
                float[] fArr = j.f7385e;
                float f16 = f12 * fArr[0];
                float f17 = f13 * fArr[1];
                return (Float.floatToRawIntBits(f17) & 4294967295L) | (Float.floatToRawIntBits(f16) << 32);
            default:
                if (f8 < -2.0f) {
                    f8 = -2.0f;
                }
                float f18 = 2.0f;
                if (f8 > 2.0f) {
                    f8 = 2.0f;
                }
                if (f10 < -2.0f) {
                    f10 = -2.0f;
                }
                if (f10 <= 2.0f) {
                    f18 = f10;
                }
                return (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f18) & 4294967295L);
        }
    }

    @Override // j3.c
    public final float e(float f8, float f10, float f11) {
        float f12;
        switch (this.f7386d) {
            case 0:
                if (f8 < 0.0f) {
                    f8 = 0.0f;
                }
                if (f8 > 100.0f) {
                    f8 = 100.0f;
                }
                if (f11 < -128.0f) {
                    f11 = -128.0f;
                }
                if (f11 > 128.0f) {
                    f11 = 128.0f;
                }
                float f13 = ((f8 + 16.0f) / 116.0f) - (f11 * 0.005f);
                if (f13 > 0.20689656f) {
                    f12 = f13 * f13 * f13;
                } else {
                    f12 = 0.12841855f * (f13 - 0.13793103f);
                }
                return f12 * j.f7385e[2];
            default:
                if (f11 < -2.0f) {
                    f11 = -2.0f;
                }
                if (f11 > 2.0f) {
                    return 2.0f;
                }
                return f11;
        }
    }

    @Override // j3.c
    public final long f(float f8, float f10, float f11, float f12, c cVar) {
        float f13;
        float f14;
        float f15;
        switch (this.f7386d) {
            case 0:
                float[] fArr = j.f7385e;
                float f16 = f8 / fArr[0];
                float f17 = f10 / fArr[1];
                float f18 = f11 / fArr[2];
                if (f16 > 0.008856452f) {
                    f13 = (float) Math.cbrt(f16);
                } else {
                    f13 = (f16 * 7.787037f) + 0.13793103f;
                }
                if (f17 > 0.008856452f) {
                    f14 = (float) Math.cbrt(f17);
                } else {
                    f14 = (f17 * 7.787037f) + 0.13793103f;
                }
                if (f18 > 0.008856452f) {
                    f15 = (float) Math.cbrt(f18);
                } else {
                    f15 = (f18 * 7.787037f) + 0.13793103f;
                }
                float f19 = (116.0f * f14) - 16.0f;
                float f20 = (f13 - f14) * 500.0f;
                float f21 = (f14 - f15) * 200.0f;
                if (f19 < 0.0f) {
                    f19 = 0.0f;
                }
                if (f19 > 100.0f) {
                    f19 = 100.0f;
                }
                if (f20 < -128.0f) {
                    f20 = -128.0f;
                }
                float f22 = 128.0f;
                if (f20 > 128.0f) {
                    f20 = 128.0f;
                }
                if (f21 < -128.0f) {
                    f21 = -128.0f;
                }
                if (f21 <= 128.0f) {
                    f22 = f21;
                }
                return z.b(f19, f20, f22, f12, cVar);
            default:
                if (f8 < -2.0f) {
                    f8 = -2.0f;
                }
                float f23 = 2.0f;
                if (f8 > 2.0f) {
                    f8 = 2.0f;
                }
                if (f10 < -2.0f) {
                    f10 = -2.0f;
                }
                if (f10 > 2.0f) {
                    f10 = 2.0f;
                }
                if (f11 < -2.0f) {
                    f11 = -2.0f;
                }
                if (f11 <= 2.0f) {
                    f23 = f11;
                }
                return z.b(f8, f10, f23, f12, cVar);
        }
    }
}
