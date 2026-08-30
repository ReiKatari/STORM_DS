package o1;

import h1.n1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d implements p1.q {

    /* renamed from: a  reason: collision with root package name */
    public final t f10502a;

    public d(t tVar) {
        this.f10502a = tVar;
    }

    @Override // p1.q
    public final int a() {
        return this.f10502a.g().f10556p;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    @Override // p1.q
    public final int b() {
        return ((o) zb.l.Z(this.f10502a.g().m)).f10560a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection, java.lang.Object] */
    @Override // p1.q
    public final boolean c() {
        return !this.f10502a.g().m.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List, java.lang.Object] */
    @Override // p1.q
    public final int d() {
        long g10;
        boolean z10;
        int i2;
        int i10;
        int i11;
        boolean z11;
        long j2;
        t tVar = this.f10502a;
        int i12 = 0;
        if (tVar.g().m.isEmpty()) {
            return 0;
        }
        n g11 = tVar.g();
        n1 n1Var = g11.f10557q;
        n1 n1Var2 = n1.Vertical;
        if (n1Var == n1Var2) {
            g10 = g11.g() & 4294967295L;
        } else {
            g10 = g11.g() >> 32;
        }
        int i13 = (int) g10;
        n g12 = tVar.g();
        n1 n1Var3 = g12.f10557q;
        ?? r92 = g12.m;
        if (n1Var3 == n1Var2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!r92.isEmpty()) {
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (i14 < r92.size()) {
                o oVar = (o) r92.get(i14);
                if (z10) {
                    i10 = oVar.f10574p;
                } else {
                    i10 = oVar.f10575q;
                }
                if (i10 == -1) {
                    i14++;
                } else {
                    int i17 = i12;
                    while (i14 < r92.size()) {
                        o oVar2 = (o) r92.get(i14);
                        if (z10) {
                            i11 = oVar2.f10574p;
                        } else {
                            i11 = oVar2.f10575q;
                        }
                        if (i11 != i10) {
                            break;
                        }
                        if (z10) {
                            z11 = z10;
                            j2 = ((o) r92.get(i14)).f10572n & 4294967295L;
                        } else {
                            z11 = z10;
                            j2 = ((o) r92.get(i14)).f10572n >> 32;
                        }
                        i17 = Math.max(i17, (int) j2);
                        i14++;
                        z10 = z11;
                    }
                    i15 += i17;
                    i16++;
                    z10 = z10;
                    i12 = 0;
                }
            }
            i12 = (i15 / i16) + g12.f10559s;
        }
        if (i12 == 0 || (i2 = i13 / i12) < 1) {
            return 1;
        }
        return i2;
    }

    @Override // p1.q
    public final int e() {
        return this.f10502a.f10592d.f9834b.g();
    }
}
