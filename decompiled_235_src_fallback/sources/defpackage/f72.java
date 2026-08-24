package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f72  reason: default package */
/* loaded from: classes.dex */
public final class f72 extends defpackage.e72 implements defpackage.ug1 {
    public final java.util.concurrent.Executor L;

    public f72(java.util.concurrent.Executor r2) {
            r1 = this;
            r1.<init>()
            r1.L = r2
            java.lang.reflect.Method r1 = defpackage.ty0.a
            boolean r1 = r2 instanceof java.util.concurrent.ScheduledThreadPoolExecutor     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto Le
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = (java.util.concurrent.ScheduledThreadPoolExecutor) r2     // Catch: java.lang.Throwable -> L20
            goto Lf
        Le:
            r2 = 0
        Lf:
            if (r2 != 0) goto L12
            goto L20
        L12:
            java.lang.reflect.Method r1 = defpackage.ty0.a     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L17
            goto L20
        L17:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L20
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L20
            r1.invoke(r2, r0)     // Catch: java.lang.Throwable -> L20
        L20:
            return
    }

    @Override // defpackage.ug1
    public final defpackage.il1 A(long r4, java.lang.Runnable r6, defpackage.l61 r7) {
            r3 = this;
            java.util.concurrent.Executor r3 = r3.L
            boolean r0 = r3 instanceof java.util.concurrent.ScheduledExecutorService
            r1 = 0
            if (r0 == 0) goto La
            java.util.concurrent.ScheduledExecutorService r3 = (java.util.concurrent.ScheduledExecutorService) r3
            goto Lb
        La:
            r3 = r1
        Lb:
            if (r3 == 0) goto L22
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.RejectedExecutionException -> L14
            java.util.concurrent.ScheduledFuture r1 = r3.schedule(r6, r4, r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L14
            goto L22
        L14:
            r3 = move-exception
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r2 = "The task was rejected"
            r0.<init>(r2)
            r0.initCause(r3)
            defpackage.yh2.m(r7, r0)
        L22:
            if (r1 == 0) goto L2a
            hl1 r3 = new hl1
            r3.<init>(r1)
            return r3
        L2a:
            sd1 r3 = defpackage.sd1.h0
            il1 r3 = r3.A(r4, r6, r7)
            return r3
    }

    @Override // defpackage.ug1
    public final void J(long r5, defpackage.rj0 r7) {
            r4 = this;
            java.util.concurrent.Executor r0 = r4.L
            boolean r1 = r0 instanceof java.util.concurrent.ScheduledExecutorService
            r2 = 0
            if (r1 == 0) goto La
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 == 0) goto L2b
            uo2 r1 = new uo2
            r3 = 14
            r1.<init>(r3, r4, r7)
            l61 r4 = r7.X
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.RejectedExecutionException -> L1d
            java.util.concurrent.ScheduledFuture r2 = r0.schedule(r1, r5, r3)     // Catch: java.util.concurrent.RejectedExecutionException -> L1d
            goto L2b
        L1d:
            r0 = move-exception
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException
            java.lang.String r3 = "The task was rejected"
            r1.<init>(r3)
            r1.initCause(r0)
            defpackage.yh2.m(r4, r1)
        L2b:
            if (r2 == 0) goto L37
            kj0 r4 = new kj0
            r5 = 0
            r4.<init>(r2, r5)
            r7.A(r4)
            return
        L37:
            sd1 r4 = defpackage.sd1.h0
            r4.J(r5, r7)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            java.util.concurrent.Executor r1 = r1.L
            boolean r0 = r1 instanceof java.util.concurrent.ExecutorService
            if (r0 == 0) goto L9
            java.util.concurrent.ExecutorService r1 = (java.util.concurrent.ExecutorService) r1
            goto La
        L9:
            r1 = 0
        La:
            if (r1 == 0) goto Lf
            r1.shutdown()
        Lf:
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.f72
            if (r0 == 0) goto Le
            f72 r2 = (defpackage.f72) r2
            java.util.concurrent.Executor r2 = r2.L
            java.util.concurrent.Executor r1 = r1.L
            if (r2 != r1) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.util.concurrent.Executor r0 = r0.L
            int r0 = java.lang.System.identityHashCode(r0)
            return r0
    }

    @Override // defpackage.n61
    public final void j0(defpackage.l61 r3, java.lang.Runnable r4) {
            r2 = this;
            java.util.concurrent.Executor r2 = r2.L     // Catch: java.util.concurrent.RejectedExecutionException -> L6
            r2.execute(r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L6
            return
        L6:
            r2 = move-exception
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r1 = "The task was rejected"
            r0.<init>(r1)
            r0.initCause(r2)
            defpackage.yh2.m(r3, r0)
            xe1 r2 = defpackage.xk1.a
            de1 r2 = defpackage.de1.L
            r2.j0(r3, r4)
            return
    }

    @Override // defpackage.n61
    public final java.lang.String toString() {
            r0 = this;
            java.util.concurrent.Executor r0 = r0.L
            java.lang.String r0 = r0.toString()
            return r0
    }
}
