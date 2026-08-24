package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l26  reason: default package */
/* loaded from: classes.dex */
public final class l26 implements e34, i26 {
    public final fu a;
    public final d40 b;

    public l26(fu fuVar, d40 d40Var) {
        this.a = fuVar;
        this.b = d40Var;
    }

    @Override // defpackage.e34
    public final int a(eb3 eb3Var, List list, int i) {
        int r0 = eb3Var.r0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            x24 x24Var = (x24) list.get(i4);
            float v = jx2.v(jx2.t(x24Var));
            int u = x24Var.u(i);
            if (v == RecyclerView.B1) {
                i3 += u;
            } else if (v > RecyclerView.B1) {
                f += v;
                i2 = Math.max(i2, Math.round(u / v));
            }
        }
        return ((list.size() - 1) * r0) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.i26
    public final void b(int i, int[] iArr, int[] iArr2, g34 g34Var) {
        this.a.d(g34Var, i, iArr, g34Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.i26
    public final long c(int i, int i2, int i3, boolean z) {
        if (!z) {
            return s21.a(i, i2, 0, i3);
        }
        return nb3.t(i, i2, 0, i3);
    }

    @Override // defpackage.e34
    public final f34 d(g34 g34Var, List list, long j) {
        return yh2.C(this, q21.j(j), q21.i(j), q21.h(j), q21.g(j), g34Var.r0(this.a.a()), g34Var, list, new dx4[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.e34
    public final int e(eb3 eb3Var, List list, int i) {
        int r0 = eb3Var.r0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            x24 x24Var = (x24) list.get(i4);
            float v = jx2.v(jx2.t(x24Var));
            int n = x24Var.n(i);
            if (v == RecyclerView.B1) {
                i3 += n;
            } else if (v > RecyclerView.B1) {
                f += v;
                i2 = Math.max(i2, Math.round(n / v));
            }
        }
        return ((list.size() - 1) * r0) + Math.round(i2 * f) + i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l26) {
                l26 l26Var = (l26) obj;
                if (!this.a.equals(l26Var.a) || !nb3.k(this.b, l26Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.i26
    public final f34 f(dx4[] dx4VarArr, g34 g34Var, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        return g34Var.K(i, i2, zt1.A, new gi1(dx4VarArr, this, i2, iArr, 3));
    }

    @Override // defpackage.e34
    public final int g(eb3 eb3Var, List list, int i) {
        int round;
        int i2;
        int i3;
        int r0 = eb3Var.r0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * r0, i);
        int size = list.size();
        int i4 = 0;
        float f = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            x24 x24Var = (x24) list.get(i5);
            float v = jx2.v(jx2.t(x24Var));
            if (v == RecyclerView.B1) {
                if (i == Integer.MAX_VALUE) {
                    i3 = Integer.MAX_VALUE;
                } else {
                    i3 = i - min;
                }
                int min2 = Math.min(x24Var.u(Integer.MAX_VALUE), i3);
                min += min2;
                i4 = Math.max(i4, x24Var.c(min2));
            } else if (v > RecyclerView.B1) {
                f += v;
            }
        }
        if (f == RecyclerView.B1) {
            round = 0;
        } else if (i == Integer.MAX_VALUE) {
            round = Integer.MAX_VALUE;
        } else {
            round = Math.round(Math.max(i - min, 0) / f);
        }
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            x24 x24Var2 = (x24) list.get(i6);
            float v2 = jx2.v(jx2.t(x24Var2));
            if (v2 > RecyclerView.B1) {
                if (round != Integer.MAX_VALUE) {
                    i2 = Math.round(round * v2);
                } else {
                    i2 = Integer.MAX_VALUE;
                }
                i4 = Math.max(i4, x24Var2.c(i2));
            }
        }
        return i4;
    }

    @Override // defpackage.i26
    public final int h(dx4 dx4Var) {
        return dx4Var.B;
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.e34
    public final int i(eb3 eb3Var, List list, int i) {
        int round;
        int i2;
        int i3;
        int r0 = eb3Var.r0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * r0, i);
        int size = list.size();
        int i4 = 0;
        float f = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            x24 x24Var = (x24) list.get(i5);
            float v = jx2.v(jx2.t(x24Var));
            if (v == RecyclerView.B1) {
                if (i == Integer.MAX_VALUE) {
                    i3 = Integer.MAX_VALUE;
                } else {
                    i3 = i - min;
                }
                int min2 = Math.min(x24Var.u(Integer.MAX_VALUE), i3);
                min += min2;
                i4 = Math.max(i4, x24Var.V(min2));
            } else if (v > RecyclerView.B1) {
                f += v;
            }
        }
        if (f == RecyclerView.B1) {
            round = 0;
        } else if (i == Integer.MAX_VALUE) {
            round = Integer.MAX_VALUE;
        } else {
            round = Math.round(Math.max(i - min, 0) / f);
        }
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            x24 x24Var2 = (x24) list.get(i6);
            float v2 = jx2.v(jx2.t(x24Var2));
            if (v2 > RecyclerView.B1) {
                if (round != Integer.MAX_VALUE) {
                    i2 = Math.round(round * v2);
                } else {
                    i2 = Integer.MAX_VALUE;
                }
                i4 = Math.max(i4, x24Var2.V(i2));
            }
        }
        return i4;
    }

    @Override // defpackage.i26
    public final int j(dx4 dx4Var) {
        return dx4Var.A;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ')';
    }
}
