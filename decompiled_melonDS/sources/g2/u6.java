package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class u6 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f5424a = 2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v6, types: [int, boolean] */
    public static final void a(final b3.p pVar, mc.p pVar2, mc.p pVar3, final mc.q qVar, final mc.p pVar4, final mc.p pVar5, final boolean z10, final float f8, l1.d1 d1Var, n2.m mVar, final int i2) {
        int i10;
        boolean z11;
        mc.p pVar6;
        boolean z12;
        boolean z13;
        boolean z14;
        b3.h hVar;
        x4.m mVar2;
        boolean z15;
        ?? r72;
        boolean z16;
        b3.h hVar2;
        boolean z17;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        final mc.p pVar7 = pVar2;
        final l1.d1 d1Var2 = d1Var;
        b3.h hVar3 = b3.c.A;
        b3.h hVar4 = b3.c.X;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-1595074580);
        if ((i2 & 6) == 0) {
            if (rVar.f(pVar)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i10 = i19 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.h(pVar7)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i10 |= i18;
        }
        if ((i2 & 384) == 0) {
            if (rVar.h(pVar3)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i10 |= i17;
        }
        if ((i2 & 3072) == 0) {
            if (rVar.h(qVar)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i10 |= i16;
        }
        if ((i2 & 24576) == 0) {
            if (rVar.h(pVar4)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i10 |= i15;
        }
        if ((196608 & i2) == 0) {
            if (rVar.h(pVar5)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i10 |= i14;
        }
        if ((1572864 & i2) == 0) {
            if (rVar.g(z10)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i10 |= i13;
        }
        if ((12582912 & i2) == 0) {
            if (rVar.c(f8)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i10 |= i12;
        }
        if ((100663296 & i2) == 0) {
            if (rVar.f(d1Var2)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i10 |= i11;
        }
        if ((38347923 & i10) != 38347922) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVar.O(i10 & 1, z11)) {
            if ((3670016 & i10) == 1048576) {
                z12 = true;
            } else {
                z12 = false;
            }
            if ((29360128 & i10) == 8388608) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z18 = z13 | z12;
            if ((234881024 & i10) == 67108864) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z19 = z18 | z14;
            Object L = rVar.L();
            if (z19 || L == n2.l.f9953a) {
                L = new x6(z10, f8, d1Var2);
                rVar.h0(L);
            }
            x6 x6Var = (x6) L;
            x4.m mVar3 = (x4.m) rVar.j(b4.q1.f1924n);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c4 = b3.a.c(pVar, rVar);
            a4.h.f220a.getClass();
            a4.f0 f0Var = a4.g.f212b;
            rVar.b0();
            int i20 = i10;
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            a4.f fVar = a4.g.f215e;
            n2.s.C(x6Var, fVar, rVar);
            a4.f fVar2 = a4.g.f214d;
            n2.s.C(l10, fVar2, rVar);
            a4.f fVar3 = a4.g.f216f;
            if (rVar.S || !nc.k.a(rVar.L(), Integer.valueOf(hashCode))) {
                w.d.w(hashCode, rVar, hashCode, fVar3);
            }
            a4.f fVar4 = a4.g.f213c;
            n2.s.C(c4, fVar4, rVar);
            j2 j2Var = j2.f5197a;
            if (pVar4 != null) {
                rVar.X(-1444611617);
                b3.p m = y3.c0.m("Leading");
                n2.t2 t2Var = d2.f5111a;
                b3.p f10 = m.f(j2Var);
                hVar = hVar3;
                y3.v0 d4 = l1.p.d(hVar4, false);
                int hashCode2 = Long.hashCode(rVar.T);
                v2.g l11 = rVar.l();
                b3.p c10 = b3.a.c(f10, rVar);
                rVar.b0();
                mVar2 = mVar3;
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
                pVar4.j(rVar, Integer.valueOf((i20 >> 12) & 14));
                rVar.p(true);
                z15 = false;
            } else {
                hVar = hVar3;
                mVar2 = mVar3;
                z15 = false;
                rVar.X(-1476701825);
            }
            rVar.p(z15);
            if (pVar5 != null) {
                rVar.X(-1444322883);
                b3.p m10 = y3.c0.m("Trailing");
                n2.t2 t2Var2 = d2.f5111a;
                b3.p f11 = m10.f(j2Var);
                y3.v0 d10 = l1.p.d(hVar4, z15);
                int hashCode3 = Long.hashCode(rVar.T);
                v2.g l12 = rVar.l();
                b3.p c11 = b3.a.c(f11, rVar);
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
                pVar5.j(rVar, Integer.valueOf((i20 >> 15) & 14));
                rVar.p(true);
                r72 = 0;
            } else {
                rVar.X(-1476701825);
                r72 = z15;
            }
            rVar.p(r72);
            d1Var2 = d1Var;
            x4.m mVar4 = mVar2;
            float j2 = l1.c.j(d1Var2, mVar4);
            float i21 = l1.c.i(d1Var2, mVar4);
            if (pVar4 != null) {
                j2 -= s6.f5398b;
                float f12 = (float) r72;
                if (j2 < f12) {
                    j2 = f12;
                }
            }
            float f13 = j2;
            if (pVar5 != null) {
                i21 -= s6.f5398b;
                float f14 = (float) r72;
                if (i21 < f14) {
                    i21 = f14;
                }
            }
            b3.p x9 = l1.c.x(b3.m.f1770a, f13, 0.0f, i21, 0.0f, 10);
            if (qVar != null) {
                rVar.X(-1443222972);
                qVar.i(y3.c0.m("Hint").f(x9), rVar, Integer.valueOf((i20 >> 6) & 112));
                z16 = false;
            } else {
                z16 = false;
                rVar.X(-1476701825);
            }
            rVar.p(z16);
            if (pVar3 != null) {
                rVar.X(-1443101018);
                b3.p f15 = y3.c0.m("Label").f(x9);
                hVar2 = hVar;
                y3.v0 d11 = l1.p.d(hVar2, z16);
                int hashCode4 = Long.hashCode(rVar.T);
                v2.g l13 = rVar.l();
                b3.p c12 = b3.a.c(f15, rVar);
                rVar.b0();
                if (rVar.S) {
                    rVar.k(f0Var);
                } else {
                    rVar.k0();
                }
                n2.s.C(d11, fVar, rVar);
                n2.s.C(l13, fVar2, rVar);
                if (rVar.S || !nc.k.a(rVar.L(), Integer.valueOf(hashCode4))) {
                    w.d.w(hashCode4, rVar, hashCode4, fVar3);
                }
                n2.s.C(c12, fVar4, rVar);
                pVar6 = pVar3;
                pVar6.j(rVar, Integer.valueOf((i20 >> 6) & 14));
                z17 = true;
                rVar.p(true);
                z16 = false;
            } else {
                pVar6 = pVar3;
                hVar2 = hVar;
                z17 = true;
                rVar.X(-1476701825);
            }
            rVar.p(z16);
            b3.p f16 = y3.c0.m("TextField").f(x9);
            y3.v0 d12 = l1.p.d(hVar2, z17);
            int hashCode5 = Long.hashCode(rVar.T);
            v2.g l14 = rVar.l();
            b3.p c13 = b3.a.c(f16, rVar);
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            n2.s.C(d12, fVar, rVar);
            n2.s.C(l14, fVar2, rVar);
            if (rVar.S || !nc.k.a(rVar.L(), Integer.valueOf(hashCode5))) {
                w.d.w(hashCode5, rVar, hashCode5, fVar3);
            }
            n2.s.C(c13, fVar4, rVar);
            pVar7 = pVar2;
            pVar7.j(rVar, Integer.valueOf((i20 >> 3) & 14));
            rVar.p(true);
            rVar.p(true);
        } else {
            pVar6 = pVar3;
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            final mc.p pVar8 = pVar6;
            r5.f9983d = new mc.p() { // from class: g2.t6
                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    u6.a(b3.p.this, pVar7, pVar8, qVar, pVar4, pVar5, z10, f8, d1Var2, (n2.m) obj, n2.s.F(i2 | 1));
                    return yb.y.f14813a;
                }
            };
        }
    }

    public static final int b(int i2, boolean z10, int i10, int i11, int i12, int i13, long j2, float f8, l1.d1 d1Var) {
        float f10;
        float f11 = f5424a * f8;
        float b10 = d1Var.b() * f8;
        float a10 = d1Var.a() * f8;
        int max = Math.max(i2, i13);
        if (z10) {
            f10 = i10 + f11 + max + a10;
        } else {
            f10 = b10 + max + a10;
        }
        return x4.b.f(Math.max(pc.a.M(f10), Math.max(i11, i12)), j2);
    }
}
