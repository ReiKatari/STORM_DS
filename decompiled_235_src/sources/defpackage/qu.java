package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qu  reason: default package */
/* loaded from: classes.dex */
public final class qu {
    public final yu b;
    public final bt c;
    public int a = 0;
    public int d = 8;
    public int[] e = new int[8];
    public int[] f = new int[8];
    public float[] g = new float[8];
    public int h = -1;
    public int i = -1;
    public boolean j = false;

    public qu(yu yuVar, bt btVar) {
        this.b = yuVar;
        this.c = btVar;
    }

    public final void a(en6 en6Var, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.h;
            yu yuVar = this.b;
            if (i == -1) {
                this.h = 0;
                this.g[0] = f;
                this.e[0] = en6Var.B;
                this.f[0] = -1;
                en6Var.h0++;
                en6Var.a(yuVar);
                this.a++;
                if (!this.j) {
                    int i2 = this.i + 1;
                    this.i = i2;
                    int[] iArr = this.e;
                    if (i2 >= iArr.length) {
                        this.j = true;
                        this.i = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.a; i4++) {
                int i5 = this.e[i];
                int i6 = en6Var.B;
                if (i5 == i6) {
                    float[] fArr = this.g;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == RecyclerView.B1) {
                        int i7 = this.h;
                        int[] iArr2 = this.f;
                        if (i == i7) {
                            this.h = iArr2[i];
                        } else {
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            en6Var.b(yuVar);
                        }
                        if (this.j) {
                            this.i = i;
                        }
                        en6Var.h0--;
                        this.a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f[i];
            }
            int i8 = this.i;
            int i9 = i8 + 1;
            if (this.j) {
                int[] iArr3 = this.e;
                if (iArr3[i8] != -1) {
                    i8 = iArr3.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr4 = this.e;
            if (i8 >= iArr4.length && this.a < iArr4.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr5 = this.e;
                    if (i10 >= iArr5.length) {
                        break;
                    } else if (iArr5[i10] == -1) {
                        i8 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            int[] iArr6 = this.e;
            if (i8 >= iArr6.length) {
                i8 = iArr6.length;
                int i11 = this.d * 2;
                this.d = i11;
                this.j = false;
                this.i = i8 - 1;
                this.g = Arrays.copyOf(this.g, i11);
                this.e = Arrays.copyOf(this.e, this.d);
                this.f = Arrays.copyOf(this.f, this.d);
            }
            this.e[i8] = en6Var.B;
            this.g[i8] = f;
            int[] iArr7 = this.f;
            if (i3 != -1) {
                iArr7[i8] = iArr7[i3];
                iArr7[i3] = i8;
            } else {
                iArr7[i8] = this.h;
                this.h = i8;
            }
            en6Var.h0++;
            en6Var.a(yuVar);
            this.a++;
            if (!this.j) {
                this.i++;
            }
            int i12 = this.i;
            int[] iArr8 = this.e;
            if (i12 >= iArr8.length) {
                this.j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            en6 en6Var = ((en6[]) this.c.R)[this.e[i]];
            if (en6Var != null) {
                en6Var.b(this.b);
            }
            i = this.f[i];
        }
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.a = 0;
    }

    public final float c(en6 en6Var) {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.e[i] == en6Var.B) {
                return this.g[i];
            }
            i = this.f[i];
        }
        return RecyclerView.B1;
    }

    public final int d() {
        return this.a;
    }

    public final en6 e(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return ((en6[]) this.c.R)[this.e[i2]];
            }
            i2 = this.f[i2];
        }
        return null;
    }

    public final float f(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.g[i2];
            }
            i2 = this.f[i2];
        }
        return RecyclerView.B1;
    }

    public final void g(en6 en6Var, float f) {
        if (f == RecyclerView.B1) {
            h(en6Var, true);
            return;
        }
        int i = this.h;
        yu yuVar = this.b;
        if (i == -1) {
            this.h = 0;
            this.g[0] = f;
            this.e[0] = en6Var.B;
            this.f[0] = -1;
            en6Var.h0++;
            en6Var.a(yuVar);
            this.a++;
            if (!this.j) {
                int i2 = this.i + 1;
                this.i = i2;
                int[] iArr = this.e;
                if (i2 >= iArr.length) {
                    this.j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.a; i4++) {
            int i5 = this.e[i];
            int i6 = en6Var.B;
            if (i5 == i6) {
                this.g[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f[i];
        }
        int i7 = this.i;
        int i8 = i7 + 1;
        if (this.j) {
            int[] iArr2 = this.e;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.e;
        if (i7 >= iArr3.length && this.a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.e;
                if (i9 >= iArr4.length) {
                    break;
                } else if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr5 = this.e;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.d * 2;
            this.d = i10;
            this.j = false;
            this.i = i7 - 1;
            this.g = Arrays.copyOf(this.g, i10);
            this.e = Arrays.copyOf(this.e, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
        }
        this.e[i7] = en6Var.B;
        this.g[i7] = f;
        int[] iArr6 = this.f;
        if (i3 != -1) {
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            iArr6[i7] = this.h;
            this.h = i7;
        }
        en6Var.h0++;
        en6Var.a(yuVar);
        int i11 = this.a + 1;
        this.a = i11;
        if (!this.j) {
            this.i++;
        }
        int[] iArr7 = this.e;
        if (i11 >= iArr7.length) {
            this.j = true;
        }
        if (this.i >= iArr7.length) {
            this.j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final float h(en6 en6Var, boolean z) {
        int i = this.h;
        if (i != -1) {
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.a) {
                if (this.e[i] == en6Var.B) {
                    int i4 = this.h;
                    int[] iArr = this.f;
                    if (i == i4) {
                        this.h = iArr[i];
                    } else {
                        iArr[i3] = iArr[i];
                    }
                    if (z) {
                        en6Var.b(this.b);
                    }
                    en6Var.h0--;
                    this.a--;
                    this.e[i] = -1;
                    if (this.j) {
                        this.i = i;
                    }
                    return this.g[i];
                }
                i2++;
                i3 = i;
                i = this.f[i];
            }
            return RecyclerView.B1;
        }
        return RecyclerView.B1;
    }

    public final String toString() {
        int i = this.h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            StringBuilder s = lb1.s(str.concat(" -> "));
            s.append(this.g[i]);
            s.append(" : ");
            StringBuilder s2 = lb1.s(s.toString());
            s2.append(((en6[]) this.c.R)[this.e[i]]);
            str = s2.toString();
            i = this.f[i];
        }
        return str;
    }
}
