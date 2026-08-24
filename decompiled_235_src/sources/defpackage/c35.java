package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c35  reason: default package */
/* loaded from: classes.dex */
public final class c35 extends yu {
    public en6[] f;
    public en6[] g;
    public int h;
    public ap3 i;

    @Override // defpackage.yu
    public final en6 d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            en6[] en6VarArr = this.f;
            en6 en6Var = en6VarArr[i2];
            if (!zArr[en6Var.B]) {
                ap3 ap3Var = this.i;
                ap3Var.B = en6Var;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((en6) ap3Var.B).d0[i3];
                        if (f <= RecyclerView.B1) {
                            if (f < RecyclerView.B1) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    en6 en6Var2 = en6VarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = en6Var2.d0[i3];
                            float f3 = ((en6) ap3Var.B).d0[i3];
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

    @Override // defpackage.yu
    public final boolean e() {
        if (this.h == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.yu
    public final void i(jv3 jv3Var, yu yuVar, boolean z) {
        en6 en6Var = yuVar.a;
        if (en6Var == null) {
            return;
        }
        float[] fArr = en6Var.d0;
        qu quVar = yuVar.d;
        int d = quVar.d();
        for (int i = 0; i < d; i++) {
            en6 e = quVar.e(i);
            float f = quVar.f(i);
            ap3 ap3Var = this.i;
            ap3Var.B = e;
            if (e.A) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((en6) ap3Var.B).d0;
                    float f2 = (fArr[i2] * f) + fArr2[i2];
                    fArr2[i2] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        ((en6) ap3Var.B).d0[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((c35) ap3Var.L).k((en6) ap3Var.B);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f3 = fArr[i3];
                    if (f3 != RecyclerView.B1) {
                        float f4 = f3 * f;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        ((en6) ap3Var.B).d0[i3] = f4;
                    } else {
                        ((en6) ap3Var.B).d0[i3] = 0.0f;
                    }
                }
                j(e);
            }
            this.b = (yuVar.b * f) + this.b;
        }
        k(en6Var);
    }

    public final void j(en6 en6Var) {
        int i;
        en6[] en6VarArr;
        int i2 = this.h + 1;
        en6[] en6VarArr2 = this.f;
        if (i2 > en6VarArr2.length) {
            en6[] en6VarArr3 = (en6[]) Arrays.copyOf(en6VarArr2, en6VarArr2.length * 2);
            this.f = en6VarArr3;
            this.g = (en6[]) Arrays.copyOf(en6VarArr3, en6VarArr3.length * 2);
        }
        en6[] en6VarArr4 = this.f;
        int i3 = this.h;
        en6VarArr4[i3] = en6Var;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && en6VarArr4[i3].B > en6Var.B) {
            int i5 = 0;
            while (true) {
                i = this.h;
                en6VarArr = this.g;
                if (i5 >= i) {
                    break;
                }
                en6VarArr[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(en6VarArr, 0, i, new zh2(26));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        en6Var.A = true;
        en6Var.a(this);
    }

    public final void k(en6 en6Var) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == en6Var) {
                while (true) {
                    int i2 = this.h;
                    if (i < i2 - 1) {
                        en6[] en6VarArr = this.f;
                        int i3 = i + 1;
                        en6VarArr[i] = en6VarArr[i3];
                        i = i3;
                    } else {
                        this.h = i2 - 1;
                        en6Var.A = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.yu
    public final String toString() {
        ap3 ap3Var = this.i;
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            ap3Var.B = this.f[i];
            str = str + ap3Var + " ";
        }
        return str;
    }
}
