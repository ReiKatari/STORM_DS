package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q36  reason: default package */
/* loaded from: classes.dex */
public final class q36 extends yy3 implements gk1, bz3, m94, jv0, mf3 {
    public y55 j0;
    public boolean k0;
    public w36 l0;
    public pn2 m0;
    public final d76 n0;

    public q36(w36 w36Var) {
        this.l0 = w36Var;
        this.m0 = (pn2) w36Var.h0.getValue();
        d76 d76Var = new d76(s36.a);
        d76Var.R.setValue(w36Var);
        this.n0 = d76Var;
    }

    @Override // defpackage.yy3
    public final void J0() {
        nk2.Q(this, this.l0.e().i);
        U0();
        this.l0.A.setValue(Boolean.TRUE);
    }

    @Override // defpackage.yy3
    public final void K0() {
        y55 y55Var;
        rd3 rd3Var = this.l0.e().b.X;
        if (rd3Var != null) {
            if (rd3Var.c0() && this.k0) {
                y55Var = yf2.b(mb4.d(l.O(this).Q(0L), rd3Var.Q(0L)), hk2.U(l.O(this).L));
            } else {
                y55Var = null;
            }
            this.j0 = y55Var;
        }
        T0(null);
        w36 w36Var = this.l0;
        w36Var.f0 = null;
        w36Var.g0 = null;
        w36Var.A.setValue(Boolean.FALSE);
        this.k0 = false;
    }

    @Override // defpackage.yy3
    public final void L0() {
        this.j0 = null;
        pn2 pn2Var = this.m0;
        if (pn2Var != null) {
            ((ee) l.Q(this)).getGraphicsContext().a(pn2Var);
        }
        T0(((ee) l.Q(this)).getGraphicsContext().b());
    }

    @Override // defpackage.m94
    public final void Q() {
        this.l0.e().e();
        nk2.Q(this, this.l0.e().i);
    }

