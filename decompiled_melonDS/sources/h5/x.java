package h5;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x implements Comparable {

    /* renamed from: l0  reason: collision with root package name */
    public static final String[] f6261l0 = {"position", "x", "y", "width", "height", "pathRotate"};
    public d5.e A;
    public float L;
    public float R;
    public float X;
    public float Y;
    public float Z;

    /* renamed from: b0  reason: collision with root package name */
    public float f6262b0;
    public int B = 0;

    /* renamed from: c0  reason: collision with root package name */
    public float f6263c0 = Float.NaN;

    /* renamed from: d0  reason: collision with root package name */
    public int f6264d0 = -1;

    /* renamed from: e0  reason: collision with root package name */
    public int f6265e0 = -1;

    /* renamed from: f0  reason: collision with root package name */
    public float f6266f0 = Float.NaN;

    /* renamed from: g0  reason: collision with root package name */
    public p f6267g0 = null;

    /* renamed from: h0  reason: collision with root package name */
    public LinkedHashMap f6268h0 = new LinkedHashMap();

    /* renamed from: i0  reason: collision with root package name */
    public int f6269i0 = 0;

    /* renamed from: j0  reason: collision with root package name */
    public double[] f6270j0 = new double[18];

    /* renamed from: k0  reason: collision with root package name */
    public double[] f6271k0 = new double[18];

    public static boolean b(float f8, float f10) {
        if (!Float.isNaN(f8) && !Float.isNaN(f10)) {
            if (Math.abs(f8 - f10) > 1.0E-6f) {
                return true;
            }
            return false;
        } else if (Float.isNaN(f8) != Float.isNaN(f10)) {
            return true;
        } else {
            return false;
        }
    }

    public static void e(float f8, float f10, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f15 = (float) dArr[i2];
            double d4 = dArr2[i2];
            int i10 = iArr[i2];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            f14 = f15;
                        }
                    } else {
                        f12 = f15;
                    }
                } else {
                    f13 = f15;
                }
            } else {
                f11 = f15;
            }
        }
        float f16 = f11 - ((0.0f * f12) / 2.0f);
        float f17 = f13 - ((0.0f * f14) / 2.0f);
        fArr[0] = (((f12 * 1.0f) + f16) * f8) + ((1.0f - f8) * f16) + 0.0f;
        fArr[1] = (((f14 * 1.0f) + f17) * f10) + ((1.0f - f10) * f17) + 0.0f;
    }

    public final void a(i5.l lVar) {
        int ordinal;
        this.A = d5.e.d(lVar.f6905d.f6955d);
        i5.n nVar = lVar.f6905d;
        this.f6264d0 = nVar.f6956e;
        this.f6265e0 = nVar.f6953b;
        this.f6263c0 = nVar.f6959h;
        this.B = nVar.f6957f;
        this.f6266f0 = lVar.f6906e.C;
        for (String str : lVar.f6908g.keySet()) {
            i5.b bVar = (i5.b) lVar.f6908g.get(str);
            if (bVar != null && (ordinal = bVar.f6816c.ordinal()) != 4 && ordinal != 5 && ordinal != 7) {
                this.f6268h0.put(str, bVar);
            }
        }
    }

    public final void c(double d4, int[] iArr, double[] dArr, float[] fArr, int i2) {
        float f8 = this.X;
        float f10 = this.Y;
        float f11 = this.Z;
        float f12 = this.f6262b0;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f13 = (float) dArr[i10];
            int i11 = iArr[i10];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            f12 = f13;
                        }
                    } else {
                        f11 = f13;
                    }
                } else {
                    f10 = f13;
                }
            } else {
                f8 = f13;
            }
        }
        p pVar = this.f6267g0;
        if (pVar != null) {
            float[] fArr2 = new float[2];
            pVar.b(d4, fArr2, new float[2]);
            float f14 = fArr2[0];
            float f15 = fArr2[1];
            double d10 = f14;
            double d11 = f8;
            double d12 = f10;
            f8 = (float) (((Math.sin(d12) * d11) + d10) - (f11 / 2.0f));
            f10 = (float) ((f15 - (Math.cos(d12) * d11)) - (f12 / 2.0f));
        }
        fArr[i2] = (f11 / 2.0f) + f8 + 0.0f;
        fArr[i2 + 1] = (f12 / 2.0f) + f10 + 0.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.R, ((x) obj).R);
    }

    public final void d(float f8, float f10, float f11, float f12) {
        this.X = f8;
        this.Y = f10;
        this.Z = f11;
        this.f6262b0 = f12;
    }

    public final void f(p pVar, x xVar) {
        double d4 = (((this.Z / 2.0f) + this.X) - xVar.X) - (xVar.Z / 2.0f);
        double d10 = (((this.f6262b0 / 2.0f) + this.Y) - xVar.Y) - (xVar.f6262b0 / 2.0f);
        this.f6267g0 = pVar;
        this.X = (float) Math.hypot(d10, d4);
        if (Float.isNaN(this.f6266f0)) {
            this.Y = (float) (Math.atan2(d10, d4) + 1.5707963267948966d);
        } else {
            this.Y = (float) Math.toRadians(this.f6266f0);
        }
    }
}
