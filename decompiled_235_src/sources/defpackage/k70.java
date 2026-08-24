package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k70  reason: default package */
/* loaded from: classes.dex */
public final class k70 implements e34 {
    public final e40 a;
    public final boolean b;

    public k70(e40 e40Var, boolean z) {
        this.a = e40Var;
        this.b = z;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, bh5, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, bh5] */
    @Override // defpackage.e34
    public final f34 d(final g34 g34Var, List list, long j) {
        long j2;
        int i;
        int i2;
        g70 g70Var;
        boolean z;
        g70 g70Var2;
        boolean z2;
        boolean z3;
        int j3;
        int i3;
        boolean z4;
        dx4 y;
        boolean isEmpty = list.isEmpty();
        zt1 zt1Var = zt1.A;
        if (isEmpty) {
            return g34Var.K(q21.j(j), q21.i(j), zt1Var, new bz1(22));
        }
        if (this.b) {
            j2 = j;
        } else {
            j2 = j & (-8589934589L);
        }
        g70 g70Var3 = null;
        boolean z5 = true;
        if (list.size() == 1) {
            final x24 x24Var = (x24) list.get(0);
            Object B = x24Var.B();
            if (B instanceof g70) {
                g70Var3 = (g70) B;
            }
            if (g70Var3 != null) {
                z3 = g70Var3.l0;
            } else {
                z3 = false;
            }
            if (!z3) {
                y = x24Var.y(j2);
                j3 = Math.max(q21.j(j), y.A);
                i3 = Math.max(q21.i(j), y.B);
            } else {
                j3 = q21.j(j);
                i3 = q21.i(j);
                int j4 = q21.j(j);
                int i4 = q21.i(j);
                if (j4 >= 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i4 < 0) {
                    z5 = false;
                }
                if (!(z5 & z4)) {
                    r53.a("width and height must be >= 0");
                }
                y = x24Var.y(s21.h(j4, j4, i4, i4));
            }
            final int i5 = i3;
            final int i6 = j3;
            final dx4 dx4Var = y;
            return g34Var.K(i6, i5, zt1Var, new qn2() { // from class: i70
                @Override // defpackage.qn2
                public final Object g(Object obj) {
                    h70.b((cx4) obj, dx4.this, x24Var, g34Var.getLayoutDirection(), i6, i5, this.a);
                    return jg7.a;
                }
            });
        }
        dx4[] dx4VarArr = new dx4[list.size()];
        ?? obj = new Object();
        obj.A = q21.j(j);
        ?? obj2 = new Object();
        obj2.A = q21.i(j);
        int size = list.size();
        boolean z6 = false;
        for (int i7 = 0; i7 < size; i7++) {
            x24 x24Var2 = (x24) list.get(i7);
            Object B2 = x24Var2.B();
            if (B2 instanceof g70) {
                g70Var2 = (g70) B2;
            } else {
                g70Var2 = null;
            }
            if (g70Var2 != null) {
                z2 = g70Var2.l0;
            } else {
                z2 = false;
            }
            if (!z2) {
                dx4 y2 = x24Var2.y(j2);
                dx4VarArr[i7] = y2;
                obj.A = Math.max(obj.A, y2.A);
                obj2.A = Math.max(obj2.A, y2.B);
            } else {
                z6 = true;
            }
        }
        if (z6) {
            int i8 = obj.A;
            if (i8 != Integer.MAX_VALUE) {
                i = i8;
            } else {
                i = 0;
            }
            int i9 = obj2.A;
            if (i9 != Integer.MAX_VALUE) {
                i2 = i9;
            } else {
                i2 = 0;
            }
            long a = s21.a(i, i8, i2, i9);
            int size2 = list.size();
            for (int i10 = 0; i10 < size2; i10++) {
                x24 x24Var3 = (x24) list.get(i10);
                Object B3 = x24Var3.B();
                if (B3 instanceof g70) {
                    g70Var = (g70) B3;
                } else {
                    g70Var = null;
                }
                if (g70Var != null) {
                    z = g70Var.l0;
                } else {
                    z = false;
                }
                if (z) {
                    dx4VarArr[i10] = x24Var3.y(a);
                }
            }
        }
        return g34Var.K(obj.A, obj2.A, zt1Var, new j70(dx4VarArr, list, g34Var, obj, obj2, this, 0));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k70) {
                k70 k70Var = (k70) obj;
                if (!this.a.equals(k70Var.a) || this.b != k70Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb.append(this.a);
        sb.append(", propagateMinConstraints=");
        return xg6.r(sb, this.b, ')');
    }
}
