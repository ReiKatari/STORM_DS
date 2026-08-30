package b4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h2 extends androidx.lifecycle.y0 {

    /* renamed from: b  reason: collision with root package name */
    public final a1.x f1855b;

    public h2() {
        a1.x xVar = a1.m.f66a;
        this.f1855b = new a1.x();
    }

    @Override // androidx.lifecycle.y0
    public final void d() {
        a1.x xVar = this.f1855b;
        int[] iArr = xVar.f62b;
        Object[] objArr = xVar.f63c;
        long[] jArr = xVar.f61a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8;
                    int i11 = 8 - ((~(i2 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((255 & j2) < 128) {
                            int i13 = (i2 << 3) + i12;
                            int i14 = iArr[i13];
                            a1.h0 h0Var = (a1.h0) objArr[i13];
                            Object[] objArr2 = h0Var.f44a;
                            int i15 = h0Var.f45b;
                            int i16 = 0;
                            while (i16 < i15) {
                                g2 g2Var = (g2) objArr2[i16];
                                int i17 = i10;
                                n2.f fVar = g2Var.f1851d;
                                if (fVar != null) {
                                    fVar.cancel();
                                }
                                g2Var.f1851d = null;
                                w2.c cVar = (w2.c) g2Var.f1848a.B;
                                cVar.B = true;
                                cVar.A = false;
                                cVar.a();
                                i16++;
                                i10 = i17;
                            }
                        }
                        int i18 = i10;
                        j2 >>= i18;
                        i12++;
                        i10 = i18;
                    }
                    if (i11 != i10) {
                        return;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }
}
