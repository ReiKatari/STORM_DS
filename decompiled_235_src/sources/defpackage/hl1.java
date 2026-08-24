package defpackage;

import java.util.concurrent.ScheduledFuture;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hl1  reason: default package */
/* loaded from: classes.dex */
public final class hl1 implements il1 {
    public final ScheduledFuture A;

    public hl1(ScheduledFuture scheduledFuture) {
        this.A = scheduledFuture;
    }

    @Override // defpackage.il1
    public final void dispose() {
        this.A.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.A + ']';
    }
}
