package ai;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import c1.y1;
import g2.l5;
import h1.n1;
import java.util.List;
import java.util.Map;
import l1.p1;
import l1.r1;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.backgrounds.BackgroundsActivity;
import n2.d1;
import n2.f1;
import n2.s2;
import u1.c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements mc.q {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ v0(int i2, Object obj, Object obj2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        boolean z10;
        e7.g gVar;
        boolean z11;
        boolean z12;
        boolean z13;
        float f8;
        float q10;
        int i2;
        Typeface typeface;
        int i10 = this.A;
        int i11 = 4;
        b3.m mVar = b3.m.f1770a;
        int i12 = 2;
        n2.e eVar = n2.l.f9953a;
        yb.y yVar = yb.y.f14813a;
        boolean z14 = false;
        int i13 = 0;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        Object obj4 = this.L;
        Object obj5 = this.B;
        switch (i10) {
            case 0:
                zh.x xVar = (zh.x) obj5;
                final d1 d1Var = (d1) obj4;
                n2.m mVar2 = (n2.m) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((n1.c) obj).getClass();
                if ((intValue & 17) != 16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar2;
                if (rVar.O(intValue & 1, z10)) {
                    List list = xVar.f15142a;
                    long g10 = d1Var.g();
                    boolean f10 = rVar.f(d1Var);
                    Object L = rVar.L();
                    if (f10 || L == eVar) {
                        L = new mc.l() { // from class: ai.w0
                            @Override // mc.l
                            public final Object k(Object obj6) {
                                Long l10 = (Long) obj6;
                                switch (r2) {
                                    case 0:
                                        d1Var.h(l10.longValue());
                                        break;
                                    default:
                                        d1Var.h(l10.longValue());
                                        break;
                                }
                                return yb.y.f14813a;
                            }
                        };
                        rVar.h0(L);
                    }
                    n.a(list, g10, (mc.l) L, rVar, 0);
                } else {
                    rVar.R();
                }
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                b9.e eVar2 = (b9.e) obj4;
                int intValue2 = ((Integer) obj).intValue();
                String str = (String) obj2;
                a7.k0 k0Var = (a7.k0) obj3;
                str.getClass();
                k0Var.getClass();
                Object obj6 = ((Map) obj5).get(str);
                obj6.getClass();
                List<String> list2 = (List) obj6;
                if (!(k0Var instanceof a7.f) && !((jd.a) eVar2.B).e().k(intValue2)) {
                    gVar = e7.g.PATH;
                } else {
                    gVar = e7.g.QUERY;
                }
                int i14 = e7.h.f4391a[gVar.ordinal()];
                if (i14 != 1) {
                    if (i14 == 2) {
                        for (String str2 : list2) {
                            eVar2.f(str, str2);
                        }
                    } else {
                        m9.o.o();
                        return null;
                    }
                } else if (list2.size() == 1) {
                    eVar2.R = ((String) eVar2.R) + '/' + ((String) zb.l.R(list2));
                } else {
                    StringBuilder u4 = w.d.u("Expected one value for argument ", str, ", found ");
                    u4.append(list2.size());
                    u4.append("values instead.");
                    throw new IllegalArgumentException(u4.toString().toString());
                }
                return yVar;
            case 2:
                mc.l lVar = (mc.l) obj5;
                g1.c cVar = (g1.c) obj4;
                l1.x xVar2 = (l1.x) obj;
                n2.m mVar3 = (n2.m) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 17) != 16) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n2.r rVar2 = (n2.r) mVar3;
                if (rVar2.O(intValue3 & 1, z11)) {
                    Object L2 = rVar2.L();
                    if (L2 == eVar) {
                        L2 = new g1.e();
                        rVar2.h0(L2);
                    }
                    g1.e eVar3 = (g1.e) L2;
                    eVar3.f5019a.clear();
                    lVar.k(eVar3);
                    eVar3.a(cVar, rVar2, 0);
                } else {
                    rVar2.R();
                }
                return yVar;
            case 3:
                a7.d0 d0Var = (a7.d0) obj5;
                BackgroundsActivity backgroundsActivity = (BackgroundsActivity) obj4;
                y1 y1Var = (y1) obj;
                n2.m mVar4 = (n2.m) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                int i15 = BackgroundsActivity.f9488y0;
                y1Var.getClass();
                if ((intValue4 & 6) == 0) {
                    if (((n2.r) mVar4).f(y1Var)) {
                        i12 = 4;
                    }
                    intValue4 |= i12;
                }
                if ((intValue4 & 19) != 18) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                n2.r rVar3 = (n2.r) mVar4;
                if (rVar3.O(intValue4 & 1, z12)) {
                    hg.e eVar4 = hg.e.INSTANCE;
                    Object L3 = rVar3.L();
                    if (L3 == eVar) {
                        L3 = new l5(13);
                        rVar3.h0(L3);
                    }
                    mc.l lVar2 = (mc.l) L3;
                    Object L4 = rVar3.L();
                    if (L4 == eVar) {
                        L4 = new l5(14);
                        rVar3.h0(L4);
                    }
                    mc.l lVar3 = (mc.l) L4;
                    Object L5 = rVar3.L();
                    if (L5 == eVar) {
                        L5 = new l5(15);
                        rVar3.h0(L5);
                    }
                    mc.l lVar4 = (mc.l) L5;
                    boolean h2 = rVar3.h(backgroundsActivity);
                    if ((14 & intValue4) == 4) {
                        z14 = true;
                    }
                    boolean h10 = h2 | z14 | rVar3.h(d0Var);
                    Object L6 = rVar3.L();
                    if (h10 || L6 == eVar) {
                        L6 = new c0(backgroundsActivity, y1Var, d0Var, 8);
                        rVar3.h0(L6);
                    }
                    a.a.e(d0Var, eVar4, null, null, null, lVar2, null, lVar3, lVar4, (mc.l) L6, rVar3, 907542576, 1212);
                } else {
                    rVar3.R();
                }
                return yVar;
            case 4:
                s9.a aVar = (s9.a) obj5;
                mc.a aVar2 = (mc.a) obj4;
                ((Integer) obj3).getClass();
                ((c1.f0) obj).getClass();
                n2.r rVar4 = (n2.r) ((n2.m) obj2);
                boolean f11 = rVar4.f(aVar) | rVar4.f(aVar2);
                Object L7 = rVar4.L();
                if (f11 || L7 == eVar) {
                    L7 = new ig.k(aVar, aVar2, 1);
                    rVar4.h0(L7);
                }
                ig.m.a(0, (mc.a) L7, rVar4);
                return yVar;
            case l1.c.f8511g /* 5 */:
                s2 s2Var = (s2) obj5;
                jg.u uVar = (jg.u) obj4;
                n2.m mVar5 = (n2.m) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((p1) obj).getClass();
                if ((intValue5 & 17) != 16) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                n2.r rVar5 = (n2.r) mVar5;
                if (rVar5.O(intValue5 & 1, z13)) {
                    if (((Boolean) s2Var.getValue()).booleanValue()) {
                        rVar5.X(-696345879);
                        n2.b0 b0Var = g2.o0.f5308a;
                        long j2 = ((i3.s) rVar5.j(g2.q0.f5361a)).f6689a;
                        if (!((g2.l0) rVar5.j(g2.m0.f5257a)).k() ? i3.z.r(j2) < 0.5d : i3.z.r(j2) > 0.5d) {
                            f8 = 1.0f;
                        } else {
                            f8 = 0.87f;
                        }
                        n2.s.a(b0Var.a(Float.valueOf(f8)), v2.h.c(-1227545428, new s0(11, uVar), rVar5), rVar5, 56);
                        rVar5.p(false);
                    } else {
                        rVar5.X(-695805797);
                        rVar5.p(false);
                    }
                } else {
                    rVar5.R();
                }
                return yVar;
            case l1.c.f8509e /* 6 */:
                List list3 = (List) obj5;
                final d1 d1Var2 = (d1) obj4;
                n2.m mVar6 = (n2.m) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((n1.c) obj).getClass();
                if ((intValue6 & 17) != 16) {
                    z18 = true;
                }
                n2.r rVar6 = (n2.r) mVar6;
                if (rVar6.O(intValue6 & 1, z18)) {
                    long g11 = d1Var2.g();
                    boolean f12 = rVar6.f(d1Var2);
                    Object L8 = rVar6.L();
                    if (f12 || L8 == eVar) {
                        L8 = new mc.l() { // from class: ai.w0
                            @Override // mc.l
                            public final Object k(Object obj62) {
                                Long l10 = (Long) obj62;
                                switch (r2) {
                                    case 0:
                                        d1Var2.h(l10.longValue());
                                        break;
                                    default:
                                        d1Var2.h(l10.longValue());
                                        break;
                                }
                                return yb.y.f14813a;
                            }
                        };
                        rVar6.h0(L8);
                    }
                    n.a(list3, g11, (mc.l) L8, rVar6, 0);
                    l1.c.d(r1.c(mVar, 16), rVar6);
                } else {
                    rVar6.R();
                }
                return yVar;
            case 7:
                n2.w0 w0Var = (n2.w0) obj5;
                mh.c cVar2 = (mh.c) obj4;
                n2.m mVar7 = (n2.m) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((p1) obj).getClass();
                if ((intValue7 & 17) != 16) {
                    z17 = true;
                }
                n2.r rVar7 = (n2.r) mVar7;
                if (rVar7.O(intValue7 & 1, z17)) {
                    nh.a aVar3 = (nh.a) w0Var.getValue();
                    Object L9 = rVar7.L();
                    if (L9 == eVar) {
                        L9 = new l4.c0(24);
                        rVar7.h0(L9);
                    }
                    c1.m.b(aVar3, null, (mc.l) L9, b3.c.R, "leaderboard-attempt-content", null, v2.h.c(12896953, new n1.h(1, cVar2), rVar7), rVar7, 1600896, 34);
                } else {
                    rVar7.R();
                }
                return yVar;
            case 8:
                d1.c cVar3 = (d1.c) obj5;
                mh.a aVar4 = (mh.a) obj4;
                p1 p1Var = (p1) obj;
                n2.m mVar8 = (n2.m) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                p1Var.getClass();
                if ((intValue8 & 6) == 0) {
                    if (!((n2.r) mVar8).f(p1Var)) {
                        i11 = 2;
                    }
                    intValue8 |= i11;
                }
                if ((intValue8 & 19) != 18) {
                    z16 = true;
                }
                n2.r rVar8 = (n2.r) mVar8;
                if (rVar8.O(intValue8 & 1, z16)) {
                    Object L10 = rVar8.L();
                    if (L10 == eVar) {
                        L10 = n2.s.w(Boolean.FALSE);
                        rVar8.h0(L10);
                    }
                    n2.w0 w0Var2 = (n2.w0) L10;
                    boolean h11 = rVar8.h(cVar3);
                    Object L11 = rVar8.L();
                    if (h11 || L11 == eVar) {
                        L11 = new nh.c(cVar3, w0Var2, null, 1);
                        rVar8.h0(L11);
                    }
                    n2.s.g(yVar, (mc.p) L11, rVar8);
                    c1.e0.c(p1Var, ((Boolean) w0Var2.getValue()).booleanValue(), null, null, null, null, v2.h.c(575739617, new q0(12, aVar4), rVar8), rVar8, (intValue8 & 14) | 1572864);
                } else {
                    rVar8.R();
                }
                return yVar;
            case l1.c.f8508d /* 9 */:
                q1.a0 a0Var = (q1.a0) obj5;
                x4.m mVar9 = (x4.m) obj4;
                float floatValue = ((Float) obj).floatValue();
                float floatValue2 = ((Float) obj2).floatValue();
                float floatValue3 = ((Float) obj3).floatValue();
                boolean Q = a.a.Q(a0Var, floatValue);
                if (a0Var.m().f12177e != n1.Vertical && mVar9 != x4.m.Ltr) {
                    Q = !Q;
                }
                int i16 = a0Var.m().f12174b;
                if (i16 == 0) {
                    q10 = 0.0f;
                } else {
                    q10 = a.a.q(a0Var) / i16;
                }
                float f13 = q10 - ((int) q10);
                if (Math.abs(floatValue) >= a0Var.f12108q.v(i1.j.f6612a)) {
                    if (floatValue > 0.0f) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                }
                if (!z15) {
                    if (Math.abs(f13) > 0.5f) {
                        floatValue2 = floatValue3;
                    } else {
                        floatValue2 = floatValue3;
                        break;
                    }
                } else {
                    if (!z15) {
                        if (!z15) {
                            floatValue2 = 0.0f;
                        }
                    }
                    floatValue2 = floatValue3;
                }
                return Float.valueOf(floatValue2);
            case l1.c.f8510f /* 10 */:
                mc.l lVar5 = (mc.l) obj5;
                j1.i iVar = (j1.i) obj4;
                b3.p pVar = (b3.p) obj;
                ((Integer) obj3).getClass();
                n2.r rVar9 = (n2.r) ((n2.m) obj2);
                rVar9.X(-102778667);
                Object L12 = rVar9.L();
                zc.u uVar2 = L12;
                if (L12 == eVar) {
                    zc.u o5 = n2.s.o(rVar9);
                    rVar9.h0(o5);
                    uVar2 = o5;
                }
                zc.u uVar3 = (zc.u) uVar2;
                Object L13 = rVar9.L();
                f1 f1Var = L13;
                if (L13 == eVar) {
                    f1 w10 = n2.s.w(null);
                    rVar9.h0(w10);
                    f1Var = w10;
                }
                n2.w0 w0Var3 = (n2.w0) f1Var;
                n2.w0 A = n2.s.A(lVar5, rVar9);
                boolean f14 = rVar9.f(iVar);
                Object L14 = rVar9.L();
                he.g gVar2 = L14;
                if (f14 || L14 == eVar) {
                    he.g gVar3 = new he.g(29, w0Var3, iVar);
                    rVar9.h0(gVar3);
                    gVar2 = gVar3;
                }
                n2.s.d(iVar, (mc.l) gVar2, rVar9);
                boolean h12 = rVar9.h(uVar3) | rVar9.f(iVar) | rVar9.f(A);
                Object L15 = rVar9.L();
                c1 c1Var = L15;
                if (h12 || L15 == eVar) {
                    c1 c1Var2 = new c1(uVar3, w0Var3, iVar, A);
                    rVar9.h0(c1Var2);
                    c1Var = c1Var2;
                }
                b3.p a10 = v3.c0.a(mVar, iVar, (PointerInputEventHandler) c1Var);
                rVar9.p(false);
                return a10;
            default:
                Spannable spannable = (Spannable) obj5;
                n1.h hVar = (n1.h) obj4;
                l4.j0 j0Var = (l4.j0) obj;
                int intValue9 = ((Integer) obj2).intValue();
                int intValue10 = ((Integer) obj3).intValue();
                p4.p pVar2 = j0Var.f8832f;
                p4.j jVar = j0Var.f8829c;
                if (jVar == null) {
                    jVar = p4.j.R;
                }
                p4.h hVar2 = j0Var.f8830d;
                if (hVar2 != null) {
                    i13 = hVar2.f11311a;
                }
                p4.i iVar2 = j0Var.f8831e;
                if (iVar2 != null) {
                    i2 = iVar2.f11312a;
                } else {
                    i2 = 65535;
                }
                t4.c cVar4 = (t4.c) hVar.B;
                p4.r b10 = ((p4.e) cVar4.X).b(pVar2, jVar, i13, i2);
                if (!(b10 instanceof p4.r)) {
                    p1.c1 c1Var3 = new p1.c1(b10, cVar4.f13115d0);
                    cVar4.f13115d0 = c1Var3;
                    Object obj7 = c1Var3.B;
                    obj7.getClass();
                    typeface = (Typeface) obj7;
                } else {
                    Object obj8 = b10.A;
                    obj8.getClass();
                    typeface = (Typeface) obj8;
                }
                spannable.setSpan(new o4.b(1, typeface), intValue9, intValue10, 33);
                return yVar;
        }
    }
}
