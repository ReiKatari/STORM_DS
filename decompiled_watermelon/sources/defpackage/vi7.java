package defpackage;

import java.util.concurrent.ExecutionException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vi7  reason: default package */
/* loaded from: classes.dex */
public abstract class vi7 {
    public static final String a = y70.h("WorkerWrapper");

    public static final Object a(fq3 fq3Var, mq3 mq3Var, nk6 nk6Var) {
        Object obj;
        try {
            boolean z = false;
            if (fq3Var.isDone()) {
                while (true) {
                    try {
                        obj = fq3Var.get();
                        break;
                    } catch (InterruptedException unused) {
                        z = true;
                    } catch (Throwable th) {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
                return obj;
            }
            ih0 ih0Var = new ih0(1, nk2.J(nk6Var));
            ih0Var.x();
            fq3Var.a(new vt6(fq3Var, ih0Var, 0), pf1.INSTANCE);
            ih0Var.z(new s5(24, mq3Var, fq3Var));
            Object v = ih0Var.v();
            p31 p31Var = p31.COROUTINE_SUSPENDED;
            return v;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }
}
