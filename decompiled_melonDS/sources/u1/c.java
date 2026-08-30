package u1;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final yb.j f13288a;

    static {
        zb.q qVar = zb.q.A;
        f13288a = new yb.j(qVar, qVar);
    }

    public static final void a(l4.h hVar, List list, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-1794596951);
        if ((i2 & 6) == 0) {
            if (rVar.f(hVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i12 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.h(list)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i10 & 1, z10)) {
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                l4.f fVar = (l4.f) list.get(i13);
                mc.q qVar = (mc.q) fVar.f8790a;
                int i14 = fVar.f8791b;
                int i15 = fVar.f8792c;
                Object L = rVar.L();
                if (L == n2.l.f9953a) {
                    L = b.f13280b;
                    rVar.h0(L);
                }
                y3.v0 v0Var = (y3.v0) L;
                int hashCode = Long.hashCode(rVar.T);
                v2.g l10 = rVar.l();
                b3.p c4 = b3.a.c(b3.m.f1770a, rVar);
                a4.h.f220a.getClass();
                a4.f0 f0Var = a4.g.f212b;
                rVar.b0();
                if (rVar.S) {
                    rVar.k(f0Var);
                } else {
                    rVar.k0();
                }
                n2.s.C(v0Var, a4.g.f215e, rVar);
                n2.s.C(l10, a4.g.f214d, rVar);
                n2.s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
                n2.s.y(rVar, a4.g.f217g);
                n2.s.C(c4, a4.g.f213c, rVar);
                qVar.i(hVar.subSequence(i14, i15).B, rVar, 0);
                rVar.p(true);
            }
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new ai.r(hVar, list, i2, 12);
        }
    }
}
