package d1;

import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h0 implements u {

    /* renamed from: a  reason: collision with root package name */
    public final g0 f3574a;

    public h0(g0 g0Var) {
        this.f3574a = g0Var;
    }

    @Override // d1.j
    /* renamed from: f */
    public final e2 a(w1 w1Var) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i2;
        g0 g0Var = this.f3574a;
        a1.x xVar = g0Var.f3569b;
        a1.w wVar = new a1.w(xVar.f65e + 2);
        a1.x xVar2 = new a1.x(xVar.f65e);
        int[] iArr3 = xVar.f62b;
        Object[] objArr3 = xVar.f63c;
        long[] jArr = xVar.f61a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j2 = jArr[i10];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j2 & 255) < 128) {
                            int i14 = (i10 << 3) + i13;
                            int i15 = iArr3[i14];
                            i2 = i11;
                            f0 f0Var = (f0) objArr3[i14];
                            wVar.a(i15);
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            xVar2.i(i15, new d2((p) w1Var.f3690a.k(f0Var.f3566a), f0Var.f3567b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i2 = i11;
                        }
                        j2 >>= i2;
                        i13++;
                        iArr3 = iArr2;
                        i11 = i2;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i12 != i11) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!xVar.a(0)) {
            int i16 = wVar.f112b;
            if (i16 >= 0) {
                wVar.b(i16 + 1);
                int[] iArr4 = wVar.f111a;
                int i17 = wVar.f112b;
                if (i17 != 0) {
                    zb.k.g(1, 0, i17, iArr4, iArr4);
                }
                iArr4[0] = 0;
                wVar.f112b++;
            } else {
                wa.b.f("Index must be between 0 and size");
                return null;
            }
        }
        if (!xVar.a(g0Var.f3568a)) {
            wVar.a(g0Var.f3568a);
        }
        int i18 = wVar.f112b;
        if (i18 != 0) {
            int[] iArr5 = wVar.f111a;
            iArr5.getClass();
            Arrays.sort(iArr5, 0, i18);
        }
        return new e2(wVar, xVar2, g0Var.f3568a, w.f3689c);
    }
}
