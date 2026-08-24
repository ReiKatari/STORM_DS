package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uj0  reason: default package */
/* loaded from: classes.dex */
public final class uj0 {
    public boolean a;
    public em2 b;
    public boolean c;

    public final void a() {
        synchronized (this) {
            try {
                if (this.a) {
                    return;
                }
                this.a = true;
                this.c = true;
                em2 em2Var = this.b;
                if (em2Var != null) {
                    try {
                        Runnable runnable = (Runnable) em2Var.B;
                        ea7 ea7Var = (ea7) em2Var.R;
                        Runnable runnable2 = (Runnable) em2Var.L;
                        if (runnable == null) {
                            ea7Var.cancel();
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
