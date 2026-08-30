package n2;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v1 implements c {
    public final a1.w A = new a1.w();
    public final a1.h0 B = new a1.h0();
    public final Object L;

    public v1(Object obj) {
        this.L = obj;
    }

    public final void a(a4.r2 r2Var, v2.i iVar) {
        Exception exc;
        a1.w wVar = this.A;
        int i2 = wVar.f112b;
        a1.h0 h0Var = new a1.h0();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            a1.h0 h0Var2 = this.B;
            if (i10 < i2) {
                int i12 = i10 + 1;
                try {
                    try {
                        switch (wVar.c(i10)) {
                            case 0:
                                r2Var.n();
                                break;
                            case DSiCameraSource.FrontCamera /* 1 */:
                                int i13 = i11 + 1;
                                r2Var.e(h0Var2.f(i11));
                                i11 = i13;
                                break;
                            case 2:
                                int i14 = i10 + 2;
                                i10 += 3;
                                r2Var.k(wVar.c(i12), wVar.c(i14));
                                continue;
                            case 3:
                                int i15 = i10 + 2;
                                try {
                                    int i16 = i10 + 3;
                                    try {
                                        i10 += 4;
                                        r2Var.i(wVar.c(i12), wVar.c(i15), wVar.c(i16));
                                        continue;
                                    } catch (Exception e6) {
                                        exc = e6;
                                        i10 = i16;
                                        break;
                                    }
                                } catch (Exception e10) {
                                    exc = e10;
                                    i10 = i15;
                                    break;
                                }
                            case 4:
                                r2Var.a();
                                break;
                            case l1.c.f8511g /* 5 */:
                                i10 += 2;
                                int i17 = i11 + 1;
                                r2Var.d(wVar.c(i12), h0Var2.f(i11));
                                i11 = i17;
                                continue;
                            case l1.c.f8509e /* 6 */:
                                i10 += 2;
                                try {
                                    wVar.c(i12);
                                    int i18 = i11 + 1;
                                    a4.o0 o0Var = (a4.o0) h0Var2.f(i11);
                                    i11 = i18;
                                    continue;
                                } catch (Exception e11) {
                                    exc = e11;
                                    break;
                                }
                            case 7:
                                int i19 = i11 + 1;
                                Object f8 = h0Var2.f(i11);
                                f8.getClass();
                                nc.w.b(2, f8);
                                i11 += 2;
                                r2Var.b(h0Var2.f(i19), (mc.p) f8);
                                break;
                            case 8:
                                Object obj = r2Var.L;
                                if (obj instanceof h) {
                                    h hVar = (h) obj;
                                    if (iVar.f13619f.j(hVar)) {
                                        hVar.b();
                                    }
                                }
                                h0Var.a(obj);
                                r2Var.f();
                                break;
                        }
                        i10 = i12;
                    } catch (Throwable th2) {
                        r2Var.h();
                        throw th2;
                    }
                } catch (Exception e12) {
                    exc = e12;
                    i10 = i12;
                }
            } else {
                if (i11 != h0Var2.f45b) {
                    t.a("Applier operation size mismatch");
                }
                h0Var2.d();
                wVar.f112b = 0;
                r2Var.h();
                return;
            }
            exc = e11;
            throw new j(h0Var2, h0Var, wVar, i10 - 1, exc);
        }
    }

    @Override // n2.c
    public final void b(Object obj, mc.p pVar) {
        this.A.a(7);
        a1.h0 h0Var = this.B;
        h0Var.a(pVar);
        h0Var.a(obj);
    }

    @Override // n2.c
    public final void d(int i2, Object obj) {
        a1.w wVar = this.A;
        wVar.a(5);
        wVar.a(i2);
        this.B.a(obj);
    }

    @Override // n2.c
    public final void e(Object obj) {
        this.A.a(1);
        this.B.a(obj);
    }

    @Override // n2.c
    public final void f() {
        this.A.a(8);
    }

    @Override // n2.c
    public final void g(int i2, Object obj) {
        a1.w wVar = this.A;
        wVar.a(6);
        wVar.a(i2);
        this.B.a(obj);
    }

    @Override // n2.c
    public final void i(int i2, int i10, int i11) {
        a1.w wVar = this.A;
        wVar.a(3);
        wVar.a(i2);
        wVar.a(i10);
        wVar.a(i11);
    }

    @Override // n2.c
    public final Object j() {
        return this.L;
    }

    @Override // n2.c
    public final void k(int i2, int i10) {
        a1.w wVar = this.A;
        wVar.a(2);
        wVar.a(i2);
        wVar.a(i10);
    }

    @Override // n2.c
    public final void n() {
        this.A.a(0);
    }
}
