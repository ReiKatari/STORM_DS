package mg;

import a1.m0;
import a4.o0;
import g2.b2;
import g2.e7;
import g2.f3;
import g2.l0;
import h1.n1;
import i3.p0;
import j0.o1;
import java.util.Map;
import l4.h0;
import l4.q0;
import mc.p;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import mh.g0;
import n1.x;
import n2.r;
import n2.s;
import o1.q;
import p1.z0;
import p7.t;
import u1.i1;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements p {
    public final /* synthetic */ int A;

    public /* synthetic */ m(int i2) {
        this.A = 2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        int i2 = this.A;
        y yVar = y.f14813a;
        boolean z11 = false;
        switch (i2) {
            case 0:
                n2.m mVar = (n2.m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z11 = true;
                }
                r rVar = (r) mVar;
                if (rVar.O(intValue & 1, z11)) {
                    e7.b(l0.f.I(rVar, R.string.description), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 131070);
                } else {
                    rVar.R();
                }
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                n2.m mVar2 = (n2.m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z11 = true;
                }
                r rVar2 = (r) mVar2;
                if (rVar2.O(intValue2 & 1, z11)) {
                    e7.b(l0.f.I(rVar2, R.string.cheat_code), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar2, 0, 0, 131070);
                } else {
                    rVar2.R();
                }
                return yVar;
            case 2:
                ((Integer) obj2).getClass();
                g0.e((n2.m) obj, s.F(1));
                return yVar;
            case 3:
                y2.c cVar = (y2.c) obj;
                x xVar = (x) obj2;
                return t.y(Integer.valueOf(xVar.g()), Integer.valueOf(xVar.h()));
            case 4:
                y yVar2 = (y) obj2;
                ((o0) obj).f279c0 = true;
                return yVar;
            case l1.c.f8511g /* 5 */:
                q qVar = (q) obj;
                ((Integer) obj2).getClass();
                return new o1.b(1);
            case l1.c.f8509e /* 6 */:
                y2.c cVar2 = (y2.c) obj;
                o1.t tVar = (o1.t) obj2;
                return t.y(Integer.valueOf(tVar.f10592d.f9834b.g()), Integer.valueOf(tVar.f10592d.f9835c.g()));
            case 7:
                n2.m mVar3 = (n2.m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z11 = true;
                }
                r rVar3 = (r) mVar3;
                if (!rVar3.O(intValue3 & 1, z11)) {
                    rVar3.R();
                }
                return yVar;
            case 8:
                n2.m mVar4 = (n2.m) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z11 = true;
                }
                r rVar4 = (r) mVar4;
                if (!rVar4.O(intValue4 & 1, z11)) {
                    rVar4.R();
                }
                return yVar;
            case l1.c.f8508d /* 9 */:
                y2.c cVar3 = (y2.c) obj;
                Map c4 = ((z0) obj2).c();
                if (c4.isEmpty()) {
                    return null;
                }
                return c4;
            case l1.c.f8510f /* 10 */:
                y2.c cVar4 = (y2.c) obj;
                q1.b bVar = (q1.b) obj2;
                return t.y(Integer.valueOf(bVar.k()), Float.valueOf(p7.j.f(bVar.l(), -0.5f, 0.5f)), Integer.valueOf(bVar.n()));
            case 11:
                y2.c cVar5 = (y2.c) obj;
                q4.x xVar2 = (q4.x) obj2;
                return t.b(h0.a(xVar2.f12276a, h0.f8796a, cVar5), h0.a(new q0(xVar2.f12277b), h0.f8810p, cVar5));
            case 12:
                n2.m mVar5 = (n2.m) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z11 = true;
                }
                r rVar5 = (r) mVar5;
                if (rVar5.O(intValue5 & 1, z11)) {
                    e7.b(l0.f.I(rVar5, R.string.key_mapping), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar5, 0, 0, 131070);
                } else {
                    rVar5.R();
                }
                return yVar;
            case 13:
                n2.m mVar6 = (n2.m) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z11 = true;
                }
                r rVar6 = (r) mVar6;
                if (rVar6.O(intValue6 & 1, z11)) {
                    b2.a(o3.b.d(a.a.t(), rVar6), l0.f.I(rVar6, R.string.clear), null, 0L, rVar6, 8, 12);
                } else {
                    rVar6.R();
                }
                return yVar;
            case 14:
                n2.m mVar7 = (n2.m) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar7 = (r) mVar7;
                if (rVar7.O(intValue7 & 1, z10)) {
                    o3.f fVar = d0.d.f3344e;
                    if (fVar == null) {
                        o3.e eVar = new o3.e("Filled.Clear", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i10 = o3.h0.f10763a;
                        p0 p0Var = new p0(i3.s.f6681b);
                        o1 o1Var = new o1(2, false);
                        o1Var.q(19.0f, 6.41f);
                        o1Var.o(17.59f, 5.0f);
                        o1Var.o(12.0f, 10.59f);
                        o1Var.o(6.41f, 5.0f);
                        o1Var.o(5.0f, 6.41f);
                        o1Var.o(10.59f, 12.0f);
                        o1Var.o(5.0f, 17.59f);
                        o1Var.o(6.41f, 19.0f);
                        o1Var.o(12.0f, 13.41f);
                        o1Var.o(17.59f, 19.0f);
                        o1Var.o(19.0f, 17.59f);
                        o1Var.o(13.41f, 12.0f);
                        o1Var.g();
                        o3.e.a(eVar, o1Var.f7269a, p0Var);
                        fVar = eVar.b();
                        d0.d.f3344e = fVar;
                    }
                    b2.b(fVar, l0.f.I(rVar7, R.string.clear), null, 0L, rVar7, 0, 12);
                } else {
                    rVar7.R();
                }
                return yVar;
            case l1.c.f8512h /* 15 */:
                y2.c cVar6 = (y2.c) obj;
                i1 i1Var = (i1) obj2;
                Float valueOf = Float.valueOf(i1Var.f13332a.g());
                if (((n1) i1Var.f13337f.getValue()) == n1.Vertical) {
                    z11 = true;
                }
                return t.y(valueOf, Boolean.valueOf(z11));
            case 16:
                n2.m mVar8 = (n2.m) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z11 = true;
                }
                r rVar8 = (r) mVar8;
                if (rVar8.O(intValue8 & 1, z11)) {
                    e7.b(l0.f.I(rVar8, R.string.layouts), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar8, 0, 0, 131070);
                } else {
                    rVar8.R();
                }
                return yVar;
            case 17:
                n2.m mVar9 = (n2.m) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if ((intValue9 & 3) != 2) {
                    z11 = true;
                }
                r rVar9 = (r) mVar9;
                if (rVar9.O(intValue9 & 1, z11)) {
                    b2.a(o3.b.d(a.a.t(), rVar9), l0.f.I(rVar9, R.string.navigate_back), null, 0L, rVar9, 8, 12);
                } else {
                    rVar9.R();
                }
                return yVar;
            case 18:
                n2.m mVar10 = (n2.m) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if ((intValue10 & 3) != 2) {
                    z11 = true;
                }
                r rVar10 = (r) mVar10;
                if (rVar10.O(intValue10 & 1, z11)) {
                    b2.a(o3.b.d(aj.g.x(), rVar10), l0.f.I(rVar10, R.string.action_layouts_new), null, 0L, rVar10, 8, 12);
                } else {
                    rVar10.R();
                }
                return yVar;
            case 19:
                n2.m mVar11 = (n2.m) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if ((intValue11 & 3) != 2) {
                    z11 = true;
                }
                r rVar11 = (r) mVar11;
                if (rVar11.O(intValue11 & 1, z11)) {
                    b2.b(pc.a.x(), l0.f.I(rVar11, R.string.options), null, 0L, rVar11, 0, 12);
                } else {
                    rVar11.R();
                }
                return yVar;
            case 20:
                y2.c cVar7 = (y2.c) obj;
                y2.e eVar2 = (y2.e) obj2;
                Map map = eVar2.A;
                m0 m0Var = eVar2.B;
                Object[] objArr = m0Var.f68b;
                Object[] objArr2 = m0Var.f69c;
                long[] jArr = m0Var.f67a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j2 = jArr[i11];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((255 & j2) < 128) {
                                    int i14 = (i11 << 3) + i13;
                                    Object obj3 = objArr[i14];
                                    Map c10 = ((y2.f) objArr2[i14]).c();
                                    if (c10.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, c10);
                                    }
                                }
                                j2 >>= 8;
                            }
                            if (i12 != 8) {
                            }
                        }
                        if (i11 != length) {
                            i11++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 21:
                y2.c cVar8 = (y2.c) obj;
                return obj2;
            case 22:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                cc.e eVar3 = (cc.e) obj2;
                return bool;
            case 23:
                return ((cc.g) obj).H((cc.e) obj2);
            case 24:
                return ((cc.g) obj).H((cc.e) obj2);
            case 25:
                n2.m mVar12 = (n2.m) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if ((intValue12 & 3) != 2) {
                    z11 = true;
                }
                r rVar12 = (r) mVar12;
                if (rVar12.O(intValue12 & 1, z11)) {
                    e7.b(l0.f.I(rVar12, R.string.dsiware_manager), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar12, 0, 0, 131070);
                } else {
                    rVar12.R();
                }
                return yVar;
            case 26:
                n2.m mVar13 = (n2.m) obj;
                int intValue13 = ((Integer) obj2).intValue();
                if ((intValue13 & 3) != 2) {
                    z11 = true;
                }
                r rVar13 = (r) mVar13;
                if (rVar13.O(intValue13 & 1, z11)) {
                    b2.a(o3.b.d(a.a.t(), rVar13), null, null, 0L, rVar13, 56, 12);
                } else {
                    rVar13.R();
                }
                return yVar;
            case 27:
                n2.m mVar14 = (n2.m) obj;
                int intValue14 = ((Integer) obj2).intValue();
                if ((intValue14 & 3) != 2) {
                    z11 = true;
                }
                r rVar14 = (r) mVar14;
                if (rVar14.O(intValue14 & 1, z11)) {
                    b2.a(o3.b.d(aj.g.x(), rVar14), l0.f.I(rVar14, R.string.import_dsiware_title), null, 0L, rVar14, 8, 12);
                } else {
                    rVar14.R();
                }
                return yVar;
            case 28:
                n2.m mVar15 = (n2.m) obj;
                int intValue15 = ((Integer) obj2).intValue();
                if ((intValue15 & 3) != 2) {
                    z11 = true;
                }
                r rVar15 = (r) mVar15;
                if (rVar15.O(intValue15 & 1, z11)) {
                    f3.a(null, ((l0) rVar15.j(g2.m0.f5257a)).i(), 0.0f, 0L, 0, rVar15, 0, 29);
                } else {
                    rVar15.R();
                }
                return yVar;
            default:
                n2.m mVar16 = (n2.m) obj;
                int intValue16 = ((Integer) obj2).intValue();
                if ((intValue16 & 3) != 2) {
                    z11 = true;
                }
                r rVar16 = (r) mVar16;
                if (rVar16.O(intValue16 & 1, z11)) {
                    e7.b(l0.f.I(rVar16, R.string.select_dsiware_title), null, ((l0) rVar16.j(g2.m0.f5257a)).d(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar16, 0, 0, 131066);
                } else {
                    rVar16.R();
                }
                return yVar;
        }
    }

    public /* synthetic */ m(int i2, byte b10) {
        this.A = i2;
    }
}
