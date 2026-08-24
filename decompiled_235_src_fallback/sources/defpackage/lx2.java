package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lx2  reason: default package */
/* loaded from: classes.dex */
public final class lx2 implements java.util.concurrent.Executor {
    public static volatile defpackage.lx2 L;
    public final /* synthetic */ int A;
    public final java.util.concurrent.Executor B;

    public lx2() {
            r2 = this;
            r0 = 0
            r2.A = r0
            r2.<init>()
            kx2 r0 = new kx2
            r1 = 0
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor(r0)
            r2.B = r0
            return
    }

    public lx2(java.util.concurrent.ExecutorService r2) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.B = r2
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r3) {
            r2 = this;
            int r0 = r2.A
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            t36 r0 = new t36
            r1 = 0
            r0.<init>(r3, r1)
            java.util.concurrent.Executor r2 = r2.B
            r2.execute(r0)
            return
        L11:
            java.util.concurrent.Executor r2 = r2.B
            java.util.concurrent.ExecutorService r2 = (java.util.concurrent.ExecutorService) r2
            r2.execute(r3)
            return
    }
}
