package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m87  reason: default package */
/* loaded from: classes.dex */
public final class m87 extends be7 {
    public yd1 k;
    public c10 l;

    @Override // defpackage.ud1
    public final void a(ud1 ud1Var) {
        nf1 nf1Var;
        float f;
        float f2;
        float f3;
        int i;
        if (l87.a[this.j.ordinal()] != 3) {
            nf1 nf1Var2 = this.e;
            if (nf1Var2.c && !nf1Var2.j && this.d == fz0.MATCH_CONSTRAINT) {
                gz0 gz0Var = this.b;
                int i2 = gz0Var.s;
                if (i2 != 2) {
                    if (i2 == 3) {
                        nf1 nf1Var3 = gz0Var.d.e;
                        if (nf1Var3.j) {
                            int i3 = gz0Var.Y;
                            if (i3 != -1) {
                                if (i3 != 0) {
                                    if (i3 != 1) {
                                        i = 0;
                                        nf1Var2.d(i);
                                    } else {
                                        f = nf1Var3.g;
                                        f2 = gz0Var.X;
                                    }
                                } else {
                                    f3 = nf1Var3.g * gz0Var.X;
                                    i = (int) (f3 + 0.5f);
                                    nf1Var2.d(i);
                                }
                            } else {
                                f = nf1Var3.g;
                                f2 = gz0Var.X;
                            }
                            f3 = f / f2;
                            i = (int) (f3 + 0.5f);
                            nf1Var2.d(i);
                        }
                    }
                } else {
                    gz0 gz0Var2 = gz0Var.U;
                    if (gz0Var2 != null) {
                        if (gz0Var2.e.e.j) {
                            nf1Var2.d((int) ((nf1Var.g * gz0Var.z) + 0.5f));
                        }
                    }
                }
            }
            yd1 yd1Var = this.h;
            boolean z = yd1Var.c;
            ArrayList arrayList = yd1Var.l;
            if (z) {
                yd1 yd1Var2 = this.i;
                boolean z2 = yd1Var2.c;
                ArrayList arrayList2 = yd1Var2.l;
                if (z2) {
                    if (!yd1Var.j || !yd1Var2.j || !nf1Var2.j) {
                        if (!nf1Var2.j && this.d == fz0.MATCH_CONSTRAINT) {
                            gz0 gz0Var3 = this.b;
                            if (gz0Var3.r == 0 && !gz0Var3.z()) {
                                int i4 = ((yd1) arrayList.get(0)).g + yd1Var.f;
                                int i5 = ((yd1) arrayList2.get(0)).g + yd1Var2.f;
                                yd1Var.d(i4);
                                yd1Var2.d(i5);
                                nf1Var2.d(i5 - i4);
                                return;
                            }
                        }
                        if (!nf1Var2.j && this.d == fz0.MATCH_CONSTRAINT && this.a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                            int i6 = (((yd1) arrayList2.get(0)).g + yd1Var2.f) - (((yd1) arrayList.get(0)).g + yd1Var.f);
                            int i7 = nf1Var2.m;
                            if (i6 < i7) {
                                nf1Var2.d(i6);
                            } else {
                                nf1Var2.d(i7);
                            }
                        }
                        if (nf1Var2.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                            yd1 yd1Var3 = (yd1) arrayList.get(0);
                            yd1 yd1Var4 = (yd1) arrayList2.get(0);
                            int i8 = yd1Var3.g;
                            int i9 = yd1Var.f + i8;
                            int i10 = yd1Var4.g;
                            int i11 = yd1Var2.f + i10;
                            float f4 = this.b.f0;
                            if (yd1Var3 == yd1Var4) {
                                f4 = 0.5f;
                            } else {
                                i8 = i9;
                                i10 = i11;
                            }
                            yd1Var.d((int) ((((i10 - i8) - nf1Var2.g) * f4) + i8 + 0.5f));
                            yd1Var2.d(yd1Var.g + nf1Var2.g);
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
        gz0 gz0Var4 = this.b;
        l(gz0Var4.J, gz0Var4.L, 1);
    }

    /* JADX WARN: Type inference failed for: r1v102, types: [c10, nf1] */
    @Override // defpackage.be7
    public final void d() {
        gz0 gz0Var;
        gz0 gz0Var2;
        gz0 gz0Var3;
        gz0 gz0Var4;
        yd1 yd1Var = this.k;
        gz0 gz0Var5 = this.b;
        boolean z = gz0Var5.a;
        nf1 nf1Var = this.e;
        if (z) {
            nf1Var.d(gz0Var5.l());
        }
        boolean z2 = nf1Var.j;
        ArrayList arrayList = nf1Var.k;
        ArrayList arrayList2 = nf1Var.l;
        yd1 yd1Var2 = this.i;
        yd1 yd1Var3 = this.h;
        if (!z2) {
            gz0 gz0Var6 = this.b;
            this.d = gz0Var6.T[1];
            if (gz0Var6.E) {
                this.l = new nf1(this);
            }
            fz0 fz0Var = this.d;
            if (fz0Var != fz0.MATCH_CONSTRAINT) {
                if (fz0Var == fz0.MATCH_PARENT && (gz0Var4 = this.b.U) != null && gz0Var4.T[1] == fz0.FIXED) {
                    int l = (gz0Var4.l() - this.b.J.e()) - this.b.L.e();
                    be7.b(yd1Var3, gz0Var4.e.h, this.b.J.e());
                    be7.b(yd1Var2, gz0Var4.e.i, -this.b.L.e());
                    nf1Var.d(l);
                    return;
                } else if (fz0Var == fz0.FIXED) {
                    nf1Var.d(this.b.l());
                }
            }
        } else if (this.d == fz0.MATCH_PARENT && (gz0Var2 = (gz0Var = this.b).U) != null && gz0Var2.T[1] == fz0.FIXED) {
            be7.b(yd1Var3, gz0Var2.e.h, gz0Var.J.e());
            be7.b(yd1Var2, gz0Var2.e.i, -this.b.L.e());
            return;
        }
        boolean z3 = nf1Var.j;
        if (z3) {
            gz0 gz0Var7 = this.b;
            if (gz0Var7.a) {
                cy0[] cy0VarArr = gz0Var7.Q;
                cy0 cy0Var = cy0VarArr[2];
                cy0 cy0Var2 = cy0Var.f;
                if (cy0Var2 != null && cy0VarArr[3].f != null) {
                    boolean z4 = gz0Var7.z();
                    gz0 gz0Var8 = this.b;
                    if (z4) {
                        yd1Var3.f = gz0Var8.Q[2].e();
                        yd1Var2.f = -this.b.Q[3].e();
                    } else {
                        yd1 h = be7.h(gz0Var8.Q[2]);
                        if (h != null) {
                            be7.b(yd1Var3, h, this.b.Q[2].e());
                        }
                        yd1 h2 = be7.h(this.b.Q[3]);
                        if (h2 != null) {
                            be7.b(yd1Var2, h2, -this.b.Q[3].e());
                        }
                        yd1Var3.b = true;
                        yd1Var2.b = true;
                    }
                    gz0 gz0Var9 = this.b;
                    if (gz0Var9.E) {
                        be7.b(yd1Var, yd1Var3, gz0Var9.b0);
                        return;
                    }
                    return;
                } else if (cy0Var2 != null) {
                    yd1 h3 = be7.h(cy0Var);
                    if (h3 != null) {
                        be7.b(yd1Var3, h3, this.b.Q[2].e());
                        be7.b(yd1Var2, yd1Var3, nf1Var.g);
                        gz0 gz0Var10 = this.b;
                        if (gz0Var10.E) {
                            be7.b(yd1Var, yd1Var3, gz0Var10.b0);
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    cy0 cy0Var3 = cy0VarArr[3];
                    if (cy0Var3.f != null) {
                        yd1 h4 = be7.h(cy0Var3);
                        if (h4 != null) {
                            be7.b(yd1Var2, h4, -this.b.Q[3].e());
                            be7.b(yd1Var3, yd1Var2, -nf1Var.g);
                        }
                        gz0 gz0Var11 = this.b;
                        if (gz0Var11.E) {
                            be7.b(yd1Var, yd1Var3, gz0Var11.b0);
                            return;
                        }
                        return;
                    }
                    cy0 cy0Var4 = cy0VarArr[4];
                    if (cy0Var4.f != null) {
                        yd1 h5 = be7.h(cy0Var4);
                        if (h5 != null) {
                            be7.b(yd1Var, h5, 0);
                            be7.b(yd1Var3, yd1Var, -this.b.b0);
                            be7.b(yd1Var2, yd1Var3, nf1Var.g);
                            return;
                        }
                        return;
                    } else if (!(gz0Var7 instanceof fr2) && gz0Var7.U != null && gz0Var7.j(by0.CENTER).f == null) {
                        gz0 gz0Var12 = this.b;
                        be7.b(yd1Var3, gz0Var12.U.e.h, gz0Var12.t());
                        be7.b(yd1Var2, yd1Var3, nf1Var.g);
                        gz0 gz0Var13 = this.b;
                        if (gz0Var13.E) {
                            be7.b(yd1Var, yd1Var3, gz0Var13.b0);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (!z3 && this.d == fz0.MATCH_CONSTRAINT) {
            gz0 gz0Var14 = this.b;
            int i = gz0Var14.s;
            if (i != 2) {
                if (i == 3 && !gz0Var14.z()) {
                    gz0 gz0Var15 = this.b;
                    if (gz0Var15.r != 3) {
                        nf1 nf1Var2 = gz0Var15.d.e;
                        arrayList2.add(nf1Var2);
                        nf1Var2.k.add(nf1Var);
                        nf1Var.b = true;
                        arrayList.add(yd1Var3);
                        arrayList.add(yd1Var2);
                    }
                }
            } else {
                gz0 gz0Var16 = gz0Var14.U;
                if (gz0Var16 != null) {
                    nf1 nf1Var3 = gz0Var16.e.e;
                    arrayList2.add(nf1Var3);
                    nf1Var3.k.add(nf1Var);
                    nf1Var.b = true;
                    arrayList.add(yd1Var3);
                    arrayList.add(yd1Var2);
                }
            }
        } else {
            nf1Var.b(this);
        }
        gz0 gz0Var17 = this.b;
        cy0[] cy0VarArr2 = gz0Var17.Q;
        cy0 cy0Var5 = cy0VarArr2[2];
        cy0 cy0Var6 = cy0Var5.f;
        if (cy0Var6 != null && cy0VarArr2[3].f != null) {
            boolean z5 = gz0Var17.z();
            gz0 gz0Var18 = this.b;
            if (z5) {
                yd1Var3.f = gz0Var18.Q[2].e();
                yd1Var2.f = -this.b.Q[3].e();
            } else {
                yd1 h6 = be7.h(gz0Var18.Q[2]);
                yd1 h7 = be7.h(this.b.Q[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.j = ae7.CENTER;
            }
            if (this.b.E) {
                c(yd1Var, yd1Var3, 1, this.l);
            }
        } else if (cy0Var6 != null) {
            yd1 h8 = be7.h(cy0Var5);
            if (h8 != null) {
                be7.b(yd1Var3, h8, this.b.Q[2].e());
                c(yd1Var2, yd1Var3, 1, nf1Var);
                if (this.b.E) {
                    c(yd1Var, yd1Var3, 1, this.l);
                }
                fz0 fz0Var2 = this.d;
                fz0 fz0Var3 = fz0.MATCH_CONSTRAINT;
                if (fz0Var2 == fz0Var3) {
                    gz0 gz0Var19 = this.b;
                    if (gz0Var19.X > RecyclerView.A1) {
                        ks2 ks2Var = gz0Var19.d;
                        if (ks2Var.d == fz0Var3) {
                            ks2Var.e.k.add(nf1Var);
                            arrayList2.add(this.b.d.e);
                            nf1Var.a = this;
                        }
                    }
                }
            }
        } else {
            cy0 cy0Var7 = cy0VarArr2[3];
            if (cy0Var7.f != null) {
                yd1 h9 = be7.h(cy0Var7);
                if (h9 != null) {
                    be7.b(yd1Var2, h9, -this.b.Q[3].e());
                    c(yd1Var3, yd1Var2, -1, nf1Var);
                    if (this.b.E) {
                        c(yd1Var, yd1Var3, 1, this.l);
                    }
                }
            } else {
                cy0 cy0Var8 = cy0VarArr2[4];
                if (cy0Var8.f != null) {
                    yd1 h10 = be7.h(cy0Var8);
                    if (h10 != null) {
                        be7.b(yd1Var, h10, 0);
                        c(yd1Var3, yd1Var, -1, this.l);
                        c(yd1Var2, yd1Var3, 1, nf1Var);
                    }
                } else if (!(gz0Var17 instanceof fr2) && (gz0Var3 = gz0Var17.U) != null) {
                    be7.b(yd1Var3, gz0Var3.e.h, gz0Var17.t());
                    c(yd1Var2, yd1Var3, 1, nf1Var);
                    if (this.b.E) {
                        c(yd1Var, yd1Var3, 1, this.l);
                    }
                    fz0 fz0Var4 = this.d;
                    fz0 fz0Var5 = fz0.MATCH_CONSTRAINT;
                    if (fz0Var4 == fz0Var5) {
                        gz0 gz0Var20 = this.b;
                        if (gz0Var20.X > RecyclerView.A1) {
                            ks2 ks2Var2 = gz0Var20.d;
                            if (ks2Var2.d == fz0Var5) {
                                ks2Var2.e.k.add(nf1Var);
                                arrayList2.add(this.b.d.e);
                                nf1Var.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            nf1Var.c = true;
        }
    }

    @Override // defpackage.be7
    public final void e() {
        yd1 yd1Var = this.h;
        if (yd1Var.j) {
            this.b.a0 = yd1Var.g;
        }
    }

    @Override // defpackage.be7
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.be7
    public final boolean k() {
        if (this.d != fz0.MATCH_CONSTRAINT || this.b.s == 0) {
            return true;
        }
        return false;
    }

    public final void m() {
        this.g = false;
        yd1 yd1Var = this.h;
        yd1Var.c();
        yd1Var.j = false;
        yd1 yd1Var2 = this.i;
        yd1Var2.c();
        yd1Var2.j = false;
        yd1 yd1Var3 = this.k;
        yd1Var3.c();
        yd1Var3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.j0;
    }
}
