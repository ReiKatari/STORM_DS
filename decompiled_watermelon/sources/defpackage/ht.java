package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ht  reason: default package */
/* loaded from: classes.dex */
public final class ht {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public float h;
    public float i;
    public final float[] j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final boolean p;
    public final float q;
    public final float r;

    public ht(int i, float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        float f7;
        boolean z2;
        boolean z3;
        float f8;
        float f9;
        int i2;
        float f10;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        float f11 = f5 - f3;
        float f12 = f6 - f4;
        float f13 = RecyclerView.A1;
        int i3 = 1;
        if (i != 1 && (i == 4 ? f12 <= RecyclerView.A1 : i != 5 || f12 >= RecyclerView.A1)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        this.m = f7;
        float f14 = 1.0f / (f2 - f);
        this.k = f14;
        float[] fArr = new float[101];
        this.j = fArr;
        if (i == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && Math.abs(f11) >= 0.001f && Math.abs(f12) >= 0.001f) {
            this.n = f11 * f7;
            this.o = f12 * (-f7);
            if (z) {
                f8 = f5;
            } else {
                f8 = f3;
            }
            this.q = f8;
            if (z) {
                f9 = f4;
            } else {
                f9 = f6;
            }
            this.r = f9;
            float f15 = f5 - f3;
            float f16 = f4 - f6;
            float[] fArr2 = f34.a;
            float f17 = f16;
            float f18 = 0.0f;
            float f19 = 0.0f;
            int i4 = 1;
            while (true) {
                double d = (float) (((i4 * 90.0d) / 90.0d) * 0.017453292519943295d);
                i2 = i3;
                float sin = ((float) Math.sin(d)) * f15;
                float cos = ((float) Math.cos(d)) * f16;
                f10 = f13;
                f18 += (float) Math.hypot(sin - f19, cos - f17);
                fArr2[i4] = f18;
                if (i4 == 90) {
                    break;
                }
                i4++;
                f19 = sin;
                f17 = cos;
                i3 = i2;
                f13 = f10;
            }
            this.g = f18;
            int i5 = i2;
            while (true) {
                fArr2[i5] = fArr2[i5] / f18;
                if (i5 == 90) {
                    break;
                }
                i5++;
            }
            int length = fArr.length;
            for (int i6 = 0; i6 < length; i6++) {
                float f20 = i6 / 100.0f;
                int binarySearch = Arrays.binarySearch(fArr2, 0, 91, f20);
                if (binarySearch >= 0) {
                    fArr[i6] = binarySearch / 90.0f;
                } else if (binarySearch == -1) {
                    fArr[i6] = f10;
                } else {
                    int i7 = -binarySearch;
                    int i8 = i7 - 2;
                    float f21 = i8;
                    float f22 = fArr2[i8];
                    fArr[i6] = (((f20 - f22) / (fArr2[i7 - i2] - f22)) + f21) / 90.0f;
                }
            }
            this.l = this.g * this.k;
            z3 = z2;
        } else {
            float hypot = (float) Math.hypot(f12, f11);
            this.g = hypot;
            this.l = hypot * f14;
            this.q = f11 * f14;
            this.r = f12 * f14;
            this.n = Float.NaN;
            this.o = Float.NaN;
            z3 = true;
        }
        this.p = z3;
    }

    public final float a() {
        float f = this.n * this.i;
        float f2 = (-this.o) * this.h;
        float f3 = this.l;
        return f * this.m * (f3 / ((float) Math.hypot(f, f2)));
    }

    public final float b() {
        float f = this.n * this.i;
        float f2 = (-this.o) * this.h;
        float hypot = (float) Math.hypot(f, f2);
        return f2 * this.m * (this.l / hypot);
    }

    public final void c(float f) {
        float f2;
        if (this.m == -1.0f) {
            f2 = this.b - f;
        } else {
            f2 = f - this.a;
        }
        float f3 = f2 * this.k;
        float f4 = RecyclerView.A1;
        if (f3 > RecyclerView.A1) {
            f4 = 1.0f;
            if (f3 < 1.0f) {
                float f5 = f3 * 100.0f;
                int i = (int) f5;
                float[] fArr = this.j;
                float f6 = fArr[i];
                f4 = b31.a(fArr[i + 1], f6, f5 - i, f6);
            }
        }
        double d = f4 * 1.5707964f;
        this.h = (float) Math.sin(d);
        this.i = (float) Math.cos(d);
    }
}
