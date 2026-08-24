package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zn  reason: default package */
/* loaded from: classes.dex */
public final class zn implements e34 {
    public final ko a;
    public boolean b;

    public zn(ko koVar) {
        this.a = koVar;
    }

    @Override // defpackage.e34
    public final int a(eb3 eb3Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int u = ((x24) list.get(0)).u(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int u2 = ((x24) list.get(i2)).u(i);
                if (u2 > u) {
                    u = u2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return u;
    }

    @Override // defpackage.e34
    public final f34 d(g34 g34Var, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            dx4 y = ((x24) list.get(i3)).y(j);
            i = Math.max(i, y.A);
            i2 = Math.max(i2, y.B);
            arrayList.add(y);
        }
        boolean a0 = g34Var.a0();
        ko koVar = this.a;
        if (a0) {
            this.b = true;
            koVar.b.setValue(new q93((i2 & 4294967295L) | (i << 32)));
        } else if (!this.b) {
            koVar.b.setValue(new q93((i2 & 4294967295L) | (i << 32)));
        }
        return g34Var.K(i, i2, zt1.A, new kg(2, arrayList));
    }

    @Override // defpackage.e34
    public final int e(eb3 eb3Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int n = ((x24) list.get(0)).n(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int n2 = ((x24) list.get(i2)).n(i);
                if (n2 > n) {
                    n = n2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return n;
    }

    @Override // defpackage.e34
    public final int g(eb3 eb3Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int c = ((x24) list.get(0)).c(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int c2 = ((x24) list.get(i2)).c(i);
                if (c2 > c) {
                    c = c2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return c;
    }

    @Override // defpackage.e34
    public final int i(eb3 eb3Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int V = ((x24) list.get(0)).V(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int V2 = ((x24) list.get(i2)).V(i);
                if (V2 > V) {
                    V = V2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return V;
    }
}
