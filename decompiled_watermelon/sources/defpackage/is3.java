package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: is3  reason: default package */
/* loaded from: classes.dex */
public final class is3 implements rd3 {
    public final hs3 A;

    public is3(hs3 hs3Var) {
        this.A = hs3Var;
    }

    @Override // defpackage.rd3
    public final long E(long j) {
        return mb4.e(this.A.j0.E(j), b());
    }

    @Override // defpackage.rd3
    public final void H(float[] fArr) {
        this.A.j0.H(fArr);
    }

    @Override // defpackage.rd3
    public final void K(rd3 rd3Var, float[] fArr) {
        this.A.j0.K(rd3Var, fArr);
    }

    @Override // defpackage.rd3
    public final y55 L(rd3 rd3Var, boolean z) {
        return this.A.j0.L(rd3Var, z);
    }

    @Override // defpackage.rd3
    public final long O() {
        hs3 hs3Var = this.A;
        return (hs3Var.A << 32) | (hs3Var.B & 4294967295L);
    }

    @Override // defpackage.rd3
    public final long Q(long j) {
        return this.A.j0.Q(mb4.e(j, b()));
    }

    @Override // defpackage.rd3
    public final long R(rd3 rd3Var, long j, boolean z) {
        boolean z2 = rd3Var instanceof is3;
        hs3 hs3Var = this.A;
        if (z2) {
            hs3 hs3Var2 = ((is3) rd3Var).A;
            m74 m74Var = hs3Var2.j0;
            m74Var.h1();
            hs3 W0 = hs3Var.j0.U0(m74Var).W0();
            if (W0 != null) {
                boolean z3 = !z;
                long b = a33.b(a33.c(hs3Var2.R0(W0, z3), mj2.P(j)), hs3Var.R0(W0, z3));
                return (Float.floatToRawIntBits((int) (b >> 32)) << 32) | (Float.floatToRawIntBits((int) (b & 4294967295L)) & 4294967295L);
            }
            hs3 G = cg2.G(hs3Var2);
            boolean z4 = !z;
            long c = a33.c(a33.c(hs3Var2.R0(G, z4), G.k0), mj2.P(j));
            hs3 G2 = cg2.G(hs3Var);
            long b2 = a33.b(c, a33.c(hs3Var.R0(G2, z4), G2.k0));
            long floatToRawIntBits = Float.floatToRawIntBits((int) (b2 & 4294967295L)) & 4294967295L;
            m74 m74Var2 = G2.j0.n0;
            m74Var2.getClass();
            m74 m74Var3 = G.j0.n0;
            m74Var3.getClass();
            return m74Var2.R(m74Var3, floatToRawIntBits | (Float.floatToRawIntBits((int) (b2 >> 32)) << 32), z);
        }
        hs3 G3 = cg2.G(hs3Var);
        m74 m74Var4 = G3.j0;
        long R = R(G3.m0, j, z);
        long j2 = G3.k0;
        long d = mb4.d(R, (4294967295L & Float.floatToRawIntBits((int) (j2 & 4294967295L))) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32));
        if (!m74Var4.Y0().i0) {
            mz2.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        m74Var4.h1();
        m74 m74Var5 = m74Var4.n0;
        if (m74Var5 != null) {
            m74Var4 = m74Var5;
        }
        return mb4.e(d, m74Var4.R(rd3Var, 0L, z));
    }

    @Override // defpackage.rd3
    public final long a(long j) {
        return this.A.j0.a(mb4.e(0L, b()));
    }

    public final long b() {
        hs3 hs3Var = this.A;
        hs3 G = cg2.G(hs3Var);
        return mb4.d(R(G.m0, 0L, true), hs3Var.j0.R(G.j0, 0L, true));
    }

    @Override // defpackage.rd3
    public final boolean c0() {
        return this.A.j0.Y0().i0;
    }

    @Override // defpackage.rd3
    public final long h(long j) {
        return mb4.e(this.A.j0.h(j), b());
    }

    @Override // defpackage.rd3
    public final long k(long j) {
        return this.A.j0.k(mb4.e(j, b()));
    }

    @Override // defpackage.rd3
    public final rd3 m() {
        hs3 W0;
        if (!c0()) {
            mz2.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        m74 m74Var = ((m74) this.A.j0.j0.A0.e).n0;
        if (m74Var != null && (W0 = m74Var.W0()) != null) {
            return W0.m0;
        }
        return null;
    }

    @Override // defpackage.rd3
    public final long y(rd3 rd3Var, long j) {
        return R(rd3Var, j, true);
    }
}
