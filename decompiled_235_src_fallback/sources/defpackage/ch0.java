package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ch0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ch0 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.gh0 B;

    public /* synthetic */ ch0(defpackage.gh0 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    public /* synthetic */ ch0(defpackage.gh0 r1, defpackage.ci0 r2) {
            r0 = this;
            r2 = 0
            r0.A = r2
            r0.<init>()
            r0.B = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.A
            gh0 r3 = r3.B
            switch(r0) {
                case 0: goto L41;
                case 1: goto L26;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r3.d
            monitor-enter(r0)
            java.util.concurrent.ScheduledFuture r1 = r3.e     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L15
            r2 = 0
            r1.cancel(r2)     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r3 = move-exception
            goto L24
        L15:
            java.lang.String r1 = "CameraPresencePrvdr"
            java.lang.String r2 = "Starting new refresh-with-retries sequence."
            defpackage.kj2.t(r1, r2)     // Catch: java.lang.Throwable -> L13
            java.util.List r1 = r3.k     // Catch: java.lang.Throwable -> L13
            r2 = 3
            r3.d(r2, r1)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return
        L24:
            monitor-exit(r0)
            throw r3
        L26:
            java.util.List r0 = r3.k
            java.util.Iterator r0 = r0.iterator()
        L2c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L40
            java.lang.Object r1 = r0.next()
            yf0 r1 = (defpackage.yf0) r1
            java.lang.String r1 = r1.a()
            r3.a(r1)
            goto L2c
        L40:
            return
        L41:
            java.util.List r3 = r3.k
            java.util.Set r3 = defpackage.gt0.p1(r3)
            java.util.Collection r3 = (java.util.Collection) r3
            r3.isEmpty()
            return
    }
}
