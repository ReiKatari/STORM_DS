package defpackage;

import java.util.BitSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: td7  reason: default package */
/* loaded from: classes.dex */
public class td7 extends yc7 {
    @Override // defpackage.yc7
    public final Object b(hf3 hf3Var) {
        BitSet bitSet = new BitSet();
        hf3Var.e();
        jf3 n0 = hf3Var.n0();
        int i = 0;
        while (n0 != jf3.END_ARRAY) {
            int i2 = wd7.a[n0.ordinal()];
            boolean z = true;
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    z = hf3Var.U();
                } else {
                    StringBuilder sb = new StringBuilder("Invalid bitset value type: ");
                    sb.append(n0);
                    String x = hf3Var.x();
                    sb.append("; at path ");
                    sb.append(x);
                    throw new RuntimeException(sb.toString());
                }
            } else {
                int Z = hf3Var.Z();
                if (Z == 0) {
                    z = false;
                } else if (Z != 1) {
                    StringBuilder t = xg6.t("Invalid bitset value ", Z, ", expected 0 or 1; at path ");
                    t.append(hf3Var.D());
                    throw new RuntimeException(t.toString());
                }
            }
            if (z) {
                bitSet.set(i);
            }
            i++;
            n0 = hf3Var.n0();
        }
        hf3Var.r();
        return bitSet;
    }

    @Override // defpackage.yc7
    public final void c(vf3 vf3Var, Object obj) {
        BitSet bitSet = (BitSet) obj;
        vf3Var.h();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            vf3Var.X(bitSet.get(i) ? 1L : 0L);
        }
        vf3Var.r();
    }
}