    public final uv3 R0(ct ctVar, mv3 mv3Var, long j) {
        long j2;
        boolean z;
        y55 c = this.l0.d().c();
        if (c == null) {
            w65 w65Var = this.l0.e().c;
            w65Var.i();
            c = w65Var.d().f((u36) w65Var.c);
        }
        if (c != null) {
            long R = hk2.R(c.c());
            int i = (int) (R >> 32);
            int i2 = (int) (R & 4294967295L);
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
                    oz2.a("width and height must be >= 0");
                }
                j = nz0.h(i, i, i2, i2);
            } else {
                StringBuilder sb = new StringBuilder("Error: Infinite width/height is invalid. animated bounds: ");
                sb.append(this.l0.d().c());
                f81.n(sb, ", current bounds: ", this.l0.e().c.d().c());
                return null;
            }
        }
        yn4 c2 = mv3Var.c(j);
        if (this.l0.e().c.d().d()) {
            j2 = this.l0.e().b.A.a(l.O(this)).O();
            int i3 = c2.A;
            int i4 = c2.B;
            ((e56) this.l0.Y.getValue()).getClass();
        } else {
            j2 = (c2.A << 32) | (c2.B & 4294967295L);
        }
        return ctVar.s0((int) (j2 >> 32), (int) (j2 & 4294967295L), qp1.A, new p36(this, c2));
    }

    public final rd3 S0() {
        rd3 rd3Var = this.l0.e().b.X;
        if (rd3Var != null) {
            return rd3Var;
        }
        i.i("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
        return null;
    }

    @Override // defpackage.gk1
    public final void T(xf3 xf3Var) {
        f56 f56Var;
        u36 e = this.l0.e();
        y55 c = e.c.d().c();
        w36 w36Var = this.l0;
        vi viVar = null;
        if (w36Var.g() && c != null) {
            xf3Var.getLayoutDirection();
            od1 od1Var = l.P(this).t0;
            ((h56) this.l0.c0.getValue()).getClass();
            w36 w36Var2 = (w36) ((f56) this.l0.d0.getValue()).c.getValue();
            if (w36Var2 != null) {
                w36 w36Var3 = w36Var2.f0;
                if (w36Var3 != null) {
                    f56Var = (f56) w36Var3.d0.getValue();
                } else {
                    f56Var = null;
                }
                if (f56Var != null) {
                    w36 w36Var4 = (w36) f56Var.c.getValue();
                    if (w36Var4 != null) {
                        viVar = w36Var4.e0;
                    } else {
                        i.i("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
                        return;
                    }
                }
            } else {
                i.i("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
                return;
            }
        }
        w36Var.e0 = viVar;
        pn2 pn2Var = (pn2) this.l0.h0.getValue();
        if (pn2Var != null) {
            yb ybVar = new yb(xf3Var, c, e);
            long d = xf3Var.A.d();
            pn2Var.e(xf3Var, xf3Var.getLayoutDirection(), (((int) Float.intBitsToFloat((int) (d >> 32))) << 32) | (((int) Float.intBitsToFloat((int) (d & 4294967295L))) & 4294967295L), new zm(xf3Var, xf3Var.B, ybVar, 6));
            w36 w36Var5 = this.l0;
            if (w36Var5.e().c.d().d() && (w36Var5.g() || !w36Var5.f())) {
                return;
            }
            sn2.v(xf3Var, pn2Var);
            return;
        }
        StringBuilder sb = new StringBuilder("Error: Layer is null when accessed for shared bounds/element : ");
        sb.append((Object) e.a);
        boolean b = this.l0.d().b();
        boolean z = this.i0;
        sb.append(",target: ");
        sb.append(b);
        sb.append(", is attached: ");
        sb.append(z);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void T0(pn2 pn2Var) {
        if (pn2Var == null) {
            pn2 pn2Var2 = this.m0;
            if (pn2Var2 != null) {
                ((ee) l.Q(this)).getGraphicsContext().a(pn2Var2);
            }
        } else {
            this.l0.h0.setValue(pn2Var);
        }
        this.m0 = pn2Var;
    }

    public final void U0() {
        Object c;
        zc0 zc0Var;
        b11 b11Var = s36.a;
        w36 w36Var = this.l0;
        rp1 rp1Var = rp1.L;
        d76 d76Var = this.n0;
        if (d76Var == rp1Var) {
            mz2.a("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!d76Var.y(b11Var)) {
            mz2.a("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + b11Var + " was not found.");
        }
        if (b11Var != d76Var.L) {
            mz2.c("Check failed.");
        }
        d76Var.R.setValue(w36Var);
        w36 w36Var2 = this.l0;
        if (!this.A.i0) {
            mz2.a("ModifierLocal accessed from an unattached node");
        }
        if (!this.A.i0) {
            mz2.c("visitAncestors called on an unattached node");
        }
        yy3 yy3Var = this.A.X;
        vf3 P = l.P(this);
        loop0: while (true) {
            if (P != null) {
                if ((((yy3) P.A0.g).R & 32) != 0) {
                    while (yy3Var != null) {
                        if ((yy3Var.L & 32) != 0) {
                            yy3 yy3Var2 = yy3Var;
                            o24 o24Var = null;
                            while (yy3Var2 != null) {
                                if (yy3Var2 instanceof bz3) {
                                    bz3 bz3Var = (bz3) yy3Var2;
                                    if (bz3Var.m().y(b11Var)) {
                                        c = bz3Var.m().C(b11Var);
                                        break loop0;
                                    }
                                } else if ((yy3Var2.L & 32) != 0 && (yy3Var2 instanceof xc1)) {
                                    int i = 0;
                                    for (yy3 yy3Var3 = ((xc1) yy3Var2).k0; yy3Var3 != null; yy3Var3 = yy3Var3.Y) {
                                        if ((yy3Var3.L & 32) != 0) {
                                            i++;
                                            if (i == 1) {
                                                yy3Var2 = yy3Var3;
                                            } else {
                                                if (o24Var == null) {
                                                    o24Var = new o24(new yy3[16]);
                                                }
                                                if (yy3Var2 != null) {
                                                    o24Var.b(yy3Var2);
                                                    yy3Var2 = null;
                                                }
                                                o24Var.b(yy3Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                yy3Var2 = l.p(o24Var);
                            }
                            continue;
                        }
                        yy3Var = yy3Var.X;
                    }
                }
                P = P.u();
                if (P != null && (zc0Var = P.A0) != null) {
                    yy3Var = (lm6) zc0Var.f;
                } else {
                    yy3Var = null;
                }
            } else {
                c = b11Var.a.c();
                break;
            }
        }
        w36Var2.f0 = (w36) c;
        T0(((ee) l.Q(this)).getGraphicsContext().b());
        this.k0 = false;
        this.l0.g0 = this;
    }

    @Override // defpackage.mf3
    public final uv3 e(vv3 vv3Var, mv3 mv3Var, long j) {
        yn4 c = mv3Var.c(j);
        return vv3Var.s0(c.A, c.B, qp1.A, new p36(c, this));
    }

    @Override // defpackage.bz3
    public final ln2 m() {
        return this.n0;
    }
}
