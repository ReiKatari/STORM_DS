package defpackage;

import java.util.concurrent.ScheduledFuture;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bh0  reason: default package */
/* loaded from: classes.dex */
public final class bh0 implements ch0 {
    public final /* synthetic */ int A;
    public final Object B;

    public /* synthetic */ bh0(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    @Override // defpackage.ch0
    public final void a(Throwable th) {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                ((ScheduledFuture) obj).cancel(false);
                return;
            case 1:
                ((mi2) obj).n(th);
                return;
            default:
                ((eh1) obj).dispose();
                return;
        }
    }

    public final String toString() {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((mi2) obj).getClass().getSimpleName() + '@' + w81.s(this) + ']';
            default:
                return "DisposeOnCancel[" + ((eh1) obj) + ']';
        }
    }
}
