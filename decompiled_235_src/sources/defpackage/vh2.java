package defpackage;

import android.os.Trace;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vh2  reason: default package */
/* loaded from: classes.dex */
public final class vh2 extends z64 implements fy0, kj3, gi4, c74, xg1 {
    public final eo2 k0;
    public boolean l0;
    public boolean m0;
    public final int n0;

    public vh2(int i, eo2 eo2Var, int i2) {
        this.k0 = (i2 & 4) != 0 ? null : eo2Var;
        this.n0 = i;
    }

    @Override // defpackage.z64
    public final boolean G0() {
        return false;
    }

    @Override // defpackage.z64
    public final void K0() {
        int i = uh2.b[W0().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i == 4) {
                    return;
                }
                i.d();
                return;
            }
            ((te) nc1.g0(this)).getFocusOwner();
            yh2.q(this);
            return;
        }
        eh2 eh2Var = (eh2) ((te) nc1.g0(this)).getFocusOwner();
        eh2Var.b(8, true, false);
        eh2Var.d.a();
    }

    @Override // defpackage.z64
    public final void L0() {
        if (W0().isFocused()) {
            ((eh2) ((te) nc1.g0(this)).getFocusOwner()).b(8, true, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v55, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object[], java.lang.Object] */
    public final boolean R0(int i) {
        ua4 ua4Var;
        sh2 sh2Var;
        z64 z64Var;
        if0 if0Var;
        eh2 eh2Var;
        boolean z;
        int i2;
        ua4 ua4Var2;
        Boolean bool;
        int i3;
        int i4;
        if0 if0Var2;
        ua4 ua4Var3;
        int i5 = uh2.a[jx2.G(this, i).ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                return true;
            }
            if (i5 != 3 && i5 != 4) {
                i.d();
                return false;
            }
        } else {
            eh2 eh2Var2 = (eh2) ((te) nc1.g0(this)).getFocusOwner();
            vh2 f = eh2Var2.f();
            sh2 W0 = W0();
            if (f == this) {
                S0(W0, W0);
                return true;
            } else if (f != null || ((eh2) ((te) nc1.g0(this)).getFocusOwner()).a.B()) {
                if (f != null) {
                    ua4Var = new ua4(new vh2[16]);
                    if (!f.A.j0) {
                        p53.c("visitAncestors called on an unattached node");
                    }
                    z64 z64Var2 = f.A.X;
                    sm3 f0 = nc1.f0(f);
                    while (f0 != null) {
                        if ((((z64) f0.B0.g).R & 1024) != 0) {
                            while (z64Var2 != null) {
                                if ((z64Var2.L & 1024) != 0) {
                                    z64 z64Var3 = z64Var2;
                                    ua4 ua4Var4 = null;
                                    while (z64Var3 != null) {
                                        if (z64Var3 instanceof vh2) {
                                            ua4Var.b((vh2) z64Var3);
                                        } else if ((z64Var3.L & 1024) != 0 && (z64Var3 instanceof zg1)) {
                                            int i6 = 0;
                                            for (z64 z64Var4 = ((zg1) z64Var3).l0; z64Var4 != null; z64Var4 = z64Var4.Y) {
                                                if ((z64Var4.L & 1024) != 0) {
                                                    i6++;
                                                    if (i6 == 1) {
                                                        z64Var3 = z64Var4;
                                                    } else {
                                                        if (ua4Var4 == null) {
                                                            ua4Var3 = new ua4(new z64[16]);
                                                        } else {
                                                            ua4Var3 = ua4Var4;
                                                        }
                                                        if (z64Var3 != null) {
                                                            ua4Var3.b(z64Var3);
                                                            z64Var3 = null;
                                                        }
                                                        ua4Var3.b(z64Var4);
                                                        ua4Var4 = ua4Var3;
                                                    }
                                                }
                                            }
                                            if (i6 == 1) {
                                            }
                                        }
                                        z64Var3 = nc1.A(ua4Var4);
                                    }
                                }
                                z64Var2 = z64Var2.X;
                            }
                        }
                        f0 = f0.v();
                        if (f0 != null && (if0Var2 = f0.B0) != null) {
                            z64Var2 = (vy6) if0Var2.f;
                        } else {
                            z64Var2 = null;
                        }
                    }
                } else {
                    ua4Var = null;
                }
                vh2[] vh2VarArr = new vh2[16];
                vh2[] vh2VarArr2 = new vh2[16];
                if (!this.A.j0) {
                    p53.c("visitAncestors called on an unattached node");
                }
                z64 z64Var5 = this.A.X;
                sm3 f02 = nc1.f0(this);
                int i7 = 0;
                int i8 = 0;
                boolean z2 = true;
                z64 z64Var6 = z64Var5;
                while (f02 != null) {
                    if ((((z64) f02.B0.g).R & 1024) != 0) {
                        for (z64 z64Var7 = z64Var6; z64Var7 != null; z64Var7 = z64Var7.X) {
                            if ((z64Var7.L & 1024) != 0) {
                                z64 z64Var8 = z64Var7;
                                ua4 ua4Var5 = null;
                                while (z64Var8 != null) {
                                    if (z64Var8 instanceof vh2) {
                                        vh2 vh2Var = (vh2) z64Var8;
                                        if (ua4Var != null) {
                                            bool = Boolean.valueOf(ua4Var.j(vh2Var));
                                        } else {
                                            bool = null;
                                        }
                                        if (nb3.k(bool, Boolean.TRUE)) {
                                            int i9 = i7 + 1;
                                            if (vh2VarArr.length < i9) {
                                                int length = vh2VarArr.length;
                                                eh2Var = eh2Var2;
                                                ?? r1 = new Object[Math.max(i9, length * 2)];
                                                i4 = i9;
                                                System.arraycopy(vh2VarArr, 0, r1, 0, length);
                                                vh2VarArr = r1;
                                            } else {
                                                eh2Var = eh2Var2;
                                                i4 = i9;
                                            }
                                            vh2VarArr[i7] = vh2Var;
                                            i7 = i4;
                                        } else {
                                            eh2Var = eh2Var2;
                                            int i10 = i8 + 1;
                                            if (vh2VarArr2.length < i10) {
                                                int length2 = vh2VarArr2.length;
                                                ?? r6 = new Object[Math.max(i10, length2 * 2)];
                                                i3 = i10;
                                                System.arraycopy(vh2VarArr2, 0, r6, 0, length2);
                                                vh2VarArr2 = r6;
                                            } else {
                                                i3 = i10;
                                            }
                                            vh2VarArr2[i8] = vh2Var;
                                            i8 = i3;
                                        }
                                        if (vh2Var == f) {
                                            z2 = false;
                                        }
                                        z = false;
                                    } else {
                                        eh2Var = eh2Var2;
                                        z = true;
                                    }
                                    if (z && (z64Var8.L & 1024) != 0 && (z64Var8 instanceof zg1)) {
                                        z64 z64Var9 = ((zg1) z64Var8).l0;
                                        int i11 = 0;
                                        z64Var8 = z64Var8;
                                        while (z64Var9 != null) {
                                            if ((z64Var9.L & 1024) != 0) {
                                                int i12 = i11 + 1;
                                                if (i12 == 1) {
                                                    z64Var8 = z64Var9;
                                                    i2 = i12;
                                                } else {
                                                    if (ua4Var5 == null) {
                                                        i2 = i12;
                                                        ua4Var2 = new ua4(new z64[16]);
                                                    } else {
                                                        i2 = i12;
                                                        ua4Var2 = ua4Var5;
                                                    }
                                                    if (z64Var8 != null) {
                                                        ua4Var2.b(z64Var8);
                                                        z64Var8 = null;
                                                    }
                                                    ua4Var2.b(z64Var9);
                                                    ua4Var5 = ua4Var2;
                                                    z64Var8 = z64Var8;
                                                }
                                                i11 = i2;
                                            }
                                            z64Var9 = z64Var9.Y;
                                            z64Var8 = z64Var8;
                                        }
                                        if (i11 == 1) {
                                            eh2Var2 = eh2Var;
                                        }
                                    }
                                    z64Var8 = nc1.A(ua4Var5);
                                    eh2Var2 = eh2Var;
                                }
                            }
                            eh2Var2 = eh2Var2;
                        }
                    }
                    eh2 eh2Var3 = eh2Var2;
                    f02 = f02.v();
                    if (f02 != null && (if0Var = f02.B0) != null) {
                        z64Var = (vy6) if0Var.f;
                    } else {
                        z64Var = null;
                    }
                    eh2Var2 = eh2Var3;
                    z64Var6 = z64Var;
                }
                eh2 eh2Var4 = eh2Var2;
                if (!z2 || f == null || jx2.l(f, false)) {
                    jx2.B(this, new pj(this, 8));
                    int i13 = wh2.a[W0().ordinal()];
                    if (i13 != 1 && i13 != 2) {
                        if (i13 != 3 && i13 != 4) {
                            i.d();
                            return false;
                        }
                        ((eh2) ((te) nc1.g0(this)).getFocusOwner()).i(this);
                    }
                    if (z2 && f != null) {
                        f.S0(sh2.Active, sh2.Inactive);
                    }
                    if (ua4Var != null) {
                        int i14 = ua4Var.L - 1;
                        Object[] objArr = ua4Var.A;
                        if (i14 < objArr.length) {
                            while (i14 >= 0) {
                                vh2 vh2Var2 = (vh2) objArr[i14];
                                if (eh2Var4.f() != this) {
                                    break;
                                }
                                vh2Var2.S0(sh2.ActiveParent, sh2.Inactive);
                                i14--;
                            }
                        }
                    }
                    int i15 = i8 - 1;
                    if (i15 < vh2VarArr2.length) {
                        while (i15 >= 0) {
                            vh2 vh2Var3 = vh2VarArr2[i15];
                            if (eh2Var4.f() != this) {
                                break;
                            }
                            if (vh2Var3 == f) {
                                sh2Var = sh2.Active;
                            } else {
                                sh2Var = sh2.Inactive;
                            }
                            vh2Var3.S0(sh2Var, sh2.ActiveParent);
                            i15--;
                        }
                    }
                    if (eh2Var4.f() == this) {
                        S0(W0, sh2.Active);
                        if (eh2Var4.f() != this) {
                            break;
                        }
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    public final void S0(sh2 sh2Var, sh2 sh2Var2) {
        if0 if0Var;
        eo2 eo2Var;
        eh2 eh2Var = (eh2) ((te) nc1.g0(this)).getFocusOwner();
        vh2 f = eh2Var.f();
        if (!nb3.k(sh2Var, sh2Var2) && (eo2Var = this.k0) != null) {
            eo2Var.o(sh2Var, sh2Var2);
        }
        z64 z64Var = this.A;
        if (!z64Var.j0) {
            p53.c("visitAncestors called on an unattached node");
        }
        z64 z64Var2 = this.A;
        sm3 f0 = nc1.f0(this);
        while (f0 != null) {
            if ((((z64) f0.B0.g).R & 5120) != 0) {
                while (z64Var2 != null) {
                    int i = z64Var2.L;
                    if ((i & 5120) != 0) {
                        if (z64Var2 == z64Var || (i & 1024) == 0) {
                            if ((i & 4096) != 0) {
                                z64 z64Var3 = z64Var2;
                                ua4 ua4Var = null;
                                while (z64Var3 != null) {
                                    if (z64Var3 instanceof rg2) {
                                        rg2 rg2Var = (rg2) z64Var3;
                                        if (f == eh2Var.f()) {
                                            rg2Var.D(sh2Var2);
                                        }
                                    } else if ((z64Var3.L & 4096) != 0 && (z64Var3 instanceof zg1)) {
                                        int i2 = 0;
                                        for (z64 z64Var4 = ((zg1) z64Var3).l0; z64Var4 != null; z64Var4 = z64Var4.Y) {
                                            if ((z64Var4.L & 4096) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    z64Var3 = z64Var4;
                                                } else {
                                                    if (ua4Var == null) {
                                                        ua4Var = new ua4(new z64[16]);
                                                    }
                                                    if (z64Var3 != null) {
                                                        ua4Var.b(z64Var3);
                                                        z64Var3 = null;
                                                    }
                                                    ua4Var.b(z64Var4);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    z64Var3 = nc1.A(ua4Var);
                                }
                            }
                        } else {
                            return;
                        }
                    }
                    z64Var2 = z64Var2.X;
                }
            }
            f0 = f0.v();
            if (f0 != null && (if0Var = f0.B0) != null) {
                z64Var2 = (vy6) if0Var.f;
            } else {
                z64Var2 = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [fh2, ih2, java.lang.Object] */
    public final ih2 T0() {
        boolean z;
        boolean z2;
        if0 if0Var;
        ?? obj = new Object();
        obj.a = true;
        nh2 nh2Var = nh2.b;
        obj.b = nh2Var;
        obj.c = nh2Var;
        obj.d = nh2Var;
        obj.e = nh2Var;
        obj.f = nh2Var;
        obj.g = nh2Var;
        obj.h = nh2Var;
        obj.i = nh2Var;
        obj.j = hh2.L;
        obj.k = hh2.R;
        obj.l = vs0.g0;
        int i = this.n0;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            if (((w63) ((y63) ((x63) hf.K(this, ky0.m))).a.getValue()).a == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            z = !z2;
        } else if (i == 2) {
            z = false;
        } else {
            i.m("Unknown Focusability");
            return null;
        }
        obj.a = z;
        z64 z64Var = this.A;
        if (!z64Var.j0) {
            p53.c("visitAncestors called on an unattached node");
        }
        z64 z64Var2 = this.A;
        sm3 f0 = nc1.f0(this);
        loop0: while (f0 != null) {
            if ((((z64) f0.B0.g).R & 3072) != 0) {
                while (z64Var2 != null) {
                    int i2 = z64Var2.L;
                    if ((i2 & 3072) != 0) {
                        if (z64Var2 != z64Var && (i2 & 1024) != 0) {
                            break loop0;
                        } else if ((i2 & 2048) != 0) {
                            ua4 ua4Var = null;
                            z64 z64Var3 = z64Var2;
                            while (z64Var3 != null) {
                                if (z64Var3 instanceof kh2) {
                                    ((kh2) z64Var3).A(obj);
                                } else if ((z64Var3.L & 2048) != 0 && (z64Var3 instanceof zg1)) {
                                    int i3 = 0;
                                    for (z64 z64Var4 = ((zg1) z64Var3).l0; z64Var4 != null; z64Var4 = z64Var4.Y) {
                                        if ((z64Var4.L & 2048) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                z64Var3 = z64Var4;
                                            } else {
                                                if (ua4Var == null) {
                                                    ua4Var = new ua4(new z64[16]);
                                                }
                                                if (z64Var3 != null) {
                                                    ua4Var.b(z64Var3);
                                                    z64Var3 = null;
                                                }
                                                ua4Var.b(z64Var4);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                z64Var3 = nc1.A(ua4Var);
                            }
                        }
                    }
                    z64Var2 = z64Var2.X;
                }
            }
            f0 = f0.v();
            if (f0 != null && (if0Var = f0.B0) != null) {
                z64Var2 = (vy6) if0Var.f;
            } else {
                z64Var2 = null;
            }
        }
        return obj;
    }

    public final of5 U0(jk3 jk3Var) {
        of5 of5Var = T0().l;
        if (of5Var != vs0.g0) {
            if (jk3Var == null) {
                return of5Var;
            }
            return of5Var.i(jk3.i(jk3Var, nc1.e0(this), 6));
        } else if (jk3Var != null) {
            return jk3Var.O(nc1.e0(this), false);
        } else {
            return kj2.b(0L, qo2.S(nc1.e0(this).L));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x009f, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final sp3 V0() {
        if0 if0Var;
        c74 c74Var;
        if (!this.A.j0) {
            p53.c("visitAncestors called on an unattached node");
        }
        z64 z64Var = this.A.X;
        sm3 f0 = nc1.f0(this);
        while (true) {
            if (f0 == null) {
                break;
            }
            if ((((z64) f0.B0.g).R & 8388640) != 0) {
                while (z64Var != null) {
                    int i = z64Var.L;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(z64Var instanceof sp3)) {
                                if (z64Var instanceof zg1) {
                                    z64Var = null;
                                    for (z64 z64Var2 = ((zg1) z64Var).l0; z64Var2 != null; z64Var2 = z64Var2.Y) {
                                        if (z64Var2 instanceof sp3) {
                                            z64Var = z64Var2;
                                        }
                                    }
                                } else {
                                    z64Var = null;
                                }
                            }
                            sp3 sp3Var = (sp3) z64Var;
                            if (sp3Var != null) {
                                return sp3Var;
                            }
                        } else if ((i & 32) == 0) {
                            continue;
                        } else {
                            if (z64Var instanceof c74) {
                                c74Var = z64Var;
                            } else if (z64Var instanceof zg1) {
                                c74Var = null;
                                for (z64 z64Var3 = ((zg1) z64Var).l0; z64Var3 != null; z64Var3 = z64Var3.Y) {
                                    if (z64Var3 instanceof c74) {
                                        c74Var = z64Var3;
                                    }
                                }
                            } else {
                                c74Var = null;
                            }
                            c74 c74Var2 = c74Var;
                            if (c74Var2 != null) {
                                gi2 X = c74Var2.X();
                                j41 j41Var = a40.a;
                                if (X.z(j41Var)) {
                                    return (sp3) c74Var2.X().D(j41Var);
                                }
                            } else {
                                continue;
                            }
                        }
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
        }
    }

    public final sh2 W0() {
        if0 if0Var;
        if (!this.j0) {
            return sh2.Inactive;
        }
        vh2 f = ((eh2) ((te) nc1.g0(this)).getFocusOwner()).f();
        if (f == null) {
            return sh2.Inactive;
        }
        if (this == f) {
            return sh2.Active;
        }
        if (f.j0) {
            if (!f.A.j0) {
                p53.c("visitAncestors called on an unattached node");
            }
            z64 z64Var = f.A.X;
            sm3 f0 = nc1.f0(f);
            while (f0 != null) {
                if ((((z64) f0.B0.g).R & 1024) != 0) {
                    while (z64Var != null) {
                        if ((z64Var.L & 1024) != 0) {
                            z64 z64Var2 = z64Var;
                            ua4 ua4Var = null;
                            while (z64Var2 != null) {
                                if (z64Var2 instanceof vh2) {
                                    if (this == ((vh2) z64Var2)) {
                                        return sh2.ActiveParent;
                                    }
                                } else if ((z64Var2.L & 1024) != 0 && (z64Var2 instanceof zg1)) {
                                    int i = 0;
                                    for (z64 z64Var3 = ((zg1) z64Var2).l0; z64Var3 != null; z64Var3 = z64Var3.Y) {
                                        if ((z64Var3.L & 1024) != 0) {
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
            }
        }
        return sh2.Inactive;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [dh5, java.lang.Object] */
    public final void X0() {
        int i = uh2.b[W0().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                i.d();
                return;
            }
            return;
        }
        ?? obj = new Object();
        jx2.B(this, new le(5, obj, this));
        Object obj2 = obj.A;
        if (obj2 != null) {
            if (!((fh2) obj2).b()) {
                ((eh2) ((te) nc1.g0(this)).getFocusOwner()).b(8, true, true);
                return;
            }
            return;
        }
        nb3.a0("focusProperties");
        throw null;
    }

    public final boolean Y0(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            if (T0().a) {
                return R0(i);
            }
            return uj2.y(this, i, new qe(i, 4));
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.gi4
    public final void l0() {
        X0();
    }

    @Override // defpackage.kj3
    public final void m(jk3 jk3Var) {
    }
}
