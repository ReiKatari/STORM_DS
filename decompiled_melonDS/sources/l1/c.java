package l1;

import a4.r2;
import androidx.preference.Preference;
import g2.l5;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final s f8505a = new s(1);

    /* renamed from: b  reason: collision with root package name */
    public static final s f8506b = new s(2);

    /* renamed from: c  reason: collision with root package name */
    public static final h0 f8507c = new h0(0, 0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f8508d = 9;

    /* renamed from: e  reason: collision with root package name */
    public static final int f8509e = 6;

    /* renamed from: f  reason: collision with root package name */
    public static final int f8510f = 10;

    /* renamed from: g  reason: collision with root package name */
    public static final int f8511g = 5;

    /* renamed from: h  reason: collision with root package name */
    public static final int f8512h = 15;

    public static final void A(StringBuilder sb2, String str) {
        if (sb2.length() > 0) {
            sb2.append('+');
        }
        sb2.append(str);
    }

    public static final b3.p B(b3.p pVar, t0 t0Var) {
        return pVar.f(new u0(t0Var));
    }

    public static final b3.p C(b3.p pVar, b2 b2Var) {
        return pVar.f(new n0(b2Var));
    }

    public static final b3.p D(b3.p pVar, mc.l lVar) {
        return pVar.f(new t1(lVar));
    }

    public static final void a(b3.p pVar, b3.d dVar, v2.c cVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        b3.h hVar;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(380139498);
        if (rVar.f(pVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i2 | 432;
        if ((i11 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i11 & 1, z10)) {
            b3.h hVar2 = b3.c.A;
            y3.v0 d4 = p.d(hVar2, false);
            boolean f8 = rVar.f(d4);
            Object L = rVar.L();
            if (f8 || L == n2.l.f9953a) {
                L = new ai.r0(14, d4, cVar);
                rVar.h0(L);
            }
            y3.c0.b(pVar, (mc.p) L, rVar, i11 & 14, 0);
            hVar = hVar2;
        } else {
            rVar.R();
            hVar = dVar;
        }
        b3.d dVar2 = hVar;
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new ai.m0(pVar, dVar2, cVar, i2, 7);
        }
    }

    public static h1 b(int i2, float f8) {
        float f10 = mh.x.f9706c;
        if ((i2 & 1) != 0) {
            f8 = 0;
        }
        if ((i2 & 2) != 0) {
            f10 = 0;
        }
        return new h1(f8, f10, f8, f10);
    }

    public static h1 c(float f8, float f10, float f11, int i2) {
        float f12 = g2.a0.f5037b;
        if ((i2 & 2) != 0) {
            f10 = 0;
        }
        if ((i2 & 4) != 0) {
            f12 = 0;
        }
        if ((i2 & 8) != 0) {
            f11 = 0;
        }
        return new h1(f8, f10, f12, f11);
    }

    public static final void d(b3.p pVar, n2.m mVar) {
        o oVar = o.f8590c;
        n2.r rVar = (n2.r) mVar;
        int hashCode = Long.hashCode(rVar.T);
        b3.p c4 = b3.a.c(pVar, mVar);
        v2.g l10 = rVar.l();
        a4.h.f220a.getClass();
        a4.f0 f0Var = a4.g.f212b;
        r2 r2Var = rVar.f9994a;
        rVar.b0();
        if (rVar.S) {
            rVar.k(f0Var);
        } else {
            rVar.k0();
        }
        n2.s.C(oVar, a4.g.f215e, mVar);
        n2.s.C(l10, a4.g.f214d, mVar);
        n2.s.y(mVar, a4.g.f217g);
        n2.s.C(c4, a4.g.f213c, mVar);
        n2.s.u(mVar, Integer.valueOf(hashCode), a4.g.f216f);
        rVar.p(true);
    }

    public static h0 e(int i2) {
        int i10;
        if ((i2 & 2) != 0) {
            i10 = 0;
        } else {
            i10 = Integer.MAX_VALUE;
        }
        return new h0(i10, Preference.DEFAULT_ORDER);
    }

    public static g0 f(float f8) {
        return new g0(f8, 0, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, b3.p] */
    public static b3.p h(b3.p pVar) {
        return pVar.f(new Object());
    }

    public static final float i(d1 d1Var, x4.m mVar) {
        if (mVar == x4.m.Ltr) {
            return d1Var.d(mVar);
        }
        return d1Var.c(mVar);
    }

    public static final float j(d1 d1Var, x4.m mVar) {
        if (mVar == x4.m.Ltr) {
            return d1Var.c(mVar);
        }
        return d1Var.d(mVar);
    }

    public static final b3.p k(b3.p pVar, d1 d1Var) {
        return pVar.f(new e1(d1Var));
    }

    public static final l1 l(y3.u0 u0Var) {
        Object n10 = u0Var.n();
        if (n10 instanceof l1) {
            return (l1) n10;
        }
        return null;
    }

    public static final float m(l1 l1Var) {
        if (l1Var != null) {
            return l1Var.f8583a;
        }
        return 0.0f;
    }

    public static final b3.p n(b3.p pVar, t0 t0Var) {
        return pVar.f(new r0(t0Var));
    }

    public static final boolean o(long j2, int i2, int i10) {
        int j10 = x4.a.j(j2);
        if (i2 <= x4.a.h(j2) && j10 <= i2) {
            int i11 = x4.a.i(j2);
            if (i10 <= x4.a.g(j2) && i11 <= i10) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static y3.w0 p(k1 k1Var, int i2, int i10, int i11, int i12, int i13, y3.x0 x0Var, List list, y3.i1[] i1VarArr, int i14) {
        int i15;
        int i16;
        int i17;
        float f8;
        boolean z10;
        int i18;
        long j2;
        int i19;
        int i20;
        int i21;
        List list2 = list;
        long j10 = i13;
        int[] iArr = new int[i14];
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        float f10 = 0.0f;
        while (i23 < i14) {
            y3.u0 u0Var = (y3.u0) list2.get(i23);
            float m = m(l(u0Var));
            if (m > 0.0f) {
                f10 += m;
                i24++;
                j2 = j10;
                i19 = i23;
            } else {
                int i27 = i11 - i25;
                y3.i1 i1Var = i1VarArr[i23];
                j2 = j10;
                if (i1Var == null) {
                    if (i11 == Integer.MAX_VALUE) {
                        i19 = i23;
                        i20 = i24;
                        i21 = Preference.DEFAULT_ORDER;
                    } else {
                        i19 = i23;
                        i20 = i24;
                        if (i27 < 0) {
                            i21 = 0;
                        } else {
                            i21 = i27;
                        }
                    }
                    i1Var = u0Var.e(k1Var.e(0, i21, i12, false));
                } else {
                    i19 = i23;
                    i20 = i24;
                }
                y3.i1 i1Var2 = i1Var;
                int b10 = k1Var.b(i1Var2);
                int h2 = k1Var.h(i1Var2);
                iArr[i19] = b10;
                int i28 = i27 - b10;
                if (i28 < 0) {
                    i28 = 0;
                }
                i26 = Math.min(i13, i28);
                i25 += b10 + i26;
                i22 = Math.max(i22, h2);
                i1VarArr[i19] = i1Var2;
                i24 = i20;
            }
            i23 = i19 + 1;
            j10 = j2;
        }
        long j11 = j10;
        if (i24 == 0) {
            i25 -= i26;
            i17 = 0;
        } else {
            if (i11 != Integer.MAX_VALUE) {
                i16 = i11;
            } else {
                i16 = i2;
            }
            long j12 = (i15 - 1) * j11;
            long j13 = (i16 - i25) - j12;
            if (j13 < 0) {
                j13 = 0;
            }
            float f11 = ((float) j13) / f10;
            for (int i29 = 0; i29 < i14; i29++) {
                j13 -= Math.round(m(l((y3.u0) list2.get(i29))) * f11);
            }
            int i30 = i22;
            int i31 = 0;
            int i32 = 0;
            while (i31 < i14) {
                if (i1VarArr[i31] == null) {
                    y3.u0 u0Var2 = (y3.u0) list2.get(i31);
                    l1 l10 = l(u0Var2);
                    float m10 = m(l10);
                    if (m10 <= 0.0f) {
                        m1.a.b("All weights <= 0 should have placeables");
                    }
                    f8 = f11;
                    int signum = Long.signum(j13);
                    j13 -= signum;
                    int max = Math.max(0, Math.round(m10 * f8) + signum);
                    if (l10 != null) {
                        z10 = l10.f8584b;
                    } else {
                        z10 = true;
                    }
                    if (z10 && max != Integer.MAX_VALUE) {
                        i18 = max;
                        y3.i1 e6 = u0Var2.e(k1Var.e(i18, max, i12, true));
                        int b11 = k1Var.b(e6);
                        int h10 = k1Var.h(e6);
                        iArr[i31] = b11;
                        i32 += b11;
                        int max2 = Math.max(i30, h10);
                        i1VarArr[i31] = e6;
                        i30 = max2;
                    }
                    i18 = 0;
                    y3.i1 e62 = u0Var2.e(k1Var.e(i18, max, i12, true));
                    int b112 = k1Var.b(e62);
                    int h102 = k1Var.h(e62);
                    iArr[i31] = b112;
                    i32 += b112;
                    int max22 = Math.max(i30, h102);
                    i1VarArr[i31] = e62;
                    i30 = max22;
                } else {
                    f8 = f11;
                }
                i31++;
                list2 = list;
                f11 = f8;
            }
            i17 = (int) (i32 + j12);
            int i33 = i11 - i25;
            if (i17 < 0) {
                i17 = 0;
            }
            if (i17 > i33) {
                i17 = i33;
            }
            i22 = i30;
        }
        int i34 = i17 + i25;
        if (i34 < 0) {
            i34 = 0;
        }
        int max3 = Math.max(i34, i2);
        int max4 = Math.max(i22, Math.max(i10, 0));
        int[] iArr2 = new int[i14];
        k1Var.i(max3, x0Var, iArr, iArr2);
        return k1Var.f(i1VarArr, x0Var, iArr2, max3, max4);
    }

    public static final b3.p q(b3.p pVar, mc.l lVar) {
        return pVar.f(new z0(lVar));
    }

    public static final b3.p r(b3.p pVar, mc.l lVar) {
        return pVar.f(new y(lVar));
    }

    public static final b3.p s(b3.p pVar, d1 d1Var) {
        return pVar.f(new g1(d1Var));
    }

    public static final b3.p t(b3.p pVar, float f8) {
        return pVar.f(new b1(f8, f8, f8, f8));
    }

    public static final b3.p u(b3.p pVar, float f8, float f10) {
        return pVar.f(new b1(f8, f10, f8, f10));
    }

    public static b3.p v(b3.p pVar, float f8, float f10, int i2) {
        if ((i2 & 1) != 0) {
            f8 = 0;
        }
        if ((i2 & 2) != 0) {
            f10 = 0;
        }
        return u(pVar, f8, f10);
    }

    public static final b3.p w(b3.p pVar, float f8, float f10, float f11, float f12) {
        return pVar.f(new b1(f8, f10, f11, f12));
    }

    public static b3.p x(b3.p pVar, float f8, float f10, float f11, float f12, int i2) {
        if ((i2 & 1) != 0) {
            f8 = 0;
        }
        if ((i2 & 2) != 0) {
            f10 = 0;
        }
        if ((i2 & 4) != 0) {
            f11 = 0;
        }
        if ((i2 & 8) != 0) {
            f12 = 0;
        }
        return w(pVar, f8, f10, f11, f12);
    }

    public static final b3.p y(b3.p pVar) {
        return D(pVar, new l5(27));
    }

    public static final q0 z(q5.b bVar) {
        return new q0(bVar.f12283a, bVar.f12284b, bVar.f12285c, bVar.f12286d);
    }

    public abstract int g(int i2, x4.m mVar, y3.i1 i1Var);
}
