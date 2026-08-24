package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ct7  reason: default package */
/* loaded from: classes.dex */
public abstract class ct7 implements xh1 {
    public int a;
    public l21 b;
    public s26 c;
    public k21 d;
    public final rj1 e = new rj1(this);
    public int f = 0;
    public boolean g = false;
    public final ci1 h = new ci1(this);
    public final ci1 i = new ci1(this);
    public bt7 j = bt7.NONE;

    public ct7(l21 l21Var) {
        this.b = l21Var;
    }

    public static void b(ci1 ci1Var, ci1 ci1Var2, int i) {
        ci1Var.l.add(ci1Var2);
        ci1Var.f = i;
        ci1Var2.k.add(ci1Var);
    }

    public static ci1 h(h11 h11Var) {
        h11 h11Var2 = h11Var.f;
        if (h11Var2 != null) {
            l21 l21Var = h11Var2.d;
            int i = at7.a[h11Var2.e.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return l21Var.e.i;
                        }
                        return l21Var.e.k;
                    }
                    return l21Var.e.h;
                }
                return l21Var.d.i;
            }
            return l21Var.d.h;
        }
        return null;
    }

    public static ci1 i(h11 h11Var, int i) {
        ct7 ct7Var;
        h11 h11Var2 = h11Var.f;
        if (h11Var2 != null) {
            l21 l21Var = h11Var2.d;
            if (i == 0) {
                ct7Var = l21Var.d;
            } else {
                ct7Var = l21Var.e;
            }
            int i2 = at7.a[h11Var2.e.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 5) {
                            return null;
                        }
                    }
                }
                return ct7Var.i;
            }
            return ct7Var.h;
        }
        return null;
    }

    public final void c(ci1 ci1Var, ci1 ci1Var2, int i, rj1 rj1Var) {
        ci1Var.l.add(ci1Var2);
        ci1Var.l.add(this.e);
        ci1Var.h = i;
        ci1Var.i = rj1Var;
        ci1Var2.k.add(ci1Var);
        rj1Var.k.add(ci1Var);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        l21 l21Var = this.b;
        if (i2 == 0) {
            int i3 = l21Var.v;
            int max = Math.max(l21Var.u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            int i4 = l21Var.y;
            int max2 = Math.max(l21Var.x, i);
            if (i4 > 0) {
                max2 = Math.min(i4, i);
            }
            if (max2 != i) {
                return max2;
            }
        }
        return i;
    }

    public long j() {
        rj1 rj1Var = this.e;
        if (rj1Var.j) {
            return rj1Var.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
        if (r10.a == 3) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(h11 h11Var, h11 h11Var2, int i) {
        float f;
        ct7 ct7Var;
        rj1 rj1Var;
        float f2;
        int i2;
        ci1 h = h(h11Var);
        ci1 h2 = h(h11Var2);
        if (h.j && h2.j) {
            int e = h11Var.e() + h.g;
            int e2 = h2.g - h11Var2.e();
            int i3 = e2 - e;
            rj1 rj1Var2 = this.e;
            if (!rj1Var2.j) {
                k21 k21Var = this.d;
                k21 k21Var2 = k21.MATCH_CONSTRAINT;
                if (k21Var == k21Var2) {
                    int i4 = this.a;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 == 3) {
                                    l21 l21Var = this.b;
                                    ct7 ct7Var2 = l21Var.d;
                                    if (ct7Var2.d == k21Var2 && ct7Var2.a == 3) {
                                        lm7 lm7Var = l21Var.e;
                                        if (lm7Var.d == k21Var2) {
                                        }
                                    }
                                    if (i == 0) {
                                        ct7Var2 = l21Var.e;
                                    }
                                    rj1 rj1Var3 = ct7Var2.e;
                                    if (rj1Var3.j) {
                                        float f3 = l21Var.X;
                                        int i5 = rj1Var3.g;
                                        if (i == 1) {
                                            i2 = (int) ((i5 / f3) + 0.5f);
                                        } else {
                                            i2 = (int) ((f3 * i5) + 0.5f);
                                        }
                                        rj1Var2.d(i2);
                                    }
                                }
                            } else {
                                l21 l21Var2 = this.b;
                                l21 l21Var3 = l21Var2.U;
                                if (l21Var3 != null) {
                                    if (i == 0) {
                                        ct7Var = l21Var3.d;
                                    } else {
                                        ct7Var = l21Var3.e;
                                    }
                                    if (ct7Var.e.j) {
                                        if (i == 0) {
                                            f2 = l21Var2.w;
                                        } else {
                                            f2 = l21Var2.z;
                                        }
                                        rj1Var2.d(g((int) ((rj1Var.g * f2) + 0.5f), i));
                                    }
                                }
                            }
                        } else {
                            rj1Var2.d(Math.min(g(rj1Var2.m, i), i3));
                        }
                    } else {
                        rj1Var2.d(g(i3, i));
                    }
                }
            }
            if (rj1Var2.j) {
                int i6 = rj1Var2.g;
                ci1 ci1Var = this.i;
                ci1 ci1Var2 = this.h;
                if (i6 == i3) {
                    ci1Var2.d(e);
                    ci1Var.d(e2);
                    return;
                }
                l21 l21Var4 = this.b;
                if (i == 0) {
                    f = l21Var4.e0;
                } else {
                    f = l21Var4.f0;
                }
                if (h == h2) {
                    e = h.g;
                    e2 = h2.g;
                    f = 0.5f;
                }
                ci1Var2.d((int) ((((e2 - e) - i6) * f) + e + 0.5f));
                ci1Var.d(ci1Var2.g + rj1Var2.g);
            }
        }
    }
}
