package defpackage;

import android.content.Context;
import android.os.Build;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pj7  reason: default package */
/* loaded from: classes.dex */
public abstract class pj7 {
    public static final qd2 a(Context context) {
        int i = 0;
        fh fhVar = new fh(context, 0);
        if (Build.VERSION.SDK_INT >= 31) {
            i = qe2.a.a(context);
        }
        return new qd2(fhVar, new gh(i));
    }

    public static final Object b(k11 k11Var) {
        jg1 jg1Var;
        p31 p31Var;
        e31 a = k11Var.a();
        ln2.B(a);
        j11 J = nk2.J(k11Var);
        if (J instanceof jg1) {
            jg1Var = (jg1) J;
        } else {
            jg1Var = null;
        }
        o27 o27Var = o27.a;
        if (jg1Var == null) {
            p31Var = o27Var;
        } else {
            g31 g31Var = jg1Var.R;
            if (kg1.c(g31Var, a)) {
                jg1Var.Y = o27Var;
                jg1Var.L = 1;
                g31Var.k0(a, jg1Var);
            } else {
                e31 C = a.C(new q0(oj7.B));
                jg1Var.Y = o27Var;
                jg1Var.L = 1;
                g31Var.k0(C, jg1Var);
            }
            p31Var = p31.COROUTINE_SUSPENDED;
        }
        if (p31Var == p31.COROUTINE_SUSPENDED) {
            return p31Var;
        }
        return o27Var;
    }
}
