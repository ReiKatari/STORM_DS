package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q01  reason: default package */
/* loaded from: classes.dex */
public final class q01 extends yy3 implements gk1, mf3 {
    public tv j0;
    public ub k0;
    public s01 l0;
    public float m0;

    @Override // defpackage.yy3
    public final boolean G0() {
        return false;
    }

    @Override // defpackage.mf3
    public final int H(fs3 fs3Var, mv3 mv3Var, int i) {
        if (this.j0.h() != 9205357640488583168L) {
            int g0 = mv3Var.g0(lz0.h(S0(nz0.b(0, i, 0, 0, 13))));
            return Math.max(jv3.X(i76.c(R0(mj2.d(i, g0)))), g0);
        }
        return mv3Var.g0(i);
    }

    public final long R0(long j) {
        if (i76.f(j)) {
            return 0L;
        }
        long h = this.j0.h();
        if (h != 9205357640488583168L) {
            float e = i76.e(h);
            if (Float.isInfinite(e) || Float.isNaN(e)) {
                e = i76.e(j);
            }
            float c = i76.c(h);
            if (Float.isInfinite(c) || Float.isNaN(c)) {
                c = i76.c(j);
            }
            long d = mj2.d(e, c);
            long d2 = this.l0.d(d, j);
            int i = vu5.a;
            float intBitsToFloat = Float.intBitsToFloat((int) (d2 >> 32));
            if (!Float.isInfinite(intBitsToFloat) && !Float.isNaN(intBitsToFloat)) {
                float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & d2));
                if (!Float.isInfinite(intBitsToFloat2) && !Float.isNaN(intBitsToFloat2)) {
                    return ln2.U(d, d2);
                }
            }
        }
        return j;
    }

    public final long S0(long j) {
        boolean z;
        float j2;
        int i;
        float l;
        boolean f = lz0.f(j);
        boolean e = lz0.e(j);
        if (!f || !e) {
            if (lz0.d(j) && lz0.c(j)) {
                z = true;
            } else {
                z = false;
            }
            long h = this.j0.h();
            if (h == 9205357640488583168L) {
                if (z) {
                    return lz0.a(j, lz0.h(j), 0, lz0.g(j), 0, 10);
                }
            } else {
                if (z && (f || e)) {
                    j2 = lz0.h(j);
                    i = lz0.g(j);
                } else {
                    float e2 = i76.e(h);
                    float c = i76.c(h);
                    if (!Float.isInfinite(e2) && !Float.isNaN(e2)) {
                        i55 i55Var = g67.b;
                        j2 = io2.l(e2, lz0.j(j), lz0.h(j));
                    } else {
                        j2 = lz0.j(j);
                    }
                    if (!Float.isInfinite(c) && !Float.isNaN(c)) {
                        i55 i55Var2 = g67.b;
                        l = io2.l(c, lz0.i(j), lz0.g(j));
                        long R0 = R0(mj2.d(j2, l));
                        return lz0.a(j, nz0.g(jv3.X(i76.e(R0)), j), 0, nz0.f(jv3.X(i76.c(R0)), j), 0, 10);
                    }
                    i = lz0.i(j);
                }
                l = i;
                long R02 = R0(mj2.d(j2, l));
                return lz0.a(j, nz0.g(jv3.X(i76.e(R02)), j), 0, nz0.f(jv3.X(i76.c(R02)), j), 0, 10);
            }
        }
        return j;
    }

    @Override // defpackage.gk1
    public final void T(xf3 xf3Var) {
        rh0 rh0Var = xf3Var.A;
        long R0 = R0(rh0Var.d());
        ub ubVar = this.k0;
        i55 i55Var = g67.b;
        long d = rh0Var.d();
        long a = ubVar.a((jv3.X(i76.e(R0)) << 32) | (jv3.X(i76.c(R0)) & 4294967295L), (jv3.X(i76.e(d)) << 32) | (jv3.X(i76.c(d)) & 4294967295L), xf3Var.getLayoutDirection());
        float f = (int) (a >> 32);
        float f2 = (int) (a & 4294967295L);
        ((bq0) rh0Var.B.B).e0(f, f2);
        this.j0.g(xf3Var, R0, this.m0, null);
        ((bq0) rh0Var.B.B).e0(-f, -f2);
        xf3Var.a();
    }

    @Override // defpackage.mf3
    public final int Z(fs3 fs3Var, mv3 mv3Var, int i) {
        if (this.j0.h() != 9205357640488583168L) {
            int T = mv3Var.T(lz0.g(S0(nz0.b(0, 0, 0, i, 7))));
            return Math.max(jv3.X(i76.e(R0(mj2.d(T, i)))), T);
        }
        return mv3Var.T(i);
    }

    @Override // defpackage.mf3
    public final uv3 e(vv3 vv3Var, mv3 mv3Var, long j) {
        yn4 c = mv3Var.c(S0(j));
        return vv3Var.s0(c.A, c.B, qp1.A, new ru(c, 2));
    }

    @Override // defpackage.mf3
    public final int h(fs3 fs3Var, mv3 mv3Var, int i) {
        if (this.j0.h() != 9205357640488583168L) {
            int e0 = mv3Var.e0(lz0.g(S0(nz0.b(0, 0, 0, i, 7))));
            return Math.max(jv3.X(i76.e(R0(mj2.d(e0, i)))), e0);
        }
        return mv3Var.e0(i);
    }

    @Override // defpackage.mf3
    public final int r(fs3 fs3Var, mv3 mv3Var, int i) {
        if (this.j0.h() != 9205357640488583168L) {
            int f = mv3Var.f(lz0.h(S0(nz0.b(0, i, 0, 0, 13))));
            return Math.max(jv3.X(i76.c(R0(mj2.d(i, f)))), f);
        }
        return mv3Var.f(i);
    }
}
