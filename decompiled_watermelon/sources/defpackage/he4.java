package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: he4  reason: default package */
/* loaded from: classes.dex */
public final class he4 extends ze4 {
    public static final he4 d = new ze4(0, 3, 1);

    @Override // defpackage.ze4
    public final void c(yp0 yp0Var, xs xsVar, z86 z86Var, r8 r8Var, af4 af4Var) {
        ci3 ci3Var;
        w86 w86Var = (w86) yp0Var.g(1);
        mk2 mk2Var = (mk2) yp0Var.g(0);
        t82 t82Var = (t82) yp0Var.g(2);
        z86 i = w86Var.i();
        if (af4Var != null) {
            try {
                ci3Var = new ci3(10, af4Var, z86Var);
            } catch (Throwable th) {
                i.e(false);
                throw th;
            }
        } else {
            ci3Var = null;
        }
        if (!t82Var.d0.g0()) {
            xu0.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        t82Var.c0.f0(xsVar, i, r8Var, ci3Var);
        i.e(true);
        z86Var.d();
        mk2Var.getClass();
        z86Var.A(w86Var, w86Var.b(mk2Var));
        z86Var.k();
    }
}
