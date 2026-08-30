package g2;

import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m1 implements a5.q0 {
    public final long A;
    public final x4.c B;
    public final mc.p L;

    public m1(long j2, x4.c cVar, mc.p pVar) {
        this.A = j2;
        this.B = cVar;
        this.L = pVar;
    }

    @Override // a5.q0
    public final long d(x4.k kVar, long j2, x4.m mVar, long j10) {
        int i2;
        a6.a1 a1Var;
        Object obj;
        Object obj2;
        float f8 = i2.f5172b;
        x4.c cVar = this.B;
        int O = cVar.O(f8);
        long j11 = this.A;
        int O2 = cVar.O(Float.intBitsToFloat((int) (j11 >> 32)));
        x4.m mVar2 = x4.m.Ltr;
        if (mVar == mVar2) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int i10 = O2 * i2;
        int O3 = cVar.O(Float.intBitsToFloat((int) (j11 & 4294967295L)));
        int i11 = kVar.f14342a;
        int i12 = kVar.f14344c;
        int i13 = i11 + i10;
        int i14 = (int) (j10 >> 32);
        int i15 = (i12 - i14) + i10;
        int i16 = (int) (j2 >> 32);
        int i17 = i16 - i14;
        if (mVar == mVar2) {
            Integer valueOf = Integer.valueOf(i13);
            Integer valueOf2 = Integer.valueOf(i15);
            if (kVar.f14342a < 0) {
                i17 = 0;
            }
            a1Var = new a6.a1(3, new Integer[]{valueOf, valueOf2, Integer.valueOf(i17)});
        } else {
            Integer valueOf3 = Integer.valueOf(i15);
            Integer valueOf4 = Integer.valueOf(i13);
            if (i12 <= i16) {
                i17 = 0;
            }
            a1Var = new a6.a1(3, new Integer[]{valueOf3, valueOf4, Integer.valueOf(i17)});
        }
        Iterator it = a1Var.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                int intValue = ((Number) obj2).intValue();
                if (intValue >= 0 && intValue + i14 <= i16) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        Integer num = (Integer) obj2;
        if (num != null) {
            i15 = num.intValue();
        }
        int max = Math.max(kVar.f14345d + O3, O);
        int i18 = kVar.f14343b;
        int i19 = (int) (j10 & 4294967295L);
        int i20 = (i18 - i19) + O3;
        int i21 = (i18 - (i19 / 2)) + O3;
        int i22 = (int) (j2 & 4294967295L);
        a1.z0 z0Var = new a1.z0(new Integer[]{Integer.valueOf(max), Integer.valueOf(i20), Integer.valueOf(i21), Integer.valueOf((i22 - i19) - O)});
        while (true) {
            if (!z0Var.hasNext()) {
                break;
            }
            Object next = z0Var.next();
            int intValue2 = ((Number) next).intValue();
            if (intValue2 >= O && intValue2 + i19 <= i22 - O) {
                obj = next;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            i20 = num2.intValue();
        }
        this.L.j(kVar, new x4.k(i15, i20, i14 + i15, i19 + i20));
        return (i15 << 32) | (i20 & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        if (this.A == m1Var.A && nc.k.a(this.B, m1Var.B) && nc.k.a(this.L, m1Var.L)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.B.hashCode();
        return this.L.hashCode() + ((hashCode + (Long.hashCode(this.A) * 31)) * 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) x4.g.a(this.A)) + ", density=" + this.B + ", onPositionCalculated=" + this.L + ')';
    }
}
