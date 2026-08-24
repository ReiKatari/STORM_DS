package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cx4  reason: default package */
/* loaded from: classes.dex */
public abstract class cx4 implements qh1 {
    public boolean A;

    public static final void b(cx4 cx4Var, dx4 dx4Var) {
        cx4Var.getClass();
        if (dx4Var instanceof z74) {
            ((z74) dx4Var).H(cx4Var.A);
        }
    }

    public static void j(cx4 cx4Var, dx4 dx4Var, int i, int i2) {
        cx4Var.getClass();
        b(cx4Var, dx4Var);
        dx4Var.h0(i93.c((i2 & 4294967295L) | (i << 32), dx4Var.X), RecyclerView.B1, null);
    }

    public static void k(cx4 cx4Var, dx4 dx4Var, long j) {
        cx4Var.getClass();
        b(cx4Var, dx4Var);
        dx4Var.h0(i93.c(j, dx4Var.X), RecyclerView.B1, null);
    }

    public static void l(cx4 cx4Var, dx4 dx4Var, int i, int i2) {
        long j = (i << 32) | (i2 & 4294967295L);
        if (cx4Var.f() != kk3.Ltr && cx4Var.i() != 0) {
            b(cx4Var, dx4Var);
            dx4Var.h0(i93.c((((cx4Var.i() - dx4Var.A) - ((int) (j >> 32))) << 32) | (((int) (j & 4294967295L)) & 4294967295L), dx4Var.X), RecyclerView.B1, null);
            return;
        }
        b(cx4Var, dx4Var);
        dx4Var.h0(i93.c(j, dx4Var.X), RecyclerView.B1, null);
    }

    public static void m(cx4 cx4Var, dx4 dx4Var, int i, int i2) {
        int i3 = ex4.b;
        hh2 hh2Var = hh2.n0;
        long j = (i << 32) | (i2 & 4294967295L);
        if (cx4Var.f() != kk3.Ltr && cx4Var.i() != 0) {
            b(cx4Var, dx4Var);
            dx4Var.h0(i93.c((((cx4Var.i() - dx4Var.A) - ((int) (j >> 32))) << 32) | (((int) (j & 4294967295L)) & 4294967295L), dx4Var.X), RecyclerView.B1, hh2Var);
            return;
        }
        b(cx4Var, dx4Var);
        dx4Var.h0(i93.c(j, dx4Var.X), RecyclerView.B1, hh2Var);
    }

    public static void n(cx4 cx4Var, dx4 dx4Var, long j) {
        int i = ex4.b;
        hh2 hh2Var = hh2.n0;
        if (cx4Var.f() != kk3.Ltr && cx4Var.i() != 0) {
            b(cx4Var, dx4Var);
            dx4Var.h0(i93.c((((int) (j & 4294967295L)) & 4294967295L) | (((cx4Var.i() - dx4Var.A) - ((int) (j >> 32))) << 32), dx4Var.X), RecyclerView.B1, hh2Var);
            return;
        }
        b(cx4Var, dx4Var);
        dx4Var.h0(i93.c(j, dx4Var.X), RecyclerView.B1, hh2Var);
    }

    public static void o(cx4 cx4Var, dx4 dx4Var, int i, int i2, qn2 qn2Var, int i3) {
        if ((i3 & 8) != 0) {
            int i4 = ex4.b;
            qn2Var = hh2.n0;
        }
        cx4Var.getClass();
        b(cx4Var, dx4Var);
        dx4Var.h0(i93.c((i2 & 4294967295L) | (i << 32), dx4Var.X), RecyclerView.B1, qn2Var);
    }

    public static void r(cx4 cx4Var, dx4 dx4Var, long j) {
        int i = ex4.b;
        hh2 hh2Var = hh2.n0;
        cx4Var.getClass();
        b(cx4Var, dx4Var);
        dx4Var.h0(i93.c(j, dx4Var.X), RecyclerView.B1, hh2Var);
    }

    public float c(hy2 hy2Var) {
        return Float.NaN;
    }

    public abstract jk3 d();

    public abstract kk3 f();

    public abstract int i();
}
