package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jf5  reason: default package */
/* loaded from: classes.dex */
public final class jf5 implements nt {
    public final o94 A = new o94();
    public final ca4 B = new ca4();
    public final Object L;

    public jf5(Object obj) {
        this.L = obj;
    }

    public final void a(cg7 cg7Var, jb1 jb1Var) {
        Exception exc;
        o94 o94Var = this.A;
        int i = o94Var.b;
        ca4 ca4Var = new ca4();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ca4 ca4Var2 = this.B;
            if (i2 < i) {
                int i4 = i2 + 1;
                try {
                    try {
                        switch (o94Var.c(i2)) {
                            case 0:
                                cg7Var.j();
                                break;
                            case 1:
                                int i5 = i3 + 1;
                                cg7Var.d(ca4Var2.f(i3));
                                i3 = i5;
                                break;
                            case 2:
                                int i6 = i2 + 2;
                                i2 += 3;
                                cg7Var.g(o94Var.c(i4), o94Var.c(i6));
                                continue;
                            case 3:
                                int i7 = i2 + 2;
                                try {
                                    int i8 = i2 + 3;
                                    try {
                                        i2 += 4;
                                        cg7Var.f(o94Var.c(i4), o94Var.c(i7), o94Var.c(i8));
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
                                cg7Var.a();
                                break;
                            case 5:
                                i2 += 2;
                                int i9 = i3 + 1;
                                cg7Var.c(o94Var.c(i4), ca4Var2.f(i3));
                                i3 = i9;
                                continue;
                            case 6:
                                i2 += 2;
                                try {
                                    o94Var.c(i4);
                                    int i10 = i3 + 1;
                                    sm3 sm3Var = (sm3) ca4Var2.f(i3);
                                    i3 = i10;
                                    continue;
                                } catch (Exception e3) {
                                    exc = e3;
                                    break;
                                }
                            case 7:
                                int i11 = i3 + 1;
                                Object f = ca4Var2.f(i3);
                                f.getClass();
                                ge7.p(2, f);
                                i3 += 2;
                                cg7Var.n((eo2) f, ca4Var2.f(i11));
                                break;
                            case 8:
                                Object obj = cg7Var.L;
                                if (obj instanceof ww0) {
                                    ww0 ww0Var = (ww0) obj;
                                    if (((ua4) jb1Var.f).j(ww0Var)) {
                                        ww0Var.b();
                                    }
                                }
                                ca4Var.a(obj);
                                cg7Var.e();
                                break;
                        }
                        i2 = i4;
                    } catch (Exception e4) {
                        exc = e4;
                        i2 = i4;
                    }
                } catch (Throwable th) {
                    cg7Var.l();
                    throw th;
                }
            } else {
                if (i3 != ca4Var2.b) {
                    tx0.a("Applier operation size mismatch");
                }
                ca4Var2.d();
                o94Var.b = 0;
                cg7Var.l();
                return;
            }
            exc = e3;
            throw new yw0(ca4Var2, ca4Var, o94Var, i2 - 1, exc);
        }
    }

    @Override // defpackage.nt
    public final void c(int i, Object obj) {
        o94 o94Var = this.A;
        o94Var.a(5);
        o94Var.a(i);
        this.B.a(obj);
    }

    @Override // defpackage.nt
    public final void d(Object obj) {
        this.A.a(1);
        this.B.a(obj);
    }

    @Override // defpackage.nt
    public final void e() {
        this.A.a(8);
    }

    @Override // defpackage.nt
    public final void f(int i, int i2, int i3) {
        o94 o94Var = this.A;
        o94Var.a(3);
        o94Var.a(i);
        o94Var.a(i2);
        o94Var.a(i3);
    }

    @Override // defpackage.nt
    public final void g(int i, int i2) {
        o94 o94Var = this.A;
        o94Var.a(2);
        o94Var.a(i);
        o94Var.a(i2);
    }

    @Override // defpackage.nt
    public final void j() {
        this.A.a(0);
    }

    @Override // defpackage.nt
    public final void k(int i, Object obj) {
        o94 o94Var = this.A;
        o94Var.a(6);
        o94Var.a(i);
        this.B.a(obj);
    }

    @Override // defpackage.nt
    public final Object m() {
        return this.L;
    }

    @Override // defpackage.nt
    public final void n(eo2 eo2Var, Object obj) {
        this.A.a(7);
        ca4 ca4Var = this.B;
        ca4Var.a(eo2Var);
        ca4Var.a(obj);
    }
}
