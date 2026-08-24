package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lm7  reason: default package */
/* loaded from: classes.dex */
public final class lm7 extends ct7 {
    public ci1 k;
    public w20 l;

    @Override // defpackage.xh1
    public final void a(xh1 xh1Var) {
        rj1 rj1Var;
        float f;
        float f2;
        float f3;
        int i;
        if (km7.a[this.j.ordinal()] != 3) {
            rj1 rj1Var2 = this.e;
            if (rj1Var2.c && !rj1Var2.j && this.d == k21.MATCH_CONSTRAINT) {
                l21 l21Var = this.b;
                int i2 = l21Var.s;
                if (i2 != 2) {
                    if (i2 == 3) {
                        rj1 rj1Var3 = l21Var.d.e;
                        if (rj1Var3.j) {
                            int i3 = l21Var.Y;
                            if (i3 != -1) {
                                if (i3 != 0) {
                                    if (i3 != 1) {
                                        i = 0;
                                        rj1Var2.d(i);
                                    } else {
                                        f = rj1Var3.g;
                                        f2 = l21Var.X;
                                    }
                                } else {
                                    f3 = rj1Var3.g * l21Var.X;
                                    i = (int) (f3 + 0.5f);
                                    rj1Var2.d(i);
                                }
                            } else {
                                f = rj1Var3.g;
                                f2 = l21Var.X;
                            }
                            f3 = f / f2;
                            i = (int) (f3 + 0.5f);
                            rj1Var2.d(i);
                        }
                    }
                } else {
                    l21 l21Var2 = l21Var.U;
                    if (l21Var2 != null) {
                        if (l21Var2.e.e.j) {
                            rj1Var2.d((int) ((rj1Var.g * l21Var.z) + 0.5f));
                        }
                    }
                }
            }
            ci1 ci1Var = this.h;
            boolean z = ci1Var.c;
            ArrayList arrayList = ci1Var.l;
            if (z) {
                ci1 ci1Var2 = this.i;
                boolean z2 = ci1Var2.c;
                ArrayList arrayList2 = ci1Var2.l;
                if (z2) {
                    if (!ci1Var.j || !ci1Var2.j || !rj1Var2.j) {
                        if (!rj1Var2.j && this.d == k21.MATCH_CONSTRAINT) {
                            l21 l21Var3 = this.b;
                            if (l21Var3.r == 0 && !l21Var3.z()) {
                                int i4 = ((ci1) arrayList.get(0)).g + ci1Var.f;
                                int i5 = ((ci1) arrayList2.get(0)).g + ci1Var2.f;
                                ci1Var.d(i4);
                                ci1Var2.d(i5);
                                rj1Var2.d(i5 - i4);
                                return;
                            }
                        }
                        if (!rj1Var2.j && this.d == k21.MATCH_CONSTRAINT && this.a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                            int i6 = (((ci1) arrayList2.get(0)).g + ci1Var2.f) - (((ci1) arrayList.get(0)).g + ci1Var.f);
                            int i7 = rj1Var2.m;
                            if (i6 < i7) {
                                rj1Var2.d(i6);
                            } else {
                                rj1Var2.d(i7);
                            }
                        }
                        if (rj1Var2.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                            ci1 ci1Var3 = (ci1) arrayList.get(0);
                            ci1 ci1Var4 = (ci1) arrayList2.get(0);
                            int i8 = ci1Var3.g;
                            int i9 = ci1Var.f + i8;
                            int i10 = ci1Var4.g;
                            int i11 = ci1Var2.f + i10;
                            float f4 = this.b.f0;
                            if (ci1Var3 == ci1Var4) {
                                f4 = 0.5f;
                            } else {
                                i8 = i9;
                                i10 = i11;
                            }
                            ci1Var.d((int) ((((i10 - i8) - rj1Var2.g) * f4) + i8 + 0.5f));
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
        l21 l21Var4 = this.b;
        l(l21Var4.J, l21Var4.L, 1);
    }

    /* JADX WARN: Type inference failed for: r1v102, types: [w20, rj1] */
    @Override // defpackage.ct7
    public final void d() {
        l21 l21Var;
        l21 l21Var2;
        l21 l21Var3;
        l21 l21Var4;
        ci1 ci1Var = this.k;
        l21 l21Var5 = this.b;
        boolean z = l21Var5.a;
        rj1 rj1Var = this.e;
        if (z) {
            rj1Var.d(l21Var5.l());
        }
        boolean z2 = rj1Var.j;
        ArrayList arrayList = rj1Var.k;
        ArrayList arrayList2 = rj1Var.l;
        ci1 ci1Var2 = this.i;
        ci1 ci1Var3 = this.h;
        if (!z2) {
            l21 l21Var6 = this.b;
            this.d = l21Var6.T[1];
            if (l21Var6.E) {
                this.l = new rj1(this);
            }
            k21 k21Var = this.d;
            if (k21Var != k21.MATCH_CONSTRAINT) {
                if (k21Var == k21.MATCH_PARENT && (l21Var4 = this.b.U) != null && l21Var4.T[1] == k21.FIXED) {
                    int l = (l21Var4.l() - this.b.J.e()) - this.b.L.e();
                    ct7.b(ci1Var3, l21Var4.e.h, this.b.J.e());
                    ct7.b(ci1Var2, l21Var4.e.i, -this.b.L.e());
                    rj1Var.d(l);
                    return;
                } else if (k21Var == k21.FIXED) {
                    rj1Var.d(this.b.l());
                }
            }
        } else if (this.d == k21.MATCH_PARENT && (l21Var2 = (l21Var = this.b).U) != null && l21Var2.T[1] == k21.FIXED) {
            ct7.b(ci1Var3, l21Var2.e.h, l21Var.J.e());
            ct7.b(ci1Var2, l21Var2.e.i, -this.b.L.e());
            return;
        }
        boolean z3 = rj1Var.j;
        if (z3) {
            l21 l21Var7 = this.b;
            if (l21Var7.a) {
                h11[] h11VarArr = l21Var7.Q;
                h11 h11Var = h11VarArr[2];
                h11 h11Var2 = h11Var.f;
                if (h11Var2 != null && h11VarArr[3].f != null) {
                    boolean z4 = l21Var7.z();
                    l21 l21Var8 = this.b;
                    if (z4) {
                        ci1Var3.f = l21Var8.Q[2].e();
                        ci1Var2.f = -this.b.Q[3].e();
                    } else {
                        ci1 h = ct7.h(l21Var8.Q[2]);
                        if (h != null) {
                            ct7.b(ci1Var3, h, this.b.Q[2].e());
                        }
                        ci1 h2 = ct7.h(this.b.Q[3]);
                        if (h2 != null) {
                            ct7.b(ci1Var2, h2, -this.b.Q[3].e());
                        }
                        ci1Var3.b = true;
                        ci1Var2.b = true;
                    }
                    l21 l21Var9 = this.b;
                    if (l21Var9.E) {
                        ct7.b(ci1Var, ci1Var3, l21Var9.b0);
                        return;
                    }
                    return;
                } else if (h11Var2 != null) {
                    ci1 h3 = ct7.h(h11Var);
                    if (h3 != null) {
                        ct7.b(ci1Var3, h3, this.b.Q[2].e());
                        ct7.b(ci1Var2, ci1Var3, rj1Var.g);
                        l21 l21Var10 = this.b;
                        if (l21Var10.E) {
                            ct7.b(ci1Var, ci1Var3, l21Var10.b0);
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    h11 h11Var3 = h11VarArr[3];
                    if (h11Var3.f != null) {
                        ci1 h4 = ct7.h(h11Var3);
                        if (h4 != null) {
                            ct7.b(ci1Var2, h4, -this.b.Q[3].e());
                            ct7.b(ci1Var3, ci1Var2, -rj1Var.g);
                        }
                        l21 l21Var11 = this.b;
                        if (l21Var11.E) {
                            ct7.b(ci1Var, ci1Var3, l21Var11.b0);
                            return;
                        }
                        return;
                    }
                    h11 h11Var4 = h11VarArr[4];
                    if (h11Var4.f != null) {
                        ci1 h5 = ct7.h(h11Var4);
                        if (h5 != null) {
                            ct7.b(ci1Var, h5, 0);
                            ct7.b(ci1Var3, ci1Var, -this.b.b0);
                            ct7.b(ci1Var2, ci1Var3, rj1Var.g);
                            return;
                        }
                        return;
                    } else if (!(l21Var7 instanceof gx2) && l21Var7.U != null && l21Var7.j(g11.CENTER).f == null) {
                        l21 l21Var12 = this.b;
                        ct7.b(ci1Var3, l21Var12.U.e.h, l21Var12.t());
                        ct7.b(ci1Var2, ci1Var3, rj1Var.g);
                        l21 l21Var13 = this.b;
                        if (l21Var13.E) {
                            ct7.b(ci1Var, ci1Var3, l21Var13.b0);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (!z3 && this.d == k21.MATCH_CONSTRAINT) {
            l21 l21Var14 = this.b;
            int i = l21Var14.s;
            if (i != 2) {
                if (i == 3 && !l21Var14.z()) {
                    l21 l21Var15 = this.b;
                    if (l21Var15.r != 3) {
                        rj1 rj1Var2 = l21Var15.d.e;
                        arrayList2.add(rj1Var2);
                        rj1Var2.k.add(rj1Var);
                        rj1Var.b = true;
                        arrayList.add(ci1Var3);
                        arrayList.add(ci1Var2);
                    }
                }
            } else {
                l21 l21Var16 = l21Var14.U;
                if (l21Var16 != null) {
                    rj1 rj1Var3 = l21Var16.e.e;
                    arrayList2.add(rj1Var3);
                    rj1Var3.k.add(rj1Var);
                    rj1Var.b = true;
                    arrayList.add(ci1Var3);
                    arrayList.add(ci1Var2);
                }
            }
        } else {
            rj1Var.b(this);
        }
        l21 l21Var17 = this.b;
        h11[] h11VarArr2 = l21Var17.Q;
        h11 h11Var5 = h11VarArr2[2];
        h11 h11Var6 = h11Var5.f;
        if (h11Var6 != null && h11VarArr2[3].f != null) {
            boolean z5 = l21Var17.z();
            l21 l21Var18 = this.b;
            if (z5) {
                ci1Var3.f = l21Var18.Q[2].e();
                ci1Var2.f = -this.b.Q[3].e();
            } else {
                ci1 h6 = ct7.h(l21Var18.Q[2]);
                ci1 h7 = ct7.h(this.b.Q[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.j = bt7.CENTER;
            }
            if (this.b.E) {
                c(ci1Var, ci1Var3, 1, this.l);
            }
        } else if (h11Var6 != null) {
            ci1 h8 = ct7.h(h11Var5);
            if (h8 != null) {
                ct7.b(ci1Var3, h8, this.b.Q[2].e());
                c(ci1Var2, ci1Var3, 1, rj1Var);
                if (this.b.E) {
                    c(ci1Var, ci1Var3, 1, this.l);
                }
                k21 k21Var2 = this.d;
                k21 k21Var3 = k21.MATCH_CONSTRAINT;
                if (k21Var2 == k21Var3) {
                    l21 l21Var19 = this.b;
                    if (l21Var19.X > RecyclerView.B1) {
                        ly2 ly2Var = l21Var19.d;
                        if (ly2Var.d == k21Var3) {
                            ly2Var.e.k.add(rj1Var);
                            arrayList2.add(this.b.d.e);
                            rj1Var.a = this;
                        }
                    }
                }
            }
        } else {
            h11 h11Var7 = h11VarArr2[3];
            if (h11Var7.f != null) {
                ci1 h9 = ct7.h(h11Var7);
                if (h9 != null) {
                    ct7.b(ci1Var2, h9, -this.b.Q[3].e());
                    c(ci1Var3, ci1Var2, -1, rj1Var);
                    if (this.b.E) {
                        c(ci1Var, ci1Var3, 1, this.l);
                    }
                }
            } else {
                h11 h11Var8 = h11VarArr2[4];
                if (h11Var8.f != null) {
                    ci1 h10 = ct7.h(h11Var8);
                    if (h10 != null) {
                        ct7.b(ci1Var, h10, 0);
                        c(ci1Var3, ci1Var, -1, this.l);
                        c(ci1Var2, ci1Var3, 1, rj1Var);
                    }
                } else if (!(l21Var17 instanceof gx2) && (l21Var3 = l21Var17.U) != null) {
                    ct7.b(ci1Var3, l21Var3.e.h, l21Var17.t());
                    c(ci1Var2, ci1Var3, 1, rj1Var);
                    if (this.b.E) {
                        c(ci1Var, ci1Var3, 1, this.l);
                    }
                    k21 k21Var4 = this.d;
                    k21 k21Var5 = k21.MATCH_CONSTRAINT;
                    if (k21Var4 == k21Var5) {
                        l21 l21Var20 = this.b;
                        if (l21Var20.X > RecyclerView.B1) {
                            ly2 ly2Var2 = l21Var20.d;
                            if (ly2Var2.d == k21Var5) {
                                ly2Var2.e.k.add(rj1Var);
                                arrayList2.add(this.b.d.e);
                                rj1Var.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            rj1Var.c = true;
        }
    }

    @Override // defpackage.ct7
    public final void e() {
        ci1 ci1Var = this.h;
        if (ci1Var.j) {
            this.b.a0 = ci1Var.g;
        }
    }

    @Override // defpackage.ct7
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.ct7
    public final boolean k() {
        if (this.d != k21.MATCH_CONSTRAINT || this.b.s == 0) {
            return true;
        }
        return false;
    }

    public final void m() {
        this.g = false;
        ci1 ci1Var = this.h;
        ci1Var.c();
        ci1Var.j = false;
        ci1 ci1Var2 = this.i;
        ci1Var2.c();
        ci1Var2.j = false;
        ci1 ci1Var3 = this.k;
        ci1Var3.c();
        ci1Var3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.j0;
    }
}
