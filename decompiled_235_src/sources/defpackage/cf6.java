package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cf6  reason: default package */
/* loaded from: classes.dex */
public final class cf6 extends z64 implements mo1, c74, gi4, fy0, jm3 {
    public of5 k0;
    public boolean l0;
    public if6 m0;
    public ut2 n0;
    public final ri6 o0;

    public cf6(if6 if6Var) {
        this.m0 = if6Var;
        this.n0 = (ut2) if6Var.i0.getValue();
        ri6 ri6Var = new ri6(ef6.a);
        ri6Var.f.setValue(if6Var);
        this.o0 = ri6Var;
    }

    @Override // defpackage.z64
    public final void J0() {
        jx2.B(this, this.m0.e().i);
        U0();
        this.m0.A.setValue(Boolean.TRUE);
    }

    @Override // defpackage.z64
    public final void K0() {
        of5 of5Var;
        jk3 jk3Var = this.m0.e().b.X;
        if (jk3Var != null) {
            if (jk3Var.t() && this.l0) {
                of5Var = kj2.b(jk4.e(nc1.e0(this).P(0L), jk3Var.P(0L)), qo2.S(nc1.e0(this).L));
            } else {
                of5Var = null;
            }
            this.k0 = of5Var;
        }
        T0(null);
        if6 if6Var = this.m0;
        if6Var.g0 = null;
        if6Var.h0 = null;
        if6Var.A.setValue(Boolean.FALSE);
        this.l0 = false;
    }

    @Override // defpackage.z64
    public final void L0() {
        this.k0 = null;
        ut2 ut2Var = this.n0;
        if (ut2Var != null) {
            ((te) nc1.g0(this)).getGraphicsContext().a(ut2Var);
        }
        T0(((te) nc1.g0(this)).getGraphicsContext().b());
    }

    public final f34 R0(st stVar, x24 x24Var, long j) {
        long j2;
        boolean z;
        of5 c = this.m0.d().c();
        if (c == null) {
            mg5 mg5Var = this.m0.e().c;
            mg5Var.i();
            c = mg5Var.d().f((gf6) mg5Var.c);
        }
        if (c != null) {
            long Q = qo2.Q(c.c());
            int i = (int) (Q >> 32);
            int i2 = (int) (Q & 4294967295L);
            if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
                boolean z2 = false;
                if (i < 0) {
                    i = 0;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (i2 >= 0) {
                    z2 = true;
                }
                if (!(z2 & z)) {
                    r53.a("width and height must be >= 0");
                }
                j = s21.h(i, i, i2, i2);
            } else {
                StringBuilder sb = new StringBuilder("Error: Infinite width/height is invalid. animated bounds: ");
                sb.append(this.m0.d().c());
                u34.s(sb, ", current bounds: ", this.m0.e().c.d().c());
                return null;
            }
        }
        dx4 y = x24Var.y(j);
        if (this.m0.e().c.d().d()) {
            j2 = this.m0.e().b.A.b(nc1.e0(this)).m();
            int i3 = y.A;
            int i4 = y.B;
            ((qg6) this.m0.Y.getValue()).getClass();
        } else {
            j2 = (y.A << 32) | (y.B & 4294967295L);
        }
        return stVar.K((int) (j2 >> 32), (int) (j2 & 4294967295L), zt1.A, new bf6(this, y));
    }

