package defpackage;

import java.util.concurrent.ScheduledFuture;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: te0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class te0 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ xe0 B;

    public /* synthetic */ te0(xe0 xe0Var, tf0 tf0Var) {
        this.A = 0;
        this.B = xe0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        xe0 xe0Var = this.B;
        switch (i) {
            case 0:
                tq0.s1(xe0Var.k).isEmpty();
                return;
            case 1:
                for (pd0 pd0Var : xe0Var.k) {
                    xe0Var.a(pd0Var.a());
                }
                return;
            default:
                synchronized (xe0Var.d) {
                    try {
                        ScheduledFuture scheduledFuture = xe0Var.e;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        ve2.v("CameraPresencePrvdr", "Starting new refresh-with-retries sequence.");
                        xe0Var.d(3, xe0Var.k);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public /* synthetic */ te0(xe0 xe0Var, int i) {
        this.A = i;
        this.B = xe0Var;
    }
}
