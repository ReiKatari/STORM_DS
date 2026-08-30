package ai;

import b4.q1;
import f2.e1;
import g2.b2;
import g2.c6;
import g2.e7;
import g2.f7;
import g2.g7;
import g2.x5;
import g2.y5;
import j0.o1;
import java.util.ArrayList;
import java.util.List;
import l1.p1;
import l1.r1;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.s2;
import n2.t2;
import u1.j1;
import y3.i1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements mc.q {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ q0(id.c cVar, id.b bVar) {
        this.A = 8;
        this.B = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.lang.Object, u1.j1] */
    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        boolean z10;
        e7.g gVar;
        boolean z11;
        boolean z12;
        String str;
        int i2;
        int i10;
        int i11 = this.A;
        b3.m mVar = b3.m.f1770a;
        Object obj4 = n2.l.f9953a;
        boolean z13 = true;
        yb.y yVar = yb.y.f14813a;
        boolean z14 = false;
        Object obj5 = this.B;
        switch (i11) {
            case 0:
                List list = (List) obj;
                n2.m mVar2 = (n2.m) obj2;
                ((Integer) obj3).getClass();
                list.getClass();
                c6.f5073a.b(new b3.k(new q0(6, (y5) list.get(((q1.a0) obj5).k()))), 0.0f, ((g2.l0) ((n2.r) mVar2).j(g2.m0.f5257a)).i(), mVar2, 0, 2);
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                zh.c cVar = (zh.c) obj5;
                n2.m mVar3 = (n2.m) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((n1.c) obj).getClass();
                if ((intValue & 17) != 16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar3;
                if (rVar.O(intValue & 1, z10)) {
                    n.c(f1.n.l(r1.b(mVar, 1.0f), false, null, 3), cVar.f15114e, rVar, 6);
                    g2.n0.c(r1.b(mVar, 1.0f), 0L, 0.0f, 0.0f, rVar, 6, 14);
                } else {
                    rVar.R();
                }
                return yVar;
            case 2:
                d2.h hVar = (d2.h) obj5;
                int intValue2 = ((Integer) obj).intValue();
                int intValue3 = ((Integer) obj2).intValue();
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                if (!booleanValue) {
                    intValue2 = hVar.p0.l(intValue2);
                }
                if (!booleanValue) {
                    intValue3 = hVar.p0.l(intValue3);
                }
                if (hVar.f3735n0) {
                    long j2 = hVar.f3733l0.f12277b;
                    int i12 = l4.q0.f8884c;
                    if (intValue2 != ((int) (j2 >> 32)) || intValue3 != ((int) (j2 & 4294967295L))) {
                        if (Math.min(intValue2, intValue3) >= 0 && Math.max(intValue2, intValue3) <= hVar.f3733l0.f12276a.B.length()) {
                            if (!booleanValue && intValue2 != intValue3) {
                                hVar.f3737q0.h(true);
                            } else {
                                f2.b1 b1Var = hVar.f3737q0;
                                b1Var.t(false);
                                b1Var.q(u1.d0.None);
                            }
                            hVar.f3734m0.f13399v.k(new q4.x(hVar.f3733l0.f12276a, l4.i0.b(intValue2, intValue3), (l4.q0) null));
                            return Boolean.valueOf(z13);
                        }
                        f2.b1 b1Var2 = hVar.f3737q0;
                        b1Var2.t(false);
                        b1Var2.q(u1.d0.None);
                    }
                }
                z13 = false;
                return Boolean.valueOf(z13);
            case 3:
                b9.e eVar = (b9.e) obj5;
                int intValue4 = ((Integer) obj).intValue();
                String str2 = (String) obj2;
                a7.k0 k0Var = (a7.k0) obj3;
                str2.getClass();
                k0Var.getClass();
                if (!(k0Var instanceof a7.f) && !((jd.a) eVar.B).e().k(intValue4)) {
                    gVar = e7.g.PATH;
                } else {
                    gVar = e7.g.QUERY;
                }
                int i13 = e7.h.f4391a[gVar.ordinal()];
                if (i13 != 1) {
                    if (i13 == 2) {
                        eVar.f(str2, "{" + str2 + '}');
                    } else {
                        m9.o.o();
                        return null;
                    }
                } else {
                    eVar.R = ((String) eVar.R) + '/' + kc.a.c('}', "{", str2);
                }
                return yVar;
            case 4:
                f2.b1 b1Var3 = (f2.b1) obj5;
                b3.p pVar = (b3.p) obj;
                ((Integer) obj3).getClass();
                n2.r rVar2 = (n2.r) ((n2.m) obj2);
                rVar2.X(1980580247);
                x4.c cVar2 = (x4.c) rVar2.j(q1.f1919h);
                Object L = rVar2.L();
                if (L == obj4) {
                    L = n2.s.w(new x4.l(0L));
                    rVar2.h0(L);
                }
                n2.w0 w0Var = (n2.w0) L;
                boolean h2 = rVar2.h(b1Var3);
                Object L2 = rVar2.L();
                if (h2 || L2 == obj4) {
                    L2 = new a3.e(11, b1Var3, w0Var);
                    rVar2.h0(L2);
                }
                mc.a aVar = (mc.a) L2;
                boolean f8 = rVar2.f(cVar2);
                Object L3 = rVar2.L();
                if (f8 || L3 == obj4) {
                    L3 = new e1(cVar2, w0Var, 0);
                    rVar2.h0(L3);
                }
                d1.m mVar4 = f2.k0.f4750a;
                b3.p a10 = b3.a.a(pVar, new f2.j0(aVar, (mc.l) L3));
                rVar2.p(false);
                return a10;
            case l1.c.f8511g /* 5 */:
                mc.p pVar2 = (mc.p) obj5;
                l1.x xVar = (l1.x) obj;
                n2.m mVar5 = (n2.m) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 17) != 16) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n2.r rVar3 = (n2.r) mVar5;
                if (rVar3.O(intValue5 & 1, z11)) {
                    x5.c(pVar2, rVar3, 0);
                } else {
                    rVar3.R();
                }
                return yVar;
            case l1.c.f8509e /* 6 */:
                y5 y5Var = (y5) obj5;
                ((Integer) obj3).getClass();
                n2.r rVar4 = (n2.r) ((n2.m) obj2);
                rVar4.X(-398757863);
                float f10 = y5Var.f5490b;
                d1.r rVar5 = d1.w.f3687a;
                s2 a11 = d1.e.a(f10, d1.d.r(250, 0, rVar5, 2), rVar4, 0);
                final s2 a12 = d1.e.a(y5Var.f5489a, d1.d.r(250, 0, rVar5, 2), rVar4, 0);
                b3.p n10 = r1.n(r1.b((b3.p) obj, 1.0f), b3.c.Z, 2);
                boolean f11 = rVar4.f(a12);
                Object L4 = rVar4.L();
                if (f11 || L4 == obj4) {
                    L4 = new mc.l() { // from class: g2.z5
                        @Override // mc.l
                        public final Object k(Object obj6) {
                            switch (r2) {
                                case 0:
                                    return new x4.j((((x4.c) obj6).O(((x4.f) a12.getValue()).A) << 32) | (0 & 4294967295L));
                                default:
                                    i3.k0 k0Var2 = (i3.k0) obj6;
                                    k0Var2.getClass();
                                    k0Var2.h(((Number) a12.getValue()).floatValue());
                                    return yb.y.f14813a;
                            }
                        }
                    };
                    rVar4.h0(L4);
                }
                b3.p l10 = r1.l(l1.c.q(n10, (mc.l) L4), ((x4.f) a11.getValue()).A);
                rVar4.p(false);
                return l10;
            case 7:
                v3.t tVar = (v3.t) obj;
                h3.b bVar = (h3.b) obj3;
                ((f2.z) obj5).B.a(((v3.t) obj2).f13693c, f2.w.f4801d);
                return yVar;
            case 8:
                id.c cVar3 = (id.c) obj5;
                Throwable th2 = (Throwable) obj;
                yb.y yVar2 = (yb.y) obj2;
                cc.g gVar2 = (cc.g) obj3;
                id.c.f7032b0.set(cVar3, null);
                cVar3.d(null);
                return yVar;
            case l1.c.f8508d /* 9 */:
                Throwable th3 = (Throwable) obj;
                yb.y yVar3 = (yb.y) obj2;
                cc.g gVar3 = (cc.g) obj3;
                ((id.g) obj5).c();
                return yVar;
            case l1.c.f8510f /* 10 */:
                d1.e0 e0Var = (d1.e0) obj5;
                n2.m mVar6 = (n2.m) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue6 & 17) != 16) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                n2.r rVar6 = (n2.r) mVar6;
                if (rVar6.O(intValue6 & 1, z12)) {
                    final d1.c0 g10 = d1.d.g(e0Var, -360.0f, d1.d.o(d1.d.r(2000, 0, d1.w.f3689c, 2), d1.o0.Restart, 4), rVar6, 4152);
                    l1.e0 e0Var2 = r1.f8615c;
                    boolean f12 = rVar6.f(g10);
                    Object L5 = rVar6.L();
                    if (f12 || L5 == obj4) {
                        L5 = new mc.l() { // from class: g2.z5
                            @Override // mc.l
                            public final Object k(Object obj6) {
                                switch (r2) {
                                    case 0:
                                        return new x4.j((((x4.c) obj6).O(((x4.f) g10.getValue()).A) << 32) | (0 & 4294967295L));
                                    default:
                                        i3.k0 k0Var2 = (i3.k0) obj6;
                                        k0Var2.getClass();
                                        k0Var2.h(((Number) g10.getValue()).floatValue());
                                        return yb.y.f14813a;
                                }
                            }
                        };
                        rVar6.h0(L5);
                    }
                    b3.p m = i3.z.m(e0Var2, (mc.l) L5);
                    o3.f fVar = q8.r.Y;
                    if (fVar == null) {
                        o3.e eVar2 = new o3.e("Filled.Sync", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i14 = o3.h0.f10763a;
                        i3.p0 p0Var = new i3.p0(i3.s.f6681b);
                        o1 o1Var = new o1(2, false);
                        o1Var.q(12.0f, 4.0f);
                        o1Var.o(12.0f, 1.0f);
                        o1Var.o(8.0f, 5.0f);
                        o1Var.p(4.0f, 4.0f);
                        o1Var.o(12.0f, 6.0f);
                        o1Var.i(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
                        o1Var.i(0.0f, 1.01f, -0.25f, 1.97f, -0.7f, 2.8f);
                        o1Var.p(1.46f, 1.46f);
                        o3.k kVar = new o3.k(19.54f, 15.03f, 20.0f, 13.57f, 20.0f, 12.0f);
                        ArrayList arrayList = o1Var.f7269a;
                        arrayList.add(kVar);
                        o1Var.i(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
                        o1Var.g();
                        o1Var.q(12.0f, 18.0f);
                        o1Var.i(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
                        o1Var.i(0.0f, -1.01f, 0.25f, -1.97f, 0.7f, -2.8f);
                        o1Var.o(5.24f, 7.74f);
                        arrayList.add(new o3.k(4.46f, 8.97f, 4.0f, 10.43f, 4.0f, 12.0f));
                        o1Var.i(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
                        o1Var.w(3.0f);
                        o1Var.p(4.0f, -4.0f);
                        o1Var.p(-4.0f, -4.0f);
                        o1Var.w(3.0f);
                        o1Var.g();
                        o3.e.a(eVar2, arrayList, p0Var);
                        fVar = eVar2.b();
                        q8.r.Y = fVar;
                    }
                    b2.b(fVar, null, m, ((g2.l0) rVar6.j(g2.m0.f5257a)).i(), rVar6, 48, 0);
                } else {
                    rVar6.R();
                }
                return yVar;
            case 11:
                mh.b bVar2 = (mh.b) obj5;
                n2.m mVar7 = (n2.m) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((p1) obj).getClass();
                if ((intValue7 & 17) != 16) {
                    z14 = true;
                }
                n2.r rVar7 = (n2.r) mVar7;
                if (rVar7.O(intValue7 & 1, z14)) {
                    e7.b(bVar2.f9671d, l1.c.x(b3.m.f1770a, 4, 0.0f, 0.0f, 0.0f, 14), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((f7) rVar7.j(g7.f5161b)).f5150i, rVar7, 48, 0, 65532);
                } else {
                    rVar7.R();
                }
                return yVar;
            case 12:
                mh.a aVar2 = (mh.a) obj5;
                n2.m mVar8 = (n2.m) obj2;
                ((Integer) obj3).getClass();
                ((c1.f0) obj).getClass();
                b3.p x9 = l1.c.x(b3.m.f1770a, 4, 0.0f, 0.0f, 0.0f, 14);
                l1.w a13 = l1.u.a(l1.i.f8573c, b3.c.f1758g0, mVar8, 0);
                n2.r rVar8 = (n2.r) mVar8;
                int hashCode = Long.hashCode(rVar8.T);
                v2.g l11 = rVar8.l();
                b3.p c4 = b3.a.c(x9, mVar8);
                a4.h.f220a.getClass();
                a4.f0 f0Var = a4.g.f212b;
                rVar8.b0();
                if (rVar8.S) {
                    rVar8.k(f0Var);
                } else {
                    rVar8.k0();
                }
                n2.s.C(a13, a4.g.f215e, mVar8);
                n2.s.C(l11, a4.g.f214d, mVar8);
                n2.s.u(mVar8, Integer.valueOf(hashCode), a4.g.f216f);
                n2.s.y(mVar8, a4.g.f217g);
                n2.s.C(c4, a4.g.f213c, mVar8);
                String I = l0.f.I(mVar8, R.string.challenge_started);
                t2 t2Var = g7.f5161b;
                n2.r rVar9 = (n2.r) mVar8;
                e7.b(I, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, l4.r0.a(((f7) rVar9.j(t2Var)).f5153l, 0L, 0L, p4.j.Y, null, 0L, 0L, null, 16777211), mVar8, 0, 0, 65534);
                e7.b(aVar2.f9665a.f11018g, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((f7) rVar9.j(t2Var)).f5153l, mVar8, 0, 0, 65534);
                rVar8.p(true);
                return yVar;
            case 13:
                mh.g gVar4 = (mh.g) obj5;
                n2.m mVar9 = (n2.m) obj2;
                ((Integer) obj3).getClass();
                ((c1.f0) obj).getClass();
                b3.p x10 = l1.c.x(b3.m.f1770a, 4, 0.0f, 0.0f, 0.0f, 14);
                l1.w a14 = l1.u.a(l1.i.f8573c, b3.c.f1758g0, mVar9, 0);
                n2.r rVar10 = (n2.r) mVar9;
                int hashCode2 = Long.hashCode(rVar10.T);
                v2.g l12 = rVar10.l();
                b3.p c10 = b3.a.c(x10, mVar9);
                a4.h.f220a.getClass();
                a4.f0 f0Var2 = a4.g.f212b;
                rVar10.b0();
                if (rVar10.S) {
                    rVar10.k(f0Var2);
                } else {
                    rVar10.k0();
                }
                n2.s.C(a14, a4.g.f215e, mVar9);
                n2.s.C(l12, a4.g.f214d, mVar9);
                n2.s.u(mVar9, Integer.valueOf(hashCode2), a4.g.f216f);
                n2.s.y(mVar9, a4.g.f217g);
                n2.s.C(c10, a4.g.f213c, mVar9);
                mh.g0 g0Var = gVar4.f9686a;
                if (g0Var instanceof mh.e) {
                    str = "Error unlocking achievement";
                } else if (g0Var instanceof mh.f) {
                    str = "Error submitting leaderboard entry";
                } else {
                    m9.o.o();
                    return null;
                }
                String str3 = str;
                t2 t2Var2 = g7.f5161b;
                n2.r rVar11 = (n2.r) mVar9;
                e7.b(str3, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, l4.r0.a(((f7) rVar11.j(t2Var2)).f5153l, 0L, 0L, p4.j.Y, null, 0L, 0L, null, 16777211), mVar9, 0, 0, 65534);
                e7.b("Keep playing while we retry in the background", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((f7) rVar11.j(t2Var2)).f5153l, mVar9, 6, 0, 65534);
                rVar10.p(true);
                return yVar;
            case 14:
                l4.r0 r0Var = (l4.r0) obj5;
                b3.p pVar3 = (b3.p) obj;
                ((Integer) obj3).getClass();
                n2.r rVar12 = (n2.r) ((n2.m) obj2);
                rVar12.X(1582736677);
                x4.c cVar4 = (x4.c) rVar12.j(q1.f1919h);
                p4.d dVar = (p4.d) rVar12.j(q1.f1922k);
                x4.m mVar10 = (x4.m) rVar12.j(q1.f1924n);
                boolean f13 = rVar12.f(r0Var) | rVar12.d(mVar10.ordinal());
                Object L6 = rVar12.L();
                if (f13 || L6 == obj4) {
                    L6 = l4.i0.h(r0Var, mVar10);
                    rVar12.h0(L6);
                }
                l4.r0 r0Var2 = (l4.r0) L6;
                boolean f14 = rVar12.f(dVar) | rVar12.f(r0Var2);
                Object L7 = rVar12.L();
                if (f14 || L7 == obj4) {
                    l4.j0 j0Var = r0Var2.f8887a;
                    p4.p pVar4 = j0Var.f8832f;
                    p4.j jVar = j0Var.f8829c;
                    if (jVar == null) {
                        jVar = p4.j.R;
                    }
                    p4.h hVar2 = j0Var.f8830d;
                    if (hVar2 != null) {
                        i2 = hVar2.f11311a;
                    } else {
                        i2 = 0;
                    }
                    p4.i iVar = j0Var.f8831e;
                    if (iVar != null) {
                        i10 = iVar.f11312a;
                    } else {
                        i10 = 65535;
                    }
                    L7 = ((p4.e) dVar).b(pVar4, jVar, i2, i10);
                    rVar12.h0(L7);
                }
                s2 s2Var = (s2) L7;
                Object L8 = rVar12.L();
                Object obj6 = L8;
                if (L8 == obj4) {
                    Object value = s2Var.getValue();
                    ?? obj7 = new Object();
                    obj7.f13347a = mVar10;
                    obj7.f13348b = cVar4;
                    obj7.f13349c = dVar;
                    obj7.f13350d = r0Var;
                    obj7.f13351e = value;
                    obj7.f13352f = u1.x0.b(r0Var, cVar4, dVar);
                    rVar12.h0(obj7);
                    obj6 = obj7;
                }
                j1 j1Var = (j1) obj6;
                Object value2 = s2Var.getValue();
                if (mVar10 != j1Var.f13347a || !nc.k.a(cVar4, j1Var.f13348b) || !nc.k.a(dVar, j1Var.f13349c) || !nc.k.a(r0Var2, j1Var.f13350d) || !nc.k.a(value2, j1Var.f13351e)) {
                    j1Var.f13347a = mVar10;
                    j1Var.f13348b = cVar4;
                    j1Var.f13349c = dVar;
                    j1Var.f13350d = r0Var2;
                    j1Var.f13351e = value2;
                    j1Var.f13352f = u1.x0.b(r0Var2, cVar4, dVar);
                }
                boolean h10 = rVar12.h(j1Var);
                Object L9 = rVar12.L();
                if (h10 || L9 == obj4) {
                    L9 = new q0(15, j1Var);
                    rVar12.h0(L9);
                }
                b3.p l13 = y3.c0.l(mVar, (mc.q) L9);
                rVar12.p(false);
                return l13;
            case l1.c.f8512h /* 15 */:
                x4.a aVar3 = (x4.a) obj3;
                long j10 = ((j1) obj5).f13352f;
                long j11 = aVar3.f14337a;
                int j12 = x4.a.j(j11);
                long j13 = aVar3.f14337a;
                i1 e6 = ((y3.u0) obj2).e(x4.a.a(j11, p7.j.g((int) (j10 >> 32), j12, x4.a.h(j13)), 0, p7.j.g((int) (j10 & 4294967295L), x4.a.i(j13), x4.a.g(j13)), 0, 10));
                return ((y3.x0) obj).u0(e6.A, e6.B, zb.r.A, new c9.o(e6, 10));
            case 16:
                cc.g gVar5 = (cc.g) obj3;
                ((a2.c) obj5).k((Throwable) obj);
                return yVar;
            default:
                re.a aVar4 = (re.a) obj5;
                n2.m mVar11 = (n2.m) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((p1) obj).getClass();
                if ((intValue8 & 17) != 16) {
                    z14 = true;
                }
                n2.r rVar13 = (n2.r) mVar11;
                if (rVar13.O(intValue8 & 1, z14)) {
                    e7.b(aVar4.getFileName(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar13, 0, 0, 131070);
                } else {
                    rVar13.R();
                }
                return yVar;
        }
    }

    public /* synthetic */ q0(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }
}
