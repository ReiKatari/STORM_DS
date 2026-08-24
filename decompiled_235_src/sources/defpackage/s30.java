package defpackage;

import android.os.Build;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s30  reason: default package */
/* loaded from: classes.dex */
public abstract class s30 {
    public static final nq6 a = new l55(new c5(11));
    public static Boolean b;

    public static final void a(fp fpVar, s47 s47Var, ki2 ki2Var, List list, px0 px0Var) {
        xq2 xq2Var = (xq2) px0Var;
        Executor executor = (Executor) xq2Var.j(a);
        if (executor != null && b(fpVar.B.length())) {
            xq2Var.b0(-518737659);
            try {
                executor.execute(new r30(s47Var, (kk3) xq2Var.j(ky0.n), list, fpVar, (qh1) xq2Var.j(ky0.h), ki2Var, 0));
            } catch (RejectedExecutionException unused) {
            }
            xq2Var.p(false);
            return;
        }
        xq2Var.b0(-517090505);
        xq2Var.p(false);
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
