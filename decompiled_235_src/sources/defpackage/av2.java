package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: av2  reason: default package */
/* loaded from: classes.dex */
public final class av2 extends l21 {
    public float t0 = -1.0f;
    public int u0 = -1;
    public int v0 = -1;
    public h11 w0 = this.J;
    public int x0 = 0;
    public boolean y0;

    public av2() {
        this.R.clear();
        this.R.add(this.w0);
        int length = this.Q.length;
        for (int i = 0; i < length; i++) {
            this.Q[i] = this.w0;
        }
    }

    @Override // defpackage.l21
    public final boolean B() {
        return this.y0;
    }

    @Override // defpackage.l21
    public final boolean C() {
        return this.y0;
    }

    @Override // defpackage.l21
    public final void R(jv3 jv3Var, boolean z) {
        if (this.U == null) {
            return;
        }
        h11 h11Var = this.w0;
        jv3Var.getClass();
        int n = jv3.n(h11Var);
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
            h11[] h11VarArr = this.Q;
            int length = h11VarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                h11VarArr[i2] = this.w0;
            }
        }
    }

    @Override // defpackage.l21
    public final void b(jv3 jv3Var, boolean z) {
        boolean z2;
        m21 m21Var = (m21) this.U;
        if (m21Var != null) {
            Object j = m21Var.j(g11.LEFT);
            Object j2 = m21Var.j(g11.RIGHT);
            l21 l21Var = this.U;
            boolean z3 = true;
            if (l21Var != null && l21Var.T[0] == k21.WRAP_CONTENT) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.x0 == 0) {
                j = m21Var.j(g11.TOP);
                j2 = m21Var.j(g11.BOTTOM);
                l21 l21Var2 = this.U;
                if (l21Var2 == null || l21Var2.T[1] != k21.WRAP_CONTENT) {
                    z3 = false;
                }
                z2 = z3;
            }
            if (this.y0) {
                h11 h11Var = this.w0;
                if (h11Var.c) {
                    en6 k = jv3Var.k(h11Var);
                    jv3Var.d(k, this.w0.d());
                    if (this.u0 != -1) {
                        if (z2) {
                            jv3Var.f(jv3Var.k(j2), k, 0, 5);
                        }
                    } else if (this.v0 != -1 && z2) {
                        en6 k2 = jv3Var.k(j2);
                        jv3Var.f(k, jv3Var.k(j), 0, 5);
                        jv3Var.f(k2, k, 0, 5);
                    }
                    this.y0 = false;
                    return;
                }
            }
            if (this.u0 != -1) {
                en6 k3 = jv3Var.k(this.w0);
                jv3Var.e(k3, jv3Var.k(j), this.u0, 8);
                if (z2) {
                    jv3Var.f(jv3Var.k(j2), k3, 0, 5);
                }
            } else if (this.v0 != -1) {
                en6 k4 = jv3Var.k(this.w0);
                en6 k5 = jv3Var.k(j2);
                jv3Var.e(k4, k5, -this.v0, 8);
                if (z2) {
                    jv3Var.f(k4, jv3Var.k(j), 0, 5);
                    jv3Var.f(k5, k4, 0, 5);
                }
            } else if (this.t0 != -1.0f) {
                en6 k6 = jv3Var.k(this.w0);
                en6 k7 = jv3Var.k(j2);
                float f = this.t0;
                yu l = jv3Var.l();
                l.d.g(k6, -1.0f);
                l.d.g(k7, f);
                jv3Var.c(l);
            }
        }
    }

    @Override // defpackage.l21
    public final boolean c() {
        return true;
    }

    @Override // defpackage.l21
    public final void g(l21 l21Var, HashMap hashMap) {
        super.g(l21Var, hashMap);
        av2 av2Var = (av2) l21Var;
        this.t0 = av2Var.t0;
        this.u0 = av2Var.u0;
        this.v0 = av2Var.v0;
        T(av2Var.x0);
    }

    @Override // defpackage.l21
    public final h11 j(g11 g11Var) {
        int i = yu2.a[g11Var.ordinal()];
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
