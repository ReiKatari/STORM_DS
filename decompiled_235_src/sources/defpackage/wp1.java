package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wp1  reason: default package */
/* loaded from: classes.dex */
public final class wp1 implements f05 {
    public final long a;
    public final qh1 b;
    public final eo2 c;

    public wp1(long j, qh1 qh1Var, eo2 eo2Var) {
        this.a = j;
        this.b = qh1Var;
        this.c = eo2Var;
    }

    @Override // defpackage.f05
    public final long a(m93 m93Var, long j, kk3 kk3Var, long j2) {
        int i;
        ev evVar;
        Object obj;
        Object obj2;
        qh1 qh1Var = this.b;
        int r0 = qh1Var.r0(48.0f);
        long j3 = this.a;
        int r02 = qh1Var.r0(Float.intBitsToFloat((int) (j3 >> 32)));
        kk3 kk3Var2 = kk3.Ltr;
        if (kk3Var == kk3Var2) {
            i = 1;
        } else {
            i = -1;
        }
        int i2 = r02 * i;
        int r03 = qh1Var.r0(Float.intBitsToFloat((int) (j3 & 4294967295L)));
        int i3 = m93Var.a;
        int i4 = m93Var.c;
        int i5 = i3 + i2;
        int i6 = (int) (j2 >> 32);
        int i7 = (i4 - i6) + i2;
        int i8 = (int) (j >> 32);
        int i9 = i8 - i6;
        if (kk3Var == kk3Var2) {
            Integer valueOf = Integer.valueOf(i5);
            Integer valueOf2 = Integer.valueOf(i7);
            if (m93Var.a < 0) {
                i9 = 0;
            }
            evVar = new ev(new Integer[]{valueOf, valueOf2, Integer.valueOf(i9)}, 0);
        } else {
            Integer valueOf3 = Integer.valueOf(i7);
            Integer valueOf4 = Integer.valueOf(i5);
            if (i4 <= i8) {
                i9 = 0;
            }
            evVar = new ev(new Integer[]{valueOf3, valueOf4, Integer.valueOf(i9)}, 0);
        }
        Iterator it = evVar.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                int intValue = ((Number) obj2).intValue();
                if (intValue >= 0 && intValue + i6 <= i8) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        Integer num = (Integer) obj2;
        if (num != null) {
            i7 = num.intValue();
        }
        int max = Math.max(m93Var.d + r03, r0);
        int i10 = m93Var.b;
        int i11 = (int) (j2 & 4294967295L);
        int i12 = (i10 - i11) + r03;
        int i13 = (i10 - (i11 / 2)) + r03;
        int i14 = (int) (j & 4294967295L);
        w0 w0Var = new w0(new Integer[]{Integer.valueOf(max), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf((i14 - i11) - r0)});
        while (true) {
            if (!w0Var.hasNext()) {
                break;
            }
            Object next = w0Var.next();
            int intValue2 = ((Number) next).intValue();
            if (intValue2 >= r0 && intValue2 + i11 <= i14 - r0) {
                obj = next;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            i12 = num2.intValue();
        }
        this.c.o(m93Var, new m93(i7, i12, i6 + i7, i11 + i12));
        return (i7 << 32) | (i12 & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp1)) {
            return false;
        }
        wp1 wp1Var = (wp1) obj;
        if (this.a == wp1Var.a && nb3.k(this.b, wp1Var.b) && nb3.k(this.c, wp1Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) rm1.a(this.a)) + ", density=" + this.b + ", onPositionCalculated=" + this.c + ')';
    }
}
