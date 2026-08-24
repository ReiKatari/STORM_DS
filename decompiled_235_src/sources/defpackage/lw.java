package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Trace;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lw  reason: default package */
/* loaded from: classes.dex */
public final class lw extends sr4 implements bj5 {
    public static final k4 p0 = new k4(13);
    public o41 X;
    public final tp6 Y = up6.a(new xi6(0));
    public final vs4 Z = np2.Y(null);
    public final rs4 d0 = new rs4(1.0f);
    public final vs4 e0 = np2.Y(null);
    public hw f0;
    public sr4 g0;
    public qn2 h0;
    public qn2 i0;
    public z31 j0;
    public int k0;
    public boolean l0;
    public final vs4 m0;
    public final vs4 n0;
    public final vs4 o0;

    public lw(z23 z23Var, pe5 pe5Var) {
        dw dwVar = dw.a;
        this.f0 = dwVar;
        this.h0 = p0;
        this.j0 = y31.b;
        this.k0 = 1;
        this.m0 = np2.Y(dwVar);
        this.n0 = np2.Y(z23Var);
        this.o0 = np2.Y(pe5Var);
    }

    @Override // defpackage.bj5
    public final void a() {
        o41 o41Var = this.X;
        bj5 bj5Var = null;
        if (o41Var != null) {
            g04.x(o41Var, null);
        }
        this.X = null;
        sr4 sr4Var = this.g0;
        if (sr4Var instanceof bj5) {
            bj5Var = (bj5) sr4Var;
        }
        if (bj5Var != null) {
            bj5Var.a();
        }
    }

    @Override // defpackage.bj5
    public final void b() {
        o41 o41Var = this.X;
        bj5 bj5Var = null;
        if (o41Var != null) {
            g04.x(o41Var, null);
        }
        this.X = null;
        sr4 sr4Var = this.g0;
        if (sr4Var instanceof bj5) {
            bj5Var = (bj5) sr4Var;
        }
        if (bj5Var != null) {
            bj5Var.b();
        }
    }

    @Override // defpackage.bj5
    public final void c() {
        bj5 bj5Var;
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            if (this.X == null) {
                gu6 c = oi2.c();
                xe1 xe1Var = xk1.a;
                o41 i = g04.i(jw2.y(c, e04.a.Y));
                this.X = i;
                sr4 sr4Var = this.g0;
                sr4 sr4Var2 = null;
                if (sr4Var instanceof bj5) {
                    bj5Var = (bj5) sr4Var;
                } else {
                    bj5Var = null;
                }
                if (bj5Var != null) {
                    bj5Var.c();
                }
                if (this.l0) {
                    x23 a = z23.a((z23) this.n0.getValue());
                    a.b = ((pe5) this.o0.getValue()).b;
                    a.v = null;
                    Drawable drawable = a.a().B.j;
                    we1 we1Var = h.a;
                    if (drawable != null) {
                        sr4Var2 = j(drawable);
                    }
                    k(new fw(sr4Var2));
                } else {
                    hv.L(i, null, null, new a6(this, null, 3), 3);
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.sr4
    public final void d(float f) {
        this.d0.i(f);
    }

    @Override // defpackage.sr4
    public final void e(z40 z40Var) {
        this.e0.setValue(z40Var);
    }

    @Override // defpackage.sr4
    public final long h() {
        sr4 sr4Var = (sr4) this.Z.getValue();
        if (sr4Var != null) {
            return sr4Var.h();
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.sr4
    public final void i(um3 um3Var) {
        zj0 zj0Var = um3Var.A;
        xi6 xi6Var = new xi6(zj0Var.e());
        tp6 tp6Var = this.Y;
        tp6Var.getClass();
        tp6Var.m(null, xi6Var);
        sr4 sr4Var = (sr4) this.Z.getValue();
        if (sr4Var != null) {
            sr4Var.g(um3Var, zj0Var.e(), this.d0.h(), (z40) this.e0.getValue());
        }
    }

    public final sr4 j(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return g04.h(new zh(((BitmapDrawable) drawable).getBitmap()), this.k0);
        }
        return new uo1(drawable.mutate());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(hw hwVar) {
        a33 a33Var;
        sr4 sr4Var;
        qn2 qn2Var;
        sr4 a;
        bj5 bj5Var;
        sr4 a2;
        sr4 sr4Var2;
        boolean z;
        hw hwVar2 = this.f0;
        hw hwVar3 = (hw) this.h0.g(hwVar);
        this.f0 = hwVar3;
        this.m0.setValue(hwVar3);
        bj5 bj5Var2 = null;
        if (hwVar3 instanceof gw) {
            a33Var = ((gw) hwVar3).b;
        } else {
            if (hwVar3 instanceof ew) {
                a33Var = ((ew) hwVar3).b;
            }
            sr4Var = null;
            if (sr4Var == null) {
                sr4Var = hwVar3.a();
            }
            this.g0 = sr4Var;
            this.Z.setValue(sr4Var);
            if (this.X != null && hwVar2.a() != hwVar3.a()) {
                a = hwVar2.a();
                if (!(a instanceof bj5)) {
                    bj5Var = (bj5) a;
                } else {
                    bj5Var = null;
                }
                if (bj5Var != null) {
                    bj5Var.b();
                }
                a2 = hwVar3.a();
                if (a2 instanceof bj5) {
                    bj5Var2 = (bj5) a2;
                }
                if (bj5Var2 != null) {
                    bj5Var2.c();
                }
            }
            qn2Var = this.i0;
            if (qn2Var != null) {
                qn2Var.g(hwVar3);
                return;
            }
            return;
        }
        fa7 a3 = a33Var.b().i.a(nw7.A, a33Var);
        if (a3 instanceof t71) {
            sr4 a4 = hwVar2.a();
            if (hwVar2 instanceof fw) {
                sr4Var2 = a4;
            } else {
                sr4Var2 = null;
            }
            sr4 a5 = hwVar3.a();
            z31 z31Var = this.j0;
            int i = ((t71) a3).c;
            if ((a33Var instanceof bu6) && ((bu6) a33Var).g) {
                z = false;
            } else {
                z = true;
            }
            sr4Var = new r71(sr4Var2, a5, z31Var, i, z);
            if (sr4Var == null) {
            }
            this.g0 = sr4Var;
            this.Z.setValue(sr4Var);
            if (this.X != null) {
                a = hwVar2.a();
                if (!(a instanceof bj5)) {
                }
                if (bj5Var != null) {
                }
                a2 = hwVar3.a();
                if (a2 instanceof bj5) {
                }
                if (bj5Var2 != null) {
                }
            }
            qn2Var = this.i0;
            if (qn2Var != null) {
            }
        }
        sr4Var = null;
        if (sr4Var == null) {
        }
        this.g0 = sr4Var;
        this.Z.setValue(sr4Var);
        if (this.X != null) {
        }
        qn2Var = this.i0;
        if (qn2Var != null) {
        }
    }
}
