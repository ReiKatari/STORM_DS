package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nz3  reason: default package */
/* loaded from: classes.dex */
public final class nz3 implements jk3 {
    public final mz3 A;

    public nz3(mz3 mz3Var) {
        this.A = mz3Var;
    }

    @Override // defpackage.jk3
    public final long A(long j) {
        return jk4.f(this.A.k0.A(j), a());
    }

    @Override // defpackage.jk3
    public final jk3 D() {
        mz3 W0;
        if (!t()) {
            p53.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        eg4 eg4Var = ((eg4) this.A.k0.k0.B0.e).o0;
        if (eg4Var != null && (W0 = eg4Var.W0()) != null) {
            return W0.n0;
        }
        return null;
    }

    @Override // defpackage.jk3
    public final long J(jk3 jk3Var, long j) {
        return R(jk3Var, j, true);
    }

    @Override // defpackage.jk3
    public final long N(long j) {
        return jk4.f(this.A.k0.N(j), a());
    }

    @Override // defpackage.jk3
    public final of5 O(jk3 jk3Var, boolean z) {
        return this.A.k0.O(jk3Var, z);
    }

    @Override // defpackage.jk3
    public final long P(long j) {
        return this.A.k0.P(jk4.f(j, a()));
    }

    @Override // defpackage.jk3
    public final long R(jk3 jk3Var, long j, boolean z) {
        boolean z2 = jk3Var instanceof nz3;
        mz3 mz3Var = this.A;
        if (z2) {
            mz3 mz3Var2 = ((nz3) jk3Var).A;
            eg4 eg4Var = mz3Var2.k0;
            eg4Var.h1();
            mz3 W0 = mz3Var.k0.U0(eg4Var).W0();
            if (W0 != null) {
                boolean z3 = !z;
                long b = i93.b(i93.c(mz3Var2.R0(W0, z3), kn2.a0(j)), mz3Var.R0(W0, z3));
                return (Float.floatToRawIntBits((int) (b >> 32)) << 32) | (Float.floatToRawIntBits((int) (b & 4294967295L)) & 4294967295L);
            }
            mz3 t = xk2.t(mz3Var2);
            boolean z4 = !z;
            long c = i93.c(i93.c(mz3Var2.R0(t, z4), t.l0), kn2.a0(j));
            mz3 t2 = xk2.t(mz3Var);
            long b2 = i93.b(c, i93.c(mz3Var.R0(t2, z4), t2.l0));
            long floatToRawIntBits = Float.floatToRawIntBits((int) (b2 & 4294967295L)) & 4294967295L;
            eg4 eg4Var2 = t2.k0.o0;
            eg4Var2.getClass();
            eg4 eg4Var3 = t.k0.o0;
            eg4Var3.getClass();
            return eg4Var2.R(eg4Var3, floatToRawIntBits | (Float.floatToRawIntBits((int) (b2 >> 32)) << 32), z);
        }
        mz3 t3 = xk2.t(mz3Var);
        eg4 eg4Var4 = t3.k0;
        long R = R(t3.n0, j, z);
        long j2 = t3.l0;
        long e = jk4.e(R, (4294967295L & Float.floatToRawIntBits((int) (j2 & 4294967295L))) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32));
        if (!eg4Var4.Y0().j0) {
            p53.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        eg4Var4.h1();
        eg4 eg4Var5 = eg4Var4.o0;
        if (eg4Var5 != null) {
            eg4Var4 = eg4Var5;
        }
        return jk4.f(e, eg4Var4.R(jk3Var, 0L, z));
    }

    public final long a() {
        mz3 mz3Var = this.A;
        mz3 t = xk2.t(mz3Var);
        return jk4.e(R(t.n0, 0L, true), mz3Var.k0.R(t.k0, 0L, true));
    }

    @Override // defpackage.jk3
    public final long d(long j) {
        return this.A.k0.d(jk4.f(j, a()));
    }

    @Override // defpackage.jk3
    public final void k(float[] fArr) {
        this.A.k0.k(fArr);
    }

    @Override // defpackage.jk3
    public final void l(jk3 jk3Var, float[] fArr) {
        this.A.k0.l(jk3Var, fArr);
    }

    @Override // defpackage.jk3
    public final long m() {
        mz3 mz3Var = this.A;
        return (mz3Var.A << 32) | (mz3Var.B & 4294967295L);
    }

    @Override // defpackage.jk3
    public final boolean t() {
        return this.A.k0.Y0().j0;
    }

    @Override // defpackage.jk3
    public final long w(long j) {
        return this.A.k0.w(jk4.f(0L, a()));
    }
}
