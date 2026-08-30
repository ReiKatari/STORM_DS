package w2;

import a1.h0;
import a1.m0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements d {
    public boolean B;
    public boolean L;
    public boolean A = true;
    public final m0 R = new m0();

    public final void a() {
        m0 m0Var = this.R;
        Object[] objArr = m0Var.f69c;
        long[] jArr = m0Var.f67a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j2) < 128) {
                            Object obj = objArr[(i2 << 3) + i11];
                            if (obj instanceof h0) {
                                h0 h0Var = (h0) obj;
                                Object[] objArr2 = h0Var.f44a;
                                int i12 = h0Var.f45b;
                                for (int i13 = 0; i13 < i12; i13++) {
                                    Object obj2 = objArr2[i13];
                                }
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        m0Var.a();
    }
}
