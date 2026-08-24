package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z10  reason: default package */
/* loaded from: classes.dex */
public final class z10 extends z64 implements jm3, mo1, va6, yy4, c74, xs4, kj3, ks2, rg2, kh2, ph2, aq4, c90 {
    public y64 k0;

    @Override // defpackage.kh2
    public final void A(fh2 fh2Var) {
        y64 y64Var = this.k0;
        p53.c("applyFocusProperties called on wrong node");
        y64Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.va6
    public final void A0(gb6 gb6Var) {
        y64 y64Var = this.k0;
        y64Var.getClass();
        lt ltVar = (lt) y64Var;
        ta6 ta6Var = new ta6();
        ta6Var.L = ltVar.a;
        ltVar.b.g(ta6Var);
        gb6Var.getClass();
        ta6 ta6Var2 = (ta6) gb6Var;
        ja4 ja4Var = ta6Var2.A;
        if (ta6Var.L) {
            ta6Var2.L = true;
        }
        if (ta6Var.R) {
            ta6Var2.R = true;
        }
        ja4 ja4Var2 = ta6Var.A;
        Object[] objArr = ja4Var2.b;
        Object[] objArr2 = ja4Var2.c;
        long[] jArr = ja4Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            fb6 fb6Var = (fb6) obj;
                            if (!ja4Var.b(fb6Var)) {
                                ja4Var.m(fb6Var, obj2);
                            } else if (obj2 instanceof y1) {
                                Object g = ja4Var.g(fb6Var);
                                g.getClass();
                                y1 y1Var = (y1) g;
                                String str = y1Var.a;
                                if (str == null) {
                                    str = ((y1) obj2).a;
                                }
                                ao2 ao2Var = y1Var.b;
                                if (ao2Var == null) {
                                    ao2Var = ((y1) obj2).b;
                                }
                                ja4Var.m(fb6Var, new y1(str, ao2Var));
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // defpackage.rg2
    public final void D(sh2 sh2Var) {
        y64 y64Var = this.k0;
        p53.c("onFocusEvent called on wrong node");
        y64Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.yy4
    public final void I() {
        this.k0.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.z64
    public final void J0() {
        R0(true);
    }

    @Override // defpackage.z64
    public final void K0() {
        if (!this.j0) {
            p53.c("unInitializeModifier called on unattached node");
        }
        if ((this.L & 8) != 0) {
            ((te) nc1.g0(this)).y();
        }
    }

    @Override // defpackage.mo1
    public final void O() {
        f04.I(this);
    }

    @Override // defpackage.yy4
    public final boolean P() {
        this.k0.getClass();
        throw new ClassCastException();
    }

    public final void R0(boolean z) {
        if (!this.j0) {
            p53.c("initializeModifier called on unattached node");
        }
        y64 y64Var = this.k0;
        if ((this.L & 4) != 0 && !z) {
            nc1.d0(this, 2).f1();
        }
        if ((this.L & 2) != 0) {
            vy6 vy6Var = (vy6) nc1.f0(this).B0.f;
            vy6Var.getClass();
            if (vy6Var.k0) {
                eg4 eg4Var = this.d0;
                eg4Var.getClass();
                ((mm3) eg4Var).A1(this);
                yp4 yp4Var = eg4Var.J0;
                if (yp4Var != null) {
                    ((xt2) yp4Var).c();
                }
            }
            if (!z) {
                nc1.d0(this, 2).f1();
                nc1.f0(this).E();
            }
        }
        if (y64Var instanceof gp3) {
            gp3 gp3Var = (gp3) y64Var;
            sm3 f0 = nc1.f0(this);
            switch (gp3Var.a) {
                case 0:
                    ((ip3) gp3Var.b).j = f0;
                    break;
                case 1:
                    ((pr3) gp3Var.b).l = f0;
                    break;
                default:
                    ((nr4) gp3Var.b).w.setValue(f0);
                    break;
            }
        }
        if ((this.L & 8) != 0) {
            ((te) nc1.g0(this)).y();
        }
    }

    @Override // defpackage.c74
    public final gi2 X() {
        return au1.e;
    }

    @Override // defpackage.jm3
    public final int Z(kz3 kz3Var, x24 x24Var, int i) {
        y64 y64Var = this.k0;
        y64Var.getClass();
        return ((hm3) y64Var).c(new sb3(kz3Var, kz3Var.getLayoutDirection()), new ce1(x24Var, k34.Max, l34.Height, 1), s21.b(0, i, 0, 0, 13)).getHeight();
    }

    @Override // defpackage.c90
    public final qh1 a() {
        return nc1.f0(this).u0;
    }

    @Override // defpackage.jm3
    public final f34 c(g34 g34Var, x24 x24Var, long j) {
        y64 y64Var = this.k0;
        y64Var.getClass();
        return ((hm3) y64Var).c(g34Var, x24Var, j);
    }

    @Override // defpackage.ks2
    public final void d0(eg4 eg4Var) {
        this.k0.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.c90
    public final long e() {
        return qo2.S(nc1.d0(this, 128).L);
    }

    @Override // defpackage.jm3
    public final int f(kz3 kz3Var, x24 x24Var, int i) {
        y64 y64Var = this.k0;
        y64Var.getClass();
        return ((hm3) y64Var).c(new sb3(kz3Var, kz3Var.getLayoutDirection()), new ce1(x24Var, k34.Max, l34.Width, 1), s21.b(0, 0, 0, i, 7)).getWidth();
    }

    @Override // defpackage.c90
    public final kk3 getLayoutDirection() {
        return nc1.f0(this).v0;
    }

    @Override // defpackage.jm3
    public final int h0(kz3 kz3Var, x24 x24Var, int i) {
        y64 y64Var = this.k0;
        y64Var.getClass();
        return ((hm3) y64Var).c(new sb3(kz3Var, kz3Var.getLayoutDirection()), new ce1(x24Var, k34.Min, l34.Height, 1), s21.b(0, i, 0, 0, 13)).getHeight();
    }

    @Override // defpackage.mo1
    public final void m0(um3 um3Var) {
        y64 y64Var = this.k0;
        y64Var.getClass();
        lo1 lo1Var = (lo1) y64Var;
        um3Var.b();
    }

    @Override // defpackage.aq4
    public final boolean r() {
        return this.j0;
    }

    @Override // defpackage.jm3
    public final int s0(kz3 kz3Var, x24 x24Var, int i) {
        y64 y64Var = this.k0;
        y64Var.getClass();
        return ((hm3) y64Var).c(new sb3(kz3Var, kz3Var.getLayoutDirection()), new ce1(x24Var, k34.Min, l34.Width, 1), s21.b(0, 0, 0, i, 7)).getWidth();
    }

    @Override // defpackage.xs4
    public final Object t(qh1 qh1Var, Object obj) {
        y64 y64Var = this.k0;
        y64Var.getClass();
        return ((ws4) y64Var).f();
    }

    public final String toString() {
        return this.k0.toString();
    }

    @Override // defpackage.yy4
    public final boolean u0() {
        this.k0.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.yy4
    public final void w(oy4 oy4Var, py4 py4Var, long j) {
        this.k0.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.xg1, defpackage.yy4
    public final void d() {
    }

    @Override // defpackage.kj3, defpackage.j34
    public final void b(long j) {
    }

    @Override // defpackage.kj3
    public final void m(jk3 jk3Var) {
    }
}
