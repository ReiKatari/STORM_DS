package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class i2 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f5171a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f5172b;

    /* renamed from: d  reason: collision with root package name */
    public static final float f5174d;

    /* renamed from: g  reason: collision with root package name */
    public static final float f5177g;

    /* renamed from: c  reason: collision with root package name */
    public static final float f5173c = 16;

    /* renamed from: e  reason: collision with root package name */
    public static final float f5175e = 112;

    /* renamed from: f  reason: collision with root package name */
    public static final float f5176f = 280;

    static {
        float f8 = 8;
        f5171a = f8;
        float f10 = 48;
        f5172b = f10;
        f5174d = f8;
        f5177g = f10;
    }

    public static final void a(d1.i0 i0Var, n2.w0 w0Var, f1.w1 w1Var, b3.p pVar, v2.c cVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        n2.w0 w0Var2;
        float f8;
        d1.v vVar;
        d1.v1 r5;
        boolean z11;
        float f10;
        float f11;
        d1.v1 r10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(1077393800);
        if (rVar.f(i0Var)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i14 = i2 | i10;
        if (rVar.f(w1Var)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i15 = i14 | i11;
        if (rVar.f(pVar)) {
            i12 = 2048;
        } else {
            i12 = 1024;
        }
        int i16 = i15 | i12;
        if (rVar.h(cVar)) {
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
            d1.q1 e6 = d1.u1.e(i0Var, "DropDownMenu", rVar, (i17 & 14) | 48, 0);
            d1.w1 w1Var2 = d1.d.f3545j;
            a3.b bVar = e6.f3649a;
            n2.f1 f1Var = e6.f3652d;
            boolean booleanValue = ((Boolean) bVar.c()).booleanValue();
            rVar.X(-1833869404);
            float f12 = 0.8f;
            if (booleanValue) {
                f8 = 1.0f;
            } else {
                f8 = 0.8f;
            }
            rVar.p(false);
            Float valueOf = Float.valueOf(f8);
            boolean booleanValue2 = ((Boolean) f1Var.getValue()).booleanValue();
            rVar.X(-1833869404);
            if (booleanValue2) {
                f12 = 1.0f;
            }
            rVar.p(false);
            Float valueOf2 = Float.valueOf(f12);
            d1.l1 f13 = e6.f();
            rVar.X(445475263);
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            if (f13.b(bool, bool2)) {
                r5 = d1.d.r(120, 0, d1.w.f3688b, 2);
                z11 = false;
                vVar = null;
            } else {
                vVar = null;
                r5 = d1.d.r(1, 74, null, 4);
                z11 = false;
            }
            rVar.p(z11);
            d1.v vVar2 = vVar;
            d1.n1 d4 = d1.u1.d(e6, valueOf, valueOf2, r5, w1Var2, rVar, 0);
            boolean booleanValue3 = ((Boolean) e6.f3649a.c()).booleanValue();
            rVar.X(-1578341192);
            if (booleanValue3) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            rVar.p(false);
            Float valueOf3 = Float.valueOf(f10);
            boolean booleanValue4 = ((Boolean) f1Var.getValue()).booleanValue();
            rVar.X(-1578341192);
            if (booleanValue4) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            rVar.p(false);
            Float valueOf4 = Float.valueOf(f11);
            d1.l1 f14 = e6.f();
            rVar.X(701003475);
            if (f14.b(bool, bool2)) {
                r10 = d1.d.r(30, 0, vVar2, 6);
            } else {
                r10 = d1.d.r(75, 0, vVar2, 6);
            }
            rVar.p(false);
            d1.n1 d10 = d1.u1.d(e6, valueOf3, valueOf4, r10, w1Var2, rVar, 0);
            boolean f15 = rVar.f(d4) | rVar.f(d10);
            Object L = rVar.L();
            if (!f15 && L != n2.l.f9953a) {
                w0Var2 = w0Var;
            } else {
                w0Var2 = w0Var;
                L = new ai.c0(w0Var2, d4, d10, 4);
                rVar.h0(L);
            }
            n0.b(i3.z.m(b3.m.f1770a, (mc.l) L), null, 0L, v2.h.c(-707086267, new ai.m0(pVar, w1Var, cVar, 4), rVar), rVar, 1769472, 30);
        } else {
            w0Var2 = w0Var;
            rVar.R();
        }
        n2.p1 r11 = rVar.r();
        if (r11 != null) {
            r11.f9983d = new p(i0Var, w0Var2, w1Var, pVar, cVar, i2);
        }
    }

    public static final void b(mc.a aVar, b3.p pVar, boolean z10, l1.d1 d1Var, mc.q qVar, n2.m mVar, int i2) {
        int i10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-674391690);
        if ((i2 & 6) == 0) {
            if (rVar.h(aVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i10 = i16 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.f(pVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i10 |= i15;
        }
        if ((i2 & 384) == 0) {
            if (rVar.g(z10)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i10 |= i14;
        }
        if ((i2 & 3072) == 0) {
            if (rVar.f(d1Var)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i10 |= i13;
        }
        if ((i2 & 24576) == 0) {
            if (rVar.f(null)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i10 |= i12;
        }
        if ((196608 & i2) == 0) {
            if (rVar.h(qVar)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i10 |= i11;
        }
        if ((74899 & i10) != 74898) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVar.O(i10 & 1, z11)) {
            b3.p s10 = l1.c.s(l1.r1.k(l1.r1.b(f1.n.h(pVar, null, j3.a(0.0f, 6, 0L, true), z10, null, aVar, 24), 1.0f), f5175e, f5177g, f5176f, Float.NaN), d1Var);
            l1.o1 a10 = l1.m1.a(l1.i.f8571a, b3.c.f1756e0, rVar, 48);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c4 = b3.a.c(s10, rVar);
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
            a4.f fVar = a4.g.f216f;
            if (rVar.S || !nc.k.a(rVar.L(), Integer.valueOf(hashCode))) {
                w.d.w(hashCode, rVar, hashCode, fVar);
            }
            n2.s.C(c4, a4.g.f213c, rVar);
            e7.a(((f7) rVar.j(g7.f5161b)).f5148g, v2.h.c(-77738101, new c7.a(z10, qVar), rVar), rVar, 48);
            rVar.p(true);
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new g0(aVar, pVar, z10, d1Var, qVar, i2);
        }
    }
}
