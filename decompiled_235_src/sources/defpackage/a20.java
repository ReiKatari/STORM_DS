package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a20  reason: default package */
/* loaded from: classes.dex */
public final class a20 extends gx2 {
    public int v0 = 0;
    public boolean w0 = true;
    public int x0 = 0;
    public boolean y0 = false;

    @Override // defpackage.l21
    public final boolean B() {
        return this.y0;
    }

    @Override // defpackage.l21
    public final boolean C() {
        return this.y0;
    }

    public final boolean V() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.u0;
            if (i4 >= i) {
                break;
            }
            l21 l21Var = this.t0[i4];
            if ((this.w0 || l21Var.c()) && ((((i2 = this.v0) == 0 || i2 == 1) && !l21Var.B()) || (((i3 = this.v0) == 2 || i3 == 3) && !l21Var.C()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.u0; i6++) {
            l21 l21Var2 = this.t0[i6];
            if (this.w0 || l21Var2.c()) {
                if (!z2) {
                    int i7 = this.v0;
                    if (i7 == 0) {
                        i5 = l21Var2.j(g11.LEFT).d();
                    } else if (i7 == 1) {
                        i5 = l21Var2.j(g11.RIGHT).d();
                    } else if (i7 == 2) {
                        i5 = l21Var2.j(g11.TOP).d();
                    } else if (i7 == 3) {
                        i5 = l21Var2.j(g11.BOTTOM).d();
                    }
                    z2 = true;
                }
                int i8 = this.v0;
                if (i8 == 0) {
                    i5 = Math.min(i5, l21Var2.j(g11.LEFT).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, l21Var2.j(g11.RIGHT).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, l21Var2.j(g11.TOP).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, l21Var2.j(g11.BOTTOM).d());
                }
            }
        }
        int i9 = i5 + this.x0;
        int i10 = this.v0;
        if (i10 != 0 && i10 != 1) {
            L(i9, i9);
        } else {
            K(i9, i9);
        }
        this.y0 = true;
        return true;
    }

    public final int W() {
        int i = this.v0;
        if (i != 0 && i != 1) {
            if (i == 2 || i == 3) {
                return 1;
            }
            return -1;
        }
        return 0;
    }

    @Override // defpackage.l21
    public final void b(jv3 jv3Var, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        h11[] h11VarArr = this.Q;
        h11 h11Var = this.I;
        h11VarArr[0] = h11Var;
        int i5 = 2;
        h11 h11Var2 = this.J;
        h11VarArr[2] = h11Var2;
        h11 h11Var3 = this.K;
        h11VarArr[1] = h11Var3;
        h11 h11Var4 = this.L;
        h11VarArr[3] = h11Var4;
        for (h11 h11Var5 : h11VarArr) {
            h11Var5.i = jv3Var.k(h11Var5);
        }
        int i6 = this.v0;
        if (i6 >= 0 && i6 < 4) {
            h11 h11Var6 = h11VarArr[i6];
            if (!this.y0) {
                V();
            }
            if (this.y0) {
                this.y0 = false;
                int i7 = this.v0;
                if (i7 != 0 && i7 != 1) {
                    if (i7 == 2 || i7 == 3) {
                        jv3Var.d(h11Var2.i, this.a0);
                        jv3Var.d(h11Var4.i, this.a0);
                        return;
                    }
                    return;
                }
                jv3Var.d(h11Var.i, this.Z);
                jv3Var.d(h11Var3.i, this.Z);
                return;
            }
            for (int i8 = 0; i8 < this.u0; i8++) {
                l21 l21Var = this.t0[i8];
                if ((this.w0 || l21Var.c()) && ((((i4 = this.v0) == 0 || i4 == 1) && l21Var.T[0] == k21.MATCH_CONSTRAINT && l21Var.I.f != null && l21Var.K.f != null) || ((i4 == 2 || i4 == 3) && l21Var.T[1] == k21.MATCH_CONSTRAINT && l21Var.J.f != null && l21Var.L.f != null))) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
            if (!h11Var.g() && !h11Var3.g()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!h11Var2.g() && !h11Var4.g()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z2 && (((i3 = this.v0) == 0 && z3) || ((i3 == 2 && z4) || ((i3 == 1 && z3) || (i3 == 3 && z4))))) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                i = 4;
            } else {
                i = 5;
            }
            int i9 = 0;
            while (i9 < this.u0) {
                l21 l21Var2 = this.t0[i9];
                if (this.w0 || l21Var2.c()) {
                    en6 k = jv3Var.k(l21Var2.Q[this.v0]);
                    h11[] h11VarArr2 = l21Var2.Q;
                    int i10 = this.v0;
                    h11 h11Var7 = h11VarArr2[i10];
                    h11Var7.i = k;
                    h11 h11Var8 = h11Var7.f;
                    if (h11Var8 != null && h11Var8.d == this) {
                        i2 = h11Var7.g;
                    } else {
                        i2 = 0;
                    }
                    if (i10 != 0 && i10 != i5) {
                        yu l = jv3Var.l();
                        en6 m = jv3Var.m();
                        m.R = 0;
                        l.b(h11Var6.i, k, m, this.x0 + i2);
                        jv3Var.c(l);
                    } else {
                        yu l2 = jv3Var.l();
                        en6 m2 = jv3Var.m();
                        m2.R = 0;
                        l2.c(h11Var6.i, k, m2, this.x0 - i2);
                        jv3Var.c(l2);
                    }
                    jv3Var.e(h11Var6.i, k, this.x0 + i2, i);
                }
                i9++;
                i5 = 2;
            }
            int i11 = this.v0;
            if (i11 == 0) {
                jv3Var.e(h11Var3.i, h11Var.i, 0, 8);
                jv3Var.e(h11Var.i, this.U.K.i, 0, 4);
                jv3Var.e(h11Var.i, this.U.I.i, 0, 0);
            } else if (i11 == 1) {
                jv3Var.e(h11Var.i, h11Var3.i, 0, 8);
                jv3Var.e(h11Var.i, this.U.I.i, 0, 4);
                jv3Var.e(h11Var.i, this.U.K.i, 0, 0);
            } else if (i11 == 2) {
                jv3Var.e(h11Var4.i, h11Var2.i, 0, 8);
                jv3Var.e(h11Var2.i, this.U.L.i, 0, 4);
                jv3Var.e(h11Var2.i, this.U.J.i, 0, 0);
            } else if (i11 == 3) {
                jv3Var.e(h11Var2.i, h11Var4.i, 0, 8);
                jv3Var.e(h11Var2.i, this.U.J.i, 0, 4);
                jv3Var.e(h11Var2.i, this.U.L.i, 0, 0);
            }
        }
    }

    @Override // defpackage.l21
    public final boolean c() {
        return true;
    }

    @Override // defpackage.gx2, defpackage.l21
    public final void g(l21 l21Var, HashMap hashMap) {
        super.g(l21Var, hashMap);
        a20 a20Var = (a20) l21Var;
        this.v0 = a20Var.v0;
        this.w0 = a20Var.w0;
        this.x0 = a20Var.x0;
    }

    @Override // defpackage.l21
    public final String toString() {
        String n = i61.n(new StringBuilder("[Barrier] "), this.j0, " {");
        for (int i = 0; i < this.u0; i++) {
            l21 l21Var = this.t0[i];
            if (i > 0) {
                n = n.concat(", ");
            }
            StringBuilder s = lb1.s(n);
            s.append(l21Var.j0);
            n = s.toString();
        }
        return n.concat("}");
    }
}
