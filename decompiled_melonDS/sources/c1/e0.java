package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final j1 f2414a = new j1(1);

    public static final void a(d1.q1 q1Var, mc.l lVar, b3.p pVar, c1 c1Var, d1 d1Var, mc.p pVar2, v2.c cVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        boolean z11;
        n2.f1 f1Var;
        boolean z12;
        boolean z13;
        boolean z14;
        d1.w1 w1Var;
        d1.q1 q1Var2;
        c1 c1Var2;
        s2 s2Var;
        int i11;
        d1 d1Var2;
        s2 s2Var2;
        d1.k1 k1Var;
        d1.k1 k1Var2;
        d1.k1 k1Var3;
        boolean z15;
        boolean z16;
        boolean z17;
        d1.k1 k1Var4;
        c1 c1Var3;
        d1 d1Var3;
        boolean z18;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        v2.c cVar2 = cVar;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(1912839215);
        if ((i2 & 6) == 0) {
            if (rVar.f(q1Var)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i10 = i18 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.h(lVar)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i10 |= i17;
        }
        if ((i2 & 384) == 0) {
            if (rVar.f(pVar)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i10 |= i16;
        }
        if ((i2 & 3072) == 0) {
            if (rVar.f(c1Var)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i10 |= i15;
        }
        if ((i2 & 24576) == 0) {
            if (rVar.f(d1Var)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i10 |= i14;
        }
        if ((196608 & i2) == 0) {
            if (rVar.h(pVar2)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i10 |= i13;
        }
        int i19 = i10 | 1572864;
        if ((12582912 & i2) == 0) {
            if (rVar.h(cVar2)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i19 |= i12;
        }
        int i20 = i19;
        if ((4793491 & i20) != 4793490) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i20 & 1, z10)) {
            n2.f1 f1Var2 = q1Var.f3652d;
            a3.b bVar = q1Var.f3649a;
            if (!((Boolean) lVar.k(f1Var2.getValue())).booleanValue() && !((Boolean) lVar.k(bVar.c())).booleanValue() && !q1Var.g() && !q1Var.d()) {
                rVar.X(-272333293);
                rVar.p(false);
            } else {
                rVar.X(-232413539);
                int i21 = i20 & 14;
                int i22 = i21 | 48;
                int i23 = i22 & 14;
                if (((i23 ^ 6) > 4 && rVar.f(q1Var)) || (i22 & 6) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Object L = rVar.L();
                n2.e eVar = n2.l.f9953a;
                if (z11 || L == eVar) {
                    L = bVar.c();
                    rVar.h0(L);
                }
                if (q1Var.g()) {
                    L = bVar.c();
                }
                rVar.X(1844425648);
                m0 i24 = i(q1Var, lVar, L, rVar);
                rVar.p(false);
                Object value = q1Var.f3652d.getValue();
                rVar.X(1844425648);
                m0 i25 = i(q1Var, lVar, value, rVar);
                rVar.p(false);
                d1.q1 b10 = d1.u1.b(q1Var, i24, i25, "EnterExitTransition", rVar, i23 | 3072);
                rVar = rVar;
                n2.w0 A = n2.s.A(pVar2, rVar);
                a3.b bVar2 = b10.f3649a;
                a3.b bVar3 = b10.f3649a;
                n2.f1 f1Var3 = b10.f3652d;
                Object j2 = pVar2.j(bVar2.c(), f1Var3.getValue());
                boolean f8 = rVar.f(b10) | rVar.f(A);
                Object L2 = rVar.L();
                if (!f8 && L2 != eVar) {
                    f1Var = f1Var3;
                } else {
                    f1Var = f1Var3;
                    L2 = new a2.o(b10, A, (cc.c) null, 10);
                    rVar.h0(L2);
                }
                mc.p pVar3 = (mc.p) L2;
                Object L3 = rVar.L();
                if (L3 == eVar) {
                    L3 = n2.s.w(j2);
                    rVar.h0(L3);
                }
                n2.w0 w0Var = (n2.w0) L3;
                boolean h2 = rVar.h(pVar3);
                Object L4 = rVar.L();
                if (h2 || L4 == eVar) {
                    L4 = new n2.n2(pVar3, w0Var, null, 0);
                    rVar.h0(L4);
                }
                n2.s.g(yb.y.f14813a, (mc.p) L4, rVar);
                Object c4 = bVar3.c();
                m0 m0Var = m0.PostExit;
                if (c4 == m0Var && f1Var.getValue() == m0Var && ((Boolean) w0Var.getValue()).booleanValue()) {
                    rVar.X(-272333293);
                    rVar.p(false);
                    z18 = false;
                } else {
                    rVar.X(-231383533);
                    if (i21 == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    Object L5 = rVar.L();
                    if (z12 || L5 == eVar) {
                        L5 = new g0(b10);
                        rVar.h0(L5);
                    }
                    g0 g0Var = (g0) L5;
                    d1.w1 w1Var2 = w0.f2539a;
                    d1.w1 w1Var3 = d1.d.f3550p;
                    Object L6 = rVar.L();
                    if (L6 == eVar) {
                        L6 = t0.L;
                        rVar.h0(L6);
                    }
                    mc.a aVar = (mc.a) L6;
                    boolean f10 = rVar.f(b10);
                    Object L7 = rVar.L();
                    if (f10 || L7 == eVar) {
                        L7 = n2.s.w(c1Var);
                        rVar.h0(L7);
                    }
                    n2.w0 w0Var2 = (n2.w0) L7;
                    if (bVar3.c() == f1Var.getValue() && bVar3.c() == m0.Visible) {
                        if (b10.g()) {
                            w0Var2.setValue(c1Var);
                        } else {
                            w0Var2.setValue(c1.f2396b);
                        }
                    } else if (f1Var.getValue() == m0.Visible) {
                        w0Var2.setValue(((c1) w0Var2.getValue()).a(c1Var));
                    }
                    c1 c1Var4 = (c1) w0Var2.getValue();
                    boolean f11 = rVar.f(b10);
                    Object L8 = rVar.L();
                    if (f11 || L8 == eVar) {
                        L8 = n2.s.w(d1Var);
                        rVar.h0(L8);
                    }
                    n2.w0 w0Var3 = (n2.w0) L8;
                    if (bVar3.c() == f1Var.getValue() && bVar3.c() == m0.Visible) {
                        if (b10.g()) {
                            w0Var3.setValue(d1Var);
                        } else {
                            w0Var3.setValue(d1.f2401b);
                        }
                    } else if (f1Var.getValue() != m0.Visible) {
                        w0Var3.setValue(((d1) w0Var3.getValue()).a(d1Var));
                    }
                    d1 d1Var4 = (d1) w0Var3.getValue();
                    s2 s2Var3 = c1Var4.f2397a;
                    s2 s2Var4 = d1Var4.f2403a;
                    k0 k0Var = s2Var4.f2523c;
                    p2 p2Var = s2Var3.f2522b;
                    k0 k0Var2 = s2Var3.f2523c;
                    if (p2Var == null && s2Var4.f2522b == null) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (k0Var2 == null && k0Var == null) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    if (z13) {
                        rVar.X(133792645);
                        Object L9 = rVar.L();
                        if (L9 == eVar) {
                            L9 = "Built-in slide";
                            rVar.h0("Built-in slide");
                        }
                        String str = (String) L9;
                        c1Var2 = c1Var4;
                        s2Var = s2Var4;
                        d1Var2 = d1Var4;
                        q1Var2 = b10;
                        i11 = i20;
                        s2Var2 = s2Var3;
                        d1.k1 c10 = d1.u1.c(q1Var2, w1Var3, str, rVar, 384, 0);
                        w1Var = w1Var3;
                        rVar.p(false);
                        k1Var = c10;
                    } else {
                        w1Var = w1Var3;
                        q1Var2 = b10;
                        c1Var2 = c1Var4;
                        s2Var = s2Var4;
                        i11 = i20;
                        d1Var2 = d1Var4;
                        s2Var2 = s2Var3;
                        rVar.X(133898448);
                        rVar.p(false);
                        k1Var = null;
                    }
                    if (z14) {
                        rVar.X(133990239);
                        d1.w1 w1Var4 = d1.d.f3551q;
                        Object L10 = rVar.L();
                        if (L10 == eVar) {
                            L10 = "Built-in shrink/expand";
                            rVar.h0("Built-in shrink/expand");
                        }
                        d1.k1 c11 = d1.u1.c(q1Var2, w1Var4, (String) L10, rVar, 384, 0);
                        rVar.p(false);
                        k1Var2 = c11;
                    } else {
                        rVar.X(134101063);
                        rVar.p(false);
                        k1Var2 = null;
                    }
                    if (z14) {
                        rVar.X(134174689);
                        Object L11 = rVar.L();
                        if (L11 == eVar) {
                            L11 = "Built-in InterruptionHandlingOffset";
                            rVar.h0("Built-in InterruptionHandlingOffset");
                        }
                        d1.k1 c12 = d1.u1.c(q1Var2, w1Var, (String) L11, rVar, 384, 0);
                        rVar.p(false);
                        k1Var3 = c12;
                    } else {
                        rVar.X(134345095);
                        rVar.p(false);
                        k1Var3 = null;
                    }
                    if ((k0Var2 != null && !k0Var2.f2455d) || ((k0Var != null && !k0Var.f2455d) || !z14)) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    float[] fArr = j3.d.f7349a;
                    rVar.X(135150476);
                    rVar.p(false);
                    d1.w1 w1Var5 = d1.d.f3545j;
                    if (s2Var2.f2521a == null && s2Var.f2521a == null) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    if (z16) {
                        rVar.X(-703879421);
                        Object L12 = rVar.L();
                        if (L12 == eVar) {
                            L12 = "Built-in alpha";
                            rVar.h0("Built-in alpha");
                        }
                        k1Var4 = d1.u1.c(q1Var2, w1Var5, (String) L12, rVar, 384, 0);
                        z17 = false;
                        rVar.p(false);
                    } else {
                        z17 = false;
                        rVar.X(-703709976);
                        rVar.p(false);
                        k1Var4 = null;
                    }
                    rVar.X(-703472888);
                    rVar.p(z17);
                    rVar.X(-703222904);
                    rVar.p(z17);
                    boolean h10 = rVar.h(k1Var4) | rVar.f(c1Var2) | rVar.f(d1Var2) | rVar.h(null) | rVar.f(q1Var2) | rVar.h(null);
                    Object L13 = rVar.L();
                    if (!h10 && L13 != eVar) {
                        c1Var3 = c1Var2;
                        d1Var3 = d1Var2;
                    } else {
                        c1Var3 = c1Var2;
                        d1Var3 = d1Var2;
                        L13 = new o0(k1Var4, null, q1Var2, c1Var3, d1Var3, null);
                        rVar.h0(L13);
                    }
                    o0 o0Var = (o0) L13;
                    boolean g10 = rVar.g(z15) | rVar.f(aVar);
                    Object L14 = rVar.L();
                    if (g10 || L14 == eVar) {
                        L14 = new u0(aVar, z15);
                        rVar.h0(L14);
                    }
                    b3.m mVar2 = b3.m.f1770a;
                    b3.p f12 = i3.z.m(mVar2, (mc.l) L14).f(new n0(q1Var2, k1Var2, k1Var3, k1Var, c1Var3, d1Var3, aVar, o0Var)).f(mVar2);
                    rVar.X(-7432681);
                    rVar.p(false);
                    b3.p f13 = pVar.f(f12.f(mVar2));
                    Object L15 = rVar.L();
                    if (L15 == eVar) {
                        L15 = new w(g0Var);
                        rVar.h0(L15);
                    }
                    w wVar = (w) L15;
                    int hashCode = Long.hashCode(rVar.T);
                    v2.g l10 = rVar.l();
                    b3.p c13 = b3.a.c(f13, rVar);
                    a4.h.f220a.getClass();
                    a4.f0 f0Var = a4.g.f212b;
                    rVar.b0();
                    if (rVar.S) {
                        rVar.k(f0Var);
                    } else {
                        rVar.k0();
                    }
                    n2.s.C(wVar, a4.g.f215e, rVar);
                    n2.s.C(l10, a4.g.f214d, rVar);
                    n2.s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
                    n2.s.y(rVar, a4.g.f217g);
                    n2.s.C(c13, a4.g.f213c, rVar);
                    cVar2 = cVar;
                    cVar2.i(g0Var, rVar, Integer.valueOf((i11 >> 18) & 112));
                    rVar.p(true);
                    z18 = false;
                    rVar.p(false);
                }
                rVar.p(z18);
            }
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new x(q1Var, lVar, pVar, c1Var, d1Var, pVar2, cVar2, i2);
        }
    }

    public static final void b(d1.i0 i0Var, b3.p pVar, c1 c1Var, d1 d1Var, String str, v2.c cVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        boolean z10;
        b3.m mVar2;
        String str2;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(657024243);
        if (rVar.f(i0Var)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i2 | i10 | 48;
        if (rVar.f(c1Var)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i13 = i12 | i11 | 24576;
        if ((74899 & i13) != 74898) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i13 & 1, z10)) {
            d1.q1 e6 = d1.u1.e(i0Var, "AnimatedVisibility", rVar, (i13 & 14) | 48, 0);
            Object L = rVar.L();
            if (L == n2.l.f9953a) {
                L = e.Z;
                rVar.h0(L);
            }
            b3.m mVar3 = b3.m.f1770a;
            f(e6, (mc.l) L, mVar3, c1Var, d1Var, cVar, rVar, ((i13 << 3) & 7168) | 221616);
            mVar2 = mVar3;
            str2 = "AnimatedVisibility";
        } else {
            rVar.R();
            mVar2 = pVar;
            str2 = str;
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new j(i0Var, mVar2, c1Var, d1Var, str2, cVar, i2);
        }
    }

    public static final void c(l1.p1 p1Var, boolean z10, b3.p pVar, c1 c1Var, d1 d1Var, String str, v2.c cVar, n2.m mVar, int i2) {
        int i10;
        boolean z11;
        b3.m mVar2;
        c1 c1Var2;
        d1 d1Var2;
        String str2;
        b3.h hVar;
        int i11;
        int i12;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(234057107);
        if ((i2 & 48) == 0) {
            if (rVar.g(z10)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 = i2 | i12;
        } else {
            i10 = i2;
        }
        int i13 = i10 | 224640;
        if ((i2 & 1572864) == 0) {
            if (rVar.h(cVar)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i13 |= i11;
        }
        if ((599185 & i13) != 599184) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVar.O(i13 & 1, z11)) {
            c1 a10 = w0.d(null, 3).a(w0.a(15));
            d1 e6 = w0.e(null, 3);
            long j2 = 1;
            d1.a1 q10 = d1.d.q(1, new x4.l((j2 & 4294967295L) | (j2 << 32)));
            b3.f fVar = b3.c.f1760i0;
            e eVar = e.f2409f0;
            if (nc.k.a(fVar, b3.c.f1758g0)) {
                hVar = b3.c.R;
            } else if (nc.k.a(fVar, fVar)) {
                hVar = b3.c.Y;
            } else {
                hVar = b3.c.X;
            }
            d1 a11 = e6.a(w0.f(q10, hVar, new v0(eVar, 0)));
            int i14 = i13 >> 3;
            d1.q1 f8 = d1.u1.f(Boolean.valueOf(z10), "AnimatedVisibility", rVar, (i14 & 14) | ((i13 >> 12) & 112), 0);
            Object L = rVar.L();
            if (L == n2.l.f9953a) {
                L = e.X;
                rVar.h0(L);
            }
            b3.m mVar3 = b3.m.f1770a;
            f(f8, (mc.l) L, mVar3, a10, a11, cVar, rVar, (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168) | (i14 & 458752));
            mVar2 = mVar3;
            c1Var2 = a10;
            d1Var2 = a11;
            str2 = "AnimatedVisibility";
        } else {
            rVar.R();
            mVar2 = pVar;
            c1Var2 = c1Var;
            d1Var2 = d1Var;
            str2 = str;
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new a0(p1Var, z10, mVar2, c1Var2, d1Var2, str2, cVar, i2);
        }
    }

    public static final void d(boolean z10, b3.p pVar, c1 c1Var, d1 d1Var, String str, v2.c cVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        boolean z11;
        String str2;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-1448730565);
        if (rVar.g(z10)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i2 | i10;
        if (rVar.f(pVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i13 = i12 | i11 | 24576;
        if ((74899 & i13) != 74898) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVar.O(i13 & 1, z11)) {
            d1.q1 f8 = d1.u1.f(Boolean.valueOf(z10), "AnimatedVisibility", rVar, (i13 & 14) | 48, 0);
            Object L = rVar.L();
            if (L == n2.l.f9953a) {
                L = e.R;
                rVar.h0(L);
            }
            f(f8, (mc.l) L, pVar, c1Var, d1Var, cVar, rVar, ((i13 << 3) & 896) | 224304);
            str2 = "AnimatedVisibility";
        } else {
            rVar.R();
            str2 = str;
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new z(z10, pVar, c1Var, d1Var, str2, cVar, i2);
        }
    }

    public static final void e(boolean z10, b3.p pVar, c1 c1Var, d1 d1Var, String str, v2.c cVar, n2.m mVar, int i2, int i10) {
        int i11;
        c1 c1Var2;
        int i12;
        int i13;
        d1 d1Var2;
        int i14;
        int i15;
        boolean z11;
        b3.m mVar2;
        String str2;
        c1 c1Var3;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(1799879339);
        if (rVar.g(z10)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i16 = i2 | i11;
        int i17 = i16 | 384;
        int i18 = i10 & 4;
        if (i18 != 0) {
            i13 = i16 | 3456;
            c1Var2 = c1Var;
        } else {
            c1Var2 = c1Var;
            if (rVar.f(c1Var2)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i13 = i17 | i12;
        }
        int i19 = i10 & 8;
        if (i19 != 0) {
            i15 = i13 | 24576;
            d1Var2 = d1Var;
        } else {
            d1Var2 = d1Var;
            if (rVar.f(d1Var2)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i15 = i13 | i14;
        }
        int i20 = i15 | 196608;
        if ((599185 & i20) != 599184) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVar.O(i20 & 1, z11)) {
            if (i18 != 0) {
                c1Var2 = w0.d(null, 3).a(w0.c(15));
            }
            c1 c1Var4 = c1Var2;
            if (i19 != 0) {
                d1Var2 = w0.e(null, 3).a(w0.g(null, 15));
            }
            d1.q1 f8 = d1.u1.f(Boolean.valueOf(z10), "AnimatedVisibility", rVar, ((i20 >> 3) & 14) | 48, 0);
            Object L = rVar.L();
            if (L == n2.l.f9953a) {
                L = e.Y;
                rVar.h0(L);
            }
            b3.m mVar3 = b3.m.f1770a;
            f(f8, (mc.l) L, mVar3, c1Var4, d1Var2, cVar, rVar, (i20 & 57344) | (i20 & 7168) | 432 | 196608);
            c1Var3 = c1Var4;
            str2 = "AnimatedVisibility";
            mVar2 = mVar3;
        } else {
            rVar.R();
            mVar2 = pVar;
            str2 = str;
            c1Var3 = c1Var2;
        }
        d1 d1Var3 = d1Var2;
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new b0(z10, mVar2, c1Var3, d1Var3, str2, cVar, i2, i10);
        }
    }

    public static final void f(d1.q1 q1Var, mc.l lVar, b3.p pVar, c1 c1Var, d1 d1Var, v2.c cVar, n2.m mVar, int i2) {
        int i10;
        c1 c1Var2;
        d1 d1Var2;
        v2.c cVar2;
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(1706321816);
        if ((i2 & 6) == 0) {
            if (rVar.f(q1Var)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i10 = i16 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.h(lVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i10 |= i15;
        }
        if ((i2 & 384) == 0) {
            if (rVar.f(pVar)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i10 |= i14;
        }
        if ((i2 & 3072) == 0) {
            c1Var2 = c1Var;
            if (rVar.f(c1Var2)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i10 |= i13;
        } else {
            c1Var2 = c1Var;
        }
        if ((i2 & 24576) == 0) {
            d1Var2 = d1Var;
            if (rVar.f(d1Var2)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i10 |= i12;
        } else {
            d1Var2 = d1Var;
        }
        if ((i2 & 196608) == 0) {
            cVar2 = cVar;
            if (rVar.h(cVar2)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i10 |= i11;
        } else {
            cVar2 = cVar;
        }
        boolean z12 = false;
        if ((74899 & i10) != 74898) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i10 & 1, z10)) {
            int i17 = i10 & 112;
            if (i17 == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i18 = i10 & 14;
            if (i18 == 4) {
                z12 = true;
            }
            boolean z13 = z11 | z12;
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (z13 || L == eVar) {
                L = new d0(lVar, q1Var);
                rVar.h0(L);
            }
            b3.p l10 = y3.c0.l(pVar, (mc.q) L);
            Object L2 = rVar.L();
            if (L2 == eVar) {
                L2 = l.R;
                rVar.h0(L2);
            }
            a(q1Var, lVar, l10, c1Var2, d1Var2, (mc.p) L2, cVar2, rVar, 196608 | i18 | i17 | (i10 & 7168) | (57344 & i10) | ((i10 << 6) & 29360128));
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new k(q1Var, lVar, pVar, c1Var, d1Var, cVar, i2);
        }
    }

    public static final h3.c g(p1 p1Var, l1 l1Var) {
        if (l1Var != null) {
            z2.p pVar = p1Var.f2500g;
            int size = pVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (nc.k.a(((q1) pVar.get(i2)).f2511f0, l1Var)) {
                    if (l1Var.f1777h0) {
                        if (!l1Var.f2463j0) {
                            return l1Var.f2462i0;
                        }
                        return pc.a.h(y3.z.J(l1Var.P0(), a4.l.s(l1Var), 6), zb.k.T(a4.l.s(l1Var).L));
                    }
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public static final void h(b9.e eVar, long j2, long j10, long j11, boolean z10) {
        n2.f1 f1Var = (n2.f1) eVar.L;
        n2.f1 f1Var2 = (n2.f1) eVar.X;
        n2.f1 f1Var3 = (n2.f1) eVar.B;
        n2.f1 f1Var4 = (n2.f1) eVar.R;
        if (!h3.b.b(((h3.b) f1Var4.getValue()).f6050a, j11) || !h3.e.b(((h3.e) f1Var3.getValue()).f6064a, j2) || z10) {
            f1Var3.setValue(new h3.e(j2));
            f1Var4.setValue(new h3.b(j11));
            if (z10) {
                f1Var.setValue(new h3.b(h3.b.d(h3.b.d(j10, j11), h3.b.d(((h3.b) f1Var2.getValue()).f6050a, ((h3.b) f1Var.getValue()).f6050a))));
            }
        }
        f1Var2.setValue(new h3.b(h3.b.d(j10, j11)));
    }

    public static final m0 i(d1.q1 q1Var, mc.l lVar, Object obj, n2.m mVar) {
        m0 m0Var;
        n2.r rVar = (n2.r) mVar;
        rVar.V(-422486745, q1Var);
        boolean g10 = q1Var.g();
        a3.b bVar = q1Var.f3649a;
        if (g10) {
            rVar.X(-212166497);
            rVar.p(false);
            if (((Boolean) lVar.k(obj)).booleanValue()) {
                m0Var = m0.Visible;
            } else if (((Boolean) lVar.k(bVar.c())).booleanValue()) {
                m0Var = m0.PostExit;
            } else {
                m0Var = m0.PreEnter;
            }
        } else {
            rVar.X(-211892364);
            Object L = rVar.L();
            if (L == n2.l.f9953a) {
                L = n2.s.w(Boolean.FALSE);
                rVar.h0(L);
            }
            n2.w0 w0Var = (n2.w0) L;
            if (((Boolean) lVar.k(bVar.c())).booleanValue()) {
                w0Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) lVar.k(obj)).booleanValue()) {
                m0Var = m0.Visible;
            } else if (((Boolean) w0Var.getValue()).booleanValue()) {
                m0Var = m0.PostExit;
            } else {
                m0Var = m0.PreEnter;
            }
            rVar.p(false);
        }
        rVar.p(false);
        return m0Var;
    }
}
