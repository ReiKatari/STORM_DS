package y3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class h1 implements x4.c {
    public boolean A;

    public static final void a(h1 h1Var, i1 i1Var) {
        h1Var.getClass();
        if (i1Var instanceof a4.k1) {
            ((a4.k1) i1Var).s(h1Var.A);
        }
    }

    public static void k(h1 h1Var, i1 i1Var, int i2, int i10) {
        h1Var.getClass();
        a(h1Var, i1Var);
        i1Var.q0(x4.j.c((i10 & 4294967295L) | (i2 << 32), i1Var.X), 0.0f, null);
    }

    public static void l(h1 h1Var, i1 i1Var, long j2) {
        h1Var.getClass();
        a(h1Var, i1Var);
        i1Var.q0(x4.j.c(j2, i1Var.X), 0.0f, null);
    }

    public static void n(h1 h1Var, i1 i1Var, int i2, int i10) {
        long j2 = (i2 << 32) | (i10 & 4294967295L);
        if (h1Var.g() != x4.m.Ltr && h1Var.h() != 0) {
            a(h1Var, i1Var);
            i1Var.q0(x4.j.c((((h1Var.h() - i1Var.A) - ((int) (j2 >> 32))) << 32) | (((int) (j2 & 4294967295L)) & 4294967295L), i1Var.X), 0.0f, null);
            return;
        }
        a(h1Var, i1Var);
        i1Var.q0(x4.j.c(j2, i1Var.X), 0.0f, null);
    }

    public static void o(h1 h1Var, i1 i1Var, int i2, int i10) {
        int i11 = k1.f14703b;
        j1 j1Var = j1.L;
        long j2 = (i2 << 32) | (i10 & 4294967295L);
        if (h1Var.g() != x4.m.Ltr && h1Var.h() != 0) {
            a(h1Var, i1Var);
            i1Var.q0(x4.j.c((((h1Var.h() - i1Var.A) - ((int) (j2 >> 32))) << 32) | (((int) (j2 & 4294967295L)) & 4294967295L), i1Var.X), 0.0f, j1Var);
            return;
        }
        a(h1Var, i1Var);
        i1Var.q0(x4.j.c(j2, i1Var.X), 0.0f, j1Var);
    }

    public static void s(h1 h1Var, i1 i1Var, long j2) {
        int i2 = k1.f14703b;
        j1 j1Var = j1.L;
        if (h1Var.g() != x4.m.Ltr && h1Var.h() != 0) {
            a(h1Var, i1Var);
            i1Var.q0(x4.j.c((((int) (j2 & 4294967295L)) & 4294967295L) | (((h1Var.h() - i1Var.A) - ((int) (j2 >> 32))) << 32), i1Var.X), 0.0f, j1Var);
            return;
        }
        a(h1Var, i1Var);
        i1Var.q0(x4.j.c(j2, i1Var.X), 0.0f, j1Var);
    }

    public static void u(h1 h1Var, i1 i1Var, int i2, int i10, mc.l lVar, int i11) {
        if ((i11 & 8) != 0) {
            int i12 = k1.f14703b;
            lVar = j1.L;
        }
        h1Var.getClass();
        a(h1Var, i1Var);
        i1Var.q0(x4.j.c((i10 & 4294967295L) | (i2 << 32), i1Var.X), 0.0f, lVar);
    }

    public static void w(h1 h1Var, i1 i1Var, long j2) {
        int i2 = k1.f14703b;
        j1 j1Var = j1.L;
        h1Var.getClass();
        a(h1Var, i1Var);
        i1Var.q0(x4.j.c(j2, i1Var.X), 0.0f, j1Var);
    }

    public float d(s sVar) {
        return Float.NaN;
    }

    public abstract z e();

    public abstract x4.m g();

    public abstract int h();
}
