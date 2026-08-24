package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rl7  reason: default package */
/* loaded from: classes.dex */
public final class rl7 {
    public final boolean a;
    public final pl7 b;
    public final int c;
    public final yb1[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public rl7(boolean z, pl7 pl7Var) {
        this.a = z;
        this.b = pl7Var;
        if (z && pl7Var.equals(pl7.Lsq2)) {
            i.m("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int i = ql7.a[pl7Var.ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i == 2) {
                i2 = 3;
            } else {
                i.d();
                throw null;
            }
        }
        this.c = i2;
        this.d = new yb1[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [yb1, java.lang.Object] */
    public final void a(float f, long j) {
        int i = (this.e + 1) % 20;
        this.e = i;
        yb1[] yb1VarArr = this.d;
        yb1 yb1Var = yb1VarArr[i];
        if (yb1Var == 0) {
            ?? obj = new Object();
            obj.a = j;
            obj.b = f;
            yb1VarArr[i] = obj;
            return;
        }
        yb1Var.a = j;
        yb1Var.b = f;
    }

    public final float b(float f) {
        pl7 pl7Var;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        int i;
        float f3;
        float signum;
        float f4;
        int i2;
        float f5 = RecyclerView.B1;
        if (f <= RecyclerView.B1) {
            p53.c("maximumVelocity should be a positive value. You specified=" + f);
        }
        int i3 = this.e;
        yb1[] yb1VarArr = this.d;
        yb1 yb1Var = yb1VarArr[i3];
        if (yb1Var == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i4 = 0;
            yb1 yb1Var2 = yb1Var;
            while (true) {
                yb1 yb1Var3 = yb1VarArr[i3];
                boolean z2 = this.a;
                pl7Var = this.b;
                fArr = this.f;
                fArr2 = this.g;
                if (yb1Var3 == null) {
                    f2 = f5;
                    z = z2;
                    i = 1;
                    break;
                }
                long j = yb1Var.a;
                f2 = f5;
                int i5 = i3;
                long j2 = yb1Var3.a;
                float f6 = (float) (j - j2);
                z = z2;
                i = 1;
                float abs = (float) Math.abs(j2 - yb1Var2.a);
                if (pl7Var != pl7.Lsq2 && !z) {
                    yb1Var2 = yb1Var;
                } else {
                    yb1Var2 = yb1Var3;
                }
                if (f6 > 100.0f || abs > 40.0f) {
                    break;
                }
                fArr[i4] = yb1Var3.b;
                fArr2[i4] = -f6;
                if (i5 == 0) {
                    i2 = 20;
                } else {
                    i2 = i5;
                }
                i3 = i2 - 1;
                i4++;
                if (i4 >= 20) {
                    break;
                }
                f5 = f2;
            }
            if (i4 >= this.c) {
                int i6 = ql7.a[pl7Var.ordinal()];
                if (i6 != i) {
                    if (i6 == 2) {
                        try {
                            float[] fArr3 = this.h;
                            mp2.R(fArr2, fArr, i4, fArr3);
                            signum = fArr3[i];
                        } catch (IllegalArgumentException unused) {
                            signum = f2;
                        }
                    } else {
                        i.d();
                        return f2;
                    }
                } else {
                    int i7 = i4 - i;
                    float f7 = fArr2[i7];
                    int i8 = i7;
                    float f8 = f2;
                    while (i8 > 0) {
                        int i9 = i8 - 1;
                        float f9 = fArr2[i9];
                        if (f7 != f9) {
                            if (z) {
                                f4 = -fArr[i9];
                            } else {
                                f4 = fArr[i8] - fArr[i9];
                            }
                            float f10 = f4 / (f7 - f9);
                            f8 += Math.abs(f10) * (f10 - (Math.signum(f8) * ((float) Math.sqrt(Math.abs(f8) * 2.0f))));
                            if (i8 == i7) {
                                f8 *= 0.5f;
                            }
                        }
                        i8--;
                        f7 = f9;
                    }
                    signum = Math.signum(f8) * ((float) Math.sqrt(Math.abs(f8) * 2.0f));
                }
                f3 = signum * 1000.0f;
            } else {
                f3 = f2;
            }
        }
        if (f3 == f2 || Float.isNaN(f3)) {
            return f2;
        }
        if (f3 > f2) {
            if (f3 > f) {
                f3 = f;
            }
        } else {
            float f11 = -f;
            if (f3 < f11) {
                return f11;
            }
        }
        return f3;
    }

    public rl7() {
        this(true, pl7.Impulse);
    }
}
