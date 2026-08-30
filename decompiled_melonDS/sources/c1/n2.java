package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n2 extends h1 {

    /* renamed from: j0  reason: collision with root package name */
    public d1.a1 f2480j0;

    /* renamed from: k0  reason: collision with root package name */
    public long f2481k0;

    /* renamed from: l0  reason: collision with root package name */
    public long f2482l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f2483m0;

    /* renamed from: n0  reason: collision with root package name */
    public final n2.f1 f2484n0;

    public n2(d1.a1 a1Var) {
        super(0);
        this.f2480j0 = a1Var;
        this.f2481k0 = h0.f2427a;
        this.f2482l0 = x4.b.b(0, 0, 15);
        this.f2484n0 = n2.s.w(null);
    }

    @Override // b3.o
    public final void G0() {
        this.f2481k0 = h0.f2427a;
        this.f2483m0 = false;
    }

    @Override // b3.o
    public final void I0() {
        this.f2484n0.setValue(null);
    }

    @Override // c1.h1, a4.a0
    public final y3.w0 d(y3.x0 x0Var, y3.u0 u0Var, long j2) {
        long j10;
        y3.i1 e6;
        long j11;
        char c4;
        long j12;
        k2 k2Var;
        long d4;
        k2 k2Var2;
        boolean z10 = true;
        if (x0Var.q()) {
            this.f2482l0 = j2;
            this.f2483m0 = true;
            e6 = u0Var.e(j2);
        } else {
            if (this.f2483m0) {
                j10 = this.f2482l0;
            } else {
                j10 = j2;
            }
            e6 = u0Var.e(j10);
        }
        y3.i1 i1Var = e6;
        long j13 = (i1Var.B & 4294967295L) | (i1Var.A << 32);
        if (x0Var.q()) {
            this.f2481k0 = j13;
            c4 = ' ';
            d4 = j13;
            j12 = d4;
        } else {
            if (!x4.l.b(this.f2481k0, h0.f2427a)) {
                j11 = this.f2481k0;
            } else {
                j11 = j13;
            }
            n2.f1 f1Var = this.f2484n0;
            k2 k2Var3 = (k2) f1Var.getValue();
            if (k2Var3 != null) {
                d1.c cVar = k2Var3.f2456a;
                c4 = ' ';
                j12 = j13;
                z10 = (x4.l.b(j11, ((x4.l) cVar.e()).f14346a) || ((Boolean) cVar.f3526d.getValue()).booleanValue()) ? false : false;
                if (x4.l.b(j11, ((x4.l) cVar.f3527e.getValue()).f14346a) && !z10) {
                    k2Var2 = k2Var3;
                } else {
                    k2Var3.f2457b = ((x4.l) cVar.e()).f14346a;
                    k2Var2 = k2Var3;
                    zc.x.v(C0(), null, null, new l2(k2Var2, j11, this, null), 3);
                }
                k2Var = k2Var2;
            } else {
                c4 = ' ';
                j12 = j13;
                long j14 = 1;
                k2Var = new k2(new d1.c(new x4.l(j11), d1.d.f3551q, new x4.l((j14 << 32) | (j14 & 4294967295L)), 8), j11);
            }
            f1Var.setValue(k2Var);
            d4 = x4.b.d(j2, ((x4.l) k2Var.f2456a.e()).f14346a);
        }
        int i2 = (int) (d4 >> c4);
        int i10 = (int) (d4 & 4294967295L);
        return x0Var.u0(i2, i10, zb.r.A, new m2(this, j12, i2, i10, x0Var, i1Var));
    }
}
