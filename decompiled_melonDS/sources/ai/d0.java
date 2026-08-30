package ai;

import g2.g6;
import java.util.WeakHashMap;
import l1.c2;
import l1.d1;
import l1.r1;
import l1.v1;
import mc.r;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.domain.model.DSiWareTitle;
import n2.t2;
import ve.d;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements mc.p {
    public final /* synthetic */ int A = 2;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ mc.a R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ d0(b3.p pVar, d1 d1Var, zh.y yVar, mc.p pVar2, mc.a aVar, mc.l lVar, int i2) {
        this.B = pVar;
        this.X = d1Var;
        this.L = yVar;
        this.Z = pVar2;
        this.R = aVar;
        this.Y = lVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        n2.r rVar;
        int i2 = this.A;
        b3.m mVar = b3.m.f1770a;
        n2.e eVar = n2.l.f9953a;
        boolean z12 = false;
        yb.y yVar = yb.y.f14813a;
        Object obj3 = this.L;
        Object obj4 = this.Z;
        Object obj5 = this.Y;
        Object obj6 = this.X;
        Object obj7 = this.B;
        switch (i2) {
            case 0:
                ze.a aVar = (ze.a) obj7;
                q1.a0 a0Var = (q1.a0) obj6;
                g3.z zVar = (g3.z) obj3;
                mc.l lVar = (mc.l) obj5;
                mc.l lVar2 = (mc.l) obj4;
                n2.m mVar2 = (n2.m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar2 = (n2.r) mVar2;
                if (rVar2.O(intValue & 1, z10)) {
                    b3.p b10 = r1.b(mVar, 1.0f);
                    boolean f8 = rVar2.f(lVar) | rVar2.h(aVar);
                    Object L = rVar2.L();
                    if (f8 || L == eVar) {
                        L = new a3.e(2, lVar, aVar);
                        rVar2.h0(L);
                    }
                    n.t(b10, aVar, a0Var, zVar, (mc.a) L, this.R, lVar2, rVar2, 3078);
                } else {
                    rVar2.R();
                }
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                ze.a aVar2 = (ze.a) obj7;
                g3.z zVar2 = (g3.z) obj3;
                mc.a aVar3 = (mc.a) obj4;
                q1.a0 a0Var2 = (q1.a0) obj6;
                mc.l lVar3 = (mc.l) obj5;
                n2.m mVar3 = (n2.m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n2.r rVar3 = (n2.r) mVar3;
                if (rVar3.O(intValue2 & 1, z11)) {
                    WeakHashMap weakHashMap = c2.f8518w;
                    v1 v1Var = l1.s.f(rVar3).f8530l;
                    int i10 = l1.c.f8512h;
                    b3.p C = l1.c.C(mVar, new l1.y0(v1Var, 15 | 16));
                    l1.w a10 = l1.u.a(l1.i.f8573c, b3.c.f1758g0, rVar3, 0);
                    int hashCode = Long.hashCode(rVar3.T);
                    v2.g l10 = rVar3.l();
                    b3.p c4 = b3.a.c(C, rVar3);
                    a4.h.f220a.getClass();
                    a4.f0 f0Var = a4.g.f212b;
                    rVar3.b0();
                    if (rVar3.S) {
                        rVar3.k(f0Var);
                    } else {
                        rVar3.k0();
                    }
                    n2.s.C(a10, a4.g.f215e, rVar3);
                    n2.s.C(l10, a4.g.f214d, rVar3);
                    n2.s.u(rVar3, Integer.valueOf(hashCode), a4.g.f216f);
                    n2.s.y(rVar3, a4.g.f217g);
                    n2.s.C(c4, a4.g.f213c, rVar3);
                    int i11 = l0.f.j(rVar3, 1).f9198a.f7028a;
                    mc.a aVar4 = this.R;
                    if (i11 >= 600) {
                        rVar3.X(1014424919);
                        rVar = rVar3;
                        n.d(aVar2, zVar2, aVar4, aVar3, rVar, 6);
                        rVar.p(false);
                    } else {
                        rVar = rVar3;
                        rVar.X(1014720504);
                        n.n(aVar2, zVar2, aVar4, aVar3, rVar, 0);
                        rVar.p(false);
                    }
                    b3.p b11 = r1.b(mVar, 1.0f);
                    int k10 = a0Var2.k();
                    t2 t2Var = g2.m0.f5257a;
                    g6.a(k10, b11, ((g2.l0) rVar.j(t2Var)).j(), ((g2.l0) rVar.j(t2Var)).f(), v2.h.c(-1113119585, new q0(0, a0Var2), rVar), null, v2.h.c(-530000225, new r0(0, a0Var2, lVar3), rVar), rVar, 1597488);
                    rVar.p(true);
                } else {
                    rVar3.R();
                }
                return yVar;
            case 2:
                ((Integer) obj2).getClass();
                n.u((b3.p) obj7, (d1) obj6, (zh.y) obj3, (mc.p) obj4, this.R, (mc.l) obj5, (n2.m) obj, n2.s.F(1));
                return yVar;
            case 3:
                final mc.r rVar4 = (mc.r) obj7;
                final n2.w0 w0Var = (n2.w0) obj6;
                final n2.w0 w0Var2 = (n2.w0) obj3;
                final n2.w0 w0Var3 = (n2.w0) obj5;
                final n2.b1 b1Var = (n2.b1) obj4;
                n2.m mVar4 = (n2.m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z12 = true;
                }
                n2.r rVar5 = (n2.r) mVar4;
                if (rVar5.O(intValue3 & 1, z12)) {
                    p7.l.d(l0.f.I(rVar5, R.string.cancel), false, this.R, rVar5, 0, 2);
                    String I = l0.f.I(rVar5, R.string.ok);
                    boolean f10 = rVar5.f(rVar4) | rVar5.f(w0Var) | rVar5.f(w0Var2) | rVar5.f(w0Var3) | rVar5.f(b1Var);
                    Object L2 = rVar5.L();
                    if (f10 || L2 == eVar) {
                        mc.a aVar5 = new mc.a() { // from class: th.c
                            @Override // mc.a
                            public final Object b() {
                                Boolean bool = (Boolean) w0Var3.getValue();
                                bool.booleanValue();
                                Integer valueOf = Integer.valueOf(pc.a.M(b1Var.g()));
                                r.this.r((String) w0Var.getValue(), (d) w0Var2.getValue(), bool, valueOf);
                                return y.f14813a;
                            }
                        };
                        rVar5.h0(aVar5);
                        L2 = aVar5;
                    }
                    p7.l.d(I, false, (mc.a) L2, rVar5, 0, 2);
                } else {
                    rVar5.R();
                }
                return yVar;
            case 4:
                ((Integer) obj2).getClass();
                zg.a.a((b3.p) obj7, (DSiWareTitle) obj6, this.R, (mc.l) obj5, (mc.l) obj4, (mc.a) obj3, (n2.m) obj, n2.s.F(7));
                return yVar;
            default:
                ((Integer) obj2).getClass();
                zg.a.l((DSiWareTitle) obj7, (yg.a) obj6, (mc.l) obj5, this.R, (mc.l) obj4, (mc.l) obj3, (n2.m) obj, n2.s.F(1));
                return yVar;
        }
    }

    public /* synthetic */ d0(b3.p pVar, DSiWareTitle dSiWareTitle, mc.a aVar, mc.l lVar, mc.l lVar2, mc.a aVar2, int i2) {
        this.B = pVar;
        this.X = dSiWareTitle;
        this.R = aVar;
        this.Y = lVar;
        this.Z = lVar2;
        this.L = aVar2;
    }

    public /* synthetic */ d0(mc.a aVar, mc.r rVar, n2.w0 w0Var, n2.w0 w0Var2, n2.w0 w0Var3, n2.b1 b1Var) {
        this.R = aVar;
        this.B = rVar;
        this.X = w0Var;
        this.L = w0Var2;
        this.Y = w0Var3;
        this.Z = b1Var;
    }

    public /* synthetic */ d0(DSiWareTitle dSiWareTitle, yg.a aVar, mc.l lVar, mc.a aVar2, mc.l lVar2, mc.l lVar3, int i2) {
        this.B = dSiWareTitle;
        this.X = aVar;
        this.Y = lVar;
        this.R = aVar2;
        this.Z = lVar2;
        this.L = lVar3;
    }

    public /* synthetic */ d0(ze.a aVar, g3.z zVar, mc.a aVar2, mc.a aVar3, q1.a0 a0Var, mc.l lVar) {
        this.B = aVar;
        this.L = zVar;
        this.R = aVar2;
        this.Z = aVar3;
        this.X = a0Var;
        this.Y = lVar;
    }

    public /* synthetic */ d0(ze.a aVar, q1.b bVar, g3.z zVar, mc.l lVar, mc.a aVar2, mc.l lVar2) {
        this.B = aVar;
        this.X = bVar;
        this.L = zVar;
        this.Y = lVar;
        this.R = aVar2;
        this.Z = lVar2;
    }
}
