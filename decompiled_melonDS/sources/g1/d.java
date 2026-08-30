package g1;

import a4.n;
import ai.r0;
import b3.p;
import b4.b3;
import b4.e2;
import b4.o;
import b4.q1;
import c1.f0;
import f1.k0;
import g2.n0;
import i3.p0;
import java.util.List;
import l1.d1;
import l1.e0;
import l1.r1;
import l4.q0;
import mc.q;
import me.magnum.melonds.common.camera.DSiCameraSource;
import mh.z;
import n2.l;
import n2.m;
import n2.r;
import n2.s;
import q4.x;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements q {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public /* synthetic */ d(n nVar, p pVar, Object obj, q qVar) {
        this.A = 1;
        this.L = nVar;
        this.R = pVar;
        this.X = obj;
        this.B = qVar;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        boolean z10;
        int i2;
        boolean z11;
        Object obj4;
        boolean z12;
        d1 d1Var;
        n2.e eVar;
        boolean z13;
        r rVar;
        n2.e eVar2;
        k0 k0Var;
        r rVar2;
        int i10;
        switch (this.A) {
            case 0:
                mc.p pVar = (mc.p) this.L;
                e eVar3 = (e) this.R;
                q qVar = (q) this.B;
                mc.a aVar = (mc.a) this.X;
                c cVar = (c) obj;
                m mVar = (m) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    if (((r) mVar).f(cVar)) {
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
                r rVar3 = (r) mVar;
                if (rVar3.O(intValue & 1, z10)) {
                    String str = (String) pVar.j(rVar3, 0);
                    if (vc.h.j0(str)) {
                        k1.b.c("Label must not be blank");
                    }
                    eVar3.getClass();
                    b.f5012a.q(str, Boolean.TRUE, cVar, qVar, aVar, rVar3, Integer.valueOf((intValue << 9) & 7168));
                } else {
                    rVar3.R();
                }
                return y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                n nVar = (n) this.L;
                p pVar2 = (p) this.R;
                q qVar2 = (q) this.B;
                ((Integer) obj3).getClass();
                ((f0) obj).getClass();
                r rVar4 = (r) ((m) obj2);
                boolean h2 = rVar4.h(nVar);
                Object L = rVar4.L();
                if (h2 || L == l.f9953a) {
                    L = new z(9, nVar);
                    rVar4.h0(L);
                }
                s.d(nVar, (mc.l) L, rVar4);
                float f8 = 4;
                n0.b(f3.g.h(pVar2, f8, t1.e.b(f8), 0L, 28), t1.e.b(f8), 0L, v2.h.c(1639287422, new r0(19, this.X, qVar2), rVar4), rVar4, 1572864, 60);
                return y.f14813a;
            case 2:
                p0 p0Var = (p0) this.L;
                u1.p0 p0Var2 = (u1.p0) this.R;
                x xVar = (x) this.B;
                q4.q qVar3 = (q4.q) this.X;
                p pVar3 = (p) obj;
                ((Integer) obj3).getClass();
                r rVar5 = (r) ((m) obj2);
                rVar5.X(-84507373);
                boolean booleanValue = ((Boolean) rVar5.j(q1.f1933w)).booleanValue();
                boolean g10 = rVar5.g(booleanValue);
                Object L2 = rVar5.L();
                Object obj5 = l.f9953a;
                if (g10 || L2 == obj5) {
                    L2 = new d2.i(booleanValue);
                    rVar5.h0(L2);
                }
                d2.i iVar = (d2.i) L2;
                if (p0Var.f6676a == 16) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (((Boolean) ((e2) ((b3) rVar5.j(q1.f1930t))).f1841c.getValue()).booleanValue() && p0Var2.b() && q0.c(xVar.f12277b) && z11) {
                    rVar5.X(-707487962);
                    l4.h hVar = xVar.f12276a;
                    q0 q0Var = new q0(xVar.f12277b);
                    boolean h10 = rVar5.h(iVar);
                    Object L3 = rVar5.L();
                    if (h10 || L3 == obj5) {
                        L3 = new a9.b(29, null, iVar);
                        rVar5.h0(L3);
                    }
                    s.f(hVar, q0Var, (mc.p) L3, rVar5);
                    boolean h11 = rVar5.h(iVar) | rVar5.h(qVar3) | rVar5.f(xVar) | rVar5.h(p0Var2) | rVar5.f(p0Var);
                    Object L4 = rVar5.L();
                    if (h11 || L4 == obj5) {
                        Object aVar2 = new d2.a(iVar, qVar3, xVar, p0Var2, p0Var);
                        rVar5.h0(aVar2);
                        L4 = aVar2;
                    }
                    obj4 = f3.g.f(pVar3, (mc.l) L4);
                    rVar5.p(false);
                } else {
                    rVar5.X(-705473241);
                    rVar5.p(false);
                    obj4 = b3.m.f1770a;
                }
                rVar5.p(false);
                return obj4;
            default:
                yg.f fVar = (yg.f) this.L;
                xg.h hVar2 = (xg.h) this.R;
                zg.q qVar4 = (zg.q) this.B;
                zg.s sVar = (zg.s) this.X;
                d1 d1Var2 = (d1) obj;
                m mVar2 = (m) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                d1Var2.getClass();
                if ((intValue2 & 6) == 0) {
                    if (((r) mVar2).f(d1Var2)) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    intValue2 |= i10;
                }
                int i11 = intValue2;
                if ((i11 & 19) != 18) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                r rVar6 = (r) mVar2;
                if (rVar6.O(i11 & 1, z12)) {
                    boolean z14 = fVar instanceof yg.b;
                    b3.m mVar3 = b3.m.f1770a;
                    n2.e eVar4 = l.f9953a;
                    if (z14) {
                        rVar6.X(850351259);
                        p f10 = l1.c.k(l1.c.s(mVar3, d1Var2), d1Var2).f(r1.f8615c);
                        oe.h hVar3 = ((yg.b) fVar).f14819a;
                        boolean h12 = rVar6.h(hVar2);
                        Object L5 = rVar6.L();
                        if (h12 || L5 == eVar4) {
                            o oVar = new o(0, hVar2, xg.h.class, "revalidateBiosConfiguration", "revalidateBiosConfiguration()V", 0, 0, 10);
                            rVar6.h0(oVar);
                            L5 = oVar;
                        }
                        zg.a.k(f10, hVar3, (mc.a) ((nc.i) L5), rVar6, 0);
                        rVar6.p(false);
                    } else if (fVar instanceof yg.d) {
                        rVar6.X(1412915479);
                        zg.a.m(l1.c.k(l1.c.s(mVar3, d1Var2), d1Var2).f(r1.f8615c), rVar6, 0);
                        rVar6.p(false);
                    } else if (fVar instanceof yg.e) {
                        rVar6.X(850842578);
                        e0 e0Var = r1.f8615c;
                        List list = ((yg.e) fVar).f14822a;
                        boolean h13 = rVar6.h(hVar2);
                        Object L6 = rVar6.L();
                        if (!h13 && L6 != eVar4) {
                            d1Var = d1Var2;
                            eVar = eVar4;
                        } else {
                            d1Var = d1Var2;
                            eVar = eVar4;
                            a2.g gVar = new a2.g(1, hVar2, xg.h.class, "deleteTitle", "deleteTitle(Lme/magnum/melonds/domain/model/DSiWareTitle;)V", 0, 0, 24);
                            rVar6.h0(gVar);
                            L6 = gVar;
                        }
                        mc.l lVar = (mc.l) ((nc.i) L6);
                        boolean h14 = rVar6.h(qVar4);
                        Object L7 = rVar6.L();
                        if (!h14 && L7 != eVar) {
                            k0Var = L7;
                            eVar2 = eVar;
                            z13 = false;
                            rVar = rVar6;
                        } else {
                            z13 = false;
                            rVar = rVar6;
                            eVar2 = eVar;
                            k0 k0Var2 = new k0(2, qVar4, zg.q.class, "launch", "launch(Lme/magnum/melonds/domain/model/DSiWareTitle;Lme/magnum/melonds/domain/model/dsinand/DSiWareTitleFileType;)V", 0, 0, 5);
                            rVar.h0(k0Var2);
                            k0Var = k0Var2;
                        }
                        mc.p pVar4 = (mc.p) ((nc.i) k0Var);
                        boolean h15 = rVar.h(sVar);
                        Object L8 = rVar.L();
                        if (h15 || L8 == eVar2) {
                            k0 k0Var3 = new k0(2, sVar, zg.s.class, "launch", "launch(Lme/magnum/melonds/domain/model/DSiWareTitle;Lme/magnum/melonds/domain/model/dsinand/DSiWareTitleFileType;)V", 0, 0, 6);
                            rVar.h0(k0Var3);
                            L8 = k0Var3;
                        }
                        mc.p pVar5 = (mc.p) ((nc.i) L8);
                        boolean h16 = rVar.h(hVar2);
                        Object L9 = rVar.L();
                        if (h16 || L9 == eVar2) {
                            rVar2 = rVar;
                            a2.g gVar2 = new a2.g(1, hVar2, xg.h.class, "getTitleIcon", "getTitleIcon(Lme/magnum/melonds/domain/model/DSiWareTitle;)Lme/magnum/melonds/ui/romlist/RomIcon;", 0, 0, 25);
                            rVar2.h0(gVar2);
                            L9 = gVar2;
                        } else {
                            rVar2 = rVar;
                        }
                        zg.a.p(e0Var, d1Var, list, lVar, pVar4, pVar5, (mc.l) ((nc.i) L9), rVar2, ((i11 << 3) & 112) | 6);
                        rVar2.p(z13);
                    } else if (fVar instanceof yg.c) {
                        rVar6.X(1412936501);
                        zg.a.h(l1.c.k(l1.c.s(mVar3, d1Var2), d1Var2).f(r1.f8615c), rVar6, 0);
                        rVar6.p(false);
                    } else {
                        throw w.d.i(rVar6, 1412902380, false);
                    }
                } else {
                    rVar6.R();
                }
                return y.f14813a;
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.A = i2;
        this.L = obj;
        this.R = obj2;
        this.B = obj3;
        this.X = obj4;
    }

    public /* synthetic */ d(mc.p pVar, e eVar, q qVar, mc.a aVar) {
        this.A = 0;
        this.L = pVar;
        this.R = eVar;
        this.B = qVar;
        this.X = aVar;
    }
}
