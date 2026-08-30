package defpackage;

import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sr5  reason: default package */
/* loaded from: classes.dex */
public final class sr5 implements tv3, pr5 {
    public final nt a;
    public final i20 b;

    public sr5(nt ntVar, i20 i20Var) {
        this.a = ntVar;
        this.b = i20Var;
    }

    @Override // defpackage.tv3
    public final int a(s43 s43Var, List list, int i) {
        int round;
        int i2;
        int i3;
        int Y = s43Var.Y(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * Y, i);
        int size = list.size();
        int i4 = 0;
        float f = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            mv3 mv3Var = (mv3) list.get(i5);
            float M = oo2.M(oo2.K(mv3Var));
            if (M == RecyclerView.A1) {
                if (i == Integer.MAX_VALUE) {
                    i3 = Integer.MAX_VALUE;
                } else {
                    i3 = i - min;
                }
                int min2 = Math.min(mv3Var.e0(Preference.DEFAULT_ORDER), i3);
                min += min2;
                i4 = Math.max(i4, mv3Var.f(min2));
            } else if (M > RecyclerView.A1) {
                f += M;
            }
        }
        if (f == RecyclerView.A1) {
            round = 0;
        } else if (i == Integer.MAX_VALUE) {
            round = Integer.MAX_VALUE;
        } else {
            round = Math.round(Math.max(i - min, 0) / f);
        }
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            mv3 mv3Var2 = (mv3) list.get(i6);
            float M2 = oo2.M(oo2.K(mv3Var2));
            if (M2 > RecyclerView.A1) {
                if (round != Integer.MAX_VALUE) {
                    i2 = Math.round(round * M2);
                } else {
                    i2 = Integer.MAX_VALUE;
                }
                i4 = Math.max(i4, mv3Var2.f(i2));
            }
        }
        return i4;
    }

    @Override // defpackage.tv3
    public final int b(s43 s43Var, List list, int i) {
        int Y = s43Var.Y(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            mv3 mv3Var = (mv3) list.get(i4);
            float M = oo2.M(oo2.K(mv3Var));
            int e0 = mv3Var.e0(i);
            if (M == RecyclerView.A1) {
                i3 += e0;
            } else if (M > RecyclerView.A1) {
                f += M;
                i2 = Math.max(i2, Math.round(e0 / M));
            }
        }
        return ((list.size() - 1) * Y) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.pr5
    public final void c(int i, int[] iArr, int[] iArr2, vv3 vv3Var) {
        this.a.g(vv3Var, i, iArr, vv3Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.pr5
    public final long d(int i, int i2, int i3, boolean z) {
        if (!z) {
            return nz0.a(i, i2, 0, i3);
        }
        return w81.m(i, i2, 0, i3);
    }

    @Override // defpackage.pr5
    public final int e(yn4 yn4Var) {
        return yn4Var.B;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sr5) {
                sr5 sr5Var = (sr5) obj;
                if (!this.a.equals(sr5Var.a) || !b53.x(this.b, sr5Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.tv3
    public final uv3 f(vv3 vv3Var, List list, long j) {
        return ep2.A(this, lz0.j(j), lz0.i(j), lz0.h(j), lz0.g(j), vv3Var.Y(this.a.a()), vv3Var, list, new yn4[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.tv3
    public final int g(s43 s43Var, List list, int i) {
        int round;
        int i2;
        int i3;
        int Y = s43Var.Y(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * Y, i);
        int size = list.size();
        int i4 = 0;
        float f = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            mv3 mv3Var = (mv3) list.get(i5);
            float M = oo2.M(oo2.K(mv3Var));
            if (M == RecyclerView.A1) {
                if (i == Integer.MAX_VALUE) {
                    i3 = Integer.MAX_VALUE;
                } else {
                    i3 = i - min;
                }
                int min2 = Math.min(mv3Var.e0(Preference.DEFAULT_ORDER), i3);
                min += min2;
                i4 = Math.max(i4, mv3Var.g0(min2));
            } else if (M > RecyclerView.A1) {
                f += M;
            }
        }
        if (f == RecyclerView.A1) {
            round = 0;
        } else if (i == Integer.MAX_VALUE) {
            round = Integer.MAX_VALUE;
        } else {
            round = Math.round(Math.max(i - min, 0) / f);
        }
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            mv3 mv3Var2 = (mv3) list.get(i6);
            float M2 = oo2.M(oo2.K(mv3Var2));
            if (M2 > RecyclerView.A1) {
                if (round != Integer.MAX_VALUE) {
                    i2 = Math.round(round * M2);
                } else {
                    i2 = Integer.MAX_VALUE;
                }
                i4 = Math.max(i4, mv3Var2.g0(i2));
            }
        }
        return i4;
    }

    @Override // defpackage.pr5
    public final int h(yn4 yn4Var) {
        return yn4Var.A;
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.tv3
    public final int i(s43 s43Var, List list, int i) {
        int Y = s43Var.Y(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            mv3 mv3Var = (mv3) list.get(i4);
            float M = oo2.M(oo2.K(mv3Var));
            int T = mv3Var.T(i);
            if (M == RecyclerView.A1) {
                i3 += T;
            } else if (M > RecyclerView.A1) {
                f += M;
                i2 = Math.max(i2, Math.round(T / M));
            }
        }
        return ((list.size() - 1) * Y) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.pr5
    public final uv3 j(yn4[] yn4VarArr, vv3 vv3Var, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        return vv3Var.s0(i, i2, qp1.A, new ce1(yn4VarArr, this, i2, iArr, 3));
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ')';
    }
}
