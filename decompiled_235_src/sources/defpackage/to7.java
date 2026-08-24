package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: to7  reason: default package */
/* loaded from: classes.dex */
public abstract class to7 {
    public static final x31 a = new x31(26);

    public static final as0 a(qo7 qo7Var) {
        as0 as0Var;
        jv2 jv2Var;
        qo7Var.getClass();
        synchronized (a) {
            as0Var = (as0) qo7Var.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (as0Var == null) {
                vt1 vt1Var = vt1.A;
                try {
                    xe1 xe1Var = xk1.a;
                    jv2Var = e04.a.Y;
                } catch (IllegalStateException | tg4 unused) {
                }
                as0 as0Var2 = new as0(jv2Var.N(oi2.c()));
                qo7Var.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", as0Var2);
                as0Var = as0Var2;
            }
        }
        return as0Var;
    }
}
