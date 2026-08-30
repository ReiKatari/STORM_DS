package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g50  reason: default package */
/* loaded from: classes.dex */
public final class g50 implements tv3 {
    public final j20 a;
    public final boolean b;

    public g50(j20 j20Var, boolean z) {
        this.a = j20Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g50) {
                g50 g50Var = (g50) obj;
                if (!this.a.equals(g50Var.a) || this.b != g50Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, l75, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, l75] */
    @Override // defpackage.tv3
    public final uv3 f(final vv3 vv3Var, List list, long j) {
        long j2;
        int i;
        int i2;
        c50 c50Var;
        boolean z;
        c50 c50Var2;
        boolean z2;
        boolean z3;
        int j3;
        int i3;
        boolean z4;
        yn4 c;
        boolean isEmpty = list.isEmpty();
        qp1 qp1Var = qp1.A;
        if (isEmpty) {
            return vv3Var.s0(lz0.j(j), lz0.i(j), qp1Var, new qu1(11));
        }
        if (this.b) {
            j2 = j;
        } else {
            j2 = j & (-8589934589L);
        }
        c50 c50Var3 = null;
        boolean z5 = true;
        if (list.size() == 1) {
            final mv3 mv3Var = (mv3) list.get(0);
            Object l = mv3Var.l();
            if (l instanceof c50) {
                c50Var3 = (c50) l;
            }
            if (c50Var3 != null) {
                z3 = c50Var3.k0;
            } else {
                z3 = false;
            }
            if (!z3) {
                c = mv3Var.c(j2);
                j3 = Math.max(lz0.j(j), c.A);
                i3 = Math.max(lz0.i(j), c.B);
            } else {
                j3 = lz0.j(j);
                i3 = lz0.i(j);
                int j4 = lz0.j(j);
                int i4 = lz0.i(j);
                if (j4 >= 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i4 < 0) {
                    z5 = false;
                }
                if (!(z5 & z4)) {
                    oz2.a("width and height must be >= 0");
                }
                c = mv3Var.c(nz0.h(j4, j4, i4, i4));
            }
            final int i5 = i3;
            final int i6 = j3;
            final yn4 yn4Var = c;
            return vv3Var.s0(i6, i5, qp1Var, new mi2() { // from class: e50
                @Override // defpackage.mi2
                public final Object n(Object obj) {
                    d50.b((xn4) obj, yn4.this, mv3Var, vv3Var.getLayoutDirection(), i6, i5, this.a);
                    return o27.a;
                }
            });
        }
        yn4[] yn4VarArr = new yn4[list.size()];
        ?? obj = new Object();
        obj.A = lz0.j(j);
        ?? obj2 = new Object();
        obj2.A = lz0.i(j);
        int size = list.size();
        boolean z6 = false;
        for (int i7 = 0; i7 < size; i7++) {
            mv3 mv3Var2 = (mv3) list.get(i7);
            Object l2 = mv3Var2.l();
            if (l2 instanceof c50) {
                c50Var2 = (c50) l2;
            } else {
                c50Var2 = null;
            }
            if (c50Var2 != null) {
                z2 = c50Var2.k0;
            } else {
                z2 = false;
            }
            if (!z2) {
                yn4 c2 = mv3Var2.c(j2);
                yn4VarArr[i7] = c2;
                obj.A = Math.max(obj.A, c2.A);
                obj2.A = Math.max(obj2.A, c2.B);
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
            long a = nz0.a(i, i8, i2, i9);
            int size2 = list.size();
            for (int i10 = 0; i10 < size2; i10++) {
                mv3 mv3Var3 = (mv3) list.get(i10);
                Object l3 = mv3Var3.l();
                if (l3 instanceof c50) {
                    c50Var = (c50) l3;
                } else {
                    c50Var = null;
                }
                if (c50Var != null) {
                    z = c50Var.k0;
                } else {
                    z = false;
                }
                if (z) {
                    yn4VarArr[i10] = mv3Var3.c(a);
                }
            }
        }
        return vv3Var.s0(obj.A, obj2.A, qp1Var, new f50(yn4VarArr, list, vv3Var, obj, obj2, this, 0));
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb.append(this.a);
        sb.append(", propagateMinConstraints=");
        return ej6.h(sb, this.b, ')');
    }
}
