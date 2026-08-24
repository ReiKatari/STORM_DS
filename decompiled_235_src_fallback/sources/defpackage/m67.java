package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m67  reason: default package */
/* loaded from: classes.dex */
public final class m67 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final defpackage.gx3 B;
    public final defpackage.rj0 L;

    public /* synthetic */ m67(defpackage.gx3 r1, defpackage.rj0 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.A
            r1 = 0
            rj0 r2 = r3.L
            gx3 r3 = r3.B
            switch(r0) {
                case 0: goto L3b;
                default: goto La;
            }
        La:
            boolean r0 = r3.isCancelled()
            if (r0 == 0) goto L14
            r2.w(r1)
            goto L2b
        L14:
            java.lang.Object r3 = defpackage.r1.f(r3)     // Catch: java.util.concurrent.ExecutionException -> L1c
            r2.i(r3)     // Catch: java.util.concurrent.ExecutionException -> L1c
            goto L2b
        L1c:
            r3 = move-exception
            java.lang.Throwable r3 = r3.getCause()
            if (r3 == 0) goto L2c
            em5 r0 = new em5
            r0.<init>(r3)
            r2.i(r0)
        L2b:
            return
        L2c:
            ti3 r3 = new ti3
            r3.<init>()
            java.lang.Class<nb3> r0 = defpackage.nb3.class
            java.lang.String r0 = r0.getName()
            defpackage.nb3.V(r3, r0)
            throw r3
        L3b:
            boolean r0 = r3.isCancelled()
            if (r0 == 0) goto L45
            r2.w(r1)
            goto L73
        L45:
            r0 = 0
        L46:
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L74
            if (r0 == 0) goto L53
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.util.concurrent.ExecutionException -> L57
            r0.interrupt()     // Catch: java.util.concurrent.ExecutionException -> L57
        L53:
            r2.i(r3)     // Catch: java.util.concurrent.ExecutionException -> L57
            goto L73
        L57:
            r3 = move-exception
            goto L64
        L59:
            r3 = move-exception
            if (r0 == 0) goto L63
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.util.concurrent.ExecutionException -> L57
            r0.interrupt()     // Catch: java.util.concurrent.ExecutionException -> L57
        L63:
            throw r3     // Catch: java.util.concurrent.ExecutionException -> L57
        L64:
            java.lang.Throwable r3 = r3.getCause()
            r3.getClass()
            em5 r0 = new em5
            r0.<init>(r3)
            r2.i(r0)
        L73:
            return
        L74:
            r0 = 1
            goto L46
    }
}
