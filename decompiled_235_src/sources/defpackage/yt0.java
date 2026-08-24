package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yt0  reason: default package */
/* loaded from: classes.dex */
public final class yt0 implements e34, i26 {
    public final iu a;
    public final c40 b;

    public yt0(iu iuVar, c40 c40Var) {
        this.a = iuVar;
        this.b = c40Var;
    }

    @Override // defpackage.e34
    public final int a(eb3 eb3Var, List list, int i) {
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
                int min2 = Math.min(x24Var.c(Integer.MAX_VALUE), i3);
                min += min2;
                i4 = Math.max(i4, x24Var.u(min2));
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
                i4 = Math.max(i4, x24Var2.u(i2));
            }
        }
        return i4;
    }

    @Override // defpackage.i26
    public final void b(int i, int[] iArr, int[] iArr2, g34 g34Var) {
        this.a.g(g34Var, i, iArr, iArr2);
    }

    @Override // defpackage.i26
    public final long c(int i, int i2, int i3, boolean z) {
        if (!z) {
            return s21.a(0, i3, i, i2);
        }
        return nb3.s(0, i3, i, i2);
    }

    @Override // defpackage.e34
    public final f34 d(g34 g34Var, List list, long j) {
        return yh2.C(this, q21.i(j), q21.j(j), q21.g(j), q21.h(j), g34Var.r0(this.a.a()), g34Var, list, new dx4[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.e34
    public final int e(eb3 eb3Var, List list, int i) {
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
                int min2 = Math.min(x24Var.c(Integer.MAX_VALUE), i3);
                min += min2;
                i4 = Math.max(i4, x24Var.n(min2));
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
                i4 = Math.max(i4, x24Var2.n(i2));
            }
        }
        return i4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yt0) {
                yt0 yt0Var = (yt0) obj;
                if (!this.a.equals(yt0Var.a) || !nb3.k(this.b, yt0Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.i26
    public final f34 f(final dx4[] dx4VarArr, final g34 g34Var, final int[] iArr, int i, final int i2, int[] iArr2, int i3, int i4, int i5) {
        return g34Var.K(i2, i, zt1.A, new qn2() { // from class: xt0
            @Override // defpackage.qn2
            public final Object g(Object obj) {
                j26 j26Var;
                int a;
                cx4 cx4Var = (cx4) obj;
                dx4[] dx4VarArr2 = dx4VarArr;
                int length = dx4VarArr2.length;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length) {
                    dx4 dx4Var = dx4VarArr2[i6];
                    int i8 = i7 + 1;
                    dx4Var.getClass();
                    Object B = dx4Var.B();
                    lb4 lb4Var = null;
                    if (B instanceof j26) {
                        j26Var = (j26) B;
                    } else {
                        j26Var = null;
                    }
                    kk3 layoutDirection = g34Var.getLayoutDirection();
                    if (j26Var != null) {
                        lb4Var = j26Var.c;
                    }
                    int i9 = i2;
                    if (lb4Var != null) {
                        a = lb4Var.m(i9, dx4Var.A, layoutDirection);
                    } else {
                        a = this.b.a(dx4Var.A, i9, layoutDirection);
                    }
                    cx4.j(cx4Var, dx4Var, a, iArr[i7]);
                    i6++;
                    i7 = i8;
                }
                return jg7.a;
            }
        });
    }

    @Override // defpackage.e34
    public final int g(eb3 eb3Var, List list, int i) {
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
            int c = x24Var.c(i);
            if (v == RecyclerView.B1) {
                i3 += c;
            } else if (v > RecyclerView.B1) {
                f += v;
                i2 = Math.max(i2, Math.round(c / v));
            }
        }
        return ((list.size() - 1) * r0) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.i26
    public final int h(dx4 dx4Var) {
        return dx4Var.A;
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.e34
    public final int i(eb3 eb3Var, List list, int i) {
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
            int V = x24Var.V(i);
            if (v == RecyclerView.B1) {
                i3 += V;
            } else if (v > RecyclerView.B1) {
                f += v;
                i2 = Math.max(i2, Math.round(V / v));
            }
        }
        return ((list.size() - 1) * r0) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.i26
    public final int j(dx4 dx4Var) {
        return dx4Var.B;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ')';
    }
}
