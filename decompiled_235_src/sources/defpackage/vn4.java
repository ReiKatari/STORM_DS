package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vn4  reason: default package */
/* loaded from: classes.dex */
public final class vn4 extends ao4 {
    public static final vn4 d = new ao4(1, 0, 2);

    @Override // defpackage.ao4
    public final void c(ls0 ls0Var, nt ntVar, pk6 pk6Var, jb1 jb1Var, bo4 bo4Var) {
        int f = ls0Var.f(0);
        int i = pk6Var.v;
        int N = pk6Var.N(pk6Var.b, pk6Var.r(i));
        int g = pk6Var.g(pk6Var.b, pk6Var.r(i + 1));
        for (int max = Math.max(N, g - f); max < g; max++) {
            Object obj = pk6Var.c[pk6Var.h(max)];
            if (obj instanceof br2) {
                jb1Var.e((br2) obj);
            } else if (obj instanceof cf5) {
                ((cf5) obj).c();
            }
        }
        if (f <= 0) {
            tx0.a("Check failed");
        }
        int i2 = pk6Var.v;
        int N2 = pk6Var.N(pk6Var.b, pk6Var.r(i2));
        int g2 = pk6Var.g(pk6Var.b, pk6Var.r(i2 + 1)) - f;
        if (g2 < N2) {
            tx0.a("Check failed");
        }
        pk6Var.J(g2, f, i2);
        int i3 = pk6Var.i;
        if (i3 >= N2) {
            pk6Var.i = i3 - f;
        }
    }
}
