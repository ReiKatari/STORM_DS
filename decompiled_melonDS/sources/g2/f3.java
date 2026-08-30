package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class f3 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f5138a = y2.f5485a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f5139b = 240;

    /* renamed from: c  reason: collision with root package name */
    public static final float f5140c = 40;

    /* renamed from: d  reason: collision with root package name */
    public static final d1.r f5141d;

    static {
        new d1.r(0.2f, 0.8f);
        new d1.r(0.4f, 1.0f);
        new d1.r(0.0f, 0.65f);
        new d1.r(0.1f, 0.45f);
        f5141d = new d1.r(0.4f, 0.2f);
    }

    public static final void a(b3.p pVar, long j2, float f8, long j10, int i2, n2.m mVar, final int i10, final int i11) {
        b3.p pVar2;
        int i12;
        int i13;
        int i14;
        boolean z10;
        n2.r rVar;
        final float f10;
        final long j11;
        final int i15;
        final b3.p pVar3;
        final long j12;
        b3.p pVar4;
        float f11;
        int i16;
        final long j13;
        int i17;
        boolean z11;
        final long j14;
        n2.r rVar2 = (n2.r) mVar;
        rVar2.Z(-1119119072);
        int i18 = i11 & 1;
        if (i18 != 0) {
            i13 = i10 | 6;
            pVar2 = pVar;
        } else {
            pVar2 = pVar;
            if (rVar2.f(pVar2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i13 = i10 | i12;
        }
        long j15 = j2;
        if ((i11 & 2) == 0 && rVar2.e(j15)) {
            i14 = 32;
        } else {
            i14 = 16;
        }
        int i19 = i13 | i14 | 11648;
        if ((i19 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar2.O(i19 & 1, z10)) {
            rVar2.T();
            if ((i10 & 1) != 0 && !rVar2.y()) {
                rVar2.R();
                if ((i11 & 2) != 0) {
                    i19 &= -113;
                }
                int i20 = i19 & (-57345);
                j13 = j10;
                i17 = i2;
                i16 = i20;
                pVar4 = pVar2;
                f11 = f8;
            } else {
                if (i18 != 0) {
                    pVar4 = b3.m.f1770a;
                } else {
                    pVar4 = pVar2;
                }
                if ((i11 & 2) != 0) {
                    j15 = ((l0) rVar2.j(m0.f5257a)).g();
                    i19 &= -113;
                }
                f11 = y2.f5485a;
                i16 = i19 & (-57345);
                j13 = i3.s.f6686g;
                i17 = 2;
            }
            rVar2.q();
            final k3.h hVar = new k3.h(((x4.c) rVar2.j(b4.q1.f1919h)).v(f11), 0.0f, i17, 0, 26);
            d1.e0 p10 = d1.d.p(rVar2, 1);
            d1.w1 w1Var = d1.d.f3546k;
            a0.j jVar = d1.w.f3689c;
            final d1.c0 j16 = d1.d.j(p10, 0, 5, w1Var, d1.d.o(d1.d.r(6660, 0, jVar, 2), null, 6), rVar2, 33208, 16);
            rVar = rVar2;
            final float f12 = f11;
            int i21 = i17;
            final d1.c0 g10 = d1.d.g(p10, 286.0f, d1.d.o(d1.d.r(1332, 0, jVar, 2), null, 6), rVar, 4536);
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (L == eVar) {
                L = new d1.x1(27);
                rVar.h0(L);
            }
            d1.g0 g0Var = new d1.g0();
            ((mc.l) L).k(g0Var);
            final d1.c0 g11 = d1.d.g(p10, 290.0f, d1.d.o(new d1.h0(g0Var), null, 6), rVar, 4536);
            Object L2 = rVar.L();
            if (L2 == eVar) {
                L2 = new d1.x1(28);
                rVar.h0(L2);
            }
            d1.g0 g0Var2 = new d1.g0();
            ((mc.l) L2).k(g0Var2);
            final d1.c0 g12 = d1.d.g(p10, 290.0f, d1.d.o(new d1.h0(g0Var2), null, 6), rVar, 4536);
            b3.p i22 = l1.r1.i(i4.n.a(pVar4, true, new d1.x1(16)), f5140c);
            boolean h2 = rVar.h(hVar) | rVar.f(j16) | rVar.f(g11) | rVar.f(g12) | rVar.f(g10);
            if ((((i16 & 112) ^ 48) > 32 && rVar.e(j15)) || (i16 & 48) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = h2 | z11;
            Object L3 = rVar.L();
            if (!z12 && L3 != eVar) {
                j14 = j15;
            } else {
                j14 = j15;
                mc.l lVar = new mc.l() { // from class: g2.d3
                    @Override // mc.l
                    public final Object k(Object obj) {
                        float f13;
                        k3.d dVar = (k3.d) obj;
                        long j17 = j13;
                        k3.h hVar2 = hVar;
                        f3.c(dVar, 0.0f, 360.0f, j17, hVar2);
                        float floatValue = ((Number) g11.getValue()).floatValue();
                        n2.s2 s2Var = g12;
                        float abs = Math.abs(floatValue - ((Number) s2Var.getValue()).floatValue());
                        float floatValue2 = ((Number) s2Var.getValue()).floatValue() + ((Number) g10.getValue()).floatValue() + (((((Number) j16.getValue()).intValue() * 216.0f) % 360.0f) - 90.0f);
                        if (hVar2.f7964c == 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = ((f12 / (f3.f5140c / 2)) * 57.29578f) / 2.0f;
                        }
                        f3.c(dVar, floatValue2 + f13, Math.max(abs, 0.1f), j14, hVar2);
                        return yb.y.f14813a;
                    }
                };
                rVar.h0(lVar);
                L3 = lVar;
            }
            f1.n.a(i22, (mc.l) L3, rVar, 0);
            i15 = i21;
            pVar3 = pVar4;
            j11 = j13;
            f10 = f12;
            j12 = j14;
        } else {
            rVar = rVar2;
            rVar.R();
            f10 = f8;
            j11 = j10;
            i15 = i2;
            pVar3 = pVar2;
            j12 = j15;
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p(j12, f10, j11, i15, i10, i11) { // from class: g2.e3
                public final /* synthetic */ long B;
                public final /* synthetic */ float L;
                public final /* synthetic */ long R;
                public final /* synthetic */ int X;
                public final /* synthetic */ int Y;

                {
                    this.Y = i11;
                }

                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int F = n2.s.F(1);
                    f3.a(b3.p.this, this.B, this.L, this.R, this.X, (n2.m) obj, F, this.Y);
                    return yb.y.f14813a;
                }
            };
        }
    }

    public static final void b(final float f8, final b3.p pVar, final long j2, long j10, n2.m mVar, final int i2) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        final long j11;
        int i13;
        float f10;
        float f11;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-531984864);
        if (rVar.c(f8)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i14 = i2 | i10;
        if (rVar.f(pVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i15 = i14 | i11;
        if (rVar.e(j2)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i16 = i15 | i12 | 9216;
        boolean z11 = true;
        if ((i16 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i16 & 1, z10)) {
            rVar.T();
            if ((i2 & 1) != 0 && !rVar.y()) {
                rVar.R();
                i13 = i16 & (-64513);
                j11 = j10;
            } else {
                i13 = i16 & (-64513);
                j11 = i3.s.b(j2, 0.24f);
            }
            rVar.q();
            if (f8 < 0.0f) {
                f10 = 0.0f;
            } else {
                f10 = f8;
            }
            if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            final float f12 = 10;
            b3.p v10 = l1.c.v(i4.n.a(y3.c0.l(pVar, new mc.q() { // from class: g2.b3
                @Override // mc.q
                public final Object i(Object obj, Object obj2, Object obj3) {
                    y3.x0 x0Var = (y3.x0) obj;
                    int O = x0Var.O(f12);
                    long j12 = ((x4.a) obj3).f14337a;
                    int i17 = O * 2;
                    y3.i1 e6 = ((y3.u0) obj2).e(x4.b.i(j12, 0, i17));
                    int i18 = e6.B - i17;
                    return x0Var.u0(e6.A, i18, zb.r.A, new c3(O, 0, e6));
                }
            }), true, new d1.x1(26)), 0.0f, f12, 1);
            Float valueOf = Float.valueOf(f10);
            if (Float.isNaN(f10)) {
                valueOf = null;
            }
            if (valueOf != null) {
                f11 = valueOf.floatValue();
            } else {
                f11 = 0.0f;
            }
            b3.p j12 = l1.r1.j(i4.n.a(v10, true, new d1.o1(f11, new sc.a(0.0f, 1.0f), 1)), f5139b, f5138a);
            boolean e6 = rVar.e(j11) | rVar.d(0) | rVar.c(f10);
            if ((((i13 & 896) ^ 384) <= 256 || !rVar.e(j2)) && (i13 & 384) != 256) {
                z11 = false;
            }
            boolean z12 = e6 | z11;
            Object L = rVar.L();
            if (z12 || L == n2.l.f9953a) {
                final float f13 = f10;
                mc.l lVar = new mc.l() { // from class: g2.z2
                    @Override // mc.l
                    public final Object k(Object obj) {
                        k3.d dVar = (k3.d) obj;
                        float intBitsToFloat = Float.intBitsToFloat((int) (dVar.c() & 4294967295L));
                        f3.d(dVar, 1.0f, j11, intBitsToFloat);
                        f3.d(dVar, f13, j2, intBitsToFloat);
                        return yb.y.f14813a;
                    }
                };
                rVar.h0(lVar);
                L = lVar;
            }
            f1.n.a(j12, (mc.l) L, rVar, 0);
        } else {
            rVar.R();
            j11 = j10;
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p(f8, pVar, j2, j11, i2) { // from class: g2.a3
                public final /* synthetic */ float A;
                public final /* synthetic */ b3.p B;
                public final /* synthetic */ long L;
                public final /* synthetic */ long R;

                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int F = n2.s.F(1);
                    f3.b(this.A, this.B, this.L, this.R, (n2.m) obj, F);
                    return yb.y.f14813a;
                }
            };
        }
    }

    public static final void c(k3.d dVar, float f8, float f10, long j2, k3.h hVar) {
        float f11;
        float f12 = 2;
        float intBitsToFloat = Float.intBitsToFloat((int) (dVar.c() >> 32)) - (f12 * (hVar.f7962a / f12));
        dVar.A(j2, f8, f10, (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), hVar);
    }

    public static final void d(k3.d dVar, float f8, long j2, float f10) {
        boolean z10;
        float f11;
        float intBitsToFloat = Float.intBitsToFloat((int) (dVar.c() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (dVar.c() & 4294967295L)) / 2;
        if (dVar.getLayoutDirection() == x4.m.Ltr) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f12 = 1.0f;
        if (z10) {
            f11 = 0.0f;
        } else {
            f11 = 1.0f - f8;
        }
        float f13 = f11 * intBitsToFloat;
        if (z10) {
            f12 = f8;
        }
        k3.d.p(dVar, j2, (Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), (Float.floatToRawIntBits(f12 * intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), f10, 0, 496);
    }
}
