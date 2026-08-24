package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ec3  reason: default package */
/* loaded from: classes.dex */
public final class ec3 implements java.util.concurrent.Executor {
    public static volatile defpackage.ec3 L;
    public final /* synthetic */ int A;
    public final java.lang.Object B;

    public ec3() {
            r2 = this;
            r0 = 0
            r2.A = r0
            r2.<init>()
            ff0 r0 = new ff0
            r1 = 2
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r1, r0)
            r2.B = r0
            return
    }

    public ec3(defpackage.ow7 r2) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.B = r2
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r2) {
            r1 = this;
            int r0 = r1.A
            java.lang.Object r1 = r1.B
            switch(r0) {
                case 0: goto Lf;
                default: goto L7;
            }
        L7:
            ow7 r1 = (defpackage.ow7) r1
            android.os.Handler r1 = r1.c
            r1.post(r2)
            return
        Lf:
            java.util.concurrent.ExecutorService r1 = (java.util.concurrent.ExecutorService) r1
            r1.execute(r2)
            return
    }
}
