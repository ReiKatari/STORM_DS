package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t55  reason: default package */
/* loaded from: classes.dex */
public final class t55 implements xs {
    public final i14 A = new i14();
    public final w14 B = new w14();
    public final Object L;

    public t55(Object obj) {
        this.L = obj;
    }

    public final void a(h27 h27Var, r8 r8Var) {
        Exception exc;
        i14 i14Var = this.A;
        int i = i14Var.b;
        w14 w14Var = new w14();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            w14 w14Var2 = this.B;
            if (i2 < i) {
                int i4 = i2 + 1;
                try {
                    try {
                        switch (i14Var.c(i2)) {
                            case 0:
                                h27Var.s();
                                break;
                            case 1:
                                int i5 = i3 + 1;
                                h27Var.d(w14Var2.f(i3));
                                i3 = i5;
                                break;
                            case 2:
                                int i6 = i2 + 2;
                                i2 += 3;
                                h27Var.j(i14Var.c(i4), i14Var.c(i6));
                                continue;
                            case 3:
                                int i7 = i2 + 2;
                                try {
                                    int i8 = i2 + 3;
                                    try {
                                        i2 += 4;
                                        h27Var.h(i14Var.c(i4), i14Var.c(i7), i14Var.c(i8));
                                        continue;
                                    } catch (Exception e) {
                                        exc = e;
                                        i2 = i8;
                                        break;
                                    }
                                } catch (Exception e2) {
                                    exc = e2;
                                    i2 = i7;
                                    break;
                                }
                            case 4:
                                h27Var.a();
                                break;
                            case 5:
                                i2 += 2;
                                int i9 = i3 + 1;
                                h27Var.c(i14Var.c(i4), w14Var2.f(i3));
                                i3 = i9;
                                continue;
                            case ig7.b /* 6 */:
                                i2 += 2;
                                try {
                                    i14Var.c(i4);
                                    int i10 = i3 + 1;
                                    vf3 vf3Var = (vf3) w14Var2.f(i3);
                                    i3 = i10;
                                    continue;
                                } catch (Exception e3) {
                                    exc = e3;
                                    break;
                                }
                            case 7:
                                int i11 = i3 + 1;
                                Object f = w14Var2.f(i3);
                                f.getClass();
                                l07.q(2, f);
                                i3 += 2;
                                h27Var.m((aj2) f, w14Var2.f(i11));
                                break;
                            case 8:
                                Object obj = h27Var.L;
                                if (obj instanceof au0) {
                                    au0 au0Var = (au0) obj;
                                    if (((o24) r8Var.f).k(au0Var)) {
                                        au0Var.b();
                                    }
                                }
                                w14Var.a(obj);
                                h27Var.e();
                                break;
                        }
                        i2 = i4;
                    } catch (Exception e4) {
                        exc = e4;
                        i2 = i4;
                    }
                } catch (Throwable th) {
                    h27Var.g();
                    throw th;
                }
            } else {
                if (i3 != w14Var2.b) {
                    xu0.a("Applier operation size mismatch");
                }
                w14Var2.d();
                i14Var.b = 0;
                h27Var.g();
                return;
            }
            exc = e3;
            throw new cu0(w14Var2, w14Var, i14Var, i2 - 1, exc);
        }
    }

    @Override // defpackage.xs
    public final void c(int i, Object obj) {
        i14 i14Var = this.A;
        i14Var.a(5);
        i14Var.a(i);
        this.B.a(obj);
    }

    @Override // defpackage.xs
    public final void d(Object obj) {
        this.A.a(1);
        this.B.a(obj);
    }

    @Override // defpackage.xs
    public final void e() {
        this.A.a(8);
    }

    @Override // defpackage.xs
    public final void f(int i, Object obj) {
        i14 i14Var = this.A;
        i14Var.a(6);
        i14Var.a(i);
        this.B.a(obj);
    }

    @Override // defpackage.xs
    public final void h(int i, int i2, int i3) {
        i14 i14Var = this.A;
        i14Var.a(3);
        i14Var.a(i);
        i14Var.a(i2);
        i14Var.a(i3);
    }

    @Override // defpackage.xs
    public final Object i() {
        return this.L;
    }

    @Override // defpackage.xs
    public final void j(int i, int i2) {
        i14 i14Var = this.A;
        i14Var.a(2);
        i14Var.a(i);
        i14Var.a(i2);
    }

    @Override // defpackage.xs
    public final void m(aj2 aj2Var, Object obj) {
        this.A.a(7);
        w14 w14Var = this.B;
        w14Var.a(aj2Var);
        w14Var.a(obj);
    }

    @Override // defpackage.xs
    public final void s() {
        this.A.a(0);
    }
}
