package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nv2  reason: default package */
/* loaded from: classes.dex */
public final class nv2 implements java.util.concurrent.RunnableScheduledFuture {
    public final java.util.concurrent.atomic.AtomicReference A;
    public final long B;
    public final java.util.concurrent.Callable L;
    public final defpackage.tb0 R;

    public nv2(android.os.Handler r9, long r10, java.util.concurrent.Callable r12) {
            r8 = this;
            r8.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            r0.<init>(r1)
            r8.A = r0
            r8.B = r10
            r8.L = r12
            bt r2 = new bt
            r3 = 24
            r7 = 0
            r4 = r8
            r5 = r9
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            tb0 r8 = defpackage.ak7.W(r2)
            r4.R = r8
            return
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean r1) {
            r0 = this;
            tb0 r0 = r0.R
            boolean r0 = r0.cancel(r1)
            return r0
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.util.concurrent.Delayed r4) {
            r3 = this;
            java.util.concurrent.Delayed r4 = (java.util.concurrent.Delayed) r4
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r3.getDelay(r0)
            long r3 = r4.getDelay(r0)
            int r3 = java.lang.Long.compare(r1, r3)
            return r3
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
            r0 = this;
            tb0 r0 = r0.R
            sb0 r0 = r0.B
            java.lang.Object r0 = r0.get()
            return r0
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            tb0 r0 = r0.R
            sb0 r0 = r0.B
            java.lang.Object r0 = r0.get(r1, r3)
            return r0
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(java.util.concurrent.TimeUnit r5) {
            r4 = this;
            long r0 = r4.B
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r4 = r5.convert(r0, r4)
            return r4
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
            r0 = this;
            tb0 r0 = r0.R
            boolean r0 = r0.isCancelled()
            return r0
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
            r0 = this;
            tb0 r0 = r0.R
            sb0 r0 = r0.B
            boolean r0 = r0.isDone()
            return r0
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.A
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            qb0 r0 = (defpackage.qb0) r0
            if (r0 == 0) goto L19
            java.util.concurrent.Callable r2 = r2.L     // Catch: java.lang.Exception -> L15
            java.lang.Object r2 = r2.call()     // Catch: java.lang.Exception -> L15
            r0.a(r2)     // Catch: java.lang.Exception -> L15
            return
        L15:
            r2 = move-exception
            r0.c(r2)
        L19:
            return
    }
}
