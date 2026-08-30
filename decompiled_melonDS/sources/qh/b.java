package qh;

import a4.f;
import a4.f0;
import a4.h;
import ai.k0;
import ai.p0;
import b3.p;
import b4.o;
import b4.q1;
import cd.x0;
import f1.n;
import g2.e7;
import g2.f7;
import g2.g7;
import g2.l0;
import g2.m0;
import g2.n0;
import g2.r3;
import g2.r4;
import g2.y1;
import g3.z;
import he.g;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import l1.c2;
import l1.i;
import l1.m1;
import l1.o1;
import l1.r1;
import l1.u;
import l1.w;
import l1.w0;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import mg.m;
import n2.l;
import n2.p1;
import n2.r;
import n2.s;
import n2.t2;
import nc.k;
import oe.x;
import oe.y;
import p7.j;
import p7.t;
import y3.v0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final v2.c f12538a = new v2.c(-690206223, false, new m(12, (byte) 0));

    /* renamed from: b  reason: collision with root package name */
    public static final v2.c f12539b = new v2.c(-879626864, false, new m(13, (byte) 0));

    /* renamed from: c  reason: collision with root package name */
    public static final v2.c f12540c = new v2.c(-2050622722, false, new m(14, (byte) 0));

    /* renamed from: d  reason: collision with root package name */
    public static final v2.c f12541d = new v2.c(714843814, false, new a(0));

    public static final void a(y yVar, boolean z10, mc.a aVar, mc.a aVar2, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        String Y;
        boolean z13;
        int i14;
        String I;
        r rVar = (r) mVar;
        rVar.Z(1793988537);
        if (rVar.f(yVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i15 = i2 | i10;
        if (rVar.g(z10)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i16 = i15 | i11;
        if (rVar.h(aVar)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i17 = i16 | i12;
        if (rVar.h(aVar2)) {
            i13 = 2048;
        } else {
            i13 = 1024;
        }
        int i18 = i17 | i13;
        if ((i18 & 1171) != 1170) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVar.O(i18 & 1, z11)) {
            Object L = rVar.L();
            Object obj = l.f9953a;
            if (L == obj) {
                z zVar = z.f5551b;
                L = g3.y.f5550a;
                rVar.h0(L);
            }
            ((g3.y) L).getClass();
            z zVar2 = new z();
            z zVar3 = new z();
            b3.m mVar2 = b3.m.f1770a;
            p k10 = g3.d.k(mVar2, zVar2);
            if ((i18 & 14) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean f8 = z12 | rVar.f(zVar3);
            Object L2 = rVar.L();
            if (f8 || L2 == obj) {
                L2 = new g(21, yVar, zVar3);
                rVar.h0(L2);
            }
            float f10 = 16;
            p w10 = l1.c.w(n.i(g3.d.i(k10, (mc.l) L2), false, null, aVar, 15), f10, f10, 8, f10);
            o1 a10 = m1.a(i.f8571a, b3.c.f1755d0, rVar, 0);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            p c4 = b3.a.c(w10, rVar);
            h.f220a.getClass();
            f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            f fVar = a4.g.f215e;
            s.C(a10, fVar, rVar);
            f fVar2 = a4.g.f214d;
            s.C(l10, fVar2, rVar);
            Integer valueOf = Integer.valueOf(hashCode);
            f fVar3 = a4.g.f216f;
            s.u(rVar, valueOf, fVar3);
            a4.e eVar = a4.g.f217g;
            s.y(rVar, eVar);
            f fVar4 = a4.g.f213c;
            s.C(c4, fVar4, rVar);
            if (1.0f <= 0.0d) {
                m1.a.a("invalid weight; must be greater than zero");
            }
            w0 w0Var = new w0(1.0f, true);
            w a11 = u.a(i.f8573c, b3.c.f1758g0, rVar, 0);
            int hashCode2 = Long.hashCode(rVar.T);
            v2.g l11 = rVar.l();
            p c10 = b3.a.c(w0Var, rVar);
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            s.C(a11, fVar, rVar);
            s.C(l11, fVar2, rVar);
            w.d.x(hashCode2, rVar, fVar3, rVar, eVar);
            s.C(c10, fVar4, rVar);
            if (z10) {
                z13 = false;
                Y = kc.a.h(rVar, 2025130746, R.string.press_any_button, rVar, false);
            } else {
                rVar.X(2025245818);
                List y10 = t.y(yVar.f10963b, yVar.f10964c);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : y10) {
                    if (!k.a((x) obj2, oe.w.f10961a)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    z13 = false;
                    Y = kc.a.h(rVar, 2025379707, R.string.not_set, rVar, false);
                } else {
                    rVar.X(2025485634);
                    Object L3 = rVar.L();
                    if (L3 == obj) {
                        L3 = new od.x(9);
                        rVar.h0(L3);
                    }
                    Y = zb.l.Y(arrayList, " / ", null, null, (mc.l) L3, 30);
                    z13 = false;
                    rVar.p(false);
                }
                rVar.p(z13);
            }
            oe.s sVar = yVar.f10962a;
            rVar.X(2139434571);
            switch (e.f12542a[sVar.ordinal()]) {
                case DSiCameraSource.FrontCamera /* 1 */:
                    i14 = R.string.input_a;
                    I = l0.f.I(rVar, i14);
                    z13 = false;
                    rVar.p(false);
                    break;
                case 2:
                    i14 = R.string.input_b;
                    I = l0.f.I(rVar, i14);
                    z13 = false;
                    rVar.p(false);
                    break;
                case 3:
                    i14 = R.string.input_x;
                    I = l0.f.I(rVar, i14);
                    z13 = false;
                    rVar.p(false);
                    break;
                case 4:
                    i14 = R.string.input_y;
                    I = l0.f.I(rVar, i14);
                    z13 = false;
                    rVar.p(false);
                    break;
                case l1.c.f8511g /* 5 */:
                    i14 = R.string.input_left;
                    I = l0.f.I(rVar, i14);
                    z13 = false;
                    rVar.p(false);
                    break;
                case l1.c.f8509e /* 6 */:
                    i14 = R.string.input_right;
                    I = l0.f.I(rVar, i14);
                    z13 = false;
                    rVar.p(false);
                    break;
                case 7:
                    i14 = R.string.input_up;
                    I = l0.f.I(rVar, i14);
                    z13 = false;
                    rVar.p(false);
                    break;
                case 8:
                    i14 = R.string.input_down;
                    I = l0.f.I(rVar, i14);
                    z13 = false;
                    rVar.p(false);
                    break;
                case l1.c.f8508d /* 9 */:
                    i14 = R.string.input_l;
                    I = l0.f.I(rVar, i14);
                    z13 = false;
                    rVar.p(false);
                    break;
                case l1.c.f8510f /* 10 */:
                    i14 = R.string.input_r;
                    I = l0.f.I(rVar, i14);
                    z13 = false;
                    rVar.p(false);
                    break;
                case 11:
                    i14 = R.string.input_start;
                    I = l0.f.I(rVar, i14);
                    z13 = false;
                    rVar.p(false);
                    break;
                case 12:
                    i14 = R.string.input_select;
                    I = l0.f.I(rVar, i14);
                    z13 = false;
                    rVar.p(false);
                    break;
                case 13:
                    i14 = R.string.input_lid;
                    I = l0.f.I(rVar, i14);
                    z13 = false;
                    rVar.p(false);
                    break;
                case 14:
                    i14 = R.string.input_pause;
                    I = l0.f.I(rVar, i14);
                    z13 = false;
                    rVar.p(false);
                    break;
                case l1.c.f8512h /* 15 */:
                    i14 = R.string.input_fast_forward;
                    I = l0.f.I(rVar, i14);
                    z13 = false;
                    rVar.p(false);
                    break;
                case 16:
                    i14 = R.string.input_microphone;
                    I = l0.f.I(rVar, i14);
                    z13 = false;
                    rVar.p(false);
                    break;
                case 17:
                    i14 = R.string.input_reset;
                    I = l0.f.I(rVar, i14);
                    z13 = false;
                    rVar.p(false);
                    break;
                case 18:
                    i14 = R.string.input_swap_screens;
                    I = l0.f.I(rVar, i14);
                    z13 = false;
                    rVar.p(false);
                    break;
                case 19:
                    i14 = R.string.input_quick_save;
                    I = l0.f.I(rVar, i14);
                    z13 = false;
                    rVar.p(false);
                    break;
                case 20:
                    i14 = R.string.input_quick_load;
                    I = l0.f.I(rVar, i14);
                    z13 = false;
                    rVar.p(false);
                    break;
                case 21:
                    i14 = R.string.rewind;
                    I = l0.f.I(rVar, i14);
                    z13 = false;
                    rVar.p(false);
                    break;
                default:
                    rVar.p(z13);
                    I = null;
                    break;
            }
            if (I == null) {
                I = "";
            }
            t2 t2Var = g7.f5161b;
            e7.b(I, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((f7) rVar.j(t2Var)).f5150i, rVar, 0, 0, 65534);
            e7.b(Y, null, ((l0) rVar.j(m0.f5257a)).c(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((f7) rVar.j(t2Var)).f5150i, rVar, 0, 0, 65530);
            rVar = rVar;
            rVar.p(true);
            if (yVar.a()) {
                rVar.X(246797240);
                p k11 = g3.d.k(mVar2, zVar3);
                boolean f11 = rVar.f(zVar2);
                Object L4 = rVar.L();
                if (f11 || L4 == obj) {
                    L4 = new ai.t(zVar2, 3);
                    rVar.h0(L4);
                }
                y1.a(aVar2, g3.d.i(k11, (mc.l) L4), false, f12540c, rVar, ((i18 >> 9) & 14) | 24576, 12);
                rVar.p(false);
            } else {
                rVar.X(247134861);
                rVar.p(false);
            }
            rVar.p(true);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new ai.d(yVar, z10, aVar, aVar2, i2);
        }
    }

    public static final void b(ph.f fVar, mc.a aVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        boolean z10;
        mc.a aVar2;
        r rVar;
        ph.f fVar2;
        n2.e eVar;
        fVar.getClass();
        aVar.getClass();
        r rVar2 = (r) mVar;
        rVar2.Z(17335339);
        if (rVar2.h(fVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i2;
        if (rVar2.h(aVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i13 = i12 | i11;
        if ((i13 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar2.O(i13 & 1, z10)) {
            n2.w0 l10 = j.l(fVar.f11653d, rVar2);
            n2.w0 l11 = j.l(fVar.f11655f, rVar2);
            x0 x0Var = fVar.f11657h;
            List list = (List) l10.getValue();
            oe.s sVar = (oe.s) l11.getValue();
            boolean h2 = rVar2.h(fVar);
            Object L = rVar2.L();
            n2.e eVar2 = l.f9953a;
            if (!h2 && L != eVar2) {
                eVar = eVar2;
            } else {
                eVar = eVar2;
                a2.g gVar = new a2.g(1, fVar, ph.f.class, "startInputAssignment", "startInputAssignment(Lme/magnum/melonds/domain/model/Input;)V", 0, 0, 17);
                rVar2.h0(gVar);
                L = gVar;
            }
            mc.l lVar = (mc.l) ((nc.i) L);
            boolean h10 = rVar2.h(fVar);
            Object L2 = rVar2.L();
            if (h10 || L2 == eVar) {
                a2.g gVar2 = new a2.g(1, fVar, ph.f.class, "clearInputAssignment", "clearInputAssignment(Lme/magnum/melonds/domain/model/Input;)V", 0, 0, 18);
                rVar2.h0(gVar2);
                L2 = gVar2;
            }
            mc.l lVar2 = (mc.l) ((nc.i) L2);
            boolean h11 = rVar2.h(fVar);
            Object L3 = rVar2.L();
            if (!h11 && L3 != eVar) {
                fVar2 = fVar;
            } else {
                o oVar = new o(0, fVar, ph.f.class, "stopInputAssignment", "stopInputAssignment()V", 0, 0, 5);
                fVar2 = fVar;
                rVar2.h0(oVar);
                L3 = oVar;
            }
            aVar2 = aVar;
            rVar = rVar2;
            c(list, sVar, x0Var, lVar, lVar2, (mc.a) ((nc.i) L3), aVar2, rVar, (i13 << 15) & 3670016);
        } else {
            aVar2 = aVar;
            rVar = rVar2;
            fVar2 = fVar;
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new c(fVar2, aVar2, i2, 0);
        }
    }

    public static final void c(List list, oe.s sVar, cd.h hVar, mc.l lVar, mc.l lVar2, mc.a aVar, mc.a aVar2, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        r rVar;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int ordinal;
        int i16;
        int i17;
        r rVar2 = (r) mVar;
        rVar2.Z(-1528446983);
        if ((i2 & 6) == 0) {
            if (rVar2.h(list)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i10 = i17 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (sVar == null) {
                ordinal = -1;
            } else {
                ordinal = sVar.ordinal();
            }
            if (rVar2.d(ordinal)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i10 |= i16;
        }
        if ((i2 & 384) == 0) {
            if (rVar2.h(hVar)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i10 |= i15;
        }
        if ((i2 & 3072) == 0) {
            if (rVar2.h(lVar)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i10 |= i14;
        }
        if ((i2 & 24576) == 0) {
            if (rVar2.h(lVar2)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i10 |= i13;
        }
        if ((196608 & i2) == 0) {
            if (rVar2.h(aVar)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i10 |= i12;
        }
        if ((1572864 & i2) == 0) {
            if (rVar2.h(aVar2)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i10 |= i11;
        }
        boolean z12 = true;
        if ((599187 & i10) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar2.O(i10 & 1, z10)) {
            s9.a a10 = s9.c.a(rVar2);
            g3.l lVar3 = (g3.l) rVar2.j(q1.f1920i);
            t2 t2Var = m0.f5257a;
            s9.a.b(a10, ((l0) rVar2.j(t2Var)).h());
            a10.a(false);
            if (sVar != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((i10 & 458752) != 131072) {
                z12 = false;
            }
            Object L = rVar2.L();
            n2.e eVar = l.f9953a;
            if (z12 || L == eVar) {
                L = new lg.e(5, aVar);
                rVar2.h0(L);
            }
            aj.g.a(z11, (mc.a) L, rVar2, 0, 0);
            boolean h2 = rVar2.h(hVar) | rVar2.h(lVar3);
            Object L2 = rVar2.L();
            if (h2 || L2 == eVar) {
                L2 = new mh.m(hVar, lVar3, null, 5);
                rVar2.h0(L2);
            }
            s.g(yb.y.f14813a, (mc.p) L2, rVar2);
            long j2 = ((l0) rVar2.j(t2Var)).j();
            WeakHashMap weakHashMap = c2.f8518w;
            rVar = rVar2;
            r3.b(l1.s.f(rVar2).f8530l, null, null, v2.h.c(-2123345805, new k0(8, aVar2), rVar2), null, null, null, 0, false, null, 0.0f, 0L, 0L, 0L, j2, 0L, v2.h.c(-1377257894, new r4(list, sVar, lVar, lVar2, aVar, 1), rVar2), rVar, 3072, 100663296, 196598);
        } else {
            rVar = rVar2;
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new p0(list, sVar, hVar, lVar, lVar2, aVar, aVar2, i2);
        }
    }

    public static final void d(int i2, mc.a aVar, n2.m mVar) {
        int i10;
        boolean z10;
        r rVar = (r) mVar;
        rVar.Z(-946912979);
        if (rVar.h(aVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i2 | i10;
        if ((i11 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i11 & 1, z10)) {
            p f8 = n.f(r1.f8615c, i3.s.b(((l0) rVar.j(m0.f5257a)).a(), 0.8f), i3.z.f6703b);
            Object L = rVar.L();
            if (L == l.f9953a) {
                L = new a3.g(14);
                rVar.h0(L);
            }
            p i12 = n.i(f8, true, null, (mc.a) L, 14);
            v0 d4 = l1.p.d(b3.c.A, false);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            p c4 = b3.a.c(i12, rVar);
            h.f220a.getClass();
            f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            f fVar = a4.g.f215e;
            s.C(d4, fVar, rVar);
            f fVar2 = a4.g.f214d;
            s.C(l10, fVar2, rVar);
            Integer valueOf = Integer.valueOf(hashCode);
            f fVar3 = a4.g.f216f;
            s.u(rVar, valueOf, fVar3);
            a4.e eVar = a4.g.f217g;
            s.y(rVar, eVar);
            f fVar4 = a4.g.f213c;
            s.C(c4, fVar4, rVar);
            l1.s sVar = l1.s.f8618b;
            b3.h hVar = b3.c.X;
            b3.m mVar2 = b3.m.f1770a;
            p e6 = sVar.e(mVar2, hVar);
            w a10 = u.a(i.f8573c, b3.c.f1759h0, rVar, 48);
            int hashCode2 = Long.hashCode(rVar.T);
            v2.g l11 = rVar.l();
            p c10 = b3.a.c(e6, rVar);
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            s.C(a10, fVar, rVar);
            s.C(l11, fVar2, rVar);
            w.d.x(hashCode2, rVar, fVar3, rVar, eVar);
            s.C(c10, fVar4, rVar);
            e7.b(l0.f.I(rVar, R.string.waiting_for_input), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((f7) rVar.j(g7.f5161b)).f5147f, rVar, 0, 0, 65534);
            rVar = rVar;
            l1.c.d(r1.c(mVar2, 16), rVar);
            n0.j(aVar, null, false, null, f12541d, rVar, (i11 & 14) | 805306368, 510);
            rVar.p(true);
            rVar.p(true);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new k0(i2, 10, aVar);
        }
    }
}
