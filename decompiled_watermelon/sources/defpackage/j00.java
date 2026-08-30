package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j00  reason: default package */
/* loaded from: classes.dex */
public final class j00 extends fr2 {
    public int v0 = 0;
    public boolean w0 = true;
    public int x0 = 0;
    public boolean y0 = false;

    @Override // defpackage.gz0
    public final boolean B() {
        return this.y0;
    }

    @Override // defpackage.gz0
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
            gz0 gz0Var = this.t0[i4];
            if ((this.w0 || gz0Var.c()) && ((((i2 = this.v0) == 0 || i2 == 1) && !gz0Var.B()) || (((i3 = this.v0) == 2 || i3 == 3) && !gz0Var.C()))) {
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
            gz0 gz0Var2 = this.t0[i6];
            if (this.w0 || gz0Var2.c()) {
                if (!z2) {
                    int i7 = this.v0;
                    if (i7 == 0) {
                        i5 = gz0Var2.j(by0.LEFT).d();
                    } else if (i7 == 1) {
                        i5 = gz0Var2.j(by0.RIGHT).d();
                    } else if (i7 == 2) {
                        i5 = gz0Var2.j(by0.TOP).d();
                    } else if (i7 == 3) {
                        i5 = gz0Var2.j(by0.BOTTOM).d();
                    }
                    z2 = true;
                }
                int i8 = this.v0;
                if (i8 == 0) {
                    i5 = Math.min(i5, gz0Var2.j(by0.LEFT).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, gz0Var2.j(by0.RIGHT).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, gz0Var2.j(by0.TOP).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, gz0Var2.j(by0.BOTTOM).d());
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

    @Override // defpackage.gz0
    public final void b(ho3 ho3Var, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        cy0[] cy0VarArr = this.Q;
        cy0 cy0Var = this.I;
        cy0VarArr[0] = cy0Var;
        int i5 = 2;
        cy0 cy0Var2 = this.J;
        cy0VarArr[2] = cy0Var2;
        cy0 cy0Var3 = this.K;
        cy0VarArr[1] = cy0Var3;
        cy0 cy0Var4 = this.L;
        cy0VarArr[3] = cy0Var4;
        for (cy0 cy0Var5 : cy0VarArr) {
            cy0Var5.i = ho3Var.k(cy0Var5);
        }
        int i6 = this.v0;
        if (i6 >= 0 && i6 < 4) {
            cy0 cy0Var6 = cy0VarArr[i6];
            if (!this.y0) {
                V();
            }
            if (this.y0) {
                this.y0 = false;
                int i7 = this.v0;
                if (i7 != 0 && i7 != 1) {
                    if (i7 == 2 || i7 == 3) {
                        ho3Var.d(cy0Var2.i, this.a0);
                        ho3Var.d(cy0Var4.i, this.a0);
                        return;
                    }
                    return;
                }
                ho3Var.d(cy0Var.i, this.Z);
                ho3Var.d(cy0Var3.i, this.Z);
                return;
            }
            for (int i8 = 0; i8 < this.u0; i8++) {
                gz0 gz0Var = this.t0[i8];
                if ((this.w0 || gz0Var.c()) && ((((i4 = this.v0) == 0 || i4 == 1) && gz0Var.T[0] == fz0.MATCH_CONSTRAINT && gz0Var.I.f != null && gz0Var.K.f != null) || ((i4 == 2 || i4 == 3) && gz0Var.T[1] == fz0.MATCH_CONSTRAINT && gz0Var.J.f != null && gz0Var.L.f != null))) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
            if (!cy0Var.g() && !cy0Var3.g()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!cy0Var2.g() && !cy0Var4.g()) {
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
                gz0 gz0Var2 = this.t0[i9];
                if (this.w0 || gz0Var2.c()) {
                    ob6 k = ho3Var.k(gz0Var2.Q[this.v0]);
                    cy0[] cy0VarArr2 = gz0Var2.Q;
                    int i10 = this.v0;
                    cy0 cy0Var7 = cy0VarArr2[i10];
                    cy0Var7.i = k;
                    cy0 cy0Var8 = cy0Var7.f;
                    if (cy0Var8 != null && cy0Var8.d == this) {
                        i2 = cy0Var7.g;
                    } else {
                        i2 = 0;
                    }
                    if (i10 != 0 && i10 != i5) {
                        gu l = ho3Var.l();
                        ob6 m = ho3Var.m();
                        m.R = 0;
                        l.b(cy0Var6.i, k, m, this.x0 + i2);
                        ho3Var.c(l);
                    } else {
                        gu l2 = ho3Var.l();
                        ob6 m2 = ho3Var.m();
                        m2.R = 0;
                        l2.c(cy0Var6.i, k, m2, this.x0 - i2);
                        ho3Var.c(l2);
                    }
                    ho3Var.e(cy0Var6.i, k, this.x0 + i2, i);
                }
                i9++;
                i5 = 2;
            }
            int i11 = this.v0;
            if (i11 == 0) {
                ho3Var.e(cy0Var3.i, cy0Var.i, 0, 8);
                ho3Var.e(cy0Var.i, this.U.K.i, 0, 4);
                ho3Var.e(cy0Var.i, this.U.I.i, 0, 0);
            } else if (i11 == 1) {
                ho3Var.e(cy0Var.i, cy0Var3.i, 0, 8);
                ho3Var.e(cy0Var.i, this.U.I.i, 0, 4);
                ho3Var.e(cy0Var.i, this.U.K.i, 0, 0);
            } else if (i11 == 2) {
                ho3Var.e(cy0Var4.i, cy0Var2.i, 0, 8);
                ho3Var.e(cy0Var2.i, this.U.L.i, 0, 4);
                ho3Var.e(cy0Var2.i, this.U.J.i, 0, 0);
            } else if (i11 == 3) {
                ho3Var.e(cy0Var2.i, cy0Var4.i, 0, 8);
                ho3Var.e(cy0Var2.i, this.U.J.i, 0, 4);
                ho3Var.e(cy0Var2.i, this.U.L.i, 0, 0);
            }
        }
    }

    @Override // defpackage.gz0
    public final boolean c() {
        return true;
    }

    @Override // defpackage.fr2, defpackage.gz0
    public final void g(gz0 gz0Var, HashMap hashMap) {
        super.g(gz0Var, hashMap);
        j00 j00Var = (j00) gz0Var;
        this.v0 = j00Var.v0;
        this.w0 = j00Var.w0;
        this.x0 = j00Var.x0;
    }

    @Override // defpackage.gz0
    public final String toString() {
        String q = b31.q(new StringBuilder("[Barrier] "), this.j0, " {");
        for (int i = 0; i < this.u0; i++) {
            gz0 gz0Var = this.t0[i];
            if (i > 0) {
                q = q.concat(", ");
            }
            StringBuilder r = wh1.r(q);
            r.append(gz0Var.j0);
            q = r.toString();
        }
        return q.concat("}");
    }
}
