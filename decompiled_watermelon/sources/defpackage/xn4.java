package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xn4  reason: default package */
/* loaded from: classes.dex */
public abstract class xn4 implements od1 {
    public boolean A;

    public static final void a(xn4 xn4Var, yn4 yn4Var) {
        xn4Var.getClass();
        if (yn4Var instanceof xz3) {
            ((xz3) yn4Var).p(xn4Var.A);
        }
    }

    public static void k(xn4 xn4Var, yn4 yn4Var, int i, int i2) {
        xn4Var.getClass();
        a(xn4Var, yn4Var);
        yn4Var.o0(a33.c((i2 & 4294967295L) | (i << 32), yn4Var.X), RecyclerView.A1, null);
    }

    public static void l(xn4 xn4Var, yn4 yn4Var, long j) {
        xn4Var.getClass();
        a(xn4Var, yn4Var);
        yn4Var.o0(a33.c(j, yn4Var.X), RecyclerView.A1, null);
    }

    public static void m(xn4 xn4Var, yn4 yn4Var, int i, int i2) {
        long j = (i << 32) | (i2 & 4294967295L);
        if (xn4Var.f() != sd3.Ltr && xn4Var.h() != 0) {
            a(xn4Var, yn4Var);
            yn4Var.o0(a33.c((((xn4Var.h() - yn4Var.A) - ((int) (j >> 32))) << 32) | (((int) (j & 4294967295L)) & 4294967295L), yn4Var.X), RecyclerView.A1, null);
            return;
        }
        a(xn4Var, yn4Var);
        yn4Var.o0(a33.c(j, yn4Var.X), RecyclerView.A1, null);
    }

    public static void n(xn4 xn4Var, yn4 yn4Var, int i, int i2) {
        int i3 = zn4.b;
        qc2 qc2Var = qc2.l0;
        long j = (i << 32) | (i2 & 4294967295L);
        if (xn4Var.f() != sd3.Ltr && xn4Var.h() != 0) {
            a(xn4Var, yn4Var);
            yn4Var.o0(a33.c((((xn4Var.h() - yn4Var.A) - ((int) (j >> 32))) << 32) | (((int) (j & 4294967295L)) & 4294967295L), yn4Var.X), RecyclerView.A1, qc2Var);
            return;
        }
        a(xn4Var, yn4Var);
        yn4Var.o0(a33.c(j, yn4Var.X), RecyclerView.A1, qc2Var);
    }

    public static void p(xn4 xn4Var, yn4 yn4Var, long j) {
        int i = zn4.b;
        qc2 qc2Var = qc2.l0;
        if (xn4Var.f() != sd3.Ltr && xn4Var.h() != 0) {
            a(xn4Var, yn4Var);
            yn4Var.o0(a33.c((((int) (j & 4294967295L)) & 4294967295L) | (((xn4Var.h() - yn4Var.A) - ((int) (j >> 32))) << 32), yn4Var.X), RecyclerView.A1, qc2Var);
            return;
        }
        a(xn4Var, yn4Var);
        yn4Var.o0(a33.c(j, yn4Var.X), RecyclerView.A1, qc2Var);
    }

    public static void r(xn4 xn4Var, yn4 yn4Var, int i, int i2, mi2 mi2Var, int i3) {
        if ((i3 & 8) != 0) {
            int i4 = zn4.b;
            mi2Var = qc2.l0;
        }
        xn4Var.getClass();
        a(xn4Var, yn4Var);
        yn4Var.o0(a33.c((i2 & 4294967295L) | (i << 32), yn4Var.X), RecyclerView.A1, mi2Var);
    }

    public static void s(xn4 xn4Var, yn4 yn4Var, long j) {
        int i = zn4.b;
        qc2 qc2Var = qc2.l0;
        xn4Var.getClass();
        a(xn4Var, yn4Var);
        yn4Var.o0(a33.c(j, yn4Var.X), RecyclerView.A1, qc2Var);
    }

    public float c(gs2 gs2Var) {
        return Float.NaN;
    }

    public abstract rd3 e();

    public abstract sd3 f();

    public abstract int h();
}
