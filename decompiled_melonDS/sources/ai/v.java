package ai;

import android.net.Uri;
import cd.q1;
import g2.b2;
import g2.y1;
import java.util.ArrayList;
import java.util.List;
import kf.l0;
import l1.d1;
import l1.r1;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.domain.model.DSiWareTitle;
import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
import n2.s2;
import yb.y;
import zh.k;
import zh.l;
import zh.m;
import zh.n;
import zh.o;
import zh.p;
import zh.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ v(b3.p pVar, ze.a aVar, mc.a aVar2, mc.l lVar, d1 d1Var, int i2) {
        this.A = 9;
        this.B = pVar;
        this.R = aVar;
        this.Y = aVar2;
        this.X = lVar;
        this.L = d1Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i2 = this.A;
        b3.m mVar = b3.m.f1770a;
        n2.e eVar = n2.l.f9953a;
        boolean z13 = false;
        yb.y yVar = yb.y.f14813a;
        Object obj3 = this.L;
        Object obj4 = this.X;
        Object obj5 = this.Y;
        Object obj6 = this.R;
        Object obj7 = this.B;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                n.r((b3.p) obj7, (d1) obj3, (ze.a) obj6, (zh.h) obj5, (mc.l) obj4, (n2.m) obj, n2.s.F(1));
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((Integer) obj2).getClass();
                n.b((b3.p) obj7, (d1) obj3, (ze.a) obj6, (zh.e) obj5, (mc.l) obj4, (n2.m) obj, n2.s.F(1));
                return yVar;
            case 2:
                ((Integer) obj2).getClass();
                lg.j.d((b3.p) obj7, (d1) obj3, (kg.h) obj6, (mc.l) obj4, (mc.l) obj5, (n2.m) obj, n2.s.F(7));
                return yVar;
            case 3:
                ((Integer) obj2).getClass();
                lg.j.g((b3.p) obj7, (d1) obj3, (List) obj6, (mc.l) obj4, (mc.l) obj5, (n2.m) obj, n2.s.F(7));
                return yVar;
            case 4:
                ((Integer) obj2).getClass();
                mh.x.a((b3.p) obj7, (zh.y) obj3, (mc.l) obj4, (mc.a) obj6, (mc.a) obj5, (n2.m) obj, n2.s.F(7));
                return yVar;
            case l1.c.f8511g /* 5 */:
                g3.z zVar = (g3.z) obj7;
                g3.z zVar2 = (g3.z) obj3;
                n2.w0 w0Var = (n2.w0) obj6;
                mc.a aVar = (mc.a) obj5;
                mc.a aVar2 = (mc.a) obj4;
                n2.m mVar2 = (n2.m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z13 = true;
                }
                n2.r rVar = (n2.r) mVar2;
                if (rVar.O(intValue & 1, z13)) {
                    b3.p k10 = g3.d.k(mVar, zVar);
                    boolean f8 = rVar.f(zVar2);
                    Object L = rVar.L();
                    if (f8 || L == eVar) {
                        L = new t(zVar2, 2);
                        rVar.h0(L);
                    }
                    b3.p i10 = g3.d.i(k10, (mc.l) L);
                    Object L2 = rVar.L();
                    if (L2 == eVar) {
                        L2 = new s(w0Var, 13);
                        rVar.h0(L2);
                    }
                    y1.a((mc.a) L2, i10, false, v2.h.c(2029860870, new ig.d(1, aVar, aVar2, w0Var), rVar), rVar, 24582, 12);
                } else {
                    rVar.R();
                }
                return yVar;
            case l1.c.f8509e /* 6 */:
                final RomDetailsActivity romDetailsActivity = (RomDetailsActivity) obj7;
                a7.v vVar = (a7.v) obj3;
                s2 s2Var = (s2) obj6;
                s2 s2Var2 = (s2) obj5;
                s2 s2Var3 = (s2) obj4;
                n2.m mVar3 = (n2.m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i11 = RomDetailsActivity.f9566z0;
                if ((intValue2 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar2 = (n2.r) mVar3;
                if (rVar2.O(intValue2 & 1, z10)) {
                    ze.a aVar3 = (ze.a) s2Var.getValue();
                    zh.h hVar = (zh.h) s2Var2.getValue();
                    zh.y yVar2 = (zh.y) s2Var3.getValue();
                    boolean h2 = rVar2.h(romDetailsActivity);
                    Object L3 = rVar2.L();
                    if (h2 || L3 == eVar) {
                        L3 = new mc.a() { // from class: yh.a
                            @Override // mc.a
                            public final Object b() {
                                int i12 = r2;
                                y yVar3 = y.f14813a;
                                RomDetailsActivity romDetailsActivity2 = romDetailsActivity;
                                switch (i12) {
                                    case 0:
                                        int i13 = RomDetailsActivity.f9566z0;
                                        romDetailsActivity2.onNavigateUp();
                                        return yVar3;
                                    default:
                                        int i14 = RomDetailsActivity.f9566z0;
                                        e eVar2 = (e) romDetailsActivity2.f9571y0.getValue();
                                        q1 q1Var = eVar2.f12533d;
                                        q1Var.getClass();
                                        q1Var.k(null, u.f15139a);
                                        eVar2.g();
                                        return yVar3;
                                }
                            }
                        };
                        rVar2.h0(L3);
                    }
                    mc.a aVar4 = (mc.a) L3;
                    boolean h10 = rVar2.h(vVar);
                    Object L4 = rVar2.L();
                    if (h10 || L4 == eVar) {
                        L4 = new mh.z(27, vVar);
                        rVar2.h0(L4);
                    }
                    mc.l lVar = (mc.l) L4;
                    boolean h11 = rVar2.h(romDetailsActivity);
                    Object L5 = rVar2.L();
                    if (h11 || L5 == eVar) {
                        L5 = new mc.l() { // from class: yh.b
                            @Override // mc.l
                            public final Object k(Object obj8) {
                                af.a a10;
                                af.b bVar;
                                af.b bVar2;
                                a.a aVar5;
                                int i12 = r2;
                                y yVar3 = y.f14813a;
                                RomDetailsActivity romDetailsActivity2 = romDetailsActivity;
                                switch (i12) {
                                    case 0:
                                        p pVar = (p) obj8;
                                        int i13 = RomDetailsActivity.f9566z0;
                                        pVar.getClass();
                                        j jVar = (j) romDetailsActivity2.f9570x0.getValue();
                                        q1 q1Var = jVar.f14841e;
                                        q1 q1Var2 = jVar.f14843g;
                                        af.a aVar6 = (af.a) q1Var2.getValue();
                                        if (pVar instanceof n) {
                                            a10 = af.a.a(aVar6, ((n) pVar).f15133a, null, null, null, null, 30);
                                        } else if (pVar instanceof o) {
                                            a10 = af.a.a(aVar6, null, ((o) pVar).f15134a, null, null, null, 29);
                                        } else if (pVar instanceof m) {
                                            a10 = af.a.a(aVar6, null, null, ((m) pVar).f15132a, null, null, 27);
                                        } else if (pVar instanceof l) {
                                            int i14 = h.f14836a[((l) pVar).f15131a.ordinal()];
                                            if (i14 != 1) {
                                                if (i14 != 2) {
                                                    if (i14 != 3) {
                                                        if (i14 == 4) {
                                                            aVar5 = af.c.f714b;
                                                        } else {
                                                            m9.o.o();
                                                            return null;
                                                        }
                                                    } else {
                                                        aVar5 = af.e.f716b;
                                                    }
                                                } else {
                                                    aVar5 = new af.b(null, null);
                                                }
                                            } else {
                                                aVar5 = af.d.f715b;
                                            }
                                            a10 = af.a.a(aVar6, null, null, null, aVar5, null, 23);
                                        } else if (pVar instanceof zh.j) {
                                            a.a aVar7 = aVar6.f710d;
                                            if (aVar7 instanceof af.b) {
                                                bVar2 = (af.b) aVar7;
                                            } else {
                                                bVar2 = null;
                                            }
                                            if (bVar2 != null) {
                                                a10 = af.a.a(aVar6, null, null, null, new af.b(((zh.j) pVar).f15129a, bVar2.f713c), null, 23);
                                            }
                                            a10 = null;
                                        } else if (pVar instanceof k) {
                                            a.a aVar8 = aVar6.f710d;
                                            if (aVar8 instanceof af.b) {
                                                bVar = (af.b) aVar8;
                                            } else {
                                                bVar = null;
                                            }
                                            if (bVar != null) {
                                                a10 = af.a.a(aVar6, null, null, null, new af.b(bVar.f712b, ((k) pVar).f15130a), null, 23);
                                            }
                                            a10 = null;
                                        } else if (pVar instanceof zh.i) {
                                            a10 = af.a.a(aVar6, null, null, null, null, ((zh.i) pVar).f15128a, 15);
                                        } else {
                                            m9.o.o();
                                            return null;
                                        }
                                        if (a10 != null) {
                                            a.a aVar9 = a10.f710d;
                                            q1Var2.k(null, a10);
                                            while (true) {
                                                Object value = q1Var.getValue();
                                                af.a aVar10 = a10;
                                                if (q1Var.i(value, ze.a.a((ze.a) value, null, null, aVar10, false, null, 0L, 991))) {
                                                    sd.i iVar = jVar.f14840d;
                                                    if (aVar9 instanceof af.b) {
                                                        af.b bVar3 = (af.b) aVar9;
                                                        Uri uri = bVar3.f712b;
                                                        if (uri != null) {
                                                            iVar.a(uri, sd.f.READ);
                                                        }
                                                        Uri uri2 = bVar3.f713c;
                                                        if (uri2 != null) {
                                                            iVar.a(uri2, sd.f.READ_WRITE);
                                                        }
                                                    }
                                                    cf.c cVar = jVar.f14839c;
                                                    ze.a aVar11 = (ze.a) q1Var.getValue();
                                                    l0 l0Var = (l0) cVar;
                                                    l0Var.getClass();
                                                    aVar11.getClass();
                                                    ArrayList arrayList = l0Var.f8252i;
                                                    int size = arrayList.size();
                                                    int i15 = 0;
                                                    int i16 = 0;
                                                    while (true) {
                                                        if (i16 < size) {
                                                            Object obj9 = arrayList.get(i16);
                                                            i16++;
                                                            ze.a aVar12 = (ze.a) obj9;
                                                            aVar12.getClass();
                                                            if (!nc.k.a(aVar12.f15056d, aVar11.f15056d)) {
                                                                i15++;
                                                            }
                                                        } else {
                                                            i15 = -1;
                                                        }
                                                    }
                                                    if (i15 >= 0) {
                                                        ze.a aVar13 = (ze.a) arrayList.get(i15);
                                                        aVar13.getClass();
                                                        aVar13.f15058f = aVar10;
                                                        l0Var.g();
                                                        return yVar3;
                                                    }
                                                    return yVar3;
                                                }
                                                a10 = aVar10;
                                            }
                                        } else {
                                            return yVar3;
                                        }
                                    default:
                                        oi.b bVar4 = (oi.b) obj8;
                                        int i17 = RomDetailsActivity.f9566z0;
                                        bVar4.getClass();
                                        ((e) romDetailsActivity2.f9571y0.getValue()).f12535f.p(kc.a.e(bVar4.f11012a, "https://retroachievements.org/achievement/"));
                                        return yVar3;
                                }
                            }
                        };
                        rVar2.h0(L5);
                    }
                    mc.l lVar2 = (mc.l) L5;
                    boolean h12 = rVar2.h(romDetailsActivity);
                    Object L6 = rVar2.L();
                    if (h12 || L6 == eVar) {
                        L6 = new y2.b(1, romDetailsActivity);
                        rVar2.h0(L6);
                    }
                    mc.p pVar = (mc.p) L6;
                    boolean h13 = rVar2.h(romDetailsActivity);
                    Object L7 = rVar2.L();
                    if (h13 || L7 == eVar) {
                        L7 = new mc.a() { // from class: yh.a
                            @Override // mc.a
                            public final Object b() {
                                int i12 = r2;
                                y yVar3 = y.f14813a;
                                RomDetailsActivity romDetailsActivity2 = romDetailsActivity;
                                switch (i12) {
                                    case 0:
                                        int i13 = RomDetailsActivity.f9566z0;
                                        romDetailsActivity2.onNavigateUp();
                                        return yVar3;
                                    default:
                                        int i14 = RomDetailsActivity.f9566z0;
                                        e eVar2 = (e) romDetailsActivity2.f9571y0.getValue();
                                        q1 q1Var = eVar2.f12533d;
                                        q1Var.getClass();
                                        q1Var.k(null, u.f15139a);
                                        eVar2.g();
                                        return yVar3;
                                }
                            }
                        };
                        rVar2.h0(L7);
                    }
                    mc.a aVar5 = (mc.a) L7;
                    boolean h14 = rVar2.h(romDetailsActivity);
                    Object L8 = rVar2.L();
                    if (h14 || L8 == eVar) {
                        L8 = new mc.l() { // from class: yh.b
                            @Override // mc.l
                            public final Object k(Object obj8) {
                                af.a a10;
                                af.b bVar;
                                af.b bVar2;
                                a.a aVar52;
                                int i12 = r2;
                                y yVar3 = y.f14813a;
                                RomDetailsActivity romDetailsActivity2 = romDetailsActivity;
                                switch (i12) {
                                    case 0:
                                        p pVar2 = (p) obj8;
                                        int i13 = RomDetailsActivity.f9566z0;
                                        pVar2.getClass();
                                        j jVar = (j) romDetailsActivity2.f9570x0.getValue();
                                        q1 q1Var = jVar.f14841e;
                                        q1 q1Var2 = jVar.f14843g;
                                        af.a aVar6 = (af.a) q1Var2.getValue();
                                        if (pVar2 instanceof n) {
                                            a10 = af.a.a(aVar6, ((n) pVar2).f15133a, null, null, null, null, 30);
                                        } else if (pVar2 instanceof o) {
                                            a10 = af.a.a(aVar6, null, ((o) pVar2).f15134a, null, null, null, 29);
                                        } else if (pVar2 instanceof m) {
                                            a10 = af.a.a(aVar6, null, null, ((m) pVar2).f15132a, null, null, 27);
                                        } else if (pVar2 instanceof l) {
                                            int i14 = h.f14836a[((l) pVar2).f15131a.ordinal()];
                                            if (i14 != 1) {
                                                if (i14 != 2) {
                                                    if (i14 != 3) {
                                                        if (i14 == 4) {
                                                            aVar52 = af.c.f714b;
                                                        } else {
                                                            m9.o.o();
                                                            return null;
                                                        }
                                                    } else {
                                                        aVar52 = af.e.f716b;
                                                    }
                                                } else {
                                                    aVar52 = new af.b(null, null);
                                                }
                                            } else {
                                                aVar52 = af.d.f715b;
                                            }
                                            a10 = af.a.a(aVar6, null, null, null, aVar52, null, 23);
                                        } else if (pVar2 instanceof zh.j) {
                                            a.a aVar7 = aVar6.f710d;
                                            if (aVar7 instanceof af.b) {
                                                bVar2 = (af.b) aVar7;
                                            } else {
                                                bVar2 = null;
                                            }
                                            if (bVar2 != null) {
                                                a10 = af.a.a(aVar6, null, null, null, new af.b(((zh.j) pVar2).f15129a, bVar2.f713c), null, 23);
                                            }
                                            a10 = null;
                                        } else if (pVar2 instanceof k) {
                                            a.a aVar8 = aVar6.f710d;
                                            if (aVar8 instanceof af.b) {
                                                bVar = (af.b) aVar8;
                                            } else {
                                                bVar = null;
                                            }
                                            if (bVar != null) {
                                                a10 = af.a.a(aVar6, null, null, null, new af.b(bVar.f712b, ((k) pVar2).f15130a), null, 23);
                                            }
                                            a10 = null;
                                        } else if (pVar2 instanceof zh.i) {
                                            a10 = af.a.a(aVar6, null, null, null, null, ((zh.i) pVar2).f15128a, 15);
                                        } else {
                                            m9.o.o();
                                            return null;
                                        }
                                        if (a10 != null) {
                                            a.a aVar9 = a10.f710d;
                                            q1Var2.k(null, a10);
                                            while (true) {
                                                Object value = q1Var.getValue();
                                                af.a aVar10 = a10;
                                                if (q1Var.i(value, ze.a.a((ze.a) value, null, null, aVar10, false, null, 0L, 991))) {
                                                    sd.i iVar = jVar.f14840d;
                                                    if (aVar9 instanceof af.b) {
                                                        af.b bVar3 = (af.b) aVar9;
                                                        Uri uri = bVar3.f712b;
                                                        if (uri != null) {
                                                            iVar.a(uri, sd.f.READ);
                                                        }
                                                        Uri uri2 = bVar3.f713c;
                                                        if (uri2 != null) {
                                                            iVar.a(uri2, sd.f.READ_WRITE);
                                                        }
                                                    }
                                                    cf.c cVar = jVar.f14839c;
                                                    ze.a aVar11 = (ze.a) q1Var.getValue();
                                                    l0 l0Var = (l0) cVar;
                                                    l0Var.getClass();
                                                    aVar11.getClass();
                                                    ArrayList arrayList = l0Var.f8252i;
                                                    int size = arrayList.size();
                                                    int i15 = 0;
                                                    int i16 = 0;
                                                    while (true) {
                                                        if (i16 < size) {
                                                            Object obj9 = arrayList.get(i16);
                                                            i16++;
                                                            ze.a aVar12 = (ze.a) obj9;
                                                            aVar12.getClass();
                                                            if (!nc.k.a(aVar12.f15056d, aVar11.f15056d)) {
                                                                i15++;
                                                            }
                                                        } else {
                                                            i15 = -1;
                                                        }
                                                    }
                                                    if (i15 >= 0) {
                                                        ze.a aVar13 = (ze.a) arrayList.get(i15);
                                                        aVar13.getClass();
                                                        aVar13.f15058f = aVar10;
                                                        l0Var.g();
                                                        return yVar3;
                                                    }
                                                    return yVar3;
                                                }
                                                a10 = aVar10;
                                            }
                                        } else {
                                            return yVar3;
                                        }
                                    default:
                                        oi.b bVar4 = (oi.b) obj8;
                                        int i17 = RomDetailsActivity.f9566z0;
                                        bVar4.getClass();
                                        ((e) romDetailsActivity2.f9571y0.getValue()).f12535f.p(kc.a.e(bVar4.f11012a, "https://retroachievements.org/achievement/"));
                                        return yVar3;
                                }
                            }
                        };
                        rVar2.h0(L8);
                    }
                    n.s(aVar3, hVar, yVar2, aVar4, lVar, lVar2, pVar, aVar5, (mc.l) L8, rVar2, 0);
                } else {
                    rVar2.R();
                }
                return yVar;
            case 7:
                b3.p pVar2 = (b3.p) obj7;
                n2.w0 w0Var2 = (n2.w0) obj3;
                v2.c cVar = (v2.c) obj6;
                b2.d dVar = (b2.d) obj5;
                mc.a aVar6 = (mc.a) obj4;
                n2.m mVar4 = (n2.m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n2.r rVar3 = (n2.r) mVar4;
                if (rVar3.O(intValue3 & 1, z11)) {
                    Object L9 = rVar3.L();
                    if (L9 == eVar) {
                        L9 = new o(w0Var2, 13);
                        rVar3.h0(L9);
                    }
                    b3.p n10 = y3.c0.n(pVar2, (mc.l) L9);
                    y3.v0 d4 = l1.p.d(b3.c.A, true);
                    int hashCode = Long.hashCode(rVar3.T);
                    v2.g l10 = rVar3.l();
                    b3.p c4 = b3.a.c(n10, rVar3);
                    a4.h.f220a.getClass();
                    a4.f0 f0Var = a4.g.f212b;
                    rVar3.b0();
                    if (rVar3.S) {
                        rVar3.k(f0Var);
                    } else {
                        rVar3.k0();
                    }
                    n2.s.C(d4, a4.g.f215e, rVar3);
                    n2.s.C(l10, a4.g.f214d, rVar3);
                    n2.s.u(rVar3, Integer.valueOf(hashCode), a4.g.f216f);
                    n2.s.y(rVar3, a4.g.f217g);
                    n2.s.C(c4, a4.g.f213c, rVar3);
                    cVar.j(rVar3, 0);
                    dVar.b(6, aVar6, rVar3);
                    rVar3.p(true);
                } else {
                    rVar3.R();
                }
                return yVar;
            case 8:
                DSiWareTitle dSiWareTitle = (DSiWareTitle) obj7;
                final n2.w0 w0Var3 = (n2.w0) obj3;
                mc.a aVar7 = (mc.a) obj6;
                final mc.l lVar3 = (mc.l) obj4;
                final mc.l lVar4 = (mc.l) obj5;
                n2.m mVar5 = (n2.m) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                n2.r rVar4 = (n2.r) mVar5;
                if (rVar4.O(intValue4 & 1, z12)) {
                    b2.a(k7.w.z(rVar4, R.drawable.ic_menu), l0.f.I(rVar4, R.string.delete), r1.i(mVar, 32), ((g2.l0) rVar4.j(g2.m0.f5257a)).f(), rVar4, 392, 0);
                    yg.a aVar8 = (yg.a) w0Var3.getValue();
                    boolean f10 = rVar4.f(w0Var3);
                    Object L10 = rVar4.L();
                    if (f10 || L10 == eVar) {
                        L10 = new o(w0Var3, 14);
                        rVar4.h0(L10);
                    }
                    mc.l lVar5 = (mc.l) L10;
                    boolean f11 = rVar4.f(w0Var3) | rVar4.f(lVar3);
                    Object L11 = rVar4.L();
                    if (f11 || L11 == eVar) {
                        L11 = new mc.l() { // from class: zg.d
                            @Override // mc.l
                            public final Object k(Object obj8) {
                                re.a aVar9 = (re.a) obj8;
                                switch (r3) {
                                    case 0:
                                        aVar9.getClass();
                                        w0Var3.setValue(yg.a.NONE);
                                        lVar3.k(aVar9);
                                        break;
                                    default:
                                        aVar9.getClass();
                                        w0Var3.setValue(yg.a.NONE);
                                        lVar3.k(aVar9);
                                        break;
                                }
                                return y.f14813a;
                            }
                        };
                        rVar4.h0(L11);
                    }
                    mc.l lVar6 = (mc.l) L11;
                    boolean f12 = rVar4.f(w0Var3) | rVar4.f(lVar4);
                    Object L12 = rVar4.L();
                    if (f12 || L12 == eVar) {
                        L12 = new mc.l() { // from class: zg.d
                            @Override // mc.l
                            public final Object k(Object obj8) {
                                re.a aVar9 = (re.a) obj8;
                                switch (r3) {
                                    case 0:
                                        aVar9.getClass();
                                        w0Var3.setValue(yg.a.NONE);
                                        lVar4.k(aVar9);
                                        break;
                                    default:
                                        aVar9.getClass();
                                        w0Var3.setValue(yg.a.NONE);
                                        lVar4.k(aVar9);
                                        break;
                                }
                                return y.f14813a;
                            }
                        };
                        rVar4.h0(L12);
                    }
                    zg.a.l(dSiWareTitle, aVar8, lVar5, aVar7, lVar6, (mc.l) L12, rVar4, 0);
                } else {
                    rVar4.R();
                }
                return yVar;
            default:
                ((Integer) obj2).getClass();
                zg.u.a((b3.p) obj7, (ze.a) obj6, (mc.a) obj5, (mc.l) obj4, (d1) obj3, (n2.m) obj, n2.s.F(7));
                return yVar;
        }
    }

    public /* synthetic */ v(b3.p pVar, d1 d1Var, ze.a aVar, Object obj, mc.l lVar, int i2, int i10) {
        this.A = i10;
        this.B = pVar;
        this.L = d1Var;
        this.R = aVar;
        this.Y = obj;
        this.X = lVar;
    }

    public /* synthetic */ v(b3.p pVar, d1 d1Var, Object obj, mc.l lVar, mc.l lVar2, int i2, int i10) {
        this.A = i10;
        this.B = pVar;
        this.L = d1Var;
        this.R = obj;
        this.X = lVar;
        this.Y = lVar2;
    }

    public /* synthetic */ v(b3.p pVar, zh.y yVar, mc.l lVar, mc.a aVar, mc.a aVar2, int i2) {
        this.A = 4;
        this.B = pVar;
        this.L = yVar;
        this.X = lVar;
        this.R = aVar;
        this.Y = aVar2;
    }

    public /* synthetic */ v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.Y = obj4;
        this.X = obj5;
    }

    public /* synthetic */ v(DSiWareTitle dSiWareTitle, n2.w0 w0Var, mc.a aVar, mc.l lVar, mc.l lVar2) {
        this.A = 8;
        this.B = dSiWareTitle;
        this.L = w0Var;
        this.R = aVar;
        this.X = lVar;
        this.Y = lVar2;
    }
}
