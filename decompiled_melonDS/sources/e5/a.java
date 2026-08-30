package e5;

import java.util.HashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends m {

    /* renamed from: v0  reason: collision with root package name */
    public int f4258v0 = 0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f4259w0 = true;

    /* renamed from: x0  reason: collision with root package name */
    public int f4260x0 = 0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f4261y0 = false;

    @Override // e5.g
    public final boolean B() {
        return this.f4261y0;
    }

    @Override // e5.g
    public final boolean C() {
        return this.f4261y0;
    }

    public final boolean V() {
        int i2;
        int i10;
        int i11;
        boolean z10 = true;
        int i12 = 0;
        while (true) {
            i2 = this.f4368u0;
            if (i12 >= i2) {
                break;
            }
            g gVar = this.f4367t0[i12];
            if ((this.f4259w0 || gVar.c()) && ((((i10 = this.f4258v0) == 0 || i10 == 1) && !gVar.B()) || (((i11 = this.f4258v0) == 2 || i11 == 3) && !gVar.C()))) {
                z10 = false;
            }
            i12++;
        }
        if (!z10 || i2 <= 0) {
            return false;
        }
        int i13 = 0;
        boolean z11 = false;
        for (int i14 = 0; i14 < this.f4368u0; i14++) {
            g gVar2 = this.f4367t0[i14];
            if (this.f4259w0 || gVar2.c()) {
                if (!z11) {
                    int i15 = this.f4258v0;
                    if (i15 == 0) {
                        i13 = gVar2.j(c.LEFT).d();
                    } else if (i15 == 1) {
                        i13 = gVar2.j(c.RIGHT).d();
                    } else if (i15 == 2) {
                        i13 = gVar2.j(c.TOP).d();
                    } else if (i15 == 3) {
                        i13 = gVar2.j(c.BOTTOM).d();
                    }
                    z11 = true;
                }
                int i16 = this.f4258v0;
                if (i16 == 0) {
                    i13 = Math.min(i13, gVar2.j(c.LEFT).d());
                } else if (i16 == 1) {
                    i13 = Math.max(i13, gVar2.j(c.RIGHT).d());
                } else if (i16 == 2) {
                    i13 = Math.min(i13, gVar2.j(c.TOP).d());
                } else if (i16 == 3) {
                    i13 = Math.max(i13, gVar2.j(c.BOTTOM).d());
                }
            }
        }
        int i17 = i13 + this.f4260x0;
        int i18 = this.f4258v0;
        if (i18 != 0 && i18 != 1) {
            L(i17, i17);
        } else {
            K(i17, i17);
        }
        this.f4261y0 = true;
        return true;
    }

    public final int W() {
        int i2 = this.f4258v0;
        if (i2 != 0 && i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                return 1;
            }
            return -1;
        }
        return 0;
    }

    @Override // e5.g
    public final void b(c5.c cVar, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i2;
        int i10;
        int i11;
        int i12;
        d[] dVarArr = this.Q;
        d dVar = this.I;
        dVarArr[0] = dVar;
        int i13 = 2;
        d dVar2 = this.J;
        dVarArr[2] = dVar2;
        d dVar3 = this.K;
        dVarArr[1] = dVar3;
        d dVar4 = this.L;
        dVarArr[3] = dVar4;
        for (d dVar5 : dVarArr) {
            dVar5.f4286i = cVar.k(dVar5);
        }
        int i14 = this.f4258v0;
        if (i14 >= 0 && i14 < 4) {
            d dVar6 = dVarArr[i14];
            if (!this.f4261y0) {
                V();
            }
            if (this.f4261y0) {
                this.f4261y0 = false;
                int i15 = this.f4258v0;
                if (i15 != 0 && i15 != 1) {
                    if (i15 == 2 || i15 == 3) {
                        cVar.d(dVar2.f4286i, this.f4289a0);
                        cVar.d(dVar4.f4286i, this.f4289a0);
                        return;
                    }
                    return;
                }
                cVar.d(dVar.f4286i, this.Z);
                cVar.d(dVar3.f4286i, this.Z);
                return;
            }
            for (int i16 = 0; i16 < this.f4368u0; i16++) {
                g gVar = this.f4367t0[i16];
                if ((this.f4259w0 || gVar.c()) && ((((i12 = this.f4258v0) == 0 || i12 == 1) && gVar.T[0] == f.MATCH_CONSTRAINT && gVar.I.f4283f != null && gVar.K.f4283f != null) || ((i12 == 2 || i12 == 3) && gVar.T[1] == f.MATCH_CONSTRAINT && gVar.J.f4283f != null && gVar.L.f4283f != null))) {
                    z11 = true;
                    break;
                }
            }
            z11 = false;
            if (!dVar.g() && !dVar3.g()) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (!dVar2.g() && !dVar4.g()) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (!z11 && (((i11 = this.f4258v0) == 0 && z12) || ((i11 == 2 && z13) || ((i11 == 1 && z12) || (i11 == 3 && z13))))) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14) {
                i2 = 4;
            } else {
                i2 = 5;
            }
            int i17 = 0;
            while (i17 < this.f4368u0) {
                g gVar2 = this.f4367t0[i17];
                if (this.f4259w0 || gVar2.c()) {
                    c5.g k10 = cVar.k(gVar2.Q[this.f4258v0]);
                    d[] dVarArr2 = gVar2.Q;
                    int i18 = this.f4258v0;
                    d dVar7 = dVarArr2[i18];
                    dVar7.f4286i = k10;
                    d dVar8 = dVar7.f4283f;
                    if (dVar8 != null && dVar8.f4281d == this) {
                        i10 = dVar7.f4284g;
                    } else {
                        i10 = 0;
                    }
                    if (i18 != 0 && i18 != i13) {
                        c5.b l10 = cVar.l();
                        c5.g m = cVar.m();
                        m.R = 0;
                        l10.b(dVar6.f4286i, k10, m, this.f4260x0 + i10);
                        cVar.c(l10);
                    } else {
                        c5.b l11 = cVar.l();
                        c5.g m10 = cVar.m();
                        m10.R = 0;
                        l11.c(dVar6.f4286i, k10, m10, this.f4260x0 - i10);
                        cVar.c(l11);
                    }
                    cVar.e(dVar6.f4286i, k10, this.f4260x0 + i10, i2);
                }
                i17++;
                i13 = 2;
            }
            int i19 = this.f4258v0;
            if (i19 == 0) {
                cVar.e(dVar3.f4286i, dVar.f4286i, 0, 8);
                cVar.e(dVar.f4286i, this.U.K.f4286i, 0, 4);
                cVar.e(dVar.f4286i, this.U.I.f4286i, 0, 0);
            } else if (i19 == 1) {
                cVar.e(dVar.f4286i, dVar3.f4286i, 0, 8);
                cVar.e(dVar.f4286i, this.U.I.f4286i, 0, 4);
                cVar.e(dVar.f4286i, this.U.K.f4286i, 0, 0);
            } else if (i19 == 2) {
                cVar.e(dVar4.f4286i, dVar2.f4286i, 0, 8);
                cVar.e(dVar2.f4286i, this.U.L.f4286i, 0, 4);
                cVar.e(dVar2.f4286i, this.U.J.f4286i, 0, 0);
            } else if (i19 == 3) {
                cVar.e(dVar2.f4286i, dVar4.f4286i, 0, 8);
                cVar.e(dVar2.f4286i, this.U.J.f4286i, 0, 4);
                cVar.e(dVar2.f4286i, this.U.L.f4286i, 0, 0);
            }
        }
    }

    @Override // e5.g
    public final boolean c() {
        return true;
    }

    @Override // e5.m, e5.g
    public final void g(g gVar, HashMap hashMap) {
        super.g(gVar, hashMap);
        a aVar = (a) gVar;
        this.f4258v0 = aVar.f4258v0;
        this.f4259w0 = aVar.f4259w0;
        this.f4260x0 = aVar.f4260x0;
    }

    @Override // e5.g
    public final String toString() {
        String s10 = w.d.s(new StringBuilder("[Barrier] "), this.f4307j0, " {");
        for (int i2 = 0; i2 < this.f4368u0; i2++) {
            g gVar = this.f4367t0[i2];
            if (i2 > 0) {
                s10 = s10.concat(", ");
            }
            StringBuilder t5 = w.d.t(s10);
            t5.append(gVar.f4307j0);
            s10 = t5.toString();
        }
        return s10.concat("}");
    }
}
