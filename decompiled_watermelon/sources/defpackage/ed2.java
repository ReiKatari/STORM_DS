package defpackage;

import android.os.Trace;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ed2  reason: default package */
/* loaded from: classes.dex */
public final class ed2 extends yy3 implements jv0, sc3, m94, bz3, vc1 {
    public final aj2 j0;
    public boolean k0;
    public boolean l0;
    public final int m0;

    public ed2(int i, aj2 aj2Var, int i2) {
        this.j0 = (i2 & 4) != 0 ? null : aj2Var;
        this.m0 = i;
    }

    @Override // defpackage.yy3
    public final boolean G0() {
        return false;
    }

    @Override // defpackage.yy3
    public final void K0() {
        int i = dd2.b[W0().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i == 4) {
                    return;
                }
                i.c();
                return;
            }
            ((ee) l.Q(this)).getFocusOwner();
            ii7.b(this);
            return;
        }
        nc2 nc2Var = (nc2) ((ee) l.Q(this)).getFocusOwner();
        nc2Var.b(8, true, false);
        nc2Var.d.a();
    }

    @Override // defpackage.yy3
    public final void L0() {
        if (W0().isFocused()) {
            ((nc2) ((ee) l.Q(this)).getFocusOwner()).b(8, true, true);
        }
    }

    @Override // defpackage.m94
    public final void Q() {
        X0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v55, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object[], java.lang.Object] */
    public final boolean R0(int i) {
        o24 o24Var;
        bd2 bd2Var;
        yy3 yy3Var;
        zc0 zc0Var;
        nc2 nc2Var;
        boolean z;
        int i2;
        o24 o24Var2;
        Boolean bool;
        int i3;
        int i4;
        zc0 zc0Var2;
        o24 o24Var3;
        int i5 = dd2.a[ei7.e(this, i).ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                return true;
            }
            if (i5 != 3 && i5 != 4) {
                i.c();
                return false;
            }
        } else {
            nc2 nc2Var2 = (nc2) ((ee) l.Q(this)).getFocusOwner();
            ed2 f = nc2Var2.f();
            bd2 W0 = W0();
            if (f == this) {
                S0(W0, W0);
                return true;
            } else if (f != null || ((nc2) ((ee) l.Q(this)).getFocusOwner()).a.B()) {
                if (f != null) {
                    o24Var = new o24(new ed2[16]);
                    if (!f.A.i0) {
                        mz2.c("visitAncestors called on an unattached node");
                    }
                    yy3 yy3Var2 = f.A.X;
                    vf3 P = l.P(f);
                    while (P != null) {
                        if ((((yy3) P.A0.g).R & 1024) != 0) {
                            while (yy3Var2 != null) {
                                if ((yy3Var2.L & 1024) != 0) {
                                    yy3 yy3Var3 = yy3Var2;
                                    o24 o24Var4 = null;
                                    while (yy3Var3 != null) {
                                        if (yy3Var3 instanceof ed2) {
                                            o24Var.b((ed2) yy3Var3);
                                        } else if ((yy3Var3.L & 1024) != 0 && (yy3Var3 instanceof xc1)) {
                                            int i6 = 0;
                                            for (yy3 yy3Var4 = ((xc1) yy3Var3).k0; yy3Var4 != null; yy3Var4 = yy3Var4.Y) {
                                                if ((yy3Var4.L & 1024) != 0) {
                                                    i6++;
                                                    if (i6 == 1) {
                                                        yy3Var3 = yy3Var4;
                                                    } else {
                                                        if (o24Var4 == null) {
                                                            o24Var3 = new o24(new yy3[16]);
                                                        } else {
                                                            o24Var3 = o24Var4;
                                                        }
                                                        if (yy3Var3 != null) {
                                                            o24Var3.b(yy3Var3);
                                                            yy3Var3 = null;
                                                        }
                                                        o24Var3.b(yy3Var4);
                                                        o24Var4 = o24Var3;
                                                    }
                                                }
                                            }
                                            if (i6 == 1) {
                                            }
                                        }
                                        yy3Var3 = l.p(o24Var4);
                                    }
                                }
                                yy3Var2 = yy3Var2.X;
                            }
                        }
                        P = P.u();
                        if (P != null && (zc0Var2 = P.A0) != null) {
                            yy3Var2 = (lm6) zc0Var2.f;
                        } else {
                            yy3Var2 = null;
                        }
                    }
                } else {
                    o24Var = null;
                }
                ed2[] ed2VarArr = new ed2[16];
                ed2[] ed2VarArr2 = new ed2[16];
                if (!this.A.i0) {
                    mz2.c("visitAncestors called on an unattached node");
                }
                yy3 yy3Var5 = this.A.X;
                vf3 P2 = l.P(this);
                int i7 = 0;
                int i8 = 0;
                boolean z2 = true;
                yy3 yy3Var6 = yy3Var5;
                while (P2 != null) {
                    if ((((yy3) P2.A0.g).R & 1024) != 0) {
                        for (yy3 yy3Var7 = yy3Var6; yy3Var7 != null; yy3Var7 = yy3Var7.X) {
                            if ((yy3Var7.L & 1024) != 0) {
                                yy3 yy3Var8 = yy3Var7;
                                o24 o24Var5 = null;
                                while (yy3Var8 != null) {
                                    if (yy3Var8 instanceof ed2) {
                                        ed2 ed2Var = (ed2) yy3Var8;
                                        if (o24Var != null) {
                                            bool = Boolean.valueOf(o24Var.k(ed2Var));
                                        } else {
                                            bool = null;
                                        }
                                        if (b53.x(bool, Boolean.TRUE)) {
                                            int i9 = i7 + 1;
                                            if (ed2VarArr.length < i9) {
                                                int length = ed2VarArr.length;
                                                nc2Var = nc2Var2;
                                                ?? r1 = new Object[Math.max(i9, length * 2)];
                                                i4 = i9;
                                                System.arraycopy(ed2VarArr, 0, r1, 0, length);
                                                ed2VarArr = r1;
                                            } else {
                                                nc2Var = nc2Var2;
                                                i4 = i9;
                                            }
                                            ed2VarArr[i7] = ed2Var;
                                            i7 = i4;
                                        } else {
                                            nc2Var = nc2Var2;
                                            int i10 = i8 + 1;
                                            if (ed2VarArr2.length < i10) {
                                                int length2 = ed2VarArr2.length;
                                                ?? r6 = new Object[Math.max(i10, length2 * 2)];
                                                i3 = i10;
                                                System.arraycopy(ed2VarArr2, 0, r6, 0, length2);
                                                ed2VarArr2 = r6;
                                            } else {
                                                i3 = i10;
                                            }
                                            ed2VarArr2[i8] = ed2Var;
                                            i8 = i3;
                                        }
                                        if (ed2Var == f) {
                                            z2 = false;
                                        }
                                        z = false;
                                    } else {
                                        nc2Var = nc2Var2;
                                        z = true;
                                    }
                                    if (z && (yy3Var8.L & 1024) != 0 && (yy3Var8 instanceof xc1)) {
                                        yy3 yy3Var9 = ((xc1) yy3Var8).k0;
                                        int i11 = 0;
                                        yy3Var8 = yy3Var8;
                                        while (yy3Var9 != null) {
                                            if ((yy3Var9.L & 1024) != 0) {
                                                int i12 = i11 + 1;
                                                if (i12 == 1) {
                                                    yy3Var8 = yy3Var9;
                                                    i2 = i12;
                                                } else {
                                                    if (o24Var5 == null) {
                                                        i2 = i12;
                                                        o24Var2 = new o24(new yy3[16]);
                                                    } else {
                                                        i2 = i12;
                                                        o24Var2 = o24Var5;
                                                    }
                                                    if (yy3Var8 != null) {
                                                        o24Var2.b(yy3Var8);
                                                        yy3Var8 = null;
                                                    }
                                                    o24Var2.b(yy3Var9);
                                                    o24Var5 = o24Var2;
                                                    yy3Var8 = yy3Var8;
                                                }
                                                i11 = i2;
                                            }
                                            yy3Var9 = yy3Var9.Y;
                                            yy3Var8 = yy3Var8;
                                        }
                                        if (i11 == 1) {
                                            nc2Var2 = nc2Var;
                                        }
                                    }
                                    yy3Var8 = l.p(o24Var5);
                                    nc2Var2 = nc2Var;
                                }
                            }
                            nc2Var2 = nc2Var2;
                        }
                    }
                    nc2 nc2Var3 = nc2Var2;
                    P2 = P2.u();
                    if (P2 != null && (zc0Var = P2.A0) != null) {
                        yy3Var = (lm6) zc0Var.f;
                    } else {
                        yy3Var = null;
                    }
                    nc2Var2 = nc2Var3;
                    yy3Var6 = yy3Var;
                }
                nc2 nc2Var4 = nc2Var2;
                if (!z2 || f == null || ei7.a(f, false)) {
                    nk2.Q(this, new dj(8, this));
                    int i13 = fd2.a[W0().ordinal()];
                    if (i13 != 1 && i13 != 2) {
                        if (i13 != 3 && i13 != 4) {
                            i.c();
                            return false;
                        }
                        ((nc2) ((ee) l.Q(this)).getFocusOwner()).i(this);
                    }
                    if (z2 && f != null) {
                        f.S0(bd2.Active, bd2.Inactive);
                    }
                    if (o24Var != null) {
                        int i14 = o24Var.L - 1;
                        Object[] objArr = o24Var.A;
                        if (i14 < objArr.length) {
                            while (i14 >= 0) {
                                ed2 ed2Var2 = (ed2) objArr[i14];
                                if (nc2Var4.f() != this) {
                                    break;
                                }
                                ed2Var2.S0(bd2.ActiveParent, bd2.Inactive);
                                i14--;
                            }
                        }
                    }
                    int i15 = i8 - 1;
                    if (i15 < ed2VarArr2.length) {
                        while (i15 >= 0) {
                            ed2 ed2Var3 = ed2VarArr2[i15];
                            if (nc2Var4.f() != this) {
                                break;
                            }
                            if (ed2Var3 == f) {
                                bd2Var = bd2.Active;
                            } else {
                                bd2Var = bd2.Inactive;
                            }
                            ed2Var3.S0(bd2Var, bd2.ActiveParent);
                            i15--;
                        }
                    }
                    if (nc2Var4.f() == this) {
                        S0(W0, bd2.Active);
                        if (nc2Var4.f() != this) {
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

    public final void S0(bd2 bd2Var, bd2 bd2Var2) {
        zc0 zc0Var;
        aj2 aj2Var;
        nc2 nc2Var = (nc2) ((ee) l.Q(this)).getFocusOwner();
        ed2 f = nc2Var.f();
        if (!b53.x(bd2Var, bd2Var2) && (aj2Var = this.j0) != null) {
            aj2Var.j(bd2Var, bd2Var2);
        }
        yy3 yy3Var = this.A;
        if (!yy3Var.i0) {
            mz2.c("visitAncestors called on an unattached node");
        }
        yy3 yy3Var2 = this.A;
        vf3 P = l.P(this);
        while (P != null) {
            if ((((yy3) P.A0.g).R & 5120) != 0) {
                while (yy3Var2 != null) {
                    int i = yy3Var2.L;
                    if ((i & 5120) != 0) {
                        if (yy3Var2 == yy3Var || (i & 1024) == 0) {
                            if ((i & 4096) != 0) {
                                yy3 yy3Var3 = yy3Var2;
                                o24 o24Var = null;
                                while (yy3Var3 != null) {
                                    if (yy3Var3 instanceof ac2) {
                                        ac2 ac2Var = (ac2) yy3Var3;
                                        if (f == nc2Var.f()) {
                                            ac2Var.e0(bd2Var2);
                                        }
                                    } else if ((yy3Var3.L & 4096) != 0 && (yy3Var3 instanceof xc1)) {
                                        int i2 = 0;
                                        for (yy3 yy3Var4 = ((xc1) yy3Var3).k0; yy3Var4 != null; yy3Var4 = yy3Var4.Y) {
                                            if ((yy3Var4.L & 4096) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    yy3Var3 = yy3Var4;
                                                } else {
                                                    if (o24Var == null) {
                                                        o24Var = new o24(new yy3[16]);
                                                    }
                                                    if (yy3Var3 != null) {
                                                        o24Var.b(yy3Var3);
                                                        yy3Var3 = null;
                                                    }
                                                    o24Var.b(yy3Var4);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    yy3Var3 = l.p(o24Var);
                                }
                            }
                        } else {
                            return;
                        }
                    }
                    yy3Var2 = yy3Var2.X;
                }
            }
            P = P.u();
            if (P != null && (zc0Var = P.A0) != null) {
                yy3Var2 = (lm6) zc0Var.f;
            } else {
                yy3Var2 = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [rc2, java.lang.Object, oc2] */
    public final rc2 T0() {
        boolean z;
        boolean z2;
        zc0 zc0Var;
        ?? obj = new Object();
        obj.a = true;
        wc2 wc2Var = wc2.b;
        obj.b = wc2Var;
        obj.c = wc2Var;
        obj.d = wc2Var;
        obj.e = wc2Var;
        obj.f = wc2Var;
        obj.g = wc2Var;
        obj.h = wc2Var;
        obj.i = wc2Var;
        obj.j = yd.A0;
        obj.k = qc2.L;
        obj.l = k45.c0;
        int i = this.m0;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            if (((s03) ((u03) ((t03) mh7.t(this, ov0.m))).a.getValue()).a == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            z = !z2;
        } else if (i == 2) {
            z = false;
        } else {
            i.n("Unknown Focusability");
            return null;
        }
        obj.a = z;
        yy3 yy3Var = this.A;
        if (!yy3Var.i0) {
            mz2.c("visitAncestors called on an unattached node");
        }
        yy3 yy3Var2 = this.A;
        vf3 P = l.P(this);
        loop0: while (P != null) {
            if ((((yy3) P.A0.g).R & 3072) != 0) {
                while (yy3Var2 != null) {
                    int i2 = yy3Var2.L;
                    if ((i2 & 3072) != 0) {
                        if (yy3Var2 != yy3Var && (i2 & 1024) != 0) {
                            break loop0;
                        } else if ((i2 & 2048) != 0) {
                            o24 o24Var = null;
                            yy3 yy3Var3 = yy3Var2;
                            while (yy3Var3 != null) {
                                if (yy3Var3 instanceof tc2) {
                                    ((tc2) yy3Var3).b0(obj);
                                } else if ((yy3Var3.L & 2048) != 0 && (yy3Var3 instanceof xc1)) {
                                    int i3 = 0;
                                    for (yy3 yy3Var4 = ((xc1) yy3Var3).k0; yy3Var4 != null; yy3Var4 = yy3Var4.Y) {
                                        if ((yy3Var4.L & 2048) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                yy3Var3 = yy3Var4;
                                            } else {
                                                if (o24Var == null) {
                                                    o24Var = new o24(new yy3[16]);
                                                }
                                                if (yy3Var3 != null) {
                                                    o24Var.b(yy3Var3);
                                                    yy3Var3 = null;
                                                }
                                                o24Var.b(yy3Var4);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                yy3Var3 = l.p(o24Var);
                            }
                        }
                    }
                    yy3Var2 = yy3Var2.X;
                }
            }
            P = P.u();
            if (P != null && (zc0Var = P.A0) != null) {
                yy3Var2 = (lm6) zc0Var.f;
            } else {
                yy3Var2 = null;
            }
        }
        return obj;
    }

    public final y55 U0(rd3 rd3Var) {
        y55 y55Var = T0().l;
        if (y55Var != k45.c0) {
            if (rd3Var == null) {
                return y55Var;
            }
            return y55Var.i(rd3.s(rd3Var, l.O(this), 6));
        } else if (rd3Var != null) {
            return rd3Var.L(l.O(this), false);
        } else {
            return yf2.b(0L, hk2.U(l.O(this).L));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x009f, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ui3 V0() {
        /*
            r6 = this;
            yy3 r0 = r6.A
            boolean r0 = r0.i0
            if (r0 != 0) goto Lb
            java.lang.String r0 = "visitAncestors called on an unattached node"
            defpackage.mz2.c(r0)
        Lb:
            yy3 r0 = r6.A
            yy3 r0 = r0.X
            vf3 r6 = defpackage.l.P(r6)
        L13:
            r1 = 0
            if (r6 == 0) goto L9f
            zc0 r2 = r6.A0
            java.lang.Object r2 = r2.g
            yy3 r2 = (defpackage.yy3) r2
            int r2 = r2.R
            r3 = 8388640(0x800020, float:1.1754988E-38)
            r2 = r2 & r3
            if (r2 == 0) goto L8c
        L24:
            if (r0 == 0) goto L8c
            int r2 = r0.L
            r4 = r2 & r3
            if (r4 == 0) goto L89
            r4 = 8388608(0x800000, float:1.1754944E-38)
            r4 = r4 & r2
            if (r4 == 0) goto L4f
            boolean r6 = r0 instanceof defpackage.ui3
            if (r6 == 0) goto L36
            goto L4a
        L36:
            boolean r6 = r0 instanceof defpackage.xc1
            if (r6 == 0) goto L49
            xc1 r0 = (defpackage.xc1) r0
            yy3 r6 = r0.k0
            r0 = r1
        L3f:
            if (r6 == 0) goto L4a
            boolean r2 = r6 instanceof defpackage.ui3
            if (r2 == 0) goto L46
            r0 = r6
        L46:
            yy3 r6 = r6.Y
            goto L3f
        L49:
            r0 = r1
        L4a:
            ui3 r0 = (defpackage.ui3) r0
            if (r0 == 0) goto L9f
            return r0
        L4f:
            r2 = r2 & 32
            if (r2 == 0) goto L89
            boolean r2 = r0 instanceof defpackage.bz3
            if (r2 == 0) goto L59
            r4 = r0
            goto L6e
        L59:
            boolean r2 = r0 instanceof defpackage.xc1
            if (r2 == 0) goto L6d
            r2 = r0
            xc1 r2 = (defpackage.xc1) r2
            yy3 r2 = r2.k0
            r4 = r1
        L63:
            if (r2 == 0) goto L6e
            boolean r5 = r2 instanceof defpackage.bz3
            if (r5 == 0) goto L6a
            r4 = r2
        L6a:
            yy3 r2 = r2.Y
            goto L63
        L6d:
            r4 = r1
        L6e:
            bz3 r4 = (defpackage.bz3) r4
            if (r4 == 0) goto L89
            ln2 r2 = r4.m()
            b11 r5 = defpackage.f20.a
            boolean r2 = r2.y(r5)
            if (r2 == 0) goto L89
            ln2 r6 = r4.m()
            java.lang.Object r6 = r6.C(r5)
            ui3 r6 = (defpackage.ui3) r6
            return r6
        L89:
            yy3 r0 = r0.X
            goto L24
        L8c:
            vf3 r6 = r6.u()
            if (r6 == 0) goto L9c
            zc0 r0 = r6.A0
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r0.f
            lm6 r0 = (defpackage.lm6) r0
            goto L13
        L9c:
            r0 = r1
            goto L13
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ed2.V0():ui3");
    }

    public final bd2 W0() {
        zc0 zc0Var;
        if (!this.i0) {
            return bd2.Inactive;
        }
        ed2 f = ((nc2) ((ee) l.Q(this)).getFocusOwner()).f();
        if (f == null) {
            return bd2.Inactive;
        }
        if (this == f) {
            return bd2.Active;
        }
        if (f.i0) {
            if (!f.A.i0) {
                mz2.c("visitAncestors called on an unattached node");
            }
            yy3 yy3Var = f.A.X;
            vf3 P = l.P(f);
            while (P != null) {
                if ((((yy3) P.A0.g).R & 1024) != 0) {
                    while (yy3Var != null) {
                        if ((yy3Var.L & 1024) != 0) {
                            yy3 yy3Var2 = yy3Var;
                            o24 o24Var = null;
                            while (yy3Var2 != null) {
                                if (yy3Var2 instanceof ed2) {
                                    if (this == ((ed2) yy3Var2)) {
                                        return bd2.ActiveParent;
                                    }
                                } else if ((yy3Var2.L & 1024) != 0 && (yy3Var2 instanceof xc1)) {
                                    int i = 0;
                                    for (yy3 yy3Var3 = ((xc1) yy3Var2).k0; yy3Var3 != null; yy3Var3 = yy3Var3.Y) {
                                        if ((yy3Var3.L & 1024) != 0) {
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
            }
        }
        return bd2.Inactive;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, n75] */
    public final void X0() {
        int i = dd2.b[W0().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                i.c();
                return;
            }
            return;
        }
        ?? obj = new Object();
        nk2.Q(this, new wd(5, obj, this));
        Object obj2 = obj.A;
        if (obj2 != null) {
            if (!((oc2) obj2).c()) {
                ((nc2) ((ee) l.Q(this)).getFocusOwner()).b(8, true, true);
                return;
            }
            return;
        }
        b53.g0("focusProperties");
        throw null;
    }

    public final boolean Y0(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            if (T0().a) {
                return R0(i);
            }
            return mj2.t(this, i, new be(i, 4));
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.sc3
    public final void s(rd3 rd3Var) {
    }
}
