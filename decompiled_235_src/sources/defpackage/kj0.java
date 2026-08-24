package defpackage;

import java.util.concurrent.ScheduledFuture;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kj0  reason: default package */
/* loaded from: classes.dex */
public final class kj0 implements lj0 {
    public final /* synthetic */ int A;
    public final Object B;

    public /* synthetic */ kj0(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override // defpackage.lj0
    public final void b(Throwable th) {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                ((ScheduledFuture) obj).cancel(false);
                return;
            case 1:
                ((qn2) obj).g(th);
                return;
            default:
                ((il1) obj).dispose();
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
                return "CancelHandler.UserSupplied[" + ((qn2) obj).getClass().getSimpleName() + '@' + nc1.P(this) + ']';
            default:
                return "DisposeOnCancel[" + ((il1) obj) + ']';
        }
    }
}
