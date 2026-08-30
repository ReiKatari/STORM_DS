package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: le4  reason: default package */
/* loaded from: classes.dex */
public final class le4 extends ze4 {
    public static final le4 d = new ze4(0, 1, 1);

    @Override // defpackage.ze4
    public final void c(yp0 yp0Var, xs xsVar, z86 z86Var, r8 r8Var, af4 af4Var) {
        m55 m55Var = (m55) yp0Var.g(0);
        Set set = (Set) r8Var.a;
        if (set == null) {
            return;
        }
        rl4 rl4Var = new rl4(set);
        d24 d24Var = (d24) r8Var.i;
        if (d24Var == null) {
            long[] jArr = wu5.a;
            d24Var = new d24();
            r8Var.i = d24Var;
        }
        d24Var.m(m55Var, rl4Var);
        ((o24) r8Var.e).b(new wk2(rl4Var, -1));
    }
}
