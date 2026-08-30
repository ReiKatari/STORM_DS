package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class e5 {

    /* renamed from: c  reason: collision with root package name */
    public static final float f5126c;

    /* renamed from: e  reason: collision with root package name */
    public static final float f5128e;

    /* renamed from: a  reason: collision with root package name */
    public static final float f5124a = 30;

    /* renamed from: b  reason: collision with root package name */
    public static final float f5125b = 16;

    /* renamed from: d  reason: collision with root package name */
    public static final float f5127d = 6;

    /* renamed from: f  reason: collision with root package name */
    public static final float f5129f = 48;

    /* renamed from: g  reason: collision with root package name */
    public static final float f5130g = 68;

    static {
        float f8 = 8;
        f5126c = f8;
        f5128e = f8;
    }

    public static final void a(v2.c cVar, mc.p pVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        boolean z10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(1302703572);
        if (rVar.h(cVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i2;
        if (rVar.h(pVar)) {
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
        if (rVar.O(i13 & 1, z10)) {
            b3.p x9 = l1.c.x(b3.m.f1770a, f5125b, 0.0f, f5126c, 0.0f, 10);
            Object L = rVar.L();
            if (L == n2.l.f9953a) {
                L = new d5(1);
                rVar.h0(L);
            }
            y3.v0 v0Var = (y3.v0) L;
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c4 = b3.a.c(x9, rVar);
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
            b3.p v10 = l1.c.v(y3.c0.m("text"), 0.0f, f5127d, 1);
            b3.h hVar = b3.c.A;
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
            cVar.j(rVar, Integer.valueOf(i13 & 14));
            rVar.p(true);
            b3.p m = y3.c0.m("action");
            y3.v0 d10 = l1.p.d(hVar, false);
            int hashCode3 = Long.hashCode(rVar.T);
            v2.g l12 = rVar.l();
            b3.p c11 = b3.a.c(m, rVar);
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            n2.s.C(d10, fVar, rVar);
            n2.s.C(l12, fVar2, rVar);
            if (rVar.S || !nc.k.a(rVar.L(), Integer.valueOf(hashCode3))) {
                w.d.w(hashCode3, rVar, hashCode3, fVar3);
            }
            n2.s.C(c11, fVar4, rVar);
            pVar.j(rVar, Integer.valueOf((i13 >> 3) & 14));
            rVar.p(true);
            rVar.p(true);
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new z4(cVar, pVar, i2);
        }
    }

    public static final void b(b3.p pVar, mc.p pVar2, i3.n0 n0Var, long j2, long j10, float f8, v2.c cVar, n2.m mVar, int i2) {
        int i10;
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
        rVar2.Z(-662779944);
        if ((i2 & 6) == 0) {
            if (rVar2.f(pVar)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i10 = i18 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar2.h(pVar2)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i10 |= i17;
        }
        boolean z10 = false;
        if ((i2 & 384) == 0) {
            if (rVar2.g(false)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i10 |= i16;
        }
        if ((i2 & 3072) == 0) {
            if (rVar2.f(n0Var)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i10 |= i15;
        }
        if ((i2 & 24576) == 0) {
            if (rVar2.e(j2)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i10 |= i14;
        }
        if ((196608 & i2) == 0) {
            if (rVar2.e(j10)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i10 |= i13;
        }
        if ((i2 & 1572864) == 0) {
            if (rVar2.c(f8)) {
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
            z10 = true;
        }
        if (rVar2.O(i10 & 1, z10)) {
            rVar2.T();
            if ((i2 & 1) != 0 && !rVar2.y()) {
                rVar2.R();
            }
            rVar2.q();
            int i19 = i10 >> 6;
            rVar = rVar2;
            n0.h(pVar, n0Var, j2, j10, f8, v2.h.c(-1429068516, new z4(pVar2, cVar, 3), rVar2), rVar, 1572864 | (i10 & 14) | (i19 & 112) | (i19 & 896) | (i19 & 7168) | ((i10 >> 3) & 458752), 16);
        } else {
            rVar = rVar2;
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new x(pVar, pVar2, n0Var, j2, j10, f8, cVar, i2);
        }
    }

    public static final void c(final w4 w4Var, b3.p pVar, i3.n0 n0Var, long j2, long j10, long j11, float f8, n2.m mVar, final int i2) {
        int i10;
        boolean z10;
        n2.r rVar;
        final b3.p pVar2;
        final i3.n0 n0Var2;
        final long j12;
        final long j13;
        final long j14;
        final float f10;
        int i11;
        int i12;
        long h2;
        int i13;
        b3.p pVar3;
        t1.d dVar;
        float f11;
        long j15;
        long j16;
        v2.c cVar;
        boolean h10;
        int i14;
        n2.r rVar2 = (n2.r) mVar;
        rVar2.Z(258660814);
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                h10 = rVar2.f(w4Var);
            } else {
                h10 = rVar2.h(w4Var);
            }
            if (h10) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i2;
        } else {
            i10 = i2;
        }
        int i15 = i10 | 432;
        if ((i2 & 3072) == 0) {
            i15 = i10 | 1456;
        }
        if ((i2 & 24576) == 0) {
            i15 |= 8192;
        }
        if ((196608 & i2) == 0) {
            i15 |= 65536;
        }
        if ((1572864 & i2) == 0) {
            i15 |= 524288;
        }
        int i16 = i15 | 12582912;
        if ((4793491 & i16) != 4793490) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar2.O(i16 & 1, z10)) {
            rVar2.T();
            if ((i2 & 1) != 0 && !rVar2.y()) {
                rVar2.R();
                pVar3 = pVar;
                dVar = n0Var;
                j15 = j2;
                j16 = j10;
                f11 = f8;
                i11 = 12582912;
                i13 = i16 & (-4193281);
                h2 = j11;
            } else {
                t1.d dVar2 = ((u3) rVar2.j(w3.f5448a)).f5420a;
                n2.t2 t2Var = m0.f5257a;
                long j17 = i3.z.j(i3.s.b(((l0) rVar2.j(t2Var)).f(), 0.8f), ((l0) rVar2.j(t2Var)).j());
                long j18 = ((l0) rVar2.j(t2Var)).j();
                l0 l0Var = (l0) rVar2.j(t2Var);
                if (l0Var.k()) {
                    i11 = 12582912;
                    i12 = i16;
                    h2 = i3.z.j(i3.s.b(l0Var.j(), 0.6f), l0Var.g());
                } else {
                    i11 = 12582912;
                    i12 = i16;
                    h2 = l0Var.h();
                }
                i13 = (-4193281) & i12;
                pVar3 = b3.m.f1770a;
                dVar = dVar2;
                f11 = 6;
                j15 = j17;
                j16 = j18;
            }
            rVar2.q();
            String str = w4Var.f5450b;
            if (str != null) {
                rVar2.X(593497188);
                cVar = v2.h.c(1843479216, new ai.c(h2, w4Var, str), rVar2);
                rVar2.p(false);
            } else {
                rVar2.X(593796152);
                rVar2.p(false);
                cVar = null;
            }
            rVar = rVar2;
            b(l1.c.t(pVar3, 12), cVar, dVar, j15, j16, f11, v2.h.c(-261845785, new s4(w4Var, 1), rVar2), rVar, (i13 & 896) | i11 | ((i13 >> 3) & 3670016));
            j14 = h2;
            pVar2 = pVar3;
            n0Var2 = dVar;
            j12 = j15;
            j13 = j16;
            f10 = f11;
        } else {
            rVar = rVar2;
            rVar.R();
            pVar2 = pVar;
            n0Var2 = n0Var;
            j12 = j2;
            j13 = j10;
            j14 = j11;
            f10 = f8;
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p() { // from class: g2.b5
                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    e5.c(w4.this, pVar2, n0Var2, j12, j13, j14, f10, (n2.m) obj, n2.s.F(i2 | 1));
                    return yb.y.f14813a;
                }
            };
        }
    }

    public static final void d(v2.c cVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(343813818);
        if (rVar.h(cVar)) {
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
            Object L = rVar.L();
            if (L == n2.l.f9953a) {
                L = d5.f5114b;
                rVar.h0(L);
            }
            y3.v0 v0Var = (y3.v0) L;
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.m mVar2 = b3.m.f1770a;
            b3.p c4 = b3.a.c(mVar2, rVar);
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
            b3.p u4 = l1.c.u(mVar2, f5125b, f5127d);
            y3.v0 d4 = l1.p.d(b3.c.A, false);
            int hashCode2 = Long.hashCode(rVar.T);
            v2.g l11 = rVar.l();
            b3.p c10 = b3.a.c(u4, rVar);
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
            cVar.j(rVar, Integer.valueOf(i11 & 14));
            rVar.p(true);
            rVar.p(true);
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new y(cVar, i2, 5);
        }
    }
}
