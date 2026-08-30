package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wz3  reason: default package */
/* loaded from: classes.dex */
public final class wz3 implements Comparable {
    public static final String[] m0 = {"position", "x", "y", "width", "height", "pathRotate"};
    public an1 A;
    public float L;
    public float R;
    public float X;
    public float Y;
    public float Z;
    public float c0;
    public int B = 0;
    public float d0 = Float.NaN;
    public int e0 = -1;
    public int f0 = -1;
    public float g0 = Float.NaN;
    public lz3 h0 = null;
    public LinkedHashMap i0 = new LinkedHashMap();
    public int j0 = 0;
    public double[] k0 = new double[18];
    public double[] l0 = new double[18];

    public static boolean b(float f, float f2) {
        if (!Float.isNaN(f) && !Float.isNaN(f2)) {
            if (Math.abs(f - f2) > 1.0E-6f) {
                return true;
            }
            return false;
        } else if (Float.isNaN(f) != Float.isNaN(f2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void e(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            f6 = f7;
                        }
                    } else {
                        f4 = f7;
                    }
                } else {
                    f5 = f7;
                }
            } else {
                f3 = f7;
            }
        }
        float f8 = f3 - ((RecyclerView.A1 * f4) / 2.0f);
        float f9 = f5 - ((RecyclerView.A1 * f6) / 2.0f);
        fArr[0] = (((f4 * 1.0f) + f8) * f) + ((1.0f - f) * f8) + RecyclerView.A1;
        fArr[1] = (((f6 * 1.0f) + f9) * f2) + ((1.0f - f2) * f9) + RecyclerView.A1;
    }

    public final void a(py0 py0Var) {
        int ordinal;
        this.A = an1.e(py0Var.d.d);
        ry0 ry0Var = py0Var.d;
        this.e0 = ry0Var.e;
        this.f0 = ry0Var.b;
        this.d0 = ry0Var.h;
        this.B = ry0Var.f;
        this.g0 = py0Var.e.C;
        for (String str : py0Var.g.keySet()) {
            ey0 ey0Var = (ey0) py0Var.g.get(str);
            if (ey0Var != null && (ordinal = ey0Var.c.ordinal()) != 4 && ordinal != 5 && ordinal != 7) {
                this.i0.put(str, ey0Var);
            }
        }
    }

    public final void c(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.X;
        float f2 = this.Y;
        float f3 = this.Z;
        float f4 = this.c0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            f4 = f5;
                        }
                    } else {
                        f3 = f5;
                    }
                } else {
                    f2 = f5;
                }
            } else {
                f = f5;
            }
        }
        lz3 lz3Var = this.h0;
        if (lz3Var != null) {
            float[] fArr2 = new float[2];
            lz3Var.b(d, fArr2, new float[2]);
            float f6 = fArr2[0];
            float f7 = fArr2[1];
            double d2 = f;
            double d3 = f2;
            double sin = Math.sin(d3) * d2;
            f2 = (float) ((f7 - (Math.cos(d3) * d2)) - (f4 / 2.0f));
            f = (float) ((sin + f6) - (f3 / 2.0f));
        }
        fArr[i] = (f3 / 2.0f) + f + RecyclerView.A1;
        fArr[i + 1] = (f4 / 2.0f) + f2 + RecyclerView.A1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.R, ((wz3) obj).R);
    }

    public final void d(float f, float f2, float f3, float f4) {
        this.X = f;
        this.Y = f2;
        this.Z = f3;
        this.c0 = f4;
    }

    public final void f(lz3 lz3Var, wz3 wz3Var) {
        double d = (((this.Z / 2.0f) + this.X) - wz3Var.X) - (wz3Var.Z / 2.0f);
        double d2 = (((this.c0 / 2.0f) + this.Y) - wz3Var.Y) - (wz3Var.c0 / 2.0f);
        this.h0 = lz3Var;
        this.X = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.g0)) {
            this.Y = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.Y = (float) Math.toRadians(this.g0);
        }
    }
}
