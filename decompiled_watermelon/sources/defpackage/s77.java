package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s77  reason: default package */
/* loaded from: classes.dex */
public final class s77 {
    public final boolean a;
    public final q77 b;
    public final int c;
    public final h81[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public s77(boolean z, q77 q77Var) {
        this.a = z;
        this.b = q77Var;
        if (z && q77Var.equals(q77.Lsq2)) {
            i.n("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int i = r77.a[q77Var.ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i == 2) {
                i2 = 3;
            } else {
                i.c();
                throw null;
            }
        }
        this.c = i2;
        this.d = new h81[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [h81, java.lang.Object] */
    public final void a(float f, long j) {
        int i = (this.e + 1) % 20;
        this.e = i;
        h81[] h81VarArr = this.d;
        h81 h81Var = h81VarArr[i];
        if (h81Var == 0) {
            ?? obj = new Object();
            obj.a = j;
            obj.b = f;
            h81VarArr[i] = obj;
            return;
        }
        h81Var.a = j;
        h81Var.b = f;
    }

    public final float b(float f) {
        q77 q77Var;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        int i;
        float f3;
        float signum;
        float f4;
        int i2;
        float f5 = RecyclerView.A1;
        if (f <= RecyclerView.A1) {
            mz2.c("maximumVelocity should be a positive value. You specified=" + f);
        }
        int i3 = this.e;
        h81[] h81VarArr = this.d;
        h81 h81Var = h81VarArr[i3];
        if (h81Var == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i4 = 0;
            h81 h81Var2 = h81Var;
            while (true) {
                h81 h81Var3 = h81VarArr[i3];
                boolean z2 = this.a;
                q77Var = this.b;
                fArr = this.f;
                fArr2 = this.g;
                if (h81Var3 == null) {
                    f2 = f5;
                    z = z2;
                    i = 1;
                    break;
                }
                long j = h81Var.a;
                f2 = f5;
                int i5 = i3;
                long j2 = h81Var3.a;
                float f6 = (float) (j - j2);
                z = z2;
                i = 1;
                float abs = (float) Math.abs(j2 - h81Var2.a);
                if (q77Var != q77.Lsq2 && !z) {
                    h81Var2 = h81Var;
                } else {
                    h81Var2 = h81Var3;
                }
                if (f6 > 100.0f || abs > 40.0f) {
                    break;
                }
                fArr[i4] = h81Var3.b;
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
                int i6 = r77.a[q77Var.ordinal()];
                if (i6 != i) {
                    if (i6 == 2) {
                        try {
                            float[] fArr3 = this.h;
                            ln2.N(fArr2, fArr, i4, fArr3);
                            signum = fArr3[i];
                        } catch (IllegalArgumentException unused) {
                            signum = f2;
                        }
                    } else {
                        i.c();
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

    public s77() {
        this(true, q77.Impulse);
    }
}
