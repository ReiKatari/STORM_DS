package zc;

import java.util.concurrent.ScheduledFuture;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h0 implements i0 {
    public final ScheduledFuture A;

    public h0(ScheduledFuture scheduledFuture) {
        this.A = scheduledFuture;
    }

    @Override // zc.i0
    public final void dispose() {
        this.A.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.A + ']';
    }
}
