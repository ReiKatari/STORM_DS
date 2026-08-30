package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u extends h1 {

    /* renamed from: j0  reason: collision with root package name */
    public d1.k1 f2527j0;

    /* renamed from: k0  reason: collision with root package name */
    public n2.w0 f2528k0;

    /* renamed from: l0  reason: collision with root package name */
    public v f2529l0;

    /* renamed from: m0  reason: collision with root package name */
    public long f2530m0;

    @Override // b3.o
    public final void I0() {
        this.f2530m0 = m.f2469a;
    }

    @Override // c1.h1, a4.a0
    public final y3.w0 d(y3.x0 x0Var, y3.u0 u0Var, long j2) {
        long j10;
        y3.i1 e6 = u0Var.e(j2);
        if (x0Var.q()) {
            j10 = (e6.A << 32) | (e6.B & 4294967295L);
        } else {
            d1.k1 k1Var = this.f2527j0;
            int i2 = e6.A;
            if (k1Var == null) {
                j10 = (i2 << 32) | (e6.B & 4294967295L);
                this.f2530m0 = j10;
            } else {
                long j11 = (e6.B & 4294967295L) | (i2 << 32);
                d1.j1 a10 = k1Var.a(new t(this, j11, 0), new t(this, j11, 1));
                this.f2529l0.getClass();
                j10 = ((x4.l) a10.getValue()).f14346a;
                this.f2530m0 = ((x4.l) a10.getValue()).f14346a;
            }
        }
        return x0Var.u0((int) (j10 >> 32), (int) (4294967295L & j10), zb.r.A, new s(this, e6, j10));
    }
}
