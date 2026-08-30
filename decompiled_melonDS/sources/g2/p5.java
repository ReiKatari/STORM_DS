package g2;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class p5 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f5347a;

    /* renamed from: c  reason: collision with root package name */
    public static final float f5349c;

    /* renamed from: f  reason: collision with root package name */
    public static final float f5352f;

    /* renamed from: g  reason: collision with root package name */
    public static final float f5353g;

    /* renamed from: h  reason: collision with root package name */
    public static final float f5354h;

    /* renamed from: b  reason: collision with root package name */
    public static final float f5348b = 14;

    /* renamed from: d  reason: collision with root package name */
    public static final float f5350d = 24;

    /* renamed from: e  reason: collision with root package name */
    public static final float f5351e = 2;

    /* renamed from: i  reason: collision with root package name */
    public static final d1.v1 f5355i = new d1.v1(100, (d1.v) null, 6);

    /* renamed from: j  reason: collision with root package name */
    public static final float f5356j = 1;

    /* renamed from: k  reason: collision with root package name */
    public static final float f5357k = 6;

    /* renamed from: l  reason: collision with root package name */
    public static final float f5358l = 125;

    static {
        float f8 = 34;
        f5347a = f8;
        float f10 = 20;
        f5349c = f10;
        f5352f = f8;
        f5353g = f10;
        f5354h = f8 - f10;
    }

    public static final void a(boolean z10, b3.p pVar, boolean z11, c1 c1Var, n2.m mVar, int i2) {
        int i10;
        c1 c1Var2;
        boolean z12;
        b3.p pVar2;
        boolean z13;
        b3.m mVar2;
        boolean z14;
        n nVar;
        boolean z15;
        boolean z16;
        int i11;
        int i12;
        int i13;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(25866825);
        if ((i2 & 6) == 0) {
            if (rVar.g(z10)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i2 | i13;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.h(null)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        int i14 = i10 | 28032;
        if ((i2 & 196608) == 0) {
            c1Var2 = c1Var;
            if (rVar.f(c1Var2)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i14 |= i11;
        } else {
            c1Var2 = c1Var;
        }
        if ((74899 & i14) != 74898) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (rVar.O(i14 & 1, z12)) {
            rVar.T();
            int i15 = i2 & 1;
            b3.m mVar3 = b3.m.f1770a;
            if (i15 != 0 && !rVar.y()) {
                rVar.R();
                mVar2 = pVar;
                z14 = z11;
            } else {
                mVar2 = mVar3;
                z14 = true;
            }
            rVar.q();
            rVar.X(1799771122);
            Object L = rVar.L();
            Object obj = n2.l.f9953a;
            if (L == obj) {
                L = new j1.i();
                rVar.h0(L);
            }
            j1.i iVar = (j1.i) L;
            rVar.p(false);
            n2.n1 n1Var = b4.q1.f1919h;
            float v10 = ((x4.c) rVar.j(n1Var)).v(f5354h);
            Object L2 = rVar.L();
            if (L2 == obj) {
                L2 = n2.s.w(Boolean.FALSE);
                rVar.h0(L2);
            }
            n2.w0 w0Var = (n2.w0) L2;
            final float v11 = ((x4.c) rVar.j(n1Var)).v(f5358l);
            boolean c4 = rVar.c(v10) | rVar.c(v11);
            Object L3 = rVar.L();
            if (c4 || L3 == obj) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(Boolean.FALSE, Float.valueOf(0.0f));
                linkedHashMap.put(Boolean.TRUE, Float.valueOf(v10));
                g2 g2Var = new g2(linkedHashMap);
                Boolean valueOf = Boolean.valueOf(z10);
                n nVar2 = new n(valueOf, new l5(0), new mc.a() { // from class: g2.m5
                    @Override // mc.a
                    public final Object b() {
                        return Float.valueOf(v11);
                    }
                }, f5355i, new d1.x1(21));
                nVar2.m.setValue(g2Var);
                id.c cVar = nVar2.f5267e.f5137b;
                if (cVar.f()) {
                    try {
                        k kVar = nVar2.f5275n;
                        float c10 = nVar2.d().c(valueOf);
                        if (!Float.isNaN(c10)) {
                            n nVar3 = kVar.f5209a;
                            nVar3.f5272j.h(c10);
                            nVar3.f5273k.h(0.0f);
                            nVar2.f5274l.setValue(null);
                        }
                        nVar2.f(valueOf);
                    } finally {
                        cVar.d(null);
                    }
                }
                rVar.h0(nVar2);
                L3 = nVar2;
            }
            Object obj2 = (n) L3;
            int i16 = i14 >> 3;
            Object A = n2.s.A(null, rVar);
            int i17 = i14 & 14;
            Object A2 = n2.s.A(Boolean.valueOf(z10), rVar);
            boolean f8 = rVar.f(obj2) | rVar.f(A2) | rVar.f(A);
            Object L4 = rVar.L();
            if (!f8 && L4 != obj) {
                nVar = obj2;
            } else {
                L4 = new a9.d(obj2, A2, A, w0Var, (cc.c) null, 13);
                nVar = obj2;
                rVar.h0(L4);
            }
            n2.s.g(nVar, (mc.p) L4, rVar);
            Boolean valueOf2 = Boolean.valueOf(z10);
            Boolean bool = (Boolean) w0Var.getValue();
            bool.getClass();
            if (i17 == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean f10 = z15 | rVar.f(nVar);
            Object L5 = rVar.L();
            if (f10 || L5 == obj) {
                L5 = new ah.z0(z10, nVar, null);
                rVar.h0(L5);
            }
            n2.s.f(valueOf2, bool, (mc.p) L5, rVar);
            if (rVar.j(b4.q1.f1924n) == x4.m.Rtl) {
                z16 = true;
            } else {
                z16 = false;
            }
            b3.p g10 = l1.r1.g(l1.c.t(l1.r1.n(h1.n0.a(mVar2.f(mVar3).f(mVar3), nVar.f5268f, h1.n1.Horizontal, false, iVar, false, new c(nVar, null), z16), b3.c.X, 2), f5351e));
            y3.v0 d4 = l1.p.d(b3.c.A, false);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c11 = b3.a.c(g10, rVar);
            a4.h.f220a.getClass();
            mc.a aVar = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(aVar);
            } else {
                rVar.k0();
            }
            n2.s.C(d4, a4.g.f215e, rVar);
            n2.s.C(l10, a4.g.f214d, rVar);
            a4.f fVar = a4.g.f216f;
            if (rVar.S || !nc.k.a(rVar.L(), Integer.valueOf(hashCode))) {
                w.d.w(hashCode, rVar, hashCode, fVar);
            }
            n2.s.C(c11, a4.g.f213c, rVar);
            boolean booleanValue = ((Boolean) nVar.f5270h.getValue()).booleanValue();
            boolean f11 = rVar.f(nVar);
            Object L6 = rVar.L();
            if (f11 || L6 == obj) {
                L6 = new g(nVar, 5);
                rVar.h0(L6);
            }
            z13 = z14;
            b(booleanValue, z13, c1Var2, (mc.a) L6, iVar, rVar, (i16 & 896) | 6 | ((i14 >> 6) & 7168));
            rVar.p(true);
            pVar2 = mVar2;
        } else {
            rVar.R();
            pVar2 = pVar;
            z13 = z11;
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new f0(z10, pVar2, z13, c1Var, i2, 1);
        }
    }

    public static final void b(final boolean z10, final boolean z11, final c1 c1Var, final mc.a aVar, final j1.i iVar, n2.m mVar, final int i2) {
        int i10;
        boolean z12;
        boolean z13;
        float f8;
        long j2;
        long j10;
        boolean z14;
        long j11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(70908914);
        int i17 = i2 & 6;
        l1.s sVar = l1.s.f8618b;
        if (i17 == 0) {
            if (rVar.f(sVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i10 = i16 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.g(z10)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i10 |= i15;
        }
        if ((i2 & 384) == 0) {
            if (rVar.g(z11)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i10 |= i14;
        }
        if ((i2 & 3072) == 0) {
            if (rVar.f(c1Var)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i10 |= i13;
        }
        if ((i2 & 24576) == 0) {
            if (rVar.h(aVar)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i10 |= i12;
        }
        if ((196608 & i2) == 0) {
            if (rVar.f(iVar)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i10 |= i11;
        }
        boolean z15 = true;
        if ((74899 & i10) != 74898) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (rVar.O(i10 & 1, z12)) {
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (L == eVar) {
                L = new z2.p();
                rVar.h0(L);
            }
            z2.p pVar = (z2.p) L;
            if ((458752 & i10) == 131072) {
                z13 = true;
            } else {
                z13 = false;
            }
            Object L2 = rVar.L();
            if (z13 || L2 == eVar) {
                L2 = new t0(iVar, pVar, null, 2);
                rVar.h0(L2);
            }
            n2.s.g(iVar, (mc.p) L2, rVar);
            if (!pVar.isEmpty()) {
                f8 = f5357k;
            } else {
                f8 = f5356j;
            }
            float f10 = f8;
            rVar.X(-1176343362);
            if (z11) {
                if (z10) {
                    j2 = c1Var.f5066b;
                } else {
                    j2 = c1Var.f5068d;
                }
            } else if (z10) {
                j2 = c1Var.f5070f;
            } else {
                j2 = c1Var.f5072h;
            }
            n2.w0 v10 = w.d.v(j2, rVar, false);
            b3.h hVar = b3.c.X;
            b3.m mVar2 = b3.m.f1770a;
            b3.p f11 = sVar.e(mVar2, hVar).f(l1.r1.f8615c);
            boolean f12 = rVar.f(v10);
            Object L3 = rVar.L();
            if (f12 || L3 == eVar) {
                L3 = new ai.o(v10, 3);
                rVar.h0(L3);
            }
            f1.n.a(f11, (mc.l) L3, rVar, 0);
            rVar.X(-66424183);
            if (z11) {
                if (z10) {
                    j10 = c1Var.f5065a;
                } else {
                    j10 = c1Var.f5067c;
                }
            } else if (z10) {
                j10 = c1Var.f5069e;
            } else {
                j10 = c1Var.f5071g;
            }
            n2.w0 v11 = w.d.v(j10, rVar, false);
            y0 y0Var = (y0) rVar.j(o1.f5309a);
            float f13 = ((x4.f) rVar.j(o1.f5310b)).A + f10;
            int i18 = i10;
            if (i3.s.c(((i3.s) v11.getValue()).f6689a, ((l0) rVar.j(m0.f5257a)).j()) && y0Var != null) {
                rVar.X(-674840005);
                z14 = false;
                j11 = y0.a(((i3.s) v11.getValue()).f6689a, f13, rVar, 0);
                rVar.p(false);
            } else {
                z14 = false;
                rVar.X(-674751066);
                rVar.p(false);
                j11 = ((i3.s) v11.getValue()).f6689a;
            }
            long j12 = j11;
            boolean z16 = z14;
            n2.s2 a10 = c1.i2.a(j12, null, rVar, 0, 14);
            b3.p e6 = sVar.e(mVar2, b3.c.R);
            if ((i18 & 57344) != 16384) {
                z15 = z16;
            }
            Object L4 = rVar.L();
            if (z15 || L4 == eVar) {
                L4 = new f2.g1(1, aVar);
                rVar.h0(L4);
            }
            b3.p f14 = l1.r1.f(f1.x0.a(l1.c.q(e6, (mc.l) L4), iVar, j3.a(f5350d, 4, 0L, z16)), f5349c);
            t1.d dVar = t1.e.f13079a;
            l1.c.d(f1.n.f(f3.g.h(f14, f10, dVar, 0L, 24), ((i3.s) a10.getValue()).f6689a, dVar), rVar);
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p() { // from class: g2.n5
                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p5.b(z10, z11, c1Var, aVar, iVar, (n2.m) obj, n2.s.F(i2 | 1));
                    return yb.y.f14813a;
                }
            };
        }
    }
}
