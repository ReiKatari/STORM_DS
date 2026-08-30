package defpackage;

import java.util.BitSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yz6  reason: default package */
/* loaded from: classes.dex */
public class yz6 extends dz6 {
    @Override // defpackage.dz6
    public final Object b(o83 o83Var) {
        BitSet bitSet = new BitSet();
        o83Var.d();
        q83 n0 = o83Var.n0();
        int i = 0;
        while (n0 != q83.END_ARRAY) {
            int i2 = b07.a[n0.ordinal()];
            boolean z = true;
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    z = o83Var.Q();
                } else {
                    StringBuilder sb = new StringBuilder("Invalid bitset value type: ");
                    sb.append(n0);
                    String D = o83Var.D();
                    sb.append("; at path ");
                    sb.append(D);
                    throw new RuntimeException(sb.toString());
                }
            } else {
                int T = o83Var.T();
                if (T == 0) {
                    z = false;
                } else if (T != 1) {
                    StringBuilder s = wh1.s("Invalid bitset value ", T, ", expected 0 or 1; at path ");
                    s.append(o83Var.I());
                    throw new RuntimeException(s.toString());
                }
            }
            if (z) {
                bitSet.set(i);
            }
            i++;
            n0 = o83Var.n0();
        }
        o83Var.x();
        return bitSet;
    }

    @Override // defpackage.dz6
    public final void c(b93 b93Var, Object obj) {
        BitSet bitSet = (BitSet) obj;
        b93Var.i();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            b93Var.R(bitSet.get(i) ? 1L : 0L);
        }
        b93Var.x();
    }
}
