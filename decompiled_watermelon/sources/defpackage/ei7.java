package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ei7  reason: default package */
/* loaded from: classes.dex */
public abstract class ei7 {
    public static final boolean a(ed2 ed2Var, boolean z) {
        boolean z2;
        int i = fd2.a[ed2Var.W0().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        i.c();
                        return false;
                    }
                } else {
                    ed2 d = ii7.d(ed2Var);
                    if (d != null) {
                        z2 = a(d, z);
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        return false;
                    }
                    ed2Var.S0(bd2.ActiveParent, bd2.Inactive);
                    return true;
                }
            } else {
                return z;
            }
        }
        return true;
    }

    public static final gh7 b(xh7 xh7Var) {
        xh7Var.getClass();
        return new gh7(xh7Var.a, xh7Var.t);
    }

    public static final w41 c(ed2 ed2Var, int i) {
        int i2 = fd2.a[ed2Var.W0().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                w41 w41Var = null;
                if (i2 != 3) {
                    if (i2 != 4) {
                        i.c();
                        return null;
                    }
                } else {
                    ed2 d = ii7.d(ed2Var);
                    if (d != null) {
                        w41 c = c(d, i);
                        w41 w41Var2 = w41.None;
                        if (c != w41Var2) {
                            w41Var = c;
                        }
                        if (w41Var == null) {
                            if (!ed2Var.k0) {
                                ed2Var.k0 = true;
                                try {
                                    rc2 T0 = ed2Var.T0();
                                    dh0 dh0Var = new dh0(i);
                                    nc2 nc2Var = (nc2) ((ee) l.Q(ed2Var)).getFocusOwner();
                                    ed2 f = nc2Var.f();
                                    T0.k.n(dh0Var);
                                    ed2 f2 = nc2Var.f();
                                    if (dh0Var.b) {
                                        wc2 wc2Var = wc2.b;
                                        return w41.Cancelled;
                                    } else if (f != f2 && f2 != null) {
                                        if (wc2.d == wc2.c) {
                                            return w41.Cancelled;
                                        }
                                        return w41.Redirected;
                                    } else {
                                        return w41Var2;
                                    }
                                } finally {
                                    ed2Var.k0 = false;
                                }
                            }
                            return w41Var2;
                        }
                        return w41Var;
                    }
                    i.i("ActiveParent with no focused child");
                    return null;
                }
            } else {
                return w41.Cancelled;
            }
        }
        return w41.None;
    }

    public static final w41 d(ed2 ed2Var) {
        if (!ed2Var.l0) {
            ed2Var.l0 = true;
            try {
                rc2 T0 = ed2Var.T0();
                nc2 nc2Var = (nc2) ((ee) l.Q(ed2Var)).getFocusOwner();
                ed2 f = nc2Var.f();
                T0.j.getClass();
                ed2 f2 = nc2Var.f();
                if (f != f2 && f2 != null) {
                    if (wc2.d == wc2.c) {
                        return w41.Cancelled;
                    }
                    return w41.Redirected;
                }
            } finally {
                ed2Var.l0 = false;
            }
        }
        return w41.None;
    }

    public static final w41 e(ed2 ed2Var, int i) {
        ed2 ed2Var2;
        zc0 zc0Var;
        int i2 = fd2.a[ed2Var.W0().ordinal()];
        if (i2 != 1 && i2 != 2) {
            w41 w41Var = null;
            if (i2 != 3) {
                if (i2 == 4) {
                    if (!ed2Var.A.i0) {
                        mz2.c("visitAncestors called on an unattached node");
                    }
                    yy3 yy3Var = ed2Var.A.X;
                    vf3 P = l.P(ed2Var);
                    loop0: while (true) {
                        if (P != null) {
                            if ((((yy3) P.A0.g).R & 1024) != 0) {
                                while (yy3Var != null) {
                                    if ((yy3Var.L & 1024) != 0) {
                                        ed2Var2 = yy3Var;
                                        o24 o24Var = null;
                                        while (ed2Var2 != null) {
                                            if (ed2Var2 instanceof ed2) {
                                                break loop0;
                                            }
                                            if ((ed2Var2.L & 1024) != 0 && (ed2Var2 instanceof xc1)) {
                                                int i3 = 0;
                                                for (yy3 yy3Var2 = ((xc1) ed2Var2).k0; yy3Var2 != null; yy3Var2 = yy3Var2.Y) {
                                                    if ((yy3Var2.L & 1024) != 0) {
                                                        i3++;
                                                        if (i3 == 1) {
                                                            ed2Var2 = yy3Var2;
                                                        } else {
                                                            if (o24Var == null) {
                                                                o24Var = new o24(new yy3[16]);
                                                            }
                                                            if (ed2Var2 != null) {
                                                                o24Var.b(ed2Var2);
                                                                ed2Var2 = null;
                                                            }
                                                            o24Var.b(yy3Var2);
                                                        }
                                                    }
                                                }
                                                if (i3 == 1) {
                                                }
                                            }
                                            ed2Var2 = l.p(o24Var);
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
                            ed2Var2 = null;
                            break;
                        }
                    }
                    ed2 ed2Var3 = ed2Var2;
                    if (ed2Var3 == null) {
                        return w41.None;
                    }
                    int i4 = fd2.a[ed2Var3.W0().ordinal()];
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    w41 e = e(ed2Var3, i);
                                    if (e != w41.None) {
                                        w41Var = e;
                                    }
                                    if (w41Var == null) {
                                        return d(ed2Var3);
                                    }
                                    return w41Var;
                                }
                                i.c();
                                return null;
                            }
                            return e(ed2Var3, i);
                        }
                        return w41.Cancelled;
                    }
                    return d(ed2Var3);
                }
                i.c();
                return null;
            }
            ed2 d = ii7.d(ed2Var);
            if (d != null) {
                return c(d, i);
            }
            i.i("ActiveParent with no focused child");
            return null;
        }
        return w41.None;
    }
}
