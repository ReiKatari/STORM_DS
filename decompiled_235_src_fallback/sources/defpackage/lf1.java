package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lf1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class lf1 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.util.ArrayList B;

    public /* synthetic */ lf1(int r1, java.util.ArrayList r2) {
            r0 = this;
            r0.A = r1
            r0.B = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r6 = this;
            int r0 = r6.A
            java.util.ArrayList r6 = r6.B
            switch(r0) {
                case 0: goto L32;
                default: goto L7;
            }
        L7:
            int r0 = r6.size()
            r1 = 0
            r2 = r1
        Ld:
            if (r2 >= r0) goto L1b
            java.lang.Object r3 = r6.get(r2)
            int r2 = r2 + 1
            java.util.concurrent.ExecutorService r3 = (java.util.concurrent.ExecutorService) r3
            r3.shutdownNow()
            goto Ld
        L1b:
            int r0 = r6.size()
        L1f:
            if (r1 >= r0) goto L31
            java.lang.Object r2 = r6.get(r1)
            int r1 = r1 + 1
            java.util.concurrent.ExecutorService r2 = (java.util.concurrent.ExecutorService) r2
            r3 = 1
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            r2.awaitTermination(r3, r5)
            goto L1f
        L31:
            return
        L32:
            r0 = 4
            defpackage.wl2.a(r0, r6)
            return
    }
}
