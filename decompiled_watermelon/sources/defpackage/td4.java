package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: td4  reason: default package */
/* loaded from: classes.dex */
public final class td4 extends ze4 {
    public static final td4 d = new ze4(0, 2, 1);

    @Override // defpackage.ze4
    public final void c(yp0 yp0Var, xs xsVar, z86 z86Var, r8 r8Var, af4 af4Var) {
        int i;
        ci3 ci3Var;
        f33 f33Var = (f33) yp0Var.g(1);
        if (f33Var != null) {
            i = f33Var.a;
        } else {
            i = 0;
        }
        ij0 ij0Var = (ij0) yp0Var.g(0);
        if (i > 0) {
            xsVar = new k70(xsVar, i);
        }
        if (af4Var != null) {
            ci3Var = new ci3(10, af4Var, z86Var);
        } else {
            ci3Var = null;
        }
        ij0Var.r0(xsVar, z86Var, r8Var, ci3Var);
    }
}
