package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n74  reason: default package */
/* loaded from: classes.dex */
public abstract class n74 {
    public static final s14 a;

    static {
        s14 s14Var = a94.a;
        a = new s14();
    }

    public static final void a(yy3 yy3Var, int i, int i2) {
        if (yy3Var instanceof xc1) {
            xc1 xc1Var = (xc1) yy3Var;
            int i3 = xc1Var.j0;
            b(yy3Var, i3 & i, i2);
            int i4 = (~i3) & i;
            for (yy3 yy3Var2 = xc1Var.k0; yy3Var2 != null; yy3Var2 = yy3Var2.Y) {
                a(yy3Var2, i4, i2);
            }
            return;
        }
        b(yy3Var, i & yy3Var.L, i2);
    }

    public static final void b(yy3 yy3Var, int i, int i2) {
        vf3 P;
        if (i2 != 0 || yy3Var.G0()) {
            if ((i & 2) != 0 && (yy3Var instanceof mf3)) {
                hi2.D((mf3) yy3Var);
                if (i2 == 2) {
                    l.N(yy3Var, 2).k1();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                l.P(yy3Var).E();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                l.P(yy3Var).U(false);
            }
            if ((i & 256) != 0 && (yy3Var instanceof fm2)) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        l.P(yy3Var).a0(P.I0 - 1);
                    }
                } else {
                    vf3 P2 = l.P(yy3Var);
                    P2.a0(P2.I0 + 1);
                }
                if (i2 != 2) {
                    vf3 P3 = l.P(yy3Var);
                    if (P3.I0 != 0 && !P3.p() && !P3.q() && !P3.H0) {
                        ee eeVar = (ee) yf3.a(P3);
                        ci3 ci3Var = eeVar.T0.e;
                        ci3Var.getClass();
                        if (P3.I0 > 0) {
                            ((o24) ci3Var.B).b(P3);
                            P3.H0 = true;
                        }
                        eeVar.C(null);
                    }
                }
            }
            if ((i & 4) != 0 && (yy3Var instanceof gk1)) {
                n40.M((gk1) yy3Var);
            }
            if ((i & 8) != 0 && (yy3Var instanceof gz5)) {
                l.P(yy3Var).m0 = true;
            }
            if ((i & 64) != 0 && (yy3Var instanceof vj4)) {
                zf3 zf3Var = l.P((vj4) yy3Var).B0;
                zf3Var.p.l0 = true;
                ms3 ms3Var = zf3Var.q;
                if (ms3Var != null) {
                    ms3Var.r0 = true;
                }
            }
            if ((i & 2048) != 0 && (yy3Var instanceof tc2)) {
                tc2 tc2Var = (tc2) yy3Var;
                ah0.b = null;
                tc2Var.b0(ah0.a);
                if (ah0.b != null) {
                    yy3 yy3Var2 = (yy3) tc2Var;
                    if (!yy3Var2.A.i0) {
                        mz2.c("visitChildren called on an unattached node");
                    }
                    o24 o24Var = new o24(new yy3[16]);
                    yy3 yy3Var3 = yy3Var2.A;
                    yy3 yy3Var4 = yy3Var3.Y;
                    if (yy3Var4 == null) {
                        l.l(o24Var, yy3Var3);
                    } else {
                        o24Var.b(yy3Var4);
                    }
                    while (true) {
                        int i3 = o24Var.L;
                        if (i3 == 0) {
                            break;
                        }
                        yy3 yy3Var5 = (yy3) o24Var.l(i3 - 1);
                        if ((yy3Var5.R & 1024) == 0) {
                            l.l(o24Var, yy3Var5);
                        } else {
                            while (true) {
                                if (yy3Var5 == null) {
                                    break;
                                } else if ((yy3Var5.L & 1024) != 0) {
                                    o24 o24Var2 = null;
                                    while (yy3Var5 != null) {
                                        if (yy3Var5 instanceof ed2) {
                                            ed2 ed2Var = (ed2) yy3Var5;
                                            gc2 gc2Var = ((nc2) ((ee) l.Q(ed2Var)).getFocusOwner()).d;
                                            if (gc2Var.c.a(ed2Var)) {
                                                gc2Var.a();
                                            }
                                        } else if ((yy3Var5.L & 1024) != 0 && (yy3Var5 instanceof xc1)) {
                                            int i4 = 0;
                                            for (yy3 yy3Var6 = ((xc1) yy3Var5).k0; yy3Var6 != null; yy3Var6 = yy3Var6.Y) {
                                                if ((yy3Var6.L & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        yy3Var5 = yy3Var6;
                                                    } else {
                                                        if (o24Var2 == null) {
                                                            o24Var2 = new o24(new yy3[16]);
                                                        }
                                                        if (yy3Var5 != null) {
                                                            o24Var2.b(yy3Var5);
                                                            yy3Var5 = null;
                                                        }
                                                        o24Var2.b(yy3Var6);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        yy3Var5 = l.p(o24Var2);
                                    }
                                } else {
                                    yy3Var5 = yy3Var5.Y;
                                }
                            }
                        }
                    }
                }
            }
            if ((i & 4096) != 0 && (yy3Var instanceof ac2)) {
                ac2 ac2Var = (ac2) yy3Var;
                gc2 gc2Var2 = ((nc2) ((ee) l.Q(ac2Var)).getFocusOwner()).d;
                if (gc2Var2.d.a(ac2Var)) {
                    gc2Var2.a();
                }
            }
            if ((i & 2097152) != 0 && (yy3Var instanceof wy2) && i2 == 2) {
                ((wy2) yy3Var).E();
            }
        }
    }

    public static final void c(yy3 yy3Var) {
        if (!yy3Var.i0) {
            mz2.c("autoInvalidateUpdatedNode called on unattached node");
        }
        a(yy3Var, -1, 0);
    }

    public static final int d(xy3 xy3Var) {
        int i;
        if (xy3Var instanceof kf3) {
            i = 3;
        } else {
            i = 1;
        }
        if (xy3Var instanceof fk1) {
            i |= 4;
        }
        if (xy3Var instanceof vs) {
            i |= 8;
        }
        if (xy3Var instanceof uj4) {
            i |= 64;
        }
        if (xy3Var instanceof k50) {
            return 524288 | i;
        }
        return i;
    }

    public static final int e(yy3 yy3Var) {
        int i;
        int i2 = yy3Var.L;
        if (i2 != 0) {
            return i2;
        }
        Class<?> cls = yy3Var.getClass();
        s14 s14Var = a;
        int d = s14Var.d(cls);
        if (d >= 0) {
            return s14Var.c[d];
        }
        if (yy3Var instanceof mf3) {
            i = 3;
        } else {
            i = 1;
        }
        if (yy3Var instanceof gk1) {
            i |= 4;
        }
        if (yy3Var instanceof gz5) {
            i |= 8;
        }
        if (yy3Var instanceof up4) {
            i |= 16;
        }
        if (yy3Var instanceof bz3) {
            i |= 32;
        }
        if (yy3Var instanceof vj4) {
            i |= 64;
        }
        if (yy3Var instanceof sc3) {
            i |= 4194432;
        } else if (yy3Var instanceof yv3) {
            i |= 128;
        }
        if (yy3Var instanceof fm2) {
            i |= 256;
        }
        if (yy3Var instanceof q36) {
            i |= 512;
        }
        if (yy3Var instanceof ed2) {
            i |= 1024;
        }
        if (yy3Var instanceof tc2) {
            i |= 2048;
        }
        if (yy3Var instanceof ac2) {
            i |= 4096;
        }
        if (yy3Var instanceof ia3) {
            i |= 8192;
        }
        if (yy3Var instanceof td) {
            i |= 16384;
        }
        if (yy3Var instanceof jv0) {
            i |= 32768;
        }
        if (yy3Var instanceof zx6) {
            i |= 262144;
        }
        if (yy3Var instanceof k50) {
            i |= 524288;
        }
        if (yy3Var instanceof wy2) {
            i |= 2097152;
        }
        if (yy3Var instanceof ui3) {
            i |= 8388608;
        }
        s14Var.g(i, cls);
        return i;
    }

    public static final int f(yy3 yy3Var) {
        if (yy3Var instanceof xc1) {
            xc1 xc1Var = (xc1) yy3Var;
            int i = xc1Var.j0;
            for (yy3 yy3Var2 = xc1Var.k0; yy3Var2 != null; yy3Var2 = yy3Var2.Y) {
                i |= f(yy3Var2);
            }
            return i;
        }
        return e(yy3Var);
    }

    public static final boolean g(int i) {
        boolean z;
        boolean z2 = false;
        if ((i & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 4194304) != 0) {
            z2 = true;
        }
        return z | z2;
    }
}
