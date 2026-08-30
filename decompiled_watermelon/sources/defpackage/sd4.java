package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sd4  reason: default package */
/* loaded from: classes.dex */
public final class sd4 extends ze4 {
    public static final sd4 d = new ze4(0, 2, 1);

    @Override // defpackage.ze4
    public final void c(yp0 yp0Var, xs xsVar, z86 z86Var, r8 r8Var, af4 af4Var) {
        mk2 mk2Var = (mk2) yp0Var.g(0);
        Object g = yp0Var.g(1);
        if (g instanceof wk2) {
            wk2 wk2Var = (wk2) g;
            ((o24) r8Var.e).b(wk2Var);
            ((e24) r8Var.d).a(wk2Var);
        }
        if (z86Var.n != 0) {
            xu0.a("Can only append a slot if not current inserting");
        }
        int i = z86Var.i;
        int i2 = z86Var.j;
        int c = z86Var.c(mk2Var);
        int g2 = z86Var.g(z86Var.b, z86Var.r(c + 1));
        z86Var.i = g2;
        z86Var.j = g2;
        z86Var.x(1, c);
        if (i >= g2) {
            i++;
            i2++;
        }
        z86Var.c[g2] = g;
        z86Var.i = i;
        z86Var.j = i2;
    }
}
