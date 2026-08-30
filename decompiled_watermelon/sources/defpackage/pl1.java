package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pl1  reason: default package */
/* loaded from: classes.dex */
public final class pl1 implements cr4 {
    public final long a;
    public final od1 b;
    public final aj2 c;

    public pl1(long j, od1 od1Var, aj2 aj2Var) {
        this.a = j;
        this.b = od1Var;
        this.c = aj2Var;
    }

    @Override // defpackage.cr4
    public final long a(e33 e33Var, long j, sd3 sd3Var, long j2) {
        int i;
        mu muVar;
        Object obj;
        Object obj2;
        od1 od1Var = this.b;
        int Y = od1Var.Y(48.0f);
        long j3 = this.a;
        int Y2 = od1Var.Y(Float.intBitsToFloat((int) (j3 >> 32)));
        sd3 sd3Var2 = sd3.Ltr;
        if (sd3Var == sd3Var2) {
            i = 1;
        } else {
            i = -1;
        }
        int i2 = Y2 * i;
        int Y3 = od1Var.Y(Float.intBitsToFloat((int) (j3 & 4294967295L)));
        int i3 = e33Var.a;
        int i4 = e33Var.c;
        int i5 = i3 + i2;
        int i6 = (int) (j2 >> 32);
        int i7 = (i4 - i6) + i2;
        int i8 = (int) (j >> 32);
        int i9 = i8 - i6;
        if (sd3Var == sd3Var2) {
            Integer valueOf = Integer.valueOf(i5);
            Integer valueOf2 = Integer.valueOf(i7);
            if (e33Var.a < 0) {
                i9 = 0;
            }
            muVar = new mu(0, new Integer[]{valueOf, valueOf2, Integer.valueOf(i9)});
        } else {
            Integer valueOf3 = Integer.valueOf(i7);
            Integer valueOf4 = Integer.valueOf(i5);
            if (i4 <= i8) {
                i9 = 0;
            }
            muVar = new mu(0, new Integer[]{valueOf3, valueOf4, Integer.valueOf(i9)});
        }
        Iterator it = muVar.iterator();
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
        int max = Math.max(e33Var.d + Y3, Y);
        int i10 = e33Var.b;
        int i11 = (int) (j2 & 4294967295L);
        int i12 = (i10 - i11) + Y3;
        int i13 = (i10 - (i11 / 2)) + Y3;
        int i14 = (int) (j & 4294967295L);
        v0 v0Var = new v0(new Integer[]{Integer.valueOf(max), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf((i14 - i11) - Y)});
        while (true) {
            if (!v0Var.hasNext()) {
                break;
            }
            Object next = v0Var.next();
            int intValue2 = ((Number) next).intValue();
            if (intValue2 >= Y && intValue2 + i11 <= i14 - Y) {
                obj = next;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            i12 = num2.intValue();
        }
        this.c.j(e33Var, new e33(i7, i12, i6 + i7, i11 + i12));
        return (i7 << 32) | (i12 & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl1)) {
            return false;
        }
        pl1 pl1Var = (pl1) obj;
        if (this.a == pl1Var.a && b53.x(this.b, pl1Var.b) && b53.x(this.c, pl1Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) mi1.a(this.a)) + ", density=" + this.b + ", onPositionCalculated=" + this.c + ')';
    }
}
