package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class x5 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f5475a = 48;

    /* renamed from: b  reason: collision with root package name */
    public static final float f5476b = 16;

    /* renamed from: c  reason: collision with root package name */
    public static final float f5477c = 14;

    /* renamed from: d  reason: collision with root package name */
    public static final float f5478d = 6;

    /* renamed from: e  reason: collision with root package name */
    public static final long f5479e = p7.t.o(20);

    public static final void a(final boolean z10, final mc.a aVar, b3.p pVar, boolean z11, final mc.p pVar2, long j2, long j10, n2.m mVar, final int i2) {
        int i10;
        int i11;
        boolean z12;
        final b3.p pVar3;
        final boolean z13;
        final long j11;
        final long j12;
        float f8;
        int i12;
        long b10;
        long j13;
        b3.m mVar2;
        boolean z14;
        v2.c c4;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-610760526);
        if (rVar.g(z10)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i13 = i2 | i10;
        if (rVar.h(aVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i14 = i13 | i11 | 39521664;
        if ((38347923 & i14) != 38347922) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (rVar.O(i14 & 1, z12)) {
            rVar.T();
            if ((i2 & 1) != 0 && !rVar.y()) {
                rVar.R();
                i12 = i14 & (-264241153);
                mVar2 = pVar;
                z14 = z11;
                j13 = j2;
                b10 = j10;
            } else {
                n2.b0 b0Var = q0.f5361a;
                long j14 = ((i3.s) rVar.j(b0Var)).f6689a;
                long j15 = ((i3.s) rVar.j(b0Var)).f6689a;
                if (!((l0) rVar.j(m0.f5257a)).k() ? i3.z.r(j15) < 0.5d : i3.z.r(j15) > 0.5d) {
                    f8 = 0.74f;
                } else {
                    f8 = 0.6f;
                }
                i12 = i14 & (-264241153);
                b10 = i3.s.b(j14, f8);
                j13 = j14;
                mVar2 = b3.m.f1770a;
                z14 = true;
            }
            rVar.q();
            if (pVar2 == null) {
                rVar.X(-1684876703);
                rVar.p(false);
                c4 = null;
            } else {
                rVar.X(-1684876702);
                c4 = v2.h.c(1101313667, new q5(pVar2, 0, (byte) 0), rVar);
                rVar.p(false);
            }
            b(z10, aVar, mVar2, z14, j13, b10, v2.h.c(-1088373601, new ai.q0(5, c4), rVar), rVar, (i12 & 112) | (i12 & 14) | 12582912 | 28032);
            pVar3 = mVar2;
            z13 = z14;
            j11 = j13;
            j12 = b10;
        } else {
            rVar.R();
            pVar3 = pVar;
            z13 = z11;
            j11 = j2;
            j12 = j10;
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p(z10, aVar, pVar3, z13, pVar2, j11, j12, i2) { // from class: g2.r5
                public final /* synthetic */ boolean A;
                public final /* synthetic */ mc.a B;
                public final /* synthetic */ b3.p L;
                public final /* synthetic */ boolean R;
                public final /* synthetic */ mc.p X;
                public final /* synthetic */ long Y;
                public final /* synthetic */ long Z;

                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int F = n2.s.F(24577);
                    x5.a(this.A, this.B, this.L, this.R, this.X, this.Y, this.Z, (n2.m) obj, F);
                    return yb.y.f14813a;
                }
            };
        }
    }

    public static final void b(final boolean z10, final mc.a aVar, final b3.p pVar, final boolean z11, final long j2, final long j10, final v2.c cVar, n2.m mVar, final int i2) {
        int i10;
        mc.a aVar2;
        boolean z12;
        n2.r rVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        n2.r rVar2 = (n2.r) mVar;
        rVar2.Z(-1847932236);
        if ((i2 & 6) == 0) {
            if (rVar2.g(z10)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i10 = i18 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            aVar2 = aVar;
            if (rVar2.h(aVar2)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i10 |= i17;
        } else {
            aVar2 = aVar;
        }
        if ((i2 & 384) == 0) {
            if (rVar2.f(pVar)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i10 |= i16;
        }
        if ((i2 & 3072) == 0) {
            if (rVar2.g(z11)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i10 |= i15;
        }
        if ((i2 & 24576) == 0) {
            if (rVar2.f(null)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i10 |= i14;
        }
        if ((196608 & i2) == 0) {
            if (rVar2.e(j2)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i10 |= i13;
        }
        if ((1572864 & i2) == 0) {
            if (rVar2.e(j10)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i10 |= i12;
        }
        if ((12582912 & i2) == 0) {
            if (rVar2.h(cVar)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i10 |= i11;
        }
        if ((4793491 & i10) != 4793490) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (rVar2.O(i10 & 1, z12)) {
            rVar2.T();
            if ((i2 & 1) != 0 && !rVar2.y()) {
                rVar2.R();
            }
            rVar2.q();
            final k3 a10 = j3.a(0.0f, 2, j2, true);
            final mc.a aVar3 = aVar2;
            int i19 = i10 >> 15;
            rVar = rVar2;
            d(j2, j10, z10, v2.h.c(-652402312, new mc.p() { // from class: g2.s5
                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    boolean z13;
                    n2.m mVar2 = (n2.m) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    n2.r rVar3 = (n2.r) mVar2;
                    if (rVar3.O(intValue & 1, z13)) {
                        b3.p b10 = l1.r1.b(s1.c.a(b3.p.this, z10, a10, z11, new i4.i(4), aVar3), 1.0f);
                        l1.w a11 = l1.u.a(l1.i.f8574d, b3.c.f1759h0, rVar3, 54);
                        int hashCode = Long.hashCode(rVar3.T);
                        v2.g l10 = rVar3.l();
                        b3.p c4 = b3.a.c(b10, rVar3);
                        a4.h.f220a.getClass();
                        a4.f0 f0Var = a4.g.f212b;
                        rVar3.b0();
                        if (rVar3.S) {
                            rVar3.k(f0Var);
                        } else {
                            rVar3.k0();
                        }
                        n2.s.C(a11, a4.g.f215e, rVar3);
                        n2.s.C(l10, a4.g.f214d, rVar3);
                        a4.f fVar = a4.g.f216f;
                        if (rVar3.S || !nc.k.a(rVar3.L(), Integer.valueOf(hashCode))) {
                            w.d.w(hashCode, rVar3, hashCode, fVar);
                        }
                        n2.s.C(c4, a4.g.f213c, rVar3);
                        cVar.i(l1.x.f8644a, rVar3, 6);
                        rVar3.p(true);
                    } else {
                        rVar3.R();
                    }
                    return yb.y.f14813a;
                }
            }, rVar2), rVar, ((i10 << 6) & 896) | (i19 & 112) | (i19 & 14) | 3072);
        } else {
            rVar = rVar2;
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p() { // from class: g2.t5
                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    x5.b(z10, aVar, pVar, z11, j2, j10, cVar, (n2.m) obj, n2.s.F(i2 | 1));
                    return yb.y.f14813a;
                }
            };
        }
    }

    public static final void c(mc.p pVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        b3.h hVar = b3.c.A;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(1466813041);
        if (rVar.h(pVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i13 = i10 | i2;
        if (rVar.h(null)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i14 = i13 | i11;
        if ((i14 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i14 & 1, z10)) {
            int i15 = i14 & 14;
            if (i15 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((i14 & 112) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z13 = z12 | z11;
            Object L = rVar.L();
            if (z13 || L == n2.l.f9953a) {
                L = new w5(pVar, 0);
                rVar.h0(L);
            }
            y3.v0 v0Var = (y3.v0) L;
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c4 = b3.a.c(b3.m.f1770a, rVar);
            a4.h.f220a.getClass();
            a4.f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            a4.f fVar = a4.g.f215e;
            n2.s.C(v0Var, fVar, rVar);
            a4.f fVar2 = a4.g.f214d;
            n2.s.C(l10, fVar2, rVar);
            a4.f fVar3 = a4.g.f216f;
            if (rVar.S || !nc.k.a(rVar.L(), Integer.valueOf(hashCode))) {
                w.d.w(hashCode, rVar, hashCode, fVar3);
            }
            a4.f fVar4 = a4.g.f213c;
            n2.s.C(c4, fVar4, rVar);
            if (pVar != null) {
                rVar.X(-1044948645);
                b3.p v10 = l1.c.v(y3.c0.m("text"), f5476b, 0.0f, 2);
                y3.v0 d4 = l1.p.d(hVar, false);
                int hashCode2 = Long.hashCode(rVar.T);
                v2.g l11 = rVar.l();
                b3.p c10 = b3.a.c(v10, rVar);
                rVar.b0();
                if (rVar.S) {
                    rVar.k(f0Var);
                } else {
                    rVar.k0();
                }
                n2.s.C(d4, fVar, rVar);
                n2.s.C(l11, fVar2, rVar);
                if (rVar.S || !nc.k.a(rVar.L(), Integer.valueOf(hashCode2))) {
                    w.d.w(hashCode2, rVar, hashCode2, fVar3);
                }
                n2.s.C(c10, fVar4, rVar);
                pVar.j(rVar, Integer.valueOf(i15));
                rVar.p(true);
                rVar.p(false);
                i12 = -1057560344;
            } else {
                i12 = -1057560344;
                rVar.X(-1057560344);
                rVar.p(false);
            }
            rVar.X(i12);
            rVar.p(false);
            rVar.p(true);
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new q5(i2, pVar);
        }
    }

    public static final void d(final long j2, long j10, final boolean z10, final v2.c cVar, n2.m mVar, final int i2) {
        int i10;
        long j11;
        boolean z11;
        long j12;
        long j13;
        long j14;
        int i11;
        boolean z12;
        d1.v1 r5;
        int i12;
        int i13;
        int i14;
        int i15;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-1841653376);
        if ((i2 & 6) == 0) {
            if (rVar.e(j2)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i10 = i15 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            j11 = j10;
            if (rVar.e(j11)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i10 |= i14;
        } else {
            j11 = j10;
        }
        if ((i2 & 384) == 0) {
            if (rVar.g(z10)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i10 |= i13;
        }
        if ((i2 & 3072) == 0) {
            if (rVar.h(cVar)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i10 |= i12;
        }
        if ((i10 & 1171) != 1170) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVar.O(i10 & 1, z11)) {
            int i16 = i10 >> 6;
            d1.q1 f8 = d1.u1.f(Boolean.valueOf(z10), null, rVar, i16 & 14, 2);
            n2.f1 f1Var = f8.f3652d;
            boolean booleanValue = ((Boolean) f1Var.getValue()).booleanValue();
            rVar.X(90393475);
            if (booleanValue) {
                j12 = j2;
            } else {
                j12 = j11;
            }
            rVar.p(false);
            j3.c f10 = i3.s.f(j12);
            boolean f11 = rVar.f(f10);
            Object L = rVar.L();
            if (f11 || L == n2.l.f9953a) {
                d1.w1 w1Var = new d1.w1(c1.e.f2405b0, new c1.g(3, f10));
                rVar.h0(w1Var);
                L = w1Var;
            }
            d1.w1 w1Var2 = (d1.w1) L;
            boolean booleanValue2 = ((Boolean) f8.f3649a.c()).booleanValue();
            rVar.X(90393475);
            if (booleanValue2) {
                j13 = j2;
            } else {
                j13 = j11;
            }
            rVar.p(false);
            i3.s sVar = new i3.s(j13);
            boolean booleanValue3 = ((Boolean) f1Var.getValue()).booleanValue();
            rVar.X(90393475);
            if (booleanValue3) {
                j14 = j2;
            } else {
                j14 = j11;
            }
            rVar.p(false);
            i3.s sVar2 = new i3.s(j14);
            d1.l1 f12 = f8.f();
            rVar.X(297582231);
            if (f12.b(Boolean.FALSE, Boolean.TRUE)) {
                i11 = i16;
                r5 = new d1.v1(150, 100, d1.w.f3689c);
                z12 = false;
            } else {
                i11 = i16;
                z12 = false;
                r5 = d1.d.r(100, 0, d1.w.f3689c, 2);
            }
            rVar.p(z12);
            d1.n1 d4 = d1.u1.d(f8, sVar, sVar2, r5, w1Var2, rVar, 0);
            n2.s.b(new n2.o1[]{q0.f5361a.a(new i3.s(i3.s.b(((i3.s) d4.f3614d0.getValue()).f6689a, 1.0f))), o0.f5308a.a(Float.valueOf(i3.s.d(((i3.s) d4.f3614d0.getValue()).f6689a)))}, cVar, rVar, (i11 & 112) | 8);
        } else {
            rVar.R();
        }
        n2.p1 r10 = rVar.r();
        if (r10 != null) {
            final long j15 = j11;
            r10.f9983d = new mc.p() { // from class: g2.u5
                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    x5.d(j2, j15, z10, cVar, (n2.m) obj, n2.s.F(i2 | 1));
                    return yb.y.f14813a;
                }
            };
        }
    }
}
