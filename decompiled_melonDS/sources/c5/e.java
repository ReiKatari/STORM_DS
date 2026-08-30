package c5;

import ah.b0;
import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: f  reason: collision with root package name */
    public g[] f2606f;

    /* renamed from: g  reason: collision with root package name */
    public g[] f2607g;

    /* renamed from: h  reason: collision with root package name */
    public int f2608h;

    /* renamed from: i  reason: collision with root package name */
    public a0.g f2609i;

    @Override // c5.b
    public final g d(boolean[] zArr) {
        int i2 = -1;
        for (int i10 = 0; i10 < this.f2608h; i10++) {
            g[] gVarArr = this.f2606f;
            g gVar = gVarArr[i10];
            if (!zArr[gVar.B]) {
                a0.g gVar2 = this.f2609i;
                gVar2.B = gVar;
                int i11 = 8;
                if (i2 == -1) {
                    while (i11 >= 0) {
                        float f8 = ((g) gVar2.B).f2610b0[i11];
                        if (f8 <= 0.0f) {
                            if (f8 < 0.0f) {
                                i2 = i10;
                                break;
                            }
                            i11--;
                        }
                    }
                } else {
                    g gVar3 = gVarArr[i2];
                    while (true) {
                        if (i11 >= 0) {
                            float f10 = gVar3.f2610b0[i11];
                            float f11 = ((g) gVar2.B).f2610b0[i11];
                            if (f11 == f10) {
                                i11--;
                            } else if (f11 >= f10) {
                            }
                        }
                    }
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        return this.f2606f[i2];
    }

    @Override // c5.b
    public final boolean e() {
        if (this.f2608h == 0) {
            return true;
        }
        return false;
    }

    @Override // c5.b
    public final void i(c cVar, b bVar, boolean z10) {
        g gVar = bVar.f2583a;
        if (gVar == null) {
            return;
        }
        float[] fArr = gVar.f2610b0;
        a aVar = bVar.f2586d;
        int d4 = aVar.d();
        for (int i2 = 0; i2 < d4; i2++) {
            g e6 = aVar.e(i2);
            float f8 = aVar.f(i2);
            a0.g gVar2 = this.f2609i;
            gVar2.B = e6;
            if (e6.A) {
                boolean z11 = true;
                for (int i10 = 0; i10 < 9; i10++) {
                    float[] fArr2 = ((g) gVar2.B).f2610b0;
                    float f10 = (fArr[i10] * f8) + fArr2[i10];
                    fArr2[i10] = f10;
                    if (Math.abs(f10) < 1.0E-4f) {
                        ((g) gVar2.B).f2610b0[i10] = 0.0f;
                    } else {
                        z11 = false;
                    }
                }
                if (z11) {
                    ((e) gVar2.L).k((g) gVar2.B);
                }
            } else {
                for (int i11 = 0; i11 < 9; i11++) {
                    float f11 = fArr[i11];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f8;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        ((g) gVar2.B).f2610b0[i11] = f12;
                    } else {
                        ((g) gVar2.B).f2610b0[i11] = 0.0f;
                    }
                }
                j(e6);
            }
            this.f2584b = (bVar.f2584b * f8) + this.f2584b;
        }
        k(gVar);
    }

    public final void j(g gVar) {
        int i2;
        g[] gVarArr;
        int i10 = this.f2608h + 1;
        g[] gVarArr2 = this.f2606f;
        if (i10 > gVarArr2.length) {
            g[] gVarArr3 = (g[]) Arrays.copyOf(gVarArr2, gVarArr2.length * 2);
            this.f2606f = gVarArr3;
            this.f2607g = (g[]) Arrays.copyOf(gVarArr3, gVarArr3.length * 2);
        }
        g[] gVarArr4 = this.f2606f;
        int i11 = this.f2608h;
        gVarArr4[i11] = gVar;
        int i12 = i11 + 1;
        this.f2608h = i12;
        if (i12 > 1 && gVarArr4[i11].B > gVar.B) {
            int i13 = 0;
            while (true) {
                i2 = this.f2608h;
                gVarArr = this.f2607g;
                if (i13 >= i2) {
                    break;
                }
                gVarArr[i13] = this.f2606f[i13];
                i13++;
            }
            Arrays.sort(gVarArr, 0, i2, new b0(1));
            for (int i14 = 0; i14 < this.f2608h; i14++) {
                this.f2606f[i14] = this.f2607g[i14];
            }
        }
        gVar.A = true;
        gVar.a(this);
    }

    public final void k(g gVar) {
        int i2 = 0;
        while (i2 < this.f2608h) {
            if (this.f2606f[i2] == gVar) {
                while (true) {
                    int i10 = this.f2608h;
                    if (i2 < i10 - 1) {
                        g[] gVarArr = this.f2606f;
                        int i11 = i2 + 1;
                        gVarArr[i2] = gVarArr[i11];
                        i2 = i11;
                    } else {
                        this.f2608h = i10 - 1;
                        gVar.A = false;
                        return;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    @Override // c5.b
    public final String toString() {
        a0.g gVar = this.f2609i;
        String str = " goal -> (" + this.f2584b + ") : ";
        for (int i2 = 0; i2 < this.f2608h; i2++) {
            gVar.B = this.f2606f[i2];
            str = str + gVar + " ";
        }
        return str;
    }
}
