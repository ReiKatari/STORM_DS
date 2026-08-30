package f1;

import android.view.KeyEvent;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e0 extends g {
    public final a1.a0 G0;
    public final a1.a0 H0;

    public e0(j1.i iVar, mc.a aVar) {
        super(iVar, null, false, true, null, null, aVar);
        int i2 = a1.o.f79a;
        this.G0 = new a1.a0(6);
        this.H0 = new a1.a0(6);
    }

    @Override // b3.o
    public final void I0() {
        d1();
    }

    @Override // f1.g
    public final v3.h0 S0() {
        a2.h hVar = new a2.h(3, this);
        v3.k kVar = v3.c0.f13637a;
        return new v3.h0(null, null, null, hVar);
    }

    @Override // f1.g
    public final void Z0() {
        d1();
    }

    @Override // f1.g
    public final boolean a1(KeyEvent keyEvent) {
        c0 c0Var = (c0) this.H0.d(t3.c.b(keyEvent));
        return false;
    }

    @Override // f1.g
    public final void b1(KeyEvent keyEvent) {
        long b10 = t3.c.b(keyEvent);
        a1.a0 a0Var = this.G0;
        boolean z10 = false;
        if (a0Var.d(b10) != null) {
            zc.y0 y0Var = (zc.y0) a0Var.d(b10);
            if (y0Var != null) {
                if (y0Var.d()) {
                    y0Var.i(null);
                } else {
                    z10 = true;
                }
            }
            a0Var.f(b10);
        }
        if (!z10) {
            this.f4552q0.b();
        }
    }

    public final void d1() {
        char c4;
        long j2;
        long j10;
        long j11;
        char c10;
        long j12;
        a1.a0 a0Var = this.G0;
        Object[] objArr = a0Var.f17c;
        long[] jArr = a0Var.f15a;
        int length = jArr.length - 2;
        char c11 = 7;
        long j13 = -9187201950435737472L;
        if (length >= 0) {
            int i2 = 0;
            j10 = 128;
            while (true) {
                long j14 = jArr[i2];
                j11 = 255;
                if ((((~j14) << c11) & j14 & j13) != j13) {
                    int i10 = 8 - ((~(i2 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j14 & 255) < 128) {
                            c10 = c11;
                            j12 = j13;
                            ((zc.y0) objArr[(i2 << 3) + i11]).i(null);
                        } else {
                            c10 = c11;
                            j12 = j13;
                        }
                        j14 >>= 8;
                        i11++;
                        c11 = c10;
                        j13 = j12;
                    }
                    c4 = c11;
                    j2 = j13;
                    if (i10 != 8) {
                        break;
                    }
                } else {
                    c4 = c11;
                    j2 = j13;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                c11 = c4;
                j13 = j2;
            }
        } else {
            c4 = 7;
            j2 = -9187201950435737472L;
            j10 = 128;
            j11 = 255;
        }
        a0Var.a();
        a1.a0 a0Var2 = this.H0;
        Object[] objArr2 = a0Var2.f17c;
        long[] jArr2 = a0Var2.f15a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i12 = 0;
            while (true) {
                long j15 = jArr2[i12];
                if ((((~j15) << c4) & j15 & j2) != j2) {
                    int i13 = 8 - ((~(i12 - length2)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j15 & j11) >= j10) {
                            j15 >>= 8;
                        } else {
                            ((c0) objArr2[(i12 << 3) + i14]).getClass();
                            throw null;
                        }
                    }
                    if (i13 != 8) {
                        break;
                    }
                }
                if (i12 == length2) {
                    break;
                }
                i12++;
            }
        }
        a0Var2.a();
    }

    @Override // f1.g
    public final void R0(i4.x xVar) {
    }
}