    public final jk3 S0() {
        jk3 jk3Var = this.m0.e().b.X;
        if (jk3Var != null) {
            return jk3Var;
        }
        i.h("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
        return null;
    }

    public final void T0(ut2 ut2Var) {
        if (ut2Var == null) {
            ut2 ut2Var2 = this.n0;
            if (ut2Var2 != null) {
                ((te) nc1.g0(this)).getGraphicsContext().a(ut2Var2);
            }
        } else {
            this.m0.i0.setValue(ut2Var);
        }
        this.n0 = ut2Var;
    }

    public final void U0() {
        Object c;
        if0 if0Var;
        j41 j41Var = ef6.a;
        if6 if6Var = this.m0;
        au1 au1Var = au1.e;
        ri6 ri6Var = this.o0;
        if (ri6Var == au1Var) {
            p53.a("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!ri6Var.z(j41Var)) {
            p53.a("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + j41Var + " was not found.");
        }
        if (j41Var != ri6Var.e) {
            p53.c("Check failed.");
        }
        ri6Var.f.setValue(if6Var);
        if6 if6Var2 = this.m0;
        if (!this.A.j0) {
            p53.a("ModifierLocal accessed from an unattached node");
        }
        if (!this.A.j0) {
            p53.c("visitAncestors called on an unattached node");
        }
        z64 z64Var = this.A.X;
        sm3 f0 = nc1.f0(this);
        loop0: while (true) {
            if (f0 != null) {
                if ((((z64) f0.B0.g).R & 32) != 0) {
                    while (z64Var != null) {
                        if ((z64Var.L & 32) != 0) {
                            z64 z64Var2 = z64Var;
                            ua4 ua4Var = null;
                            while (z64Var2 != null) {
                                if (z64Var2 instanceof c74) {
                                    c74 c74Var = (c74) z64Var2;
                                    if (c74Var.X().z(j41Var)) {
                                        c = c74Var.X().D(j41Var);
                                        break loop0;
                                    }
                                } else if ((z64Var2.L & 32) != 0 && (z64Var2 instanceof zg1)) {
                                    int i = 0;
                                    for (z64 z64Var3 = ((zg1) z64Var2).l0; z64Var3 != null; z64Var3 = z64Var3.Y) {
                                        if ((z64Var3.L & 32) != 0) {
                                            i++;
                                            if (i == 1) {
                                                z64Var2 = z64Var3;
                                            } else {
                                                if (ua4Var == null) {
                                                    ua4Var = new ua4(new z64[16]);
                                                }
                                                if (z64Var2 != null) {
                                                    ua4Var.b(z64Var2);
                                                    z64Var2 = null;
                                                }
                                                ua4Var.b(z64Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                z64Var2 = nc1.A(ua4Var);
                            }
                            continue;
                        }
                        z64Var = z64Var.X;
                    }
                }
                f0 = f0.v();
                if (f0 != null && (if0Var = f0.B0) != null) {
                    z64Var = (vy6) if0Var.f;
                } else {
                    z64Var = null;
                }
            } else {
                c = j41Var.a.c();
                break;
            }
        }
        if6Var2.g0 = (if6) c;
        T0(((te) nc1.g0(this)).getGraphicsContext().b());
        this.l0 = false;
        this.m0.h0 = this;
    }

    @Override // defpackage.c74
    public final gi2 X() {
        return this.o0;
    }

    @Override // defpackage.jm3
    public final f34 c(g34 g34Var, x24 x24Var, long j) {
        dx4 y = x24Var.y(j);
        return g34Var.K(y.A, y.B, zt1.A, new bf6(y, this));
    }

    @Override // defpackage.gi4
    public final void l0() {
        this.m0.e().e();
        jx2.B(this, this.m0.e().i);
    }

    @Override // defpackage.mo1
    public final void m0(um3 um3Var) {
        rg6 rg6Var;
        gf6 e = this.m0.e();
        of5 c = e.c.d().c();
        if6 if6Var = this.m0;
        hj hjVar = null;
        if (if6Var.g() && c != null) {
            um3Var.getLayoutDirection();
            qh1 qh1Var = nc1.f0(this).u0;
            ((tg6) this.m0.d0.getValue()).getClass();
            if6 if6Var2 = (if6) ((rg6) this.m0.e0.getValue()).c.getValue();
            if (if6Var2 != null) {
                if6 if6Var3 = if6Var2.g0;
                if (if6Var3 != null) {
                    rg6Var = (rg6) if6Var3.e0.getValue();
                } else {
                    rg6Var = null;
                }
                if (rg6Var != null) {
                    if6 if6Var4 = (if6) rg6Var.c.getValue();
                    if (if6Var4 != null) {
                        hjVar = if6Var4.f0;
                    } else {
                        i.h("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
                        return;
                    }
                }
            } else {
                i.h("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
                return;
            }
        }
        if6Var.f0 = hjVar;
        ut2 ut2Var = (ut2) this.m0.i0.getValue();
        if (ut2Var != null) {
            mc mcVar = new mc(um3Var, c, e);
            long e2 = um3Var.A.e();
            ut2Var.e(um3Var, um3Var.getLayoutDirection(), (((int) Float.intBitsToFloat((int) (e2 >> 32))) << 32) | (((int) Float.intBitsToFloat((int) (e2 & 4294967295L))) & 4294967295L), new ln(um3Var, um3Var.B, mcVar, 6));
            if6 if6Var5 = this.m0;
            if (if6Var5.e().c.d().d() && (if6Var5.g() || !if6Var5.f())) {
                return;
            }
            oi2.u(um3Var, ut2Var);
            return;
        }
        StringBuilder sb = new StringBuilder("Error: Layer is null when accessed for shared bounds/element : ");
        sb.append((Object) e.a);
        boolean b = this.m0.d().b();
        boolean z = this.j0;
        sb.append(",target: ");
        sb.append(b);
        sb.append(", is attached: ");
        sb.append(z);
        throw new IllegalArgumentException(sb.toString().toString());
    }
}
