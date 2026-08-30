package y3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a1 f14667a = new a1(4);

    /* renamed from: b  reason: collision with root package name */
    public static final Object f14668b = new Object();

    public static final void a(v2.c cVar, n2.m mVar, int i2) {
        boolean z10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(441837433);
        if ((i2 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i2 & 1, z10)) {
            Object L = rVar.L();
            Object obj = n2.l.f9953a;
            if (L == obj) {
                L = new Object();
                rVar.h0(L);
            }
            Object obj2 = (t0) L;
            Object L2 = rVar.L();
            if (L2 == obj) {
                L2 = j.R;
                rVar.h0(L2);
            }
            mc.a aVar = (mc.a) L2;
            rVar.b0();
            if (rVar.S) {
                rVar.k(aVar);
            } else {
                rVar.k0();
            }
            if (rVar.S) {
                rVar.b(yb.y.f14813a, new mg.m(4, (byte) 0));
            }
            n2.s.C(obj2, l.R, rVar);
            cVar.i(obj2, rVar, 48);
            rVar.p(true);
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new a5.f(i2, 6, cVar);
        }
    }

    public static final void b(b3.p pVar, mc.p pVar2, n2.m mVar, int i2, int i10) {
        int i11;
        int i12;
        int i13;
        boolean z10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-1298353104);
        int i14 = i10 & 1;
        if (i14 != 0) {
            i11 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (rVar.f(pVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i2;
        } else {
            i11 = i2;
        }
        if (rVar.h(pVar2)) {
            i13 = 32;
        } else {
            i13 = 16;
        }
        int i15 = i11 | i13;
        if ((i15 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i15 & 1, z10)) {
            if (i14 != 0) {
                pVar = b3.m.f1770a;
            }
            Object L = rVar.L();
            if (L == n2.l.f9953a) {
                L = new q1(a1.B);
                rVar.h0(L);
            }
            c((q1) L, pVar, pVar2, rVar, (i15 << 3) & 1008);
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new n1(pVar, pVar2, i2, i10);
        }
    }

    public static final void c(q1 q1Var, b3.p pVar, mc.p pVar2, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-511989831);
        if ((i2 & 6) == 0) {
            if (rVar.h(q1Var)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.f(pVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i2 & 384) == 0) {
            if (rVar.h(pVar2)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i10 |= i11;
        }
        if ((i10 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i10 & 1, z10)) {
            int hashCode = Long.hashCode(rVar.T);
            n2.p z11 = n2.s.z(rVar);
            b3.p c4 = b3.a.c(pVar, rVar);
            v2.g l10 = rVar.l();
            rVar.b0();
            if (rVar.S) {
                rVar.k(a4.f0.B);
            } else {
                rVar.k0();
            }
            n2.s.C(q1Var, q1Var.f14731c, rVar);
            n2.s.C(z11, q1Var.f14732d, rVar);
            n2.s.C(pVar2, q1Var.f14733e, rVar);
            a4.h.f220a.getClass();
            n2.s.C(l10, a4.g.f214d, rVar);
            n2.s.y(rVar, a4.g.f217g);
            n2.s.C(c4, a4.g.f213c, rVar);
            n2.s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
            rVar.p(true);
            if (!rVar.A()) {
                rVar.X(-1259244916);
                boolean h2 = rVar.h(q1Var);
                Object L = rVar.L();
                if (h2 || L == n2.l.f9953a) {
                    L = new a4.m0(18, q1Var);
                    rVar.h0(L);
                }
                n2.s.h((mc.a) L, rVar);
            } else {
                rVar.X(-1266202711);
            }
            rVar.p(false);
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new a5.d(q1Var, pVar, pVar2, i2, 1);
        }
    }

    public static final float d(long j2, long j10) {
        return Math.min(Float.intBitsToFloat((int) (j10 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final float e(h1 h1Var, boolean z10, s[] sVarArr, float f8) {
        boolean z11;
        float f10 = Float.NaN;
        for (s sVar : sVarArr) {
            float d4 = h1Var.d(sVar);
            if (!Float.isNaN(f10)) {
                if (d4 > f10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 != z11) {
                }
            }
            f10 = d4;
        }
        if (Float.isNaN(f10)) {
            return f8;
        }
        return f10;
    }

    public static final h3.c f(z zVar) {
        z o5 = zVar.o();
        if (o5 != null) {
            return o5.k(zVar, true);
        }
        return new h3.c(0.0f, 0.0f, (int) (zVar.Z() >> 32), (int) (zVar.Z() & 4294967295L));
    }

    public static final h3.c g(z zVar, boolean z10) {
        z i2 = i(zVar);
        float Z = (int) (i2.Z() >> 32);
        float Z2 = (int) (i2.Z() & 4294967295L);
        h3.c k10 = i2.k(zVar, z10);
        float f8 = k10.f6052a;
        float f10 = 0.0f;
        if (z10) {
            if (f8 < 0.0f) {
                f8 = 0.0f;
            }
            if (f8 > Z) {
                f8 = Z;
            }
        }
        float f11 = k10.f6053b;
        if (z10) {
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            if (f11 > Z2) {
                f11 = Z2;
            }
        }
        float f12 = k10.f6054c;
        if (z10) {
            if (f12 < 0.0f) {
                f12 = 0.0f;
            }
            if (f12 <= Z) {
                Z = f12;
            }
            f12 = Z;
        }
        float f13 = k10.f6055d;
        if (z10) {
            if (f13 >= 0.0f) {
                f10 = f13;
            }
            if (f10 <= Z2) {
                Z2 = f10;
            }
            f13 = Z2;
        }
        if (f8 == f12 || f11 == f13) {
            return h3.c.f6051e;
        }
        long l10 = i2.l((Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
        long l11 = i2.l((Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
        long l12 = i2.l((Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L));
        long l13 = i2.l((Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (l10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (l11 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (l13 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (l12 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (l10 & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (l11 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (l13 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (l12 & 4294967295L));
        return new h3.c(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static final boolean h(long j2, long j10) {
        if (j2 == j10) {
            return true;
        }
        return false;
    }

    public static final z i(z zVar) {
        z zVar2;
        a4.r1 r1Var;
        z o5 = zVar.o();
        while (true) {
            z zVar3 = o5;
            zVar2 = zVar;
            zVar = zVar3;
            if (zVar == null) {
                break;
            }
            o5 = zVar.o();
        }
        if (zVar2 instanceof a4.r1) {
            r1Var = (a4.r1) zVar2;
        } else {
            r1Var = null;
        }
        if (r1Var == null) {
            return zVar2;
        }
        a4.r1 r1Var2 = r1Var.f319m0;
        while (true) {
            a4.r1 r1Var3 = r1Var2;
            a4.r1 r1Var4 = r1Var;
            r1Var = r1Var3;
            if (r1Var != null) {
                r1Var2 = r1Var.f319m0;
            } else {
                return r1Var4;
            }
        }
    }

    public static final Object j(u0 u0Var) {
        d0 d0Var;
        Object n10 = u0Var.n();
        if (n10 instanceof d0) {
            d0Var = (d0) n10;
        } else {
            d0Var = null;
        }
        if (d0Var == null) {
            return null;
        }
        return d0Var.f14670i0;
    }

    public static final a4.y0 k(a4.y0 y0Var) {
        a4.o0 o0Var;
        a4.o0 o0Var2 = y0Var.f371i0.f315i0;
        while (true) {
            a4.o0 u4 = o0Var2.u();
            a4.o0 o0Var3 = null;
            if (u4 != null) {
                o0Var = u4.f280d0;
            } else {
                o0Var = null;
            }
            if (o0Var != null) {
                a4.o0 u10 = o0Var2.u();
                if (u10 != null) {
                    o0Var3 = u10.f280d0;
                }
                o0Var3.getClass();
                if (o0Var3.f279c0) {
                    o0Var2 = o0Var2.u();
                    o0Var2.getClass();
                } else {
                    a4.o0 u11 = o0Var2.u();
                    u11.getClass();
                    o0Var2 = u11.f280d0;
                    o0Var2.getClass();
                }
            } else {
                a4.y0 V0 = o0Var2.A0.f266d.V0();
                V0.getClass();
                return V0;
            }
        }
    }

    public static final b3.p l(b3.p pVar, mc.q qVar) {
        return pVar.f(new a0(qVar));
    }

    public static final b3.p m(String str) {
        return new b0(str);
    }

    public static final b3.p n(b3.p pVar, mc.l lVar) {
        return pVar.f(new b1(lVar));
    }

    public static final b3.p o(b3.p pVar, mc.l lVar) {
        return pVar.f(new d1(lVar));
    }

    public static final long p(long j2, long j10) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) * Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32)) * intBitsToFloat) << 32);
    }
}
