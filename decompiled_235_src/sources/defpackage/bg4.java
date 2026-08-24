package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bg4  reason: default package */
/* loaded from: classes.dex */
public final class bg4 implements cg4 {
    @Override // defpackage.cg4
    public final boolean b(z64 z64Var) {
        ua4 ua4Var = null;
        while (true) {
            int i = 0;
            if (z64Var == null) {
                return false;
            }
            if (z64Var instanceof yy4) {
                if (((yy4) z64Var).P()) {
                    return true;
                }
            } else if ((z64Var.L & 16) != 0 && (z64Var instanceof zg1)) {
                for (z64 z64Var2 = ((zg1) z64Var).l0; z64Var2 != null; z64Var2 = z64Var2.Y) {
                    if ((z64Var2.L & 16) != 0) {
                        i++;
                        if (i == 1) {
                            z64Var = z64Var2;
                        } else {
                            if (ua4Var == null) {
                                ua4Var = new ua4(new z64[16]);
                            }
                            if (z64Var != null) {
                                ua4Var.b(z64Var);
                                z64Var = null;
                            }
                            ua4Var.b(z64Var2);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            z64Var = nc1.A(ua4Var);
        }
    }

    @Override // defpackage.cg4
    public final int c() {
        return 16;
    }

    @Override // defpackage.cg4
    public final void e(sm3 sm3Var, long j, zx2 zx2Var, int i, boolean z) {
        sm3Var.A(j, zx2Var, i, z);
    }

    @Override // defpackage.cg4
    public final boolean g(zx2 zx2Var, sm3 sm3Var) {
        eg4 eg4Var = (eg4) sm3Var.B0.e;
        eg4Var.getClass();
        z64 a1 = eg4Var.a1(fg4.g(16));
        if (a1 != null && a1.j0) {
            if (!a1.A.j0) {
                p53.c("visitLocalDescendants called on an unattached node");
            }
            z64 z64Var = a1.A;
            if ((z64Var.R & 16) != 0) {
                while (z64Var != null) {
                    if ((z64Var.L & 16) != 0) {
                        z64 z64Var2 = z64Var;
                        ua4 ua4Var = null;
                        while (z64Var2 != null) {
                            if (z64Var2 instanceof yy4) {
                                if (((yy4) z64Var2).u0()) {
                                    zx2Var.L = zx2Var.A.b - 1;
                                    return true;
                                }
                            } else if ((z64Var2.L & 16) != 0 && (z64Var2 instanceof zg1)) {
                                int i = 0;
                                for (z64 z64Var3 = ((zg1) z64Var2).l0; z64Var3 != null; z64Var3 = z64Var3.Y) {
                                    if ((z64Var3.L & 16) != 0) {
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
                    z64Var = z64Var.Y;
                }
            }
        }
        return false;
    }

    @Override // defpackage.cg4
    public final boolean i(sm3 sm3Var) {
        return true;
    }
}
