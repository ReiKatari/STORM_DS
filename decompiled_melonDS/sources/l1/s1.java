package l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s1 extends b3.o implements a4.a0 {

    /* renamed from: i0  reason: collision with root package name */
    public float f8622i0;

    /* renamed from: j0  reason: collision with root package name */
    public float f8623j0;

    /* renamed from: k0  reason: collision with root package name */
    public float f8624k0;

    /* renamed from: l0  reason: collision with root package name */
    public float f8625l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f8626m0;

    @Override // a4.a0
    public final int B0(a4.x0 x0Var, y3.u0 u0Var, int i2) {
        long O0 = O0(x0Var);
        if (x4.a.e(O0)) {
            return x4.a.g(O0);
        }
        if (!this.f8626m0) {
            i2 = x4.b.g(i2, O0);
        }
        return x4.b.f(u0Var.h0(i2), O0);
    }

    @Override // a4.a0
    public final int K(a4.x0 x0Var, y3.u0 u0Var, int i2) {
        long O0 = O0(x0Var);
        if (x4.a.e(O0)) {
            return x4.a.g(O0);
        }
        if (!this.f8626m0) {
            i2 = x4.b.g(i2, O0);
        }
        return x4.b.f(u0Var.g(i2), O0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
        if (r4 != Integer.MAX_VALUE) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long O0(y3.x0 r7) {
        /*
            r6 = this;
            float r0 = r6.f8624k0
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.f8624k0
            int r0 = r7.O(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.f8625l0
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.f8625l0
            int r3 = r7.O(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.f8622i0
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L41
            float r4 = r6.f8622i0
            int r4 = r7.O(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 == r1) goto L41
            goto L42
        L41:
            r4 = r2
        L42:
            float r5 = r6.f8623j0
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r5 = r6.f8623j0
            int r7 = r7.O(r5)
            if (r7 >= 0) goto L53
            r7 = r2
        L53:
            if (r7 <= r3) goto L56
            r7 = r3
        L56:
            if (r7 == r1) goto L59
            r2 = r7
        L59:
            long r0 = x4.b.a(r4, r0, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.s1.O0(y3.x0):long");
    }

    @Override // a4.a0
    public final y3.w0 d(y3.x0 x0Var, y3.u0 u0Var, long j2) {
        int j10;
        int h2;
        int i2;
        int g10;
        long a10;
        long O0 = O0(x0Var);
        if (this.f8626m0) {
            a10 = x4.b.e(j2, O0);
        } else {
            if (!Float.isNaN(this.f8622i0)) {
                j10 = x4.a.j(O0);
            } else {
                j10 = x4.a.j(j2);
                int h10 = x4.a.h(O0);
                if (j10 > h10) {
                    j10 = h10;
                }
            }
            if (!Float.isNaN(this.f8624k0)) {
                h2 = x4.a.h(O0);
            } else {
                h2 = x4.a.h(j2);
                int j11 = x4.a.j(O0);
                if (h2 < j11) {
                    h2 = j11;
                }
            }
            if (!Float.isNaN(this.f8623j0)) {
                i2 = x4.a.i(O0);
            } else {
                i2 = x4.a.i(j2);
                int g11 = x4.a.g(O0);
                if (i2 > g11) {
                    i2 = g11;
                }
            }
            if (!Float.isNaN(this.f8625l0)) {
                g10 = x4.a.g(O0);
            } else {
                g10 = x4.a.g(j2);
                int i10 = x4.a.i(O0);
                if (g10 < i10) {
                    g10 = i10;
                }
            }
            a10 = x4.b.a(j10, h2, i2, g10);
        }
        y3.i1 e6 = u0Var.e(a10);
        return x0Var.u0(e6.A, e6.B, zb.r.A, new c9.o(e6, 7));
    }

    @Override // a4.a0
    public final int p0(a4.x0 x0Var, y3.u0 u0Var, int i2) {
        long O0 = O0(x0Var);
        if (x4.a.f(O0)) {
            return x4.a.h(O0);
        }
        if (!this.f8626m0) {
            i2 = x4.b.f(i2, O0);
        }
        return x4.b.g(u0Var.g0(i2), O0);
    }

    @Override // a4.a0
    public final int y0(a4.x0 x0Var, y3.u0 u0Var, int i2) {
        long O0 = O0(x0Var);
        if (x4.a.f(O0)) {
            return x4.a.h(O0);
        }
        if (!this.f8626m0) {
            i2 = x4.b.f(i2, O0);
        }
        return x4.b.g(u0Var.b0(i2), O0);
    }
}
