package xa;

import java.util.BitSet;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class w0 extends ua.u {
    @Override // ua.u
    public final Object b(cb.a aVar) {
        BitSet bitSet = new BitSet();
        aVar.d();
        cb.b d02 = aVar.d0();
        int i2 = 0;
        while (d02 != cb.b.END_ARRAY) {
            int i10 = y0.f14531a[d02.ordinal()];
            boolean z10 = true;
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    z10 = aVar.I();
                } else {
                    StringBuilder sb2 = new StringBuilder("Invalid bitset value type: ");
                    sb2.append(d02);
                    String B = aVar.B(false);
                    sb2.append("; at path ");
                    sb2.append(B);
                    throw new RuntimeException(sb2.toString());
                }
            } else {
                int K = aVar.K();
                if (K == 0) {
                    z10 = false;
                } else if (K != 1) {
                    StringBuilder i11 = kc.a.i("Invalid bitset value ", K, ", expected 0 or 1; at path ");
                    i11.append(aVar.B(true));
                    throw new RuntimeException(i11.toString());
                }
            }
            if (z10) {
                bitSet.set(i2);
            }
            i2++;
            d02 = aVar.d0();
        }
        aVar.v();
        return bitSet;
    }

    @Override // ua.u
    public final void c(cb.c cVar, Object obj) {
        BitSet bitSet = (BitSet) obj;
        cVar.i();
        int length = bitSet.length();
        for (int i2 = 0; i2 < length; i2++) {
            cVar.L(bitSet.get(i2) ? 1L : 0L);
        }
        cVar.v();
    }
}
