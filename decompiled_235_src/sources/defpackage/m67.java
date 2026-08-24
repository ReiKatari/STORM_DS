package defpackage;

import java.util.concurrent.ExecutionException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m67  reason: default package */
/* loaded from: classes.dex */
public final class m67 implements Runnable {
    public final /* synthetic */ int A;
    public final gx3 B;
    public final rj0 L;

    public /* synthetic */ m67(gx3 gx3Var, rj0 rj0Var, int i) {
        this.A = i;
        this.B = gx3Var;
        this.L = rj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        rj0 rj0Var = this.L;
        gx3 gx3Var = this.B;
        switch (i) {
            case 0:
                if (gx3Var.isCancelled()) {
                    rj0Var.w(null);
                    return;
                }
                boolean z = false;
                while (true) {
                    try {
                        try {
                            Object obj = gx3Var.get();
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            rj0Var.i(obj);
                            return;
                        } catch (InterruptedException unused) {
                            z = true;
                        }
                    } catch (ExecutionException e) {
                        Throwable cause = e.getCause();
                        cause.getClass();
                        rj0Var.i(new em5(cause));
                        return;
                    }
                }
            default:
                if (gx3Var.isCancelled()) {
                    rj0Var.w(null);
                    return;
                }
                try {
                    rj0Var.i(r1.f(gx3Var));
                    return;
                } catch (ExecutionException e2) {
                    Throwable cause2 = e2.getCause();
                    if (cause2 != null) {
                        rj0Var.i(new em5(cause2));
                        return;
                    }
                    NullPointerException nullPointerException = new NullPointerException();
                    nb3.V(nullPointerException, nb3.class.getName());
                    throw nullPointerException;
                }
        }
    }
}
