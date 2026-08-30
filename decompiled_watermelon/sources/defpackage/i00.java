package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i00  reason: default package */
/* loaded from: classes.dex */
public final class i00 extends yy3 implements mf3, gk1, gz5, up4, bz3, vj4, sc3, fm2, ac2, tc2, yc2, xg4, x60 {
    public xy3 j0;

    @Override // defpackage.xg4
    public final boolean D() {
        return this.i0;
    }

    @Override // defpackage.mf3
    public final int H(fs3 fs3Var, mv3 mv3Var, int i) {
        xy3 xy3Var = this.j0;
        xy3Var.getClass();
        return ((kf3) xy3Var).e(new g53(fs3Var, fs3Var.getLayoutDirection()), new ga1(mv3Var, zv3.Min, aw3.Height, 1), nz0.b(0, i, 0, 0, 13)).a();
    }

    @Override // defpackage.yy3
    public final void J0() {
        R0(true);
    }

    @Override // defpackage.vj4
    public final Object K(od1 od1Var, Object obj) {
        xy3 xy3Var = this.j0;
        xy3Var.getClass();
        return ((uj4) xy3Var).d();
    }

    @Override // defpackage.yy3
    public final void K0() {
        if (!this.i0) {
            mz2.c("unInitializeModifier called on unattached node");
        }
        if ((this.L & 8) != 0) {
            ((ee) l.Q(this)).y();
        }
    }

    @Override // defpackage.up4
    public final void O(kp4 kp4Var, lp4 lp4Var, long j) {
        this.j0.getClass();
        throw new ClassCastException();
    }

    public final void R0(boolean z) {
        if (!this.i0) {
            mz2.c("initializeModifier called on unattached node");
        }
        xy3 xy3Var = this.j0;
        if ((this.L & 4) != 0 && !z) {
            l.N(this, 2).f1();
        }
        if ((this.L & 2) != 0) {
            lm6 lm6Var = (lm6) l.P(this).A0.f;
            lm6Var.getClass();
            if (lm6Var.j0) {
                m74 m74Var = this.c0;
                m74Var.getClass();
                ((pf3) m74Var).A1(this);
                vg4 vg4Var = m74Var.I0;
                if (vg4Var != null) {
                    ((tn2) vg4Var).c();
                }
            }
            if (!z) {
                l.N(this, 2).f1();
                l.P(this).E();
            }
        }
        if (xy3Var instanceof ii3) {
            ii3 ii3Var = (ii3) xy3Var;
            vf3 P = l.P(this);
            switch (ii3Var.a) {
                case 0:
                    ((ki3) ii3Var.b).j = P;
                    break;
                case 1:
                    ((pk3) ii3Var.b).l = P;
                    break;
                default:
                    ((ki4) ii3Var.b).w.setValue(P);
                    break;
            }
        }
        if ((this.L & 8) != 0) {
            ((ee) l.Q(this)).y();
        }
    }

    @Override // defpackage.gk1
    public final void T(xf3 xf3Var) {
        xy3 xy3Var = this.j0;
        xy3Var.getClass();
        fk1 fk1Var = (fk1) xy3Var;
        xf3Var.a();
    }

    @Override // defpackage.mf3
    public final int Z(fs3 fs3Var, mv3 mv3Var, int i) {
        xy3 xy3Var = this.j0;
        xy3Var.getClass();
        return ((kf3) xy3Var).e(new g53(fs3Var, fs3Var.getLayoutDirection()), new ga1(mv3Var, zv3.Min, aw3.Width, 1), nz0.b(0, 0, 0, i, 7)).c();
    }

    @Override // defpackage.x60
    public final od1 b() {
        return l.P(this).t0;
    }

    @Override // defpackage.tc2
    public final void b0(oc2 oc2Var) {
        xy3 xy3Var = this.j0;
        mz2.c("applyFocusProperties called on wrong node");
        xy3Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.x60
    public final long d() {
        return hk2.U(l.N(this, 128).L);
    }

    @Override // defpackage.mf3
    public final uv3 e(vv3 vv3Var, mv3 mv3Var, long j) {
        xy3 xy3Var = this.j0;
        xy3Var.getClass();
        return ((kf3) xy3Var).e(vv3Var, mv3Var, j);
    }

    @Override // defpackage.ac2
    public final void e0(bd2 bd2Var) {
        xy3 xy3Var = this.j0;
        mz2.c("onFocusEvent called on wrong node");
        xy3Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.up4
    public final boolean g0() {
        this.j0.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.x60
    public final sd3 getLayoutDirection() {
        return l.P(this).u0;
    }

    @Override // defpackage.mf3
    public final int h(fs3 fs3Var, mv3 mv3Var, int i) {
        xy3 xy3Var = this.j0;
        xy3Var.getClass();
        return ((kf3) xy3Var).e(new g53(fs3Var, fs3Var.getLayoutDirection()), new ga1(mv3Var, zv3.Max, aw3.Width, 1), nz0.b(0, 0, 0, i, 7)).c();
    }

    @Override // defpackage.bz3
    public final ln2 m() {
        return rp1.L;
    }

    @Override // defpackage.gz5
    public final void p0(rz5 rz5Var) {
        xy3 xy3Var = this.j0;
        xy3Var.getClass();
        vs vsVar = (vs) xy3Var;
        ez5 ez5Var = new ez5();
        ez5Var.L = vsVar.a;
        vsVar.b.n(ez5Var);
        rz5Var.getClass();
        ez5 ez5Var2 = (ez5) rz5Var;
        d24 d24Var = ez5Var2.A;
        if (ez5Var.L) {
            ez5Var2.L = true;
        }
        if (ez5Var.R) {
            ez5Var2.R = true;
        }
        d24 d24Var2 = ez5Var.A;
        Object[] objArr = d24Var2.b;
        Object[] objArr2 = d24Var2.c;
        long[] jArr = d24Var2.a;
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
                            qz5 qz5Var = (qz5) obj;
                            if (!d24Var.b(qz5Var)) {
                                d24Var.m(qz5Var, obj2);
                            } else if (obj2 instanceof w1) {
                                Object g = d24Var.g(qz5Var);
                                g.getClass();
                                w1 w1Var = (w1) g;
                                String str = w1Var.a;
                                if (str == null) {
                                    str = ((w1) obj2).a;
                                }
                                wi2 wi2Var = w1Var.b;
                                if (wi2Var == null) {
                                    wi2Var = ((w1) obj2).b;
                                }
                                d24Var.m(qz5Var, new w1(str, wi2Var));
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

    @Override // defpackage.up4
    public final void q0() {
        this.j0.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.mf3
    public final int r(fs3 fs3Var, mv3 mv3Var, int i) {
        xy3 xy3Var = this.j0;
        xy3Var.getClass();
        return ((kf3) xy3Var).e(new g53(fs3Var, fs3Var.getLayoutDirection()), new ga1(mv3Var, zv3.Max, aw3.Height, 1), nz0.b(0, i, 0, 0, 13)).a();
    }

    public final String toString() {
        return this.j0.toString();
    }

    @Override // defpackage.gk1
    public final void x0() {
        n40.M(this);
    }

    @Override // defpackage.fm2
    public final void y(m74 m74Var) {
        this.j0.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.up4
    public final boolean z0() {
        this.j0.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.vc1
    public final void a() {
    }

    @Override // defpackage.sc3, defpackage.yv3
    public final void c(long j) {
    }

    @Override // defpackage.sc3
    public final void s(rd3 rd3Var) {
    }
}
