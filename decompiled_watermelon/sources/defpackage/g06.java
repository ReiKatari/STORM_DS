package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g06  reason: default package */
/* loaded from: classes.dex */
public final class g06 implements Executor {
    public final Executor B;
    public final ArrayDeque A = new ArrayDeque();
    public final es4 L = new es4(21, this);
    public f06 R = f06.IDLE;
    public long X = 0;

    public g06(Executor executor) {
        executor.getClass();
        this.B = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0068 A[ADDED_TO_REGION] */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            r8.getClass()
            java.util.ArrayDeque r0 = r7.A
            monitor-enter(r0)
            f06 r1 = r7.R     // Catch: java.lang.Throwable -> L6f
            f06 r2 = defpackage.f06.RUNNING     // Catch: java.lang.Throwable -> L6f
            if (r1 == r2) goto L71
            f06 r2 = defpackage.f06.QUEUED     // Catch: java.lang.Throwable -> L6f
            if (r1 != r2) goto L11
            goto L71
        L11:
            long r3 = r7.X     // Catch: java.lang.Throwable -> L6f
            es4 r1 = new es4     // Catch: java.lang.Throwable -> L6f
            r5 = 20
            r1.<init>(r5, r8)     // Catch: java.lang.Throwable -> L6f
            java.util.ArrayDeque r8 = r7.A     // Catch: java.lang.Throwable -> L6f
            r8.add(r1)     // Catch: java.lang.Throwable -> L6f
            f06 r8 = defpackage.f06.QUEUING     // Catch: java.lang.Throwable -> L6f
            r7.R = r8     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6f
            java.util.concurrent.Executor r0 = r7.B     // Catch: java.lang.Error -> L46 java.lang.RuntimeException -> L48
            es4 r5 = r7.L     // Catch: java.lang.Error -> L46 java.lang.RuntimeException -> L48
            r0.execute(r5)     // Catch: java.lang.Error -> L46 java.lang.RuntimeException -> L48
            f06 r0 = r7.R
            if (r0 == r8) goto L30
            goto L6b
        L30:
            java.util.ArrayDeque r0 = r7.A
            monitor-enter(r0)
            long r5 = r7.X     // Catch: java.lang.Throwable -> L40
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L42
            f06 r1 = r7.R     // Catch: java.lang.Throwable -> L40
            if (r1 != r8) goto L42
            r7.R = r2     // Catch: java.lang.Throwable -> L40
            goto L42
        L40:
            r7 = move-exception
            goto L44
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            return
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            throw r7
        L46:
            r8 = move-exception
            goto L49
        L48:
            r8 = move-exception
        L49:
            java.util.ArrayDeque r2 = r7.A
            monitor-enter(r2)
            f06 r0 = r7.R     // Catch: java.lang.Throwable -> L57
            f06 r3 = defpackage.f06.IDLE     // Catch: java.lang.Throwable -> L57
            if (r0 == r3) goto L59
            f06 r3 = defpackage.f06.QUEUING     // Catch: java.lang.Throwable -> L57
            if (r0 != r3) goto L63
            goto L59
        L57:
            r7 = move-exception
            goto L6d
        L59:
            java.util.ArrayDeque r7 = r7.A     // Catch: java.lang.Throwable -> L57
            boolean r7 = r7.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L57
            if (r7 == 0) goto L63
            r7 = 1
            goto L64
        L63:
            r7 = 0
        L64:
            boolean r0 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L6c
            if (r7 != 0) goto L6c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L57
        L6b:
            return
        L6c:
            throw r8     // Catch: java.lang.Throwable -> L57
        L6d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L57
            throw r7
        L6f:
            r7 = move-exception
            goto L78
        L71:
            java.util.ArrayDeque r7 = r7.A     // Catch: java.lang.Throwable -> L6f
            r7.add(r8)     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6f
            return
        L78:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6f
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g06.execute(java.lang.Runnable):void");
    }
}
