package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gc7  reason: default package */
/* loaded from: classes.dex */
public final class gc7 {
    public static final gc7 k;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float[] g;
    public final float h;
    public final float i;
    public final float j;

    static {
        float[] fArr = w81.i;
        float J = (float) ((w81.J() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = w81.g;
        float f = fArr[0];
        float[] fArr3 = fArr2[0];
        float f2 = fArr[1];
        float f3 = fArr3[1] * f2;
        float f4 = fArr[2];
        float f5 = (fArr3[2] * f4) + f3 + (fArr3[0] * f);
        float[] fArr4 = fArr2[1];
        float f6 = (fArr4[2] * f4) + (fArr4[1] * f2) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f7 = (f4 * fArr5[2]) + (f2 * fArr5[1]) + (f * fArr5[0]);
        float exp = (1.0f - (((float) Math.exp(((-J) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = RecyclerView.A1;
        }
        float[] fArr6 = {(((100.0f / f5) * exp) + 1.0f) - exp, (((100.0f / f6) * exp) + 1.0f) - exp, (((100.0f / f7) * exp) + 1.0f) - exp};
        float f8 = 1.0f / ((5.0f * J) + 1.0f);
        float f9 = f8 * f8 * f8 * f8;
        float f10 = 1.0f - f9;
        float cbrt = (0.1f * f10 * f10 * ((float) Math.cbrt(J * 5.0d))) + (f9 * J);
        float J2 = w81.J() / fArr[1];
        double d2 = J2;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f5) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f6) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f7) / 100.0d, 0.42d)};
        float f11 = fArr7[0];
        float f12 = (f11 * 400.0f) / (f11 + 27.13f);
        float f13 = fArr7[1];
        float f14 = (f13 * 400.0f) / (f13 + 27.13f);
        float f15 = fArr7[2];
        float[] fArr8 = {f12, f14, (400.0f * f15) / (f15 + 27.13f)};
        k = new gc7(J2, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * pow, pow, pow, 0.69f, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public gc7(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f = f;
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
        this.e = f6;
        this.g = fArr;
        this.h = f7;
        this.i = f8;
        this.j = f9;
    }
}
