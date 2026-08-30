package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j74  reason: default package */
/* loaded from: classes.dex */
public final class j74 implements k74 {
    @Override // defpackage.k74
    public final boolean d(yy3 yy3Var) {
        o24 o24Var = null;
        while (true) {
            int i = 0;
            if (yy3Var == null) {
                return false;
            }
            if (yy3Var instanceof up4) {
                if (((up4) yy3Var).z0()) {
                    return true;
                }
            } else if ((yy3Var.L & 16) != 0 && (yy3Var instanceof xc1)) {
                for (yy3 yy3Var2 = ((xc1) yy3Var).k0; yy3Var2 != null; yy3Var2 = yy3Var2.Y) {
                    if ((yy3Var2.L & 16) != 0) {
                        i++;
                        if (i == 1) {
                            yy3Var = yy3Var2;
                        } else {
                            if (o24Var == null) {
                                o24Var = new o24(new yy3[16]);
                            }
                            if (yy3Var != null) {
                                o24Var.b(yy3Var);
                                yy3Var = null;
                            }
                            o24Var.b(yy3Var2);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            yy3Var = l.p(o24Var);
        }
    }

    @Override // defpackage.k74
    public final int e() {
        return 16;
    }

    @Override // defpackage.k74
    public final void i(vf3 vf3Var, long j, yr2 yr2Var, int i, boolean z) {
        vf3Var.z(j, yr2Var, i, z);
    }

    @Override // defpackage.k74
    public final boolean j(yr2 yr2Var, vf3 vf3Var) {
        m74 m74Var = (m74) vf3Var.A0.e;
        m74Var.getClass();
        yy3 a1 = m74Var.a1(n74.g(16));
        if (a1 != null && a1.i0) {
            if (!a1.A.i0) {
                mz2.c("visitLocalDescendants called on an unattached node");
            }
            yy3 yy3Var = a1.A;
            if ((yy3Var.R & 16) != 0) {
                while (yy3Var != null) {
                    if ((yy3Var.L & 16) != 0) {
                        yy3 yy3Var2 = yy3Var;
                        o24 o24Var = null;
                        while (yy3Var2 != null) {
                            if (yy3Var2 instanceof up4) {
                                if (((up4) yy3Var2).g0()) {
                                    yr2Var.L = yr2Var.A.b - 1;
                                    return true;
                                }
                            } else if ((yy3Var2.L & 16) != 0 && (yy3Var2 instanceof xc1)) {
                                int i = 0;
                                for (yy3 yy3Var3 = ((xc1) yy3Var2).k0; yy3Var3 != null; yy3Var3 = yy3Var3.Y) {
                                    if ((yy3Var3.L & 16) != 0) {
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
                    yy3Var = yy3Var.Y;
                }
            }
        }
        return false;
    }

    @Override // defpackage.k74
    public final boolean l(vf3 vf3Var) {
        return true;
    }
}
