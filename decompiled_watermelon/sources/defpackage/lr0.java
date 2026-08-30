package defpackage;

import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lr0  reason: default package */
/* loaded from: classes.dex */
public final class lr0 implements tv3, pr5 {
    public final qt a;
    public final h20 b;

    public lr0(qt qtVar, h20 h20Var) {
        this.a = qtVar;
        this.b = h20Var;
    }

    @Override // defpackage.tv3
    public final int a(s43 s43Var, List list, int i) {
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
            int f2 = mv3Var.f(i);
            if (M == RecyclerView.A1) {
                i3 += f2;
            } else if (M > RecyclerView.A1) {
                f += M;
                i2 = Math.max(i2, Math.round(f2 / M));
            }
        }
        return ((list.size() - 1) * Y) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.tv3
    public final int b(s43 s43Var, List list, int i) {
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
                int min2 = Math.min(mv3Var.f(Preference.DEFAULT_ORDER), i3);
                min += min2;
                i4 = Math.max(i4, mv3Var.e0(min2));
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
                i4 = Math.max(i4, mv3Var2.e0(i2));
            }
        }
        return i4;
    }

    @Override // defpackage.pr5
    public final void c(int i, int[] iArr, int[] iArr2, vv3 vv3Var) {
        this.a.i(vv3Var, i, iArr, iArr2);
    }

    @Override // defpackage.pr5
    public final long d(int i, int i2, int i3, boolean z) {
        if (!z) {
            return nz0.a(0, i3, i, i2);
        }
        return w81.l(0, i3, i, i2);
    }

    @Override // defpackage.pr5
    public final int e(yn4 yn4Var) {
        return yn4Var.A;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lr0) {
                lr0 lr0Var = (lr0) obj;
                if (!this.a.equals(lr0Var.a) || !this.b.equals(lr0Var.b)) {
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
        return ep2.A(this, lz0.i(j), lz0.j(j), lz0.g(j), lz0.h(j), vv3Var.Y(this.a.a()), vv3Var, list, new yn4[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.tv3
    public final int g(s43 s43Var, List list, int i) {
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
            int g0 = mv3Var.g0(i);
            if (M == RecyclerView.A1) {
                i3 += g0;
            } else if (M > RecyclerView.A1) {
                f += M;
                i2 = Math.max(i2, Math.round(g0 / M));
            }
        }
        return ((list.size() - 1) * Y) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.pr5
    public final int h(yn4 yn4Var) {
        return yn4Var.B;
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.tv3
    public final int i(s43 s43Var, List list, int i) {
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
                int min2 = Math.min(mv3Var.f(Preference.DEFAULT_ORDER), i3);
                min += min2;
                i4 = Math.max(i4, mv3Var.T(min2));
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
                i4 = Math.max(i4, mv3Var2.T(i2));
            }
        }
        return i4;
    }

    @Override // defpackage.pr5
    public final uv3 j(final yn4[] yn4VarArr, final vv3 vv3Var, final int[] iArr, int i, final int i2, int[] iArr2, int i3, int i4, int i5) {
        return vv3Var.s0(i2, i, qp1.A, new mi2() { // from class: kr0
            @Override // defpackage.mi2
            public final Object n(Object obj) {
                qr5 qr5Var;
                int a;
                xn4 xn4Var = (xn4) obj;
                yn4[] yn4VarArr2 = yn4VarArr;
                int length = yn4VarArr2.length;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length) {
                    yn4 yn4Var = yn4VarArr2[i6];
                    int i8 = i7 + 1;
                    yn4Var.getClass();
                    Object l = yn4Var.l();
                    b53 b53Var = null;
                    if (l instanceof qr5) {
                        qr5Var = (qr5) l;
                    } else {
                        qr5Var = null;
                    }
                    sd3 layoutDirection = vv3Var.getLayoutDirection();
                    if (qr5Var != null) {
                        b53Var = qr5Var.c;
                    }
                    int i9 = i2;
                    if (b53Var != null) {
                        a = b53Var.w(i9, yn4Var.A, layoutDirection);
                    } else {
                        a = this.b.a(yn4Var.A, i9, layoutDirection);
                    }
                    xn4.k(xn4Var, yn4Var, a, iArr[i7]);
                    i6++;
                    i7 = i8;
                }
                return o27.a;
            }
        });
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ')';
    }
}
