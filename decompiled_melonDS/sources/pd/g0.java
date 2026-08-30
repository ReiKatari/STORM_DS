package pd;

import n2.o1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g0 extends ij.a {

    /* renamed from: e  reason: collision with root package name */
    public final a0.l f11579e;

    /* renamed from: f  reason: collision with root package name */
    public final od.c f11580f;

    /* renamed from: g  reason: collision with root package name */
    public final k0 f11581g;

    /* renamed from: h  reason: collision with root package name */
    public final g0[] f11582h;

    /* renamed from: i  reason: collision with root package name */
    public final k0.g f11583i;

    /* renamed from: j  reason: collision with root package name */
    public final o1 f11584j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f11585k;

    /* renamed from: l  reason: collision with root package name */
    public String f11586l;
    public String m;

    public g0(a0.l lVar, od.c cVar, k0 k0Var, g0[] g0VarArr) {
        lVar.getClass();
        this.f11579e = lVar;
        this.f11580f = cVar;
        this.f11581g = k0Var;
        this.f11582h = g0VarArr;
        this.f11583i = cVar.f10886b;
        this.f11584j = cVar.f10885a;
        int ordinal = k0Var.ordinal();
        if (g0VarArr != null) {
            g0 g0Var = g0VarArr[ordinal];
            if (g0Var != null || g0Var != this) {
                g0VarArr[ordinal] = this;
            }
        }
    }

    @Override // ij.a
    public final void F(ld.e eVar, int i2) {
        eVar.getClass();
        int i10 = f0.f11578a[this.f11581g.ordinal()];
        a0.l lVar = this.f11579e;
        boolean z10 = true;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (!lVar.A) {
                        lVar.o(',');
                    }
                    lVar.k();
                    t.o(eVar, this.f11580f);
                    r(eVar.e(i2));
                    lVar.o(':');
                    lVar.t();
                    return;
                }
                if (i2 == 0) {
                    this.f11585k = true;
                }
                if (i2 == 1) {
                    lVar.o(',');
                    lVar.t();
                    this.f11585k = false;
                    return;
                }
                return;
            } else if (!lVar.A) {
                if (i2 % 2 == 0) {
                    lVar.o(',');
                    lVar.k();
                } else {
                    lVar.o(':');
                    lVar.t();
                    z10 = false;
                }
                this.f11585k = z10;
                return;
            } else {
                this.f11585k = true;
                lVar.k();
                return;
            }
        }
        if (!lVar.A) {
            lVar.o(',');
        }
        lVar.k();
    }

    @Override // ij.a, md.d
    public final md.b a(ld.e eVar) {
        g0 g0Var;
        eVar.getClass();
        od.c cVar = this.f11580f;
        k0 q10 = t.q(eVar, cVar);
        char c4 = q10.begin;
        a0.l lVar = this.f11579e;
        if (c4 != 0) {
            lVar.o(c4);
            lVar.A = true;
        }
        String str = this.f11586l;
        if (str != null) {
            String str2 = this.m;
            if (str2 == null) {
                str2 = eVar.b();
            }
            lVar.k();
            lVar.s(str);
            lVar.o(':');
            lVar.getClass();
            r(str2);
            this.f11586l = null;
            this.m = null;
        }
        if (this.f11581g == q10) {
            return this;
        }
        g0[] g0VarArr = this.f11582h;
        if (g0VarArr != null && (g0Var = g0VarArr[q10.ordinal()]) != null) {
            return g0Var;
        }
        return new g0(lVar, cVar, q10, g0VarArr);
    }

    @Override // ij.a, md.b
    public final void b(ld.e eVar) {
        eVar.getClass();
        k0 k0Var = this.f11581g;
        if (k0Var.end != 0) {
            a0.l lVar = this.f11579e;
            lVar.getClass();
            lVar.A = false;
            lVar.o(k0Var.end);
        }
    }

    @Override // md.d
    public final k0.g c() {
        return this.f11583i;
    }

    @Override // ij.a, md.d
    public final md.d d(ld.e eVar) {
        eVar.getClass();
        boolean a10 = h0.a(eVar);
        k0 k0Var = this.f11581g;
        od.c cVar = this.f11580f;
        a0.l lVar = this.f11579e;
        if (a10) {
            if (!(lVar instanceof m)) {
                lVar = new m((n) lVar.B, this.f11585k);
            }
            return new g0(lVar, cVar, k0Var, null);
        } else if (eVar.f() && eVar.equals(od.m.f10897a)) {
            if (!(lVar instanceof l)) {
                lVar = new l((n) lVar.B, this.f11585k);
            }
            return new g0(lVar, cVar, k0Var, null);
        } else {
            if (this.f11586l != null) {
                this.m = eVar.b();
            }
            return this;
        }
    }

    @Override // ij.a, md.d
    public final void e(ld.e eVar, int i2) {
        eVar.getClass();
        r(eVar.e(i2));
    }

    @Override // md.d
    public final void f() {
        a0.l lVar = this.f11579e;
        lVar.getClass();
        ((n) lVar.B).d("null");
    }

    @Override // ij.a, md.b
    public final void g(ld.e eVar, int i2, jd.a aVar, Object obj) {
        eVar.getClass();
        aVar.getClass();
        if (obj == null && !this.f11584j.f9966c) {
            return;
        }
        super.g(eVar, i2, aVar, obj);
    }

    @Override // md.b
    public final boolean h(ld.e eVar) {
        return false;
    }

    @Override // ij.a, md.d
    public final void i(double d4) {
        boolean z10 = this.f11585k;
        a0.l lVar = this.f11579e;
        if (z10) {
            r(String.valueOf(d4));
        } else {
            ((n) lVar.B).d(String.valueOf(d4));
        }
        if (Math.abs(d4) <= Double.MAX_VALUE) {
            return;
        }
        throw t.b(Double.valueOf(d4), ((n) lVar.B).toString());
    }

    @Override // ij.a, md.d
    public final void j(short s10) {
        if (this.f11585k) {
            r(String.valueOf((int) s10));
        } else {
            this.f11579e.r(s10);
        }
    }

    @Override // ij.a, md.d
    public final void k(byte b10) {
        if (this.f11585k) {
            r(String.valueOf((int) b10));
        } else {
            this.f11579e.n(b10);
        }
    }

    @Override // ij.a, md.d
    public final void l(boolean z10) {
        if (this.f11585k) {
            r(String.valueOf(z10));
        } else {
            ((n) this.f11579e.B).d(String.valueOf(z10));
        }
    }

    @Override // ij.a, md.d
    public final void m(int i2) {
        if (this.f11585k) {
            r(String.valueOf(i2));
        } else {
            this.f11579e.p(i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
        if (nc.k.a(r3, ld.j.f9047r) == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r3 != od.a.NONE) goto L40;
     */
    @Override // md.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(jd.a r6, java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.g0.n(jd.a, java.lang.Object):void");
    }

    @Override // ij.a, md.d
    public final void o(float f8) {
        boolean z10 = this.f11585k;
        a0.l lVar = this.f11579e;
        if (z10) {
            r(String.valueOf(f8));
        } else {
            ((n) lVar.B).d(String.valueOf(f8));
        }
        if (Math.abs(f8) <= Float.MAX_VALUE) {
            return;
        }
        throw t.b(Float.valueOf(f8), ((n) lVar.B).toString());
    }

    @Override // ij.a, md.d
    public final void p(long j2) {
        if (this.f11585k) {
            r(String.valueOf(j2));
        } else {
            this.f11579e.q(j2);
        }
    }

    @Override // ij.a, md.d
    public final void q(char c4) {
        r(String.valueOf(c4));
    }

    @Override // ij.a, md.d
    public final void r(String str) {
        str.getClass();
        this.f11579e.s(str);
    }
}
