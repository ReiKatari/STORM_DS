package l1;

import androidx.preference.Preference;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w implements y3.v0, k1 {

    /* renamed from: a  reason: collision with root package name */
    public final h f8638a;

    /* renamed from: b  reason: collision with root package name */
    public final b3.f f8639b;

    public w(h hVar, b3.f fVar) {
        this.f8638a = hVar;
        this.f8639b = fVar;
    }

    @Override // y3.v0
    public final y3.w0 a(y3.x0 x0Var, List list, long j2) {
        return c.p(this, x4.a.i(j2), x4.a.j(j2), x4.a.g(j2), x4.a.h(j2), x0Var.O(this.f8638a.a()), x0Var, list, new y3.i1[list.size()], list.size());
    }

    @Override // l1.k1
    public final int b(y3.i1 i1Var) {
        return i1Var.B;
    }

    @Override // y3.v0
    public final int c(y3.v vVar, List list, int i2) {
        int O = vVar.O(this.f8638a.a());
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
            int h02 = u0Var.h0(i2);
            if (m == 0.0f) {
                i11 += h02;
            } else if (m > 0.0f) {
                f8 += m;
                i10 = Math.max(i10, Math.round(h02 / m));
            }
        }
        return ((list.size() - 1) * O) + Math.round(i10 * f8) + i11;
    }

    @Override // y3.v0
    public final int d(y3.v vVar, List list, int i2) {
        int round;
        int i10;
        int i11;
        int O = vVar.O(this.f8638a.a());
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
                int min2 = Math.min(u0Var.g(Preference.DEFAULT_ORDER), i11);
                min += min2;
                i12 = Math.max(i12, u0Var.g0(min2));
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
                i12 = Math.max(i12, u0Var2.g0(i10));
            }
        }
        return i12;
    }

    @Override // l1.k1
    public final long e(int i2, int i10, int i11, boolean z10) {
        if (!z10) {
            return x4.b.a(0, i11, i2, i10);
        }
        return p7.k.m(0, i11, i2, i10);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w) {
                w wVar = (w) obj;
                if (!nc.k.a(this.f8638a, wVar.f8638a) || !this.f8639b.equals(wVar.f8639b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // l1.k1
    public final y3.w0 f(final y3.i1[] i1VarArr, final y3.x0 x0Var, final int[] iArr, int i2, final int i10) {
        return x0Var.u0(i10, i2, zb.r.A, new mc.l() { // from class: l1.v
            @Override // mc.l
            public final Object k(Object obj) {
                l1 l1Var;
                int a10;
                y3.h1 h1Var = (y3.h1) obj;
                y3.i1[] i1VarArr2 = i1VarArr;
                int length = i1VarArr2.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length) {
                    y3.i1 i1Var = i1VarArr2[i11];
                    int i13 = i12 + 1;
                    i1Var.getClass();
                    Object n10 = i1Var.n();
                    c cVar = null;
                    if (n10 instanceof l1) {
                        l1Var = (l1) n10;
                    } else {
                        l1Var = null;
                    }
                    x4.m layoutDirection = x0Var.getLayoutDirection();
                    if (l1Var != null) {
                        cVar = l1Var.f8585c;
                    }
                    int i14 = i10;
                    if (cVar != null) {
                        a10 = cVar.g(i14, layoutDirection, i1Var);
                    } else {
                        a10 = this.f8639b.a(i1Var.A, i14, layoutDirection);
                    }
                    y3.h1.k(h1Var, i1Var, a10, iArr[i12]);
                    i11++;
                    i12 = i13;
                }
                return yb.y.f14813a;
            }
        });
    }

    @Override // y3.v0
    public final int g(y3.v vVar, List list, int i2) {
        int round;
        int i10;
        int i11;
        int O = vVar.O(this.f8638a.a());
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
                int min2 = Math.min(u0Var.g(Preference.DEFAULT_ORDER), i11);
                min += min2;
                i12 = Math.max(i12, u0Var.b0(min2));
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
                i12 = Math.max(i12, u0Var2.b0(i10));
            }
        }
        return i12;
    }

    @Override // l1.k1
    public final int h(y3.i1 i1Var) {
        return i1Var.A;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8639b.f1763a) + (this.f8638a.hashCode() * 31);
    }

    @Override // l1.k1
    public final void i(int i2, y3.x0 x0Var, int[] iArr, int[] iArr2) {
        this.f8638a.b(i2, x0Var, iArr, iArr2);
    }

    @Override // y3.v0
    public final int j(y3.v vVar, List list, int i2) {
        int O = vVar.O(this.f8638a.a());
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
            int g10 = u0Var.g(i2);
            if (m == 0.0f) {
                i11 += g10;
            } else if (m > 0.0f) {
                f8 += m;
                i10 = Math.max(i10, Math.round(g10 / m));
            }
        }
        return ((list.size() - 1) * O) + Math.round(i10 * f8) + i11;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f8638a + ", horizontalAlignment=" + this.f8639b + ')';
    }
}
