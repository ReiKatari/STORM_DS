package c1;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w implements y3.v0 {

    /* renamed from: a  reason: collision with root package name */
    public final g0 f2537a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2538b;

    public w(g0 g0Var) {
        this.f2537a = g0Var;
    }

    @Override // y3.v0
    public final y3.w0 a(y3.x0 x0Var, List list, long j2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            y3.i1 e6 = ((y3.u0) list.get(i11)).e(j2);
            i2 = Math.max(i2, e6.A);
            i10 = Math.max(i10, e6.B);
            arrayList.add(e6);
        }
        boolean q10 = x0Var.q();
        g0 g0Var = this.f2537a;
        if (q10) {
            this.f2538b = true;
            g0Var.f2424b.setValue(new x4.l((4294967295L & i10) | (i2 << 32)));
        } else if (!this.f2538b) {
            g0Var.f2424b.setValue(new x4.l((4294967295L & i10) | (i2 << 32)));
        }
        return x0Var.u0(i2, i10, zb.r.A, new g(1, arrayList));
    }

    @Override // y3.v0
    public final int c(y3.v vVar, List list, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int h02 = ((y3.u0) list.get(0)).h0(i2);
        int i10 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int h03 = ((y3.u0) list.get(i10)).h0(i2);
                if (h03 > h02) {
                    h02 = h03;
                }
                if (i10 == size) {
                    break;
                }
                i10++;
            }
        }
        return h02;
    }

    @Override // y3.v0
    public final int d(y3.v vVar, List list, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int g02 = ((y3.u0) list.get(0)).g0(i2);
        int i10 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int g03 = ((y3.u0) list.get(i10)).g0(i2);
                if (g03 > g02) {
                    g02 = g03;
                }
                if (i10 == size) {
                    break;
                }
                i10++;
            }
        }
        return g02;
    }

    @Override // y3.v0
    public final int g(y3.v vVar, List list, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int b02 = ((y3.u0) list.get(0)).b0(i2);
        int i10 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int b03 = ((y3.u0) list.get(i10)).b0(i2);
                if (b03 > b02) {
                    b02 = b03;
                }
                if (i10 == size) {
                    break;
                }
                i10++;
            }
        }
        return b02;
    }

    @Override // y3.v0
    public final int j(y3.v vVar, List list, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int g10 = ((y3.u0) list.get(0)).g(i2);
        int i10 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int g11 = ((y3.u0) list.get(i10)).g(i2);
                if (g11 > g10) {
                    g10 = g11;
                }
                if (i10 == size) {
                    break;
                }
                i10++;
            }
        }
        return g10;
    }
}
