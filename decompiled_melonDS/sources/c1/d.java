package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final float[] f2400a;

    static {
        float f8;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float[] fArr = new float[101];
        f2400a = fArr;
        float[] fArr2 = new float[101];
        float f18 = 0.0f;
        int i2 = 0;
        float f19 = 0.0f;
        while (true) {
            float f20 = 1.0f;
            if (i2 < 100) {
                float f21 = i2 / 100;
                float f22 = 1.0f;
                while (true) {
                    f8 = ((f22 - f18) / 2.0f) + f18;
                    f10 = f20 - f8;
                    f11 = f8 * 3.0f * f10;
                    f12 = f8 * f8 * f8;
                    float f23 = (((f8 * 0.35000002f) + (f10 * 0.175f)) * f11) + f12;
                    f13 = f20;
                    if (Math.abs(f23 - f21) < 1.0E-5d) {
                        break;
                    }
                    if (f23 > f21) {
                        f22 = f8;
                    } else {
                        f18 = f8;
                    }
                    f20 = f13;
                }
                float f24 = 0.5f;
                fArr[i2] = (((f10 * 0.5f) + f8) * f11) + f12;
                float f25 = f13;
                while (true) {
                    f14 = ((f25 - f19) / 2.0f) + f19;
                    f15 = f13 - f14;
                    f16 = f14 * 3.0f * f15;
                    f17 = f14 * f14 * f14;
                    float f26 = (((f15 * f24) + f14) * f16) + f17;
                    float f27 = f25;
                    if (Math.abs(f26 - f21) >= 1.0E-5d) {
                        if (f26 > f21) {
                            f25 = f14;
                        } else {
                            f19 = f14;
                            f25 = f27;
                        }
                        f24 = 0.5f;
                    }
                }
                fArr2[i2] = (((f14 * 0.35000002f) + (f15 * 0.175f)) * f16) + f17;
                i2++;
            } else {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
        }
    }

    public static c a(float f8) {
        float f10 = 0.0f;
        float f11 = 1.0f;
        float f12 = p7.j.f(f8, 0.0f, 1.0f);
        float f13 = 100;
        int i2 = (int) (f13 * f12);
        if (i2 < 100) {
            float f14 = i2 / f13;
            int i10 = i2 + 1;
            float f15 = i10 / f13;
            float[] fArr = f2400a;
            float f16 = fArr[i2];
            float f17 = (fArr[i10] - f16) / (f15 - f14);
            float a10 = w.d.a(f12, f14, f17, f16);
            f10 = f17;
            f11 = a10;
        }
        return new c(f11, f10);
    }
}
