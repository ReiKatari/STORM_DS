package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sd1  reason: default package */
/* loaded from: classes.dex */
public final class sd1 extends defpackage.q62 implements java.lang.Runnable {
    private static volatile java.lang.Thread _thread;
    private static volatile int debugStatus;
    public static final defpackage.sd1 h0 = null;
    public static final long i0 = 0;

    static {
            sd1 r0 = new sd1
            r0.<init>()
            defpackage.sd1.h0 = r0
            r1 = 0
            r0.p0(r1)
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r2 = "kotlinx.coroutines.DefaultExecutor.keepAlive"
            java.lang.Long r0 = java.lang.Long.getLong(r2, r0)     // Catch: java.lang.SecurityException -> L14
            goto L18
        L14:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L18:
            long r0 = r0.longValue()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r2.toNanos(r0)
            defpackage.sd1.i0 = r0
            return
    }

    @Override // defpackage.q62, defpackage.ug1
    public final defpackage.il1 A(long r3, java.lang.Runnable r5, defpackage.l61 r6) {
            r2 = this;
            r0 = 0
            int r6 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r6 > 0) goto L7
            goto L1a
        L7:
            r0 = 9223372036854(0x8637bd05af6, double:4.5569512622224E-311)
            int r6 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r6 < 0) goto L16
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L1a
        L16:
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r3
        L1a:
            r3 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L31
            long r3 = java.lang.System.nanoTime()
            n62 r6 = new n62
            long r0 = r0 + r3
            r6.<init>(r5, r0)
            r2.D0(r3, r6)
            return r6
        L31:
            lg4 r2 = defpackage.lg4.A
            return r2
    }

    @Override // defpackage.q62
    public final void A0(long r1, defpackage.o62 r3) {
            r0 = this;
            java.util.concurrent.RejectedExecutionException r0 = new java.util.concurrent.RejectedExecutionException
            java.lang.String r1 = "DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details"
            r0.<init>(r1)
            throw r0
    }

    public final synchronized void G0() {
            r3 = this;
            monitor-enter(r3)
            int r0 = defpackage.sd1.debugStatus     // Catch: java.lang.Throwable -> L1b
            r1 = 2
            r2 = 3
            if (r0 == r1) goto Lc
            if (r0 != r2) goto La
            goto Lc
        La:
            r0 = 0
            goto Ld
        Lc:
            r0 = 1
        Ld:
            if (r0 != 0) goto L11
            monitor-exit(r3)
            return
        L11:
            defpackage.sd1.debugStatus = r2     // Catch: java.lang.Throwable -> L1b
            r3.C0()     // Catch: java.lang.Throwable -> L1b
            r3.notifyAll()     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r3)
            return
        L1b:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
            throw r0
    }

    @Override // java.lang.Runnable
    public final void run() {
            r17 = this;
            r1 = r17
            java.lang.ThreadLocal r0 = defpackage.m57.a
            r0.set(r1)
            r2 = 0
            monitor-enter(r17)     // Catch: java.lang.Throwable -> L4e
            int r0 = defpackage.sd1.debugStatus     // Catch: java.lang.Throwable -> L8f
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r0 == r5) goto L16
            if (r0 != r4) goto L14
            goto L16
        L14:
            r0 = r3
            goto L17
        L16:
            r0 = r6
        L17:
            if (r0 == 0) goto L29
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L4e
            defpackage.sd1._thread = r2
            r1.G0()
            boolean r0 = r1.z0()
            if (r0 != 0) goto L8a
            r1.y0()
            return
        L29:
            defpackage.sd1.debugStatus = r6     // Catch: java.lang.Throwable -> L8f
            r1.notifyAll()     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L4e
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = r7
        L35:
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L4e
            long r11 = r1.q0()     // Catch: java.lang.Throwable -> L4e
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            r13 = 0
            if (r0 != 0) goto L6b
            long r15 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L4e
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 != 0) goto L50
            long r9 = defpackage.sd1.i0     // Catch: java.lang.Throwable -> L4e
            long r9 = r9 + r15
            goto L50
        L4e:
            r0 = move-exception
            goto L92
        L50:
            long r15 = r9 - r15
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 > 0) goto L65
            defpackage.sd1._thread = r2
            r1.G0()
            boolean r0 = r1.z0()
            if (r0 != 0) goto L8a
            r1.y0()
            return
        L65:
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 <= 0) goto L6c
            r11 = r15
            goto L6c
        L6b:
            r9 = r7
        L6c:
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 <= 0) goto L35
            int r0 = defpackage.sd1.debugStatus     // Catch: java.lang.Throwable -> L4e
            if (r0 == r5) goto L79
            if (r0 != r4) goto L77
            goto L79
        L77:
            r0 = r3
            goto L7a
        L79:
            r0 = r6
        L7a:
            if (r0 == 0) goto L8b
            defpackage.sd1._thread = r2
            r1.G0()
            boolean r0 = r1.z0()
            if (r0 != 0) goto L8a
            r1.y0()
        L8a:
            return
        L8b:
            java.util.concurrent.locks.LockSupport.parkNanos(r1, r11)     // Catch: java.lang.Throwable -> L4e
            goto L35
        L8f:
            r0 = move-exception
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L8f
            throw r0     // Catch: java.lang.Throwable -> L4e
        L92:
            defpackage.sd1._thread = r2
            r1.G0()
            boolean r2 = r1.z0()
            if (r2 != 0) goto La0
            r1.y0()
        La0:
            throw r0
    }

    @Override // defpackage.q62, defpackage.l62
    public final void shutdown() {
            r1 = this;
            r0 = 4
            defpackage.sd1.debugStatus = r0
            super.shutdown()
            return
    }

    @Override // defpackage.n61
    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = "DefaultExecutor"
            return r0
    }

    @Override // defpackage.q62
    public final void u0(java.lang.Runnable r3) {
            r2 = this;
            int r0 = defpackage.sd1.debugStatus
            r1 = 4
            if (r0 == r1) goto L9
            super.u0(r3)
            return
        L9:
            java.util.concurrent.RejectedExecutionException r2 = new java.util.concurrent.RejectedExecutionException
            java.lang.String r3 = "DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details"
            r2.<init>(r3)
            throw r2
    }

    @Override // defpackage.q62
    public final java.lang.Thread y0() {
            r2 = this;
            java.lang.Thread r0 = defpackage.sd1._thread
            if (r0 != 0) goto L2d
            monitor-enter(r2)
            java.lang.Thread r0 = defpackage.sd1._thread     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L29
            java.lang.Thread r0 = new java.lang.Thread     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "kotlinx.coroutines.DefaultExecutor"
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L27
            defpackage.sd1._thread = r0     // Catch: java.lang.Throwable -> L27
            sd1 r1 = defpackage.sd1.h0     // Catch: java.lang.Throwable -> L27
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> L27
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L27
            r0.setContextClassLoader(r1)     // Catch: java.lang.Throwable -> L27
            r1 = 1
            r0.setDaemon(r1)     // Catch: java.lang.Throwable -> L27
            r0.start()     // Catch: java.lang.Throwable -> L27
            goto L29
        L27:
            r0 = move-exception
            goto L2b
        L29:
            monitor-exit(r2)
            return r0
        L2b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            throw r0
        L2d:
            return r0
    }
}
