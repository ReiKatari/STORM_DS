package ai;

import android.content.Context;
import android.content.res.Resources;
import b4.d2;
import d1.l1;
import d1.n1;
import d1.q1;
import d1.u1;
import d1.w1;
import g2.e7;
import g2.f3;
import g2.f7;
import g2.g7;
import g2.r3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import l1.c2;
import l1.d1;
import l1.h1;
import l1.m1;
import l1.o1;
import l1.r1;
import me.magnum.melonds.R;
import n2.p1;
import n2.s2;
import n2.t2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static final v2.c f833a = new v2.c(-1122579455, false, new l(0));

    /* renamed from: b  reason: collision with root package name */
    public static final v2.c f834b = new v2.c(-2025043848, false, new l(1));

    /* renamed from: c  reason: collision with root package name */
    public static final v2.c f835c = new v2.c(-1542973422, false, new m(0));

    /* renamed from: d  reason: collision with root package name */
    public static final v2.c f836d = new v2.c(-813302519, false, new m(1));

    /* renamed from: e  reason: collision with root package name */
    public static final v2.c f837e = new v2.c(-1585356431, false, new m(2));

    /* renamed from: f  reason: collision with root package name */
    public static final v2.c f838f = new v2.c(812917146, false, new m(3));

    /* renamed from: g  reason: collision with root package name */
    public static final v2.c f839g = new v2.c(-10069196, false, new m(4));

    /* renamed from: h  reason: collision with root package name */
    public static final v2.c f840h = new v2.c(1975559922, false, new m(5));

    /* renamed from: i  reason: collision with root package name */
    public static final v2.c f841i = new v2.c(-1696503163, false, new l(2));

    /* renamed from: j  reason: collision with root package name */
    public static final v2.c f842j = new v2.c(-1410314500, false, new l(3));

    /* renamed from: k  reason: collision with root package name */
    public static final v2.c f843k = new v2.c(-1676517399, false, new l(4));

    /* renamed from: l  reason: collision with root package name */
    public static final v2.c f844l = new v2.c(-1961829287, false, new l(5));
    public static final v2.c m = new v2.c(-148078247, false, new m(6));

    /* renamed from: n  reason: collision with root package name */
    public static final v2.c f845n = new v2.c(-1150633630, false, new m(7));

    /* renamed from: o  reason: collision with root package name */
    public static final v2.c f846o = new v2.c(-803531615, false, new m(8));

    /* renamed from: p  reason: collision with root package name */
    public static final v2.c f847p = new v2.c(992651096, false, new m(9));

    /* renamed from: q  reason: collision with root package name */
    public static final v2.c f848q = new v2.c(-2057829735, false, new m(10));

    /* renamed from: r  reason: collision with root package name */
    public static final v2.c f849r = new v2.c(-149522822, false, new m(11));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5 */
    public static final void a(final List list, long j2, mc.l lVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        final long j10;
        final mc.l lVar2;
        boolean z11;
        w1 w1Var;
        Object c4;
        float f8;
        float f10;
        boolean z12;
        Object obj;
        final x4.m mVar2;
        boolean z13;
        n2.r rVar;
        b3.p pVar;
        float f11;
        n1.x xVar;
        final List list2;
        boolean z14;
        boolean z15;
        mc.l lVar3;
        lVar.getClass();
        n2.r rVar2 = (n2.r) mVar;
        rVar2.Z(-1816202422);
        if (rVar2.h(list)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i13 = i2 | i10;
        if (rVar2.e(j2)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i14 = i13 | i11;
        if (rVar2.h(lVar)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i15 = i14 | i12;
        if ((i15 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar2.O(i15 & 1, z10)) {
            t2 t2Var = g2.m0.f5257a;
            final long c10 = ((g2.l0) rVar2.j(t2Var)).c();
            final long i16 = ((g2.l0) rVar2.j(t2Var)).i();
            boolean f12 = rVar2.f(list);
            int i17 = i15 & 112;
            if (i17 == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z16 = f12 | z11;
            Object L = rVar2.L();
            Object obj2 = n2.l.f9953a;
            if (z16 || L == obj2) {
                Iterator it = list.iterator();
                int i18 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (((zh.c) it.next()).f15110a == j2) {
                            break;
                        }
                        i18++;
                    } else {
                        i18 = -1;
                        break;
                    }
                }
                L = Integer.valueOf(i18);
                rVar2.h0(L);
            }
            int intValue = ((Number) L).intValue();
            Object L2 = rVar2.L();
            if (L2 == obj2) {
                L2 = new j1.i();
                rVar2.h0(L2);
            }
            j1.i iVar = L2;
            n2.w0 m10 = a.a.m(iVar, rVar2, 6);
            Boolean bool = (Boolean) m10.getValue();
            bool.getClass();
            q1 f13 = u1.f(bool, null, rVar2, 0, 2);
            a3.b bVar = f13.f3649a;
            final s2 b10 = d1.e.b(intValue, rVar2, 3072, 22);
            w1 w1Var2 = d1.d.f3545j;
            if (!f13.g()) {
                rVar2.X(1666573488);
                boolean f14 = rVar2.f(f13);
                c4 = rVar2.L();
                if (!f14 && c4 != obj2) {
                    w1Var = w1Var2;
                } else {
                    z2.f e6 = z2.q.e();
                    if (e6 != null) {
                        lVar3 = e6.e();
                    } else {
                        lVar3 = null;
                    }
                    w1Var = w1Var2;
                    z2.f h2 = z2.q.h(e6);
                    try {
                        Object c11 = bVar.c();
                        z2.q.k(e6, h2, lVar3);
                        rVar2.h0(c11);
                        c4 = c11;
                    } catch (Throwable th2) {
                        z2.q.k(e6, h2, lVar3);
                        throw th2;
                    }
                }
                rVar2.p(false);
            } else {
                w1Var = w1Var2;
                rVar2.X(1666827533);
                rVar2.p(false);
                c4 = bVar.c();
            }
            boolean booleanValue = ((Boolean) c4).booleanValue();
            rVar2.X(195499522);
            if (booleanValue) {
                f8 = 1.0f;
            } else {
                f8 = 0.75f;
            }
            rVar2.p(false);
            Float valueOf = Float.valueOf(f8);
            boolean f15 = rVar2.f(f13);
            Object L3 = rVar2.L();
            if (f15 || L3 == obj2) {
                L3 = n2.s.q(new e(f13, 0));
                rVar2.h0(L3);
            }
            boolean booleanValue2 = ((Boolean) ((s2) L3).getValue()).booleanValue();
            rVar2.X(195499522);
            if (booleanValue2) {
                f10 = 1.0f;
            } else {
                f10 = 0.75f;
            }
            rVar2.p(false);
            Float valueOf2 = Float.valueOf(f10);
            boolean f16 = rVar2.f(f13);
            Object L4 = rVar2.L();
            if (f16 || L4 == obj2) {
                L4 = n2.s.q(new e(f13, 1));
                rVar2.h0(L4);
            }
            l1 l1Var = (l1) ((s2) L4).getValue();
            rVar2.X(-985243360);
            d1.a1 q10 = d1.d.q(7, null);
            rVar2.p(false);
            final n1 d4 = u1.d(f13, valueOf, valueOf2, q10, w1Var, rVar2, 0);
            Object L5 = rVar2.L();
            if (L5 == obj2) {
                L5 = d1.d.a(-1.0f);
                rVar2.h0(L5);
            }
            final d1.c cVar = (d1.c) L5;
            final n1.x a10 = n1.z.a(rVar2);
            x4.m mVar3 = (x4.m) rVar2.j(b4.q1.f1924n);
            Integer valueOf3 = Integer.valueOf(intValue);
            boolean f17 = rVar2.f(a10) | rVar2.d(intValue) | rVar2.h(cVar);
            Object L6 = rVar2.L();
            if (f17 || L6 == obj2) {
                L6 = new g(a10, cVar, intValue, null);
                rVar2.h0(L6);
            }
            n2.s.g(valueOf3, (mc.p) L6, rVar2);
            b3.p a11 = i4.n.a(f1.n.l(b3.m.f1770a, false, iVar, 1), false, new od.x(16));
            boolean f18 = rVar2.f(m10) | rVar2.d(mVar3.ordinal()) | rVar2.h(list) | rVar2.d(intValue);
            int i19 = i15 & 896;
            if (i19 == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z17 = f18 | z12;
            Object L7 = rVar2.L();
            if (!z17 && L7 != obj2) {
                obj = obj2;
                mVar2 = mVar3;
            } else {
                obj = obj2;
                L7 = new h(list, intValue, lVar, m10, mVar3);
                mVar2 = mVar3;
                rVar2.h0(L7);
            }
            float f19 = 16;
            b3.p v10 = l1.c.v(t3.c.e(a11, (mc.l) L7), 0.0f, f19, 1);
            boolean f20 = rVar2.f(a10) | rVar2.h(list) | rVar2.d(mVar2.ordinal()) | rVar2.e(c10) | rVar2.f(b10) | rVar2.h(cVar) | rVar2.f(d4) | rVar2.e(i16);
            Object L8 = rVar2.L();
            if (!f20 && L8 != obj) {
                list2 = list;
                f11 = f19;
                rVar = rVar2;
                xVar = a10;
                pVar = v10;
                z13 = true;
            } else {
                z13 = true;
                rVar = rVar2;
                pVar = v10;
                f11 = f19;
                mc.l lVar4 = new mc.l() { // from class: ai.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.lang.Iterable] */
                    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object, java.lang.Iterable] */
                    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object, java.lang.Iterable] */
                    /* JADX WARN: Type inference failed for: r3v35, types: [java.util.List, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r4v16, types: [java.util.List, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r4v23, types: [java.util.List, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r4v29, types: [java.util.List, java.lang.Object] */
                    @Override // mc.l
                    public final Object k(Object obj3) {
                        float f21;
                        Object next;
                        float intBitsToFloat;
                        float intBitsToFloat2;
                        float f22;
                        float f23;
                        float floatValue;
                        float f24;
                        float ceil;
                        int i20;
                        a4.r0 r0Var = (a4.r0) obj3;
                        r0Var.getClass();
                        k3.b bVar2 = r0Var.A;
                        n1.x xVar2 = n1.x.this;
                        if (xVar2.g() == 0) {
                            f21 = (-xVar2.h()) + (-xVar2.i().f9811l);
                        } else {
                            f21 = (-Float.intBitsToFloat((int) (bVar2.c() & 4294967295L))) / 2.0f;
                        }
                        Iterator it2 = xVar2.i().f9810k.iterator();
                        n1.q qVar = null;
                        if (!it2.hasNext()) {
                            next = null;
                        } else {
                            next = it2.next();
                            if (it2.hasNext()) {
                                int i21 = ((n1.q) next).f9827l;
                                do {
                                    Object next2 = it2.next();
                                    int i22 = ((n1.q) next2).f9827l;
                                    if (i21 < i22) {
                                        next = next2;
                                        i21 = i22;
                                    }
                                } while (it2.hasNext());
                            }
                        }
                        n1.q qVar2 = (n1.q) next;
                        if (qVar2 != null && qVar2.f9816a == list.size() - 1) {
                            intBitsToFloat = qVar2.f9827l + qVar2.m + xVar2.i().f9814p;
                        } else {
                            intBitsToFloat = Float.intBitsToFloat((int) (bVar2.c() >> 32)) + (Float.intBitsToFloat((int) (bVar2.c() & 4294967295L)) / 2.0f);
                        }
                        float f25 = intBitsToFloat - f21;
                        x4.m mVar4 = x4.m.Ltr;
                        x4.m mVar5 = mVar2;
                        if (mVar5 != mVar4) {
                            f21 = Float.intBitsToFloat((int) (bVar2.c() >> 32)) - intBitsToFloat;
                        }
                        k3.d.T(r0Var, c10, (Float.floatToRawIntBits(f21) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), h3.e.a(bVar2.c(), f25), (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (bVar2.c() & 4294967295L)) / 2.0f) & 4294967295L), null, 0.15f, 208);
                        s2 s2Var = b10;
                        float floatValue2 = ((Number) s2Var.getValue()).floatValue();
                        n1.q qVar3 = (n1.q) zb.l.a0(xVar2.i().f9810k);
                        if (qVar3 != null) {
                            f22 = qVar3.f9816a;
                        } else {
                            f22 = Float.MAX_VALUE;
                        }
                        if (floatValue2 <= f22) {
                            float floatValue3 = ((Number) s2Var.getValue()).floatValue() + 0.999f;
                            n1.q qVar4 = (n1.q) zb.l.T(xVar2.i().f9810k);
                            if (qVar4 != null) {
                                f23 = qVar4.f9816a;
                            } else {
                                f23 = Float.MIN_VALUE;
                            }
                            if (floatValue3 > f23) {
                                if (((Number) s2Var.getValue()).floatValue() < ((n1.q) zb.l.R(xVar2.i().f9810k)).f9816a) {
                                    Iterator it3 = xVar2.i().f9810k.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            break;
                                        }
                                        Object next3 = it3.next();
                                        if (((n1.q) next3).f9816a == ((int) ((Number) s2Var.getValue()).floatValue()) + 1) {
                                            qVar = next3;
                                            break;
                                        }
                                    }
                                    n1.q qVar5 = qVar;
                                    if (qVar5 == null) {
                                        n1.q qVar6 = (n1.q) zb.l.Z(xVar2.i().f9810k);
                                        f24 = qVar6.f9827l;
                                        ceil = ((float) Math.ceil(((Number) s2Var.getValue()).floatValue())) - ((Number) s2Var.getValue()).floatValue();
                                        i20 = qVar6.m;
                                    } else {
                                        f24 = qVar5.f9827l;
                                        ceil = ((float) Math.ceil(((Number) s2Var.getValue()).floatValue())) - ((Number) s2Var.getValue()).floatValue();
                                        i20 = qVar5.m;
                                    }
                                    floatValue = f24 - (ceil * i20);
                                } else {
                                    for (n1.q qVar7 : xVar2.i().f9810k) {
                                        if (qVar7.f9816a == ((int) ((Number) s2Var.getValue()).floatValue())) {
                                            floatValue = ((((Number) s2Var.getValue()).floatValue() - ((float) Math.floor(((Number) s2Var.getValue()).floatValue()))) * qVar7.m) + qVar7.f9827l + (-xVar2.i().f9811l);
                                        }
                                    }
                                    m9.o.x("Collection contains no element matching the predicate.");
                                    return null;
                                }
                                x4.m mVar6 = x4.m.Ltr;
                                d1.c cVar2 = cVar;
                                if (mVar5 != mVar6) {
                                    floatValue = (Float.intBitsToFloat((int) (bVar2.c() >> 32)) - floatValue) - ((Number) cVar2.e()).floatValue();
                                }
                                float floatValue4 = ((Number) d4.getValue()).floatValue();
                                long a12 = h3.e.a(bVar2.c(), ((Number) cVar2.e()).floatValue());
                                float intBitsToFloat3 = Float.intBitsToFloat((int) (bVar2.c() & 4294967295L)) / 2.0f;
                                k3.d.T(r0Var, i16, (Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), a12, (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L), null, floatValue4, 208);
                            }
                        }
                        r0Var.a();
                        return yb.y.f14813a;
                    }
                };
                xVar = a10;
                list2 = list;
                rVar.h0(lVar4);
                L8 = lVar4;
            }
            b3.p f21 = f3.g.f(pVar, (mc.l) L8);
            h1 b11 = l1.c.b(2, f11);
            n1.x xVar2 = xVar;
            l1.e eVar = l1.i.f8574d;
            boolean h10 = rVar.h(list2);
            if (i17 == 32) {
                z14 = z13;
            } else {
                z14 = false;
            }
            boolean z18 = h10 | z14;
            if (i19 == 256) {
                z15 = z13;
            } else {
                z15 = false;
            }
            boolean z19 = z18 | z15;
            Object L9 = rVar.L();
            if (!z19 && L9 != obj) {
                j10 = j2;
                lVar2 = lVar;
            } else {
                j10 = j2;
                lVar2 = lVar;
                L9 = new mc.l() { // from class: ai.b
                    @Override // mc.l
                    public final Object k(Object obj3) {
                        n1.i iVar2 = (n1.i) obj3;
                        iVar2.getClass();
                        List list3 = list2;
                        iVar2.q(list3.size(), null, new j(0, list3), new v2.c(802480018, true, new k(list3, j10, lVar2)));
                        return yb.y.f14813a;
                    }
                };
                rVar.h0(L9);
            }
            rVar2 = rVar;
            k0.d.e(f21, xVar2, b11, eVar, null, null, false, null, (mc.l) L9, rVar2, 24960);
        } else {
            j10 = j2;
            lVar2 = lVar;
            rVar2.R();
        }
        p1 r5 = rVar2.r();
        if (r5 != null) {
            r5.f9983d = new c(list, j10, lVar2, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(b3.p r25, l1.d1 r26, ze.a r27, zh.e r28, mc.l r29, n2.m r30, int r31) {
        /*
            Method dump skipped, instructions count: 913
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.n.b(b3.p, l1.d1, ze.a, zh.e, mc.l, n2.m, int):void");
    }

    public static final void c(b3.p pVar, zh.d dVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-682544053);
        if (rVar.f(dVar)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i11 = i10 | i2;
        if ((i11 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i11 & 1, z10)) {
            b3.p t5 = l1.c.t(pVar, 16);
            l1.w a10 = l1.u.a(l1.i.g(4), b3.c.f1758g0, rVar, 6);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c4 = b3.a.c(t5, rVar);
            a4.h.f220a.getClass();
            a4.f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            n2.s.C(a10, a4.g.f215e, rVar);
            n2.s.C(l10, a4.g.f214d, rVar);
            n2.s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
            n2.s.y(rVar, a4.g.f217g);
            n2.s.C(c4, a4.g.f213c, rVar);
            rVar.X(-1468437620);
            l4.e eVar = new l4.e();
            u1.l0.m(eVar, "icon-points", "�");
            eVar.a(' ');
            int g10 = eVar.g(new l4.j0(0L, 0L, p4.j.Y, (p4.h) null, (p4.i) null, (p4.p) null, (String) null, 0L, (w4.a) null, (w4.p) null, (s4.b) null, 0L, (w4.l) null, (i3.m0) null, 65531));
            try {
                int i12 = dVar.f15119d;
                int i13 = dVar.f15117b;
                int i14 = dVar.f15118c;
                eVar.b(String.valueOf(i12));
                eVar.e(g10);
                eVar.a(' ');
                eVar.b(l0.f.I(rVar, R.string.points_abbreviated));
                eVar.b(" (");
                if (dVar.f15116a) {
                    rVar.X(-1855171625);
                    eVar.b(l0.f.I(rVar, R.string.ra_mode_hardcore));
                    rVar.p(false);
                } else {
                    rVar.X(-1855072425);
                    eVar.b(l0.f.I(rVar, R.string.ra_mode_softcore));
                    rVar.p(false);
                }
                eVar.a(')');
                l4.h h2 = eVar.h();
                rVar.p(false);
                t2 t2Var = g7.f5161b;
                Map singletonMap = Collections.singletonMap("icon-points", new u1.g0(new l4.x(((f7) rVar.j(t2Var)).f5150i.f8887a.f8828b, ((f7) rVar.j(t2Var)).f5150i.f8887a.f8828b), f846o));
                singletonMap.getClass();
                e7.c(h2, null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, singletonMap, null, null, rVar, 0, 0, 229374);
                rVar.X(-1468399075);
                l4.e eVar2 = new l4.e();
                u1.l0.m(eVar2, "icon-completed", l0.f.I(rVar, R.string.completed));
                eVar2.a(' ');
                float f8 = i14 / i13;
                eVar2.b(l0.f.H(R.string.completed_achievements, new Object[]{Integer.valueOf(i14), Integer.valueOf(i13), Integer.valueOf((int) (100 * f8))}, rVar));
                l4.h h10 = eVar2.h();
                rVar.p(false);
                Map singletonMap2 = Collections.singletonMap("icon-completed", new u1.g0(new l4.x(((f7) rVar.j(t2Var)).f5150i.f8887a.f8828b, ((f7) rVar.j(t2Var)).f5150i.f8887a.f8828b), f847p));
                singletonMap2.getClass();
                e7.c(h10, null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, singletonMap2, null, null, rVar, 0, 0, 229374);
                rVar = rVar;
                f3.b(f8, f3.g.b(r1.c(r1.b(b3.m.f1770a, 1.0f), 6), t1.e.a()), ((g2.l0) rVar.j(g2.m0.f5257a)).i(), 0L, rVar, 0);
                rVar.p(true);
            } catch (Throwable th2) {
                eVar.e(g10);
                throw th2;
            }
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new r0(pVar, dVar, i2, 1);
        }
    }

    public static final void d(ze.a aVar, g3.z zVar, mc.a aVar2, mc.a aVar3, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(1924079223);
        if (rVar.h(aVar)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i14 = i2 | i10;
        if (rVar.f(zVar)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i15 = i14 | i11;
        if (rVar.h(aVar2)) {
            i12 = 2048;
        } else {
            i12 = 1024;
        }
        int i16 = i15 | i12;
        if (rVar.h(aVar3)) {
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
            g2.a0.c(v2.h.c(1111939899, new m0(aVar, zVar, aVar2, 0), rVar), null, v2.h.c(-1736446531, new k0(1, aVar3), rVar), null, ((g2.l0) rVar.j(g2.m0.f5257a)).j(), 0L, 0, rVar, 1573254, 42);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new l0(aVar, zVar, aVar2, aVar3, i2, 1);
        }
    }

    public static final void e(b3.p pVar, mc.a aVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(1906451854);
        if ((i2 & 6) == 0) {
            if (rVar.f(pVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i12 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.h(aVar)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i10 & 1, z10)) {
            b3.p t5 = l1.c.t(pVar, 32);
            y3.v0 d4 = l1.p.d(b3.c.X, false);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c4 = b3.a.c(t5, rVar);
            a4.h.f220a.getClass();
            a4.f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            a4.f fVar = a4.g.f215e;
            n2.s.C(d4, fVar, rVar);
            a4.f fVar2 = a4.g.f214d;
            n2.s.C(l10, fVar2, rVar);
            Integer valueOf = Integer.valueOf(hashCode);
            a4.f fVar3 = a4.g.f216f;
            n2.s.u(rVar, valueOf, fVar3);
            a4.e eVar = a4.g.f217g;
            n2.s.y(rVar, eVar);
            a4.f fVar4 = a4.g.f213c;
            n2.s.C(c4, fVar4, rVar);
            l1.w a10 = l1.u.a(l1.i.g(16), b3.c.f1759h0, rVar, 54);
            int hashCode2 = Long.hashCode(rVar.T);
            v2.g l11 = rVar.l();
            b3.p c10 = b3.a.c(b3.m.f1770a, rVar);
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            n2.s.C(a10, fVar, rVar);
            n2.s.C(l11, fVar2, rVar);
            w.d.x(hashCode2, rVar, fVar3, rVar, eVar);
            n2.s.C(c10, fVar4, rVar);
            e7.b(l0.f.I(rVar, R.string.retro_achievements_load_error), null, 0L, 0L, null, 0L, new w4.k(3), 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 130558);
            g2.n0.a(aVar, null, false, null, null, og.a.d(rVar), null, f849r, rVar, ((i10 >> 3) & 14) | 805306368, 382);
            rVar.p(true);
            rVar.p(true);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new j0(pVar, aVar, i2, 1);
        }
    }

    public static final void f(b3.p pVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-1625210322);
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
            y3.v0 d4 = l1.p.d(b3.c.A, false);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c4 = b3.a.c(pVar, rVar);
            a4.h.f220a.getClass();
            a4.f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            n2.s.C(d4, a4.g.f215e, rVar);
            n2.s.C(l10, a4.g.f214d, rVar);
            n2.s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
            n2.s.y(rVar, a4.g.f217g);
            n2.s.C(c4, a4.g.f213c, rVar);
            f3.a(l1.s.f8618b.e(b3.m.f1770a, b3.c.X), ((g2.l0) rVar.j(g2.m0.f5257a)).f(), 0.0f, 0L, 0, rVar, 0, 28);
            rVar.p(true);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new x(pVar, i2, 0);
        }
    }

    public static final void g(b3.p pVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-1075706924);
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
            y3.v0 d4 = l1.p.d(b3.c.X, false);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c4 = b3.a.c(pVar, rVar);
            a4.h.f220a.getClass();
            a4.f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            n2.s.C(d4, a4.g.f215e, rVar);
            n2.s.C(l10, a4.g.f214d, rVar);
            n2.s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
            n2.s.y(rVar, a4.g.f217g);
            n2.s.C(c4, a4.g.f213c, rVar);
            f3.a(null, ((g2.l0) rVar.j(g2.m0.f5257a)).i(), 0.0f, 0L, 0, rVar, 0, 29);
            rVar.p(true);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new x(pVar, i2, 1);
        }
    }

    public static final void h(b3.p pVar, mc.p pVar2, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(905341046);
        if ((i2 & 6) == 0) {
            if (rVar.f(pVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i2 | i12;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.h(pVar2)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
        }
        int i13 = i10;
        if ((i13 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i13 & 1, z10)) {
            Object[] objArr = new Object[0];
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (L == eVar) {
                L = new a3.g(4);
                rVar.h0(L);
            }
            n2.w0 w0Var = (n2.w0) y2.k.c(objArr, (mc.a) L, rVar, 48);
            b3.p t5 = l1.c.t(pVar, 32);
            y3.v0 d4 = l1.p.d(b3.c.X, false);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c4 = b3.a.c(t5, rVar);
            a4.h.f220a.getClass();
            a4.f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            a4.f fVar = a4.g.f215e;
            n2.s.C(d4, fVar, rVar);
            a4.f fVar2 = a4.g.f214d;
            n2.s.C(l10, fVar2, rVar);
            Integer valueOf = Integer.valueOf(hashCode);
            a4.f fVar3 = a4.g.f216f;
            n2.s.u(rVar, valueOf, fVar3);
            a4.e eVar2 = a4.g.f217g;
            n2.s.y(rVar, eVar2);
            a4.f fVar4 = a4.g.f213c;
            n2.s.C(c4, fVar4, rVar);
            l1.w a10 = l1.u.a(l1.i.g(16), b3.c.f1759h0, rVar, 54);
            int hashCode2 = Long.hashCode(rVar.T);
            v2.g l11 = rVar.l();
            b3.p c10 = b3.a.c(b3.m.f1770a, rVar);
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            n2.s.C(a10, fVar, rVar);
            n2.s.C(l11, fVar2, rVar);
            w.d.x(hashCode2, rVar, fVar3, rVar, eVar2);
            n2.s.C(c10, fVar4, rVar);
            e7.b(l0.f.I(rVar, R.string.retro_achievements_login_description), null, 0L, 0L, null, 0L, new w4.k(3), 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 130558);
            rVar = rVar;
            boolean f8 = rVar.f(w0Var);
            Object L2 = rVar.L();
            if (f8 || L2 == eVar) {
                L2 = new s(w0Var, 3);
                rVar.h0(L2);
            }
            g2.n0.a((mc.a) L2, null, false, null, null, og.a.d(rVar), null, f845n, rVar, 805306368, 382);
            rVar.p(true);
            rVar.p(true);
            if (((Boolean) w0Var.getValue()).booleanValue()) {
                rVar.X(-1378522671);
                boolean f10 = rVar.f(w0Var);
                Object L3 = rVar.L();
                if (f10 || L3 == eVar) {
                    L3 = new s(w0Var, 4);
                    rVar.h0(L3);
                }
                mc.a aVar = (mc.a) L3;
                if ((i13 & 112) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean f11 = rVar.f(w0Var) | z11;
                Object L4 = rVar.L();
                if (f11 || L4 == eVar) {
                    L4 = new t0(pVar2, w0Var, 1);
                    rVar.h0(L4);
                }
                p(aVar, (mc.p) L4, rVar, 0);
                rVar.p(false);
            } else {
                rVar.X(-1378281460);
                rVar.p(false);
            }
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new u0(pVar, pVar2, i2, 1);
        }
    }

    public static final void i(b3.p pVar, mc.p pVar2, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(1547843077);
        if ((i2 & 6) == 0) {
            if (rVar.f(pVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i2 | i12;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.h(pVar2)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
        }
        int i13 = i10;
        if ((i13 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i13 & 1, z10)) {
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (L == eVar) {
                L = n2.s.w(Boolean.FALSE);
                rVar.h0(L);
            }
            n2.w0 w0Var = (n2.w0) L;
            b3.p t5 = l1.c.t(pVar, 32);
            y3.v0 d4 = l1.p.d(b3.c.X, false);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c4 = b3.a.c(t5, rVar);
            a4.h.f220a.getClass();
            a4.f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            a4.f fVar = a4.g.f215e;
            n2.s.C(d4, fVar, rVar);
            a4.f fVar2 = a4.g.f214d;
            n2.s.C(l10, fVar2, rVar);
            Integer valueOf = Integer.valueOf(hashCode);
            a4.f fVar3 = a4.g.f216f;
            n2.s.u(rVar, valueOf, fVar3);
            a4.e eVar2 = a4.g.f217g;
            n2.s.y(rVar, eVar2);
            a4.f fVar4 = a4.g.f213c;
            n2.s.C(c4, fVar4, rVar);
            l1.w a10 = l1.u.a(l1.i.g(16), b3.c.f1759h0, rVar, 54);
            int hashCode2 = Long.hashCode(rVar.T);
            v2.g l11 = rVar.l();
            b3.p c10 = b3.a.c(b3.m.f1770a, rVar);
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            n2.s.C(a10, fVar, rVar);
            n2.s.C(l11, fVar2, rVar);
            w.d.x(hashCode2, rVar, fVar3, rVar, eVar2);
            n2.s.C(c10, fVar4, rVar);
            e7.b(l0.f.I(rVar, R.string.retro_achievements_login_error), null, 0L, 0L, null, 0L, new w4.k(3), 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 130558);
            rVar = rVar;
            Object L2 = rVar.L();
            if (L2 == eVar) {
                L2 = new s(w0Var, 1);
                rVar.h0(L2);
            }
            g2.n0.a((mc.a) L2, null, false, null, null, og.a.d(rVar), null, f848q, rVar, 805306374, 382);
            rVar.p(true);
            rVar.p(true);
            if (((Boolean) w0Var.getValue()).booleanValue()) {
                rVar.X(1025110690);
                Object L3 = rVar.L();
                if (L3 == eVar) {
                    L3 = new s(w0Var, 2);
                    rVar.h0(L3);
                }
                mc.a aVar = (mc.a) L3;
                if ((i13 & 112) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Object L4 = rVar.L();
                if (z11 || L4 == eVar) {
                    L4 = new t0(pVar2, w0Var, 0);
                    rVar.h0(L4);
                }
                p(aVar, (mc.p) L4, rVar, 6);
                rVar.p(false);
            } else {
                rVar.X(1025351901);
                rVar.p(false);
            }
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new u0(pVar, pVar2, i2, 0);
        }
    }

    public static final void j(b3.p pVar, zh.c cVar, boolean z10, mc.a aVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        boolean z11;
        n2.r rVar;
        b3.m mVar2;
        long f8;
        n2.r rVar2 = (n2.r) mVar;
        rVar2.Z(-1758575878);
        int i13 = i2 | 6;
        if (rVar2.h(cVar)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i14 = i13 | i10;
        if (rVar2.g(z10)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i15 = i14 | i11;
        if (rVar2.h(aVar)) {
            i12 = 2048;
        } else {
            i12 = 1024;
        }
        int i16 = i15 | i12;
        if ((i16 & 1171) != 1170) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVar2.O(i16 & 1, z11)) {
            t1.d a10 = t1.e.a();
            b3.m mVar3 = b3.m.f1770a;
            float f10 = 8;
            b3.p u4 = l1.c.u(s1.c.b(f3.g.b(mVar3, a10), z10, null, aVar, 14), 32, f10);
            b3.g gVar = b3.c.f1756e0;
            l1.s sVar = l1.i.f8571a;
            o1 a11 = m1.a(new l1.g(f10, true, new s0(7, b3.c.f1759h0)), gVar, rVar2, 54);
            int hashCode = Long.hashCode(rVar2.T);
            v2.g l10 = rVar2.l();
            b3.p c4 = b3.a.c(u4, rVar2);
            a4.h.f220a.getClass();
            a4.f0 f0Var = a4.g.f212b;
            rVar2.b0();
            if (rVar2.S) {
                rVar2.k(f0Var);
            } else {
                rVar2.k0();
            }
            n2.s.C(a11, a4.g.f215e, rVar2);
            n2.s.C(l10, a4.g.f214d, rVar2);
            n2.s.u(rVar2, Integer.valueOf(hashCode), a4.g.f216f);
            n2.s.y(rVar2, a4.g.f217g);
            n2.s.C(c4, a4.g.f213c, rVar2);
            if (((Boolean) rVar2.j(d2.f1832a)).booleanValue()) {
                rVar2.X(130077244);
                l1.p.a(f1.n.f(r1.i(mVar3, 24), i3.s.f6682c, i3.z.f6703b), rVar2, 6);
                rVar2.p(false);
            } else {
                rVar2.X(130175607);
                b3.p i17 = r1.i(mVar3, 24);
                m9.h hVar = new m9.h((Context) rVar2.j(b4.r0.f1937b));
                hVar.f9388c = cVar.f15113d.toString();
                hVar.b(true);
                c9.m.b(hVar.a(), i17, rVar2, 432, 4088);
                rVar2.p(false);
            }
            String str = cVar.f15111b;
            if (str == null) {
                str = kc.a.h(rVar2, 2082420514, R.string.ra_base_set, rVar2, false);
            } else {
                rVar2.X(2082420018);
                rVar2.p(false);
            }
            l4.r0 r0Var = ((f7) rVar2.j(g7.f5161b)).f5151j;
            if (z10) {
                rVar2.X(2082425129);
                f8 = ((g2.l0) rVar2.j(g2.m0.f5257a)).e();
            } else {
                rVar2.X(2082426343);
                f8 = ((g2.l0) rVar2.j(g2.m0.f5257a)).f();
            }
            rVar2.p(false);
            String str2 = str;
            mVar2 = mVar3;
            e7.b(str2, null, f8, 0L, null, 0L, null, p7.t.o(16), 0, false, 2, 0, null, r0Var, rVar2, 0, 3078, 56314);
            rVar = rVar2;
            rVar.p(true);
        } else {
            rVar = rVar2;
            rVar.R();
            mVar2 = pVar;
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new d(mVar2, cVar, z10, aVar, i2);
        }
    }

    public static final void k(b3.p pVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-1227064775);
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
            b3.p t5 = l1.c.t(pVar, 32);
            y3.v0 d4 = l1.p.d(b3.c.X, false);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c4 = b3.a.c(t5, rVar);
            a4.h.f220a.getClass();
            a4.f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            n2.s.C(d4, a4.g.f215e, rVar);
            n2.s.C(l10, a4.g.f214d, rVar);
            n2.s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
            n2.s.y(rVar, a4.g.f217g);
            n2.s.C(c4, a4.g.f213c, rVar);
            e7.b(l0.f.I(rVar, R.string.retro_achievements_no_achievements), f1.n.l(b3.m.f1770a, false, null, 3), 0L, 0L, null, 0L, new w4.k(3), 0L, 0, false, 0, 0, null, null, rVar, 48, 0, 130556);
            rVar = rVar;
            rVar.p(true);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new x(pVar, i2, 2);
        }
    }

    public static final void l(b3.p pVar, mc.a aVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        mc.a aVar2;
        int i11;
        int i12;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-617682583);
        if ((i2 & 6) == 0) {
            if (rVar.f(pVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i12 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.h(aVar)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i10 & 1, z10)) {
            b3.p m10 = r1.m(pVar, 132, 0.0f, 2);
            t1.d a10 = t1.e.a();
            h1 h1Var = g2.b0.f5046a;
            t2 t2Var = g2.m0.f5257a;
            aVar2 = aVar;
            g2.n0.a(aVar2, m10, false, null, a10, g2.b0.a(((g2.l0) rVar.j(t2Var)).i(), ((g2.l0) rVar.j(t2Var)).e(), rVar, 0, 12), null, m, rVar, ((i10 >> 3) & 14) | 805306368, 348);
            rVar = rVar;
        } else {
            aVar2 = aVar;
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new j0(pVar, aVar2, i2, 0);
        }
    }

    public static final void m(final long j2, n2.m mVar, final int i2) {
        int i10;
        boolean z10;
        n2.r rVar;
        n2.r rVar2 = (n2.r) mVar;
        rVar2.Z(1134527602);
        if (rVar2.e(j2)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i2;
        boolean z11 = false;
        if ((i11 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar2.O(i11 & 1, z10)) {
            Resources resources = (Resources) rVar2.j(b4.r0.f1938c);
            if ((i11 & 14) == 4) {
                z11 = true;
            }
            String L = rVar2.L();
            if (z11 || L == n2.l.f9953a) {
                l7.a aVar = wc.b.B;
                long j10 = wc.b.j(j2, wc.e.HOURS);
                int e6 = wc.b.e(j2);
                wc.b.g(j2);
                wc.b.f(j2);
                if (j10 > 0) {
                    L = resources.getString(R.string.info_play_time_hours_minutes, Long.valueOf(j10), Integer.valueOf(e6));
                } else {
                    L = resources.getString(R.string.info_play_time_minutes, Integer.valueOf(e6));
                }
                rVar2.h0(L);
            }
            String str = (String) L;
            str.getClass();
            rVar = rVar2;
            e7.b(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 1, 0, null, ((f7) rVar2.j(g7.f5161b)).f5150i, rVar, 0, 3072, 57342);
        } else {
            rVar = rVar2;
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p(i2, j2) { // from class: ai.n0
                public final /* synthetic */ long A;

                {
                    this.A = j2;
                }

                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int F = n2.s.F(1);
                    n.m(this.A, (n2.m) obj, F);
                    return yb.y.f14813a;
                }
            };
        }
    }

    public static final void n(ze.a aVar, g3.z zVar, mc.a aVar2, mc.a aVar3, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(1729955083);
        if (rVar.h(aVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i14 = i2 | i10;
        if (rVar.f(zVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i15 = i14 | i11;
        if (rVar.h(aVar2)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i16 = i15 | i12;
        if (rVar.h(aVar3)) {
            i13 = 2048;
        } else {
            i13 = 1024;
        }
        int i17 = i16 | i13;
        if ((i17 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i17 & 1, z10)) {
            g2.a0.c(v2.h.c(-916596281, new s0(0, aVar), rVar), null, v2.h.c(1242487813, new k0(0, aVar3), rVar), null, ((g2.l0) rVar.j(g2.m0.f5257a)).j(), 0L, 0, rVar, 1573254, 42);
            b3.m mVar2 = b3.m.f1770a;
            float f8 = 16;
            b3.p u4 = l1.c.u(r1.b(mVar2, 1.0f), f8, 4);
            o1 a10 = m1.a(l1.i.g(f8), b3.c.f1756e0, rVar, 54);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c4 = b3.a.c(u4, rVar);
            a4.h.f220a.getClass();
            a4.f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            n2.s.C(a10, a4.g.f215e, rVar);
            n2.s.C(l10, a4.g.f214d, rVar);
            n2.s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
            n2.s.y(rVar, a4.g.f217g);
            n2.s.C(c4, a4.g.f213c, rVar);
            l(g3.d.k(mVar2, zVar), aVar2, rVar, (i17 >> 3) & 112);
            m(aVar.f15062j, rVar, 0);
            rVar.p(true);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new l0(aVar, zVar, aVar2, aVar3, i2, 0);
        }
    }

    public static final void o(b3.p pVar, d1 d1Var, zh.x xVar, mc.l lVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        mc.l lVar2;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        int i14;
        zh.x xVar2 = xVar;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(98345328);
        if ((i2 & 6) == 0) {
            if (rVar.f(pVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.f(d1Var)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        if (rVar.h(xVar2)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i15 = i10 | i11;
        if ((i2 & 3072) == 0) {
            lVar2 = lVar;
            if (rVar.h(lVar2)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i15 |= i12;
        } else {
            lVar2 = lVar;
        }
        int i16 = i15;
        if ((i16 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i16 & 1, z10)) {
            Object[] objArr = new Object[0];
            boolean h2 = rVar.h(xVar2);
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (h2 || L == eVar) {
                L = new a2.n(2, xVar2);
                rVar.h0(L);
            }
            n2.d1 d1Var2 = (n2.d1) y2.k.c(objArr, (mc.a) L, rVar, 0);
            boolean e6 = rVar.e(d1Var2.g());
            Object L2 = rVar.L();
            zh.c cVar = L2;
            if (e6 || L2 == eVar) {
                for (zh.c cVar2 : xVar2.f15142a) {
                    if (cVar2.f15110a == d1Var2.g()) {
                        rVar.h0(cVar2);
                        cVar = cVar2;
                    } else {
                        xVar2 = xVar;
                        lVar2 = lVar;
                    }
                }
                m9.o.x("Collection contains no element matching the predicate.");
                return;
            }
            zh.c cVar3 = (zh.c) cVar;
            x4.m mVar2 = (x4.m) rVar.j(b4.q1.f1924n);
            n1.x a10 = n1.z.a(rVar);
            boolean d4 = rVar.d(mVar2.ordinal()) | rVar.h(xVar2) | rVar.f(d1Var2);
            Object L3 = rVar.L();
            if (d4 || L3 == eVar) {
                L3 = new z0(xVar2, mVar2, d1Var2, 0);
                rVar.h0(L3);
            }
            b3.p d10 = t3.c.d(pVar, (mc.l) L3);
            b3.f fVar = b3.c.f1759h0;
            boolean h10 = rVar.h(xVar2) | rVar.f(d1Var2) | rVar.h(cVar3);
            if ((i16 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = h10 | z11;
            Object L4 = rVar.L();
            if (z12 || L4 == eVar) {
                x0 x0Var = new x0(xVar2, cVar3, d1Var2, lVar2, 0);
                rVar.h0(x0Var);
                L4 = x0Var;
            }
            k0.d.c(d10, a10, d1Var, null, fVar, null, false, null, (mc.l) L4, rVar, ((i16 << 3) & 896) | 196608, 472);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new y0(pVar, d1Var, xVar, lVar, i2, 0);
        }
    }

    public static final void p(mc.a aVar, mc.p pVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        boolean z10;
        mc.a aVar2;
        mc.p pVar2;
        int i12;
        aVar.getClass();
        pVar.getClass();
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-1008806911);
        if ((i2 & 6) == 0) {
            if (rVar.h(aVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i12 | i2;
        } else {
            i10 = i2;
        }
        if (rVar.h(pVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i13 = i10 | i11;
        if ((i13 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i13 & 1, z10)) {
            Object[] objArr = new Object[0];
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (L == eVar) {
                L = new a3.g(2);
                rVar.h0(L);
            }
            n2.w0 w0Var = (n2.w0) y2.k.c(objArr, (mc.a) L, rVar, 48);
            Object L2 = rVar.L();
            if (L2 == eVar) {
                L2 = n2.s.w("");
                rVar.h0(L2);
            }
            aVar2 = aVar;
            pVar2 = pVar;
            k0.d.a(aVar2, new a5.f0(3), v2.h.c(1069147032, new q(w0Var, (n2.w0) L2, aVar2, pVar2, 0), rVar), rVar, (i13 & 14) | 432);
        } else {
            aVar2 = aVar;
            pVar2 = pVar;
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new r(aVar2, pVar2, i2, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, b3.p] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.lang.Object, b3.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(final b3.p r60, final pg.c r61, final mc.a r62, float r63, n2.m r64, final int r65, final int r66) {
        /*
            Method dump skipped, instructions count: 1814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.n.q(b3.p, pg.c, mc.a, float, n2.m, int, int):void");
    }

    public static final void r(b3.p pVar, d1 d1Var, ze.a aVar, zh.h hVar, mc.l lVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        pVar.getClass();
        d1Var.getClass();
        aVar.getClass();
        hVar.getClass();
        lVar.getClass();
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-985138417);
        if (rVar.f(pVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i15 = i2 | i10;
        if (rVar.f(d1Var)) {
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
        if (rVar.f(hVar)) {
            i13 = 2048;
        } else {
            i13 = 1024;
        }
        int i18 = i17 | i13;
        if (rVar.h(lVar)) {
            i14 = 16384;
        } else {
            i14 = 8192;
        }
        int i19 = i18 | i14;
        if ((i19 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i19 & 1, z10)) {
            if (hVar instanceof zh.f) {
                rVar.X(-1825205416);
                f(l1.c.s(pVar, d1Var), rVar, 0);
                rVar.p(false);
            } else if (hVar instanceof zh.g) {
                rVar.X(-1825202706);
                b(pVar, d1Var, aVar, ((zh.g) hVar).f15127a, lVar, rVar, i19 & 58366);
                rVar.p(false);
            } else {
                throw w.d.i(rVar, -1825207164, false);
            }
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new v(pVar, d1Var, aVar, hVar, lVar, i2, 0);
        }
    }

    public static final void s(final ze.a aVar, final zh.h hVar, final zh.y yVar, final mc.a aVar2, final mc.l lVar, final mc.l lVar2, final mc.p pVar, final mc.a aVar3, final mc.l lVar3, n2.m mVar, final int i2) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z10;
        n2.r rVar;
        int i19;
        boolean z11;
        boolean z12;
        aVar.getClass();
        hVar.getClass();
        yVar.getClass();
        aVar2.getClass();
        lVar.getClass();
        lVar2.getClass();
        pVar.getClass();
        aVar3.getClass();
        lVar3.getClass();
        n2.r rVar2 = (n2.r) mVar;
        rVar2.Z(1165162078);
        if (rVar2.h(aVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i20 = i2 | i10;
        if (rVar2.f(hVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i21 = i20 | i11;
        if (rVar2.f(yVar)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i22 = i21 | i12;
        if (rVar2.h(aVar2)) {
            i13 = 2048;
        } else {
            i13 = 1024;
        }
        int i23 = i22 | i13;
        if (rVar2.h(lVar)) {
            i14 = 16384;
        } else {
            i14 = 8192;
        }
        int i24 = i23 | i14;
        if (rVar2.h(lVar2)) {
            i15 = 131072;
        } else {
            i15 = 65536;
        }
        int i25 = i24 | i15;
        if (rVar2.h(pVar)) {
            i16 = 1048576;
        } else {
            i16 = 524288;
        }
        int i26 = i25 | i16;
        if (rVar2.h(aVar3)) {
            i17 = 8388608;
        } else {
            i17 = 4194304;
        }
        int i27 = i26 | i17;
        if (rVar2.h(lVar3)) {
            i18 = 67108864;
        } else {
            i18 = 33554432;
        }
        int i28 = i27 | i18;
        if ((38347923 & i28) != 38347922) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar2.O(i28 & 1, z10)) {
            s9.a a10 = s9.c.a(rVar2);
            int tabIndex = zh.q.CONFIG.getTabIndex();
            Object L = rVar2.L();
            n2.e eVar = n2.l.f9953a;
            if (L == eVar) {
                L = new a3.g(3);
                rVar2.h0(L);
            }
            final q1.b b10 = q1.d0.b(tabIndex, (mc.a) L, rVar2);
            Object L2 = rVar2.L();
            if (L2 == eVar) {
                L2 = new g3.z();
                rVar2.h0(L2);
            }
            final g3.z zVar = (g3.z) L2;
            Object L3 = rVar2.L();
            if (L3 == eVar) {
                int a11 = ((zb.b) zh.q.getEntries()).a();
                i19 = i28;
                ArrayList arrayList = new ArrayList(a11);
                for (int i29 = 0; i29 < a11; i29++) {
                    arrayList.add(new g3.z());
                }
                rVar2.h0(arrayList);
                L3 = arrayList;
            } else {
                i19 = i28;
            }
            final List list = (List) L3;
            Object L4 = rVar2.L();
            if (L4 == eVar) {
                L4 = n2.s.o(rVar2);
                rVar2.h0(L4);
            }
            zc.u uVar = (zc.u) L4;
            boolean f8 = rVar2.f(uVar) | rVar2.f(b10);
            Object L5 = rVar2.L();
            if (!f8 && L5 != eVar) {
                z11 = false;
            } else {
                z11 = false;
                L5 = new c0(uVar, b10, list, 0);
                rVar2.h0(L5);
            }
            mc.l lVar4 = (mc.l) L5;
            a10.a(z11);
            boolean f10 = rVar2.f(b10) | rVar2.f(lVar4);
            if ((i19 & 57344) == 16384) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean h2 = f10 | z12 | rVar2.h(aVar);
            Object L6 = rVar2.L();
            if (h2 || L6 == eVar) {
                L6 = new h0(b10, lVar4, lVar, aVar);
                rVar2.h0(L6);
            }
            b3.p e6 = t3.c.e(b3.m.f1770a, (mc.l) L6);
            long j2 = ((g2.l0) rVar2.j(g2.m0.f5257a)).j();
            WeakHashMap weakHashMap = c2.f8518w;
            rVar = rVar2;
            r3.b(l1.s.f(rVar2).f8530l, e6, null, v2.h.c(1916256600, new d0(aVar, b10, zVar, lVar, aVar2, lVar4), rVar2), null, null, null, 0, false, null, 0.0f, 0L, 0L, 0L, j2, 0L, v2.h.c(-1090524417, new mc.q() { // from class: ai.e0
                @Override // mc.q
                public final Object i(Object obj, Object obj2, Object obj3) {
                    boolean z13;
                    int i30;
                    final d1 d1Var = (d1) obj;
                    n2.m mVar2 = (n2.m) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    d1Var.getClass();
                    if ((intValue & 6) == 0) {
                        if (((n2.r) mVar2).f(d1Var)) {
                            i30 = 4;
                        } else {
                            i30 = 2;
                        }
                        intValue |= i30;
                    }
                    if ((intValue & 19) != 18) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    n2.r rVar3 = (n2.r) mVar2;
                    if (rVar3.O(intValue & 1, z13)) {
                        l1.e0 e0Var = r1.f8615c;
                        final List list2 = list;
                        final ze.a aVar4 = aVar;
                        final zh.h hVar2 = hVar;
                        final mc.l lVar5 = lVar2;
                        final zh.y yVar2 = yVar;
                        final mc.p pVar2 = pVar;
                        final mc.a aVar5 = aVar3;
                        final mc.l lVar6 = lVar3;
                        p7.j.b(b10, e0Var, null, null, 0.0f, null, null, false, null, null, null, v2.h.c(-1434333922, new mc.r() { // from class: ai.g0
                            @Override // mc.r
                            public final Object r(Object obj4, Object obj5, Object obj6, Object obj7) {
                                int intValue2 = ((Integer) obj5).intValue();
                                n2.m mVar3 = (n2.m) obj6;
                                ((Integer) obj7).getClass();
                                ((q1.t) obj4).getClass();
                                g3.z zVar2 = (g3.z) list2.get(intValue2);
                                int tabIndex2 = zh.q.CONFIG.getTabIndex();
                                d1 d1Var2 = d1Var;
                                if (intValue2 == tabIndex2) {
                                    n2.r rVar4 = (n2.r) mVar3;
                                    rVar4.X(387900018);
                                    n.r(g3.d.k(r1.f8615c, zVar2), d1Var2, aVar4, hVar2, lVar5, rVar4, 0);
                                    rVar4.p(false);
                                } else if (intValue2 == zh.q.RETRO_ACHIEVEMENTS.getTabIndex()) {
                                    n2.r rVar5 = (n2.r) mVar3;
                                    rVar5.X(388332375);
                                    n.u(g3.d.k(r1.f8615c, zVar2), d1Var2, yVar2, pVar2, aVar5, lVar6, rVar5, 0);
                                    rVar5.p(false);
                                } else {
                                    n2.r rVar6 = (n2.r) mVar3;
                                    rVar6.X(388820036);
                                    rVar6.p(false);
                                }
                                return yb.y.f14813a;
                            }
                        }, rVar3), rVar3, 48);
                        Object L7 = rVar3.L();
                        n2.e eVar2 = n2.l.f9953a;
                        g3.z zVar2 = zVar;
                        if (L7 == eVar2) {
                            L7 = new i0(zVar2, null, 0);
                            rVar3.h0(L7);
                        }
                        n2.s.g(zVar2, (mc.p) L7, rVar3);
                    } else {
                        rVar3.R();
                    }
                    return yb.y.f14813a;
                }
            }, rVar2), rVar, 3072, 100663296, 196596);
        } else {
            rVar = rVar2;
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p(hVar, yVar, aVar2, lVar, lVar2, pVar, aVar3, lVar3, i2) { // from class: ai.f0
                public final /* synthetic */ zh.h B;
                public final /* synthetic */ zh.y L;
                public final /* synthetic */ mc.a R;
                public final /* synthetic */ mc.l X;
                public final /* synthetic */ mc.l Y;
                public final /* synthetic */ mc.p Z;

                /* renamed from: b0  reason: collision with root package name */
                public final /* synthetic */ mc.a f826b0;

                /* renamed from: c0  reason: collision with root package name */
                public final /* synthetic */ mc.l f827c0;

                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int F = n2.s.F(1);
                    n.s(ze.a.this, this.B, this.L, this.R, this.X, this.Y, this.Z, this.f826b0, this.f827c0, (n2.m) obj, F);
                    return yb.y.f14813a;
                }
            };
        }
    }

    public static final void t(b3.p pVar, ze.a aVar, q1.a0 a0Var, g3.z zVar, mc.a aVar2, mc.a aVar3, mc.l lVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        float f8;
        int i13;
        int i14;
        pVar.getClass();
        aVar.getClass();
        a0Var.getClass();
        zVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        lVar.getClass();
        n2.r rVar = (n2.r) mVar;
        rVar.Z(699865997);
        if (rVar.h(aVar)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i15 = i10 | i2;
        if (rVar.f(a0Var)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i16 = i15 | i11;
        if ((i2 & 24576) == 0) {
            if (rVar.h(aVar2)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i16 |= i14;
        }
        if ((196608 & i2) == 0) {
            if (rVar.h(aVar3)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i16 |= i13;
        }
        if (rVar.h(lVar)) {
            i12 = 1048576;
        } else {
            i12 = 524288;
        }
        int i17 = i16 | i12;
        if ((599187 & i17) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i17 & 1, z10)) {
            n2.o1 a10 = g2.o1.f5309a.a(null);
            n2.b0 b0Var = g2.o0.f5308a;
            long j2 = ((i3.s) rVar.j(g2.q0.f5361a)).f6689a;
            if (!((g2.l0) rVar.j(g2.m0.f5257a)).k() ? i3.z.r(j2) < 0.5d : i3.z.r(j2) > 0.5d) {
                f8 = 1.0f;
            } else {
                f8 = 0.87f;
            }
            n2.s.b(new n2.o1[]{a10, b0Var.a(Float.valueOf(f8))}, v2.h.c(642985677, new o0(pVar, aVar, zVar, aVar2, aVar3, a0Var, lVar), rVar), rVar, 56);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new p0(pVar, aVar, a0Var, zVar, aVar2, aVar3, lVar, i2);
        }
    }

    public static final void u(b3.p pVar, d1 d1Var, zh.y yVar, mc.p pVar2, mc.a aVar, mc.l lVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        d1 d1Var2;
        mc.l lVar2;
        b3.p pVar3;
        pVar.getClass();
        d1Var.getClass();
        yVar.getClass();
        pVar2.getClass();
        aVar.getClass();
        lVar.getClass();
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-2086782835);
        if (rVar.f(pVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i16 = i10 | i2;
        if (rVar.f(d1Var)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i17 = i16 | i11;
        if (rVar.f(yVar)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i18 = i17 | i12;
        if (rVar.h(pVar2)) {
            i13 = 2048;
        } else {
            i13 = 1024;
        }
        int i19 = i18 | i13;
        if (rVar.h(aVar)) {
            i14 = 16384;
        } else {
            i14 = 8192;
        }
        int i20 = i19 | i14;
        if (rVar.h(lVar)) {
            i15 = 131072;
        } else {
            i15 = 65536;
        }
        int i21 = i20 | i15;
        if ((74899 & i21) != 74898) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i21 & 1, z10)) {
            if (yVar instanceof zh.v) {
                rVar.X(351434937);
                h(l1.c.s(pVar, d1Var), pVar2, rVar, (i21 >> 6) & 112);
                rVar.p(false);
            } else if (yVar instanceof zh.u) {
                rVar.X(351439958);
                g(l1.c.s(pVar, d1Var), rVar, 0);
                rVar.p(false);
            } else if (yVar instanceof zh.x) {
                rVar.X(-1990162066);
                zh.x xVar = (zh.x) yVar;
                List<zh.c> list = xVar.f15142a;
                if (!list.isEmpty()) {
                    for (zh.c cVar : list) {
                        if (!cVar.f15115f.isEmpty()) {
                            rVar.X(-1990105460);
                            d1Var2 = d1Var;
                            lVar2 = lVar;
                            o(pVar, d1Var2, xVar, lVar2, rVar, (i21 & 1022) | ((i21 >> 6) & 7168));
                            pVar3 = pVar;
                            rVar.p(false);
                            break;
                        }
                    }
                }
                d1Var2 = d1Var;
                lVar2 = lVar;
                pVar3 = pVar;
                rVar.X(-1989842363);
                k(l1.c.s(pVar3, d1Var2), rVar, 0);
                rVar.p(false);
                rVar.p(false);
            } else {
                d1Var2 = d1Var;
                lVar2 = lVar;
                pVar3 = pVar;
                if (yVar instanceof zh.w) {
                    rVar.X(351458135);
                    i(l1.c.s(pVar3, d1Var2), pVar2, rVar, (i21 >> 6) & 112);
                    rVar.p(false);
                } else if (yVar instanceof zh.t) {
                    rVar.X(351462554);
                    e(l1.c.s(pVar3, d1Var2), aVar, rVar, (i21 >> 9) & 112);
                    rVar.p(false);
                } else {
                    throw w.d.i(rVar, 351433110, false);
                }
            }
            d1Var2 = d1Var;
            lVar2 = lVar;
            pVar3 = pVar;
        } else {
            d1Var2 = d1Var;
            lVar2 = lVar;
            pVar3 = pVar;
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new d0(pVar3, d1Var2, yVar, pVar2, aVar, lVar2, i2);
        }
    }
}
