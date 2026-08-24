package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j57  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class j57 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.gs1 B;
    public final /* synthetic */ defpackage.zg0 L;

    public /* synthetic */ j57(defpackage.gs1 r1, defpackage.zg0 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r4 = this;
            int r0 = r4.A
            zg0 r1 = r4.L
            gs1 r4 = r4.B
            switch(r0) {
                case 0: goto L35;
                default: goto L9;
            }
        L9:
            java.lang.Object r0 = r4.Y
            rg0 r0 = (defpackage.rg0) r0
            java.util.concurrent.Executor r0 = r0.a
            if (r0 != 0) goto L34
            java.util.concurrent.ThreadFactory r0 = defpackage.pm.b
            java.lang.String r2 = "CXCP-Camera-E"
            nm r0 = defpackage.pm.b(r0, r2)
            int r4 = r4.R
            mm r2 = new mm
            r2.<init>(r4, r0)
            r4 = 1
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r4, r2)
            r0.getClass()
            wg0 r4 = defpackage.wg0.THREAD
            rk3 r2 = new rk3
            r3 = 19
            r2.<init>(r0, r3)
            r1.a(r4, r2)
        L34:
            return r0
        L35:
            java.lang.Object r0 = r4.Y
            rg0 r0 = (defpackage.rg0) r0
            r0.getClass()
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r2 = "CXCP-Camera-H"
            int r4 = r4.R
            r0.<init>(r2, r4)
            r0.start()
            wg0 r4 = defpackage.wg0.THREAD
            rk3 r2 = new rk3
            r3 = 18
            r2.<init>(r0, r3)
            r1.a(r4, r2)
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r0 = r0.getLooper()
            r4.<init>(r0)
            return r4
    }
}
