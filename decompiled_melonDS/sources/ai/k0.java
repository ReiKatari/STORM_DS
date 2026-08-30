package ai;

import g2.y1;
import java.util.WeakHashMap;
import l1.c2;
import l1.r1;
import l1.v1;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.t2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ mc.a B;

    public /* synthetic */ k0(int i2, int i10, mc.a aVar) {
        this.A = i10;
        this.B = aVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i2 = this.A;
        i3.j0 j0Var = i3.z.f6703b;
        b3.m mVar = b3.m.f1770a;
        mc.a aVar = this.B;
        boolean z15 = false;
        yb.y yVar = yb.y.f14813a;
        switch (i2) {
            case 0:
                n2.m mVar2 = (n2.m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z15 = true;
                }
                n2.r rVar = (n2.r) mVar2;
                if (rVar.O(intValue & 1, z15)) {
                    y1.a(this.B, null, false, n.f843k, rVar, 24576, 14);
                } else {
                    rVar.R();
                }
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                n2.m mVar3 = (n2.m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z15 = true;
                }
                n2.r rVar2 = (n2.r) mVar3;
                if (rVar2.O(intValue2 & 1, z15)) {
                    y1.a(this.B, null, false, n.f844l, rVar2, 24576, 14);
                } else {
                    rVar2.R();
                }
                return yVar;
            case 2:
                n2.m mVar4 = (n2.m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar3 = (n2.r) mVar4;
                if (rVar3.O(intValue3 & 1, z10)) {
                    t2 t2Var = g2.m0.f5257a;
                    b3.p y10 = l1.c.y(f1.n.f(mVar, ((g2.l0) rVar3.j(t2Var)).h(), j0Var));
                    y3.v0 d4 = l1.p.d(b3.c.A, false);
                    int hashCode = Long.hashCode(rVar3.T);
                    v2.g l10 = rVar3.l();
                    b3.p c4 = b3.a.c(y10, rVar3);
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
                    long g10 = ((g2.l0) rVar3.j(t2Var)).g();
                    WeakHashMap weakHashMap = c2.f8518w;
                    v1 v1Var = l1.s.f(rVar3).f8530l;
                    int i10 = l1.c.f8512h;
                    g2.a0.b(ig.m.f7078c, new l1.y0(v1Var, 16 | 15), null, v2.h.c(527958390, new k0(3, aVar), rVar3), null, g10, 0L, 0.0f, rVar3, 3078, 212);
                    rVar3.p(true);
                } else {
                    rVar3.R();
                }
                return yVar;
            case 3:
                n2.m mVar5 = (n2.m) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z15 = true;
                }
                n2.r rVar4 = (n2.r) mVar5;
                if (rVar4.O(intValue4 & 1, z15)) {
                    y1.a(this.B, null, false, ig.m.f7079d, rVar4, 24576, 14);
                } else {
                    rVar4.R();
                }
                return yVar;
            case 4:
                n2.m mVar6 = (n2.m) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z15 = true;
                }
                n2.r rVar5 = (n2.r) mVar6;
                if (rVar5.O(intValue5 & 1, z15)) {
                    y1.a(this.B, null, false, ig.m.f7082g, rVar5, 24576, 14);
                } else {
                    rVar5.R();
                }
                return yVar;
            case l1.c.f8511g /* 5 */:
                ((Integer) obj2).getClass();
                ig.m.a(n2.s.F(1), aVar, (n2.m) obj);
                return yVar;
            case l1.c.f8509e /* 6 */:
                n2.m mVar7 = (n2.m) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n2.r rVar6 = (n2.r) mVar7;
                if (rVar6.O(intValue6 & 1, z11)) {
                    boolean f8 = rVar6.f(aVar);
                    Object L = rVar6.L();
                    if (f8 || L == n2.l.f9953a) {
                        L = new lg.e(0, aVar);
                        rVar6.h0(L);
                    }
                    y1.a((mc.a) L, null, false, lg.j.f9093b, rVar6, 24576, 14);
                } else {
                    rVar6.R();
                }
                return yVar;
            case 7:
                n2.m mVar8 = (n2.m) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z15 = true;
                }
                n2.r rVar7 = (n2.r) mVar8;
                if (rVar7.O(intValue7 & 1, z15)) {
                    y1.a(this.B, null, false, mg.n.f9659a, rVar7, 24576, 14);
                } else {
                    rVar7.R();
                }
                return yVar;
            case 8:
                n2.m mVar9 = (n2.m) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                n2.r rVar8 = (n2.r) mVar9;
                if (rVar8.O(intValue8 & 1, z12)) {
                    t2 t2Var2 = g2.m0.f5257a;
                    b3.p y11 = l1.c.y(f1.n.f(mVar, ((g2.l0) rVar8.j(t2Var2)).h(), j0Var));
                    y3.v0 d10 = l1.p.d(b3.c.A, false);
                    int hashCode2 = Long.hashCode(rVar8.T);
                    v2.g l11 = rVar8.l();
                    b3.p c10 = b3.a.c(y11, rVar8);
                    a4.h.f220a.getClass();
                    a4.f0 f0Var2 = a4.g.f212b;
                    rVar8.b0();
                    if (rVar8.S) {
                        rVar8.k(f0Var2);
                    } else {
                        rVar8.k0();
                    }
                    n2.s.C(d10, a4.g.f215e, rVar8);
                    n2.s.C(l11, a4.g.f214d, rVar8);
                    n2.s.u(rVar8, Integer.valueOf(hashCode2), a4.g.f216f);
                    n2.s.y(rVar8, a4.g.f217g);
                    n2.s.C(c10, a4.g.f213c, rVar8);
                    long g11 = ((g2.l0) rVar8.j(t2Var2)).g();
                    WeakHashMap weakHashMap2 = c2.f8518w;
                    g2.a0.b(qh.b.f12538a, new l1.d0(l1.s.f(rVar8).f8530l, l1.c.e(7)), null, v2.h.c(-1873417740, new k0(9, aVar), rVar8), null, g11, 0L, 0.0f, rVar8, 3078, 212);
                    rVar8.p(true);
                } else {
                    rVar8.R();
                }
                return yVar;
            case l1.c.f8508d /* 9 */:
                n2.m mVar10 = (n2.m) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if ((intValue9 & 3) != 2) {
                    z15 = true;
                }
                n2.r rVar9 = (n2.r) mVar10;
                if (rVar9.O(intValue9 & 1, z15)) {
                    y1.a(this.B, null, false, qh.b.f12539b, rVar9, 24576, 14);
                } else {
                    rVar9.R();
                }
                return yVar;
            case l1.c.f8510f /* 10 */:
                ((Integer) obj2).getClass();
                qh.b.d(n2.s.F(1), aVar, (n2.m) obj);
                return yVar;
            case 11:
                n2.m mVar11 = (n2.m) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if ((intValue10 & 3) != 2) {
                    z15 = true;
                }
                n2.r rVar10 = (n2.r) mVar11;
                if (rVar10.O(intValue10 & 1, z15)) {
                    y1.a(this.B, null, false, wh.a.f14219c, rVar10, 24576, 14);
                } else {
                    rVar10.R();
                }
                return yVar;
            case 12:
                n2.m mVar12 = (n2.m) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if ((intValue11 & 3) != 2) {
                    z15 = true;
                }
                n2.r rVar11 = (n2.r) mVar12;
                if (rVar11.O(intValue11 & 1, z15)) {
                    y1.a(this.B, null, false, wh.a.f14218b, rVar11, 24576, 14);
                } else {
                    rVar11.R();
                }
                return yVar;
            case 13:
                n2.m mVar13 = (n2.m) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if ((intValue12 & 3) != 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                n2.r rVar12 = (n2.r) mVar13;
                if (rVar12.O(intValue12 & 1, z13)) {
                    t2 t2Var3 = g2.m0.f5257a;
                    b3.p y12 = l1.c.y(f1.n.f(mVar, ((g2.l0) rVar12.j(t2Var3)).h(), j0Var));
                    y3.v0 d11 = l1.p.d(b3.c.A, false);
                    int hashCode3 = Long.hashCode(rVar12.T);
                    v2.g l12 = rVar12.l();
                    b3.p c11 = b3.a.c(y12, rVar12);
                    a4.h.f220a.getClass();
                    a4.f0 f0Var3 = a4.g.f212b;
                    rVar12.b0();
                    if (rVar12.S) {
                        rVar12.k(f0Var3);
                    } else {
                        rVar12.k0();
                    }
                    n2.s.C(d11, a4.g.f215e, rVar12);
                    n2.s.C(l12, a4.g.f214d, rVar12);
                    n2.s.u(rVar12, Integer.valueOf(hashCode3), a4.g.f216f);
                    n2.s.y(rVar12, a4.g.f217g);
                    n2.s.C(c11, a4.g.f213c, rVar12);
                    long g12 = ((g2.l0) rVar12.j(t2Var3)).g();
                    WeakHashMap weakHashMap3 = c2.f8518w;
                    g2.a0.b(zg.a.f15083d, new l1.d0(l1.s.f(rVar12).f8530l, l1.c.e(7)), null, v2.h.c(307807824, new k0(14, aVar), rVar12), null, g12, 0L, 0.0f, rVar12, 3078, 212);
                    rVar12.p(true);
                } else {
                    rVar12.R();
                }
                return yVar;
            case 14:
                n2.m mVar14 = (n2.m) obj;
                int intValue13 = ((Integer) obj2).intValue();
                if ((intValue13 & 3) != 2) {
                    z15 = true;
                }
                n2.r rVar13 = (n2.r) mVar14;
                if (rVar13.O(intValue13 & 1, z15)) {
                    y1.a(this.B, null, false, zg.a.f15084e, rVar13, 24576, 14);
                } else {
                    rVar13.R();
                }
                return yVar;
            case l1.c.f8512h /* 15 */:
                n2.m mVar15 = (n2.m) obj;
                int intValue14 = ((Integer) obj2).intValue();
                if ((intValue14 & 3) != 2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                n2.r rVar14 = (n2.r) mVar15;
                if (rVar14.O(intValue14 & 1, z14)) {
                    t2 t2Var4 = g2.m0.f5257a;
                    b3.p y13 = l1.c.y(f1.n.f(mVar, ((g2.l0) rVar14.j(t2Var4)).h(), j0Var));
                    y3.v0 d12 = l1.p.d(b3.c.A, false);
                    int hashCode4 = Long.hashCode(rVar14.T);
                    v2.g l13 = rVar14.l();
                    b3.p c12 = b3.a.c(y13, rVar14);
                    a4.h.f220a.getClass();
                    a4.f0 f0Var4 = a4.g.f212b;
                    rVar14.b0();
                    if (rVar14.S) {
                        rVar14.k(f0Var4);
                    } else {
                        rVar14.k0();
                    }
                    n2.s.C(d12, a4.g.f215e, rVar14);
                    n2.s.C(l13, a4.g.f214d, rVar14);
                    n2.s.u(rVar14, Integer.valueOf(hashCode4), a4.g.f216f);
                    n2.s.y(rVar14, a4.g.f217g);
                    n2.s.C(c12, a4.g.f213c, rVar14);
                    b3.p b10 = r1.b(mVar, 1.0f);
                    long g13 = ((g2.l0) rVar14.j(t2Var4)).g();
                    WeakHashMap weakHashMap4 = c2.f8518w;
                    g2.a0.b(zg.a.f15089j, new l1.d0(l1.s.f(rVar14).f8530l, l1.c.e(7)), b10, v2.h.c(459088347, new k0(16, aVar), rVar14), null, g13, 0L, 0.0f, rVar14, 3462, 208);
                    rVar14.p(true);
                } else {
                    rVar14.R();
                }
                return yVar;
            case 16:
                n2.m mVar16 = (n2.m) obj;
                int intValue15 = ((Integer) obj2).intValue();
                if ((intValue15 & 3) != 2) {
                    z15 = true;
                }
                n2.r rVar15 = (n2.r) mVar16;
                if (rVar15.O(intValue15 & 1, z15)) {
                    y1.a(this.B, null, false, zg.a.f15090k, rVar15, 24576, 14);
                } else {
                    rVar15.R();
                }
                return yVar;
            default:
                n2.m mVar17 = (n2.m) obj;
                int intValue16 = ((Integer) obj2).intValue();
                if ((intValue16 & 3) != 2) {
                    z15 = true;
                }
                n2.r rVar16 = (n2.r) mVar17;
                if (rVar16.O(intValue16 & 1, z15)) {
                    p7.l.d(l0.f.I(rVar16, R.string.cancel), false, this.B, rVar16, 0, 2);
                } else {
                    rVar16.R();
                }
                return yVar;
        }
    }

    public /* synthetic */ k0(int i2, mc.a aVar) {
        this.A = i2;
        this.B = aVar;
    }
}
