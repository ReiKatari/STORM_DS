package b2;

import a4.f0;
import ai.i0;
import ai.k0;
import ai.o;
import ai.s0;
import b3.m;
import f1.n;
import g2.a0;
import g2.f7;
import g2.l0;
import g2.m0;
import g2.n0;
import g2.r3;
import g2.u3;
import g2.v2;
import i3.z;
import java.util.List;
import java.util.WeakHashMap;
import jg.u;
import l1.c2;
import l1.d0;
import l1.d1;
import l1.r1;
import mc.l;
import mc.p;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n1.x;
import n2.r;
import n2.s;
import n2.s2;
import n2.t2;
import n2.w0;
import u1.o0;
import y3.c0;
import y3.v0;
import yb.y;
import yg.j;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements p {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public /* synthetic */ e(b3.p pVar, List list, l lVar, x xVar, int i2) {
        this.A = 3;
        this.L = pVar;
        this.R = list;
        this.B = lVar;
        this.X = xVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i2 = this.A;
        m mVar = m.f1770a;
        n2.e eVar = n2.l.f9953a;
        boolean z13 = false;
        y yVar = y.f14813a;
        Object obj3 = this.X;
        Object obj4 = this.B;
        Object obj5 = this.R;
        Object obj6 = this.L;
        switch (i2) {
            case 0:
                b3.p pVar = (b3.p) obj6;
                w0 w0Var = (w0) obj5;
                v2.c cVar = (v2.c) obj4;
                d dVar = (d) obj3;
                n2.m mVar2 = (n2.m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = (r) mVar2;
                if (rVar.O(intValue & 1, z10)) {
                    Object L = rVar.L();
                    if (L == eVar) {
                        L = new o(w0Var, 2);
                        rVar.h0(L);
                    }
                    b3.p n10 = c0.n(pVar, (l) L);
                    v0 d4 = l1.p.d(b3.c.A, true);
                    int hashCode = Long.hashCode(rVar.T);
                    v2.g l10 = rVar.l();
                    b3.p c4 = b3.a.c(n10, rVar);
                    a4.h.f220a.getClass();
                    f0 f0Var = a4.g.f212b;
                    rVar.b0();
                    if (rVar.S) {
                        rVar.k(f0Var);
                    } else {
                        rVar.k0();
                    }
                    s.C(d4, a4.g.f215e, rVar);
                    s.C(l10, a4.g.f214d, rVar);
                    s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
                    s.y(rVar, a4.g.f217g);
                    s.C(c4, a4.g.f213c, rVar);
                    cVar.j(rVar, 0);
                    Object L2 = rVar.L();
                    if (L2 == eVar) {
                        L2 = new ai.s(w0Var, 5);
                        rVar.h0(L2);
                    }
                    dVar.b(6, (mc.a) L2, rVar);
                    rVar.p(true);
                } else {
                    rVar.R();
                }
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((Integer) obj2).getClass();
                n0.e((l0) obj6, (f7) obj5, (u3) obj3, (v2.c) obj4, (n2.m) obj, s.F(3073));
                return yVar;
            case 2:
                s2 s2Var = (s2) obj6;
                mc.a aVar = (mc.a) obj5;
                s2 s2Var2 = (s2) obj4;
                u uVar = (u) obj3;
                n2.m mVar3 = (n2.m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                r rVar2 = (r) mVar3;
                if (rVar2.O(intValue2 & 1, z11)) {
                    t2 t2Var = m0.f5257a;
                    b3.p y10 = l1.c.y(n.f(mVar, ((l0) rVar2.j(t2Var)).h(), z.f6703b));
                    v0 d10 = l1.p.d(b3.c.A, false);
                    int hashCode2 = Long.hashCode(rVar2.T);
                    v2.g l11 = rVar2.l();
                    b3.p c10 = b3.a.c(y10, rVar2);
                    a4.h.f220a.getClass();
                    f0 f0Var2 = a4.g.f212b;
                    rVar2.b0();
                    if (rVar2.S) {
                        rVar2.k(f0Var2);
                    } else {
                        rVar2.k0();
                    }
                    s.C(d10, a4.g.f215e, rVar2);
                    s.C(l11, a4.g.f214d, rVar2);
                    s.u(rVar2, Integer.valueOf(hashCode2), a4.g.f216f);
                    s.y(rVar2, a4.g.f217g);
                    s.C(c10, a4.g.f213c, rVar2);
                    long g10 = ((l0) rVar2.j(t2Var)).g();
                    WeakHashMap weakHashMap = c2.f8518w;
                    a0.b(v2.h.c(87600699, new s0(10, s2Var), rVar2), new d0(l1.s.f(rVar2).f8530l, l1.c.e(7)), null, v2.h.c(-2062634498, new k0(6, aVar), rVar2), v2.h.c(1983611111, new ai.v0(5, s2Var2, uVar), rVar2), g10, 0L, 0.0f, rVar2, 27654, 196);
                    rVar2.p(true);
                } else {
                    rVar2.R();
                }
                return yVar;
            case 3:
                ((Integer) obj2).getClass();
                mh.x.b((b3.p) obj6, (List) obj5, (l) obj4, (x) obj3, (n2.m) obj, s.F(7));
                return yVar;
            case 4:
                d1 d1Var = (d1) obj6;
                rg.d dVar2 = (rg.d) obj4;
                l lVar = (l) obj3;
                w0 w0Var2 = (w0) obj5;
                n2.m mVar4 = (n2.m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z13 = true;
                }
                r rVar3 = (r) mVar4;
                if (rVar3.O(intValue3 & 1, z13)) {
                    Object L3 = rVar3.L();
                    if (L3 == eVar) {
                        L3 = new g3.z();
                        rVar3.h0(L3);
                    }
                    g3.z zVar = (g3.z) L3;
                    b3.p k10 = g3.d.k(l1.c.s(r1.b(mVar, 1.0f), d1Var), zVar);
                    q4.x xVar = (q4.x) dVar2.f12717b.getValue();
                    boolean booleanValue = ((Boolean) w0Var2.getValue()).booleanValue();
                    g2.d1 e6 = og.a.e(rVar3);
                    o0 o0Var = (o0) dVar2.f12718c.getValue();
                    boolean f8 = rVar3.f(dVar2);
                    Object L4 = rVar3.L();
                    if (f8 || L4 == eVar) {
                        L4 = new he.g(22, dVar2, w0Var2);
                        rVar3.h0(L4);
                    }
                    u1.n0 n0Var = new u1.n0((l) L4, 62);
                    boolean f10 = rVar3.f(dVar2) | rVar3.f(lVar);
                    Object L5 = rVar3.L();
                    if (f10 || L5 == eVar) {
                        L5 = new ai.c0(dVar2, lVar, w0Var2, 11);
                        rVar3.h0(L5);
                    }
                    v2.b(xVar, (l) L5, k10, false, null, null, booleanValue, null, o0Var, n0Var, false, 0, 0, null, e6, rVar3, 0, 0, 510968);
                    Object L6 = rVar3.L();
                    if (L6 == eVar) {
                        L6 = new i0(zVar, null, 2);
                        rVar3.h0(L6);
                    }
                    s.g(yVar, (p) L6, rVar3);
                } else {
                    rVar3.R();
                }
                return yVar;
            default:
                mc.a aVar2 = (mc.a) obj6;
                j jVar = (j) obj5;
                l lVar2 = (l) obj4;
                p pVar2 = (p) obj3;
                n2.m mVar5 = (n2.m) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                r rVar4 = (r) mVar5;
                if (rVar4.O(intValue4 & 1, z12)) {
                    long j2 = ((l0) rVar4.j(m0.f5257a)).j();
                    WeakHashMap weakHashMap2 = c2.f8518w;
                    r3.b(l1.s.f(rVar4).f8530l, null, null, v2.h.c(264590106, new k0(15, aVar2), rVar4), null, null, null, 0, false, null, 0.0f, 0L, 0L, 0L, j2, 0L, v2.h.c(-1023875647, new zg.m(jVar, lVar2, pVar2, 0), rVar4), rVar4, 3072, 100663296, 196598);
                } else {
                    rVar4.R();
                }
                return yVar;
        }
    }

    public /* synthetic */ e(l0 l0Var, f7 f7Var, u3 u3Var, v2.c cVar, int i2) {
        this.A = 1;
        this.L = l0Var;
        this.R = f7Var;
        this.X = u3Var;
        this.B = cVar;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.A = i2;
        this.L = obj;
        this.R = obj2;
        this.B = obj3;
        this.X = obj4;
    }

    public /* synthetic */ e(d1 d1Var, rg.d dVar, l lVar, w0 w0Var) {
        this.A = 4;
        this.L = d1Var;
        this.B = dVar;
        this.X = lVar;
        this.R = w0Var;
    }
}
