package defpackage;

import android.graphics.Color;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n90  reason: default package */
/* loaded from: classes.dex */
public final class n90 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public n90(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public static n90 a(int i) {
        float f;
        float pow;
        gc7 gc7Var = gc7.k;
        float y = w81.y(Color.red(i));
        float y2 = w81.y(Color.green(i));
        float y3 = w81.y(Color.blue(i));
        float[][] fArr = w81.j;
        float[] fArr2 = fArr[0];
        float f2 = (fArr2[2] * y3) + (fArr2[1] * y2) + (fArr2[0] * y);
        float[] fArr3 = fArr[1];
        float f3 = (fArr3[2] * y3) + (fArr3[1] * y2) + (fArr3[0] * y);
        float[] fArr4 = fArr[2];
        float f4 = (y3 * fArr4[2]) + (y2 * fArr4[1]) + (y * fArr4[0]);
        float[][] fArr5 = w81.g;
        float[] fArr6 = fArr5[0];
        float f5 = (fArr6[2] * f4) + (fArr6[1] * f3) + (fArr6[0] * f2);
        float[] fArr7 = fArr5[1];
        float f6 = fArr7[1] * f3;
        float f7 = fArr7[2] * f4;
        float[] fArr8 = fArr5[2];
        float f8 = (f4 * fArr8[2]) + (f3 * fArr8[1]) + (f2 * fArr8[0]);
        float[] fArr9 = gc7Var.g;
        float f9 = gc7Var.i;
        float f10 = gc7Var.d;
        float f11 = gc7Var.a;
        float f12 = fArr9[0] * f5;
        float f13 = fArr9[1] * (f7 + f6 + (fArr7[0] * f2));
        float f14 = fArr9[2] * f8;
        float f15 = gc7Var.h;
        float pow2 = (float) Math.pow((Math.abs(f12) * f15) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f13) * f15) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((Math.abs(f14) * f15) / 100.0d, 0.42d);
        float signum = ((Math.signum(f12) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f13) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f14) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d = signum3;
        float f16 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d)) / 11.0f;
        float f17 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f18 = signum2 * 20.0f;
        float f19 = ((21.0f * signum3) + ((signum * 20.0f) + f18)) / 20.0f;
        float f20 = (((signum * 40.0f) + f18) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f17, f16)) * 180.0f) / 3.1415927f;
        if (atan2 < RecyclerView.A1) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f21 = (3.1415927f * atan2) / 180.0f;
        float pow5 = ((float) Math.pow((f20 * gc7Var.b) / f11, gc7Var.j * f10)) * 100.0f;
        Math.sqrt(pow5 / 100.0f);
        float f22 = f11 + 4.0f;
        if (atan2 < 20.14d) {
            f = 360.0f + atan2;
        } else {
            f = atan2;
        }
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, gc7Var.f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * gc7Var.e) * gc7Var.c) * ((float) Math.sqrt((f17 * f17) + (f16 * f16)))) / (f19 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        Math.sqrt((pow * f10) / f22);
        float f23 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((f9 * pow6 * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f21;
        return new n90(atan2, pow6, pow5, f23, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    public static n90 b(float f, float f2, float f3) {
        gc7 gc7Var;
        double d;
        float f4 = gc7.k.d;
        Math.sqrt(f / 100.0d);
        Math.sqrt(((f2 / ((float) Math.sqrt(d))) * gc7Var.d) / (gc7Var.a + 4.0f));
        float f5 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((gc7Var.i * f2 * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new n90(f3, f2, f, f5, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    public final int c(gc7 gc7Var) {
        float f;
        float[] fArr;
        float f2 = this.b;
        int i = (f2 > 0.0d ? 1 : (f2 == 0.0d ? 0 : -1));
        float f3 = this.c;
        if (i != 0) {
            double d = f3;
            if (d != 0.0d) {
                f = f2 / ((float) Math.sqrt(d / 100.0d));
                float f4 = gc7Var.f;
                float f5 = gc7Var.h;
                float pow = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, f4), 0.73d), 1.1111111111111112d);
                double d2 = (this.a * 3.1415927f) / 180.0f;
                float pow2 = gc7Var.a * ((float) Math.pow(f3 / 100.0d, (1.0d / gc7Var.d) / gc7Var.j));
                float cos = ((float) (Math.cos(2.0d + d2) + 3.8d)) * 0.25f * 3846.1538f * gc7Var.e * gc7Var.c;
                float f6 = pow2 / gc7Var.b;
                float sin = (float) Math.sin(d2);
                float cos2 = (float) Math.cos(d2);
                float f7 = (((0.305f + f6) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (cos * 23.0f)));
                float f8 = cos2 * f7;
                float f9 = f7 * sin;
                float f10 = f6 * 460.0f;
                float f11 = ((288.0f * f9) + ((451.0f * f8) + f10)) / 1403.0f;
                float f12 = ((f10 - (891.0f * f8)) - (261.0f * f9)) / 1403.0f;
                float f13 = ((f10 - (f8 * 220.0f)) - (f9 * 6300.0f)) / 1403.0f;
                float f14 = 100.0f / f5;
                float signum = Math.signum(f11) * f14 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f11) * 27.13d) / (400.0d - Math.abs(f11))), 2.380952380952381d));
                float signum2 = Math.signum(f12) * f14 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f12) * 27.13d) / (400.0d - Math.abs(f12))), 2.380952380952381d));
                float signum3 = Math.signum(f13) * f14 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f13) * 27.13d) / (400.0d - Math.abs(f13))), 2.380952380952381d));
                float[] fArr2 = gc7Var.g;
                float f15 = signum / fArr2[0];
                float f16 = signum2 / fArr2[1];
                float f17 = signum3 / fArr2[2];
                float[][] fArr3 = w81.h;
                float[] fArr4 = fArr3[0];
                float f18 = (fArr4[2] * f17) + (fArr4[1] * f16) + (fArr4[0] * f15);
                float[] fArr5 = fArr3[1];
                float f19 = fArr5[1] * f16;
                float f20 = fArr5[2] * f17;
                float f21 = f15 * fArr3[2][0];
                return gr0.a(f18, f20 + f19 + (fArr5[0] * f15), (f17 * fArr[2]) + (f16 * fArr[1]) + f21);
            }
        }
        f = RecyclerView.A1;
        float f42 = gc7Var.f;
        float f52 = gc7Var.h;
        float pow3 = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, f42), 0.73d), 1.1111111111111112d);
        double d22 = (this.a * 3.1415927f) / 180.0f;
        float pow22 = gc7Var.a * ((float) Math.pow(f3 / 100.0d, (1.0d / gc7Var.d) / gc7Var.j));
        float cos3 = ((float) (Math.cos(2.0d + d22) + 3.8d)) * 0.25f * 3846.1538f * gc7Var.e * gc7Var.c;
        float f62 = pow22 / gc7Var.b;
        float sin2 = (float) Math.sin(d22);
        float cos22 = (float) Math.cos(d22);
        float f72 = (((0.305f + f62) * 23.0f) * pow3) / (((pow3 * 108.0f) * sin2) + (((11.0f * pow3) * cos22) + (cos3 * 23.0f)));
        float f82 = cos22 * f72;
        float f92 = f72 * sin2;
        float f102 = f62 * 460.0f;
        float f112 = ((288.0f * f92) + ((451.0f * f82) + f102)) / 1403.0f;
        float f122 = ((f102 - (891.0f * f82)) - (261.0f * f92)) / 1403.0f;
        float f132 = ((f102 - (f82 * 220.0f)) - (f92 * 6300.0f)) / 1403.0f;
        float f142 = 100.0f / f52;
        float signum4 = Math.signum(f112) * f142 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f112) * 27.13d) / (400.0d - Math.abs(f112))), 2.380952380952381d));
        float signum22 = Math.signum(f122) * f142 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f122) * 27.13d) / (400.0d - Math.abs(f122))), 2.380952380952381d));
        float signum32 = Math.signum(f132) * f142 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f132) * 27.13d) / (400.0d - Math.abs(f132))), 2.380952380952381d));
        float[] fArr22 = gc7Var.g;
        float f152 = signum4 / fArr22[0];
        float f162 = signum22 / fArr22[1];
        float f172 = signum32 / fArr22[2];
        float[][] fArr32 = w81.h;
        float[] fArr42 = fArr32[0];
        float f182 = (fArr42[2] * f172) + (fArr42[1] * f162) + (fArr42[0] * f152);
        float[] fArr52 = fArr32[1];
        float f192 = fArr52[1] * f162;
        float f202 = fArr52[2] * f172;
        float f212 = f152 * fArr32[2][0];
        return gr0.a(f182, f202 + f192 + (fArr52[0] * f152), (f172 * fArr[2]) + (f162 * fArr[1]) + f212);
    }
}
