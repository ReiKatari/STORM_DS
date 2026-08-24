package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kj0  reason: default package */
/* loaded from: classes.dex */
public final class kj0 implements defpackage.lj0 {
    public final /* synthetic */ int A;
    public final java.lang.Object B;

    public /* synthetic */ kj0(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.lj0
    public final void b(java.lang.Throwable r2) {
            r1 = this;
            int r0 = r1.A
            java.lang.Object r1 = r1.B
            switch(r0) {
                case 0: goto L13;
                case 1: goto Ld;
                default: goto L7;
            }
        L7:
            il1 r1 = (defpackage.il1) r1
            r1.dispose()
            return
        Ld:
            qn2 r1 = (defpackage.qn2) r1
            r1.g(r2)
            return
        L13:
            java.util.concurrent.ScheduledFuture r1 = (java.util.concurrent.ScheduledFuture) r1
            r2 = 0
            r1.cancel(r2)
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            int r0 = r4.A
            r1 = 93
            java.lang.Object r2 = r4.B
            switch(r0) {
                case 0: goto L45;
                case 1: goto L1d;
                default: goto L9;
            }
        L9:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "DisposeOnCancel["
            r4.<init>(r0)
            il1 r2 = (defpackage.il1) r2
            r4.append(r2)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            return r4
        L1d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "CancelHandler.UserSupplied["
            r0.<init>(r3)
            qn2 r2 = (defpackage.qn2) r2
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r0.append(r2)
            r2 = 64
            r0.append(r2)
            java.lang.String r4 = defpackage.nc1.P(r4)
            r0.append(r4)
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            return r4
        L45:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "CancelFutureOnCancel["
            r4.<init>(r0)
            java.util.concurrent.ScheduledFuture r2 = (java.util.concurrent.ScheduledFuture) r2
            r4.append(r2)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            return r4
    }
}
