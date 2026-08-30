package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ue4  reason: default package */
/* loaded from: classes.dex */
public final class ue4 extends ze4 {
    public static final ue4 d = new ze4(1, 0, 2);

    @Override // defpackage.ze4
    public final void c(yp0 yp0Var, xs xsVar, z86 z86Var, r8 r8Var, af4 af4Var) {
        int f = yp0Var.f(0);
        int i = z86Var.v;
        int N = z86Var.N(z86Var.b, z86Var.r(i));
        int g = z86Var.g(z86Var.b, z86Var.r(i + 1));
        for (int max = Math.max(N, g - f); max < g; max++) {
            Object obj = z86Var.c[z86Var.h(max)];
            if (obj instanceof wk2) {
                r8Var.e((wk2) obj);
            } else if (obj instanceof m55) {
                ((m55) obj).c();
            }
        }
        if (f <= 0) {
            xu0.a("Check failed");
        }
        int i2 = z86Var.v;
        int N2 = z86Var.N(z86Var.b, z86Var.r(i2));
        int g2 = z86Var.g(z86Var.b, z86Var.r(i2 + 1)) - f;
        if (g2 < N2) {
            xu0.a("Check failed");
        }
        z86Var.J(g2, f, i2);
        int i3 = z86Var.i;
        if (i3 >= N2) {
            z86Var.i = i3 - f;
        }
    }
}
