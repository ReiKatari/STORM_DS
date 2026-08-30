package ai;

import f2.i1;
import f2.j1;
import g2.b2;
import g2.e7;
import g2.f7;
import g2.g7;
import g2.h3;
import g2.w1;
import l1.d1;
import l1.m1;
import l1.o1;
import l1.p1;
import l1.r1;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.r;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements mc.q {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ a0(Object obj, Object obj2, Object obj3, int i2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [int] */
    /* JADX WARN: Type inference failed for: r10v22 */
    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        boolean z10;
        double d4;
        float f8;
        float f10;
        int i2;
        boolean z11;
        int i10;
        boolean z12;
        int i11;
        boolean z13;
        int i12;
        boolean z14;
        boolean z15;
        boolean z16;
        String str;
        int i13;
        switch (this.A) {
            case 0:
                zh.e eVar = (zh.e) this.B;
                e.k kVar = (e.k) this.L;
                e.k kVar2 = (e.k) this.R;
                n2.m mVar = (n2.m) obj2;
                ((Integer) obj3).getClass();
                ((c1.f0) obj).getClass();
                l1.w a10 = l1.u.a(l1.i.f8573c, b3.c.f1758g0, mVar, 0);
                n2.r rVar = (n2.r) mVar;
                int hashCode = Long.hashCode(rVar.T);
                v2.g l10 = rVar.l();
                b3.p c4 = b3.a.c(b3.m.f1770a, mVar);
                a4.h.f220a.getClass();
                a4.f0 f0Var = a4.g.f212b;
                rVar.b0();
                if (rVar.S) {
                    rVar.k(f0Var);
                } else {
                    rVar.k0();
                }
                n2.s.C(a10, a4.g.f215e, mVar);
                n2.s.C(l10, a4.g.f214d, mVar);
                n2.s.u(mVar, Integer.valueOf(hashCode), a4.g.f216f);
                n2.s.y(mVar, a4.g.f217g);
                n2.s.C(c4, a4.g.f213c, mVar);
                String I = l0.f.I(mVar, R.string.label_rom_config_gba_rom_path);
                String str2 = eVar.f15124e.f15136b;
                if (str2 == null) {
                    rVar.X(-615904797);
                    str2 = l0.f.I(mVar, R.string.not_set);
                } else {
                    rVar.X(-615905975);
                }
                rVar.p(false);
                String str3 = str2;
                boolean h2 = rVar.h(kVar);
                Object L = rVar.L();
                n2.e eVar2 = n2.l.f9953a;
                if (h2 || L == eVar2) {
                    L = new y(kVar, 0);
                    rVar.h0(L);
                }
                ug.b.a(I, str3, true, (mc.a) L, 0.0f, mVar, 384, 16);
                String I2 = l0.f.I(mVar, R.string.label_rom_config_gba_save_path);
                String str4 = eVar.f15124e.f15137c;
                if (str4 == null) {
                    rVar.X(-615891389);
                    str4 = l0.f.I(mVar, R.string.not_set);
                } else {
                    rVar.X(-615892598);
                }
                rVar.p(false);
                String str5 = str4;
                boolean h10 = rVar.h(kVar2);
                Object L2 = rVar.L();
                if (h10 || L2 == eVar2) {
                    L2 = new y(kVar2, 1);
                    rVar.h0(L2);
                }
                ug.b.a(I2, str5, true, (mc.a) L2, 0.0f, mVar, 384, 16);
                rVar.p(true);
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                mc.p pVar = (mc.p) this.B;
                v2.c cVar = (v2.c) this.L;
                mc.q qVar = (mc.q) this.R;
                p1 p1Var = (p1) obj;
                n2.m mVar2 = (n2.m) obj2;
                int intValue = ((Integer) obj3).intValue();
                b3.g gVar = b3.c.f1756e0;
                if ((intValue & 6) == 0) {
                    if (((n2.r) mVar2).f(p1Var)) {
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
                n2.r rVar2 = (n2.r) mVar2;
                if (rVar2.O(intValue & 1, z10)) {
                    if (pVar == null) {
                        rVar2.X(-1394361313);
                        l1.c.d(g2.a0.f5038c, rVar2);
                        rVar2.p(false);
                        d4 = 0.5d;
                    } else {
                        rVar2.X(-1394295686);
                        b3.p pVar2 = g2.a0.f5039d;
                        o1 a11 = m1.a(l1.i.f8571a, gVar, rVar2, 48);
                        int hashCode2 = Long.hashCode(rVar2.T);
                        v2.g l11 = rVar2.l();
                        b3.p c10 = b3.a.c(pVar2, rVar2);
                        a4.h.f220a.getClass();
                        d4 = 0.5d;
                        a4.f0 f0Var2 = a4.g.f212b;
                        rVar2.b0();
                        if (rVar2.S) {
                            rVar2.k(f0Var2);
                        } else {
                            rVar2.k0();
                        }
                        n2.s.C(a11, a4.g.f215e, rVar2);
                        n2.s.C(l11, a4.g.f214d, rVar2);
                        a4.f fVar = a4.g.f216f;
                        if (rVar2.S || !nc.k.a(rVar2.L(), Integer.valueOf(hashCode2))) {
                            w.d.w(hashCode2, rVar2, hashCode2, fVar);
                        }
                        n2.s.C(c10, a4.g.f213c, rVar2);
                        n2.b0 b0Var = g2.o0.f5308a;
                        long j2 = ((i3.s) rVar2.j(g2.q0.f5361a)).f6689a;
                        if (!((g2.l0) rVar2.j(g2.m0.f5257a)).k() ? i3.z.r(j2) < 0.5d : i3.z.r(j2) > 0.5d) {
                            f8 = 1.0f;
                        } else {
                            f8 = 0.87f;
                        }
                        n2.s.a(b0Var.a(Float.valueOf(f8)), pVar, rVar2, 8);
                        rVar2.p(true);
                        rVar2.p(false);
                    }
                    l1.e0 e0Var = r1.f8614b;
                    p1Var.getClass();
                    if (1.0f <= 0.0d) {
                        m1.a.a("invalid weight; must be greater than zero");
                    }
                    b3.p f11 = e0Var.f(new l1.w0(1.0f, true));
                    o1 a12 = m1.a(l1.i.f8571a, gVar, rVar2, 48);
                    int hashCode3 = Long.hashCode(rVar2.T);
                    v2.g l12 = rVar2.l();
                    b3.p c11 = b3.a.c(f11, rVar2);
                    a4.h.f220a.getClass();
                    a4.f0 f0Var3 = a4.g.f212b;
                    rVar2.b0();
                    if (rVar2.S) {
                        rVar2.k(f0Var3);
                    } else {
                        rVar2.k0();
                    }
                    n2.s.C(a12, a4.g.f215e, rVar2);
                    n2.s.C(l12, a4.g.f214d, rVar2);
                    a4.f fVar2 = a4.g.f216f;
                    if (rVar2.S || !nc.k.a(rVar2.L(), Integer.valueOf(hashCode3))) {
                        w.d.w(hashCode3, rVar2, hashCode3, fVar2);
                    }
                    n2.s.C(c11, a4.g.f213c, rVar2);
                    e7.a(((f7) rVar2.j(g7.f5161b)).f5147f, v2.h.c(1206983395, new g2.y(cVar, 0), rVar2), rVar2, 48);
                    rVar2.p(true);
                    n2.b0 b0Var2 = g2.o0.f5308a;
                    long j10 = ((i3.s) rVar2.j(g2.q0.f5361a)).f6689a;
                    if (!((g2.l0) rVar2.j(g2.m0.f5257a)).k() ? i3.z.r(j10) < d4 : i3.z.r(j10) > d4) {
                        f10 = 0.74f;
                    } else {
                        f10 = 0.6f;
                    }
                    n2.s.a(b0Var2.a(Float.valueOf(f10)), v2.h.c(-1033635954, new g2.z(qVar, 0), rVar2), rVar2, 56);
                } else {
                    rVar2.R();
                }
                return yb.y.f14813a;
            case 2:
                bh.g gVar2 = (bh.g) this.B;
                n2.w0 w0Var = (n2.w0) this.L;
                n2.w0 w0Var2 = (n2.w0) this.R;
                d1 d1Var = (d1) obj;
                n2.m mVar3 = (n2.m) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                d1Var.getClass();
                if ((intValue2 & 6) == 0) {
                    if (((n2.r) mVar3).f(d1Var)) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    intValue2 |= i10;
                }
                if ((intValue2 & 19) != 18) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n2.r rVar3 = (n2.r) mVar3;
                if (rVar3.O(intValue2 & 1, z11)) {
                    b3.p a13 = c1.h0.a(l1.c.s(b3.m.f1770a, d1Var));
                    y3.v0 d10 = l1.p.d(b3.c.A, false);
                    int hashCode4 = Long.hashCode(rVar3.T);
                    v2.g l13 = rVar3.l();
                    b3.p c12 = b3.a.c(a13, rVar3);
                    a4.h.f220a.getClass();
                    a4.f0 f0Var4 = a4.g.f212b;
                    rVar3.b0();
                    if (rVar3.S) {
                        rVar3.k(f0Var4);
                    } else {
                        rVar3.k0();
                    }
                    n2.s.C(d10, a4.g.f215e, rVar3);
                    n2.s.C(l13, a4.g.f214d, rVar3);
                    n2.s.u(rVar3, Integer.valueOf(hashCode4), a4.g.f216f);
                    n2.s.y(rVar3, a4.g.f217g);
                    n2.s.C(c12, a4.g.f213c, rVar3);
                    if (((Boolean) w0Var.getValue()).booleanValue()) {
                        rVar3.X(590915709);
                        mh.g0.e(rVar3, 0);
                        rVar3.p(false);
                    } else {
                        rVar3.X(590986823);
                        mh.g0.d(gVar2, (bh.g) w0Var2.getValue(), rVar3, 0);
                        rVar3.p(false);
                    }
                    rVar3.p(true);
                } else {
                    rVar3.R();
                }
                return yb.y.f14813a;
            case 3:
                mh.g gVar3 = (mh.g) this.B;
                n2.w0 w0Var3 = (n2.w0) this.L;
                d1.c cVar2 = (d1.c) this.R;
                p1 p1Var2 = (p1) obj;
                n2.m mVar4 = (n2.m) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                p1Var2.getClass();
                if ((intValue3 & 6) == 0) {
                    if (((n2.r) mVar4).f(p1Var2)) {
                        i11 = 4;
                    } else {
                        i11 = 2;
                    }
                    intValue3 |= i11;
                }
                if ((intValue3 & 19) != 18) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                n2.r rVar4 = (n2.r) mVar4;
                if (rVar4.O(intValue3 & 1, z12)) {
                    mh.g0 g0Var = gVar3.f9686a;
                    boolean f12 = rVar4.f(w0Var3) | rVar4.h(cVar2);
                    Object L3 = rVar4.L();
                    if (f12 || L3 == n2.l.f9953a) {
                        L3 = new nh.c(cVar2, w0Var3, null, 2);
                        rVar4.h0(L3);
                    }
                    n2.s.g(g0Var, (mc.p) L3, rVar4);
                    c1.e0.c(p1Var2, ((Boolean) w0Var3.getValue()).booleanValue(), null, null, null, null, v2.h.c(1433374777, new q0(13, gVar3), rVar4), rVar4, (intValue3 & 14) | 1572864);
                } else {
                    rVar4.R();
                }
                return yb.y.f14813a;
            case 4:
                mc.l lVar = (mc.l) this.B;
                final og.f fVar3 = (og.f) this.L;
                n2.w0 w0Var4 = (n2.w0) this.R;
                n2.m mVar5 = (n2.m) obj2;
                ((Integer) obj3).getClass();
                ((c1.f0) obj).getClass();
                b3.m mVar6 = b3.m.f1770a;
                b3.p x9 = l1.c.x(mVar6, 0.0f, 0.0f, 8, 18, 3);
                o1 a14 = m1.a(l1.i.f8571a, b3.c.f1756e0, mVar5, 48);
                n2.r rVar5 = (n2.r) mVar5;
                int hashCode5 = Long.hashCode(rVar5.T);
                v2.g l14 = rVar5.l();
                b3.p c13 = b3.a.c(x9, mVar5);
                a4.h.f220a.getClass();
                a4.f0 f0Var5 = a4.g.f212b;
                rVar5.b0();
                if (rVar5.S) {
                    rVar5.k(f0Var5);
                } else {
                    rVar5.k0();
                }
                n2.s.C(a14, a4.g.f215e, mVar5);
                n2.s.C(l14, a4.g.f214d, mVar5);
                n2.s.u(mVar5, Integer.valueOf(hashCode5), a4.g.f216f);
                n2.s.y(mVar5, a4.g.f217g);
                n2.s.C(c13, a4.g.f213c, mVar5);
                g2.n0.h(null, t1.e.a(), 0L, 0L, 4, v2.h.c(-922627598, new mc.p() { // from class: og.q
                    @Override // mc.p
                    public final Object j(Object obj4, Object obj5) {
                        boolean z17;
                        boolean z18;
                        switch (r2) {
                            case 0:
                                n2.m mVar7 = (n2.m) obj4;
                                int intValue4 = ((Integer) obj5).intValue();
                                if ((intValue4 & 3) != 2) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                r rVar6 = (r) mVar7;
                                if (rVar6.O(intValue4 & 1, z17)) {
                                    e7.b(fVar3.f10998b, l1.c.u(b3.m.f1770a, 12, 6), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar6, 48, 0, 131068);
                                } else {
                                    rVar6.R();
                                }
                                return y.f14813a;
                            default:
                                n2.m mVar8 = (n2.m) obj4;
                                int intValue5 = ((Integer) obj5).intValue();
                                if ((intValue5 & 3) != 2) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                r rVar7 = (r) mVar8;
                                if (rVar7.O(intValue5 & 1, z18)) {
                                    b2.a(fVar3.f10999c, null, null, 0L, rVar7, 56, 12);
                                } else {
                                    rVar7.R();
                                }
                                return y.f14813a;
                        }
                    }
                }, mVar5), mVar5, 1769472, 29);
                l1.c.d(r1.l(mVar6, 16), mVar5);
                b3.p i14 = r1.i(mVar6, 40);
                boolean f13 = rVar5.f(lVar) | rVar5.h(fVar3);
                Object L4 = rVar5.L();
                if (f13 || L4 == n2.l.f9953a) {
                    L4 = new p(w0Var4, lVar, fVar3);
                    rVar5.h0(L4);
                }
                w1.a((mc.a) L4, i14, null, 0L, 0L, null, v2.h.c(177811640, new mc.p() { // from class: og.q
                    @Override // mc.p
                    public final Object j(Object obj4, Object obj5) {
                        boolean z17;
                        boolean z18;
                        switch (r2) {
                            case 0:
                                n2.m mVar7 = (n2.m) obj4;
                                int intValue4 = ((Integer) obj5).intValue();
                                if ((intValue4 & 3) != 2) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                r rVar6 = (r) mVar7;
                                if (rVar6.O(intValue4 & 1, z17)) {
                                    e7.b(fVar3.f10998b, l1.c.u(b3.m.f1770a, 12, 6), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar6, 48, 0, 131068);
                                } else {
                                    rVar6.R();
                                }
                                return y.f14813a;
                            default:
                                n2.m mVar8 = (n2.m) obj4;
                                int intValue5 = ((Integer) obj5).intValue();
                                if ((intValue5 & 3) != 2) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                r rVar7 = (r) mVar8;
                                if (rVar7.O(intValue5 & 1, z18)) {
                                    b2.a(fVar3.f10999c, null, null, 0L, rVar7, 56, 12);
                                } else {
                                    rVar7.R();
                                }
                                return y.f14813a;
                        }
                    }
                }, mVar5), mVar5, 12582960);
                rVar5.p(true);
                return yb.y.f14813a;
            case l1.c.f8511g /* 5 */:
                rg.d dVar = (rg.d) this.B;
                mc.l lVar2 = (mc.l) this.L;
                n2.w0 w0Var5 = (n2.w0) this.R;
                d1 d1Var2 = (d1) obj;
                n2.m mVar7 = (n2.m) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                d1Var2.getClass();
                if ((intValue4 & 6) == 0) {
                    if (((n2.r) mVar7).f(d1Var2)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    intValue4 |= i12;
                }
                if ((intValue4 & 19) != 18) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                n2.r rVar6 = (n2.r) mVar7;
                if (rVar6.O(intValue4 & 1, z13)) {
                    n2.b0 b0Var3 = j1.f4748a;
                    n2.s.a(b0Var3.a(new i1(((g2.l0) rVar6.j(g2.m0.f5257a)).i(), ((i1) rVar6.j(b0Var3)).f4747b)), v2.h.c(-1145339137, new b2.e(d1Var2, dVar, lVar2, w0Var5), rVar6), rVar6, 56);
                } else {
                    rVar6.R();
                }
                return yb.y.f14813a;
            default:
                n2.w0 w0Var6 = (n2.w0) this.B;
                n2.w0 w0Var7 = (n2.w0) this.L;
                String[] strArr = (String[]) this.R;
                d1 d1Var3 = (d1) obj;
                n2.m mVar8 = (n2.m) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                d1Var3.getClass();
                if ((intValue5 & 6) == 0) {
                    if (((n2.r) mVar8).f(d1Var3)) {
                        i13 = 4;
                    } else {
                        i13 = 2;
                    }
                    intValue5 |= i13;
                }
                boolean z17 = false;
                ?? r10 = 1;
                if ((intValue5 & 19) != 18) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                n2.r rVar7 = (n2.r) mVar8;
                if (rVar7.O(intValue5 & 1, z14)) {
                    b3.m mVar9 = b3.m.f1770a;
                    b3.p s10 = l1.c.s(mVar9, d1Var3);
                    l1.w a15 = l1.u.a(l1.i.f8573c, b3.c.f1758g0, rVar7, 0);
                    int hashCode6 = Long.hashCode(rVar7.T);
                    v2.g l15 = rVar7.l();
                    b3.p c14 = b3.a.c(s10, rVar7);
                    a4.h.f220a.getClass();
                    a4.f0 f0Var6 = a4.g.f212b;
                    rVar7.b0();
                    if (rVar7.S) {
                        rVar7.k(f0Var6);
                    } else {
                        rVar7.k0();
                    }
                    n2.s.C(a15, a4.g.f215e, rVar7);
                    n2.s.C(l15, a4.g.f214d, rVar7);
                    n2.s.u(rVar7, Integer.valueOf(hashCode6), a4.g.f216f);
                    n2.s.y(rVar7, a4.g.f217g);
                    n2.s.C(c14, a4.g.f213c, rVar7);
                    rVar7.X(-1173027909);
                    int i15 = 0;
                    n2.r rVar8 = rVar7;
                    for (Object obj4 : ve.d.getEntries()) {
                        int i16 = i15 + 1;
                        if (i15 >= 0) {
                            ve.d dVar2 = (ve.d) obj4;
                            b3.p b10 = r1.b(mVar9, 1.0f);
                            if (dVar2 == ((ve.d) w0Var6.getValue())) {
                                z15 = r10;
                            } else {
                                z15 = z17;
                            }
                            i4.i iVar = new i4.i(3);
                            boolean d11 = rVar8.d(dVar2.ordinal()) | rVar8.f(w0Var6) | rVar8.f(w0Var7);
                            Object L5 = rVar8.L();
                            if (d11 || L5 == n2.l.f9953a) {
                                L5 = new p(dVar2, w0Var6, w0Var7, 11);
                                rVar8.h0(L5);
                            }
                            b3.p v10 = l1.c.v(s1.c.b(b10, z15, iVar, (mc.a) L5, 10), 0.0f, 12, r10);
                            o1 a16 = m1.a(l1.i.f8571a, b3.c.f1756e0, rVar8, 48);
                            int hashCode7 = Long.hashCode(rVar8.T);
                            v2.g l16 = rVar8.l();
                            b3.p c15 = b3.a.c(v10, rVar8);
                            a4.h.f220a.getClass();
                            a4.f0 f0Var7 = a4.g.f212b;
                            rVar8.b0();
                            if (rVar8.S) {
                                rVar8.k(f0Var7);
                            } else {
                                rVar8.k0();
                            }
                            n2.s.C(a16, a4.g.f215e, rVar8);
                            n2.s.C(l16, a4.g.f214d, rVar8);
                            n2.s.u(rVar8, Integer.valueOf(hashCode7), a4.g.f216f);
                            n2.s.y(rVar8, a4.g.f217g);
                            n2.s.C(c15, a4.g.f213c, rVar8);
                            if (dVar2 == ((ve.d) w0Var6.getValue())) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            h3.a(z16, null, false, g2.n0.n(0, 6, ((g2.l0) rVar8.j(g2.m0.f5257a)).i(), rVar8), rVar8, 48, 28);
                            if (i15 >= 0 && i15 < strArr.length) {
                                str = strArr[i15];
                            } else {
                                str = "";
                            }
                            n2.r rVar9 = rVar8;
                            e7.b(str, l1.c.x(mVar9, 16, 0.0f, 0.0f, 0.0f, 14), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((f7) rVar8.j(g7.f5161b)).f5150i, rVar9, 48, 0, 65532);
                            n2.r rVar10 = rVar9;
                            rVar10.p(true);
                            r10 = 1;
                            i15 = i16;
                            z17 = false;
                            rVar8 = rVar10;
                        } else {
                            p7.t.F();
                            throw null;
                        }
                    }
                    rVar8.p(z17);
                    rVar8.p(r10);
                } else {
                    rVar7.R();
                }
                return yb.y.f14813a;
        }
    }
}
