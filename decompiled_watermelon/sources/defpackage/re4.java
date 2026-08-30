package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: re4  reason: default package */
/* loaded from: classes.dex */
public final class re4 extends ze4 {
    public static final re4 d = new ze4(0, 1, 1);

    @Override // defpackage.ze4
    public final void c(yp0 yp0Var, xs xsVar, z86 z86Var, r8 r8Var, af4 af4Var) {
        rl4 rl4Var;
        m55 m55Var = (m55) yp0Var.g(0);
        d24 d24Var = (d24) r8Var.i;
        if (d24Var != null) {
            rl4Var = (rl4) d24Var.g(m55Var);
        } else {
            rl4Var = null;
        }
        if (rl4Var != null) {
            ArrayList arrayList = (ArrayList) r8Var.j;
            if (arrayList == null) {
                arrayList = new ArrayList();
                r8Var.j = arrayList;
            }
            arrayList.add((o24) r8Var.e);
            r8Var.e = rl4Var.B;
        }
    }
}
