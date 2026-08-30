package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yo2  reason: default package */
/* loaded from: classes.dex */
public final class yo2 extends gz0 {
    public float t0 = -1.0f;
    public int u0 = -1;
    public int v0 = -1;
    public cy0 w0 = this.J;
    public int x0 = 0;
    public boolean y0;

    public yo2() {
        this.R.clear();
        this.R.add(this.w0);
        int length = this.Q.length;
        for (int i = 0; i < length; i++) {
            this.Q[i] = this.w0;
        }
    }

    @Override // defpackage.gz0
    public final boolean B() {
        return this.y0;
    }

    @Override // defpackage.gz0
    public final boolean C() {
        return this.y0;
    }

    @Override // defpackage.gz0
    public final void R(ho3 ho3Var, boolean z) {
        if (this.U == null) {
            return;
        }
        cy0 cy0Var = this.w0;
        ho3Var.getClass();
        int n = ho3.n(cy0Var);
        if (this.x0 == 1) {
            this.Z = n;
            this.a0 = 0;
            M(this.U.l());
            P(0);
            return;
        }
        this.Z = 0;
        this.a0 = n;
        P(this.U.r());
        M(0);
    }

    public final void S(int i) {
        this.w0.l(i);
        this.y0 = true;
    }

    public final void T(int i) {
        if (this.x0 != i) {
            this.x0 = i;
            ArrayList arrayList = this.R;
            arrayList.clear();
            if (this.x0 == 1) {
                this.w0 = this.I;
            } else {
                this.w0 = this.J;
            }
            arrayList.add(this.w0);
            cy0[] cy0VarArr = this.Q;
            int length = cy0VarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                cy0VarArr[i2] = this.w0;
            }
        }
    }

    @Override // defpackage.gz0
    public final void b(ho3 ho3Var, boolean z) {
        boolean z2;
        hz0 hz0Var = (hz0) this.U;
        if (hz0Var != null) {
            Object j = hz0Var.j(by0.LEFT);
            Object j2 = hz0Var.j(by0.RIGHT);
            gz0 gz0Var = this.U;
            boolean z3 = true;
            if (gz0Var != null && gz0Var.T[0] == fz0.WRAP_CONTENT) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.x0 == 0) {
                j = hz0Var.j(by0.TOP);
                j2 = hz0Var.j(by0.BOTTOM);
                gz0 gz0Var2 = this.U;
                if (gz0Var2 == null || gz0Var2.T[1] != fz0.WRAP_CONTENT) {
                    z3 = false;
                }
                z2 = z3;
            }
            if (this.y0) {
                cy0 cy0Var = this.w0;
                if (cy0Var.c) {
                    ob6 k = ho3Var.k(cy0Var);
                    ho3Var.d(k, this.w0.d());
                    if (this.u0 != -1) {
                        if (z2) {
                            ho3Var.f(ho3Var.k(j2), k, 0, 5);
                        }
                    } else if (this.v0 != -1 && z2) {
                        ob6 k2 = ho3Var.k(j2);
                        ho3Var.f(k, ho3Var.k(j), 0, 5);
                        ho3Var.f(k2, k, 0, 5);
                    }
                    this.y0 = false;
                    return;
                }
            }
            if (this.u0 != -1) {
                ob6 k3 = ho3Var.k(this.w0);
                ho3Var.e(k3, ho3Var.k(j), this.u0, 8);
                if (z2) {
                    ho3Var.f(ho3Var.k(j2), k3, 0, 5);
                }
            } else if (this.v0 != -1) {
                ob6 k4 = ho3Var.k(this.w0);
                ob6 k5 = ho3Var.k(j2);
                ho3Var.e(k4, k5, -this.v0, 8);
                if (z2) {
                    ho3Var.f(k4, ho3Var.k(j), 0, 5);
                    ho3Var.f(k5, k4, 0, 5);
                }
            } else if (this.t0 != -1.0f) {
                ob6 k6 = ho3Var.k(this.w0);
                ob6 k7 = ho3Var.k(j2);
                float f = this.t0;
                gu l = ho3Var.l();
                l.d.g(k6, -1.0f);
                l.d.g(k7, f);
                ho3Var.c(l);
            }
        }
    }

    @Override // defpackage.gz0
    public final boolean c() {
        return true;
    }

    @Override // defpackage.gz0
    public final void g(gz0 gz0Var, HashMap hashMap) {
        super.g(gz0Var, hashMap);
        yo2 yo2Var = (yo2) gz0Var;
        this.t0 = yo2Var.t0;
        this.u0 = yo2Var.u0;
        this.v0 = yo2Var.v0;
        T(yo2Var.x0);
    }

    @Override // defpackage.gz0
    public final cy0 j(by0 by0Var) {
        int i = wo2.a[by0Var.ordinal()];
        if (i != 1 && i != 2) {
            if ((i == 3 || i == 4) && this.x0 == 0) {
                return this.w0;
            }
            return null;
        } else if (this.x0 == 1) {
            return this.w0;
        } else {
            return null;
        }
    }
}
