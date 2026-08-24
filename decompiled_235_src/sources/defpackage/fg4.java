package defpackage;

import com.github.junrar.unpack.decode.Compress;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fg4  reason: default package */
/* loaded from: classes.dex */
public abstract class fg4 {
    public static final y94 a;

    static {
        y94 y94Var = th4.a;
        a = new y94();
    }

    public static final void a(z64 z64Var, int i, int i2) {
        if (z64Var instanceof zg1) {
            zg1 zg1Var = (zg1) z64Var;
            int i3 = zg1Var.k0;
            b(z64Var, i3 & i, i2);
            int i4 = (~i3) & i;
            for (z64 z64Var2 = zg1Var.l0; z64Var2 != null; z64Var2 = z64Var2.Y) {
                a(z64Var2, i4, i2);
            }
            return;
        }
        b(z64Var, i & z64Var.L, i2);
    }

    public static final void b(z64 z64Var, int i, int i2) {
        sm3 f0;
        if (i2 != 0 || z64Var.G0()) {
            if ((i & 2) != 0 && (z64Var instanceof jm3)) {
                xk2.w((jm3) z64Var);
                if (i2 == 2) {
                    nc1.d0(z64Var, 2).k1();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                nc1.f0(z64Var).E();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                nc1.f0(z64Var).U(false);
            }
            if ((i & 256) != 0 && (z64Var instanceof ks2)) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        nc1.f0(z64Var).a0(f0.J0 - 1);
                    }
                } else {
                    sm3 f02 = nc1.f0(z64Var);
                    f02.a0(f02.J0 + 1);
                }
                if (i2 != 2) {
                    sm3 f03 = nc1.f0(z64Var);
                    if (f03.J0 != 0 && !f03.p() && !f03.q() && !f03.I0) {
                        te teVar = (te) vm3.a(f03);
                        ap3 ap3Var = teVar.U0.e;
                        ap3Var.getClass();
                        if (f03.J0 > 0) {
                            ((ua4) ap3Var.B).b(f03);
                            f03.I0 = true;
                        }
                        teVar.C(null);
                    }
                }
            }
            if ((i & 4) != 0 && (z64Var instanceof mo1)) {
                f04.I((mo1) z64Var);
            }
            if ((i & 8) != 0 && (z64Var instanceof va6)) {
                nc1.f0(z64Var).n0 = true;
            }
            if ((i & 64) != 0 && (z64Var instanceof xs4)) {
                wm3 wm3Var = nc1.f0((xs4) z64Var).C0;
                wm3Var.p.m0 = true;
                rz3 rz3Var = wm3Var.q;
                if (rz3Var != null) {
                    rz3Var.s0 = true;
                }
            }
            if ((i & 2048) != 0 && (z64Var instanceof kh2)) {
                kh2 kh2Var = (kh2) z64Var;
                jj0.b = null;
                kh2Var.A(jj0.a);
                if (jj0.b != null) {
                    z64 z64Var2 = (z64) kh2Var;
                    if (!z64Var2.A.j0) {
                        p53.c("visitChildren called on an unattached node");
                    }
                    ua4 ua4Var = new ua4(new z64[16]);
                    z64 z64Var3 = z64Var2.A;
                    z64 z64Var4 = z64Var3.Y;
                    if (z64Var4 == null) {
                        nc1.z(ua4Var, z64Var3);
                    } else {
                        ua4Var.b(z64Var4);
                    }
                    while (true) {
                        int i3 = ua4Var.L;
                        if (i3 == 0) {
                            break;
                        }
                        z64 z64Var5 = (z64) ua4Var.l(i3 - 1);
                        if ((z64Var5.R & 1024) == 0) {
                            nc1.z(ua4Var, z64Var5);
                        } else {
                            while (true) {
                                if (z64Var5 == null) {
                                    break;
                                } else if ((z64Var5.L & 1024) != 0) {
                                    ua4 ua4Var2 = null;
                                    while (z64Var5 != null) {
                                        if (z64Var5 instanceof vh2) {
                                            vh2 vh2Var = (vh2) z64Var5;
                                            xg2 xg2Var = ((eh2) ((te) nc1.g0(vh2Var)).getFocusOwner()).d;
                                            if (xg2Var.c.a(vh2Var)) {
                                                xg2Var.a();
                                            }
                                        } else if ((z64Var5.L & 1024) != 0 && (z64Var5 instanceof zg1)) {
                                            int i4 = 0;
                                            for (z64 z64Var6 = ((zg1) z64Var5).l0; z64Var6 != null; z64Var6 = z64Var6.Y) {
                                                if ((z64Var6.L & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        z64Var5 = z64Var6;
                                                    } else {
                                                        if (ua4Var2 == null) {
                                                            ua4Var2 = new ua4(new z64[16]);
                                                        }
                                                        if (z64Var5 != null) {
                                                            ua4Var2.b(z64Var5);
                                                            z64Var5 = null;
                                                        }
                                                        ua4Var2.b(z64Var6);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        z64Var5 = nc1.A(ua4Var2);
                                    }
                                } else {
                                    z64Var5 = z64Var5.Y;
                                }
                            }
                        }
                    }
                }
            }
            if ((i & 4096) != 0 && (z64Var instanceof rg2)) {
                rg2 rg2Var = (rg2) z64Var;
                xg2 xg2Var2 = ((eh2) ((te) nc1.g0(rg2Var)).getFocusOwner()).d;
                if (xg2Var2.d.a(rg2Var)) {
                    xg2Var2.a();
                }
            }
            if ((i & 2097152) != 0 && (z64Var instanceof a53) && i2 == 2) {
                ((a53) z64Var).f0();
            }
        }
    }

    public static final void c(z64 z64Var) {
        if (!z64Var.j0) {
            p53.c("autoInvalidateUpdatedNode called on unattached node");
        }
        a(z64Var, -1, 0);
    }

    public static final int d(y64 y64Var) {
        int i;
        if (y64Var instanceof hm3) {
            i = 3;
        } else {
            i = 1;
        }
        if (y64Var instanceof lo1) {
            i |= 4;
        }
        if (y64Var instanceof lt) {
            i |= 8;
        }
        if (y64Var instanceof ws4) {
            i |= 64;
        }
        if (y64Var instanceof o70) {
            return 524288 | i;
        }
        return i;
    }

    public static final int e(z64 z64Var) {
        int i;
        int i2 = z64Var.L;
        if (i2 != 0) {
            return i2;
        }
        Class<?> cls = z64Var.getClass();
        y94 y94Var = a;
        int d = y94Var.d(cls);
        if (d >= 0) {
            return y94Var.c[d];
        }
        if (z64Var instanceof jm3) {
            i = 3;
        } else {
            i = 1;
        }
        if (z64Var instanceof mo1) {
            i |= 4;
        }
        if (z64Var instanceof va6) {
            i |= 8;
        }
        if (z64Var instanceof yy4) {
            i |= 16;
        }
        if (z64Var instanceof c74) {
            i |= 32;
        }
        if (z64Var instanceof xs4) {
            i |= 64;
        }
        if (z64Var instanceof kj3) {
            i |= 4194432;
        } else if (z64Var instanceof j34) {
            i |= 128;
        }
        if (z64Var instanceof ks2) {
            i |= 256;
        }
        if (z64Var instanceof cf6) {
            i |= 512;
        }
        if (z64Var instanceof vh2) {
            i |= 1024;
        }
        if (z64Var instanceof kh2) {
            i |= 2048;
        }
        if (z64Var instanceof rg2) {
            i |= 4096;
        }
        if (z64Var instanceof bh3) {
            i |= 8192;
        }
        if (z64Var instanceof ie) {
            i |= 16384;
        }
        if (z64Var instanceof fy0) {
            i |= 32768;
        }
        if (z64Var instanceof ub7) {
            i |= 262144;
        }
        if (z64Var instanceof o70) {
            i |= 524288;
        }
        if (z64Var instanceof a53) {
            i |= 2097152;
        }
        if (z64Var instanceof sp3) {
            i |= 8388608;
        }
        y94Var.g(i, cls);
        return i;
    }

    public static final int f(z64 z64Var) {
        if (z64Var instanceof zg1) {
            zg1 zg1Var = (zg1) z64Var;
            int i = zg1Var.k0;
            for (z64 z64Var2 = zg1Var.l0; z64Var2 != null; z64Var2 = z64Var2.Y) {
                i |= f(z64Var2);
            }
            return i;
        }
        return e(z64Var);
    }

    public static final boolean g(int i) {
        boolean z;
        boolean z2 = false;
        if ((i & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & Compress.MAXWINSIZE) != 0) {
            z2 = true;
        }
        return z | z2;
    }
}
