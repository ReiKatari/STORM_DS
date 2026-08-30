package l1;

import androidx.preference.Preference;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o1 implements y3.v0, k1 {

    /* renamed from: a  reason: collision with root package name */
    public final f f8593a;

    /* renamed from: b  reason: collision with root package name */
    public final b3.g f8594b;

    public o1(f fVar, b3.g gVar) {
        this.f8593a = fVar;
        this.f8594b = gVar;
    }

    @Override // y3.v0
    public final y3.w0 a(y3.x0 x0Var, List list, long j2) {
        return c.p(this, x4.a.j(j2), x4.a.i(j2), x4.a.h(j2), x4.a.g(j2), x0Var.O(this.f8593a.a()), x0Var, list, new y3.i1[list.size()], list.size());
    }

    @Override // l1.k1
    public final int b(y3.i1 i1Var) {
        return i1Var.A;
    }

    @Override // y3.v0
    public final int c(y3.v vVar, List list, int i2) {
        int round;
        int i10;
        int i11;
        int O = vVar.O(this.f8593a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * O, i2);
        int size = list.size();
        int i12 = 0;
        float f8 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            y3.u0 u0Var = (y3.u0) list.get(i13);
            float m = c.m(c.l(u0Var));
            if (m == 0.0f) {
                if (i2 == Integer.MAX_VALUE) {
                    i11 = Integer.MAX_VALUE;
                } else {
                    i11 = i2 - min;
                }
                int min2 = Math.min(u0Var.g0(Preference.DEFAULT_ORDER), i11);
                min += min2;
                i12 = Math.max(i12, u0Var.h0(min2));
            } else if (m > 0.0f) {
                f8 += m;
            }
        }
        if (f8 == 0.0f) {
            round = 0;
        } else if (i2 == Integer.MAX_VALUE) {
            round = Integer.MAX_VALUE;
        } else {
            round = Math.round(Math.max(i2 - min, 0) / f8);
        }
        int size2 = list.size();
        for (int i14 = 0; i14 < size2; i14++) {
            y3.u0 u0Var2 = (y3.u0) list.get(i14);
            float m10 = c.m(c.l(u0Var2));
            if (m10 > 0.0f) {
                if (round != Integer.MAX_VALUE) {
                    i10 = Math.round(round * m10);
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                i12 = Math.max(i12, u0Var2.h0(i10));
            }
        }
        return i12;
    }

    @Override // y3.v0
    public final int d(y3.v vVar, List list, int i2) {
        int O = vVar.O(this.f8593a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i10 = 0;
        int i11 = 0;
        float f8 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            y3.u0 u0Var = (y3.u0) list.get(i12);
            float m = c.m(c.l(u0Var));
            int g02 = u0Var.g0(i2);
            if (m == 0.0f) {
                i11 += g02;
            } else if (m > 0.0f) {
                f8 += m;
                i10 = Math.max(i10, Math.round(g02 / m));
            }
        }
        return ((list.size() - 1) * O) + Math.round(i10 * f8) + i11;
    }

    @Override // l1.k1
    public final long e(int i2, int i10, int i11, boolean z10) {
        if (!z10) {
            return x4.b.a(i2, i10, 0, i11);
        }
        return p7.k.n(i2, i10, 0, i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        if (nc.k.a(this.f8593a, o1Var.f8593a) && nc.k.a(this.f8594b, o1Var.f8594b)) {
            return true;
        }
        return false;
    }

    @Override // l1.k1
    public final y3.w0 f(y3.i1[] i1VarArr, y3.x0 x0Var, int[] iArr, int i2, int i10) {
        return x0Var.u0(i2, i10, zb.r.A, new n1(i1VarArr, this, i10, iArr));
    }

    @Override // y3.v0
    public final int g(y3.v vVar, List list, int i2) {
        int O = vVar.O(this.f8593a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i10 = 0;
        int i11 = 0;
        float f8 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            y3.u0 u0Var = (y3.u0) list.get(i12);
            float m = c.m(c.l(u0Var));
            int b02 = u0Var.b0(i2);
            if (m == 0.0f) {
                i11 += b02;
            } else if (m > 0.0f) {
                f8 += m;
                i10 = Math.max(i10, Math.round(b02 / m));
            }
        }
        return ((list.size() - 1) * O) + Math.round(i10 * f8) + i11;
    }

    @Override // l1.k1
    public final int h(y3.i1 i1Var) {
        return i1Var.B;
    }

    public final int hashCode() {
        return this.f8594b.hashCode() + (this.f8593a.hashCode() * 31);
    }

    @Override // l1.k1
    public final void i(int i2, y3.x0 x0Var, int[] iArr, int[] iArr2) {
        this.f8593a.c(x0Var, i2, iArr, x0Var.getLayoutDirection(), iArr2);
    }

    @Override // y3.v0
    public final int j(y3.v vVar, List list, int i2) {
        int round;
        int i10;
        int i11;
        int O = vVar.O(this.f8593a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * O, i2);
        int size = list.size();
        int i12 = 0;
        float f8 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            y3.u0 u0Var = (y3.u0) list.get(i13);
            float m = c.m(c.l(u0Var));
            if (m == 0.0f) {
                if (i2 == Integer.MAX_VALUE) {
                    i11 = Integer.MAX_VALUE;
                } else {
                    i11 = i2 - min;
                }
                int min2 = Math.min(u0Var.g0(Preference.DEFAULT_ORDER), i11);
                min += min2;
                i12 = Math.max(i12, u0Var.g(min2));
            } else if (m > 0.0f) {
                f8 += m;
            }
        }
        if (f8 == 0.0f) {
            round = 0;
        } else if (i2 == Integer.MAX_VALUE) {
            round = Integer.MAX_VALUE;
        } else {
            round = Math.round(Math.max(i2 - min, 0) / f8);
        }
        int size2 = list.size();
        for (int i14 = 0; i14 < size2; i14++) {
            y3.u0 u0Var2 = (y3.u0) list.get(i14);
            float m10 = c.m(c.l(u0Var2));
            if (m10 > 0.0f) {
                if (round != Integer.MAX_VALUE) {
                    i10 = Math.round(round * m10);
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                i12 = Math.max(i12, u0Var2.g(i10));
            }
        }
        return i12;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f8593a + ", verticalAlignment=" + this.f8594b + ')';
    }
}
