package defpackage;

import java.util.concurrent.ScheduledFuture;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ch0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ch0 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ gh0 B;

    public /* synthetic */ ch0(gh0 gh0Var, ci0 ci0Var) {
        this.A = 0;
        this.B = gh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        gh0 gh0Var = this.B;
        switch (i) {
            case 0:
                gt0.p1(gh0Var.k).isEmpty();
                return;
            case 1:
                for (yf0 yf0Var : gh0Var.k) {
                    gh0Var.a(yf0Var.a());
                }
                return;
            default:
                synchronized (gh0Var.d) {
                    try {
                        ScheduledFuture scheduledFuture = gh0Var.e;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        kj2.t("CameraPresencePrvdr", "Starting new refresh-with-retries sequence.");
                        gh0Var.d(3, gh0Var.k);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public /* synthetic */ ch0(gh0 gh0Var, int i) {
        this.A = i;
        this.B = gh0Var;
    }
}
