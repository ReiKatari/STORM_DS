package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v71  reason: default package */
/* loaded from: classes.dex */
public final class v71 implements hr1 {
    public final float A;
    public final float B;
    public final float L;
    public final float R;

    public v71(float f, float f2) {
        this.A = f;
        this.B = f2;
        if (Float.isNaN(f) || Float.isNaN(RecyclerView.B1) || Float.isNaN(f2) || Float.isNaN(1.0f)) {
            t05.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", 0.0, " + f2 + ", 1.0.");
        }
        float[] fArr = new float[5];
        double d = -Math.sqrt(9.0d);
        int X = f04.X((float) ((-(d + 3.0d)) / (-6.0d)), fArr, 0);
        int X2 = f04.X((float) ((d - 3.0d) / (-6.0d)), fArr, X) + X;
        if (X2 > 1) {
            float f3 = fArr[0];
            float f4 = fArr[1];
            if (f3 > f4) {
                fArr[0] = f4;
                fArr[1] = f3;
            } else if (f3 == f4) {
                X2--;
            }
        }
        int X3 = f04.X(0.5f, fArr, X2) + X2;
        float min = Math.min((float) RecyclerView.B1, 1.0f);
        float max = Math.max((float) RecyclerView.B1, 1.0f);
        for (int i = 0; i < X3; i++) {
            float f5 = fArr[i];
            float f6 = ((((((-2.0f) * f5) + 3.0f) * f5) + RecyclerView.B1) * f5) + RecyclerView.B1;
            min = Math.min(min, f6);
            max = Math.max(max, f6);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
        this.L = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        this.R = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01fd, code lost:
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x022b, code lost:
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00df, code lost:
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b5, code lost:
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x024f  */
    @Override // defpackage.hr1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float b(float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        if (f <= RecyclerView.B1 || f >= 1.0f) {
            return f;
        }
        float max = Math.max(f, 1.1920929E-7f);
        float f7 = RecyclerView.B1 - max;
        float f8 = this.A;
        float f9 = this.B;
        float f10 = f9 - max;
        double d = f7;
        double d2 = ((d - ((f8 - max) * 2.0d)) + f10) * 3.0d;
        double d3 = (f2 - f7) * 3.0d;
        double d4 = ((f2 - f10) * 3.0d) + (-f7) + (1.0f - max);
        float f11 = Float.NaN;
        if (Math.abs(d4 - 0.0d) < 1.0E-7d) {
            if (Math.abs(d2 - 0.0d) < 1.0E-7d) {
                if (Math.abs(d3 - 0.0d) >= 1.0E-7d) {
                    float f12 = (float) ((-d) / d3);
                    if (f12 < RecyclerView.B1) {
                        f3 = 0.0f;
                    } else {
                        f3 = f12;
                    }
                    if (f3 > 1.0f) {
                        f3 = 1.0f;
                    }
                }
                if (Float.isNaN(f11)) {
                    float f13 = (((((-0.6666666f) * f11) + 1.0f) * f11) + RecyclerView.B1) * 3.0f * f11;
                    float f14 = this.L;
                    if (f13 < f14) {
                        f13 = f14;
                    }
                    float f15 = this.R;
                    if (f13 > f15) {
                        return f15;
                    }
                    return f13;
                }
                throw new IllegalArgumentException("The cubic curve with parameters (" + f8 + ", 0.0, " + f9 + ", 1.0) has no solution at " + f);
            }
            double sqrt = Math.sqrt((d3 * d3) - ((4.0d * d2) * d));
            double d5 = d2 * 2.0d;
            float f16 = (float) ((sqrt - d3) / d5);
            if (f16 < RecyclerView.B1) {
                f6 = 0.0f;
            } else {
                f6 = f16;
            }
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            if (Math.abs(f6 - f16) > 1.05E-6f) {
                f6 = Float.NaN;
            }
            if (!Float.isNaN(f6)) {
                f11 = f6;
            } else {
                float f17 = (float) (((-d3) - sqrt) / d5);
                if (f17 < RecyclerView.B1) {
                    f3 = 0.0f;
                } else {
                    f3 = f17;
                }
                if (f3 > 1.0f) {
                    f3 = 1.0f;
                }
            }
            if (Float.isNaN(f11)) {
            }
        } else {
            double d6 = d2 / d4;
            double d7 = d3 / d4;
            double d8 = d / d4;
            double d9 = ((d7 * 3.0d) - (d6 * d6)) / 9.0d;
            double d10 = ((d8 * 27.0d) + ((((2.0d * d6) * d6) * d6) - ((9.0d * d6) * d7))) / 54.0d;
            double d11 = d9 * d9 * d9;
            double d12 = (d10 * d10) + d11;
            double d13 = d6 / 3.0d;
            int i = (d12 > 0.0d ? 1 : (d12 == 0.0d ? 0 : -1));
            if (i < 0) {
                double sqrt2 = Math.sqrt(-d11);
                double d14 = (-d10) / sqrt2;
                if (d14 < -1.0d) {
                    d14 = -1.0d;
                }
                if (d14 > 1.0d) {
                    d14 = 1.0d;
                }
                double acos = Math.acos(d14);
                double w = oi2.w((float) sqrt2) * 2.0f;
                float cos = (float) ((Math.cos(acos / 3.0d) * w) - d13);
                if (cos < RecyclerView.B1) {
                    f5 = 0.0f;
                } else {
                    f5 = cos;
                }
                if (f5 > 1.0f) {
                    f5 = 1.0f;
                }
                if (Math.abs(f5 - cos) > 1.05E-6f) {
                    f5 = Float.NaN;
                }
                if (Float.isNaN(f5)) {
                    float cos2 = (float) ((Math.cos((6.283185307179586d + acos) / 3.0d) * w) - d13);
                    if (cos2 < RecyclerView.B1) {
                        f5 = 0.0f;
                    } else {
                        f5 = cos2;
                    }
                    if (f5 > 1.0f) {
                        f5 = 1.0f;
                    }
                    if (Math.abs(f5 - cos2) > 1.05E-6f) {
                        f5 = Float.NaN;
                    }
                    if (Float.isNaN(f5)) {
                        float cos3 = (float) ((Math.cos((acos + 12.566370614359172d) / 3.0d) * w) - d13);
                        if (cos3 < RecyclerView.B1) {
                            f3 = 0.0f;
                        } else {
                            f3 = cos3;
                        }
                        if (f3 > 1.0f) {
                            f3 = 1.0f;
                        }
                    }
                }
                f11 = f5;
                if (Float.isNaN(f11)) {
                }
            } else if (i == 0) {
                float f18 = -oi2.w((float) d10);
                float f19 = (float) d13;
                float f20 = (2.0f * f18) - f19;
                if (f20 < RecyclerView.B1) {
                    f4 = 0.0f;
                } else {
                    f4 = f20;
                }
                if (f4 > 1.0f) {
                    f4 = 1.0f;
                }
                if (Math.abs(f4 - f20) > 1.05E-6f) {
                    f4 = Float.NaN;
                }
                if (!Float.isNaN(f4)) {
                    f11 = f4;
                } else {
                    float f21 = (-f18) - f19;
                    if (f21 < RecyclerView.B1) {
                        f3 = 0.0f;
                    } else {
                        f3 = f21;
                    }
                    if (f3 > 1.0f) {
                        f3 = 1.0f;
                    }
                }
                if (Float.isNaN(f11)) {
                }
            } else {
                double sqrt3 = Math.sqrt(d12);
                float w2 = (float) ((oi2.w((float) ((-d10) + sqrt3)) - oi2.w((float) (d10 + sqrt3))) - d13);
                if (w2 < RecyclerView.B1) {
                    f3 = 0.0f;
                } else {
                    f3 = w2;
                }
                if (f3 > 1.0f) {
                    f3 = 1.0f;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v71) {
            v71 v71Var = (v71) obj;
            if (this.A == v71Var.A && this.B == v71Var.B) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + xg6.a(this.B, xg6.a(RecyclerView.B1, Float.hashCode(this.A) * 31, 31), 31);
    }

    public final String toString() {
        return "CubicBezierEasing(a=" + this.A + ", b=0.0, c=" + this.B + ", d=1.0)";
    }
}
