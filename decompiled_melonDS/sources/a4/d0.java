package a4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 extends r1 {
    public static final cd.h1 R0;
    public a0 N0;
    public x4.a O0;
    public b0 P0;
    public y3.h Q0;

    static {
        cd.h1 f8 = i3.z.f();
        int i2 = i3.s.f6688i;
        f8.j(i3.s.f6685f);
        f8.p(1.0f);
        f8.q(1);
        R0 = f8;
    }

    public d0(o0 o0Var, a0 a0Var) {
        super(o0Var);
        b0 b0Var;
        this.N0 = a0Var;
        if (o0Var.f280d0 != null) {
            b0Var = new b0(this);
        } else {
            b0Var = null;
        }
        this.P0 = b0Var;
        this.Q0 = (((b3.o) a0Var).A.L & 512) != 0 ? new y3.h(this, (c1.l1) a0Var) : null;
    }

    @Override // a4.r1
    public final void S0() {
        if (this.P0 == null) {
            this.P0 = new b0(this);
        }
    }

    @Override // a4.r1
    public final y0 V0() {
        return this.P0;
    }

    @Override // a4.r1
    public final b3.o X0() {
        return ((b3.o) this.N0).A;
    }

    @Override // y3.u0
    public final int b0(int i2) {
        y3.h hVar = this.Q0;
        if (hVar != null) {
            c1.l1 l1Var = hVar.B;
            r1 r1Var = this.f318l0;
            r1Var.getClass();
            r1 r1Var2 = l1Var.A.f1771b0;
            r1Var2.getClass();
            y0 V0 = r1Var2.V0();
            V0.getClass();
            if (V0.D0()) {
                return l1Var.O0(new y3.f(hVar, hVar.getLayoutDirection()), new t1(r1Var, v1.Min, w1.Width, 0), x4.b.b(0, i2, 7)).c();
            }
            return r1Var.b0(i2);
        }
        a0 a0Var = this.N0;
        r1 r1Var3 = this.f318l0;
        r1Var3.getClass();
        return a0Var.y0(this, r1Var3, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        if (((c1.r2) r2.f2435g) != c1.r2.MatchFound) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
        if (r1.f2464k0.e().f2495b.b() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00aa, code lost:
        if (r9 == r1.B) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
    @Override // y3.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y3.i1 e(long r8) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.d0.e(long):y3.i1");
    }

    @Override // y3.u0
    public final int g(int i2) {
        y3.h hVar = this.Q0;
        if (hVar != null) {
            c1.l1 l1Var = hVar.B;
            r1 r1Var = this.f318l0;
            r1Var.getClass();
            r1 r1Var2 = l1Var.A.f1771b0;
            r1Var2.getClass();
            y0 V0 = r1Var2.V0();
            V0.getClass();
            if (V0.D0()) {
                return l1Var.O0(new y3.f(hVar, hVar.getLayoutDirection()), new t1(r1Var, v1.Max, w1.Height, 0), x4.b.b(i2, 0, 13)).a();
            }
            return r1Var.g(i2);
        }
        a0 a0Var = this.N0;
        r1 r1Var3 = this.f318l0;
        r1Var3.getClass();
        return a0Var.K(this, r1Var3, i2);
    }

    @Override // y3.u0
    public final int g0(int i2) {
        y3.h hVar = this.Q0;
        if (hVar != null) {
            c1.l1 l1Var = hVar.B;
            r1 r1Var = this.f318l0;
            r1Var.getClass();
            r1 r1Var2 = l1Var.A.f1771b0;
            r1Var2.getClass();
            y0 V0 = r1Var2.V0();
            V0.getClass();
            if (V0.D0()) {
                return l1Var.O0(new y3.f(hVar, hVar.getLayoutDirection()), new t1(r1Var, v1.Max, w1.Width, 0), x4.b.b(0, i2, 7)).c();
            }
            return r1Var.g0(i2);
        }
        a0 a0Var = this.N0;
        r1 r1Var3 = this.f318l0;
        r1Var3.getClass();
        return a0Var.p0(this, r1Var3, i2);
    }

    @Override // y3.u0
    public final int h0(int i2) {
        y3.h hVar = this.Q0;
        if (hVar != null) {
            c1.l1 l1Var = hVar.B;
            r1 r1Var = this.f318l0;
            r1Var.getClass();
            r1 r1Var2 = l1Var.A.f1771b0;
            r1Var2.getClass();
            y0 V0 = r1Var2.V0();
            V0.getClass();
            if (V0.D0()) {
                return l1Var.O0(new y3.f(hVar, hVar.getLayoutDirection()), new t1(r1Var, v1.Min, w1.Height, 0), x4.b.b(i2, 0, 13)).a();
            }
            return r1Var.h0(i2);
        }
        a0 a0Var = this.N0;
        r1 r1Var3 = this.f318l0;
        r1Var3.getClass();
        return a0Var.B0(this, r1Var3, i2);
    }

    @Override // a4.r1
    public final void m1(i3.q qVar, l3.b bVar) {
        r1 r1Var;
        r1 r1Var2 = this.f318l0;
        r1Var2.getClass();
        r1Var2.Q0(qVar, bVar);
        if (((b4.x) s0.a(this.f315i0)).getShowLayoutBounds() && (r1Var = this.f318l0) != null) {
            if (!x4.l.b(this.L, r1Var.L) || !x4.j.a(r1Var.f327v0, 0L)) {
                long j2 = this.L;
                qVar.f(0.5f, 0.5f, ((int) (j2 >> 32)) - 0.5f, ((int) (j2 & 4294967295L)) - 0.5f, R0);
            }
        }
    }

    @Override // y3.i1
    public final void q0(long j2, float f8, mc.l lVar) {
        boolean z10;
        x4.l lVar2;
        if (this.f316j0) {
            y0 V0 = V0();
            V0.getClass();
            n1(V0.f372j0, f8, lVar);
        } else {
            n1(j2, f8, lVar);
        }
        if (!this.f361d0) {
            i1();
            r1 r1Var = this.f318l0;
            r1Var.getClass();
            y3.h hVar = this.Q0;
            if (hVar != null) {
                this.P0.getClass();
                if (!hVar.L) {
                    long j10 = this.L;
                    b0 b0Var = this.P0;
                    x4.l lVar3 = null;
                    if (b0Var != null) {
                        lVar2 = new x4.l(b0Var.N0());
                    } else {
                        lVar2 = null;
                    }
                    if (x4.l.a(j10, lVar2)) {
                        long j11 = r1Var.L;
                        y0 V02 = r1Var.V0();
                        if (V02 != null) {
                            lVar3 = new x4.l(V02.N0());
                        }
                        if (x4.l.a(j11, lVar3)) {
                            z10 = true;
                            r1Var.f316j0 = z10;
                        }
                    }
                }
                z10 = false;
                r1Var.f316j0 = z10;
            }
            r1Var.f362e0 = this.f362e0;
            F0().b();
            r1Var.f362e0 = false;
            r1Var.f316j0 = false;
        }
    }

    @Override // a4.x0
    public final int w0(y3.q qVar) {
        b0 b0Var = this.P0;
        if (b0Var != null) {
            a1.d0 d0Var = b0Var.f376n0;
            int d4 = d0Var.d(qVar);
            if (d4 >= 0) {
                return d0Var.f34c[d4];
            }
            return Integer.MIN_VALUE;
        }
        return l.c(this, qVar);
    }

    public final void y1(a0 a0Var) {
        if (!a0Var.equals(this.N0)) {
            if ((((b3.o) a0Var).A.L & 512) != 0) {
                c1.l1 l1Var = (c1.l1) a0Var;
                y3.h hVar = this.Q0;
                if (hVar != null) {
                    hVar.B = l1Var;
                } else {
                    hVar = new y3.h(this, l1Var);
                }
                this.Q0 = hVar;
            } else {
                this.Q0 = null;
            }
        }
        this.N0 = a0Var;
    }
}
