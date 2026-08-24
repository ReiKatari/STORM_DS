package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vb6  reason: default package */
/* loaded from: classes.dex */
public final class vb6 implements java.util.concurrent.Executor {
    public final java.util.ArrayDeque A;
    public final java.util.concurrent.Executor B;
    public final defpackage.g15 L;
    public defpackage.ub6 R;
    public long X;

    public vb6(java.util.concurrent.Executor r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.A = r0
            g15 r0 = new g15
            r1 = 20
            r0.<init>(r2, r1)
            r2.L = r0
            ub6 r0 = defpackage.ub6.IDLE
            r2.R = r0
            r0 = 0
            r2.X = r0
            r3.getClass()
            r2.B = r3
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r8) {
            r7 = this;
            r8.getClass()
            java.util.ArrayDeque r0 = r7.A
            monitor-enter(r0)
            ub6 r1 = r7.R     // Catch: java.lang.Throwable -> L6d
            ub6 r2 = defpackage.ub6.RUNNING     // Catch: java.lang.Throwable -> L6d
            if (r1 == r2) goto L6f
            ub6 r2 = defpackage.ub6.QUEUED     // Catch: java.lang.Throwable -> L6d
            if (r1 != r2) goto L11
            goto L6f
        L11:
            long r3 = r7.X     // Catch: java.lang.Throwable -> L6d
            t36 r1 = new t36     // Catch: java.lang.Throwable -> L6d
            r5 = 1
            r1.<init>(r8, r5)     // Catch: java.lang.Throwable -> L6d
            java.util.ArrayDeque r8 = r7.A     // Catch: java.lang.Throwable -> L6d
            r8.add(r1)     // Catch: java.lang.Throwable -> L6d
            ub6 r8 = defpackage.ub6.QUEUING     // Catch: java.lang.Throwable -> L6d
            r7.R = r8     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.Executor r0 = r7.B     // Catch: java.lang.Error -> L45 java.lang.RuntimeException -> L47
            g15 r6 = r7.L     // Catch: java.lang.Error -> L45 java.lang.RuntimeException -> L47
            r0.execute(r6)     // Catch: java.lang.Error -> L45 java.lang.RuntimeException -> L47
            ub6 r0 = r7.R
            if (r0 == r8) goto L2f
            goto L69
        L2f:
            java.util.ArrayDeque r0 = r7.A
            monitor-enter(r0)
            long r5 = r7.X     // Catch: java.lang.Throwable -> L3f
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L41
            ub6 r1 = r7.R     // Catch: java.lang.Throwable -> L3f
            if (r1 != r8) goto L41
            r7.R = r2     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r7 = move-exception
            goto L43
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            return
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r7
        L45:
            r8 = move-exception
            goto L48
        L47:
            r8 = move-exception
        L48:
            java.util.ArrayDeque r2 = r7.A
            monitor-enter(r2)
            ub6 r0 = r7.R     // Catch: java.lang.Throwable -> L56
            ub6 r3 = defpackage.ub6.IDLE     // Catch: java.lang.Throwable -> L56
            if (r0 == r3) goto L58
            ub6 r3 = defpackage.ub6.QUEUING     // Catch: java.lang.Throwable -> L56
            if (r0 != r3) goto L61
            goto L58
        L56:
            r7 = move-exception
            goto L6b
        L58:
            java.util.ArrayDeque r7 = r7.A     // Catch: java.lang.Throwable -> L56
            boolean r7 = r7.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L56
            if (r7 == 0) goto L61
            goto L62
        L61:
            r5 = 0
        L62:
            boolean r7 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L56
            if (r7 == 0) goto L6a
            if (r5 != 0) goto L6a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L56
        L69:
            return
        L6a:
            throw r8     // Catch: java.lang.Throwable -> L56
        L6b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L56
            throw r7
        L6d:
            r7 = move-exception
            goto L76
        L6f:
            java.util.ArrayDeque r7 = r7.A     // Catch: java.lang.Throwable -> L6d
            r7.add(r8)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            return
        L76:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            throw r7
    }
}
