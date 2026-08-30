package nh;

import c1.e0;
import c1.f0;
import g2.e7;
import g2.f7;
import g2.g7;
import l0.f;
import l1.i;
import l1.p1;
import l1.u;
import l1.w;
import l4.r0;
import mc.p;
import mc.q;
import me.magnum.melonds.R;
import n2.l;
import n2.m;
import n2.r;
import n2.s;
import n2.t2;
import n2.w0;
import p4.j;
import v2.g;
import v2.h;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements q {
    public final /* synthetic */ int A;
    public final /* synthetic */ mh.d B;

    public /* synthetic */ e(mh.d dVar, int i2) {
        this.A = i2;
        this.B = dVar;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        boolean z10;
        int i2;
        switch (this.A) {
            case 0:
                p1 p1Var = (p1) obj;
                m mVar = (m) obj2;
                int intValue = ((Integer) obj3).intValue();
                p1Var.getClass();
                if ((intValue & 6) == 0) {
                    if (((r) mVar).f(p1Var)) {
                        i2 = 4;
                    } else {
                        i2 = 2;
                    }
                    intValue |= i2;
                }
                if ((intValue & 19) != 18) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = (r) mVar;
                boolean O = rVar.O(intValue & 1, z10);
                y yVar = y.f14813a;
                if (O) {
                    Object L = rVar.L();
                    n2.e eVar = l.f9953a;
                    if (L == eVar) {
                        L = s.w(Boolean.FALSE);
                        rVar.h0(L);
                    }
                    w0 w0Var = (w0) L;
                    mh.d dVar = this.B;
                    boolean h2 = rVar.h(dVar);
                    Object L2 = rVar.L();
                    if (h2 || L2 == eVar) {
                        L2 = new mh.m(dVar, w0Var, null, 2);
                        rVar.h0(L2);
                    }
                    s.g(yVar, (p) L2, rVar);
                    e0.c(p1Var, ((Boolean) w0Var.getValue()).booleanValue(), null, null, null, null, h.c(206886649, new e(dVar, 1), rVar), rVar, (intValue & 14) | 1572864);
                } else {
                    rVar.R();
                }
                return yVar;
            default:
                m mVar2 = (m) obj2;
                ((Integer) obj3).getClass();
                ((f0) obj).getClass();
                b3.p x9 = l1.c.x(b3.m.f1770a, 4, 0.0f, 0.0f, 0.0f, 14);
                w a10 = u.a(i.f8573c, b3.c.f1758g0, mVar2, 0);
                r rVar2 = (r) mVar2;
                int hashCode = Long.hashCode(rVar2.T);
                g l10 = rVar2.l();
                b3.p c4 = b3.a.c(x9, mVar2);
                a4.h.f220a.getClass();
                a4.f0 f0Var = a4.g.f212b;
                rVar2.b0();
                if (rVar2.S) {
                    rVar2.k(f0Var);
                } else {
                    rVar2.k0();
                }
                s.C(a10, a4.g.f215e, mVar2);
                s.C(l10, a4.g.f214d, mVar2);
                s.u(mVar2, Integer.valueOf(hashCode), a4.g.f216f);
                s.y(mVar2, a4.g.f217g);
                s.C(c4, a4.g.f213c, mVar2);
                mh.d dVar2 = this.B;
                String str = dVar2.f9678b;
                t2 t2Var = g7.f5161b;
                r rVar3 = (r) mVar2;
                e7.b(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, r0.a(((f7) rVar3.j(t2Var)).f5153l, 0L, 0L, j.Y, null, 0L, 0L, null, 16777211), mVar2, 0, 0, 65534);
                e7.b(f.H(R.string.leaderboard_submission_info, new Object[]{dVar2.f9680d, Integer.valueOf(dVar2.f9681e), Integer.valueOf(dVar2.f9682f)}, mVar2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((f7) rVar3.j(t2Var)).f5153l, mVar2, 0, 0, 65534);
                rVar2.p(true);
                return y.f14813a;
        }
    }
}
