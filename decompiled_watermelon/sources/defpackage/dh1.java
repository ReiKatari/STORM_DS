package defpackage;

import java.util.concurrent.ScheduledFuture;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dh1  reason: default package */
/* loaded from: classes.dex */
public final class dh1 implements eh1 {
    public final ScheduledFuture A;

    public dh1(ScheduledFuture scheduledFuture) {
        this.A = scheduledFuture;
    }

    @Override // defpackage.eh1
    public final void dispose() {
        this.A.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.A + ']';
    }
}
