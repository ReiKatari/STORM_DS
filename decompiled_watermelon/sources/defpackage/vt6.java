package defpackage;

import java.util.concurrent.ExecutionException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vt6  reason: default package */
/* loaded from: classes.dex */
public final class vt6 implements Runnable {
    public final /* synthetic */ int A;
    public final fq3 B;
    public final ih0 L;

    public /* synthetic */ vt6(fq3 fq3Var, ih0 ih0Var, int i) {
        this.A = i;
        this.B = fq3Var;
        this.L = ih0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        ih0 ih0Var = this.L;
        fq3 fq3Var = this.B;
        switch (i) {
            case 0:
                if (fq3Var.isCancelled()) {
                    ih0Var.r(null);
                    return;
                }
                boolean z = false;
                while (true) {
                    try {
                        try {
                            Object obj = fq3Var.get();
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            ih0Var.k(obj);
                            return;
                        } catch (InterruptedException unused) {
                            z = true;
                        }
                    } catch (ExecutionException e) {
                        Throwable cause = e.getCause();
                        cause.getClass();
                        ih0Var.k(new kc5(cause));
                        return;
                    }
                }
            default:
                if (fq3Var.isCancelled()) {
                    ih0Var.r(null);
                    return;
                }
                try {
                    ih0Var.k(q1.f(fq3Var));
                    return;
                } catch (ExecutionException e2) {
                    Throwable cause2 = e2.getCause();
                    if (cause2 != null) {
                        ih0Var.k(new kc5(cause2));
                        return;
                    }
                    NullPointerException nullPointerException = new NullPointerException();
                    b53.e0(nullPointerException, b53.class.getName());
                    throw nullPointerException;
                }
        }
    }
}
