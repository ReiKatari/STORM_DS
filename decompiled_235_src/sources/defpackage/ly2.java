package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ly2  reason: default package */
/* loaded from: classes.dex */
public final class ly2 extends ct7 {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    iArr[0] = i6;
                    iArr[1] = (int) ((i6 * f) + 0.5f);
                    return;
                }
                return;
            }
            iArr[0] = (int) ((i7 * f) + 0.5f);
            iArr[1] = i7;
            return;
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x023f, code lost:
        if (r15 != 1) goto L127;
     */
    @Override // defpackage.xh1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(xh1 xh1Var) {
        rj1 rj1Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f;
        float f2;
        float f3;
        int i;
        if (ky2.a[this.j.ordinal()] != 3) {
            rj1 rj1Var2 = this.e;
            boolean z5 = rj1Var2.j;
            ci1 ci1Var = this.h;
            ci1 ci1Var2 = this.i;
            if (!z5 && this.d == k21.MATCH_CONSTRAINT) {
                l21 l21Var = this.b;
                int i2 = l21Var.r;
                if (i2 != 2) {
                    if (i2 == 3) {
                        int i3 = l21Var.s;
                        if (i3 != 0 && i3 != 3) {
                            int i4 = l21Var.Y;
                            if (i4 != -1) {
                                if (i4 != 0) {
                                    if (i4 != 1) {
                                        i = 0;
                                        rj1Var2.d(i);
                                    } else {
                                        f = l21Var.e.e.g;
                                        f2 = l21Var.X;
                                    }
                                } else {
                                    f3 = l21Var.e.e.g / l21Var.X;
                                    i = (int) (f3 + 0.5f);
                                    rj1Var2.d(i);
                                }
                            } else {
                                f = l21Var.e.e.g;
                                f2 = l21Var.X;
                            }
                            f3 = f * f2;
                            i = (int) (f3 + 0.5f);
                            rj1Var2.d(i);
                        } else {
                            lm7 lm7Var = l21Var.e;
                            ci1 ci1Var3 = lm7Var.h;
                            ci1 ci1Var4 = lm7Var.i;
                            if (l21Var.I.f != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (l21Var.J.f != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (l21Var.K.f != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (l21Var.L.f != null) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            int i5 = l21Var.Y;
                            if (z && z2 && z3 && z4) {
                                float f4 = l21Var.X;
                                boolean z6 = ci1Var3.j;
                                ArrayList arrayList = ci1Var3.l;
                                int[] iArr = k;
                                if (z6 && ci1Var4.j) {
                                    if (ci1Var.c && ci1Var2.c) {
                                        m(iArr, ((ci1) ci1Var.l.get(0)).g + ci1Var.f, ((ci1) ci1Var2.l.get(0)).g - ci1Var2.f, ci1Var3.g + ci1Var3.f, ci1Var4.g - ci1Var4.f, f4, i5);
                                        rj1Var2.d(iArr[0]);
                                        this.b.e.e.d(iArr[1]);
                                        return;
                                    }
                                    return;
                                }
                                if (ci1Var.j && ci1Var2.j) {
                                    if (ci1Var3.c && ci1Var4.c) {
                                        m(iArr, ci1Var.g + ci1Var.f, ci1Var2.g - ci1Var2.f, ((ci1) arrayList.get(0)).g + ci1Var3.f, ((ci1) ci1Var4.l.get(0)).g - ci1Var4.f, f4, i5);
                                        rj1Var2.d(iArr[0]);
                                        this.b.e.e.d(iArr[1]);
                                    } else {
                                        return;
                                    }
                                }
                                if (ci1Var.c && ci1Var2.c && ci1Var3.c && ci1Var4.c) {
                                    m(iArr, ((ci1) ci1Var.l.get(0)).g + ci1Var.f, ((ci1) ci1Var2.l.get(0)).g - ci1Var2.f, ((ci1) arrayList.get(0)).g + ci1Var3.f, ((ci1) ci1Var4.l.get(0)).g - ci1Var4.f, f4, i5);
                                    rj1Var2.d(iArr[0]);
                                    this.b.e.e.d(iArr[1]);
                                } else {
                                    return;
                                }
                            } else if (z && z3) {
                                if (ci1Var.c && ci1Var2.c) {
                                    float f5 = l21Var.X;
                                    int i6 = ((ci1) ci1Var.l.get(0)).g + ci1Var.f;
                                    int i7 = ((ci1) ci1Var2.l.get(0)).g - ci1Var2.f;
                                    if (i5 != -1 && i5 != 0) {
                                        if (i5 == 1) {
                                            int g = g(i7 - i6, 0);
                                            int i8 = (int) ((g / f5) + 0.5f);
                                            int g2 = g(i8, 1);
                                            if (i8 != g2) {
                                                g = (int) ((g2 * f5) + 0.5f);
                                            }
                                            rj1Var2.d(g);
                                            this.b.e.e.d(g2);
                                        }
                                    } else {
                                        int g3 = g(i7 - i6, 0);
                                        int i9 = (int) ((g3 * f5) + 0.5f);
                                        int g4 = g(i9, 1);
                                        if (i9 != g4) {
                                            g3 = (int) ((g4 / f5) + 0.5f);
                                        }
                                        rj1Var2.d(g3);
                                        this.b.e.e.d(g4);
                                    }
                                } else {
                                    return;
                                }
                            } else if (z2 && z4) {
                                if (ci1Var3.c && ci1Var4.c) {
                                    float f6 = l21Var.X;
                                    int i10 = ((ci1) ci1Var3.l.get(0)).g + ci1Var3.f;
                                    int i11 = ((ci1) ci1Var4.l.get(0)).g - ci1Var4.f;
                                    if (i5 != -1) {
                                        if (i5 == 0) {
                                            int g5 = g(i11 - i10, 1);
                                            int i12 = (int) ((g5 * f6) + 0.5f);
                                            int g6 = g(i12, 0);
                                            if (i12 != g6) {
                                                g5 = (int) ((g6 / f6) + 0.5f);
                                            }
                                            rj1Var2.d(g6);
                                            this.b.e.e.d(g5);
                                        }
                                    }
                                    int g7 = g(i11 - i10, 1);
                                    int i13 = (int) ((g7 / f6) + 0.5f);
                                    int g8 = g(i13, 0);
                                    if (i13 != g8) {
                                        g7 = (int) ((g8 * f6) + 0.5f);
                                    }
                                    rj1Var2.d(g8);
                                    this.b.e.e.d(g7);
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    l21 l21Var2 = l21Var.U;
                    if (l21Var2 != null) {
                        if (l21Var2.d.e.j) {
                            rj1Var2.d((int) ((rj1Var.g * l21Var.w) + 0.5f));
                        }
                    }
                }
            }
            boolean z7 = ci1Var.c;
            ArrayList arrayList2 = ci1Var.l;
            if (z7) {
                boolean z8 = ci1Var2.c;
                ArrayList arrayList3 = ci1Var2.l;
                if (z8) {
                    if (!ci1Var.j || !ci1Var2.j || !rj1Var2.j) {
                        if (!rj1Var2.j && this.d == k21.MATCH_CONSTRAINT) {
                            l21 l21Var3 = this.b;
                            if (l21Var3.r == 0 && !l21Var3.y()) {
                                int i14 = ((ci1) arrayList2.get(0)).g + ci1Var.f;
                                int i15 = ((ci1) arrayList3.get(0)).g + ci1Var2.f;
                                ci1Var.d(i14);
                                ci1Var2.d(i15);
                                rj1Var2.d(i15 - i14);
                                return;
                            }
                        }
                        if (!rj1Var2.j && this.d == k21.MATCH_CONSTRAINT && this.a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                            int min = Math.min((((ci1) arrayList3.get(0)).g + ci1Var2.f) - (((ci1) arrayList2.get(0)).g + ci1Var.f), rj1Var2.m);
                            l21 l21Var4 = this.b;
                            int i16 = l21Var4.v;
                            int max = Math.max(l21Var4.u, min);
                            if (i16 > 0) {
                                max = Math.min(i16, max);
                            }
                            rj1Var2.d(max);
                        }
                        if (rj1Var2.j) {
                            ci1 ci1Var5 = (ci1) arrayList2.get(0);
                            ci1 ci1Var6 = (ci1) arrayList3.get(0);
                            int i17 = ci1Var5.g;
                            int i18 = ci1Var.f + i17;
                            int i19 = ci1Var6.g;
                            int i20 = ci1Var2.f + i19;
                            float f7 = this.b.e0;
                            if (ci1Var5 == ci1Var6) {
                                f7 = 0.5f;
                            } else {
                                i17 = i18;
                                i19 = i20;
                            }
                            ci1Var.d((int) ((((i19 - i17) - rj1Var2.g) * f7) + i17 + 0.5f));
                            ci1Var2.d(ci1Var.g + rj1Var2.g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        l21 l21Var5 = this.b;
        l(l21Var5.I, l21Var5.K, 0);
    }

    @Override // defpackage.ct7
    public final void d() {
        l21 l21Var;
        l21 l21Var2;
        k21 k21Var;
        l21 l21Var3;
        l21 l21Var4;
        k21 k21Var2;
        l21 l21Var5 = this.b;
        boolean z = l21Var5.a;
        rj1 rj1Var = this.e;
        if (z) {
            rj1Var.d(l21Var5.r());
        }
        boolean z2 = rj1Var.j;
        ArrayList arrayList = rj1Var.k;
        ArrayList arrayList2 = rj1Var.l;
        ci1 ci1Var = this.i;
        ci1 ci1Var2 = this.h;
        if (!z2) {
            l21 l21Var6 = this.b;
            k21 k21Var3 = l21Var6.T[0];
            this.d = k21Var3;
            if (k21Var3 != k21.MATCH_CONSTRAINT) {
                k21 k21Var4 = k21.MATCH_PARENT;
                if (k21Var3 == k21Var4 && (l21Var4 = l21Var6.U) != null && ((k21Var2 = l21Var4.T[0]) == k21.FIXED || k21Var2 == k21Var4)) {
                    int r = (l21Var4.r() - this.b.I.e()) - this.b.K.e();
                    ct7.b(ci1Var2, l21Var4.d.h, this.b.I.e());
                    ct7.b(ci1Var, l21Var4.d.i, -this.b.K.e());
                    rj1Var.d(r);
                    return;
                } else if (k21Var3 == k21.FIXED) {
                    rj1Var.d(l21Var6.r());
                }
            }
        } else {
            k21 k21Var5 = this.d;
            k21 k21Var6 = k21.MATCH_PARENT;
            if (k21Var5 == k21Var6 && (l21Var2 = (l21Var = this.b).U) != null && ((k21Var = l21Var2.T[0]) == k21.FIXED || k21Var == k21Var6)) {
                ct7.b(ci1Var2, l21Var2.d.h, l21Var.I.e());
                ct7.b(ci1Var, l21Var2.d.i, -this.b.K.e());
                return;
            }
        }
        if (rj1Var.j) {
            l21 l21Var7 = this.b;
            if (l21Var7.a) {
                h11[] h11VarArr = l21Var7.Q;
                h11 h11Var = h11VarArr[0];
                h11 h11Var2 = h11Var.f;
                if (h11Var2 != null && h11VarArr[1].f != null) {
                    boolean y = l21Var7.y();
                    l21 l21Var8 = this.b;
                    if (y) {
                        ci1Var2.f = l21Var8.Q[0].e();
                        ci1Var.f = -this.b.Q[1].e();
                        return;
                    }
                    ci1 h = ct7.h(l21Var8.Q[0]);
                    if (h != null) {
                        ct7.b(ci1Var2, h, this.b.Q[0].e());
                    }
                    ci1 h2 = ct7.h(this.b.Q[1]);
                    if (h2 != null) {
                        ct7.b(ci1Var, h2, -this.b.Q[1].e());
                    }
                    ci1Var2.b = true;
                    ci1Var.b = true;
                    return;
                } else if (h11Var2 != null) {
                    ci1 h3 = ct7.h(h11Var);
                    if (h3 != null) {
                        ct7.b(ci1Var2, h3, this.b.Q[0].e());
                        ct7.b(ci1Var, ci1Var2, rj1Var.g);
                        return;
                    }
                    return;
                } else {
                    h11 h11Var3 = h11VarArr[1];
                    if (h11Var3.f != null) {
                        ci1 h4 = ct7.h(h11Var3);
                        if (h4 != null) {
                            ct7.b(ci1Var, h4, -this.b.Q[1].e());
                            ct7.b(ci1Var2, ci1Var, -rj1Var.g);
                            return;
                        }
                        return;
                    } else if (!(l21Var7 instanceof gx2) && l21Var7.U != null && l21Var7.j(g11.CENTER).f == null) {
                        l21 l21Var9 = this.b;
                        ct7.b(ci1Var2, l21Var9.U.d.h, l21Var9.s());
                        ct7.b(ci1Var, ci1Var2, rj1Var.g);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (this.d == k21.MATCH_CONSTRAINT) {
            l21 l21Var10 = this.b;
            int i = l21Var10.r;
            if (i != 2) {
                if (i == 3) {
                    if (l21Var10.s == 3) {
                        ci1Var2.a = this;
                        ci1Var.a = this;
                        lm7 lm7Var = l21Var10.e;
                        lm7Var.h.a = this;
                        lm7Var.i.a = this;
                        rj1Var.a = this;
                        if (l21Var10.z()) {
                            arrayList2.add(this.b.e.e);
                            this.b.e.e.k.add(rj1Var);
                            lm7 lm7Var2 = this.b.e;
                            lm7Var2.e.a = this;
                            arrayList2.add(lm7Var2.h);
                            arrayList2.add(this.b.e.i);
                            this.b.e.h.k.add(rj1Var);
                            this.b.e.i.k.add(rj1Var);
                        } else {
                            boolean y2 = this.b.y();
                            l21 l21Var11 = this.b;
                            if (y2) {
                                l21Var11.e.e.l.add(rj1Var);
                                arrayList.add(this.b.e.e);
                            } else {
                                l21Var11.e.e.l.add(rj1Var);
                            }
                        }
                    } else {
                        rj1 rj1Var2 = l21Var10.e.e;
                        arrayList2.add(rj1Var2);
                        rj1Var2.k.add(rj1Var);
                        this.b.e.h.k.add(rj1Var);
                        this.b.e.i.k.add(rj1Var);
                        rj1Var.b = true;
                        arrayList.add(ci1Var2);
                        arrayList.add(ci1Var);
                        ci1Var2.l.add(rj1Var);
                        ci1Var.l.add(rj1Var);
                    }
                }
            } else {
                l21 l21Var12 = l21Var10.U;
                if (l21Var12 != null) {
                    rj1 rj1Var3 = l21Var12.e.e;
                    arrayList2.add(rj1Var3);
                    rj1Var3.k.add(rj1Var);
                    rj1Var.b = true;
                    arrayList.add(ci1Var2);
                    arrayList.add(ci1Var);
                }
            }
        }
        l21 l21Var13 = this.b;
        h11[] h11VarArr2 = l21Var13.Q;
        h11 h11Var4 = h11VarArr2[0];
        h11 h11Var5 = h11Var4.f;
        if (h11Var5 != null && h11VarArr2[1].f != null) {
            boolean y3 = l21Var13.y();
            l21 l21Var14 = this.b;
            if (y3) {
                ci1Var2.f = l21Var14.Q[0].e();
                ci1Var.f = -this.b.Q[1].e();
                return;
            }
            ci1 h5 = ct7.h(l21Var14.Q[0]);
            ci1 h6 = ct7.h(this.b.Q[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.j = bt7.CENTER;
        } else if (h11Var5 != null) {
            ci1 h7 = ct7.h(h11Var4);
            if (h7 != null) {
                ct7.b(ci1Var2, h7, this.b.Q[0].e());
                c(ci1Var, ci1Var2, 1, rj1Var);
            }
        } else {
            h11 h11Var6 = h11VarArr2[1];
            if (h11Var6.f != null) {
                ci1 h8 = ct7.h(h11Var6);
                if (h8 != null) {
                    ct7.b(ci1Var, h8, -this.b.Q[1].e());
                    c(ci1Var2, ci1Var, -1, rj1Var);
                }
            } else if (!(l21Var13 instanceof gx2) && (l21Var3 = l21Var13.U) != null) {
                ct7.b(ci1Var2, l21Var3.d.h, l21Var13.s());
                c(ci1Var, ci1Var2, 1, rj1Var);
            }
        }
    }

    @Override // defpackage.ct7
    public final void e() {
        ci1 ci1Var = this.h;
        if (ci1Var.j) {
            this.b.Z = ci1Var.g;
        }
    }

    @Override // defpackage.ct7
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.ct7
    public final boolean k() {
        if (this.d != k21.MATCH_CONSTRAINT || this.b.r == 0) {
            return true;
        }
        return false;
    }

    public final void n() {
        this.g = false;
        ci1 ci1Var = this.h;
        ci1Var.c();
        ci1Var.j = false;
        ci1 ci1Var2 = this.i;
        ci1Var2.c();
        ci1Var2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.j0;
    }
}
