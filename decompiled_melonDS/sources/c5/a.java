package c5;

import a4.n;
import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public final b f2574b;

    /* renamed from: c  reason: collision with root package name */
    public final n f2575c;

    /* renamed from: a  reason: collision with root package name */
    public int f2573a = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f2576d = 8;

    /* renamed from: e  reason: collision with root package name */
    public int[] f2577e = new int[8];

    /* renamed from: f  reason: collision with root package name */
    public int[] f2578f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public float[] f2579g = new float[8];

    /* renamed from: h  reason: collision with root package name */
    public int f2580h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f2581i = -1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2582j = false;

    public a(b bVar, n nVar) {
        this.f2574b = bVar;
        this.f2575c = nVar;
    }

    public final void a(g gVar, float f8, boolean z10) {
        if (f8 <= -0.001f || f8 >= 0.001f) {
            int i2 = this.f2580h;
            b bVar = this.f2574b;
            if (i2 == -1) {
                this.f2580h = 0;
                this.f2579g[0] = f8;
                this.f2577e[0] = gVar.B;
                this.f2578f[0] = -1;
                gVar.f2614f0++;
                gVar.a(bVar);
                this.f2573a++;
                if (!this.f2582j) {
                    int i10 = this.f2581i + 1;
                    this.f2581i = i10;
                    int[] iArr = this.f2577e;
                    if (i10 >= iArr.length) {
                        this.f2582j = true;
                        this.f2581i = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i11 = -1;
            for (int i12 = 0; i2 != -1 && i12 < this.f2573a; i12++) {
                int i13 = this.f2577e[i2];
                int i14 = gVar.B;
                if (i13 == i14) {
                    float[] fArr = this.f2579g;
                    float f10 = fArr[i2] + f8;
                    if (f10 > -0.001f && f10 < 0.001f) {
                        f10 = 0.0f;
                    }
                    fArr[i2] = f10;
                    if (f10 == 0.0f) {
                        int i15 = this.f2580h;
                        int[] iArr2 = this.f2578f;
                        if (i2 == i15) {
                            this.f2580h = iArr2[i2];
                        } else {
                            iArr2[i11] = iArr2[i2];
                        }
                        if (z10) {
                            gVar.b(bVar);
                        }
                        if (this.f2582j) {
                            this.f2581i = i2;
                        }
                        gVar.f2614f0--;
                        this.f2573a--;
                        return;
                    }
                    return;
                }
                if (i13 < i14) {
                    i11 = i2;
                }
                i2 = this.f2578f[i2];
            }
            int i16 = this.f2581i;
            int i17 = i16 + 1;
            if (this.f2582j) {
                int[] iArr3 = this.f2577e;
                if (iArr3[i16] != -1) {
                    i16 = iArr3.length;
                }
            } else {
                i16 = i17;
            }
            int[] iArr4 = this.f2577e;
            if (i16 >= iArr4.length && this.f2573a < iArr4.length) {
                int i18 = 0;
                while (true) {
                    int[] iArr5 = this.f2577e;
                    if (i18 >= iArr5.length) {
                        break;
                    } else if (iArr5[i18] == -1) {
                        i16 = i18;
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            int[] iArr6 = this.f2577e;
            if (i16 >= iArr6.length) {
                i16 = iArr6.length;
                int i19 = this.f2576d * 2;
                this.f2576d = i19;
                this.f2582j = false;
                this.f2581i = i16 - 1;
                this.f2579g = Arrays.copyOf(this.f2579g, i19);
                this.f2577e = Arrays.copyOf(this.f2577e, this.f2576d);
                this.f2578f = Arrays.copyOf(this.f2578f, this.f2576d);
            }
            this.f2577e[i16] = gVar.B;
            this.f2579g[i16] = f8;
            int[] iArr7 = this.f2578f;
            if (i11 != -1) {
                iArr7[i16] = iArr7[i11];
                iArr7[i11] = i16;
            } else {
                iArr7[i16] = this.f2580h;
                this.f2580h = i16;
            }
            gVar.f2614f0++;
            gVar.a(bVar);
            this.f2573a++;
            if (!this.f2582j) {
                this.f2581i++;
            }
            int i20 = this.f2581i;
            int[] iArr8 = this.f2577e;
            if (i20 >= iArr8.length) {
                this.f2582j = true;
                this.f2581i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i2 = this.f2580h;
        for (int i10 = 0; i2 != -1 && i10 < this.f2573a; i10++) {
            g gVar = ((g[]) this.f2575c.R)[this.f2577e[i2]];
            if (gVar != null) {
                gVar.b(this.f2574b);
            }
            i2 = this.f2578f[i2];
        }
        this.f2580h = -1;
        this.f2581i = -1;
        this.f2582j = false;
        this.f2573a = 0;
    }

    public final float c(g gVar) {
        int i2 = this.f2580h;
        for (int i10 = 0; i2 != -1 && i10 < this.f2573a; i10++) {
            if (this.f2577e[i2] == gVar.B) {
                return this.f2579g[i2];
            }
            i2 = this.f2578f[i2];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f2573a;
    }

    public final g e(int i2) {
        int i10 = this.f2580h;
        for (int i11 = 0; i10 != -1 && i11 < this.f2573a; i11++) {
            if (i11 == i2) {
                return ((g[]) this.f2575c.R)[this.f2577e[i10]];
            }
            i10 = this.f2578f[i10];
        }
        return null;
    }

    public final float f(int i2) {
        int i10 = this.f2580h;
        for (int i11 = 0; i10 != -1 && i11 < this.f2573a; i11++) {
            if (i11 == i2) {
                return this.f2579g[i10];
            }
            i10 = this.f2578f[i10];
        }
        return 0.0f;
    }

    public final void g(g gVar, float f8) {
        if (f8 == 0.0f) {
            h(gVar, true);
            return;
        }
        int i2 = this.f2580h;
        b bVar = this.f2574b;
        if (i2 == -1) {
            this.f2580h = 0;
            this.f2579g[0] = f8;
            this.f2577e[0] = gVar.B;
            this.f2578f[0] = -1;
            gVar.f2614f0++;
            gVar.a(bVar);
            this.f2573a++;
            if (!this.f2582j) {
                int i10 = this.f2581i + 1;
                this.f2581i = i10;
                int[] iArr = this.f2577e;
                if (i10 >= iArr.length) {
                    this.f2582j = true;
                    this.f2581i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i11 = -1;
        for (int i12 = 0; i2 != -1 && i12 < this.f2573a; i12++) {
            int i13 = this.f2577e[i2];
            int i14 = gVar.B;
            if (i13 == i14) {
                this.f2579g[i2] = f8;
                return;
            }
            if (i13 < i14) {
                i11 = i2;
            }
            i2 = this.f2578f[i2];
        }
        int i15 = this.f2581i;
        int i16 = i15 + 1;
        if (this.f2582j) {
            int[] iArr2 = this.f2577e;
            if (iArr2[i15] != -1) {
                i15 = iArr2.length;
            }
        } else {
            i15 = i16;
        }
        int[] iArr3 = this.f2577e;
        if (i15 >= iArr3.length && this.f2573a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f2577e;
                if (i17 >= iArr4.length) {
                    break;
                } else if (iArr4[i17] == -1) {
                    i15 = i17;
                    break;
                } else {
                    i17++;
                }
            }
        }
        int[] iArr5 = this.f2577e;
        if (i15 >= iArr5.length) {
            i15 = iArr5.length;
            int i18 = this.f2576d * 2;
            this.f2576d = i18;
            this.f2582j = false;
            this.f2581i = i15 - 1;
            this.f2579g = Arrays.copyOf(this.f2579g, i18);
            this.f2577e = Arrays.copyOf(this.f2577e, this.f2576d);
            this.f2578f = Arrays.copyOf(this.f2578f, this.f2576d);
        }
        this.f2577e[i15] = gVar.B;
        this.f2579g[i15] = f8;
        int[] iArr6 = this.f2578f;
        if (i11 != -1) {
            iArr6[i15] = iArr6[i11];
            iArr6[i11] = i15;
        } else {
            iArr6[i15] = this.f2580h;
            this.f2580h = i15;
        }
        gVar.f2614f0++;
        gVar.a(bVar);
        int i19 = this.f2573a + 1;
        this.f2573a = i19;
        if (!this.f2582j) {
            this.f2581i++;
        }
        int[] iArr7 = this.f2577e;
        if (i19 >= iArr7.length) {
            this.f2582j = true;
        }
        if (this.f2581i >= iArr7.length) {
            this.f2582j = true;
            this.f2581i = iArr7.length - 1;
        }
    }

    public final float h(g gVar, boolean z10) {
        int i2 = this.f2580h;
        if (i2 != -1) {
            int i10 = 0;
            int i11 = -1;
            while (i2 != -1 && i10 < this.f2573a) {
                if (this.f2577e[i2] == gVar.B) {
                    int i12 = this.f2580h;
                    int[] iArr = this.f2578f;
                    if (i2 == i12) {
                        this.f2580h = iArr[i2];
                    } else {
                        iArr[i11] = iArr[i2];
                    }
                    if (z10) {
                        gVar.b(this.f2574b);
                    }
                    gVar.f2614f0--;
                    this.f2573a--;
                    this.f2577e[i2] = -1;
                    if (this.f2582j) {
                        this.f2581i = i2;
                    }
                    return this.f2579g[i2];
                }
                i10++;
                i11 = i2;
                i2 = this.f2578f[i2];
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final String toString() {
        int i2 = this.f2580h;
        String str = "";
        for (int i10 = 0; i2 != -1 && i10 < this.f2573a; i10++) {
            StringBuilder t5 = w.d.t(str.concat(" -> "));
            t5.append(this.f2579g[i2]);
            t5.append(" : ");
            StringBuilder t10 = w.d.t(t5.toString());
            t10.append(((g[]) this.f2575c.R)[this.f2577e[i2]]);
            str = t10.toString();
            i2 = this.f2578f[i2];
        }
        return str;
    }
}
