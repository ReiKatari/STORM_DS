package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y74  reason: default package */
/* loaded from: classes.dex */
public final class y74 implements Comparable {
    public static final String[] n0 = {"position", "x", "y", "width", "height", "pathRotate"};
    public gr1 A;
    public float L;
    public float R;
    public float X;
    public float Y;
    public float Z;
    public float d0;
    public int B = 0;
    public float e0 = Float.NaN;
    public int f0 = -1;
    public int g0 = -1;
    public float h0 = Float.NaN;
    public m74 i0 = null;
    public LinkedHashMap j0 = new LinkedHashMap();
    public int k0 = 0;
    public double[] l0 = new double[18];
    public double[] m0 = new double[18];

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
        float f8 = f3 - ((RecyclerView.B1 * f4) / 2.0f);
        float f9 = f5 - ((RecyclerView.B1 * f6) / 2.0f);
        fArr[0] = (((f4 * 1.0f) + f8) * f) + ((1.0f - f) * f8) + RecyclerView.B1;
        fArr[1] = (((f6 * 1.0f) + f9) * f2) + ((1.0f - f2) * f9) + RecyclerView.B1;
    }

    public final void a(u11 u11Var) {
        int ordinal;
        this.A = gr1.c(u11Var.d.d);
        w11 w11Var = u11Var.d;
        this.f0 = w11Var.e;
        this.g0 = w11Var.b;
        this.e0 = w11Var.h;
        this.B = w11Var.f;
        this.h0 = u11Var.e.C;
        for (String str : u11Var.g.keySet()) {
            j11 j11Var = (j11) u11Var.g.get(str);
            if (j11Var != null && (ordinal = j11Var.c.ordinal()) != 4 && ordinal != 5 && ordinal != 7) {
                this.j0.put(str, j11Var);
            }
        }
    }

    public final void c(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.X;
        float f2 = this.Y;
        float f3 = this.Z;
        float f4 = this.d0;
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
        m74 m74Var = this.i0;
        if (m74Var != null) {
            float[] fArr2 = new float[2];
            m74Var.b(d, fArr2, new float[2]);
            float f6 = fArr2[0];
            float f7 = fArr2[1];
            double d2 = f;
            double d3 = f2;
            double sin = Math.sin(d3) * d2;
            f2 = (float) ((f7 - (Math.cos(d3) * d2)) - (f4 / 2.0f));
            f = (float) ((sin + f6) - (f3 / 2.0f));
        }
        fArr[i] = (f3 / 2.0f) + f + RecyclerView.B1;
        fArr[i + 1] = (f4 / 2.0f) + f2 + RecyclerView.B1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.R, ((y74) obj).R);
    }

    public final void d(float f, float f2, float f3, float f4) {
        this.X = f;
        this.Y = f2;
        this.Z = f3;
        this.d0 = f4;
    }

    public final void f(m74 m74Var, y74 y74Var) {
        double d = (((this.Z / 2.0f) + this.X) - y74Var.X) - (y74Var.Z / 2.0f);
        double d2 = (((this.d0 / 2.0f) + this.Y) - y74Var.Y) - (y74Var.d0 / 2.0f);
        this.i0 = m74Var;
        this.X = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.h0)) {
            this.Y = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.Y = (float) Math.toRadians(this.h0);
        }
    }
}
