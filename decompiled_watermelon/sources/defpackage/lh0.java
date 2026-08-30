package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lh0  reason: default package */
/* loaded from: classes.dex */
public final class lh0 {
    public boolean a;
    public eh2 b;
    public boolean c;

    public final void a() {
        synchronized (this) {
            try {
                if (this.a) {
                    return;
                }
                this.a = true;
                this.c = true;
                eh2 eh2Var = this.b;
                if (eh2Var != null) {
                    try {
                        Runnable runnable = (Runnable) eh2Var.B;
                        ix6 ix6Var = (ix6) eh2Var.R;
                        Runnable runnable2 = (Runnable) eh2Var.L;
                        if (runnable == null) {
                            ix6Var.cancel();
                            runnable2.run();
                        } else {
                            runnable.run();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.c = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (this) {
                    this.c = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }
}
