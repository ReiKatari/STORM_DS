package lg;

import a4.f0;
import a7.d0;
import a7.m0;
import ai.o0;
import ai.v;
import ai.x;
import android.content.res.Resources;
import b3.p;
import b4.q1;
import b4.r0;
import cd.x0;
import g2.e7;
import g2.f3;
import g2.l0;
import g2.r3;
import g2.t3;
import g2.v3;
import g2.w1;
import g2.y4;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import jg.u;
import l1.c2;
import l1.d1;
import l1.e0;
import l1.h1;
import l1.r1;
import l4.b0;
import l4.c0;
import mc.q;
import me.magnum.melonds.R;
import mh.z;
import n2.p1;
import n2.r;
import n2.s;
import n2.s2;
import n2.t2;
import n2.w0;
import p1.a0;
import y3.v0;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final v2.c f9092a = new v2.c(851538357, false, new b0(19, (byte) 0));

    /* renamed from: b  reason: collision with root package name */
    public static final v2.c f9093b = new v2.c(1507639450, false, new b0(20, (byte) 0));

    /* renamed from: c  reason: collision with root package name */
    public static final v2.c f9094c = new v2.c(1611371408, false, new b0(21, (byte) 0));

    /* renamed from: d  reason: collision with root package name */
    public static final v2.c f9095d = new v2.c(1504001887, false, new b0(22, (byte) 0));

    public static final void a(p pVar, d1 d1Var, kg.h hVar, mc.l lVar, mc.l lVar2, mc.p pVar2, mc.l lVar3, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        pVar.getClass();
        d1Var.getClass();
        hVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        pVar2.getClass();
        lVar3.getClass();
        r rVar = (r) mVar;
        rVar.Z(-1133390423);
        if (rVar.f(d1Var)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i16 = i2 | i10;
        if (rVar.f(hVar)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i17 = i16 | i11;
        if (rVar.h(lVar)) {
            i12 = 2048;
        } else {
            i12 = 1024;
        }
        int i18 = i17 | i12;
        if (rVar.h(lVar2)) {
            i13 = 16384;
        } else {
            i13 = 8192;
        }
        int i19 = i18 | i13;
        if (rVar.h(pVar2)) {
            i14 = 131072;
        } else {
            i14 = 65536;
        }
        int i20 = i19 | i14;
        if (rVar.h(lVar3)) {
            i15 = 1048576;
        } else {
            i15 = 524288;
        }
        int i21 = i20 | i15;
        if ((599187 & i21) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i21 & 1, z10)) {
            if (hVar instanceof kg.f) {
                rVar.X(1733508728);
                j(l1.c.s(pVar, d1Var), rVar, 0);
                rVar.p(false);
            } else if (hVar instanceof kg.g) {
                rVar.X(1733511804);
                f(pVar, d1Var, (List) ((kg.g) hVar).f8298a, lVar, lVar2, pVar2, lVar3, rVar, i21 & 4193406);
                rVar.p(false);
            } else {
                throw w.d.i(rVar, 1733507284, false);
            }
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new o0(pVar, d1Var, hVar, lVar, lVar2, pVar2, lVar3, i2, 1);
        }
    }

    public static final void b(u uVar, k0.d dVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        boolean z10;
        final k0.d dVar2;
        r rVar;
        int i12;
        int i13;
        final u uVar2 = uVar;
        uVar2.getClass();
        dVar.getClass();
        r rVar2 = (r) mVar;
        rVar2.Z(1723248195);
        if (rVar2.h(uVar2)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i14 = i10 | i2;
        if (rVar2.f(dVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i15 = i14 | i11;
        if ((i15 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar2.O(i15 & 1, z10)) {
            String I = l0.f.I(rVar2, R.string.enabled_cheats);
            final d0 K = pc.a.K(new m0[0], rVar2);
            w0 l10 = s.l(new x0(K.f552b.f3945z), null, null, rVar2, 48, 2);
            boolean f8 = rVar2.f((a7.i) l10.getValue());
            Object L = rVar2.L();
            n2.e eVar = n2.l.f9953a;
            if (f8 || L == eVar) {
                L = s.q(new ai.s(l10, 11));
                rVar2.h0(L);
            }
            s2 s2Var = (s2) L;
            boolean f10 = rVar2.f((a7.i) l10.getValue());
            Object L2 = rVar2.L();
            if (f10 || L2 == eVar) {
                L2 = s.q(new a3.e(17, I, l10));
                rVar2.h0(L2);
            }
            s2 s2Var2 = (s2) L2;
            final Resources resources = (Resources) rVar2.j(r0.f1938c);
            Object L3 = rVar2.L();
            if (L3 == eVar) {
                L3 = new y4();
                rVar2.h0(L3);
            }
            final y4 y4Var = (y4) L3;
            t3 d4 = r3.d(y4Var, rVar2, 1);
            Object L4 = rVar2.L();
            if (L4 == eVar) {
                L4 = s.o(rVar2);
                rVar2.h0(L4);
            }
            final zc.u uVar3 = (zc.u) L4;
            s9.a a10 = s9.c.a(rVar2);
            boolean h2 = rVar2.h(K) | rVar2.h(uVar2);
            Object L5 = rVar2.L();
            if (h2 || L5 == eVar) {
                L5 = new a3.e(18, K, uVar2);
                rVar2.h0(L5);
            }
            mc.a aVar = (mc.a) L5;
            t2 t2Var = g2.m0.f5257a;
            s9.a.b(a10, ((l0) rVar2.j(t2Var)).h());
            a10.a(false);
            boolean h10 = rVar2.h(uVar2) | rVar2.h(K);
            Object L6 = rVar2.L();
            if (h10 || L6 == eVar) {
                L6 = new i(uVar2, K, null, 0);
                rVar2.h0(L6);
            }
            y yVar = y.f14813a;
            s.g(yVar, (mc.p) L6, rVar2);
            boolean h11 = rVar2.h(uVar2) | rVar2.h(K);
            Object L7 = rVar2.L();
            if (h11 || L7 == eVar) {
                L7 = new i(uVar2, K, null, 1);
                rVar2.h0(L7);
            }
            s.g(yVar, (mc.p) L7, rVar2);
            boolean h12 = rVar2.h(uVar2) | rVar2.h(K);
            Object L8 = rVar2.L();
            if (h12 || L8 == eVar) {
                L8 = new i(uVar2, K, null, 2);
                rVar2.h0(L8);
            }
            s.g(yVar, (mc.p) L8, rVar2);
            boolean h13 = rVar2.h(uVar2) | rVar2.h(K);
            Object L9 = rVar2.L();
            if (h13 || L9 == eVar) {
                L9 = new i(uVar2, K, null, 3);
                rVar2.h0(L9);
            }
            s.g(yVar, (mc.p) L9, rVar2);
            boolean f11 = rVar2.f(aVar);
            Object L10 = rVar2.L();
            if (!f11 && L10 != eVar) {
                i13 = 1;
            } else {
                i13 = 1;
                L10 = new e(1, aVar);
                rVar2.h0(L10);
            }
            aj.g.a(false, (mc.a) L10, rVar2, 0, i13);
            e0 e0Var = r1.f8615c;
            long j2 = ((l0) rVar2.j(t2Var)).j();
            WeakHashMap weakHashMap = c2.f8518w;
            uVar2 = uVar;
            dVar2 = dVar;
            rVar = rVar2;
            i12 = 16;
            r3.b(l1.s.f(rVar2).f8530l, e0Var, d4, v2.h.c(-1680009411, new b2.e(s2Var2, aVar, s2Var, uVar, 2), rVar2), null, null, null, 0, false, null, 0.0f, 0L, 0L, 0L, j2, 0L, v2.h.c(47562212, new q() { // from class: lg.g
                @Override // mc.q
                public final Object i(Object obj, Object obj2, Object obj3) {
                    boolean z11;
                    int i16;
                    d1 d1Var = (d1) obj;
                    n2.m mVar2 = (n2.m) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    d1Var.getClass();
                    if ((intValue & 6) == 0) {
                        if (((r) mVar2).f(d1Var)) {
                            i16 = 4;
                        } else {
                            i16 = 2;
                        }
                        intValue |= i16;
                    }
                    boolean z12 = false;
                    if ((intValue & 19) != 18) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    r rVar3 = (r) mVar2;
                    if (rVar3.O(intValue & 1, z11)) {
                        Object L11 = rVar3.L();
                        n2.e eVar2 = n2.l.f9953a;
                        if (L11 == eVar2) {
                            L11 = new c0(13);
                            rVar3.h0(L11);
                        }
                        mc.l lVar = (mc.l) L11;
                        Object L12 = rVar3.L();
                        if (L12 == eVar2) {
                            L12 = new c0(14);
                            rVar3.h0(L12);
                        }
                        mc.l lVar2 = (mc.l) L12;
                        Object L13 = rVar3.L();
                        if (L13 == eVar2) {
                            L13 = new c0(8);
                            rVar3.h0(L13);
                        }
                        mc.l lVar3 = (mc.l) L13;
                        Object L14 = rVar3.L();
                        if (L14 == eVar2) {
                            L14 = new c0(9);
                            rVar3.h0(L14);
                        }
                        mc.l lVar4 = (mc.l) L14;
                        int i17 = intValue;
                        u uVar4 = uVar2;
                        boolean h14 = rVar3.h(uVar4);
                        if ((i17 & 14) == 4) {
                            z12 = true;
                        }
                        zc.u uVar5 = uVar3;
                        Resources resources2 = resources;
                        boolean h15 = h14 | z12 | rVar3.h(uVar5) | rVar3.h(resources2);
                        Object L15 = rVar3.L();
                        if (h15 || L15 == eVar2) {
                            d2.a aVar2 = new d2.a(uVar4, d1Var, uVar5, resources2, y4Var, 5);
                            rVar3.h0(aVar2);
                            L15 = aVar2;
                        }
                        a.a.e(d0.this, dVar2, null, null, null, lVar, lVar2, lVar3, lVar4, (mc.l) L15, rVar3, 920125440, 1084);
                    } else {
                        rVar3.R();
                    }
                    return y.f14813a;
                }
            }, rVar2), rVar, 3120, 100663296, 196592);
        } else {
            dVar2 = dVar;
            rVar = rVar2;
            i12 = 16;
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new ai.r0(uVar2, dVar2, i2, i12);
        }
    }

    public static final void c(p pVar, d1 d1Var, kg.h hVar, mc.l lVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        pVar.getClass();
        d1Var.getClass();
        hVar.getClass();
        lVar.getClass();
        r rVar = (r) mVar;
        rVar.Z(-1863343579);
        if (rVar.f(d1Var)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i13 = i2 | i10;
        if (rVar.f(hVar)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i14 = i13 | i11;
        if (rVar.h(lVar)) {
            i12 = 2048;
        } else {
            i12 = 1024;
        }
        int i15 = i14 | i12;
        if ((i15 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i15 & 1, z10)) {
            if (hVar instanceof kg.f) {
                rVar.X(328191092);
                j(l1.c.s(pVar, d1Var), rVar, 0);
                rVar.p(false);
            } else if (hVar instanceof kg.g) {
                rVar.X(328194029);
                h(pVar, d1Var, (List) ((kg.g) hVar).f8298a, lVar, rVar, i15 & 7294);
                rVar.p(false);
            } else {
                throw w.d.i(rVar, 328189509, false);
            }
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new k(pVar, d1Var, hVar, lVar, i2, 0);
        }
    }

    public static final void d(p pVar, d1 d1Var, kg.h hVar, mc.l lVar, mc.l lVar2, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        pVar.getClass();
        d1Var.getClass();
        hVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        r rVar = (r) mVar;
        rVar.Z(1156545762);
        if (rVar.f(d1Var)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i14 = i2 | i10;
        if (rVar.f(hVar)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i15 = i14 | i11;
        if (rVar.h(lVar)) {
            i12 = 2048;
        } else {
            i12 = 1024;
        }
        int i16 = i15 | i12;
        if (rVar.h(lVar2)) {
            i13 = 16384;
        } else {
            i13 = 8192;
        }
        int i17 = i16 | i13;
        if ((i17 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i17 & 1, z10)) {
            if (hVar instanceof kg.f) {
                rVar.X(-956043439);
                j(l1.c.s(pVar, d1Var), rVar, 0);
                rVar.p(false);
            } else if (hVar instanceof kg.g) {
                rVar.X(-956040459);
                g(pVar, d1Var, (List) ((kg.g) hVar).f8298a, lVar, lVar2, rVar, i17 & 64638);
                rVar.p(false);
            } else {
                throw w.d.i(rVar, -956045010, false);
            }
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new v(pVar, d1Var, hVar, lVar, lVar2, i2, 2);
        }
    }

    public static final void e(p pVar, d1 d1Var, kg.h hVar, mc.l lVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        pVar.getClass();
        d1Var.getClass();
        hVar.getClass();
        lVar.getClass();
        r rVar = (r) mVar;
        rVar.Z(1411501135);
        if (rVar.f(d1Var)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i13 = i2 | i10;
        if (rVar.f(hVar)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i14 = i13 | i11;
        if (rVar.h(lVar)) {
            i12 = 2048;
        } else {
            i12 = 1024;
        }
        int i15 = i14 | i12;
        if ((i15 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i15 & 1, z10)) {
            if (hVar instanceof kg.f) {
                rVar.X(-757067682);
                j(l1.c.s(pVar, d1Var), rVar, 0);
                rVar.p(false);
            } else if (hVar instanceof kg.g) {
                rVar.X(-757064749);
                i(pVar, d1Var, (List) ((kg.g) hVar).f8298a, lVar, rVar, i15 & 7294);
                rVar.p(false);
            } else {
                throw w.d.i(rVar, -757069238, false);
            }
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new k(pVar, d1Var, hVar, lVar, i2, 1);
        }
    }

    public static final void f(p pVar, d1 d1Var, List list, mc.l lVar, mc.l lVar2, mc.p pVar2, mc.l lVar3, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        mc.l lVar4;
        mc.p pVar3;
        b3.m mVar2;
        l1.s sVar;
        int i16;
        boolean z11;
        boolean z12;
        n2.e eVar;
        w0 w0Var;
        int i17;
        w0 w0Var2;
        int i18;
        int i19;
        r rVar = (r) mVar;
        rVar.Z(-1442409283);
        if (rVar.f(d1Var)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i20 = i2 | i10;
        if (rVar.h(list)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i21 = i20 | i11;
        if (rVar.h(lVar)) {
            i12 = 2048;
        } else {
            i12 = 1024;
        }
        int i22 = i21 | i12;
        if (rVar.h(lVar2)) {
            i13 = 16384;
        } else {
            i13 = 8192;
        }
        int i23 = i22 | i13;
        if (rVar.h(pVar2)) {
            i14 = 131072;
        } else {
            i14 = 65536;
        }
        int i24 = i23 | i14;
        if (rVar.h(lVar3)) {
            i15 = 1048576;
        } else {
            i15 = 524288;
        }
        int i25 = i24 | i15;
        if ((599187 & i25) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i25 & 1, z10)) {
            Object[] objArr = new Object[0];
            a0 a0Var = kg.d.f8294a;
            Object L = rVar.L();
            n2.e eVar2 = n2.l.f9953a;
            if (L == eVar2) {
                L = new v3(13);
                rVar.h0(L);
            }
            Object[] copyOf = Arrays.copyOf(objArr, 0);
            a0Var.getClass();
            w0 w0Var3 = (w0) y2.k.e(copyOf, new a0(28, new y2.b(0, a0Var), new z(25, a0Var)), (mc.a) L, rVar, 3456, 0);
            v0 d4 = l1.p.d(b3.c.A, false);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            p c4 = b3.a.c(pVar, rVar);
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
            boolean isEmpty = list.isEmpty();
            b3.m mVar3 = b3.m.f1770a;
            l1.s sVar2 = l1.s.f8618b;
            if (isEmpty) {
                rVar.X(-649043771);
                sVar = sVar2;
                i16 = 0;
                mVar2 = mVar3;
                e7.b(l0.f.I(rVar, R.string.folder_is_empty), sVar2.e(l1.c.t(l1.c.s(mVar3, d1Var), 24), b3.c.X), 0L, 0L, null, 0L, new w4.k(3), 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 130556);
                rVar = rVar;
                rVar.p(false);
                i17 = i25;
                w0Var2 = w0Var3;
                eVar = eVar2;
            } else {
                mVar2 = mVar3;
                sVar = sVar2;
                i16 = 0;
                rVar = rVar;
                rVar.X(-648768429);
                p k10 = l1.c.k(pVar, d1Var);
                t2 t2Var = q1.f1924n;
                float f8 = 16;
                h1 h1Var = new h1(l1.c.j(d1Var, (x4.m) rVar.j(t2Var)), d1Var.b(), l1.c.i(d1Var, (x4.m) rVar.j(t2Var)), d1Var.a() + f8 + 56 + f8);
                boolean h2 = rVar.h(list);
                if ((i25 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean f10 = h2 | z11 | rVar.f(w0Var3);
                if ((3670016 & i25) == 1048576) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z13 = f10 | z12;
                Object L2 = rVar.L();
                eVar = eVar2;
                if (!z13 && L2 != eVar) {
                    w0Var = w0Var3;
                } else {
                    ai.x0 x0Var = new ai.x0(list, lVar, (Object) w0Var3, (Object) lVar3, 5);
                    w0Var = w0Var3;
                    rVar.h0(x0Var);
                    L2 = x0Var;
                }
                i17 = i25;
                w0Var2 = w0Var;
                k0.d.c(k10, null, h1Var, null, null, null, false, null, (mc.l) L2, rVar, 0, 506);
                rVar.p(false);
            }
            float f11 = 16;
            p x9 = l1.c.x(sVar.e(mVar2, b3.c.f1754c0), 0.0f, 0.0f, l1.c.i(d1Var, (x4.m) rVar.j(q1.f1924n)) + f11, d1Var.a() + f11, 3);
            boolean f12 = rVar.f(w0Var2);
            Object L3 = rVar.L();
            if (f12 || L3 == eVar) {
                L3 = new ai.s(w0Var2, 9);
                rVar.h0(L3);
            }
            w1.a((mc.a) L3, x9, null, 0L, 0L, null, f9092a, rVar, 12582912);
            rVar.p(true);
            kg.d dVar = (kg.d) w0Var2.getValue();
            boolean f13 = rVar.f(w0Var2);
            Object L4 = rVar.L();
            if (f13 || L4 == eVar) {
                L4 = new ai.s(w0Var2, 10);
                rVar.h0(L4);
            }
            mc.a aVar = (mc.a) L4;
            boolean f14 = rVar.f(w0Var2);
            if ((i17 & 57344) == 16384) {
                i18 = 1;
            } else {
                i18 = i16;
            }
            int i26 = f14 | i18;
            if ((i17 & 458752) == 131072) {
                i19 = 1;
            } else {
                i19 = i16;
            }
            int i27 = i26 | i19;
            Object L5 = rVar.L();
            if (i27 == 0 && L5 != eVar) {
                lVar4 = lVar2;
                pVar3 = pVar2;
            } else {
                lVar4 = lVar2;
                pVar3 = pVar2;
                L5 = new ai.c0(lVar4, pVar3, w0Var2, 10);
                rVar.h0(L5);
            }
            mg.n.b(dVar, aVar, (mc.l) L5, rVar, i16);
        } else {
            lVar4 = lVar2;
            pVar3 = pVar2;
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new o0(pVar, d1Var, list, lVar, lVar4, pVar3, lVar3, i2, 2);
        }
    }

    public static final void g(p pVar, d1 d1Var, List list, mc.l lVar, mc.l lVar2, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        mc.l lVar3;
        rg.d dVar;
        Resources resources;
        b3.m mVar2;
        Object obj;
        l1.s sVar;
        boolean z11;
        boolean z12;
        boolean z13;
        r rVar = (r) mVar;
        rVar.Z(1961175383);
        if (rVar.f(d1Var)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i14 = i2 | i10;
        if (rVar.h(list)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i15 = i14 | i11;
        if (rVar.h(lVar)) {
            i12 = 2048;
        } else {
            i12 = 1024;
        }
        int i16 = i15 | i12;
        if (rVar.h(lVar2)) {
            i13 = 16384;
        } else {
            i13 = 8192;
        }
        int i17 = i16 | i13;
        if ((i17 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i17 & 1, z10)) {
            rg.d D = p7.m.D(rVar);
            Resources resources2 = (Resources) rVar.j(r0.f1938c);
            v0 d4 = l1.p.d(b3.c.A, false);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            p c4 = b3.a.c(pVar, rVar);
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
            boolean isEmpty = list.isEmpty();
            b3.m mVar3 = b3.m.f1770a;
            Object obj2 = n2.l.f9953a;
            l1.s sVar2 = l1.s.f8618b;
            if (isEmpty) {
                rVar.X(1890208383);
                mVar2 = mVar3;
                dVar = D;
                resources = resources2;
                z11 = false;
                obj = obj2;
                sVar = sVar2;
                e7.b(l0.f.I(rVar, R.string.no_cheats_found), sVar2.e(l1.c.t(l1.c.s(mVar3, d1Var), 24), b3.c.X), 0L, 0L, null, 0L, new w4.k(3), 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 130556);
                rVar = rVar;
                rVar.p(false);
            } else {
                dVar = D;
                resources = resources2;
                mVar2 = mVar3;
                obj = obj2;
                sVar = sVar2;
                z11 = false;
                rVar.X(1890471790);
                p k10 = l1.c.k(r1.f8615c, d1Var);
                t2 t2Var = q1.f1924n;
                float f8 = 16;
                h1 h1Var = new h1(l1.c.j(d1Var, (x4.m) rVar.j(t2Var)), d1Var.b(), l1.c.i(d1Var, (x4.m) rVar.j(t2Var)), d1Var.a() + f8 + 56 + f8);
                boolean h2 = rVar.h(list);
                if ((i17 & 7168) == 2048) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z14 = h2 | z12;
                Object L = rVar.L();
                if (z14 || L == obj) {
                    L = new l(list, lVar, 1);
                    rVar.h0(L);
                }
                k0.d.c(k10, null, h1Var, null, null, null, false, null, (mc.l) L, rVar, 0, 506);
                rVar.p(false);
            }
            float f10 = 16;
            p x9 = l1.c.x(sVar.e(mVar2, b3.c.f1754c0), 0.0f, 0.0f, l1.c.i(d1Var, (x4.m) rVar.j(q1.f1924n)) + f10, d1Var.a() + f10, 3);
            rg.d dVar2 = dVar;
            Resources resources3 = resources;
            boolean f11 = rVar.f(dVar2) | rVar.h(resources3);
            if ((i17 & 57344) == 16384) {
                z13 = true;
            } else {
                z13 = z11;
            }
            boolean z15 = f11 | z13;
            Object L2 = rVar.L();
            if (!z15 && L2 != obj) {
                lVar3 = lVar2;
            } else {
                lVar3 = lVar2;
                L2 = new ai.p(dVar2, resources3, lVar3, 3);
                rVar.h0(L2);
            }
            w1.a((mc.a) L2, x9, null, 0L, 0L, null, f9095d, rVar, 12582912);
            rVar.p(true);
            p7.m.c(l0.f.I(rVar, R.string.add_cheat_folder), dVar2, null, null, rVar, 0, 12);
        } else {
            lVar3 = lVar2;
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new v(pVar, d1Var, list, lVar, lVar3, i2, 3);
        }
    }

    public static final void h(p pVar, d1 d1Var, List list, mc.l lVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        r rVar = (r) mVar;
        rVar.Z(-1661538873);
        if (rVar.f(d1Var)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i13 = i2 | i10;
        if (rVar.h(list)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i14 = i13 | i11;
        if (rVar.h(lVar)) {
            i12 = 2048;
        } else {
            i12 = 1024;
        }
        int i15 = i14 | i12;
        if ((i15 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i15 & 1, z10)) {
            if (list.isEmpty()) {
                rVar.X(593703914);
                p s10 = l1.c.s(pVar, d1Var);
                v0 d4 = l1.p.d(b3.c.A, false);
                int hashCode = Long.hashCode(rVar.T);
                v2.g l10 = rVar.l();
                p c4 = b3.a.c(s10, rVar);
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
                e7.b(l0.f.I(rVar, R.string.no_enabled_cheats_for_rom), l1.s.f8618b.e(l1.c.t(b3.m.f1770a, 24), b3.c.X), 0L, 0L, null, 0L, new w4.k(3), 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 130556);
                rVar = rVar;
                rVar.p(true);
                rVar.p(false);
            } else {
                boolean z11 = true;
                rVar.X(594018502);
                p k10 = l1.c.k(pVar, d1Var);
                boolean h2 = rVar.h(list);
                if ((i15 & 7168) != 2048) {
                    z11 = false;
                }
                boolean z12 = z11 | h2;
                Object L = rVar.L();
                if (z12 || L == n2.l.f9953a) {
                    L = new l(list, lVar, 0);
                    rVar.h0(L);
                }
                k0.d.c(k10, null, d1Var, null, null, null, false, null, (mc.l) L, rVar, (i15 << 3) & 896, 506);
                rVar.p(false);
            }
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new m(pVar, d1Var, list, lVar, i2, 0);
        }
    }

    public static final void i(p pVar, d1 d1Var, List list, mc.l lVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        r rVar = (r) mVar;
        rVar.Z(-1123439552);
        if (rVar.f(d1Var)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i13 = i2 | i10;
        if (rVar.h(list)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i14 = i13 | i11;
        if (rVar.h(lVar)) {
            i12 = 2048;
        } else {
            i12 = 1024;
        }
        int i15 = i14 | i12;
        if ((i15 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i15 & 1, z10)) {
            if (list.isEmpty()) {
                rVar.X(-2002361285);
                p s10 = l1.c.s(pVar, d1Var);
                v0 d4 = l1.p.d(b3.c.A, false);
                int hashCode = Long.hashCode(rVar.T);
                v2.g l10 = rVar.l();
                p c4 = b3.a.c(s10, rVar);
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
                e7.b(l0.f.I(rVar, R.string.no_cheats_found), l1.s.f8618b.e(l1.c.t(b3.m.f1770a, 24), b3.c.X), 0L, 0L, null, 0L, new w4.k(3), 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 130556);
                rVar = rVar;
                rVar.p(true);
                rVar.p(false);
            } else {
                boolean z11 = true;
                rVar.X(-2002059872);
                p k10 = l1.c.k(pVar, d1Var);
                boolean h2 = rVar.h(list);
                if ((i15 & 7168) != 2048) {
                    z11 = false;
                }
                boolean z12 = z11 | h2;
                Object L = rVar.L();
                if (z12 || L == n2.l.f9953a) {
                    L = new l(list, lVar, 2);
                    rVar.h0(L);
                }
                k0.d.c(k10, null, d1Var, null, null, null, false, null, (mc.l) L, rVar, (i15 << 3) & 896, 506);
                rVar.p(false);
            }
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new m(pVar, d1Var, list, lVar, i2, 1);
        }
    }

    public static final void j(p pVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        pVar.getClass();
        r rVar = (r) mVar;
        rVar.Z(-2353038);
        if (rVar.f(pVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i2;
        if ((i11 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i11 & 1, z10)) {
            v0 d4 = l1.p.d(b3.c.A, false);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            p c4 = b3.a.c(pVar, rVar);
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
            f3.a(l1.s.f8618b.e(b3.m.f1770a, b3.c.X), 0L, 0.0f, 0L, 0, rVar, 0, 30);
            rVar.p(true);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new x(pVar, i2, 4);
        }
    }
}
