package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p76  reason: default package */
/* loaded from: classes.dex */
public final class p76 extends yy3 implements mf3 {
    public float j0;
    public float k0;
    public float l0;
    public float m0;
    public boolean n0;

    @Override // defpackage.mf3
    public final int H(fs3 fs3Var, mv3 mv3Var, int i) {
        long R0 = R0(fs3Var);
        if (lz0.e(R0)) {
            return lz0.g(R0);
        }
        if (!this.n0) {
            i = nz0.g(i, R0);
        }
        return nz0.f(mv3Var.g0(i), R0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
        if (r4 != Integer.MAX_VALUE) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long R0(defpackage.vv3 r7) {
        /*
            r6 = this;
            float r0 = r6.l0
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.l0
            int r0 = r7.Y(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.m0
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.m0
            int r3 = r7.Y(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.j0
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L41
            float r4 = r6.j0
            int r4 = r7.Y(r4)
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
            float r5 = r6.k0
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r6 = r6.k0
            int r6 = r7.Y(r6)
            if (r6 >= 0) goto L53
            r6 = r2
        L53:
            if (r6 <= r3) goto L56
            r6 = r3
        L56:
            if (r6 == r1) goto L59
            r2 = r6
        L59:
            long r6 = defpackage.nz0.a(r4, r0, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p76.R0(vv3):long");
    }

    @Override // defpackage.mf3
    public final int Z(fs3 fs3Var, mv3 mv3Var, int i) {
        long R0 = R0(fs3Var);
        if (lz0.f(R0)) {
            return lz0.h(R0);
        }
        if (!this.n0) {
            i = nz0.f(i, R0);
        }
        return nz0.g(mv3Var.T(i), R0);
    }

    @Override // defpackage.mf3
    public final uv3 e(vv3 vv3Var, mv3 mv3Var, long j) {
        int j2;
        int h;
        int i;
        int g;
        long a;
        long R0 = R0(vv3Var);
        if (this.n0) {
            a = nz0.e(j, R0);
        } else {
            if (!Float.isNaN(this.j0)) {
                j2 = lz0.j(R0);
            } else {
                j2 = lz0.j(j);
                int h2 = lz0.h(R0);
                if (j2 > h2) {
                    j2 = h2;
                }
            }
            if (!Float.isNaN(this.l0)) {
                h = lz0.h(R0);
            } else {
                h = lz0.h(j);
                int j3 = lz0.j(R0);
                if (h < j3) {
                    h = j3;
                }
            }
            if (!Float.isNaN(this.k0)) {
                i = lz0.i(R0);
            } else {
                i = lz0.i(j);
                int g2 = lz0.g(R0);
                if (i > g2) {
                    i = g2;
                }
            }
            if (!Float.isNaN(this.m0)) {
                g = lz0.g(R0);
            } else {
                g = lz0.g(j);
                int i2 = lz0.i(R0);
                if (g < i2) {
                    g = i2;
                }
            }
            a = nz0.a(j2, h, i, g);
        }
        yn4 c = mv3Var.c(a);
        return vv3Var.s0(c.A, c.B, qp1.A, new ru(c, 7));
    }

    @Override // defpackage.mf3
    public final int h(fs3 fs3Var, mv3 mv3Var, int i) {
        long R0 = R0(fs3Var);
        if (lz0.f(R0)) {
            return lz0.h(R0);
        }
        if (!this.n0) {
            i = nz0.f(i, R0);
        }
        return nz0.g(mv3Var.e0(i), R0);
    }

    @Override // defpackage.mf3
    public final int r(fs3 fs3Var, mv3 mv3Var, int i) {
        long R0 = R0(fs3Var);
        if (lz0.e(R0)) {
            return lz0.g(R0);
        }
        if (!this.n0) {
            i = nz0.g(i, R0);
        }
        return nz0.f(mv3Var.f(i), R0);
    }
}
