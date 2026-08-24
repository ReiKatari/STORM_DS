package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cq5  reason: default package */
/* loaded from: classes.dex */
public final class cq5 extends nt0 {
    public static final u34 r = new Object();
    public final ys7 d;
    public final float e;
    public final float f;
    public final e97 g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final gm1 k;
    public final bq5 l;
    public final yp5 m;
    public final gm1 n;
    public final bq5 o;
    public final yp5 p;
    public final boolean q;

    /* JADX WARN: Code restructure failed: missing block: B:36:0x01e0, code lost:
        if ((((r25 - r12) * r3) - ((r1 - r15) * r10)) >= androidx.recyclerview.widget.RecyclerView.B1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r44v1 */
    /* JADX WARN: Type inference failed for: r44v2 */
    /* JADX WARN: Type inference failed for: r44v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cq5(String str, float[] fArr, ys7 ys7Var, float[] fArr2, gm1 gm1Var, gm1 gm1Var2, float f, float f2, e97 e97Var, int i) {
        super(str, i, 12884901888L);
        ?? r44;
        float f3;
        float f4;
        boolean z;
        this.d = ys7Var;
        this.e = f;
        this.f = f2;
        this.g = e97Var;
        this.k = gm1Var;
        this.l = new bq5(this, 1);
        this.m = new yp5(this, 0);
        this.n = gm1Var2;
        this.o = new bq5(this, 0);
        this.p = new yp5(this, 1);
        if (fArr.length != 6 && fArr.length != 9) {
            i.h("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        } else if (f < f2) {
            float[] fArr3 = new float[6];
            if (fArr.length == 9) {
                float f5 = fArr[0];
                float f6 = fArr[1];
                float f7 = f5 + f6 + fArr[2];
                fArr3[0] = f5 / f7;
                fArr3[1] = f6 / f7;
                float f8 = fArr[3];
                float f9 = fArr[4];
                float f10 = f8 + f9 + fArr[5];
                fArr3[2] = f8 / f10;
                fArr3[3] = f9 / f10;
                float f11 = fArr[6];
                float f12 = fArr[7];
                float f13 = f11 + f12 + fArr[8];
                fArr3[4] = f11 / f13;
                fArr3[5] = f12 / f13;
            } else {
                System.arraycopy(fArr, 0, fArr3, 0, 6);
            }
            this.h = fArr3;
            if (fArr2 == null) {
                float f14 = fArr3[0];
                float f15 = fArr3[1];
                float f16 = fArr3[2];
                float f17 = fArr3[3];
                float f18 = fArr3[4];
                float f19 = fArr3[5];
                f3 = 1.0f;
                float f20 = ys7Var.a;
                r44 = 1;
                float f21 = ys7Var.b;
                float f22 = 1.0f - f14;
                float f23 = f22 / f15;
                float f24 = 1.0f - f16;
                float f25 = 1.0f - f18;
                float f26 = f14 / f15;
                float f27 = (f16 / f17) - f26;
                float f28 = (f20 / f21) - f26;
                float f29 = (f24 / f17) - f23;
                float f30 = (f18 / f19) - f26;
                float f31 = (((((1.0f - f20) / f21) - f23) * f27) - (f28 * f29)) / ((((f25 / f19) - f23) * f27) - (f29 * f30));
                float f32 = (f28 - (f30 * f31)) / f27;
                float f33 = (1.0f - f32) - f31;
                float f34 = f33 / f15;
                float f35 = f32 / f17;
                float f36 = f31 / f19;
                this.i = new float[]{f14 * f34, f33, (f22 - f15) * f34, f16 * f35, f32, (f24 - f17) * f35, f18 * f36, f31, (f25 - f19) * f36};
            } else {
                r44 = 1;
                f3 = 1.0f;
                if (fArr2.length == 9) {
                    this.i = fArr2;
                } else {
                    e41.n(fArr2.length, "Transform must have 9 entries! Has ");
                    throw null;
                }
            }
            this.j = nc1.U(this.i);
            float s = kn2.s(fArr3);
            float[] fArr4 = qt0.a;
            if (s / kn2.s(qt0.b) > 0.9f) {
                float[] fArr5 = qt0.a;
                float f37 = fArr3[0];
                float f38 = fArr5[0];
                float f39 = fArr3[r44];
                float f40 = fArr5[r44];
                float f41 = fArr3[2];
                float f42 = fArr5[2];
                float f43 = fArr3[3];
                float f44 = fArr5[3];
                float f45 = fArr3[4];
                float f46 = fArr5[4];
                float f47 = fArr3[5];
                float f48 = fArr5[5];
                f4 = RecyclerView.B1;
                float[] fArr6 = new float[6];
                fArr6[0] = f37 - f38;
                fArr6[r44] = f39 - f40;
                fArr6[2] = f41 - f42;
                fArr6[3] = f43 - f44;
                fArr6[4] = f45 - f46;
                fArr6[5] = f47 - f48;
                float f49 = fArr6[0];
                float f50 = fArr6[r44];
                if (((f40 - f48) * f49) - ((f38 - f46) * f50) >= RecyclerView.B1 && ((f38 - f42) * f50) - ((f40 - f44) * f49) >= RecyclerView.B1) {
                    float f51 = fArr6[2];
                    float f52 = fArr6[3];
                    if (((f44 - f40) * f51) - ((f42 - f38) * f52) >= RecyclerView.B1 && ((f42 - f46) * f52) - ((f44 - f48) * f51) >= RecyclerView.B1) {
                        float f53 = fArr6[4];
                        float f54 = fArr6[5];
                        if (((f48 - f44) * f53) - ((f46 - f42) * f54) >= RecyclerView.B1) {
                        }
                    }
                }
            } else {
                f4 = RecyclerView.B1;
            }
            int i2 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
            if (i != 0) {
                float[] fArr7 = qt0.a;
                if (fArr3 != fArr7) {
                    for (int i3 = 0; i3 < 6; i3++) {
                        if (Float.compare(fArr3[i3], fArr7[i3]) != 0 && Math.abs(fArr3[i3] - fArr7[i3]) > 0.001f) {
                            break;
                        }
                    }
                }
                if (nc1.H(ys7Var, jw2.t) && f == f4 && f2 == f3) {
                    float[] fArr8 = qt0.a;
                    cq5 cq5Var = qt0.e;
                    for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                        if (Math.abs(gm1Var.c(d) - cq5Var.k.c(d)) <= 0.001d && Math.abs(gm1Var2.c(d) - cq5Var.n.c(d)) <= 0.001d) {
                        }
                    }
                }
                z = false;
                this.q = z;
            }
            z = r44;
            this.q = z;
        } else {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
    }

    @Override // defpackage.nt0
    public final float a(int i) {
        return this.f;
    }

    @Override // defpackage.nt0
    public final float b(int i) {
        return this.e;
    }

    @Override // defpackage.nt0
    public final boolean c() {
        return this.q;
    }

    @Override // defpackage.nt0
    public final long d(float f, float f2, float f3) {
        double d = f;
        yp5 yp5Var = this.p;
        float c = (float) yp5Var.c(d);
        float c2 = (float) yp5Var.c(f2);
        float c3 = (float) yp5Var.c(f3);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f4 = (fArr[6] * c3) + (fArr[3] * c2) + (fArr[0] * c);
        float f5 = fArr[1] * c;
        return (Float.floatToRawIntBits(f4) << 32) | (4294967295L & Float.floatToRawIntBits((fArr[7] * c3) + (fArr[4] * c2) + f5));
    }

    @Override // defpackage.nt0
    public final float e(float f, float f2, float f3) {
        double d = f;
        yp5 yp5Var = this.p;
        float c = (float) yp5Var.c(f2);
        float[] fArr = this.i;
        return (fArr[8] * ((float) yp5Var.c(f3))) + (fArr[5] * c) + (fArr[2] * ((float) yp5Var.c(d)));
    }

    @Override // defpackage.nt0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cq5.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        cq5 cq5Var = (cq5) obj;
        if (Float.compare(cq5Var.e, this.e) != 0 || Float.compare(cq5Var.f, this.f) != 0 || !nb3.k(this.d, cq5Var.d) || !Arrays.equals(this.h, cq5Var.h)) {
            return false;
        }
        e97 e97Var = cq5Var.g;
        e97 e97Var2 = this.g;
        if (e97Var2 != null) {
            return nb3.k(e97Var2, e97Var);
        }
        if (e97Var == null) {
            return true;
        }
        if (!nb3.k(this.k, cq5Var.k)) {
            return false;
        }
        return nb3.k(this.n, cq5Var.n);
    }

    @Override // defpackage.nt0
    public final long f(float f, float f2, float f3, float f4, nt0 nt0Var) {
        float[] fArr = this.j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = fArr[2] * f;
        float f8 = (fArr[8] * f3) + (fArr[5] * f2) + f7;
        yp5 yp5Var = this.m;
        return hv.a((float) yp5Var.c(f5), (float) yp5Var.c(f6), (float) yp5Var.c(f8), f4, nt0Var);
    }

    @Override // defpackage.nt0
    public final int hashCode() {
        int floatToIntBits;
        int floatToIntBits2;
        int hashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int i = 0;
        if (f == RecyclerView.B1) {
            floatToIntBits = 0;
        } else {
            floatToIntBits = Float.floatToIntBits(f);
        }
        int i2 = (hashCode + floatToIntBits) * 31;
        float f2 = this.f;
        if (f2 == RecyclerView.B1) {
            floatToIntBits2 = 0;
        } else {
            floatToIntBits2 = Float.floatToIntBits(f2);
        }
        int i3 = (i2 + floatToIntBits2) * 31;
        e97 e97Var = this.g;
        if (e97Var != null) {
            i = e97Var.hashCode();
        }
        int i4 = i3 + i;
        if (e97Var == null) {
            return this.n.hashCode() + ((this.k.hashCode() + (i4 * 31)) * 31);
        }
        return i4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cq5(String str, float[] fArr, ys7 ys7Var, final e97 e97Var, int i) {
        this(str, fArr, ys7Var, null, r4, r0, RecyclerView.B1, 1.0f, e97Var, i);
        double d;
        gm1 gm1Var;
        gm1 gm1Var2;
        double d2 = e97Var.a;
        boolean z = d2 == -3.0d;
        double d3 = e97Var.g;
        double d4 = e97Var.f;
        if (z) {
            d = -3.0d;
            gm1Var = new gm1() { // from class: aq5
                @Override // defpackage.gm1
                public final double c(double d5) {
                    int i2 = r2;
                    e97 e97Var2 = e97Var;
                    switch (i2) {
                        case 0:
                            float[] fArr2 = qt0.a;
                            return qt0.a(e97Var2, d5);
                        case 1:
                            float[] fArr3 = qt0.a;
                            return qt0.c(e97Var2, d5);
                        case 2:
                            double d6 = e97Var2.b;
                            double d7 = e97Var2.c;
                            double d8 = e97Var2.d;
                            double d9 = e97Var2.e;
                            double d10 = e97Var2.a;
                            if (d5 >= d9) {
                                return Math.pow((d6 * d5) + d7, d10);
                            }
                            return d8 * d5;
                        case 3:
                            double d11 = e97Var2.b;
                            double d12 = e97Var2.c;
                            double d13 = e97Var2.d;
                            double d14 = e97Var2.e;
                            double d15 = e97Var2.f;
                            double d16 = e97Var2.g;
                            double d17 = e97Var2.a;
                            if (d5 >= d14) {
                                return Math.pow((d11 * d5) + d12, d17) + d15;
                            }
                            return (d13 * d5) + d16;
                        case 4:
                            float[] fArr4 = qt0.a;
                            return qt0.b(e97Var2, d5);
                        case 5:
                            float[] fArr5 = qt0.a;
                            return qt0.d(e97Var2, d5);
                        case 6:
                            double d18 = e97Var2.b;
                            double d19 = e97Var2.c;
                            double d20 = e97Var2.d;
                            double d21 = e97Var2.e;
                            double d22 = e97Var2.a;
                            if (d5 >= d21 * d20) {
                                return (Math.pow(d5, 1.0d / d22) - d19) / d18;
                            }
                            return d5 / d20;
                        default:
                            double d23 = e97Var2.b;
                            double d24 = e97Var2.c;
                            double d25 = e97Var2.d;
                            double d26 = e97Var2.e;
                            double d27 = e97Var2.f;
                            double d28 = e97Var2.g;
                            double d29 = e97Var2.a;
                            if (d5 >= d26 * d25) {
                                return (Math.pow(d5 - d27, 1.0d / d29) - d24) / d23;
                            }
                            return (d5 - d28) / d25;
                    }
                }
            };
        } else {
            d = -3.0d;
            if (d2 == -2.0d) {
                gm1Var = new gm1() { // from class: aq5
                    @Override // defpackage.gm1
                    public final double c(double d5) {
                        int i2 = r2;
                        e97 e97Var2 = e97Var;
                        switch (i2) {
                            case 0:
                                float[] fArr2 = qt0.a;
                                return qt0.a(e97Var2, d5);
                            case 1:
                                float[] fArr3 = qt0.a;
                                return qt0.c(e97Var2, d5);
                            case 2:
                                double d6 = e97Var2.b;
                                double d7 = e97Var2.c;
                                double d8 = e97Var2.d;
                                double d9 = e97Var2.e;
                                double d10 = e97Var2.a;
                                if (d5 >= d9) {
                                    return Math.pow((d6 * d5) + d7, d10);
                                }
                                return d8 * d5;
                            case 3:
                                double d11 = e97Var2.b;
                                double d12 = e97Var2.c;
                                double d13 = e97Var2.d;
                                double d14 = e97Var2.e;
                                double d15 = e97Var2.f;
                                double d16 = e97Var2.g;
                                double d17 = e97Var2.a;
                                if (d5 >= d14) {
                                    return Math.pow((d11 * d5) + d12, d17) + d15;
                                }
                                return (d13 * d5) + d16;
                            case 4:
                                float[] fArr4 = qt0.a;
                                return qt0.b(e97Var2, d5);
                            case 5:
                                float[] fArr5 = qt0.a;
                                return qt0.d(e97Var2, d5);
                            case 6:
                                double d18 = e97Var2.b;
                                double d19 = e97Var2.c;
                                double d20 = e97Var2.d;
                                double d21 = e97Var2.e;
                                double d22 = e97Var2.a;
                                if (d5 >= d21 * d20) {
                                    return (Math.pow(d5, 1.0d / d22) - d19) / d18;
                                }
                                return d5 / d20;
                            default:
                                double d23 = e97Var2.b;
                                double d24 = e97Var2.c;
                                double d25 = e97Var2.d;
                                double d26 = e97Var2.e;
                                double d27 = e97Var2.f;
                                double d28 = e97Var2.g;
                                double d29 = e97Var2.a;
                                if (d5 >= d26 * d25) {
                                    return (Math.pow(d5 - d27, 1.0d / d29) - d24) / d23;
                                }
                                return (d5 - d28) / d25;
                        }
                    }
                };
            } else if (d4 == 0.0d && d3 == 0.0d) {
                gm1Var = new gm1() { // from class: aq5
                    @Override // defpackage.gm1
                    public final double c(double d5) {
                        int i2 = r2;
                        e97 e97Var2 = e97Var;
                        switch (i2) {
                            case 0:
                                float[] fArr2 = qt0.a;
                                return qt0.a(e97Var2, d5);
                            case 1:
                                float[] fArr3 = qt0.a;
                                return qt0.c(e97Var2, d5);
                            case 2:
                                double d6 = e97Var2.b;
                                double d7 = e97Var2.c;
                                double d8 = e97Var2.d;
                                double d9 = e97Var2.e;
                                double d10 = e97Var2.a;
                                if (d5 >= d9) {
                                    return Math.pow((d6 * d5) + d7, d10);
                                }
                                return d8 * d5;
                            case 3:
                                double d11 = e97Var2.b;
                                double d12 = e97Var2.c;
                                double d13 = e97Var2.d;
                                double d14 = e97Var2.e;
                                double d15 = e97Var2.f;
                                double d16 = e97Var2.g;
                                double d17 = e97Var2.a;
                                if (d5 >= d14) {
                                    return Math.pow((d11 * d5) + d12, d17) + d15;
                                }
                                return (d13 * d5) + d16;
                            case 4:
                                float[] fArr4 = qt0.a;
                                return qt0.b(e97Var2, d5);
                            case 5:
                                float[] fArr5 = qt0.a;
                                return qt0.d(e97Var2, d5);
                            case 6:
                                double d18 = e97Var2.b;
                                double d19 = e97Var2.c;
                                double d20 = e97Var2.d;
                                double d21 = e97Var2.e;
                                double d22 = e97Var2.a;
                                if (d5 >= d21 * d20) {
                                    return (Math.pow(d5, 1.0d / d22) - d19) / d18;
                                }
                                return d5 / d20;
                            default:
                                double d23 = e97Var2.b;
                                double d24 = e97Var2.c;
                                double d25 = e97Var2.d;
                                double d26 = e97Var2.e;
                                double d27 = e97Var2.f;
                                double d28 = e97Var2.g;
                                double d29 = e97Var2.a;
                                if (d5 >= d26 * d25) {
                                    return (Math.pow(d5 - d27, 1.0d / d29) - d24) / d23;
                                }
                                return (d5 - d28) / d25;
                        }
                    }
                };
            } else {
                gm1Var = new gm1() { // from class: aq5
                    @Override // defpackage.gm1
                    public final double c(double d5) {
                        int i2 = r2;
                        e97 e97Var2 = e97Var;
                        switch (i2) {
                            case 0:
                                float[] fArr2 = qt0.a;
                                return qt0.a(e97Var2, d5);
                            case 1:
                                float[] fArr3 = qt0.a;
                                return qt0.c(e97Var2, d5);
                            case 2:
                                double d6 = e97Var2.b;
                                double d7 = e97Var2.c;
                                double d8 = e97Var2.d;
                                double d9 = e97Var2.e;
                                double d10 = e97Var2.a;
                                if (d5 >= d9) {
                                    return Math.pow((d6 * d5) + d7, d10);
                                }
                                return d8 * d5;
                            case 3:
                                double d11 = e97Var2.b;
                                double d12 = e97Var2.c;
                                double d13 = e97Var2.d;
                                double d14 = e97Var2.e;
                                double d15 = e97Var2.f;
                                double d16 = e97Var2.g;
                                double d17 = e97Var2.a;
                                if (d5 >= d14) {
                                    return Math.pow((d11 * d5) + d12, d17) + d15;
                                }
                                return (d13 * d5) + d16;
                            case 4:
                                float[] fArr4 = qt0.a;
                                return qt0.b(e97Var2, d5);
                            case 5:
                                float[] fArr5 = qt0.a;
                                return qt0.d(e97Var2, d5);
                            case 6:
                                double d18 = e97Var2.b;
                                double d19 = e97Var2.c;
                                double d20 = e97Var2.d;
                                double d21 = e97Var2.e;
                                double d22 = e97Var2.a;
                                if (d5 >= d21 * d20) {
                                    return (Math.pow(d5, 1.0d / d22) - d19) / d18;
                                }
                                return d5 / d20;
                            default:
                                double d23 = e97Var2.b;
                                double d24 = e97Var2.c;
                                double d25 = e97Var2.d;
                                double d26 = e97Var2.e;
                                double d27 = e97Var2.f;
                                double d28 = e97Var2.g;
                                double d29 = e97Var2.a;
                                if (d5 >= d26 * d25) {
                                    return (Math.pow(d5 - d27, 1.0d / d29) - d24) / d23;
                                }
                                return (d5 - d28) / d25;
                        }
                    }
                };
            }
        }
        if (d2 == d) {
            gm1Var2 = new gm1() { // from class: aq5
                @Override // defpackage.gm1
                public final double c(double d5) {
                    int i2 = r2;
                    e97 e97Var2 = e97Var;
                    switch (i2) {
                        case 0:
                            float[] fArr2 = qt0.a;
                            return qt0.a(e97Var2, d5);
                        case 1:
                            float[] fArr3 = qt0.a;
                            return qt0.c(e97Var2, d5);
                        case 2:
                            double d6 = e97Var2.b;
                            double d7 = e97Var2.c;
                            double d8 = e97Var2.d;
                            double d9 = e97Var2.e;
                            double d10 = e97Var2.a;
                            if (d5 >= d9) {
                                return Math.pow((d6 * d5) + d7, d10);
                            }
                            return d8 * d5;
                        case 3:
                            double d11 = e97Var2.b;
                            double d12 = e97Var2.c;
                            double d13 = e97Var2.d;
                            double d14 = e97Var2.e;
                            double d15 = e97Var2.f;
                            double d16 = e97Var2.g;
                            double d17 = e97Var2.a;
                            if (d5 >= d14) {
                                return Math.pow((d11 * d5) + d12, d17) + d15;
                            }
                            return (d13 * d5) + d16;
                        case 4:
                            float[] fArr4 = qt0.a;
                            return qt0.b(e97Var2, d5);
                        case 5:
                            float[] fArr5 = qt0.a;
                            return qt0.d(e97Var2, d5);
                        case 6:
                            double d18 = e97Var2.b;
                            double d19 = e97Var2.c;
                            double d20 = e97Var2.d;
                            double d21 = e97Var2.e;
                            double d22 = e97Var2.a;
                            if (d5 >= d21 * d20) {
                                return (Math.pow(d5, 1.0d / d22) - d19) / d18;
                            }
                            return d5 / d20;
                        default:
                            double d23 = e97Var2.b;
                            double d24 = e97Var2.c;
                            double d25 = e97Var2.d;
                            double d26 = e97Var2.e;
                            double d27 = e97Var2.f;
                            double d28 = e97Var2.g;
                            double d29 = e97Var2.a;
                            if (d5 >= d26 * d25) {
                                return (Math.pow(d5 - d27, 1.0d / d29) - d24) / d23;
                            }
                            return (d5 - d28) / d25;
                    }
                }
            };
        } else if (d2 == -2.0d) {
            gm1Var2 = new gm1() { // from class: aq5
                @Override // defpackage.gm1
                public final double c(double d5) {
                    int i2 = r2;
                    e97 e97Var2 = e97Var;
                    switch (i2) {
                        case 0:
                            float[] fArr2 = qt0.a;
                            return qt0.a(e97Var2, d5);
                        case 1:
                            float[] fArr3 = qt0.a;
                            return qt0.c(e97Var2, d5);
                        case 2:
                            double d6 = e97Var2.b;
                            double d7 = e97Var2.c;
                            double d8 = e97Var2.d;
                            double d9 = e97Var2.e;
                            double d10 = e97Var2.a;
                            if (d5 >= d9) {
                                return Math.pow((d6 * d5) + d7, d10);
                            }
                            return d8 * d5;
                        case 3:
                            double d11 = e97Var2.b;
                            double d12 = e97Var2.c;
                            double d13 = e97Var2.d;
                            double d14 = e97Var2.e;
                            double d15 = e97Var2.f;
                            double d16 = e97Var2.g;
                            double d17 = e97Var2.a;
                            if (d5 >= d14) {
                                return Math.pow((d11 * d5) + d12, d17) + d15;
                            }
                            return (d13 * d5) + d16;
                        case 4:
                            float[] fArr4 = qt0.a;
                            return qt0.b(e97Var2, d5);
                        case 5:
                            float[] fArr5 = qt0.a;
                            return qt0.d(e97Var2, d5);
                        case 6:
                            double d18 = e97Var2.b;
                            double d19 = e97Var2.c;
                            double d20 = e97Var2.d;
                            double d21 = e97Var2.e;
                            double d22 = e97Var2.a;
                            if (d5 >= d21 * d20) {
                                return (Math.pow(d5, 1.0d / d22) - d19) / d18;
                            }
                            return d5 / d20;
                        default:
                            double d23 = e97Var2.b;
                            double d24 = e97Var2.c;
                            double d25 = e97Var2.d;
                            double d26 = e97Var2.e;
                            double d27 = e97Var2.f;
                            double d28 = e97Var2.g;
                            double d29 = e97Var2.a;
                            if (d5 >= d26 * d25) {
                                return (Math.pow(d5 - d27, 1.0d / d29) - d24) / d23;
                            }
                            return (d5 - d28) / d25;
                    }
                }
            };
        } else if (d4 == 0.0d && d3 == 0.0d) {
            gm1Var2 = new gm1() { // from class: aq5
                @Override // defpackage.gm1
                public final double c(double d5) {
                    int i2 = r2;
                    e97 e97Var2 = e97Var;
                    switch (i2) {
                        case 0:
                            float[] fArr2 = qt0.a;
                            return qt0.a(e97Var2, d5);
                        case 1:
                            float[] fArr3 = qt0.a;
                            return qt0.c(e97Var2, d5);
                        case 2:
                            double d6 = e97Var2.b;
                            double d7 = e97Var2.c;
                            double d8 = e97Var2.d;
                            double d9 = e97Var2.e;
                            double d10 = e97Var2.a;
                            if (d5 >= d9) {
                                return Math.pow((d6 * d5) + d7, d10);
                            }
                            return d8 * d5;
                        case 3:
                            double d11 = e97Var2.b;
                            double d12 = e97Var2.c;
                            double d13 = e97Var2.d;
                            double d14 = e97Var2.e;
                            double d15 = e97Var2.f;
                            double d16 = e97Var2.g;
                            double d17 = e97Var2.a;
                            if (d5 >= d14) {
                                return Math.pow((d11 * d5) + d12, d17) + d15;
                            }
                            return (d13 * d5) + d16;
                        case 4:
                            float[] fArr4 = qt0.a;
                            return qt0.b(e97Var2, d5);
                        case 5:
                            float[] fArr5 = qt0.a;
                            return qt0.d(e97Var2, d5);
                        case 6:
                            double d18 = e97Var2.b;
                            double d19 = e97Var2.c;
                            double d20 = e97Var2.d;
                            double d21 = e97Var2.e;
                            double d22 = e97Var2.a;
                            if (d5 >= d21 * d20) {
                                return (Math.pow(d5, 1.0d / d22) - d19) / d18;
                            }
                            return d5 / d20;
                        default:
                            double d23 = e97Var2.b;
                            double d24 = e97Var2.c;
                            double d25 = e97Var2.d;
                            double d26 = e97Var2.e;
                            double d27 = e97Var2.f;
                            double d28 = e97Var2.g;
                            double d29 = e97Var2.a;
                            if (d5 >= d26 * d25) {
                                return (Math.pow(d5 - d27, 1.0d / d29) - d24) / d23;
                            }
                            return (d5 - d28) / d25;
                    }
                }
            };
        } else {
            gm1Var2 = new gm1() { // from class: aq5
                @Override // defpackage.gm1
                public final double c(double d5) {
                    int i2 = r2;
                    e97 e97Var2 = e97Var;
                    switch (i2) {
                        case 0:
                            float[] fArr2 = qt0.a;
                            return qt0.a(e97Var2, d5);
                        case 1:
                            float[] fArr3 = qt0.a;
                            return qt0.c(e97Var2, d5);
                        case 2:
                            double d6 = e97Var2.b;
                            double d7 = e97Var2.c;
                            double d8 = e97Var2.d;
                            double d9 = e97Var2.e;
                            double d10 = e97Var2.a;
                            if (d5 >= d9) {
                                return Math.pow((d6 * d5) + d7, d10);
                            }
                            return d8 * d5;
                        case 3:
                            double d11 = e97Var2.b;
                            double d12 = e97Var2.c;
                            double d13 = e97Var2.d;
                            double d14 = e97Var2.e;
                            double d15 = e97Var2.f;
                            double d16 = e97Var2.g;
                            double d17 = e97Var2.a;
                            if (d5 >= d14) {
                                return Math.pow((d11 * d5) + d12, d17) + d15;
                            }
                            return (d13 * d5) + d16;
                        case 4:
                            float[] fArr4 = qt0.a;
                            return qt0.b(e97Var2, d5);
                        case 5:
                            float[] fArr5 = qt0.a;
                            return qt0.d(e97Var2, d5);
                        case 6:
                            double d18 = e97Var2.b;
                            double d19 = e97Var2.c;
                            double d20 = e97Var2.d;
                            double d21 = e97Var2.e;
                            double d22 = e97Var2.a;
                            if (d5 >= d21 * d20) {
                                return (Math.pow(d5, 1.0d / d22) - d19) / d18;
                            }
                            return d5 / d20;
                        default:
                            double d23 = e97Var2.b;
                            double d24 = e97Var2.c;
                            double d25 = e97Var2.d;
                            double d26 = e97Var2.e;
                            double d27 = e97Var2.f;
                            double d28 = e97Var2.g;
                            double d29 = e97Var2.a;
                            if (d5 >= d26 * d25) {
                                return (Math.pow(d5 - d27, 1.0d / d29) - d24) / d23;
                            }
                            return (d5 - d28) / d25;
                    }
                }
            };
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cq5(String str, float[] fArr, ys7 ys7Var, final double d, float f, float f2, int i) {
        this(str, fArr, ys7Var, null, r0 == 0 ? r3 : new gm1() { // from class: zp5
            @Override // defpackage.gm1
            public final double c(double d2) {
                switch (r1) {
                    case 0:
                        if (d2 < 0.0d) {
                            d2 = 0.0d;
                        }
                        return Math.pow(d2, 1.0d / d);
                    default:
                        if (d2 < 0.0d) {
                            d2 = 0.0d;
                        }
                        return Math.pow(d2, d);
                }
            }
        }, r0 != 0 ? new gm1() { // from class: zp5
            @Override // defpackage.gm1
            public final double c(double d2) {
                switch (r1) {
                    case 0:
                        if (d2 < 0.0d) {
                            d2 = 0.0d;
                        }
                        return Math.pow(d2, 1.0d / d);
                    default:
                        if (d2 < 0.0d) {
                            d2 = 0.0d;
                        }
                        return Math.pow(d2, d);
                }
            }
        } : r3, f, f2, new e97(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
        int i2 = (d > 1.0d ? 1 : (d == 1.0d ? 0 : -1));
        gm1 gm1Var = r;
    }
}
