package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b1 extends h1 {

    /* renamed from: j0  reason: collision with root package name */
    public d1.q1 f2383j0;

    /* renamed from: k0  reason: collision with root package name */
    public d1.k1 f2384k0;

    /* renamed from: l0  reason: collision with root package name */
    public d1.k1 f2385l0;

    /* renamed from: m0  reason: collision with root package name */
    public d1.k1 f2386m0;

    /* renamed from: n0  reason: collision with root package name */
    public c1 f2387n0;

    /* renamed from: o0  reason: collision with root package name */
    public d1 f2388o0;
    public mc.a p0;

    /* renamed from: q0  reason: collision with root package name */
    public o0 f2389q0;

    /* renamed from: r0  reason: collision with root package name */
    public long f2390r0;

    /* renamed from: s0  reason: collision with root package name */
    public b3.d f2391s0;

    /* renamed from: t0  reason: collision with root package name */
    public final a1 f2392t0;

    /* renamed from: u0  reason: collision with root package name */
    public final a1 f2393u0;

    public b1(d1.q1 q1Var, d1.k1 k1Var, d1.k1 k1Var2, d1.k1 k1Var3, c1 c1Var, d1 d1Var, mc.a aVar, o0 o0Var) {
        super(0);
        this.f2383j0 = q1Var;
        this.f2384k0 = k1Var;
        this.f2385l0 = k1Var2;
        this.f2386m0 = k1Var3;
        this.f2387n0 = c1Var;
        this.f2388o0 = d1Var;
        this.p0 = aVar;
        this.f2389q0 = o0Var;
        this.f2390r0 = h0.f2427a;
        x4.b.b(0, 0, 15);
        this.f2392t0 = new a1(this, 0);
        this.f2393u0 = new a1(this, 1);
    }

    @Override // b3.o
    public final void G0() {
        this.f2390r0 = h0.f2427a;
    }

    public final b3.d Q0() {
        if (this.f2383j0.f().b(m0.PreEnter, m0.Visible)) {
            k0 k0Var = this.f2387n0.f2397a.f2523c;
            if (k0Var != null) {
                return k0Var.f2452a;
            }
            k0 k0Var2 = this.f2388o0.f2403a.f2523c;
            if (k0Var2 != null) {
                return k0Var2.f2452a;
            }
            return null;
        }
        k0 k0Var3 = this.f2388o0.f2403a.f2523c;
        if (k0Var3 != null) {
            return k0Var3.f2452a;
        }
        k0 k0Var4 = this.f2387n0.f2397a.f2523c;
        if (k0Var4 != null) {
            return k0Var4.f2452a;
        }
        return null;
    }

    @Override // c1.h1, a4.a0
    public final y3.w0 d(y3.x0 x0Var, y3.u0 u0Var, long j2) {
        d1.j1 j1Var;
        d1.j1 j1Var2;
        d1.j1 j1Var3;
        long j10;
        long j11;
        long j12;
        long j13;
        d1.j1 j1Var4 = null;
        if (this.f2383j0.f3649a.c() == this.f2383j0.f3652d.getValue()) {
            this.f2391s0 = null;
        } else if (this.f2391s0 == null) {
            b3.d Q0 = Q0();
            if (Q0 == null) {
                Q0 = b3.c.A;
            }
            this.f2391s0 = Q0;
        }
        boolean q10 = x0Var.q();
        zb.r rVar = zb.r.A;
        if (q10) {
            y3.i1 e6 = u0Var.e(j2);
            long j14 = (e6.A << 32) | (e6.B & 4294967295L);
            this.f2390r0 = j14;
            return x0Var.u0((int) (j14 >> 32), (int) (4294967295L & j14), rVar, new c0(e6, 1));
        } else if (((Boolean) this.p0.b()).booleanValue()) {
            o0 o0Var = this.f2389q0;
            d1.k1 k1Var = o0Var.f2486a;
            d1.k1 k1Var2 = o0Var.f2487b;
            d1.q1 q1Var = o0Var.f2488c;
            c1 c1Var = o0Var.f2489d;
            d1 d1Var = o0Var.f2490e;
            d1.k1 k1Var3 = o0Var.f2491f;
            if (k1Var != null) {
                j1Var = k1Var.a(new p0(c1Var, d1Var, 0), new p0(c1Var, d1Var, 1));
            } else {
                j1Var = null;
            }
            if (k1Var2 != null) {
                j1Var2 = k1Var2.a(new p0(c1Var, d1Var, 2), new p0(c1Var, d1Var, 3));
            } else {
                j1Var2 = null;
            }
            if (q1Var.f3649a.c() == m0.PreEnter) {
                s2 s2Var = d1Var.f2403a;
            } else {
                s2 s2Var2 = d1Var.f2403a;
            }
            if (k1Var3 != null) {
                j1Var3 = k1Var3.a(e.f2408e0, new a4.q0(null, c1Var, d1Var, 4));
            } else {
                j1Var3 = null;
            }
            a4.q0 q0Var = new a4.q0(j1Var, j1Var2, j1Var3, 3);
            y3.i1 e10 = u0Var.e(j2);
            long j15 = (e10.B & 4294967295L) | (e10.A << 32);
            if (!x4.l.b(this.f2390r0, h0.f2427a)) {
                j10 = this.f2390r0;
            } else {
                j10 = j15;
            }
            d1.k1 k1Var4 = this.f2384k0;
            if (k1Var4 != null) {
                j1Var4 = k1Var4.a(this.f2392t0, new z0(this, j10, 0));
            }
            if (j1Var4 != null) {
                j15 = ((x4.l) j1Var4.getValue()).f14346a;
            }
            long d4 = x4.b.d(j2, j15);
            d1.k1 k1Var5 = this.f2385l0;
            long j16 = 0;
            if (k1Var5 != null) {
                j11 = ((x4.j) k1Var5.a(e.f2412i0, new z0(this, j10, 1)).getValue()).f14340a;
            } else {
                j11 = 0;
            }
            d1.k1 k1Var6 = this.f2386m0;
            if (k1Var6 != null) {
                j12 = ((x4.j) k1Var6.a(this.f2393u0, new z0(this, j10, 2)).getValue()).f14340a;
            } else {
                j12 = 0;
            }
            b3.d dVar = this.f2391s0;
            if (dVar != null) {
                long j17 = j10;
                j13 = j12;
                j16 = dVar.a(j17, d4, x4.m.Ltr);
            } else {
                j13 = j12;
            }
            return x0Var.u0((int) (d4 >> 32), (int) (d4 & 4294967295L), rVar, new y0(e10, x4.j.c(j16, j13), j11, q0Var));
        } else {
            y3.i1 e11 = u0Var.e(j2);
            return x0Var.u0(e11.A, e11.B, rVar, new c0(e11, 2));
        }
    }
}
