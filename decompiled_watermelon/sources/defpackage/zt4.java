package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zt4  reason: default package */
/* loaded from: classes.dex */
public final class zt4 extends gu {
    public ob6[] f;
    public ob6[] g;
    public int h;
    public ci3 i;

    @Override // defpackage.gu
    public final ob6 d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            ob6[] ob6VarArr = this.f;
            ob6 ob6Var = ob6VarArr[i2];
            if (!zArr[ob6Var.B]) {
                ci3 ci3Var = this.i;
                ci3Var.B = ob6Var;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((ob6) ci3Var.B).c0[i3];
                        if (f <= RecyclerView.A1) {
                            if (f < RecyclerView.A1) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    ob6 ob6Var2 = ob6VarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = ob6Var2.c0[i3];
                            float f3 = ((ob6) ci3Var.B).c0[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 >= f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // defpackage.gu
    public final boolean e() {
        if (this.h == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gu
    public final void i(ho3 ho3Var, gu guVar, boolean z) {
        ob6 ob6Var = guVar.a;
        if (ob6Var == null) {
            return;
        }
        float[] fArr = ob6Var.c0;
        yt ytVar = guVar.d;
        int d = ytVar.d();
        for (int i = 0; i < d; i++) {
            ob6 e = ytVar.e(i);
            float f = ytVar.f(i);
            ci3 ci3Var = this.i;
            ci3Var.B = e;
            if (e.A) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((ob6) ci3Var.B).c0;
                    float f2 = (fArr[i2] * f) + fArr2[i2];
                    fArr2[i2] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        ((ob6) ci3Var.B).c0[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((zt4) ci3Var.L).k((ob6) ci3Var.B);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f3 = fArr[i3];
                    if (f3 != RecyclerView.A1) {
                        float f4 = f3 * f;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        ((ob6) ci3Var.B).c0[i3] = f4;
                    } else {
                        ((ob6) ci3Var.B).c0[i3] = 0.0f;
                    }
                }
                j(e);
            }
            this.b = (guVar.b * f) + this.b;
        }
        k(ob6Var);
    }

    public final void j(ob6 ob6Var) {
        int i;
        ob6[] ob6VarArr;
        int i2 = this.h + 1;
        ob6[] ob6VarArr2 = this.f;
        if (i2 > ob6VarArr2.length) {
            ob6[] ob6VarArr3 = (ob6[]) Arrays.copyOf(ob6VarArr2, ob6VarArr2.length * 2);
            this.f = ob6VarArr3;
            this.g = (ob6[]) Arrays.copyOf(ob6VarArr3, ob6VarArr3.length * 2);
        }
        ob6[] ob6VarArr4 = this.f;
        int i3 = this.h;
        ob6VarArr4[i3] = ob6Var;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && ob6VarArr4[i3].B > ob6Var.B) {
            int i5 = 0;
            while (true) {
                i = this.h;
                ob6VarArr = this.g;
                if (i5 >= i) {
                    break;
                }
                ob6VarArr[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(ob6VarArr, 0, i, new hd2(23));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        ob6Var.A = true;
        ob6Var.a(this);
    }

    public final void k(ob6 ob6Var) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == ob6Var) {
                while (true) {
                    int i2 = this.h;
                    if (i < i2 - 1) {
                        ob6[] ob6VarArr = this.f;
                        int i3 = i + 1;
                        ob6VarArr[i] = ob6VarArr[i3];
                        i = i3;
                    } else {
                        this.h = i2 - 1;
                        ob6Var.A = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.gu
    public final String toString() {
        ci3 ci3Var = this.i;
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            ci3Var.B = this.f[i];
            str = str + ci3Var + " ";
        }
        return str;
    }
}
