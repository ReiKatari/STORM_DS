package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ke2  reason: default package */
/* loaded from: classes.dex */
public final class ke2 {
    public int a;
    public h11 d;
    public h11 e;
    public h11 f;
    public h11 g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int q;
    public final /* synthetic */ me2 r;
    public l21 b = null;
    public int c = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;

    public ke2(me2 me2Var, int i, h11 h11Var, h11 h11Var2, h11 h11Var3, h11 h11Var4, int i2) {
        this.r = me2Var;
        this.a = i;
        this.d = h11Var;
        this.e = h11Var2;
        this.f = h11Var3;
        this.g = h11Var4;
        this.h = me2Var.z0;
        this.i = me2Var.v0;
        this.j = me2Var.A0;
        this.k = me2Var.w0;
        this.q = i2;
    }

    public final void a(l21 l21Var) {
        int i = this.a;
        int i2 = this.q;
        int i3 = 0;
        me2 me2Var = this.r;
        if (i == 0) {
            int Y = me2Var.Y(l21Var, i2);
            if (l21Var.T[0] == k21.MATCH_CONSTRAINT) {
                this.p++;
                Y = 0;
            }
            int i4 = me2Var.S0;
            if (l21Var.h0 != 8) {
                i3 = i4;
            }
            this.l = Y + i3 + this.l;
            int X = me2Var.X(l21Var, this.q);
            if (this.b == null || this.c < X) {
                this.b = l21Var;
                this.c = X;
                this.m = X;
            }
        } else {
            int Y2 = me2Var.Y(l21Var, i2);
            int X2 = me2Var.X(l21Var, this.q);
            if (l21Var.T[1] == k21.MATCH_CONSTRAINT) {
                this.p++;
                X2 = 0;
            }
            int i5 = me2Var.T0;
            if (l21Var.h0 != 8) {
                i3 = i5;
            }
            this.m = X2 + i3 + this.m;
            if (this.b == null || this.c < Y2) {
                this.b = l21Var;
                this.c = Y2;
                this.l = Y2;
            }
        }
        this.o++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0103, code lost:
        if (r24 != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0105, code lost:
        r9 = 1.0f - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0115, code lost:
        if (r24 != false) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, boolean z, boolean z2) {
        me2 me2Var;
        boolean z3;
        int i2;
        int i3;
        int i4;
        l21 l21Var;
        int i5;
        boolean z4;
        int i6;
        int i7;
        char c;
        float f;
        int i8;
        float f2;
        int i9;
        int i10;
        int i11;
        int i12 = this.o;
        int i13 = 0;
        while (true) {
            me2Var = this.r;
            if (i13 >= i12 || (i11 = this.n + i13) >= me2Var.e1) {
                break;
            }
            l21 l21Var2 = me2Var.d1[i11];
            if (l21Var2 != null) {
                l21Var2.E();
            }
            i13++;
        }
        if (i12 != 0 && this.b != null) {
            if (z2 && i == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i14 = -1;
            int i15 = -1;
            for (int i16 = 0; i16 < i12; i16++) {
                if (z) {
                    i10 = (i12 - 1) - i16;
                } else {
                    i10 = i16;
                }
                int i17 = this.n + i10;
                if (i17 >= me2Var.e1) {
                    break;
                }
                l21 l21Var3 = me2Var.d1[i17];
                if (l21Var3 != null && l21Var3.h0 == 0) {
                    if (i14 == -1) {
                        i14 = i16;
                    }
                    i15 = i16;
                }
            }
            int i18 = this.a;
            l21 l21Var4 = this.b;
            if (i18 == 0) {
                l21Var4.l0 = me2Var.H0;
                h11 h11Var = l21Var4.L;
                h11 h11Var2 = l21Var4.J;
                int i19 = this.i;
                if (i > 0) {
                    i19 += me2Var.T0;
                }
                h11Var2.a(this.e, i19);
                if (z2) {
                    h11Var.a(this.g, this.k);
                }
                if (i > 0) {
                    this.e.d.L.a(h11Var2, 0);
                }
                if (me2Var.V0 == 3 && !l21Var4.E) {
                    for (int i20 = 0; i20 < i12; i20++) {
                        if (z) {
                            i9 = (i12 - 1) - i20;
                        } else {
                            i9 = i20;
                        }
                        int i21 = this.n + i9;
                        if (i21 >= me2Var.e1) {
                            break;
                        }
                        l21Var = me2Var.d1[i21];
                        if (l21Var.E) {
                            break;
                        }
                    }
                }
                l21Var = l21Var4;
                int i22 = 0;
                l21 l21Var5 = null;
                while (i22 < i12) {
                    if (z) {
                        i5 = (i12 - 1) - i22;
                    } else {
                        i5 = i22;
                    }
                    int i23 = this.n + i5;
                    if (i23 < me2Var.e1) {
                        l21 l21Var6 = me2Var.d1[i23];
                        if (l21Var6 == null) {
                            i7 = i12;
                            z4 = z3;
                            i6 = i15;
                            c = 3;
                        } else {
                            h11 h11Var3 = l21Var6.J;
                            h11 h11Var4 = l21Var6.L;
                            h11 h11Var5 = l21Var6.I;
                            z4 = z3;
                            if (i22 == 0) {
                                i6 = i15;
                                l21Var6.f(h11Var5, this.d, this.h);
                            } else {
                                i6 = i15;
                            }
                            if (i5 == 0) {
                                int i24 = me2Var.G0;
                                float f3 = me2Var.M0;
                                if (z) {
                                    f3 = 1.0f - f3;
                                }
                                if (this.n == 0) {
                                    i8 = me2Var.I0;
                                    f = f3;
                                    if (i8 != -1) {
                                        f2 = me2Var.O0;
                                    }
                                } else {
                                    f = f3;
                                }
                                if (z2 && (i8 = me2Var.K0) != -1) {
                                    f2 = me2Var.Q0;
                                } else {
                                    i8 = i24;
                                    f2 = f;
                                }
                                l21Var6.k0 = i8;
                                l21Var6.e0 = f2;
                            }
                            if (i22 == i12 - 1) {
                                i7 = i12;
                                l21Var6.f(l21Var6.K, this.f, this.j);
                            } else {
                                i7 = i12;
                            }
                            if (l21Var5 != null) {
                                h11 h11Var6 = l21Var5.K;
                                h11Var5.a(h11Var6, me2Var.S0);
                                if (i22 == i14) {
                                    int i25 = this.h;
                                    if (h11Var5.h()) {
                                        h11Var5.h = i25;
                                    }
                                }
                                h11Var6.a(h11Var5, 0);
                                if (i22 == i6 + 1) {
                                    int i26 = this.j;
                                    if (h11Var6.h()) {
                                        h11Var6.h = i26;
                                    }
                                }
                            }
                            if (l21Var6 != l21Var4) {
                                int i27 = me2Var.V0;
                                c = 3;
                                if (i27 == 3 && l21Var.E && l21Var6 != l21Var && l21Var6.E) {
                                    l21Var6.M.a(l21Var.M, 0);
                                } else if (i27 != 0) {
                                    if (i27 != 1) {
                                        if (z4) {
                                            h11Var3.a(this.e, this.i);
                                            h11Var4.a(this.g, this.k);
                                        } else {
                                            h11Var3.a(h11Var2, 0);
                                            h11Var4.a(h11Var, 0);
                                        }
                                    } else {
                                        h11Var4.a(h11Var, 0);
                                    }
                                } else {
                                    h11Var3.a(h11Var2, 0);
                                }
                            } else {
                                c = 3;
                            }
                            l21Var5 = l21Var6;
                        }
                        i22++;
                        z3 = z4;
                        i15 = i6;
                        i12 = i7;
                    } else {
                        return;
                    }
                }
                return;
            }
            int i28 = i12;
            boolean z5 = z3;
            int i29 = i15;
            l21Var4.k0 = me2Var.G0;
            h11 h11Var7 = l21Var4.I;
            h11 h11Var8 = l21Var4.K;
            int i30 = this.h;
            if (i > 0) {
                i30 += me2Var.S0;
            }
            if (z) {
                h11Var8.a(this.f, i30);
                if (z2) {
                    h11Var7.a(this.d, this.j);
                }
                if (i > 0) {
                    this.f.d.I.a(h11Var8, 0);
                }
            } else {
                h11Var7.a(this.d, i30);
                if (z2) {
                    h11Var8.a(this.f, this.j);
                }
                if (i > 0) {
                    this.d.d.K.a(h11Var7, 0);
                }
            }
            int i31 = 0;
            l21 l21Var7 = null;
            while (true) {
                int i32 = i28;
                if (i31 < i32 && (i2 = this.n + i31) < me2Var.e1) {
                    l21 l21Var8 = me2Var.d1[i2];
                    if (l21Var8 == null) {
                        i28 = i32;
                    } else {
                        h11 h11Var9 = l21Var8.I;
                        h11 h11Var10 = l21Var8.J;
                        h11 h11Var11 = l21Var8.K;
                        if (i31 == 0) {
                            l21Var8.f(h11Var10, this.e, this.i);
                            int i33 = me2Var.H0;
                            float f4 = me2Var.N0;
                            if (this.n == 0) {
                                i4 = me2Var.J0;
                                i28 = i32;
                                i3 = -1;
                                if (i4 != -1) {
                                    f4 = me2Var.P0;
                                    i33 = i4;
                                    l21Var8.l0 = i33;
                                    l21Var8.f0 = f4;
                                }
                            } else {
                                i28 = i32;
                                i3 = -1;
                            }
                            if (z2 && (i4 = me2Var.L0) != i3) {
                                f4 = me2Var.R0;
                                i33 = i4;
                            }
                            l21Var8.l0 = i33;
                            l21Var8.f0 = f4;
                        } else {
                            i28 = i32;
                        }
                        if (i31 == i28 - 1) {
                            l21Var8.f(l21Var8.L, this.g, this.k);
                        }
                        if (l21Var7 != null) {
                            h11 h11Var12 = l21Var7.L;
                            h11Var10.a(h11Var12, me2Var.T0);
                            if (i31 == i14) {
                                int i34 = this.i;
                                if (h11Var10.h()) {
                                    h11Var10.h = i34;
                                }
                            }
                            h11Var12.a(h11Var10, 0);
                            if (i31 == i29 + 1) {
                                int i35 = this.k;
                                if (h11Var12.h()) {
                                    h11Var12.h = i35;
                                }
                            }
                        }
                        if (l21Var8 != l21Var4) {
                            int i36 = me2Var.U0;
                            if (z) {
                                if (i36 != 0) {
                                    if (i36 != 1) {
                                        if (i36 == 2) {
                                            h11Var9.a(h11Var7, 0);
                                            h11Var11.a(h11Var8, 0);
                                        }
                                    } else {
                                        h11Var9.a(h11Var7, 0);
                                    }
                                } else {
                                    h11Var11.a(h11Var8, 0);
                                }
                            } else {
                                if (i36 != 0) {
                                    if (i36 != 1) {
                                        if (i36 == 2) {
                                            if (z5) {
                                                h11Var9.a(this.d, this.h);
                                                h11Var11.a(this.f, this.j);
                                            } else {
                                                h11Var9.a(h11Var7, 0);
                                                h11Var11.a(h11Var8, 0);
                                            }
                                        }
                                    } else {
                                        h11Var11.a(h11Var8, 0);
                                    }
                                } else {
                                    h11Var9.a(h11Var7, 0);
                                }
                                l21Var7 = l21Var8;
                            }
                        }
                        l21Var7 = l21Var8;
                    }
                    i31++;
                } else {
                    return;
                }
            }
        }
    }

    public final int c() {
        int i = this.a;
        int i2 = this.m;
        if (i == 1) {
            return i2 - this.r.T0;
        }
        return i2;
    }

    public final int d() {
        int i = this.a;
        int i2 = this.l;
        if (i == 0) {
            return i2 - this.r.S0;
        }
        return i2;
    }

    public final void e(int i) {
        me2 me2Var;
        int i2;
        int i3 = this.p;
        if (i3 != 0) {
            int i4 = this.o;
            int i5 = i / i3;
            int i6 = 0;
            while (true) {
                me2Var = this.r;
                if (i6 >= i4 || (i2 = this.n + i6) >= me2Var.e1) {
                    break;
                }
                l21 l21Var = me2Var.d1[i2];
                if (this.a == 0) {
                    if (l21Var != null) {
                        k21[] k21VarArr = l21Var.T;
                        if (k21VarArr[0] == k21.MATCH_CONSTRAINT && l21Var.r == 0) {
                            me2Var.W(l21Var, k21.FIXED, i5, k21VarArr[1], l21Var.l());
                        }
                    }
                } else if (l21Var != null) {
                    k21[] k21VarArr2 = l21Var.T;
                    if (k21VarArr2[1] == k21.MATCH_CONSTRAINT && l21Var.s == 0) {
                        int i7 = i5;
                        me2Var.W(l21Var, k21VarArr2[0], l21Var.r(), k21.FIXED, i7);
                        i5 = i7;
                    }
                }
                i6++;
            }
            this.l = 0;
            this.m = 0;
            this.b = null;
            this.c = 0;
            int i8 = this.o;
            for (int i9 = 0; i9 < i8; i9++) {
                int i10 = this.n + i9;
                if (i10 < me2Var.e1) {
                    l21 l21Var2 = me2Var.d1[i10];
                    if (this.a == 0) {
                        int r = l21Var2.r();
                        int i11 = me2Var.S0;
                        if (l21Var2.h0 == 8) {
                            i11 = 0;
                        }
                        this.l = r + i11 + this.l;
                        int X = me2Var.X(l21Var2, this.q);
                        if (this.b == null || this.c < X) {
                            this.b = l21Var2;
                            this.c = X;
                            this.m = X;
                        }
                    } else {
                        int Y = me2Var.Y(l21Var2, this.q);
                        int X2 = me2Var.X(l21Var2, this.q);
                        int i12 = me2Var.T0;
                        if (l21Var2.h0 == 8) {
                            i12 = 0;
                        }
                        this.m = X2 + i12 + this.m;
                        if (this.b == null || this.c < Y) {
                            this.b = l21Var2;
                            this.c = Y;
                            this.l = Y;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i, h11 h11Var, h11 h11Var2, h11 h11Var3, h11 h11Var4, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.d = h11Var;
        this.e = h11Var2;
        this.f = h11Var3;
        this.g = h11Var4;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.q = i6;
    }
}
