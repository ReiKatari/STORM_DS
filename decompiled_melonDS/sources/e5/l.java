package e5;

import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l extends g {

    /* renamed from: t0  reason: collision with root package name */
    public float f4361t0 = -1.0f;

    /* renamed from: u0  reason: collision with root package name */
    public int f4362u0 = -1;

    /* renamed from: v0  reason: collision with root package name */
    public int f4363v0 = -1;

    /* renamed from: w0  reason: collision with root package name */
    public d f4364w0 = this.J;

    /* renamed from: x0  reason: collision with root package name */
    public int f4365x0 = 0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f4366y0;

    public l() {
        this.R.clear();
        this.R.add(this.f4364w0);
        int length = this.Q.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.Q[i2] = this.f4364w0;
        }
    }

    @Override // e5.g
    public final boolean B() {
        return this.f4366y0;
    }

    @Override // e5.g
    public final boolean C() {
        return this.f4366y0;
    }

    @Override // e5.g
    public final void R(c5.c cVar, boolean z10) {
        if (this.U == null) {
            return;
        }
        d dVar = this.f4364w0;
        cVar.getClass();
        int n10 = c5.c.n(dVar);
        if (this.f4365x0 == 1) {
            this.Z = n10;
            this.f4289a0 = 0;
            M(this.U.l());
            P(0);
            return;
        }
        this.Z = 0;
        this.f4289a0 = n10;
        P(this.U.r());
        M(0);
    }

    public final void S(int i2) {
        this.f4364w0.l(i2);
        this.f4366y0 = true;
    }

    public final void T(int i2) {
        if (this.f4365x0 != i2) {
            this.f4365x0 = i2;
            ArrayList arrayList = this.R;
            arrayList.clear();
            if (this.f4365x0 == 1) {
                this.f4364w0 = this.I;
            } else {
                this.f4364w0 = this.J;
            }
            arrayList.add(this.f4364w0);
            d[] dVarArr = this.Q;
            int length = dVarArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                dVarArr[i10] = this.f4364w0;
            }
        }
    }

    @Override // e5.g
    public final void b(c5.c cVar, boolean z10) {
        boolean z11;
        h hVar = (h) this.U;
        if (hVar != null) {
            Object j2 = hVar.j(c.LEFT);
            Object j10 = hVar.j(c.RIGHT);
            g gVar = this.U;
            boolean z12 = true;
            if (gVar != null && gVar.T[0] == f.WRAP_CONTENT) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f4365x0 == 0) {
                j2 = hVar.j(c.TOP);
                j10 = hVar.j(c.BOTTOM);
                g gVar2 = this.U;
                if (gVar2 == null || gVar2.T[1] != f.WRAP_CONTENT) {
                    z12 = false;
                }
                z11 = z12;
            }
            if (this.f4366y0) {
                d dVar = this.f4364w0;
                if (dVar.f4280c) {
                    c5.g k10 = cVar.k(dVar);
                    cVar.d(k10, this.f4364w0.d());
                    if (this.f4362u0 != -1) {
                        if (z11) {
                            cVar.f(cVar.k(j10), k10, 0, 5);
                        }
                    } else if (this.f4363v0 != -1 && z11) {
                        c5.g k11 = cVar.k(j10);
                        cVar.f(k10, cVar.k(j2), 0, 5);
                        cVar.f(k11, k10, 0, 5);
                    }
                    this.f4366y0 = false;
                    return;
                }
            }
            if (this.f4362u0 != -1) {
                c5.g k12 = cVar.k(this.f4364w0);
                cVar.e(k12, cVar.k(j2), this.f4362u0, 8);
                if (z11) {
                    cVar.f(cVar.k(j10), k12, 0, 5);
                }
            } else if (this.f4363v0 != -1) {
                c5.g k13 = cVar.k(this.f4364w0);
                c5.g k14 = cVar.k(j10);
                cVar.e(k13, k14, -this.f4363v0, 8);
                if (z11) {
                    cVar.f(k13, cVar.k(j2), 0, 5);
                    cVar.f(k14, k13, 0, 5);
                }
            } else if (this.f4361t0 != -1.0f) {
                c5.g k15 = cVar.k(this.f4364w0);
                c5.g k16 = cVar.k(j10);
                float f8 = this.f4361t0;
                c5.b l10 = cVar.l();
                l10.f2586d.g(k15, -1.0f);
                l10.f2586d.g(k16, f8);
                cVar.c(l10);
            }
        }
    }

    @Override // e5.g
    public final boolean c() {
        return true;
    }

    @Override // e5.g
    public final void g(g gVar, HashMap hashMap) {
        super.g(gVar, hashMap);
        l lVar = (l) gVar;
        this.f4361t0 = lVar.f4361t0;
        this.f4362u0 = lVar.f4362u0;
        this.f4363v0 = lVar.f4363v0;
        T(lVar.f4365x0);
    }

    @Override // e5.g
    public final d j(c cVar) {
        int i2 = k.f4360a[cVar.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if ((i2 == 3 || i2 == 4) && this.f4365x0 == 0) {
                return this.f4364w0;
            }
            return null;
        } else if (this.f4365x0 == 1) {
            return this.f4364w0;
        } else {
            return null;
        }
    }
}
