package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v31  reason: default package */
/* loaded from: classes.dex */
public final class v31 extends z64 implements mo1, jm3 {
    public lw k0;
    public ic l0;
    public z31 m0;
    public float n0;

    @Override // defpackage.z64
    public final boolean G0() {
        return false;
    }

    public final long R0(long j) {
        if (xi6.f(j)) {
            return 0L;
        }
        long h = this.k0.h();
        if (h != 9205357640488583168L) {
            float e = xi6.e(h);
            if (Float.isInfinite(e) || Float.isNaN(e)) {
                e = xi6.e(j);
            }
            float c = xi6.c(h);
            if (Float.isInfinite(c) || Float.isNaN(c)) {
                c = xi6.c(j);
            }
            long n = ii2.n(e, c);
            long c2 = this.m0.c(n, j);
            int i = a66.a;
            float intBitsToFloat = Float.intBitsToFloat((int) (c2 >> 32));
            if (!Float.isInfinite(intBitsToFloat) && !Float.isNaN(intBitsToFloat)) {
                float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & c2));
                if (!Float.isInfinite(intBitsToFloat2) && !Float.isNaN(intBitsToFloat2)) {
                    return kn2.c0(n, c2);
                }
            }
        }
        return j;
    }

    public final long S0(long j) {
        boolean z;
        float j2;
        int i;
        float p;
        boolean f = q21.f(j);
        boolean e = q21.e(j);
        if (!f || !e) {
            if (q21.d(j) && q21.c(j)) {
                z = true;
            } else {
                z = false;
            }
            long h = this.k0.h();
            if (h == 9205357640488583168L) {
                if (z) {
                    return q21.a(j, q21.h(j), 0, q21.g(j), 0, 10);
                }
            } else {
                if (z && (f || e)) {
                    j2 = q21.h(j);
                    i = q21.g(j);
                } else {
                    float e2 = xi6.e(h);
                    float c = xi6.c(h);
                    if (!Float.isInfinite(e2) && !Float.isNaN(e2)) {
                        ve5 ve5Var = dk7.b;
                        j2 = gi2.p(e2, q21.j(j), q21.h(j));
                    } else {
                        j2 = q21.j(j);
                    }
                    if (!Float.isInfinite(c) && !Float.isNaN(c)) {
                        ve5 ve5Var2 = dk7.b;
                        p = gi2.p(c, q21.i(j), q21.g(j));
                        long R0 = R0(ii2.n(j2, p));
                        return q21.a(j, s21.g(u24.E(xi6.e(R0)), j), 0, s21.f(u24.E(xi6.c(R0)), j), 0, 10);
                    }
                    i = q21.i(j);
                }
                p = i;
                long R02 = R0(ii2.n(j2, p));
                return q21.a(j, s21.g(u24.E(xi6.e(R02)), j), 0, s21.f(u24.E(xi6.c(R02)), j), 0, 10);
            }
        }
        return j;
    }

    @Override // defpackage.jm3
    public final int Z(kz3 kz3Var, x24 x24Var, int i) {
        if (this.k0.h() != 9205357640488583168L) {
            int c = x24Var.c(q21.h(S0(s21.b(0, i, 0, 0, 13))));
            return Math.max(u24.E(xi6.c(R0(ii2.n(i, c)))), c);
        }
        return x24Var.c(i);
    }

    @Override // defpackage.jm3
    public final f34 c(g34 g34Var, x24 x24Var, long j) {
        dx4 y = x24Var.y(S0(j));
        return g34Var.K(y.A, y.B, zt1.A, new jv(y, 2));
    }

    @Override // defpackage.jm3
    public final int f(kz3 kz3Var, x24 x24Var, int i) {
        if (this.k0.h() != 9205357640488583168L) {
            int u = x24Var.u(q21.g(S0(s21.b(0, 0, 0, i, 7))));
            return Math.max(u24.E(xi6.e(R0(ii2.n(u, i)))), u);
        }
        return x24Var.u(i);
    }

    @Override // defpackage.jm3
    public final int h0(kz3 kz3Var, x24 x24Var, int i) {
        if (this.k0.h() != 9205357640488583168L) {
            int V = x24Var.V(q21.h(S0(s21.b(0, i, 0, 0, 13))));
            return Math.max(u24.E(xi6.c(R0(ii2.n(i, V)))), V);
        }
        return x24Var.V(i);
    }

    @Override // defpackage.mo1
    public final void m0(um3 um3Var) {
        zj0 zj0Var = um3Var.A;
        long R0 = R0(zj0Var.e());
        ic icVar = this.l0;
        ve5 ve5Var = dk7.b;
        long e = zj0Var.e();
        long a = icVar.a((u24.E(xi6.e(R0)) << 32) | (u24.E(xi6.c(R0)) & 4294967295L), (u24.E(xi6.e(e)) << 32) | (u24.E(xi6.c(e)) & 4294967295L), um3Var.getLayoutDirection());
        float f = (int) (a >> 32);
        float f2 = (int) (a & 4294967295L);
        ((os0) zj0Var.B.B).g0(f, f2);
        this.k0.g(um3Var, R0, this.n0, null);
        ((os0) zj0Var.B.B).g0(-f, -f2);
        um3Var.b();
    }

    @Override // defpackage.jm3
    public final int s0(kz3 kz3Var, x24 x24Var, int i) {
        if (this.k0.h() != 9205357640488583168L) {
            int n = x24Var.n(q21.g(S0(s21.b(0, 0, 0, i, 7))));
            return Math.max(u24.E(xi6.e(R0(ii2.n(n, i)))), n);
        }
        return x24Var.n(i);
    }
}
