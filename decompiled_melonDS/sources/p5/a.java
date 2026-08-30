package p5;

import android.graphics.Color;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f11322a;

    /* renamed from: b  reason: collision with root package name */
    public final float f11323b;

    /* renamed from: c  reason: collision with root package name */
    public final float f11324c;

    /* renamed from: d  reason: collision with root package name */
    public final float f11325d;

    /* renamed from: e  reason: collision with root package name */
    public final float f11326e;

    /* renamed from: f  reason: collision with root package name */
    public final float f11327f;

    public a(float f8, float f10, float f11, float f12, float f13, float f14) {
        this.f11322a = f8;
        this.f11323b = f10;
        this.f11324c = f11;
        this.f11325d = f12;
        this.f11326e = f13;
        this.f11327f = f14;
    }

    public static a a(int i2) {
        float f8;
        float pow;
        l lVar = l.f11355k;
        float g10 = b.g(Color.red(i2));
        float g11 = b.g(Color.green(i2));
        float g12 = b.g(Color.blue(i2));
        float[][] fArr = b.f11331d;
        float[] fArr2 = fArr[0];
        float f10 = (fArr2[2] * g12) + (fArr2[1] * g11) + (fArr2[0] * g10);
        float[] fArr3 = fArr[1];
        float f11 = (fArr3[2] * g12) + (fArr3[1] * g11) + (fArr3[0] * g10);
        float[] fArr4 = fArr[2];
        float f12 = (g12 * fArr4[2]) + (g11 * fArr4[1]) + (g10 * fArr4[0]);
        float[][] fArr5 = b.f11328a;
        float[] fArr6 = fArr5[0];
        float f13 = (fArr6[2] * f12) + (fArr6[1] * f11) + (fArr6[0] * f10);
        float[] fArr7 = fArr5[1];
        float f14 = fArr7[1] * f11;
        float f15 = fArr7[2] * f12;
        float[] fArr8 = fArr5[2];
        float f16 = (f12 * fArr8[2]) + (f11 * fArr8[1]) + (f10 * fArr8[0]);
        float[] fArr9 = lVar.f11362g;
        float f17 = lVar.f11364i;
        float f18 = lVar.f11359d;
        float f19 = lVar.f11356a;
        float f20 = fArr9[0] * f13;
        float f21 = fArr9[1] * (f15 + f14 + (fArr7[0] * f10));
        float f22 = fArr9[2] * f16;
        float f23 = lVar.f11363h;
        float pow2 = (float) Math.pow((Math.abs(f20) * f23) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f21) * f23) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((Math.abs(f22) * f23) / 100.0d, 0.42d);
        float signum = ((Math.signum(f20) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f21) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f22) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d4 = signum3;
        float f24 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d4)) / 11.0f;
        float f25 = ((float) ((signum + signum2) - (d4 * 2.0d))) / 9.0f;
        float f26 = signum2 * 20.0f;
        float f27 = ((21.0f * signum3) + ((signum * 20.0f) + f26)) / 20.0f;
        float f28 = (((signum * 40.0f) + f26) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f25, f24)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f29 = (3.1415927f * atan2) / 180.0f;
        float pow5 = ((float) Math.pow((f28 * lVar.f11357b) / f19, lVar.f11365j * f18)) * 100.0f;
        Math.sqrt(pow5 / 100.0f);
        float f30 = f19 + 4.0f;
        if (atan2 < 20.14d) {
            f8 = 360.0f + atan2;
        } else {
            f8 = atan2;
        }
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, lVar.f11361f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f8 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.f11360e) * lVar.f11358c) * ((float) Math.sqrt((f25 * f25) + (f24 * f24)))) / (f27 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        Math.sqrt((pow * f18) / f30);
        float f31 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((f17 * pow6 * 0.0228f) + 1.0f)) * 43.85965f;
        double d10 = f29;
        return new a(atan2, pow6, pow5, f31, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    public static a b(float f8, float f10, float f11) {
        l lVar;
        double d4;
        float f12 = l.f11355k.f11359d;
        Math.sqrt(f8 / 100.0d);
        Math.sqrt(((f10 / ((float) Math.sqrt(d4))) * lVar.f11359d) / (lVar.f11356a + 4.0f));
        float f13 = (1.7f * f8) / ((0.007f * f8) + 1.0f);
        float log = ((float) Math.log((lVar.f11364i * f10 * 0.0228d) + 1.0d)) * 43.85965f;
        double d10 = (3.1415927f * f11) / 180.0f;
        return new a(f11, f10, f8, f13, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    public final int c(l lVar) {
        float f8;
        float[] fArr;
        float f10 = this.f11323b;
        int i2 = (f10 > 0.0d ? 1 : (f10 == 0.0d ? 0 : -1));
        float f11 = this.f11324c;
        if (i2 != 0) {
            double d4 = f11;
            if (d4 != 0.0d) {
                f8 = f10 / ((float) Math.sqrt(d4 / 100.0d));
                float f12 = lVar.f11361f;
                float f13 = lVar.f11363h;
                float pow = (float) Math.pow(f8 / Math.pow(1.64d - Math.pow(0.29d, f12), 0.73d), 1.1111111111111112d);
                double d10 = (this.f11322a * 3.1415927f) / 180.0f;
                float pow2 = lVar.f11356a * ((float) Math.pow(f11 / 100.0d, (1.0d / lVar.f11359d) / lVar.f11365j));
                float cos = ((float) (Math.cos(2.0d + d10) + 3.8d)) * 0.25f * 3846.1538f * lVar.f11360e * lVar.f11358c;
                float f14 = pow2 / lVar.f11357b;
                float sin = (float) Math.sin(d10);
                float cos2 = (float) Math.cos(d10);
                float f15 = (((0.305f + f14) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (cos * 23.0f)));
                float f16 = cos2 * f15;
                float f17 = f15 * sin;
                float f18 = f14 * 460.0f;
                float f19 = ((288.0f * f17) + ((451.0f * f16) + f18)) / 1403.0f;
                float f20 = ((f18 - (891.0f * f16)) - (261.0f * f17)) / 1403.0f;
                float f21 = ((f18 - (f16 * 220.0f)) - (f17 * 6300.0f)) / 1403.0f;
                float f22 = 100.0f / f13;
                float signum = Math.signum(f19) * f22 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f19) * 27.13d) / (400.0d - Math.abs(f19))), 2.380952380952381d));
                float signum2 = Math.signum(f20) * f22 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f20) * 27.13d) / (400.0d - Math.abs(f20))), 2.380952380952381d));
                float max = (float) Math.max(0.0d, (Math.abs(f21) * 27.13d) / (400.0d - Math.abs(f21)));
                float[] fArr2 = lVar.f11362g;
                float f23 = signum / fArr2[0];
                float f24 = signum2 / fArr2[1];
                float signum3 = ((Math.signum(f21) * f22) * ((float) Math.pow(max, 2.380952380952381d))) / fArr2[2];
                float[][] fArr3 = b.f11329b;
                float[] fArr4 = fArr3[0];
                float f25 = (fArr4[2] * signum3) + (fArr4[1] * f24) + (fArr4[0] * f23);
                float[] fArr5 = fArr3[1];
                float f26 = fArr5[1] * f24;
                float f27 = fArr5[2] * signum3;
                float f28 = f23 * fArr3[2][0];
                return q5.a.a(f25, f27 + f26 + (fArr5[0] * f23), (signum3 * fArr[2]) + (f24 * fArr[1]) + f28);
            }
        }
        f8 = 0.0f;
        float f122 = lVar.f11361f;
        float f132 = lVar.f11363h;
        float pow3 = (float) Math.pow(f8 / Math.pow(1.64d - Math.pow(0.29d, f122), 0.73d), 1.1111111111111112d);
        double d102 = (this.f11322a * 3.1415927f) / 180.0f;
        float pow22 = lVar.f11356a * ((float) Math.pow(f11 / 100.0d, (1.0d / lVar.f11359d) / lVar.f11365j));
        float cos3 = ((float) (Math.cos(2.0d + d102) + 3.8d)) * 0.25f * 3846.1538f * lVar.f11360e * lVar.f11358c;
        float f142 = pow22 / lVar.f11357b;
        float sin2 = (float) Math.sin(d102);
        float cos22 = (float) Math.cos(d102);
        float f152 = (((0.305f + f142) * 23.0f) * pow3) / (((pow3 * 108.0f) * sin2) + (((11.0f * pow3) * cos22) + (cos3 * 23.0f)));
        float f162 = cos22 * f152;
        float f172 = f152 * sin2;
        float f182 = f142 * 460.0f;
        float f192 = ((288.0f * f172) + ((451.0f * f162) + f182)) / 1403.0f;
        float f202 = ((f182 - (891.0f * f162)) - (261.0f * f172)) / 1403.0f;
        float f212 = ((f182 - (f162 * 220.0f)) - (f172 * 6300.0f)) / 1403.0f;
        float f222 = 100.0f / f132;
        float signum4 = Math.signum(f192) * f222 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f192) * 27.13d) / (400.0d - Math.abs(f192))), 2.380952380952381d));
        float signum22 = Math.signum(f202) * f222 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f202) * 27.13d) / (400.0d - Math.abs(f202))), 2.380952380952381d));
        float max2 = (float) Math.max(0.0d, (Math.abs(f212) * 27.13d) / (400.0d - Math.abs(f212)));
        float[] fArr22 = lVar.f11362g;
        float f232 = signum4 / fArr22[0];
        float f242 = signum22 / fArr22[1];
        float signum32 = ((Math.signum(f212) * f222) * ((float) Math.pow(max2, 2.380952380952381d))) / fArr22[2];
        float[][] fArr32 = b.f11329b;
        float[] fArr42 = fArr32[0];
        float f252 = (fArr42[2] * signum32) + (fArr42[1] * f242) + (fArr42[0] * f232);
        float[] fArr52 = fArr32[1];
        float f262 = fArr52[1] * f242;
        float f272 = fArr52[2] * signum32;
        float f282 = f232 * fArr32[2][0];
        return q5.a.a(f252, f272 + f262 + (fArr52[0] * f232), (signum32 * fArr[2]) + (f242 * fArr[1]) + f282);
    }
}
