package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nn  reason: default package */
/* loaded from: classes.dex */
public final class nn implements tv3 {
    public final xn a;
    public boolean b;

    public nn(xn xnVar) {
        this.a = xnVar;
    }

    @Override // defpackage.tv3
    public final int a(s43 s43Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int f = ((mv3) list.get(0)).f(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int f2 = ((mv3) list.get(i2)).f(i);
                if (f2 > f) {
                    f = f2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return f;
    }

    @Override // defpackage.tv3
    public final int b(s43 s43Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int e0 = ((mv3) list.get(0)).e0(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int e02 = ((mv3) list.get(i2)).e0(i);
                if (e02 > e0) {
                    e0 = e02;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return e0;
    }

    @Override // defpackage.tv3
    public final uv3 f(vv3 vv3Var, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            yn4 c = ((mv3) list.get(i3)).c(j);
            i = Math.max(i, c.A);
            i2 = Math.max(i2, c.B);
            arrayList.add(c);
        }
        boolean w = vv3Var.w();
        xn xnVar = this.a;
        if (w) {
            this.b = true;
            xnVar.b.setValue(new i33((i2 & 4294967295L) | (i << 32)));
        } else if (!this.b) {
            xnVar.b.setValue(new i33((i2 & 4294967295L) | (i << 32)));
        }
        return vv3Var.s0(i, i2, qp1.A, new vf(2, arrayList));
    }

    @Override // defpackage.tv3
    public final int g(s43 s43Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int g0 = ((mv3) list.get(0)).g0(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int g02 = ((mv3) list.get(i2)).g0(i);
                if (g02 > g0) {
                    g0 = g02;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return g0;
    }

    @Override // defpackage.tv3
    public final int i(s43 s43Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int T = ((mv3) list.get(0)).T(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int T2 = ((mv3) list.get(i2)).T(i);
                if (T2 > T) {
                    T = T2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return T;
    }
}
