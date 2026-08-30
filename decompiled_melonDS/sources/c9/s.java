package c9;

import a4.a0;
import a4.r0;
import a4.x0;
import y3.c0;
import y3.i1;
import y3.m1;
import y3.u0;
import y3.w0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s extends b3.o implements a4.p, a0 {

    /* renamed from: i0  reason: collision with root package name */
    public k f2754i0;

    /* renamed from: j0  reason: collision with root package name */
    public b3.d f2755j0;

    /* renamed from: k0  reason: collision with root package name */
    public y3.o f2756k0;

    /* renamed from: l0  reason: collision with root package name */
    public float f2757l0;

    @Override // a4.a0
    public final int B0(x0 x0Var, u0 u0Var, int i2) {
        if (this.f2754i0.h() != 9205357640488583168L) {
            int h02 = u0Var.h0(x4.a.h(P0(x4.b.b(i2, 0, 13))));
            return Math.max(pc.a.M(h3.e.c(O0(a.a.f(i2, h02)))), h02);
        }
        return u0Var.h0(i2);
    }

    @Override // b3.o
    public final boolean D0() {
        return false;
    }

    @Override // a4.a0
    public final int K(x0 x0Var, u0 u0Var, int i2) {
        if (this.f2754i0.h() != 9205357640488583168L) {
            int g10 = u0Var.g(x4.a.h(P0(x4.b.b(i2, 0, 13))));
            return Math.max(pc.a.M(h3.e.c(O0(a.a.f(i2, g10)))), g10);
        }
        return u0Var.g(i2);
    }

    public final long O0(long j2) {
        if (h3.e.f(j2)) {
            return 0L;
        }
        long h2 = this.f2754i0.h();
        if (h2 != 9205357640488583168L) {
            float e6 = h3.e.e(h2);
            if (Float.isInfinite(e6) || Float.isNaN(e6)) {
                e6 = h3.e.e(j2);
            }
            float c4 = h3.e.c(h2);
            if (Float.isInfinite(c4) || Float.isNaN(c4)) {
                c4 = h3.e.c(j2);
            }
            long f8 = a.a.f(e6, c4);
            long a10 = this.f2756k0.a(f8, j2);
            int i2 = m1.f14708a;
            float intBitsToFloat = Float.intBitsToFloat((int) (a10 >> 32));
            if (!Float.isInfinite(intBitsToFloat) && !Float.isNaN(intBitsToFloat)) {
                float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & a10));
                if (!Float.isInfinite(intBitsToFloat2) && !Float.isNaN(intBitsToFloat2)) {
                    return c0.p(f8, a10);
                }
                return j2;
            }
            return j2;
        }
        return j2;
    }

    public final long P0(long j2) {
        boolean z10;
        float j10;
        int i2;
        float f8;
        boolean f10 = x4.a.f(j2);
        boolean e6 = x4.a.e(j2);
        if (!f10 || !e6) {
            if (x4.a.d(j2) && x4.a.c(j2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            long h2 = this.f2754i0.h();
            if (h2 == 9205357640488583168L) {
                if (z10) {
                    return x4.a.a(j2, x4.a.h(j2), 0, x4.a.g(j2), 0, 10);
                }
            } else {
                if (z10 && (f10 || e6)) {
                    j10 = x4.a.h(j2);
                    i2 = x4.a.g(j2);
                } else {
                    float e10 = h3.e.e(h2);
                    float c4 = h3.e.c(h2);
                    if (!Float.isInfinite(e10) && !Float.isNaN(e10)) {
                        n9.e eVar = w.f2767b;
                        j10 = p7.j.f(e10, x4.a.j(j2), x4.a.h(j2));
                    } else {
                        j10 = x4.a.j(j2);
                    }
                    if (!Float.isInfinite(c4) && !Float.isNaN(c4)) {
                        n9.e eVar2 = w.f2767b;
                        f8 = p7.j.f(c4, x4.a.i(j2), x4.a.g(j2));
                        long O0 = O0(a.a.f(j10, f8));
                        return x4.a.a(j2, x4.b.g(pc.a.M(h3.e.e(O0)), j2), 0, x4.b.f(pc.a.M(h3.e.c(O0)), j2), 0, 10);
                    }
                    i2 = x4.a.i(j2);
                }
                f8 = i2;
                long O02 = O0(a.a.f(j10, f8));
                return x4.a.a(j2, x4.b.g(pc.a.M(h3.e.e(O02)), j2), 0, x4.b.f(pc.a.M(h3.e.c(O02)), j2), 0, 10);
            }
        }
        return j2;
    }

    @Override // a4.a0
    public final w0 d(y3.x0 x0Var, u0 u0Var, long j2) {
        i1 e6 = u0Var.e(P0(j2));
        return x0Var.u0(e6.A, e6.B, zb.r.A, new o(e6, 1));
    }

    @Override // a4.a0
    public final int p0(x0 x0Var, u0 u0Var, int i2) {
        if (this.f2754i0.h() != 9205357640488583168L) {
            int g02 = u0Var.g0(x4.a.g(P0(x4.b.b(0, i2, 7))));
            return Math.max(pc.a.M(h3.e.e(O0(a.a.f(g02, i2)))), g02);
        }
        return u0Var.g0(i2);
    }

    @Override // a4.a0
    public final int y0(x0 x0Var, u0 u0Var, int i2) {
        if (this.f2754i0.h() != 9205357640488583168L) {
            int b02 = u0Var.b0(x4.a.g(P0(x4.b.b(0, i2, 7))));
            return Math.max(pc.a.M(h3.e.e(O0(a.a.f(b02, i2)))), b02);
        }
        return u0Var.b0(i2);
    }

    @Override // a4.p
    public final void z(r0 r0Var) {
        k3.b bVar = r0Var.A;
        long O0 = O0(bVar.c());
        b3.d dVar = this.f2755j0;
        n9.e eVar = w.f2767b;
        long c4 = bVar.c();
        long a10 = dVar.a((pc.a.M(h3.e.e(O0)) << 32) | (pc.a.M(h3.e.c(O0)) & 4294967295L), (pc.a.M(h3.e.e(c4)) << 32) | (pc.a.M(h3.e.c(c4)) & 4294967295L), r0Var.getLayoutDirection());
        float f8 = (int) (a10 >> 32);
        float f10 = (int) (a10 & 4294967295L);
        ((d2.t) bVar.B.B).F(f8, f10);
        this.f2754i0.g(r0Var, O0, this.f2757l0, null);
        ((d2.t) bVar.B.B).F(-f8, -f10);
        r0Var.a();
    }
}
