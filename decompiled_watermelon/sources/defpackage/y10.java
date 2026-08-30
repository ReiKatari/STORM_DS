package defpackage;

import android.os.Build;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y10  reason: default package */
/* loaded from: classes.dex */
public abstract class y10 {
    public static final ye6 a = new ew4(new d5(11));
    public static Boolean b;

    public static final void a(to toVar, ds6 ds6Var, od2 od2Var, List list, tu0 tu0Var) {
        sk2 sk2Var = (sk2) tu0Var;
        Executor executor = (Executor) sk2Var.j(a);
        if (executor != null && b(toVar.B.length())) {
            sk2Var.X(-518737659);
            try {
                executor.execute(new x10(ds6Var, (sd3) sk2Var.j(ov0.n), list, toVar, (od1) sk2Var.j(ov0.h), od2Var, 0));
            } catch (RejectedExecutionException unused) {
            }
            sk2Var.p(false);
            return;
        }
        sk2Var.X(-517090505);
        sk2Var.p(false);
    }

    public static final boolean b(int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 28 && i >= 8 && i < 1000) {
            if (b == null) {
                if (Runtime.getRuntime().availableProcessors() >= 4) {
                    z = true;
                } else {
                    z = false;
                }
                b = Boolean.valueOf(z);
            }
            Boolean bool = b;
            bool.getClass();
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
