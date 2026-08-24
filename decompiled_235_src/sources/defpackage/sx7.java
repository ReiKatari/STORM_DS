package defpackage;

import java.util.concurrent.ExecutionException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sx7  reason: default package */
/* loaded from: classes.dex */
public abstract class sx7 {
    public static final String a = ga0.h("WorkerWrapper");

    public static final Object a(gx3 gx3Var, nx3 nx3Var, hw6 hw6Var) {
        Object obj;
        try {
            boolean z = false;
            if (gx3Var.isDone()) {
                while (true) {
                    try {
                        obj = gx3Var.get();
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
            rj0 rj0Var = new rj0(1, np2.V(hw6Var));
            rj0Var.v();
            gx3Var.a(tj1.INSTANCE, new m67(gx3Var, rj0Var, 0));
            rj0Var.z(new r5(29, nx3Var, gx3Var));
            Object s = rj0Var.s();
            x61 x61Var = x61.COROUTINE_SUSPENDED;
            return s;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }
}
