package y3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r0 implements z {
    public final a4.y0 A;

    public r0(a4.y0 y0Var) {
        this.A = y0Var;
    }

    @Override // y3.z
    public final long C(z zVar, long j2) {
        return F(zVar, j2, true);
    }

    @Override // y3.z
    public final long F(z zVar, long j2, boolean z10) {
        boolean z11 = zVar instanceof r0;
        a4.y0 y0Var = this.A;
        if (z11) {
            a4.y0 y0Var2 = ((r0) zVar).A;
            a4.r1 r1Var = y0Var2.f371i0;
            r1Var.g1();
            a4.y0 V0 = y0Var.f371i0.T0(r1Var).V0();
            if (V0 != null) {
                boolean z12 = !z10;
                long b10 = x4.j.b(x4.j.c(y0Var2.Q0(V0, z12), p7.n.u(j2)), y0Var.Q0(V0, z12));
                return (Float.floatToRawIntBits((int) (b10 >> 32)) << 32) | (Float.floatToRawIntBits((int) (b10 & 4294967295L)) & 4294967295L);
            }
            a4.y0 k10 = c0.k(y0Var2);
            boolean z13 = !z10;
            long c4 = x4.j.c(x4.j.c(y0Var2.Q0(k10, z13), k10.f372j0), p7.n.u(j2));
            a4.y0 k11 = c0.k(y0Var);
            long b11 = x4.j.b(c4, x4.j.c(y0Var.Q0(k11, z13), k11.f372j0));
            long floatToRawIntBits = Float.floatToRawIntBits((int) (b11 & 4294967295L)) & 4294967295L;
            a4.r1 r1Var2 = k11.f371i0.f319m0;
            r1Var2.getClass();
            a4.r1 r1Var3 = k10.f371i0.f319m0;
            r1Var3.getClass();
            return r1Var2.F(r1Var3, floatToRawIntBits | (Float.floatToRawIntBits((int) (b11 >> 32)) << 32), z10);
        }
        a4.y0 k12 = c0.k(y0Var);
        a4.r1 r1Var4 = k12.f371i0;
        long F = F(k12.f374l0, j2, z10);
        long j10 = k12.f372j0;
        long d4 = h3.b.d(F, (4294967295L & Float.floatToRawIntBits((int) (j10 & 4294967295L))) | (Float.floatToRawIntBits((int) (j10 >> 32)) << 32));
        if (!r1Var4.X0().f1777h0) {
            x3.a.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        r1Var4.g1();
        a4.r1 r1Var5 = r1Var4.f319m0;
        if (r1Var5 != null) {
            r1Var4 = r1Var5;
        }
        return h3.b.e(d4, r1Var4.F(zVar, 0L, z10));
    }

    @Override // y3.z
    public final long Q(long j2) {
        return h3.b.e(this.A.f371i0.Q(j2), b());
    }

    @Override // y3.z
    public final boolean U() {
        return this.A.f371i0.X0().f1777h0;
    }

    @Override // y3.z
    public final void V(float[] fArr) {
        this.A.f371i0.V(fArr);
    }

    @Override // y3.z
    public final long Z() {
        a4.y0 y0Var = this.A;
        return (y0Var.A << 32) | (y0Var.B & 4294967295L);
    }

    @Override // y3.z
    public final long a(long j2) {
        return this.A.f371i0.a(h3.b.e(0L, b()));
    }

    @Override // y3.z
    public final long a0(long j2) {
        return this.A.f371i0.a0(h3.b.e(j2, b()));
    }

    public final long b() {
        a4.y0 y0Var = this.A;
        a4.y0 k10 = c0.k(y0Var);
        return h3.b.d(F(k10.f374l0, 0L, true), y0Var.f371i0.F(k10.f371i0, 0L, true));
    }

    @Override // y3.z
    public final long h(long j2) {
        return h3.b.e(this.A.f371i0.h(j2), b());
    }

    @Override // y3.z
    public final h3.c k(z zVar, boolean z10) {
        return this.A.f371i0.k(zVar, z10);
    }

    @Override // y3.z
    public final long l(long j2) {
        return this.A.f371i0.l(h3.b.e(j2, b()));
    }

    @Override // y3.z
    public final z o() {
        a4.y0 V0;
        if (!U()) {
            x3.a.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        a4.r1 r1Var = this.A.f371i0.f315i0.A0.f266d.f319m0;
        if (r1Var != null && (V0 = r1Var.V0()) != null) {
            return V0.f374l0;
        }
        return null;
    }

    @Override // y3.z
    public final void u(z zVar, float[] fArr) {
        this.A.f371i0.u(zVar, fArr);
    }
}
