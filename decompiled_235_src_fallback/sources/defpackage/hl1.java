package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hl1  reason: default package */
/* loaded from: classes.dex */
public final class hl1 implements defpackage.il1 {
    public final java.util.concurrent.ScheduledFuture A;

    public hl1(java.util.concurrent.ScheduledFuture r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // defpackage.il1
    public final void dispose() {
            r1 = this;
            java.util.concurrent.ScheduledFuture r1 = r1.A
            r0 = 0
            r1.cancel(r0)
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DisposableFutureHandle["
            r0.<init>(r1)
            java.util.concurrent.ScheduledFuture r2 = r2.A
            r0.append(r2)
            r2 = 93
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
