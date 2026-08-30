package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ua7  reason: default package */
/* loaded from: classes.dex */
public abstract class ua7 {
    public static final so1 a = new so1(23);

    public static final np0 a(ra7 ra7Var) {
        np0 np0Var;
        ip2 ip2Var;
        ra7Var.getClass();
        synchronized (a) {
            np0Var = (np0) ra7Var.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (np0Var == null) {
                mp1 mp1Var = mp1.A;
                try {
                    bb1 bb1Var = tg1.a;
                    ip2Var = bt3.a.Y;
                } catch (c84 | IllegalStateException unused) {
                }
                np0 np0Var2 = new np0(ip2Var.C(hi2.c()));
                ra7Var.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", np0Var2);
                np0Var = np0Var2;
            }
        }
        return np0Var;
    }
}
