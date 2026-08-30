package d1;

import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final float f3624a;

    /* renamed from: b  reason: collision with root package name */
    public final float f3625b;

    /* renamed from: c  reason: collision with root package name */
    public final float f3626c;

    /* renamed from: d  reason: collision with root package name */
    public final float f3627d;

    /* renamed from: e  reason: collision with root package name */
    public final float f3628e;

    /* renamed from: f  reason: collision with root package name */
    public final float f3629f;

    /* renamed from: g  reason: collision with root package name */
    public final float f3630g;

    /* renamed from: h  reason: collision with root package name */
    public float f3631h;

    /* renamed from: i  reason: collision with root package name */
    public float f3632i;

    /* renamed from: j  reason: collision with root package name */
    public final float[] f3633j;

    /* renamed from: k  reason: collision with root package name */
    public final float f3634k;

    /* renamed from: l  reason: collision with root package name */
    public final float f3635l;
    public final float m;

    /* renamed from: n  reason: collision with root package name */
    public final float f3636n;

    /* renamed from: o  reason: collision with root package name */
    public final float f3637o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f3638p;

    /* renamed from: q  reason: collision with root package name */
    public final float f3639q;

    /* renamed from: r  reason: collision with root package name */
    public final float f3640r;

    public q(int i2, float f8, float f10, float f11, float f12, float f13, float f14) {
        boolean z10;
        float f15;
        boolean z11;
        boolean z12;
        float f16;
        float f17;
        int i10;
        float f18;
        float f19;
        this.f3624a = f8;
        this.f3625b = f10;
        this.f3626c = f11;
        this.f3627d = f12;
        this.f3628e = f13;
        this.f3629f = f14;
        float f20 = f13 - f11;
        float f21 = f14 - f12;
        float f22 = 0.0f;
        int i11 = 1;
        if (i2 != 1 && (i2 == 4 ? f21 <= 0.0f : i2 != 5 || f21 >= 0.0f)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            f15 = -1.0f;
        } else {
            f15 = 1.0f;
        }
        this.m = f15;
        float f23 = 1 / (f10 - f8);
        this.f3634k = f23;
        float[] fArr = new float[101];
        this.f3633j = fArr;
        if (i2 == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && Math.abs(f20) >= 0.001f && Math.abs(f21) >= 0.001f) {
            this.f3636n = f20 * f15;
            this.f3637o = f21 * (-f15);
            if (z10) {
                f16 = f13;
            } else {
                f16 = f11;
            }
            this.f3639q = f16;
            if (z10) {
                f17 = f12;
            } else {
                f17 = f14;
            }
            this.f3640r = f17;
            float f24 = f13 - f11;
            float f25 = f12 - f14;
            float[] fArr2 = d.f3544i;
            int i12 = 90;
            float f26 = 90;
            float f27 = f25;
            float f28 = 0.0f;
            float f29 = 0.0f;
            int i13 = 1;
            while (true) {
                i10 = i11;
                f18 = f22;
                double radians = (float) Math.toRadians((i13 * 90.0d) / i12);
                float sin = ((float) Math.sin(radians)) * f24;
                float cos = ((float) Math.cos(radians)) * f25;
                f19 = f26;
                f28 += (float) Math.hypot(sin - f29, cos - f27);
                fArr2[i13] = f28;
                i12 = 90;
                if (i13 == 90) {
                    break;
                }
                i13++;
                f27 = cos;
                f26 = f19;
                f22 = f18;
                f29 = sin;
                i11 = i10;
            }
            this.f3630g = f28;
            int i14 = i10;
            while (true) {
                fArr2[i14] = fArr2[i14] / f28;
                if (i14 == 90) {
                    break;
                }
                i14++;
            }
            int length = fArr.length;
            for (int i15 = 0; i15 < length; i15++) {
                float f30 = i15 / 100.0f;
                int binarySearch = Arrays.binarySearch(fArr2, 0, 91, f30);
                if (binarySearch >= 0) {
                    fArr[i15] = binarySearch / f19;
                } else if (binarySearch == -1) {
                    fArr[i15] = f18;
                } else {
                    int i16 = -binarySearch;
                    int i17 = i16 - 2;
                    float f31 = i17;
                    float f32 = fArr2[i17];
                    fArr[i15] = (((f30 - f32) / (fArr2[i16 - 1] - f32)) + f31) / f19;
                }
            }
            this.f3635l = this.f3630g * this.f3634k;
            z12 = z11;
        } else {
            float hypot = (float) Math.hypot(f21, f20);
            this.f3630g = hypot;
            this.f3635l = hypot * f23;
            this.f3639q = f20 * f23;
            this.f3640r = f21 * f23;
            this.f3636n = Float.NaN;
            this.f3637o = Float.NaN;
            z12 = true;
        }
        this.f3638p = z12;
    }

    public final float a() {
        float f8 = this.f3636n * this.f3632i;
        float f10 = (-this.f3637o) * this.f3631h;
        return f8 * this.m * (this.f3635l / ((float) Math.hypot(f8, f10)));
    }

    public final float b() {
        float f8 = this.f3636n * this.f3632i;
        float f10 = (-this.f3637o) * this.f3631h;
        return f10 * this.m * (this.f3635l / ((float) Math.hypot(f8, f10)));
    }

    public final void c(float f8) {
        float f10;
        if (this.m == -1.0f) {
            f10 = this.f3625b - f8;
        } else {
            f10 = f8 - this.f3624a;
        }
        float f11 = f10 * this.f3634k;
        float f12 = 0.0f;
        if (f11 > 0.0f) {
            f12 = 1.0f;
            if (f11 < 1.0f) {
                float f13 = f11 * 100;
                int i2 = (int) f13;
                float[] fArr = this.f3633j;
                float f14 = fArr[i2];
                f12 = w.d.a(fArr[i2 + 1], f14, f13 - i2, f14);
            }
        }
        double d4 = f12 * 1.5707964f;
        this.f3631h = (float) Math.sin(d4);
        this.f3632i = (float) Math.cos(d4);
    }
}
